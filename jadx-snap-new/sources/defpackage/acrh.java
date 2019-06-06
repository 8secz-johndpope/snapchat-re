package defpackage;

import android.location.Location;
import android.text.TextUtils;
import defpackage.nct.a;
import java.util.List;

/* renamed from: acrh */
public final class acrh {
    final nbo a;
    public final a b;
    public final nct c;
    final nce d;
    cgi e;
    boolean f = false;
    public a g;
    private final acqq h;

    /* renamed from: acrh$a */
    public interface a {

        /* renamed from: acrh$a$a */
        public interface a {
            void a(List<alhm> list);
        }

        a a(String str, acqq acqq);

        void a(cgi cgi, double d);

        boolean a();

        aclg b();

        boolean c();

        boolean d();

        void e();
    }

    /* renamed from: acrh$1 */
    public class 1 implements a {
        private /* synthetic */ double a;

        public 1(double d) {
            this.a = d;
        }

        public final void a() {
            if (!acrh.this.f) {
                cgi cgn;
                double d;
                float n = acrh.this.d.n();
                float o = acrh.this.d.o();
                acmj j = acrh.this.b.b().a.j();
                if (n == acrh.this.d.K() && o == acrh.this.d.L()) {
                    if (j != null) {
                        cgn = new cgn();
                        d = 0.0d;
                    }
                    acrh.this.f = true;
                }
                if (j != null) {
                    cgn = cgo.a((double) n, (double) o);
                    d = this.a;
                }
                acrh.this.f = true;
                j.a(cgn, d);
                acrh.this.f = true;
            }
        }

        public final void a(Location location) {
            alhq h = acrh.this.a.h();
            if (h != null) {
                cgi a = cgo.a((double) h.b, (double) h.c);
                acrh acrh = acrh.this;
                double d = this.a;
                if (!acrh.b.a()) {
                    acrh.b.a(a, d);
                    acrh.e = a;
                }
            }
        }
    }

    public acrh(nct nct, acqq acqq, nbo nbo, a aVar, nce nce) {
        this.c = nct;
        this.h = acqq;
        this.a = nbo;
        this.b = aVar;
        this.d = nce;
    }

    public final void a() {
        this.b.e();
    }

    public final void a(aarb aarb) {
        if (!this.b.c()) {
            String str = this.h.c;
            if (TextUtils.isEmpty(str)) {
                acvm b = this.h.b();
                if (b != null) {
                    str = b.a;
                }
            }
            this.b.a(str, this.h).a(this.a.i());
            aclo aclo = this.b.b().f;
            aclo.t.a(this.a.i());
            aclo.i();
            if (!(this.h.c != null || str == null || this.b.b().h.a() || this.b.d() || this.b.c())) {
                this.h.a(str, -1.0f, aarb, false);
            }
        }
    }
}
