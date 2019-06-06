package com.looksery.sdk;

import com.looksery.sdk.domain.ImuData;

public final class SpectaclesImuDataConverter implements NativeBridge {
    private final SafeNativeBridge mSafeNativeBridge = new SafeNativeBridge(nativeInit(), new Runnable() {
        public void run() {
            SpectaclesImuDataConverter.this.nativeRelease();
        }
    });

    private native ImuData[] nativeConvertImuData(ImuData[] imuDataArr);

    private native long nativeInit();

    private native void nativeRelease();

    public final ImuData[] convertImuData(ImuData[] imuDataArr) {
        int length = imuDataArr.length;
        int i = 0;
        while (i < length) {
            ImuData imuData = imuDataArr[i];
            if (imuData.acceleration.length == 3 && imuData.rotationRate.length == 3) {
                i++;
            } else {
                throw new IllegalArgumentException(String.format("Acceleration length: %s != 3 or Rotation length: %s != 3", new Object[]{Integer.valueOf(imuData.acceleration.length), Integer.valueOf(imuData.rotationRate.length)}));
            }
        }
        return nativeConvertImuData(imuDataArr);
    }

    public final long getNativeHandle() {
        return this.mSafeNativeBridge.getNativeHandle();
    }

    public final void release() {
        this.mSafeNativeBridge.release();
    }
}
