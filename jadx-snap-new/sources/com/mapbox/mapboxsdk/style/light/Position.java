package com.mapbox.mapboxsdk.style.light;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class Position {
    private float azimuthalAngle;
    private float polarAngle;
    private float radialCoordinate;

    public Position(float f, float f2, float f3) {
        this.radialCoordinate = f;
        this.azimuthalAngle = f2;
        this.polarAngle = f3;
    }

    public static Position fromPosition(float f, float f2, float f3) {
        return new Position(f, f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Position position = (Position) obj;
            if (Float.compare(position.radialCoordinate, this.radialCoordinate) == 0 && Float.compare(position.azimuthalAngle, this.azimuthalAngle) == 0 && Float.compare(position.polarAngle, this.polarAngle) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        float f = this.radialCoordinate;
        int i = 0;
        int floatToIntBits = (f != MapboxConstants.MINIMUM_ZOOM ? Float.floatToIntBits(f) : 0) * 31;
        float f2 = this.azimuthalAngle;
        floatToIntBits = (floatToIntBits + (f2 != MapboxConstants.MINIMUM_ZOOM ? Float.floatToIntBits(f2) : 0)) * 31;
        f2 = this.polarAngle;
        if (f2 != MapboxConstants.MINIMUM_ZOOM) {
            i = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Position{radialCoordinate=");
        stringBuilder.append(this.radialCoordinate);
        stringBuilder.append(", azimuthalAngle=");
        stringBuilder.append(this.azimuthalAngle);
        stringBuilder.append(", polarAngle=");
        stringBuilder.append(this.polarAngle);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
