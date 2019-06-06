package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.collect.Lists;
import com.samsung.android.sdk.camera.SCamera;
import com.snap.identity.AuthHttpInterface;
import defpackage.ira.b;
import defpackage.ire.a;
import defpackage.ire.c;
import defpackage.ire.d;
import defpackage.ire.e;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;

/* renamed from: iqj */
public final class iqj {
    private ajwm a;
    private ajcx b;
    private final zfw c = zgb.a(iqk.a, "AuthApi");
    private final aipn<abna> d;
    private final aipn<gpb> e;
    private final aipn<AuthHttpInterface> f;
    private final aipn<whk> g;
    private final aipn<jhv> h;
    private final aipn<iib> i;
    private final aipn<whj> j;
    private final aipn<hyq> k;
    private final aipn<hyz> l;
    private final aipn<hyj> m;
    private final aipn<gdh> n;
    private final aipn<Set<irh>> o;
    private final aipn<Set<irf>> p;
    private final aipn<ird> q;
    private final aipn<iru> r;
    private final aipn<Context> s;
    private final ajwy<gqr> t;
    private final aipn<ire> u;
    private final ihh v;

    /* renamed from: iqj$a */
    public static class a {
        String a;
        String b;
        String c;
        boolean d;

        /* renamed from: iqj$a$a */
        public static class a {
            public String a;
            public String b;
            private String c;
            private boolean d;

            public final a a(String str) {
                this.a = str;
                return this;
            }

            public final a a(boolean z) {
                this.d = z;
                return this;
            }

            public final a a() {
                a aVar = new a();
                aVar.a = this.a;
                aVar.b = this.b;
                aVar.c = this.c;
                aVar.d = this.d;
                return aVar;
            }

            public final a b(String str) {
                this.b = str;
                return this;
            }

            public final a c(String str) {
                this.c = str;
                return this;
            }
        }

        public static a a() {
            return new a();
        }
    }

    public iqj(aipn<gpb> aipn, aipn<abna> aipn2, aipn<AuthHttpInterface> aipn3, aipn<whk> aipn4, aipn<whj> aipn5, aipn<jhv> aipn6, aipn<iib> aipn7, aipn<hyq> aipn8, aipn<hyz> aipn9, aipn<hyj> aipn10, aipn<gdh> aipn11, aipn<Set<irh>> aipn12, aipn<Set<irf>> aipn13, aipn<ird> aipn14, aipn<iru> aipn15, aipn<Context> aipn16, ajwy<gqr> ajwy, aipn<ire> aipn17, ihh ihh) {
        this.d = aipn2;
        this.e = aipn;
        this.f = aipn3;
        this.g = aipn4;
        this.h = aipn6;
        this.i = aipn7;
        this.j = aipn5;
        this.k = aipn8;
        this.l = aipn9;
        this.m = aipn10;
        this.n = aipn11;
        this.o = aipn12;
        this.p = aipn13;
        this.q = aipn14;
        this.r = aipn15;
        this.s = aipn16;
        this.t = ajwy;
        this.u = aipn17;
        this.v = ihh;
    }

    private aerr a(a aVar) {
        aedh afvp = new afvp();
        afvp.E = aVar.a;
        afvp.d = aVar.b;
        if (akly.d(aVar.c)) {
            afvp.A = aVar.c;
            afvp.d = afvp.A;
        }
        afvp.m = "com.snap.framework";
        ieh ieh = new ieh();
        afvp.z = ieh.a();
        ((whj) this.j.get()).a(afvp);
        Pair a = ((abna) this.d.get()).a(afvp.E, afvp.C, afvp.D);
        if (a != null) {
            afvp.a = (String) a.first;
            afvp.b = (String) a.second;
        } else {
            afvp.h = SCamera.CAMERA_ID_FRONT;
        }
        return afvp;
    }

    private ajdx<aerr> a(aerr aerr) {
        return ((iib) this.i.get()).b().f(new -$$Lambda$iqj$qSZ5jW6ur7MosO-SVbYPXvaSyUg(aerr));
    }

    private ajdx<aerr> a(aerr aerr, a aVar) {
        return ajdx.c(new -$$Lambda$iqj$81AjYcN7V9E9lltDWYpagfM2HbU(this, aVar)).a(new -$$Lambda$iqj$mh7bSitTjOL7oCfzaLWcyKcSxck(this, aVar, aerr.C)).a((ajdw) this.c.b()).f(new -$$Lambda$iqj$StLwn3hMr21kUNH2QEj12AR0_9E(aerr));
    }

    private static Long a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.valueOf(new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime());
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    private void a(Throwable th) {
    }

    public static boolean a(gpa gpa) {
        return (gpa.a.a == null || gpa.b) ? false : true;
    }

    private ajdx<aerr> b(aerr aerr) {
        return ajdx.c(new -$$Lambda$iqj$yFoqpj21LCzK4j50BDs8Ax5bvRA(this)).f(new -$$Lambda$iqj$tdrOZi9ncrHKiGW3Th51fs8ZEsU(this, aerr));
    }

