package com.looksery.sdk.motion;

import com.looksery.sdk.DeviceMotionTracker.DeviceMotionListener;

class DeviceMotionDelegateDeviceMotionListener implements DeviceMotionListener {
    private volatile long mNativeHandle;

    DeviceMotionDelegateDeviceMotionListener() {
    }

    private native void nativeOnDeviceMotion(long j, long[] jArr, float[] fArr, float[] fArr2);

    public synchronized void attachToNative(long j) {
        if (this.mNativeHandle == 0) {
            this.mNativeHandle = j;
        } else {
            throw new IllegalStateException("attached already");
        }
    }

    public synchronized void detachFromNative() {
        this.mNativeHandle = 0;
    }

    public synchronized void onDeviceMotion(long[] jArr, float[] fArr, float[] fArr2) {
        if (this.mNativeHandle != 0) {
            nativeOnDeviceMotion(this.mNativeHandle, jArr, fArr, fArr2);
        }
    }
}
