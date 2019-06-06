package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acji */
public final class acji extends cce {
    public static int a(ccc ccc, int i, int i2) {
        ccc.c(2);
        ccc.c(1, i2);
        ccc.c(0, i);
        return ccc.d();
    }

    public static int a(ccc ccc, int[] iArr) {
        ccc.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ccc.b(iArr[length]);
        }
        return ccc.b();
    }

    public static acji a(ByteBuffer byteBuffer) {
        acji acji = new acji();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        acji.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        acji.b = byteBuffer;
        return acji;
    }

    public final int b() {
        int a = a(4);
        return a != 0 ? d(a) : 0;
    }

    public final acjj c() {
        acjj acjj = new acjj();
        int a = a(6);
        if (a == 0) {
            return null;
        }
        acjj.b(b(a + this.a), this.b);
        return acjj;
    }

    public final acjj f(int i) {
        acjj acjj = new acjj();
        int a = a(4);
        if (a == 0) {
            return null;
        }
        acjj.b(b(e(a) + (i << 2)), this.b);
        return acjj;
    }
}
