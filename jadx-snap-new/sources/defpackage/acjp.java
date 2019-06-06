package defpackage;

/* renamed from: acjp */
public final class acjp extends cce {
    public static void a(ccc ccc) {
        ccc.c(4);
    }

    public static void a(ccc ccc, int i) {
        ccc.c(0, i);
    }

    public static void a(ccc ccc, long j) {
        ccc.a(1, j);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public static void b(ccc ccc, int i) {
        ccc.c(2, i);
    }

    public static void c(ccc ccc, int i) {
        ccc.c(3, i);
    }

    public final String b() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }

    public final long c() {
        int a = a(6);
        return a != 0 ? this.b.getLong(a + this.a) : 0;
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
