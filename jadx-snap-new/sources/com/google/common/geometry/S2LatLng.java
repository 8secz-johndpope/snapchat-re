package com.google.common.geometry;

import defpackage.ppy;

public class S2LatLng {
    public static final S2LatLng CENTER = new S2LatLng(0.0d, 0.0d);
    private final double latRadians;
    private final double lngRadians;

    public S2LatLng() {
        this(0.0d, 0.0d);
    }

    private S2LatLng(double d, double d2) {
        this.latRadians = d;
        this.lngRadians = d2;
    }

    public S2LatLng(S1Angle s1Angle, S1Angle s1Angle2) {
        this(s1Angle.radians(), s1Angle2.radians());
    }

    public static S2LatLng fromDegrees(double d, double d2) {
        return new S2LatLng(S1Angle.degrees(d), S1Angle.degrees(d2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof S2LatLng) {
            S2LatLng s2LatLng = (S2LatLng) obj;
            if (this.latRadians == s2LatLng.latRadians && this.lngRadians == s2LatLng.lngRadians) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = (Double.doubleToLongBits(this.latRadians) + 629) + 17;
        doubleToLongBits += (37 * doubleToLongBits) + Double.doubleToLongBits(this.lngRadians);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public S1Angle lat() {
        return S1Angle.radians(this.latRadians);
    }

    public S1Angle lng() {
        return S1Angle.radians(this.lngRadians);
    }

    public S2Point toPoint() {
        double radians = lat().radians();
        double radians2 = lng().radians();
        double cos = Math.cos(radians);
        return new S2Point(Math.cos(radians2) * cos, Math.sin(radians2) * cos, Math.sin(radians));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(this.latRadians);
        stringBuilder.append(ppy.d);
        stringBuilder.append(this.lngRadians);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
