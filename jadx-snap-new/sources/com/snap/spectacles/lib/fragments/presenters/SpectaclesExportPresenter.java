package com.snap.spectacles.lib.fragments.presenters;

import android.content.Context;
import com.snapchat.android.R;
import defpackage.aajt;
import defpackage.abdx;
import defpackage.abdy;
import defpackage.abdz;
import defpackage.abtl;
import defpackage.abyi;
import defpackage.abyj;
import defpackage.ajcx;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajeb;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajot;
import defpackage.ajvo;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxk;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.ajxw;
import defpackage.ajyl;
import defpackage.ajyw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.dib;
import defpackage.ftl;
import defpackage.idd;
import defpackage.jwa;
import defpackage.jwb;
import defpackage.jwu;
import defpackage.jxr;
import defpackage.kaz;
import defpackage.ofa;
import defpackage.s;
import defpackage.vjm;
import defpackage.xag;
import defpackage.xai;
import defpackage.xjd;
import defpackage.xmc;
import defpackage.xmf;
import defpackage.xms;
import defpackage.xqi;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zll;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class SpectaclesExportPresenter extends zll<xmf> implements defpackage.k {
    public xag a;
    final ajxe b = ajxh.a(new d(this));
    List<xmc> c = ajyw.a;
    public final ajei d = new ajei();
    final jwb e;
    final ofa f;
    final dib g;
    final ajwy<ftl> h;
    private final ajxe i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class f<V> implements Callable<Object> {
        private /* synthetic */ Object a;
        private /* synthetic */ akbl b;

        f(Object obj, akbl akbl) {
            this.a = obj;
            this.b = akbl;
        }

        public final /* synthetic */ Object call() {
            this.b.invoke(this.a);
            return ajxw.a;
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

    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ SpectaclesExportPresenter a;

        e(SpectaclesExportPresenter spectaclesExportPresenter) {
            this.a = spectaclesExportPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SpectaclesExportPresenter spectaclesExportPresenter = this.a;
            spectaclesExportPresenter.b(spectaclesExportPresenter, AnonymousClass1.a);
        }
    }

    public static final class k<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ SpectaclesExportPresenter a;

        public k(SpectaclesExportPresenter spectaclesExportPresenter) {
            this.a = spectaclesExportPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abyi abyi = (abyi) obj;
            akcr.b(abyi, "it");
            SpectaclesExportPresenter spectaclesExportPresenter = this.a;
            abtl b = abyj.b(abyi.e);
            ofa ofa = spectaclesExportPresenter.f;
            idd callsite = xai.f.callsite("SpectaclesExportPresenter");
            Object a = new abtl(b.b(), b.c()).a(0.9d);
            akcr.a(a, "Resolution(resolution.wi…  .scale(THUMBNAIL_SCALE)");
            obj = ofa.a(callsite, abyi, 1, a, spectaclesExportPresenter.d).c((ajfb) new e(spectaclesExportPresenter)).f((ajdt) ajvo.a(ajot.a));
            akcr.a(obj, "thumbnailGenerator\n     …eNext(Observable.empty())");
            return obj;
        }
    }

    public static final class l<T, R> implements ajfc<T, R> {
        private /* synthetic */ SpectaclesExportPresenter a;
        private /* synthetic */ Context b;

        public l(SpectaclesExportPresenter spectaclesExportPresenter, Context context) {
            this.a = spectaclesExportPresenter;
            this.b = context;
        }

        public final /* synthetic */ Object apply(Object obj) {
            jwu jwu = (jwu) obj;
            akcr.b(jwu, "mediaThumbnail");
            List arrayList = new ArrayList();
            jwa a = this.a.e.a(xai.f);
            vjm vjm = vjm.SPECTACLES_CIRCLE_BLACK;
            kaz kaz = jwu.a;
            Object string = this.b.getString(R.string.spectacles_export_format_black_border);
            akcr.a(string, "context.getString(com.sn…port_format_black_border)");
            arrayList.add(new xmc(vjm, kaz, string));
            vjm = vjm.SPECTACLES_CIRCLE_WHITE;
            String str = "Spectacles";
            Object a2 = a.a(jwu.a.a(str), ajyl.a(new jxr(this.b)));
            akcr.a(a2, "bitmapFactory.transformA…Transformation(context)))");
            Object string2 = this.b.getString(R.string.spectacles_export_format_white_border);
            akcr.a(string2, "context.getString(com.sn…port_format_white_border)");
            arrayList.add(new xmc(vjm, a2, string2));
            vjm = vjm.SPECTACLES_HORIZONTAL_16_9;
            a2 = a.a(jwu.a.a(str), ajyl.a(new xqi(vjm.SPECTACLES_HORIZONTAL_16_9, this.b)));
            akcr.a(a2, "bitmapFactory.transformA…RIZONTAL_16_9, context)))");
            string2 = this.b.getString(R.string.spectacles_export_format_16_9);
            akcr.a(string2, "context.getString(com.sn…acles_export_format_16_9)");
            arrayList.add(new xmc(vjm, a2, string2));
            vjm = vjm.SPECTACLES_HORIZONTAL_4_3;
            a2 = a.a(jwu.a.a(str), ajyl.a(new xqi(vjm.SPECTACLES_HORIZONTAL_4_3, this.b)));
            akcr.a(a2, "bitmapFactory.transformA…ORIZONTAL_4_3, context)))");
            string2 = this.b.getString(R.string.spectacles_export_format_4_3);
            akcr.a(string2, "context.getString(com.sn…tacles_export_format_4_3)");
            arrayList.add(new xmc(vjm, a2, string2));
            vjm = vjm.SPECTACLES_PORTRAIT_9_16;
            a2 = a.a(jwu.a.a(str), ajyl.a(new xqi(vjm.SPECTACLES_PORTRAIT_9_16, this.b)));
            akcr.a(a2, "bitmapFactory.transformA…PORTRAIT_9_16, context)))");
            string2 = this.b.getString(R.string.spectacles_export_format_9_16);
            akcr.a(string2, "context.getString(com.sn…acles_export_format_9_16)");
            arrayList.add(new xmc(vjm, a2, string2));
            vjm = vjm.SPECTACLES_SQUARE;
            a2 = a.a(jwu.a.a(str), ajyl.a(new xqi(vjm.SPECTACLES_SQUARE, this.b)));
            akcr.a(a2, "bitmapFactory.transformA…TACLES_SQUARE, context)))");
            string2 = this.b.getString(R.string.spectacles_export_format_square);
            akcr.a(string2, "context.getString(com.sn…les_export_format_square)");
            arrayList.add(new xmc(vjm, a2, string2));
            if (SpectaclesExportPresenter.a(this.a)) {
                vjm = vjm.SPECTACLES_NEWPORT;
                obj = a.a(jwu.a.a(str), ajyl.a(new xqi(vjm.SPECTACLES_NEWPORT, this.b)));
                akcr.a(obj, "bitmapFactory.transformA…ACLES_NEWPORT, context)))");
                Object string3 = this.b.getString(R.string.spectacles_export_format_newport);
                akcr.a(string3, "context.getString(com.sn…es_export_format_newport)");
                arrayList.add(new xmc(vjm, obj, string3, this.b.getString(R.string.spectacles_export_format_newport_description)));
            }
            return arrayList;
        }
    }

    public static final class m<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ SpectaclesExportPresenter a;

        public m(SpectaclesExportPresenter spectaclesExportPresenter) {
            this.a = spectaclesExportPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final List list = (List) obj;
            akcr.b(list, "exportViewDataList");
            return ((ftl) this.a.b.b()).m(xjd.SPECTACLES_LAST_EXPORT_TYPE).f(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    vjm vjm = (vjm) obj;
                    akcr.b(vjm, "it");
                    return ajxs.a(list, vjm);
                }
            });
        }
    }

    public static final class n<T> implements ajfb<ajxm<? extends List<xmc>, ? extends vjm>> {
        private /* synthetic */ SpectaclesExportPresenter a;

        public n(SpectaclesExportPresenter spectaclesExportPresenter) {
            this.a = spectaclesExportPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            List list = (List) ajxm.a;
            vjm vjm = (vjm) ajxm.b;
            SpectaclesExportPresenter spectaclesExportPresenter = this.a;
            akcr.a((Object) list, "exportViewDataList");
            akcr.b(list, "<set-?>");
            spectaclesExportPresenter.c = list;
            Iterable<xmc> iterable = list;
            Object obj2 = 1;
            if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                for (xmc xmc : iterable) {
                    Object obj3;
                    if (xmc.a == vjm) {
                        obj3 = 1;
                        continue;
                    } else {
                        obj3 = null;
                        continue;
                    }
                    if (obj3 != null) {
                        break;
                    }
                }
            }
            obj2 = null;
            if (obj2 == null) {
                vjm = vjm.SPECTACLES_CIRCLE_BLACK;
            }
            akcr.a((Object) vjm, "if (hasLastExportType) l…e.SPECTACLES_CIRCLE_BLACK");
            xmf xmf = (xmf) this.a.getTarget();
            if (xmf != null) {
                xmf.a(list, vjm);
            }
        }
    }

    public static final class b extends akcs implements akbl<SpectaclesExportPresenter, ajxw> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesExportPresenter spectaclesExportPresenter = (SpectaclesExportPresenter) obj;
            akcr.b(spectaclesExportPresenter, "receiver$0");
            abdx abdx = new abdx();
            abdx.a(abdy.CANCEL);
            abdx.a(abdz.CUSTOM_EXPORT_PROMPT);
            spectaclesExportPresenter.g.a((aajt) abdx);
            return ajxw.a;
        }
    }

    public static final class c extends akcs implements akbl<SpectaclesExportPresenter, ajxw> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesExportPresenter spectaclesExportPresenter = (SpectaclesExportPresenter) obj;
            akcr.b(spectaclesExportPresenter, "receiver$0");
            xmf xmf = (xmf) spectaclesExportPresenter.getTarget();
            if (xmf != null) {
                xmf.a(false, SpectaclesExportPresenter.b(spectaclesExportPresenter));
            }
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbk<ftl> {
        private /* synthetic */ SpectaclesExportPresenter a;

        d(SpectaclesExportPresenter spectaclesExportPresenter) {
            this.a = spectaclesExportPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.h.get();
        }
    }

    static final class h extends akcs implements akbk<zfw> {
        private /* synthetic */ ajwy a;

        h(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(xai.f.callsite("SpectaclesExportPresenter"));
        }
    }

    public static final class i extends akcs implements akbl<SpectaclesExportPresenter, ajxw> {
        private /* synthetic */ vjm a;

        public i(vjm vjm) {
            this.a = vjm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            abdy abdy;
            SpectaclesExportPresenter spectaclesExportPresenter = (SpectaclesExportPresenter) obj;
            akcr.b(spectaclesExportPresenter, "receiver$0");
            abdx abdx = new abdx();
            switch (xms.a[this.a.ordinal()]) {
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
                    StringBuilder stringBuilder = new StringBuilder("export type not supported ");
                    stringBuilder.append(this.a);
                    throw new IllegalStateException(stringBuilder.toString());
                default:
                    throw new ajxk();
            }
            abdx.a(abdy);
            spectaclesExportPresenter.g.a((aajt) abdx);
            return ajxw.a;
        }
    }

    public static final class j extends akcs implements akbl<SpectaclesExportPresenter, ajxw> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesExportPresenter spectaclesExportPresenter = (SpectaclesExportPresenter) obj;
            akcr.b(spectaclesExportPresenter, "receiver$0");
            abdx abdx = new abdx();
            abdx.a(abdy.START);
            spectaclesExportPresenter.g.a((aajt) abdx);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SpectaclesExportPresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(SpectaclesExportPresenter.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;")};
        a aVar = new a();
    }

    public SpectaclesExportPresenter(ajwy<zgb> ajwy, jwb jwb, ofa ofa, dib dib, ajwy<ftl> ajwy2) {
        akcr.b(ajwy, "schedulersProvider");
        akcr.b(jwb, "bitmapFactoryProvider");
        akcr.b(ofa, "thumbnailGenerator");
        akcr.b(dib, "blizzardEventLogger");
        akcr.b(ajwy2, "configProviderLazy");
        this.e = jwb;
        this.f = ofa;
        this.g = dib;
        this.h = ajwy2;
        this.i = ajxh.a(new h(ajwy));
    }

    public static final /* synthetic */ xag b(SpectaclesExportPresenter spectaclesExportPresenter) {
        xag xag = spectaclesExportPresenter.a;
        if (xag == null) {
            akcr.a("request");
        }
        return xag;
    }

    public final <T> ajej a(T t, akbl<? super T, ajxw> akbl) {
        Object e = ajcx.b((Callable) new f(t, akbl)).b((ajdw) a().f()).e();
        akcr.a(e, "Completable.fromCallable…edulers.io()).subscribe()");
        return e;
    }

    public final zfw a() {
        return (zfw) this.i.b();
    }

    /* renamed from: a */
    public final void takeTarget(xmf xmf) {
        akcr.b(xmf, "target");
        super.takeTarget(xmf);
        xmf.getLifecycle().a(this);
    }

    public final <T> ajej b(T t, akbl<? super T, ajxw> akbl) {
        Object e = ajcx.b((Callable) new g(t, akbl)).b((ajdw) a().l()).e();
        akcr.a(e, "Completable.fromCallable…mainThread()).subscribe()");
        return e;
    }

    public final void dropTarget() {
        xmf xmf = (xmf) getTarget();
        if (xmf != null) {
            defpackage.j lifecycle = xmf.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onDestroy() {
        this.d.dispose();
        for (xmc dispose : this.c) {
            dispose.dispose();
        }
    }
}
