package defpackage;

/* renamed from: adbh */
public final class adbh {
    private acmk a;
    private final akbk<acmk> b;

    public adbh(akbk<? extends acmk> akbk) {
        akcr.b(akbk, "creator");
        this.b = akbk;
    }

    public final synchronized acmk a() {
        acmk acmk;
        if (!b()) {
            this.a = (acmk) this.b.invoke();
        }
        acmk = this.a;
        if (acmk == null) {
            akcr.a("delegate");
        }
        return acmk;
    }

    public final boolean b() {
        return ((adbh) this).a != null;
    }
}
