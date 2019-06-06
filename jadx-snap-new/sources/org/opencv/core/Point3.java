package org.opencv.core;

import defpackage.ppy;

public class Point3 {
    public double x;
    public double y;
    public double z;

    public Point3() {
        this(0.0d, 0.0d, 0.0d);
    }

    public Point3(double d, double d2, double d3) {
        this.x = d;
        this.y = d2;
        this.z = d3;
    }

    public Point3(Point point) {
        this.x = point.x;
        this.y = point.y;
        this.z = 0.0d;
    }

    public Point3(double[] dArr) {
        this();
        set(dArr);
    }

    public Point3 clone() {
        return new Point3(this.x, this.y, this.z);
    }

    public Point3 cross(Point3 point3) {
        Point3 point32 = point3;
        double d = this.y;
        double d2 = point32.z;
        double d3 = d * d2;
        double d4 = this.z;
        double d5 = point32.y;
        d3 -= d4 * d5;
        double d6 = point32.x;
        d4 *= d6;
        double d7 = d3;
        d3 = this.x;
        d3 = (d3 * d5) - (d * d6);
        return new Point3(d7, d4 - (d2 * d3), d3);
    }

    public double dot(Point3 point3) {
        return ((this.x * point3.x) + (this.y * point3.y)) + (this.z * point3.z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point3)) {
            return false;
        }
        Point3 point3 = (Point3) obj;
        return this.x == point3.x && this.y == point3.y && this.z == point3.z;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.x);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.y);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.z);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public void set(double[] dArr) {
        double d = 0.0d;
        if (dArr != null) {
            this.x = dArr.length > 0 ? dArr[0] : 0.0d;
            this.y = dArr.length > 1 ? dArr[1] : 0.0d;
            if (dArr.length > 2) {
                d = dArr[2];
            }
            this.z = d;
            return;
        }
        this.x = 0.0d;
        this.y = 0.0d;
        this.z = 0.0d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append(this.x);
        String str = ppy.d;
        stringBuilder.append(str);
        stringBuilder.append(this.y);
        stringBuilder.append(str);
        stringBuilder.append(this.z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
