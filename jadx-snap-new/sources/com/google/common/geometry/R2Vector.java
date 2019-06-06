package com.google.common.geometry;

import defpackage.ppy;

public final class R2Vector {
    private final double x;
    private final double y;

    public R2Vector() {
        this(0.0d, 0.0d);
    }

    public R2Vector(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof R2Vector)) {
            return false;
        }
        R2Vector r2Vector = (R2Vector) obj;
        return this.x == r2Vector.x && this.y == r2Vector.y;
    }

    public final int hashCode() {
        long doubleToLongBits = (Double.doubleToLongBits(Math.abs(this.x)) + 629) + 17;
        doubleToLongBits += (37 * doubleToLongBits) + Double.doubleToLongBits(Math.abs(this.y));
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(this.x);
        stringBuilder.append(ppy.d);
        stringBuilder.append(this.y);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final double x() {
        return this.x;
    }

    public final double y() {
        return this.y;
    }
}
