package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: abtl */
public final class abtl {
    @SerializedName("width")
    protected int a;
    @SerializedName("height")
    protected int b;

    public abtl(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final abtl a() {
        return new abtl(this.b, this.a);
    }

    public final abtl a(double d) {
        double d2 = (double) this.a;
        Double.isNaN(d2);
        int i = (int) (d2 * d);
        double d3 = (double) this.b;
        Double.isNaN(d3);
        return new abtl(i, (int) (d3 * d));
    }

    public final void a(int i) {
        this.a = i;
    }

    public final boolean a(abtl abtl) {
        return (this.b >= abtl.b && this.a > abtl.a) || ((this.b > abtl.b && this.a >= abtl.a) || ((this.a >= abtl.b && this.b > abtl.a) || (this.a > abtl.b && this.b >= abtl.a)));
    }

    public final int b() {
        return this.a;
    }

    public final void b(int i) {
        this.b = i;
    }

    public final boolean b(abtl abtl) {
        return (this.b >= abtl.b && this.a >= abtl.a) || (this.a >= abtl.b && this.b >= abtl.a);
    }

    public final int c() {
        return this.b;
    }

    public final abtl c(int i) {
        double d = (double) i;
        double d2 = (double) this.a;
        Double.isNaN(d);
        Double.isNaN(d2);
        return a(d / d2);
    }

    public final boolean c(abtl abtl) {
        return f() > abtl.f();
    }

    public final int d() {
        return Math.min(this.a, this.b);
    }

    public final abtl d(int i) {
        double d = (double) i;
        double d2 = (double) this.b;
        Double.isNaN(d);
        Double.isNaN(d2);
        return a(d / d2);
    }

    public final int e() {
        return Math.max(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abtl)) {
            return false;
        }
        abtl abtl = (abtl) obj;
        return this.a == abtl.a && this.b == abtl.b && getClass().equals(abtl.getClass());
    }

    public final double f() {
        double d = (double) this.a;
        double d2 = (double) this.b;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    public final int g() {
        return this.a * this.b;
    }

    public final boolean h() {
        return this.b >= 720 && this.a >= 720;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i + 41) * 41) + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("W x H = [");
        stringBuilder.append(this.a);
        stringBuilder.append(" x ");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
