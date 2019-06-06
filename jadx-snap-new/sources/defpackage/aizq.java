package defpackage;

/* renamed from: aizq */
final class aizq extends aiwd {
    private final akkd a;

    aizq(akkd akkd) {
        this.a = akkd;
    }

    public final void a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int a = this.a.a(bArr, i, i2);
            if (a != -1) {
                i2 -= a;
                i += a;
            } else {
                StringBuilder stringBuilder = new StringBuilder("EOF trying to read ");
                stringBuilder.append(i2);
                stringBuilder.append(" bytes");
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
        }
    }

    public final int b() {
        return (int) this.a.b;
    }

    public final int c() {
        return this.a.g() & 255;
    }

    public final aiyo c(int i) {
        akkd akkd = new akkd();
        akkd.a_(this.a, (long) i);
        return new aizq(akkd);
    }

    public final void close() {
        this.a.r();
    }
}
