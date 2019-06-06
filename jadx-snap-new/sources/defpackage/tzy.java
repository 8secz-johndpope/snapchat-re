package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.brightcove.player.event.Event;
import com.snap.preview.discard.DiscardBackButtonPresenter;
import com.snap.preview.discard.DiscardBackButtonPresenter.g;
import com.snap.preview.tools.view.PreviewBottomToolbarView;
import com.snap.preview.tools.view.PreviewVerticalToolbarView;
import com.snapchat.android.R;
import defpackage.ebp.d;
import defpackage.tpc.a;
import defpackage.tpc.a.b;
import defpackage.tzk.c;
import defpackage.tzr.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: tzy */
public final class tzy extends zll<uaa> implements tzx {
    public static final List<String> i = ajym.b((Object[]) new String[]{"save_tool", "trash_can"});
    public abbd a;
    public final Activity b;
    final tzt c;
    public final tvd d;
    final toi e;
    public final tpv f;
    final ajwy<tof> g;
    public final ajwy<twd> h;
    private final ajxe j;
    private final ajxe k;
    private final ajxe l = ajxh.a(f.a);
    private final ajxe m;
    private final ajxe n;
    private final ajxe o;
    private final ajxe p;
    private final ajxe q;
    private final ajxe r;
    private zin s;
    private zin t;
    private final ajxe u;
    private final ajxe v;
    private final zkf w;

    /* renamed from: tzy$a */
    public static final class a {

        /* renamed from: tzy$a$a */
        static final class a extends akcs implements akbl<View, ajxw> {
            final /* synthetic */ tof a;
            private /* synthetic */ Context b;
            private /* synthetic */ zjm c;
            private /* synthetic */ twd d;
            private /* synthetic */ ajdv e;
            private /* synthetic */ tpl f;
            private /* synthetic */ int g;

            /* renamed from: tzy$a$a$1 */
            static final class 1 extends akcs implements akbl<ily, ilz> {
                private /* synthetic */ a a;

                1(a aVar) {
                    this.a = aVar;
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    ily ily = (ily) obj;
                    akcr.b(ily, "it");
                    String name = twc.EXIT_TYPE.name();
                    aauu g = this.a.a.g();
                    if (g == null) {
                        g = aauu.OTHER_EXIT_METHOD;
                    }
                    return ily.a(name, (Enum) g);
                }
            }

            a(Context context, zjm zjm, twd twd, tof tof, ajdv ajdv, tpl tpl, int i) {
                this.b = context;
                this.c = zjm;
                this.d = twd;
                this.a = tof;
                this.e = ajdv;
                this.f = tpl;
                this.g = i;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                this.d.a(twb.EXIT_PREVIEW_GESTURE, true, new 1(this));
                this.e.a(ajxw.a);
                return ajxw.a;
            }
        }

        /* renamed from: tzy$a$b */
        static final class b extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ Context a;
            private /* synthetic */ zjm b;
            private /* synthetic */ twd c;
            private /* synthetic */ tof d;
            private /* synthetic */ ajdv e;
            private /* synthetic */ tpl f;
            private /* synthetic */ int g;

