package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: acqv */
public final class acqv extends adbn {
    private final WeakReference<acqq> a;
    private final String b;
    private final aarb c = null;

    public acqv(acqq acqq, String str) {
        super(0);
        this.a = new WeakReference(acqq);
        this.b = str;
    }

    public final void a(acmj acmj) {
        acqq acqq = (acqq) this.a.get();
        if (acqq != null && this.b.equals(acqq.d) && acqq.b(this.b, null)) {
            acqq.d = null;
        }
    }
}
