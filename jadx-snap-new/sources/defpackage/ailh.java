package defpackage;

/* renamed from: ailh */
public final class ailh {
    public static adsk a(ailf ailf) {
        adsk adsk = new adsk();
        if (ailf.a != null) {
            adsk.a = ailf.a.intValue();
        }
        if (ailf.b != null) {
            adsk.b = ailf.b;
        }
        if (ailf.c != null) {
            adsk.c = ailf.c.longValue();
        }
        if (ailf.d != null) {
            adsk.d = ailf.d;
        }
        return adsk;
    }

    public static ailf a(adsk adsk) {
        ailf ailf = new ailf();
        ailf.a = Integer.valueOf(adsk.a);
        if (!adsk.b.isEmpty()) {
            ailf.b = adsk.b;
        }
        ailf.c = Long.valueOf(adsk.c);
        if (!adsk.d.isEmpty()) {
            ailf.d = adsk.d;
        }
        return ailf;
    }
}
