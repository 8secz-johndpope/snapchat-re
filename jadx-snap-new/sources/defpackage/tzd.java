package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.brightcove.player.event.Event;
import com.google.common.base.Optional;
import com.snap.core.model.StorySnapRecipient;
import com.snap.preview.tools.view.PreviewBottomToolbarView;
import com.snap.preview.tools.view.PreviewVerticalToolbarView;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;
import defpackage.tqd.b;
import defpackage.tqd.c;
import defpackage.tzk.d;
import defpackage.tzk.e;
import defpackage.tzy.n;
import defpackage.tzy.o;
import defpackage.tzy.p;
import defpackage.tzy.w;
import defpackage.uai.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: tzd */
public final class tzd implements tpw {
    final tpl A;
    final aipn<txi> B;
    final aipn<tzy> C;
    final aipn<tvp> D;
    final ajdv<uaq> E;
    final twz F;
    final tvd G;
    final ajwy<tof> H;
    final ajwy<twd> I;
    final ajwy<achb<zjm, zjk>> J;
    final tpj K;
    private final String L = "ToolsActivator";
    private final ajxe M = ajxh.a(new s(this));
    private final ajxe N = ajxh.a(new m(this));
    private final ajxe O = ajxh.a(new c(this));
    private final ajxe P;
    private Map<String, tzj> Q;
    private zfw R;
    private final tpy S;
    private final List<String> T;
    private final ajdv<MotionEvent> U;
    private final ajdp<tzk> V;
    private final zkq W;
    private final tvq X;
    private final ViewFinder Y;
    private final tos Z;
    final ajei a = new ajei();
    private final uap aa;
    private final zgb ab;
    private final toc ac;
    final Map<String, ajei> b = new LinkedHashMap();
    final ajxe c = ajxh.a(new g(this));
    final ajxe<tzy> d = ajxh.a(new n(this));
    final ajxe e;
    uaa f;
    idd g;
    final aipn<Map<String, tzm>> h;
    final ajdv<tpd> i;
    final ajdp<MotionEvent> j;
    final ajdp<tpk> k;
    final ajdv<Boolean> l;
    final ajdp<Boolean> m;
    final ajdv<Boolean> n;
    final ajdp<ajxw> o;
    final ajdv<Boolean> p;
    final ajdv<Boolean> q;
    final ajdv<ajxw> r;
    final ajdv<Boolean> s;
    final ajdv<Integer> t;
    final tzg u;
    final ajdp<tqd> v;
    final ajdv<tqd> w;
    final ajdv<tzk> x;
    final Activity y;
    final zkf z;

    /* renamed from: tzd$f */
    public static final class f implements tzn {
        private final ajdp<aesf> a;
        private final ajdp<Set<String>> b;
        private /* synthetic */ tzd c;
        private /* synthetic */ ajfb d;
        private /* synthetic */ PreviewBottomToolbarView e;
        private /* synthetic */ PreviewVerticalToolbarView f;
        private /* synthetic */ FrameLayout g;

        f(tzd tzd, ajfb ajfb, PreviewBottomToolbarView previewBottomToolbarView, PreviewVerticalToolbarView previewVerticalToolbarView, FrameLayout frameLayout) {
            this.c = tzd;
            this.d = ajfb;
            this.e = previewBottomToolbarView;
            this.f = previewVerticalToolbarView;
            this.g = frameLayout;
            this.a = ((txi) tzd.N.b()).p();
            this.b = tzd.u.a();
        }

        public final ajfb<tzo> a() {
            return this.d;
        }

        public final tzp b() {
            return this.e;
        }

        public final tzp c() {
            return this.f;
        }

        public final FrameLayout d() {
            return this.g;
        }

        public final tpj e() {
            return this.c.K;
        }

        public final tpl f() {
            return this.c.A;
        }

        public final ajdp<MotionEvent> g() {
            return this.c.j;
        }

        public final ajdp<aesf> h() {
            return this.a;
        }

        public final ajdp<Set<String>> i() {
            return this.b;
        }
    }

    /* renamed from: tzd$e */
    public static final class e implements uaa {
        final /* synthetic */ tzd a;
        private final Map<String, ajei> b;
        private /* synthetic */ FrameLayout c;
        private /* synthetic */ FrameLayout d;
        private /* synthetic */ PreviewVerticalToolbarView e;
        private /* synthetic */ PreviewBottomToolbarView f;
        private /* synthetic */ FrameLayout g;
        private /* synthetic */ tyy h;

        /* renamed from: tzd$e$a */
        static final class a<T> implements ajfb<tqd> {
            private /* synthetic */ e a;

            a(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                tqd tqd = (tqd) obj;
                boolean z = true;
                txi e;
                if (tqd instanceof c) {
                    e = ((txi) this.a.a.N.b());
                    defpackage.acak.a aVar = ((c) tqd).a;
                    String str = "soundToolType";
                    akcr.b(aVar, str);
                    txs a = e.a();
                    akcr.b(aVar, str);
                    a.b.set(a.b(aVar));
                    if (aVar == defpackage.acak.a.MUTED) {
                        z = false;
                    }
                    e.a(z);
                } else if (tqd instanceof defpackage.tqd.a) {
                    e = ((txi) this.a.a.N.b());
                    tpz tpz = ((defpackage.tqd.a) tqd).a;
                    akcr.b(tpz, "mediaTransformData");
                    e.f().a(tpz.a, tpz.b, tpz.c, tpz.d, tpz.d, tpz.e, tpz.f);
                    if (e.x != null) {
                        ofs ofs = e.x;
                        if (ofs == null) {
                            akcr.a("splitRenderPassController");
                        }
                        ofs.b();
                    }
                } else {
                    if ((tqd instanceof b) && tpt.b(this.a.a.A)) {
                        int i = tze.a[((b) tqd).a.ordinal()];
                        if (i == 1) {
                            ((txi) this.a.a.N.b()).o();
                        } else if (i == 2) {
                            ((txi) this.a.a.N.b()).n();
                        }
                    }
                }
            }
        }

        e(tzd tzd, FrameLayout frameLayout, FrameLayout frameLayout2, PreviewVerticalToolbarView previewVerticalToolbarView, PreviewBottomToolbarView previewBottomToolbarView, FrameLayout frameLayout3, tyy tyy) {
            this.a = tzd;
            this.c = frameLayout;
            this.d = frameLayout2;
            this.e = previewVerticalToolbarView;
            this.f = previewBottomToolbarView;
            this.g = frameLayout3;
            this.h = tyy;
            this.b = tzd.b;
        }

