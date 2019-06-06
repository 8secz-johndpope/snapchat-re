package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ackb */
public final class ackb extends cce {
    public static void a(ccc ccc) {
        ccc.c(1);
    }

    public static void a(ccc ccc, int i) {
        ccc.c(0, i);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public final int b() {
        int a = a(4);
        return a != 0 ? d(a) : 0;
    }

    public final acjz f(int i) {
        acjz acjz = new acjz();
        int a = a(4);
        if (a == 0) {
            return null;
        }
        i = b(e(a) + (i << 2));
        ByteBuffer byteBuffer = this.b;
        acjz.a = i;
        acjz.b = byteBuffer;
        return acjz;
    }
}
