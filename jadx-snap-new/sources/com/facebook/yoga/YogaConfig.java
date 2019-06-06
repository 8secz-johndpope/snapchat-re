package com.facebook.yoga;

public class YogaConfig {
    private long a = jni_YGConfigNew();

    public YogaConfig() {
        if (this.a == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    private native void jni_YGConfigFree(long j);

    private native long jni_YGConfigNew();

    private native void jni_YGConfigSetExperimentalFeatureEnabled(long j, int i, boolean z);

    private native void jni_YGConfigSetHasCloneNodeFunc(long j, boolean z);

    private native void jni_YGConfigSetLogger(long j, Object obj);

    private native void jni_YGConfigSetPointScaleFactor(long j, float f);

    private native void jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseWebDefaults(long j, boolean z);

    /* Access modifiers changed, original: protected */
    public void finalize() {
        try {
            jni_YGConfigFree(this.a);
        } finally {
            super.finalize();
        }
    }
}
