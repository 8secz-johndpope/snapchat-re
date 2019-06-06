package org.opencv.core;

public class Size {
    public double height;
    public double width;

    public Size() {
        this(0.0d, 0.0d);
    }

    public Size(double d, double d2) {
        this.width = d;
        this.height = d2;
    }

    public Size(Point point) {
        this.width = point.x;
        this.height = point.y;
    }

    public Size(double[] dArr) {
        set(dArr);
    }

    public double area() {
        return this.width * this.height;
    }

    public Size clone() {
        return new Size(this.width, this.height);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.height);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.width);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public void set(double[] dArr) {
        double d = 0.0d;
        if (dArr != null) {
            this.width = dArr.length > 0 ? dArr[0] : 0.0d;
            if (dArr.length > 1) {
                d = dArr[1];
            }
            this.height = d;
            return;
        }
        this.width = 0.0d;
        this.height = 0.0d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((int) this.width);
        stringBuilder.append("x");
        stringBuilder.append((int) this.height);
        return stringBuilder.toString();
    }
}
