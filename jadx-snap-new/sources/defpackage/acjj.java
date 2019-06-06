package defpackage;

import java.nio.ByteBuffer;

/* renamed from: acjj */
public final class acjj extends cce {
    public static void a(ccc ccc) {
        ccc.c(11);
    }

    public static void a(ccc ccc, int i) {
        ccc.c(0, i);
    }

    public static void a(ccc ccc, boolean z) {
        ccc.a(7, z);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public static void b(ccc ccc, int i) {
        ccc.c(1, i);
    }

    public static void b(ccc ccc, boolean z) {
        ccc.a(9, z);
    }

    public static void c(ccc ccc, int i) {
        ccc.c(2, i);
    }

    public static void d(ccc ccc, int i) {
        ccc.c(3, i);
    }

    public static void e(ccc ccc, int i) {
        ccc.b(4, i);
    }

    public static void f(ccc ccc, int i) {
        ccc.b(5, i);
    }

    public static void g(ccc ccc, int i) {
        ccc.c(6, i);
    }

    public static void h(ccc ccc, int i) {
        ccc.b(8, i);
    }

    public static void i(ccc ccc, int i) {
        ccc.c(10, i);
    }

    public final String b() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }

    /* Access modifiers changed, original: final */
    public final void b(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
    }

    public final String c() {
        int a = a(6);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String d() {
        int a = a(8);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String e() {
        int a = a(10);
        return a != 0 ? c(a + this.a) : null;
    }

    public final int f() {
        int a = a(12);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final int g() {
        int a = a(14);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final acjp h() {
        acjp acjp = new acjp();
        int a = a(16);
        if (a == 0) {
            return null;
        }
        a = b(a + this.a);
        ByteBuffer byteBuffer = this.b;
        acjp.a = a;
        acjp.b = byteBuffer;
        return acjp;
    }

    public final boolean i() {
        int a = a(18);
        return (a == 0 || this.b.get(a + this.a) == (byte) 0) ? false : true;
    }

    public final int j() {
        int a = a(20);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final boolean k() {
        int a = a(22);
        return (a == 0 || this.b.get(a + this.a) == (byte) 0) ? false : true;
    }

    public final String l() {
        int a = a(24);
        return a != 0 ? c(a + this.a) : null;
    }
}
