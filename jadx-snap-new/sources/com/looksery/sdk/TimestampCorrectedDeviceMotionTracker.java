package com.looksery.sdk;

import com.looksery.sdk.DeviceMotionTracker.DeviceMotionListener;
import com.looksery.sdk.domain.DeviceMotionTrackingParameters;

class TimestampCorrectedDeviceMotionTracker implements DeviceMotionTracker {
    private final DeviceMotionListener mOurListener = new DeviceMotionListener() {
        public void onDeviceMotion(long[] jArr, float[] fArr, float[] fArr2) {
            for (int i = 0; i < jArr.length; i++) {
                jArr[i] = (long) (TimestampCorrectedDeviceMotionTracker.this.mTimestampConverter.convert(jArr[i]) * 1.0E9d);
            }
            TimestampCorrectedDeviceMotionTracker.this.mTheirListener.onDeviceMotion(jArr, fArr, fArr2);
        }
    };
    private final DeviceMotionTracker mSourceTracker;
    private DeviceMotionListener mTheirListener;
    private final TimestampConverter mTimestampConverter = new TimestampConverter("device motion");

    TimestampCorrectedDeviceMotionTracker(DeviceMotionTracker deviceMotionTracker) {
        this.mSourceTracker = deviceMotionTracker;
    }

    public SensorPresence describeSensors() {
        return this.mSourceTracker.describeSensors();
    }

    public void reset() {
        this.mSourceTracker.reset();
    }

    public void start(DeviceMotionListener deviceMotionListener, DeviceMotionTrackingParameters deviceMotionTrackingParameters) {
        if (deviceMotionListener != null) {
            this.mTheirListener = deviceMotionListener;
            this.mTimestampConverter.reset();
            this.mSourceTracker.start(this.mOurListener, deviceMotionTrackingParameters);
        }
    }

    public void stop() {
        this.mSourceTracker.stop();
    }
}
