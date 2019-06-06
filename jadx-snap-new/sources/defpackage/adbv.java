package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import defpackage.acmx.a;

/* renamed from: adbv */
public final class adbv {
    public final acmp a;
    public final DisplayMetrics b;
    public final adbh c;
    public final aclb d = new aclb();
    public final ajwl<aclm> e = new ajwl();
    private final aczu f;
    private final String g;
    private final String h;
    private final zfw i;
    private final adbx j = new adbx();
    private final aczt k;
    private final abss l;
    private final ncq m;
    private ajei n;
    private String o;
    private boolean p;
    private acmi q;
    private ajej r;

    /* renamed from: adbv$b */
    public interface b {
        void a(cgi cgi);
    }

    /* renamed from: adbv$c */
    public interface c {
        void a_(cgi cgi);
    }

    /* renamed from: adbv$a */
    public static class a<T> implements ajwy<T> {
        private final T a;

        public a(T t) {
            this.a = t;
        }

        public final T get() {
            return this.a;
        }
    }

    public adbv(Context context, acmf acmf, ide ide, aczt aczt, aczu aczu, a aVar, ncn ncn, acmm acmm, String str, abss abss, ncq ncq) {
        this.k = aczt;
        ide ide2 = ide;
        this.i = zgb.a(ide.callsite("MapViewHost"));
        this.f = aczu;
        this.g = str;
        this.h = "MapViewHost_".concat(String.valueOf(str));
        acmm acmm2 = acmm;
        this.a = acmf.b().a(acmm2);
        this.b = context.getResources().getDisplayMetrics();
        this.c = new adbh(new -$$Lambda$adbv$GeIZOP3KCINRWivZKjTvKUJHoWA(this, acmf, acmm2, aVar, ncn));
        this.l = abss;
        this.m = ncq;
    }

    private /* synthetic */ acmk a(acmf acmf, acmm acmm, a aVar, ncn ncn) {
        return acmf.a(this.h, acmm, this.j, this.d, aVar, ncn);
    }