        public final ajdp<txr> A() {
            return ((txi) this.a.N.b()).h().a();
        }

        public final ajdp<txr> B() {
            return ((txi) this.a.N.b()).j().a();
        }

        public final ajdp<MotionEvent> C() {
            return this.a.j;
        }

        public final Map<String, tzj> a() {
            return tzd.b(this.a);
        }

        public final void a(ajdx<List<abyi>> ajdx, abll abll) {
            akcr.b(ajdx, "mediaPackages");
            akcr.b(abll, "timer");
            iip e = ((tof) this.a.H.get()).e();
            this.a.z.a().a(new tqg(ajdx, e.b, e.c, abll));
        }

        public final void a(ajdx<List<abyi>> ajdx, List<StorySnapRecipient> list) {
            akcr.b(ajdx, "mediaPackages");
            akcr.b(list, "storyRecipients");
            iip e = ((tof) this.a.H.get()).e();
            this.a.z.a().a(new tqe(ajdx, list, e.b, e.c));
        }

        public final void a(uaj uaj, boolean z, a aVar) {
            akcr.b(uaj, "tooltipType");
            this.a.E.a((Object) new uak(uaj, z, null, aVar, false, 20));
        }

        public final ajdv<Boolean> b() {
            return this.a.l;
        }

        public final ajdv<Boolean> c() {
            return this.a.n;
        }

        public final ajdp<Boolean> d() {
            return this.a.m;
        }

        public final ajdp<ajxw> e() {
            return this.a.o;
        }

        public final ajdv<tpd> f() {
            return this.a.i;
        }

        public final ajdv<Boolean> g() {
            return this.a.p;
        }

        public final ajdv<Boolean> h() {
            return this.a.q;
        }

        public final ajdv<ajxw> i() {
            return this.a.r;
        }

        public final ajdv<Boolean> j() {
            return this.a.s;
        }

        public final ajdv<Integer> k() {
            return this.a.t;
        }

        public final ajdp<tqd> l() {
            return this.a.v;
        }

        public final ajdv<tqd> m() {
            return this.a.w;
        }

        public final ajdv<tzk> n() {
            return this.a.x;
        }

        public final ajfb<tqd> o() {
            return new a(this);
        }

        public final ajdp<aesf> p() {
            return ((txi) this.a.N.b()).p();
        }

        public final tzg q() {
            return this.a.u;
        }

        public final FrameLayout r() {
            return this.c;
        }

        public final FrameLayout s() {
            return this.d;
        }

        public final PreviewVerticalToolbarView t() {
            return this.e;
        }

        public final PreviewBottomToolbarView u() {
            return this.f;
        }

        public final FrameLayout v() {
            return this.g;
        }

        public final ajdp<tpk> w() {
            return this.a.k;
        }

        public final Map<String, ajei> x() {
            return this.b;
        }

        public final void y() {
            this.a.E.a(new uaf());
        }

        public final tyy z() {
            return this.h;
        }
    }

    /* renamed from: tzd$s */
    static final class s extends akcs implements akbk<Map<String, ? extends tzm>> {
        private /* synthetic */ tzd a;

