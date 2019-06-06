package com.snap.spectacles.lib.fragments.presenters;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.snap.spectacles.lib.fragments.SpectaclesManageFragment;
import com.snap.spectacles.sharedui.SpectaclesStatusBarView;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.aajt;
import defpackage.abbr;
import defpackage.abbz;
import defpackage.abcf;
import defpackage.abcg;
import defpackage.abcq;
import defpackage.abdv;
import defpackage.abdw;
import defpackage.abeb;
import defpackage.abur;
import defpackage.acgu;
import defpackage.acgw;
import defpackage.achb;
import defpackage.achd;
import defpackage.achi;
import defpackage.achk;
import defpackage.acig;
import defpackage.acip;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
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
import defpackage.jwc;
import defpackage.jwe;
import defpackage.jwf;
import defpackage.jwj;
import defpackage.kaz;
import defpackage.ojc;
import defpackage.xai;
import defpackage.xbd;
import defpackage.xci;
import defpackage.xdb;
import defpackage.xdf;
import defpackage.xfe;
import defpackage.xfu;
import defpackage.xjm;
import defpackage.xng;
import defpackage.xpg;
import defpackage.xpy;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.concurrent.Callable;

public final class SpectaclesStatusBarPresenter implements achk<zjm, zjk>, defpackage.k {
    final ajei a = new ajei();
    defpackage.j b;
    xfe c;
    abur<SpectaclesStatusBarView> d;
    final ajxe e;
    final Context f;
    final ajwy<achb<zjm, zjk>> g;
    final ajwy<xpg> h;
    final ajwy<dib> i;
    private final ajxe j;
    private final ajxe k;
    private final ajxe l;
    private final ajxe m;
    private final ajxe n;
    private final ajxe o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class g<V> implements Callable<Object> {
        private /* synthetic */ Object a;
        private /* synthetic */ akbl b;

        g(Object obj, akbl akbl) {
            this.a = obj;
            this.b = akbl;
        }

        public final /* synthetic */ Object call() {
            this.b.invoke(this.a);
            return ajxw.a;
        }
    }

    static final class l<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesStatusBarPresenter a;
        private /* synthetic */ Object b;
        private /* synthetic */ akbl c;

        l(SpectaclesStatusBarPresenter spectaclesStatusBarPresenter, Object obj, akbl akbl) {
            this.a = spectaclesStatusBarPresenter;
            this.b = obj;
            this.c = akbl;
        }

