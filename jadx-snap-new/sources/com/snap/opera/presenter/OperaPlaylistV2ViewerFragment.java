package com.snap.opera.presenter;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import com.brightcove.player.event.Event;
import com.snap.core.db.record.StoryNoteModel;
import com.snap.ui.deck.MainPageFragment;
import defpackage.abnl;
import defpackage.abqo;
import defpackage.abvb;
import defpackage.achb;
import defpackage.achi;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxk;
import defpackage.ajxr;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.gqr;
import defpackage.icu;
import defpackage.ide;
import defpackage.iib;
import defpackage.sjd;
import defpackage.sjj;
import defpackage.sjm;
import defpackage.ski;
import defpackage.slg;
import defpackage.slw;
import defpackage.smc;
import defpackage.smm;
import defpackage.sms;
import defpackage.sqh;
import defpackage.srb;
import defpackage.sri;
import defpackage.ssp;
import defpackage.stg;
import defpackage.stk;
import defpackage.stl;
import defpackage.sui;
import defpackage.sxd;
import defpackage.szw;
import defpackage.tay;
import defpackage.taz;
import defpackage.zfw;
import defpackage.zhh;
import defpackage.zhx;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;
import defpackage.zkq;
import defpackage.zli;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.opencv.imgproc.Imgproc;

