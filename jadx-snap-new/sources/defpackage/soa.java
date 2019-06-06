package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: soa */
public class soa extends slm {
    private final tbq a;
    private tbr b;
    private boolean c;
    private final tbp d = new 1();

    /* renamed from: soa$1 */
    class 1 implements tbp {
        1() {
        }

        public final void a() {
            soa.this.z().k();
        }

        public final void a(tbw tbw, String str, String str2, String str3) {
            soa.this.z().k();
        }

        public final void b() {
            soa.this.z().l();
        }

        public final void c() {
            soa.this.z().k();
        }

        public final void d() {
            soa.this.z().l();
        }

        public final void e() {
            soa.this.z().k();
        }

        public final void f() {
            soa.this.z().l();
        }

        public final void g() {
            soa.this.z().k();
        }

        public final void h() {
        }

        public final void i() {
        }
    }

    soa(Context context) {
        this.a = new tbq(context);
    }

    public final void B_() {
        this.b = null;
        super.B_();
    }

    public final void C_() {
        this.b.e();
    }

    public final boolean F() {
        return false;
    }

    public final void a(sit sit, sju sju) {
        super.a(sit, sju);
        sjd sjd = A().b;
        this.b = new tbr(sjd.d, sjd.b, sjd.e, this.a, sjd.y);
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        this.b.a((szw) sqh);
    }

    public final void a(szo szo) {
        this.b.e();
        if (!this.c) {
            this.c = this.b.a(true);
        }
        this.a.b.hide();
    }

    public final void a(szw szw) {
        tbr tbr = this.b;
        tbr.b = this.d;
        tbr.b();
    }

    public final void ae_() {
        tbr tbr = this.b;
        sqh sqh = this.H;
        tbr.a(sqh, (String) sqh.a(sqh.S), (sqf) sqh.a(sqh.u), false, sqh.a(sqh.ca, false));
    }

    public final void b() {
        super.b();
        this.b.f();
        this.c = false;
    }

    public final void b(Canvas canvas, int i) {
        this.b.a(canvas);
    }

    public final void b(szw szw) {
        if (szw != null) {
            szw.a(this.b.a());
        }
        this.b.c();
        this.b.b = null;
    }

    public final void c(szw szw) {
        this.b.b();
    }

    public final View e() {
        return this.a;
    }

    public final void e(szw szw) {
        this.b.a.i();
        if (this.c) {
            this.b.a(false);
        }
        this.a.b.show();
    }

    public final String f() {
        return "REMOTE_VIDEO";
    }

    public final boolean h() {
        return true;
    }
}
