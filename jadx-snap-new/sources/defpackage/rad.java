package defpackage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.AdapterDataObserver;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.View;
import android.view.ViewGroup;
import com.snap.ui.view.OnBoardTooltipView;
import com.snapchat.android.framework.ui.views.PullToRefreshLayout;
import com.snapchat.android.framework.ui.views.PullToRefreshLayout.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

/* renamed from: rad */
public final class rad implements ajej {
    public ViewGroup a;
    public RecyclerView b;
    Map<rag, OnBoardTooltipView> c = new HashMap();
    public Map<rag, Integer> d = new HashMap();
    public final zfw e = zgb.a(qxo.b.callsite("FriendsFeedTooltipManager"));
    public ajws<ajxm<a, rag>> f;
    public ajws<ajxm<rag, View>> g;
    public ajei h;
    boolean i;
    public final g j;
    public final n k;
    final m l;
    public final raf m;
    private boolean n;
    private final ajdp<rag> o;

    /* renamed from: rad$b */
    static final class b<T> implements ajdr<T> {
        private /* synthetic */ rad a;

        b(rad rad) {
            this.a = rad;
        }

        public final void subscribe(ajdq<rag> ajdq) {
            akcr.b(ajdq, "it");
            rag[] values = rag.values();
            Collection arrayList = new ArrayList();
            for (Object obj : values) {
                raf raf = this.a.m;
                akcr.b(obj, "tooltipType");
                int i = (!raf.c.a((fth) fxs.FEATURE_CONFIG_SYNCED_TOOLTIPS) || raf.c.a(obj.configurationKey)) ? 1 : 0;
                if ((1 ^ i) != 0) {
                    arrayList.add(obj);
                }
            }
            List list = (List) arrayList;
            if ((list.isEmpty() ^ 1) != 0) {
                ajdq.a(ajyu.f(list));
            }
        }
    }

    /* renamed from: rad$g */
    public static final class g implements a {
        private /* synthetic */ rad a;

        g(rad rad) {
            this.a = rad;
        }

        public final void a() {
        }

        public final void a(float f) {
            if (f < 3.0f) {
                rad.b(this.a);
            } else {
                rad.a(this.a);
            }
        }
    }

    /* renamed from: rad$n */
    public static final class n extends OnScrollListener {
        private /* synthetic */ rad a;

        n(rad rad) {
            this.a = rad;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            akcr.b(recyclerView, "recyclerView");
            if (i == 0) {
                rad.b(this.a);
            } else {
                rad.a(this.a);
            }
        }
    }

    /* renamed from: rad$c */
    public static final class c<T> implements ajfb<rag> {
        private /* synthetic */ rad a;

        public c(rad rad) {
            this.a = rad;
        }

        public final /* synthetic */ void accept(Object obj) {
            rag rag = (rag) obj;
            rad rad = this.a;
            akcr.a((Object) rag, "it");
            rad.b(rag);
        }
    }

    /* renamed from: rad$d */
    public static final class d<T> implements ajfb<Boolean> {
        private /* synthetic */ rad a;
        private /* synthetic */ RecyclerView b;

        public d(rad rad, RecyclerView recyclerView) {
            this.a = rad;
            this.b = recyclerView;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (akcr.a((Boolean) obj, Boolean.TRUE)) {
                rad.a(this.a);
                rad.b(this.a);
                if (this.a.i) {
                    this.a.i = false;
                    Adapter adapter = this.b.getAdapter();
                    if (adapter == null) {
                        akcr.a();
                    }
                    adapter.registerAdapterDataObserver(this.a.l);
                    this.a.l.a = true;
                }
            }
        }
    }

    /* renamed from: rad$e */
    public static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ rad a;

