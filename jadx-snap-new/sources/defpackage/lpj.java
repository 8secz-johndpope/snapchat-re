package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.snapchat.android.R;
import defpackage.kqe.ak;
import defpackage.lqo.a.a;
import defpackage.lqr.b;
import defpackage.lrj.c;
import defpackage.lrj.e;
import defpackage.lrj.f;
import defpackage.lyl.d;
import java.util.List;
import java.util.Set;

/* renamed from: lpj */
public abstract class lpj implements b, c, lwe.c, lxk.c, d, lzy.c, mal.c, may.d, mbz.b, mcx.d, mdu.d, mge.d, mgp.d, mha, mzv.d {

    /* renamed from: lpj$d */
    public interface d {
        kqf A();

        lxh B();

        mqt C();

        myv D();

        kpk E();

        ide I();

        mwe J();

        miw K_();

        zgb u();

        Context v();

        Supplier<iha> w();

        ajdp<mmt> y();

        ajdp<lqf> z();
    }

    /* renamed from: lpj$b */
    public static final class b {

        /* renamed from: lpj$b$a */
        public static final class a extends akcs implements akbl<mji, ajcx> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((mji) obj, "it");
                obj = ajvo.a(ajib.a);
                akcr.a(obj, "Completable.never()");
                return obj;
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lpj$a */
    public static abstract class a {
        public d a;
        public akbl<Context, jn> b;
        public lqp c = lqp.n;
        public ajdp<Boolean> d;
        public ajdp<Boolean> e;
        public ajdp<ajxw> f;

        public a() {
            Object b = ajdp.b(Boolean.FALSE);
            String str = "Observable.just(false)";
            akcr.a(b, str);
            this.d = b;
            b = ajdp.b(Boolean.FALSE);
            akcr.a(b, str);
            this.e = b;
            b = ajvo.a(ajot.a);
            akcr.a(b, "Observable.empty()");
            this.f = b;
        }

        public abstract a a(ajdp<ViewGroup> ajdp);

        public abstract a a(ajfb<ajxr<mhs, List<mhs>, ak>> ajfb);

        public abstract a a(akbl<Context, jn> akbl);

        public abstract a a(String str);

        public abstract a a(lpi lpi);

        public abstract a a(d dVar);

        public final a a(lqp lqp) {
            akcr.b(lqp, "layoutConfiguration");
            a aVar = this;
            aVar.c = lqp;
            aVar.b(lqp);
            return aVar;
        }

        public abstract a a(lth lth);

        public abstract a a(mtj mtj);

        public abstract a a(mvu mvu);

        public abstract a a(mwa mwa);

        public abstract a a(mzk mzk);

        public abstract a a(boolean z);

        public abstract lpj a();

        public final a b(ajdp<ajxw> ajdp) {
            akcr.b(ajdp, "signal");
            a aVar = this;
            Object e = aVar.f.e((ajdt) ajdp);
            akcr.a(e, "startButtonLoadingSignal.mergeWith(signal)");
            aVar.f = e;
            aVar.j(aVar.f);
            return aVar;
        }

        public abstract a b(ajfb<lqo> ajfb);

        public abstract a b(akbl<? super mji, ? extends ajcx> akbl);

        public abstract a b(lqp lqp);

        public abstract a b(boolean z);

        public abstract a c(ajdp<View> ajdp);

        public abstract a c(ajfb<lwo> ajfb);

        public abstract a c(boolean z);

        public abstract a d(ajdp<Boolean> ajdp);

        public abstract a e(ajdp<Boolean> ajdp);

        public abstract a f(ajdp<Double> ajdp);

        public abstract a g(ajdp<mih> ajdp);

        public abstract a h(ajdp<ViewStub> ajdp);

        public abstract a i(ajdp<View> ajdp);

        public abstract a j(ajdp<ajxw> ajdp);
    }

    /* renamed from: lpj$c */
    public static final class c {

        /* renamed from: lpj$c$f */
        static final class f<T> implements ajfl<lqo> {
            public static final f a = new f();

            f() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                lqo lqo = (lqo) obj;
                akcr.b(lqo, "it");
                return akcr.a(lqo.a(), a.a);
            }
        }

        /* renamed from: lpj$c$e */
        static final class e extends akcq implements akbl<lqo, ajxw> {
            e(ajws ajws) {
                super(1, ajws);
            }

            public final String getName() {
                return "onNext";
            }

            public final akej getOwner() {
                return akde.a(ajws.class);
            }

