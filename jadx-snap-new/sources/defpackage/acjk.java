package defpackage;

/* renamed from: acjk */
public final class acjk extends cce {
    public static void a(ccc ccc) {
        ccc.c(3);
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
}
