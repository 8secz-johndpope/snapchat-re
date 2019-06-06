package com.looksery.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import com.looksery.sdk.domain.CoreConfiguration;
import com.looksery.sdk.io.LensCoreResources;

public class FaceTrackerWrapper implements NativeBridge {
    private final Runnable mReleaser = new Runnable() {
        public void run() {
            FaceTrackerWrapper.this.nativeRelease();
        }
    };
    private final SafeNativeBridge mSafeNativeBridge;

    public static class FaceInfo {
        private final float[] mFlatLandmarks;

        private FaceInfo(float[] fArr) {
            if (fArr.length % 2 == 0) {
                this.mFlatLandmarks = fArr;
                return;
            }
            throw new IllegalArgumentException("Backing array must be of even item count");
        }

        /* synthetic */ FaceInfo(float[] fArr, AnonymousClass1 anonymousClass1) {
            this(fArr);
        }

        public float getLandmarkX(int i) {
            return this.mFlatLandmarks[i * 2];
        }

        public float getLandmarkY(int i) {
            return this.mFlatLandmarks[(i * 2) + 1];
        }

        public int landmarksCount() {
            return this.mFlatLandmarks.length / 2;
        }
    }

    public enum Mode {
        FAST,
        PRECISE
    }

    public FaceTrackerWrapper(Context context) {
        LSNativeLibraryLoader.ensureAllAreLoaded();
        LensCoreResources.initializeOnce(context);
        this.mSafeNativeBridge = new SafeNativeBridge(nativeInit(CoreConfiguration.CORE_ASSETS_PATH), this.mReleaser);
    }

    private native long nativeInit(String str);

    private native void nativeRelease();

    private native void nativeRestartTracking();

    private native void nativeSetMode(Mode mode);

    private native void nativeSetNumberOfFacesToTrack(int i);

    private native boolean nativeSetTrackingResourcesPath(String str);

    private native float[][] nativeTrackImage(Bitmap bitmap);

    public long getNativeHandle() {
        return this.mSafeNativeBridge.getNativeHandle();
    }

    public void release() {
        this.mSafeNativeBridge.release();
    }

    public void restartTracking() {
        nativeRestartTracking();
    }

    public void setMode(Mode mode) {
        nativeSetMode(mode);
    }

    public void setNumberOfFacesToTrack(int i) {
        nativeSetNumberOfFacesToTrack(i);
    }

    public boolean setTrackingResourcesAssetPath(String str) {
        return nativeSetTrackingResourcesPath("asset:".concat(String.valueOf(str)));
    }

    public boolean setTrackingResourcesFilePath(String str) {
        return nativeSetTrackingResourcesPath("file:".concat(String.valueOf(str)));
    }

    public FaceInfo[] trackImage(Bitmap bitmap) {
        float[][] nativeTrackImage = nativeTrackImage(bitmap);
        int length = nativeTrackImage.length;
        FaceInfo[] faceInfoArr = new FaceInfo[length];
        for (int i = 0; i < length; i++) {
            faceInfoArr[i] = new FaceInfo(nativeTrackImage[i], null);
        }
        return faceInfoArr;
    }
}
