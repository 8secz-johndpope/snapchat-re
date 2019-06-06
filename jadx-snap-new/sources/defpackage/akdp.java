package defpackage;

/* renamed from: akdp */
public class akdp extends akdo {
    public static final int a(double d) {
        if (!Double.isNaN(d)) {
            return d > 2.147483647E9d ? Integer.MAX_VALUE : d < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(d);
        } else {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
    }

    public static final int a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final long b(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
