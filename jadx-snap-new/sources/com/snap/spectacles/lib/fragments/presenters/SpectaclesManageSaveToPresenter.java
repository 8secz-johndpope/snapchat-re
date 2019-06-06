package com.snap.spectacles.lib.fragments.presenters;

import android.content.Context;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import defpackage.aajt;
import defpackage.abbr;
import defpackage.abdv;
import defpackage.abdw;
import defpackage.abdy;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxk;
import defpackage.ajxm;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.dib;
import defpackage.idd;
import defpackage.s;
import defpackage.vjm;
import defpackage.xai;
import defpackage.xbb;
import defpackage.xbd;
import defpackage.xdb;
import defpackage.xjm;
import defpackage.xju;
import defpackage.xmh;
import defpackage.xmy;
import defpackage.xrw;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zll;
import java.util.concurrent.Callable;

public final class SpectaclesManageSaveToPresenter extends zll<xmh> implements defpackage.k {
    public String a;
    public xdb b;
    public final ajei c = new ajei();
    public final ajei d = new ajei();
    boolean e;
    final ajxe f = ajxh.a(a.a);
    final dib g;
    private vjm h;
    private final ajxe i;
    private final ajxe j;
    private final Context k;

    static final class b<V> implements Callable<Object> {
        private /* synthetic */ Object a;
        private /* synthetic */ akbl b;

        b(Object obj, akbl akbl) {
            this.a = obj;
            this.b = akbl;
        }

        public final /* synthetic */ Object call() {
            this.b.invoke(this.a);
            return ajxw.a;
        }
    }

    static final class c implements Runnable {
        private /* synthetic */ SpectaclesManageSaveToPresenter a;

        c(SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter) {
            this.a = spectaclesManageSaveToPresenter;
        }

        public final void run() {
            SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter = this.a;
            xbb j = spectaclesManageSaveToPresenter.d().j();
            String str = this.a.a;
            if (str == null) {
                akcr.a("serialNumber");
            }
            xdb b = j.b(str);
            if (b == null) {
                akcr.a();
            }
            akcr.b(b, "<set-?>");
            spectaclesManageSaveToPresenter.b = b;
        }
    }

    static final class d<V> implements Callable<Boolean> {
        private /* synthetic */ SpectaclesManageSaveToPresenter a;

        d(SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter) {
            this.a = spectaclesManageSaveToPresenter;
        }

        public final /* synthetic */ Object call() {
            this.a.a(vjm.values()[this.a.a().n()]);
            return Boolean.valueOf(this.a.a().m());
        }
    }

    public static final class h<V> implements Callable<T> {
        private /* synthetic */ SpectaclesManageSaveToPresenter a;
        private /* synthetic */ vjm b;

        public h(SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter, vjm vjm) {
            this.a = spectaclesManageSaveToPresenter;
            this.b = vjm;
        }

        public final /* synthetic */ Object call() {
            this.a.a(this.b);
            this.a.a().c(this.b.ordinal());
            return ajxw.a;
        }
    }

    static final class j<V> implements Callable<T> {
        private /* synthetic */ SpectaclesManageSaveToPresenter a;
        private /* synthetic */ boolean b;

        j(SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter, boolean z) {
            this.a = spectaclesManageSaveToPresenter;
            this.b = z;
        }

        public final /* synthetic */ Object call() {
            xdb a = this.a.a();
            a.a.k().c().a(a.d, this.b);
            this.a.a().c(this.a.e().ordinal());
            return ajxw.a;
        }
    }

    static final class e<T> implements ajfb<Boolean> {
        private /* synthetic */ SpectaclesManageSaveToPresenter a;

        e(SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter) {
            this.a = spectaclesManageSaveToPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            if (this.a.b() == vjm.DEFAULT) {
                SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter = this.a;
                spectaclesManageSaveToPresenter.a(spectaclesManageSaveToPresenter.e());
            }
            xmh xmh = (xmh) this.a.getTarget();
            if (xmh != null) {
                akcr.a(obj, "autoSaveEnabled");
                defpackage.xmh.a.a(xmh, obj.booleanValue(), this.a.b(), false, 4);
            }
        }
    }

    public static final class i<T> implements ajfb<ajxw> {
        private /* synthetic */ SpectaclesManageSaveToPresenter a;

