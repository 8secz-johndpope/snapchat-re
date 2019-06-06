package com.looksery.sdk;

import com.looksery.sdk.DeviceMotionTracker.DeviceMotionListener;
import com.looksery.sdk.domain.DeviceMotionTrackingParameters;

final class SwitchableDeviceMotionTracker implements DeviceMotionTracker {
    private DeviceMotionTracker mInternalTracker;
    private DeviceMotionListener mListener;
    private DeviceMotionTrackingParameters mTrackingParameters;

    SwitchableDeviceMotionTracker() {
    }

    private static void startTracker(DeviceMotionTracker deviceMotionTracker, DeviceMotionListener deviceMotionListener, DeviceMotionTrackingParameters deviceMotionTrackingParameters) {
        deviceMotionTracker.start(deviceMotionListener, deviceMotionTrackingParameters);
    }

    public final synchronized SensorPresence describeSensors() {
        DeviceMotionTracker deviceMotionTracker = this.mInternalTracker;
        if (deviceMotionTracker != null) {
            return deviceMotionTracker.describeSensors();
        }
        return SensorPresence.UNAVAILABLE;
    }

    public final synchronized void reset() {
        if (this.mInternalTracker != null) {
            this.mInternalTracker.reset();
        }
    }

    public final synchronized void start(DeviceMotionListener deviceMotionListener, DeviceMotionTrackingParameters deviceMotionTrackingParameters) {
        this.mListener = deviceMotionListener;
        this.mTrackingParameters = deviceMotionTrackingParameters;
        if (this.mInternalTracker != null) {
            startTracker(this.mInternalTracker, deviceMotionListener, deviceMotionTrackingParameters);
        }
    }

    public final synchronized void stop() {
        if (this.mInternalTracker != null) {
            this.mInternalTracker.stop();
        }
        this.mListener = null;
        this.mTrackingParameters = null;
    }

    public final synchronized void switchToTracker(DeviceMotionTracker deviceMotionTracker) {
        if (this.mInternalTracker != null) {
            this.mInternalTracker.stop();
            this.mInternalTracker = null;
        }
        this.mInternalTracker = deviceMotionTracker;
        if (this.mListener != null) {
            startTracker(this.mInternalTracker, this.mListener, this.mTrackingParameters);
        }
    }
}