            b(Context context, zjm zjm, twd twd, tof tof, ajdv ajdv, tpl tpl, int i) {
                this.a = context;
                this.b = zjm;
                this.c = twd;
                this.d = tof;
                this.e = ajdv;
                this.f = tpl;
                this.g = i;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                this.d.a(null);
                this.c.a(twb.EXIT_PREVIEW_GESTURE);
                return ajxw.a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static boolean a(Context context, achb<zjm, zjk> achb, ajdv<ajxw> ajdv, tof tof, twd twd, tpl tpl, int i) {
            int i2;
            zgy a;
            Context context2 = context;
            achb<zjm, zjk> achb2 = achb;
            tpl tpl2 = tpl;
            akcr.b(context2, "context");
            akcr.b(achb2, "navigationHost");
            akcr.b(ajdv, "exitPreviewRequestObserver");
            akcr.b(tof, "analyticsComposer");
            akcr.b(twd, "previewMetricsPlugin");
            akcr.b(tpl2, "previewStartUpConfig");
            zjm zjm = new zjm(toc.d, "PreviewToolbarPresenter", false, false, true, false, null, false, false, false, false, null, 4076);
            Context context3 = context;
            zjm zjm2 = zjm;
            twd twd2 = twd;
            tof tof2 = tof;
            ajdv<ajxw> ajdv2 = ajdv;
            tpl tpl3 = tpl;
            defpackage.zgy.a a2 = defpackage.zgy.a.a(new defpackage.zgy.a(context3, achb, zjm, false, null, 24).a((int) R.string.discard, (akbl) new a(context3, zjm2, twd2, tof2, ajdv2, tpl3, i), false), (akbl) new b(context3, zjm2, twd2, tof2, ajdv2, tpl3, i), false, null, null, null, 30);
            if (tpl2.a instanceof d) {
                a2.a((int) R.string.batch_capture_discard_alert_title);
                if (i == 1) {
                    i2 = R.string.discard_batch_capture_description_one_snap;
                } else {
                    String string = context2.getString(R.string.discard_batch_capture_description_multiple_snaps, new Object[]{Integer.valueOf(i)});
                    akcr.a((Object) string, "context.getString(R.stri…iple_snaps, numOfSegment)");
                    a2.b(string);
                    a = a2.a();
                    achb2.a((achd) a, a.a, null);
                    return true;
                }
            }
            i2 = R.string.are_you_sure_you_want_to_discard;
            a2.b(i2);
            a = a2.a();
            achb2.a((achd) a, a.a, null);
            return true;
        }

        public static boolean a(tof tof, ebp ebp, tpv tpv) {
            akcr.b(tof, "analyticsComposer");
            akcr.b(ebp, "mediaTypeStartUpConfig");
            tof.f();
            if ((tof.h() ^ 1) != 0) {
                if (!(tof.g() == aauu.SYSTEM_BACK || (tof.g() == aauu.EXIT_BUTTON && (ebp instanceof d)))) {
                    Object obj;
                    if (tpv != null) {
                        int i = 0;
                        for (tvr j : tpv.a(tvr.class)) {
                            i += j.j();
                        }
                        if (i >= 5) {
                            obj = 1;
                            if (obj == null) {
                                return true;
                            }
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: tzy$b */
    static final class b<T> implements ajfb<Boolean> {
        private /* synthetic */ tzy a;
        private /* synthetic */ String b;
        private /* synthetic */ uaa c;

        b(tzy tzy, String str, uaa uaa) {
            this.a = tzy;
            this.b = str;
            this.c = uaa;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.c.b().a((Boolean) obj);
        }
    }

    /* renamed from: tzy$c */
    static final class c<T> implements ajfb<Integer> {
        private /* synthetic */ tzy a;
        private /* synthetic */ String b;
        private /* synthetic */ uaa c;

        c(tzy tzy, String str, uaa uaa) {
            this.a = tzy;
            this.b = str;
            this.c = uaa;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            if (tpt.d(this.c.z().f)) {
                tyb c = this.a.c();
                akcr.a(obj, "timer");
                int intValue = obj.intValue();
                tya g = c.g();
                if (g != null && abyp.b(g.b().e.a())) {
                    g.a((int) TimeUnit.SECONDS.toMillis((long) intValue));
                }
            }
        }
    }

    /* renamed from: tzy$d */
    static final class d<T1, T2, R> implements ajex<String, Boolean, Boolean> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            String str = (String) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            akcr.b(str, "<anonymous parameter 0>");
            return Boolean.valueOf(booleanValue ^ 1);
        }
    }

    /* renamed from: tzy$e */
    static final class e<T> implements ajfb<Throwable> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: tzy$i */
    public static final class i implements tyz {
        private final ajdp<Set<String>> a;
        private /* synthetic */ tzy b;
        private /* synthetic */ FrameLayout c;
        private /* synthetic */ uaa d;

        i(tzy tzy, FrameLayout frameLayout, uaa uaa) {
            this.b = tzy;
            this.c = frameLayout;
            this.d = uaa;
            this.a = uaa.q().a();
        }

        public final FrameLayout a() {
            return this.c;
        }

        public final FrameLayout b() {
            return this.d.r();
        }

        public final tyx c() {
            Object f = this.b.f();
            akcr.a(f, "this@PreviewToolbarPresenter.apiProvider");
            return f;
        }

        public final tyy d() {
            return this.d.z();
        }

        public final toi e() {
            return this.b.e;
        }

        public final ajdv<String> f() {
            Object b = this.b.b();
            akcr.a(b, "activateToolSubject");
            return (ajdv) b;
        }

        public final ajdv<tqd> g() {
            return this.d.m();
        }

        public final ajdv<tzk> h() {
            return this.d.n();
        }

        public final ajdv<Boolean> i() {
            return this.d.j();
        }

        public final ajdp<MotionEvent> j() {
            return this.d.C();
        }

        public final ajdp<tpk> k() {
            return this.d.w();
        }

        public final ajdp<ajxw> l() {
            return this.d.e();
        }

        public final ajdp<Set<String>> m() {
            return this.a;
        }
    }

    /* renamed from: tzy$r */
    static final class r<T1, T2, T3, R> implements ajfd<Integer, Integer, aesf, ajxm<? extends Boolean, ? extends aesf>> {
        public static final r a = new r();

        r() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            aesf aesf = (aesf) obj3;
            akcr.b(aesf, "currentMediaType");
            boolean z = true;
            if (intValue != 1 || intValue2 > 10000 || intValue2 == -1) {
                z = false;
            }
            return ajxs.a(Boolean.valueOf(z), aesf);
        }
    }

    /* renamed from: tzy$s */
    static final class s<T> implements ajfb<ajxm<? extends Boolean, ? extends aesf>> {
        private /* synthetic */ tzy a;

        s(tzy tzy) {
            this.a = tzy;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            tzy tzy = this.a;
            aesf aesf = (aesf) ajxm.b;
            boolean booleanValue = ((Boolean) ajxm.a).booleanValue();
            akcr.b(aesf, "mediaType");
            for (tyw tyw : tzy.f.a(tyw.class)) {
                if (!tyw.l() || booleanValue) {
                    if (tyw.c().contains(tyv.a(aesf))) {
                        if (tyw.c().size() == 1) {
                            tzy.a(tyw, 0);
                        }
                    }
                }
                tzy.a(tyw, 8);
            }
        }
    }

    /* renamed from: tzy$t */
    static final class t<T> implements ajfb<String> {
        private /* synthetic */ tzy a;

        t(tzy tzy) {
            this.a = tzy;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object obj2 = (String) obj;
            if (this.a.i().a() == null) {
                tzy tzy = this.a;
                akcr.a(obj2, "it");
                tzy.a(tzy, obj2, null, false, false, 14);
            }
        }
    }

    /* renamed from: tzy$x */
    static final class x<T> implements ajfb<abbd> {
        private /* synthetic */ tzy a;

        x(tzy tzy) {
            this.a = tzy;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (abbd) obj;
            tzy tzy = this.a;
            akcr.a(obj, "it");
            tzy.a = obj;
        }
    }

    /* renamed from: tzy$y */
    static final class y<T> implements ajfb<Throwable> {
        public static final y a = new y();

        y() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: tzy$z */
    static final class z<T> implements ajfb<a> {
        private /* synthetic */ uaa a;

        z(uaa uaa) {
            this.a = uaa;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (a) obj;
            if (akcr.a(obj, b.a)) {
                this.a.n().a(new c());
                this.a.h().a(Boolean.TRUE);
                return;
            }
            if (obj instanceof a.c) {
                this.a.n().a(new tzk.b());
                this.a.h().a(Boolean.FALSE);
            }
        }
    }

    /* renamed from: tzy$aa */
    static final class aa extends akcs implements akbl<ily, ilz> {
        private /* synthetic */ String a;
        private /* synthetic */ uac b;

        aa(String str, uac uac) {
            this.a = str;
            this.b = uac;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ily ily = (ily) obj;
            akcr.b(ily, "metric");
            return ily.a(twc.TOOL_TYPE.name(), this.a).a(twc.IS_ENTERING.name(), this.b.a() ^ 1);
        }
    }

    /* renamed from: tzy$ab */
    static final class ab extends akcs implements akbk<Map<String, ? extends tza>> {
        private /* synthetic */ tzy a;

        ab(tzy tzy) {
            this.a = tzy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.c.a();
        }
    }

    /* renamed from: tzy$ac */
    static final class ac extends akcs implements akbk<tzr> {
        private /* synthetic */ tzy a;

        ac(tzy tzy) {
            this.a = tzy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new tzr(this.a);
        }
    }

    /* renamed from: tzy$f */
    static final class f extends akcs implements akbk<ajwo<String>> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: tzy$g */
    static final class g extends akcs implements akbk<tof> {
        private /* synthetic */ tzy a;

        g(tzy tzy) {
            this.a = tzy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tof) this.a.g.get();
        }
    }

    /* renamed from: tzy$h */
    static final class h extends akcs implements akbk<tyx> {
        private /* synthetic */ aipn a;

        h(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tyx) this.a.get();
        }
    }

    /* renamed from: tzy$j */
    static final class j extends akcs implements akbk<DiscardBackButtonPresenter> {
        private /* synthetic */ aipn a;

        j(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DiscardBackButtonPresenter) this.a.get();
        }
    }

    /* renamed from: tzy$k */
    static final class k extends akcs implements akbk<tzq> {
        private /* synthetic */ aipn a;

        k(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tzq) this.a.get();
        }
    }

