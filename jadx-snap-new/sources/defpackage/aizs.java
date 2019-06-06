package defpackage;

/* renamed from: aizs */
final class aizs implements aizg {
    final akkd a;
    private int b;
    private int c;

    aizs(akkd akkd, int i) {
        this.a = akkd;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final void a(byte b) {
        this.a.j((int) b);
        this.b--;
        this.c++;
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.a.c(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }

    public final int b() {
        return this.c;
    }
}