        s(tzd tzd) {
            this.a = tzd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Map) this.a.h.get();
        }
    }

    /* renamed from: tzd$g */
    static final class g extends akcs implements akbk<tvp> {
        private /* synthetic */ tzd a;

        g(tzd tzd) {
            this.a = tzd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tvp) this.a.D.get();
        }
    }

    /* renamed from: tzd$m */
    static final class m extends akcs implements akbk<txi> {
        private /* synthetic */ tzd a;

        m(tzd tzd) {
            this.a = tzd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (txi) this.a.B.get();
        }
    }

    /* renamed from: tzd$n */
    static final class n extends akcs implements akbk<tzy> {
        private /* synthetic */ tzd a;

        /* renamed from: tzd$n$a */
        static final class a implements ajev {
            private /* synthetic */ tzy a;
            private /* synthetic */ n b;

            a(tzy tzy, n nVar) {
                this.a = tzy;
                this.b = nVar;
            }

            public final void run() {
                this.a.dropTarget();
            }
        }

        n(tzd tzd) {
            this.a = tzd;
            super(0);
        }

        private tzy a() {
            tzy tzy = (tzy) this.a.C.get();
            uaa uaa = this.a.f;
            if (uaa == null) {
                akcr.a("previewToolbarPresenterTarget");
            }
            tzy.takeTarget(uaa);
            this.a.a.a(ajek.a((ajev) new a(tzy, this)));
            return tzy;
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    /* renamed from: tzd$c */
    static final class c extends akcs implements akbk<tof> {
        private /* synthetic */ tzd a;

        c(tzd tzd) {
            this.a = tzd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tof) this.a.H.get();
        }
    }

    /* renamed from: tzd$d */
    static final class d extends akcs implements akbk<tyx> {
        private /* synthetic */ aipn a;

        d(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tyx) this.a.get();
        }
    }

    /* renamed from: tzd$a */
    static final class a<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.bottomMargin = rect.bottom;
            this.a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: tzd$b */
    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: tzd$t */
    static final class t<T> implements ajfb<Rect> {
        private /* synthetic */ FrameLayout a;

        t(FrameLayout frameLayout) {
            this.a = frameLayout;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = rect.bottom;
                marginLayoutParams.topMargin = rect.top;
                this.a.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: tzd$r */
    static final class r<T> implements ajfb<tzo> {
        private /* synthetic */ tzd a;

        r(tzd tzd) {
            this.a = tzd;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (tzo) obj;
            twd.a((twd) this.a.I.get(), twb.TOGGLE_PREVIEW_TOOL_GESTURE, new akbl<ily, ilz>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    ily ily = (ily) obj;
                    akcr.b(ily, "metricBase");
                    return ily.a(twc.TOOL_TYPE.name(), obj.a.a()).a(twc.IS_ENTERING.name(), true);
                }
            }, 2);
            tzy a = ((tzy) this.a.P.b());
            akcr.a(obj, "it");
            a.onToolIconClicked(obj);
        }
    }

    /* renamed from: tzd$p */
    public static final class p implements uan {
        private /* synthetic */ tzd a;

        p(tzd tzd) {
            this.a = tzd;
        }

        public final View a(String str) {
            akcr.b(str, "toolId");
            tzj tzj = (tzj) tzd.b(this.a).get(str);
            return tzj != null ? tzj.b : null;
        }
    }

    /* renamed from: tzd$q */
    public static final class q implements toq {
        private /* synthetic */ tzd a;

        q(tzd tzd) {
            this.a = tzd;
        }

        public final boolean a() {
            ((tof) this.a.O.b()).a(aauu.SYSTEM_BACK);
            String str = "previewMetricsPluginProvider.get()";
            String str2 = "activity.baseContext";
            String str3 = "analyticsComposer";
            Object obj;
            if (this.a.d.a()) {
                tzy a = ((tzy) this.a.P.b());
                String a2 = a.i().a();
                if (a2 != null) {
                    if (!a.b(a2).m()) {
                        tzy.a(a, a2, null, false, true, 6);
                        a.g().a(null);
                        ((twd) a.h.get()).a(twb.EXIT_PREVIEW_GESTURE);
                    }
                    return true;
                }
                obj = (uaa) a.getTarget();
                if (obj != null) {
                    akcr.a(obj, "getTarget() ?: return false");
                    if (a.a == abbd.CAMERA) {
                        Object g = a.g();
                        akcr.a(g, str3);
                        if (tzy.a.a(g, a.d.e().a, a.f)) {
                            g = a.b.getBaseContext();
                            akcr.a(g, str2);
                            Object e = a.e();
                            akcr.a(e, "navigationHost");
                            ajdv i = obj.i();
                            Object g2 = a.g();
                            akcr.a(g2, str3);
                            Object obj2 = a.h.get();
                            akcr.a(obj2, str);
                            return tzy.a.a(g, e, i, g2, (twd) obj2, a.d.e(), a.d.c());
                        }
                    }
                    if ((a.a == abbd.GALLERY || a.a == abbd.CAMERA_ROLL) && a.d().hasTarget() && a.d().b) {
                        zjm zjm = new zjm(toc.d, "PreviewToolbarPresenter", false, false, true, false, null, false, false, false, false, null, 4076);
                        achb e2 = a.e();
                        obj = a.b.getBaseContext();
                        akcr.a(obj, str2);
                        akcr.a((Object) e2, "it");
                        zgy a3 = zgy.a.a(new zgy.a(obj, e2, zjm, false, null, 24).b((int) R.string.gallery_save_changes_title).a((int) R.string.gallery_save_changes_option_copy, (akbl) new n(a, zjm), false).a((int) R.string.gallery_save_changes_option_discard, (akbl) new o(a, zjm), false), (akbl) new p(a, zjm), false, null, null, null, 30).a();
                        e2.a((achd) a3, a3.a, null);
                        return true;
                    }
                }
                return false;
            }
            Object c = ((tof) this.a.O.b());
            akcr.a(c, str3);
            if (!tzy.a.a(c, this.a.A.a, null)) {
                return false;
            }
            obj = this.a.y.getBaseContext();
            akcr.a(obj, str2);
            c = this.a.J.get();
            akcr.a(c, "navigationHostProvider.get()");
            achb achb = (achb) c;
            ajdv ajdv = this.a.r;
            Object c2 = ((tof) this.a.O.b());
            akcr.a(c2, str3);
            c = this.a.I.get();
            akcr.a(c, str);
            tzy.a.a(obj, achb, ajdv, c2, (twd) c, this.a.A, this.a.G.c());
            return true;
        }
    }

    /* renamed from: tzd$o */
    static final class o<T> implements ajfb<tzk> {
        private /* synthetic */ tzd a;

        o(tzd tzd) {
            this.a = tzd;
        }

        public final /* synthetic */ void accept(Object obj) {
            tzk tzk = (tzk) obj;
            zin a;
            tzy a2;
            if (tzk instanceof tzk.c) {
                a = ((tzy) this.a.P.b()).a(tzk.a);
                if (a != null) {
                    a.a();
                }
            } else if (tzk instanceof tzk.b) {
                a = ((tzy) this.a.P.b()).a(tzk.a);
                if (a != null) {
                    a.b();
                }
            } else if (tzk instanceof e) {
                a2 = ((tzy) this.a.P.b());
                e eVar = (e) tzk;
                uaj uaj = eVar.b;
                boolean z = eVar.d;
                a aVar = eVar.c;
                akcr.b(uaj, "tooltipType");
                uaa uaa = (uaa) a2.getTarget();
                if (uaa != null) {
                    uaa.a(uaj, z, aVar);
                }
            } else if (tzk instanceof d) {
                uaa uaa2 = (uaa) ((tzy) this.a.P.b()).getTarget();
                if (uaa2 != null) {
                    uaa2.y();
                }
            } else {
                if (tzk instanceof tzk.a) {
                    a2 = ((tzy) this.a.P.b());
                    tzk.a aVar2 = (tzk.a) tzk;
                    akbw akbw = aVar2.b;
                    int i = aVar2.c;
                    String str = "predicate";
                    akcr.b(akbw, str);
                    tzq a3 = a2.a();
                    akcr.b(akbw, str);
                    Collection arrayList = new ArrayList();
                    for (Object next : a3.b.a().values()) {
                        if (((tza) next).a()) {
                            arrayList.add(next);
                        }
                    }
                    Collection arrayList2 = new ArrayList();
                    for (tza b : (List) arrayList) {
                        tyw b2 = b.b();
                        if (!(b2 instanceof tpb)) {
                            b2 = null;
                        }
                        tpb tpb = (tpb) b2;
                        if (tpb != null) {
                            arrayList2.add(tpb);
                        }
                    }
                    for (tpb a4 : ajyu.m((List) arrayList2)) {
                        a4.a(akbw, i);
                    }
                }
            }
        }
    }

    /* renamed from: tzd$h */
    static final class h<T, R> implements ajfc<T, R> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return (abyi) list.get(0);
        }
    }

    /* renamed from: tzd$i */
    static final class i<T, R> implements ajfc<T, ajdn<? extends R>> {
        final /* synthetic */ tzd a;

        /* renamed from: tzd$i$1 */
        static final class 1<T, R> implements ajfc<T, ajdn<? extends R>> {
            final /* synthetic */ i a;

            /* renamed from: tzd$i$1$a */
            static final class a<T, R> implements ajfc<T, R> {
                private /* synthetic */ abyy a;
                private /* synthetic */ 1 b;
                private /* synthetic */ odx c;

                a(abyy abyy, 1 1, odx odx) {
                    this.a = abyy;
                    this.b = 1;
                    this.c = odx;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    Optional optional = (Optional) obj;
                    akcr.b(optional, "blob");
                    abyy abyy = this.a;
                    ohz ohz = (ohz) optional.orNull();
                    if (ohz != null) {
                        idd idd = this.b.a.a.g;
                        if (idd == null) {
                            akcr.a("attribution");
                        }
                        obj = ohz.a(idd);
                        ajvv.a((ajej) obj, this.b.a.a.a);
                    } else {
                        obj = null;
                    }
                    return ajxs.a(abyy, obj);
                }
            }

            1(i iVar) {
                this.a = iVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                odx odx = (odx) obj;
                akcr.b(odx, "reader");
                abyy c = odx.c();
                String str = null;
                if (c == null) {
                    CharSequence charSequence;
                    Object obj2;
                    abyy.a aVar;
                    tzd tzd = this.a.a;
                    gtt gtt = this.a.a.G.h;
                    String str2 = this.a.a.G.i;
                    Object obj3 = null;
                    if (gtt == null) {
                        charSequence = str2;
                        obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
                        if (obj2 != null) {
                            if (tpn.b(tzd.A)) {
                                aVar = new abyy.a();
                                c = aVar.a();
                            } else {
                                c = null;
                            }
                        }
                    }
                    aVar = new abyy.a();
                    if (gtt != null) {
                        String str3 = gtt.e;
                        if (str3 != null) {
                            str2 = str3;
                        }
                    }
                    charSequence = str2;
                    obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
                    if (obj2 == null) {
                        aVar.a(ajyl.a(new abzg.a().a(str2).a(new acas(0.5d, 0.5d)).b(1.0f).a()));
                    }
                    CharSequence charSequence2 = gtt != null ? gtt.f : null;
                    if (charSequence2 == null || charSequence2.length() == 0) {
                        obj3 = 1;
                    }
                    if (obj3 == null) {
                        abzd.a aVar2 = new abzd.a();
                        if (gtt != null) {
                            str = gtt.f;
                        }
                        aVar.a(new abze(aVar2.a(ajyl.a(new abzf(str))).a()));
                    }
                    if (gtt != null) {
                        acam acam = gtt.d;
                        if (acam != null) {
                            aVar.a(new acan(ajyl.a(acam)));
                        }
                    }
                    c = aVar.a();
                }
                if (c != null) {
                    ajdj h = odx.k().f(new a(c, this, odx)).h();
                    if (h != null) {
                        return h;
                    }
                }
                obj = ajvo.a(ajlu.a);
                akcr.a(obj, "Maybe.empty()");
                return obj;
            }
        }

        i(tzd tzd) {
            this.a = tzd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abyi abyi = (abyi) obj;
            akcr.b(abyi, "mediaPackage");
            return this.a.F.a(abyi).b((ajfc) new 1(this));
        }
    }

    /* renamed from: tzd$j */
    static final class j<T, R> implements ajfc<ajxm<? extends abyy, ? extends ohz>, ajdb> {
        final /* synthetic */ tzd a;

        /* renamed from: tzd$j$a */
        static final class a<T> implements ajfb<Boolean> {
            private /* synthetic */ j a;

            a(j jVar) {
                this.a = jVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.a.a.l.a((Boolean) obj);
            }
        }

        /* renamed from: tzd$j$b */
        static final class b implements ajev {
            private /* synthetic */ j a;
            private /* synthetic */ abyy b;

            b(j jVar, abyy abyy) {
                this.a = jVar;
                this.b = abyy;
            }

            public final void run() {
                this.a.a.l.a(Boolean.FALSE);
                tzy a = ((tzy) this.a.a.P.b());
                zjm zjm = new zjm(toc.d, "PreviewToolbarPresenter", false, false, true, false, null, false, false, false, false, null, 4076);
                achb e = a.e();
                Object baseContext = a.b.getBaseContext();
                akcr.a(baseContext, "activity.baseContext");
                akcr.a((Object) e, "it");
                zgy a2 = new zgy.a(baseContext, e, zjm, false, null, 24).b((int) R.string.edits_not_supported).a((int) R.string.edits_not_supported_dismiss, (akbl) w.a, true).a();
                e.a((achd) a2, a2.a, null);
            }
        }

        /* renamed from: tzd$j$c */
        static final class c<T1, T2, R> implements ajex<String, Boolean, Boolean> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                String str = (String) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                akcr.b(str, "<anonymous parameter 0>");
                return Boolean.valueOf(booleanValue ^ 1);
            }
        }

        /* renamed from: tzd$j$d */
        static final class d<T> implements ajfb<Throwable> {
            public static final d a = new d();

            d() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        j(tzd tzd) {
            this.a = tzd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            abyy abyy = (abyy) ajxm.a;
            final ohz ohz = (ohz) ajxm.b;
            akbl akbl = null;
            twd.a((twd) this.a.I.get(), twb.LOAD_MEMORIES_EDITS_START, null, 6);
            tzy a = ((tzy) this.a.P.b());
            Collection arrayList = new ArrayList();
            for (Object next : tzy.i) {
                if (a.h().keySet().contains((String) next)) {
                    arrayList.add(next);
                }
            }
            for (String a2 : (List) arrayList) {
                a.a(a2);
            }
            for (String a22 : a.h().keySet()) {
                a.a(a22);
            }
            tyx tyx = (tyx) this.a.e.b();
            Map linkedHashMap = new LinkedHashMap();
            Iterator it = tyx.a().a().entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (!(((tza) entry.getValue()).a() && (((tza) entry.getValue()).b() instanceof tpa))) {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Collection arrayList2 = new ArrayList(linkedHashMap.size());
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (true) {
                String str = "null cannot be cast to non-null type com.snap.preview.api.NonPreviewToolbarOverlayEditingTool";
                if (it2.hasNext()) {
                    tyw b = ((tza) ((Entry) it2.next()).getValue()).b();
                    if (b != null) {
                        arrayList2.add((tpa) b);
                    } else {
                        throw new ajxt(str);
                    }
                }
                Iterable iterable = (List) arrayList2;
                arrayList = new ArrayList();
                for (Object next2 : tyx.b()) {
                    if (((tpp) next2) instanceof tpa) {
                        arrayList.add(next2);
                    }
                }
                Iterable<tpp> iterable2 = (List) arrayList;
                Collection arrayList3 = new ArrayList(ajyn.a((Iterable) iterable2, 10));
                for (tpp tpp : iterable2) {
                    if (tpp != null) {
                        arrayList3.add((tpa) tpp);
                    } else {
                        throw new ajxt(str);
                    }
                }
                Set<tpa> m = ajyu.m(ajyu.d(iterable, (Iterable) (List) arrayList3));
                if (m != null) {
                    for (tpa b2 : m) {
                        ajej a3 = ajdp.a((ajdt) b2.b(), (ajdt) this.a.m, (ajex) c.a).a((ajdw) tzd.d(this.a).l()).a((ajfb) new a(this), (ajfb) d.a);
                        akcr.a((Object) a3, "combineLatest(filterTool…                       })");
                        ajvv.a(a3, this.a.a);
                    }
                }
                ajcx f = ((tvp) this.a.c.b()).a(abyy, ohz, true).f(new ajev(this) {
                    private /* synthetic */ j a;

                    public final void run() {
                        ohz ohz = ohz;
                        if (ohz != null) {
                            ohz.dispose();
                        }
                        twd.a((twd) this.a.a.I.get(), twb.LOAD_MEMORIES_EDITS_END, null, 6);
                    }
                });
                abzt a4 = abyy.a();
                if (!(a4 != null ? a4.p() : false)) {
                    a4 = abyy.a();
                    if (a4 != null) {
                        akbl = a4.d();
                    }
                    if (akbl == null && abyy.h() == null && abyy.o() == null && abyy.j() == null && abyy.k() == null) {
                        z = false;
                    }
                }
                return z ? f.a((ajdw) tzd.d(this.a).l()).b((ajdb) ajcx.a((ajev) new b(this, abyy))) : f;
            }
        }
    }

    /* renamed from: tzd$k */
    static final class k implements ajev {
        public static final k a = new k();

        k() {
        }

        public final void run() {
        }
    }

    /* renamed from: tzd$l */
    static final class l<T> implements ajfb<Throwable> {
        public static final l a = new l();

        l() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tzd.class), "toolIconActivators", "getToolIconActivators()Ljava/util/Map;"), new akdc(akde.a(tzd.class), "editsComposer", "getEditsComposer()Lcom/snap/preview/edits/EditsComposer;"), new akdc(akde.a(tzd.class), "previewMediaPlayer", "getPreviewMediaPlayer()Lcom/snap/preview/player/PreviewMediaPlayer;"), new akdc(akde.a(tzd.class), "analyticsComposer", "getAnalyticsComposer()Lcom/snap/preview/analytics/AnalyticsComposer;"), new akdc(akde.a(tzd.class), "apiProvider", "getApiProvider()Lcom/snap/preview/tools/PreviewToolApiProvider;"), new akdc(akde.a(tzd.class), "previewToolbarPresenter", "getPreviewToolbarPresenter()Lcom/snap/preview/tools/presenter/PreviewToolbarPresenter;")};
    }

    public tzd(tpy tpy, List<String> list, aipn<Map<String, tzm>> aipn, ajdv<tpd> ajdv, ajdp<MotionEvent> ajdp, ajdv<MotionEvent> ajdv2, ajdp<tpk> ajdp2, ajdv<Boolean> ajdv3, ajdp<Boolean> ajdp3, ajdv<Boolean> ajdv4, ajdp<ajxw> ajdp4, ajdv<Boolean> ajdv5, ajdv<Boolean> ajdv6, ajdv<ajxw> ajdv7, ajdv<Boolean> ajdv8, ajdv<Integer> ajdv9, tzg tzg, ajdp<tqd> ajdp5, ajdv<tqd> ajdv10, ajdp<tzk> ajdp6, ajdv<tzk> ajdv11, Activity activity, zkf zkf, tpl tpl, zkq zkq, tvq tvq, ViewFinder viewFinder, tos tos, uap uap, aipn<txi> aipn2, aipn<tzy> aipn3, aipn<tvp> aipn4, ajdv<uaq> ajdv12, twz twz, zgb zgb, toc toc, tvd tvd, ajwy<tof> ajwy, ajwy<twd> ajwy2, ajwy<achb<zjm, zjk>> ajwy3, tpj tpj, aipn<tyx> aipn5) {
        tpy tpy2 = tpy;
        List<String> list2 = list;
        aipn<Map<String, tzm>> aipn6 = aipn;
        ajdv<tpd> ajdv13 = ajdv;
        ajdp<MotionEvent> ajdp7 = ajdp;
        ajdv<MotionEvent> ajdv14 = ajdv2;
        ajdp<tpk> ajdp8 = ajdp2;
        ajdv<Boolean> ajdv15 = ajdv3;
        ajdp<Boolean> ajdp9 = ajdp3;
        ajdv<Boolean> ajdv16 = ajdv4;
        ajdp<ajxw> ajdp10 = ajdp4;
        ajdv<Boolean> ajdv17 = ajdv5;
        ajdv<Boolean> ajdv18 = ajdv6;
        ajdv<ajxw> ajdv19 = ajdv7;
        ajdv<Boolean> ajdv20 = ajdv8;
        ajdv<Integer> ajdv21 = ajdv9;
        akcr.b(tpy2, "previewToolInflator");
        akcr.b(list2, "toolButtonOrder");
        akcr.b(aipn6, "toolIconActivatorsLazy");
        akcr.b(ajdv13, "previewControlEventObserver");
        akcr.b(ajdp7, "gestureEventObservable");
        akcr.b(ajdv14, "gestureEventObserver");
        akcr.b(ajdp8, "sendToDataObservable");
        akcr.b(ajdv15, "showDiscardHintObserver");
        akcr.b(ajdp9, "isEditingObservable");
        akcr.b(ajdv16, "isEditingObserver");
        akcr.b(ajdp10, "appIsPausedObservable");
        akcr.b(ajdv17, "hideSendButtonEventObserver");
        akcr.b(ajdv18, "hideSendAndDiscardButtonsEventObserver");
        akcr.b(ajdv19, "exitPreviewRequestObserver");
        akcr.b(ajdv20, "blockPreviewExitObserver");
        akcr.b(ajdv9, "statusAndNavBarVisibilityChangeObserver");
        akcr.b(tzg, "currentEditingToolManager");
        akcr.b(ajdp5, "mediaPlayerEventObservable");
        akcr.b(ajdv10, "mediaPlayerEventObserver");
        akcr.b(ajdp6, "overlayEventObservable");
        akcr.b(ajdv11, "overlayEventObserver");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(zkf, "eventBus");
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(zkq, "insetsDetector");
        akcr.b(tvq, "editsContainerConfigProvider");
        akcr.b(viewFinder, "viewFinder");
        akcr.b(tos, "backPressHandlerRegister");
        akcr.b(uap, "tooltipViewProviderRegister");
        akcr.b(aipn2, "previewMediaPlayerLazy");
        akcr.b(aipn3, "previewToolbarPresenterLazy");
        akcr.b(aipn4, "editsComposerLazy");
        akcr.b(ajdv12, "tooltipVisibilityObserver");
        akcr.b(twz, "previewMediaReaderManager");
        akcr.b(zgb, "schedulerProvider");
        akcr.b(toc, "previewFeature");
        akcr.b(tvd, "previewDataSource");
        akcr.b(ajwy, "analyticsComposerProvider");
        akcr.b(ajwy2, "previewMetricsPluginProvider");
        akcr.b(ajwy3, "navigationHostProvider");
        akcr.b(tpj, "previewPreloadedConfigs");
        akcr.b(aipn5, "apiProviderLazy");
        ajdv<Integer> ajdv22 = ajdv9;
        this.S = tpy2;
        this.T = list2;
        this.h = aipn6;
        this.i = ajdv13;
        this.j = ajdp7;
        this.U = ajdv14;
        this.k = ajdp8;
        this.l = ajdv15;
        this.m = ajdp9;
        this.n = ajdv16;
        this.o = ajdp10;
        this.p = ajdv17;
        this.q = ajdv18;
        this.r = ajdv19;
        this.s = ajdv8;
        this.t = ajdv22;
        ajdp<tqd> ajdp11 = ajdp5;
        this.u = tzg;
        this.v = ajdp11;
        ajdp<tzk> ajdp12 = ajdp6;
        this.w = ajdv10;
        this.V = ajdp12;
        Activity activity2 = activity;
        this.x = ajdv11;
        this.y = activity2;
        tpl tpl2 = tpl;
        this.z = zkf;
        this.A = tpl2;
        tvq tvq2 = tvq;
        this.W = zkq;
        this.X = tvq2;
        tos tos2 = tos;
        this.Y = viewFinder;
        this.Z = tos2;
        aipn<txi> aipn7 = aipn2;
        this.aa = uap;
        this.B = aipn7;
        aipn<tvp> aipn8 = aipn4;
        this.C = aipn3;
        this.D = aipn8;
        twz twz2 = twz;
        this.E = ajdv12;
        this.F = twz2;
        toc toc2 = toc;
        this.ab = zgb;
        this.ac = toc2;
        ajwy<tof> ajwy4 = ajwy;
        this.G = tvd;
        this.H = ajwy4;
        ajwy<achb<zjm, zjk>> ajwy5 = ajwy3;
        this.I = ajwy2;
        this.J = ajwy5;
        aipn<tyx> aipn9 = aipn5;
        this.K = tpj;
        this.e = ajxh.a(new d(aipn9));
        this.P = this.d;
    }

    private final Map<String, tzm> b() {
        return (Map) this.M.b();
    }

    public static final /* synthetic */ Map b(tzd tzd) {
        Map map = tzd.Q;
        if (map == null) {
            akcr.a("loadedToolsMapForActivation");
        }
        return map;
    }

    public static final /* synthetic */ zfw d(tzd tzd) {
        zfw zfw = tzd.R;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        return zfw;
    }

    public final String a() {
        return this.L;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:105:0x037b in {2, 5, 12, 15, 20, 22, 25, 34, 35, 36, 42, 43, 45, 51, 52, 59, 61, 67, 68, 70, 76, 77, 81, 86, 89, 92, 94, 96, 98, 100, 102, 104} preds:[]
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
    public final defpackage.ajej start() {
        /*
        r13 = this;
        r0 = r13.ac;
        r1 = "ToolsActivator";
        r0 = r0.callsite(r1);
        r13.g = r0;
        r0 = r13.g;
        if (r0 != 0) goto L_0x0013;
        r1 = "attribution";
        defpackage.akcr.a(r1);
        r0 = defpackage.zgb.a(r0);
        r13.R = r0;
        r0 = r13.Y;
        r1 = 2131430715; // 0x7f0b0d3b float:1.8483139E38 double:1.053066693E-314;
        r0 = r0.findViewById(r1);
        if (r0 != 0) goto L_0x0027;
        defpackage.akcr.a();
        r1 = "viewFinder.findViewById<…t>(R.id.tool_container)!!";
        defpackage.akcr.a(r0, r1);
        r4 = r0;
        r4 = (android.widget.FrameLayout) r4;
        r0 = r13.S;
        r1 = 2131559165; // 0x7f0d02fd float:1.8743666E38 double:1.0531301555E-314;
        r0 = r0.a(r1);
        if (r0 == 0) goto L_0x0373;
        r0 = (com.snap.preview.tools.view.PreviewBottomToolbarView) r0;
        r1 = r13.S;
        r2 = 2131559176; // 0x7f0d0308 float:1.8743689E38 double:1.053130161E-314;
        r1 = r1.a(r2);
        if (r1 == 0) goto L_0x036b;
        r1 = (com.snap.preview.tools.view.PreviewVerticalToolbarView) r1;
        r2 = r13.Y;
        r3 = 2131428319; // 0x7f0b03df float:1.847828E38 double:1.053065509E-314;
        r2 = r2.findViewById(r3);
        if (r2 != 0) goto L_0x0057;
        defpackage.akcr.a();
        r3 = "viewFinder.findViewById<…>(R.id.edits_container)!!";
        defpackage.akcr.a(r2, r3);
        r5 = r2;
        r5 = (android.widget.FrameLayout) r5;
        r2 = r5;
        r2 = (android.view.View) r2;
        r3 = r13.X;
        r3 = r3.a;
        r6 = r13.R;
        r11 = "schedulers";
        if (r6 != 0) goto L_0x006f;
        defpackage.akcr.a(r11);
        r6 = r6.l();
        r6 = (defpackage.zfr) r6;
        r6 = (defpackage.ajdw) r6;
        r3 = r3.a(r6);
        r6 = new tzd$a;
        r6.<init>(r2);
        r6 = (defpackage.ajfb) r6;
        r7 = defpackage.tzd.b.a;
        r7 = (defpackage.ajfb) r7;
        r3 = r3.a(r6, r7);
        r6 = "editsContainerConfigProv…vice\")\n                })";
        defpackage.akcr.a(r3, r6);
        r6 = r13.a;
        defpackage.ajvv.a(r3, r6);
        r3 = r1;
        r3 = (android.view.View) r3;
        r4.addView(r3);
        r3 = r0;
        r3 = (android.view.View) r3;
        r4.addView(r3);
        r2 = defpackage.cfl.f(r2);
        r3 = r13.U;
        r2.a(r3);
        r2 = r13.A;
        r2 = defpackage.tpn.c(r2);
        r3 = 2131167559; // 0x7f070947 float:1.7949395E38 double:1.0529366764E-314;
        r6 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
        if (r2 == 0) goto L_0x00d2;
        r2 = r0.getLayoutParams();
        if (r2 == 0) goto L_0x00cc;
        r2 = (android.view.ViewGroup.MarginLayoutParams) r2;
        r7 = r2.bottomMargin;
        r8 = r0.getResources();
        r8 = r8.getDimensionPixelSize(r3);
        r7 = r7 + r8;
        r2.bottomMargin = r7;
        goto L_0x00d2;
        r0 = new ajxt;
        r0.<init>(r6);
        throw r0;
        r2 = r13.K;
        r2 = r2.a();
        if (r2 != 0) goto L_0x00dd;
        r2 = 0;
        r10 = r2;
        goto L_0x0142;
        r2 = r4.getResources();
        r7 = r0.getLayoutParams();
        if (r7 == 0) goto L_0x0365;
        r7 = (android.view.ViewGroup.MarginLayoutParams) r7;
        r8 = r7.bottomMargin;
        r9 = 2131165541; // 0x7f070165 float:1.7945302E38 double:1.0529356794E-314;
        r9 = r2.getDimensionPixelSize(r9);
        r8 = r8 + r9;
        r7.bottomMargin = r8;
        r7 = r13.S;
        r8 = 2131559166; // 0x7f0d02fe float:1.8743668E38 double:1.053130156E-314;
        r7 = r7.a(r8);
        if (r7 == 0) goto L_0x035d;
        r7 = (android.widget.FrameLayout) r7;
        r8 = r7.getLayoutParams();
        if (r8 == 0) goto L_0x0357;
        r8 = (android.view.ViewGroup.MarginLayoutParams) r8;
        r6 = 2131165542; // 0x7f070166 float:1.7945304E38 double:1.05293568E-314;
        r6 = r2.getDimensionPixelSize(r6);
        r9 = r13.A;
        r9 = defpackage.tpn.c(r9);
        if (r9 == 0) goto L_0x012c;
        r9 = r8.bottomMargin;
        r2 = r2.getDimensionPixelSize(r3);
        r9 = r9 + r2;
        r8.bottomMargin = r9;
        r2 = r7;
        r2 = (android.view.View) r2;
        defpackage.iho.b(r2, r6);
        defpackage.iho.d(r2, r6);
        goto L_0x013b;
        r3 = 2131167738; // 0x7f0709fa float:1.7949758E38 double:1.052936765E-314;
        r2 = r2.getDimensionPixelSize(r3);
        r8.rightMargin = r2;
        r2 = r7;
        r2 = (android.view.View) r2;
        defpackage.iho.b(r2, r6);
        r2 = r7;
        r2 = (android.view.View) r2;
        r4.addView(r2);
        r10 = r7;
        r2 = "toolContainer";
        defpackage.akcr.b(r4, r2);
        r2 = r13.W;
        r2 = r2.a();
        r3 = new tzd$t;
        r3.<init>(r4);
        r3 = (defpackage.ajfb) r3;
        r2 = r2.f(r3);
        r3 = "insetsDetector.windowRec…toolContainerLp\n        }";
        defpackage.akcr.a(r2, r3);
        r3 = r13.a;
        defpackage.ajvv.a(r2, r3);
        r9 = new tyy;
        r2 = r13.A;
        r3 = r13.K;
        r9.<init>(r2, r3);
        r12 = new tzd$e;
        r2 = r12;
        r3 = r13;
        r6 = r1;
        r7 = r0;
        r8 = r10;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9);
        r12 = (defpackage.uaa) r12;
        r13.f = r12;
        r2 = new tzd$r;
        r2.<init>(r13);
        r7 = r2;
        r7 = (defpackage.ajfb) r7;
        r2 = new tzd$f;
        r5 = r2;
        r6 = r13;
        r8 = r0;
        r9 = r1;
        r5.<init>(r6, r7, r8, r9, r10);
        r2 = (defpackage.tzn) r2;
        r0 = r13.T;
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r3 = r0.hasNext();
        r4 = 1;
        r5 = 0;
        if (r3 == 0) goto L_0x01bc;
        r3 = r0.next();
        r6 = r3;
        r6 = (java.lang.String) r6;
        r7 = r13.b();
        r6 = r7.get(r6);
        if (r6 == 0) goto L_0x01b5;
        goto L_0x01b6;
        r4 = 0;
        if (r4 == 0) goto L_0x019b;
        r1.add(r3);
        goto L_0x019b;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = new java.util.ArrayList;
        r3 = 10;
        r6 = defpackage.ajyn.a(r1, r3);
        r0.<init>(r6);
        r0 = (java.util.Collection) r0;
        r1 = r1.iterator();
        r6 = r1.hasNext();
        if (r6 == 0) goto L_0x01f0;
        r6 = r1.next();
        r6 = (java.lang.String) r6;
        r7 = r13.b();
        r6 = r7.get(r6);
        if (r6 != 0) goto L_0x01ea;
        defpackage.akcr.a();
        r6 = (defpackage.tzm) r6;
        r0.add(r6);
        goto L_0x01d1;
        r0 = (java.util.List) r0;
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r6 = defpackage.ajyn.a(r0, r3);
        r1.<init>(r6);
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r6 = r0.hasNext();
        if (r6 == 0) goto L_0x022f;
        r6 = r0.next();
        r6 = (defpackage.tzm) r6;
        r7 = new ajei;	 Catch:{ all -> 0x022d }
        r7.<init>();	 Catch:{ all -> 0x022d }
        r8 = r13.b;	 Catch:{ all -> 0x022d }
        r9 = r6.a();	 Catch:{ all -> 0x022d }
        r8.put(r9, r7);	 Catch:{ all -> 0x022d }
        r8 = r6.a();	 Catch:{ all -> 0x022d }
        r6 = r6.a(r2, r7);	 Catch:{ all -> 0x022d }
        r6 = defpackage.ajxs.a(r8, r6);	 Catch:{ all -> 0x022d }
        r1.add(r6);
        goto L_0x0203;
        r0 = move-exception;
        throw r0;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r1 = r1.iterator();
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0258;
        r2 = r1.next();
        r6 = r2;
        r6 = (defpackage.ajxm) r6;
        r6 = r6.b;
        if (r6 == 0) goto L_0x0251;
        r6 = 1;
        goto L_0x0252;
        r6 = 0;
        if (r6 == 0) goto L_0x023e;
        r0.add(r2);
        goto L_0x023e;
        r0 = (java.util.List) r0;
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r2 = defpackage.ajyn.a(r0, r3);
        r1.<init>(r2);
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0288;
        r2 = r0.next();
        r2 = (defpackage.ajxm) r2;
        r4 = r2.a;
        r2 = r2.b;
        if (r2 != 0) goto L_0x0280;
        defpackage.akcr.a();
        r2 = defpackage.ajxs.a(r4, r2);
        r1.add(r2);
        goto L_0x026b;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = defpackage.ajzm.a(r1);
        r13.Q = r0;
        r0 = r13.b;
        r0 = r0.values();
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r2 = defpackage.ajyn.a(r0, r3);
        r1.<init>(r2);
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x02c5;
        r2 = r0.next();
        r2 = (defpackage.ajei) r2;
        r3 = r13.a;
        r2 = (defpackage.ajej) r2;
        r2 = r3.a(r2);
        r2 = java.lang.Boolean.valueOf(r2);
        r1.add(r2);
        goto L_0x02a9;
        r0 = r13.aa;
        r1 = new tzd$p;
        r1.<init>(r13);
        r1 = (defpackage.uan) r1;
        r0.a(r1);
        r0 = r13.Z;
        r1 = new tzd$q;
        r1.<init>(r13);
        r1 = (defpackage.toq) r1;
        r0.a(r1);
        r0 = r13.V;
        r1 = new tzd$o;
        r1.<init>(r13);
        r1 = (defpackage.ajfb) r1;
        r0 = r0.f(r1);
        r1 = "overlayEventObservable.s…)\n            }\n        }";
        defpackage.akcr.a(r0, r1);
        r1 = r13.a;
        defpackage.ajvv.a(r0, r1);
        r0 = r13.G;	 Catch:{ all -> 0x0355 }
        r0 = r0.b;	 Catch:{ all -> 0x0355 }
        r1 = r13.R;	 Catch:{ all -> 0x0355 }
        if (r1 != 0) goto L_0x02ff;	 Catch:{ all -> 0x0355 }
        defpackage.akcr.a(r11);	 Catch:{ all -> 0x0355 }
        r1 = r1.f();	 Catch:{ all -> 0x0355 }
        r1 = (defpackage.ajdw) r1;	 Catch:{ all -> 0x0355 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x0355 }
        r1 = defpackage.tzd.h.a;	 Catch:{ all -> 0x0355 }
        r1 = (defpackage.ajfc) r1;	 Catch:{ all -> 0x0355 }
        r0 = r0.f(r1);	 Catch:{ all -> 0x0355 }
        r1 = new tzd$i;	 Catch:{ all -> 0x0355 }
        r1.<init>(r13);	 Catch:{ all -> 0x0355 }
        r1 = (defpackage.ajfc) r1;	 Catch:{ all -> 0x0355 }
        r0 = r0.b(r1);	 Catch:{ all -> 0x0355 }
        r1 = r13.R;	 Catch:{ all -> 0x0355 }
        if (r1 != 0) goto L_0x0323;	 Catch:{ all -> 0x0355 }
        defpackage.akcr.a(r11);	 Catch:{ all -> 0x0355 }
        r1 = r1.l();	 Catch:{ all -> 0x0355 }
        r1 = (defpackage.zfr) r1;	 Catch:{ all -> 0x0355 }
        r1 = (defpackage.ajdw) r1;	 Catch:{ all -> 0x0355 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x0355 }
        r1 = new tzd$j;	 Catch:{ all -> 0x0355 }
        r1.<init>(r13);	 Catch:{ all -> 0x0355 }
        r1 = (defpackage.ajfc) r1;	 Catch:{ all -> 0x0355 }
        r0 = r0.e(r1);	 Catch:{ all -> 0x0355 }
        r1 = defpackage.tzd.k.a;	 Catch:{ all -> 0x0355 }
        r1 = (defpackage.ajev) r1;	 Catch:{ all -> 0x0355 }
        r2 = defpackage.tzd.l.a;	 Catch:{ all -> 0x0355 }
        r2 = (defpackage.ajfb) r2;	 Catch:{ all -> 0x0355 }
        r0 = r0.a(r1, r2);	 Catch:{ all -> 0x0355 }
        r1 = "previewDataSource.mediaP…age}\")\n                })";	 Catch:{ all -> 0x0355 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0355 }
        r1 = r13.a;	 Catch:{ all -> 0x0355 }
        defpackage.ajvv.a(r0, r1);	 Catch:{ all -> 0x0355 }
        r0 = r13.a;
        r0 = (defpackage.ajej) r0;
        return r0;
        r0 = move-exception;
        throw r0;
        r0 = new ajxt;
        r0.<init>(r6);
        throw r0;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type android.widget.FrameLayout";
        r0.<init>(r1);
        throw r0;
        r0 = new ajxt;
        r0.<init>(r6);
        throw r0;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type com.snap.preview.tools.view.PreviewVerticalToolbarView";
        r0.<init>(r1);
        throw r0;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type com.snap.preview.tools.view.PreviewBottomToolbarView";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzd.start():ajej");
    }
}
