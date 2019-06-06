package defpackage;

/* renamed from: sir */
public final class sir {
    private boolean a;
    private final akbk<Object> b;

    public sir(akbk<? extends Object> akbk) {
        akcr.b(akbk, "bindFunction");
        this.b = akbk;
    }

    public final synchronized void a() {
        if (!this.a) {
            this.b.invoke();
            this.a = true;
        }
    }
}
