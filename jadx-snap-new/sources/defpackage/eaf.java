package defpackage;

import com.google.common.base.Supplier;

/* renamed from: eaf */
final class eaf implements dql {
    private final eah a;
    private final Supplier<abms> b;
    private final ajws<dpy> c;

    eaf(eah eah, Supplier<abms> supplier, ajws<dpy> ajws) {
        this.a = eah;
        this.b = supplier;
        this.c = ajws;
    }

    public final void a(dqk dqk, idd idd) {
        eah eah = this.a;
        synchronized (eah.d) {
            eah.a(dqk, idd);
        }
        if (this.c != null) {
            this.c.a((Object) dpy.ON_GL_DID_INITIALIZE);
        }
    }

    public final void a(idd idd) {
        if (this.c != null) {
            this.c.a((Object) dpy.ON_GL_WILL_RELEASE);
        }
        ((abms) this.b.get()).k();
        this.a.a();
    }
}