        public e(rad rad) {
            this.a = rad;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            this.a.a((rag) ajxm.a);
            return ajxm;
        }
    }

    /* renamed from: rad$f */
    public static final class f<T> implements ajfb<ajxm<? extends rag, ? extends View>> {
        private /* synthetic */ rad a;

        public f(rad rad) {
            this.a = rad;
        }

        /* JADX WARNING: Missing block: B:12:0x0042, code skipped:
            if (r2 != ((java.lang.Number) r4).intValue()) goto L_0x0044;
     */
        public final /* synthetic */ void accept(java.lang.Object r7) {
            /*
            r6 = this;
            r7 = (defpackage.ajxm) r7;
            r0 = r7.a;
            r0 = (defpackage.rag) r0;
            r7 = r7.b;
            r7 = (android.view.View) r7;
            if (r7 != 0) goto L_0x0012;
        L_0x000c:
            r7 = r6.a;
            r7.a(r0);
            return;
        L_0x0012:
            r1 = 2;
            r1 = new int[r1];
            r7.getLocationOnScreen(r1);
            r2 = r6.a;
            r2 = r2.d;
            r2 = r2.get(r0);
            r2 = (java.lang.Integer) r2;
            r3 = 1;
            if (r2 != 0) goto L_0x0026;
        L_0x0025:
            goto L_0x002d;
        L_0x0026:
            r2 = r2.intValue();
            r4 = -1;
            if (r2 == r4) goto L_0x0044;
        L_0x002d:
            r2 = r1[r3];
            r4 = r6.a;
            r4 = r4.d;
            r4 = r4.get(r0);
            if (r4 != 0) goto L_0x003c;
        L_0x0039:
            defpackage.akcr.a();
        L_0x003c:
            r4 = (java.lang.Number) r4;
            r4 = r4.intValue();
            if (r2 == r4) goto L_0x00f8;
        L_0x0044:
            r2 = r6.a;
            r2 = r2.d;
            r1 = r1[r3];
            r1 = java.lang.Integer.valueOf(r1);
            r2.put(r0, r1);
            r1 = r6.a;
            r2 = r1.c;
            r2 = r2.get(r0);
            r2 = (com.snap.ui.view.OnBoardTooltipView) r2;
            if (r2 != 0) goto L_0x00b2;
        L_0x005d:
            r2 = defpackage.rae.a;
            r4 = r0.ordinal();
            r2 = r2[r4];
            r4 = 2131887280; // 0x7f1204b0 float:1.9409163E38 double:1.053292266E-314;
            r5 = "attachedToView.context";
            if (r2 == r3) goto L_0x0084;
        L_0x006c:
            r2 = new com.snap.ui.view.OnBoardTooltipView$Builder;
            r3 = r7.getContext();
            defpackage.akcr.a(r3, r5);
            r2.<init>(r3, r7, r4);
            r7 = com.snapchat.android.framework.ui.views.Tooltip.a.POINTER_UP;
            r7 = r2.withPointerDirection(r7);
        L_0x007e:
            r7 = r7.build();
            r2 = r7;
            goto L_0x00ac;
        L_0x0084:
            r2 = new com.snap.ui.view.OnBoardTooltipView$Builder;
            r3 = r7.getContext();
            defpackage.akcr.a(r3, r5);
            r2.<init>(r3, r7, r4);
            r7 = com.snapchat.android.framework.ui.views.Tooltip.a.RECYCLERVIEW_FEED_V2;
            r7 = r2.withPointerDirection(r7);
            r2 = 2131167084; // 0x7f07076c float:1.7948432E38 double:1.0529364418E-314;
            r7 = r7.withTipMargin(r2);
            r2 = 2131231509; // 0x7f080315 float:1.8079101E38 double:1.052968272E-314;
            r7 = r7.withBackgroundDrawable(r2);
            r2 = 2131099899; // 0x7f0600fb float:1.7812164E38 double:1.052903248E-314;
            r7 = r7.withColor(r2);
            goto L_0x007e;
        L_0x00ac:
            r7 = r1.c;
            r7.put(r0, r2);
            goto L_0x00b5;
        L_0x00b2:
            r2.updateAttachedView(r7);
        L_0x00b5:
            r7 = defpackage.ajdx.b(r2);
            r0 = r1.e;
            r0 = r0.h();
            r0 = (defpackage.ajdw) r0;
            r7 = r7.b(r0);
            r0 = r1.e;
            r0 = r0.l();
            r0 = (defpackage.zfr) r0;
            r0 = (defpackage.ajdw) r0;
            r7 = r7.a(r0);
            r0 = new rad$j;
            r0.<init>(r1);
            r0 = (defpackage.ajfb) r0;
            r7 = r7.c(r0);
            r0 = defpackage.rad.k.a;
            r0 = (defpackage.ajfb) r0;
            r7 = r7.c(r0);
            r0 = defpackage.rad.l.a;
            r0 = (defpackage.ajfb) r0;
            r7 = r7.e(r0);
            r0 = "Single.just(getTooltip(t…owWithBouncyAnimation() }";
            defpackage.akcr.a(r7, r0);
            r0 = r1.h;
            defpackage.ajvv.a(r7, r0);
        L_0x00f8:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rad$f.accept(java.lang.Object):void");
        }
    }

    /* renamed from: rad$m */
    public static final class m extends AdapterDataObserver {
        boolean a;
        final /* synthetic */ rad b;

        /* renamed from: rad$m$a */
        static final class a<T> implements ajfb<Integer> {
            private /* synthetic */ m a;

            a(m mVar) {
                this.a = mVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                rad.a(this.a.b);
                rad.b(this.a.b);
            }
        }

        m(rad rad) {
            this.b = rad;
        }

        public final void onItemRangeInserted(int i, int i2) {
            super.onItemRangeInserted(i, i2);
            ajej e = ajdx.b(Integer.valueOf(0)).b(120, TimeUnit.MILLISECONDS).b((ajdw) this.b.e.l()).e((ajfb) new a(this));
            akcr.a((Object) e, "Single.just(0).delay(120…hTooltips()\n            }");
            ajvv.a(e, this.b.h);
        }
    }

    /* renamed from: rad$h */
    static final class h<T> implements ajfb<rag> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: rad$i */
    static final class i<T> implements ajfb<rag> {
        private /* synthetic */ rad a;

        i(rad rad) {
            this.a = rad;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.f.a((Object) new ajxm(a.SHOW, (rag) obj));
        }
    }

    /* renamed from: rad$a */
    public enum a {
        SHOW,
        HIDE,
        DISMISS
    }

    /* renamed from: rad$j */
    static final class j<T> implements ajfb<OnBoardTooltipView> {
        private /* synthetic */ rad a;

        j(rad rad) {
            this.a = rad;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (OnBoardTooltipView) obj;
            akcr.a(obj, "it");
            if ((akcr.a(obj.getParent(), this.a.a) ^ 1) != 0) {
                ViewGroup viewGroup = this.a.a;
                if (viewGroup != null) {
                    viewGroup.addView((View) obj);
                }
            }
        }
    }

    /* renamed from: rad$k */
    static final class k<T> implements ajfb<OnBoardTooltipView> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ((OnBoardTooltipView) obj).initSpring();
        }
    }

    /* renamed from: rad$l */
    static final class l<T> implements ajfb<OnBoardTooltipView> {
        public static final l a = new l();

        l() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ((OnBoardTooltipView) obj).showWithBouncyAnimation();
        }
    }

    public rad(zgb zgb, raf raf) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(raf, "tooltipRepository");
        this.m = raf;
        Object ajwo = new ajwo();
        String str = "PublishSubject.create()";
        akcr.a(ajwo, str);
        this.f = (ajws) ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str);
        this.g = (ajws) ajwo;
        this.h = new ajei();
        this.i = true;
        ajwo = ajdp.a((ajdr) new b(this));
        akcr.a(ajwo, "Observable.create<Toolti…        }\n        }\n    }");
        this.o = ajwo;
        this.j = new g(this);
        this.k = new n(this);
        this.l = new m(this);
    }

    public final void a(rag rag) {
        akcr.b(rag, "tooltipType");
        OnBoardTooltipView onBoardTooltipView = (OnBoardTooltipView) this.c.get(rag);
        if (onBoardTooltipView != null && onBoardTooltipView.getVisibility() == 0) {
            onBoardTooltipView = (OnBoardTooltipView) this.c.get(rag);
            if (onBoardTooltipView != null) {
                onBoardTooltipView.hideWithBouncyAnimation();
            }
            this.d.put(rag, Integer.valueOf(-1));
        }
    }

    public final void b(rag rag) {
        akcr.b(rag, "tooltipType");
        a(rag);
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (((rag) entry.getKey()).equals(rag)) {
                it.remove();
                ViewGroup viewGroup = this.a;
                if (viewGroup != null) {
                    viewGroup.removeView((View) entry.getValue());
                }
            }
        }
    }

    public final void dispose() {
        if (!this.n) {
            this.n = true;
            ViewGroup viewGroup = this.a;
            if (viewGroup != null) {
                if (viewGroup != null) {
                    ((PullToRefreshLayout) viewGroup).b(this.j);
                } else {
                    throw new ajxt("null cannot be cast to non-null type com.snapchat.android.framework.ui.views.PullToRefreshLayout");
                }
            }
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(this.k);
            }
            if (this.l.a) {
                recyclerView = this.b;
                if (recyclerView != null) {
                    Adapter adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.unregisterAdapterDataObserver(this.l);
                    }
                }
                this.l.a = false;
            }
            this.a = null;
            this.b = null;
            this.h.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.n;
    }
}
