package defpackage;

import android.os.Handler;
import defpackage.acbm.a;

/* renamed from: rpw */
public final class rpw {
    final abpx<a> a = new abpx();
    final ajej b;
    boolean c;
    boolean d;
    boolean e;
    private boolean f;
    private final Handler g;
    private final igf h;

    /* renamed from: rpw$a */
    public interface a {
        void a(boolean z);
    }

    /* renamed from: rpw$b */
    static final class b<T> implements ajfb<Boolean> {
        private /* synthetic */ rpw a;

        b(rpw rpw) {
            this.a = rpw;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            rpw rpw = this.a;
            akcr.a(obj, "it");
            rpw.a(obj.booleanValue());
        }
    }

    public rpw(ajdw ajdw, Handler handler, igf igf) {
        akcr.b(ajdw, "scheduler");
        akcr.b(handler, "handler");
        akcr.b(igf, "proximityService");
        this.g = handler;
        this.h = igf;
        Object f = ((ajdp) this.h.b.b()).a(ajdw).f((ajfb) new b(this));
        akcr.a(f, "proximityService.proximi…imityStatusChanged(it) })");
        this.b = f;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if ((!this.c || this.d) && this.d != this.f) {
            a d = acbm.d();
            new StringBuilder("Togging activation of proximity detection to: ").append(this.d);
            String str = "RoutingProximityService";
            d.a(str);
            if (this.d) {
                this.h.a(str);
                this.f = true;
                a(this.e);
            } else if (this.e) {
                acbm.d().a(str);
            } else {
                this.h.b(str);
                this.f = false;
                a(this.e);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (z != this.e) {
            acbm.d().a("RoutingProximityService");
            this.e = z;
            for (a a : this.a) {
                a.a(z);
            }
            a();
        }
    }
}
