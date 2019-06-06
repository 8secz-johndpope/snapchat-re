package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acjx */
public final class acjx extends cce {
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

    public static acjx a(ByteBuffer byteBuffer) {
        acjx acjx = new acjx();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        acjx.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        acjx.b = byteBuffer;
        return acjx;
    }

    public final String b() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }

    public final int c() {
        int a = a(6);
        return a != 0 ? d(a) : 0;
    }

    public final acjj f(int i) {
        acjj acjj = new acjj();
        int a = a(6);
        if (a == 0) {
            return null;
        }
        acjj.b(b(e(a) + (i << 2)), this.b);
        return acjj;
    }
}
