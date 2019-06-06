package defpackage;

import java.nio.ByteBuffer;

/* renamed from: acjo */
public final class acjo extends cce {
    public static void a(ccc ccc) {
        ccc.c(4);
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

    public final String c() {
        int a = a(6);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String d() {
        int a = a(8);
        return a != 0 ? c(a + this.a) : null;
    }

    public final ackb e() {
        ackb ackb = new ackb();
        int a = a(10);
        if (a == 0) {
            return null;
        }
        a = b(a + this.a);
        ByteBuffer byteBuffer = this.b;
        ackb.a = a;
        ackb.b = byteBuffer;
        return ackb;
    }
}
