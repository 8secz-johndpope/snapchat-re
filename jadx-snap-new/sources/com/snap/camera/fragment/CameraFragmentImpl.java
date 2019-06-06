package com.snap.camera.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.snap.camera.api.CameraFragment;
import com.snap.camera.view.CameraGestureDetectionView;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import com.snap.ui.view.ViewFinder;
import com.snap.ui.view.surfaceview.SurfaceViewManager;
import com.snapchat.android.R;
import com.snapchat.android.framework.analytics.startup.ActivityFirstDrawObserver;
import defpackage.ablx;
import defpackage.abss;
import defpackage.acgw;
import defpackage.achb;
import defpackage.achg;
import defpackage.achi;
import defpackage.achk;
import defpackage.acih;
import defpackage.aciv;
import defpackage.acix;
import defpackage.aipx;
import defpackage.ajdj;
import defpackage.ajdn;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajek;
import defpackage.ajfb;
import defpackage.ajfl;
import defpackage.ajfu;
import defpackage.ajlu;
import defpackage.ajot;
import defpackage.ajvo;
import defpackage.ajwl;
import defpackage.ajwo;
import defpackage.ajws;
import defpackage.ajwy;
import defpackage.ajxw;
import defpackage.akcr;
import defpackage.cfl;
import defpackage.dnh;
import defpackage.dni;
import defpackage.dnk;
import defpackage.dnk.d;
import defpackage.dnk.e;
import defpackage.dnq;
import defpackage.doe;
import defpackage.dpt;
import defpackage.dpu;
import defpackage.dpz;
import defpackage.dqc;
import defpackage.duh;
import defpackage.duh.c;
import defpackage.duo;
import defpackage.dux;
import defpackage.duz;
import defpackage.dva;
import defpackage.ebh;
import defpackage.ebj;
import defpackage.ebm;
import defpackage.ebo;
import defpackage.ebr;
import defpackage.ebs;
import defpackage.ebw;
import defpackage.edj;
import defpackage.emu;
import defpackage.emy.a;
import defpackage.eoe;
import defpackage.eoh;
import defpackage.eom;
import defpackage.fsv;
import defpackage.gcn;
import defpackage.gpb;
import defpackage.icv;
import defpackage.idd;
import defpackage.ilv;
import defpackage.inq;
import defpackage.ipt;
import defpackage.vpc;
import defpackage.vpe;
import defpackage.zfw;
import defpackage.zgk;
import defpackage.zhb;
import defpackage.zjj;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;
import defpackage.zkq;
import defpackage.zkr;
import defpackage.zlg;
import defpackage.zlh;
import java.util.Iterator;
import java.util.Objects;

public class CameraFragmentImpl extends CameraFragment implements zjj, zjq, zlg {
    public final ajws<ebj> A = new ajwo();
    final ajws<achi> B = new ajwo();
    dnk C = null;
    public dni D;
    boolean E = false;
    boolean F = true;
    public zfw G;
    private ajwo<dva> H = new ajwo();
    private final ajwl<duz> I = ajwl.i(duz.UNDEFINED);
    private ajei J = new ajei();
    private final ajws<ebo> K = new ajwo();
    private final ajwl<ebs> L = new ajwl();
    private final ajws<ajxw> M = new ajwo();
    private final dux N = new dux();
    private eoe O;
    private achk<zjm, zjk> P;
    private ViewFinder Q;
    private View R;
    private View S;
    private TextView T;
    private c V;
    private a W;
    private ajdp<Boolean> X;
    public duh a;
    public SurfaceViewManager b;
    public ebh c;
    public a.a d;
    public achb<zjm, zjk> e;
    public dpt.a f;
    public dqc.a g;
    public ipt h;
    public zhb i;
    public ebw j;
    public ilv k;
    public ablx l;
    public Optional<ajws<dpz>> m;
    public abss n;
    public zgk<b> o;
    public vpe p;
    public vpc q;
    public Optional<ajdp<ebm>> r;
    public ebr s;
    public zkr t;
    public zlh u;
    public ajws<ajxw> v;
    public gpb w;
    public ajwy<doe> x;
    public icv y;
    public zkq z;