        public i(SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter) {
            this.a = spectaclesManageSaveToPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            xmh xmh = (xmh) this.a.getTarget();
            if (xmh != null) {
                defpackage.xmh.a.a(xmh, true, this.a.b(), false, 4);
            }
            SpectaclesManageSaveToPresenter.a(this.a);
            obj = this.a;
            obj.a(obj, (akbl) g.a);
        }
    }

    static final class k<T> implements ajfb<ajxw> {
        private /* synthetic */ SpectaclesManageSaveToPresenter a;
        private /* synthetic */ boolean b;

        k(SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter, boolean z) {
            this.a = spectaclesManageSaveToPresenter;
            this.b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            xmh xmh = (xmh) this.a.getTarget();
            if (xmh != null) {
                defpackage.xmh.a.a(xmh, this.b, null, true, 2);
            }
            if (this.b && (this.a.a() instanceof xrw)) {
                SpectaclesManageSaveToPresenter.a(this.a);
            }
            if (this.a.e) {
                xmh = (xmh) this.a.getTarget();
                if (xmh != null) {
                    xmh.i();
                }
            }
        }
    }

    public static final class n<T> implements ajfb<ajxm<? extends xdb, ? extends xjm>> {
        private /* synthetic */ SpectaclesManageSaveToPresenter a;

        public n(SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter) {
            this.a = spectaclesManageSaveToPresenter;
        }

        /* JADX WARNING: Missing block: B:5:0x001b, code skipped:
            if (r4 != 2) goto L_0x001d;
     */
        public final /* synthetic */ void accept(java.lang.Object r4) {
            /*
            r3 = this;
            r4 = (defpackage.ajxm) r4;
            r4 = r4.b;
            r4 = (defpackage.xjm) r4;
            r0 = r3.a;
            r4 = r4.b();
            r1 = 1;
            if (r4 != 0) goto L_0x0010;
        L_0x000f:
            goto L_0x001d;
        L_0x0010:
            r2 = defpackage.xmy.b;
            r4 = r4.ordinal();
            r4 = r2[r4];
            if (r4 == r1) goto L_0x001e;
        L_0x001a:
            r2 = 2;
            if (r4 == r2) goto L_0x001e;
        L_0x001d:
            r1 = 0;
        L_0x001e:
            r0.e = r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.presenters.SpectaclesManageSaveToPresenter$n.accept(java.lang.Object):void");
        }
    }

    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return xai.f.callsite("SpectaclesManageSaveToPresenter");
        }
    }

    static final class f extends akcs implements akbl<SpectaclesManageSaveToPresenter, ajxw> {
        private /* synthetic */ abdv a;

        f(abdv abdv) {
            this.a = abdv;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter = (SpectaclesManageSaveToPresenter) obj;
            akcr.b(spectaclesManageSaveToPresenter, "receiver$0");
            abdw abdw = new abdw();
            abdw.a(this.a);
            SpectaclesManageSaveToPresenter.a(spectaclesManageSaveToPresenter, (abbr) abdw);
            spectaclesManageSaveToPresenter.g.a((aajt) abdw);
            return ajxw.a;
        }
    }

