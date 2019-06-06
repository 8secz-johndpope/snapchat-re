package defpackage;

/* renamed from: aeon */
public final class aeon {
    public static adzp a(aeol aeol) {
        adzp adzp = new adzp();
        if (aeol.a != null) {
            adzp.a = aeol.a.intValue();
        }
        if (aeol.b != null) {
            adzp.b = aeol.b.intValue();
        }
        return adzp;
    }

    public static aeol a(adzp adzp) {
        aeol aeol = new aeol();
        aeol.a = Integer.valueOf(adzp.a);
        aeol.b = Integer.valueOf(adzp.b);
        return aeol;
    }
}
