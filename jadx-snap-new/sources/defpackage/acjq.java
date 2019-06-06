package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acjq */
public final class acjq extends cce {
    public static int a(ccc ccc, int[] iArr) {
        ccc.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ccc.b(iArr[length]);
        }
        return ccc.b();
    }

    public static acjq a(ByteBuffer byteBuffer) {
        acjq acjq = new acjq();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        acjq.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        acjq.b = byteBuffer;
        return acjq;
    }

    public static void a(ccc ccc) {
        ccc.c(2);
    }

    public static void a(ccc ccc, int i) {
        ccc.c(0, i);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public static void b(ccc ccc, int i) {
        ccc.c(1, i);
    }

    public final int b() {
        int a = a(4);
        return a != 0 ? d(a) : 0;
    }

    public final String c() {
        int a = a(6);
        return a != 0 ? c(a + this.a) : null;
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