    static final class g extends akcs implements akbl<SpectaclesManageSaveToPresenter, ajxw> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            abdy abdy;
            SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter = (SpectaclesManageSaveToPresenter) obj;
            akcr.b(spectaclesManageSaveToPresenter, "receiver$0");
            abdw abdw = new abdw();
            abdw.a(abdv.AUTO_IMPORT_TO_MEMORIES_AND_CAMERA_ROLL);
            switch (xmy.a[spectaclesManageSaveToPresenter.b().ordinal()]) {
                case 1:
                    abdy = abdy.WHITE_BORDER;
                    break;
                case 2:
                    abdy = abdy.BLACK_BORDER;
                    break;
                case 3:
                    abdy = abdy.SQUARE;
                    break;
                case 4:
                    abdy = abdy.HORIZONTAL_4_3;
                    break;
                case 5:
                    abdy = abdy.HORIZONTAL_16_9;
                    break;
                case 6:
                    abdy = abdy.PORTRAIT_9_16;
                    break;
                case 7:
                    abdy = abdy.NEWPORT;
                    break;
                case 8:
                    throw new IllegalArgumentException("this export type is not supported");
                default:
                    throw new ajxk();
            }
            abdw.a(abdy);
            SpectaclesManageSaveToPresenter.a(spectaclesManageSaveToPresenter, (abbr) abdw);
            spectaclesManageSaveToPresenter.g.a((aajt) abdw);
            return ajxw.a;
        }
    }

    static final class l extends akcs implements akbk<zfw> {
        private /* synthetic */ SpectaclesManageSaveToPresenter a;
        private /* synthetic */ ajwy b;

        l(SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter, ajwy ajwy) {
            this.a = spectaclesManageSaveToPresenter;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.b.get();
            return zgb.a((idd) this.a.f.b());
        }
    }

    static final class m extends akcs implements akbk<xbd> {
        private /* synthetic */ ajwy a;

        m(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xbd) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SpectaclesManageSaveToPresenter.class), "callSite", "getCallSite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(SpectaclesManageSaveToPresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(SpectaclesManageSaveToPresenter.class), "specsCoreComponent", "getSpecsCoreComponent()Lcom/snap/spectacles/base/di/components/SpectaclesCoreComponent;")};
    }

    public SpectaclesManageSaveToPresenter(ajwy<xbd> ajwy, ajwy<zgb> ajwy2, dib dib, Context context) {
        akcr.b(ajwy, "specsCoreComponentLazy");
        akcr.b(ajwy2, "schedulersProvider");
        akcr.b(dib, "blizzardEventLogger");
        akcr.b(context, "context");
        this.g = dib;
        this.k = context;
        this.i = ajxh.a(new l(this, ajwy2));
        this.j = ajxh.a(new m(ajwy));
    }

    /* Access modifiers changed, original: final */
    public final <T> ajej a(T t, akbl<? super T, ajxw> akbl) {
        Object e = ajcx.b((Callable) new b(t, akbl)).b((ajdw) c().f()).e();
        akcr.a(e, "Completable.fromCallable…edulers.io()).subscribe()");
        return e;
    }

    public final xdb a() {
        xdb xdb = this.b;
        if (xdb == null) {
            akcr.a(MapboxNavigationEvent.KEY_DEVICE);
        }
        return xdb;
    }

    public final void a(abdv abdv) {
        akcr.b(abdv, "action");
        a((Object) this, (akbl) new f(abdv));
    }

    public final void a(vjm vjm) {
        akcr.b(vjm, "<set-?>");
        this.h = vjm;
    }

    /* renamed from: a */
    public final void takeTarget(xmh xmh) {
        akcr.b(xmh, "target");
        super.takeTarget(xmh);
        xmh.getLifecycle().a(this);
    }

    public final void a(boolean z) {
        ajej c = ajdx.c((Callable) new j(this, z)).b((ajdw) c().i()).a((ajdw) c().l()).c((ajfb) new k(this, z)).c();
        akcr.a((Object) c, "Single.fromCallable {\n  …            }.subscribe()");
        ajvv.a(c, this.c);
    }

    public final vjm b() {
        vjm vjm = this.h;
        if (vjm == null) {
            akcr.a("preferredExportType");
        }
        return vjm;
    }

    public final zfw c() {
        return (zfw) this.i.b();
    }

    public final xbd d() {
        return (xbd) this.j.b();
    }

    public final void dropTarget() {
        xmh xmh = (xmh) getTarget();
        if (xmh != null) {
            defpackage.j lifecycle = xmh.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    /* Access modifiers changed, original: final */
    public final vjm e() {
        xdb xdb = this.b;
        if (xdb == null) {
            akcr.a(MapboxNavigationEvent.KEY_DEVICE);
        }
        return xdb instanceof xju ? vjm.SPECTACLES_CIRCLE_BLACK : vjm.SPECTACLES_CIRCLE_WHITE;
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        ajej c = ajcx.a((Runnable) new c(this)).c((Callable) new d(this)).b((ajdw) c().i()).a((ajdw) c().l()).c((ajfb) new e(this)).c();
        akcr.a((Object) c, "Completable.fromRunnable…             .subscribe()");
        ajvv.a(c, this.c);
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onDestroy() {
        this.c.a();
    }
}
