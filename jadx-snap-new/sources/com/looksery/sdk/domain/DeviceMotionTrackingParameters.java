package com.looksery.sdk.domain;

public final class DeviceMotionTrackingParameters {
    private final boolean mRequiresCompassAlignment;

    public DeviceMotionTrackingParameters(boolean z) {
        this.mRequiresCompassAlignment = z;
    }

    public final boolean doesRequireCompassAlignment() {
        return this.mRequiresCompassAlignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (this.mRequiresCompassAlignment == ((DeviceMotionTrackingParameters) obj).mRequiresCompassAlignment) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.mRequiresCompassAlignment ? 1 : 0;
    }
}
