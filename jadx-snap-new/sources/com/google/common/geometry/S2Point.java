package com.google.common.geometry;

import defpackage.ppy;

public class S2Point implements Comparable<S2Point> {
    final double x;
    final double y;
    final double z;

    public S2Point() {
        this.z = 0.0d;
        this.y = 0.0d;
        this.x = 0.0d;
    }

    public S2Point(double d, double d2, double d3) {
        this.x = d;
        this.y = d2;
        this.z = d3;
    }

    public static S2Point fabs(S2Point s2Point) {
        return new S2Point(Math.abs(s2Point.x), Math.abs(s2Point.y), Math.abs(s2Point.z));
    }

    public int compareTo(S2Point s2Point) {
        return lessThan(s2Point) ? -1 : equals(s2Point) ? 0 : 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof S2Point)) {
            return false;
        }
        S2Point s2Point = (S2Point) obj;
        return this.x == s2Point.x && this.y == s2Point.y && this.z == s2Point.z;
    }

    public double get(int i) {
        return i == 0 ? this.x : i == 1 ? this.y : this.z;
    }

    public int hashCode() {
        long doubleToLongBits = (Double.doubleToLongBits(Math.abs(this.x)) + 629) + 17;
        doubleToLongBits += (doubleToLongBits * 37) + Double.doubleToLongBits(Math.abs(this.y));
        doubleToLongBits += (37 * doubleToLongBits) + Double.doubleToLongBits(Math.abs(this.z));
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public int largestAbsComponent() {
        S2Point fabs = fabs(this);
        double d = fabs.x;
        double d2 = fabs.y;
        return d > d2 ? d > fabs.z ? 0 : 2 : d2 > fabs.z ? 1 : 2;
    }

    public boolean lessThan(S2Point s2Point) {
        double d = this.x;
        double d2 = s2Point.x;
        if (d < d2) {
            return true;
        }
        if (d2 < d) {
            return false;
        }
        d = this.y;
        d2 = s2Point.y;
        return d < d2 ? true : d2 >= d && this.z < s2Point.z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(this.x);
        String str = ppy.d;
        stringBuilder.append(str);
        stringBuilder.append(this.y);
        stringBuilder.append(str);
        stringBuilder.append(this.z);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
