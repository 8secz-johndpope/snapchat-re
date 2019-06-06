package com.looksery.sdk.touch;

import defpackage.ppy;
import java.util.Arrays;

public final class Touch implements Comparable<Touch> {
    private final int mId;
    private final float[] mPosition;
    private final State mState;

    public enum State {
        BEGAN(0),
        MOVED(1),
        STATIONARY(2),
        ENDED(3),
        CANCELED(4),
        INVALID(-1);
        
        final int mNativeIndex;

        private State(int i) {
            this.mNativeIndex = i;
        }

        public static State from(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return MOVED;
                    }
                    if (i == 3) {
                        return CANCELED;
                    }
                    if (i != 5) {
                        if (i != 6) {
                            return INVALID;
                        }
                    }
                }
                return ENDED;
            }
            return BEGAN;
        }

        /* Access modifiers changed, original: final */
        public final int getNativeIndex() {
            return this.mNativeIndex;
        }

        public final boolean isValid() {
            return INVALID != this;
        }
    }

    Touch(int i, State state, float[] fArr) {
        if (isValid(fArr)) {
            this.mId = i;
            this.mState = state;
            this.mPosition = fArr;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("position is not valid [");
        stringBuilder.append(fArr[0]);
        stringBuilder.append(ppy.d);
        stringBuilder.append(fArr[1]);
        stringBuilder.append("]");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static boolean isValid(float[] fArr) {
        if (fArr.length != 2) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        return (Float.isNaN(f) || Float.isNaN(f2) || Float.isInfinite(f) || Float.isInfinite(f2)) ? false : true;
    }

    public final int compareTo(Touch touch) {
        int i = this.mId;
        int i2 = touch.mId;
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Touch touch = (Touch) obj;
        return (this.mId == touch.mId && this.mState == touch.mState) ? Arrays.equals(this.mPosition, touch.mPosition) : false;
    }

    public final int getId() {
        return this.mId;
    }

    public final State getState() {
        return this.mState;
    }

    public final float getX() {
        return this.mPosition[0];
    }

    public final float getY() {
        return this.mPosition[1];
    }

    public final int hashCode() {
        return (((this.mId * 31) + this.mState.hashCode()) * 31) + Arrays.hashCode(this.mPosition);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Touch{id=");
        stringBuilder.append(this.mId);
        stringBuilder.append(", state=");
        stringBuilder.append(this.mState);
        stringBuilder.append(", position=[");
        stringBuilder.append(this.mPosition[0]);
        stringBuilder.append(ppy.d);
        stringBuilder.append(this.mPosition[1]);
        stringBuilder.append("]}");
        return stringBuilder.toString();
    }
}
