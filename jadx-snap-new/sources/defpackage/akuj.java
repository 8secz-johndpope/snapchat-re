package defpackage;

import java.util.Locale;

/* renamed from: akuj */
public final class akuj {
    public final akum a;
    final akul b;
    public final Locale c;
    private final akrr d;

    public akuj(akum akum, akul akul) {
        this.a = akum;
        this.b = akul;
        this.c = null;
        this.d = null;
    }

    private akuj(akum akum, akul akul, Locale locale, akrr akrr) {
        this.a = akum;
        this.b = akul;
        this.c = locale;
        this.d = akrr;
    }

    public final akuj a(akrr akrr) {
        return akrr == this.d ? this : new akuj(this.a, this.b, this.c, akrr);
    }
}