    private ajdx<b<aert>> b(b<aert> bVar) {
        aert aert = (aert) bVar.b;
        ((hyq) this.k.get()).a(aert.J, aert.M, "login");
        return ajdx.b((Object) bVar);
    }

    private /* synthetic */ ajeb b(a aVar, aerr aerr) {
        return a(aerr, aVar);
    }

    private /* synthetic */ ajeb c(a aVar, aerr aerr) {
        aerr.u = Boolean.valueOf(aVar.d);
        return ajdx.b((Object) aerr);
    }

    private synchronized void d() {
        if (this.a != null) {
            this.a.a();
        }
    }

    private /* synthetic */ aerr e(a aVar) {
        return a(aVar);
    }

    private /* synthetic */ void e() {
        synchronized (this) {
            this.b = null;
        }
    }

    private /* synthetic */ ick f() {
        return ((hyz) this.l.get()).a("login");
    }

    public final synchronized ajcx a() {
        if (this.b != null) {
            return this.b;
        }
        d();
        this.a = null;
        ajcx b = b().e(new -$$Lambda$iqj$UiyGWurjozy2gyZ7arTLprgNl5I(this)).a(-$$Lambda$iqj$wblgoKArLioSCDyhh5QFtDkGa_o.INSTANCE).a(ajfu.g).b((ajdw) this.c.g());
        ire ire = (ire) this.u.get();
        ajdb b2 = ajcx.a((Runnable) new a(ire)).b((ajdb) ajcx.a((Runnable) new ire.b(ire)).b((ajdw) ire.a.f())).b((ajdb) ajcx.a((Runnable) new c(ire)).b((ajdw) ire.a.f())).b((ajdb) ((iry) ire.b.get()).a()).b((ajdb) ajcx.a((Runnable) new d(ire))).b((ajdb) ajcx.a((Runnable) new e(ire)));
        akcr.a((Object) b2, "Completable.fromRunnable….get().setUsername(\"\") })");
        this.b = b.b(b2).a((ajdw) this.c.l()).d(new -$$Lambda$iqj$teKjQ5ywDzsjeepiGW0HX-wfhJc(this)).d();
        return this.b;
    }

    public final ajdx<b<aert>> a(akxa<aert> akxa) {
        if (akxa.c()) {
            return ajdx.b(akxa.b);
        }
        aert aert = (aert) akxa.a.b;
        if (aert == null) {
            StringBuilder stringBuilder = new StringBuilder("No response body - code: ");
            stringBuilder.append(akxa.a.a.c);
            return ajdx.b(new Exception(stringBuilder.toString()));
        } else if (aert.q != null) {
            return ajdx.b(new irg(aert.r, aert));
        } else {
            Object obj = (aert.c == null || aert.c.r == null) ? null : 1;
            boolean equals = Boolean.TRUE.equals(aert.v);
            boolean equals2 = Boolean.TRUE.equals(aert.P);
            if (obj == null && !equals && !equals2) {
                return ajdx.b(new irg(aert.r, aert));
            }
            return ajdx.b(new b(akxa.a.a.c, aert, new akrk(akxa.a.a.k), new akrk(akxa.a.a.l)));
        }
    }

    public final ajdx<iql> a(a aVar, isf isf) {
        return ajdx.c(new -$$Lambda$iqj$cxHU8X01MYH-tGtrWOydXApLlHg(this, aVar)).b((ajdw) this.c.b()).a(new -$$Lambda$iqj$BRbM_9ll919IAtGrJ7mxNbfp5v0(this, aVar)).a(new -$$Lambda$iqj$qjpcP0jYY1Jwl_2-gQciAewHhfI(this, isf, aVar)).a(new -$$Lambda$iqj$HsW76GIpI7Kk3c_TORrgwsnmWYQ(this, isf)).a(new -$$Lambda$iqj$L-ZGuQdrl3Lb5JWtiyHHRXYaE24(this)).a((ajdw) this.c.g()).a(new -$$Lambda$iqj$98giJMHzXkQt0hhepQgPtV8fJPo(this, aVar, isf)).a(new -$$Lambda$iqj$lOzBNJI3pRpoFJP6ySv2AI6pIH0(this, isf)).d(new -$$Lambda$iqj$owxXoKu_r0IScIBXao7RsLhPgJA(this)).a(new -$$Lambda$iqj$GBntcm2iJ7Sj3EhYp_yFBPmlmcU(this)).a((ajdw) this.c.h()).a(new -$$Lambda$5I6zQQuikln44-H1CCYwC6YD1iY(this)).h(-$$Lambda$ftP-mOWP0SGnmdjJ1CiBNtydIfk.INSTANCE);
    }

