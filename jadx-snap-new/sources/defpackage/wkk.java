package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.ViewGroup;
import com.brightcove.player.event.Event;
import com.brightcove.player.media.ErrorFields;
import com.google.common.base.Supplier;
import com.snap.camera.api.CameraFragment;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.model.StorySnapRecipient;
import com.snap.preview.api.PreviewFragment;
import com.snap.ui.deck.MainPageFragment;
import defpackage.ablu.e;
import defpackage.odr.a;
import defpackage.tqc.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: wkk */
public final class wkk implements wki {
    private final rhs A;
    private final aipn<tpe> B;
    private final aipn<dnu> C;
    private final dnv D;
    private final ajwy<ftl> E;
    private final ajwy<wjr> F;
    final Handler a = new Handler(Looper.getMainLooper());
    volatile wkn b;
    List<wkn> c = new ArrayList();
    final iqs d;
    final ajei e;
    final achb<zjm, zjk> f;
    final aipn<psm> g;
    final aipn<ira> h;
    final aipn<odu> i;
    final aipn<rgt> j;
    final aipn<gfu> k;
    final ablu l;
    final ajwy<rhz> m;
    final ajwy<gpb> n;
    final ajwy<zuj> o;
    final ajwy<qod> p;
    final ajwy<wjw> q;
    final ajwy<wkp> r;
    final ajwy<ppl> s;
    final igi<Boolean> t;
    private final ajxe u = ajxh.a(c.a);
    private final ajxe v = ajxh.a(new ag(this));
    private final ajxe w = ajxh.a(new al(this));
    private final ajxe x = ajxh.a(new u(this));
    private final ajxe y = ajxh.a(new am(this));
    private zgb z;

    /* renamed from: wkk$a */
    public final class a extends zjf {
        private final int a;
        private final zjm b;
        private final MainPageFragment c;
        private acgv<zjm> d;
        private /* synthetic */ wkk e;

        public a(wkk wkk, int i, zjm zjm, MainPageFragment mainPageFragment, acgv<zjm> acgv) {
            akcr.b(zjm, "deckPageType");
            akcr.b(mainPageFragment, Event.FRAGMENT);
            this.e = wkk;
            super(zjm, mainPageFragment, acgv);
            this.a = i;
            this.b = zjm;
            this.c = mainPageFragment;
            this.d = acgv;
        }

        public final zjm a() {
            return this.b;
        }

        public final MainPageFragment b() {
            return this.c;
        }

        public final /* bridge */ /* synthetic */ fv c() {
            return this.c;
        }

        public final /* bridge */ /* synthetic */ achg getDeckPageType() {
            return this.b;
        }

        public final acgv<zjm> getNavigationActionSpec() {
            return this.d;
        }

        public final void onPageUnstacked() {
            super.onPageUnstacked();
            if (this.a == 0) {
                wkn wkn = this.e.b;
                if (!(wkn == null || wkn.s.get())) {
                    this.e.b(wkn);
                    this.e.b().a(false);
                }
                this.e.b = null;
            }
        }
    }

