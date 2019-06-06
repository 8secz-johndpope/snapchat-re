package com.google.common.util.concurrent;

import defpackage.ppy;
import java.util.concurrent.atomic.AtomicReference;

abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable DONE = new DoNothingRunnable();
    private static final Runnable INTERRUPTING = new DoNothingRunnable();

    static final class DoNothingRunnable implements Runnable {
        private DoNothingRunnable() {
        }

        public final void run() {
        }
    }

    InterruptibleTask() {
    }

    public abstract void afterRanInterruptibly(T t, Throwable th);

    /* Access modifiers changed, original: final */
    public final void interruptTask() {
        Runnable runnable = (Runnable) get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, INTERRUPTING)) {
            ((Thread) runnable).interrupt();
            set(DONE);
        }
    }

    public abstract boolean isDone();

    public final void run() {
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            Object runInterruptibly;
            int isDone = isDone() ^ 1;
            if (isDone != 0) {
                try {
                    runInterruptibly = runInterruptibly();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, DONE)) {
                        while (get() == INTERRUPTING) {
                            Thread.yield();
                        }
                    }
                    if (isDone != 0) {
                        afterRanInterruptibly(null, null);
                    }
                }
            } else {
                runInterruptibly = null;
            }
            if (!compareAndSet(currentThread, DONE)) {
                while (get() == INTERRUPTING) {
                    Thread.yield();
                }
            }
            if (isDone != 0) {
                afterRanInterruptibly(runInterruptibly, null);
            }
        }
    }

    public abstract T runInterruptibly();

    public abstract String toPendingString();

    public final String toString() {
        String str;
        StringBuilder stringBuilder;
        Runnable runnable = (Runnable) get();
        if (runnable == DONE) {
            str = "running=[DONE]";
        } else if (runnable == INTERRUPTING) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            stringBuilder = new StringBuilder("running=[RUNNING ON ");
            stringBuilder.append(((Thread) runnable).getName());
            stringBuilder.append("]");
            str = stringBuilder.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(ppy.d);
        stringBuilder.append(toPendingString());
        return stringBuilder.toString();
    }
}