            public final String getSignature() {
                return "onNext(Ljava/lang/Object;)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                lqo lqo = (lqo) obj;
                akcr.b(lqo, "p1");
                ((ajws) this.receiver).a((Object) lqo);
                return ajxw.a;
            }
        }

        /* renamed from: lpj$c$a */
        static final class a extends akcq implements akbl<Boolean, ajxw> {
            a(ajws ajws) {
                super(1, ajws);
            }

            public final String getName() {
                return "onNext";
            }

            public final akej getOwner() {
                return akde.a(ajws.class);
            }

            public final String getSignature() {
                return "onNext(Ljava/lang/Object;)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((ajws) this.receiver).a((Object) Boolean.valueOf(((Boolean) obj).booleanValue()));
                return ajxw.a;
            }
        }

        /* renamed from: lpj$c$b */
        static final class b extends akcq implements akbl<Boolean, ajxw> {
            b(ajws ajws) {
                super(1, ajws);
            }

            public final String getName() {
                return "onNext";
            }

            public final akej getOwner() {
                return akde.a(ajws.class);
            }

            public final String getSignature() {
                return "onNext(Ljava/lang/Object;)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((ajws) this.receiver).a((Object) Boolean.valueOf(((Boolean) obj).booleanValue()));
                return ajxw.a;
            }
        }

