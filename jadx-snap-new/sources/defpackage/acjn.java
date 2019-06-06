package defpackage;

/* renamed from: acjn */
public final class acjn extends cce {
    public static void a(ccc ccc) {
        ccc.c(4);
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

    public static void d(ccc ccc, int i) {
        ccc.c(3, i);
    }

    public final int b() {
        int a = a(4);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final int c() {
        int a = a(6);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final String d() {
        int a = a(8);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String e() {
        int a = a(10);
        return a != 0 ? c(a + this.a) : null;
    }
}
