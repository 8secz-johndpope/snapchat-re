package defpackage;

import android.content.Context;
import com.snap.core.db.record.FeedRecord.BasicFeedInfo;
import com.snapchat.android.R;
import defpackage.pzw.a;
import defpackage.pzw.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: pzy */
public final class pzy extends pzi implements a {
    private final pxo A;
    private final ajdx<prx> B;
    final List<era> a;
    final ajei b;
    ifp<? extends ept> c;
    zmf d;
    final AtomicBoolean e;
    final ajei g;
    pqh h;
    final gqr i;
    final Context j;
    final sdu k;
    final b l;
    final ajwy<epq> m;
    final qax n;
    final ajws<pqe> o;
    final ajwy<iqw> p;
    final pzq q;
    final ajwy<pzc> r;
    private final ajxe s = ajxh.a(c.a);
    private final ajxe t;
    private final ajxe u;
    private final erd v;
    private int w;
    private final eqc x;
    private final zkf y;
    private final ajdp<pqh> z;

    /* renamed from: pzy$p */
    static final class p<V> implements Callable<U> {
        public static final p a = new p();

        p() {
        }

        public final /* synthetic */ Object call() {
            return new ArrayList();
        }
    }

    /* renamed from: pzy$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pzy a;

        a(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ept ept = (ept) obj;
            akcr.b(ept, "cameraRollMedia");
            return ((epq) this.a.m.get()).a(ept, pql.a.d.b);
        }
    }

    /* renamed from: pzy$b */
    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: pzy$e */
    static final class e<T> implements ajfb<ajxm<? extends abyi, ? extends pqd>> {
        private /* synthetic */ pzy a;

        e(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            abyi abyi = (abyi) ajxm.a;
            obj = (pqd) ajxm.b;
            List a = ajyl.a(abyi);
            gcn a2 = gcn.a.a(pzy.a(this.a).d, null);
            akcr.a(obj, "context");
            this.a.o.a((Object) new pqe(a, a2, obj));
        }
    }

    /* renamed from: pzy$f */
    static final class f<T> implements ajfb<Throwable> {
        private /* synthetic */ pzy a;

        f(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            gqr gqr = this.a.i;
            gqt gqt = gqt.NORMAL;
            akcr.a(obj, "it");
            gqr.a(gqt, obj, ((idd) this.a.s.b()));
        }
    }

    /* renamed from: pzy$g */
    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ pzy a;

