package org.opencv.core;

import defpackage.ppy;

public class Range {
    public int end;
    public int start;

    public Range() {
        this(0, 0);
    }

    public Range(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    public Range(double[] dArr) {
        set(dArr);
    }

    public static Range all() {
        return new Range(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public Range clone() {
        return new Range(this.start, this.end);
    }

    public boolean empty() {
        return this.end <= this.start;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.start == range.start && this.end == range.end;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits((double) this.start);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits((double) this.end);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public Range intersection(Range range) {
        Range range2 = new Range(Math.max(range.start, this.start), Math.min(range.end, this.end));
        range2.end = Math.max(range2.end, range2.start);
        return range2;
    }

    public void set(double[] dArr) {
        int i = 0;
        if (dArr != null) {
            this.start = dArr.length > 0 ? (int) dArr[0] : 0;
            if (dArr.length > 1) {
                i = (int) dArr[1];
            }
            this.end = i;
            return;
        }
        this.start = 0;
        this.end = 0;
    }

    public Range shift(int i) {
        return new Range(this.start + i, this.end + i);
    }

    public int size() {
        return empty() ? 0 : this.end - this.start;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(this.start);
        stringBuilder.append(ppy.d);
        stringBuilder.append(this.end);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
