package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acjr */
public final class acjr extends cce {
    public static int a(ccc ccc, int[] iArr) {
        ccc.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ccc.b(iArr[length]);
        }
        return ccc.b();
    }

    public static acjr a(ByteBuffer byteBuffer) {
        acjr acjr = new acjr();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        acjr.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        acjr.b = byteBuffer;
        return acjr;
    }

    public static void a(ccc ccc) {
        ccc.c(4);
    }

    public static void a(ccc ccc, int i) {
        ccc.c(0, i);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public static int b(ccc ccc, int[] iArr) {
        ccc.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ccc.b(iArr[length]);
        }
        return ccc.b();
    }

    public static void b(ccc ccc, int i) {
        ccc.c(1, i);
    }

    public static void c(ccc ccc, int i) {
        ccc.c(2, i);
    }

    public static void d(ccc ccc, int i) {
        ccc.c(3, i);
    }

    public final String b() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }

    public final int c() {
        int a = a(6);
        return a != 0 ? d(a) : 0;
    }

    public final acjo d() {
        acjo acjo = new acjo();
        int a = a(8);
        if (a == 0) {
            return null;
        }
        a = b(a + this.a);
        ByteBuffer byteBuffer = this.b;
        acjo.a = a;
        acjo.b = byteBuffer;
        return acjo;
    }

    public final int e() {
        int a = a(10);
        return a != 0 ? d(a) : 0;
    }

    public final acjn f(int i) {
        acjn acjn = new acjn();
        int a = a(6);
        if (a == 0) {
            return null;
        }
        i = b(e(a) + (i << 2));
        ByteBuffer byteBuffer = this.b;
        acjn.a = i;
        acjn.b = byteBuffer;
        return acjn;
    }

    public final ackc g(int i) {
        ackc ackc = new ackc();
        int a = a(10);
        if (a == 0) {
            return null;
        }
        i = b(e(a) + (i << 2));
        ByteBuffer byteBuffer = this.b;
        ackc.a = i;
        ackc.b = byteBuffer;
        return ackc;
    }
}
