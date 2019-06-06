package com.snap.memories.lib.meo;

import com.google.common.base.Optional;
import com.looksery.sdk.listener.AnalyticsListener;
import defpackage.achb;
import defpackage.achi;
import defpackage.achk;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajei;
import defpackage.ajfc;
import defpackage.ajfe;
import defpackage.ajfu;
import defpackage.ajwl;
import defpackage.ajws;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akqq;
import defpackage.fth;
import defpackage.ftl;
import defpackage.oiy;
import defpackage.ojo;
import defpackage.olr;
import defpackage.owf;
import defpackage.owh;
import defpackage.pgp;
import defpackage.pgu;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkf;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

public final class MyEyesOnlyStateProvider implements achk<zjm, zjk>, defpackage.k {
    public final ajei a;
    public defpackage.j b;
    final ajwy<ftl> c;
    final ajwy<zgb> d;
    final ajwy<oiy> e;
    final ajwy<owf> f;
    final ajwy<owh> g;
    public final ajwy<achb<zjm, zjk>> h;
    public final ajwy<zkf> i;
    private final ajxe j = ajxh.a(new k(this));
    private final ajws<Boolean> k;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b<V> implements Callable<T> {
        private /* synthetic */ MyEyesOnlyStateProvider a;

        b(MyEyesOnlyStateProvider myEyesOnlyStateProvider) {
            this.a = myEyesOnlyStateProvider;
        }

        public final /* synthetic */ Object call() {
            return Optional.fromNullable(((owh) this.a.g.get()).e());
        }
    }

    static final class d<V> implements Callable<T> {
        private /* synthetic */ MyEyesOnlyStateProvider a;

        d(MyEyesOnlyStateProvider myEyesOnlyStateProvider) {
            this.a = myEyesOnlyStateProvider;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(((ftl) this.a.c.get()).a((fth) ojo.MY_EYES_ONLY_PASSPHRASE_ENABLED));
        }
    }

    static final class f<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ MyEyesOnlyStateProvider a;

        f(MyEyesOnlyStateProvider myEyesOnlyStateProvider) {
            this.a = myEyesOnlyStateProvider;
        }

