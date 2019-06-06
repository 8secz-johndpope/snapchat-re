package defpackage;

/* renamed from: akvp */
public final class akvp {
    public akvs a;
    public int b;
    public byte[] c;
    public byte[] d;
    public int e;

    public akvp(akvd akvd) {
        this.a = new akvs(akvd);
        this.b = akvd.b();
    }

    public final void a() {
        int i = this.e;
        int i2 = this.b;
        int i3 = (i / i2) + 1;
        if (i3 < 256) {
            if (i != 0) {
                this.a.a(this.d, i2);
            }
            akvs akvs = this.a;
            byte[] bArr = this.c;
            akvs.a(bArr, bArr.length);
            this.a.a((byte) i3);
            this.a.a(this.d);
            return;
        }
        throw new akvc("HKDF cannot generate more than 255 blocks of HashLen size");
    }
}
