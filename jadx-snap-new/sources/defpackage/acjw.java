package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acjw */
public final class acjw extends cce {
    public static acjw a(ByteBuffer byteBuffer) {
        acjw acjw = new acjw();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        acjw.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        acjw.b = byteBuffer;
        return acjw;
    }

    public static void a(ccc ccc) {
        ccc.c(5);
    }

    public static void a(ccc ccc, double d) {
        ccc.a(3, d);
    }

    public static void a(ccc ccc, int i) {
        ccc.c(0, i);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public static void b(ccc ccc, double d) {
        ccc.a(4, d);
    }

    public static void b(ccc ccc, int i) {
        ccc.c(1, i);
    }

    public static void c(ccc ccc, int i) {
        ccc.c(2, i);
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

    public final double e() {
        int a = a(10);
        return a != 0 ? this.b.getDouble(a + this.a) : 0.0d;
    }

    public final double f() {
        int a = a(12);
        return a != 0 ? this.b.getDouble(a + this.a) : 0.0d;
    }
}
