package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.snap.preview.carousel.FiltersCarouselPresenter;
import com.snap.preview.carousel.FiltersCarouselPresenter.b;
import com.snap.preview.carousel.ui.StackingRecyclerView;
import com.snap.ui.recycling.adapter.LoopingAdapter;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;
import defpackage.txi.ax;
import defpackage.txi.ay;
import defpackage.txi.az;
import defpackage.txi.ba;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: tsu */
public final class tsu implements toe {
    public zfw a;
    final ajei b = new ajei();
    final ajxe c = ajxh.a(new a(this));
    final Context d;
    final ViewFinder e;
    final tpl f;
    final txi g;
    final FiltersCarouselPresenter h;
    final tvd i;
    final ajdp<tpd> j;
    final ajdp<MotionEvent> k;
    final tzg l;
    final ajdp<Boolean> m;
    final ajdp<ajxw> n;
    final ajwy<twd> o;
    final ajdv<ajxw> p;
    final ajwy<tof> q;
    private final String r = "CarouselPreloader";
    private final zgb s;
    private final toc t;

    /* renamed from: tsu$a */
    static final class a extends akcs implements akbk<1> {
        final /* synthetic */ tsu a;

        /* renamed from: tsu$a$1 */
        public static final class 1 implements b {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
            }

            public final void a(abzx abzx) {
                this.a.a.g.a((abzx != null ? abzx.a() : 1.0d) * 1.0d);
            }

            public final void a(acae acae, acae acae2, float f) {
                String str = "leftFilter";
                akcr.b(acae, str);
                String str2 = "rightFilter";
                akcr.b(acae2, str2);
                txi txi = this.a.a.g;
                akcr.b(acae, str);
                akcr.b(acae2, str2);
                txi.b.a(ajdp.a((ajdt) txi.m, (ajdt) txi.l, (ajex) az.a).a((ajdw) txi.c().h()).f((ajfb) new ba(txi, acae, acae2, f)));
            }

            public final void a(acae acae, kaz<jwj> kaz) {
                String str = "type";
                akcr.b(acae, str);
                String str2 = "bitmap";
                akcr.b(kaz, str2);
                txi txi = this.a.a.g;
                akcr.b(acae, str);
                akcr.b(kaz, str2);
                txi.b.a(ajdp.a((ajdt) txi.m, (ajdt) txi.l, (ajex) ax.a).a((ajdw) txi.c().h()).f((ajfb) new ay(txi, kaz, acae)));
            }
        }