    /* renamed from: wkk$c */
    static final class c extends akcs implements akbk<idd> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return rgr.d.callsite("SendToControllerImpl");
        }
    }

    /* renamed from: wkk$an */
    static final class an extends akcs implements akbl<wkn, Boolean> {
        public static final an a = new an();

        an() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            wkn wkn = (wkn) obj;
            akcr.b(wkn, "it");
            return Boolean.valueOf(wkn.isDisposed());
        }
    }

    /* renamed from: wkk$ag */
    static final class ag extends akcs implements akbk<zfw> {
        private /* synthetic */ wkk a;

        ag(wkk wkk) {
            this.a = wkk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(rgr.d, "SendToControllerImpl");
        }
    }

    /* renamed from: wkk$al */
    static final class al extends akcs implements akbk<rhz> {
        private /* synthetic */ wkk a;

        al(wkk wkk) {
            this.a = wkk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rhz) this.a.m.get();
        }
    }

    /* renamed from: wkk$u */
    static final class u extends akcs implements akbk<acgu<zjm>> {
        private /* synthetic */ wkk a;

        u(wkk wkk) {
            this.a = wkk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((Boolean) this.a.t.a()).booleanValue() ? rgr.a() : rgr.c;
        }
    }

    /* renamed from: wkk$am */
    static final class am extends akcs implements akbk<acgv<zjm>> {
        private /* synthetic */ wkk a;

        am(wkk wkk) {
            this.a = wkk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return acgv.a().a(this.a.d().j()).a();
        }
    }

    /* renamed from: wkk$ap */
    static final class ap<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ftl a;

        ap(ftl ftl) {
            this.a = ftl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue() ? this.a.t(dnd.MEDIA_RECOVERY_TIMEOUT) : ajdp.b(Long.valueOf(-1));
        }
    }

    /* renamed from: wkk$ao */
    static final class ao extends akcs implements akbk<ajxm<? extends ebp, ? extends Long>> {
        private /* synthetic */ wkk a;
        private /* synthetic */ Pair b;

        ao(wkk wkk, Pair pair) {
            this.a = wkk;
            this.b = pair;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj;
            Long l = (Long) ((Supplier) this.b.second).get();
            wkn wkn = this.a.b;
            if (wkn != null) {
                tpl tpl = wkn.h;
                if (tpl != null) {
                    obj = tpl.a;
                    return ((l != null && l.longValue() == -1) || obj == null) ? null : new ajxm(obj, l);
                }
            }
            obj = null;
            if (l != null) {
                return null;
            }
        }
    }

    /* renamed from: wkk$aa */
    static final class aa<T> implements ajfb<tqg> {
        private /* synthetic */ wkk a;
        private /* synthetic */ int b;

        aa(wkk wkk, int i) {
            this.a = wkk;
            this.b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            tqg tqg = (tqg) obj;
            wkk wkk = this.a;
            wkn wkn = wkk.b;
            if (wkn != null) {
                wkn.a(tqg.a);
            }
            wkn = wkk.b;
            if (wkn != null) {
                pth pth = wkn.k;
                if (pth != null) {
                    puw.a(pth, tqg.b);
                }
            }
            wkn = wkk.b;
            if (wkn != null) {
                wkn.u = tqg.c;
            }
            wkk.a(this.b + 1);
        }
    }

    /* renamed from: wkk$ab */
    static final class ab<T> implements ajfb<ajxw> {
        final /* synthetic */ wkk a;
        final /* synthetic */ wkn b;
        private /* synthetic */ ajei c;
        private /* synthetic */ PreviewFragment d;

        /* renamed from: wkk$ab$1 */
        public static final class 1 implements ajfb<Boolean> {
            private volatile ajej a;
            private /* synthetic */ ab b;

            1(ab abVar) {
                this.b = abVar;
                Object obj = ajfq.INSTANCE;
                akcr.a(obj, "Disposables.disposed()");
                this.a = obj;
            }

            public final /* synthetic */ void accept(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    ajej e = ((zuj) this.b.a.o.get()).b().a(ajfu.g).e();
                    akcr.a((Object) e, "uploadMediaManager.get()…             .subscribe()");
                    this.a = ajvv.a(e, this.b.b.b);
                    return;
                }
                this.a.dispose();
            }
        }

        ab(wkk wkk, ajei ajei, PreviewFragment previewFragment, wkn wkn) {
            this.a = wkk;
            this.c = ajei;
            this.d = previewFragment;
            this.b = wkn;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.c.a(this.d.j().j(ajfu.a).f((ajfb) new 1(this)));
        }
    }

    /* renamed from: wkk$ac */
    static final class ac<T> implements ajfb<tqe> {
        private /* synthetic */ wkk a;

        ac(wkk wkk) {
            this.a = wkk;
        }

        public final /* synthetic */ void accept(Object obj) {
            tqe tqe = (tqe) obj;
            wkn wkn = this.a.b;
            if (wkn != null) {
                wkn.a(tqe.a);
                Iterable<StorySnapRecipient> iterable = tqe.b;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (StorySnapRecipient storySnapRecipient : iterable) {
                    arrayList.add(new rhj(storySnapRecipient.getStoryId(), storySnapRecipient.getStoryKind(), new rhe(rhc.STORY, storySnapRecipient.getStoryId()), null, storySnapRecipient.getStoryPostMetadata()));
                }
                wkn.a(new rhl((List) arrayList, null, null, false, null, 126));
                wkn = this.a.b;
                if (wkn != null) {
                    pth pth = wkn.k;
                    if (pth != null) {
                        puw.a(pth, tqe.c);
                    }
                }
                this.a.f();
            }
        }
    }

    /* renamed from: wkk$ad */
    static final class ad<T> implements ajfb<tqc> {
        private /* synthetic */ wkk a;
        private /* synthetic */ int b;

        ad(wkk wkk, int i) {
            this.a = wkk;
            this.b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            tqc tqc = (tqc) obj;
            wkk wkk = this.a;
            wkn wkn = wkk.b;
            if (wkn != null) {
                wkn.a(tqc.a);
            }
            if (tqc instanceof b) {
                wkn = wkk.b;
                if (wkn != null && (wkn.m.a.isEmpty() ^ 1) == 1) {
                    wkn = wkk.b;
                    if (wkn != null) {
                        wkn.c.a((Object) wkk.a(wkn.m));
                    }
                    wkn = wkk.b;
                    if (wkn != null) {
                        pth pth = wkn.k;
                        if (pth != null) {
                            aail aail = tqc.b;
                            if (aail == null) {
                                akcr.a();
                            }
                            puw.a(pth, aail);
                        }
                    }
                    wkk.f();
                    return;
                }
            }
            wkn = wkk.b;
            if (wkn != null) {
                wkn.u = tqc.c;
            }
            wkk.a(this.b + 1);
        }
    }

    /* renamed from: wkk$ae */
    static final class ae implements Runnable {
        private /* synthetic */ wkk a;
        private /* synthetic */ a b;
        private /* synthetic */ tpf c;

        ae(wkk wkk, a aVar, tpf tpf) {
            this.a = wkk;
            this.b = aVar;
            this.c = tpf;
        }

        public final void run() {
            this.a.l.a(e.PREVIEW_BEGIN_PREPARATION);
            achb achb = this.a.f;
            achd achd = this.b;
            acgu acgu = toc.c;
            akcr.a((Object) acgu, "PreviewFeature.PREVIEW_PRESENT_DEFAULT");
            achb.a(achd, acgu, (acih) this.c);
        }
    }

    /* renamed from: wkk$b */
    public final class b {
        final ajdx<Uri> a;
        final ajcx b;
        private /* synthetic */ wkk c;

        public b(wkk wkk, ajdx<Uri> ajdx, ajcx ajcx) {
            akcr.b(ajdx, MessageMediaRefModel.URI);
            akcr.b(ajcx, "releaseSessionCompletable");
            this.c = wkk;
            this.a = ajdx;
            this.b = ajcx;
        }
    }

    /* renamed from: wkk$d */
    static final class d implements Runnable {
        private /* synthetic */ wkk a;
        private /* synthetic */ wkn b;

        d(wkk wkk, wkn wkn) {
            this.a = wkk;
            this.b = wkn;
        }

        public final void run() {
            wkn wkn = this.b;
            achb achb = this.a.f;
            akcr.b(achb, "navigationHost");
            wjx wjx = wkn.o;
            if (wjx instanceof wjz) {
                achb.a(false);
                return;
            }
            acig acio;
            if (wjx instanceof wjy) {
                acio = new acio(((wjy) wkn.o).a, false, false);
            } else {
                if (wjx == null) {
                    acio acio2;
                    rhl rhl = wkn.m;
                    Collection arrayList = new ArrayList();
                    for (Object next : rhl.a) {
                        if (next instanceof rhj) {
                            arrayList.add(next);
                        }
                    }
                    if ((((List) arrayList).size() == rhl.a.size() ? 1 : null) != null) {
                        acio2 = new acio(dnh.a, false, false);
                    } else {
                        for (Object next2 : wkn.m.a) {
                            Object obj;
                            rhn rhn = (rhn) next2;
                            if ((!(rhn instanceof rhp) || ((rhp) rhn).j == null) && (!(rhn instanceof rhi) || ((rhi) rhn).b == null)) {
                                obj = null;
                                continue;
                            } else {
                                obj = 1;
                                continue;
                            }
                            if (obj != null) {
                                break;
                            }
                        }
                        Object next22 = null;
                        rhn rhn2 = (rhn) next22;
                        zjm zjm;
                        if (rhn2 == null) {
                            acio2 = new acik(qxo.a);
                        } else if (rhn2 instanceof rhp) {
                            zjm = ((rhp) rhn2).j;
                            if (zjm == null) {
                                akcr.a();
                            }
                            acio2 = new acio(zjm, false, false);
                        } else if (rhn2 instanceof rhi) {
                            zjm = ((rhi) rhn2).b;
                            if (zjm == null) {
                                akcr.a();
                            }
                            acio2 = new acio(zjm, false, false);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    acio = acio2;
                }
            }
            achb.a(acio);
        }
    }

    /* renamed from: wkk$v */
    static final class v implements Runnable {
        private /* synthetic */ wkk a;

        v(wkk wkk) {
            this.a = wkk;
        }

        public final void run() {
            for (Object obj : this.a.f.g()) {
                if ((akcr.a(obj, this.a.f.i()) ^ 1) != 0) {
                    akcr.a(obj, "page");
                    ViewGroup b = obj.b();
                    if (b != null) {
                        b.setVisibility(4);
                    }
                }
            }
        }
    }

    /* renamed from: wkk$y */
    static final class y implements Runnable {
        private /* synthetic */ wkk a;
        private /* synthetic */ zjk b;
        private /* synthetic */ rhm c;

        y(wkk wkk, zjk zjk, rhm rhm) {
            this.a = wkk;
            this.b = zjk;
            this.c = rhm;
        }

        public final void run() {
            achb achb = this.a.f;
            achd achd = this.b;
            acgu d = this.a.d();
            akcr.a((Object) d, "presentSendToNavigationAction");
            achb.a(achd, d, (acih) this.c);
        }
    }

    /* renamed from: wkk$af */
    static final class af<T> implements ajfb<ajxw> {
        private /* synthetic */ wkk a;
        private /* synthetic */ wkn b;

        af(wkk wkk, wkn wkn) {
            this.a = wkk;
            this.b = wkn;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(this.b);
        }
    }

    /* renamed from: wkk$ah */
    static final class ah<T, R> implements ajfc<List<? extends abyi>, ajdb> {
        final /* synthetic */ wkk a;
        final /* synthetic */ wkn b;

        /* renamed from: wkk$ah$a */
        static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ ah a;

            a(ah ahVar) {
                this.a = ahVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                wko wko = (wko) obj;
                akcr.b(wko, "it");
                return ((psm) this.a.a.g.get()).a(wko.c, wko.a, this.a.b.k, (zub) ajyu.g(wko.b), this.a.b.p);
            }
        }

        ah(wkk wkk, wkn wkn) {
            this.a = wkk;
            this.b = wkn;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:103:0x032c in {5, 6, 11, 12, 15, 18, 19, 21, 27, 30, 31, 42, 46, 49, 50, 56, 62, 63, 65, 69, 73, 74, 81, 82, 87, 88, 89, 92, 93, 96, 97, 99, 102} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private defpackage.ajcx a(java.util.List<defpackage.abyi> r23) {
            /*
            r22 = this;
            r1 = r22;
            r0 = r23;
            r2 = "mediaPackages";
            defpackage.akcr.b(r0, r2);
            r2 = r1.b;
            r3 = r1.a;
            r3 = r3.n;
            r3 = r3.get();
            r4 = "userAuth.get()";
            defpackage.akcr.a(r3, r4);
            r3 = (defpackage.gpb) r3;
            r3 = r3.b();
            r4 = "userAuth.get().username";
            defpackage.akcr.a(r3, r4);
            r4 = "sender";
            defpackage.akcr.b(r3, r4);
            r2 = r2.m;
            r2 = r2.a;
            r2 = (java.lang.Iterable) r2;
            r4 = new java.util.ArrayList;
            r5 = 10;
            r6 = defpackage.ajyn.a(r2, r5);
            r4.<init>(r6);
            r4 = (java.util.Collection) r4;
            r2 = r2.iterator();
            r6 = r2.hasNext();
            r7 = 0;
            if (r6 == 0) goto L_0x00b2;
            r6 = r2.next();
            r6 = (defpackage.rhn) r6;
            r8 = r6 instanceof defpackage.rhp;
            if (r8 == 0) goto L_0x0064;
            r7 = new com.snap.core.model.FriendMessageRecipient;
            r6 = (defpackage.rhp) r6;
            r6 = r6.b;
            r6 = defpackage.ajyl.a(r6);
            r6 = defpackage.pvg.a(r3, r6);
            r7.<init>(r6);
            r7 = (com.snap.core.model.MessageRecipient) r7;
            goto L_0x00a6;
            r8 = r6 instanceof defpackage.rhj;
            if (r8 == 0) goto L_0x0080;
            r8 = new com.snap.core.model.StorySnapRecipient;
            r9 = r6;
            r9 = (defpackage.rhj) r9;
            r10 = r9.a;
            r11 = r9.b;
            r6 = r6.f;
            if (r6 == 0) goto L_0x0077;
            r7 = r6.a;
            r6 = r9.c;
            r8.<init>(r10, r11, r7, r6);
            r7 = r8;
            r7 = (com.snap.core.model.MessageRecipient) r7;
            goto L_0x00a6;
            r7 = r6 instanceof defpackage.rhi;
            if (r7 == 0) goto L_0x0090;
            r7 = new com.snap.core.model.GroupMessageRecipient;
            r6 = (defpackage.rhi) r6;
            r6 = r6.d;
            r6 = (java.lang.String) r6;
            r7.<init>(r6);
            goto L_0x0061;
            r7 = r6 instanceof defpackage.rho;
            if (r7 == 0) goto L_0x00aa;
            r7 = new com.snap.core.model.FriendMessageRecipient;
            r6 = (defpackage.rho) r6;
            r6 = r6.c;
            r6 = defpackage.ajyl.a(r6);
            r6 = defpackage.pvg.a(r3, r6);
            r7.<init>(r6);
            goto L_0x0061;
            r4.add(r7);
            goto L_0x003f;
            r0 = new java.lang.UnsupportedOperationException;
            r0.<init>();
            r0 = (java.lang.Throwable) r0;
            throw r0;
            r4 = (java.util.List) r4;
            r2 = r4;
            r2 = (java.lang.Iterable) r2;
            r3 = new java.util.ArrayList;
            r3.<init>();
            r3 = (java.util.Collection) r3;
            r2 = r2.iterator();
            r6 = r2.hasNext();
            if (r6 == 0) goto L_0x00d7;
            r6 = r2.next();
            r8 = r6;
            r8 = (com.snap.core.model.MessageRecipient) r8;
            r8 = r8 instanceof com.snap.core.model.StorySnapRecipient;
            if (r8 != 0) goto L_0x00c2;
            r3.add(r6);
            goto L_0x00c2;
            r10 = r3;
            r10 = (java.util.List) r10;
            r2 = r1.a;
            r3 = r1.b;
            r6 = r2.a;
            r8 = new wkk$d;
            r8.<init>(r2, r3);
            r8 = (java.lang.Runnable) r8;
            r6.post(r8);
            r2 = r1.a;
            r2 = r2.b;
            if (r2 == 0) goto L_0x00f3;
            r2 = r2.q;
            goto L_0x00f4;
            r2 = r7;
            r3 = r1.a;
            r3.b = r7;
            r3 = r3.c;
            monitor-enter(r3);
            r6 = r1.a;	 Catch:{ all -> 0x0329 }
            r6 = r6.c;	 Catch:{ all -> 0x0329 }
            r8 = r1.b;	 Catch:{ all -> 0x0329 }
            r6.add(r8);	 Catch:{ all -> 0x0329 }
            monitor-exit(r3);
            r3 = r1.b;
            r3 = r3.m;
            r3 = r3.a;
            r3 = (java.lang.Iterable) r3;
            r6 = new java.util.ArrayList;
            r6.<init>();
            r6 = (java.util.Collection) r6;
            r3 = r3.iterator();
            r8 = r3.hasNext();
            if (r8 == 0) goto L_0x012a;
            r8 = r3.next();
            r9 = r8 instanceof defpackage.rho;
            if (r9 == 0) goto L_0x0118;
            r6.add(r8);
            goto L_0x0118;
            r6 = (java.util.List) r6;
            r6 = (java.lang.Iterable) r6;
            r3 = new java.util.ArrayList;
            r5 = defpackage.ajyn.a(r6, r5);
            r3.<init>(r5);
            r3 = (java.util.Collection) r3;
            r5 = r6.iterator();
            r6 = r5.hasNext();
            if (r6 == 0) goto L_0x0159;
            r6 = r5.next();
            r6 = (defpackage.rho) r6;
            r8 = r6.a;
            r8 = java.lang.Long.valueOf(r8);
            r6 = r6.b;
            r6 = defpackage.ajxs.a(r8, r6);
            r3.add(r6);
            goto L_0x013d;
            r3 = (java.util.List) r3;
            r3 = (java.lang.Iterable) r3;
            r3 = defpackage.ajzm.a(r3);
            r5 = r3.isEmpty();
            if (r5 == 0) goto L_0x016e;
            r3 = defpackage.ajhn.a;
            r3 = defpackage.ajvo.a(r3);
            goto L_0x017c;
            r5 = r1.a;
            r5 = r5.h;
            r5 = r5.get();
            r5 = (defpackage.ira) r5;
            r3 = r5.a(r3);
            r5 = "if (friendKeyToUsernameM…s(friendKeyToUsernameMap)";
            defpackage.akcr.a(r3, r5);
            r5 = r1.b;
            r5 = r5.m;
            r5 = r5.a;
            r5 = (java.lang.Iterable) r5;
            r6 = new java.util.ArrayList;
            r6.<init>();
            r6 = (java.util.Collection) r6;
            r5 = r5.iterator();
            r8 = r5.hasNext();
            if (r8 == 0) goto L_0x01a6;
            r8 = r5.next();
            r9 = r8 instanceof defpackage.rhp;
            if (r9 == 0) goto L_0x0194;
            r6.add(r8);
            goto L_0x0194;
            r6 = (java.util.List) r6;
            r6 = (java.lang.Iterable) r6;
            r5 = new java.util.ArrayList;
            r5.<init>();
            r5 = (java.util.Collection) r5;
            r6 = r6.iterator();
            r8 = r6.hasNext();
            if (r8 == 0) goto L_0x01d3;
            r8 = r6.next();
            r9 = r8;
            r9 = (defpackage.rhp) r9;
            r9 = r9.e;
            r9 = r9.a;
            r11 = defpackage.rhc.NON_FRIEND_USER;
            if (r9 != r11) goto L_0x01cc;
            r9 = 1;
            goto L_0x01cd;
            r9 = 0;
            if (r9 == 0) goto L_0x01b5;
            r5.add(r8);
            goto L_0x01b5;
            r5 = (java.util.List) r5;
            r5 = (java.lang.Iterable) r5;
            r5 = r5.iterator();
            r6 = r5.hasNext();
            if (r6 == 0) goto L_0x0206;
            r6 = r5.next();
            r6 = (defpackage.rhp) r6;
            r8 = r1.a;
            r8 = r8.d;
            r9 = "userRecipient";
            defpackage.akcr.b(r6, r9);
            r9 = new isj;
            r12 = r6.b;
            r13 = r6.a;
            r14 = defpackage.aecr.ADDED_BY_USERNAME;
            r16 = defpackage.iqt.SEARCH;
            r17 = defpackage.ith.SEND_TO_SEARCH;
            r15 = "";
            r11 = r9;
            r11.<init>(r12, r13, r14, r15, r16, r17);
            r8.a(r9);
            goto L_0x01db;
            r5 = r1.b;
            r5 = r5.m;
            r5 = r5.d;
            if (r5 == 0) goto L_0x023b;
            r6 = r1.a;
            r6 = r6.g;
            r6 = r6.get();
            r9 = r6;
            r9 = (defpackage.psm) r9;
            r11 = r5;
            r11 = (defpackage.puk) r11;
            r5 = new pth;
            r13 = defpackage.gcn.SEND_TO;
            r14 = 0;
            r15 = 0;
            r16 = 0;
            r18 = 0;
            r19 = 0;
            r20 = 0;
            r21 = 16382; // 0x3ffe float:2.2956E-41 double:8.094E-320;
            r12 = r5;
            r12.<init>(r13, r14, r15, r16, r18, r19, r20, r21);
            r13 = 0;
            r6 = r1.b;
            r14 = r6.p;
            r5 = r9.a(r10, r11, r12, r13, r14);
            if (r5 != 0) goto L_0x0246;
            r5 = "";
            r5 = defpackage.ajdx.b(r5);
            r6 = "Single.just(\"\")";
            defpackage.akcr.a(r5, r6);
            r6 = r1.b;
            r6 = r6.k;
            r6 = r6.e;
            if (r6 != 0) goto L_0x0262;
            r6 = r1.b;
            r6 = r6.k;
            r8 = defpackage.ajyu.g(r23);
            r8 = (defpackage.abyi) r8;
            if (r8 == 0) goto L_0x0260;
            r8 = r8.e;
            if (r8 == 0) goto L_0x0260;
            r7 = r8.h;
            r6.e = r7;
            r6 = r1.b;
            r6 = r6.k;
            r7 = r1.b;
            r7 = r7.l;
            r7 = r7.c;
            r6.m = r7;
            if (r2 == 0) goto L_0x02ac;
            r6 = r1.b;
            r6 = r6.k;
            r15 = new ptd;
            r8 = r2.b;
            if (r8 != 0) goto L_0x027d;
            defpackage.akcr.a();
            r9 = r2.c;
            r10 = r2.a();
            r7 = r2.a;
            r11 = r7.e();
            r7 = r2.a;
            r12 = r7.a();
            r7 = r2.a;
            r13 = r7.b();
            r7 = r2.a;
            r14 = r7.c();
            r2 = r2.a;
            r2 = r2.d();
            r7 = r15;
            r16 = r3;
            r3 = r15;
            r15 = r2;
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15);
            r6.h = r3;
            goto L_0x02ae;
            r16 = r3;
            r2 = r1.a;
            r2 = r2.r;
            r2 = r2.get();
            r2 = (defpackage.wkp) r2;
            r3 = r1.b;
            r6 = "session";
            defpackage.akcr.b(r3, r6);
            r6 = "mediaPackages";
            defpackage.akcr.b(r0, r6);
            r6 = "recipients";
            defpackage.akcr.b(r4, r6);
            r6 = defpackage.wkg.a(r3, r0);
            if (r6 == 0) goto L_0x02e4;
            r6 = new wkp$b;
            r2 = (defpackage.wkp) r2;
            r6.<init>(r2);
            r6 = (defpackage.akca) r6;
            r7 = new wkp$c;
            r7.<init>(r2);
            r7 = (defpackage.akca) r7;
            r0 = defpackage.wkp.a(r3, r0, r4, r6, r7);
            goto L_0x02fd;
            r6 = defpackage.wkg.b(r3, r0);
            if (r6 == 0) goto L_0x02f9;
            r6 = new wkp$d;
            r2 = (defpackage.wkp) r2;
            r6.<init>(r2);
            r6 = (defpackage.akca) r6;
            r7 = new wkp$e;
            r7.<init>(r2);
            goto L_0x02dd;
            r0 = r2.a(r3, r0, r4);
            r2 = new wkk$ah$a;
            r2.<init>(r1);
            r2 = (defpackage.ajfc) r2;
            r0 = r0.n(r2);
            r2 = 16;
            r0 = r0.a(r2);
            r0 = (defpackage.ajeb) r0;
            r0 = defpackage.ajcx.a(r0);
            r5 = (defpackage.ajeb) r5;
            r2 = defpackage.ajcx.a(r5);
            r2 = (defpackage.ajdb) r2;
            r0 = r0.c(r2);
            r3 = r16;
            r3 = (defpackage.ajdb) r3;
            r0 = r0.d(r3);
            return r0;
            r0 = move-exception;
            monitor-exit(r3);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wkk$ah.a(java.util.List):ajcx");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((List) obj);
        }
    }

    /* renamed from: wkk$ai */
    static final class ai implements ajev {
        private /* synthetic */ wkk a;

        ai(wkk wkk) {
            this.a = wkk;
        }

        public final void run() {
            this.a.b().b();
        }
    }

    /* renamed from: wkk$aj */
    static final class aj implements ajev {
        private /* synthetic */ wkk a;
        private /* synthetic */ wkn b;

        aj(wkk wkk, wkn wkn) {
            this.a = wkk;
            this.b = wkn;
        }

        public final void run() {
            this.a.b(this.b);
        }
    }

    /* renamed from: wkk$ak */
    static final class ak<T> implements ajfb<Throwable> {
        private /* synthetic */ wkk a;
        private /* synthetic */ wkn b;

        ak(wkk wkk, wkn wkn) {
            this.a = wkk;
            this.b = wkn;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b(this.b);
        }
    }

    /* renamed from: wkk$e */
    static final class e<T> implements Supplier<achd<zjm, ?>> {
        private /* synthetic */ wkk a;

        e(wkk wkk) {
            this.a = wkk;
        }

        public final /* synthetic */ Object get() {
            rgt rgt = (rgt) this.a.j.get();
            MainPageFragment h = rgt.a().h();
            Object e = this.a.e();
            akcr.a(e, "sendToPageNavigationActionSpec");
            return rgt.a(h, e);
        }
    }

    /* renamed from: wkk$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ wkk a;

        /* renamed from: wkk$f$1 */
        static final class 1<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ f a;

            1(f fVar) {
                this.a = fVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final zub zub = (zub) obj;
                akcr.b(zub, "ref");
                return ((zuj) this.a.a.o.get()).a(zub).c((Callable) new Callable<zub>() {
                    public final /* bridge */ /* synthetic */ Object call() {
                        return zub;
                    }
                });
            }
        }

        /* renamed from: wkk$f$2 */
        static final class 2<T> implements ajfb<zub> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        f(wkk wkk) {
            this.a = wkk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "refs");
            return list.isEmpty() ? ajdx.b((Object) ajyw.a) : ajdp.b((Iterable) list).n(new 1(this)).b((ajfb) 2.a).a(16);
        }
    }

    /* renamed from: wkk$g */
    static final class g<T> implements ajfb<List<? extends zub>> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: wkk$h */
    static final class h<T> implements ajfb<Throwable> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: wkk$i */
    static final class i<T, R> implements ajfc<List<? extends abyi>, ajdb> {
        private /* synthetic */ wkk a;
        private /* synthetic */ wkn b;

        i(wkk wkk, wkn wkn) {
            this.a = wkk;
            this.b = wkn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (List) obj;
            String str = "it";
            akcr.b(obj, str);
            if ((((Collection) obj).isEmpty() ^ 1) == 0) {
                obj = null;
            }
            if (obj != null) {
                odu odu = (odu) this.a.i.get();
                idd a = this.b.a();
                akcr.a(obj, str);
                ajcx d = odu.d(a, obj);
                if (d != null) {
                    return d;
                }
            }
            return ajvo.a(ajhn.a);
        }
    }

    /* renamed from: wkk$j */
    static final class j implements ajev {
        private /* synthetic */ wkk a;
        private /* synthetic */ wkn b;

        j(wkk wkk, wkn wkn) {
            this.a = wkk;
            this.b = wkn;
        }

        public final void run() {
            this.b.dispose();
            this.a.c.remove(this.b);
            this.a.s.get();
        }
    }

    /* renamed from: wkk$k */
    static final class k implements ajev {
        public static final k a = new k();

        k() {
        }

        public final void run() {
        }
    }

    /* renamed from: wkk$l */
    static final class l<T> implements ajfb<Throwable> {
        public static final l a = new l();

        l() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: wkk$m */
    static final class m<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ wkk a;
        private /* synthetic */ wkn b;

        m(wkk wkk, wkn wkn) {
            this.a = wkk;
            this.b = wkn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return ((odu) this.a.i.get()).a(this.b.a(), list);
        }
    }

    /* renamed from: wkk$n */
    static final class n<T, R> implements ajfc<abyk, ajdb> {
        private /* synthetic */ wkk a;
        private /* synthetic */ wkn b;

        n(wkk wkk, wkn wkn) {
            this.a = wkk;
            this.b = wkn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abyk abyk = (abyk) obj;
            akcr.b(abyk, "it");
            return ((odu) this.a.i.get()).c(this.b.a(), abyk.b());
        }
    }

    /* renamed from: wkk$o */
    static final class o<T, R> implements ajfc<T, R> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            abyk abyk = (abyk) obj;
            akcr.b(abyk, "mediaPackageSession");
            return a.a(abyk.b(), 0, null, Integer.valueOf(640), null, 22);
        }
    }

    /* renamed from: wkk$p */
    static final class p<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ wkk a;

        p(wkk wkk) {
            this.a = wkk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Uri uri = (Uri) obj;
            akcr.b(uri, MessageMediaRefModel.URI);
            return ((gfu) this.a.k.get()).a(uri, (idl) rgr.a, true, new gdy[0]).f(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((gej) obj, "it");
                    return uri;
                }
            });
        }
    }

    /* renamed from: wkk$q */
    static final class q<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ wkk a;
        private /* synthetic */ wkn b;
        private /* synthetic */ idd c;

        q(wkk wkk, wkn wkn, idd idd) {
            this.a = wkk;
            this.b = wkn;
            this.c = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            wkn wkn = this.b;
            Object obj2 = (wkg.a(wkn, list) || wkg.b(wkn, list)) ? 1 : null;
            if (obj2 == null) {
                return ((wjw) this.a.q.get()).a(this.c, list, this.b.j instanceof ptk);
            }
            obj = ajdx.b((Object) ajyw.a);
            akcr.a(obj, "Single.just(emptyList())");
            return obj;
        }
    }

    /* renamed from: wkk$r */
    static final class r<T> implements ajfb<List<? extends zub>> {
        private /* synthetic */ wkk a;
        private /* synthetic */ wkn b;
        private /* synthetic */ idd c;

        r(wkk wkk, wkn wkn, idd idd) {
            this.a = wkk;
            this.b = wkn;
            this.c = idd;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            zue zue = new zue(this.b.k.l, this.b.k.a.snapSource, aarv.SEND_TO_PRE_UPLOAD);
            akcr.a(obj, "it");
            for (zub a : (Iterable) obj) {
                ((zuj) this.a.o.get()).a(this.c, a, zue, (rzu.b) this.a.p.get());
            }
        }
    }

    /* renamed from: wkk$s */
    static final class s<T> implements ajfb<List<? extends zub>> {
        public static final s a = new s();

        s() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: wkk$t */
    static final class t<T> implements ajfb<Throwable> {
        public static final t a = new t();

        t() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: wkk$w */
    static final class w<T> implements ajfb<rgw> {
        private /* synthetic */ wkk a;
        private /* synthetic */ b b;
        private /* synthetic */ wkn c;
        private /* synthetic */ int d;

        /* renamed from: wkk$w$1 */
        static final class 1 implements ajev {
            public static final 1 a = new 1();

            1() {
            }

            public final void run() {
            }
        }

        /* renamed from: wkk$w$2 */
        static final class 2<T> implements ajfb<Throwable> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        w(wkk wkk, b bVar, wkn wkn, int i) {
            this.a = wkk;
            this.b = bVar;
            this.c = wkn;
            this.d = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            rgw rgw = (rgw) obj;
            this.a.e.a(this.b.b.a((ajev) 1.a, (ajfb) 2.a));
            wkn wkn = this.a.b;
            if (wkn != null) {
                int i;
                int i2;
                int i3;
                wkn.a(rgw.a);
                Iterable<rhn> iterable = this.c.m.a;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    i = 0;
                } else {
                    i2 = 0;
                    for (rhn rhn : iterable) {
                        if (rhn.g) {
                            i2++;
                            if (i2 < 0) {
                                ajym.b();
                            }
                        }
                    }
                    i = i2;
                }
                iterable = this.c.m.a;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    i3 = 0;
                } else {
                    i2 = 0;
                    for (rhn rhn2 : iterable) {
                        if (rhn2.h) {
                            i2++;
                            if (i2 < 0) {
                                ajym.b();
                            }
                        }
                    }
                    i3 = i2;
                }
                wkn.c.a((Object) new tpk(this.c.m.b(), null, null, null, i, i3, i > 0, i3 > 0, 782));
            }
            this.a.b().a(true);
            this.a.a(this.d + 1);
        }
    }

    /* renamed from: wkk$x */
    static final class x<T> implements ajfb<rgv> {
        private /* synthetic */ wkk a;
        private /* synthetic */ b b;
        private /* synthetic */ wkn c;
        private /* synthetic */ int d;

        /* renamed from: wkk$x$1 */
        static final class 1 implements ajev {
            public static final 1 a = new 1();

            1() {
            }

            public final void run() {
            }
        }

        /* renamed from: wkk$x$2 */
        static final class 2<T> implements ajfb<Throwable> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        x(wkk wkk, b bVar, wkn wkn, int i) {
            this.a = wkk;
            this.b = bVar;
            this.c = wkn;
            this.d = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            rgv rgv = (rgv) obj;
            this.a.e.a(this.b.b.a((ajev) 1.a, (ajfb) 2.a));
            wkk wkk = this.a;
            wkn wkn = this.c;
            abmr.a();
            if (!wkn.s.get()) {
                ajdx ajdx = wkn.d;
                if (ajdx != null) {
                    ajdx = ajdx.a((ajfc) new f(wkk));
                    if (ajdx != null) {
                        ajdx = ajdx.b((ajdw) wkk.a().b());
                        if (ajdx != null) {
                            ajvv.a(ajdx.a((ajfb) g.a, (ajfb) h.a), wkk.e);
                        }
                    }
                }
                wkn.d = null;
            }
            if (this.d > 0) {
                wkn wkn2 = this.a.b;
                if (wkn2 != null) {
                    int i;
                    int i2;
                    int i3;
                    wkn2.a(rgv.a);
                    Iterable<rhn> iterable = this.c.m.a;
                    if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                        i = 0;
                    } else {
                        i2 = 0;
                        for (rhn rhn : iterable) {
                            if (rhn.g) {
                                i2++;
                                if (i2 < 0) {
                                    ajym.b();
                                }
                            }
                        }
                        i = i2;
                    }
                    iterable = this.c.m.a;
                    if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                        i3 = 0;
                    } else {
                        i2 = 0;
                        for (rhn rhn2 : iterable) {
                            if (rhn2.h) {
                                i2++;
                                if (i2 < 0) {
                                    ajym.b();
                                }
                            }
                        }
                        i3 = i2;
                    }
                    wkn2.c.a((Object) new tpk(this.c.m.b(), null, null, null, i, i3, i > 0, i3 > 0, 782));
                }
                return;
            }
            wkn wkn3 = this.a.b;
            if (wkn3 != null) {
                this.a.b(wkn3);
            }
            wkk wkk2 = this.a;
            wkk2.b = null;
            wkk2.b().a(false);
        }
    }

    /* renamed from: wkk$z */
    static final class z<T> implements ajfb<ajxm<? extends CameraFragment, ? extends ajxm<? extends acgu<zjm>, ? extends acgu<zjm>>>> {
        final /* synthetic */ wkk a;
        final /* synthetic */ int b;
        private /* synthetic */ aciv c;
        private /* synthetic */ dnk.b d;
        private /* synthetic */ wkn e;

        /* renamed from: wkk$z$1 */
        static final class 1<T> implements ajfb<ebo> {
            private /* synthetic */ z a;

            /* renamed from: wkk$z$1$1 */
            static final class 1<T, R> implements ajfc<T, R> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    abyi abyi = (abyi) obj;
                    akcr.b(abyi, "it");
                    return ajyl.a(abyi);
                }
            }

            1(z zVar) {
                this.a = zVar;
            }

            /* JADX WARNING: Missing block: B:8:0x0032, code skipped:
            if (r2 == null) goto L_0x0034;
     */
            public final /* synthetic */ void accept(java.lang.Object r6) {
                /*
                r5 = this;
                r6 = (defpackage.ebo) r6;
                r0 = r5.a;
                r0 = r0.a;
                r0 = r0.b;
                if (r0 == 0) goto L_0x001e;
            L_0x000a:
                r1 = r6.a();
                r2 = defpackage.wkk.z.1.1.a;
                r2 = (defpackage.ajfc) r2;
                r1 = r1.f(r2);
                r2 = "it.getMediaPackage().map { listOf(it) }";
                defpackage.akcr.a(r1, r2);
                r0.a(r1);
            L_0x001e:
                r0 = r5.a;
                r0 = r0.a;
                r0 = r0.b;
                if (r0 == 0) goto L_0x003c;
            L_0x0026:
                r1 = r6.b;
                r2 = r5.a;
                r2 = r2.a;
                r2 = r2.b;
                if (r2 == 0) goto L_0x0034;
            L_0x0030:
                r2 = r2.r;
                if (r2 != 0) goto L_0x0036;
            L_0x0034:
                r2 = defpackage.tod.FEED;
            L_0x0036:
                r1 = defpackage.tpl.a.a(r1, r2);
                r0.h = r1;
            L_0x003c:
                r0 = r5.a;
                r0 = r0.a;
                r0 = r0.b;
                if (r0 == 0) goto L_0x0063;
            L_0x0044:
                r1 = r0.i;
                r6 = r6.b;
                r6 = r6.a();
                r2 = r1.a;
                r3 = r1.b;
                r1 = r1.d;
                r4 = "cameraLoadingOverlay";
                defpackage.akcr.b(r1, r4);
                r4 = new dnn;
                r4.<init>(r2, r3, r6, r1);
                r6 = "<set-?>";
                defpackage.akcr.b(r4, r6);
                r0.i = r4;
            L_0x0063:
                r6 = r5.a;
                r6 = r6.a;
                r0 = r5.a;
                r0 = r0.b;
                r0 = r0 + 1;
                r6.a(r0);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wkk$z$1.accept(java.lang.Object):void");
            }
        }

        z(wkk wkk, aciv aciv, int i, dnk.b bVar, wkn wkn) {
            this.a = wkk;
            this.c = aciv;
            this.b = i;
            this.d = bVar;
            this.e = wkn;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            CameraFragment cameraFragment = (CameraFragment) ajxm.a;
            ajxm = (ajxm) ajxm.b;
            if (akcr.a(this.c, this.a.f.i())) {
                this.a.f.a((achd) new a(this.a, this.b, dnh.c, cameraFragment, acgv.a().a((acgu) ajxm.b).a()), (acgu) ajxm.a, (acih) this.d);
                this.e.b.a(cameraFragment.a().f((ajfb) new 1(this)));
            }
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(wkk.class), "caller", "getCaller()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(wkk.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(wkk.class), "sendToLogger", "getSendToLogger()Lcom/snap/messaging/sendto/internal/logging/MushroomSendToLogger;"), new akdc(akde.a(wkk.class), "presentSendToNavigationAction", "getPresentSendToNavigationAction()Lcom/snapchat/deck/actions/NavigationAction;"), new akdc(akde.a(wkk.class), "sendToPageNavigationActionSpec", "getSendToPageNavigationActionSpec()Lcom/snapchat/deck/actions/NavigationActionSpec;")};
    }

    public wkk(zgb zgb, iqs iqs, ajei ajei, achb<zjm, zjk> achb, aipn<psm> aipn, rhs rhs, aipn<ira> aipn2, aipn<odu> aipn3, aipn<tpe> aipn4, aipn<dnu> aipn5, aipn<rgt> aipn6, aipn<gfu> aipn7, dnv dnv, ablu ablu, ajwy<rhz> ajwy, ajwy<gpb> ajwy2, ajwy<zuj> ajwy3, ajwy<ftl> ajwy4, ajwy<qod> ajwy5, ajwy<wjw> ajwy6, ajwy<wkp> ajwy7, ajwy<wjr> ajwy8, ajwy<ppl> ajwy9, igi<Boolean> igi) {
        zgb zgb2 = zgb;
        iqs iqs2 = iqs;
        ajei ajei2 = ajei;
        achb<zjm, zjk> achb2 = achb;
        aipn<psm> aipn8 = aipn;
        rhs rhs2 = rhs;
        aipn<ira> aipn9 = aipn2;
        aipn<odu> aipn10 = aipn3;
        aipn<tpe> aipn11 = aipn4;
        aipn<dnu> aipn12 = aipn5;
        aipn<rgt> aipn13 = aipn6;
        aipn<gfu> aipn14 = aipn7;
        dnv dnv2 = dnv;
        ablu ablu2 = ablu;
        ajwy<rhz> ajwy10 = ajwy;
        ajwy<gpb> ajwy11 = ajwy2;
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(iqs2, "friendActionDispatch");
        akcr.b(ajei2, "userSessionDisposable");
        akcr.b(achb2, "navigationHost");
        akcr.b(aipn8, "sendMessageApi");
        akcr.b(rhs2, "sendToLocalGroupsManager");
        akcr.b(aipn9, "identityApi");
        akcr.b(aipn10, "mediaPackageManager");
        akcr.b(aipn11, "previewFragmentFactory");
        akcr.b(aipn12, "stackedCameraConfigProvider");
        akcr.b(aipn13, "sendToFragmentControllerFactory");
        akcr.b(aipn14, "snapContentResolver");
        akcr.b(dnv2, "stackedCameraLauncher");
        akcr.b(ablu2, "snapCreationTracker");
        akcr.b(ajwy10, "sendToLoggerProvider");
        akcr.b(ajwy2, "userAuth");
        akcr.b(ajwy3, "uploadMediaManager");
        akcr.b(ajwy4, "configProvider");
        akcr.b(ajwy5, "mediaUploadProgressListener");
        akcr.b(ajwy6, "mediaReferencesBuilder");
        akcr.b(ajwy7, "sendingPacketBuilder");
        akcr.b(ajwy8, "mediaRecoverySavedInstanceHandler");
        akcr.b(ajwy9, "leakTracker");
        akcr.b(igi, "swipeUpToSendConfigReader");
        ajwy<gpb> ajwy12 = ajwy2;
        this.z = zgb2;
        this.d = iqs2;
        this.e = ajei2;
        this.f = achb2;
        this.g = aipn8;
        this.A = rhs2;
        this.h = aipn9;
        this.i = aipn10;
        this.B = aipn11;
        this.C = aipn12;
        this.j = aipn13;
        this.k = aipn14;
        this.D = dnv2;
        this.l = ablu2;
        this.m = ajwy;
        this.n = ajwy12;
        ajwy<ftl> ajwy13 = ajwy4;
        this.o = ajwy3;
        this.E = ajwy13;
        ajwy<wjw> ajwy14 = ajwy6;
        this.p = ajwy5;
        this.q = ajwy14;
        ajwy<wjr> ajwy15 = ajwy8;
        this.r = ajwy7;
        this.F = ajwy15;
        igi<Boolean> igi2 = igi;
        this.s = ajwy9;
        this.t = igi2;
    }

    static tpk a(rhl rhl) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List b = rhl.b();
        List c = rhl.c();
        List d = rhl.d();
        Collection arrayList = new ArrayList();
        for (Object next : rhl.a) {
            if (((rhn) next).h) {
                arrayList.add(next);
            }
        }
        Iterable<rhn> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (rhn rhn : iterable) {
            arrayList2.add(rhn.e.b);
        }
        List list = (List) arrayList2;
        Iterable<rhn> iterable2 = rhl.a;
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (rhn rhn2 : iterable2) {
                if (rhn2.g) {
                    i++;
                    if (i < 0) {
                        ajym.b();
                    }
                }
            }
        }
        iterable2 = rhl.a;
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            i2 = 0;
        } else {
            i2 = 0;
            for (rhn rhn3 : iterable2) {
                if (rhn3.h) {
                    i2++;
                    if (i2 < 0) {
                        ajym.b();
                    }
                }
            }
        }
        iterable2 = rhl.a;
        if (!((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty())) {
            for (rhn rhn32 : iterable2) {
                if (rhn32.g) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        iterable2 = rhl.a;
        if (!((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty())) {
            for (rhn rhn4 : iterable2) {
                if (rhn4.h) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        iterable2 = rhl.a;
        if (!((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty())) {
            for (rhn rhn5 : iterable2) {
                if (akcr.a(rhn5.e.b, (Object) "my_story_ads79sdf")) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        Iterable<rhn> iterable3 = rhl.a;
        if (!((iterable3 instanceof Collection) && ((Collection) iterable3).isEmpty())) {
            for (rhn rhn6 : iterable3) {
                if (akcr.a(rhn6.e.b, (Object) "glssubmittolive")) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        return new tpk(b, c, d, list, i, i2, z, z2, z3, z4);
    }

    private final a a(int i, zjm zjm, PreviewFragment previewFragment) {
        acgv a;
        MainPageFragment mainPageFragment = previewFragment;
        if (((Boolean) this.t.a()).booleanValue()) {
            acgv.b a2 = acgv.b().a(d());
            Object d = d();
            akcr.a(d, "presentSendToNavigationAction");
            a = a2.a(d.e(), new e(this)).a();
        } else {
            a = null;
        }
        return new a(this, i, zjm, mainPageFragment, a);
    }

    private final b a(wkn wkn, ajcx ajcx) {
        ajdx a = ajcx.b((ajeb) wkn.g).a((ajfc) new m(this, wkn)).a();
        Object b = a.e((ajfc) new n(this, wkn)).b((ajdw) a().b());
        akcr.a(b, "mediaSessionCopyForSendT…schedulers.computation())");
        Object a2 = a.f(o.a).a((ajfc) new p(this)).b((ajdw) a().h()).a((ajdw) a().l());
        akcr.a(a2, "mediaSessionCopyForSendT…(schedulers.mainThread())");
        return new b(this, a2, b);
    }

    public final wkm.a a(puk puk, pth pth) {
        akcr.b(puk, ErrorFields.MESSAGE);
        akcr.b(pth, "messageAnalytics");
        return new wkn.a(puk, pth);
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.v.b();
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0248  */
    public final void a(int r18) {
        /*
        r17 = this;
        r6 = r17;
        r3 = r18;
        defpackage.abmr.a();
        r5 = r6.b;
        if (r5 != 0) goto L_0x000c;
    L_0x000b:
        return;
    L_0x000c:
        r0 = r5.e;
        r0 = r0.steps;
        r1 = r0.size();
        if (r3 != r1) goto L_0x001a;
    L_0x0016:
        r17.f();
        return;
    L_0x001a:
        r0 = r0.get(r3);
        r0 = (defpackage.zjm) r0;
        r1 = defpackage.dnh.c;
        r1 = defpackage.akcr.a(r0, r1);
        r2 = 0;
        if (r1 == 0) goto L_0x00c1;
    L_0x0029:
        r0 = r5.m;
        r0 = r0.a;
        r0 = defpackage.ajyu.g(r0);
        r0 = (defpackage.rhn) r0;
        if (r0 == 0) goto L_0x0038;
    L_0x0035:
        r0 = r0.e;
        goto L_0x0039;
    L_0x0038:
        r0 = r2;
    L_0x0039:
        r1 = r6.D;
        r1 = r1.b();
        r4 = new dnk$b;
        if (r0 == 0) goto L_0x0046;
    L_0x0043:
        r7 = r0.a;
        goto L_0x0047;
    L_0x0046:
        r7 = r2;
    L_0x0047:
        r8 = defpackage.rhc.MISCHIEF;
        if (r7 != r8) goto L_0x004e;
    L_0x004b:
        r7 = 1;
        r8 = 1;
        goto L_0x0050;
    L_0x004e:
        r7 = 0;
        r8 = 0;
    L_0x0050:
        if (r0 == 0) goto L_0x0054;
    L_0x0052:
        r2 = r0.b;
    L_0x0054:
        r9 = r2;
        r0 = r5.i;
        r10 = r0.a;
        r0 = r5.k;
        r11 = r0.a;
        r0 = r5.i;
        r12 = r0.b;
        r0 = r5.i;
        r13 = r0.d;
        r7 = r4;
        r7.<init>(r8, r9, r10, r11, r12, r13);
        r0 = r6.a;
        r2 = new wkk$v;
        r2.<init>(r6);
        r2 = (java.lang.Runnable) r2;
        r0.post(r2);
        r0 = r6.f;
        r2 = r0.i();
        r7 = r5.b;
        r0 = r6.C;
        r0 = r0.get();
        r0 = (defpackage.dnu) r0;
        r0 = r0.b();
        r0 = (defpackage.ajeb) r0;
        r0 = defpackage.ajwd.a(r1, r0);
        r1 = r17.a();
        r1 = r1.f();
        r1 = (defpackage.ajdw) r1;
        r0 = r0.b(r1);
        r1 = r17.a();
        r1 = r1.l();
        r1 = (defpackage.zfr) r1;
        r1 = (defpackage.ajdw) r1;
        r8 = r0.a(r1);
        r9 = new wkk$z;
        r0 = r9;
        r1 = r17;
        r3 = r18;
        r0.<init>(r1, r2, r3, r4, r5);
        r9 = (defpackage.ajfb) r9;
        r0 = r8.e(r9);
        r7.a(r0);
        return;
    L_0x00c1:
        r1 = defpackage.toc.a;
        r1 = defpackage.akcr.a(r0, r1);
        if (r1 == 0) goto L_0x0163;
    L_0x00c9:
        r1 = r5.h;
        if (r1 != 0) goto L_0x00ce;
    L_0x00cd:
        return;
    L_0x00ce:
        r2 = r6.B;
        r2 = r2.get();
        r2 = (defpackage.tpe) r2;
        r1 = r2.a(r1);
        r2 = r5.b;
        r4 = r1.b();
        r7 = new wkk$aa;
        r7.<init>(r6, r3);
        r7 = (defpackage.ajfb) r7;
        r4 = r4.f(r7);
        r2.a(r4);
        r2 = r5.b;
        r4 = r5.b;
        r7 = r1.k();
        r8 = new wkk$ab;
        r8.<init>(r6, r2, r1, r5);
        r8 = (defpackage.ajfb) r8;
        r2 = r7.f(r8);
        r4.a(r2);
        r2 = r5.b;
        r4 = r1.h();
        r7 = new wkk$ac;
        r7.<init>(r6);
        r7 = (defpackage.ajfb) r7;
        r4 = r4.f(r7);
        r2.a(r4);
        r2 = r5.b;
        r4 = r1.i();
        r7 = new wkk$ad;
        r7.<init>(r6, r3);
        r7 = (defpackage.ajfb) r7;
        r4 = r4.f(r7);
        r2.a(r4);
        r2 = r6.b;
        if (r2 == 0) goto L_0x013b;
    L_0x0130:
        r4 = r2.c;
        r2 = r2.m;
        r2 = defpackage.wkk.a(r2);
        r4.a(r2);
    L_0x013b:
        r0 = r6.a(r3, r0, r1);
        r1 = new tpf;
        r8 = r5.a;
        r2 = r5.k;
        r9 = r2.a;
        r2 = r5.c;
        r10 = r2;
        r10 = (defpackage.ajdp) r10;
        r11 = r5.l;
        r12 = r5.f;
        r13 = r5.q;
        r7 = r1;
        r7.<init>(r8, r9, r10, r11, r12, r13);
        r2 = r6.a;
        r3 = new wkk$ae;
        r3.<init>(r6, r0, r1);
        r3 = (java.lang.Runnable) r3;
        r2.post(r3);
        return;
    L_0x0163:
        r1 = defpackage.rgr.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0262;
    L_0x016b:
        r0 = r6.j;
        r0 = r0.get();
        r0 = (defpackage.rgt) r0;
        r1 = r0.a();
        r4 = r1.h();
        r7 = r17.e();
        r8 = "sendToPageNavigationActionSpec";
        defpackage.akcr.a(r7, r8);
        r0 = r0.a(r4, r7);
        r4 = r1.a();
        r7 = defpackage.ajxw.a;
        r4 = r4.d(r7);
        r4 = r4.e();
        r7 = "sendToFragment.finishLoa…rst(Unit).ignoreElement()";
        defpackage.akcr.a(r4, r7);
        r4 = r6.a(r5, r4);
        r7 = r5.b;
        r8 = r1.a();
        r9 = new wkk$af;
        r9.<init>(r6, r5);
        r9 = (defpackage.ajfb) r9;
        r8 = r8.f(r9);
        r7.a(r8);
        r7 = r5.b;
        r8 = r1.g();
        r9 = new wkk$w;
        r9.<init>(r6, r4, r5, r3);
        r9 = (defpackage.ajfb) r9;
        r8 = r8.f(r9);
        r7.a(r8);
        r7 = r5.b;
        r1 = r1.b();
        r8 = new wkk$x;
        r8.<init>(r6, r4, r5, r3);
        r8 = (defpackage.ajfb) r8;
        r1 = r1.f(r8);
        r7.a(r1);
        r1 = r5.i;
        r1 = r1.c;
        if (r1 == 0) goto L_0x01e8;
    L_0x01e1:
        r1 = r5.n;
        r1 = defpackage.rgq.a(r1);
        goto L_0x01ea;
    L_0x01e8:
        r1 = r5.n;
    L_0x01ea:
        r9 = r1;
        r1 = r17.b();
        r3 = r6.b;
        if (r3 == 0) goto L_0x01fa;
    L_0x01f3:
        r3 = r3.l;
        if (r3 == 0) goto L_0x01fa;
    L_0x01f7:
        r3 = r3.d;
        goto L_0x01fb;
    L_0x01fa:
        r3 = r2;
    L_0x01fb:
        r1.b(r3);
        r1 = r17.b();
        r3 = r6.b;
        if (r3 == 0) goto L_0x020d;
    L_0x0206:
        r3 = r3.l;
        if (r3 == 0) goto L_0x020d;
    L_0x020a:
        r3 = r3.e;
        goto L_0x020e;
    L_0x020d:
        r3 = r2;
    L_0x020e:
        r1.b(r3);
        r1 = new rhm;
        r3 = new rhl;
        r7 = r5.m;
        r11 = r7.a;
        r7 = r5.m;
        r7 = r7.b;
        if (r7 != 0) goto L_0x0223;
    L_0x021f:
        r4 = r4.a;
        r12 = r4;
        goto L_0x0224;
    L_0x0223:
        r12 = r7;
    L_0x0224:
        r4 = r6.b;
        if (r4 == 0) goto L_0x022c;
    L_0x0228:
        r4 = r4.j;
        r13 = r4;
        goto L_0x022d;
    L_0x022c:
        r13 = r2;
    L_0x022d:
        r4 = r5.m;
        r14 = r4.e;
        r4 = r5.m;
        r15 = r4.f;
        r16 = 64;
        r10 = r3;
        r10.<init>(r11, r12, r13, r14, r15, r16);
        r4 = r6.b;
        if (r4 == 0) goto L_0x0243;
    L_0x023f:
        r4 = r4.t;
        r10 = r4;
        goto L_0x0244;
    L_0x0243:
        r10 = r2;
    L_0x0244:
        r4 = r6.b;
        if (r4 == 0) goto L_0x024a;
    L_0x0248:
        r2 = r4.u;
    L_0x024a:
        r11 = r2;
        r2 = r5.k;
        r2 = r2.a;
        r12 = r2.snapSource;
        r7 = r1;
        r8 = r3;
        r7.<init>(r8, r9, r10, r11, r12);
        r2 = r6.a;
        r3 = new wkk$y;
        r3.<init>(r6, r0, r1);
        r3 = (java.lang.Runnable) r3;
        r2.post(r3);
    L_0x0262:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkk.a(int):void");
    }

    public final void a(wkm wkm) {
        akcr.b(wkm, "newSession");
        abmr.a();
        if (!(wkm instanceof wkn)) {
            wkm = null;
        }
        wkn wkn = (wkn) wkm;
        if (wkn != null) {
            wkn wkn2 = this.b;
            if (wkn2 != null) {
                StringBuilder stringBuilder = new StringBuilder("activeSession[");
                stringBuilder.append(wkn2.k.a.sourceType);
                stringBuilder.append("] is not yet disposed. Disposing...");
                b(wkn2);
            }
            synchronized (this.c) {
                ajyr.a(this.c, (akbl) an.a);
            }
            this.b = wkn;
            if (((wjr) this.F.get()).b == null) {
                ftl ftl = (ftl) this.E.get();
                Pair a = igu.a(ftl.p(dnd.ENABLE_MEDIA_RECOVERY).u(new ap(ftl)), Long.valueOf(-1));
                ((wjr) this.F.get()).b = new ao(this, a);
                this.e.a((ajej) a.first);
            }
            a(0);
            return;
        }
        throw new IllegalArgumentException("Invalid session type");
    }

    /* Access modifiers changed, original: final */
    public final void a(wkn wkn) {
        abmr.a();
        idd a = wkg.a((idd) this.u.b(), wkn);
        wkn.d = wkn.a.a((ajfc) new q(this, wkn, a)).a();
        ajdx ajdx = wkn.d;
        if (ajdx != null) {
            ajdx c = ajdx.c((ajfb) new r(this, wkn, a));
            if (c != null) {
                c = c.b((ajdw) a().b());
                if (c != null) {
                    ajvv.a(c.a((ajfb) s.a, (ajfb) t.a), wkn.b);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final rhz b() {
        return (rhz) this.w.b();
    }

    /* Access modifiers changed, original: final */
    public final void b(wkn wkn) {
        if (!wkn.m.g) {
            this.A.a();
        }
        ajej a = wkn.a.e((ajfc) new i(this, wkn)).b((ajdw) a().b()).a((ajdw) a().l()).f(new j(this, wkn)).a((ajev) k.a, (ajfb) l.a);
        akcr.a((Object) a, "sessionToDispose.media.f…      }\n                )");
        ajvv.a(a, this.e);
    }

    public final boolean c() {
        return this.b != null;
    }

    /* Access modifiers changed, original: final */
    public final acgu<zjm> d() {
        return (acgu) this.x.b();
    }

    /* Access modifiers changed, original: final */
    public final acgv<zjm> e() {
        return (acgv) this.y.b();
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        abmr.a();
        wkn wkn = this.b;
        if (wkn != null) {
            if (wkn.d == null) {
                a(wkn);
            }
            if (wkn.s.compareAndSet(false, true)) {
                b().a();
                ajej a = wkn.a.e((ajfc) new ah(this, wkn)).b((ajdw) a().h()).a((ajdw) a().l()).f(new ai(this)).a((ajev) new aj(this, wkn), (ajfb) new ak(this, wkn));
                akcr.a((Object) a, "session.media\n          …  }\n                    )");
                ajvv.a(a, wkn.b);
            }
        }
    }
}
