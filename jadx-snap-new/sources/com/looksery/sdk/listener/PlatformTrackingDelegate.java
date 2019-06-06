package com.looksery.sdk.listener;

public interface PlatformTrackingDelegate {
    boolean isDeviceSupported();

    float requestAnchorScale();

    boolean requestTrackingBegin();

    boolean requestTrackingDataGeneration(float[] fArr, float[] fArr2, boolean z);

    boolean requestTrackingEnd();

    boolean requestTrackingReset();

    boolean requestTrackingRestartAtPoint(float f, float f2);

    boolean requestTrackingRestartWithExistingTransform(float[] fArr);
}
