package com.snap.spectacles.lib.fragments.presenters;

import com.google.protobuf.nano.MessageNano;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.snap.spectacles.config.SpectaclesHttpInterface;
import defpackage.aajt;
import defpackage.abbr;
import defpackage.abbz;
import defpackage.abcf;
import defpackage.abcg;
import defpackage.abck;
import defpackage.abcq;
import defpackage.abdv;
import defpackage.abdw;
import defpackage.abeb;
import defpackage.achb;
import defpackage.acig;
import defpackage.acio;
import defpackage.adut;
import defpackage.adwk;
import defpackage.ahgk;
import defpackage.ahgl;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfl;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxw;
import defpackage.ajzt;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.dib;
import defpackage.idd;
import defpackage.ifs;
import defpackage.xai;
import defpackage.xbd;
import defpackage.xci;
import defpackage.xcl;
import defpackage.xdb;
import defpackage.xdd;
import defpackage.xeb;
import defpackage.xfa;
import defpackage.xgg;
import defpackage.xjm;
import defpackage.xmg;
import defpackage.xmr;
import defpackage.xmt;
import defpackage.xmw;
import defpackage.xmx;
import defpackage.xmz;
import defpackage.xpg;
import defpackage.xpi;
import defpackage.xpw;
import defpackage.xrw;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class SpectaclesManagePresenter extends zll<xmg> implements defpackage.k {
    public String a;
    public xdb b;
    final ajxe c = ajxh.a(b.a);
    public boolean d;
    public boolean e;
    final Set<defpackage.xgg.a> f;
    public ajei g;
    final xpw h;
    final achb<zjm, zjk> i;
    final ajwy<xpg> j;
    final ajwy<xpi> k;
    final dib l;
    final ifs m;
    final ajei n;
    private final ajxe o;
    private final ajxe p;
    private final ajxe q = ajxh.a(new h(this));
    private final ajxe r;
    private final ajxe s;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class aa<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesManagePresenter a;
        private /* synthetic */ Object b;
        private /* synthetic */ akbl c;

        aa(SpectaclesManagePresenter spectaclesManagePresenter, Object obj, akbl akbl) {
            this.a = spectaclesManagePresenter;
            this.b = obj;
            this.c = akbl;
        }

        public final /* synthetic */ Object call() {
            if (((xmg) this.a.getTarget()) == null) {
                return null;
            }
            this.c.invoke(this.b);
            return ajxw.a;
        }
    }

    static final class ab<V> implements Callable<T> {
        private /* synthetic */ SpectaclesManagePresenter a;
        private /* synthetic */ boolean b;

        ab(SpectaclesManagePresenter spectaclesManagePresenter, boolean z) {
            this.a = spectaclesManagePresenter;
            this.b = z;
        }

        public final /* synthetic */ Object call() {
            this.a.b().d(this.b);
            return ajxw.a;
        }
    }

    static final class i<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesManagePresenter a;

        i(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final /* synthetic */ Object call() {
            return ((SpectaclesHttpInterface) this.a.p.b());
        }
    }

    static final class k<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesManagePresenter a;

        k(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final /* synthetic */ Object call() {
            this.a.c().j().d(this.a.a());
            xpw xpw = this.a.h;
            String a = this.a.a();
            akcr.b(a, "serialNumber");
            return (Long) xpw.a.put(a, Long.valueOf(System.currentTimeMillis()));
        }
    }

    static final class n<V> implements Callable<Object> {
        private /* synthetic */ Object a;
        private /* synthetic */ akbl b;

        n(Object obj, akbl akbl) {
            this.a = obj;
            this.b = akbl;
        }

        public final /* synthetic */ Object call() {
            this.b.invoke(this.a);
            return ajxw.a;
        }
    }

    static final class o<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesManagePresenter a;

        o(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final /* synthetic */ Object call() {
            SpectaclesManagePresenter spectaclesManagePresenter = this.a;
            xdb b = spectaclesManagePresenter.c().j().b(this.a.a());
            if (b == null) {
                akcr.a();
            }
            akcr.b(b, "<set-?>");
            spectaclesManagePresenter.b = b;
            this.a.a(abdv.MANAGE, this.a.b());
            SpectaclesManagePresenter spectaclesManagePresenter2 = this.a;
            xfa k = spectaclesManagePresenter2.b().k();
            boolean d = this.a.b().n.d(xcl.BLE_SYNCED);
            String str = this.a.b().d;
            String h = this.a.b().h();
            xdd xdd = this.a.b().c;
            SpectaclesManagePresenter.a(spectaclesManagePresenter2, k, d, str, h, xdd != null ? xdd.m() : false);
            return ajxw.a;
        }
    }

    public static final class p<V> implements Callable<T> {
        private /* synthetic */ SpectaclesManagePresenter a;

        public p(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final /* synthetic */ Object call() {
            return this.a.c().j().b(this.a.a());
        }
    }

    static final class ac<T> implements ajfb<ajxw> {
        private /* synthetic */ SpectaclesManagePresenter a;
        private /* synthetic */ boolean b;

        ac(SpectaclesManagePresenter spectaclesManagePresenter, boolean z) {
            this.a = spectaclesManagePresenter;
            this.b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            xmg xmg = (xmg) this.a.getTarget();
            if (xmg != null) {
                xmg.a(this.b);
            }
        }
    }

    public static final class ae implements xeb {
        final /* synthetic */ boolean a;
        private /* synthetic */ SpectaclesManagePresenter b;

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter$ae$1 */
        static final class AnonymousClass1 extends akcs implements akbl<xmg, ajxw> {
            private /* synthetic */ ae a;

            AnonymousClass1(ae aeVar) {
                this.a = aeVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmg xmg = (xmg) obj;
                akcr.b(xmg, "receiver$0");
                xmg.a(this.a.a ^ 1);
                return ajxw.a;
            }
        }

        public ae(SpectaclesManagePresenter spectaclesManagePresenter, boolean z) {
            this.b = spectaclesManagePresenter;
            this.a = z;
        }

        public final void onComplete(MessageNano messageNano, int i) {
            if (messageNano instanceof adwk) {
                SpectaclesManagePresenter spectaclesManagePresenter = this.b;
                boolean z = this.a;
                ajej c = ajdx.c((Callable) new ab(spectaclesManagePresenter, z)).b((ajdw) spectaclesManagePresenter.d().f()).a((ajdw) spectaclesManagePresenter.d().l()).c((ajfb) new ac(spectaclesManagePresenter, z)).c();
                akcr.a((Object) c, "Single.fromCallable { de…            }.subscribe()");
                ajvv.a(c, spectaclesManagePresenter.n);
                return;
            }
            Object obj = (xmg) this.b.getTarget();
            if (obj != null) {
                this.b.a(obj, (akbl) new AnonymousClass1(this));
            }
            obj = (xmg) this.b.getTarget();
            if (obj != null) {
                this.b.a(obj, (akbl) AnonymousClass2.a);
            }
        }
    }

    public static final class ah<T> implements ajfl<xgg> {
        private /* synthetic */ SpectaclesManagePresenter a;

        public ah(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final /* synthetic */ boolean test(Object obj) {
            xgg xgg = (xgg) obj;
            akcr.b(xgg, "it");
            return (xgg.b == defpackage.xgg.a.EMPTY || xgg.c || !akcr.a(this.a.a(), xgg.a.d)) ? false : true;
        }
    }

    public static final class ai<T> implements ajfb<xgg> {
        final /* synthetic */ SpectaclesManagePresenter a;

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter$ai$3 */
        static final class AnonymousClass3 extends akcs implements akbl<xmg, ajxw> {
            private /* synthetic */ ai a;

            AnonymousClass3(ai aiVar) {
                this.a = aiVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmg xmg = (xmg) obj;
                akcr.b(xmg, "receiver$0");
                xmg.a(((xpi) this.a.a.q.b()).d);
                return ajxw.a;
            }
        }

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter$ai$4 */
        static final class AnonymousClass4 extends akcs implements akbl<xmg, ajxw> {
            private /* synthetic */ ai a;

            AnonymousClass4(ai aiVar) {
                this.a = aiVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmg xmg = (xmg) obj;
                akcr.b(xmg, "receiver$0");
                xmg.b(((xpi) this.a.a.q.b()).d);
                return ajxw.a;
            }
        }

        public ai(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        /* JADX WARNING: Missing block: B:7:0x0027, code skipped:
            r3.a(r1, (defpackage.akbl) r4);
     */
        public final /* synthetic */ void accept(java.lang.Object r6) {
            /*
            r5 = this;
            r6 = (defpackage.xgg) r6;
            r0 = r6.b;
            r1 = defpackage.xmx.b;
            r2 = r0.ordinal();
            r1 = r1[r2];
            r2 = 0;
            switch(r1) {
                case 1: goto L_0x0053;
                case 2: goto L_0x0044;
                case 3: goto L_0x003f;
                case 4: goto L_0x003f;
                case 5: goto L_0x002d;
                case 6: goto L_0x0016;
                default: goto L_0x0010;
            };
        L_0x0010:
            r1 = r5.a;
        L_0x0012:
            r1.a(r0, r2);
            goto L_0x0062;
        L_0x0016:
            r1 = r5.a;
            r1 = r1.getTarget();
            r1 = (defpackage.xmg) r1;
            if (r1 == 0) goto L_0x0010;
        L_0x0020:
            r3 = r5.a;
            r4 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter$ai$4;
            r4.<init>(r5);
        L_0x0027:
            r4 = (defpackage.akbl) r4;
            r3.a(r1, r4);
            goto L_0x0010;
        L_0x002d:
            r1 = r5.a;
            r1 = r1.getTarget();
            r1 = (defpackage.xmg) r1;
            if (r1 == 0) goto L_0x0010;
        L_0x0037:
            r3 = r5.a;
            r4 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter$ai$3;
            r4.<init>(r5);
            goto L_0x0027;
        L_0x003f:
            r1 = r5.a;
            r2 = r6.d;
            goto L_0x0012;
        L_0x0044:
            r1 = r5.a;
            r1 = r1.getTarget();
            r1 = (defpackage.xmg) r1;
            if (r1 == 0) goto L_0x0010;
        L_0x004e:
            r3 = r5.a;
            r4 = com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.ai.AnonymousClass2.a;
            goto L_0x0027;
        L_0x0053:
            r1 = r5.a;
            r1 = r1.getTarget();
            r1 = (defpackage.xmg) r1;
            if (r1 == 0) goto L_0x0010;
        L_0x005d:
            r3 = r5.a;
            r4 = com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter.ai.AnonymousClass1.a;
            goto L_0x0027;
        L_0x0062:
            r1 = r5.a;
            r1 = r1.f;
            r0 = r1.contains(r0);
            if (r0 == 0) goto L_0x0077;
        L_0x006c:
            r6 = r6.a;
            r6 = r6.c();
            if (r6 == 0) goto L_0x0077;
        L_0x0074:
            r6.e();
        L_0x0077:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter$ai.accept(java.lang.Object):void");
        }
    }

    public static final class aj<T> implements ajfl<ajxm<? extends xdb, ? extends xjm>> {
        private /* synthetic */ SpectaclesManagePresenter a;

        public aj(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return akcr.a(((xdb) ajxm.a).d, this.a.a());
        }
    }

    public static final class ak<T> implements ajfb<ajxm<? extends xdb, ? extends xjm>> {
        private /* synthetic */ SpectaclesManagePresenter a;

        public ak(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            xdb xdb = (xdb) ajxm.a;
            defpackage.xjm.a b = ((xjm) ajxm.b).b();
            if (b != null) {
                int i = xmx.a[b.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    SpectaclesManagePresenter spectaclesManagePresenter = this.a;
                    spectaclesManagePresenter.e = false;
                    xfa k = xdb.k();
                    boolean d = xdb.n.d(xcl.BLE_SYNCED);
                    String str = xdb.d;
                    String h = xdb.h();
                    xdd xdd = xdb.c;
                    SpectaclesManagePresenter.a(spectaclesManagePresenter, k, d, str, h, xdd != null ? xdd.m() : false);
                    return;
                } else if (i == 4 || i == 5) {
                    this.a.e = true;
                    return;
                }
            }
            this.a.e = false;
        }
    }

    public static final class al implements xeb {
        private /* synthetic */ SpectaclesManagePresenter a;

        public al(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final void onComplete(MessageNano messageNano, int i) {
            if (messageNano instanceof adwk) {
                this.a.f();
                return;
            }
            Object obj = (xmg) this.a.getTarget();
            if (obj != null) {
                this.a.a(obj, (akbl) AnonymousClass1.a);
            }
        }
    }

    public static final class c implements defpackage.xpg.b {
        final /* synthetic */ SpectaclesManagePresenter a;

        static final class a extends akcs implements akbl<xmg, ajxw> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmg xmg = (xmg) obj;
                akcr.b(xmg, "receiver$0");
                xmg.r();
                return ajxw.a;
            }
        }

        static final class b extends akcs implements akbl<xmg, ajxw> {
            private /* synthetic */ c a;

            b(c cVar) {
                this.a = cVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmg xmg = (xmg) obj;
                akcr.b(xmg, "receiver$0");
                xmg.o();
                this.a.a.a(null, (float) MapboxConstants.MINIMUM_ZOOM);
                return ajxw.a;
            }
        }

        static final class c extends akcs implements akbl<xmg, ajxw> {
            private /* synthetic */ c a;
            private /* synthetic */ String b;
            private /* synthetic */ String c;

            c(c cVar, String str, String str2) {
                this.a = cVar;
                this.b = str;
                this.c = str2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmg xmg = (xmg) obj;
                akcr.b(xmg, "receiver$0");
                this.a.a.a(abcg.PROMPT);
                xmg.a(this.b, this.c, this.a.a.b().j);
                return ajxw.a;
            }
        }

        static final class d extends akcs implements akbl<xmg, ajxw> {
            private /* synthetic */ c a;
            private /* synthetic */ boolean b;

            d(c cVar, boolean z) {
                this.a = cVar;
                this.b = z;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmg xmg = (xmg) obj;
                akcr.b(xmg, "receiver$0");
                if (this.b) {
                    xmg.q();
                } else {
                    xmg.p();
                }
                this.a.a.a(null, (float) MapboxConstants.MINIMUM_ZOOM);
                return ajxw.a;
            }
        }

        public c(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final void a() {
            Object obj = (xmg) this.a.getTarget();
            if (obj != null) {
                this.a.a(obj, (akbl) new b(this));
            }
        }

        public final void a(String str, String str2, String str3) {
            akcr.b(str, "newVersion");
            akcr.b(str3, "latestVersionDigest");
            Object obj = (xmg) this.a.getTarget();
            if (obj != null) {
                this.a.a(obj, (akbl) new c(this, str, str2));
            }
        }

        public final void a(boolean z) {
            xci c = this.a.b().c();
            if (c != null) {
                c.e();
            }
            Object obj = (xmg) this.a.getTarget();
            if (obj != null) {
                this.a.a(obj, (akbl) new d(this, z));
            }
        }

        public final void b() {
            Object obj = (xmg) this.a.getTarget();
            if (obj != null) {
                this.a.a(obj, (akbl) a.a);
            }
        }
    }

    public static final class d implements xeb {
        private /* synthetic */ SpectaclesManagePresenter a;

        public d(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final void onComplete(MessageNano messageNano, int i) {
            SpectaclesManagePresenter spectaclesManagePresenter;
            AnonymousClass2 anonymousClass2;
            Object obj;
            SpectaclesManagePresenter spectaclesManagePresenter2;
            if ((messageNano instanceof adwk) || ((messageNano instanceof adut) && ((adut) messageNano).c == 1)) {
                spectaclesManagePresenter2 = this.a;
                spectaclesManagePresenter2.d = true;
                xmg obj2 = (xmg) spectaclesManagePresenter2.getTarget();
                if (obj2 != null) {
                    spectaclesManagePresenter = this.a;
                    anonymousClass2 = AnonymousClass1.a;
                } else {
                    return;
                }
            }
            spectaclesManagePresenter2 = this.a;
            spectaclesManagePresenter2.d = false;
            obj2 = (xmg) spectaclesManagePresenter2.getTarget();
            if (obj2 != null) {
                spectaclesManagePresenter = this.a;
                anonymousClass2 = AnonymousClass2.a;
            }
            spectaclesManagePresenter.a(obj2, (akbl) anonymousClass2);
        }
    }

    public static final class f implements defpackage.xpg.c {
        private /* synthetic */ SpectaclesManagePresenter a;

        static final class a extends akcs implements akbl<xmg, ajxw> {
            private /* synthetic */ int a;
            private /* synthetic */ int b;

            a(int i, int i2) {
                this.a = i;
                this.b = i2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmg xmg = (xmg) obj;
                akcr.b(xmg, "receiver$0");
                xmg.a(this.a, this.b);
                return ajxw.a;
            }
        }

        static final class b extends akcs implements akbl<xmg, ajxw> {
            public static final b a = new b();

            b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmg xmg = (xmg) obj;
                akcr.b(xmg, "receiver$0");
                xmg.t();
                return ajxw.a;
            }
        }

        static final class c extends akcs implements akbl<xmg, ajxw> {
            public static final c a = new c();

            c() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmg xmg = (xmg) obj;
                akcr.b(xmg, "receiver$0");
                xmg.s();
                return ajxw.a;
            }
        }

        static final class d extends akcs implements akbl<xmg, ajxw> {
            public static final d a = new d();

            d() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmg xmg = (xmg) obj;
                akcr.b(xmg, "receiver$0");
                xmg.u();
                return ajxw.a;
            }
        }

        public f(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final void a() {
        }

        public final void a(int i, int i2) {
            Object obj = (xmg) this.a.getTarget();
            if (obj != null) {
                this.a.a(obj, (akbl) new a(i, i2));
            }
            this.a.a(defpackage.xgg.a.FIRMWARE_UPDATE_FAILED, (float) MapboxConstants.MINIMUM_ZOOM);
        }

        public final void b() {
            Object obj = (xmg) this.a.getTarget();
            if (obj != null) {
                this.a.a(obj, (akbl) c.a);
            }
            this.a.a(defpackage.xgg.a.FIRMWARE_UPDATE_FAILED, (float) MapboxConstants.MINIMUM_ZOOM);
        }

        public final void c() {
            Object obj = (xmg) this.a.getTarget();
            if (obj != null) {
                this.a.a(obj, (akbl) b.a);
            }
            this.a.a(defpackage.xgg.a.FIRMWARE_UPDATE_FAILED, (float) MapboxConstants.MINIMUM_ZOOM);
        }

        public final void d() {
            Object obj = (xmg) this.a.getTarget();
            if (obj != null) {
                this.a.a(obj, (akbl) d.a);
            }
            this.a.a(defpackage.xgg.a.FIRMWARE_UPDATE_FAILED, (float) MapboxConstants.MINIMUM_ZOOM);
        }
    }

    static final class j implements ajev {
        private /* synthetic */ SpectaclesManagePresenter a;

        j(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final void run() {
            ahgl ahgl = new ahgl();
            ahgl.a = ahgk.DELETE_DEVICE.a();
            ahgl.b = xpw.a(this.a.b());
            ((SpectaclesHttpInterface) this.a.p.b()).deleteSpectaclesDevice(ahgl).a((ajdw) this.a.d().f()).c((ajfb) AnonymousClass1.a).h(AnonymousClass2.a).c();
        }
    }

    static final class l<T> implements ajfb<Throwable> {
        public static final l a = new l();

        l() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class m implements ajev {
        private /* synthetic */ SpectaclesManagePresenter a;

        m(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final void run() {
            this.a.i.b((acig) new acio(xai.a, false, false));
        }
    }

    public static final class q<T, R> implements ajfc<T, R> {
        public static final q a = new q();

        q() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            xdb xdb = (xdb) obj;
            akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
            return new xmr(xdb.m(), xdb instanceof xrw, xdb.a.k().c().w(xdb.d), xdb.k());
        }
    }

    public static final class r<T, R> implements ajfc<T, R> {
        private /* synthetic */ SpectaclesManagePresenter a;

        public r(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            xmr xmr = (xmr) obj;
            akcr.b(xmr, "info");
            xmg xmg = (xmg) this.a.getTarget();
            if (xmg == null) {
                return null;
            }
            xmg.a((xmz) xmr);
            return ajxw.a;
        }
    }

    public static final class s<T> implements ajfl<ajxw> {
        private /* synthetic */ SpectaclesManagePresenter a;

        public s(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A:{RETURN} */
        public final /* synthetic */ boolean test(java.lang.Object r6) {
            /*
            r5 = this;
            r6 = (defpackage.ajxw) r6;
            r0 = "it";
            defpackage.akcr.b(r6, r0);
            r6 = r5.a;
            r6 = r6.b();
            r6 = r6.i;
            r0 = 0;
            if (r6 != 0) goto L_0x001c;
        L_0x0012:
            r6 = r5.a;
            r6 = r6.b();
            r6 = r6.j;
            if (r6 == 0) goto L_0x0057;
        L_0x001c:
            r6 = r5.a;
            r1 = r6.c();
            r1 = r1.e();
            r1 = r1.g();
            r2 = "specsCoreComponent.event…wareUpdateBehaviorSubject";
            defpackage.akcr.a(r1, r2);
            r1 = r1.p();
            r1 = (defpackage.xgg) r1;
            r2 = 1;
            if (r1 == 0) goto L_0x0053;
        L_0x0038:
            r3 = r1.b;
            r4 = defpackage.xgg.a.EMPTY;
            if (r3 == r4) goto L_0x0053;
        L_0x003e:
            r1 = r1.a;
            r1 = r1.d;
            r6 = r6.a;
            if (r6 != 0) goto L_0x004b;
        L_0x0046:
            r3 = "serialNumber";
            defpackage.akcr.a(r3);
        L_0x004b:
            r6 = defpackage.akcr.a(r1, r6);
            if (r6 == 0) goto L_0x0053;
        L_0x0051:
            r6 = 1;
            goto L_0x0054;
        L_0x0053:
            r6 = 0;
        L_0x0054:
            if (r6 != 0) goto L_0x0057;
        L_0x0056:
            return r2;
        L_0x0057:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter$s.test(java.lang.Object):boolean");
        }
    }

    public static final class t<T, R> implements ajfc<T, R> {
        private /* synthetic */ SpectaclesManagePresenter a;

        public t(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajxw) obj, "it");
            this.a.a(defpackage.xgg.a.UPDATE_AVAILABLE, (float) MapboxConstants.MINIMUM_ZOOM);
            return ajxw.a;
        }
    }

    public static final class z implements xeb {
        final /* synthetic */ SpectaclesManagePresenter a;

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesManagePresenter$z$1 */
        static final class AnonymousClass1 implements ajev {
            private /* synthetic */ z a;

            AnonymousClass1(z zVar) {
                this.a = zVar;
            }

            public final void run() {
                SpectaclesManagePresenter spectaclesManagePresenter = this.a.a;
                if (spectaclesManagePresenter.m.l()) {
                    spectaclesManagePresenter.c().h().a(defpackage.xed.a.LOW_LATENCY, 0);
                }
            }
        }

        public z(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
        }

        public final void onComplete(MessageNano messageNano, int i) {
            this.a.g.a(ajcx.a(3000, TimeUnit.MILLISECONDS).g(new AnonymousClass1(this)));
        }
    }

    static final class ad extends akcs implements akbk<zfw> {
        private /* synthetic */ SpectaclesManagePresenter a;
        private /* synthetic */ ajwy b;

        ad(SpectaclesManagePresenter spectaclesManagePresenter, ajwy ajwy) {
            this.a = spectaclesManagePresenter;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.b.get();
            return zgb.a((idd) this.a.c.b());
        }
    }

    static final class af extends akcs implements akbk<xbd> {
        private /* synthetic */ ajwy a;

        af(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xbd) this.a.get();
        }
    }

    static final class am extends akcs implements akbl<xmg, ajxw> {
        private /* synthetic */ SpectaclesManagePresenter a;
        private /* synthetic */ defpackage.xgg.a b;
        private /* synthetic */ float c;

        am(SpectaclesManagePresenter spectaclesManagePresenter, defpackage.xgg.a aVar, float f) {
            this.a = spectaclesManagePresenter;
            this.b = aVar;
            this.c = f;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmg xmg = (xmg) obj;
            akcr.b(xmg, "receiver$0");
            defpackage.xgg.a aVar = this.b;
            boolean z = this.a.b().j;
            xcl xcl = this.a.b().n;
            float f = this.c;
            xdd xdd = this.a.b().c;
            xmg.a((xmz) new xmt(aVar, z, false, xcl, f, xdd != null ? xdd.m() : false));
            return ajxw.a;
        }
    }

    static final class b extends akcs implements akbk<idd> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return xai.f.callsite("SpectaclesManagePresenter");
        }
    }

    public static final class e extends akcs implements akbl<xmg, ajxw> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmg xmg = (xmg) obj;
            akcr.b(xmg, "receiver$0");
            xmg.n();
            return ajxw.a;
        }
    }

    static final class g extends akcs implements akbk<xpg> {
        private /* synthetic */ SpectaclesManagePresenter a;

        g(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xpg) this.a.j.get();
        }
    }

    static final class h extends akcs implements akbk<xpi> {
        private /* synthetic */ SpectaclesManagePresenter a;

        h(SpectaclesManagePresenter spectaclesManagePresenter) {
            this.a = spectaclesManagePresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xpi) this.a.k.get();
        }
    }

    static final class u extends akcs implements akbl<xmg, ajxw> {
        private /* synthetic */ xfa a;
        private /* synthetic */ boolean b;
        private /* synthetic */ String c;
        private /* synthetic */ String d;
        private /* synthetic */ boolean e;

        u(xfa xfa, boolean z, String str, String str2, boolean z2) {
            this.a = xfa;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = z2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmg xmg = (xmg) obj;
            akcr.b(xmg, "receiver$0");
            xmg.a((xmz) new xmw(this.a, this.b, this.c, this.d, this.e));
            return ajxw.a;
        }
    }

    public static final class v extends akcs implements akbl<SpectaclesManagePresenter, ajxw> {
        public static final v a = new v();

        v() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesManagePresenter spectaclesManagePresenter = (SpectaclesManagePresenter) obj;
            akcr.b(spectaclesManagePresenter, "receiver$0");
            abbz abbz = new abbz();
            SpectaclesManagePresenter.a(spectaclesManagePresenter, (abeb) abbz);
            spectaclesManagePresenter.l.a((aajt) abbz);
            return ajxw.a;
        }
    }

    static final class w extends akcs implements akbl<SpectaclesManagePresenter, ajxw> {
        private /* synthetic */ abcg a;

        w(abcg abcg) {
            this.a = abcg;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesManagePresenter spectaclesManagePresenter = (SpectaclesManagePresenter) obj;
            akcr.b(spectaclesManagePresenter, "receiver$0");
            abcf abcf = new abcf();
            SpectaclesManagePresenter.a(spectaclesManagePresenter, (abeb) abcf);
            abcf.a(this.a);
            spectaclesManagePresenter.l.a((aajt) abcf);
            return ajxw.a;
        }
    }

    public static final class x extends akcs implements akbl<SpectaclesManagePresenter, ajxw> {
        public static final x a = new x();

        x() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesManagePresenter spectaclesManagePresenter = (SpectaclesManagePresenter) obj;
            akcr.b(spectaclesManagePresenter, "receiver$0");
            abck abck = new abck();
            SpectaclesManagePresenter.a(spectaclesManagePresenter, (abeb) abck);
            spectaclesManagePresenter.l.a((aajt) abck);
            return ajxw.a;
        }
    }

    static final class y extends akcs implements akbl<SpectaclesManagePresenter, ajxw> {
        private /* synthetic */ abdv a;
        private /* synthetic */ xdb b;

        y(abdv abdv, xdb xdb) {
            this.a = abdv;
            this.b = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesManagePresenter spectaclesManagePresenter = (SpectaclesManagePresenter) obj;
            akcr.b(spectaclesManagePresenter, "receiver$0");
            abdw abdw = new abdw();
            abdw.a(this.a);
            abbr abbr = abdw;
            xdb xdb = this.b;
            if (xdb != null) {
                abbr.b(xdb.d);
                abbr.c(xdb.h());
                abbr.d(xdb.p());
                abcq M = xdb.M();
                if (M != null) {
                    abbr.a(M);
                }
                if (xdb.a().a != defpackage.xcy.a.CHARGER_STATE_UNKNOWN) {
                    abbr.a(Boolean.valueOf(xdb.a().a == defpackage.xcy.a.CHARGER_CONNECTED));
                }
                if (xdb.a().b()) {
                    abbr.a(Long.valueOf((long) xdb.a().a()));
                }
                if (xdb.g > 0) {
                    abbr.b(Long.valueOf((long) xdb.g));
                }
            }
            spectaclesManagePresenter.l.a((aajt) abdw);
            return ajxw.a;
        }
    }

    static final class ag extends akcq implements akbk<SpectaclesHttpInterface> {
        ag(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (SpectaclesHttpInterface) ((aipn) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SpectaclesManagePresenter.class), "specsCoreComponent", "getSpecsCoreComponent()Lcom/snap/spectacles/base/di/components/SpectaclesCoreComponent;"), new akdc(akde.a(SpectaclesManagePresenter.class), "spectaclesHttpInterface", "getSpectaclesHttpInterface()Lcom/snap/spectacles/config/SpectaclesHttpInterface;"), new akdc(akde.a(SpectaclesManagePresenter.class), "firmwareUpdatesInfo", "getFirmwareUpdatesInfo()Lcom/snap/spectacles/lib/main/firmwareupdate/SpectaclesFirmwareUpdatesInfo;"), new akdc(akde.a(SpectaclesManagePresenter.class), "callSite", "getCallSite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(SpectaclesManagePresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(SpectaclesManagePresenter.class), "firmwareUpdatesChecker", "getFirmwareUpdatesChecker()Lcom/snap/spectacles/lib/main/firmwareupdate/SpectaclesFirmwareUpdatesChecker;")};
        a aVar = new a();
    }

    public SpectaclesManagePresenter(ajwy<xbd> ajwy, xpw xpw, achb<zjm, zjk> achb, aipn<SpectaclesHttpInterface> aipn, ajwy<xpg> ajwy2, ajwy<xpi> ajwy3, ajwy<zgb> ajwy4, dib dib, ifs ifs, ajei ajei) {
        akcr.b(ajwy, "specsCoreComponentLazy");
        akcr.b(xpw, "deviceUtils");
        akcr.b(achb, "navigationHost");
        akcr.b(aipn, "httpInterface");
        akcr.b(ajwy2, "firmwareUpdatesCheckerLazy");
        akcr.b(ajwy3, "firmwareUpdatesInfoLazy");
        akcr.b(ajwy4, "schedulersProvider");
        akcr.b(dib, "blizzardEventLogger");
        akcr.b(ifs, "permissionHelper");
        akcr.b(ajei, "userSessionDisposable");
        this.h = xpw;
        this.i = achb;
        this.j = ajwy2;
        this.k = ajwy3;
        this.l = dib;
        this.m = ifs;
        this.n = ajei;
        this.o = ajxh.a(new af(ajwy));
        this.p = ajxh.a(new ag(aipn));
        this.r = ajxh.a(new ad(this, ajwy4));
        this.s = ajxh.a(new g(this));
        this.f = ajzt.a((Object[]) new defpackage.xgg.a[]{defpackage.xgg.a.FIRMWARE_UPDATE_FAILED, defpackage.xgg.a.FIRMWARE_TRANSFER_FAILED, defpackage.xgg.a.DOWNLOAD_FAILED, defpackage.xgg.a.UNEXPECTED_VERSION_RECEIVED, defpackage.xgg.a.FIRMWARE_UPDATED, defpackage.xgg.a.INTERMEDIATE_FIRMWARE_UPDATED});
        this.g = new ajei();
    }

    public static final /* synthetic */ void a(SpectaclesManagePresenter spectaclesManagePresenter, xfa xfa, boolean z, String str, String str2, boolean z2) {
        Object obj = (xmg) spectaclesManagePresenter.getTarget();
        if (obj != null) {
            spectaclesManagePresenter.a(obj, (akbl) new u(xfa, z, str, str2, z2));
        }
    }

    public final String a() {
        String str = this.a;
        if (str == null) {
            akcr.a("serialNumber");
        }
        return str;
    }

    public final void a(abcg abcg) {
        akcr.b(abcg, "action");
        b(this, new w(abcg));
    }

    public final void a(abdv abdv, xdb xdb) {
        b(this, new y(abdv, xdb));
    }

    public final void a(defpackage.xgg.a aVar, float f) {
        Object obj = (xmg) getTarget();
        if (obj != null) {
            a(obj, (akbl) new am(this, aVar, f));
        }
    }

    /* renamed from: a */
    public final void takeTarget(xmg xmg) {
        akcr.b(xmg, "target");
        super.takeTarget(xmg);
        xmg.getLifecycle().a(this);
    }

    public final <T> boolean a(T t, akbl<? super T, ajxw> akbl) {
        return this.g.a(ajcx.b((Callable) new aa(this, t, akbl)).b((ajdw) d().l()).e());
    }

    public final <T> ajej b(T t, akbl<? super T, ajxw> akbl) {
        Object e = ajcx.b((Callable) new n(t, akbl)).b((ajdw) d().f()).e();
        akcr.a(e, "Completable.fromCallable…edulers.io()).subscribe()");
        return e;
    }

    public final xdb b() {
        xdb xdb = this.b;
        if (xdb == null) {
            akcr.a(MapboxNavigationEvent.KEY_DEVICE);
        }
        return xdb;
    }

    public final xbd c() {
        return (xbd) this.o.b();
    }

    public final zfw d() {
        return (zfw) this.r.b();
    }

    public final void dropTarget() {
        xmg xmg = (xmg) getTarget();
        if (xmg != null) {
            defpackage.j lifecycle = xmg.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    public final xpg e() {
        return (xpg) this.s.b();
    }

    public final void f() {
        abdv abdv = abdv.FORGET;
        xdb xdb = this.b;
        if (xdb == null) {
            akcr.a(MapboxNavigationEvent.KEY_DEVICE);
        }
        a(abdv, xdb);
        ajcx.b((Callable) new i(this)).b((ajev) new j(this)).b((ajdw) d().g()).e();
        ajej g = ajcx.b((Callable) new k(this)).b((ajdw) d().b()).a((ajdw) d().l()).a((ajfb) l.a).g(new m(this));
        akcr.a((Object) g, "Completable.fromCallable…false))\n                }");
        ajvv.a(g, this.g);
    }

    @defpackage.s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        ajej e = ajcx.b((Callable) new o(this)).b((ajdw) d().h()).e();
        akcr.a((Object) e, "Completable.fromCallable…             .subscribe()");
        ajvv.a(e, this.g);
    }

    @defpackage.s(a = defpackage.j.a.ON_DESTROY)
    public final void onDestroy() {
        this.g.a();
    }
}
