package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

public abstract class AbstractIterator<T> extends UnmodifiableIterator<T> {
    private T next;
    private State state = State.NOT_READY;

    enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: com.google.common.collect.AbstractIterator$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$AbstractIterator$State = new int[State.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.google.common.collect.AbstractIterator.State.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$google$common$collect$AbstractIterator$State = r0;
            r0 = $SwitchMap$com$google$common$collect$AbstractIterator$State;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.google.common.collect.AbstractIterator.State.DONE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$google$common$collect$AbstractIterator$State;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.google.common.collect.AbstractIterator.State.READY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.AbstractIterator$AnonymousClass1.<clinit>():void");
        }
    }

    protected AbstractIterator() {
    }

    private boolean tryToComputeNext() {
        this.state = State.FAILED;
        this.next = computeNext();
        if (this.state == State.DONE) {
            return false;
        }
        this.state = State.READY;
        return true;
    }

    public abstract T computeNext();

    /* Access modifiers changed, original: protected|final */
    public final T endOfData() {
        this.state = State.DONE;
        return null;
    }

    public final boolean hasNext() {
        Preconditions.checkState(this.state != State.FAILED);
        int i = AnonymousClass1.$SwitchMap$com$google$common$collect$AbstractIterator$State[this.state.ordinal()];
        return i != 1 ? i != 2 ? tryToComputeNext() : true : false;
    }

    public final T next() {
        if (hasNext()) {
            this.state = State.NOT_READY;
            Object obj = this.next;
            this.next = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
