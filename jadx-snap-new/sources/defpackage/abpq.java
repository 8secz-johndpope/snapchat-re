package defpackage;

/* renamed from: abpq */
public final class abpq {
    public final int a;
    public final int b;
    private final int c;

    public abpq(int i, int i2) {
        this.a = i;
        this.b = i2;
        i = this.b;
        i2 = this.a;
        this.c = i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof abpq) {
            abpq abpq = (abpq) obj;
            return this.a == abpq.a && this.b == abpq.b;
        }
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("x");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