    /* renamed from: tzy$l */
    static final class l extends akcs implements akbk<Boolean> {
        private /* synthetic */ ajwy a;

        l(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.a.get();
            akcr.a(obj, "releaseManagerProvider.get()");
            return Boolean.valueOf(((abss) obj).l());
        }
    }

    /* renamed from: tzy$m */
    static final class m extends akcs implements akbk<achb<zjm, zjk>> {
        private /* synthetic */ aipn a;

        m(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (achb) this.a.get();
        }
    }

    /* renamed from: tzy$n */
    public static final class n extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ tzy a;
        private /* synthetic */ zjm b;

        public n(tzy tzy, zjm zjm) {
            this.a = tzy;
            this.b = zjm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            DiscardBackButtonPresenter d = this.a.d();
            zjm zjm = this.b;
            akcr.b(zjm, "popUpPageType");
            tvh tvh = (tvh) d.getTarget();
            if (tvh != null) {
                Context a = tvh.a();
                if (a != null) {
                    Object a2 = d.a();
                    String str = "navigationHost";
                    akcr.a(a2, str);
                    zhe.a aVar = new zhe.a(a, a2, toc.b);
                    Object a3 = ajcx.a((ajev) new g(d, a));
                    akcr.a(a3, "Completable.fromAction {…o(this)\n                }");
                    zhe a4 = aVar.a(a3).a();
                    achb a5 = d.a();
                    acig[] acigArr = new acig[2];
                    acigArr[0] = new acio(zjm, true, true);
                    obj = d.a();
                    akcr.a(obj, str);
                    acigArr[1] = new acip(obj, a4, a4.b);
                    a5.a((acig) acie.a.a(acigArr, null));
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: tzy$o */
    public static final class o extends akcs implements akbl<View, ajxw> {
        final /* synthetic */ tzy a;
        private /* synthetic */ zjm b;

        /* renamed from: tzy$o$1 */
        static final class 1 extends akcs implements akbl<ily, ilz> {
            private /* synthetic */ o a;

            1(o oVar) {
                this.a = oVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ily ily = (ily) obj;
                akcr.b(ily, "it");
                String name = twc.EXIT_TYPE.name();
                aauu g = this.a.a.g().g();
                if (g == null) {
                    g = aauu.OTHER_EXIT_METHOD;
                }
                return ily.a(name, (Enum) g);
            }
        }

        public o(tzy tzy, zjm zjm) {
            this.a = tzy;
            this.b = zjm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((twd) this.a.h.get()).a(twb.EXIT_PREVIEW_GESTURE, true, new 1(this));
            this.a.j();
            return ajxw.a;
        }
    }

    /* renamed from: tzy$p */
    public static final class p extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ tzy a;
        private /* synthetic */ zjm b;

        public p(tzy tzy, zjm zjm) {
            this.a = tzy;
            this.b = zjm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.g().a(null);
            ((twd) this.a.h.get()).a(twb.EXIT_PREVIEW_GESTURE);
            return ajxw.a;
        }
    }

    /* renamed from: tzy$q */
    static final class q extends akcs implements akbl<ily, ilz> {
        private /* synthetic */ tzo a;

        q(tzo tzo) {
            this.a = tzo;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ily ily = (ily) obj;
            akcr.b(ily, "metricBase");
            return ily.a(twc.TOOL_TYPE.name(), this.a.a.a());
        }
    }

    /* renamed from: tzy$u */
    static final class u extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ toc b;

        u(zgb zgb, toc toc) {
            this.a = zgb;
            this.b = toc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("PreviewToolbarPresenter"));
        }
    }