        /* renamed from: lpj$c$c */
        static final class c<T> implements ajfl<lqo> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                lqo lqo = (lqo) obj;
                akcr.b(lqo, "it");
                return akcr.a(lqo.a(), defpackage.lqo.a.c.a);
            }
        }

        /* renamed from: lpj$c$d */
        static final class d<T, R> implements ajfc<T, R> {
            public static final d a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                boolean z;
                lqo lqo = (lqo) obj;
                akcr.b(lqo, "appearance");
                if (lqo instanceof defpackage.lqo.c) {
                    z = false;
                } else if (lqo instanceof lqo.b) {
                    z = true;
                } else {
                    throw new ajxk();
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: lpj$c$h */
        static final class h extends akcs implements akbl<mux, Boolean> {
            private /* synthetic */ lqp a;
            private /* synthetic */ lpj b;
            private /* synthetic */ ajdp c;
            private /* synthetic */ ajdp d;
            private /* synthetic */ boolean e;
            private /* synthetic */ ajdp f;

            h(lqp lqp, lpj lpj, ajdp ajdp, ajdp ajdp2, boolean z, ajdp ajdp3) {
                this.a = lqp;
                this.b = lpj;
                this.c = ajdp;
                this.d = ajdp2;
                this.e = z;
                this.f = ajdp3;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mux mux = (mux) obj;
                akcr.b(mux, "lens");
                boolean z = mux.a() && (akcr.a(mux.k, mwg.a.a) || mux.k == muu.UNLOCKED || this.e);
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: lpj$c$g */
        static final class g<T, R> implements ajfc<T, R> {
            public static final g a = new g();

            g() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                boolean z;
                lqo lqo = (lqo) obj;
                akcr.b(lqo, "appearance");
                if (lqo instanceof defpackage.lqo.c) {
                    z = false;
                } else if (lqo instanceof lqo.b) {
                    z = true;
                } else {
                    throw new ajxk();
                }
                return Boolean.valueOf(z);
            }
        }

        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final mhi<? extends mha> a(lpj lpj, ajdp<mih> ajdp, lqp lqp, ajdp<ViewGroup> ajdp2, ajdp<lqo> ajdp3, ajdp<Boolean> ajdp4) {
            String str = "Observable.empty()";
            String str2 = "parentComponent";
            akcr.b(lpj, "component");
            akcr.b(ajdp, "windowRect");
            akcr.b(lqp, "layoutConfiguration");
            akcr.b(ajdp2, "viewGroupProvider");
            akcr.b(ajdp3, "controlAppearance");
            akcr.b(ajdp4, "carouselHideSignal");
            Integer num = lqp.l;
            if (num == null) {
                return mhc.a;
            }
            int intValue = num.intValue();
            Object e = ajdp4.e((ajdt) ajdp3.a((ajfl) f.a).p(g.a));
            d dVar = lpj;
            akcr.b(dVar, str2);
            lyl.a c = lyc.c();
            akcr.b(dVar, str2);
            lyl.a aVar = c;
            aVar.a(dVar);
            aVar.e = dVar;
            c = c;
            Object a = ajvo.a(ajot.a);
            akcr.a(a, str);
            lyl.a c2 = c.c(a);
            Object a2 = ajvo.a(ajot.a);
            akcr.a(a2, str);
            lyl.a b = c2.b(a2);
            ajdp b2 = ajdp.b(mih.e);
            akcr.a((Object) b2, "Observable.just(Rectangle.ZERO)");
            b = b.a(b2);
            akcr.a(e, "hideWhen");
            lyl.a a3 = b.c(e).a((ajdp) ajdp);
            ajdp a4 = mit.a(intValue, ajdp2);
            akcr.b(a4, "viewStub");
            lyl.a aVar2 = a3;
            d dVar2 = aVar2.e;
            if (dVar2 == null) {
                akcr.a(str2);
            }
            dVar2.h();
            dVar2 = aVar2.e;
            if (dVar2 == null) {
                akcr.a(str2);
            }
            zfw a5 = zgb.a(dVar2.g(), "ExplorerComponent.Builder#attachToViewStub");
            d dVar3 = aVar2.e;
            if (dVar3 == null) {
                akcr.a(str2);
            }
            Object a6 = a4.a(mit.a((int) R.layout.lenses_camera_explorer_composite_view, ViewGroup.class, true, dVar3.o(), true, true)).b((ajdw) a5.l()).c((ajdw) a5.l()).i().a();
            akcr.a(a6, "viewStub.compose(ViewObs…              .refCount()");
            aVar2.b(a6);
            return new lph(lpj, a3);
        }

        public static final mhi<? extends mha> a(lpj lpj, akbl<? super mji, ? extends ajcx> akbl, boolean z) {
            akcr.b(lpj, "component");
            akcr.b(akbl, "audioProcessorAttachment");
            lqr lqr = new lqr(lpj);
            lqr.a((akbl) akbl);
            if (z) {
                lqr.b();
            }
            return new lph(lpj, lqr);
        }

        public static final mhi<? extends mha> a(lpj lpj, String str) {
            akcr.b(lpj, "component");
            akcr.b(str, "userAgent");
            mal mal = new mal(lpj);
            akcr.b(str, "value");
            mal.a = str;
            return new lph(lpj, mal);
        }

        public static final mhi<? extends mha> a(lpj lpj, lqp lqp, ajdp<ViewGroup> ajdp) {
            akcr.b(lpj, "component");
            akcr.b(lqp, "layoutConfiguration");
            akcr.b(ajdp, "viewGroupProvider");
            Integer num = lqp.e;
            if (num == null) {
                return mhc.a;
            }
            Object a = new lzy(lpj).a(mit.a(num.intValue(), ajdp));
            akcr.a(a, "HintBuilder(component)\n …d(id, viewGroupProvider))");
            return new lph(lpj, (mhi) a);
        }

        public static final mhi<? extends mha> a(lpj lpj, lqp lqp, ajdp<mih> ajdp, ajdp<ViewGroup> ajdp2, ajdp<View> ajdp3) {
            String str = "view";
            String str2 = "parentComponent";
            akcr.b(lpj, "component");
            akcr.b(lqp, "layoutConfiguration");
            akcr.b(ajdp, "windowRect");
            akcr.b(ajdp2, "viewGroupProvider");
            String str3 = "viewToDispatchTouchEventsTo";
            akcr.b(ajdp3, str3);
            Integer num = lqp.c;
            if (num == null) {
                return mhc.a;
            }
            int intValue = num.intValue();
            mzv.d dVar = lpj;
            akcr.b(dVar, str2);
            mzv.a c = mzo.c();
            ajdp b = ajdp.b(mih.e);
            akcr.a((Object) b, "Observable.just(Rectangle.ZERO)");
            c = c.a(b);
            akcr.b(dVar, str2);
            mzv.a aVar = c;
            aVar.a(dVar);
            aVar.d = dVar;
            mzv.a a = c.a((ajdp) ajdp);
            ajdp a2 = mit.a(intValue, ajdp2);
            akcr.b(a2, "viewStub");
            akcr.b(ajdp3, str3);
            mzv.a aVar2 = a;
            mzv.d dVar2 = aVar2.d;
            if (dVar2 == null) {
                akcr.a(str2);
            }
            dVar2.h();
            dVar2 = aVar2.d;
            if (dVar2 == null) {
                akcr.a(str2);
            }
            zfw a3 = zgb.a(dVar2.g(), "TouchComponent.Builder#attachToViewStub");
            dVar = aVar2.d;
            if (dVar == null) {
                akcr.a(str2);
            }
            Object c2 = a2.a(mit.a((int) R.layout.lenses_camera_touch_view, nab.class, true, dVar.o(), true, true)).i().a().b((ajdw) a3.l()).c((ajdw) a3.l());
            akcr.a(c2, "viewStub.compose(ViewObs…(schedulers.mainThread())");
            akcr.b(c2, "touchView");
            akcr.b(ajdp3, str);
            akcr.b(c2, "receiver$0");
            akcr.b(ajdp3, str);
            Object i = ajdp3.p(nac.b.a).i((ajdt) ajdp.b(Optional.absent()));
            akcr.a(i, "optionalViewToDispatchTo");
            c2 = myu.a(c2, i).p(nac.a.a);
            akcr.a(c2, "pairLatest<TouchView, Op…lTouchView)\n            }");
            aVar2.b(c2);
            return new lph(lpj, a);
        }

        public static final mhi<? extends mha> a(lpj lpj, lqp lqp, ajdp<ViewGroup> ajdp, ajdp<Double> ajdp2, mwe mwe, mvu mvu) {
            akcr.b(lpj, "component");
            akcr.b(lqp, "layoutConfiguration");
            akcr.b(ajdp, "viewGroupProvider");
            akcr.b(ajdp2, "cameraAverageFps");
            String str = "lensRepository";
            akcr.b(mwe, str);
            String str2 = "lensContentInfoProvider";
            akcr.b(mvu, str2);
            Integer num = lqp.g;
            if (num == null) {
                return mhc.a;
            }
            int intValue = num.intValue();
            lxk lxk = new lxk(lpj);
            akcr.b(ajdp2, "value");
            lxk.b = ajdp2;
            lxk = lxk;
            akcr.b(mwe, str);
            lxk.c = mwe;
            lxk = lxk;
            akcr.b(mvu, str2);
            lxk.d = mvu;
            lxk = lxk;
            ajdp a = mit.a(intValue, ajdp);
            akcr.b(a, "viewStub");
            lxk.f.h();
            Object a2 = lxk.e.u(new lxk.d(lxk, a, zgb.a(lxk.f.g(), "DebugBuilder#attachToViewStub"))).i().a();
            akcr.a(a2, "debugModeObservable\n    …              .refCount()");
            akcr.b(a2, "viewProvider");
            lxk.a = a2;
            return new lph(lpj, lxk);
        }

        public static final mhi<? extends mha> a(lpj lpj, lqp lqp, ajdp<mih> ajdp, ajdp<ViewGroup> ajdp2, boolean z, ajdp<Boolean> ajdp3) {
            String str = "parentComponent";
            akcr.b(lpj, "component");
            akcr.b(lqp, "layoutConfiguration");
            akcr.b(ajdp, "windowRect");
            akcr.b(ajdp2, "viewGroupProvider");
            akcr.b(ajdp3, "carouselHideSignal");
            Integer num = lqp.d;
            if (num == null) {
                return mhc.a;
            }
            int intValue = num.intValue();
            may.d dVar = lpj;
            akcr.b(dVar, str);
            may.a c = mas.c();
            akcr.b(dVar, str);
            may.a aVar = c;
            aVar.a(dVar);
            aVar.f = dVar;
            c = c;
            ajdp a = ajvo.a(ajot.a);
            akcr.a((Object) a, "Observable.empty()");
            may.a a2 = c.a(a);
            Object b = ajdp.b(mih.e);
            akcr.a(b, "Observable.just(Rectangle.ZERO)");
            may.a a3 = a2.b(b).b(ajdp).a((ajdp) ajdp3).a(z);
            ajdp a4 = mit.a(intValue, ajdp2);
            akcr.b(a4, "viewStub");
            may.a aVar2 = a3;
            may.d dVar2 = aVar2.f;
            if (dVar2 == null) {
                akcr.a(str);
            }
            dVar2.h();
            dVar2 = aVar2.f;
            if (dVar2 == null) {
                akcr.a(str);
            }
            zfw a5 = zgb.a(dVar2.g(), "LensButtonComponent.Builder#attachToViewStub");
            may.d dVar3 = aVar2.f;
            if (dVar3 == null) {
                akcr.a(str);
            }
            Object a6 = a4.a(mit.a((int) R.layout.lenses_camera_lens_button_composite_view, ViewGroup.class, true, dVar3.o(), true, true)).b((ajdw) a5.l()).c((ajdw) a5.l()).i().a();
            akcr.a(a6, "viewStub\n               …              .refCount()");
            aVar2.c(a6);
            return new lpf(lpj, a3);
        }

        public static final mhi<? extends mha> a(lpj lpj, lqp lqp, ajdp<mih> ajdp, boolean z, ajdp<Boolean> ajdp2, ajdp<ViewGroup> ajdp3) {
            lpj lpj2 = lpj;
            lqp lqp2 = lqp;
            ajdp<mih> ajdp4 = ajdp;
            ajdp ajdp5 = ajdp2;
            ajdp<ViewGroup> ajdp6 = ajdp3;
            String str = "Observable.empty()";
            String str2 = "parentComponent";
            akcr.b(lpj2, "component");
            akcr.b(lqp2, "layoutConfiguration");
            akcr.b(ajdp4, "windowRect");
            akcr.b(ajdp5, "carouselHideSignal");
            akcr.b(ajdp6, "viewGroupProvider");
            Integer num = lqp2.h;
            if (num == null) {
                return mhc.a;
            }
            int intValue = num.intValue();
            mcx.d dVar = lpj2;
            akcr.b(dVar, str2);
            mcx.a c = mcq.c();
            Object a = ajvo.a(ajot.a);
            akcr.a(a, str);
            c = c.c(a);
            akcr.b(dVar, str2);
            mcx.a aVar = c;
            aVar.a(dVar);
            aVar.f = dVar;
            c = c;
            ajdp a2 = ajvo.a(ajot.a);
            akcr.a((Object) a2, str);
            mcx.a a3 = c.a(a2).c(ajdp4).a(ajdp5).a((akbl) new h(lqp, lpj, ajdp, ajdp2, z, ajdp3));
            ajdp a4 = mit.a(intValue, ajdp6);
            akcr.b(a4, "viewStub");
            mcx.a aVar2 = a3;
            mcx.d dVar2 = aVar2.f;
            if (dVar2 == null) {
                akcr.a(str2);
            }
            dVar2.h();
            dVar2 = aVar2.f;
            if (dVar2 == null) {
                akcr.a(str2);
            }
            zfw a5 = zgb.a(dVar2.g(), "SponsoredSlugComponent#attachToViewStub");
            mcx.d dVar3 = aVar2.f;
            if (dVar3 == null) {
                akcr.a(str2);
            }
            Object a6 = a4.a(mit.a((int) R.layout.lenses_camera_slug_view, mde.class, true, dVar3.o(), false, true)).b((ajdw) a5.l()).c((ajdw) a5.l()).i().a();
            akcr.a(a6, "viewStub.compose(ViewObs…              .refCount()");
            aVar2.b(a6);
            return new lph(lpj2, a3);
        }

        public static final mhi<? extends mha> a(lpj lpj, zfw zfw, lqp lqp, boolean z, ajdp<Boolean> ajdp, boolean z2, ajdp<Boolean> ajdp2, ajdp<ViewGroup> ajdp3, lth lth, lpi lpi, ajdp<lqf> ajdp4, ajdp<Double> ajdp5, ajdp<mih> ajdp6, ajdp<ajxw> ajdp7, ajdp<ViewStub> ajdp8, ajdp<View> ajdp9, ajfb<lqo> ajfb, ajfb<lwo> ajfb2, mzk mzk, mtj mtj, mwa mwa) {
            String str;
            Object e;
            lpi lpi2;
            lrj lrj;
            lqp lqp2 = lqp;
            ajdp<Boolean> ajdp10 = ajdp;
            boolean z3 = z2;
            ajdp<Boolean> ajdp11 = ajdp2;
            ajdp<ViewGroup> ajdp12 = ajdp3;
            lth lth2 = lth;
            lpi lpi3 = lpi;
            ajdp<Double> ajdp13 = ajdp5;
            ajdp<mih> ajdp14 = ajdp6;
            ajdp<ajxw> ajdp15 = ajdp7;
            ajdp<ViewStub> ajdp16 = ajdp8;
            ajdp<View> ajdp17 = ajdp9;
            ajfb<lqo> ajfb3 = ajfb;
            ajfb<lwo> ajfb4 = ajfb2;
            mzk mzk2 = mzk;
            mtj mtj2 = mtj;
            String str2 = "viewProvider\n           …(schedulers.mainThread())";
            String str3 = "Observable.empty()";
            String str4 = "parentComponent";
            akcr.b(lpj, "component");
            akcr.b(zfw, "qualifiedSchedulers");
            akcr.b(lqp2, "layoutConfiguration");
            akcr.b(ajdp10, "carouselCloseButtonHideSignal");
            akcr.b(ajdp11, "carouselHideSignal");
            akcr.b(ajdp12, "viewGroupProvider");
            String str5 = "bitmojiLensInteractor";
            akcr.b(lth2, str5);
            akcr.b(lpi3, "backPressInteractor");
            akcr.b(ajdp4, "cameraLifecycle");
            akcr.b(ajdp13, "cameraAverageFps");
            String str6 = "windowRect";
            akcr.b(ajdp14, str6);
            akcr.b(ajdp15, "startButtonLoadingSingal");
            akcr.b(ajdp16, "startButtonStub");
            akcr.b(ajdp17, "loadingOverlay");
            akcr.b(ajfb3, "controlAppearanceConsumer");
            akcr.b(ajfb4, "captureActionConsumer");
            String str7 = "lensStatisticsRepository";
            akcr.b(mzk2, str7);
            String str8 = "externalImagesRepository";
            String str9 = "signal";
            akcr.b(mtj, str8);
            String str10 = "lensDownloadStatusProvider";
            akcr.b(mwa, str10);
            Object ajwo = new ajwo();
            akcr.a(ajwo, "PublishSubject.create()");
            ajws ajws = (ajws) ajwo;
            Integer num = lqp2.b;
            String str11 = "viewStub";
            mdu.a aVar = null;
            if (num != null) {
                lrj lrj2;
                String str12;
                int intValue = num.intValue();
                String str13 = str10;
                String str14 = str8;
                lrj lrj3 = new lrj(lpj);
                if (z) {
                    lrj2 = lrj3;
                    str12 = str7;
                    lrj2.b = lsu.h;
                    lrj2.c = true;
                } else {
                    str12 = str7;
                }
                mtj mtj3 = mtj;
                if (z2) {
                    lrj2 = lrj3;
                    lrj2.b = lsu.i;
                    lrj2.d = true;
                }
                ajdp a = mit.a(intValue, ajdp12);
                akcr.b(a, str11);
                lrj lrj4 = lrj3;
                str = str11;
                int i = lrj4.b.a;
                ajdp a2 = a.a(mit.a(i, lsd.class, true, lrj4.n.o(), true, true));
                akcr.a((Object) a2, "viewStub.compose(ViewObs…ncLayoutInflaterFactory))");
                akcr.b(a2, "viewProvider");
                lrj4 = lrj4;
                lrj4.n.h();
                zfw a3 = zgb.a(lrj4.n.g().callsite("CarouselBuilder#attachToViewStub"));
                Object c = mhe.a(mip.a(a2, "CarouselBuilder#viewProvider"), lrj4.n.g()).u(new f(lrj4, a3)).b((ajdw) a3.l()).c((ajdw) a3.l());
                str8 = str2;
                akcr.a(c, str8);
                c = igs.a(c).a((ajdw) a3.l());
                akcr.a(c, str8);
                lrj4.a = c;
                lrj3 = lrj3;
                akcr.b(ajdp10, str9);
                lrj lrj5 = lrj3;
                e = lrj5.e.e((ajdt) ajdp10.p(lrj.d.a));
                akcr.a(e, "carouselAppearance.merge…Button.Visible\n        })");
                lrj5.e = e;
                lrj3 = lrj3;
                c = ajdp11.e((ajdt) ajws);
                akcr.a(c, "carouselHideSignal.merge…arouselHideSignalSubject)");
                akcr.b(c, str9);
                lrj lrj6 = lrj3;
                c = lrj6.e.e((ajdt) c.p(e.a));
                akcr.a(c, "carouselAppearance.merge…ce.All.Visible\n        })");
                lrj6.e = c;
                lrj3 = lrj3;
                akcr.b(ajdp13, "value");
                lrj3.f = ajdp13;
                lrj3 = lrj3;
                akcr.b(lth2, str5);
                lrj3.h = lth2;
                lrj3 = lrj3;
                akcr.b(ajdp14, str6);
                lrj3.g = ajdp14;
                lrj3 = lrj3;
                lpi2 = lpi;
                akcr.b(lpi2, "interactor");
                lrj3.i = lpi2;
                lrj3 = lrj3;
                akcr.b(mzk2, str12);
                lrj3.j = mzk2;
                lrj3 = lrj3;
                mtj mtj4 = mtj;
                akcr.b(mtj4, str14);
                lrj3.k = mtj4;
                lrj3 = lrj3;
                mwa mwa2 = mwa;
                akcr.b(mwa2, str13);
                lrj3.l = mwa2;
                lrj = lrj3;
            } else {
                str = str11;
                lpi2 = lpi;
                lrj = null;
            }
            mhi mhi = lrj;
            e = new ajwl();
            akcr.a(e, "BehaviorSubject.create()");
            ajws ajws2 = (ajws) e;
            String str15 = str;
            Integer num2 = lqp.m;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                mdu.d dVar = lpj;
                String str16 = str4;
                akcr.b(dVar, str16);
                mdu.a c2 = mdo.c();
                akcr.b(dVar, str16);
                mdu.a aVar2 = c2;
                aVar2.a(dVar);
                aVar2.l = dVar;
                c2 = c2;
                Object a4 = ajvo.a(ajot.a);
                str9 = str3;
                akcr.a(a4, str9);
                mdu.a d = c2.d(a4);
                ajdp a5 = ajvo.a(ajot.a);
                akcr.a((Object) a5, str9);
                d = d.b(a5).d(ajdp8).c(ajdp9).a(z2);
                Object a6 = ajdp12.a(View.class);
                akcr.a(a6, "cast(R::class.java)");
                mdu.a a7 = d.e(a6).b((ajdp) ajdp7).a((ajdp) ajws2).b((ajfb) ajfb).a((ajfb) ajfb2).a(lpi2);
                ajdp a8 = mit.a(intValue2, ajdp12);
                akcr.b(a8, str15);
                mdu.a aVar3 = a7;
                mdu.d dVar2 = aVar3.l;
                if (dVar2 == null) {
                    akcr.a(str16);
                }
                dVar2.h();
                dVar2 = aVar3.l;
                if (dVar2 == null) {
                    akcr.a(str16);
                }
                zfw a9 = zgb.a(dVar2.g(), "SnappablesComponent#attachToViewStub");
                dVar = aVar3.l;
                if (dVar == null) {
                    akcr.a(str16);
                }
                Object a10 = a8.a(mit.a(R.layout.lenses_camera_snappables_composite_view, ViewGroup.class, true, dVar.o(), true, false)).b((ajdw) a9.l()).c((ajdw) a9.l()).i().a();
                akcr.a(a10, "viewStub\n               …              .refCount()");
                aVar3.f(a10);
                aVar = a7;
            } else {
                z3 = z2;
                ajfb<lwo> ajfb5 = ajfb2;
            }
            mhi mhi2 = aVar;
            if (mhi == null) {
                if (mhi2 == null) {
                    return mhc.a;
                }
            }
            return new lox(lpj, zfw, mhi, mhi2, new lpk(new a(ajws)), new lpk(new b(ajws2)), ajfb2, ajdp4, z2);
        }

        public static final mhi<? extends mha> b(lpj lpj, lqp lqp, ajdp<ViewGroup> ajdp) {
            String str = "parentComponent";
            akcr.b(lpj, "component");
            akcr.b(lqp, "layoutConfiguration");
            akcr.b(ajdp, "viewGroupProvider");
            Integer num = lqp.i;
            if (num == null) {
                return mhc.a;
            }
            int intValue = num.intValue();
            mge.d dVar = lpj;
            akcr.b(dVar, str);
            mge.a c = mfv.c();
            akcr.b(dVar, str);
            mge.a aVar = c;
            aVar.a(dVar);
            aVar.c = dVar;
            c = c;
            ajdp a = mit.a(intValue, ajdp);
            akcr.b(a, "viewStub");
            mge.a aVar2 = c;
            dVar = aVar2.c;
            if (dVar == null) {
                akcr.a(str);
            }
            dVar.h();
            dVar = aVar2.c;
            if (dVar == null) {
                akcr.a(str);
            }
            zfw a2 = zgb.a(dVar.g(), "TextInputComponent.Builder#attachToViewStub");
            mge.d dVar2 = aVar2.c;
            if (dVar2 == null) {
                akcr.a(str);
            }
            a = a.a(mit.a((int) R.layout.lenses_camera_text_input_view, mgk.class, true, dVar2.o(), true, true)).b((ajdw) a2.l()).c((ajdw) a2.l()).i().a();
            akcr.a((Object) a, "viewStub.compose(ViewObs…              .refCount()");
            aVar2.a(a);
            return new lph(lpj, c);
        }

        public static final mhi<? extends mha> b(lpj lpj, lqp lqp, ajdp<mih> ajdp, ajdp<ViewGroup> ajdp2, ajdp<lqo> ajdp3) {
            akcr.b(lpj, "component");
            akcr.b(lqp, "layoutConfiguration");
            akcr.b(ajdp, "windowRect");
            akcr.b(ajdp2, "viewGroupProvider");
            akcr.b(ajdp3, "controlAppearance");
            Integer num = lqp.f;
            if (num == null) {
                return mhc.a;
            }
            int intValue = num.intValue();
            Object c = new mbz(lpj).a(ajdp).b(ajdp3.a((ajfl) c.a).p(d.a)).c(mit.a(intValue, ajdp2));
            akcr.a(c, "CarouselTooltipBuilder(c…d(id, viewGroupProvider))");
            return new lph(lpj, (mhi) c);
        }

        public static final mhi<? extends mha> c(lpj lpj, lqp lqp, ajdp<ViewGroup> ajdp) {
            String str = "parentComponent";
            akcr.b(lpj, "component");
            akcr.b(lqp, "layoutConfiguration");
            akcr.b(ajdp, "viewGroupProvider");
            Integer num = lqp.k;
            if (num == null) {
                return mhc.a;
            }
            int intValue = num.intValue();
            mgp.d dVar = lpj;
            akcr.b(dVar, str);
            mgp.a c = mgm.c();
            akcr.b(dVar, str);
            mgp.a aVar = c;
            aVar.a(dVar);
            aVar.c = dVar;
            c = c;
            ajdp a = mit.a(intValue, ajdp);
            akcr.b(a, "viewStub");
            mgp.a aVar2 = c;
            dVar = aVar2.c;
            if (dVar == null) {
                akcr.a(str);
            }
            dVar.h();
            dVar = aVar2.c;
            if (dVar == null) {
                akcr.a(str);
            }
            zfw a2 = zgb.a(dVar.g(), "UpcomingMessageComponent.Builder#attachToViewStub");
            mgp.d dVar2 = aVar2.c;
            if (dVar2 == null) {
                akcr.a(str);
            }
            a = a.a(mit.a((int) R.layout.lenses_camera_upcoming_view, mgv.class, true, dVar2.o(), false, true)).b((ajdw) a2.l()).c((ajdw) a2.l());
            akcr.a((Object) a, "viewStub.compose(ViewObs…(schedulers.mainThread())");
            aVar2.a(a);
            return new lph(lpj, c);
        }

        public static final mhi<? extends mha> d(lpj lpj, lqp lqp, ajdp<ViewGroup> ajdp) {
            String str = "parentComponent";
            akcr.b(lpj, "component");
            akcr.b(lqp, "layoutConfiguration");
            akcr.b(ajdp, "viewGroupProvider");
            Integer num = lqp.j;
            if (num == null) {
                return mhc.a;
            }
            int intValue = num.intValue();
            defpackage.lwe.c cVar = lpj;
            akcr.b(cVar, str);
            lwe.a d = lwl.d();
            akcr.b(cVar, str);
            lwe.a aVar = d;
            aVar.a(cVar);
            aVar.a = cVar;
            d = d;
            ajdp a = mit.a(intValue, ajdp);
            akcr.b(a, "viewStub");
            lwe.a aVar2 = d;
            cVar = aVar2.a;
            if (cVar == null) {
                akcr.a(str);
            }
            cVar.h();
            cVar = aVar2.a;
            if (cVar == null) {
                akcr.a(str);
            }
            zfw a2 = zgb.a(cVar.g(), "ConfidentialLabelComponent.Builder#attachToViewStub");
            defpackage.lwe.c cVar2 = aVar2.a;
            if (cVar2 == null) {
                akcr.a(str);
            }
            a = a.a(mit.a((int) R.layout.lenses_camera_confidential_view, lwk.class, true, cVar2.o(), false, true)).b((ajdw) a2.l()).c((ajdw) a2.l());
            akcr.a((Object) a, "viewStub.compose(ViewObs…(schedulers.mainThread())");
            aVar2.a(a);
            return new lph(lpj, d);
        }
    }

    /* renamed from: lpj$e */
    static final class e<T> implements ajfl<lqf> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            lqf lqf = (lqf) obj;
            akcr.b(lqf, "it");
            return lqf instanceof lqf.b.b;
        }
    }

    static {
        b bVar = new b();
    }

    public final ajej a() {
        Object l = b().l();
        akcr.a(l, "observe().subscribe()");
        return l;
    }

    public final ajdp<Object> b() {
        Object d = mhb.a(e()).j(ajfu.a).d((ajdt) k().a((ajfl) e.a).c(1).a((ajdw) d().h()));
        akcr.a(d, "subComponents\n          …eractive())\n            )");
        return d;
    }

    public abstract lqh c();

    public abstract zfw d();

    public abstract Set<mhi<? extends mha>> e();
}
