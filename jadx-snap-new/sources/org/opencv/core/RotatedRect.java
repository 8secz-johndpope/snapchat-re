package org.opencv.core;

public class RotatedRect {
    public double angle;
    public Point center;
    public Size size;

    public RotatedRect() {
        this.center = new Point();
        this.size = new Size();
        this.angle = 0.0d;
    }

    public RotatedRect(Point point, Size size, double d) {
        this.center = point.clone();
        this.size = size.clone();
        this.angle = d;
    }

    public RotatedRect(double[] dArr) {
        this();
        set(dArr);
    }

    public Rect boundingRect() {
        Point[] pointArr = new Point[4];
        points(pointArr);
        Rect rect = new Rect((int) Math.floor(Math.min(Math.min(Math.min(pointArr[0].x, pointArr[1].x), pointArr[2].x), pointArr[3].x)), (int) Math.floor(Math.min(Math.min(Math.min(pointArr[0].y, pointArr[1].y), pointArr[2].y), pointArr[3].y)), (int) Math.ceil(Math.max(Math.max(Math.max(pointArr[0].x, pointArr[1].x), pointArr[2].x), pointArr[3].x)), (int) Math.ceil(Math.max(Math.max(Math.max(pointArr[0].y, pointArr[1].y), pointArr[2].y), pointArr[3].y)));
        rect.width -= rect.x - 1;
        rect.height -= rect.y - 1;
        return rect;
    }

    public RotatedRect clone() {
        return new RotatedRect(this.center, this.size, this.angle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotatedRect)) {
            return false;
        }
        RotatedRect rotatedRect = (RotatedRect) obj;
        return this.center.equals(rotatedRect.center) && this.size.equals(rotatedRect.size) && this.angle == rotatedRect.angle;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.center.x);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.center.y);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.size.width);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.size.height);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.angle);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public void points(Point[] pointArr) {
        double d = (this.angle * 3.141592653589793d) / 180.0d;
        double cos = Math.cos(d) * 0.5d;
        d = Math.sin(d) * 0.5d;
        pointArr[0] = new Point((this.center.x - (this.size.height * d)) - (this.size.width * cos), (this.center.y + (this.size.height * cos)) - (this.size.width * d));
        pointArr[1] = new Point((this.center.x + (this.size.height * d)) - (this.size.width * cos), (this.center.y - (cos * this.size.height)) - (d * this.size.width));
        pointArr[2] = new Point((this.center.x * 2.0d) - pointArr[0].x, (this.center.y * 2.0d) - pointArr[0].y);
        pointArr[3] = new Point((this.center.x * 2.0d) - pointArr[1].x, (this.center.y * 2.0d) - pointArr[1].y);
    }

    public void set(double[] dArr) {
        double d = 0.0d;
        if (dArr != null) {
            this.center.x = dArr.length > 0 ? dArr[0] : 0.0d;
            this.center.y = dArr.length > 1 ? dArr[1] : 0.0d;
            this.size.width = dArr.length > 2 ? dArr[2] : 0.0d;
            this.size.height = dArr.length > 3 ? dArr[3] : 0.0d;
            if (dArr.length > 4) {
                d = dArr[4];
            }
            this.angle = d;
            return;
        }
        Point point = this.center;
        point.x = 0.0d;
        point.x = 0.0d;
        Size size = this.size;
        size.width = 0.0d;
        size.height = 0.0d;
        this.angle = 0.0d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{ ");
        stringBuilder.append(this.center);
        stringBuilder.append(" ");
        stringBuilder.append(this.size);
        stringBuilder.append(" * ");
        stringBuilder.append(this.angle);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
