package com.looksery.sdk;

import android.content.Context;
import com.looksery.sdk.io.LensCoreResources;

public class LSAudioChainWrapper implements NativeBridge {
    private static final boolean DEBUG = false;
    private static final String TAG = "LSAudioChainWrapper";
    private final Runnable mReleaser = new Runnable() {
        public void run() {
            LSAudioChainWrapper.this.nativeRelease();
        }
    };
    private final SafeNativeBridge mSafeNativeBridge;

    public LSAudioChainWrapper(Context context, int i) {
        LSNativeLibraryLoader.ensureAllAreLoaded();
        LensCoreResources.initializeOnce(context);
        this.mSafeNativeBridge = new SafeNativeBridge(nativeInit(i), this.mReleaser);
    }

    private native boolean nativeApplyEffect(String str);

    private native void nativeClearEffect();

    private native float nativeGetParameter(int i);

    private native long nativeInit(int i);

    private native void nativeProcessPcm16(byte[] bArr, int i);

    private native void nativeRelease();

    private native void nativeSetParameter(int i, float f);

    public boolean applyEffect(String str) {
        return nativeApplyEffect(str);
    }

    public void clearEffect() {
        nativeClearEffect();
    }

    public long getNativeHandle() {
        return this.mSafeNativeBridge.getNativeHandle();
    }

    public float getParameter(LSAudioChainParameter lSAudioChainParameter) {
        return nativeGetParameter(lSAudioChainParameter.getRawId());
    }

    public void processPcm16(byte[] bArr, int i) {
        nativeProcessPcm16(bArr, i);
    }

    public void release() {
        this.mSafeNativeBridge.release();
    }

    public void setParameter(LSAudioChainParameter lSAudioChainParameter, float f) {
        nativeSetParameter(lSAudioChainParameter.getRawId(), f);
    }
}
