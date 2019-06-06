package com.snap.mushroom.fragments;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter;
import com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter.ae;
import com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter.af;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.ptr.NeonPullToRefreshFragment;
import com.snapchat.android.R;
import defpackage.aajt;
import defpackage.aakc;
import defpackage.abog;
import defpackage.acgw;
import defpackage.achb;
import defpackage.achi;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfl;
import defpackage.ajfu;
import defpackage.ajwe;
import defpackage.ajwl;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
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
import defpackage.dnh;
import defpackage.eyn;
import defpackage.ftl;
import defpackage.fxj;
import defpackage.hgi;
import defpackage.hmh;
import defpackage.hoy;
import defpackage.ide;
import defpackage.igk;
import defpackage.ihh;
import defpackage.ipt;
import defpackage.pql;
import defpackage.qwi;
import defpackage.qxl;
import defpackage.qxn;
import defpackage.qxo;
import defpackage.qxq;
import defpackage.qzj;
import defpackage.qzl;
import defpackage.rap;
import defpackage.rbe;
import defpackage.rcm;
import defpackage.rcn;
import defpackage.rcn.h;
import defpackage.rcn.i;
import defpackage.rcn.j;
import defpackage.rco;
import defpackage.rcp;
import defpackage.rvo;
import defpackage.tnj;
import defpackage.upp;
import defpackage.zfw;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zlk;
import defpackage.zlt;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class NeonFriendsFeedFragment extends NeonPullToRefreshFragment<FriendsFeedPresenter> implements abog {
    private rcn B;
    private rcp C = new rcp();
    private AtomicBoolean D = new AtomicBoolean(false);
    private final ide E = qxo.b;
    public ajwy<FriendsFeedPresenter> a;
    public ipt b;
    rap c;
    View d;
    public qzj e;
    public ihh f;
    public hgi g;
    public tnj h;
    public dib i;
    public ftl j;
    public achb<zjm, zjk> k;
    public hoy l;
    public qxq m;
    public qxl n;
    public qxn o;
    public rbe p;
    public rco q;
    private View r;

    static final class b<V> implements Callable<ajeb<? extends T>> {
        private /* synthetic */ NeonFriendsFeedFragment a;

        b(NeonFriendsFeedFragment neonFriendsFeedFragment) {
            this.a = neonFriendsFeedFragment;
        }

        public final /* synthetic */ Object call() {
            ajwy ajwy = this.a.a;
            if (ajwy == null) {
                akcr.a("_presenterProvider");
            }
            Object obj = (FriendsFeedPresenter) ajwy.get();
            Activity e = this.a.e();
            if (e == null) {
                akcr.a();
            }
            return obj.a(e).b((ajeb) ajdx.b(obj));
        }
    }

    public static final class a implements OnClickListener {
        private final ajxe a;

        static final class a extends akcs implements akbk<WeakReference<FriendsFeedPresenter>> {
            private /* synthetic */ FriendsFeedPresenter a;

            a(FriendsFeedPresenter friendsFeedPresenter) {
                this.a = friendsFeedPresenter;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new WeakReference(this.a);
            }
        }

        static {
            new aken[1][0] = new akdc(akde.a(a.class), "presenter", "getPresenter()Ljava/lang/ref/WeakReference;");
        }

        public a(FriendsFeedPresenter friendsFeedPresenter) {
            this.a = ajxh.a(new a(friendsFeedPresenter));
        }

        /* JADX WARNING: Removed duplicated region for block: B:55:0x0109  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
        public final void onClick(android.view.View r9) {
            /*
            r8 = this;
            r9 = r8.a;
            r9 = r9.b();
            r9 = (java.lang.ref.WeakReference) r9;
            r9 = r9.get();
            r9 = (com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter) r9;
            if (r9 == 0) goto L_0x0111;
        L_0x0010:
            r0 = r9.n;
            if (r0 == 0) goto L_0x0111;
        L_0x0014:
            r0 = r9.getTarget();
            r0 = (defpackage.zlk) r0;
            r1 = 0;
            if (r0 == 0) goto L_0x0028;
        L_0x001d:
            r0 = r0.d();
            if (r0 == 0) goto L_0x0028;
        L_0x0023:
            r0 = r0.getLayoutManager();
            goto L_0x0029;
        L_0x0028:
            r0 = r1;
        L_0x0029:
            if (r0 == 0) goto L_0x0109;
        L_0x002b:
            r0 = (android.support.v7.widget.LinearLayoutManager) r0;
            r0 = r0.findFirstVisibleItemPosition();
            r2 = 1;
            r3 = 0;
            if (r0 != 0) goto L_0x0037;
        L_0x0035:
            r0 = 1;
            goto L_0x0038;
        L_0x0037:
            r0 = 0;
        L_0x0038:
            if (r0 == 0) goto L_0x00f7;
        L_0x003a:
            r0 = r9.f;
            r4 = "adapter";
            if (r0 != 0) goto L_0x0043;
        L_0x0040:
            defpackage.akcr.a(r4);
        L_0x0043:
            r0 = r0.getItemCount();
            r0 = defpackage.akef.a(r3, r0);
            r0 = (java.lang.Iterable) r0;
            r0 = defpackage.ajyu.k(r0);
            r0 = (java.lang.Iterable) r0;
            r0 = r0.iterator();
        L_0x0057:
            r5 = r0.hasNext();
            if (r5 == 0) goto L_0x0087;
        L_0x005d:
            r5 = r0.next();
            r6 = r5;
            r6 = (java.lang.Number) r6;
            r6 = r6.intValue();
            r7 = r9.f;
            if (r7 != 0) goto L_0x006f;
        L_0x006c:
            defpackage.akcr.a(r4);
        L_0x006f:
            r6 = r7.a(r6);
            r7 = r6 instanceof defpackage.rdt;
            if (r7 == 0) goto L_0x0083;
        L_0x0077:
            r6 = (defpackage.rdt) r6;
            r6 = r6.l;
            r6 = r6.j();
            if (r6 == 0) goto L_0x0083;
        L_0x0081:
            r6 = 1;
            goto L_0x0084;
        L_0x0083:
            r6 = 0;
        L_0x0084:
            if (r6 == 0) goto L_0x0057;
        L_0x0086:
            r1 = r5;
        L_0x0087:
            r1 = (java.lang.Integer) r1;
            if (r1 == 0) goto L_0x00b9;
        L_0x008b:
            r0 = r9.f;
            if (r0 != 0) goto L_0x0092;
        L_0x008f:
            defpackage.akcr.a(r4);
        L_0x0092:
            r3 = r1.intValue();
            r0.a(r3);
            r0 = r1.intValue();
            r0 = r0 + r2;
            r3 = r9.f;
            if (r3 != 0) goto L_0x00a5;
        L_0x00a2:
            defpackage.akcr.a(r4);
        L_0x00a5:
            r3 = r3.getItemCount();
            if (r0 >= r3) goto L_0x00b1;
        L_0x00ab:
            r0 = r1.intValue();
            r0 = r0 + r2;
            goto L_0x00b5;
        L_0x00b1:
            r0 = r1.intValue();
        L_0x00b5:
            r9.a(r0);
            return;
        L_0x00b9:
            r0 = new com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter$x;
            r0.<init>(r9);
            r0 = (java.util.concurrent.Callable) r0;
            r0 = defpackage.ajdx.c(r0);
            r1 = r9.a;
            r1 = r1.l();
            r1 = (defpackage.zfr) r1;
            r1 = (defpackage.ajdw) r1;
            r0 = r0.a(r1);
            r1 = new com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter$y;
            r2 = r9;
            r2 = (com.snap.messaging.friendsfeed.ui.FriendsFeedPresenter) r2;
            r1.<init>(r2);
            r1 = (defpackage.akbl) r1;
            r2 = new rar;
            r2.<init>(r1);
            r2 = (defpackage.ajfc) r2;
            r0 = r0.e(r2);
            r9 = r9.a;
            r9 = r9.i();
            r9 = (defpackage.ajdw) r9;
            r9 = r0.b(r9);
            r9.e();
            return;
        L_0x00f7:
            r9 = r9.getTarget();
            r9 = (defpackage.zlk) r9;
            if (r9 == 0) goto L_0x0111;
        L_0x00ff:
            r9 = r9.d();
            if (r9 == 0) goto L_0x0111;
        L_0x0105:
            r9.smoothScrollToPosition(r3);
            return;
        L_0x0109:
            r9 = new ajxt;
            r0 = "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager";
            r9.<init>(r0);
            throw r9;
        L_0x0111:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.mushroom.fragments.NeonFriendsFeedFragment$a.onClick(android.view.View):void");
        }
    }

    static final class e<T> implements ajfl<Float> {
        private /* synthetic */ NeonFriendsFeedFragment a;

        e(NeonFriendsFeedFragment neonFriendsFeedFragment) {
            this.a = neonFriendsFeedFragment;
        }

        public final /* synthetic */ boolean test(Object obj) {
            akcr.b((Float) obj, "it");
            View view = this.a.d;
            return view == null || view.getHeight() != 0;
        }
    }

    static final class f<T> implements ajfb<Float> {
        private /* synthetic */ NeonFriendsFeedFragment a;

        f(NeonFriendsFeedFragment neonFriendsFeedFragment) {
            this.a = neonFriendsFeedFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            Float f = (Float) obj;
            FriendsFeedPresenter friendsFeedPresenter = (FriendsFeedPresenter) this.a.t;
            if (friendsFeedPresenter != null) {
                friendsFeedPresenter.e();
            }
            View view = this.a.d;
            if (view != null) {
                view.setAlpha(Math.max(MapboxConstants.MINIMUM_ZOOM, 1.0f - (f.floatValue() / ((float) view.getHeight()))));
            }
        }
    }

    static final class g<T> implements ajfb<Integer> {
        private /* synthetic */ NeonFriendsFeedFragment a;

        g(NeonFriendsFeedFragment neonFriendsFeedFragment) {
            this.a = neonFriendsFeedFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            RecyclerView d = this.a.d();
            if (d == null) {
                akcr.a();
            }
            int paddingTop = d.getPaddingTop();
            akcr.a(obj, "it");
            int max = Math.max(paddingTop - obj.intValue(), 0);
            rap rap = this.a.c;
            if (rap != null) {
                rap.a(max);
            }
        }
    }

    static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class d extends akcq implements akbk<ajxw> {
        d(NeonFriendsFeedFragment neonFriendsFeedFragment) {
            super(0, neonFriendsFeedFragment);
        }

        public final String getName() {
            return "stopBackgroundAnimation";
        }

        public final akej getOwner() {
            return akde.a(NeonFriendsFeedFragment.class);
        }

        public final String getSignature() {
            return "stopBackgroundAnimation()V";
        }

        public final /* synthetic */ Object invoke() {
            ((NeonFriendsFeedFragment) this.receiver).n();
            return ajxw.a;
        }
    }

    private static boolean a(zjm zjm) {
        return !zjm.b;
    }

    private final void o() {
        if (!this.D.get()) {
            qxq qxq = this.m;
            if (qxq == null) {
                akcr.a("friendsFeedSessionManager");
            }
            qxq.c();
            qxn qxn = this.o;
            if (qxn == null) {
                akcr.a("friendsFeedEventLogger");
            }
            qxn.a();
        }
        this.D.set(false);
    }

    public final void a(View view) {
        View view2 = view;
        akcr.b(view2, "view");
        super.a(view);
        this.c = new rap(view2.findViewById(R.id.colored_overlay), view.getResources().getColor(R.color.regular_blue));
        rap rap = this.c;
        if (rap != null) {
            RecyclerView d = d();
            if (d == null) {
                akcr.a();
            }
            rap.a(d.getPaddingTop());
        }
        ipt ipt = this.b;
        String str = "hovaController";
        if (ipt == null) {
            akcr.a(str);
        }
        View a = ipt.a(R.id.neon_header_layout, qxo.a);
        if (a == null) {
            akcr.a();
        }
        this.d = a;
        ipt = this.b;
        if (ipt == null) {
            akcr.a(str);
        }
        a = ipt.a(R.id.feed_icon_container, qxo.a);
        if (a != null) {
            a.setOnClickListener(new a((FriendsFeedPresenter) this.t));
        }
        this.r = view2.findViewById(R.id.neon_header_top_gradient);
        ajej f = l().a((ajfl) new e(this)).f((ajfb) new f(this));
        ScopedFragment scopedFragment = this;
        ScopedFragment.a(this, f, scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        ScopedFragment.a(this, m().f((ajfb) new g(this)), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        ihh ihh = this.f;
        if (ihh == null) {
            akcr.a("clock");
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        Activity e = e();
        if (e != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) e;
            hgi hgi = this.g;
            if (hgi == null) {
                akcr.a("discoverFeedFriendsStoriesDataProvider");
            }
            tnj tnj = this.h;
            if (tnj == null) {
                akcr.a("prefrences");
            }
            dib dib = this.i;
            if (dib == null) {
                akcr.a("blizzardEventLogger");
            }
            rcp rcp = this.C;
            ftl ftl = this.j;
            if (ftl == null) {
                akcr.a("compositeConfigurationProvider");
            }
            zfw k = k();
            achb achb = this.k;
            if (achb == null) {
                akcr.a("navigationHost");
            }
            hoy hoy = this.l;
            if (hoy == null) {
                akcr.a("featureFlagManager");
            }
            qxq qxq = this.m;
            if (qxq == null) {
                akcr.a("friendsFeedSessionManager");
            }
            qxl qxl = this.n;
            if (qxl == null) {
                akcr.a("friendsFeedApi");
            }
            rco rco = this.q;
            if (rco == null) {
                akcr.a("friendStoryTeachingClickListener");
            }
            this.B = new rcn(ihh, viewGroup, fragmentActivity, hgi, tnj, dib, rcp, ftl, k, achb, hoy, qxq, qxl, rco);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (this.e != null) {
            qzj qzj = this.e;
            if (qzj == null) {
                akcr.a("swipeToChatPredicateController");
            }
            qzj.a();
        }
        super.a_(achi);
        FriendsFeedPresenter friendsFeedPresenter = (FriendsFeedPresenter) this.t;
        if (friendsFeedPresenter != null) {
            friendsFeedPresenter.q.a(Boolean.TRUE);
            boolean z = true;
            friendsFeedPresenter.n = true;
            ajwl ajwl = friendsFeedPresenter.A;
            if (friendsFeedPresenter.T.a().e == null) {
                z = false;
            }
            ajwl.a(Boolean.valueOf(z));
            friendsFeedPresenter.e();
            friendsFeedPresenter.B.b();
            friendsFeedPresenter.C.b();
            friendsFeedPresenter.ad.c();
            friendsFeedPresenter.L.b();
            qzl qzl = friendsFeedPresenter.R;
            qzl.c.a(qxo.a, qzl.b);
            friendsFeedPresenter.ae.a();
            friendsFeedPresenter.Q.a();
            friendsFeedPresenter.P.b();
            friendsFeedPresenter.a().h();
        }
        View view = this.d;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        ipt ipt = this.b;
        if (ipt == null) {
            akcr.a("hovaController");
        }
        view = ipt.a(R.id.feed_icon_container, qxo.a);
        if (view != null) {
            view.setOnClickListener(new a((FriendsFeedPresenter) this.t));
        }
        rbe rbe = this.p;
        if (rbe == null) {
            akcr.a("activeConversationManager");
        }
        rbe.b();
    }

    public final ajdx<FriendsFeedPresenter> b() {
        Object a = ajdx.a((Callable) new b(this));
        akcr.a(a, "Single.defer{\n        va…le.just(presenter))\n    }");
        return a;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        FriendsFeedPresenter friendsFeedPresenter = (FriendsFeedPresenter) this.t;
        if (friendsFeedPresenter != null) {
            friendsFeedPresenter.n = false;
            friendsFeedPresenter.q.a(Boolean.FALSE);
            friendsFeedPresenter.B.a();
            friendsFeedPresenter.C.a();
            friendsFeedPresenter.a();
            friendsFeedPresenter.R.c.a(qxo.a);
            friendsFeedPresenter.Q.b();
            friendsFeedPresenter.P.a();
            int i = 1;
            friendsFeedPresenter.P.a(hmh.FF_FRIEND);
            Object obj = (zjm) achi.f.e();
            akcr.a(obj, "destinationPage");
            Object obj2 = (!a((zjm) obj) || upp.a(obj) || (akcr.a(obj, dnh.c) ^ 1) == 0) ? null : 1;
            if (obj2 != null) {
                qwi qwi = friendsFeedPresenter.Y;
                qwi.f.removeCallbacks(qwi.h);
                qwi.g = false;
                qwi.c = null;
                qwi.a = null;
                qwi.b = null;
                qwi.e.clear();
                qwi.d.clear();
                qwi.s.a();
                qwi.b();
                if ((akcr.a(obj, pql.a) ^ 1) != 0) {
                    friendsFeedPresenter.Y.a();
                }
            }
            if (!a((zjm) obj) || upp.a(obj) || (akcr.a(obj, dnh.c) ^ 1) == 0 || (akcr.a(obj, pql.a) ^ 1) == 0) {
                i = 0;
            }
            if (i != 0) {
                zlk zlk = (zlk) friendsFeedPresenter.getTarget();
                if (zlk != null) {
                    RecyclerView d = zlk.d();
                    if (d != null) {
                        d.scrollToPosition(0);
                    }
                }
                zlt zlt = this.v;
                if (zlt != null) {
                    zlt.a();
                }
            }
        }
        rap rap = this.c;
        if (rap != null) {
            rap.a();
        }
        View view = this.d;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        qzj qzj = this.e;
        if (qzj == null) {
            akcr.a("swipeToChatPredicateController");
        }
        qzj.b();
        rcn rcn = this.B;
        if (rcn != null) {
            rcn.a();
        }
        rbe rbe = this.p;
        if (rbe == null) {
            akcr.a("activeConversationManager");
        }
        rbe.c();
        if (akcr.a((zjm) achi.f.e(), dnh.a)) {
            o();
        }
    }

    public final ide c() {
        return this.E;
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.c(achi);
        float f = akcr.a((zjm) achi.f.e(), pql.a) ? 1.0f - achi.i : akcr.a((zjm) achi.e.e(), pql.a) ? achi.i : -1.0f;
        if (f != -1.0f) {
            rap rap = this.c;
            if (rap != null) {
                rap.a(f);
            }
            View view = this.d;
            if (view != null) {
                view.setAlpha(Math.max(MapboxConstants.MINIMUM_ZOOM, f - 0.5f) * 2.0f);
            }
            view = this.r;
            if (view != null) {
                Object b = m().b();
                akcr.a(b, "recyclerViewScrollY().blockingFirst()");
                view.setAlpha(a(((Number) b).intValue()) * f);
            }
        }
        Object obj = null;
        Object obj2 = (akcr.a((zjm) achi.f.e(), qxo.a) && achi.i == 1.0f) ? 1 : null;
        if (obj2 != null) {
            rcn rcn = this.B;
            if (rcn != null) {
                FriendsFeedPresenter friendsFeedPresenter = (FriendsFeedPresenter) this.t;
                ajwl ajwl = friendsFeedPresenter != null ? friendsFeedPresenter.r : null;
                if (rcn.p) {
                    rcm rcm = rcn.c;
                    if ((rcm == null || rcm.getVisibility() != 0) && (!rcn.k.a() || rcn.a(rcn.n.a()))) {
                        if (ajwl == null) {
                            ajwl = ajwl.i(Boolean.FALSE);
                            akcr.a((Object) ajwl, "BehaviorSubject.createDefault(false)");
                        }
                        rcn.f = ajwl.a((ajfl) defpackage.rcn.a.a).c(1).k((ajfc) new defpackage.rcn.c(rcn)).c(1).k((ajfc) new defpackage.rcn.d(rcn)).c(1).a((ajdw) rcn.m.h()).k((ajfc) new defpackage.rcn.e(rcn)).c(1).k((ajfc) new defpackage.rcn.f(rcn)).a((ajfl) defpackage.rcn.g.a).c(1).p(new h(rcn)).c(1).a((ajfl) new i(rcn)).p(new j(rcn)).a((ajdw) rcn.m.l()).f((ajfb) new defpackage.rcn.b(rcn));
                    }
                }
            }
        }
        if (akcr.a((zjm) achi.f.e(), qxo.a) && achi.i == 1.0f && achi.d == acgw.PRESENT) {
            obj = 1;
        }
        if (obj != null) {
            if (this.o != null) {
                qxn qxn = this.o;
                if (qxn == null) {
                    akcr.a("friendsFeedEventLogger");
                }
                String a = qxn.d.a();
                if (!TextUtils.equals(a, (CharSequence) qxn.a.get())) {
                    qxn.a.set(a);
                    aakc aakc = new aakc();
                    aakc.a(qxn.d.b());
                    aakc.setSessionId((String) qxn.a.get());
                    ((dib) qxn.e.get()).a((aajt) aakc);
                    qxn.c.set(true);
                    qxn.b.set(Long.valueOf(qxn.f.a()));
                }
                return;
            }
            this.D.set(true);
        }
    }

    public final void d(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.d(achi);
        if (akcr.a((zjm) achi.e.e(), qxo.a) && achi.g.a()) {
            FriendsFeedPresenter friendsFeedPresenter = (FriendsFeedPresenter) this.t;
            if (friendsFeedPresenter != null) {
                friendsFeedPresenter.e();
            }
        }
        if (akcr.a((zjm) achi.e.e(), pql.a)) {
            rap rap = this.c;
            if (rap != null) {
                rap.a();
            }
        }
    }

    public final int h() {
        ajwy ajwy = this.A;
        if (ajwy == null) {
            akcr.a("v11Configuration");
        }
        Object b = ((fxj) ajwy.get()).a().b();
        akcr.a(b, "v11Configuration.get().i…deEnabled().blockingGet()");
        return ((Boolean) b).booleanValue() ? R.color.white : R.color.regular_blue;
    }

    public final zjm i() {
        return qxo.a;
    }

    public final boolean j() {
        FriendsFeedPresenter friendsFeedPresenter = (FriendsFeedPresenter) this.t;
        if (friendsFeedPresenter != null) {
            Object a = ((eyn) friendsFeedPresenter.aj.get()).a();
            akcr.a(a, "cognacFeedDataProvider.get().onFeedPullToRefresh()");
            igk.a(ajwe.a((ajcx) a, (akbl) ae.a, ajwe.a), friendsFeedPresenter.z);
            Object e = friendsFeedPresenter.af.e((ajfc) af.a);
            akcr.a(e, "friendsFeedApi.flatMapCo…teType.PULL_TO_REFRESH) }");
            ScopedFragment.a((ScopedFragment) this, e.b((ajdw) k().g()).a((ajfb) c.a).a(ajfu.g).a((ajdw) k().l()).g(new rvo(new d(this))), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        }
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
    }

    public final void onDestroy() {
        super.onDestroy();
        rcn rcn = this.B;
        if (rcn != null) {
            rcn.a();
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        ipt ipt = this.b;
        if (ipt == null) {
            akcr.a("hovaController");
        }
        View a = ipt.a(R.id.feed_icon_container, qxo.a);
        if (a != null) {
            a.setOnClickListener(null);
        }
        rcn rcn = this.B;
        if (rcn != null) {
            rcn.a();
        }
        this.C.a(false);
        o();
    }

    public final void onPause() {
        super.onPause();
        rcn rcn = this.B;
        if (rcn != null) {
            rcn.a();
        }
        this.C.a(false);
        o();
    }
}
