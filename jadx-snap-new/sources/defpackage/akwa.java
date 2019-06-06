package defpackage;

/* renamed from: akwa */
public final class akwa {
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    private boolean d;

    public akwa(byte[] bArr, byte[] bArr2) {
        this(bArr, bArr2, null);
    }

    private akwa(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null) {
            this.a = akwc.b(bArr);
            this.d = false;
            bArr2 = (bArr2 == null || bArr2.length == 0) ? null : akwc.b(bArr2);
            this.b = bArr2;
            this.c = new byte[0];
            return;
        }
        throw new IllegalArgumentException("IKM (input keying material) should not be null");
    }
}