public final class OperaPlaylistV2ViewerFragment extends MainPageFragment implements sms, zjq, zli {
    Boolean a;
    public achb<zjm, zjk> b;
    public abqo c;
    public sxd d;
    public zkq e;
    public iib f;
    public zhh g;
    public ajwy<gqr> h;
    public ajwy<zhx> i;
    public ajwy<icu> j;
    public b k;
    public slw l;
    private ssp m;
    private final ajxe n = ajxh.a(new j(this));
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private srb s;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b {
        final stl a;
        final zfw b;
        final akbl<defpackage.sjd.a, ajxw> c;
        public final slg d;
        final ExecutorService e;
        final smc f;
        final Collection<sqh> g;
        final Set<smm> h;
        final sjj i;
        final sri j;
        final String k;
        final long l;
        final boolean m;
        final boolean n;
        final boolean o = false;
        final boolean p;
        final sjm q;
        final boolean r;
        final boolean s;
        final ide t;
        final ide u;
        private final String v;

        public b(stl stl, zfw zfw, akbl<? super defpackage.sjd.a, ajxw> akbl, slg slg, ExecutorService executorService, smc smc, Collection<? extends sqh> collection, Set<? extends smm> set, sjj sjj, String str, sri sri, String str2, long j, boolean z, boolean z2, boolean z3, boolean z4, sjm sjm, boolean z5, boolean z6, ide ide, ide ide2) {
            stl stl2 = stl;
            zfw zfw2 = zfw;
            akbl<? super defpackage.sjd.a, ajxw> akbl2 = akbl;
            slg slg2 = slg;
            ExecutorService executorService2 = executorService;
            smc smc2 = smc;
            Collection<? extends sqh> collection2 = collection;
            Set<? extends smm> set2 = set;
            sjj sjj2 = sjj;
            String str3 = str;
            ide ide3 = ide;
            ide ide4 = ide2;
            akcr.b(stl, "operaPresenterContext");
            akcr.b(zfw2, "schedulers");
            akcr.b(akbl2, "operaConfigurator");
            akcr.b(slg2, "transitionShapeController");
            akcr.b(executorService2, "backgroundExecutorService");
            akcr.b(smc2, "listResolver");
            akcr.b(collection2, "startPageNeighbors");
            akcr.b(set2, "plugins");
            akcr.b(sjj2, "safeBrowsingValidator");
            akcr.b(str3, "fragmentSuffix");
            akcr.b(ide3, "operaFeature");
            akcr.b(ide4, "sourceFeature");
            this.a = stl2;
            this.b = zfw2;
            this.c = akbl2;
            this.d = slg2;
            this.e = executorService2;
            this.f = smc2;
            this.g = collection2;
            this.h = set2;
            this.i = sjj2;
            this.v = str3;
            this.j = sri;
            this.k = str2;
            this.l = j;
            this.m = z;
            this.n = z2;
            this.p = z4;
            this.q = sjm;
            this.r = z5;
            this.s = z6;
            this.t = ide3;
            this.u = ide4;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (akcr.a(this.a, bVar.a) && akcr.a(this.b, bVar.b) && akcr.a(this.c, bVar.c) && akcr.a(this.d, bVar.d) && akcr.a(this.e, bVar.e) && akcr.a(this.f, bVar.f) && akcr.a(this.g, bVar.g) && akcr.a(this.h, bVar.h) && akcr.a(this.i, bVar.i) && akcr.a(this.v, bVar.v) && akcr.a(this.j, bVar.j) && akcr.a(this.k, bVar.k)) {
                        if ((this.l == bVar.l ? 1 : null) != null) {
                            if ((this.m == bVar.m ? 1 : null) != null) {
                                if ((this.n == bVar.n ? 1 : null) != null) {
                                    if ((this.o == bVar.o ? 1 : null) != null) {
                                        if ((this.p == bVar.p ? 1 : null) != null && akcr.a(this.q, bVar.q)) {
                                            if ((this.r == bVar.r ? 1 : null) != null) {
                                                if (!((this.s == bVar.s ? 1 : null) != null && akcr.a(this.t, bVar.t) && akcr.a(this.u, bVar.u))) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            stl stl = this.a;
            int i = 0;
            int hashCode = (stl != null ? stl.hashCode() : 0) * 31;
            zfw zfw = this.b;
            hashCode = (hashCode + (zfw != null ? zfw.hashCode() : 0)) * 31;
            akbl akbl = this.c;
            hashCode = (hashCode + (akbl != null ? akbl.hashCode() : 0)) * 31;
            slg slg = this.d;
            hashCode = (hashCode + (slg != null ? slg.hashCode() : 0)) * 31;
            ExecutorService executorService = this.e;
            hashCode = (hashCode + (executorService != null ? executorService.hashCode() : 0)) * 31;
            smc smc = this.f;
            hashCode = (hashCode + (smc != null ? smc.hashCode() : 0)) * 31;
            Collection collection = this.g;
            hashCode = (hashCode + (collection != null ? collection.hashCode() : 0)) * 31;
            Set set = this.h;
            hashCode = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
            sjj sjj = this.i;
            hashCode = (hashCode + (sjj != null ? sjj.hashCode() : 0)) * 31;
            String str = this.v;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            sri sri = this.j;
            hashCode = (hashCode + (sri != null ? sri.hashCode() : 0)) * 31;
            str = this.k;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            long j = this.l;
            hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            int i2 = this.m;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.n;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.o;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.p;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            sjm sjm = this.q;
            hashCode = (hashCode + (sjm != null ? sjm.hashCode() : 0)) * 31;
            i2 = this.r;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.s;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            ide ide = this.t;
            hashCode = (hashCode + (ide != null ? ide.hashCode() : 0)) * 31;
            ide = this.u;
            if (ide != null) {
                i = ide.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Configuration(operaPresenterContext=");
            stringBuilder.append(this.a);
            stringBuilder.append(", schedulers=");
            stringBuilder.append(this.b);
            stringBuilder.append(", operaConfigurator=");
            stringBuilder.append(this.c);
            stringBuilder.append(", transitionShapeController=");
            stringBuilder.append(this.d);
            stringBuilder.append(", backgroundExecutorService=");
            stringBuilder.append(this.e);
            stringBuilder.append(", listResolver=");
            stringBuilder.append(this.f);
            stringBuilder.append(", startPageNeighbors=");
            stringBuilder.append(this.g);
            stringBuilder.append(", plugins=");
            stringBuilder.append(this.h);
            stringBuilder.append(", safeBrowsingValidator=");
            stringBuilder.append(this.i);
            stringBuilder.append(", fragmentSuffix=");
            stringBuilder.append(this.v);
            stringBuilder.append(", closedAnimationShape=");
            stringBuilder.append(this.j);
            stringBuilder.append(", initialThumbnailKey=");
            stringBuilder.append(this.k);
            stringBuilder.append(", delayToPopFragmentOnPauseMs=");
            stringBuilder.append(this.l);
            stringBuilder.append(", isLowEndModeEnabled=");
            stringBuilder.append(this.m);
            stringBuilder.append(", useCloseButtonInLowEndMode=");
            stringBuilder.append(this.n);
            stringBuilder.append(", disableDismiss=");
            stringBuilder.append(this.o);
            stringBuilder.append(", disableLongPress=");
            stringBuilder.append(this.p);
            stringBuilder.append(", webviewUrlInterceptor=");
            stringBuilder.append(this.q);
            stringBuilder.append(", operaLowEndDeviceAnimations=");
            stringBuilder.append(this.r);
            stringBuilder.append(", useWindowConfiguration=");
            stringBuilder.append(this.s);
            stringBuilder.append(", operaFeature=");
            stringBuilder.append(this.t);
            stringBuilder.append(", sourceFeature=");
            stringBuilder.append(this.u);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public interface c {
        void a(long j);
    }

    public static final class d implements abvb {
        d() {
        }

        public final boolean a() {
            return true;
        }

        public final boolean a(int i) {
            return true;
        }
    }

    public static final class e implements taz {
        final /* synthetic */ OperaPlaylistV2ViewerFragment a;

        static final class a implements Runnable {
            private /* synthetic */ e a;

            a(e eVar) {
                this.a = eVar;
            }

            public final void run() {
                achb achb = this.a.a.b;
                if (achb == null) {
                    akcr.a("navigationHost");
                }
                achb.e();
            }
        }

        e(OperaPlaylistV2ViewerFragment operaPlaylistV2ViewerFragment) {
            this.a = operaPlaylistV2ViewerFragment;
        }

        public final void a() {
        }

        public final void a(float f) {
        }

        public final void b() {
        }

        public final void c() {
        }

        public final void d() {
        }

        public final void e() {
        }

        public final void f() {
            this.a.i();
            this.a.b().a().post(new a(this));
        }

        public final void g() {
        }
    }

    static final class g<T, R> implements ajfc<T, ajdt<U>> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (ajxr) obj;
            akcr.b(obj, "observables");
            return (akcr.a(((Integer) obj.c).intValue(), 0) <= 0 || ((Rect) obj.b).bottom <= 0) ? ajdp.b(obj).e(100, TimeUnit.MILLISECONDS) : ajdp.b(obj);
        }
    }

    static final class h<T> implements ajfb<ajxr<? extends defpackage.iib.a, ? extends Rect, ? extends Integer>> {
        private /* synthetic */ OperaPlaylistV2ViewerFragment a;
        private /* synthetic */ defpackage.akdd.c b;

        h(OperaPlaylistV2ViewerFragment operaPlaylistV2ViewerFragment, defpackage.akdd.c cVar) {
            this.a = operaPlaylistV2ViewerFragment;
            this.b = cVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxr ajxr = (ajxr) obj;
            OperaPlaylistV2ViewerFragment operaPlaylistV2ViewerFragment = this.a;
            Object obj2 = ((defpackage.iib.a) ajxr.a).b;
            akcr.a(obj2, "observables.first.fullscreenResolution");
            operaPlaylistV2ViewerFragment.a = Boolean.valueOf(obj2.c() ^ 1);
            Rect rect = (Rect) ajxr.b;
            Integer num = (Integer) ajxr.c;
            if (num != null && num.intValue() == 0) {
                this.b.a = rect.bottom;
            }
            this.a.b().a(rect.top, this.b.a);
            this.a.h();
        }
    }

    static final class i implements ski {
        private /* synthetic */ OperaPlaylistV2ViewerFragment a;

        i(OperaPlaylistV2ViewerFragment operaPlaylistV2ViewerFragment) {
            this.a = operaPlaylistV2ViewerFragment;
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            akcr.b(str, "<anonymous parameter 0>");
            akcr.b(szw, "context");
            akcr.b(szw2, "<anonymous parameter 2>");
            this.a.a((sqh) szw);
        }
    }

    public static final class f extends slw {
        private /* synthetic */ OperaPlaylistV2ViewerFragment n;

        f(OperaPlaylistV2ViewerFragment operaPlaylistV2ViewerFragment, sjd sjd, abqo abqo) {
            this.n = operaPlaylistV2ViewerFragment;
            super(sjd, abqo);
        }

        public final void a(Collection<? extends sqh> collection, Collection<? extends sqh> collection2) {
            String str;
            akcr.b(collection, "addedPages");
            akcr.b(collection2, "removedPages");
            Iterator it = collection.iterator();
            while (true) {
                str = "page";
                if (!it.hasNext()) {
                    break;
                }
                akcr.b((sqh) it.next(), str);
            }
            for (sqh sqh : collection2) {
                OperaPlaylistV2ViewerFragment operaPlaylistV2ViewerFragment = this.n;
                akcr.b(sqh, str);
                operaPlaylistV2ViewerFragment.a(sqh);
            }
        }
    }

    static final class j extends akcs implements akbk<sui> {
        private /* synthetic */ OperaPlaylistV2ViewerFragment a;

        j(OperaPlaylistV2ViewerFragment operaPlaylistV2ViewerFragment) {
            this.a = operaPlaylistV2ViewerFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            b bVar = this.a.k;
            if (bVar == null) {
                akcr.a(Event.CONFIGURATION);
            }
            return new sui(bVar.h);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(OperaPlaylistV2ViewerFragment.class), "pluginRegistry", "getPluginRegistry()Lcom/snap/opera/presenter/internal/OperaPluginRegistry;");
        a aVar = new a();
    }

    private final void a(long j) {
        b bVar = this.k;
        if (bVar == null) {
            akcr.a(Event.CONFIGURATION);
        }
        for (smm smm : bVar.h) {
            if (smm instanceof c) {
                ((c) smm).a(j);
            }
        }
    }

    private final void b(boolean z) {
        if (z) {
            i();
        }
        if (this.p) {
            slw slw = this.l;
            if (slw == null) {
                akcr.a(StoryNoteModel.VIEWER);
            }
            slw.h();
            this.p = false;
        }
    }

    private final sui j() {
        return (sui) this.n.b();
    }

    private final void k() {
        if (!this.p) {
            slw slw;
            if (!this.q) {
                if (this.c == null) {
                    akcr.a("clock");
                }
                a(abqo.c());
                this.q = true;
            }
            this.p = true;
            h();
            b bVar = this.k;
            if (bVar == null) {
                akcr.a(Event.CONFIGURATION);
            }
            boolean z = bVar.o;
            String str = StoryNoteModel.VIEWER;
            if (z) {
                slw = this.l;
                if (slw == null) {
                    akcr.a(str);
                }
                slw.a(false);
            }
            slw = this.l;
            if (slw == null) {
                akcr.a(str);
            }
            if (slw.i()) {
                slw = this.l;
                if (slw == null) {
                    akcr.a(str);
                }
                slw.l();
            }
        }
    }

    private final void l() {
        slw slw = this.l;
        if (slw == null) {
            akcr.a(StoryNoteModel.VIEWER);
        }
        slw.d();
    }

    public final long S_() {
        b bVar = this.k;
        if (bVar == null) {
            akcr.a(Event.CONFIGURATION);
        }
        long j = bVar.l;
        return j < 0 ? -1 : j;
    }

    public final defpackage.iii.a.a a(boolean z) {
        defpackage.iii.c cVar;
        if (z) {
            cVar = defpackage.iii.c.TRANSLUCENT;
        } else if (z) {
            throw new ajxk();
        } else {
            cVar = defpackage.iii.c.GONE;
        }
        return new defpackage.iii.a.a(cVar, defpackage.iii.d.GONE, defpackage.iii.b.FULLSCREEN);
    }

    /* Access modifiers changed, original: final */
    public final void a(sqh sqh) {
        b bVar = this.k;
        String str = Event.CONFIGURATION;
        if (bVar == null) {
            akcr.a(str);
        }
        if (!bVar.f.a(sqh)) {
            bVar = this.k;
            if (bVar == null) {
                akcr.a(str);
            }
            stg f = bVar.a.f();
            akcr.b(sqh, "receiver$0");
            akcr.b(f, "operaDisposables");
            stk stk = f.b;
            akcr.b(sqh, "key");
            stk.a.a(Integer.valueOf(sqh.b()));
        }
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        slw slw = this.l;
        String str = StoryNoteModel.VIEWER;
        if (slw == null) {
            akcr.a(str);
        }
        if (!slw.k()) {
            slw = this.l;
            if (slw == null) {
                akcr.a(str);
            }
            if (!slw.i()) {
                l();
            }
        }
        k();
        this.o = true;
    }

    public final slw b() {
        slw slw = this.l;
        if (slw == null) {
            akcr.a(StoryNoteModel.VIEWER);
        }
        return slw;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        zjm zjm = (zjm) achi.f.e();
        b(akcr.a(zjm != null ? zjm.b() : null, (Object) "Cognac") ^ 1);
        this.o = false;
    }

    /* Access modifiers changed, original: final */
    public final void h() {
        if (getActivity() != null && this.p && this.a != null) {
            b bVar = this.k;
            if (bVar == null) {
                akcr.a(Event.CONFIGURATION);
            }
            if (!bVar.s) {
                int i = 5380;
                if (akcr.a(this.a, Boolean.TRUE)) {
                    i = 5894;
                }
                Object activity = getActivity();
                if (activity == null) {
                    akcr.a();
                }
                String str = "activity!!";
                akcr.a(activity, str);
                activity = activity.getWindow();
                String str2 = "activity!!.window";
                akcr.a(activity, str2);
                activity = activity.getDecorView();
                akcr.a(activity, "activity!!.window.decorView");
                activity.setSystemUiVisibility(i);
                if (abnl.p) {
                    Object activity2 = getActivity();
                    if (activity2 == null) {
                        akcr.a();
                    }
                    akcr.a(activity2, str);
                    activity2 = activity2.getWindow();
                    akcr.a(activity2, str2);
                    activity = getActivity();
                    if (activity == null) {
                        akcr.a();
                    }
                    akcr.a(activity, str);
                    activity = activity.getWindow();
                    akcr.a(activity, str2);
                    LayoutParams attributes = activity.getAttributes();
                    attributes.layoutInDisplayCutoutMode = 1;
                    activity2.setAttributes(attributes);
                }
            }
        }
    }

    public final void i() {
        b bVar = this.k;
        if (bVar == null) {
            akcr.a(Event.CONFIGURATION);
        }
        if (!bVar.s) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.getWindow().clearFlags(Imgproc.INTER_TAB_SIZE2);
                Object window = activity.getWindow();
                akcr.a(window, "window");
                window = window.getDecorView();
                akcr.a(window, "window.decorView");
                window.setSystemUiVisibility(this.r);
            }
        }
    }

    public final boolean o_() {
        slw slw = this.l;
        if (slw == null) {
            akcr.a(StoryNoteModel.VIEWER);
        }
        return slw.f();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
        aipx.a(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:149:0x0347 in {5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35, 38, 41, 44, 47, 52, 57, 58, 61, 64, 67, 70, 73, 76, 79, 82, 85, 88, 91, 94, 97, 100, 104, 107, 110, 113, 116, 119, 122, 125, 128, 131, 134, 139, 142, 145, 146, 148} preds:[]
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
    public final void onCreate(android.os.Bundle r12) {
        /*
        r11 = this;
        super.onCreate(r12);
        r12 = r11.j();
        r0 = r12.d;
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0028;
        r1 = r0.next();
        r1 = (defpackage.smm) r1;
        r2 = r12.a;
        r2.a(r1);
        r2 = r1 instanceof defpackage.swa;
        if (r2 == 0) goto L_0x000d;
        r2 = r12.b;
        r2.add(r1);
        goto L_0x000d;
        r12 = new com.snap.opera.presenter.OperaPlaylistV2ViewerFragment$f;
        r0 = new sjg$a;
        r0.<init>();
        r1 = r11.j();
        r1.a(r0);
        r0 = r0.a();
        r1 = "with(OperaLayerConfigura…        build()\n        }";
        defpackage.akcr.a(r0, r1);
        r1 = new six$a;
        r1.<init>();
        r1 = r1.a();
        r1 = r1.b();
        r1 = r1.c();
        r2 = new sjd$a;
        r2.<init>();
        r3 = r11.getContext();
        r2 = r2.a(r3);
        r3 = r11.k;
        r4 = "configuration";
        if (r3 != 0) goto L_0x0066;
        defpackage.akcr.a(r4);
        r3 = r3.f;
        r2 = r2.a(r3);
        r0 = r2.a(r0);
        r2 = r11.k;
        if (r2 != 0) goto L_0x0077;
        defpackage.akcr.a(r4);
        r2 = r2.m;
        r0 = r0.b(r2);
        r0 = r0.a(r1);
        r1 = r11.k;
        if (r1 != 0) goto L_0x0088;
        defpackage.akcr.a(r4);
        r1 = r1.i;
        r0 = r0.a(r1);
        r1 = r11.d;
        if (r1 != 0) goto L_0x0097;
        r2 = "operaLayerRecycler";
        defpackage.akcr.a(r2);
        r1 = r1.a;
        r0 = r0.a(r1);
        r1 = r11.k;
        if (r1 != 0) goto L_0x00a4;
        defpackage.akcr.a(r4);
        r1 = r1.p;
        r0 = r0.c(r1);
        r1 = r11.k;
        if (r1 != 0) goto L_0x00b1;
        defpackage.akcr.a(r4);
        r1 = r1.q;
        r0 = r0.a(r1);
        r1 = new sue;
        r2 = r11.h;
        if (r2 != 0) goto L_0x00c2;
        r3 = "exceptionTracker";
        defpackage.akcr.a(r3);
        r2 = r2.get();
        r3 = "exceptionTracker.get()";
        defpackage.akcr.a(r2, r3);
        r2 = (defpackage.gqr) r2;
        r1.<init>(r2);
        r1 = (defpackage.sje) r1;
        r0 = r0.a(r1);
        r1 = r11.k;
        if (r1 != 0) goto L_0x00dd;
        defpackage.akcr.a(r4);
        r1 = r1.a;
        r1 = r1.b();
        r0 = r0.a(r1);
        r1 = r11.i;
        if (r1 != 0) goto L_0x00f0;
        r2 = "badFrameMonitor";
        defpackage.akcr.a(r2);
        r0 = r0.a(r1);
        r1 = r11.j;
        if (r1 != 0) goto L_0x00fd;
        r2 = "badFrameMetricReporter";
        defpackage.akcr.a(r2);
        r0 = r0.b(r1);
        r1 = r11.k;
        if (r1 != 0) goto L_0x0108;
        defpackage.akcr.a(r4);
        r1 = r1.t;
        r0 = r0.a(r1);
        r1 = r11.k;
        if (r1 != 0) goto L_0x0115;
        defpackage.akcr.a(r4);
        r1 = r1.u;
        r0 = r0.b(r1);
        r1 = r11.k;
        if (r1 != 0) goto L_0x0122;
        defpackage.akcr.a(r4);
        r1 = r1.c;
        r2 = "builder";
        defpackage.akcr.a(r0, r2);
        r1.invoke(r0);
        r1 = r11.k;
        if (r1 != 0) goto L_0x0133;
        defpackage.akcr.a(r4);
        r1 = r1.n;
        r2 = 0;
        if (r1 == 0) goto L_0x014f;
        r1 = r11.k;
        if (r1 != 0) goto L_0x013f;
        defpackage.akcr.a(r4);
        r1 = r1.m;
        if (r1 == 0) goto L_0x014f;
        r1 = r11.k;
        if (r1 != 0) goto L_0x014a;
        defpackage.akcr.a(r4);
        r1 = r1.d;
        r1.a(r2);
        r1 = r11.k;
        if (r1 != 0) goto L_0x0156;
        defpackage.akcr.a(r4);
        r1 = r1.d;
        r3 = r11.k;
        if (r3 != 0) goto L_0x015f;
        defpackage.akcr.a(r4);
        r3 = r3.k;
        r1.a(r3);
        r0 = r0.d();
        r1 = "builder.build()";
        defpackage.akcr.a(r0, r1);
        r1 = r11.c;
        if (r1 != 0) goto L_0x0176;
        r3 = "clock";
        defpackage.akcr.a(r3);
        r12.<init>(r11, r0, r1);
        r12 = (defpackage.slw) r12;
        r11.l = r12;
        r12 = new akdd$c;
        r12.<init>();
        r0 = 0;
        r12.a = r0;
        r0 = r11.f;
        if (r0 != 0) goto L_0x018e;
        r1 = "screenParameterProvider";
        defpackage.akcr.a(r1);
        r0 = r0.b();
        r0 = r0.i();
        r1 = "screenParameterProvider.…rameters().toObservable()";
        defpackage.akcr.a(r0, r1);
        r1 = r11.e;
        if (r1 != 0) goto L_0x01a4;
        r3 = "insetsDetector";
        defpackage.akcr.a(r3);
        r1 = r1.b();
        r3 = "insetsDetector.fullScreenWindowRectObservable";
        defpackage.akcr.a(r1, r3);
        r3 = r11.g;
        if (r3 != 0) goto L_0x01b6;
        r5 = "keyboardDetector";
        defpackage.akcr.a(r5);
        r3 = r3.a();
        r5 = "keyboardDetector.keyboardHeightObservable";
        defpackage.akcr.a(r3, r5);
        r0 = defpackage.ajwa.a(r0, r1, r3);
        r1 = com.snap.opera.presenter.OperaPlaylistV2ViewerFragment.g.a;
        r1 = (defpackage.ajfc) r1;
        r0 = r0.h(r1);
        r1 = r11.k;
        if (r1 != 0) goto L_0x01d2;
        defpackage.akcr.a(r4);
        r1 = r1.b;
        r1 = r1.h();
        r1 = (defpackage.ajdw) r1;
        r0 = r0.b(r1);
        r1 = r11.k;
        if (r1 != 0) goto L_0x01e5;
        defpackage.akcr.a(r4);
        r1 = r1.b;
        r1 = r1.l();
        r1 = (defpackage.zfr) r1;
        r1 = (defpackage.ajdw) r1;
        r0 = r0.a(r1);
        r1 = new com.snap.opera.presenter.OperaPlaylistV2ViewerFragment$h;
        r1.<init>(r11, r12);
        r1 = (defpackage.ajfb) r1;
        r12 = r0.f(r1);
        r0 = "Observables.combineLates…tions()\n                }";
        defpackage.akcr.a(r12, r0);
        r0 = r11.k;
        if (r0 != 0) goto L_0x020a;
        defpackage.akcr.a(r4);
        r0 = r0.a;
        r0 = r0.f();
        defpackage.sth.a(r12, r0, r2);
        r12 = r11.m;
        if (r12 == 0) goto L_0x021a;
        r12.b();
        r12 = new ssp;
        r0 = r11.k;
        if (r0 != 0) goto L_0x0223;
        defpackage.akcr.a(r4);
        r6 = r0.a;
        r0 = r11.k;
        if (r0 != 0) goto L_0x022c;
        defpackage.akcr.a(r4);
        r7 = r0.e;
        r8 = r11.j();
        r9 = r11;
        r9 = (defpackage.sms) r9;
        r0 = r11.l;
        r1 = "viewer";
        if (r0 != 0) goto L_0x023e;
        defpackage.akcr.a(r1);
        r10 = r0.c();
        r5 = r12;
        r5.<init>(r6, r7, r8, r9, r10);
        r12.a();
        r11.m = r12;
        r12 = r11.k;
        if (r12 != 0) goto L_0x0252;
        defpackage.akcr.a(r4);
        r12 = r12.g;
        r12 = (java.lang.Iterable) r12;
        r12 = r12.iterator();
        r0 = r12.hasNext();
        if (r0 == 0) goto L_0x026c;
        r0 = r12.next();
        r0 = (defpackage.sqh) r0;
        r2 = "page";
        defpackage.akcr.b(r0, r2);
        goto L_0x025a;
        r12 = r11.l;
        if (r12 != 0) goto L_0x0273;
        defpackage.akcr.a(r1);
        r0 = r11.k;
        if (r0 != 0) goto L_0x027a;
        defpackage.akcr.a(r4);
        r0 = r0.m;
        r0 = r0 ^ 1;
        r12.b(r0);
        r12 = r11.l;
        if (r12 != 0) goto L_0x0288;
        defpackage.akcr.a(r1);
        r0 = r11.k;
        if (r0 != 0) goto L_0x028f;
        defpackage.akcr.a(r4);
        r0 = r0.f;
        r0 = r0.a();
        if (r0 != 0) goto L_0x029a;
        defpackage.akcr.a();
        r0 = (java.util.Observable) r0;
        r2 = r11.k;
        if (r2 != 0) goto L_0x02a3;
        defpackage.akcr.a(r4);
        r2 = r2.g;
        r12.a(r0, r2);
        r12 = r11.l;
        if (r12 != 0) goto L_0x02af;
        defpackage.akcr.a(r1);
        r0 = r11.k;
        if (r0 != 0) goto L_0x02b6;
        defpackage.akcr.a(r4);
        r0 = r0.r;
        r12.c(r0);
        r12 = r11.l;
        if (r12 != 0) goto L_0x02c2;
        defpackage.akcr.a(r1);
        r12 = r12.b();
        r0 = new com.snap.opera.presenter.OperaPlaylistV2ViewerFragment$i;
        r0.<init>(r11);
        r2 = "DESTROYED_VIEW";
        r0 = defpackage.ajxs.a(r2, r0);
        r0 = defpackage.ajzl.a(r0);
        r12.a(r0);
        r12 = r11.l;
        if (r12 != 0) goto L_0x02df;
        defpackage.akcr.a(r1);
        r12 = r12.a();
        if (r12 == 0) goto L_0x033f;
        r12 = (com.snapchat.android.framework.ui.views.openlayout.OpenLayout) r12;
        r0 = new com.snap.opera.presenter.OperaPlaylistV2ViewerFragment$d;
        r0.<init>();
        r0 = (defpackage.abvb) r0;
        r12.a(r0);
        r12 = r11.l;
        if (r12 != 0) goto L_0x02f8;
        defpackage.akcr.a(r1);
        r12 = r12.m();
        r0 = new abve$a;
        r0.<init>();
        r0 = (defpackage.abve.c) r0;
        r12.a(r0);
        r12 = r11.l;
        if (r12 != 0) goto L_0x030d;
        defpackage.akcr.a(r1);
        r12 = r12.m();
        r0 = new com.snap.opera.presenter.OperaPlaylistV2ViewerFragment$e;
        r0.<init>(r11);
        r0 = (defpackage.taz) r0;
        r12.a(r0);
        r12 = r11.getActivity();
        if (r12 == 0) goto L_0x033e;
        r0 = "it";
        defpackage.akcr.a(r12, r0);
        r12 = r12.getWindow();
        r0 = "it.window";
        defpackage.akcr.a(r12, r0);
        r12 = r12.getDecorView();
        r0 = "it.window.decorView";
        defpackage.akcr.a(r12, r0);
        r12 = r12.getSystemUiVisibility();
        r11.r = r12;
        return;
        r12 = new ajxt;
        r0 = "null cannot be cast to non-null type com.snapchat.android.framework.ui.views.openlayout.OpenLayout";
        r12.<init>(r0);
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.opera.presenter.OperaPlaylistV2ViewerFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        b bVar = this.k;
        String str = Event.CONFIGURATION;
        if (bVar == null) {
            akcr.a(str);
        }
        slg slg = bVar.d;
        slw slw = this.l;
        String str2 = StoryNoteModel.VIEWER;
        if (slw == null) {
            akcr.a(str2);
        }
        ViewGroup a = slw.a();
        slw slw2 = this.l;
        if (slw2 == null) {
            akcr.a(str2);
        }
        tay m = slw2.m();
        b bVar2 = this.k;
        if (bVar2 == null) {
            akcr.a(str);
        }
        slg.a(a, m, bVar2.j);
        slw slw3 = this.l;
        if (slw3 == null) {
            akcr.a(str2);
        }
        return slw3.a();
    }

    public final void onDestroy() {
        super.onDestroy();
        slw slw = this.l;
        String str = StoryNoteModel.VIEWER;
        if (slw == null) {
            akcr.a(str);
        }
        if (!slw.j()) {
            slw = this.l;
            if (slw == null) {
                akcr.a(str);
            }
            slw.e();
        }
        ssp ssp = this.m;
        if (ssp != null) {
            ssp.b();
        }
        slw = this.l;
        if (slw == null) {
            akcr.a(str);
        }
        slw.m().o();
        slw = this.l;
        if (slw == null) {
            akcr.a(str);
        }
        slw.b().a();
    }

    public final void onPause() {
        super.onPause();
        b(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    public final void onResume() {
        /*
        r2 = this;
        super.onResume();
        r0 = r2.l;
        r1 = "viewer";
        if (r0 != 0) goto L_0x000c;
    L_0x0009:
        defpackage.akcr.a(r1);
    L_0x000c:
        r0 = r0.k();
        if (r0 != 0) goto L_0x0026;
    L_0x0012:
        r0 = r2.l;
        if (r0 != 0) goto L_0x0019;
    L_0x0016:
        defpackage.akcr.a(r1);
    L_0x0019:
        r0 = r0.i();
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r0 = r2.o;
        if (r0 == 0) goto L_0x0024;
    L_0x0023:
        goto L_0x0026;
    L_0x0024:
        r0 = 0;
        goto L_0x0027;
    L_0x0026:
        r0 = 1;
    L_0x0027:
        if (r0 == 0) goto L_0x002c;
    L_0x0029:
        r2.k();
    L_0x002c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.opera.presenter.OperaPlaylistV2ViewerFragment.onResume():void");
    }

    public final void onStart() {
        super.onStart();
        slw slw = this.l;
        String str = StoryNoteModel.VIEWER;
        if (slw == null) {
            akcr.a(str);
        }
        Object obj = 1;
        if (!slw.j()) {
            slw = this.l;
            if (slw == null) {
                akcr.a(str);
            }
            if (slw.i() || !this.o) {
                obj = null;
            }
        }
        if (obj != null) {
            l();
        }
    }

    public final void onStop() {
        super.onStop();
        srb srb = srb.ENTER_BACKGROUND;
        this.s = null;
        slw slw = this.l;
        if (slw == null) {
            akcr.a(StoryNoteModel.VIEWER);
        }
        slw.b(srb);
    }
}
