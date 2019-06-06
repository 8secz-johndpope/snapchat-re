package com.snap.lenses.camera.carousel;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import defpackage.ajde;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajen;
import defpackage.ajey;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfl;
import defpackage.ajfq;
import defpackage.ajfu;
import defpackage.ajjl;
import defpackage.ajvo;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxk;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.ajyn;
import defpackage.ajyu;
import defpackage.ajyw;
import defpackage.ajzg;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akef;
import defpackage.aken;
import defpackage.akuw;
import defpackage.aqd;
import defpackage.cfi;
import defpackage.ide;
import defpackage.lre;
import defpackage.lsd;
import defpackage.lsp;
import defpackage.mgw;
import defpackage.mgy;
import defpackage.mhd;
import defpackage.mia;
import defpackage.mii;
import defpackage.miq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.opencv.imgproc.Imgproc;

public final class DefaultCarouselView extends RelativeLayout implements lsd, mhd {
    lre a;
    CarouselListView b;
    ImageView c;
    a d;
    boolean e;
    final ajxe f;
    final ajxe g;
    private SnapImageView h;
    private View i;
    private int j;
    private ide k;
    private int l;
    private final ajxe m;
    private final ajxe n;
    private final ajen o;
    private final ajxe p;

    static abstract class a implements mgw {

        public static abstract class b extends a {
            private final defpackage.lsd.b.b a;

            public static final class c extends b implements mgw {
                final defpackage.lsd.b.b a;
                final boolean b;
                private final /* synthetic */ mia c = mia.b;

                public c(defpackage.lsd.b.b bVar, boolean z) {
                    akcr.b(bVar, MapboxEvent.KEY_MODEL);
                    super(bVar, (byte) 0);
                    this.a = bVar;
                    this.b = z;
                }

                public final Animator a() {
                    return mia.a;
                }

