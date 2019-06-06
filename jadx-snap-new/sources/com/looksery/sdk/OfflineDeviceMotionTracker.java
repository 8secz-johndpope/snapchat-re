package com.looksery.sdk;

import com.looksery.sdk.DeviceMotionTracker.DeviceMotionListener;
import com.looksery.sdk.domain.DeviceMotionTrackingParameters;
import com.looksery.sdk.domain.ImuData;

final class OfflineDeviceMotionTracker implements DeviceMotionTracker {
    private static final int ACCELERATION_VECTOR_ELEMENTS = 3;
    private static final int ROTATION_MATRIX_ELEMENTS = 9;
    private final ImuData[] mImuData;

    OfflineDeviceMotionTracker(ImuData[] imuDataArr) {
        this.mImuData = imuDataArr;
    }

    public final SensorPresence describeSensors() {
        return SensorPresence.BEST_CONFIG;
    }

    public final void reset() {
    }

    public final void start(DeviceMotionListener deviceMotionListener, DeviceMotionTrackingParameters deviceMotionTrackingParameters) {
        if (deviceMotionListener != null) {
            ImuData[] imuDataArr = this.mImuData;
            long[] jArr = new long[imuDataArr.length];
            float[] fArr = new float[(imuDataArr.length * 3)];
            float[] fArr2 = new float[(imuDataArr.length * 9)];
            int i = 0;
            while (true) {
                ImuData[] imuDataArr2 = this.mImuData;
                if (i < imuDataArr2.length) {
                    ImuData imuData = imuDataArr2[i];
                    jArr[i] = (long) (imuData.timestamp * 1.0E9d);
                    System.arraycopy(imuData.acceleration, 0, fArr, i * 3, 3);
                    System.arraycopy(imuData.rotationRate, 0, fArr2, i * 9, 9);
                    i++;
                } else {
                    deviceMotionListener.onDeviceMotion(jArr, fArr2, fArr);
                    return;
                }
            }
        }
    }

    public final void stop() {
    }
}
