package com.looksery.sdk;

import android.content.Context;
import com.looksery.sdk.domain.ImuData;

public final class Trackers {
    private Trackers() {
        throw new AssertionError("No instances");
    }

    public static DeviceCompassTracker deviceCompass(Context context) {
        return deviceCompass(context, DeviceLocationProvider.NOOP);
    }

    public static DeviceCompassTracker deviceCompass(Context context, DeviceLocationProvider deviceLocationProvider) {
        return DefaultDeviceCompassTracker.isSupported(context) ? DefaultDeviceCompassTracker.create(context, deviceLocationProvider) : DeviceCompassTracker.NOOP;
    }

    public static DeviceLocationTracker deviceLocation(Context context, String... strArr) {
        return DefaultDeviceLocationTracker.isSupported(context) ? DefaultDeviceLocationTracker.create(context, strArr) : DeviceLocationTracker.NOOP;
    }

    public static boolean deviceLocationSupported(Context context) {
        return DefaultDeviceLocationTracker.isSupported(context);
    }

    public static DeviceMotionTracker deviceMotion(Context context) {
        return EkfDeviceMotionTracker.isSupported(context) ? EkfDeviceMotionTracker.create(context) : DefaultDeviceMotionTracker.isSupported(context) ? DefaultDeviceMotionTracker.create(context) : DeviceMotionTracker.NOOP;
    }

    public static boolean deviceMotionSupported(Context context) {
        return EkfDeviceMotionTracker.isSupported(context) || DefaultDeviceMotionTracker.isSupported(context);
    }

    public static DeviceMotionTracker deviceMotionWithTimestampCorrection(Context context) {
        return new TimestampCorrectedDeviceMotionTracker(deviceMotion(context));
    }

    public static DeviceMotionTracker offlineDeviceMotionTracker(ImuData[] imuDataArr) {
        return new OfflineDeviceMotionTracker(imuDataArr);
    }
}
