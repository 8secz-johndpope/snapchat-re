package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class AbstractFuture<V> extends FluentFuture<V> {
    private static final AtomicHelper ATOMIC_HELPER;
    private static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Object NULL = new Object();
    private static final Logger log = Logger.getLogger(AbstractFuture.class.getName());
    private volatile Listener listeners;
    private volatile Object value;
    private volatile Waiter waiters;

    static final class UnsafeAtomicHelper extends AtomicHelper {
        static final long LISTENERS_OFFSET;
        static final Unsafe UNSAFE;
        static final long VALUE_OFFSET;
        static final long WAITERS_OFFSET;
        static final long WAITER_NEXT_OFFSET;
        static final long WAITER_THREAD_OFFSET;

        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        /* JADX WARNING: Failed to process nested try/catch */
        static {
            /*
            r0 = sun.misc.Unsafe.getUnsafe();	 Catch:{ SecurityException -> 0x0005 }
            goto L_0x0010;
        L_0x0005:
            r0 = new com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1;	 Catch:{ PrivilegedActionException -> 0x005f }
            r0.<init>();	 Catch:{ PrivilegedActionException -> 0x005f }
            r0 = java.security.AccessController.doPrivileged(r0);	 Catch:{ PrivilegedActionException -> 0x005f }
            r0 = (sun.misc.Unsafe) r0;	 Catch:{ PrivilegedActionException -> 0x005f }
        L_0x0010:
            r1 = com.google.common.util.concurrent.AbstractFuture.class;
            r2 = "waiters";
            r2 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0055 }
            r2 = r0.objectFieldOffset(r2);	 Catch:{ Exception -> 0x0055 }
            WAITERS_OFFSET = r2;	 Catch:{ Exception -> 0x0055 }
            r2 = "listeners";
            r2 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0055 }
            r2 = r0.objectFieldOffset(r2);	 Catch:{ Exception -> 0x0055 }
            LISTENERS_OFFSET = r2;	 Catch:{ Exception -> 0x0055 }
            r2 = "value";
            r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0055 }
            r1 = r0.objectFieldOffset(r1);	 Catch:{ Exception -> 0x0055 }
            VALUE_OFFSET = r1;	 Catch:{ Exception -> 0x0055 }
            r1 = com.google.common.util.concurrent.AbstractFuture.Waiter.class;
            r2 = "thread";
            r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0055 }
            r1 = r0.objectFieldOffset(r1);	 Catch:{ Exception -> 0x0055 }
            WAITER_THREAD_OFFSET = r1;	 Catch:{ Exception -> 0x0055 }
            r1 = com.google.common.util.concurrent.AbstractFuture.Waiter.class;
            r2 = "next";
            r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0055 }
            r1 = r0.objectFieldOffset(r1);	 Catch:{ Exception -> 0x0055 }
            WAITER_NEXT_OFFSET = r1;	 Catch:{ Exception -> 0x0055 }
            UNSAFE = r0;	 Catch:{ Exception -> 0x0055 }
            return;
        L_0x0055:
            r0 = move-exception;
            com.google.common.base.Throwables.throwIfUnchecked(r0);
            r1 = new java.lang.RuntimeException;
            r1.<init>(r0);
            throw r1;
        L_0x005f:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r0 = r0.getCause();
            r2 = "Could not initialize intrinsics";
            r1.<init>(r2, r0);
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper.<clinit>():void");
        }

        private UnsafeAtomicHelper() {
            super();
        }

        /* synthetic */ UnsafeAtomicHelper(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* Access modifiers changed, original: final */
        public final boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            return UNSAFE.compareAndSwapObject(abstractFuture, LISTENERS_OFFSET, listener, listener2);
        }

        /* Access modifiers changed, original: final */
        public final boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return UNSAFE.compareAndSwapObject(abstractFuture, VALUE_OFFSET, obj, obj2);
        }

        /* Access modifiers changed, original: final */
        public final boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            return UNSAFE.compareAndSwapObject(abstractFuture, WAITERS_OFFSET, waiter, waiter2);
        }

        /* Access modifiers changed, original: final */
        public final void putNext(Waiter waiter, Waiter waiter2) {
            UNSAFE.putObject(waiter, WAITER_NEXT_OFFSET, waiter2);
        }

        /* Access modifiers changed, original: final */
        public final void putThread(Waiter waiter, Thread thread) {
            UNSAFE.putObject(waiter, WAITER_THREAD_OFFSET, thread);
        }
    }

    static final class Waiter {
        static final Waiter TOMBSTONE = new Waiter(false);
        volatile Waiter next;
        volatile Thread thread;

        Waiter() {
            AbstractFuture.ATOMIC_HELPER.putThread(this, Thread.currentThread());
        }

        Waiter(boolean z) {
        }

        /* Access modifiers changed, original: final */
        public final void setNext(Waiter waiter) {
            AbstractFuture.ATOMIC_HELPER.putNext(this, waiter);
        }

        /* Access modifiers changed, original: final */
        public final void unpark() {
            Thread thread = this.thread;
            if (thread != null) {
                this.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static final class Listener {
        static final Listener TOMBSTONE = new Listener(null, null);
        final Executor executor;
        Listener next;
        final Runnable task;

        Listener(Runnable runnable, Executor executor) {
            this.task = runnable;
            this.executor = executor;
        }
    }

    static final class SetFuture<V> implements Runnable {
        final ListenableFuture<? extends V> future;
        final AbstractFuture<V> owner;

        public final void run() {
            if (this.owner.value == this) {
                if (AbstractFuture.ATOMIC_HELPER.casValue(this.owner, this, AbstractFuture.getFutureValue(this.future))) {
                    AbstractFuture.complete(this.owner);
                }
            }
        }
    }

    static final class Cancellation {
        static final Cancellation CAUSELESS_CANCELLED;
        static final Cancellation CAUSELESS_INTERRUPTED;
        final Throwable cause;
        final boolean wasInterrupted;

        static {
            if (AbstractFuture.GENERATE_CANCELLATION_CAUSES) {
                CAUSELESS_CANCELLED = null;
                CAUSELESS_INTERRUPTED = null;
                return;
            }
            CAUSELESS_CANCELLED = new Cancellation(false, null);
            CAUSELESS_INTERRUPTED = new Cancellation(true, null);
        }

        Cancellation(boolean z, Throwable th) {
            this.wasInterrupted = z;
            this.cause = th;
        }
    }

    static final class Failure {
        static final Failure FALLBACK_INSTANCE = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable exception;

        Failure(Throwable th) {
            this.exception = (Throwable) Preconditions.checkNotNull(th);
        }
    }

    public static abstract class TrustedFuture<V> extends AbstractFuture<V> {
        TrustedFuture() {
        }

        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        public final V get() {
            return super.get();
        }

        public final V get(long j, TimeUnit timeUnit) {
            return super.get(j, timeUnit);
        }

        public final boolean isCancelled() {
            return super.isCancelled();
        }

        public final boolean isDone() {
            return super.isDone();
        }
    }

    static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        /* synthetic */ AtomicHelper(AnonymousClass1 anonymousClass1) {
            this();
        }

        public abstract boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2);

        public abstract boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        public abstract boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2);

        public abstract void putNext(Waiter waiter, Waiter waiter2);

        public abstract void putThread(Waiter waiter, Thread thread);
    }

    static final class SafeAtomicHelper extends AtomicHelper {
        final AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater;
        final AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater;
        final AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater;
        final AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater;
        final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater;

        SafeAtomicHelper(AtomicReferenceFieldUpdater<Waiter, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<Waiter, Waiter> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, Waiter> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, Listener> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.waiterThreadUpdater = atomicReferenceFieldUpdater;
            this.waiterNextUpdater = atomicReferenceFieldUpdater2;
            this.waitersUpdater = atomicReferenceFieldUpdater3;
            this.listenersUpdater = atomicReferenceFieldUpdater4;
            this.valueUpdater = atomicReferenceFieldUpdater5;
        }

        /* Access modifiers changed, original: final */
        public final boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            return this.listenersUpdater.compareAndSet(abstractFuture, listener, listener2);
        }

        /* Access modifiers changed, original: final */
        public final boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return this.valueUpdater.compareAndSet(abstractFuture, obj, obj2);
        }

        /* Access modifiers changed, original: final */
        public final boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            return this.waitersUpdater.compareAndSet(abstractFuture, waiter, waiter2);
        }

        /* Access modifiers changed, original: final */
        public final void putNext(Waiter waiter, Waiter waiter2) {
            this.waiterNextUpdater.lazySet(waiter, waiter2);
        }

        /* Access modifiers changed, original: final */
        public final void putThread(Waiter waiter, Thread thread) {
            this.waiterThreadUpdater.lazySet(waiter, thread);
        }
    }

    static final class SynchronizedHelper extends AtomicHelper {
        private SynchronizedHelper() {
            super();
        }

        /* Access modifiers changed, original: final */
        public final boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                if (abstractFuture.listeners == listener) {
                    abstractFuture.listeners = listener2;
                    return true;
                }
                return false;
            }
        }

        /* Access modifiers changed, original: final */
        public final boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.value == obj) {
                    abstractFuture.value = obj2;
                    return true;
                }
                return false;
            }
        }

        /* Access modifiers changed, original: final */
        public final boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                if (abstractFuture.waiters == waiter) {
                    abstractFuture.waiters = waiter2;
                    return true;
                }
                return false;
            }
        }

        /* Access modifiers changed, original: final */
        public final void putNext(Waiter waiter, Waiter waiter2) {
            waiter.next = waiter2;
        }

        /* Access modifiers changed, original: final */
        public final void putThread(Waiter waiter, Thread thread) {
            waiter.thread = thread;
        }
    }

    static {
        AtomicHelper unsafeAtomicHelper;
        Throwable th;
        Throwable th2 = null;
        try {
            unsafeAtomicHelper = new UnsafeAtomicHelper();
            th = null;
        } catch (Throwable th3) {
            th2 = th3;
            th3 = th;
            unsafeAtomicHelper = new SynchronizedHelper();
        }
        ATOMIC_HELPER = unsafeAtomicHelper;
        if (th2 != null) {
            log.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th3);
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    protected AbstractFuture() {
    }

    private void addDoneString(StringBuilder stringBuilder) {
        String str = "]";
        try {
            Object done = Futures.getDone(this);
            stringBuilder.append("SUCCESS, result=[");
            stringBuilder.append(userObjectToString(done));
            stringBuilder.append(str);
        } catch (ExecutionException e) {
            stringBuilder.append("FAILURE, cause=[");
            stringBuilder.append(e.getCause());
            stringBuilder.append(str);
        } catch (CancellationException unused) {
            str = "CANCELLED";
            stringBuilder.append(str);
        } catch (RuntimeException e2) {
            stringBuilder.append("UNKNOWN, cause=[");
            stringBuilder.append(e2.getClass());
            str = " thrown from get()]";
            stringBuilder.append(str);
        }
    }

    private static CancellationException cancellationExceptionWithCause(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private Listener clearListeners(Listener listener) {
        Listener listener2;
        do {
            listener2 = this.listeners;
        } while (!ATOMIC_HELPER.casListeners(this, listener2, Listener.TOMBSTONE));
        Listener listener3 = listener2;
        listener2 = listener;
        listener = listener3;
        while (listener != null) {
            Listener listener4 = listener.next;
            listener.next = listener2;
            listener2 = listener;
            listener = listener4;
        }
        return listener2;
    }

    private static void complete(AbstractFuture<?> abstractFuture) {
        Listener listener = null;
        while (true) {
            AbstractFuture abstractFuture2;
            abstractFuture2.releaseWaiters();
            abstractFuture2.afterDone();
            Listener clearListeners = abstractFuture2.clearListeners(listener);
            while (clearListeners != null) {
                listener = clearListeners.next;
                Runnable runnable = clearListeners.task;
                if (runnable instanceof SetFuture) {
                    SetFuture setFuture = (SetFuture) runnable;
                    abstractFuture2 = setFuture.owner;
                    if (abstractFuture2.value == setFuture) {
                        if (ATOMIC_HELPER.casValue(abstractFuture2, setFuture, getFutureValue(setFuture.future))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, clearListeners.executor);
                }
                clearListeners = listener;
            }
            return;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = log;
            Level level = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder("RuntimeException while executing runnable ");
            stringBuilder.append(runnable);
            stringBuilder.append(" with executor ");
            stringBuilder.append(executor);
            logger.log(level, stringBuilder.toString(), e);
        }
    }

    private V getDoneValue(Object obj) {
        if (obj instanceof Cancellation) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((Cancellation) obj).cause);
        } else if (!(obj instanceof Failure)) {
            return obj == NULL ? null : obj;
        } else {
            throw new ExecutionException(((Failure) obj).exception);
        }
    }

    private static Object getFutureValue(ListenableFuture<?> listenableFuture) {
        Object obj;
        if (listenableFuture instanceof TrustedFuture) {
            obj = ((AbstractFuture) listenableFuture).value;
            if (obj instanceof Cancellation) {
                Cancellation cancellation = (Cancellation) obj;
                if (cancellation.wasInterrupted) {
                    obj = cancellation.cause != null ? new Cancellation(false, cancellation.cause) : Cancellation.CAUSELESS_CANCELLED;
                }
            }
            return obj;
        }
        Object obj2;
        try {
            obj = Futures.getDone(listenableFuture);
            if (obj == null) {
                obj = NULL;
            }
            obj2 = obj;
        } catch (ExecutionException e) {
            obj2 = new Failure(e.getCause());
        } catch (CancellationException e2) {
            obj2 = new Cancellation(false, e2);
        } catch (Throwable th) {
            obj2 = new Failure(th);
        }
        return obj2;
    }

    private void releaseWaiters() {
        Waiter waiter;
        do {
            waiter = this.waiters;
        } while (!ATOMIC_HELPER.casWaiters(this, waiter, Waiter.TOMBSTONE));
        while (waiter != null) {
            waiter.unpark();
            waiter = waiter.next;
        }
    }

    private void removeWaiter(Waiter waiter) {
        waiter.thread = null;
        while (true) {
            waiter = this.waiters;
            if (waiter != Waiter.TOMBSTONE) {
                Waiter waiter2 = null;
                while (waiter != null) {
                    Waiter waiter3 = waiter.next;
                    if (waiter.thread != null) {
                        waiter2 = waiter;
                    } else if (waiter2 != null) {
                        waiter2.next = waiter3;
                        if (waiter2.thread == null) {
                        }
                    } else if (ATOMIC_HELPER.casWaiters(this, waiter, waiter3)) {
                    }
                    waiter = waiter3;
                }
                return;
            }
            return;
        }
    }

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public void addListener(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        Listener listener = this.listeners;
        if (listener != Listener.TOMBSTONE) {
            Listener listener2 = new Listener(runnable, executor);
            do {
                listener2.next = listener;
                if (!ATOMIC_HELPER.casListeners(this, listener, listener2)) {
                    listener = this.listeners;
                } else {
                    return;
                }
            } while (listener != Listener.TOMBSTONE);
        }
        executeListener(runnable, executor);
    }

    /* Access modifiers changed, original: protected */
    public void afterDone() {
    }

    public boolean cancel(boolean z) {
        Object obj = this.value;
        if (((obj == null ? 1 : 0) | (obj instanceof SetFuture)) == 0) {
            return false;
        }
        Object cancellation = GENERATE_CANCELLATION_CAUSES ? new Cancellation(z, new CancellationException("Future.cancel() was called.")) : z ? Cancellation.CAUSELESS_INTERRUPTED : Cancellation.CAUSELESS_CANCELLED;
        boolean z2 = false;
        Object obj2 = obj;
        AbstractFuture abstractFuture = this;
        while (true) {
            if (ATOMIC_HELPER.casValue(abstractFuture, obj2, cancellation)) {
                if (z) {
                    abstractFuture.interruptTask();
                }
                complete(abstractFuture);
                if (!(obj2 instanceof SetFuture)) {
                    return true;
                }
                ListenableFuture listenableFuture = ((SetFuture) obj2).future;
                if (listenableFuture instanceof TrustedFuture) {
                    abstractFuture = (AbstractFuture) listenableFuture;
                    obj2 = abstractFuture.value;
                    if (((obj2 == null ? 1 : 0) | (obj2 instanceof SetFuture)) == 0) {
                        return true;
                    }
                    z2 = true;
                } else {
                    listenableFuture.cancel(z);
                    return true;
                }
            }
            obj2 = abstractFuture.value;
            if (!(obj2 instanceof SetFuture)) {
                return z2;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x006f in {4, 5, 8, 9, 13, 23, 24, 27, 28, 32, 34, 36, 38, 40} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public V get() {
        /*
        r6 = this;
        r0 = java.lang.Thread.interrupted();
        if (r0 != 0) goto L_0x0069;
        r0 = r6.value;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x000e;
        r3 = 1;
        goto L_0x000f;
        r3 = 0;
        r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture;
        if (r4 != 0) goto L_0x0015;
        r4 = 1;
        goto L_0x0016;
        r4 = 0;
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x001e;
        r0 = r6.getDoneValue(r0);
        return r0;
        r0 = r6.waiters;
        r3 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE;
        if (r0 == r3) goto L_0x0062;
        r3 = new com.google.common.util.concurrent.AbstractFuture$Waiter;
        r3.<init>();
        r3.setNext(r0);
        r4 = ATOMIC_HELPER;
        r0 = r4.casWaiters(r6, r0, r3);
        if (r0 == 0) goto L_0x005c;
        java.util.concurrent.locks.LockSupport.park(r6);
        r0 = java.lang.Thread.interrupted();
        if (r0 != 0) goto L_0x0053;
        r0 = r6.value;
        if (r0 == 0) goto L_0x0043;
        r4 = 1;
        goto L_0x0044;
        r4 = 0;
        r5 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture;
        if (r5 != 0) goto L_0x004a;
        r5 = 1;
        goto L_0x004b;
        r5 = 0;
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x0034;
        r0 = r6.getDoneValue(r0);
        return r0;
        r6.removeWaiter(r3);
        r0 = new java.lang.InterruptedException;
        r0.<init>();
        throw r0;
        r0 = r6.waiters;
        r4 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE;
        if (r0 != r4) goto L_0x0029;
        r0 = r6.value;
        r0 = r6.getDoneValue(r0);
        return r0;
        r0 = new java.lang.InterruptedException;
        r0.<init>();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.get():java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:75:0x0125 in {4, 5, 8, 9, 13, 16, 17, 29, 30, 33, 34, 38, 41, 43, 45, 47, 52, 53, 56, 57, 61, 64, 66, 70, 72, 74} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public V get(long r17, java.util.concurrent.TimeUnit r19) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r3 = r19;
        r4 = r3.toNanos(r1);
        r6 = java.lang.Thread.interrupted();
        if (r6 != 0) goto L_0x011f;
        r6 = r0.value;
        r8 = 0;
        if (r6 == 0) goto L_0x0017;
        r9 = 1;
        goto L_0x0018;
        r9 = 0;
        r10 = r6 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture;
        if (r10 != 0) goto L_0x001e;
        r10 = 1;
        goto L_0x001f;
        r10 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0027;
        r1 = r0.getDoneValue(r6);
        return r1;
        r9 = 0;
        r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));
        if (r6 <= 0) goto L_0x0033;
        r11 = java.lang.System.nanoTime();
        r11 = r11 + r4;
        goto L_0x0034;
        r11 = r9;
        r13 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 < 0) goto L_0x0093;
        r6 = r0.waiters;
        r15 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE;
        if (r6 == r15) goto L_0x008c;
        r15 = new com.google.common.util.concurrent.AbstractFuture$Waiter;
        r15.<init>();
        r15.setNext(r6);
        r7 = ATOMIC_HELPER;
        r6 = r7.casWaiters(r0, r6, r15);
        if (r6 == 0) goto L_0x0086;
        java.util.concurrent.locks.LockSupport.parkNanos(r0, r4);
        r4 = java.lang.Thread.interrupted();
        if (r4 != 0) goto L_0x007d;
        r4 = r0.value;
        if (r4 == 0) goto L_0x005f;
        r5 = 1;
        goto L_0x0060;
        r5 = 0;
        r6 = r4 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture;
        if (r6 != 0) goto L_0x0066;
        r6 = 1;
        goto L_0x0067;
        r6 = 0;
        r5 = r5 & r6;
        if (r5 == 0) goto L_0x006f;
        r1 = r0.getDoneValue(r4);
        return r1;
        r4 = java.lang.System.nanoTime();
        r4 = r11 - r4;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 >= 0) goto L_0x0050;
        r0.removeWaiter(r15);
        goto L_0x0093;
        r0.removeWaiter(r15);
        r1 = new java.lang.InterruptedException;
        r1.<init>();
        throw r1;
        r6 = r0.waiters;
        r7 = com.google.common.util.concurrent.AbstractFuture.Waiter.TOMBSTONE;
        if (r6 != r7) goto L_0x0045;
        r1 = r0.value;
        r1 = r0.getDoneValue(r1);
        return r1;
        r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));
        if (r6 <= 0) goto L_0x00c0;
        r4 = r0.value;
        if (r4 == 0) goto L_0x009d;
        r5 = 1;
        goto L_0x009e;
        r5 = 0;
        r6 = r4 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture;
        if (r6 != 0) goto L_0x00a4;
        r6 = 1;
        goto L_0x00a5;
        r6 = 0;
        r5 = r5 & r6;
        if (r5 == 0) goto L_0x00ad;
        r1 = r0.getDoneValue(r4);
        return r1;
        r4 = java.lang.Thread.interrupted();
        if (r4 != 0) goto L_0x00ba;
        r4 = java.lang.System.nanoTime();
        r4 = r11 - r4;
        goto L_0x0093;
        r1 = new java.lang.InterruptedException;
        r1.<init>();
        throw r1;
        r4 = r16.toString();
        r5 = r16.isDone();
        r6 = " ";
        r7 = "Waited ";
        if (r5 == 0) goto L_0x00f5;
        r4 = new java.util.concurrent.TimeoutException;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r7);
        r5.append(r1);
        r5.append(r6);
        r1 = r19.toString();
        r2 = java.util.Locale.ROOT;
        r1 = r1.toLowerCase(r2);
        r5.append(r1);
        r1 = " but future completed as timeout expired";
        r5.append(r1);
        r1 = r5.toString();
        r4.<init>(r1);
        throw r4;
        r5 = new java.util.concurrent.TimeoutException;
        r8 = new java.lang.StringBuilder;
        r8.<init>(r7);
        r8.append(r1);
        r8.append(r6);
        r1 = r19.toString();
        r2 = java.util.Locale.ROOT;
        r1 = r1.toLowerCase(r2);
        r8.append(r1);
        r1 = " for ";
        r8.append(r1);
        r8.append(r4);
        r1 = r8.toString();
        r5.<init>(r1);
        throw r5;
        r1 = new java.lang.InterruptedException;
        r1.<init>();
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* Access modifiers changed, original: protected */
    public void interruptTask() {
    }

    public boolean isCancelled() {
        return this.value instanceof Cancellation;
    }

    public boolean isDone() {
        Object obj = this.value;
        int i = 1;
        int i2 = obj != null ? 1 : 0;
        if (obj instanceof SetFuture) {
            i = 0;
        }
        return i2 & i;
    }

    /* Access modifiers changed, original: final */
    public final void maybePropagateCancellationTo(Future<?> future) {
        if (((future != null ? 1 : 0) & isCancelled()) != 0) {
            future.cancel(wasInterrupted());
        }
    }

    /* Access modifiers changed, original: protected */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof SetFuture) {
            StringBuilder stringBuilder = new StringBuilder("setFuture=[");
            stringBuilder.append(userObjectToString(((SetFuture) obj).future));
            stringBuilder.append("]");
            return stringBuilder.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder("remaining delay=[");
            stringBuilder2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            stringBuilder2.append(" ms]");
            return stringBuilder2.toString();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean set(V v) {
        Object v2;
        if (v2 == null) {
            v2 = NULL;
        }
        if (!ATOMIC_HELPER.casValue(this, null, v2)) {
            return false;
        }
        complete(this);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.casValue(this, null, new Failure((Throwable) Preconditions.checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[status=");
        String str2 = "]";
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str = pendingToString();
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder2 = new StringBuilder("Exception thrown from implementation: ");
                    stringBuilder2.append(e.getClass());
                    str = stringBuilder2.toString();
                }
                if (!Strings.isNullOrEmpty(str)) {
                    stringBuilder.append("PENDING, info=[");
                    stringBuilder.append(str);
                    stringBuilder.append(str2);
                    stringBuilder.append(str2);
                    return stringBuilder.toString();
                } else if (!isDone()) {
                    str = "PENDING";
                }
            }
            addDoneString(stringBuilder);
            stringBuilder.append(str2);
            return stringBuilder.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof Cancellation) && ((Cancellation) obj).wasInterrupted;
    }
}