        g(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "mediaList");
            Iterable<ept> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (ept a : iterable) {
                arrayList.add(pzy.a(this.a, a, false, false, 6));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: pzy$h */
    static final class h<T> implements ajfb<List<? extends era>> {
        private /* synthetic */ pzy a;

        h(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            pzy pzy = this.a;
            String str = "models";
            akcr.a(obj, str);
            akcr.b(obj, str);
            if (!obj.isEmpty()) {
                if (!pzy.a.isEmpty()) {
                    int a = ajym.a(pzy.a, (era) ajyu.f((List) obj));
                    if (a >= 0) {
                        List list = pzy.a;
                        list.subList(a, list.size()).clear();
                    }
                }
                pzy.a.addAll((Collection) obj);
            }
            pzy pzy2 = this.a;
            if (pzy2.e.compareAndSet(true, false)) {
                zmf zmf = pzy2.d;
                if (zmf != null) {
                    zmf.a(znk.a(pzy2.a));
                }
            }
        }
    }

    /* renamed from: pzy$i */
    static final class i<T> implements ajfb<eqq<ept>> {
        private /* synthetic */ pzy a;

        i(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ void accept(Object obj) {
            eqq eqq = (eqq) obj;
            int i = 0;
            if (eqq instanceof eqp) {
                pzy pzy = this.a;
                ept ept = ((eqp) eqq).a;
                era a = pzy.a(pzy, ept, false, false, 6);
                int a2 = ajym.a(pzy.a, a);
                if (a2 >= 0) {
                    a = (era) pzy.a.get(a2);
                    pzy.a.set(a2, pzy.a(ept, a.c(), a.d()));
                } else {
                    pzy.a.add((-a2) - 1, a);
                }
                zmf zmf = pzy.d;
                if (zmf != null) {
                    zmf.a(znk.a(pzy.a));
                }
                return;
            }
            if (eqq instanceof eqr) {
                pzy pzy2 = this.a;
                ArrayList arrayList = new ArrayList();
                Iterable<era> iterable = pzy2.a;
                Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (era era : iterable) {
                    arrayList2.add(ajxs.a(Long.valueOf(era.getId()), era));
                }
                Map a3 = ajzm.a((Iterable) (List) arrayList2);
                ifp ifp = pzy2.c;
                if (ifp != null) {
                    int i2 = ifp.b.get();
                    if (i2 >= 0) {
                        while (true) {
                            arrayList.add(ifp.a(i).b((ajdw) pzy2.k().i()));
                            if (i == i2) {
                                break;
                            }
                            i++;
                        }
                    }
                    ajej e = ajdx.a(ajde.a((Iterable) arrayList)).a((ajdw) pzy2.k().b()).a((Callable) p.a, (ajew) new n(pzy2, arrayList, a3)).a((ajdw) pzy2.k().l()).e((ajfb) new o(pzy2, arrayList, a3));
                    akcr.a((Object) e, "Single.concat(pageLoads)…s))\n                    }");
                    ajvv.a(e, pzy2.g);
                }
            }
        }
    }

    /* renamed from: pzy$j */
    static final class j<T> implements ajfb<pzp> {
        private /* synthetic */ pzy a;

        j(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ void accept(Object obj) {
            List a = this.a.q.a();
            int size = a.size();
            if (size > 0) {
                this.a.l.a();
                if (size == 1) {
                    ept ept = (ept) a.get(0);
                    if ((ept instanceof epu) && ((epu) ept).j()) {
                        this.a.l.i();
                        return;
                    } else {
                        this.a.l.h();
                        return;
                    }
                }
                this.a.l.i();
                return;
            }
            this.a.l.g();
        }
    }

    /* renamed from: pzy$k */
    static final class k<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pzy a;

        k(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            prx prx = (prx) obj;
            akcr.b(prx, "api");
            return prx.a(pzy.a(this.a).a);
        }
    }

    /* renamed from: pzy$l */
    static final class l<T, R> implements ajfc<T, R> {
        private /* synthetic */ pzy a;

        l(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            BasicFeedInfo basicFeedInfo = (BasicFeedInfo) obj;
            akcr.b(basicFeedInfo, "feedInfo");
            if (basicFeedInfo.isGroup()) {
                Object key = basicFeedInfo.key();
                akcr.a(key, "feedInfo.key()");
                obj = basicFeedInfo.feedDisplayName();
                if (obj == null) {
                    akcr.a();
                }
                akcr.a(obj, "feedInfo.feedDisplayName()!!");
                return new prh(key, obj, (byte) 0);
            }
            iqw iqw = (iqw) this.a.p.get();
            String friendUserName = basicFeedInfo.friendUserName();
            if (friendUserName == null) {
                akcr.a();
            }
            String str = "feedInfo.friendUserName()!!";
            akcr.a((Object) friendUserName, str);
            String a = iqw.a(friendUserName);
            if (a == null) {
                akcr.a();
            }
            Object friendUserName2 = basicFeedInfo.friendUserName();
            if (friendUserName2 == null) {
                akcr.a();
            }
            akcr.a(friendUserName2, str);
            obj = basicFeedInfo.friendDisplayName();
            if (obj == null) {
                akcr.a();
            }
            akcr.a(obj, "feedInfo.friendDisplayName()!!");
            return new psu(a, friendUserName2, obj, (byte) 0);
        }
    }

    /* renamed from: pzy$m */
    static final class m<T, R> implements ajfc<Throwable, pqd> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return new pra();
        }
    }

    /* renamed from: pzy$n */
    static final class n<T1, T2> implements ajew<U, T> {
        private /* synthetic */ pzy a;
        private /* synthetic */ ArrayList b;
        private /* synthetic */ Map c;

        n(pzy pzy, ArrayList arrayList, Map map) {
            this.a = pzy;
            this.b = arrayList;
            this.c = map;
        }

        public final /* synthetic */ void accept(Object obj, Object obj2) {
            List list = (List) obj;
            obj2 = (List) obj2;
            akcr.a(obj2, "input");
            Iterable<ept> iterable = (Iterable) obj2;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (ept ept : iterable) {
                era era = (era) this.c.get(Long.valueOf(ept.c()));
                arrayList.add(era != null ? this.a.a(ept, era.c(), era.d()) : pzy.a(this.a, ept, false, false, 6));
            }
            list.addAll((List) arrayList);
        }
    }