        public final /* synthetic */ Object call() {
            return ((ftl) this.a.c.get()).p(ojo.MY_EYES_ONLY_PASSPHRASE_ENABLED).h(Boolean.valueOf(((ftl) this.a.c.get()).a((fth) ojo.MY_EYES_ONLY_PASSPHRASE_ENABLED)));
        }
    }

    static final class g<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ MyEyesOnlyStateProvider a;

        g(MyEyesOnlyStateProvider myEyesOnlyStateProvider) {
            this.a = myEyesOnlyStateProvider;
        }

        public final /* synthetic */ Object call() {
            return ((ftl) this.a.c.get()).p(ojo.MY_EYES_ONLY_ENABLED).h(Boolean.valueOf(((ftl) this.a.c.get()).a((fth) ojo.MY_EYES_ONLY_ENABLED)));
        }
    }

    static final class i<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ MyEyesOnlyStateProvider a;

        i(MyEyesOnlyStateProvider myEyesOnlyStateProvider) {
            this.a = myEyesOnlyStateProvider;
        }

        public final /* synthetic */ Object call() {
            owf owf = (owf) this.a.f.get();
            return owf.a().queryAndMapToOne("mem:entries-count", owf.b().h().b());
        }
    }

    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "confidential");
            return Boolean.valueOf(optional.isPresent());
        }
    }

    public static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ MyEyesOnlyStateProvider a;

        public e(MyEyesOnlyStateProvider myEyesOnlyStateProvider) {
            this.a = myEyesOnlyStateProvider;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Boolean bool = (Boolean) obj;
            akcr.b(bool, "isMyEyesOnlyEnabled");
            if (!bool.booleanValue()) {
                return ajdx.b(new pgp(bool.booleanValue(), false));
            }
            MyEyesOnlyStateProvider myEyesOnlyStateProvider = this.a;
            Object f = ajdx.c((Callable) new b(myEyesOnlyStateProvider)).b((ajdw) myEyesOnlyStateProvider.a().i()).f(c.a);
            akcr.a(f, "Single.fromCallable { Op…Present\n                }");
            return f.f(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    akcr.b(bool, "doesMyEyesOnlyConfidentialExist");
                    Object obj2 = bool;
                    akcr.a(obj2, "isMyEyesOnlyEnabled");
                    return new pgp(obj2.booleanValue(), bool.booleanValue());
                }
            });
        }
    }

    static final class h<T1, T2, T3, T4, R> implements ajfe<Boolean, Boolean, Boolean, Boolean, pgu> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
            return new pgu(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
        }
    }

    static final class j<T, R> implements ajfc<T, R> {
        public static final j a = new j();

        j() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, AnalyticsListener.ANALYTICS_COUNT_KEY);
            return Boolean.valueOf(l.longValue() <= 0);
        }
    }

    static final class k extends akcs implements akbk<zfw> {
        private /* synthetic */ MyEyesOnlyStateProvider a;

        k(MyEyesOnlyStateProvider myEyesOnlyStateProvider) {
            this.a = myEyesOnlyStateProvider;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.d.get();
            return zgb.a(((oiy) this.a.e.get()).callsite("MyEyesOnlyStateProvider"));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(MyEyesOnlyStateProvider.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public MyEyesOnlyStateProvider(ajwy<ftl> ajwy, ajwy<zgb> ajwy2, ajwy<oiy> ajwy3, ajwy<owf> ajwy4, ajwy<owh> ajwy5, ajwy<achb<zjm, zjk>> ajwy6, ajwy<zkf> ajwy7) {
        akcr.b(ajwy, "configProvider");
        akcr.b(ajwy2, "schedulersProvider");
        akcr.b(ajwy3, "attributedFeature");
        akcr.b(ajwy4, "entryRepository");
        akcr.b(ajwy5, "myEyesOnlyRepository");
        akcr.b(ajwy6, "navigationHost");
        akcr.b(ajwy7, "bus");
        this.c = ajwy;
        this.d = ajwy2;
        this.e = ajwy3;
        this.f = ajwy4;
        this.g = ajwy5;
        this.h = ajwy6;
        this.i = ajwy7;
        Object i = ajwl.i(Boolean.FALSE);
        akcr.a(i, "BehaviorSubject.createDefault(false)");
        this.k = (ajws) i;
        this.a = new ajei();
    }

    private final ajdp<Boolean> e() {
        Object j = ajdp.a((Callable) new i(this)).b((ajdw) a().i()).p(j.a).j(ajfu.a);
        akcr.a(j, "Observable.defer { entry…  .distinctUntilChanged()");
        return j;
    }

    private final ajdp<Boolean> f() {
        Object j = ajdp.a((Callable) new f(this)).b((ajdw) a().i()).j(ajfu.a);
        akcr.a(j, "Observable.defer {\n     …  .distinctUntilChanged()");
        return j;
    }

    private final void g() {
        this.k.a((Object) Boolean.FALSE);
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.j.b();
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    public final ajdx<Boolean> b() {
        Object b = ajdx.c((Callable) new d(this)).b((ajdw) a().i());
        akcr.a(b, "Single.fromCallable {\n  …eOn(schedulers.queries())");
        return b;
    }

    /* JADX WARNING: Missing block: B:13:0x004b, code skipped:
            if (defpackage.upp.a((defpackage.zjm) r6) != false) goto L_0x004f;
     */
    public final void b(defpackage.achi<defpackage.zjm, defpackage.zjk> r6) {
        /*
        r5 = this;
        r0 = "navigationEvent";
        defpackage.akcr.b(r6, r0);
        r0 = r6.l;
        if (r0 == 0) goto L_0x0056;
    L_0x0009:
        r0 = r6.d;
        r1 = defpackage.acgw.DISMISS;
        r2 = 1;
        r3 = 0;
        if (r0 != r1) goto L_0x0023;
    L_0x0011:
        r0 = r6.e;
        r0 = r0.e();
        r0 = (defpackage.zjm) r0;
        r1 = defpackage.ojc.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0023;
    L_0x0021:
        r0 = 1;
        goto L_0x0024;
    L_0x0023:
        r0 = 0;
    L_0x0024:
        r1 = r6.d;
        r4 = defpackage.acgw.PRESENT;
        if (r1 != r4) goto L_0x004e;
    L_0x002a:
        r1 = r6.e;
        r1 = r1.e();
        r1 = (defpackage.zjm) r1;
        r4 = defpackage.ojc.a;
        r1 = defpackage.akcr.a(r1, r4);
        if (r1 == 0) goto L_0x004e;
    L_0x003a:
        r6 = r6.f;
        r6 = r6.e();
        r1 = "navigationEvent.destinationPage.pageType";
        defpackage.akcr.a(r6, r1);
        r6 = (defpackage.zjm) r6;
        r6 = defpackage.upp.a(r6);
        if (r6 == 0) goto L_0x004e;
    L_0x004d:
        goto L_0x004f;
    L_0x004e:
        r2 = 0;
    L_0x004f:
        if (r0 != 0) goto L_0x0053;
    L_0x0051:
        if (r2 == 0) goto L_0x0056;
    L_0x0053:
        r5.g();
    L_0x0056:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.memories.lib.meo.MyEyesOnlyStateProvider.b(achi):void");
    }

    public final ajdp<Boolean> c() {
        Object j = ajdp.a((Callable) new g(this)).b((ajdw) a().i()).j(ajfu.a);
        akcr.a(j, "Observable.defer {\n     …  .distinctUntilChanged()");
        return j;
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    public final ajdp<pgu> d() {
        Object a = ajdp.a((ajdt) c(), (ajdt) e(), (ajdt) this.k.f(), (ajdt) f(), (ajfe) h.a);
        akcr.a(a, "combineLatest(\n         …                combiner)");
        return a;
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onFragmentPause() {
        g();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onUnlockMyEyesOnly(olr olr) {
        akcr.b(olr, "event");
        this.k.a((Object) Boolean.TRUE);
    }
}
