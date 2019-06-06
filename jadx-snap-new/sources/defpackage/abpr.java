package defpackage;

/* renamed from: abpr */
public final class abpr {
    public final float a;
    public final float b;

    public abpr(float f, float f2) {
        this.a = abpr.a(f, "width");
        this.b = abpr.a(f2, "height");
    }

    private static float a(float f, String str) {
        StringBuilder stringBuilder;
        if (Float.isNaN(f)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" must not be NaN");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!Float.isInfinite(f)) {
            return f;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" must not be infinite");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof abpr) {
            abpr abpr = (abpr) obj;
            return this.a == abpr.a && this.b == abpr.b;
        }
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("x");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