    /* renamed from: tzy$v */
    static final class v extends akcs implements akbk<tyb> {
        private /* synthetic */ aipn a;

        v(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tyb) this.a.get();
        }
    }

    /* renamed from: tzy$w */
    public static final class w extends akcs implements akbl<View, ajxw> {
        public static final w a = new w();

        w() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tzy.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(tzy.class), "editLayerController", "getEditLayerController()Lcom/snap/preview/tools/core/PreviewEditLayerController;"), new akdc(akde.a(tzy.class), "activateToolSubject", "getActivateToolSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(tzy.class), "segmentManager", "getSegmentManager()Lcom/snap/preview/segment/SegmentManager;"), new akdc(akde.a(tzy.class), "discardBackButtonPresenter", "getDiscardBackButtonPresenter()Lcom/snap/preview/discard/DiscardBackButtonPresenter;"), new akdc(akde.a(tzy.class), "navigationHost", "getNavigationHost()Lcom/snapchat/deck/api/NavigationHost;"), new akdc(akde.a(tzy.class), "apiProvider", "getApiProvider()Lcom/snap/preview/tools/PreviewToolApiProvider;"), new akdc(akde.a(tzy.class), "analyticsComposer", "getAnalyticsComposer()Lcom/snap/preview/analytics/AnalyticsComposer;"), new akdc(akde.a(tzy.class), "toolInjectors", "getToolInjectors()Ljava/util/Map;"), new akdc(akde.a(tzy.class), "isMasterOrDebugOrAlphaBuild", "isMasterOrDebugOrAlphaBuild()Z"), new akdc(akde.a(tzy.class), "toolSnapProvider", "getToolSnapProvider()Lcom/snap/preview/tools/core/PreviewEditingProvider;")};
        a aVar = new a();
        zjm zjm = new zjm(toc.d, "PreviewToolbarPresenter", false, false, true, false, null, false, false, false, false, null, 4076);
    }

    public tzy(toc toc, aipn<tzq> aipn, Activity activity, zkf zkf, tzt tzt, aipn<achb<zjm, zjk>> aipn2, aipn<tyb> aipn3, zgb zgb, aipn<DiscardBackButtonPresenter> aipn4, tvd tvd, toi toi, aipn<tyx> aipn5, tpv tpv, ajwy<tof> ajwy, ajwy<twd> ajwy2, ajwy<abss> ajwy3) {
        toc toc2 = toc;
        aipn<tzq> aipn6 = aipn;
        Activity activity2 = activity;
        zkf zkf2 = zkf;
        tzt tzt2 = tzt;
        aipn<achb<zjm, zjk>> aipn7 = aipn2;
        aipn<tyb> aipn8 = aipn3;
        zgb zgb2 = zgb;
        aipn<DiscardBackButtonPresenter> aipn9 = aipn4;
        tvd tvd2 = tvd;
        toi toi2 = toi;
        aipn<tyx> aipn10 = aipn5;
        tpv tpv2 = tpv;
        ajwy<tof> ajwy4 = ajwy;
        ajwy<twd> ajwy5 = ajwy2;
        akcr.b(toc2, "previewFeature");
        akcr.b(aipn6, "editLayerControllerLazy");
        akcr.b(activity2, Event.ACTIVITY);
        akcr.b(zkf2, "bus");
        akcr.b(tzt2, "factory");
        akcr.b(aipn7, "navigationHostLazy");
        akcr.b(aipn8, "segmentManagerLazy");
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(aipn9, "discardBackButtonPresenterLazy");
        akcr.b(tvd2, "previewDataSource");
        akcr.b(toi2, "analyticsProviderStorage");
        akcr.b(aipn10, "apiProviderLazy");
        akcr.b(tpv2, "toolsProvider");
        akcr.b(ajwy4, "analyticsComposerProvider");
        akcr.b(ajwy5, "previewMetricsPluginProvider");
        ajwy<abss> ajwy6 = ajwy3;
        akcr.b(ajwy6, "releaseManagerProvider");
        this.b = activity2;
        this.w = zkf2;
        this.c = tzt2;
        this.d = tvd2;
        this.e = toi2;
        this.f = tpv2;
        this.g = ajwy4;
        this.h = ajwy5;
        this.j = ajxh.a(new u(zgb2, toc2));
        this.k = ajxh.a(new k(aipn6));
        this.m = ajxh.a(new v(aipn8));
        this.n = ajxh.a(new j(aipn9));
        this.o = ajxh.a(new m(aipn7));
        this.p = ajxh.a(new h(aipn5));
        this.q = ajxh.a(new g(this));
        this.r = ajxh.a(new ab(this));
        this.a = abbd.CAMERA;
        this.u = ajxh.a(new l(ajwy6));
        this.v = ajxh.a(new ac(this));
    }

