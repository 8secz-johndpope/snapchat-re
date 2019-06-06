package org.opencv.core;

import defpackage.ppy;

public class Rect {
    public int height;
    public int width;
    public int x;
    public int y;

    public Rect() {
        this(0, 0, 0, 0);
    }

    public Rect(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public Rect(Point point, Point point2) {
        this.x = (int) (point.x < point2.x ? point.x : point2.x);
        this.y = (int) (point.y < point2.y ? point.y : point2.y);
        this.width = ((int) (point.x > point2.x ? point.x : point2.x)) - this.x;
        this.height = ((int) (point.y > point2.y ? point.y : point2.y)) - this.y;
    }

    public Rect(Point point, Size size) {
        this((int) point.x, (int) point.y, (int) size.width, (int) size.height);
    }

    public Rect(double[] dArr) {
        set(dArr);
    }

    public double area() {
        return (double) (this.width * this.height);
    }

    public Point br() {
        return new Point((double) (this.x + this.width), (double) (this.y + this.height));
    }

    public Rect clone() {
        return new Rect(this.x, this.y, this.width, this.height);
    }

    public boolean contains(Point point) {
        return ((double) this.x) <= point.x && point.x < ((double) (this.x + this.width)) && ((double) this.y) <= point.y && point.y < ((double) (this.y + this.height));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return this.x == rect.x && this.y == rect.y && this.width == rect.width && this.height == rect.height;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits((double) this.height);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits((double) this.width);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits((double) this.x);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits((double) this.y);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public void set(double[] dArr) {
        int i = 0;
        if (dArr != null) {
            this.x = dArr.length > 0 ? (int) dArr[0] : 0;
            this.y = dArr.length > 1 ? (int) dArr[1] : 0;
            this.width = dArr.length > 2 ? (int) dArr[2] : 0;
            if (dArr.length > 3) {
                i = (int) dArr[3];
            }
            this.height = i;
            return;
        }
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public Size size() {
        return new Size((double) this.width, (double) this.height);
    }

    public Point tl() {
        return new Point((double) this.x, (double) this.y);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append(this.x);
        String str = ppy.d;
        stringBuilder.append(str);
        stringBuilder.append(this.y);
        stringBuilder.append(str);
        stringBuilder.append(this.width);
        stringBuilder.append("x");
        stringBuilder.append(this.height);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