        a(tsu tsu) {
            this.a = tsu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new 1(this);
        }
    }

    /* renamed from: tsu$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ tsu a;

        b(tsu tsu) {
            this.a = tsu;
        }

        private ajxm<FrameLayout, StackingRecyclerView> a() {
            FrameLayout frameLayout = (FrameLayout) this.a.e.findViewById(R.id.edits_container);
            View inflate = LayoutInflater.from(this.a.d).inflate(R.layout.preview_carousel, frameLayout, false);
            if (inflate != null) {
                StackingRecyclerView stackingRecyclerView = (StackingRecyclerView) inflate;
                stackingRecyclerView.setId(R.id.preview_carousel);
                return ajxs.a(frameLayout, stackingRecyclerView);
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.preview.carousel.ui.StackingRecyclerView");
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: tsu$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            FrameLayout frameLayout = (FrameLayout) ajxm.a;
            StackingRecyclerView stackingRecyclerView = (StackingRecyclerView) ajxm.b;
            if (frameLayout == null) {
                akcr.a();
            }
            Object obj2 = (ViewStub) frameLayout.findViewById(R.id.preview_carousel_stub);
            View view = (View) obj2;
            int indexOfChild = frameLayout.indexOfChild(view);
            frameLayout.removeViewInLayout(view);
            akcr.a(obj2, "viewStub");
            LayoutParams layoutParams = obj2.getLayoutParams();
            if (layoutParams != null) {
                frameLayout.addView(stackingRecyclerView, indexOfChild, layoutParams);
            } else {
                frameLayout.addView(stackingRecyclerView, indexOfChild);
            }
            return stackingRecyclerView;
        }
    }

    /* renamed from: tsu$d */
    static final class d<T, R> implements ajfc<StackingRecyclerView, ajdb> {
        final /* synthetic */ tsu a;

        /* renamed from: tsu$d$b */
        static final class b<T, R> implements ajfc<T, R> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "mediaPackages");
                aeew aeew = ((abyi) ajyu.f(list)).e;
                Object obj2 = aeew.b;
                akcr.a(obj2, "it.playbackRotationHint");
                int intValue = obj2.intValue();
                String str = aeew.s;
                obj = aeew.c;
                akcr.a(obj, "it.isHorizontallyFlipped");
                return new ttg(intValue, str, obj.booleanValue());
            }
        }

        /* renamed from: tsu$d$a */
        static final class a<T> implements ajwy<iip> {
            private /* synthetic */ d a;
            private /* synthetic */ StackingRecyclerView b;
            private /* synthetic */ ajdp c;
            private /* synthetic */ ajdp d;
            private /* synthetic */ ajdv e;
            private /* synthetic */ ajdp f;
            private /* synthetic */ ajdp g;
            private /* synthetic */ ajdp h;

            a(d dVar, StackingRecyclerView stackingRecyclerView, ajdp ajdp, ajdp ajdp2, ajdv ajdv, ajdp ajdp3, ajdp ajdp4, ajdp ajdp5) {
                this.a = dVar;
                this.b = stackingRecyclerView;
                this.c = ajdp;
                this.d = ajdp2;
                this.e = ajdv;
                this.f = ajdp3;
                this.g = ajdp4;
                this.h = ajdp5;
            }

            public final /* synthetic */ Object get() {
                return ((tof) this.a.a.q.get()).e();
            }
        }

        d(tsu tsu) {
            this.a = tsu;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:66:0x0377 in {4, 12, 15, 20, 24, 27, 30, 33, 36, 39, 42, 44, 49, 50, 53, 58, 60, 62, 64, 65} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private defpackage.ajcx a(com.snap.preview.carousel.ui.StackingRecyclerView r25) {
            /*
            r24 = this;
            r10 = r24;
            r0 = r25;
            r1 = "filterCarouselView";
            defpackage.akcr.b(r0, r1);
            r1 = r10.a;
            r1 = r1.h;
            r2 = r10.a;
            r2 = r2.c;
            r2 = r2.b();
            r2 = (com.snap.preview.carousel.FiltersCarouselPresenter.b) r2;
            r1.u = r2;
            r1 = r10.a;
            r11 = r1.k;
            r1 = r10.a;
            r1 = r1.l;
            r12 = r1.a();
            r1 = r10.a;
            r1 = r1.i;
            r1 = r1.b;
            r2 = defpackage.tsu.d.b.a;
            r2 = (defpackage.ajfc) r2;
            r1 = r1.f(r2);
            r13 = r1.i();
            r1 = "previewDataSource.mediaP…         }.toObservable()";
            defpackage.akcr.a(r13, r1);
            r1 = r10.a;
            r14 = r1.p;
            r1 = r10.a;
            r1 = r1.g;
            r1 = r1.g();
            r15 = r1.f();
            r1 = "skyFilterBaseBitmapSubject.hide()";
            defpackage.akcr.a(r15, r1);
            r1 = r10.a;
            r1 = r1.g;
            r9 = r1.p();
            r1 = r10.a;	 Catch:{ all -> 0x0374 }
            r8 = r1.h;	 Catch:{ all -> 0x0374 }
            r1 = r10.a;	 Catch:{ all -> 0x0374 }
            r1 = r1.m;	 Catch:{ all -> 0x0374 }
            r2 = r10.a;	 Catch:{ all -> 0x0374 }
            r2 = r2.a;	 Catch:{ all -> 0x0374 }
            if (r2 != 0) goto L_0x006c;	 Catch:{ all -> 0x0374 }
            r3 = "schedulers";	 Catch:{ all -> 0x0374 }
            defpackage.akcr.a(r3);	 Catch:{ all -> 0x0374 }
            r2 = r2.h();	 Catch:{ all -> 0x0374 }
            r2 = (defpackage.ajdw) r2;	 Catch:{ all -> 0x0374 }
            r7 = r1.a(r2);	 Catch:{ all -> 0x0374 }
            r1 = "previewVisibleObservable…dulers.userInteractive())";	 Catch:{ all -> 0x0374 }
            defpackage.akcr.a(r7, r1);	 Catch:{ all -> 0x0374 }
            r1 = r10.a;	 Catch:{ all -> 0x0374 }
            r6 = r1.n;	 Catch:{ all -> 0x0374 }
            r16 = new tsu$d$a;	 Catch:{ all -> 0x0374 }
            r1 = r16;
            r2 = r24;
            r3 = r25;
            r4 = r11;
            r5 = r13;
            r10 = r6;
            r6 = r14;
            r17 = r14;
            r14 = r7;
            r7 = r15;
            r18 = r8;
            r8 = r9;
            r19 = r9;
            r9 = r12;
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0370 }
            r1 = r16;	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajwy) r1;	 Catch:{ all -> 0x0370 }
            r2 = "recyclerViewParam";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.b(r0, r2);	 Catch:{ all -> 0x0370 }
            r2 = "previewTouchObservableParam";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.b(r11, r2);	 Catch:{ all -> 0x0370 }
            r2 = "previewVisibleObservableParam";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.b(r14, r2);	 Catch:{ all -> 0x0370 }
            r2 = "exitPreviewObservableParam";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.b(r10, r2);	 Catch:{ all -> 0x0370 }
            r2 = "snapRotationDataObservableParam";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.b(r13, r2);	 Catch:{ all -> 0x0370 }
            r2 = "scrollInFilterCarouselObserverParam";	 Catch:{ all -> 0x0370 }
            r3 = r17;	 Catch:{ all -> 0x0370 }
            defpackage.akcr.b(r3, r2);	 Catch:{ all -> 0x0370 }
            r2 = "skyFilterBaseBitmapObservableParam";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.b(r15, r2);	 Catch:{ all -> 0x0370 }
            r2 = "currentMediaTypeParam";	 Catch:{ all -> 0x0370 }
            r4 = r19;	 Catch:{ all -> 0x0370 }
            defpackage.akcr.b(r4, r2);	 Catch:{ all -> 0x0370 }
            r2 = "analyticsWrapperProvider";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.b(r1, r2);	 Catch:{ all -> 0x0370 }
            r2 = "currentEditingToolObservable";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.b(r12, r2);	 Catch:{ all -> 0x0370 }
            r2 = r18;	 Catch:{ all -> 0x0370 }
            r2.g = r0;	 Catch:{ all -> 0x0370 }
            r2.h = r11;	 Catch:{ all -> 0x0370 }
            r2.i = r14;	 Catch:{ all -> 0x0370 }
            r2.j = r10;	 Catch:{ all -> 0x0370 }
            r2.k = r13;	 Catch:{ all -> 0x0370 }
            r2.l = r3;	 Catch:{ all -> 0x0370 }
            r2.m = r15;	 Catch:{ all -> 0x0370 }
            r2.n = r4;	 Catch:{ all -> 0x0370 }
            r3 = 1;	 Catch:{ all -> 0x0370 }
            r2.o = r3;	 Catch:{ all -> 0x0370 }
            r2.y = r1;	 Catch:{ all -> 0x0370 }
            r1 = new tth;	 Catch:{ all -> 0x0370 }
            r13 = new tql;	 Catch:{ all -> 0x0370 }
            r5 = 0;	 Catch:{ all -> 0x0370 }
            r6 = 0;	 Catch:{ all -> 0x0370 }
            r7 = 0;	 Catch:{ all -> 0x0370 }
            r8 = 0;	 Catch:{ all -> 0x0370 }
            r9 = 0;	 Catch:{ all -> 0x0370 }
            r10 = 0;	 Catch:{ all -> 0x0370 }
            r11 = 63;	 Catch:{ all -> 0x0370 }
            r4 = r13;	 Catch:{ all -> 0x0370 }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0370 }
            r1.<init>(r13);	 Catch:{ all -> 0x0370 }
            r2.x = r1;	 Catch:{ all -> 0x0370 }
            r1 = new tqj;	 Catch:{ all -> 0x0370 }
            r15 = r2.F;	 Catch:{ all -> 0x0370 }
            r4 = r2.B;	 Catch:{ all -> 0x0370 }
            r17 = r2.c();	 Catch:{ all -> 0x0370 }
            r5 = r2.E;	 Catch:{ all -> 0x0370 }
            r6 = r2.a;	 Catch:{ all -> 0x0370 }
            r6 = r6.b();	 Catch:{ all -> 0x0370 }
            r6 = (defpackage.cjp) r6;	 Catch:{ all -> 0x0370 }
            r7 = "adInfoNavigator";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x0370 }
            r7 = r2.s;	 Catch:{ all -> 0x0370 }
            r8 = r2.H;	 Catch:{ all -> 0x0370 }
            r22 = r2.h();	 Catch:{ all -> 0x0370 }
            r23 = r0;	 Catch:{ all -> 0x0370 }
            r23 = (android.support.v7.widget.RecyclerView) r23;	 Catch:{ all -> 0x0370 }
            r14 = r1;	 Catch:{ all -> 0x0370 }
            r16 = r4;	 Catch:{ all -> 0x0370 }
            r18 = r5;	 Catch:{ all -> 0x0370 }
            r19 = r6;	 Catch:{ all -> 0x0370 }
            r20 = r7;	 Catch:{ all -> 0x0370 }
            r21 = r8;	 Catch:{ all -> 0x0370 }
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23);	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajej) r1;	 Catch:{ all -> 0x0370 }
            r0 = r2.r;	 Catch:{ all -> 0x0370 }
            r0 = (defpackage.ajfo) r0;	 Catch:{ all -> 0x0370 }
            r0 = defpackage.igk.a(r1, r0);	 Catch:{ all -> 0x0370 }
            r0 = (defpackage.tqj) r0;	 Catch:{ all -> 0x0370 }
            r2.b = r0;	 Catch:{ all -> 0x0370 }
            r0 = new zms;	 Catch:{ all -> 0x0370 }
            r1 = r2.b;	 Catch:{ all -> 0x0370 }
            r4 = "bindingContext";
            if (r1 != 0) goto L_0x014a;
            defpackage.akcr.a(r4);	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.zlx) r1;	 Catch:{ all -> 0x0370 }
            r5 = 3;	 Catch:{ all -> 0x0370 }
            r5 = new java.lang.Class[r5];	 Catch:{ all -> 0x0370 }
            r6 = defpackage.tto.class;	 Catch:{ all -> 0x0370 }
            r7 = 0;	 Catch:{ all -> 0x0370 }
            r5[r7] = r6;	 Catch:{ all -> 0x0370 }
            r6 = defpackage.zvn.class;	 Catch:{ all -> 0x0370 }
            r5[r3] = r6;	 Catch:{ all -> 0x0370 }
            r6 = 2;	 Catch:{ all -> 0x0370 }
            r8 = defpackage.iky.class;	 Catch:{ all -> 0x0370 }
            r5[r6] = r8;	 Catch:{ all -> 0x0370 }
            r5 = defpackage.ajym.d(r5);	 Catch:{ all -> 0x0370 }
            r5 = (java.util.Collection) r5;	 Catch:{ all -> 0x0370 }
            r0.<init>(r1, r5);	 Catch:{ all -> 0x0370 }
            r2.c = r0;	 Catch:{ all -> 0x0370 }
            r0 = new zkf;	 Catch:{ all -> 0x0370 }
            r0.<init>();	 Catch:{ all -> 0x0370 }
            r0 = (defpackage.ajej) r0;	 Catch:{ all -> 0x0370 }
            r1 = r2.r;	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajfo) r1;	 Catch:{ all -> 0x0370 }
            r0 = defpackage.igk.a(r0, r1);	 Catch:{ all -> 0x0370 }
            r0 = (defpackage.zkf) r0;	 Catch:{ all -> 0x0370 }
            r2.e = r0;	 Catch:{ all -> 0x0370 }
            r0 = r2.F;	 Catch:{ all -> 0x0370 }
            r0 = (android.content.Context) r0;	 Catch:{ all -> 0x0370 }
            r1 = r2.c();	 Catch:{ all -> 0x0370 }
            r1 = r1.h();	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajdw) r1;	 Catch:{ all -> 0x0370 }
            r5 = android.view.LayoutInflater.from(r0);	 Catch:{ all -> 0x0370 }
            r6 = new android.support.v7.widget.RecyclerView;	 Catch:{ all -> 0x0370 }
            r6.<init>(r0);	 Catch:{ all -> 0x0370 }
            r8 = new android.support.v7.widget.LinearLayoutManager;	 Catch:{ all -> 0x0370 }
            r8.<init>(r0);	 Catch:{ all -> 0x0370 }
            r8 = (android.support.v7.widget.RecyclerView.LayoutManager) r8;	 Catch:{ all -> 0x0370 }
            r6.setLayoutManager(r8);	 Catch:{ all -> 0x0370 }
            r6 = (android.view.ViewGroup) r6;	 Catch:{ all -> 0x0370 }
            r0 = new zmv;	 Catch:{ all -> 0x0370 }
            r0.<init>(r1, r5, r6);	 Catch:{ all -> 0x0370 }
            r2.t = r0;	 Catch:{ all -> 0x0370 }
            r0 = r2.c;	 Catch:{ all -> 0x0370 }
            if (r0 != 0) goto L_0x01ae;	 Catch:{ all -> 0x0370 }
            r1 = "viewFactory";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r1);	 Catch:{ all -> 0x0370 }
            r1 = r2.t;	 Catch:{ all -> 0x0370 }
            r5 = "preloader";
            if (r1 != 0) goto L_0x01b7;
            defpackage.akcr.a(r5);	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.zmx) r1;	 Catch:{ all -> 0x0370 }
            r0.setViewPrefetcher(r1);	 Catch:{ all -> 0x0370 }
            r0 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0370 }
            r0.<init>();	 Catch:{ all -> 0x0370 }
            r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0370 }
            r1 = r2.I;	 Catch:{ all -> 0x0370 }
            r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0370 }
            r1 = r1.iterator();	 Catch:{ all -> 0x0370 }
            r6 = r1.hasNext();	 Catch:{ all -> 0x0370 }
            if (r6 == 0) goto L_0x01df;	 Catch:{ all -> 0x0370 }
            r6 = r1.next();	 Catch:{ all -> 0x0370 }
            r6 = (defpackage.tqi) r6;	 Catch:{ all -> 0x0370 }
            r6 = r6.e();	 Catch:{ all -> 0x0370 }
            r0.putAll(r6);	 Catch:{ all -> 0x0370 }
            goto L_0x01cb;	 Catch:{ all -> 0x0370 }
            r1 = r2.t;	 Catch:{ all -> 0x0370 }
            if (r1 != 0) goto L_0x01e6;	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r5);	 Catch:{ all -> 0x0370 }
            r0 = r1.a(r0);	 Catch:{ all -> 0x0370 }
            r1 = "preloader.load(preloadMap)";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0370 }
            r0 = r0.d();	 Catch:{ all -> 0x0370 }
            r1 = "preloadViews(activity).cache()";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0370 }
            r2.d = r0;	 Catch:{ all -> 0x0370 }
            r0 = r2.d;	 Catch:{ all -> 0x0370 }
            if (r0 != 0) goto L_0x0203;	 Catch:{ all -> 0x0370 }
            r1 = "preloads";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r1);	 Catch:{ all -> 0x0370 }
            r0 = r0.e();	 Catch:{ all -> 0x0370 }
            r1 = r2.r;	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajfo) r1;	 Catch:{ all -> 0x0370 }
            defpackage.igk.a(r0, r1);	 Catch:{ all -> 0x0370 }
            r0 = r2.t;	 Catch:{ all -> 0x0370 }
            if (r0 != 0) goto L_0x0215;	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r5);	 Catch:{ all -> 0x0370 }
            r0 = (defpackage.ajej) r0;	 Catch:{ all -> 0x0370 }
            r1 = r2.r;	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajfo) r1;	 Catch:{ all -> 0x0370 }
            defpackage.igk.a(r0, r1);	 Catch:{ all -> 0x0370 }
            r0 = r2.h;	 Catch:{ all -> 0x0370 }
            if (r0 != 0) goto L_0x0227;	 Catch:{ all -> 0x0370 }
            r1 = "previewTouchObservable";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r1);	 Catch:{ all -> 0x0370 }
            r1 = com.snap.preview.carousel.FiltersCarouselPresenter.ad.a;	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.akbl) r1;	 Catch:{ all -> 0x0370 }
            r0 = defpackage.igs.a(r0, r12, r1);	 Catch:{ all -> 0x0370 }
            r1 = new com.snap.preview.carousel.FiltersCarouselPresenter$ae;	 Catch:{ all -> 0x0370 }
            r1.<init>(r2);	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x0370 }
            r0 = r0.f(r1);	 Catch:{ all -> 0x0370 }
            r1 = r2.r;	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajfo) r1;	 Catch:{ all -> 0x0370 }
            defpackage.igk.a(r0, r1);	 Catch:{ all -> 0x0370 }
            r0 = r2.b;	 Catch:{ all -> 0x0370 }
            if (r0 != 0) goto L_0x0248;	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r4);	 Catch:{ all -> 0x0370 }
            r0 = r0.g;	 Catch:{ all -> 0x0370 }
            r1 = new com.snap.preview.carousel.FiltersCarouselPresenter$af;	 Catch:{ all -> 0x0370 }
            r1.<init>(r2);	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x0370 }
            r0 = r0.f(r1);	 Catch:{ all -> 0x0370 }
            r1 = r2.r;	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajfo) r1;	 Catch:{ all -> 0x0370 }
            defpackage.igk.a(r0, r1);	 Catch:{ all -> 0x0370 }
            r0 = r2.D;	 Catch:{ all -> 0x0370 }
            r0 = r0.b;	 Catch:{ all -> 0x0370 }
            r1 = new com.snap.preview.carousel.FiltersCarouselPresenter$ag;	 Catch:{ all -> 0x0370 }
            r1.<init>(r2);	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x0370 }
            r0 = r0.e(r1);	 Catch:{ all -> 0x0370 }
            r1 = r2.r;	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajfo) r1;	 Catch:{ all -> 0x0370 }
            defpackage.igk.a(r0, r1);	 Catch:{ all -> 0x0370 }
            r0 = r2.g;	 Catch:{ all -> 0x0370 }
            if (r0 == 0) goto L_0x0297;	 Catch:{ all -> 0x0370 }
            r1 = new com.snap.preview.carousel.FiltersCarouselPresenter$aj;	 Catch:{ all -> 0x0370 }
            r1.<init>(r0, r2);	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajev) r1;	 Catch:{ all -> 0x0370 }
            r0 = defpackage.ajcx.a(r1);	 Catch:{ all -> 0x0370 }
            r1 = r2.c();	 Catch:{ all -> 0x0370 }
            r1 = r1.l();	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.zfr) r1;	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajdw) r1;	 Catch:{ all -> 0x0370 }
            r0 = r0.b(r1);	 Catch:{ all -> 0x0370 }
            r1 = "Completable.fromAction {…(schedulers.mainThread())";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0370 }
            goto L_0x02a0;	 Catch:{ all -> 0x0370 }
            r0 = defpackage.ajhn.a;	 Catch:{ all -> 0x0370 }
            r0 = defpackage.ajvo.a(r0);	 Catch:{ all -> 0x0370 }
            r1 = "Completable.complete()";	 Catch:{ all -> 0x0370 }
            goto L_0x0293;	 Catch:{ all -> 0x0370 }
            r1 = r2.g;	 Catch:{ all -> 0x0370 }
            if (r1 == 0) goto L_0x0323;	 Catch:{ all -> 0x0370 }
            r4 = r1.a();	 Catch:{ all -> 0x0370 }
            r5 = defpackage.ajfu.a;	 Catch:{ all -> 0x0370 }
            r4 = r4.j(r5);	 Catch:{ all -> 0x0370 }
            r5 = "stackingStateSubject.distinctUntilChanged()";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x0370 }
            r5 = r2.c();	 Catch:{ all -> 0x0370 }
            r5 = r5.b();	 Catch:{ all -> 0x0370 }
            r5 = (defpackage.ajdw) r5;	 Catch:{ all -> 0x0370 }
            r4 = r4.a(r5);	 Catch:{ all -> 0x0370 }
            r5 = new com.snap.preview.carousel.FiltersCarouselPresenter$au;	 Catch:{ all -> 0x0370 }
            r5.<init>(r2);	 Catch:{ all -> 0x0370 }
            r5 = (defpackage.ajfc) r5;	 Catch:{ all -> 0x0370 }
            r4 = r4.a(r5);	 Catch:{ all -> 0x0370 }
            r5 = r2.c();	 Catch:{ all -> 0x0370 }
            r5 = r5.b();	 Catch:{ all -> 0x0370 }
            r5 = (defpackage.ajdw) r5;	 Catch:{ all -> 0x0370 }
            r4 = r4.a(r5);	 Catch:{ all -> 0x0370 }
            r5 = new com.snap.preview.carousel.FiltersCarouselPresenter$av;	 Catch:{ all -> 0x0370 }
            r5.<init>(r1, r2);	 Catch:{ all -> 0x0370 }
            r5 = (defpackage.ajfb) r5;	 Catch:{ all -> 0x0370 }
            r1 = r4.f(r5);	 Catch:{ all -> 0x0370 }
            r4 = r2.r;	 Catch:{ all -> 0x0370 }
            r4 = (defpackage.ajfo) r4;	 Catch:{ all -> 0x0370 }
            defpackage.igk.a(r1, r4);	 Catch:{ all -> 0x0370 }
            r1 = new akdd$a;	 Catch:{ all -> 0x0370 }
            r1.<init>();	 Catch:{ all -> 0x0370 }
            r1.a = r7;	 Catch:{ all -> 0x0370 }
            r4 = new akdd$a;	 Catch:{ all -> 0x0370 }
            r4.<init>();	 Catch:{ all -> 0x0370 }
            r4.a = r3;	 Catch:{ all -> 0x0370 }
            r3 = r2.x;	 Catch:{ all -> 0x0370 }
            if (r3 != 0) goto L_0x0303;	 Catch:{ all -> 0x0370 }
            r5 = "stackedFiltersController";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r5);	 Catch:{ all -> 0x0370 }
            r3 = r3.b;	 Catch:{ all -> 0x0370 }
            r3 = (defpackage.ajdp) r3;	 Catch:{ all -> 0x0370 }
            r5 = defpackage.ajfu.a;	 Catch:{ all -> 0x0370 }
            r3 = r3.j(r5);	 Catch:{ all -> 0x0370 }
            r5 = new com.snap.preview.carousel.FiltersCarouselPresenter$aw;	 Catch:{ all -> 0x0370 }
            r5.<init>(r4, r1, r2);	 Catch:{ all -> 0x0370 }
            r5 = (defpackage.ajfb) r5;	 Catch:{ all -> 0x0370 }
            r1 = com.snap.preview.carousel.FiltersCarouselPresenter.ax.a;	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x0370 }
            r1 = r3.a(r5, r1);	 Catch:{ all -> 0x0370 }
            r3 = r2.r;	 Catch:{ all -> 0x0370 }
            r3 = (defpackage.ajfo) r3;	 Catch:{ all -> 0x0370 }
            defpackage.igk.a(r1, r3);	 Catch:{ all -> 0x0370 }
            r1 = r2.r;	 Catch:{ all -> 0x0370 }
            r3 = new com.snap.preview.carousel.FiltersCarouselPresenter$ah;	 Catch:{ all -> 0x0370 }
            r8 = r2;	 Catch:{ all -> 0x0370 }
            r8 = (com.snap.preview.carousel.FiltersCarouselPresenter) r8;	 Catch:{ all -> 0x0370 }
            r3.<init>(r8);	 Catch:{ all -> 0x0370 }
            r3 = (defpackage.akbk) r3;	 Catch:{ all -> 0x0370 }
            r4 = new tsx;	 Catch:{ all -> 0x0370 }
            r4.<init>(r3);	 Catch:{ all -> 0x0370 }
            r4 = (defpackage.ajev) r4;	 Catch:{ all -> 0x0370 }
            r3 = defpackage.ajek.a(r4);	 Catch:{ all -> 0x0370 }
            r1.a(r3);	 Catch:{ all -> 0x0370 }
            r1 = r2.r;	 Catch:{ all -> 0x0370 }
            r3 = r2.j;	 Catch:{ all -> 0x0370 }
            if (r3 != 0) goto L_0x0348;	 Catch:{ all -> 0x0370 }
            r4 = "exitPreviewObservable";	 Catch:{ all -> 0x0370 }
            defpackage.akcr.a(r4);	 Catch:{ all -> 0x0370 }
            r4 = new com.snap.preview.carousel.FiltersCarouselPresenter$ai;	 Catch:{ all -> 0x0370 }
            r4.<init>(r2);	 Catch:{ all -> 0x0370 }
            r4 = (defpackage.ajfb) r4;	 Catch:{ all -> 0x0370 }
            r3 = r3.f(r4);	 Catch:{ all -> 0x0370 }
            r1.a(r3);	 Catch:{ all -> 0x0370 }
            r1 = r2.r;	 Catch:{ all -> 0x0370 }
            r0 = defpackage.ajxs.a(r0, r1);	 Catch:{ all -> 0x0370 }
            r1 = r0.a;	 Catch:{ all -> 0x0370 }
            r1 = (defpackage.ajcx) r1;	 Catch:{ all -> 0x0370 }
            r0 = r0.b;	 Catch:{ all -> 0x0370 }
            r0 = (defpackage.ajej) r0;	 Catch:{ all -> 0x0370 }
            r2 = r24;
            r3 = r2.a;	 Catch:{ all -> 0x036e }
            r3 = r3.b;	 Catch:{ all -> 0x036e }
            defpackage.ajvv.a(r0, r3);	 Catch:{ all -> 0x036e }
            return r1;
            r0 = move-exception;
            goto L_0x0376;
            r0 = move-exception;
            r2 = r24;
            goto L_0x0376;
            r0 = move-exception;
            r2 = r10;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tsu$d.a(com.snap.preview.carousel.ui.StackingRecyclerView):ajcx");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((StackingRecyclerView) obj);
        }
    }

    /* renamed from: tsu$e */
    static final class e implements ajev {
        final /* synthetic */ tsu a;

        /* renamed from: tsu$e$1 */
        static final class 1<T> implements ajfb<tpd> {
            final /* synthetic */ e a;

            /* renamed from: tsu$e$1$1 */
            static final class 1 implements ajev {
                private /* synthetic */ 1 a;

                1(1 1) {
                    this.a = 1;
                }

                public final void run() {
                    FiltersCarouselPresenter filtersCarouselPresenter = this.a.a.a.h;
                    zmy i = filtersCarouselPresenter.i();
                    if (i != null) {
                        zmg zmg = filtersCarouselPresenter.f;
                        String str = "adapter";
                        if (zmg == null) {
                            akcr.a(str);
                        }
                        int itemCount = zmg.getItemCount();
                        for (int i2 = 0; i2 < itemCount; i2++) {
                            zmg zmg2 = filtersCarouselPresenter.f;
                            if (zmg2 == null) {
                                akcr.a(str);
                            }
                            if (i.areItemsTheSame(zmg2.a(i2))) {
                                StackingRecyclerView stackingRecyclerView = filtersCarouselPresenter.g;
                                if (stackingRecyclerView != null) {
                                    LayoutManager layoutManager = stackingRecyclerView.getLayoutManager();
                                    if (layoutManager != null) {
                                        zmg = filtersCarouselPresenter.f;
                                        if (zmg == null) {
                                            akcr.a(str);
                                        }
                                        layoutManager.scrollToPosition(LoopingAdapter.a(zmg.getItemCount(), i2));
                                    }
                                }
                                tqj tqj = filtersCarouselPresenter.b;
                                if (tqj == null) {
                                    akcr.a("bindingContext");
                                }
                                tqj.a(0);
                                return;
                            }
                        }
                    }
                }
            }

            /* renamed from: tsu$e$1$2 */
            static final class 2 implements ajdb {
                private /* synthetic */ 1 a;

                2(1 1) {
                    this.a = 1;
                }

                public final void a(ajcz ajcz) {
                    akcr.b(ajcz, "it");
                    this.a.a.a.h.v = false;
                }
            }

            1(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                tpd tpd = (tpd) obj;
                if (tpd != null) {
                    int i = tsv.a[tpd.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            this.a.a.h.v = true;
                        }
                        return;
                    }
                    ajej e = ajcx.a((ajev) new 1(this)).b((ajdb) new 2(this)).e();
                    akcr.a((Object) e, "Completable.fromAction {…             .subscribe()");
                    ajvv.a(e, this.a.a.b);
                }
            }
        }

        e(tsu tsu) {
            this.a = tsu;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:81:0x02eb in {11, 16, 19, 22, 27, 28, 29, 32, 33, 38, 39, 44, 47, 56, 61, 62, 63, 66, 72, 73, 77, 78, 80} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void run() {
            /*
            r17 = this;
            r1 = r17;
            r0 = r1.a;	 Catch:{ all -> 0x02e9 }
            r0 = r0.h;	 Catch:{ all -> 0x02e9 }
            r2 = r1.a;	 Catch:{ all -> 0x02e9 }
            r2 = r2.f;	 Catch:{ all -> 0x02e9 }
            r2 = defpackage.tpn.a(r2);	 Catch:{ all -> 0x02e9 }
            r3 = r1.a;	 Catch:{ all -> 0x02e9 }
            r3 = r3.g;	 Catch:{ all -> 0x02e9 }
            r13 = r3.d();	 Catch:{ all -> 0x02e9 }
            r3 = r1.a;	 Catch:{ all -> 0x02e9 }
            r14 = r3.f;	 Catch:{ all -> 0x02e9 }
            r3 = "mediaPlayerCapabilities";	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.b(r13, r3);	 Catch:{ all -> 0x02e9 }
            r3 = "previewStartUpConfig";	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.b(r14, r3);	 Catch:{ all -> 0x02e9 }
            r3 = r0.e();	 Catch:{ all -> 0x02e9 }
            r3 = r3.g();	 Catch:{ all -> 0x02e9 }
            r15 = r3.d();	 Catch:{ all -> 0x02e9 }
            r3 = r0.o;	 Catch:{ all -> 0x02e9 }
            if (r3 == 0) goto L_0x0210;	 Catch:{ all -> 0x02e9 }
            r3 = r0.I;	 Catch:{ all -> 0x02e9 }
            r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x02e9 }
            r16 = r3.iterator();	 Catch:{ all -> 0x02e9 }
            r3 = r16.hasNext();	 Catch:{ all -> 0x02e9 }
            r4 = "currentMediaType";
            if (r3 == 0) goto L_0x00a2;
            r3 = r16.next();	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.tqi) r3;	 Catch:{ all -> 0x02e9 }
            r5 = r0.n;	 Catch:{ all -> 0x02e9 }
            if (r5 != 0) goto L_0x0051;	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.a(r4);	 Catch:{ all -> 0x02e9 }
            r4 = r0.b;	 Catch:{ all -> 0x02e9 }
            r6 = "bindingContext";
            if (r4 != 0) goto L_0x005a;
            defpackage.akcr.a(r6);	 Catch:{ all -> 0x02e9 }
            r4 = r4.f;	 Catch:{ all -> 0x02e9 }
            r4 = r4.b();	 Catch:{ all -> 0x02e9 }
            r7 = r4;	 Catch:{ all -> 0x02e9 }
            r7 = (defpackage.ajdp) r7;	 Catch:{ all -> 0x02e9 }
            r8 = r0.i;	 Catch:{ all -> 0x02e9 }
            if (r8 != 0) goto L_0x006c;	 Catch:{ all -> 0x02e9 }
            r4 = "previewVisibleObservable";	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.a(r4);	 Catch:{ all -> 0x02e9 }
            r4 = r0.x;	 Catch:{ all -> 0x02e9 }
            if (r4 != 0) goto L_0x0075;	 Catch:{ all -> 0x02e9 }
            r9 = "stackedFiltersController";	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.a(r9);	 Catch:{ all -> 0x02e9 }
            r9 = r4;	 Catch:{ all -> 0x02e9 }
            r9 = (defpackage.tqm) r9;	 Catch:{ all -> 0x02e9 }
            r4 = r3 instanceof defpackage.ttu;	 Catch:{ all -> 0x02e9 }
            if (r4 == 0) goto L_0x0087;	 Catch:{ all -> 0x02e9 }
            r4 = r0.d;	 Catch:{ all -> 0x02e9 }
            if (r4 != 0) goto L_0x0085;	 Catch:{ all -> 0x02e9 }
            r10 = "preloads";	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.a(r10);	 Catch:{ all -> 0x02e9 }
            r10 = r4;	 Catch:{ all -> 0x02e9 }
            goto L_0x0088;	 Catch:{ all -> 0x02e9 }
            r10 = r15;	 Catch:{ all -> 0x02e9 }
            r4 = "if (it is VisualFilterPa… else visualFiltersLoaded";	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.a(r10, r4);	 Catch:{ all -> 0x02e9 }
            r4 = r0.b;	 Catch:{ all -> 0x02e9 }
            if (r4 != 0) goto L_0x0094;	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.a(r6);	 Catch:{ all -> 0x02e9 }
            r12 = r4.h;	 Catch:{ all -> 0x02e9 }
            r4 = r5;	 Catch:{ all -> 0x02e9 }
            r5 = r7;	 Catch:{ all -> 0x02e9 }
            r6 = r8;	 Catch:{ all -> 0x02e9 }
            r7 = r9;	 Catch:{ all -> 0x02e9 }
            r8 = r10;	 Catch:{ all -> 0x02e9 }
            r9 = r2;	 Catch:{ all -> 0x02e9 }
            r10 = r13;	 Catch:{ all -> 0x02e9 }
            r11 = r14;	 Catch:{ all -> 0x02e9 }
            r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x02e9 }
            goto L_0x003c;	 Catch:{ all -> 0x02e9 }
            r2 = defpackage.tpt.d(r14);	 Catch:{ all -> 0x02e9 }
            if (r2 == 0) goto L_0x00dd;	 Catch:{ all -> 0x02e9 }
            r2 = r0.n;	 Catch:{ all -> 0x02e9 }
            if (r2 != 0) goto L_0x00af;	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.a(r4);	 Catch:{ all -> 0x02e9 }
            r3 = 1;	 Catch:{ all -> 0x02e9 }
            r2 = r2.b(r3);	 Catch:{ all -> 0x02e9 }
            r3 = defpackage.ajfu.a;	 Catch:{ all -> 0x02e9 }
            r2 = r2.j(r3);	 Catch:{ all -> 0x02e9 }
            r3 = r0.c();	 Catch:{ all -> 0x02e9 }
            r3 = r3.l();	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.zfr) r3;	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.ajdw) r3;	 Catch:{ all -> 0x02e9 }
            r2 = r2.a(r3);	 Catch:{ all -> 0x02e9 }
            r3 = new com.snap.preview.carousel.FiltersCarouselPresenter$aa;	 Catch:{ all -> 0x02e9 }
            r3.<init>(r0);	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.ajfb) r3;	 Catch:{ all -> 0x02e9 }
            r2 = r2.f(r3);	 Catch:{ all -> 0x02e9 }
            r3 = r0.r;	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.ajfo) r3;	 Catch:{ all -> 0x02e9 }
            defpackage.igk.a(r2, r3);	 Catch:{ all -> 0x02e9 }
            r2 = r0.f;	 Catch:{ all -> 0x02e9 }
            r3 = "adapter";
            if (r2 != 0) goto L_0x00e6;
            defpackage.akcr.a(r3);	 Catch:{ all -> 0x02e9 }
            r4 = r0.I;	 Catch:{ all -> 0x02e9 }
            r2.a(r4);	 Catch:{ all -> 0x02e9 }
            r2 = r0.f;	 Catch:{ all -> 0x02e9 }
            if (r2 != 0) goto L_0x00f2;	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.a(r3);	 Catch:{ all -> 0x02e9 }
            r2 = r2.c();	 Catch:{ all -> 0x02e9 }
            r3 = r0.r;	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.ajfo) r3;	 Catch:{ all -> 0x02e9 }
            defpackage.igk.a(r2, r3);	 Catch:{ all -> 0x02e9 }
            r2 = defpackage.tpt.c(r14);	 Catch:{ all -> 0x02e9 }
            if (r2 == 0) goto L_0x0190;	 Catch:{ all -> 0x02e9 }
            r2 = defpackage.tpt.a(r14);	 Catch:{ all -> 0x02e9 }
            if (r2 != 0) goto L_0x0190;	 Catch:{ all -> 0x02e9 }
            r2 = r0.o;	 Catch:{ all -> 0x02e9 }
            if (r2 == 0) goto L_0x0190;	 Catch:{ all -> 0x02e9 }
            r2 = r0.g();	 Catch:{ all -> 0x02e9 }
            r3 = r0.m;	 Catch:{ all -> 0x02e9 }
            if (r3 != 0) goto L_0x011a;	 Catch:{ all -> 0x02e9 }
            r4 = "skyFilterBaseBitmapObservable";	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.a(r4);	 Catch:{ all -> 0x02e9 }
            r4 = r0.k;	 Catch:{ all -> 0x02e9 }
            r5 = "snapRotationDataObservable";
            if (r4 != 0) goto L_0x0123;
            defpackage.akcr.a(r5);	 Catch:{ all -> 0x02e9 }
            r6 = "snapBitmapObservable";	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.b(r3, r6);	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.b(r4, r5);	 Catch:{ all -> 0x02e9 }
            r5 = r2.e;	 Catch:{ all -> 0x02e9 }
            r6 = defpackage.tum.SKY_FILTER;	 Catch:{ all -> 0x02e9 }
            r6 = (defpackage.fth) r6;	 Catch:{ all -> 0x02e9 }
            r5 = r5.p(r6);	 Catch:{ all -> 0x02e9 }
            r6 = r2.a();	 Catch:{ all -> 0x02e9 }
            r6 = r6.f();	 Catch:{ all -> 0x02e9 }
            r6 = (defpackage.ajdw) r6;	 Catch:{ all -> 0x02e9 }
            r5 = r5.b(r6);	 Catch:{ all -> 0x02e9 }
            r5 = r5.e();	 Catch:{ all -> 0x02e9 }
            r6 = new ttf$h;	 Catch:{ all -> 0x02e9 }
            r6.<init>(r2);	 Catch:{ all -> 0x02e9 }
            r6 = (defpackage.ajfb) r6;	 Catch:{ all -> 0x02e9 }
            r5 = r5.c(r6);	 Catch:{ all -> 0x02e9 }
            r6 = new ttf$i;	 Catch:{ all -> 0x02e9 }
            r6.<init>(r2);	 Catch:{ all -> 0x02e9 }
            r6 = (defpackage.ajfl) r6;	 Catch:{ all -> 0x02e9 }
            r5 = r5.a(r6);	 Catch:{ all -> 0x02e9 }
            r6 = new ttf$j;	 Catch:{ all -> 0x02e9 }
            r6.<init>(r2, r3, r4);	 Catch:{ all -> 0x02e9 }
            r6 = (defpackage.ajfb) r6;	 Catch:{ all -> 0x02e9 }
            r3 = r5.d(r6);	 Catch:{ all -> 0x02e9 }
            r4 = "configurationProvider.ob…Source)\n                }";	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x02e9 }
            r2 = r2.b();	 Catch:{ all -> 0x02e9 }
            r2 = (defpackage.ajfo) r2;	 Catch:{ all -> 0x02e9 }
            defpackage.std.a(r3, r2);	 Catch:{ all -> 0x02e9 }
            r2 = r0.g();	 Catch:{ all -> 0x02e9 }
            r2 = r2.e();	 Catch:{ all -> 0x02e9 }
            r3 = new com.snap.preview.carousel.FiltersCarouselPresenter$z;	 Catch:{ all -> 0x02e9 }
            r3.<init>(r0);	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.ajfb) r3;	 Catch:{ all -> 0x02e9 }
            r2 = r2.f(r3);	 Catch:{ all -> 0x02e9 }
            r3 = r0.r;	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.ajfo) r3;	 Catch:{ all -> 0x02e9 }
            defpackage.igk.a(r2, r3);	 Catch:{ all -> 0x02e9 }
            r2 = r0.F;	 Catch:{ all -> 0x02e9 }
            r3 = new com.snap.preview.carousel.FiltersCarouselPresenter$am;	 Catch:{ all -> 0x02e9 }
            r3.<init>(r0);	 Catch:{ all -> 0x02e9 }
            r3 = (java.util.concurrent.Callable) r3;	 Catch:{ all -> 0x02e9 }
            r3 = defpackage.ajdx.c(r3);	 Catch:{ all -> 0x02e9 }
            r4 = r0.c();	 Catch:{ all -> 0x02e9 }
            r4 = r4.f();	 Catch:{ all -> 0x02e9 }
            r4 = (defpackage.ajdw) r4;	 Catch:{ all -> 0x02e9 }
            r3 = r3.b(r4);	 Catch:{ all -> 0x02e9 }
            r4 = r0.c();	 Catch:{ all -> 0x02e9 }
            r4 = r4.l();	 Catch:{ all -> 0x02e9 }
            r4 = (defpackage.zfr) r4;	 Catch:{ all -> 0x02e9 }
            r4 = (defpackage.ajdw) r4;	 Catch:{ all -> 0x02e9 }
            r3 = r3.a(r4);	 Catch:{ all -> 0x02e9 }
            r4 = new com.snap.preview.carousel.FiltersCarouselPresenter$an;	 Catch:{ all -> 0x02e9 }
            r4.<init>(r0, r2);	 Catch:{ all -> 0x02e9 }
            r4 = (defpackage.ajfc) r4;	 Catch:{ all -> 0x02e9 }
            r2 = r3.a(r4);	 Catch:{ all -> 0x02e9 }
            r3 = new com.snap.preview.carousel.FiltersCarouselPresenter$ao;	 Catch:{ all -> 0x02e9 }
            r3.<init>(r0);	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.ajfb) r3;	 Catch:{ all -> 0x02e9 }
            r2 = r2.c(r3);	 Catch:{ all -> 0x02e9 }
            r3 = com.snap.preview.carousel.FiltersCarouselPresenter.ap.a;	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.ajfc) r3;	 Catch:{ all -> 0x02e9 }
            r2 = r2.h(r3);	 Catch:{ all -> 0x02e9 }
            r3 = "Single.fromCallable {\n  …(false)\n                }";	 Catch:{ all -> 0x02e9 }
            defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x02e9 }
            r3 = com.snap.preview.carousel.FiltersCarouselPresenter.ab.a;	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.ajfb) r3;	 Catch:{ all -> 0x02e9 }
            r2 = r2.e(r3);	 Catch:{ all -> 0x02e9 }
            r3 = r0.r;	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.ajfo) r3;	 Catch:{ all -> 0x02e9 }
            defpackage.igk.a(r2, r3);	 Catch:{ all -> 0x02e9 }
            r2 = r0.s;	 Catch:{ all -> 0x02e9 }
            r3 = new com.snap.preview.carousel.FiltersCarouselPresenter$ac;	 Catch:{ all -> 0x02e9 }
            r3.<init>(r0);	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.ajfb) r3;	 Catch:{ all -> 0x02e9 }
            r2 = r2.f(r3);	 Catch:{ all -> 0x02e9 }
            r3 = r0.r;	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.ajfo) r3;	 Catch:{ all -> 0x02e9 }
            defpackage.igk.a(r2, r3);	 Catch:{ all -> 0x02e9 }
            r2 = r0.G;	 Catch:{ all -> 0x02e9 }
            r3 = r0;	 Catch:{ all -> 0x02e9 }
            r3 = (defpackage.toh) r3;	 Catch:{ all -> 0x02e9 }
            r2.a(r3);	 Catch:{ all -> 0x02e9 }
            r0 = r0.q;	 Catch:{ all -> 0x02e9 }
            r2 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x02e9 }
            r0.a(r2);	 Catch:{ all -> 0x02e9 }
            r0 = r1.a;
            r0 = r0.j;
            r2 = new tsu$e$1;
            r2.<init>(r1);
            r2 = (defpackage.ajfb) r2;
            r0 = r0.f(r2);
            r2 = "previewControlEventObser…  }\n                    }";
            defpackage.akcr.a(r0, r2);
            r2 = r1.a;
            r2 = r2.b;
            defpackage.ajvv.a(r0, r2);
            r0 = r1.a;
            r0 = r0.o;
            r0 = r0.get();
            r0 = (defpackage.twd) r0;
            r2 = defpackage.twb.FILTER_CAROUSEL_LOADED;
            r3 = 0;
            r4 = 6;
            defpackage.twd.a(r0, r2, r3, r4);
            r2 = r0.c;
            r3 = r2.d;
            r3 = r3.b();
            r2 = r2.c;
            if (r2 != 0) goto L_0x024d;
            r4 = "initialRuntimeMetric";
            defpackage.akcr.a(r4);
            r4 = "runtimeMetricBefore";
            defpackage.akcr.b(r2, r4);
            r4 = new zfz;
            r3 = r3.a;
            r2 = r2.a;
            r2 = defpackage.zfz.a(r3, r2);
            r4.<init>(r2);
            r2 = defpackage.twd.b.a;
            r2 = (defpackage.akbl) r2;
            r3 = "mapper";
            defpackage.akcr.b(r2, r3);
            r3 = new java.util.HashMap;
            r3.<init>();
            r4 = r4.a;
            r4 = r4.entrySet();
            r4 = r4.iterator();
            r5 = r4.hasNext();
            if (r5 == 0) goto L_0x02b4;
            r5 = r4.next();
            r5 = (java.util.Map.Entry) r5;
            r6 = r5.getKey();
            r6 = (defpackage.zfm) r6;
            r5 = r5.getValue();
            r5 = (java.lang.Number) r5;
            r7 = r5.longValue();
            r5 = r2.invoke(r6);
            r5 = (java.lang.String) r5;
            r6 = r3.get(r5);
            r6 = (java.lang.Long) r6;
            if (r6 != 0) goto L_0x02a7;
            r9 = 0;
            r6 = java.lang.Long.valueOf(r9);
            r9 = r6.longValue();
            r9 = r9 + r7;
            r6 = java.lang.Long.valueOf(r9);
            r3.put(r5, r6);
            goto L_0x0277;
            r3 = (java.util.Map) r3;
            r2 = r3.entrySet();
            r2 = r2.iterator();
            r3 = r2.hasNext();
            if (r3 == 0) goto L_0x02e8;
            r3 = r2.next();
            r3 = (java.util.Map.Entry) r3;
            r4 = r3.getKey();
            r4 = (java.lang.String) r4;
            r3 = r3.getValue();
            r3 = (java.lang.Number) r3;
            r5 = r3.longValue();
            r3 = r0.a;
            r7 = defpackage.ipc.PREVIEW_LOADING_CPU_USAGE;
            r8 = "feature";
            r4 = r7.a(r8, r4);
            r3.a(r4, r5);
            goto L_0x02be;
            return;
            r0 = move-exception;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tsu$e.run():void");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(tsu.class), "filtersListener", "getFiltersListener()Lcom/snap/preview/carousel/FiltersCarouselPresenter$OnFiltersUpdatedListener;");
    }

    public tsu(Context context, ViewFinder viewFinder, tpl tpl, zgb zgb, toc toc, txi txi, FiltersCarouselPresenter filtersCarouselPresenter, tvd tvd, ajdp<tpd> ajdp, ajdp<MotionEvent> ajdp2, tzg tzg, ajdp<Boolean> ajdp3, ajdp<ajxw> ajdp4, ajwy<twd> ajwy, ajdv<ajxw> ajdv, ajwy<tof> ajwy2) {
        Context context2 = context;
        ViewFinder viewFinder2 = viewFinder;
        tpl tpl2 = tpl;
        zgb zgb2 = zgb;
        toc toc2 = toc;
        txi txi2 = txi;
        FiltersCarouselPresenter filtersCarouselPresenter2 = filtersCarouselPresenter;
        tvd tvd2 = tvd;
        ajdp<tpd> ajdp5 = ajdp;
        ajdp<MotionEvent> ajdp6 = ajdp2;
        tzg tzg2 = tzg;
        ajdp<Boolean> ajdp7 = ajdp3;
        ajdp<ajxw> ajdp8 = ajdp4;
        ajwy<twd> ajwy3 = ajwy;
        ajdv<ajxw> ajdv2 = ajdv;
        akcr.b(context2, "context");
        akcr.b(viewFinder2, "viewFinder");
        akcr.b(tpl2, "previewStartUpConfig");
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(toc2, "previewFeature");
        akcr.b(txi2, "previewMediaPlayer");
        akcr.b(filtersCarouselPresenter2, "filtersCarouselPresenter");
        akcr.b(tvd2, "previewDataSource");
        akcr.b(ajdp5, "previewControlEventObservable");
        akcr.b(ajdp6, "gestureEventObservable");
        akcr.b(tzg2, "currentEditingToolManager");
        akcr.b(ajdp7, "previewVisibleObservable");
        akcr.b(ajdp8, "exitPreviewObservable");
        akcr.b(ajwy3, "previewMetricsPluginProvider");
        akcr.b(ajdv2, "scrollInFilterEventObserver");
        ajwy<tof> ajwy4 = ajwy2;
        akcr.b(ajwy4, "analyticsComposerProvider");
        this.d = context2;
        this.e = viewFinder2;
        this.f = tpl2;
        this.s = zgb2;
        this.t = toc2;
        this.g = txi2;
        this.h = filtersCarouselPresenter2;
        this.i = tvd2;
        this.j = ajdp5;
        this.k = ajdp6;
        this.l = tzg2;
        this.m = ajdp7;
        this.n = ajdp8;
        this.o = ajwy3;
        this.p = ajdv;
        this.q = ajwy4;
    }

    public final ajej start() {
        this.a = zgb.a(this.t.callsite("CarouselPreloader"));
        ajdx c = ajdx.c((Callable) new b(this));
        zfw zfw = this.a;
        String str = "schedulers";
        if (zfw == null) {
            akcr.a(str);
        }
        c = c.b((ajdw) zfw.h());
        zfw = this.a;
        if (zfw == null) {
            akcr.a(str);
        }
        c = c.a((ajdw) zfw.l()).f(c.a);
        zfw = this.a;
        if (zfw == null) {
            akcr.a(str);
        }
        ajcx e = c.a((ajdw) zfw.b()).e((ajfc) new d(this));
        zfw = this.a;
        if (zfw == null) {
            akcr.a(str);
        }
        ajej g = e.a((ajdw) zfw.l()).g(new e(this));
        akcr.a((Object) g, "Single.fromCallable {\n  …oaded()\n                }");
        ajvv.a(g, this.b);
        return this.b;
    }
}
