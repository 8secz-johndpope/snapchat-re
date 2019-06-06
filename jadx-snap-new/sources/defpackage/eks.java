package defpackage;

import android.app.Activity;
import com.google.common.base.Predicate;
import defpackage.ekm.c;
import defpackage.ekn.a;
import defpackage.ekn.b;

/* renamed from: eks */
public final class eks implements a {
    public b a;
    public ajdp<dva> b;
    public zgb c;
    public ajdp<dpw> d;
    public dni e;
    public Activity f;
    public dnr g;
    public ajdp<ebk> h;
    public dno i;
    public ajwy<fxi> j;
    public ajdp<Boolean> k;
    public ajdp<ekm> l;
    public ajws<dps> m;
    private Boolean n = null;
    private ajei o;
    private zfw p;
    private Predicate<Void> q;
    private boolean r = true;
    private boolean s = true;

    private static /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        boolean z = (bool.booleanValue() || bool2.booleanValue()) ? false : true;
        return Boolean.valueOf(z);
    }

    private void a() {
        this.a.d();
        this.r = false;
    }

    private void a(Runnable runnable) {
        Boolean bool = this.n;
        if (bool == null || bool.booleanValue()) {
            runnable.run();
        }
    }

    private void b() {
        this.a.e();
        this.r = true;
    }

    private void c() {
        dni.a f = this.e.f();
        if (f == dni.a.LEFT) {
            this.a.i();
            this.o.a(this.a.m().b((ajdw) this.p.l()).f(new -$$Lambda$eks$C8JrQ346OCgh49wTLNUd6UW-wzI(this)));
            return;
        }
        if (f == dni.a.DISMISS) {
            this.a.k();
            this.o.a(this.a.n().b((ajdw) this.p.l()).f(new -$$Lambda$eks$3aw3pEvb_1F19fKPLXshUTaHxeY(this)));
        }
    }

    private void d() {
        a(new -$$Lambda$eks$T5BTuN2d07CFpjfyiTC5hmsugDo(this));
    }

    private void e() {
        -$$Lambda$eks$sm8PBzBxZZTmlqcTnINJXwiklgg -__lambda_eks_sm8pbzbxzztmlqctninjxwiklgg = new -$$Lambda$eks$sm8PBzBxZZTmlqcTnINJXwiklgg(this);
        Boolean bool = this.n;
        if (bool == null || !bool.booleanValue()) {
            -__lambda_eks_sm8pbzbxzztmlqctninjxwiklgg.run();
        }
        if (!this.r) {
            b();
        }
    }

    private void f() {
        this.n = null;
        Predicate predicate = this.q;
        if (predicate != null) {
            this.g.a(predicate);
            this.q = null;
        }
    }

    private void g() {
        dni.a f = this.e.f();
        if (f == dni.a.LEFT) {
            this.a.j();
            return;
        }
        if (f == dni.a.DISMISS) {
            this.a.l();
        }
    }

    private /* synthetic */ void h() {
        this.n = Boolean.TRUE;
        this.a.c();
        this.a.a();
        if (this.s) {
            this.a.g();
        } else {
            this.a.h();
        }
        c();
    }

    private /* synthetic */ void i() {
        this.n = Boolean.FALSE;
        this.a.b();
    }

    private /* synthetic */ ajej j() {
        return this.i.start();
    }

    public final ajej start() {
        this.a.a(this);
        this.q = new -$$Lambda$eks$q4v6o3f7uYCbp7LhdmQToDjMTAw(this);
        String str = "HovaNavPresenter";
        this.g.a(this.q, str);
        this.p = zgb.a(dnh.f.callsite(str));
        this.o = new ajei();
        this.o.a(ajek.a(new -$$Lambda$eks$BzzR7fVh73dGhaw70NsLpQhB-GI(this)));
        this.o.a(ajdp.a(this.d.a((ajdw) this.p.l()).p(-$$Lambda$eks$zC11UOgJgpivlY5zOIc44aH9zEE.INSTANCE).h(Boolean.FALSE), this.k, -$$Lambda$eks$nq04n4hYyL1qremWXtCuDqHNoZs.INSTANCE).a((ajdw) this.p.l()).f(new -$$Lambda$eks$44fE4gYWBtMzhlJbSou9gcXF4rY(this)));
        if (((fxi) this.j.get()).b) {
            this.o.a(this.d.a((ajdw) this.p.l()).p(-$$Lambda$eks$dtBo8ZcR0thcMsP-VvogXc7Vxh8.INSTANCE).h(Boolean.FALSE).f(new -$$Lambda$eks$jhXSNi-i_8PPMhzP9N66fD1S7qs(this)));
        }
        this.o.a(ajdp.a(this.h, this.l.a(-$$Lambda$eks$bbUPxGx2syQgEI78XwZbbJvYwN0.INSTANCE).h(new c(ekm.a.a.a)), -$$Lambda$RbDGj_H0ukIkSgqUsOOB47_xKXc.INSTANCE).f(new -$$Lambda$eks$AH47bM1jlsO3mRGm8o5Jowbna1A(this)));
        this.o.a(this.l.a((ajdw) this.p.l()).f(new -$$Lambda$eks$HMIMpjRoTxcAseQPJV4PdLIMEHw(this)));
        this.o.a(this.b.a(-$$Lambda$eks$F2hFW80K2OJK5M7PXEhDSjBYN_E.INSTANCE).f(new -$$Lambda$eks$5KiMzgPHYIHkaN5ZvM948XI8wsw(this)));
        ajei ajei = this.o;
        ajdp o = this.a.o();
        ajws ajws = this.m;
        ajws.getClass();
        ajei.a(o.f(new -$$Lambda$kcpGbb2GQIk6C1y4J7mQhFoq4zI(ajws)));
        this.o.a((ajej) fsv.a("hovanav:subs:start", new -$$Lambda$eks$KWFfxjeGOLXGWkiWCmz0YjN0Izg(this)));
        c();
        return this.o;
    }
}
