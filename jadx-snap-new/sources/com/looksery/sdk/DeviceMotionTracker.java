package com.looksery.sdk;

import com.looksery.sdk.domain.DeviceMotionTrackingParameters;

public interface DeviceMotionTracker {
    public static final DeviceMotionTracker NOOP = new DeviceMotionTracker() {
        public SensorPresence describeSensors() {
            return SensorPresence.UNAVAILABLE;
        }

        public void reset() {
        }

        public void start(DeviceMotionListener deviceMotionListener, DeviceMotionTrackingParameters deviceMotionTrackingParameters) {
        }

        public void stop() {
        }
    };

    public interface DeviceMotionListener {
        void onDeviceMotion(long[] jArr, float[] fArr, float[] fArr2);
    }

    SensorPresence describeSensors();

    void reset();

    void start(DeviceMotionListener deviceMotionListener, DeviceMotionTrackingParameters deviceMotionTrackingParameters);

    void stop();
}
