package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qxn */
public final class qxn {
    public final AtomicReference<String> a = new AtomicReference();
    public final AtomicReference<Long> b = new AtomicReference();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final qxq d;
    public final aipn<dib> e;
    public final ihh f;

    public qxn(qxq qxq, aipn<dib> aipn, ihh ihh) {
        akcr.b(qxq, "friendsFeedSessionManager");
        akcr.b(aipn, "logger");
        akcr.b(ihh, "clock");
        this.d = qxq;
        this.e = aipn;
        this.f = ihh;
    }

    public final void a() {
        if (this.c.get()) {
            this.c.set(false);
            long a = this.f.a();
            Object obj = this.b.get();
            akcr.a(obj, "sessionStartTime.get()");
            a -= ((Number) obj).longValue();
            aakf aakf = new aakf();
            aakf.a(this.d.b());
            aakf.setSessionId((String) this.a.get());
            double d = (double) a;
            Double.isNaN(d);
            aakf.a(Double.valueOf(d / 1000.0d));
            ((dib) this.e.get()).a((aajt) aakf);
        }
    }
}