    /* renamed from: com.snap.camera.fragment.CameraFragmentImpl$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[duz.values().length];
        static final /* synthetic */ int[] b = new int[acix.a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:5|6)|7|9|10|11|12|14) */
        /* JADX WARNING: Missing block: B:15:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.acix.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = defpackage.acix.a.ON_HIDDEN_FROM_PARTIALLY_VISIBLE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = defpackage.acix.a.ON_PARTIALLY_VISIBLE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = defpackage.duz.values();
            r2 = r2.length;
            r2 = new int[r2];
            a = r2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = defpackage.duz.FULLY_VISIBLE;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0032 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0032 }
        L_0x0032:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = defpackage.duz.PARTIALLY_VISIBLE;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r0[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.camera.fragment.CameraFragmentImpl$AnonymousClass3.<clinit>():void");
        }
    }

    private void a(dnk dnk) {
        if (dnk instanceof d) {
            ajdp a = ajdp.b((Object) dnk).a(new eoh());
            eom c = this.W.c();
            c.getClass();
            ScopedFragment.a((ScopedFragment) this, a.v(new -$$Lambda$KxGI1SG1Ov8IZDIAOXs-idAPeC0(c)).e(), ScopedFragment.b.ON_DESTROY_VIEW);
        } else if (dnk instanceof e.b) {
            a(dpu.b.a.b.a);
        } else if (dnk instanceof e.a) {
            a(new dpu.b.a.a(((e.a) dnk).a));
        } else if (dnk instanceof e.c) {
            a(dpu.b.a.c.a);
        } else if (dnk instanceof e.d) {
            a(new dpu.b.a.d(((e.d) dnk).a));
        } else {
            if (dnk instanceof dnk.b) {
                dnq dnq = ((dnk.b) dnk).f;
                if (dnq instanceof dnq.b) {
                    this.S.setVisibility(0);
                    this.T.setText(((dnq.b) dnq).a);
                }
            }
        }
    }

    private void a(dpu dpu) {
        this.J.a(this.X.a(-$$Lambda$CameraFragmentImpl$SJXUec11bMUJULkFQNAxNFA9hts.INSTANCE).p(new -$$Lambda$CameraFragmentImpl$IAtrZ2lTZ381EllOHOLQl3h9ubA(dpu)).d().d(this.W.d()));
    }

    private void c(acih acih) {
        if (acih instanceof dnk) {
            a((dnk) acih);
        }
    }

    private static gcn d(acih acih) {
        return acih instanceof dnk.b ? ((dnk.b) acih).d : gcn.CAMERA;
    }

    private void h() {
        ((View) Preconditions.checkNotNull(this.Q.findViewById(R.id.camera_touch_receiver))).setOnTouchListener(null);
    }

    private /* synthetic */ void h(dva dva) {
        idd callsite = dnh.f.callsite("CameraFragment");
        if (dva instanceof dva.b) {
            ((doe) this.x.get()).a(doe.a.REQUIRE_CAMERA, callsite.a(d(this.C).name()));
            return;
        }
        if (dva instanceof dva.d) {
            ((doe) this.x.get()).a(doe.a.RELEASE_CAMERA, callsite.a(d(this.C).name()));
        }
    }

    private static /* synthetic */ ajdn i(dva dva) {
        return dva instanceof dva.b ? ajdj.b(inq.ENTERING_CAMERA_PAGE) : dva instanceof dva.d ? ajdj.b(inq.LEFT_CAMERA_PAGE) : ajvo.a(ajlu.a);
    }

    private void i() {
        this.a.a(edj.CLEAR);
    }

    private /* synthetic */ void j(dva dva) {
        this.I.a(dva.a);
    }

    private boolean j() {
        Iterator j = this.e.j();
        while (j.hasNext()) {
            aciv aciv = (aciv) j.next();
            if (!a(aciv)) {
                if (!((zjm) aciv.e()).b) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    private /* synthetic */ Optional k() {
        return Optional.fromNullable(this.C);
    }

    private /* synthetic */ Boolean l() {
        boolean z = this.I.p() == duz.FULLY_VISIBLE && this.L.p() == ebs.d.b;
        return Boolean.valueOf(z);
    }

    private /* synthetic */ ViewFinder m() {
        ViewFinder viewFinder = new ViewFinder(this.h.a(R.id.hova_page, this.D.b()), this.R);
        this.Q = viewFinder;
        return viewFinder;
    }

    public final long S_() {
        return -1;
    }

    public final ajdp<ebo> a() {
        return this.K.f();
    }

    public final CameraFragmentImpl a(dni dni) {
        this.D = dni;
        return this;
    }

    public final void a(achi<zjm, zjk> achi, acix.a aVar) {
        int i = AnonymousClass3.b[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                a(new dva.b(achi.m));
                a(new dva.a(achi.m));
            }
            return;
        }
        a(new dva.c(achi.m));
        a(new dva.d(achi.m));
    }

    /* Access modifiers changed, original: final */
    public final void a(dva dva) {
        this.H.a((Object) dva);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(aciv<zjm, zjk> aciv) {
        return aciv != null && ((zjm) aciv.e()).equals(this.D.b());
    }

    public final ajdp<ebj> b() {
        return this.A.f();
    }

    public final void b(acih acih) {
        c(acih);
    }

    public final boolean d() {
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        if (this.D.h()) {
            this.l.g();
        }
    }

    public final ajdp<ajxw> g() {
        return this.M.f();
    }

    public final boolean o_() {
        return this.N.a();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        aipx.a(this);
        getLifecycle().a(new ActivityFirstDrawObserver(this.l));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ajfb -__lambda_wgugnqxdo-ihwh9chybyj2ztuy8;
        this.R = layoutInflater.inflate(this.D.a(), viewGroup, false);
        this.R.setWillNotDraw(true);
        fsv.a("provideMainViewFinder", new -$$Lambda$CameraFragmentImpl$c99HNYUPaOt4qOBvLcpOecQxpEM(this));
        CameraGestureDetectionView cameraGestureDetectionView = (CameraGestureDetectionView) this.R.findViewById(R.id.gesture_detection_view);
        cameraGestureDetectionView.setWillNotDraw(true);
        this.J.a(this.H.j(ajfu.a).f(new -$$Lambda$CameraFragmentImpl$5W2mTRJmUN_79PZfLGeW5Ps36dE(this)));
        this.J.a(this.H.a((ajdw) this.G.f()).m(-$$Lambda$CameraFragmentImpl$E0ORXA5-RdPE7sDf0dYVavEqQOs.INSTANCE).f(new -$$Lambda$CameraFragmentImpl$uKgLWKKnydDObNS08whWIw__ANs(this)));
        this.J.a(this.H.f((ajfb) new -$$Lambda$CameraFragmentImpl$NYi5amY4o41Qr30UCuGtySootsY(this)));
        this.S = this.Q.findViewById(R.id.camera_loading_overlay);
        this.T = (TextView) this.Q.findViewById(R.id.camera_loading_overlay_text);
        View findViewById = this.Q.findViewById(R.id.camera_loading_overlay_cancel);
        if (findViewById != null) {
            this.J.a(cfl.c(findViewById).f(new -$$Lambda$CameraFragmentImpl$fe6jFJnuhfnP8SC0aRjheu28FVQ(this)));
        }
        this.V = new emu(this.L);
        duh duh = this.a;
        duh.a.add(this.V);
        if (this.m.isPresent()) {
            ajws ajws = (ajws) this.m.get();
            ajws.getClass();
            -__lambda_wgugnqxdo-ihwh9chybyj2ztuy8 = new -$$Lambda$wGUgnQXdO-IHwH9ChYByj2ZtUy8(ajws);
        } else {
            -__lambda_wgugnqxdo-ihwh9chybyj2ztuy8 = new -$$Lambda$CameraFragmentImpl$kTMndyvS5sGFbyESeVw21qdND8M(this);
        }
        this.W = this.d.a(this.R).a(this.Q).a(this.s).a(getActivity()).a(this.i).a(this.a).a(this.b).a(this.t).b(this.A).a(this.K).a(this.c).a(this.j).a(this.H).b(this.I.f()).c(this.L).a(new -$$Lambda$CameraFragmentImpl$o7tf-TfuNteXCGN27JJPSob5Ye8(this)).b(new -$$Lambda$CameraFragmentImpl$o4QgAHQp2KpQir3SQ7WRqFm82h0(this)).a(new duo()).a(this.e).a(this.D).a(this.f).a(this.g).a(-__lambda_wgugnqxdo-ihwh9chybyj2ztuy8).a(this.N).a(this.p).a(this.q).d((ajdp) this.r.or(ajvo.a(ajot.a))).a((ViewStub) this.Q.findViewById(R.id.start_button_view_stub)).b(this.Q.findViewById(R.id.camera_loading_overlay)).a(this.w).a(this.y).a(this.z).e(this.B.f()).a();
        this.X = this.W.b().p(-$$Lambda$CameraFragmentImpl$14JeQdTI6M9vxyNsy-k0OHBJ4oU.INSTANCE).h(Boolean.FALSE).j(ajfu.a).i().a();
        ScopedFragment.a((ScopedFragment) this, this.X.l(), ScopedFragment.b.ON_DESTROY);
        Supplier e = this.W.e();
        akcr.b(e, "<set-?>");
        cameraGestureDetectionView.a = e;
        this.O = this.W.a();
        this.P = new achk<zjm, zjk>() {
            private static boolean a(achg achg) {
                return "Opera".equals(achg.c()) || !achg.a();
            }

            public final void a(achi<zjm, zjk> achi) {
                if (CameraFragmentImpl.this.E || CameraFragmentImpl.a((achi) achi)) {
                    CameraFragmentImpl.this.B.a((Object) achi);
                    achg achg = (zjm) achi.f.e();
                    acih acih = achi.m;
                    if (achi.l && achi.k && CameraFragmentImpl.this.a(achi.e) && AnonymousClass2.a(achg)) {
                        CameraFragmentImpl.this.a(new dva.c(acih));
                    }
                    if (achi.l && achi.j && CameraFragmentImpl.this.a(achi.f) && (AnonymousClass2.a(achi.e.e()) || achi.d == acgw.PRESENT)) {
                        CameraFragmentImpl cameraFragmentImpl;
                        dnk dnk;
                        if (acih instanceof dnk) {
                            if (!(acih instanceof dnk.c)) {
                                cameraFragmentImpl = CameraFragmentImpl.this;
                                dnk = (dnk) acih;
                            }
                            CameraFragmentImpl.this.a(new dva.b(acih));
                        } else {
                            cameraFragmentImpl = CameraFragmentImpl.this;
                            dnk = null;
                        }
                        cameraFragmentImpl.C = dnk;
                        CameraFragmentImpl.this.a(new dva.b(acih));
                    }
                    return;
                }
                CameraFragmentImpl.this.F = false;
            }

            public final void b(achi<zjm, zjk> achi) {
                if (CameraFragmentImpl.this.E || CameraFragmentImpl.a((achi) achi)) {
                    aciv aciv = achi.f;
                    acih acih = achi.m;
                    if (achi.j && CameraFragmentImpl.this.a(aciv) && (AnonymousClass2.a(achi.e.e()) || achi.d == acgw.PRESENT)) {
                        CameraFragmentImpl.this.a(new dva.a(acih));
                        CameraFragmentImpl.this.c(acih);
                        if (CameraFragmentImpl.a((achi) achi)) {
                            CameraFragmentImpl.this.f();
                            return;
                        }
                    } else if (achi.k && CameraFragmentImpl.this.a(achi.e) && AnonymousClass2.a(aciv.e())) {
                        CameraFragmentImpl.this.a(new dva.d(acih, achi.f));
                    }
                    return;
                }
                CameraFragmentImpl.this.F = false;
            }

            public final void c(achi<zjm, zjk> achi) {
                if (CameraFragmentImpl.this.E) {
                    acih acih = achi.m;
                    if (CameraFragmentImpl.this.a(achi.e)) {
                        CameraFragmentImpl.this.a(new dva.a(acih));
                        CameraFragmentImpl.this.c(acih);
                        return;
                    }
                    if (CameraFragmentImpl.this.a(achi.f)) {
                        CameraFragmentImpl.this.a(new dva.d(acih, achi.e));
                    }
                    return;
                }
                CameraFragmentImpl.this.F = false;
            }
        };
        this.e.a(this.P);
        return this.R;
    }

    /* JADX WARNING: Missing block: B:3:0x0037, code skipped:
            if (r0 != 2) goto L_0x004b;
     */
    public void onDestroyView() {
        /*
        r2 = this;
        super.onDestroyView();
        r0 = defpackage.dnh.f;
        r1 = "CameraFragment";
        r0 = r0.callsite(r1);
        r1 = "onDestroyView";
        r0.a(r1);
        r2.i();
        r0 = r2.v;
        r1 = defpackage.ajxw.a;
        r0.a(r1);
        r0 = r2.a;
        r1 = r2.V;
        r0 = r0.a;
        r0.remove(r1);
        r0 = com.snap.camera.fragment.CameraFragmentImpl.AnonymousClass3.a;
        r1 = r2.I;
        r1 = r1.p();
        r1 = (defpackage.duz) r1;
        r1 = r1.ordinal();
        r0 = r0[r1];
        r1 = 1;
        if (r0 == r1) goto L_0x003a;
    L_0x0036:
        r1 = 2;
        if (r0 == r1) goto L_0x0043;
    L_0x0039:
        goto L_0x004b;
    L_0x003a:
        r0 = new dva$c;
        r1 = 0;
        r0.<init>(r1);
        r2.a(r0);
    L_0x0043:
        r0 = new dva$d;
        r0.<init>();
        r2.a(r0);
    L_0x004b:
        r0 = r2.e;
        r1 = r2.P;
        r0.b(r1);
        r0 = 0;
        r2.P = r0;
        r1 = r2.J;
        r1.a();
        r2.O = r0;
        r2.W = r0;
        r2.X = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.camera.fragment.CameraFragmentImpl.onDestroyView():void");
    }

    public void onPause() {
        if (j()) {
            a(new dva.c((byte) 0));
            a(new dva.d());
        }
        super.onPause();
        this.E = false;
    }

    public void onResume() {
        super.onResume();
        if (this.D.h()) {
            this.o.a(this.H.a((ajfl) -$$Lambda$CameraFragmentImpl$dgUSYWvp3fJBOB4D4ApekQI9ILs.INSTANCE).d().f(-$$Lambda$CameraFragmentImpl$KvNYZIb2Ab201wB8wY0fa8uARBI.INSTANCE).a((ajdw) this.G.f()).d(new -$$Lambda$CameraFragmentImpl$RcVVt94Qn6xZcesIIvQ040icP94(this)), b.ON_PAUSE, "CameraFragment");
        }
        if (!this.F && j()) {
            this.u.a((aciv) Objects.requireNonNull(this.e.i()));
            a(new dva.b((byte) 0));
            a(new dva.a((byte) 0));
            f();
        }
        this.E = true;
        this.F = false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ajei ajei = this.J;
        ajej ajei2 = new ajei();
        ajei2.a(this.H.b(dva.b.class).f(new -$$Lambda$CameraFragmentImpl$1TXEvBLtGnIx_TR5KtgiY23rsqg(this)));
        ajei2.a(this.H.a((ajfl) -$$Lambda$CameraFragmentImpl$5DUdqDMtIL8-xKn9oQdIhMSjykw.INSTANCE).c(1).f(new -$$Lambda$CameraFragmentImpl$RW2RhKNNGgcS0YNulvTKJHMRGfA(this)));
        ajei2.a(ajek.a(new -$$Lambda$CameraFragmentImpl$5mcODDJTBHcmjvMMtJjBzMTI49s(this)));
        ajei2.a(this.H.a((ajfl) -$$Lambda$CameraFragmentImpl$V84EcThP7kwlnrn-axjDORdyptE.INSTANCE).f(new -$$Lambda$CameraFragmentImpl$sRGPEzFhyPfYxxNpAHXsDC9lcZ0(this)));
        ajei.a(ajei2);
        this.J.a(this.O.start());
        a(this.L.j(ajfu.a).a(-$$Lambda$CameraFragmentImpl$6mPKjaDRu-KMuDP3r2L41Aj1B6U.INSTANCE).f(new -$$Lambda$CameraFragmentImpl$7PvRX1IVIwiBbAHHIn2zwRsdS6g(this)), ScopedFragment.b.ON_DESTROY_VIEW, "CameraFragment");
        this.h.b(this.D.b());
    }
}