        public final /* synthetic */ Object call() {
            if (this.a.d == null) {
                return null;
            }
            this.c.invoke(this.b);
            return ajxw.a;
        }
    }

    public static final class e implements defpackage.xpg.b {
        final /* synthetic */ SpectaclesStatusBarPresenter a;
        final /* synthetic */ xdb b;

        static final class a extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
            private /* synthetic */ e a;

            a(e eVar) {
                this.a = eVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((abur) obj, "receiver$0");
                SpectaclesStatusBarPresenter spectaclesStatusBarPresenter = this.a.a;
                zjm zjm = new zjm(xai.f, "spectacles_incorrect_tag", false, false, true, false, null, false, false, false, false, null, 4076);
                Context context = spectaclesStatusBarPresenter.f;
                Object d = spectaclesStatusBarPresenter.d();
                String str = "navHost";
                akcr.a(d, str);
                zgy a = new defpackage.zgy.a(context, d, zjm, false, null, 24).a("Incorrect Firmware Tag Selected").b("The selected firmware tag does not apply to this version of Spectacles. Please select an appropriate tag from tweaks.").a((int) R.string.okay, (akbl) p.a, true).a();
                achb d2 = spectaclesStatusBarPresenter.d();
                Object d3 = spectaclesStatusBarPresenter.d();
                akcr.a(d3, str);
                d2.b((acig) new acip(d3, a, a.a));
                return ajxw.a;
            }
        }

        static final class b extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
            private /* synthetic */ e a;

            b(e eVar) {
                this.a = eVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((abur) obj, "receiver$0");
                SpectaclesStatusBarPresenter spectaclesStatusBarPresenter = this.a.a;
                achb d = this.a.a.d();
                String str = "navHost";
                akcr.a((Object) d, str);
                akcr.b(d, str);
                zgy a = new defpackage.zgy.a(spectaclesStatusBarPresenter.f, d, new zjm(xai.f, "spectacles_no_update_available", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).b((int) R.string.no_updates_found).a((int) R.string.okay, (akbl) r.a, true).a();
                d.a((achd) a, a.a, null);
                return ajxw.a;
            }
        }

        static final class c extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
            private /* synthetic */ e a;
            private /* synthetic */ String b;
            private /* synthetic */ String c;

            c(e eVar, String str, String str2) {
                this.a = eVar;
                this.b = str;
                this.c = str2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((abur) obj, "receiver$0");
                SpectaclesStatusBarPresenter spectaclesStatusBarPresenter = this.a.a;
                abcg abcg = abcg.PROMPT;
                xdb xdb = this.a.b;
                akcr.b(abcg, "action");
                String str = MapboxNavigationEvent.KEY_DEVICE;
                akcr.b(xdb, str);
                spectaclesStatusBarPresenter.b(spectaclesStatusBarPresenter, new j(xdb, abcg));
                spectaclesStatusBarPresenter = this.a.a;
                String str2 = this.b;
                String str3 = this.c;
                xdb xdb2 = this.a.b;
                akcr.b(str2, "newVersion");
                akcr.b(xdb2, str);
                zjm zjm = new zjm(xai.f, "firmware_update_dialog", false, false, true, false, null, false, false, false, false, null, 4076);
                String string = spectaclesStatusBarPresenter.f.getString(R.string.laguna_update_version, new Object[]{str2});
                int i = xdb2.j ? R.string.laguna_update_required_alert_body : R.string.laguna_update_disclaimer;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(spectaclesStatusBarPresenter.f.getString(i));
                stringBuilder.append(!TextUtils.isEmpty((CharSequence) str3) ? "\n\n".concat(String.valueOf(str3)) : "");
                str3 = stringBuilder.toString();
                Context context = spectaclesStatusBarPresenter.f;
                Object d = spectaclesStatusBarPresenter.d();
                akcr.a(d, "navHost");
                defpackage.zgy.a aVar = new defpackage.zgy.a(context, d, zjm, false, null, 24);
                akcr.a((Object) string, "title");
                zgy a = defpackage.zgy.a.a(aVar.a(string).b(str3).a((int) R.string.update_now, (akbl) new n(spectaclesStatusBarPresenter, xdb2, str2), true), (akbl) o.a, true, Integer.valueOf(R.string.update_later), null, null, 24).a();
                spectaclesStatusBarPresenter.d().a((achd) a, a.a, null);
                return ajxw.a;
            }
        }

        static final class d extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
            private /* synthetic */ e a;
            private /* synthetic */ boolean b;

            d(e eVar, boolean z) {
                this.a = eVar;
                this.b = z;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                achb d;
                acip acip;
                akcr.b((abur) obj, "receiver$0");
                String str = "navHost";
                SpectaclesStatusBarPresenter spectaclesStatusBarPresenter;
                zgy a;
                if (this.b) {
                    spectaclesStatusBarPresenter = this.a.a;
                    d = this.a.a.d();
                    akcr.a((Object) d, str);
                    akcr.b(d, str);
                    a = new defpackage.zgy.a(spectaclesStatusBarPresenter.f, d, new zjm(xai.f, "spectacles_no_connection_found", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).b((int) R.string.spectacles_network_unreachable).a((int) R.string.okay, (akbl) q.a, true).a();
                    acip = new acip(d, a, a.a);
                } else {
                    spectaclesStatusBarPresenter = this.a.a;
                    d = this.a.a.d();
                    akcr.a((Object) d, str);
                    akcr.b(d, str);
                    a = new defpackage.zgy.a(spectaclesStatusBarPresenter.f, d, new zjm(xai.f, "please_try_again", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).a((int) R.string.update_failed_to_download).b((int) R.string.firmware_update_something_went_wrong).a((int) R.string.okay, (akbl) s.a, true).a();
                    acip = new acip(d, a, a.a);
                }
                d.b((acig) acip);
                return ajxw.a;
            }
        }

        e(SpectaclesStatusBarPresenter spectaclesStatusBarPresenter, xdb xdb) {
            this.a = spectaclesStatusBarPresenter;
            this.b = xdb;
        }

        public final void a() {
            Object obj = this.a.d;
            if (obj != null) {
                this.a.a(obj, (akbl) new b(this));
            }
        }

        public final void a(String str, String str2, String str3) {
            akcr.b(str, "newVersion");
            akcr.b(str3, "latestVersionDigest");
            Object obj = this.a.d;
            if (obj != null) {
                this.a.a(obj, (akbl) new c(this, str, str2));
            }
        }

        public final void a(boolean z) {
            xci c = this.b.c();
            if (c != null) {
                c.e();
            }
            Object obj = this.a.d;
            if (obj != null) {
                this.a.a(obj, (akbl) new d(this, z));
            }
        }

        public final void b() {
            Object obj = this.a.d;
            if (obj != null) {
                this.a.a(obj, (akbl) new a(this));
            }
        }
    }

    static final class y<T> implements ajfb<ajxm<? extends xdb, ? extends xjm>> {
        private /* synthetic */ SpectaclesStatusBarPresenter a;

        y(SpectaclesStatusBarPresenter spectaclesStatusBarPresenter) {
            this.a = spectaclesStatusBarPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            SpectaclesStatusBarPresenter spectaclesStatusBarPresenter = this.a;
            xdb xdb = (xdb) ajxm.a;
            xjm xjm = (xjm) ajxm.b;
            defpackage.xjm.a b = xjm.b();
            if (b != null) {
                defpackage.akdd.e eVar;
                defpackage.akdd.e eVar2;
                switch (xng.a[b.ordinal()]) {
                    case 1:
                        Object c = xjm.c();
                        if (c != null) {
                            akcr.a(c, "transferState");
                            c = c.d();
                            if (!(c == null || (akcr.a(spectaclesStatusBarPresenter.c, c) ^ 1) == 0)) {
                                spectaclesStatusBarPresenter.c = c;
                                xfu m = spectaclesStatusBarPresenter.a().m();
                                xdf xdf = xdf.THUMBNAIL;
                                Object a = c.a();
                                String str = "mediaContent.mediaId";
                                akcr.a(a, str);
                                FileInputStream b2 = m.b(xdf, a, xdb.d);
                                jwc jwc = (jwc) spectaclesStatusBarPresenter.e.b();
                                c = c.a();
                                akcr.a(c, str);
                                ajej c2 = jwc.a(new jwf(c, new BufferedInputStream(b2)), spectaclesStatusBarPresenter.b()).b((ajdw) spectaclesStatusBarPresenter.c().f()).a((ajdw) spectaclesStatusBarPresenter.c().l()).c((ajfb) new z(spectaclesStatusBarPresenter, xdb, xjm)).c();
                                akcr.a((Object) c2, "bitmapLoader.loadBitmap(…             .subscribe()");
                                ajvv.a(c2, spectaclesStatusBarPresenter.a);
                            }
                        }
                        return;
                    case 2:
                    case 3:
                        eVar = new defpackage.akdd.e();
                        eVar.a = xpy.a(xjm, spectaclesStatusBarPresenter.f);
                        obj = spectaclesStatusBarPresenter.d;
                        if (obj != null) {
                            spectaclesStatusBarPresenter.a(obj, (akbl) new aa(eVar));
                        }
                        return;
                    case 4:
                    case 5:
                        eVar2 = new defpackage.akdd.e();
                        eVar2.a = xpy.a(xjm, spectaclesStatusBarPresenter.f);
                        obj = spectaclesStatusBarPresenter.d;
                        if (obj != null) {
                            spectaclesStatusBarPresenter.a(obj, (akbl) new ab(spectaclesStatusBarPresenter, eVar2, xdb));
                        }
                        return;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        eVar = new defpackage.akdd.e();
                        eVar.a = xpy.a(xjm, spectaclesStatusBarPresenter.f);
                        obj = spectaclesStatusBarPresenter.d;
                        if (obj != null) {
                            spectaclesStatusBarPresenter.a(obj, (akbl) new ac(eVar));
                        }
                        return;
                    case 14:
                    case 15:
                        eVar2 = new defpackage.akdd.e();
                        eVar2.a = xpy.a(xjm, spectaclesStatusBarPresenter.f);
                        Object obj2 = spectaclesStatusBarPresenter.d;
                        if (obj2 != null) {
                            spectaclesStatusBarPresenter.a(obj2, (akbl) new ad(spectaclesStatusBarPresenter, eVar2, xjm, xdb));
                        }
                        return;
                }
            }
            obj = spectaclesStatusBarPresenter.d;
            if (obj != null && obj.b()) {
                spectaclesStatusBarPresenter.a(obj, (akbl) ae.a);
            }
        }
    }

    static final class z<T> implements ajfb<kaz<jwj>> {
        private /* synthetic */ SpectaclesStatusBarPresenter a;
        private /* synthetic */ xdb b;
        private /* synthetic */ xjm c;

        z(SpectaclesStatusBarPresenter spectaclesStatusBarPresenter, xdb xdb, xjm xjm) {
            this.a = spectaclesStatusBarPresenter;
            this.b = xdb;
            this.c = xjm;
        }

        public final /* synthetic */ void accept(Object obj) {
            kaz kaz = (kaz) obj;
            Object a = xpy.a(this.c, this.a.f);
            abur abur = this.a.d;
            if (abur != null) {
                SpectaclesStatusBarView spectaclesStatusBarView = (SpectaclesStatusBarView) abur.a();
                if (spectaclesStatusBarView != null) {
                    akcr.a(a, "importingText");
                    SpectaclesStatusBarView.a(spectaclesStatusBarView, a, kaz, false, false, null, 28);
                }
            }
        }
    }

    static final class aa extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
        private /* synthetic */ defpackage.akdd.e a;

        aa(defpackage.akdd.e eVar) {
            this.a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            abur abur = (abur) obj;
            akcr.b(abur, "receiver$0");
            SpectaclesStatusBarView spectaclesStatusBarView = (SpectaclesStatusBarView) abur.a();
            Object obj2 = (String) this.a.a;
            akcr.a(obj2, "displayText");
            SpectaclesStatusBarView.a(spectaclesStatusBarView, obj2, null, false, true, null, 22);
            return ajxw.a;
        }
    }

    static final class ab extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
        final /* synthetic */ SpectaclesStatusBarPresenter a;
        final /* synthetic */ xdb b;
        private /* synthetic */ defpackage.akdd.e c;

        ab(SpectaclesStatusBarPresenter spectaclesStatusBarPresenter, defpackage.akdd.e eVar, xdb xdb) {
            this.a = spectaclesStatusBarPresenter;
            this.c = eVar;
            this.b = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final abur abur = (abur) obj;
            akcr.b(abur, "receiver$0");
            SpectaclesStatusBarView spectaclesStatusBarView = (SpectaclesStatusBarView) abur.a();
            Object obj2 = (String) this.c.a;
            akcr.a(obj2, "displayText");
            SpectaclesStatusBarView.a(spectaclesStatusBarView, obj2, null, false, true, new OnClickListener(this) {
                private /* synthetic */ ab a;

                public final void onClick(View view) {
                    abur.a();
                    achb d = this.a.a.d();
                    akcr.a((Object) d, "navHost");
                    zjm zjm = SpectaclesManageFragment.g;
                    MainPageFragment a = com.snap.spectacles.lib.fragments.SpectaclesManageFragment.a.a(this.a.b.d);
                    acgu acgu = SpectaclesManageFragment.i;
                    akcr.a((Object) acgu, "SpectaclesManageFragment…PECTACLES_DISMISS_DEFAULT");
                    acgu acgu2 = SpectaclesManageFragment.h;
                    akcr.a((Object) acgu2, "SpectaclesManageFragment…PECTACLES_PRESENT_DEFAULT");
                    SpectaclesStatusBarView.a(d, zjm, a, acgu, acgu2);
                }
            }, 6);
            return ajxw.a;
        }
    }

    static final class ac extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
        private /* synthetic */ defpackage.akdd.e a;

        ac(defpackage.akdd.e eVar) {
            this.a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            abur abur = (abur) obj;
            akcr.b(abur, "receiver$0");
            SpectaclesStatusBarView spectaclesStatusBarView = (SpectaclesStatusBarView) abur.a();
            Object obj2 = (String) this.a.a;
            akcr.a(obj2, "displayText");
            SpectaclesStatusBarView.a(spectaclesStatusBarView, obj2, null, false, false, null, 26);
            return ajxw.a;
        }
    }

    static final class ad extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
        final /* synthetic */ SpectaclesStatusBarPresenter a;
        final /* synthetic */ xdb b;
        private /* synthetic */ defpackage.akdd.e c;
        private /* synthetic */ xjm d;

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesStatusBarPresenter$ad$1 */
        public static final class AnonymousClass1 implements OnClickListener {
            private /* synthetic */ ad a;

            AnonymousClass1(ad adVar) {
                this.a = adVar;
            }

            public final void onClick(View view) {
                SpectaclesStatusBarPresenter spectaclesStatusBarPresenter = this.a.a;
                xdb xdb = this.a.b;
                akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
                spectaclesStatusBarPresenter.b(spectaclesStatusBarPresenter, new k(abdv.CHECK_UPDATE, xdb));
                spectaclesStatusBarPresenter.e().a(xdb, (defpackage.xpg.b) new e(spectaclesStatusBarPresenter, xdb));
                spectaclesStatusBarPresenter.b(spectaclesStatusBarPresenter, new i(xdb));
            }
        }

        ad(SpectaclesStatusBarPresenter spectaclesStatusBarPresenter, defpackage.akdd.e eVar, xjm xjm, xdb xdb) {
            this.a = spectaclesStatusBarPresenter;
            this.c = eVar;
            this.d = xjm;
            this.b = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            abur abur = (abur) obj;
            akcr.b(abur, "receiver$0");
            SpectaclesStatusBarView spectaclesStatusBarView = (SpectaclesStatusBarView) abur.a();
            Object obj2 = (String) this.c.a;
            akcr.a(obj2, "displayText");
            SpectaclesStatusBarView.a(spectaclesStatusBarView, obj2, null, this.d.b() == defpackage.xjm.a.FIRMWARE_UPDATE_REQUIRED, false, new AnonymousClass1(this), 10);
            return ajxw.a;
        }
    }

    static final class ae extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
        public static final ae a = new ae();

        ae() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            abur abur = (abur) obj;
            akcr.b(abur, "receiver$0");
            SpectaclesStatusBarView spectaclesStatusBarView = (SpectaclesStatusBarView) abur.a();
            kaz kaz = spectaclesStatusBarView.a;
            if (kaz != null) {
                kaz.dispose();
            }
            spectaclesStatusBarView.setVisibility(8);
            return ajxw.a;
        }
    }

    static final class b extends akcs implements akbk<jwc> {
        private /* synthetic */ jwe a;

        b(jwe jwe) {
            this.a = jwe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a();
        }
    }

    static final class c extends akcs implements akbk<dib> {
        private /* synthetic */ SpectaclesStatusBarPresenter a;

        c(SpectaclesStatusBarPresenter spectaclesStatusBarPresenter) {
            this.a = spectaclesStatusBarPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (dib) this.a.i.get();
        }
    }

    static final class d extends akcs implements akbk<idd> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return xai.f.callsite("SpectaclesStatusBarPresenter");
        }
    }

    static final class f extends akcs implements akbk<xpg> {
        private /* synthetic */ SpectaclesStatusBarPresenter a;

        f(SpectaclesStatusBarPresenter spectaclesStatusBarPresenter) {
            this.a = spectaclesStatusBarPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xpg) this.a.h.get();
        }
    }

    static final class h extends akcs implements akbk<achb<zjm, zjk>> {
        private /* synthetic */ SpectaclesStatusBarPresenter a;

        h(SpectaclesStatusBarPresenter spectaclesStatusBarPresenter) {
            this.a = spectaclesStatusBarPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (achb) this.a.g.get();
        }
    }

    static final class i extends akcs implements akbl<SpectaclesStatusBarPresenter, ajxw> {
        private /* synthetic */ xdb a;

        i(xdb xdb) {
            this.a = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesStatusBarPresenter spectaclesStatusBarPresenter = (SpectaclesStatusBarPresenter) obj;
            akcr.b(spectaclesStatusBarPresenter, "receiver$0");
            abbz abbz = new abbz();
            SpectaclesStatusBarPresenter.a((abeb) abbz, this.a);
            ((dib) spectaclesStatusBarPresenter.o.b()).a((aajt) abbz);
            return ajxw.a;
        }
    }

    static final class j extends akcs implements akbl<SpectaclesStatusBarPresenter, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ abcg b;

        j(xdb xdb, abcg abcg) {
            this.a = xdb;
            this.b = abcg;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesStatusBarPresenter spectaclesStatusBarPresenter = (SpectaclesStatusBarPresenter) obj;
            akcr.b(spectaclesStatusBarPresenter, "receiver$0");
            abcf abcf = new abcf();
            SpectaclesStatusBarPresenter.a((abeb) abcf, this.a);
            abcf.a(this.b);
            ((dib) spectaclesStatusBarPresenter.o.b()).a((aajt) abcf);
            return ajxw.a;
        }
    }

    static final class k extends akcs implements akbl<SpectaclesStatusBarPresenter, ajxw> {
        private /* synthetic */ abdv a;
        private /* synthetic */ xdb b;

        k(abdv abdv, xdb xdb) {
            this.a = abdv;
            this.b = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesStatusBarPresenter spectaclesStatusBarPresenter = (SpectaclesStatusBarPresenter) obj;
            akcr.b(spectaclesStatusBarPresenter, "receiver$0");
            abdw abdw = new abdw();
            abdw.a(this.a);
            abbr abbr = abdw;
            xdb xdb = this.b;
            abbr.b(xdb.d);
            abbr.c(xdb.h());
            abbr.d(xdb.p());
            abcq M = xdb.M();
            if (M != null) {
                abbr.a(M);
            }
            if (xdb.a().a != defpackage.xcy.a.CHARGER_STATE_UNKNOWN) {
                abbr.a(Boolean.valueOf(xdb.a().a.equals(defpackage.xcy.a.CHARGER_CONNECTED)));
            }
            if (xdb.a().b()) {
                abbr.a(Long.valueOf((long) xdb.a().a()));
            }
            if (xdb.g > 0) {
                abbr.b(Long.valueOf((long) xdb.g));
            }
            ((dib) spectaclesStatusBarPresenter.o.b()).a((aajt) abdw);
            return ajxw.a;
        }
    }

    static final class m extends akcs implements akbk<zfw> {
        private /* synthetic */ SpectaclesStatusBarPresenter a;
        private /* synthetic */ ajwy b;

        m(SpectaclesStatusBarPresenter spectaclesStatusBarPresenter, ajwy ajwy) {
            this.a = spectaclesStatusBarPresenter;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.b.get();
            return zgb.a(this.a.b());
        }
    }

    static final class n extends akcs implements akbl<View, ajxw> {
        final /* synthetic */ SpectaclesStatusBarPresenter a;
        final /* synthetic */ xdb b;
        private /* synthetic */ String c;

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesStatusBarPresenter$n$1 */
        public static final class AnonymousClass1 implements defpackage.xpg.c {
            final /* synthetic */ n a;

            static final class a extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
                private /* synthetic */ AnonymousClass1 a;
                private /* synthetic */ int b;
                private /* synthetic */ int c;

                a(AnonymousClass1 anonymousClass1, int i, int i2) {
                    this.a = anonymousClass1;
                    this.b = i;
                    this.c = i2;
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    akcr.b((abur) obj, "receiver$0");
                    SpectaclesStatusBarPresenter spectaclesStatusBarPresenter = this.a.a.a;
                    int i = this.b;
                    int i2 = this.c;
                    zjm zjm = new zjm(xai.f, "firmware_update_failed_low_battery", false, false, true, false, null, false, false, false, false, null, 4076);
                    Context context = spectaclesStatusBarPresenter.f;
                    Object d = spectaclesStatusBarPresenter.d();
                    String str = "navHost";
                    akcr.a(d, str);
                    defpackage.zgy.a a = new defpackage.zgy.a(context, d, zjm, false, null, 24).a((int) R.string.low_battery_title, Integer.valueOf(i));
                    String string = spectaclesStatusBarPresenter.f.getString(R.string.spectacles_update_low_battery, new Object[]{Integer.valueOf(i2)});
                    akcr.a((Object) string, "context.getString(com.sn…ery, minimumBatteryLevel)");
                    zgy a2 = a.b(string).a((int) R.string.okay, (akbl) v.a, true).a();
                    achb d2 = spectaclesStatusBarPresenter.d();
                    Object d3 = spectaclesStatusBarPresenter.d();
                    akcr.a(d3, str);
                    d2.b((acig) new acip(d3, a2, a2.a));
                    return ajxw.a;
                }
            }

            static final class b extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
                private /* synthetic */ AnonymousClass1 a;

                b(AnonymousClass1 anonymousClass1) {
                    this.a = anonymousClass1;
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    akcr.b((abur) obj, "receiver$0");
                    SpectaclesStatusBarPresenter spectaclesStatusBarPresenter = this.a.a.a;
                    zjm zjm = new zjm(xai.f, "firmware_update_failed_battery_cold", false, false, true, false, null, false, false, false, false, null, 4076);
                    Context context = spectaclesStatusBarPresenter.f;
                    Object d = spectaclesStatusBarPresenter.d();
                    String str = "navHost";
                    akcr.a(d, str);
                    zgy a = new defpackage.zgy.a(context, d, zjm, false, null, 24).a((int) R.string.spectacles_too_cold).b((int) R.string.spectacles_firmware_update_battery_too_cold).a((int) R.string.okay, (akbl) t.a, true).a();
                    achb d2 = spectaclesStatusBarPresenter.d();
                    Object d3 = spectaclesStatusBarPresenter.d();
                    akcr.a(d3, str);
                    d2.b((acig) new acip(d3, a, a.a));
                    return ajxw.a;
                }
            }

            static final class c extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
                private /* synthetic */ AnonymousClass1 a;

                c(AnonymousClass1 anonymousClass1) {
                    this.a = anonymousClass1;
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    akcr.b((abur) obj, "receiver$0");
                    SpectaclesStatusBarPresenter spectaclesStatusBarPresenter = this.a.a.a;
                    zjm zjm = new zjm(xai.f, "firmware_update_failed_battery_hot", false, false, true, false, null, false, false, false, false, null, 4076);
                    Context context = spectaclesStatusBarPresenter.f;
                    Object d = spectaclesStatusBarPresenter.d();
                    String str = "navHost";
                    akcr.a(d, str);
                    zgy a = new defpackage.zgy.a(context, d, zjm, false, null, 24).a((int) R.string.spectacles_too_hot).b((int) R.string.spectacles_firmware_update_battery_too_hot).a((int) R.string.okay, (akbl) u.a, true).a();
                    achb d2 = spectaclesStatusBarPresenter.d();
                    Object d3 = spectaclesStatusBarPresenter.d();
                    akcr.a(d3, str);
                    d2.b((acig) new acip(d3, a, a.a));
                    return ajxw.a;
                }
            }

            static final class d extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
                private /* synthetic */ AnonymousClass1 a;

                d(AnonymousClass1 anonymousClass1) {
                    this.a = anonymousClass1;
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    abur abur = (abur) obj;
                    akcr.b(abur, "receiver$0");
                    abur.a();
                    achb d = this.a.a.a.d();
                    akcr.a((Object) d, "navHost");
                    zjm zjm = SpectaclesManageFragment.g;
                    MainPageFragment a = com.snap.spectacles.lib.fragments.SpectaclesManageFragment.a.a(this.a.a.b.d);
                    acgu acgu = SpectaclesManageFragment.i;
                    akcr.a((Object) acgu, "SpectaclesManageFragment…PECTACLES_DISMISS_DEFAULT");
                    acgu acgu2 = SpectaclesManageFragment.h;
                    akcr.a((Object) acgu2, "SpectaclesManageFragment…PECTACLES_PRESENT_DEFAULT");
                    SpectaclesStatusBarView.a(d, zjm, a, acgu, acgu2);
                    return ajxw.a;
                }
            }

            static final class e extends akcs implements akbl<abur<SpectaclesStatusBarView>, ajxw> {
                private /* synthetic */ AnonymousClass1 a;

                e(AnonymousClass1 anonymousClass1) {
                    this.a = anonymousClass1;
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    akcr.b((abur) obj, "receiver$0");
                    SpectaclesStatusBarPresenter spectaclesStatusBarPresenter = this.a.a.a;
                    zjm zjm = new zjm(xai.f, "firmware_update_failed_phone_storage_low", false, false, true, false, null, false, false, false, false, null, 4076);
                    Context context = spectaclesStatusBarPresenter.f;
                    Object d = spectaclesStatusBarPresenter.d();
                    String str = "navHost";
                    akcr.a(d, str);
                    zgy a = new defpackage.zgy.a(context, d, zjm, false, null, 24).a((int) R.string.low_phone_storage_title).b((int) R.string.spectacles_firmware_update_phone_storage_low).a((int) R.string.okay, (akbl) w.a, true).a();
                    achb d2 = spectaclesStatusBarPresenter.d();
                    Object d3 = spectaclesStatusBarPresenter.d();
                    akcr.a(d3, str);
                    d2.b((acig) new acip(d3, a, a.a));
                    return ajxw.a;
                }
            }

            AnonymousClass1(n nVar) {
                this.a = nVar;
            }

            public final void a() {
                Object obj = this.a.a.d;
                if (obj != null) {
                    this.a.a.a(obj, (akbl) new d(this));
                }
            }

            public final void a(int i, int i2) {
                Object obj = this.a.a.d;
                if (obj != null) {
                    this.a.a.a(obj, (akbl) new a(this, i, i2));
                }
            }

            public final void b() {
                Object obj = this.a.a.d;
                if (obj != null) {
                    this.a.a.a(obj, (akbl) new c(this));
                }
            }

            public final void c() {
                Object obj = this.a.a.d;
                if (obj != null) {
                    this.a.a.a(obj, (akbl) new b(this));
                }
            }

            public final void d() {
                Object obj = this.a.a.d;
                if (obj != null) {
                    this.a.a.a(obj, (akbl) new e(this));
                }
            }
        }

        n(SpectaclesStatusBarPresenter spectaclesStatusBarPresenter, xdb xdb, String str) {
            this.a = spectaclesStatusBarPresenter;
            this.b = xdb;
            this.c = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.e().a(this.b, this.c, (defpackage.xpg.c) new AnonymousClass1(this));
            return ajxw.a;
        }
    }

    static final class o extends akcs implements akbl<View, ajxw> {
        public static final o a = new o();

        o() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class p extends akcs implements akbl<View, ajxw> {
        public static final p a = new p();

        p() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class q extends akcs implements akbl<View, ajxw> {
        public static final q a = new q();

        q() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class r extends akcs implements akbl<View, ajxw> {
        public static final r a = new r();

        r() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class s extends akcs implements akbl<View, ajxw> {
        public static final s a = new s();

        s() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class t extends akcs implements akbl<View, ajxw> {
        public static final t a = new t();

        t() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class u extends akcs implements akbl<View, ajxw> {
        public static final u a = new u();

        u() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class v extends akcs implements akbl<View, ajxw> {
        public static final v a = new v();

        v() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class w extends akcs implements akbl<View, ajxw> {
        public static final w a = new w();

        w() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class x extends akcs implements akbk<xbd> {
        private /* synthetic */ ajwy a;

        x(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xbd) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SpectaclesStatusBarPresenter.class), "specsCoreComponent", "getSpecsCoreComponent()Lcom/snap/spectacles/base/di/components/SpectaclesCoreComponent;"), new akdc(akde.a(SpectaclesStatusBarPresenter.class), "callSite", "getCallSite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(SpectaclesStatusBarPresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(SpectaclesStatusBarPresenter.class), "navHost", "getNavHost()Lcom/snapchat/deck/api/NavigationHost;"), new akdc(akde.a(SpectaclesStatusBarPresenter.class), "firmwareUpdatesChecker", "getFirmwareUpdatesChecker()Lcom/snap/spectacles/lib/main/firmwareupdate/SpectaclesFirmwareUpdatesChecker;"), new akdc(akde.a(SpectaclesStatusBarPresenter.class), "blizzardEventLogger", "getBlizzardEventLogger()Lcom/snap/blizzard/BlizzardEventLogger;"), new akdc(akde.a(SpectaclesStatusBarPresenter.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;")};
        a aVar = new a();
    }

    public SpectaclesStatusBarPresenter(ajwy<xbd> ajwy, Context context, ajwy<zgb> ajwy2, ajwy<achb<zjm, zjk>> ajwy3, ajwy<xpg> ajwy4, ajwy<dib> ajwy5, jwe jwe) {
        akcr.b(ajwy, "specsCoreComponentProvider");
        akcr.b(context, "context");
        akcr.b(ajwy2, "schedulersProvider");
        akcr.b(ajwy3, "navigationHost");
        akcr.b(ajwy4, "firmwareUpdatesCheckerLazy");
        akcr.b(ajwy5, "blizzardEventLoggerLazy");
        akcr.b(jwe, "bitmapLoaderFactory");
        this.f = context;
        this.g = ajwy3;
        this.h = ajwy4;
        this.i = ajwy5;
        this.j = ajxh.a(new x(ajwy));
        this.k = ajxh.a(d.a);
        this.l = ajxh.a(new m(this, ajwy2));
        this.m = ajxh.a(new h(this));
        this.n = ajxh.a(new f(this));
        this.o = ajxh.a(new c(this));
        this.e = ajxh.a(new b(jwe));
    }

    /* Access modifiers changed, original: final */
    public final xbd a() {
        return (xbd) this.j.b();
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    /* Access modifiers changed, original: final */
    public final <T> boolean a(T t, akbl<? super T, ajxw> akbl) {
        return this.a.a(ajcx.b((Callable) new l(this, t, akbl)).b((ajdw) c().l()).e());
    }

    /* Access modifiers changed, original: final */
    public final <T> ajej b(T t, akbl<? super T, ajxw> akbl) {
        Object e = ajcx.b((Callable) new g(t, akbl)).b((ajdw) c().f()).e();
        akcr.a(e, "Completable.fromCallable…edulers.io()).subscribe()");
        return e;
    }

    /* Access modifiers changed, original: final */
    public final idd b() {
        return (idd) this.k.b();
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        Object obj = 1;
        Object obj2 = (achi.d == acgw.PRESENT && akcr.a((zjm) achi.f.e(), ojc.a)) ? 1 : null;
        if (obj2 != null) {
            f();
            return;
        }
        if (!(achi.d == acgw.DISMISS && akcr.a((zjm) achi.e.e(), ojc.a))) {
            obj = null;
        }
        if (obj != null) {
            this.a.a();
        }
    }

    /* Access modifiers changed, original: final */
    public final zfw c() {
        return (zfw) this.l.b();
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    /* Access modifiers changed, original: final */
    public final achb<zjm, zjk> d() {
        return (achb) this.m.b();
    }

    /* Access modifiers changed, original: final */
    public final xpg e() {
        return (xpg) this.n.b();
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        ajej f = a().e().j().b((ajdw) c().f()).f((ajfb) new y(this));
        akcr.a((Object) f, "specsCoreComponent.event…second)\n                }");
        ajvv.a(f, this.a);
    }

    @defpackage.s(a = defpackage.j.a.ON_PAUSE)
    public final void onPause() {
        this.a.a();
    }

    @defpackage.s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        f();
    }
}
