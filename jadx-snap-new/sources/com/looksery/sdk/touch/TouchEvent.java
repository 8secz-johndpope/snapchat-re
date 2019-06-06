package com.looksery.sdk.touch;

import java.util.Arrays;

public final class TouchEvent {
    private static final TouchEvent INVALID = new TouchEvent(new Touch[0], -1);
    private final long mTimestampNanos;
    private final Touch[] mTouches;
    private final boolean mValid;

    private TouchEvent(Touch[] touchArr, long j) {
        this.mTouches = touchArr;
        this.mValid = touchArr.length > 0;
        this.mTimestampNanos = j;
    }

    public static TouchEvent create(Touch[] touchArr, long j) {
        return touchArr.length <= 0 ? INVALID : new TouchEvent(touchArr, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TouchEvent touchEvent = (TouchEvent) obj;
        return this.mTimestampNanos != touchEvent.mTimestampNanos ? false : Arrays.equals(this.mTouches, touchEvent.mTouches);
    }

    public final Touch getFirstTouch() {
        if (this.mValid) {
            return this.mTouches[0];
        }
        throw new IllegalStateException("Attempt to get a Touch from an Invalid TouchEvent");
    }

    public final long getTimestamp() {
        return this.mTimestampNanos;
    }

    public final Touch[] getTouchesArray() {
        return this.mTouches;
    }

    public final int hashCode() {
        long j = this.mTimestampNanos;
        return (((int) (j ^ (j >>> 32))) * 31) + Arrays.hashCode(this.mTouches);
    }

    public final boolean isValid() {
        return this.mValid;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TouchEvent{timestampNanos=");
        stringBuilder.append(this.mTimestampNanos);
        stringBuilder.append(", touches=");
        stringBuilder.append(Arrays.toString(this.mTouches));
        stringBuilder.append(", valid=");
        stringBuilder.append(this.mValid);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
