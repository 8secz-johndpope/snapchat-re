package com.snapchat.talkcorev3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class MetricsReporter {

    static final class CppProxy extends MetricsReporter {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = MetricsReporter.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_reportCallEvent(long j, CallMetric callMetric, String str, Media media, CallSetupPhase callSetupPhase, HashMap<String, Integer> hashMap, HashMap<String, Float> hashMap2, String str2, String str3);

        private native void native_reportPresenceEvent(long j, HashSet<String> hashSet, HashMap<String, String> hashMap, String str);

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

        public final void reportCallEvent(CallMetric callMetric, String str, Media media, CallSetupPhase callSetupPhase, HashMap<String, Integer> hashMap, HashMap<String, Float> hashMap2, String str2, String str3) {
            native_reportCallEvent(this.nativeRef, callMetric, str, media, callSetupPhase, hashMap, hashMap2, str2, str3);
        }

        public final void reportPresenceEvent(HashSet<String> hashSet, HashMap<String, String> hashMap, String str) {
            native_reportPresenceEvent(this.nativeRef, hashSet, hashMap, str);
        }
    }

    public abstract void reportCallEvent(CallMetric callMetric, String str, Media media, CallSetupPhase callSetupPhase, HashMap<String, Integer> hashMap, HashMap<String, Float> hashMap2, String str2, String str3);

    public abstract void reportPresenceEvent(HashSet<String> hashSet, HashMap<String, String> hashMap, String str);
}
