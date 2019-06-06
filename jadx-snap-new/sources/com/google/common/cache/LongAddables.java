package com.google.common.cache;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

final class LongAddables {
    private static final Supplier<LongAddable> SUPPLIER;

    static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        private PureJavaLongAddable() {
        }

        /* synthetic */ PureJavaLongAddable(AnonymousClass1 anonymousClass1) {
            this();
        }

        public final void add(long j) {
            getAndAdd(j);
        }

        public final void increment() {
            getAndIncrement();
        }
    }

    static {
        Supplier anonymousClass1;
        try {
            LongAdder longAdder = new LongAdder();
            anonymousClass1 = new Supplier<LongAddable>() {
                public final LongAddable get() {
                    return new LongAdder();
                }
            };
        } catch (Throwable unused) {
            anonymousClass1 = new Supplier<LongAddable>() {
                public final LongAddable get() {
                    return new PureJavaLongAddable();
                }
            };
        }
        SUPPLIER = anonymousClass1;
    }

    public static LongAddable create() {
        return (LongAddable) SUPPLIER.get();
    }
}
