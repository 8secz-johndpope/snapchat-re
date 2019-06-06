package defpackage;

/* renamed from: bog */
final class bog {
    private static final long[] b = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    int a;
    private final byte[] c = new byte[8];
    private int d;

    public static int a(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if ((b[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= b[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public final long a(bnl bnl, boolean z, boolean z2, int i) {
        if (this.d == 0) {
            if (!bnl.a(this.c, 0, 1, z)) {
                return -1;
            }
            this.a = bog.a(this.c[0] & 255);
            if (this.a != -1) {
                this.d = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.a;
        if (i2 > i) {
            this.d = 0;
            return -2;
        }
        if (i2 != 1) {
            bnl.b(this.c, 1, i2 - 1);
        }
        this.d = 0;
        return bog.a(this.c, this.a, z2);
    }

    public final void a() {
        this.d = 0;
        this.a = 0;
    }
}
