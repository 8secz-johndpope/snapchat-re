package com.google.common.geometry;

public final class S1Angle implements Comparable<S1Angle> {
    private final double radians;

    public S1Angle() {
        this.radians = 0.0d;
    }

    private S1Angle(double d) {
        this.radians = d;
    }

    public static S1Angle degrees(double d) {
        return new S1Angle(d * 0.017453292519943295d);
    }

    public static S1Angle radians(double d) {
        return new S1Angle(d);
    }

    public final int compareTo(S1Angle s1Angle) {
        double d = this.radians;
        double d2 = s1Angle.radians;
        return d < d2 ? -1 : d > d2 ? 1 : 0;
    }

    public final double degrees() {
        return this.radians * 57.29577951308232d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof S1Angle) && radians() == ((S1Angle) obj).radians();
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.radians);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final double radians() {
        return this.radians;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(degrees());
        stringBuilder.append("d");
        return stringBuilder.toString();
    }
}
