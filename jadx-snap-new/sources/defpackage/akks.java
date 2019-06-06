package defpackage;

/* renamed from: akks */
final class akks {
    private static akkr a;
    private static long b;

    private akks() {
    }

    static akkr a() {
        synchronized (akks.class) {
            if (a != null) {
                akkr akkr = a;
                a = akkr.f;
                akkr.f = null;
                b -= 8192;
                return akkr;
            }
            return new akkr();
        }
    }

    static void a(akkr akkr) {
        if (akkr.f != null || akkr.g != null) {
            throw new IllegalArgumentException();
        } else if (!akkr.d) {
            synchronized (akks.class) {
                if (b + 8192 > 65536) {
                    return;
                }
                b += 8192;
                akkr.f = a;
                akkr.c = 0;
                akkr.b = 0;
                a = akkr;
            }
        }
    }
}