    public final ajdx<iql> a(b<aert> bVar) {
        aert aert = (aert) bVar.b;
        if (Boolean.TRUE.equals(aert.v)) {
            return ajdx.b(new iql(2, aert, Long.valueOf(bVar.a())));
        }
        if (Boolean.TRUE.equals(aert.P)) {
            return ajdx.b(new iql(3, aert, Long.valueOf(bVar.a())));
        }
        afeq afeq = aert.c;
        if (afeq.r == null) {
            return ajdx.b(new Exception("Empty username"));
        }
        long size = afeq.a != null ? (long) afeq.a.size() : 0;
        ajcx b = ((gpb) this.e.get()).d().e(-$$Lambda$iqj$lru-TgLVLeofzbGxlqIfoKSPOnY.INSTANCE).b(ajcx.b(Lists.transform(Lists.newArrayList((Iterable) this.p.get()), new -$$Lambda$iqj$NgeqnJQ4FLwziq34c9mgOmSrnEs(afeq))));
        gpb gpb = (gpb) this.e.get();
        abkq abkq = r6;
        aert aert2 = aert;
        abkq abkq2 = new abkq(afeq.s, afeq.r, afeq.bE, afeq.z, afeq.A, afeq.t, afeq.w, iqj.a(afeq.L), afeq.y, size, Long.valueOf(this.v.a()), afeq.ca, afeq.bJ, afeq.cg, afeq.co, afeq.ch);
        ajcx b2 = b.b(gpb.a(abkq));
        aert aert3 = aert2;
        return b2.b(ajcx.a(new -$$Lambda$iqj$14s91MtLMIRnWJC77HFhm8c6aSE(this, aert3))).b(ajcx.b(Lists.transform(Lists.newArrayList((Iterable) this.o.get()), new -$$Lambda$iqj$2QwVLSsDLs4S4iAh2srLBV2UZL4(bVar)))).b(ajcx.a(new -$$Lambda$iqj$OipoqZrkw9ooC0p6_9p8t8ondGY(this, afeq))).b(((gpb) this.e.get()).a(aert3.D != null)).a(aert3.D != null ? new iql(4, aert3, Long.valueOf(bVar.a())) : new iql(1, aert3, Long.valueOf(bVar.a()))).c(new -$$Lambda$iqj$T2p2sv6AFnoXmprlQJT8oMsALzg(this, aert3)).h(new -$$Lambda$iqj$PDL6I2le0Yxl9GH4EQH5OZWbKBU(this));
    }

    public final ajdx<iql> a(String str, String str2, String str3, String str4) {
        a aVar = new a();
        aVar.a = str2;
        aVar.b = str3;
        a a = aVar.a();
        return ajdx.c(new -$$Lambda$iqj$JA9sX94UULgZ70YUlhuYQsdvlKc(this, a)).b((ajdw) this.c.b()).f(new -$$Lambda$iqj$O3qrFgEzdG-Z3u4sE7F8CgF5WA0(str, str4)).a(new -$$Lambda$iqj$7vxqE4yJ9AkSp3vco7FL1aKnghA(this, a)).a(new -$$Lambda$iqj$PXnbK8bPlGtVrMu6ytnhYJ_Ufu0(this)).a(new -$$Lambda$iqj$L-ZGuQdrl3Lb5JWtiyHHRXYaE24(this)).a((ajdw) this.c.g()).a(new -$$Lambda$iqj$QclxFHOb8tXj6knxFiQ13MspdMY(this)).a(new -$$Lambda$tqN1ZD0l7wi0vXaV2d4E-b2Nf50(this)).a(new -$$Lambda$iqj$GBntcm2iJ7Sj3EhYp_yFBPmlmcU(this)).a((ajdw) this.c.h()).a(new -$$Lambda$5I6zQQuikln44-H1CCYwC6YD1iY(this));
    }

    public final ajdx<iql> a(String str, String str2, String str3, String str4, boolean z) {
        a aVar = new a();
        aVar.a = str;
        aVar.b = str2;
        a a = aVar.a();
        return ajdx.c(new -$$Lambda$iqj$K9KaVU8den45KOvSiE2YFdjKeEM(this, a)).b((ajdw) this.c.b()).f(new -$$Lambda$iqj$AKMemlGowA2rIO-RgFCw737LQs8(str4, str3, z)).a(new -$$Lambda$iqj$vFIpiCtNX8fPtQUZPCS4KJece8E(this, a)).a(new -$$Lambda$iqj$PXnbK8bPlGtVrMu6ytnhYJ_Ufu0(this)).a(new -$$Lambda$iqj$L-ZGuQdrl3Lb5JWtiyHHRXYaE24(this)).a((ajdw) this.c.g()).a(new -$$Lambda$iqj$4vpkErtkmaFhFXPthpw2pCzULDU(this)).a(new -$$Lambda$tqN1ZD0l7wi0vXaV2d4E-b2Nf50(this)).a(new -$$Lambda$iqj$GBntcm2iJ7Sj3EhYp_yFBPmlmcU(this)).a((ajdw) this.c.h()).a(new -$$Lambda$5I6zQQuikln44-H1CCYwC6YD1iY(this));
    }

    public final synchronized ajdj<abkq> b() {
        gpa e = ((gpb) this.e.get()).e();
        if (iqj.a(e)) {
            return ajdj.b(e.a);
        }
        return ajdj.b(new Exception("Not logged in"));
    }

    public final synchronized ajcx c() {
        if (this.a == null) {
            this.a = new ajwm();
        }
        return this.a;
    }
}