                public final defpackage.lsd.b.b b() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof c) {
                            c cVar = (c) obj;
                            if (akcr.a(this.a, cVar.a)) {
                                if ((this.b == cVar.b ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    defpackage.lsd.b.b bVar = this.a;
                    int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                    int i = this.b;
                    if (i != 0) {
                        i = 1;
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(super.toString());
                    stringBuilder.append(".Updated");
                    return stringBuilder.toString();
                }
            }

            public static final class a extends b {
                final defpackage.lsd.b.b a;
                final Animator b;

                public a(defpackage.lsd.b.b bVar, Animator animator) {
                    akcr.b(bVar, MapboxEvent.KEY_MODEL);
                    super(bVar, (byte) 0);
                    this.a = bVar;
                    this.b = animator;
                }

                public final Animator a() {
                    return this.b;
                }

                public final defpackage.lsd.b.b b() {
                    return this.a;
                }

                /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f;
                L_0x0002:
                    r0 = r3 instanceof com.snap.lenses.camera.carousel.DefaultCarouselView.a.b.a;
                    if (r0 == 0) goto L_0x001d;
                L_0x0006:
                    r3 = (com.snap.lenses.camera.carousel.DefaultCarouselView.a.b.a) r3;
                    r0 = r2.a;
                    r1 = r3.a;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x001d;
                L_0x0012:
                    r0 = r2.b;
                    r3 = r3.b;
                    r3 = defpackage.akcr.a(r0, r3);
                    if (r3 == 0) goto L_0x001d;
                L_0x001c:
                    goto L_0x001f;
                L_0x001d:
                    r3 = 0;
                    return r3;
                L_0x001f:
                    r3 = 1;
                    return r3;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.camera.carousel.DefaultCarouselView$a$b$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    defpackage.lsd.b.b bVar = this.a;
                    int i = 0;
                    int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                    Animator animator = this.b;
                    if (animator != null) {
                        i = animator.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(super.toString());
                    stringBuilder.append(".Appeared");
                    return stringBuilder.toString();
                }
            }

            public static final class b extends b {
                final defpackage.lsd.b.b a;
                final Animator b;

                public b(defpackage.lsd.b.b bVar, Animator animator) {
                    akcr.b(bVar, MapboxEvent.KEY_MODEL);
                    super(bVar, (byte) 0);
                    this.a = bVar;
                    this.b = animator;
                }

                public final Animator a() {
                    return this.b;
                }

                public final defpackage.lsd.b.b b() {
                    return this.a;
                }

                /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f;
                L_0x0002:
                    r0 = r3 instanceof com.snap.lenses.camera.carousel.DefaultCarouselView.a.b.b;
                    if (r0 == 0) goto L_0x001d;
                L_0x0006:
                    r3 = (com.snap.lenses.camera.carousel.DefaultCarouselView.a.b.b) r3;
                    r0 = r2.a;
                    r1 = r3.a;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x001d;
                L_0x0012:
                    r0 = r2.b;
                    r3 = r3.b;
                    r3 = defpackage.akcr.a(r0, r3);
                    if (r3 == 0) goto L_0x001d;
                L_0x001c:
                    goto L_0x001f;
                L_0x001d:
                    r3 = 0;
                    return r3;
                L_0x001f:
                    r3 = 1;
                    return r3;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.camera.carousel.DefaultCarouselView$a$b$b.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    defpackage.lsd.b.b bVar = this.a;
                    int i = 0;
                    int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                    Animator animator = this.b;
                    if (animator != null) {
                        i = animator.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(super.toString());
                    stringBuilder.append(".ItemsFlip");
                    return stringBuilder.toString();
                }
            }

            private b(defpackage.lsd.b.b bVar) {
                super();
                this.a = bVar;
            }

            public /* synthetic */ b(defpackage.lsd.b.b bVar, byte b) {
                this(bVar);
            }

            public defpackage.lsd.b.b b() {
                return this.a;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder("CarouselViewState.OnScreen(selectedItemPosition=");
                stringBuilder.append(b().c);
                stringBuilder.append(',');
                stringBuilder.append("itemsSize=");
                stringBuilder.append(b().b.size());
                stringBuilder.append(',');
                stringBuilder.append("closeable=");
                stringBuilder.append(b().a);
                stringBuilder.append(',');
                stringBuilder.append("allowScrolling=");
                stringBuilder.append(b().d);
                stringBuilder.append(',');
                stringBuilder.append("itemsHaveFlipped=");
                stringBuilder.append(b().f);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        public static final class a extends a implements mgw {
            public static final a a = new a();
            private final /* synthetic */ mia b = mia.b;

            private a() {
                super();
            }

            public final Animator a() {
                return mia.a;
            }

            public final String toString() {
                return "CarouselViewState.Hidden";
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class f extends akcs implements akbk<Float> {
        private /* synthetic */ DefaultCarouselView a;
        private /* synthetic */ int b;
        private /* synthetic */ int c = R.dimen.lens_item_size;

        f(DefaultCarouselView defaultCarouselView, int i, int i2) {
            this.a = defaultCarouselView;
            this.b = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(this.a.getResources().getDimension(this.b) / this.a.getResources().getDimension(this.c));
        }
    }

    static final class g extends akcs implements akbk<ajdp<defpackage.lsd.a>> {
        final /* synthetic */ DefaultCarouselView a;

        static final class a<T, R> implements ajfc<T, R> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b(obj, "<anonymous parameter 0>");
                return defpackage.lsd.a.a.a;
            }
        }

        static final class b<T, R> implements ajfc<T, R> {
            private /* synthetic */ g a;

            b(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Integer num = (Integer) obj;
                akcr.b(num, "it");
                return new defpackage.lsd.a.c(num.intValue(), DefaultCarouselView.b(this.a.a).a(num.intValue()));
            }
        }

        static final class c<T1, T2> implements ajey<defpackage.lsd.a.c, defpackage.lsd.a.c> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ boolean test(Object obj, Object obj2) {
                defpackage.lsd.a.c cVar = (defpackage.lsd.a.c) obj;
                defpackage.lsd.a.c cVar2 = (defpackage.lsd.a.c) obj2;
                akcr.b(cVar, "prev");
                akcr.b(cVar2, "curr");
                return akcr.a(cVar.b.d(), cVar2.b.d());
            }
        }

        static final class d<T> implements ajfb<defpackage.lsd.a.c> {
            private /* synthetic */ g a;

            d(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                DefaultCarouselView.a(this.a.a).a(((defpackage.lsd.a.c) obj).a, true, true);
            }
        }

        static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ ajdp a;
            private /* synthetic */ ajdp b;

            /* renamed from: com.snap.lenses.camera.carousel.DefaultCarouselView$g$e$2 */
            static final class AnonymousClass2<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ e a;

                AnonymousClass2(e eVar) {
                    this.a = eVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    mii mii = (mii) obj;
                    akcr.b(mii, "event");
                    if (mii instanceof defpackage.mii.a) {
                        return ajdp.b(new defpackage.lsd.a.b(((defpackage.mii.a) mii).a));
                    }
                    if (mii instanceof defpackage.mii.b) {
                        return this.a.a.c(1).p(AnonymousClass1.a);
                    }
                    throw new ajxk();
                }
            }

            e(ajdp ajdp, ajdp ajdp2) {
                this.b = ajdp;
                this.a = ajdp2;
            }

            public final /* synthetic */ Object apply(Object obj) {
                defpackage.lsd.a.c cVar = (defpackage.lsd.a.c) obj;
                akcr.b(cVar, "<name for destructuring parameter 0>");
                final int i = cVar.a;
                return this.b.a((ajfl) new ajfl<mii>() {
                    public final /* synthetic */ boolean test(Object obj) {
                        mii mii = (mii) obj;
                        akcr.b(mii, "event");
                        return !(mii instanceof defpackage.mii.a) || ((defpackage.mii.a) mii).a == i;
                    }
                }).j(ajfu.a).u(new AnonymousClass2(this));
            }
        }

        static final class f<T, R> implements ajfc<T, akuw<? extends R>> {
            private /* synthetic */ g a;

            f(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((cfi) obj, "it");
                CarouselListView a = DefaultCarouselView.a(this.a.a);
                ajxm a2 = ajxs.a(Integer.valueOf(a.f.findFirstVisibleItemPosition()), Integer.valueOf(a.f.findLastVisibleItemPosition()));
                int intValue = ((Number) a2.a).intValue();
                int intValue2 = ((Number) a2.b).intValue();
                a aVar = this.a.a.d;
                if (!(aVar instanceof b)) {
                    aVar = null;
                }
                b bVar = (b) aVar;
                if (bVar != null) {
                    List list = bVar.b().b;
                    ajde b = ajde.b(new defpackage.lsd.a.e(list.subList(intValue, intValue2 + 1), list));
                    if (b != null) {
                        return b;
                    }
                }
                return ajvo.a(ajjl.b);
            }
        }

        /* renamed from: com.snap.lenses.camera.carousel.DefaultCarouselView$g$1 */
        static final class AnonymousClass1<T> implements ajfl<defpackage.lsd.a> {
            private /* synthetic */ g a;

            AnonymousClass1(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ boolean test(Object obj) {
                akcr.b((defpackage.lsd.a) obj, "it");
                return this.a.a.b();
            }
        }

        g(DefaultCarouselView defaultCarouselView) {
            this.a = defaultCarouselView;
            super(0);
        }

        /* JADX WARNING: Missing block: B:3:0x0014, code skipped:
            if (r0 == null) goto L_0x0016;
     */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
            r5 = this;
            r0 = r5.a;
            r0 = r0.c;
            if (r0 == 0) goto L_0x0016;
        L_0x0006:
            r0 = (android.view.View) r0;
            r0 = defpackage.cfl.c(r0);
            r1 = com.snap.lenses.camera.carousel.DefaultCarouselView.g.a.a;
            r1 = (defpackage.ajfc) r1;
            r0 = r0.p(r1);
            if (r0 != 0) goto L_0x0021;
        L_0x0016:
            r0 = defpackage.ajot.a;
            r0 = defpackage.ajvo.a(r0);
            r1 = "empty<CarouselView.Event>()";
            defpackage.akcr.a(r0, r1);
        L_0x0021:
            r1 = r5.a;
            r1 = r1.getResources();
            r2 = 2131166694; // 0x7f0705e6 float:1.794764E38 double:1.052936249E-314;
            r1 = r1.getDimensionPixelSize(r2);
            r2 = r5.a;
            r2 = com.snap.lenses.camera.carousel.DefaultCarouselView.a(r2);
            r2 = (android.support.v7.widget.RecyclerView) r2;
            r3 = "receiver$0";
            defpackage.akcr.b(r2, r3);
            r3 = new mhw;
            r3.<init>(r2, r1);
            r3 = (defpackage.ajdp) r3;
            r1 = defpackage.ajpy.k(r3);
            r1 = r1.a();
            r2 = r5.a;
            r2 = com.snap.lenses.camera.carousel.DefaultCarouselView.a(r2);
            r2 = r2.d;
            r2 = r2.f();
            r3 = "selectedItemPositionRelay.hide()";
            defpackage.akcr.a(r2, r3);
            r3 = new com.snap.lenses.camera.carousel.DefaultCarouselView$g$b;
            r3.<init>(r5);
            r3 = (defpackage.ajfc) r3;
            r2 = r2.p(r3);
            r3 = com.snap.lenses.camera.carousel.DefaultCarouselView.g.c.a;
            r3 = (defpackage.ajey) r3;
            r2 = r2.a(r3);
            r2 = (defpackage.ajdt) r2;
            r3 = r5.a;
            r3 = com.snap.lenses.camera.carousel.DefaultCarouselView.b(r3);
            r3 = r3.a;
            r3 = r3.f();
            r4 = "itemSelections.hide()";
            defpackage.akcr.a(r3, r4);
            r4 = new com.snap.lenses.camera.carousel.DefaultCarouselView$g$d;
            r4.<init>(r5);
            r4 = (defpackage.ajfb) r4;
            r3 = r3.d(r4);
            r4 = "carouselAdapter.itemSele…                        }";
            defpackage.akcr.a(r3, r4);
            r3 = defpackage.myu.a(r3);
            r3 = (defpackage.ajdt) r3;
            r2 = defpackage.ajdp.b(r2, r3);
            r3 = r5.a;
            r3 = com.snap.lenses.camera.carousel.DefaultCarouselView.a(r3);
            r3 = (android.support.v7.widget.RecyclerView) r3;
            r3 = defpackage.cfk.a(r3);
            r3 = defpackage.ajpy.k(r3);
            r3 = r3.a();
            r4 = new com.snap.lenses.camera.carousel.DefaultCarouselView$g$e;
            r4.<init>(r1, r3);
            r4 = (defpackage.ajfc) r4;
            r1 = r2.u(r4);
            r4 = "itemSelections\n         …      }\n                }";
            defpackage.akcr.a(r1, r4);
            r4 = defpackage.ajcw.LATEST;
            r3 = r3.a(r4);
            r4 = new com.snap.lenses.camera.carousel.DefaultCarouselView$g$f;
            r4.<init>(r5);
            r4 = (defpackage.ajfc) r4;
            r3 = r3.h(r4);
            r4 = defpackage.ajfu.a;
            r3 = r3.b(r4);
            r3 = r3.j();
            r4 = "scrollEvents\n           …          .toObservable()";
            defpackage.akcr.a(r3, r4);
            r0 = (defpackage.ajdt) r0;
            r2 = (defpackage.ajdt) r2;
            r1 = (defpackage.ajdt) r1;
            r3 = (defpackage.ajdt) r3;
            r0 = defpackage.ajdp.a(r0, r2, r1, r3);
            r1 = new com.snap.lenses.camera.carousel.DefaultCarouselView$g$1;
            r1.<init>(r5);
            r1 = (defpackage.ajfl) r1;
            r0 = r0.a(r1);
            r0 = defpackage.ajpy.k(r0);
            r0 = r0.a();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.camera.carousel.DefaultCarouselView$g.invoke():java.lang.Object");
        }
    }

    static final class e extends akcs implements akbk<DecelerateInterpolator> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DecelerateInterpolator();
        }
    }

