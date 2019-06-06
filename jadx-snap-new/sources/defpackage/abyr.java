package defpackage;

import java.nio.ByteBuffer;

/* renamed from: abyr */
public final class abyr extends cce {
    public static int a(ccc ccc, int i, int i2) {
        ccc.c(2);
        ccc.c(1, i2);
        ccc.b(0, i);
        return ccc.d();
    }

    public static int a(ccc ccc, byte[] bArr) {
        ccc.a(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            ccc.a(bArr[length]);
        }
        return ccc.b();
    }

    public final int b() {
        int a = a(4);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final ByteBuffer c() {
        return a();
    }
}
