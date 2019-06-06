package com.snapchat.client.benchmarks;

import com.snapchat.client.shims.Logger;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Benchmarks {

    static final class CppProxy extends Benchmarks {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = Benchmarks.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native BenchmarkResults native_runBenchmarks(long j, String str, ArrayList<BenchmarkRunConfig> arrayList);

        public final void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            destroy();
            super.finalize();
        }

        public final BenchmarkResults runBenchmarks(String str, ArrayList<BenchmarkRunConfig> arrayList) {
            return native_runBenchmarks(this.nativeRef, str, arrayList);
        }
    }

    public static native Benchmarks getInstance(Logger logger);

    public abstract BenchmarkResults runBenchmarks(String str, ArrayList<BenchmarkRunConfig> arrayList);
}