    static final class b extends akcs implements akbk<AccelerateDecelerateInterpolator> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new AccelerateDecelerateInterpolator();
        }
    }

    public static final class h extends OnScrollListener {
        private /* synthetic */ DefaultCarouselView a;

        h(DefaultCarouselView defaultCarouselView) {
            this.a = defaultCarouselView;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            this.a.e = i != 0;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            String str;
            Object obj;
            View view;
            akcr.b(recyclerView, "recyclerView");
            DefaultCarouselView defaultCarouselView = this.a;
            CarouselListView carouselListView = defaultCarouselView.b;
            String str2 = "carouselListView";
            if (carouselListView == null) {
                akcr.a(str2);
            }
            Iterable a = akef.a(0, carouselListView.getChildCount());
            Collection arrayList = new ArrayList(ajyn.a(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(carouselListView.getChildAt(((ajzg) it).a()));
            }
            Collection arrayList2 = new ArrayList();
            Iterator it2 = ((List) arrayList).iterator();
            while (true) {
                str = "carouselAdapter";
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                View view2 = (View) next;
                lre lre = defaultCarouselView.a;
                if (lre == null) {
                    akcr.a(str);
                }
                int itemCount = lre.getItemCount();
                int childAdapterPosition = carouselListView.getChildAdapterPosition(view2);
                Object obj2 = (childAdapterPosition >= 0 && itemCount > childAdapterPosition) ? 1 : null;
                if (obj2 != null) {
                    arrayList2.add(next);
                }
            }
            Iterable<View> iterable = (List) arrayList2;
            Collection arrayList3 = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (View view3 : iterable) {
                lre lre2 = defaultCarouselView.a;
                if (lre2 == null) {
                    akcr.a(str);
                }
                arrayList3.add(new ajxm(lre2.a(carouselListView.getChildAdapterPosition(view3)), view3));
            }
            Iterator it3 = ((List) arrayList3).iterator();
            do {
                view = null;
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
            } while (!(((defpackage.lrw.a) ((ajxm) obj).a) instanceof defpackage.lrw.a.c));
            ajxm ajxm = (ajxm) obj;
            if (ajxm != null) {
                view = (View) ajxm.b;
            }
            if (view != null) {
                carouselListView = defaultCarouselView.b;
                if (carouselListView == null) {
                    akcr.a(str2);
                }
                float abs = Math.abs((view.getX() + (((float) view.getMeasuredWidth()) / 2.0f)) - ((float) (carouselListView.getWidth() / 2)));
                float measuredWidth = ((float) view.getMeasuredWidth()) * ((Number) defaultCarouselView.f.b()).floatValue();
                float measuredWidth2 = ((float) view.getMeasuredWidth()) * ((Number) defaultCarouselView.g.b()).floatValue();
                if (abs >= measuredWidth) {
                    view.setAlpha(1.0f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                } else if (abs > measuredWidth2) {
                    abs = (abs - measuredWidth2) / (measuredWidth - measuredWidth2);
                    view.setAlpha(abs);
                    abs = (abs / 2.0f) + 0.5f;
                    view.setScaleX(abs);
                    view.setScaleY(abs);
                } else {
                    view.setAlpha(MapboxConstants.MINIMUM_ZOOM);
                    view.setScaleX(0.5f);
                    view.setScaleY(0.5f);
                }
            }
        }
    }

    static final class i<T> implements ajfb<defpackage.lrw.a.b> {
        private /* synthetic */ View a;

        i(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            defpackage.lrw.a.b bVar = (defpackage.lrw.a.b) obj;
            View view = this.a;
            int i = (bVar != null && lsp.a[bVar.ordinal()] == 1) ? 8 : 0;
            view.setVisibility(i);
        }
    }

    static final class c extends akcs implements akbk<ajxw> {
        private /* synthetic */ DefaultCarouselView a;
        private /* synthetic */ defpackage.lsd.b.b b;

        c(DefaultCarouselView defaultCarouselView, defpackage.lsd.b.b bVar) {
            this.a = defaultCarouselView;
            this.b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a(new c(this.b, false), true);
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbk<ajxw> {
        private /* synthetic */ DefaultCarouselView a;
        private /* synthetic */ defpackage.lsd.b.b b;

        d(DefaultCarouselView defaultCarouselView, defpackage.lsd.b.b bVar) {
            this.a = defaultCarouselView;
            this.b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a(new c(this.b, false), false);
            this.a.c();
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(DefaultCarouselView.class), "originalItemAnimationStartOffsetRatio", "getOriginalItemAnimationStartOffsetRatio()F"), new akdc(akde.a(DefaultCarouselView.class), "originalItemAnimationEndOffsetRatio", "getOriginalItemAnimationEndOffsetRatio()F"), new akdc(akde.a(DefaultCarouselView.class), "decelerateInterpolator", "getDecelerateInterpolator()Landroid/view/animation/DecelerateInterpolator;"), new akdc(akde.a(DefaultCarouselView.class), "accelerateDecelerateInterpolator", "getAccelerateDecelerateInterpolator()Landroid/view/animation/AccelerateDecelerateInterpolator;"), new akdc(akde.a(DefaultCarouselView.class), aqd.a, "getEvents()Lio/reactivex/Observable;")};
    }

    public DefaultCarouselView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultCarouselView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.j = R.layout.lenses_camera_carousel_item_view;
        this.d = a.a;
        this.k = mgy.a;
        this.f = a((int) R.dimen.lens_carousel_animation_start_offset);
        this.g = a((int) R.dimen.lens_carousel_animation_stop_offset);
        this.m = ajxh.a(e.a);
        this.n = ajxh.a(b.a);
        this.o = new ajen(ajfq.INSTANCE);
        this.p = ajxh.a(new g(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.mnx.a.b);
            try {
                this.j = obtainStyledAttributes.getResourceId(0, R.layout.lenses_camera_carousel_item_view);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private final ajxe<Float> a(int i) {
        return ajxh.a(new f(this, i, R.dimen.lens_item_size));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:55:0x0152 in {11, 18, 21, 24, 25, 26, 27, 39, 40, 41, 48, 49, 50, 51, 52, 54} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final com.snap.lenses.camera.carousel.DefaultCarouselView.a a(defpackage.lsd.b r15) {
        /*
        r14 = this;
        r0 = defpackage.lsd.b.a.a;	 Catch:{ all -> 0x0150 }
        if (r15 == r0) goto L_0x014a;	 Catch:{ all -> 0x0150 }
        r0 = r15 instanceof defpackage.lsd.b.b;	 Catch:{ all -> 0x0150 }
        r1 = 0;
        r2 = "carouselListView";
        r3 = 0;
        r4 = 2;
        r5 = 1;
        r6 = 0;
        if (r0 == 0) goto L_0x00bd;
        r0 = r15;	 Catch:{ all -> 0x0150 }
        r0 = (defpackage.lsd.b.b) r0;	 Catch:{ all -> 0x0150 }
        r0 = r0.f;	 Catch:{ all -> 0x0150 }
        if (r0 == 0) goto L_0x00bd;	 Catch:{ all -> 0x0150 }
        r0 = new com.snap.lenses.camera.carousel.DefaultCarouselView$a$b$b;	 Catch:{ all -> 0x0150 }
        r7 = r15;	 Catch:{ all -> 0x0150 }
        r7 = (defpackage.lsd.b.b) r7;	 Catch:{ all -> 0x0150 }
        r15 = (defpackage.lsd.b.b) r15;	 Catch:{ all -> 0x0150 }
        r8 = r14.d;	 Catch:{ all -> 0x0150 }
        r9 = r8 instanceof com.snap.lenses.camera.carousel.DefaultCarouselView.a.b;	 Catch:{ all -> 0x0150 }
        if (r9 != 0) goto L_0x0024;	 Catch:{ all -> 0x0150 }
        r8 = r3;	 Catch:{ all -> 0x0150 }
        r8 = (com.snap.lenses.camera.carousel.DefaultCarouselView.a.b) r8;	 Catch:{ all -> 0x0150 }
        if (r8 == 0) goto L_0x00b6;	 Catch:{ all -> 0x0150 }
        r8 = r8.b();	 Catch:{ all -> 0x0150 }
        if (r8 == 0) goto L_0x00b6;	 Catch:{ all -> 0x0150 }
        r8 = a(r8);	 Catch:{ all -> 0x0150 }
        if (r8 != 0) goto L_0x0036;	 Catch:{ all -> 0x0150 }
        goto L_0x00b6;	 Catch:{ all -> 0x0150 }
        r14.b(r15);	 Catch:{ all -> 0x0150 }
        r3 = a(r15);	 Catch:{ all -> 0x0150 }
        r9 = new com.snap.lenses.camera.carousel.DefaultCarouselView$a$b$c;	 Catch:{ all -> 0x0150 }
        r9.<init>(r8, r6);	 Catch:{ all -> 0x0150 }
        r14.a(r9, r5);	 Catch:{ all -> 0x0150 }
        r8 = new com.snap.lenses.camera.carousel.DefaultCarouselView$c;	 Catch:{ all -> 0x0150 }
        r8.<init>(r14, r3);	 Catch:{ all -> 0x0150 }
        r8 = (defpackage.akbk) r8;	 Catch:{ all -> 0x0150 }
        r3 = new com.snap.lenses.camera.carousel.DefaultCarouselView$d;	 Catch:{ all -> 0x0150 }
        r3.<init>(r14, r15);	 Catch:{ all -> 0x0150 }
        r3 = (defpackage.akbk) r3;	 Catch:{ all -> 0x0150 }
        r15 = new android.animation.AnimatorSet;	 Catch:{ all -> 0x0150 }
        r15.<init>();	 Catch:{ all -> 0x0150 }
        r9 = r14.b;	 Catch:{ all -> 0x0150 }
        if (r9 != 0) goto L_0x005f;	 Catch:{ all -> 0x0150 }
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x0150 }
        r10 = android.view.View.ALPHA;	 Catch:{ all -> 0x0150 }
        r11 = new float[r4];	 Catch:{ all -> 0x0150 }
        r12 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ all -> 0x0150 }
        r11[r6] = r12;	 Catch:{ all -> 0x0150 }
        r11[r5] = r1;	 Catch:{ all -> 0x0150 }
        r9 = android.animation.ObjectAnimator.ofFloat(r9, r10, r11);	 Catch:{ all -> 0x0150 }
        r10 = 250; // 0xfa float:3.5E-43 double:1.235E-321;	 Catch:{ all -> 0x0150 }
        r9.setDuration(r10);	 Catch:{ all -> 0x0150 }
        r13 = r14.e();	 Catch:{ all -> 0x0150 }
        r13 = (android.animation.TimeInterpolator) r13;	 Catch:{ all -> 0x0150 }
        r9.setInterpolator(r13);	 Catch:{ all -> 0x0150 }
        r13 = r9;	 Catch:{ all -> 0x0150 }
        r13 = (android.animation.Animator) r13;	 Catch:{ all -> 0x0150 }
        defpackage.mgx.a(r13, r8);	 Catch:{ all -> 0x0150 }
        r8 = r14.b;	 Catch:{ all -> 0x0150 }
        if (r8 != 0) goto L_0x0088;	 Catch:{ all -> 0x0150 }
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x0150 }
        r2 = android.view.View.ALPHA;	 Catch:{ all -> 0x0150 }
        r13 = new float[r4];	 Catch:{ all -> 0x0150 }
        r13[r6] = r1;	 Catch:{ all -> 0x0150 }
        r13[r5] = r12;	 Catch:{ all -> 0x0150 }
        r1 = android.animation.ObjectAnimator.ofFloat(r8, r2, r13);	 Catch:{ all -> 0x0150 }
        r1.setDuration(r10);	 Catch:{ all -> 0x0150 }
        r2 = r14.e();	 Catch:{ all -> 0x0150 }
        r2 = (android.animation.TimeInterpolator) r2;	 Catch:{ all -> 0x0150 }
        r1.setInterpolator(r2);	 Catch:{ all -> 0x0150 }
        r2 = r1;	 Catch:{ all -> 0x0150 }
        r2 = (android.animation.Animator) r2;	 Catch:{ all -> 0x0150 }
        defpackage.mgx.a(r2, r3);	 Catch:{ all -> 0x0150 }
        r2 = new android.animation.Animator[r4];	 Catch:{ all -> 0x0150 }
        r9 = (android.animation.Animator) r9;	 Catch:{ all -> 0x0150 }
        r2[r6] = r9;	 Catch:{ all -> 0x0150 }
        r1 = (android.animation.Animator) r1;	 Catch:{ all -> 0x0150 }
        r2[r5] = r1;	 Catch:{ all -> 0x0150 }
        r15.playSequentially(r2);	 Catch:{ all -> 0x0150 }
        r3 = r15;	 Catch:{ all -> 0x0150 }
        r3 = (android.animation.Animator) r3;	 Catch:{ all -> 0x0150 }
        r0.<init>(r7, r3);	 Catch:{ all -> 0x0150 }
        r0 = (com.snap.lenses.camera.carousel.DefaultCarouselView.a) r0;	 Catch:{ all -> 0x0150 }
        goto L_0x014f;	 Catch:{ all -> 0x0150 }
        r0 = r15 instanceof defpackage.lsd.b.b;	 Catch:{ all -> 0x0150 }
        if (r0 == 0) goto L_0x0108;	 Catch:{ all -> 0x0150 }
        r0 = r14.b();	 Catch:{ all -> 0x0150 }
        if (r0 == 0) goto L_0x0108;	 Catch:{ all -> 0x0150 }
        r0 = r14.d;	 Catch:{ all -> 0x0150 }
        r1 = r0 instanceof com.snap.lenses.camera.carousel.DefaultCarouselView.a.b;	 Catch:{ all -> 0x0150 }
        if (r1 == 0) goto L_0x0100;	 Catch:{ all -> 0x0150 }
        r1 = r0;	 Catch:{ all -> 0x0150 }
        r1 = (com.snap.lenses.camera.carousel.DefaultCarouselView.a.b) r1;	 Catch:{ all -> 0x0150 }
        r1 = r1.b();	 Catch:{ all -> 0x0150 }
        r1 = r1.c;	 Catch:{ all -> 0x0150 }
        r2 = r15;	 Catch:{ all -> 0x0150 }
        r2 = (defpackage.lsd.b.b) r2;	 Catch:{ all -> 0x0150 }
        r2 = r2.c;	 Catch:{ all -> 0x0150 }
        if (r1 == r2) goto L_0x0100;	 Catch:{ all -> 0x0150 }
        r1 = r0;	 Catch:{ all -> 0x0150 }
        r1 = (com.snap.lenses.camera.carousel.DefaultCarouselView.a.b) r1;	 Catch:{ all -> 0x0150 }
        r1 = r1.b();	 Catch:{ all -> 0x0150 }
        r1 = r1.b;	 Catch:{ all -> 0x0150 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0150 }
        if (r1 != 0) goto L_0x00ff;	 Catch:{ all -> 0x0150 }
        r0 = (com.snap.lenses.camera.carousel.DefaultCarouselView.a.b) r0;	 Catch:{ all -> 0x0150 }
        r0 = r0.b();	 Catch:{ all -> 0x0150 }
        r0 = r0.b;	 Catch:{ all -> 0x0150 }
        r1 = r15;	 Catch:{ all -> 0x0150 }
        r1 = (defpackage.lsd.b.b) r1;	 Catch:{ all -> 0x0150 }
        r1 = r1.b;	 Catch:{ all -> 0x0150 }
        r0 = defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0150 }
        if (r0 == 0) goto L_0x0100;	 Catch:{ all -> 0x0150 }
        r6 = 1;	 Catch:{ all -> 0x0150 }
        r0 = new com.snap.lenses.camera.carousel.DefaultCarouselView$a$b$c;	 Catch:{ all -> 0x0150 }
        r15 = (defpackage.lsd.b.b) r15;	 Catch:{ all -> 0x0150 }
        r0.<init>(r15, r6);	 Catch:{ all -> 0x0150 }
        goto L_0x00b9;	 Catch:{ all -> 0x0150 }
        r0 = r15 instanceof defpackage.lsd.b.b;	 Catch:{ all -> 0x0150 }
        if (r0 == 0) goto L_0x014a;	 Catch:{ all -> 0x0150 }
        r0 = r15;	 Catch:{ all -> 0x0150 }
        r0 = (defpackage.lsd.b.b) r0;	 Catch:{ all -> 0x0150 }
        r0 = r0.b();	 Catch:{ all -> 0x0150 }
        if (r0 == 0) goto L_0x013f;	 Catch:{ all -> 0x0150 }
        r0 = r14.b;	 Catch:{ all -> 0x0150 }
        if (r0 != 0) goto L_0x011c;	 Catch:{ all -> 0x0150 }
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x0150 }
        r2 = android.view.View.TRANSLATION_X;	 Catch:{ all -> 0x0150 }
        r3 = new float[r4];	 Catch:{ all -> 0x0150 }
        r4 = r14.getWidth();	 Catch:{ all -> 0x0150 }
        r4 = (float) r4;	 Catch:{ all -> 0x0150 }
        r3[r6] = r4;	 Catch:{ all -> 0x0150 }
        r3[r5] = r1;	 Catch:{ all -> 0x0150 }
        r3 = android.animation.ObjectAnimator.ofFloat(r0, r2, r3);	 Catch:{ all -> 0x0150 }
        r0 = 300; // 0x12c float:4.2E-43 double:1.48E-321;	 Catch:{ all -> 0x0150 }
        r3.setDuration(r0);	 Catch:{ all -> 0x0150 }
        r0 = r14.m;	 Catch:{ all -> 0x0150 }
        r0 = r0.b();	 Catch:{ all -> 0x0150 }
        r0 = (android.view.animation.DecelerateInterpolator) r0;	 Catch:{ all -> 0x0150 }
        r0 = (android.animation.TimeInterpolator) r0;	 Catch:{ all -> 0x0150 }
        r3.setInterpolator(r0);	 Catch:{ all -> 0x0150 }
        r0 = new com.snap.lenses.camera.carousel.DefaultCarouselView$a$b$a;	 Catch:{ all -> 0x0150 }
        r15 = (defpackage.lsd.b.b) r15;	 Catch:{ all -> 0x0150 }
        r3 = (android.animation.Animator) r3;	 Catch:{ all -> 0x0150 }
        r0.<init>(r15, r3);	 Catch:{ all -> 0x0150 }
        goto L_0x00b9;	 Catch:{ all -> 0x0150 }
        r15 = com.snap.lenses.camera.carousel.DefaultCarouselView.a.a.a;	 Catch:{ all -> 0x0150 }
        r0 = r15;	 Catch:{ all -> 0x0150 }
        r0 = (com.snap.lenses.camera.carousel.DefaultCarouselView.a) r0;	 Catch:{ all -> 0x0150 }
        return r0;
        r15 = move-exception;
        throw r15;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.camera.carousel.DefaultCarouselView.a(lsd$b):com.snap.lenses.camera.carousel.DefaultCarouselView$a");
    }

    private static List<defpackage.lrw.a> a(List<? extends defpackage.lrw.a> list, int i) {
        defpackage.lrw.a aVar = (defpackage.lrw.a) ajyu.a((List) list, i);
        if (aVar == null) {
            return list;
        }
        Iterable<Object> iterable = list;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (Object obj : iterable) {
            Object obj2;
            if ((obj2 instanceof defpackage.lrw.a.a) && akcr.a(obj2.d(), aVar.d())) {
                obj2 = defpackage.lrw.a.a.a((defpackage.lrw.a.a) obj2, null, false, false, false, null, null, null, 119);
            }
            arrayList.add(obj2);
        }
        return (List) arrayList;
    }

    private static defpackage.lsd.b.b a(defpackage.lsd.b.b bVar) {
        if (bVar.b()) {
            return bVar;
        }
        int i = bVar.c;
        return defpackage.lsd.b.b.a(bVar, false, a(bVar.b, bVar.c), i, false, false, false, null, Imgproc.COLOR_YUV2RGBA_YVYU);
    }

    private final void a(List<? extends defpackage.lrw.a> list) {
        lre lre = this.a;
        if (lre == null) {
            akcr.a("carouselAdapter");
        }
        lre.a((List) list);
        CarouselListView carouselListView = this.b;
        if (carouselListView == null) {
            akcr.a("carouselListView");
        }
        carouselListView.invalidateItemDecorations();
    }

    private final void b(defpackage.lsd.b.b bVar) {
        String c = c(bVar);
        if (c != null) {
            SnapImageView snapImageView = this.h;
            if (snapImageView == null) {
                akcr.a("selectedIconImageView");
            }
            Object parse = Uri.parse(c);
            akcr.a(parse, "android.net.Uri.parse(iconUri)");
            snapImageView.setImageUri(parse, this.k.getAttributionFor("selectedLensIcon"));
            snapImageView.setVisibility(0);
        }
    }

    private static String c(defpackage.lsd.b.b bVar) {
        Object a = ajyu.a(bVar.b, bVar.c);
        if ((bVar.b() ^ 1) == 0) {
            a = null;
        }
        defpackage.lrw.a aVar = (defpackage.lrw.a) a;
        if (aVar != null) {
            miq miq = aVar instanceof defpackage.lrw.a.a ? ((defpackage.lrw.a.a) aVar).b : null;
            if (miq != null && (miq instanceof defpackage.miq.e)) {
                return ((defpackage.miq.e) miq).a();
            }
        }
        return null;
    }

    private final boolean d() {
        if (!this.e) {
            CarouselListView carouselListView = this.b;
            if (carouselListView == null) {
                akcr.a("carouselListView");
            }
            if (!carouselListView.f.b) {
                return false;
            }
        }
        return true;
    }

    private final AccelerateDecelerateInterpolator e() {
        return (AccelerateDecelerateInterpolator) this.n.b();
    }

    public final ajdp<defpackage.lsd.a> a() {
        return (ajdp) this.p.b();
    }

    /* Access modifiers changed, original: final */
    public final void a(c cVar, boolean z) {
        if (!z) {
            this.d = cVar;
        }
        CarouselListView carouselListView = this.b;
        if (carouselListView == null) {
            akcr.a("carouselListView");
        }
        defpackage.lsd.b.b bVar = cVar.a;
        a(bVar.b);
        if (!(bVar.d && d()) && bVar.e) {
            carouselListView.a(bVar.c, cVar.b, false);
        }
        carouselListView.a(bVar.d);
        carouselListView.setVisibility(0);
    }

    public final void a(ide ide) {
        akcr.b(ide, "attributedFeature");
        lre lre = this.a;
        if (lre == null) {
            akcr.a("carouselAdapter");
        }
        lre.a(ide);
        this.k = ide;
    }

    public final /* synthetic */ void accept(Object obj) {
        defpackage.lsd.b bVar = (defpackage.lsd.b) obj;
        akcr.b(bVar, MapboxEvent.KEY_MODEL);
        Object a = a(bVar);
        if (!akcr.a(a, this.d) && (!(this.d instanceof b) || a == a.a)) {
            d();
            c();
            if (!(bVar instanceof defpackage.lsd.b.b)) {
                bVar = null;
            }
            defpackage.lsd.b.b bVar2 = (defpackage.lsd.b.b) bVar;
            if (bVar2 != null) {
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(bVar2.a ? 0 : 4);
                    int i = bVar2.g.d + this.l;
                    LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams != null) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        if (layoutParams2.bottomMargin != i) {
                            layoutParams2.bottomMargin = i;
                            imageView.setLayoutParams(layoutParams2);
                        }
                    } else {
                        throw new ajxt("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    }
                }
                View view = this.i;
                if (view != null) {
                    if (bVar2.b.size() >= bVar2.c + 1) {
                        defpackage.lrw.a aVar = (defpackage.lrw.a) bVar2.b.get(bVar2.c);
                        if (aVar instanceof defpackage.lrw.a.a) {
                            this.o.a(((defpackage.lrw.a.a) aVar).c.f((ajfb) new i(view)));
                        }
                    }
                    view.setVisibility(8);
                    this.o.a(ajfq.INSTANCE);
                }
            }
            String str = "carouselListView";
            Animator a2;
            CarouselListView carouselListView;
            if (a instanceof a) {
                a aVar2 = (a) a;
                this.d = aVar2;
                a2 = this.d.a();
                if (a2 != null) {
                    a2.end();
                }
                carouselListView = this.b;
                if (carouselListView == null) {
                    akcr.a(str);
                }
                defpackage.lsd.b.b bVar3 = aVar2.a;
                a(bVar3.b);
                CarouselListView carouselListView2 = this.b;
                if (carouselListView2 == null) {
                    akcr.a(str);
                }
                carouselListView2.invalidateItemDecorations();
                carouselListView.a(bVar3.c, false, true);
                carouselListView.a(bVar3.d);
                carouselListView.setVisibility(0);
                a2 = aVar2.b;
                if (a2 != null) {
                    a2.start();
                }
            } else if (a instanceof c) {
                a((c) a, false);
            } else if (a instanceof b) {
                b bVar4 = (b) a;
                this.d = bVar4;
                b(bVar4.a);
                a2 = this.d.a();
                if (a2 != null) {
                    a2.end();
                }
                carouselListView = this.b;
                if (carouselListView == null) {
                    akcr.a(str);
                }
                carouselListView.a(bVar4.a.d);
                carouselListView.setVisibility(0);
                a2 = bVar4.b;
                if (a2 != null) {
                    a2.start();
                }
            } else if (akcr.a(a, a.a)) {
                this.d = a.a;
                a((List) ajyw.a);
                ImageView imageView2 = this.c;
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                }
                View view2 = this.i;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                a2 = this.d.a();
                if (a2 != null) {
                    a2.end();
                }
                carouselListView = this.b;
                if (carouselListView == null) {
                    akcr.a(str);
                }
                carouselListView.a(false);
                carouselListView.a(0, false, false);
                carouselListView.setVisibility(4);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        a aVar = this.d;
        if (!(aVar instanceof b)) {
            return false;
        }
        b bVar = (b) aVar;
        return (bVar.b().b.size() == 1 && (bVar.b().b.get(0) instanceof defpackage.lrw.a.c)) ? false : true;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        SnapImageView snapImageView = this.h;
        if (snapImageView == null) {
            akcr.a("selectedIconImageView");
        }
        snapImageView.clear();
        snapImageView.setVisibility(8);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        this.o.a(ajfq.INSTANCE);
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object context = getContext();
        akcr.a(context, "context");
        this.l = context.getResources().getDimensionPixelSize(R.dimen.lens_camera_carousel_close_button_margin_bottom);
        this.a = new lre(this.j, null, 2);
        context = findViewById(R.id.lenses_camera_carousel_list_view);
        CarouselListView carouselListView = (CarouselListView) context;
        lre lre = this.a;
        if (lre == null) {
            akcr.a("carouselAdapter");
        }
        carouselListView.setAdapter(lre);
        akcr.a(context, "findViewById<CarouselLis…carouselAdapter\n        }");
        this.b = carouselListView;
        this.c = (ImageView) findViewById(R.id.lenses_camera_carousel_close_button_view);
        context = findViewById(R.id.selected_icon_image_view);
        SnapImageView snapImageView = (SnapImageView) context;
        Object f = new defpackage.jxj.b.a().a((int) R.drawable.lens_placeholder).b();
        akcr.a(f, "ViewBitmapLoader.Request…lens_placeholder).build()");
        snapImageView.setRequestOptions(f);
        akcr.a(context, "findViewById<SnapImageVi…older).build())\n        }");
        this.h = snapImageView;
        this.i = findViewById(R.id.lens_loading_overlay_view);
        CarouselListView carouselListView2 = this.b;
        if (carouselListView2 == null) {
            akcr.a("carouselListView");
        }
        carouselListView2.addOnScrollListener(new h(this));
    }
}