    /* renamed from: pzy$o */
    static final class o<T> implements ajfb<List<era>> {
        private /* synthetic */ pzy a;
        private /* synthetic */ ArrayList b;
        private /* synthetic */ Map c;

        o(pzy pzy, ArrayList arrayList, Map map) {
            this.a = pzy;
            this.b = arrayList;
            this.c = map;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            this.a.a.clear();
            List list = this.a.a;
            akcr.a(obj, "newViewModels");
            list.addAll((Collection) obj);
            zmf zmf = this.a.d;
            if (zmf != null) {
                zmf.a(znk.a(this.a.a));
            }
        }
    }

    /* renamed from: pzy$q */
    static final class q<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pzy a;

        q(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ept ept = (ept) obj;
            akcr.b(ept, "cameraRollMedia");
            return ((epq) this.a.m.get()).a(ept, pql.a.d.b);
        }
    }

    /* renamed from: pzy$r */
    static final class r<T, R> implements ajfc<T, R> {
        private /* synthetic */ pzy a;

        r(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "mediaPackages");
            return ajvv.a(this.a.n.a(pzy.a(this.a), list, pql.j.callsite("GalleryPresenter"), this.a.k(), false), this.a.b);
        }
    }

    /* renamed from: pzy$s */
    static final class s<T> implements ajfb<ajej> {
        public static final s a = new s();

        s() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: pzy$t */
    static final class t<T> implements ajfb<Throwable> {
        private /* synthetic */ pzy a;

        t(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            gqr gqr = this.a.i;
            gqt gqt = gqt.HIGH;
            akcr.a(obj, "it");
            gqr.a(gqt, obj, ((idd) this.a.s.b()));
            pzy pzy = this.a;
            String string = pzy.j.getString(R.string.chat_retry_sending_failed);
            akcr.a((Object) string, "appContext.getString(R.s…hat_retry_sending_failed)");
            Integer valueOf = Integer.valueOf(R.color.error_red);
            pzy.k.b(sdt.a(new seg(string, valueOf, 12)).a(sec.FAILED_SNAP_AND_CHAT).b(valueOf).a());
        }
    }

    /* renamed from: pzy$v */
    static final class v<T> implements ajfb<pqh> {
        private /* synthetic */ pzy a;

        v(pzy pzy) {
            this.a = pzy;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (pqh) obj;
            pzy pzy = this.a;
            akcr.a(obj, "it");
            pzy.h = obj;
        }
    }

    /* renamed from: pzy$w */
    static final class w implements ajev {
        private /* synthetic */ pzy a;

        w(pzy pzy) {
            this.a = pzy;
        }

        public final void run() {
            this.a.l.b();
        }
    }

    /* renamed from: pzy$c */
    static final class c extends akcs implements akbk<idd> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return pql.j.callsite("GalleryPresenter");
        }
    }

    /* renamed from: pzy$d */
    static final class d extends akcs implements akbk<pzc> {
        private /* synthetic */ pzy a;

        d(pzy pzy) {
            this.a = pzy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (pzc) this.a.r.get();
        }
    }

    /* renamed from: pzy$u */
    static final class u extends akcs implements akbk<zfw> {
        private /* synthetic */ pzy a;
        private /* synthetic */ zgb b;

        u(pzy pzy, zgb zgb) {
            this.a = pzy;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(((idd) this.a.s.b()));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(pzy.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(pzy.class), "schedulersProvider", "getSchedulersProvider()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(pzy.class), "drawerActionMetricsController", "getDrawerActionMetricsController()Lcom/snap/messaging/chat/features/drawer/DrawerActionMetricsController;")};
    }

    public pzy(gqr gqr, Context context, sdu sdu, ajdp<Integer> ajdp, int i, b bVar, eqc eqc, ajdp<ajxm<pvh, achi<zjm, zjk>>> ajdp2, zkf zkf, ajwy<epq> ajwy, ajdp<pqh> ajdp3, qax qax, zgb zgb, pxo pxo, ajws<pqe> ajws, ajdx<prx> ajdx, ajwy<iqw> ajwy2, pzq pzq, ajwy<pzc> ajwy3) {
        gqr gqr2 = gqr;
        Context context2 = context;
        sdu sdu2 = sdu;
        ajdp<Integer> ajdp4 = ajdp;
        b bVar2 = bVar;
        eqc eqc2 = eqc;
        ajdp<ajxm<pvh, achi<zjm, zjk>>> ajdp5 = ajdp2;
        zkf zkf2 = zkf;
        ajwy<epq> ajwy4 = ajwy;
        ajdp<pqh> ajdp6 = ajdp3;
        qax qax2 = qax;
        zgb zgb2 = zgb;
        pxo pxo2 = pxo;
        ajws<pqe> ajws2 = ajws;
        ajdx<prx> ajdx2 = ajdx;
        ajwy<iqw> ajwy5 = ajwy2;
        akcr.b(gqr2, "exceptionTracker");
        akcr.b(context2, "appContext");
        akcr.b(sdu2, "notificationEmitter");
        akcr.b(ajdp4, "keyboardHeight");
        akcr.b(bVar2, "view");
        akcr.b(eqc2, "provider");
        akcr.b(ajdp5, "navigateObservable");
        akcr.b(zkf2, "bus");
        akcr.b(ajwy4, "cameraRollMediaToMediaPackageBuilder");
        akcr.b(ajdp6, "chatContextObservable");
        akcr.b(qax2, "sendingDelegate");
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(pxo2, "orchestrator");
        akcr.b(ajws2, "editEventSubject");
        akcr.b(ajdx2, "messagingApi");
        akcr.b(ajwy2, "friendApi");
        akcr.b(pzq, "selectionStateManager");
        akcr.b(ajwy3, "drawerActionMetricsControllerProvider");
        super(pxo2, ajdp4, ajdp5);
        this.i = gqr2;
        this.j = context2;
        this.k = sdu2;
        this.w = i;
        this.l = bVar2;
        this.x = eqc2;
        this.y = zkf2;
        this.m = ajwy4;
        this.z = ajdp6;
        this.n = qax2;
        this.A = pxo2;
        this.o = ajws2;
        this.B = ajdx2;
        this.p = ajwy2;
        ajwy<pzc> ajwy6 = ajwy3;
        this.q = pzq;
        this.r = ajwy6;
        this.t = ajxh.a(new u(this, zgb));
        this.u = ajxh.a(new d(this));
        this.v = new erd(pzx.CAMERA_ROLL_IMAGE, pzx.CAMERA_ROLL_VIDEO);
        this.a = new ArrayList();
        this.b = new ajei();
        this.e = new AtomicBoolean(false);
        this.g = new ajei();
    }

    static /* synthetic */ era a(pzy pzy, ept ept, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return pzy.a(ept, z, z2);
    }

    private final void a(ept ept) {
        ajej a = ajwc.a(b(ept), m()).a((ajfb) new e(this), (ajfb) new f(this));
        akcr.a((Object) a, "Singles.zip(buildMediaPa…lsite)\n                })");
        ajvv.a(a, this.b);
    }

    private final ajdx<abyi> b(ept ept) {
        Object d = ajdx.b((Object) ept).a((ajfc) new a(this)).b((ajdw) k().f()).d((ajfb) b.a);
        akcr.a(d, "Single.just(media)\n     …ckage\")\n                }");
        return d;
    }

    private final pzc l() {
        return (pzc) this.u.b();
    }

    private final ajdx<pqd> m() {
        Object g = this.B.a((ajfc) new k(this)).b((ajdw) k().i()).f(new l(this)).g(m.a);
        akcr.a(g, "messagingApi.flatMap { a…ntext()\n                }");
        return g;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0026 in {2, 4, 7, 9} preds:[]
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
    final defpackage.era a(defpackage.ept r3, boolean r4, boolean r5) {
        /*
        r2 = this;
        r0 = r3 instanceof defpackage.eps;
        if (r0 == 0) goto L_0x0011;
        r0 = r2.v;
        r3 = (defpackage.eps) r3;
        r1 = defpackage.ere.ALL;
        r3 = r0.a(r3, r1, r4, r5);
        r3 = (defpackage.era) r3;
        return r3;
        r0 = r3 instanceof defpackage.epu;
        if (r0 == 0) goto L_0x0020;
        r0 = r2.v;
        r3 = (defpackage.epu) r3;
        r1 = defpackage.ere.ALL;
        r3 = r0.a(r3, r1, r4, r5);
        goto L_0x000e;
        r3 = new ajxk;
        r3.<init>();
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzy.a(ept, boolean, boolean):era");
    }

    public final void a() {
        this.l.d();
        l().a(pzk.GALLERY_DRAWER, aajm.CLOSE, 0);
    }

    public final void a(zmf zmf) {
        akcr.b(zmf, "adapter");
        ifp a = eqm.a.a(this.x, null, null, 0, 31).a(k().f());
        this.c = a;
        this.d = zmf;
        if (this.e.compareAndSet(false, true)) {
            zmf = this.d;
            if (zmf != null) {
                zmf.a(znk.a(this.a));
            }
        }
        ajej f = a.b().p(new g(this)).a((ajdw) k().l()).f((ajfb) new h(this));
        akcr.a((Object) f, "paginator.observe()\n    …oaded()\n                }");
        ajvv.a(f, this.g);
        f = this.x.a((ajdw) k().b()).a((ajdw) k().l()).f((ajfb) new i(this));
        akcr.a((Object) f, "provider.observeContent(…      }\n                }");
        ajvv.a(f, this.g);
        f = this.q.b.f((ajfb) new j(this));
        akcr.a((Object) f, "selectionStateManager.ob…)\n            }\n        }");
        ajvv.a(f, this.g);
    }

    public final void b() {
        this.l.c();
        l().a(pzk.GALLERY_DRAWER, aajm.OPEN, 0);
    }

    public final void c() {
        this.l.e();
        l().a(pzk.GALLERY_DRAWER, aajm.EXPAND, 0);
    }

    public final void d() {
        this.l.f();
        l().a(pzk.GALLERY_DRAWER, aajm.COLLAPSE, 0);
    }

    public final int e() {
        return this.w;
    }

    public final void f() {
        this.c = null;
        this.d = null;
        this.a.clear();
        this.q.a.clear();
        this.g.a();
    }

    public final void g() {
        ajej a = ajdp.b((Iterable) this.q.a()).g((ajfc) new q(this)).a(16).b((ajdw) k().f()).f(new r(this)).a((ajfb) s.a, (ajfb) new t(this));
        akcr.a((Object) a, "Observable.fromIterable(…tion()\n                })");
        ajvv.a(a, this.b);
    }

    public final void h() {
        ifp ifp = this.c;
        if ((ifp == null || !ifp.c()) && !this.e.get()) {
            this.e.getAndSet(true);
            ifp = this.c;
            if (ifp != null) {
                ifp.a();
            }
        }
    }

    public final int i() {
        return this.a.size();
    }

    public final void j() {
        List a = this.q.a();
        if (!a.isEmpty()) {
            a((ept) ajyu.f(a));
        }
    }

    /* Access modifiers changed, original: final */
    public final zfw k() {
        return (zfw) this.t.b();
    }

    @akqq
    public final void onLongPressEvent(pzn pzn) {
        akcr.b(pzn, "event");
        if (!(pzn.a instanceof epu) || !((epu) pzn.a).j()) {
            a(pzn.a);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSelectionEvent(pzo pzo) {
        akcr.b(pzo, "event");
        if (!pzo.b || this.q.a.size() < 10) {
            pzq pzq = this.q;
            ept ept = pzo.a;
            boolean z = pzo.b;
            akcr.b(ept, "item");
            if (z) {
                pzq.a.put(Long.valueOf(ept.c()), ept);
            } else {
                pzq.a.remove(Long.valueOf(ept.c()));
            }
            pzq.b.a((Object) new pzp(ept, z));
            era a = pzy.a(this, pzo.a, pzo.b, false, 4);
            int a2 = ajym.a(this.a, a);
            if (a2 >= 0) {
                this.a.set(a2, a);
            }
            zmf zmf = this.d;
            if (zmf != null) {
                zmf.a(znk.a(this.a));
            }
        }
    }

    public final ajej start() {
        this.l.a(this);
        ajvv.a(Q_(), this.b);
        ajvv.a((ajej) this.y, this.b);
        ajej a = this.y.a(this);
        akcr.a((Object) a, "bus.subscribe(this)");
        ajvv.a(a, this.b);
        a = this.z.f((ajfb) new v(this));
        akcr.a((Object) a, "chatContextObservable.su…hatContext = it\n        }");
        ajvv.a(a, this.b);
        this.A.a(pzk.GALLERY_DRAWER);
        a = ajek.a((ajev) new w(this));
        akcr.a((Object) a, "Disposables.fromAction {…  view.detach()\n        }");
        ajvv.a(a, this.b);
        return this.b;
    }
}
