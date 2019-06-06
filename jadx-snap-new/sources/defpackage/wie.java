package defpackage;

/* renamed from: wie */
public final class wie implements gdd {
    private final whj a;
    private abkq b;

    public wie(whj whj) {
        this.a = whj;
    }

    public final <T extends aedh> T a(T t) {
        abkq abkq = this.b;
        if (!(abkq == null || abkq.b == null)) {
            String valueOf = String.valueOf((System.currentTimeMillis() / 60000) * 60000);
            t.C = valueOf;
            t.D = this.a.a(valueOf, this.b.g);
            t.E = this.b.b;
        }
        return t;
    }

    public final void a(abkq abkq) {
        this.a.a();
        this.b = abkq;
    }
}