    private final tyz a(FrameLayout frameLayout, uaa uaa) {
        return new i(this, frameLayout, uaa);
    }

    private final uac a(String str, tzl tzl) {
        if (tzl == null) {
            return null;
        }
        uac a;
        int i = tzz.d[tzl.d().ordinal()];
        uaa uaa;
        if (i == 1) {
            uaa = (uaa) getTarget();
            if (uaa != null) {
                PreviewVerticalToolbarView t = uaa.t();
                if (t != null) {
                    a = t.a(str);
                    if (a == null) {
                        return null;
                    }
                }
            }
            return null;
        } else if (i == 2) {
            uaa = (uaa) getTarget();
            if (uaa != null) {
                PreviewBottomToolbarView u = uaa.u();
                if (u != null) {
                    a = u.a(str);
                    if (a == null) {
                        return null;
                    }
                }
            }
            return null;
        } else {
            throw new ajxk();
        }
        return a;
    }

    private final void a(String str, tzo tzo, boolean z, boolean z2) {
        Object obj = (uaa) getTarget();
        if (obj != null) {
            akcr.a(obj, "target ?: return");
            if (obj.a().containsKey(str)) {
                a(str);
                if (akcr.a((Object) str, (Object) "scissors_tool")) {
                    a("sticker_picker_tool");
                }
                tzl d = b(str).d();
                uac a = a(str, d);
                if (a != null) {
                    ((twd) this.h.get()).a(twb.TOGGLE_PREVIEW_TOOL_GESTURE, (akbl) new aa(str, a));
                    tzr i = i();
                    tzo tzo2 = new tzo(d, a.a(), tzo != null ? tzo.c : null, z, z2);
                    akcr.b(tzo2, "event");
                    if (!i.c) {
                        i.b.a();
                        tyw b = i.e.b(tzo2.a.a());
                        Object n = b.n();
                        akcr.a(n, "previewTool.snapEditingStatus");
                        i.b.a(n.f((ajfb) new tzr.b(i)));
                        i.b.a(b.e().f((ajfb) new tzr.d(i)));
                        i.b.a(b.f().f((ajfb) new e(i)));
                        i.b.a(b.g().f((ajfb) new tzr.c(i)));
                        i.b.a(i.e.b(tzo2.a.a()).a((ajdp) i.a));
                    }
                    i.a.a((Object) new tzw(i.c, tzo2.a.a(), tzo2.b, tzo2.c, tzo2.d, tzo2.e));
                }
            } else if (l()) {
                StringBuilder stringBuilder = new StringBuilder("Failed to activate ");
                stringBuilder.append(str);
                stringBuilder.append(": tool not found in loadedToolsMap");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    public static /* synthetic */ void a(tzy tzy, String str, tzo tzo, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            tzo = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        tzy.a(str, tzo, z, z2);
    }

    private final zfw k() {
        return (zfw) this.j.b();
    }

    private final boolean l() {
        return ((Boolean) this.u.b()).booleanValue();
    }

    public final tzq a() {
        return (tzq) this.k.b();
    }

    public final zin a(boolean z) {
        Object obj = (uaa) getTarget();
        if (obj == null) {
            return null;
        }
        zin zin;
        akcr.a(obj, "target ?: return null");
        if (z) {
            zin = this.s;
            if (zin == null) {
                zin = new zin(ajyl.a(obj.r()));
                this.s = zin;
                return zin;
            }
        }
        zin = this.t;
        if (zin == null) {
            obj = obj.r().findViewById(R.id.toolbar);
            akcr.a(obj, "target.toolContainer.findViewById(R.id.toolbar)");
            zin = new zin(ajyl.a(obj));
            this.t = zin;
        }
        return zin;
    }

    public final void a(String str) {
        uaa uaa = (uaa) getTarget();
        if (uaa != null) {
            akcr.a((Object) uaa, "target ?: return");
            if (((tyw) this.f.a(tyw.class, str)) == null) {
                Map linkedHashMap = new LinkedHashMap();
                for (Entry entry : uaa.a().entrySet()) {
                    if (akcr.a((String) entry.getKey(), (Object) str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Entry entry2 : linkedHashMap.entrySet()) {
                    tza tza = (tza) h().get(entry2.getKey());
                    if (tza != null) {
                        tyw b = tza.b();
                        if (b != null) {
                            ajei ajei = (ajei) uaa.x().get(entry2.getKey());
                            if (ajei != null) {
                                ajei.dispose();
                            }
                            b.a(a(a().a(uaa.s(), (String) entry2.getKey(), uaa.z().b), uaa));
                            b.a_(uaa.A());
                            b.c(uaa.B());
                            Object baseContext = this.b.getBaseContext();
                            akcr.a(baseContext, "activity.baseContext");
                            uac a = b.a(baseContext, (tzj) entry2.getValue(), this);
                            int i = tzz.b[b.d().d().ordinal()];
                            if (i == 1) {
                                uaa.t().a((String) entry2.getKey(), a);
                            } else if (i == 2) {
                                uaa.u().a((String) entry2.getKey(), a);
                            }
                            a(b, ((tzj) entry2.getValue()).b.getVisibility());
                            if (b instanceof tpq) {
                                zln.bindTo$default(this, ajdp.a((ajdt) ((tpq) b).b().d(200, TimeUnit.MILLISECONDS), (ajdt) uaa.d(), (ajex) d.a).a((ajdw) k().l()).a((ajfb) new b(this, str, uaa), (ajfb) e.a), this, null, null, 6, null);
                            }
                            if (b instanceof tow) {
                                zln.bindTo$default(this, ((tow) b).a().f((ajfb) new c(this, str, uaa)), this, null, null, 6, null);
                            }
                        }
                    }
                    if (l()) {
                        StringBuilder stringBuilder = new StringBuilder("Failed to activate ");
                        stringBuilder.append(str);
                        stringBuilder.append(": ToolInjector not found, or injected value is null");
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(tyw tyw, int i) {
        Object obj = (uaa) getTarget();
        if (obj != null) {
            PreviewBottomToolbarView t;
            akcr.a(obj, "target ?: return");
            int i2 = tzz.c[tyw.d().d().ordinal()];
            if (i2 == 1) {
                t = obj.t();
            } else if (i2 == 2) {
                t = obj.u();
            } else {
                throw new ajxk();
            }
            t.a(tyw.Z_(), i);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:77:0x02b1 in {4, 7, 15, 20, 21, 22, 27, 39, 40, 42, 48, 50, 56, 62, 64, 73, 74, 76} preds:[]
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
    /* renamed from: a */
    public final void takeTarget(defpackage.uaa r12) {
        /*
        r11 = this;
        r0 = "target";
        defpackage.akcr.b(r12, r0);
        super.takeTarget(r12);
        r0 = r11.w;
        r2 = r0.a(r11);
        r0 = r11;
        r0 = (defpackage.zln) r0;
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        r1 = r11;
        r3 = r0;
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);
        r1 = r11.h();
        r1 = r1.isEmpty();
        r2 = 0;
        if (r1 == 0) goto L_0x003f;
        r1 = r12.t();
        r3 = 8;
        r1.setVisibility(r3);
        r1 = r12.u();
        r1.setVisibility(r3);
        r1 = r12.v();
        if (r1 == 0) goto L_0x0056;
        r1.setVisibility(r3);
        goto L_0x0056;
        r1 = r12.t();
        r1.setVisibility(r2);
        r1 = r12.u();
        r1.setVisibility(r2);
        r1 = r12.v();
        if (r1 == 0) goto L_0x0056;
        r1.setVisibility(r2);
        r1 = r11.d;
        r1 = r1.f;
        r3 = new tzy$x;
        r3.<init>(r11);
        r3 = (defpackage.ajfb) r3;
        r4 = defpackage.tzy.y.a;
        r4 = (defpackage.ajfb) r4;
        r4 = r1.a(r3, r4);
        r6 = 0;
        r7 = 0;
        r8 = 6;
        r9 = 0;
        r3 = r11;
        r5 = r0;
        defpackage.zln.bindTo$default(r3, r4, r5, r6, r7, r8, r9);
        r1 = r12.l();
        r3 = r12.o();
        r4 = r1.f(r3);
        r3 = r11;
        defpackage.zln.bindTo$default(r3, r4, r5, r6, r7, r8, r9);
        r1 = r12.a();	 Catch:{ all -> 0x02af }
        r1 = r1.entrySet();	 Catch:{ all -> 0x02af }
        r1 = r1.iterator();	 Catch:{ all -> 0x02af }
        r3 = r1.hasNext();	 Catch:{ all -> 0x02af }
        r10 = 1;	 Catch:{ all -> 0x02af }
        if (r3 == 0) goto L_0x0105;	 Catch:{ all -> 0x02af }
        r3 = r1.next();	 Catch:{ all -> 0x02af }
        r3 = (java.util.Map.Entry) r3;	 Catch:{ all -> 0x02af }
        r4 = r11.h();	 Catch:{ all -> 0x02af }
        r5 = r3.getKey();	 Catch:{ all -> 0x02af }
        r4 = r4.get(r5);	 Catch:{ all -> 0x02af }
        r4 = (defpackage.tza) r4;	 Catch:{ all -> 0x02af }
        if (r4 != 0) goto L_0x00ac;	 Catch:{ all -> 0x02af }
        goto L_0x008e;	 Catch:{ all -> 0x02af }
        r4 = r4.b;	 Catch:{ all -> 0x02af }
        r4 = r4.b();	 Catch:{ all -> 0x02af }
        r5 = "iconInitializer.value";	 Catch:{ all -> 0x02af }
        defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x02af }
        r4 = (defpackage.tzl) r4;	 Catch:{ all -> 0x02af }
        r4 = r4.d();	 Catch:{ all -> 0x02af }
        r5 = defpackage.tzz.a;	 Catch:{ all -> 0x02af }
        r4 = r4.ordinal();	 Catch:{ all -> 0x02af }
        r4 = r5[r4];	 Catch:{ all -> 0x02af }
        if (r4 == r10) goto L_0x00ef;	 Catch:{ all -> 0x02af }
        r5 = 2;	 Catch:{ all -> 0x02af }
        if (r4 == r5) goto L_0x00cb;	 Catch:{ all -> 0x02af }
        goto L_0x008e;	 Catch:{ all -> 0x02af }
        r4 = r12.u();	 Catch:{ all -> 0x02af }
        r5 = r3.getKey();	 Catch:{ all -> 0x02af }
        r5 = (java.lang.String) r5;	 Catch:{ all -> 0x02af }
        r3 = r3.getValue();	 Catch:{ all -> 0x02af }
        r3 = (defpackage.tzj) r3;	 Catch:{ all -> 0x02af }
        r3 = r3.b;	 Catch:{ all -> 0x02af }
        r6 = "toolId";	 Catch:{ all -> 0x02af }
        defpackage.akcr.b(r5, r6);	 Catch:{ all -> 0x02af }
        r6 = "container";	 Catch:{ all -> 0x02af }
        defpackage.akcr.b(r3, r6);	 Catch:{ all -> 0x02af }
        r4 = r4.a;	 Catch:{ all -> 0x02af }
        r4 = (java.util.Map) r4;	 Catch:{ all -> 0x02af }
        r4.put(r5, r3);	 Catch:{ all -> 0x02af }
        goto L_0x008e;	 Catch:{ all -> 0x02af }
        r4 = r12.t();	 Catch:{ all -> 0x02af }
        r5 = r3.getKey();	 Catch:{ all -> 0x02af }
        r5 = (java.lang.String) r5;	 Catch:{ all -> 0x02af }
        r3 = r3.getValue();	 Catch:{ all -> 0x02af }
        r3 = (defpackage.tzj) r3;	 Catch:{ all -> 0x02af }
        r3 = r3.b;	 Catch:{ all -> 0x02af }
        r4.a(r5, r3);	 Catch:{ all -> 0x02af }
        goto L_0x008e;	 Catch:{ all -> 0x02af }
        r1 = i;	 Catch:{ all -> 0x02af }
        r1 = r1.iterator();	 Catch:{ all -> 0x02af }
        r3 = r1.hasNext();	 Catch:{ all -> 0x02af }
        if (r3 == 0) goto L_0x011b;	 Catch:{ all -> 0x02af }
        r3 = r1.next();	 Catch:{ all -> 0x02af }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x02af }
        r11.a(r3);	 Catch:{ all -> 0x02af }
        goto L_0x010b;
        r1 = r11.c();
        r1 = r1.d;
        r1 = (defpackage.ajdp) r1;
        r1 = (defpackage.ajdt) r1;
        r3 = r11.c();
        r3 = r3.e;
        r3 = (defpackage.ajdp) r3;
        r3 = (defpackage.ajdt) r3;
        r4 = r12.p();
        r4 = (defpackage.ajdt) r4;
        r5 = defpackage.tzy.r.a;
        r5 = (defpackage.ajfd) r5;
        r1 = defpackage.ajdp.a(r1, r3, r4, r5);
        r3 = r11.k();
        r3 = r3.l();
        r3 = (defpackage.zfr) r3;
        r3 = (defpackage.ajdw) r3;
        r1 = r1.a(r3);
        r3 = new tzy$s;
        r3.<init>(r11);
        r3 = (defpackage.ajfb) r3;
        r4 = r1.f(r3);
        r6 = 0;
        r7 = 0;
        r8 = 6;
        r9 = 0;
        r3 = r11;
        r5 = r0;
        defpackage.zln.bindTo$default(r3, r4, r5, r6, r7, r8, r9);
        r1 = r11.b();
        r3 = r11.k();
        r3 = r3.l();
        r3 = (defpackage.zfr) r3;
        r3 = (defpackage.ajdw) r3;
        r1 = r1.a(r3);
        r3 = new tzy$t;
        r3.<init>(r11);
        r3 = (defpackage.ajfb) r3;
        r4 = r1.f(r3);
        r3 = r11;
        defpackage.zln.bindTo$default(r3, r4, r5, r6, r7, r8, r9);
        r1 = r12.z();
        r1 = r1.b;
        if (r1 != 0) goto L_0x02ae;
        r1 = r12.z();
        r1 = r1.c;
        if (r1 == 0) goto L_0x02ae;
        r1 = r11.f();
        r3 = r1.a();
        r3 = r3.a();
        r4 = new java.util.LinkedHashMap;
        r4.<init>();
        r4 = (java.util.Map) r4;
        r3 = r3.entrySet();
        r3 = r3.iterator();
        r5 = r3.hasNext();
        if (r5 == 0) goto L_0x01e6;
        r5 = r3.next();
        r5 = (java.util.Map.Entry) r5;
        r6 = r5.getValue();
        r6 = (defpackage.tza) r6;
        r6 = r6.a();
        if (r6 == 0) goto L_0x01d7;
        r6 = r5.getValue();
        r6 = (defpackage.tza) r6;
        r6 = r6.b();
        r6 = r6 instanceof defpackage.tpc;
        if (r6 == 0) goto L_0x01d7;
        r6 = 1;
        goto L_0x01d8;
        r6 = 0;
        if (r6 == 0) goto L_0x01af;
        r6 = r5.getKey();
        r5 = r5.getValue();
        r4.put(r6, r5);
        goto L_0x01af;
        r2 = new java.util.ArrayList;
        r3 = r4.size();
        r2.<init>(r3);
        r2 = (java.util.Collection) r2;
        r3 = r4.entrySet();
        r3 = r3.iterator();
        r4 = r3.hasNext();
        r5 = "null cannot be cast to non-null type com.snap.preview.api.PinnableApi";
        if (r4 == 0) goto L_0x021f;
        r4 = r3.next();
        r4 = (java.util.Map.Entry) r4;
        r4 = r4.getValue();
        r4 = (defpackage.tza) r4;
        r4 = r4.b();
        if (r4 == 0) goto L_0x0219;
        r4 = (defpackage.tpc) r4;
        r2.add(r4);
        goto L_0x01f9;
        r12 = new ajxt;
        r12.<init>(r5);
        throw r12;
        r2 = (java.util.List) r2;
        r2 = (java.lang.Iterable) r2;
        r1 = r1.b();
        r1 = (java.lang.Iterable) r1;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r3 = (java.util.Collection) r3;
        r1 = r1.iterator();
        r4 = r1.hasNext();
        if (r4 == 0) goto L_0x0249;
        r4 = r1.next();
        r6 = r4;
        r6 = (defpackage.tpp) r6;
        r6 = r6 instanceof defpackage.tpc;
        if (r6 == 0) goto L_0x0234;
        r3.add(r4);
        goto L_0x0234;
        r3 = (java.util.List) r3;
        r3 = (java.lang.Iterable) r3;
        r1 = new java.util.ArrayList;
        r4 = 10;
        r4 = defpackage.ajyn.a(r3, r4);
        r1.<init>(r4);
        r1 = (java.util.Collection) r1;
        r3 = r3.iterator();
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0278;
        r4 = r3.next();
        r4 = (defpackage.tpp) r4;
        if (r4 == 0) goto L_0x0272;
        r4 = (defpackage.tpc) r4;
        r1.add(r4);
        goto L_0x025e;
        r12 = new ajxt;
        r12.<init>(r5);
        throw r12;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r1 = defpackage.ajyu.d(r2, r1);
        r1 = (java.lang.Iterable) r1;
        r1 = defpackage.ajyu.m(r1);
        if (r1 == 0) goto L_0x02ae;
        r1 = (java.lang.Iterable) r1;
        r1 = defpackage.ajyu.e(r1);
        r1 = (defpackage.tpc) r1;
        if (r1 == 0) goto L_0x02ae;
        r1 = r1.b();
        if (r1 == 0) goto L_0x02ae;
        r2 = new tzy$z;
        r2.<init>(r12);
        r2 = (defpackage.ajfb) r2;
        r4 = r1.f(r2);
        if (r4 == 0) goto L_0x02ae;
        r6 = 0;
        r7 = 0;
        r8 = 6;
        r9 = 0;
        r3 = r11;
        r5 = r0;
        defpackage.zln.bindTo$default(r3, r4, r5, r6, r7, r8, r9);
        return;
        r12 = move-exception;
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzy.takeTarget(uaa):void");
    }

    /* Access modifiers changed, original: final */
    public final ajwo<String> b() {
        return (ajwo) this.l.b();
    }

    public final tyw b(String str) {
        akcr.b(str, "id");
        tyw tyw = (tyw) this.f.a(tyw.class, str);
        if (tyw != null) {
            return tyw;
        }
        throw new IllegalArgumentException("Invalid tool ID: ".concat(String.valueOf(str)));
    }

    /* Access modifiers changed, original: final */
    public final tyb c() {
        return (tyb) this.m.b();
    }

    public final void c(String str) {
        Object obj = (uaa) getTarget();
        if (obj != null) {
            akcr.a(obj, "target ?: return");
            tzl d = b(str).d();
            if (d != null) {
                uac a;
                int i = tzz.e[d.d().ordinal()];
                if (i == 1) {
                    a = obj.t().a(str);
                } else if (i == 2) {
                    a = obj.u().a(str);
                } else {
                    throw new ajxk();
                }
                if (a != null && d.c()) {
                    if (!d.h()) {
                        a.a(a.a() ^ 1);
                    } else if (d.d() == tzl.a.VERTICAL_BAR) {
                        if (a.a()) {
                            obj.t().c(str);
                        } else {
                            obj.t().b(str);
                        }
                    }
                }
            }
        }
    }

    public final DiscardBackButtonPresenter d() {
        return (DiscardBackButtonPresenter) this.n.b();
    }

    public final void dropTarget() {
        Object obj = (uaa) getTarget();
        if (obj != null) {
            akcr.a(obj, "target ?: return");
            Collection arrayList = new ArrayList();
            for (Object next : this.f.a(tyw.class)) {
                if (obj.a().containsKey(((tyw) next).Z_())) {
                    arrayList.add(next);
                }
            }
            Iterable<tyw> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (tyw i : iterable) {
                i.i();
                arrayList2.add(ajxw.a);
            }
            super.dropTarget();
        }
    }

    public final achb<zjm, zjk> e() {
        return (achb) this.o.b();
    }

    /* Access modifiers changed, original: final */
    public final tyx f() {
        return (tyx) this.p.b();
    }

    public final tof g() {
        return (tof) this.q.b();
    }

    public final Map<String, tza> h() {
        return (Map) this.r.b();
    }

    public final tzr i() {
        return (tzr) this.v.b();
    }

    public final void j() {
        uaa uaa = (uaa) getTarget();
        if (uaa != null) {
            ajdv i = uaa.i();
            if (i != null) {
                i.a(ajxw.a);
            }
        }
    }

    @akqq
    public final void onToolIconClicked(tzo tzo) {
        akcr.b(tzo, "event");
        twd.a((twd) this.h.get(), twb.TOGGLE_PREVIEW_TOOL_GESTURE, new q(tzo), 2);
        tzr i = i();
        Object a = tzo.a.a();
        akcr.b(a, "toolId");
        boolean z = false;
        Object obj = (!i.c || akcr.a(i.d, a)) ? 1 : null;
        if (obj == null) {
            i = i();
            String a2 = i.a();
            if (a2 != null) {
                z = i.e.b(a2).h();
            }
            if (z) {
                String a3 = i().a();
                if (a3 != null) {
                    tzy.a(this, a3, null, false, false, 14);
                }
            } else {
                return;
            }
        }
        tzy.a(this, tzo.a.a(), tzo, tzo.d, false, 8);
    }
}
