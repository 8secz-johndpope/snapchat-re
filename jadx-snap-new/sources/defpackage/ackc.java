package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ackc */
public final class ackc extends cce {
    public static void a(ccc ccc) {
        ccc.c(3);
    }

    public static void a(ccc ccc, int i) {
        ccc.b(0, i);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public static void b(ccc ccc, int i) {
        ccc.b(1, i);
    }

    public static void c(ccc ccc, int i) {
        ccc.c(2, i);
    }

    public final int b() {
        int a = a(4);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final int c() {
        int a = a(6);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final acjk d() {
        acjk acjk = new acjk();
        int a = a(8);
        if (a == 0) {
            return null;
        }
        a = b(a + this.a);
        ByteBuffer byteBuffer = this.b;
        acjk.a = a;
        acjk.b = byteBuffer;
        return acjk;
    }
}
