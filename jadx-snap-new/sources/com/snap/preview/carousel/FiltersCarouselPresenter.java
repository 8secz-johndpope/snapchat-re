package com.snap.preview.carousel;

import android.app.Activity;
import android.graphics.Canvas;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.AdapterDataObserver;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.OnFlingListener;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.brightcove.player.event.Event;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.looksery.sdk.ProfilingSessionReceiver;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.preview.carousel.ui.StackingRecyclerView;
import com.snap.ui.recycling.adapter.LoopingAdapter;
import com.snap.ui.view.TakeSnapButton;
import defpackage.aail;
import defpackage.aaim;
import defpackage.aalt;
import defpackage.aama;
import defpackage.aamf;
import defpackage.aann;
import defpackage.aasc;
import defpackage.abaw;
import defpackage.abtl;
import defpackage.abyi;
import defpackage.abyp;
import defpackage.abyy;
import defpackage.abzt;
import defpackage.abzx;
import defpackage.abzy;
import defpackage.acae;
import defpackage.aesf;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdv;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajek;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfl;
import defpackage.ajhn;
import defpackage.ajot;
import defpackage.ajvo;
import defpackage.ajwl;
import defpackage.ajwo;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.ajyl;
import defpackage.ajyn;
import defpackage.ajyw;
import defpackage.ajzm;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.akez;
import defpackage.akfh;
import defpackage.cjp;
import defpackage.idl;
import defpackage.ifu;
import defpackage.igk;
import defpackage.iip;
import defpackage.iiq;
import defpackage.iit;
import defpackage.ily;
import defpackage.iod;
import defpackage.jwa;
import defpackage.jwb;
import defpackage.jwc;
import defpackage.jwe;
import defpackage.jwj;
import defpackage.jwz;
import defpackage.kaz;
import defpackage.ncd;
import defpackage.oea;
import defpackage.oeb;
import defpackage.oet;
import defpackage.oeu;
import defpackage.ohy;
import defpackage.ohz;
import defpackage.toc;
import defpackage.toh;
import defpackage.toi;
import defpackage.tol;
import defpackage.tox;
import defpackage.tpa;
import defpackage.tqi;
import defpackage.tqj;
import defpackage.tqn;
import defpackage.ttc;
import defpackage.ttd;
import defpackage.ttf;
import defpackage.ttg;
import defpackage.tth;
import defpackage.ttp;
import defpackage.ttr;
import defpackage.tvd;
import defpackage.tvr;
import defpackage.twd;
import defpackage.twm;
import defpackage.tyo;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zkf;
import defpackage.zma;
import defpackage.zmg;
import defpackage.zml;
import defpackage.zmp;
import defpackage.zms;
import defpackage.zmv;
import defpackage.zmy;
import defpackage.znh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public class FiltersCarouselPresenter implements defpackage.k, toh, tox, tpa, tvr {
    RecyclerView A;
    public final toc B;
    final jwe C;
    public final tvd D;
    public final DisplayMetrics E;
    public final Activity F;
    public final toi G;
    public final ncd H;
    public final List<tqi> I;
    final ttc J;
    final oet K;
    final ajwy<twd> L;
    final ajwy<tol> M;
    private final ajxe N = ajxh.a(new as(this));
    private final ajxe O = ajxh.a(v.a);
    private final ajxe P = ajxh.a(w.a);
    private final ajxe Q;
    private final ajxe R;
    private final ajxe S;
    private final ajxe T;
    private float U;
    private final String V;
    private final ajxe W;
    private final ajxe X;
    private final zgb Y;
    public final ajxe a;
    public tqj b;
    public zms c;
    public ajcx d;
    public zkf e;
    public zmg f;
    public StackingRecyclerView g;
    public ajdp<MotionEvent> h;
    public ajdp<Boolean> i;
    public ajdp<ajxw> j;
    public ajdp<ttg> k;
    public ajdv<ajxw> l;
    public ajdp<kaz<jwj>> m;
    public ajdp<aesf> n;
    public boolean o;
    final ajxe p;
    public final ajwl<Boolean> q;
    public final ajei r;
    public final ajwl<Boolean> s;
    public zmv t;
    public b u;
    public boolean v;
    boolean w;
    public tth x;
    public ajwy<iip> y;
    final AtomicBoolean z;

    public interface b {
        void a(abzx abzx);

        void a(acae acae, acae acae2, float f);

        void a(acae acae, kaz<jwj> kaz);
    }

    static final class v extends akcs implements akbk<ajwo<String>> {
        public static final v a = new v();

        v() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    static final class w extends akcs implements akbk<ajwl<ajxw>> {
        public static final w a = new w();

        w() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwl();
        }
    }

    public static final class ad extends akcs implements akbl<Set<? extends String>, Boolean> {
        public static final ad a = new ad();

        ad() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Set set = (Set) obj;
            akcr.b(set, "it");
            boolean z = true;
            if (!(set.isEmpty() || (set.contains(twm.s) && set.size() == 1))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class as extends akcs implements akbk<zfw> {
        private /* synthetic */ FiltersCarouselPresenter a;

        as(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.B.callsite("FiltersCarouselPresenter"));
        }
    }

    static final class c extends akcs implements akbk<cjp> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cjp) this.a.get();
        }
    }

    static final class m extends akcs implements akbk<jwc> {
        private /* synthetic */ FiltersCarouselPresenter a;

        m(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.C.a();
        }
    }

    static final class l extends akcs implements akbk<jwa> {
        private /* synthetic */ jwb a;

        l(jwb jwb) {
            this.a = jwb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a(toc.d);
        }
    }

    static final class n extends akcs implements akbk<ttf> {
        private /* synthetic */ FiltersCarouselPresenter a;
        private /* synthetic */ ajwy b;

        n(FiltersCarouselPresenter filtersCarouselPresenter, ajwy ajwy) {
            this.a = filtersCarouselPresenter;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ttf ttf = (ttf) this.b.get();
            igk.a(ttf, this.a.r);
            return ttf;
        }
    }

    static final class x extends akcs implements akbk<oeu> {
        private /* synthetic */ ajwy a;

        x(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (oeu) this.a.get();
        }
    }

    static final class y extends akcs implements akbk<oeb> {
        private /* synthetic */ ajwy a;

        y(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (oeb) this.a.get();
        }
    }

    static final class q extends akcs implements akbk<AnonymousClass1> {
        final /* synthetic */ FiltersCarouselPresenter a;

        /* renamed from: com.snap.preview.carousel.FiltersCarouselPresenter$q$1 */
        public static final class AnonymousClass1 extends AdapterDataObserver {
            private /* synthetic */ q a;

            AnonymousClass1(q qVar) {
                this.a = qVar;
            }

            public final void onChanged() {
                super.onChanged();
                FiltersCarouselPresenter.g(this.a.a);
            }

            public final void onItemRangeInserted(int i, int i2) {
                super.onItemRangeInserted(i, i2);
                this.a.a.e().a();
            }
        }

        q(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new AnonymousClass1(this);
        }
    }

    static final class at extends akcs implements akbk<zmp> {
        final /* synthetic */ FiltersCarouselPresenter a;

        /* renamed from: com.snap.preview.carousel.FiltersCarouselPresenter$at$1 */
        public static final class AnonymousClass1 extends OnScrollListener {
            private /* synthetic */ at a;

            AnonymousClass1(at atVar) {
                this.a = atVar;
            }

            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                akcr.b(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    FiltersCarouselPresenter.g(this.a.a);
                    Object i2 = this.a.a.i();
                    if (i2 != null) {
                        tqj a = FiltersCarouselPresenter.a(this.a.a);
                        akcr.b(i2, "viewModel");
                        a.e.a(i2);
                    }
                    FiltersCarouselPresenter.a(this.a.a).a(0);
                    ttc ttc = this.a.a.J;
                    ttc.g++;
                    this.a.a.d().a((Object) "filter_tool");
                }
                ajdv ajdv = this.a.a.l;
                if (ajdv == null) {
                    akcr.a("scrollInFilterCarouselObserver");
                }
                ajdv.a(ajxw.a);
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                akcr.b(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i2);
                ttc ttc = this.a.a.J;
                aalt aalt = i > 0 ? aalt.LEFT : aalt.RIGHT;
                if (ttc.b == null && i != 0) {
                    ttc.b = aalt;
                    ttc.a().a.c((ily) iod.SWIPE_SESSION, 1);
                }
                ttc.c = aalt;
                for (tqi a : this.a.a.I) {
                    a.a(i);
                }
                if (Math.abs(i) > 0) {
                    FiltersCarouselPresenter.g(this.a.a);
                    FiltersCarouselPresenter.a(this.a.a).a(1);
                }
            }
        }

        at(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            zmp zmp = new zmp();
            zmp.a(new AnonymousClass1(this));
            return zmp;
        }
    }

    public static final class ae<T> implements ajfb<MotionEvent> {
        private /* synthetic */ FiltersCarouselPresenter a;

        public ae(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            tqj a = FiltersCarouselPresenter.a(this.a);
            akcr.a((Object) motionEvent, "it");
            a.a(motionEvent);
        }
    }

    public static final class af<T> implements ajfb<MotionEvent> {
        private /* synthetic */ FiltersCarouselPresenter a;

        public af(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            StackingRecyclerView stackingRecyclerView = this.a.g;
            if (stackingRecyclerView != null && motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                if (actionIndex <= 1 || !(actionMasked == 0 || actionMasked == 5 || actionMasked == 2)) {
                    StringBuilder stringBuilder = new StringBuilder("onInterceptTouchEvent ");
                    stringBuilder.append(actionMasked);
                    stringBuilder.append(' ');
                    stringBuilder.append(actionIndex);
                    stringBuilder.append('/');
                    stringBuilder.append(motionEvent.getPointerCount());
                    stringBuilder.append(" id:{");
                    stringBuilder.append(pointerId);
                    stringBuilder.append("} - scrollstate ");
                    stringBuilder.append(stackingRecyclerView.getScrollState());
                    Object p = stackingRecyclerView.a().p();
                    if (p == null) {
                        akcr.a();
                    }
                    akcr.a(p, "stackingStateSubject.value!!");
                    com.snap.preview.carousel.ui.StackingRecyclerView.a aVar = (com.snap.preview.carousel.ui.StackingRecyclerView.a) p;
                    int i = 0;
                    if (actionIndex <= 0) {
                        if (aVar.isStacking) {
                            Integer num = stackingRecyclerView.a;
                            if (actionIndex == 0 && actionMasked == 0 && num == null) {
                                stackingRecyclerView.a().a(com.snap.preview.carousel.ui.StackingRecyclerView.a.STACKED_SWIPING);
                            } else if (actionMasked == 3 || actionMasked == 1) {
                                stackingRecyclerView.a = null;
                            } else if (aVar == com.snap.preview.carousel.ui.StackingRecyclerView.a.STACKED_SWIPING) {
                                stackingRecyclerView.a = null;
                            } else if (num != null && num.intValue() < motionEvent.getPointerCount()) {
                                motionEvent = StackingRecyclerView.a(motionEvent, num.intValue());
                                stackingRecyclerView.a(motionEvent);
                            } else {
                                return;
                            }
                        }
                        stackingRecyclerView.a(motionEvent);
                        return;
                    } else if (stackingRecyclerView.getScrollState() == 0 || aVar.isStacking) {
                        if (actionMasked == 5 && stackingRecyclerView.a == null) {
                            stackingRecyclerView.a().a(com.snap.preview.carousel.ui.StackingRecyclerView.a.ON);
                            stackingRecyclerView.a = Integer.valueOf(actionIndex);
                            Object obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 1, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
                            akcr.a(obtain, "MotionEvent.obtain(e.dow…P, e.x, e.y, e.metaState)");
                            stackingRecyclerView.a(obtain);
                        } else if (actionMasked == 6) {
                            stackingRecyclerView.a = null;
                        }
                        Integer num2 = stackingRecyclerView.a;
                        if (num2 != null) {
                            i = num2.intValue();
                        }
                    } else {
                        stackingRecyclerView.a = null;
                        return;
                    }
                    motionEvent = StackingRecyclerView.a(motionEvent, i);
                    stackingRecyclerView.a(motionEvent);
                }
            }
        }
    }

    public static final class ag<T> implements ajfb<List<? extends abyi>> {
        private /* synthetic */ FiltersCarouselPresenter a;

        public ag(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            akcr.a(obj, "mediaPackageList");
            if ((((Collection) obj).isEmpty() ^ 1) != 0) {
                aasc aasc = null;
                Object obj2 = ((abyi) obj.get(0)).e.a;
                akcr.a(obj2, "this.mediaType");
                if (abyp.c(obj2.intValue())) {
                    aasc = aasc.IMAGE;
                } else {
                    aesf a = aesf.a(((abyi) obj.get(0)).e.a);
                    String str = "MediaType.fromValue(this.mediaType)";
                    akcr.a((Object) a, str);
                    if (abyp.c(a)) {
                        aasc = aasc.VIDEO;
                    } else {
                        a = aesf.a(((abyi) obj.get(0)).e.a);
                        akcr.a((Object) a, str);
                        if (abyp.d(a)) {
                            aasc = aasc.VIDEO_NO_SOUND;
                        }
                    }
                }
                ttc ttc = this.a.J;
                String str2 = ((abyi) obj.get(0)).a;
                abaw abaw = this.a.D.d().snapSource;
                akcr.b(str2, "sessionId");
                ttc.a = str2;
                ttc.d = abaw;
                ttc.e = aasc;
            }
        }
    }

    public static final class aj implements ajev {
        final /* synthetic */ StackingRecyclerView a;
        final /* synthetic */ FiltersCarouselPresenter b;

        /* renamed from: com.snap.preview.carousel.FiltersCarouselPresenter$aj$2 */
        static final class AnonymousClass2 implements ajev {
            private /* synthetic */ aj a;

            AnonymousClass2(aj ajVar) {
                this.a = ajVar;
            }

            public final void run() {
                FiltersCarouselPresenter.c(this.a.b).a().unregisterAdapterDataObserver(((AdapterDataObserver) this.a.b.W.b()));
                this.a.a.clearOnScrollListeners();
                this.a.a.setLayoutManager(null);
                this.a.a.setOnFlingListener(null);
                this.a.a.setAdapter(null);
            }
        }

        public aj(StackingRecyclerView stackingRecyclerView, FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = stackingRecyclerView;
            this.b = filtersCarouselPresenter;
        }

        public final void run() {
            this.b.f = new zmg(FiltersCarouselPresenter.d(this.b), FiltersCarouselPresenter.e(this.b).a(), this.b.c().b(), ajyw.a);
            this.a.setLayoutManager(new FiltersCarouselPresenter$initRecyclerView$$inlined$let$lambda$1$1(this.a.getContext(), this));
            this.a.setItemAnimator(null);
            this.a.addOnScrollListener(this.b.h());
            this.a.setHasFixedSize(true);
            final PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
            pagerSnapHelper.attachToRecyclerView(this.a);
            this.a.setOnFlingListener(new OnFlingListener() {
                public final boolean onFling(int i, int i2) {
                    return Math.abs(i) <= TakeSnapButton.LONG_PRESS_TIME ? false : pagerSnapHelper.onFling(i, i2);
                }
            });
            igk.a(LoopingAdapter.a((RecyclerView) this.a, FiltersCarouselPresenter.c(this.b).a()), this.b.r);
            FiltersCarouselPresenter.c(this.b).a().registerAdapterDataObserver(((AdapterDataObserver) this.b.W.b()));
            this.b.r.a(ajek.a((ajev) new AnonymousClass2(this)));
        }
    }

    public static final class au<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ FiltersCarouselPresenter a;

        public au(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            AnonymousClass1 anonymousClass1;
            obj = (com.snap.preview.carousel.ui.StackingRecyclerView.a) obj;
            akcr.b(obj, "stackingState");
            ajdp b = ajdp.b(obj);
            if (obj.isStacking && !this.a.z.getAndSet(true)) {
                b = b.a((ajdw) this.a.c().l());
                anonymousClass1 = new ajfc<T, R>(this) {
                    private /* synthetic */ au a;

                    public final /* synthetic */ Object apply(Object obj) {
                        StackingRecyclerView stackingRecyclerView;
                        com.snap.preview.carousel.ui.StackingRecyclerView.a aVar = (com.snap.preview.carousel.ui.StackingRecyclerView.a) obj;
                        akcr.b(aVar, "it");
                        FiltersCarouselPresenter filtersCarouselPresenter = this.a.a;
                        StackingRecyclerView stackingRecyclerView2 = this.a.a.g;
                        ViewParent viewParent = null;
                        if (stackingRecyclerView2 != null) {
                            Object context = stackingRecyclerView2.getContext();
                            akcr.a(context, "it.context");
                            stackingRecyclerView = new StackingRecyclerView(context);
                            stackingRecyclerView.setLayoutParams(new LayoutParams(-1, -1));
                            zmg zmg = new zmg(FiltersCarouselPresenter.d(this.a.a), FiltersCarouselPresenter.e(this.a.a).a(), this.a.a.c().b());
                            stackingRecyclerView.setLayoutManager(new FiltersCarouselPresenter$subscribeToStackingStateChanges$$inlined$let$lambda$1$1$1(stackingRecyclerView, stackingRecyclerView.getContext()));
                            stackingRecyclerView.setAdapter(zmg.a());
                            zmg.a((zma) FiltersCarouselPresenter.b(this.a.a));
                            igk.a(zmg.c(), this.a.a.r);
                        } else {
                            stackingRecyclerView = null;
                        }
                        filtersCarouselPresenter.A = stackingRecyclerView;
                        StackingRecyclerView stackingRecyclerView3 = this.a.a.g;
                        if (stackingRecyclerView3 != null) {
                            viewParent = stackingRecyclerView3.getParent();
                        }
                        FrameLayout frameLayout = (FrameLayout) viewParent;
                        if (frameLayout != null) {
                            frameLayout.addView(this.a.a.A, 0);
                        }
                        return aVar;
                    }
                };
            } else if (!obj.isStacking) {
                return b;
            } else {
                b = b.a((ajdw) this.a.c().l());
                anonymousClass1 = new ajfc<T, R>(this) {
                    private /* synthetic */ au a;

                    public final /* synthetic */ Object apply(Object obj) {
                        com.snap.preview.carousel.ui.StackingRecyclerView.a aVar = (com.snap.preview.carousel.ui.StackingRecyclerView.a) obj;
                        akcr.b(aVar, "it");
                        RecyclerView recyclerView = this.a.a.A;
                        if (recyclerView != null) {
                            recyclerView.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
                        }
                        return aVar;
                    }
                };
            }
            return b.p(anonymousClass1);
        }
    }

    public static final class av<T> implements ajfb<com.snap.preview.carousel.ui.StackingRecyclerView.a> {
        private /* synthetic */ StackingRecyclerView a;
        private /* synthetic */ FiltersCarouselPresenter b;

        public av(StackingRecyclerView stackingRecyclerView, FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = stackingRecyclerView;
            this.b = filtersCarouselPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            com.snap.preview.carousel.ui.StackingRecyclerView.a aVar = (com.snap.preview.carousel.ui.StackingRecyclerView.a) obj;
            Adapter adapter = this.a.getAdapter();
            if (adapter instanceof LoopingAdapter) {
                ((LoopingAdapter) adapter).a(aVar.isStacking);
            }
            FiltersCarouselPresenter.b(this.b).a(aVar.isStacking);
            FiltersCarouselPresenter.b(this.b).c = aVar == com.snap.preview.carousel.ui.StackingRecyclerView.a.STACKED_SWIPING;
        }
    }

    public static final class aw<T> implements ajfb<tqn> {
        private /* synthetic */ defpackage.akdd.a a;
        private /* synthetic */ defpackage.akdd.a b;
        private /* synthetic */ FiltersCarouselPresenter c;

        public aw(defpackage.akdd.a aVar, defpackage.akdd.a aVar2, FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = aVar;
            this.b = aVar2;
            this.c = filtersCarouselPresenter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00e3  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0135  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0132  */
        public final /* synthetic */ void accept(java.lang.Object r14) {
            /*
            r13 = this;
            r14 = (defpackage.tqn) r14;
            r0 = r13.c;
            r0 = r0.u;
            if (r0 == 0) goto L_0x001b;
        L_0x0008:
            r1 = r14.b();
            r0.a(r1);
            r1 = r14.a();
            r2 = r14.a();
            r3 = 0;
            r0.a(r1, r2, r3);
        L_0x001b:
            r0 = r13.c;
            r0 = r0.L;
            r0 = r0.get();
            r0 = (defpackage.twd) r0;
            r1 = r14.a;
            r2 = r14.a();
            r3 = defpackage.acae.UNFILTERED;
            r4 = 0;
            r5 = 1;
            if (r2 == r3) goto L_0x0033;
        L_0x0031:
            r2 = 1;
            goto L_0x0034;
        L_0x0033:
            r2 = 0;
        L_0x0034:
            r3 = r14.b();
            if (r3 == 0) goto L_0x003c;
        L_0x003a:
            r3 = 1;
            goto L_0x003d;
        L_0x003c:
            r3 = 0;
        L_0x003d:
            r6 = r14.c();
            r6 = r6.isEmpty();
            r6 = r6 ^ r5;
            r7 = r13.a;
            r7 = r7.a;
            r7 = r7 ^ r5;
            r8 = r13.b;
            r8 = r8.a;
            r9 = r14.a;
            if (r8 == r9) goto L_0x0055;
        L_0x0053:
            r8 = 1;
            goto L_0x0056;
        L_0x0055:
            r8 = 0;
        L_0x0056:
            r9 = "geofilter";
            r10 = "visual";
            if (r7 == 0) goto L_0x0071;
        L_0x005c:
            r7 = r0.a;
            r11 = defpackage.ipc.FILTER_SWIPE;
            r11 = r11.a(r10, r2);
            r12 = "motion";
            r3 = r11.a(r12, r3);
            r3 = r3.a(r9, r6);
            r7.c(r3, 1);
        L_0x0071:
            if (r8 == 0) goto L_0x0088;
        L_0x0073:
            r0 = r0.a;
            r3 = defpackage.ipc.FILTER_STACK;
            r7 = "is_stacking";
            r1 = r3.a(r7, r1);
            r1 = r1.a(r9, r6);
            r1 = r1.a(r10, r2);
            r0.c(r1, 1);
        L_0x0088:
            r0 = r13.c;
            r0 = r0.y;
            if (r0 != 0) goto L_0x0093;
        L_0x008e:
            r1 = "analyticsWrapperProvider";
            defpackage.akcr.a(r1);
        L_0x0093:
            r0 = r0.get();
            r0 = (defpackage.iip) r0;
            r0 = r0.b;
            r1 = r13.c;
            r1 = r1.M;
            r1 = r1.get();
            r1 = (defpackage.tol) r1;
            r2 = r0.a();
            r3 = "directSnapPreview.snapSessionId";
            defpackage.akcr.a(r2, r3);
            r0 = r0.A();
            r3 = "directSnapPreview.mediaType";
            defpackage.akcr.a(r0, r3);
            r3 = r14.a();
            r3 = r3.b();
            r6 = r14.b();
            r7 = 2;
            if (r6 != 0) goto L_0x00c7;
        L_0x00c6:
            goto L_0x00d3;
        L_0x00c7:
            r8 = defpackage.tsw.a;
            r6 = r6.ordinal();
            r6 = r8[r6];
            if (r6 == r5) goto L_0x00d9;
        L_0x00d1:
            if (r6 == r7) goto L_0x00d6;
        L_0x00d3:
            r6 = defpackage.aama.NORMAL;
            goto L_0x00db;
        L_0x00d6:
            r6 = defpackage.aama.FAST;
            goto L_0x00db;
        L_0x00d9:
            r6 = defpackage.aama.SLOW;
        L_0x00db:
            r8 = r14.b();
            r9 = defpackage.abzx.REWIND;
            if (r8 != r9) goto L_0x00e5;
        L_0x00e3:
            r8 = 1;
            goto L_0x00e6;
        L_0x00e5:
            r8 = 0;
        L_0x00e6:
            r9 = "snapSessionId";
            defpackage.akcr.b(r2, r9);
            r9 = "mediaType";
            defpackage.akcr.b(r0, r9);
            r1 = r1.a();
            r9 = new aalu;
            r9.<init>();
            r9.a(r2);
            r9.a(r0);
            r9.a(r3);
            r9.a(r6);
            r0 = java.lang.Boolean.valueOf(r8);
            r9.a(r0);
            if (r3 != 0) goto L_0x010f;
        L_0x010e:
            goto L_0x0121;
        L_0x010f:
            r0 = defpackage.tom.b;
            r2 = r3.ordinal();
            r0 = r0[r2];
            if (r0 == r5) goto L_0x0146;
        L_0x0119:
            if (r0 == r7) goto L_0x0143;
        L_0x011b:
            r2 = 3;
            if (r0 == r2) goto L_0x0140;
        L_0x011e:
            r2 = 4;
            if (r0 == r2) goto L_0x013d;
        L_0x0121:
            if (r6 != 0) goto L_0x0124;
        L_0x0123:
            goto L_0x0130;
        L_0x0124:
            r0 = defpackage.tom.a;
            r2 = r6.ordinal();
            r0 = r0[r2];
            if (r0 == r5) goto L_0x013a;
        L_0x012e:
            if (r0 == r7) goto L_0x0137;
        L_0x0130:
            if (r8 == 0) goto L_0x0135;
        L_0x0132:
            r0 = defpackage.aalv.MOTION_REVERSE;
            goto L_0x0148;
        L_0x0135:
            r0 = 0;
            goto L_0x0148;
        L_0x0137:
            r0 = defpackage.aalv.MOTION_SLOW;
            goto L_0x0148;
        L_0x013a:
            r0 = defpackage.aalv.MOTION_FAST;
            goto L_0x0148;
        L_0x013d:
            r0 = defpackage.aalv.VISUAL_MISS_ETIKATE;
            goto L_0x0148;
        L_0x0140:
            r0 = defpackage.aalv.VISUAL_INSTASNAP;
            goto L_0x0148;
        L_0x0143:
            r0 = defpackage.aalv.VISUAL_GRAYSCALE;
            goto L_0x0148;
        L_0x0146:
            r0 = defpackage.aalv.VISUAL_SMOOTHING;
        L_0x0148:
            r9.a(r0);
            r9 = (defpackage.aajt) r9;
            r1.a(r9);
            r0 = r13.b;
            r14 = r14.a;
            r0.a = r14;
            r14 = r13.a;
            r14.a = r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.preview.carousel.FiltersCarouselPresenter$aw.accept(java.lang.Object):void");
        }
    }

    public static final class ax<T> implements ajfb<Throwable> {
        public static final ax a = new ax();

        ax() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class ai<T> implements ajfb<ajxw> {
        private /* synthetic */ FiltersCarouselPresenter a;

        public ai(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ttc ttc = this.a.J;
            ttc.a(ttc.f);
        }
    }

    public static final class ah extends akcq implements akbk<ajxw> {
        public ah(FiltersCarouselPresenter filtersCarouselPresenter) {
            super(0, filtersCarouselPresenter);
        }

        public final String getName() {
            return "onDisposed";
        }

        public final akej getOwner() {
            return akde.a(FiltersCarouselPresenter.class);
        }

        public final String getSignature() {
            return "onDisposed()V";
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            ((FiltersCarouselPresenter) this.receiver).u = null;
            return ajxw.a;
        }
    }

    public static final class z<T> implements ajfb<List<? extends ajxm<? extends acae, ? extends kaz<jwj>>>> {
        private /* synthetic */ FiltersCarouselPresenter a;

        public z(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            akcr.a(obj, "contextFilterDatas");
            Iterable<ajxm> iterable = (Iterable) obj;
            for (ajxm ajxm : iterable) {
                b bVar = this.a.u;
                if (bVar != null) {
                    bVar.a((acae) ajxm.a, (kaz) ajxm.b);
                }
            }
            ttf g = this.a.g();
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (ajxm ajxm2 : iterable) {
                arrayList.add((acae) ajxm2.a);
            }
            Object obj2 = (List) arrayList;
            akcr.b(obj2, "types");
            g.c().a(obj2);
        }
    }

    public static final class am<V> implements Callable<T> {
        private /* synthetic */ FiltersCarouselPresenter a;

        public am(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
        }

        public final /* synthetic */ Object call() {
            Boolean valueOf = Boolean.valueOf(this.a.H.a());
            if (!valueOf.booleanValue()) {
                valueOf = null;
            }
            return Boolean.valueOf(valueOf != null ? valueOf.booleanValue() : false);
        }
    }

    public static final class an<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ FiltersCarouselPresenter a;
        private /* synthetic */ Activity b;

        public an(FiltersCarouselPresenter filtersCarouselPresenter, Activity activity) {
            this.a = filtersCarouselPresenter;
            this.b = activity;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "shouldPromptForLocation");
            return bool.booleanValue() ? this.a.H.a(this.b, ifu.FILTERS_LOCATION_CAROUSEL, false).f(AnonymousClass1.a) : ajdx.b(Boolean.TRUE);
        }
    }

    public static final class ao<T> implements ajfb<Boolean> {
        private /* synthetic */ FiltersCarouselPresenter a;

        public ao(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.s.a((Boolean) obj);
        }
    }

    public static final class ap<T, R> implements ajfc<Throwable, ajeb<? extends Boolean>> {
        public static final ap a = new ap();

        ap() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajdx.b(Boolean.FALSE);
        }
    }

    public static final class ab<T> implements ajfb<Boolean> {
        public static final ab a = new ab();

        ab() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class ac<T> implements ajfb<Boolean> {
        private /* synthetic */ FiltersCarouselPresenter a;

        public ac(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "it");
            if (obj.booleanValue()) {
                obj = FiltersCarouselPresenter.c(this.a).b();
                akcr.a(obj, "adapter.sections");
                for (Object next : (Iterable) obj) {
                    if (((zma) next) instanceof ttp) {
                        break;
                    }
                }
                Object next2 = null;
                zma zma = (zma) next2;
                if (zma != null) {
                    FiltersCarouselPresenter.c(this.a).c(zma);
                }
            }
        }
    }

    static final class al<V> implements Callable<Object> {
        private /* synthetic */ kaz a;
        private /* synthetic */ acae b;
        private /* synthetic */ FiltersCarouselPresenter c;
        private /* synthetic */ ohz d;

        al(kaz kaz, acae acae, FiltersCarouselPresenter filtersCarouselPresenter, ohz ohz) {
            this.a = kaz;
            this.b = acae;
            this.c = filtersCarouselPresenter;
            this.d = ohz;
        }

        public final /* synthetic */ Object call() {
            ttf g = this.c.g();
            acae acae = this.b;
            kaz kaz = this.a;
            akcr.b(acae, "type");
            akcr.b(kaz, "bitmap");
            g.b = true;
            ajwl d = g.d();
            Object a = kaz.a("FilterCarouselDataSource");
            g.b().a((ajej) a);
            akcr.a(a, "bitmap.clone(TAG).apply …iteDisposable.add(this) }");
            d.a(ajdp.b(ajyl.a(new ttd(acae, a))));
            return ajxw.a;
        }
    }

    static final class ar<V> implements Callable<T> {
        private /* synthetic */ FiltersCarouselPresenter a;
        private /* synthetic */ String b;
        private /* synthetic */ ajei c;

        ar(FiltersCarouselPresenter filtersCarouselPresenter, String str, ajei ajei) {
            this.a = filtersCarouselPresenter;
            this.b = str;
            this.c = ajei;
        }

        public final /* synthetic */ Object call() {
            abtl a = tyo.a(new abtl(this.a.E.widthPixels, this.a.E.heightPixels));
            Object obj = (kaz) igk.a(((jwa) this.a.p.b()).a(a.b(), a.c(), this.b), this.c);
            FiltersCarouselPresenter filtersCarouselPresenter = this.a;
            akcr.a(obj, "refCountBitmap");
            FiltersCarouselPresenter.a(filtersCarouselPresenter, new Canvas(jwz.a(obj)));
            return ajxs.a(ohy.SCREEN, obj);
        }
    }

    static final class p<V> implements Callable<defpackage.abyy.a> {
        private /* synthetic */ defpackage.abzt.a a;
        private /* synthetic */ defpackage.abyy.a b;

        p(defpackage.abzt.a aVar, defpackage.abyy.a aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }

        public final /* synthetic */ Object call() {
            abzt a = this.a.a();
            akcr.a((Object) a, "filtersBuilder.build()");
            this.b.a(a);
            defpackage.abyy.a aVar = this.b;
            abzy g = a.g();
            return aVar.c(g != null ? g.i() : null);
        }
    }

    static final class u<V> implements Callable<Object> {
        private /* synthetic */ FiltersCarouselPresenter a;
        private /* synthetic */ Canvas b;

        u(FiltersCarouselPresenter filtersCarouselPresenter, Canvas canvas) {
            this.a = filtersCarouselPresenter;
            this.b = canvas;
        }

        public final /* synthetic */ Object call() {
            FiltersCarouselPresenter.a(this.a, this.b);
            return ajxw.a;
        }
    }

    public static final class aa<T> implements ajfb<aesf> {
        private /* synthetic */ FiltersCarouselPresenter a;

        public aa(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = FiltersCarouselPresenter.c(this.a).b();
            akcr.a(obj, "adapter.sections");
            for (Object next : (Iterable) obj) {
                if (((zma) next) instanceof ttr) {
                    break;
                }
            }
            Object next2 = null;
            zma zma = (zma) next2;
            if (zma != null) {
                FiltersCarouselPresenter.c(this.a).b(zma);
            }
        }
    }

    static final class ak<T, R> implements ajfc<defpackage.abyy.a, ajdb> {
        private /* synthetic */ FiltersCarouselPresenter a;
        private /* synthetic */ abyy b;
        private /* synthetic */ boolean c;

        ak(FiltersCarouselPresenter filtersCarouselPresenter, abyy abyy, boolean z) {
            this.a = filtersCarouselPresenter;
            this.b = abyy;
            this.c = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            boolean equals;
            ajcx a;
            defpackage.abyy.a aVar = (defpackage.abyy.a) obj;
            akcr.b(aVar, "it");
            obj = aVar.a();
            akcr.a(obj, "it.build()");
            abzt a2 = obj.a();
            abzt abzt = null;
            if (a2 != null) {
                Object a3;
                abyy abyy = this.b;
                if (abyy != null) {
                    a3 = abyy.a();
                }
                equals = a2.equals(a3);
            } else {
                abyy abyy2 = this.b;
                if (abyy2 != null) {
                    abzt = abyy2.a();
                }
                equals = abzt == null;
            }
            if (equals) {
                a = ajvo.a(ajhn.a);
            } else {
                FiltersCarouselPresenter filtersCarouselPresenter = this.a;
                abyy abyy3 = this.b;
                boolean z = this.c;
                ajcx e = filtersCarouselPresenter.q.a((ajfl) bb.a).e().e((ajfc) new bc(filtersCarouselPresenter));
                akcr.a((Object) e, "onInitialized.filter { i…s.mainThread())\n        }");
                if (abyy3 != null) {
                    abzt = abyy3.a();
                    if (abzt != null && (abzt.q() || z)) {
                        defpackage.akdd.a aVar2 = new defpackage.akdd.a();
                        aVar2.a = true;
                        a = e.b((ajdb) ajdp.b((Iterable) filtersCarouselPresenter.I).a((ajdw) filtersCarouselPresenter.c().b()).k((ajfc) new ay(z, abzt)).a((ajdw) filtersCarouselPresenter.c().b()).k((ajfc) new az(abzt)).a((ajfc) new ba(filtersCarouselPresenter, aVar2), false));
                        akcr.a((Object) a, "clearFiltersCompletable.…              }\n        )");
                    }
                }
                a = e;
            }
            return a;
        }
    }

    static final class aq<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ acae a;
        private /* synthetic */ FiltersCarouselPresenter b;
        private /* synthetic */ String c;
        private /* synthetic */ ajei d;

        aq(acae acae, FiltersCarouselPresenter filtersCarouselPresenter, String str, ajei ajei) {
            this.a = acae;
            this.b = filtersCarouselPresenter;
            this.c = str;
            this.d = ajei;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "bitmaps");
            kaz kaz = (kaz) ajzm.a((Iterable) list).get(this.a);
            if (kaz != null) {
                ajdp b = ajdp.b(ajxs.a(ohy.SKY_FILTER, igk.a(kaz.a(this.c), this.d)));
                if (b != null) {
                    return b;
                }
            }
            return ajvo.a(ajot.a);
        }
    }

    static final class ay<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ boolean a;
        private /* synthetic */ abzt b;

        ay(boolean z, abzt abzt) {
            this.a = z;
            this.b = abzt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (tqi) obj;
            akcr.b(obj, "filterSection");
            if (!this.a) {
                return ajdp.b(obj);
            }
            obj.b(this.b);
            return obj.c().e().f(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((znh) obj, "it");
                    return obj;
                }
            }).i();
        }
    }

    static final class az<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ abzt a;

        az(abzt abzt) {
            this.a = abzt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            tqi tqi = (tqi) obj;
            akcr.b(tqi, "it");
            return tqi.a(this.a);
        }
    }

    static final class ba<T, R> implements ajfc<Optional<zmy>, ajdb> {
        final /* synthetic */ FiltersCarouselPresenter a;
        final /* synthetic */ defpackage.akdd.a b;

        ba(FiltersCarouselPresenter filtersCarouselPresenter, defpackage.akdd.a aVar) {
            this.a = filtersCarouselPresenter;
            this.b = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "viewModelOptional");
            if (!optional.isPresent()) {
                return ajvo.a(ajhn.a);
            }
            final zmy zmy = (zmy) optional.get();
            return ajcx.a((Runnable) new Runnable(this) {
                private /* synthetic */ ba a;

                public final void run() {
                    String str = "ImmutableList.of(viewModel)";
                    tth b;
                    if (this.a.b.a) {
                        b = FiltersCarouselPresenter.b(this.a.a);
                        ImmutableList of = ImmutableList.of(zmy);
                        akcr.a((Object) of, str);
                        b.a(of);
                    } else {
                        StackingRecyclerView stackingRecyclerView = this.a.a.g;
                        if (stackingRecyclerView != null) {
                            Adapter adapter = stackingRecyclerView.getAdapter();
                            if (adapter != null) {
                                if (!(adapter instanceof LoopingAdapter)) {
                                    adapter = null;
                                }
                                if (adapter != null) {
                                    if (adapter != null) {
                                        ((LoopingAdapter) adapter).a(false);
                                    } else {
                                        throw new ajxt("null cannot be cast to non-null type com.snap.ui.recycling.adapter.LoopingAdapter<android.support.v7.widget.RecyclerView.ViewHolder!>");
                                    }
                                }
                            }
                        }
                        FiltersCarouselPresenter.b(this.a.a).a(true);
                        b = FiltersCarouselPresenter.b(this.a.a);
                        ImmutableList of2 = ImmutableList.of(zmy);
                        akcr.a((Object) of2, str);
                        b.a(of2);
                        FiltersCarouselPresenter.b(this.a.a).c = true;
                    }
                    this.a.b.a = false;
                }
            }).b((ajdb) ajcx.a((ajev) new ajev(this) {
                private /* synthetic */ ba a;

                public final void run() {
                    int itemCount = FiltersCarouselPresenter.c(this.a.a).getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        if (zmy.areItemsTheSame(FiltersCarouselPresenter.c(this.a.a).a(i))) {
                            StackingRecyclerView stackingRecyclerView = this.a.a.g;
                            if (stackingRecyclerView != null) {
                                LayoutManager layoutManager = stackingRecyclerView.getLayoutManager();
                                if (layoutManager != null) {
                                    layoutManager.scrollToPosition(LoopingAdapter.a(FiltersCarouselPresenter.c(this.a.a).getItemCount(), i));
                                }
                            }
                            FiltersCarouselPresenter.a(this.a.a).a(0);
                            return;
                        }
                    }
                }
            })).b((ajdw) this.a.c().l());
        }
    }

    static final class bb<T> implements ajfl<Boolean> {
        public static final bb a = new bb();

        bb() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    static final class bc<T, R> implements ajfc<Boolean, ajdb> {
        final /* synthetic */ FiltersCarouselPresenter a;

        /* renamed from: com.snap.preview.carousel.FiltersCarouselPresenter$bc$1 */
        static final class AnonymousClass1 implements Runnable {
            private /* synthetic */ bc a;

            AnonymousClass1(bc bcVar) {
                this.a = bcVar;
            }

            public final void run() {
                int i = 0;
                FiltersCarouselPresenter.b(this.a.a).a(false);
                FiltersCarouselPresenter.b(this.a.a).d();
                StackingRecyclerView stackingRecyclerView = this.a.a.g;
                if (stackingRecyclerView != null) {
                    LayoutManager layoutManager = stackingRecyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        Integer valueOf = Integer.valueOf(FiltersCarouselPresenter.c(this.a.a).getItemCount());
                        if ((((Number) valueOf).intValue() > 0 ? 1 : null) == null) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            i = Integer.valueOf(LoopingAdapter.a(valueOf.intValue(), 0)).intValue();
                        }
                        layoutManager.scrollToPosition(i);
                    }
                }
            }
        }

        bc(FiltersCarouselPresenter filtersCarouselPresenter) {
            this.a = filtersCarouselPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return ajcx.a((Runnable) new AnonymousClass1(this)).b((ajdw) this.a.c().l());
        }
    }

    static final class o<T, R> implements ajfc<List<? extends abyi>, ajdb> {
        private /* synthetic */ FiltersCarouselPresenter a;
        private /* synthetic */ defpackage.abzt.a b;

        o(FiltersCarouselPresenter filtersCarouselPresenter, defpackage.abzt.a aVar) {
            this.a = filtersCarouselPresenter;
            this.b = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((List) obj, "it");
            Iterable<tqi> iterable = this.a.I;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (tqi a : iterable) {
                arrayList.add(a.a(this.b));
            }
            return ajcx.a((Iterable) (List) arrayList);
        }
    }

    static final class r<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ FiltersCarouselPresenter a;
        private /* synthetic */ abzy b;
        private /* synthetic */ abyy c;
        private /* synthetic */ ajei d;

        r(FiltersCarouselPresenter filtersCarouselPresenter, abzy abzy, abyy abyy, ajei ajei) {
            this.a = filtersCarouselPresenter;
            this.b = abzy;
            this.c = abyy;
            this.d = ajei;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((abzy) obj, "it");
            return this.a.f().a(this.a.K.a(this.b, this.c.u(), this.c.v()), (idl) this.a.B.getPage(), new defpackage.jxa.a().a(this.d).b()).b((ajdw) this.a.c().f());
        }
    }

    static final class s<T, R> implements ajfc<List<kaz<jwj>>, ajdb> {
        private /* synthetic */ Canvas a;
        private /* synthetic */ abzy b;

        s(Canvas canvas, abzy abzy) {
            this.a = canvas;
            this.b = abzy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<kaz> list = (List) obj;
            akcr.b(list, "it");
            for (kaz kaz : list) {
                Object a = kaz.a();
                akcr.a(a, "refCountDisposable.get()");
                a = ((jwj) a).a();
                akcr.a(a, "refCountDisposable.get().underlyingBitmap");
                Canvas canvas = this.a;
                int e = this.b.e();
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                int width2 = a.getWidth();
                int height2 = a.getHeight();
                abtl abtl = new abtl(this.a.getWidth(), this.a.getHeight());
                int width3 = a.getWidth();
                int height3 = a.getHeight();
                akcr.b(abtl, "videoDimension");
                canvas.drawBitmap(a, tyo.a(e, 1.0f, 1.0f, width, height, width2, height2, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, Math.max(1.0f, ((((float) height3) * ((float) Math.min(abtl.c(), abtl.b()))) / ((float) width3)) / ((float) Math.max(abtl.c(), abtl.b()))), MapboxConstants.MINIMUM_ZOOM), null);
                kaz.dispose();
            }
            return ajvo.a(ajhn.a);
        }
    }

    static final class t implements ajev {
        private /* synthetic */ ajei a;

        t(ajei ajei) {
            this.a = ajei;
        }

        public final void run() {
            this.a.dispose();
        }
    }

    static final class d extends akcs implements akbl<aaim, aamf> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aaim aaim = (aaim) obj;
            akcr.b(aaim, "it");
            return aaim.C();
        }
    }

    static final class e extends akcs implements akbl<aaim, Long> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aaim aaim = (aaim) obj;
            akcr.b(aaim, "it");
            return aaim.e();
        }
    }

    static final class f extends akcs implements akbl<aaim, Long> {
        public static final f a = new f();

        f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aaim aaim = (aaim) obj;
            akcr.b(aaim, "it");
            return aaim.an();
        }
    }

    static final class g extends akcs implements akbl<aaim, String> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aaim aaim = (aaim) obj;
            akcr.b(aaim, "it");
            return aaim.ap();
        }
    }

    static final class h extends akcs implements akbl<aaim, String> {
        public static final h a = new h();

        h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aaim aaim = (aaim) obj;
            akcr.b(aaim, "it");
            return aaim.ao();
        }
    }

    static final class i extends akcs implements akbl<aaim, aama> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aaim aaim = (aaim) obj;
            akcr.b(aaim, "it");
            return aaim.ag();
        }
    }

    static final class j extends akcs implements akbl<aaim, Long> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aaim aaim = (aaim) obj;
            akcr.b(aaim, "it");
            return aaim.z();
        }
    }

    static final class k extends akcs implements akbl<aaim, Long> {
        public static final k a = new k();

        k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aaim aaim = (aaim) obj;
            akcr.b(aaim, "it");
            return aaim.ay();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(FiltersCarouselPresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(FiltersCarouselPresenter.class), "editsChangedSubject", "getEditsChangedSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(FiltersCarouselPresenter.class), "firstSectionLoaded", "getFirstSectionLoaded()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(FiltersCarouselPresenter.class), "adInfoNavigator", "getAdInfoNavigator()Lcom/snap/ads/api/AdInfoNavigator;"), new akdc(akde.a(FiltersCarouselPresenter.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(FiltersCarouselPresenter.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;"), new akdc(akde.a(FiltersCarouselPresenter.class), "carouselDataSource", "getCarouselDataSource()Lcom/snap/preview/carousel/data/FilterCarouselDataSource;"), new akdc(akde.a(FiltersCarouselPresenter.class), "geofilterOverlayUriProvider", "getGeofilterOverlayUriProvider()Lcom/snap/media/api/rendering/GeofilterOverlayUriProvider;"), new akdc(akde.a(FiltersCarouselPresenter.class), "geofilterPipelineContextStore", "getGeofilterPipelineContextStore()Lcom/snap/media/api/overlay/GeofilterPipelineContextStore;"), new akdc(akde.a(FiltersCarouselPresenter.class), "dataObserver", "getDataObserver()Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;"), new akdc(akde.a(FiltersCarouselPresenter.class), "scrollListener", "getScrollListener()Lcom/snap/ui/recycling/context/ObservableOnScrollListener;")};
        a aVar = new a();
    }

    public FiltersCarouselPresenter(toc toc, zgb zgb, jwe jwe, tvd tvd, DisplayMetrics displayMetrics, Activity activity, toi toi, ncd ncd, List<tqi> list, ttc ttc, oet oet, ajwy<twd> ajwy, ajwy<tol> ajwy2, jwb jwb, ajwy<cjp> ajwy3, ajwy<ttf> ajwy4, ajwy<oeu> ajwy5, ajwy<oeb> ajwy6) {
        toc toc2 = toc;
        zgb zgb2 = zgb;
        jwe jwe2 = jwe;
        tvd tvd2 = tvd;
        DisplayMetrics displayMetrics2 = displayMetrics;
        Activity activity2 = activity;
        toi toi2 = toi;
        ncd ncd2 = ncd;
        List<tqi> list2 = list;
        ttc ttc2 = ttc;
        oet oet2 = oet;
        ajwy<twd> ajwy7 = ajwy;
        ajwy<tol> ajwy8 = ajwy2;
        jwb jwb2 = jwb;
        ajwy<cjp> ajwy9 = ajwy3;
        ajwy<ttf> ajwy10 = ajwy4;
        akcr.b(toc2, "previewFeature");
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(jwe2, "bitmapLoaderFactory");
        akcr.b(tvd2, "previewDataSource");
        akcr.b(displayMetrics2, "displayMetrics");
        akcr.b(activity2, Event.ACTIVITY);
        akcr.b(toi2, "analyticsProviderStorage");
        akcr.b(ncd2, "locationPermissionsRequester");
        akcr.b(list2, "filterSections");
        akcr.b(ttc2, "carouselAnalytics");
        akcr.b(oet2, "geofilterUriProvider");
        akcr.b(ajwy7, "previewMetricsPluginProvider");
        akcr.b(ajwy8, "previewBlizzardEventLoggerProvider");
        akcr.b(jwb2, "bitmapFactoryProvider");
        akcr.b(ajwy9, "adInfoNavigatorProvider");
        akcr.b(ajwy4, "filterCarouselDataSourceProvider");
        akcr.b(ajwy5, "geofilterOverlayUriProvider");
        akcr.b(ajwy6, "geofilterPipelineContextStoreProvider");
        ajwy<ttf> ajwy11 = ajwy4;
        this.B = toc2;
        this.Y = zgb2;
        this.C = jwe2;
        this.D = tvd2;
        this.E = displayMetrics2;
        this.F = activity2;
        this.G = toi2;
        this.H = ncd2;
        this.I = list2;
        this.J = ttc2;
        this.K = oet2;
        this.L = ajwy7;
        this.M = ajwy8;
        this.a = ajxh.a(new c(ajwy9));
        this.Q = ajxh.a(new m(this));
        this.p = ajxh.a(new l(jwb));
        this.R = ajxh.a(new n(this, ajwy11));
        Object i = ajwl.i(Boolean.FALSE);
        String str = "BehaviorSubject.createDefault(false)";
        akcr.a(i, str);
        this.q = i;
        this.r = new ajei();
        i = ajwl.i(Boolean.FALSE);
        akcr.a(i, str);
        this.s = i;
        ajwy<oeb> ajwy12 = ajwy6;
        this.S = ajxh.a(new x(ajwy5));
        this.T = ajxh.a(new y(ajwy12));
        this.v = true;
        this.z = new AtomicBoolean(false);
        this.V = "filter_tool";
        this.W = ajxh.a(new q(this));
        this.X = ajxh.a(new at(this));
    }

    private final ajdx<defpackage.abyy.a> a(defpackage.abyy.a aVar, defpackage.abzt.a aVar2) {
        Object c = this.D.b.e((ajfc) new o(this, aVar2)).c((Callable) new p(aVar2, aVar));
        akcr.a(c, "previewDataSource.mediaP…ngData)\n                }");
        return c;
    }

    public static final /* synthetic */ tth b(FiltersCarouselPresenter filtersCarouselPresenter) {
        tth tth = filtersCarouselPresenter.x;
        if (tth == null) {
            akcr.a("stackedFiltersController");
        }
        return tth;
    }

    public static final /* synthetic */ zmg c(FiltersCarouselPresenter filtersCarouselPresenter) {
        zmg zmg = filtersCarouselPresenter.f;
        if (zmg == null) {
            akcr.a("adapter");
        }
        return zmg;
    }

    public static final /* synthetic */ zms d(FiltersCarouselPresenter filtersCarouselPresenter) {
        zms zms = filtersCarouselPresenter.c;
        if (zms == null) {
            akcr.a("viewFactory");
        }
        return zms;
    }

    public static final /* synthetic */ zkf e(FiltersCarouselPresenter filtersCarouselPresenter) {
        zkf zkf = filtersCarouselPresenter.e;
        if (zkf == null) {
            akcr.a("bus");
        }
        return zkf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ed  */
    public static final /* synthetic */ void g(com.snap.preview.carousel.FiltersCarouselPresenter r14) {
        /*
        r0 = r14.f;
        r1 = "adapter";
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        defpackage.akcr.a(r1);
    L_0x0009:
        r0 = r0.getItemCount();
        if (r0 <= 0) goto L_0x021a;
    L_0x000f:
        r0 = r14.o;
        if (r0 == 0) goto L_0x021a;
    L_0x0013:
        r0 = r14.g;
        r2 = 0;
        if (r0 == 0) goto L_0x001d;
    L_0x0018:
        r0 = r0.getLayoutManager();
        goto L_0x001e;
    L_0x001d:
        r0 = r2;
    L_0x001e:
        r3 = r14.b;
        r4 = "bindingContext";
        if (r3 != 0) goto L_0x0027;
    L_0x0024:
        defpackage.akcr.a(r4);
    L_0x0027:
        r5 = r0 instanceof android.support.v7.widget.LinearLayoutManager;
        if (r5 != 0) goto L_0x002d;
    L_0x002b:
        r6 = r2;
        goto L_0x002e;
    L_0x002d:
        r6 = r0;
    L_0x002e:
        r6 = (android.support.v7.widget.LinearLayoutManager) r6;
        r3.a = r6;
        if (r5 == 0) goto L_0x021a;
    L_0x0034:
        r3 = r0;
        r3 = (android.support.v7.widget.LinearLayoutManager) r3;
        r5 = r3.findFirstVisibleItemPosition();
        r3 = r3.findLastVisibleItemPosition();
        r6 = 1;
        r7 = 0;
        r8 = "stackedFiltersController";
        if (r5 != r3) goto L_0x00ea;
    L_0x0045:
        r0 = r14.x;
        if (r0 != 0) goto L_0x004c;
    L_0x0049:
        defpackage.akcr.a(r8);
    L_0x004c:
        r0 = r0.a;
        if (r0 == 0) goto L_0x007d;
    L_0x0050:
        r0 = r14.f;
        if (r0 != 0) goto L_0x0057;
    L_0x0054:
        defpackage.akcr.a(r1);
    L_0x0057:
        r0 = r0.getItemCount();
        if (r0 > r6) goto L_0x007d;
    L_0x005d:
        r0 = r14.x;
        if (r0 != 0) goto L_0x0064;
    L_0x0061:
        defpackage.akcr.a(r8);
    L_0x0064:
        r0.a(r7);
        r1 = r0.b;
        r0 = r0.a();
        r0 = defpackage.tqn.a(r0.c, r2);
        r1.a(r0);
        r0 = r14.g;
        if (r0 == 0) goto L_0x0206;
    L_0x0078:
        r0.b();
        goto L_0x0206;
    L_0x007d:
        r0 = r14.i();
        if (r0 == 0) goto L_0x0206;
    L_0x0083:
        r2 = r14.J;
        r9 = r14.f;
        if (r9 != 0) goto L_0x008c;
    L_0x0089:
        defpackage.akcr.a(r1);
    L_0x008c:
        r9 = r9.getItemCount();
        r9 = r5 % r9;
        r10 = r14.f;
        if (r10 != 0) goto L_0x0099;
    L_0x0096:
        defpackage.akcr.a(r1);
    L_0x0099:
        r1 = r10.getItemCount();
        r2.a(r5, r0, r9, r1);
        r1 = r14.x;
        if (r1 != 0) goto L_0x00a7;
    L_0x00a4:
        defpackage.akcr.a(r8);
    L_0x00a7:
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = r1.a(r0, r0, r2);
        r9 = r14.g;
        if (r9 == 0) goto L_0x00d5;
    L_0x00b1:
        r10 = r14.A;
        if (r10 == 0) goto L_0x00be;
    L_0x00b5:
        r11 = r9.getWidth();
        r11 = (float) r11;
        r11 = r11 * r1;
        r10.setTranslationX(r11);
    L_0x00be:
        r10 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1));
        if (r10 <= 0) goto L_0x00c8;
    L_0x00c4:
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 < 0) goto L_0x00d5;
    L_0x00c8:
        r1 = r14.x;
        if (r1 != 0) goto L_0x00cf;
    L_0x00cc:
        defpackage.akcr.a(r8);
    L_0x00cf:
        r1.a(r7);
        r9.b();
    L_0x00d5:
        r1 = r14.x;
        if (r1 != 0) goto L_0x00dc;
    L_0x00d9:
        defpackage.akcr.a(r8);
    L_0x00dc:
        r0 = com.google.common.collect.ImmutableList.of(r0);
        r2 = "ImmutableList.of(it)";
        defpackage.akcr.a(r0, r2);
        r1.a(r0);
        goto L_0x0206;
    L_0x00ea:
        r2 = r14.g;
        if (r2 == 0) goto L_0x0206;
    L_0x00ee:
        r9 = r2.getWidth();
        r0 = r0.getChildAt(r7);
        if (r0 != 0) goto L_0x00fb;
    L_0x00f8:
        defpackage.akcr.a();
    L_0x00fb:
        r0 = r0.getLeft();
        r9 = r9 + r0;
        r0 = (float) r9;
        r9 = r2.getWidth();
        r9 = (float) r9;
        r0 = r0 / r9;
        r9 = r14.f;
        if (r9 != 0) goto L_0x010e;
    L_0x010b:
        defpackage.akcr.a(r1);
    L_0x010e:
        r10 = r14.f;
        if (r10 != 0) goto L_0x0115;
    L_0x0112:
        defpackage.akcr.a(r1);
    L_0x0115:
        r10 = r10.getItemCount();
        r10 = r5 % r10;
        r9 = r9.a(r10);
        r10 = r14.f;
        if (r10 != 0) goto L_0x0126;
    L_0x0123:
        defpackage.akcr.a(r1);
    L_0x0126:
        r11 = r14.f;
        if (r11 != 0) goto L_0x012d;
    L_0x012a:
        defpackage.akcr.a(r1);
    L_0x012d:
        r11 = r11.getItemCount();
        r11 = r3 % r11;
        r10 = r10.a(r11);
        r11 = r14.J;
        r12 = "leftViewModel";
        defpackage.akcr.a(r9, r12);
        r12 = r14.f;
        if (r12 != 0) goto L_0x0145;
    L_0x0142:
        defpackage.akcr.a(r1);
    L_0x0145:
        r12 = r12.getItemCount();
        r12 = r5 % r12;
        r13 = r14.f;
        if (r13 != 0) goto L_0x0152;
    L_0x014f:
        defpackage.akcr.a(r1);
    L_0x0152:
        r1 = r13.getItemCount();
        r11.a(r5, r9, r12, r1);
        r1 = r9 instanceof defpackage.tui;
        if (r1 == 0) goto L_0x0163;
    L_0x015d:
        r1 = r9;
        r1 = (defpackage.tui) r1;
        r1 = r1.a;
        goto L_0x0171;
    L_0x0163:
        r1 = r9 instanceof defpackage.tug;
        if (r1 == 0) goto L_0x016f;
    L_0x0167:
        r1 = r9;
        r1 = (defpackage.tug) r1;
        r1 = r1.a;
        r1 = r1.a;
        goto L_0x0171;
    L_0x016f:
        r1 = defpackage.acae.UNFILTERED;
    L_0x0171:
        r11 = r10 instanceof defpackage.tui;
        if (r11 == 0) goto L_0x017b;
    L_0x0175:
        r11 = r10;
        r11 = (defpackage.tui) r11;
        r11 = r11.a;
        goto L_0x0189;
    L_0x017b:
        r11 = r10 instanceof defpackage.tug;
        if (r11 == 0) goto L_0x0187;
    L_0x017f:
        r11 = r10;
        r11 = (defpackage.tug) r11;
        r11 = r11.a;
        r11 = r11.a;
        goto L_0x0189;
    L_0x0187:
        r11 = defpackage.acae.UNFILTERED;
    L_0x0189:
        r12 = r14.x;
        if (r12 != 0) goto L_0x0190;
    L_0x018d:
        defpackage.akcr.a(r8);
    L_0x0190:
        r13 = "rightViewModel";
        defpackage.akcr.a(r10, r13);
        r9 = r12.a(r9, r10, r0);
        r10 = r14.x;
        if (r10 != 0) goto L_0x01a0;
    L_0x019d:
        defpackage.akcr.a(r8);
    L_0x01a0:
        r8 = r10.a;
        if (r8 != 0) goto L_0x01a9;
    L_0x01a4:
        r8 = r10.c;
        if (r8 != 0) goto L_0x01a9;
    L_0x01a8:
        goto L_0x01cd;
    L_0x01a9:
        r8 = r10.d;
        r10 = r8.isEmpty();
        if (r10 != 0) goto L_0x01cd;
    L_0x01b1:
        r10 = r8.get(r7);
        r10 = r10 instanceof defpackage.tui;
        if (r10 != 0) goto L_0x01ba;
    L_0x01b9:
        goto L_0x01cd;
    L_0x01ba:
        r8 = r8.get(r7);
        if (r8 == 0) goto L_0x01c5;
    L_0x01c0:
        r8 = (defpackage.tui) r8;
        r8 = r8.a;
        goto L_0x01cf;
    L_0x01c5:
        r14 = new ajxt;
        r0 = "null cannot be cast to non-null type com.snap.preview.carousel.ui.viewmodel.VisualFilterPageViewModel";
        r14.<init>(r0);
        throw r14;
    L_0x01cd:
        r8 = defpackage.acae.UNFILTERED;
    L_0x01cf:
        r10 = defpackage.acae.UNFILTERED;
        r12 = 0;
        if (r8 == r10) goto L_0x01de;
    L_0x01d4:
        r10 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1));
        if (r10 > 0) goto L_0x01d9;
    L_0x01d8:
        r1 = r8;
    L_0x01d9:
        r10 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1));
        if (r10 < 0) goto L_0x01de;
    L_0x01dd:
        r11 = r8;
    L_0x01de:
        r8 = r14.A;
        if (r8 == 0) goto L_0x01eb;
    L_0x01e2:
        r2 = r2.getWidth();
        r2 = (float) r2;
        r9 = r9 * r2;
        r8.setTranslationX(r9);
    L_0x01eb:
        if (r1 == r11) goto L_0x01f7;
    L_0x01ed:
        r2 = r14.u;
        if (r2 == 0) goto L_0x01f4;
    L_0x01f1:
        r2.a(r1, r11, r0);
    L_0x01f4:
        r14.U = r0;
        goto L_0x0206;
    L_0x01f7:
        r0 = r14.U;
        r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1));
        if (r0 == 0) goto L_0x0206;
    L_0x01fd:
        r0 = r14.u;
        if (r0 == 0) goto L_0x0204;
    L_0x0201:
        r0.a(r1, r1, r12);
    L_0x0204:
        r14.U = r12;
    L_0x0206:
        r14 = r14.b;
        if (r14 != 0) goto L_0x020d;
    L_0x020a:
        defpackage.akcr.a(r4);
    L_0x020d:
        if (r5 == r3) goto L_0x0210;
    L_0x020f:
        goto L_0x0211;
    L_0x0210:
        r6 = 0;
    L_0x0211:
        r14 = r14.d;
        r0 = java.lang.Boolean.valueOf(r6);
        r14.a(r0);
    L_0x021a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.preview.carousel.FiltersCarouselPresenter.g(com.snap.preview.carousel.FiltersCarouselPresenter):void");
    }

    public final String Z_() {
        return this.V;
    }

    public final ajcx a(defpackage.abyy.a aVar, int i, int i2) {
        Object d;
        String str;
        akcr.b(aVar, "editsBuilder");
        if (this.w) {
            d = a(aVar, new defpackage.abzt.a()).d();
            str = "composeEdits(editsBuilde…uilder()).toCompletable()";
        } else {
            d = ajcx.b((Throwable) new IllegalStateException("Edits must be locked before calling provideEdits"));
            str = "Completable.error(Illega…e calling provideEdits\"))";
        }
        akcr.a(d, str);
        return d;
    }

    public final ajcx a(abyy abyy, Canvas canvas, int i, int i2) {
        Object a;
        akcr.b(canvas, "canvas");
        String str = "Completable.complete()";
        if (abyy != null) {
            abzt a2 = abyy.a();
            if (a2 != null) {
                Object g = a2.g();
                if (g != null) {
                    akcr.a(g, "edits?.filters?.selected…rn Completable.complete()");
                    if (g.j()) {
                        a = ajvo.a(ajhn.a);
                        akcr.a(a, str);
                        return a;
                    }
                    String str2;
                    ajei ajei = new ajei();
                    ajdp n = ajdp.b(g).a((ajdw) c().b()).n(new r(this, g, abyy, ajei));
                    List g2 = g.g();
                    Object obj = (g2 == null || g2.isEmpty()) ? null : 1;
                    if (obj == null) {
                        obj = ajvo.a(ajot.a);
                        str2 = "Observable.empty<RefCoun…able<DisposableBitmap>>()";
                    } else {
                        oeb oeb = (oeb) this.T.b();
                        Object a3 = g.a();
                        akcr.a(a3, "geofilter.id");
                        oea a4 = oeb.a(a3, new oea());
                        obj = f().a(((oeu) this.S.b()).a(g, a4.a, a4.b), (idl) this.B.getPage(), new defpackage.jxa.a().a(ajei).b()).b((ajdw) c().f()).i();
                        str2 = "bitmapLoader.loadBitmap(…lers.io()).toObservable()";
                    }
                    akcr.a(obj, str2);
                    a = n.c((ajdt) obj).a(16).e((ajfc) new s(canvas, g)).f(new t(ajei));
                    akcr.a(a, "Observable.just(selected…mapDisposable.dispose() }");
                    return a;
                }
            }
        }
        a = ajvo.a(ajhn.a);
        akcr.a(a, str);
        return a;
    }

    /* JADX WARNING: Missing block: B:23:0x0060, code skipped:
            if (r4 == null) goto L_0x0062;
     */
    public final defpackage.ajcx a(defpackage.abyy r4, defpackage.ohz r5) {
        /*
        r3 = this;
        if (r4 == 0) goto L_0x006a;
    L_0x0002:
        r4 = r4.a();
        if (r4 == 0) goto L_0x006a;
    L_0x0008:
        r4 = r4.b();
        if (r4 == 0) goto L_0x006a;
    L_0x000e:
        r4 = (java.lang.Iterable) r4;
        r4 = r4.iterator();
    L_0x0014:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0036;
    L_0x001a:
        r0 = r4.next();
        r1 = r0;
        r1 = (defpackage.acad) r1;
        r2 = "it";
        defpackage.akcr.a(r1, r2);
        r1 = r1.a();
        r2 = "it.type";
        defpackage.akcr.a(r1, r2);
        r1 = r1.c();
        if (r1 == 0) goto L_0x0014;
    L_0x0035:
        goto L_0x0037;
    L_0x0036:
        r0 = 0;
    L_0x0037:
        r0 = (defpackage.acad) r0;
        if (r0 == 0) goto L_0x006a;
    L_0x003b:
        r4 = r0.a();
        if (r4 == 0) goto L_0x006a;
    L_0x0041:
        if (r5 == 0) goto L_0x0062;
    L_0x0043:
        r0 = r5.a;
        if (r0 == 0) goto L_0x0062;
    L_0x0047:
        r1 = defpackage.ohy.SKY_FILTER;
        r0 = r0.get(r1);
        r0 = (defpackage.ohx) r0;
        if (r0 == 0) goto L_0x0062;
    L_0x0051:
        r0 = r0.c;
        if (r0 == 0) goto L_0x0062;
    L_0x0055:
        r1 = new com.snap.preview.carousel.FiltersCarouselPresenter$al;
        r1.<init>(r0, r4, r3, r5);
        r1 = (java.util.concurrent.Callable) r1;
        r4 = defpackage.ajcx.b(r1);
        if (r4 != 0) goto L_0x0068;
    L_0x0062:
        r4 = defpackage.ajhn.a;
        r4 = defpackage.ajvo.a(r4);
    L_0x0068:
        if (r4 != 0) goto L_0x0075;
    L_0x006a:
        r4 = defpackage.ajhn.a;
        r4 = defpackage.ajvo.a(r4);
        r5 = "Completable.complete()";
        defpackage.akcr.a(r4, r5);
    L_0x0075:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.preview.carousel.FiltersCarouselPresenter.a(abyy, ohz):ajcx");
    }

    public final ajcx a(abyy abyy, boolean z) {
        Object e = a(new defpackage.abyy.a(), new defpackage.abzt.a()).e((ajfc) new ak(this, abyy, z));
        akcr.a(e, "composeEdits(Edits.Build…)\n            }\n        }");
        return e;
    }

    public final ajcx a(Canvas canvas, boolean z, akbl<? super String, Boolean> akbl) {
        Object a;
        String str;
        akcr.b(canvas, "canvas");
        akcr.b(akbl, ProfilingSessionReceiver.EXTRA_STRING_FIELD_FILTER);
        if (z) {
            a = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        } else {
            a = ajcx.b((Callable) new u(this, canvas));
            str = "Completable.fromCallable…nal(canvas)\n            }";
        }
        akcr.a(a, str);
        return a;
    }

    /* JADX WARNING: Missing block: B:9:0x0041, code skipped:
            if (r3 == null) goto L_0x0043;
     */
    public final defpackage.ajdp<defpackage.ajxm<defpackage.ohy, defpackage.kaz<defpackage.jwj>>> a(defpackage.abyy r3, boolean r4, java.lang.String r5, defpackage.ajei r6) {
        /*
        r2 = this;
        r0 = "edits";
        defpackage.akcr.b(r3, r0);
        r0 = "tag";
        defpackage.akcr.b(r5, r0);
        r0 = "externalDisposable";
        defpackage.akcr.b(r6, r0);
        r3 = r3.a();
        if (r3 == 0) goto L_0x0043;
    L_0x0015:
        r3 = r3.a();
        if (r3 == 0) goto L_0x0043;
    L_0x001b:
        r0 = "it";
        defpackage.akcr.a(r3, r0);
        r0 = r3.c();
        if (r0 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0028;
    L_0x0027:
        r3 = 0;
    L_0x0028:
        if (r3 == 0) goto L_0x0043;
    L_0x002a:
        r0 = r2.g();
        r0 = r0.e();
        r0 = r0.e();
        r1 = new com.snap.preview.carousel.FiltersCarouselPresenter$aq;
        r1.<init>(r3, r2, r5, r6);
        r1 = (defpackage.ajfc) r1;
        r3 = r0.d(r1);
        if (r3 != 0) goto L_0x0049;
    L_0x0043:
        r3 = defpackage.ajot.a;
        r3 = defpackage.ajvo.a(r3);
    L_0x0049:
        if (r4 == 0) goto L_0x0075;
    L_0x004b:
        r4 = new com.snap.preview.carousel.FiltersCarouselPresenter$ar;
        r4.<init>(r2, r5, r6);
        r4 = (java.util.concurrent.Callable) r4;
        r4 = defpackage.ajdp.b(r4);
        r5 = r2.c();
        r5 = r5.l();
        r5 = (defpackage.zfr) r5;
        r5 = (defpackage.ajdw) r5;
        r4 = r4.b(r5);
        r5 = r2.c();
        r5 = r5.h();
        r5 = (defpackage.ajdw) r5;
        r4 = r4.a(r5);
        goto L_0x007b;
    L_0x0075:
        r4 = defpackage.ajot.a;
        r4 = defpackage.ajvo.a(r4);
    L_0x007b:
        r3 = (defpackage.ajdt) r3;
        r4 = (defpackage.ajdt) r4;
        r3 = defpackage.ajdp.a(r3, r4);
        r4 = "Observable.concat(contex…, spectacleScreenOverlay)";
        defpackage.akcr.a(r3, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.preview.carousel.FiltersCarouselPresenter.a(abyy, boolean, java.lang.String, ajei):ajdp");
    }

    public final void a(aaim aaim, akez<? extends aaim> akez) {
        boolean z;
        boolean z2;
        akcr.b(aaim, "directSnapPreview");
        akcr.b(akez, "segmentEvents");
        aaim.a((aamf) akfh.b(akfh.c(akez, d.a)));
        aaim.F((Long) akfh.h(akfh.c(akfh.c(akez, f.a))));
        Iterator it = akez.iterator();
        do {
            z = true;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
        } while (!akcr.a(((aaim) it.next()).as(), Boolean.TRUE));
        z2 = true;
        aaim.r(Boolean.valueOf(z2));
        aaim.x((String) akfh.b(akfh.c(akez, g.a)));
        aaim.w((String) akfh.b(akfh.c(akez, h.a)));
        aaim.a((aama) akfh.b(akfh.c(akez, i.a)));
        for (aaim ah : akez) {
            if (akcr.a(ah.ah(), Boolean.TRUE)) {
                break;
            }
        }
        z = false;
        aaim.n(Boolean.valueOf(z));
        aaim.m((Long) akfh.h(akfh.c(akfh.c(akez, j.a))));
        aaim.K((Long) akfh.h(akfh.c(akfh.c(akez, k.a))));
        aaim.b((Long) akfh.h(akfh.c(akfh.c(akez, e.a))));
    }

    public final void a(akbw<? super String, ? super String, Boolean> akbw, int i) {
        akcr.b(akbw, "predicate");
        if (this.o) {
            String str = "filter_tool";
            if (((Boolean) akbw.invoke(str, str)).booleanValue()) {
                RecyclerView recyclerView = this.A;
                if (recyclerView != null) {
                    recyclerView.setVisibility(i);
                }
                StackingRecyclerView stackingRecyclerView = this.g;
                if (stackingRecyclerView != null) {
                    stackingRecyclerView.setVisibility(i);
                }
            }
        }
    }

    public final void a(iip iip) {
        zmg zmg;
        Object obj;
        String str = "previewAnalyticsWrapper";
        akcr.b(iip, str);
        for (tqi a : this.I) {
            a.a(iip);
        }
        ttc ttc = this.J;
        String str2 = null;
        if (this.f != null) {
            zmg = this.f;
            if (zmg == null) {
                akcr.a("adapter");
            }
        } else {
            zmg = null;
        }
        zml zml = zmg;
        akcr.b(iip, str);
        long j = 0;
        long itemCount = zml != null ? (long) zml.getItemCount() : 0;
        long j2 = (long) ttc.g;
        aann aann = iip.c;
        String str3 = ttc.a;
        if (str3 == null) {
            akcr.a("sessionId");
        }
        aann.setSessionId(str3);
        for (aaim aaim : iip.a()) {
            aaim.G(Long.valueOf(j2));
            aaim.J(Long.valueOf((long) ttc.j.size()));
            aaim.L(Long.valueOf((long) ttc.k.size()));
            aaim.a(ttc.b);
            aaim.I(Long.valueOf(itemCount));
            aaim.q(Boolean.valueOf(ttc.h));
            aaim.p(Boolean.valueOf(ttc.i));
        }
        iiq iiq = iip.d;
        aail aail = iip.b;
        str3 = aail.a();
        if (str3 == null) {
            str3 = "";
        }
        iiq.a(str3);
        Double y = aail.y();
        iiq.d = (y != null ? (long) y.doubleValue() : 0) * 1000;
        y = aail.B();
        iiq.c = (y != null ? (long) y.doubleValue() : 0) * 1000;
        Long o = aail.o();
        if (o != null) {
            j = o.longValue();
        }
        iiq.f = j;
        aasc A = aail.A();
        if (A != null) {
            str2 = A.name();
        }
        iiq.m = str2;
        iiq.e = j2;
        aalt aalt = ttc.b;
        if (aalt != null) {
            int i = iit.a[aalt.ordinal()];
            if (i == 1) {
                obj = defpackage.afkn.a.LEFT;
            } else if (i == 2) {
                obj = defpackage.afkn.a.RIGHT;
            }
            akcr.b(obj, "<set-?>");
            iiq.l = obj;
            iiq.a(ttc.l.a);
            iiq.g = itemCount;
        }
        obj = defpackage.afkn.a.NONE;
        akcr.b(obj, "<set-?>");
        iiq.l = obj;
        iiq.a(ttc.l.a);
        iiq.g = itemCount;
    }

    public final void a(boolean z) {
        this.w = z;
    }

    public final boolean a(abyy abyy) {
        if (abyy != null) {
            abzt a = abyy.a();
            if (a != null) {
                return a.f();
            }
        }
        return false;
    }

    public final ajdp<String> b() {
        Object d = d();
        akcr.a(d, "editsChangedSubject");
        return (ajdp) d;
    }

    public final zfw c() {
        return (zfw) this.N.b();
    }

    /* Access modifiers changed, original: final */
    public final ajwo<String> d() {
        return (ajwo) this.O.b();
    }

    public final ajwl<ajxw> e() {
        return (ajwl) this.P.b();
    }

    /* Access modifiers changed, original: final */
    public final jwc f() {
        return (jwc) this.Q.b();
    }

    public final ttf g() {
        return (ttf) this.R.b();
    }

    public final zmp h() {
        return (zmp) this.X.b();
    }

    public final zmy i() {
        StackingRecyclerView stackingRecyclerView = this.g;
        LayoutManager layoutManager = stackingRecyclerView != null ? stackingRecyclerView.getLayoutManager() : null;
        zmg zmg = this.f;
        String str = "adapter";
        if (zmg == null) {
            akcr.a(str);
        }
        if (zmg.getItemCount() <= 0 || !(layoutManager instanceof LinearLayoutManager)) {
            return null;
        }
        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1) {
            return null;
        }
        zmg zmg2 = this.f;
        if (zmg2 == null) {
            akcr.a(str);
        }
        zmg = this.f;
        if (zmg == null) {
            akcr.a(str);
        }
        return zmg2.a(findFirstVisibleItemPosition % zmg.getItemCount());
    }

    /* JADX WARNING: Missing block: B:12:0x0025, code skipped:
            if (r2 == null) goto L_0x0027;
     */
    public final int j() {
        /*
        r4 = this;
        r0 = r4;
        r0 = (com.snap.preview.carousel.FiltersCarouselPresenter) r0;
        r0 = r0.x;
        r1 = 0;
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        return r1;
    L_0x0009:
        r0 = r4.x;
        if (r0 != 0) goto L_0x0012;
    L_0x000d:
        r2 = "stackedFiltersController";
        defpackage.akcr.a(r2);
    L_0x0012:
        r0 = r0.a();
        r2 = r0.a();
        r3 = defpackage.acae.UNFILTERED;
        if (r2 == r3) goto L_0x001f;
    L_0x001e:
        r1 = 1;
    L_0x001f:
        r2 = r0.d;
        if (r2 == 0) goto L_0x0027;
    L_0x0023:
        r2 = r2.e;
        if (r2 != 0) goto L_0x002b;
    L_0x0027:
        r2 = r0.c;
        r2 = r2.e;
    L_0x002b:
        if (r2 == 0) goto L_0x0034;
    L_0x002d:
        r2 = (java.lang.Number) r2;
        r2.intValue();
        r1 = r1 + 1;
    L_0x0034:
        r2 = r0.b();
        if (r2 == 0) goto L_0x003c;
    L_0x003a:
        r1 = r1 + 1;
    L_0x003c:
        r0 = r0.c();
        r0 = r0.size();
        r1 = r1 + r0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.preview.carousel.FiltersCarouselPresenter.j():int");
    }
}