    /* JADX WARNING: Missing block: B:16:0x0054, code skipped:
            if (r4.c.a().g() == false) goto L_0x006e;
     */
    private void a(defpackage.acmr r5) {
        /*
        r4 = this;
        r0 = r5 instanceof defpackage.acmo;
        if (r0 == 0) goto L_0x0046;
    L_0x0004:
        r5 = r4.c;
        r5 = r5.a();
        r5 = r5.b();
        if (r5 != 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        r5 = new ackp;
        r0 = new java.lang.ref.WeakReference;
        r0.<init>(r4);
        r5.<init>(r0);
        r0 = r4.n;
        if (r0 == 0) goto L_0x0040;
    L_0x001f:
        r1 = r4.k();
        r2 = r4.i;
        r3 = "qualifiedSchedulers";
        defpackage.akcr.b(r2, r3);
        r3 = "compositeDisposable";
        defpackage.akcr.b(r0, r3);
        r3 = "runnable";
        defpackage.akcr.b(r5, r3);
        if (r1 == 0) goto L_0x0040;
    L_0x0036:
        r3 = new adcr$b;
        r3.<init>(r1, r2, r0, r5);
        r3 = (defpackage.akbk) r3;
        defpackage.adcr.a(r1, r2, r0, r3);
    L_0x0040:
        r5 = defpackage.aclm.DOWNLOADING;
    L_0x0042:
        r4.a(r5);
        return;
    L_0x0046:
        r0 = r5 instanceof defpackage.acmn;
        if (r0 == 0) goto L_0x0057;
    L_0x004a:
        r5 = r4.c;
        r5 = r5.a();
        r5 = r5.g();
        if (r5 != 0) goto L_0x0073;
    L_0x0056:
        goto L_0x006e;
    L_0x0057:
        r0 = r5 instanceof defpackage.acms;
        if (r0 == 0) goto L_0x0073;
    L_0x005b:
        r5 = (defpackage.acms) r5;
        r0 = r4.c;
        r0 = r0.a();
        r1 = r4.i;
        r5 = r0.a(r1, r5);
        if (r5 == 0) goto L_0x006e;
    L_0x006b:
        r5 = defpackage.aclm.DONE;
        goto L_0x0042;
    L_0x006e:
        r5 = defpackage.aclm.ERROR;
        r4.a(r5);
    L_0x0073:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbv.a(acmr):void");
    }

    private String r() {
        if (this.o == null) {
            this.o = String.valueOf(hashCode());
        }
        return this.o;
    }

    private ajdp<acmr> s() {
        return this.a.a();
    }

    public final double a(double d) {
        acmj j = j();
        if (j == null) {
            return 0.0d;
        }
        d = j.b(d);
        double d2 = (double) this.b.density;
        Double.isNaN(d2);
        return d / d2;
    }

    public final float a() {
        return this.b.density;
    }

    public final acmu a(View view) {
        return this.c.a().a(view);
    }

    public final void a(aclm aclm) {
        this.e.a((Object) aclm);
    }

    public final void a(acmi acmi) {
        acmj j = j();
        if (j != null) {
            j.a(acmi.a, acmi.b);
            return;
        }
        acmu o = o();
        if (o != null) {
            o.a(acmi.a, acmi.b);
        } else {
            this.q = acmi;
        }
    }

    public final void a(acmu acmu, Bundle bundle, acmg acmg) {
        new StringBuilder("MapView onViewCreated ").append(acmu);
        this.p = false;
        this.n = new ajei();
        this.c.a().a(acmu, this.g, bundle, this.m, acmg);
        acmi acmi = this.q;
        if (acmi != null) {
            acmu.a(acmi.a, this.q.b);
            this.q = null;
        }
        if (this.r == null) {
            this.r = s().a((ajdw) this.i.l()).f(new -$$Lambda$adbv$3OWnpGV7UzSxVgwTBHFO2h6ozOw(this));
        }
        this.a.a(new a(this.f), new a(this.k), r());
    }

    public final void a(adbn adbn) {
        this.j.a(adbn);
    }

    public final void a(b bVar) {
        this.j.a = bVar;
    }

    public final void a(c cVar) {
        this.j.b = cVar;
    }

    public final void a(adbw adbw) {
        this.j.a(adbw);
    }

    public final void a(adct adct) {
        this.c.a().a(adct);
    }

    public final void a(Runnable runnable) {
        ajei ajei = this.n;
        if (ajei != null) {
            adcr.a(k(), this.i, ajei, runnable);
        }
    }

    public final DisplayMetrics b() {
        return this.b;
    }

    public final void b(adbn adbn) {
        this.j.b(adbn);
    }

    public final void b(View view) {
        if (view != null) {
            a(a(view), null, null);
        }
    }

    public final float c() {
        return this.b.xdpi;
    }

    public final float d() {
        return this.b.ydpi;
    }

    public final boolean e() {
        return this.c.b() && this.c.a().a();
    }

    public final ajdx<acmj> f() {
        return new adbo(this, this.l);
    }

    public final void g() {
        this.c.a().h();
    }

    public final void h() {
        this.c.a().i();
    }

    public final Context i() {
        acmu e = this.c.a().e();
        return e != null ? e.a().getContext() : null;
    }

    public final acmj j() {
        return this.c.a().d();
    }

    public final synchronized ViewGroup k() {
        acmu e = this.c.a().e();
        if (e == null) {
            return null;
        }
        return e.a();
    }

    public final void l() {
        if (!this.p) {
            this.p = true;
            ajej ajej = this.r;
            if (ajej != null) {
                ajej.dispose();
                this.r = null;
            }
            this.c.a().j();
            ajei ajei = this.n;
            if (ajei != null) {
                ajei.dispose();
            }
        }
    }

    public final void m() {
        acmu e = this.c.a().e();
        if (e != null) {
            e.b();
        }
    }

    public final aclb n() {
        return this.d;
    }

    public final acmu o() {
        return this.c.a().e();
    }

    public final acmt p() {
        return this.c.a().c();
    }

    public final void q() {
        this.c.a();
    }
}
