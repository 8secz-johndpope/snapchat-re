package defpackage;

import android.content.Context;
import com.brightcove.player.event.Event;
import com.google.common.base.Throwables;
import com.snapchat.android.R;
import defpackage.kqe.ak;
import defpackage.lrk.a;
import defpackage.lrk.b;
import defpackage.lrk.d;
import defpackage.lsd.a.c;
import defpackage.lsd.a.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: lrj */
public final class lrj implements mhi<a> {
    public ajdp<lsd> a;
    public lsu b = lsu.g;
    public boolean c;
    public boolean d;
    public ajdp<lrg> e;
    public ajdp<Double> f;
    public ajdp<mih> g;
    public lth h;
    public lpi i;
    public mzk j;
    public mtj k;
    public mwa l;
    final ajfb<ajxr<mhs, List<mhs>, ak>> m;
    public final c n;

    /* renamed from: lrj$c */
    public interface c {
        ide g();

        zgb h();

        mwe i();

        ajdp<mmt> j();

        ajdp<lqf> k();

        miw l();

        kqf m();

        lxh n();

        akbl<Context, jn> o();

        myv p();

        ajfb<ajxr<mhs, List<mhs>, ak>> q();
    }

    /* renamed from: lrj$g */
    static final class g<T> implements ajfb<ajxr<? extends mhs, ? extends List<? extends mhs>, ? extends ak>> {
        private /* synthetic */ lrj a;

        g(lrj lrj) {
            this.a = lrj;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.n.m().a((kqe) ((ajxr) obj).c);
        }
    }

    /* renamed from: lrj$f */
    public static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lrj a;
        private /* synthetic */ zfw b;

        public f(lrj lrj, zfw zfw) {
            this.a = lrj;
            this.b = zfw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (lsd) obj;
            akcr.b(obj, "view");
            ajdt b = ajdp.b(obj);
            ajdp a = obj.a();
            zfw zfw = this.b;
            ajfb ajfb = this.a.m;
            Object a2 = a.a((ajfl) a.a).a(e.class);
            String str = "this.filter { it is R }.cast(R::class.java)";
            akcr.a(a2, str);
            ajdp a3 = igs.a(a2);
            Object a4 = a.a((ajfl) b.a).a(c.class);
            akcr.a(a4, str);
            a4 = a4.p(lrk.c.a).h(mhs.c.a).u(new d(a3)).a((ajdw) zfw.b());
            akcr.a(a4, "filterByType<CarouselVie…Schedulers.computation())");
            a = a4.d(ajfb);
            akcr.a((Object) a, "filterByType<CarouselVie…      .doOnNext(consumer)");
            return ajdp.a(b, (ajdt) myu.a(a), (ajdt) ajdp.a((ajdr) new ajdr<T>() {

                /* renamed from: lrj$f$1$1 */
                static final class 1 implements ajev {
                    private /* synthetic */ 1 a;

                    1(1 1) {
                        this.a = 1;
                    }

                    public final void run() {
                        obj.accept(lsd.b.a.a);
                    }
                }

                public final void subscribe(ajdq<lsd> ajdq) {
                    akcr.b(ajdq, Event.EMITTER);
                    ajdq.a(ajek.a((ajev) new 1(this)));
                }
            }));
        }
    }

    /* renamed from: lrj$d */
    public static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue() ? lrg.b.a.a : lrg.b.b.a;
        }
    }

    /* renamed from: lrj$e */
    public static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue() ? lrg.a.a.a : lrg.a.b.a;
        }
    }

    /* renamed from: lrj$a */
    public static abstract class a implements ltk.c, luf.d, lva.d, lvq.d, lwv.b, mha {

        /* renamed from: lrj$a$a */
        public interface a {
            a a(ajdp<lsd> ajdp);

            a a(lpi lpi);

            a a(c cVar);

            a a(lsu lsu);

            a a(lth lth);

            a a(mtj mtj);

            a a(mwa mwa);

            a a(mzk mzk);

            a a(boolean z);

            a a();

            a b(ajdp<lrg> ajdp);

            a b(boolean z);

            a c(ajdp<Double> ajdp);

            a d(ajdp<mih> ajdp);
        }

        public final ajej a() {
            Object l = b().l();
            akcr.a(l, "observe().subscribe()");
            return l;
        }

        public final ajdp<Object> b() {
            Object e = d().b().e((ajdt) mhb.a(f()));
            akcr.a(e, "carouselPresenter.observ…(subComponents.observe())");
            return e;
        }

        public abstract lsa c();

        public abstract lrz d();

        public abstract ajdp<lsd> e();

        public abstract Set<mhi<? extends mha>> f();
    }

    /* renamed from: lrj$b */
    public static final class b {

        /* renamed from: lrj$b$a */
        public static final class a<Upstream, Downstream> implements ajdu<defpackage.lsd.b, defpackage.lsd.b> {
            final /* synthetic */ mzk a;
            private /* synthetic */ ajdp b;
            private /* synthetic */ ajdp c;
            private /* synthetic */ boolean d;
            private /* synthetic */ boolean e;
            private /* synthetic */ ajdp f;
            private /* synthetic */ boolean g;
            private /* synthetic */ boolean h;
            private /* synthetic */ ajdp i;
            private /* synthetic */ mwe j;
            private /* synthetic */ kqf k;
            private /* synthetic */ ajdp l;

            public a(ajdp ajdp, ajdp ajdp2, mzk mzk, boolean z, boolean z2, ajdp ajdp3, boolean z3, boolean z4, ajdp ajdp4, mwe mwe, kqf kqf, ajdp ajdp5) {
                this.b = ajdp;
                this.c = ajdp2;
                this.a = mzk;
                this.d = z;
                this.e = z2;
                this.f = ajdp3;
                this.g = z3;
                this.h = z4;
                this.i = ajdp4;
                this.j = mwe;
                this.k = kqf;
                this.l = ajdp5;
            }

            public final /* synthetic */ ajdt apply(final ajdp ajdp) {
                akcr.b(ajdp, "upstream");
                return this.b.u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ a a;

                    public final /* synthetic */ Object apply(Object obj) {
                        return (((Boolean) obj).booleanValue() ? new lrx(this.a.a) : defpackage.mic.a.a).apply(ajdp);
                    }
                });
            }
        }

        /* renamed from: lrj$b$b */
        public static final class b implements lsw {
            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "upstream");
                return lsv.a(lsy.a(list));
            }
        }

        static {
            b bVar = new b();
        }

        private b() {
        }

        public static final ajdu<defpackage.lsd.b, defpackage.lsd.b> a(boolean z, boolean z2, boolean z3, boolean z4, ajdp<Boolean> ajdp, mwe mwe, ajdp<lqf> ajdp2, ajdp<lrg> ajdp3, ajdp<mih> ajdp4, kqf kqf, mzk mzk) {
            mwe mwe2 = mwe;
            ajdp<lqf> ajdp5 = ajdp2;
            ajdp<lrg> ajdp6 = ajdp3;
            kqf kqf2 = kqf;
            String str = "ofType(R::class.java)";
            akcr.b(ajdp, "showBlueBadges");
            akcr.b(mwe2, "lensRepository");
            akcr.b(ajdp5, "cameraLifecycle");
            akcr.b(ajdp6, "carouselAppearance");
            akcr.b(ajdp4, "windowRect");
            akcr.b(kqf2, "analyticsEventHandler");
            akcr.b(mzk, "lensStatisticsRepository");
            List arrayList = new ArrayList();
            String str2 = str;
            kqf kqf3 = kqf2;
            arrayList.add(new a(ajdp, ajdp, mzk, z, z2, ajdp2, z4, z3, ajdp4, mwe, kqf, ajdp3));
            if (!z2) {
                arrayList.add(new lsq(ajdp5));
            }
            if (z4) {
                boolean z5 = z3 && !z2;
                arrayList.add(new lss(z2 ? 5 : 3, false, z5, 2));
            }
            arrayList.add(mic.a((ajdp) ajdp4));
            kqf kqf4 = kqf3;
            arrayList.add(new lsz(mwe, kqf4, ajdp5));
            ajdp<lrg> ajdp7 = ajdp3;
            List list = arrayList;
            Object b = ajdp7.b(defpackage.lrg.b.class);
            String str3 = str2;
            akcr.a(b, str3);
            list.add(new lri(b));
            b = ajdp7.b(lrg.a.class);
            akcr.a(b, str3);
            list.add(new lrh(b));
            list.add(new ltb(kqf4));
            Object[] toArray = list.toArray(new ajdu[0]);
            if (toArray != null) {
                ajdu[] ajduArr = (ajdu[]) toArray;
                return mic.a((ajdu[]) Arrays.copyOf(ajduArr, ajduArr.length));
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public static final lrz a(ajdp<lsd> ajdp, lsa lsa, ajdu<defpackage.lsd.b, defpackage.lsd.b> ajdu, ide ide, zgb zgb, kqf kqf, boolean z, mwa mwa) {
            akcr.b(ajdp, "viewViewProvider");
            akcr.b(lsa, "carouselUseCase");
            akcr.b(ajdu, "carouselViewModelTransformer");
            akcr.b(ide, "attributedFeature");
            akcr.b(zgb, "schedulersProvider");
            akcr.b(kqf, "analyticsEventHandler");
            akcr.b(mwa, "lensDownloadStatusProvider");
            return new lsi(ajdp, lsa, ajdu, z, zgb.a(ide.callsite("DefaultCarouselPresenter")), kqf, mwa);
        }

        public static final lsa a(boolean z, boolean z2, mwe mwe, ide ide, zgb zgb, ajdp<lqf> ajdp, ajdp<mmt> ajdp2, kqf kqf, ajdp<Double> ajdp3, lsw lsw) {
            mwe mwe2 = mwe;
            ide ide2 = ide;
            ajdp<lqf> ajdp4 = ajdp;
            lsw lsw2 = lsw;
            akcr.b(mwe, "lensRepository");
            akcr.b(ide, "attributedFeature");
            zgb zgb2 = zgb;
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ajdp4, "cameraLifecycle");
            akcr.b(ajdp2, "lensCore");
            akcr.b(kqf, "analyticsEventHandler");
            akcr.b(ajdp3, "cameraAverageFps");
            akcr.b(lsw2, "lensesListTransformer");
            lsa lsn = (!z || z2) ? new lsn(mwe) : new lte(mwe, ajdp4, lsw2, zgb.a(ide.callsite("SwitchScheduleCarouselUseCase")));
            return new lra(lsn, ajdp2, kqf, ajdp, ajdp3, defpackage.mhk.b.a, zgb.a(ide.callsite("AnalyticsCarouselUseCase")));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x00da in {6, 9, 12, 13, 16, 17, 19} preds:[]
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
        public static final defpackage.mhi<? extends defpackage.mha> a(defpackage.lrj.a r6, defpackage.ajdp<defpackage.lrg> r7, defpackage.lsu r8, defpackage.ajdp<defpackage.lsd> r9) {
            /*
            r0 = "Observable.empty()";
            r1 = "parentComponent";
            r2 = "component";
            defpackage.akcr.b(r6, r2);
            r2 = "carouselAppearance";
            defpackage.akcr.b(r7, r2);
            r2 = "layoutConfiguration";
            defpackage.akcr.b(r8, r2);
            r2 = "viewProvider";
            defpackage.akcr.b(r9, r2);
            r8 = r8.f;	 Catch:{ all -> 0x00d8 }
            if (r8 == 0) goto L_0x00d4;	 Catch:{ all -> 0x00d8 }
            r8 = (java.lang.Number) r8;	 Catch:{ all -> 0x00d8 }
            r8 = r8.intValue();	 Catch:{ all -> 0x00d8 }
            r6 = (defpackage.ltk.c) r6;	 Catch:{ all -> 0x00d8 }
            defpackage.akcr.b(r6, r1);	 Catch:{ all -> 0x00d8 }
            r2 = defpackage.lts.e();	 Catch:{ all -> 0x00d8 }
            r3 = defpackage.ajot.a;	 Catch:{ all -> 0x00d8 }
            r3 = defpackage.ajvo.a(r3);	 Catch:{ all -> 0x00d8 }
            defpackage.akcr.a(r3, r0);	 Catch:{ all -> 0x00d8 }
            r2 = r2.a(r3);	 Catch:{ all -> 0x00d8 }
            r3 = defpackage.mih.e;	 Catch:{ all -> 0x00d8 }
            r3 = defpackage.ajdp.b(r3);	 Catch:{ all -> 0x00d8 }
            r4 = "Observable.just(Rectangle.ZERO)";	 Catch:{ all -> 0x00d8 }
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x00d8 }
            r2 = r2.b(r3);	 Catch:{ all -> 0x00d8 }
            r3 = defpackage.ajot.a;	 Catch:{ all -> 0x00d8 }
            r3 = defpackage.ajvo.a(r3);	 Catch:{ all -> 0x00d8 }
            defpackage.akcr.a(r3, r0);	 Catch:{ all -> 0x00d8 }
            r0 = r2.c(r3);	 Catch:{ all -> 0x00d8 }
            defpackage.akcr.b(r6, r1);	 Catch:{ all -> 0x00d8 }
            r2 = r0;	 Catch:{ all -> 0x00d8 }
            r2 = (defpackage.ltk.a) r2;	 Catch:{ all -> 0x00d8 }
            r2.a(r6);	 Catch:{ all -> 0x00d8 }
            r2.a = r6;	 Catch:{ all -> 0x00d8 }
            r0 = (defpackage.ltk.a) r0;	 Catch:{ all -> 0x00d8 }
            r6 = defpackage.lrk.a(r7);	 Catch:{ all -> 0x00d8 }
            r6 = r0.c(r6);	 Catch:{ all -> 0x00d8 }
            r7 = defpackage.mit.a(r8, r9);	 Catch:{ all -> 0x00d8 }
            r8 = "viewStubProvider";	 Catch:{ all -> 0x00d8 }
            defpackage.akcr.b(r7, r8);	 Catch:{ all -> 0x00d8 }
            r8 = r6.a;	 Catch:{ all -> 0x00d8 }
            if (r8 != 0) goto L_0x0079;	 Catch:{ all -> 0x00d8 }
            defpackage.akcr.a(r1);	 Catch:{ all -> 0x00d8 }
            r8.i();	 Catch:{ all -> 0x00d8 }
            r8 = r6.a;	 Catch:{ all -> 0x00d8 }
            if (r8 != 0) goto L_0x0083;	 Catch:{ all -> 0x00d8 }
            defpackage.akcr.a(r1);	 Catch:{ all -> 0x00d8 }
            r8 = r8.h();	 Catch:{ all -> 0x00d8 }
            r9 = "BitmojiPopupComponent.Builder#attachToViewStub";	 Catch:{ all -> 0x00d8 }
            r8 = defpackage.zgb.a(r8, r9);	 Catch:{ all -> 0x00d8 }
            r9 = r6.a;	 Catch:{ all -> 0x00d8 }
            if (r9 != 0) goto L_0x0094;	 Catch:{ all -> 0x00d8 }
            defpackage.akcr.a(r1);	 Catch:{ all -> 0x00d8 }
            r3 = r9.k();	 Catch:{ all -> 0x00d8 }
            r0 = 2131558907; // 0x7f0d01fb float:1.8743143E38 double:1.053130028E-314;	 Catch:{ all -> 0x00d8 }
            r1 = defpackage.ltr.class;	 Catch:{ all -> 0x00d8 }
            r2 = 1;	 Catch:{ all -> 0x00d8 }
            r4 = 0;	 Catch:{ all -> 0x00d8 }
            r5 = 1;	 Catch:{ all -> 0x00d8 }
            r9 = defpackage.mit.a(r0, r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00d8 }
            r7 = r7.a(r9);	 Catch:{ all -> 0x00d8 }
            r9 = r8.l();	 Catch:{ all -> 0x00d8 }
            r9 = (defpackage.zfr) r9;	 Catch:{ all -> 0x00d8 }
            r9 = (defpackage.ajdw) r9;	 Catch:{ all -> 0x00d8 }
            r7 = r7.b(r9);	 Catch:{ all -> 0x00d8 }
            r8 = r8.l();	 Catch:{ all -> 0x00d8 }
            r8 = (defpackage.zfr) r8;	 Catch:{ all -> 0x00d8 }
            r8 = (defpackage.ajdw) r8;	 Catch:{ all -> 0x00d8 }
            r7 = r7.c(r8);	 Catch:{ all -> 0x00d8 }
            r7 = r7.i();	 Catch:{ all -> 0x00d8 }
            r7 = r7.a();	 Catch:{ all -> 0x00d8 }
            r8 = "viewStubProvider.compose…              .refCount()";	 Catch:{ all -> 0x00d8 }
            defpackage.akcr.a(r7, r8);	 Catch:{ all -> 0x00d8 }
            r6 = r6.a(r7);	 Catch:{ all -> 0x00d8 }
            r6 = (defpackage.mhi) r6;	 Catch:{ all -> 0x00d8 }
            goto L_0x00d7;	 Catch:{ all -> 0x00d8 }
            r6 = defpackage.mhc.a;	 Catch:{ all -> 0x00d8 }
            goto L_0x00d1;
            return r6;
            r6 = move-exception;
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lrj$b.a(lrj$a, ajdp, lsu, ajdp):mhi");
        }

        public static final mhi<? extends mha> a(a aVar, lsu lsu, ajdp<lrg> ajdp, ajdp<lsd> ajdp2) {
            akcr.b(aVar, "component");
            akcr.b(lsu, "layoutConfiguration");
            akcr.b(ajdp, "carouselAppearance");
            String str = "viewProvider";
            akcr.b(ajdp2, str);
            Integer num = lsu.d;
            if (num == null) {
                return mhc.a;
            }
            int intValue = num.intValue();
            lwv lwv = new lwv(aVar);
            ajdp a = lrk.a((ajdp) ajdp);
            akcr.b(a, "value");
            lwv.b = a;
            lwv = lwv;
            a = mit.a(intValue, ajdp2);
            akcr.b(a, "viewStub");
            lwv.c.i();
            zfw a2 = zgb.a(lwv.c.h(), "CtaBuilder#attachToViewStub");
            Object a3 = a.a(mit.a((int) R.layout.lenses_camera_cta_view, lxc.class, true, lwv.c.k(), false, true)).b((ajdw) a2.l()).c((ajdw) a2.l()).i().a();
            akcr.a(a3, "viewStub.compose(ViewObs…              .refCount()");
            akcr.b(a3, str);
            lwv.a = a3;
            return lwv;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x00c7 in {6, 9, 12, 13, 16, 17, 19} preds:[]
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
        public static final defpackage.mhi<? extends defpackage.mha> a(defpackage.lrj.a r8, defpackage.lsu r9, defpackage.ajdp<defpackage.lsd> r10, defpackage.ajdp<defpackage.lrg> r11, defpackage.myv r12) {
            /*
            r0 = "parentComponent";
            r1 = "component";
            defpackage.akcr.b(r8, r1);
            r1 = "layoutConfiguration";
            defpackage.akcr.b(r9, r1);
            r1 = "viewProvider";
            defpackage.akcr.b(r10, r1);
            r1 = "carouselAppearance";
            defpackage.akcr.b(r11, r1);
            r1 = "scanCardsInteractor";
            defpackage.akcr.b(r12, r1);
            r9 = r9.c;	 Catch:{ all -> 0x00c5 }
            if (r9 == 0) goto L_0x00c1;	 Catch:{ all -> 0x00c5 }
            r9 = (java.lang.Number) r9;	 Catch:{ all -> 0x00c5 }
            r9 = r9.intValue();	 Catch:{ all -> 0x00c5 }
            r8 = (defpackage.luf.d) r8;	 Catch:{ all -> 0x00c5 }
            defpackage.akcr.b(r8, r0);	 Catch:{ all -> 0x00c5 }
            r1 = defpackage.lty.c();	 Catch:{ all -> 0x00c5 }
            defpackage.akcr.b(r8, r0);	 Catch:{ all -> 0x00c5 }
            r1.e = r8;	 Catch:{ all -> 0x00c5 }
            r8 = r1.a(r8);	 Catch:{ all -> 0x00c5 }
            r1 = defpackage.ajot.a;	 Catch:{ all -> 0x00c5 }
            r1 = defpackage.ajvo.a(r1);	 Catch:{ all -> 0x00c5 }
            r2 = "Observable.empty()";	 Catch:{ all -> 0x00c5 }
            defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x00c5 }
            r8 = r8.a(r1);	 Catch:{ all -> 0x00c5 }
            r9 = defpackage.mit.a(r9, r10);	 Catch:{ all -> 0x00c5 }
            r10 = "viewStub";	 Catch:{ all -> 0x00c5 }
            defpackage.akcr.b(r9, r10);	 Catch:{ all -> 0x00c5 }
            r10 = r8;	 Catch:{ all -> 0x00c5 }
            r10 = (defpackage.luf.a) r10;	 Catch:{ all -> 0x00c5 }
            r1 = r10.e;	 Catch:{ all -> 0x00c5 }
            if (r1 != 0) goto L_0x0059;	 Catch:{ all -> 0x00c5 }
            defpackage.akcr.a(r0);	 Catch:{ all -> 0x00c5 }
            r1.i();	 Catch:{ all -> 0x00c5 }
            r1 = r10.e;	 Catch:{ all -> 0x00c5 }
            if (r1 != 0) goto L_0x0063;	 Catch:{ all -> 0x00c5 }
            defpackage.akcr.a(r0);	 Catch:{ all -> 0x00c5 }
            r1 = r1.h();	 Catch:{ all -> 0x00c5 }
            r2 = "InfoButtonBuilder.Builder#attachToViewStub";	 Catch:{ all -> 0x00c5 }
            r1 = defpackage.zgb.a(r1, r2);	 Catch:{ all -> 0x00c5 }
            r2 = r10.e;	 Catch:{ all -> 0x00c5 }
            if (r2 != 0) goto L_0x0074;	 Catch:{ all -> 0x00c5 }
            defpackage.akcr.a(r0);	 Catch:{ all -> 0x00c5 }
            r5 = r2.k();	 Catch:{ all -> 0x00c5 }
            r2 = 2131558940; // 0x7f0d021c float:1.874321E38 double:1.0531300443E-314;	 Catch:{ all -> 0x00c5 }
            r3 = defpackage.lum.class;	 Catch:{ all -> 0x00c5 }
            r4 = 1;	 Catch:{ all -> 0x00c5 }
            r6 = 0;	 Catch:{ all -> 0x00c5 }
            r7 = 1;	 Catch:{ all -> 0x00c5 }
            r0 = defpackage.mit.a(r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x00c5 }
            r9 = r9.a(r0);	 Catch:{ all -> 0x00c5 }
            r0 = r1.l();	 Catch:{ all -> 0x00c5 }
            r0 = (defpackage.zfr) r0;	 Catch:{ all -> 0x00c5 }
            r0 = (defpackage.ajdw) r0;	 Catch:{ all -> 0x00c5 }
            r9 = r9.b(r0);	 Catch:{ all -> 0x00c5 }
            r0 = r1.l();	 Catch:{ all -> 0x00c5 }
            r0 = (defpackage.zfr) r0;	 Catch:{ all -> 0x00c5 }
            r0 = (defpackage.ajdw) r0;	 Catch:{ all -> 0x00c5 }
            r9 = r9.c(r0);	 Catch:{ all -> 0x00c5 }
            r9 = r9.i();	 Catch:{ all -> 0x00c5 }
            r9 = r9.a();	 Catch:{ all -> 0x00c5 }
            r0 = "viewStub.compose(ViewObs…              .refCount()";	 Catch:{ all -> 0x00c5 }
            defpackage.akcr.a(r9, r0);	 Catch:{ all -> 0x00c5 }
            r10.b(r9);	 Catch:{ all -> 0x00c5 }
            r8 = (defpackage.luf.a) r8;	 Catch:{ all -> 0x00c5 }
            r8 = r8.a(r12);	 Catch:{ all -> 0x00c5 }
            r9 = defpackage.lrk.a(r11);	 Catch:{ all -> 0x00c5 }
            r8 = r8.a(r9);	 Catch:{ all -> 0x00c5 }
            r8 = (defpackage.mhi) r8;	 Catch:{ all -> 0x00c5 }
            goto L_0x00c4;	 Catch:{ all -> 0x00c5 }
            r8 = defpackage.mhc.a;	 Catch:{ all -> 0x00c5 }
            goto L_0x00be;
            return r8;
            r8 = move-exception;
            throw r8;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lrj$b.a(lrj$a, lsu, ajdp, ajdp, myv):mhi");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x00e9 in {6, 9, 12, 15, 16, 19, 20, 22} preds:[]
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
        public static final defpackage.mhi<? extends defpackage.mha> a(defpackage.lrj.a r8, defpackage.lsu r9, defpackage.ajdp<defpackage.lsd> r10, defpackage.mtj r11) {
            /*
            r0 = "parentComponent";
            r1 = "component";
            defpackage.akcr.b(r8, r1);
            r1 = "layoutConfiguration";
            defpackage.akcr.b(r9, r1);
            r1 = "viewProvider";
            defpackage.akcr.b(r10, r1);
            r1 = "externalImagesRepository";
            defpackage.akcr.b(r11, r1);
            r9 = r9.b;	 Catch:{ all -> 0x00e7 }
            if (r9 == 0) goto L_0x00e3;	 Catch:{ all -> 0x00e7 }
            r9 = (java.lang.Number) r9;	 Catch:{ all -> 0x00e7 }
            r9 = r9.intValue();	 Catch:{ all -> 0x00e7 }
            r8 = (defpackage.lva.d) r8;	 Catch:{ all -> 0x00e7 }
            defpackage.akcr.b(r8, r0);	 Catch:{ all -> 0x00e7 }
            r1 = defpackage.lup.c();	 Catch:{ all -> 0x00e7 }
            defpackage.akcr.b(r8, r0);	 Catch:{ all -> 0x00e7 }
            r2 = r1;	 Catch:{ all -> 0x00e7 }
            r2 = (defpackage.lva.a) r2;	 Catch:{ all -> 0x00e7 }
            r2.a(r8);	 Catch:{ all -> 0x00e7 }
            r2.e = r8;	 Catch:{ all -> 0x00e7 }
            r1 = (defpackage.lva.a) r1;	 Catch:{ all -> 0x00e7 }
            r8 = defpackage.ajot.a;	 Catch:{ all -> 0x00e7 }
            r8 = defpackage.ajvo.a(r8);	 Catch:{ all -> 0x00e7 }
            r2 = "Observable.empty()";	 Catch:{ all -> 0x00e7 }
            defpackage.akcr.a(r8, r2);	 Catch:{ all -> 0x00e7 }
            r8 = r1.b(r8);	 Catch:{ all -> 0x00e7 }
            r1 = defpackage.mih.e;	 Catch:{ all -> 0x00e7 }
            r1 = defpackage.ajdp.b(r1);	 Catch:{ all -> 0x00e7 }
            r2 = "Observable.just(Rectangle.ZERO)";	 Catch:{ all -> 0x00e7 }
            defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x00e7 }
            r8 = r8.a(r1);	 Catch:{ all -> 0x00e7 }
            r1 = defpackage.mtj.b.a;	 Catch:{ all -> 0x00e7 }
            r1 = (defpackage.mtj) r1;	 Catch:{ all -> 0x00e7 }
            r8 = r8.a(r1);	 Catch:{ all -> 0x00e7 }
            r9 = defpackage.mit.a(r9, r10);	 Catch:{ all -> 0x00e7 }
            r10 = "viewStub";	 Catch:{ all -> 0x00e7 }
            defpackage.akcr.b(r9, r10);	 Catch:{ all -> 0x00e7 }
            r10 = r8;	 Catch:{ all -> 0x00e7 }
            r10 = (defpackage.lva.a) r10;	 Catch:{ all -> 0x00e7 }
            r1 = r10.e;	 Catch:{ all -> 0x00e7 }
            if (r1 != 0) goto L_0x006f;	 Catch:{ all -> 0x00e7 }
            defpackage.akcr.a(r0);	 Catch:{ all -> 0x00e7 }
            r1.i();	 Catch:{ all -> 0x00e7 }
            r1 = r10.e;	 Catch:{ all -> 0x00e7 }
            if (r1 != 0) goto L_0x0079;	 Catch:{ all -> 0x00e7 }
            defpackage.akcr.a(r0);	 Catch:{ all -> 0x00e7 }
            r1 = r1.h();	 Catch:{ all -> 0x00e7 }
            r2 = "ImagePickerComponent#attachToViewStub";	 Catch:{ all -> 0x00e7 }
            r1 = defpackage.zgb.a(r1, r2);	 Catch:{ all -> 0x00e7 }
            r2 = r10.e;	 Catch:{ all -> 0x00e7 }
            if (r2 != 0) goto L_0x008a;	 Catch:{ all -> 0x00e7 }
            defpackage.akcr.a(r0);	 Catch:{ all -> 0x00e7 }
            r5 = r2.k();	 Catch:{ all -> 0x00e7 }
            r2 = 2131558939; // 0x7f0d021b float:1.8743208E38 double:1.053130044E-314;	 Catch:{ all -> 0x00e7 }
            r3 = defpackage.lvi.class;	 Catch:{ all -> 0x00e7 }
            r4 = 1;	 Catch:{ all -> 0x00e7 }
            r6 = 0;	 Catch:{ all -> 0x00e7 }
            r7 = 1;	 Catch:{ all -> 0x00e7 }
            r2 = defpackage.mit.a(r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x00e7 }
            r9 = r9.a(r2);	 Catch:{ all -> 0x00e7 }
            r2 = "viewStub.compose(ViewObs…  showOnInflate = false))";	 Catch:{ all -> 0x00e7 }
            defpackage.akcr.a(r9, r2);	 Catch:{ all -> 0x00e7 }
            r2 = r10.e;	 Catch:{ all -> 0x00e7 }
            if (r2 != 0) goto L_0x00aa;	 Catch:{ all -> 0x00e7 }
            defpackage.akcr.a(r0);	 Catch:{ all -> 0x00e7 }
            r0 = r2.h();	 Catch:{ all -> 0x00e7 }
            r9 = defpackage.mhe.a(r9, r0);	 Catch:{ all -> 0x00e7 }
            r0 = r1.l();	 Catch:{ all -> 0x00e7 }
            r0 = (defpackage.zfr) r0;	 Catch:{ all -> 0x00e7 }
            r0 = (defpackage.ajdw) r0;	 Catch:{ all -> 0x00e7 }
            r9 = r9.b(r0);	 Catch:{ all -> 0x00e7 }
            r0 = r1.l();	 Catch:{ all -> 0x00e7 }
            r0 = (defpackage.zfr) r0;	 Catch:{ all -> 0x00e7 }
            r0 = (defpackage.ajdw) r0;	 Catch:{ all -> 0x00e7 }
            r9 = r9.c(r0);	 Catch:{ all -> 0x00e7 }
            r9 = r9.i();	 Catch:{ all -> 0x00e7 }
            r9 = r9.a();	 Catch:{ all -> 0x00e7 }
            r0 = "viewStub.compose(ViewObs…              .refCount()";	 Catch:{ all -> 0x00e7 }
            defpackage.akcr.a(r9, r0);	 Catch:{ all -> 0x00e7 }
            r10.b(r9);	 Catch:{ all -> 0x00e7 }
            r8 = (defpackage.lva.a) r8;	 Catch:{ all -> 0x00e7 }
            r8 = r8.a(r11);	 Catch:{ all -> 0x00e7 }
            r8 = (defpackage.mhi) r8;	 Catch:{ all -> 0x00e7 }
            goto L_0x00e6;	 Catch:{ all -> 0x00e7 }
            r8 = defpackage.mhc.a;	 Catch:{ all -> 0x00e7 }
            goto L_0x00e0;
            return r8;
            r8 = move-exception;
            throw r8;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lrj$b.a(lrj$a, lsu, ajdp, mtj):mhi");
        }

        public static final mhi<? extends mha> a(lsa lsa, lpi lpi) {
            akcr.b(lsa, "carouselUseCase");
            akcr.b(lpi, "backPressInteractor");
            return new lrc(lsa, lpi);
        }

        public static final boolean a(miw miw) {
            Object a;
            akcr.b(miw, "configurationRepository");
            miw.c a2 = miw.a(defpackage.miw.b.a.a);
            mje mje = mja.CAMERA_CAROUSEL_SWITCH_SCHEDULE;
            try {
                ajdp f;
                Object obj = Boolean.class;
                if (!akcr.a(obj, Boolean.TYPE)) {
                    if (!akcr.a(obj, (Object) Boolean.class)) {
                        if (!akcr.a(obj, (Object) Integer.class)) {
                            if (!akcr.a(obj, (Object) Integer.class)) {
                                if (!akcr.a(obj, Long.TYPE)) {
                                    if (!akcr.a(obj, (Object) Long.class)) {
                                        if (!akcr.a(obj, Float.TYPE)) {
                                            if (!akcr.a(obj, (Object) Float.class)) {
                                                if (!akcr.a(obj, Double.TYPE)) {
                                                    if (!akcr.a(obj, (Object) Double.class)) {
                                                        if (!akcr.a(obj, (Object) String.class)) {
                                                            if (!akcr.a(obj, (Object) String.class)) {
                                                                StringBuilder stringBuilder = new StringBuilder("Unsupported input type: [");
                                                                stringBuilder.append(Boolean.class);
                                                                stringBuilder.append(']');
                                                                throw new IllegalArgumentException(stringBuilder.toString());
                                                            }
                                                        }
                                                        f = a2.f(mje);
                                                        a = f.a(Boolean.class);
                                                        akcr.a(a, "cast(R::class.java)");
                                                        a = a.b();
                                                        akcr.a(a, "observe<T>(key).blockingFirst()");
                                                        return ((Boolean) a).booleanValue();
                                                    }
                                                }
                                                f = a2.c(mje);
                                                a = f.a(Boolean.class);
                                                akcr.a(a, "cast(R::class.java)");
                                                a = a.b();
                                                akcr.a(a, "observe<T>(key).blockingFirst()");
                                                return ((Boolean) a).booleanValue();
                                            }
                                        }
                                        f = a2.b(mje);
                                        a = f.a(Boolean.class);
                                        akcr.a(a, "cast(R::class.java)");
                                        a = a.b();
                                        akcr.a(a, "observe<T>(key).blockingFirst()");
                                        return ((Boolean) a).booleanValue();
                                    }
                                }
                                f = a2.e(mje);
                                a = f.a(Boolean.class);
                                akcr.a(a, "cast(R::class.java)");
                                a = a.b();
                                akcr.a(a, "observe<T>(key).blockingFirst()");
                                return ((Boolean) a).booleanValue();
                            }
                        }
                        f = a2.d(mje);
                        a = f.a(Boolean.class);
                        akcr.a(a, "cast(R::class.java)");
                        a = a.b();
                        akcr.a(a, "observe<T>(key).blockingFirst()");
                        return ((Boolean) a).booleanValue();
                    }
                }
                f = a2.a(mje);
                a = f.a(Boolean.class);
                akcr.a(a, "cast(R::class.java)");
                a = a.b();
                akcr.a(a, "observe<T>(key).blockingFirst()");
            } catch (Throwable th) {
                if (Throwables.getRootCause(th) instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                    a = mje.a();
                    akcr.a(a, "key.delegate");
                    a = a.b();
                    if (a != null) {
                        a = (Boolean) a;
                    } else {
                        ajxt ajxt = new ajxt("null cannot be cast to non-null type kotlin.Boolean");
                    }
                }
            }
            return ((Boolean) a).booleanValue();
        }

        /* JADX WARNING: Removed duplicated region for block: B:54:0x00f0 A:{SKIP} */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00f0 A:{SKIP} */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00f0 A:{SKIP} */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00f0 A:{SKIP} */
        public static final boolean a(defpackage.miw r3, boolean r4) {
            /*
            r0 = "configurationRepository";
            defpackage.akcr.b(r3, r0);
            r3 = r3.a(defpackage.miw.b.a.a);	 Catch:{ all -> 0x0100 }
            r0 = defpackage.mja.CAMERA_CAROUSEL_FAKE_ITEMS;	 Catch:{ all -> 0x0100 }
            r0 = (defpackage.mje) r0;	 Catch:{ all -> 0x0100 }
            r1 = java.lang.Boolean.class;
            r2 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 != 0) goto L_0x00ac;
        L_0x0017:
            r2 = java.lang.Boolean.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 == 0) goto L_0x0021;
        L_0x001f:
            goto L_0x00ac;
        L_0x0021:
            r2 = java.lang.Integer.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 != 0) goto L_0x00a7;
        L_0x0029:
            r2 = java.lang.Integer.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 == 0) goto L_0x0032;
        L_0x0031:
            goto L_0x00a7;
        L_0x0032:
            r2 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 != 0) goto L_0x00a2;
        L_0x003a:
            r2 = java.lang.Long.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 == 0) goto L_0x0043;
        L_0x0042:
            goto L_0x00a2;
        L_0x0043:
            r2 = java.lang.Float.TYPE;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 != 0) goto L_0x009d;
        L_0x004b:
            r2 = java.lang.Float.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 == 0) goto L_0x0054;
        L_0x0053:
            goto L_0x009d;
        L_0x0054:
            r2 = java.lang.Double.TYPE;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 != 0) goto L_0x0098;
        L_0x005c:
            r2 = java.lang.Double.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 == 0) goto L_0x0065;
        L_0x0064:
            goto L_0x0098;
        L_0x0065:
            r2 = java.lang.String.class;
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 != 0) goto L_0x0093;
        L_0x006d:
            r2 = java.lang.String.class;
            r1 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r1 == 0) goto L_0x0076;
        L_0x0075:
            goto L_0x0093;
        L_0x0076:
            r3 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x00c7 }
            r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00c7 }
            r2 = "Unsupported input type: [";
            r1.<init>(r2);	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.Boolean.class;
            r1.append(r2);	 Catch:{ Throwable -> 0x00c7 }
            r2 = 93;
            r1.append(r2);	 Catch:{ Throwable -> 0x00c7 }
            r1 = r1.toString();	 Catch:{ Throwable -> 0x00c7 }
            r3.<init>(r1);	 Catch:{ Throwable -> 0x00c7 }
            r3 = (java.lang.Throwable) r3;	 Catch:{ Throwable -> 0x00c7 }
            throw r3;	 Catch:{ Throwable -> 0x00c7 }
        L_0x0093:
            r3 = r3.f(r0);	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00b0;
        L_0x0098:
            r3 = r3.c(r0);	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00b0;
        L_0x009d:
            r3 = r3.b(r0);	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00b0;
        L_0x00a2:
            r3 = r3.e(r0);	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00b0;
        L_0x00a7:
            r3 = r3.d(r0);	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00b0;
        L_0x00ac:
            r3 = r3.a(r0);	 Catch:{ Throwable -> 0x00c7 }
        L_0x00b0:
            r1 = java.lang.Boolean.class;
            r3 = r3.a(r1);	 Catch:{ Throwable -> 0x00c7 }
            r1 = "cast(R::class.java)";
            defpackage.akcr.a(r3, r1);	 Catch:{ Throwable -> 0x00c7 }
            r3 = r3.b();	 Catch:{ Throwable -> 0x00c7 }
            r1 = "observe<T>(key).blockingFirst()";
            defpackage.akcr.a(r3, r1);	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00e8;
        L_0x00c5:
            r3 = move-exception;
            goto L_0x00ff;
        L_0x00c7:
            r3 = move-exception;
            r1 = com.google.common.base.Throwables.getRootCause(r3);	 Catch:{ all -> 0x00c5 }
            r1 = r1 instanceof java.lang.InterruptedException;	 Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x00fe;
        L_0x00d0:
            r3 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x00c5 }
            r3.interrupt();	 Catch:{ all -> 0x00c5 }
            r3 = r0.a();	 Catch:{ all -> 0x00c5 }
            r0 = "key.delegate";
            defpackage.akcr.a(r3, r0);	 Catch:{ all -> 0x00c5 }
            r3 = r3.b();	 Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x00f6;
        L_0x00e6:
            r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x00c5 }
        L_0x00e8:
            r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0100 }
            r3 = r3.booleanValue();	 Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x00f4;
        L_0x00f0:
            if (r4 != 0) goto L_0x00f4;
        L_0x00f2:
            r3 = 1;
            goto L_0x00f5;
        L_0x00f4:
            r3 = 0;
        L_0x00f5:
            return r3;
        L_0x00f6:
            r3 = new ajxt;	 Catch:{ all -> 0x00c5 }
            r4 = "null cannot be cast to non-null type kotlin.Boolean";
            r3.<init>(r4);	 Catch:{ all -> 0x00c5 }
            throw r3;	 Catch:{ all -> 0x00c5 }
        L_0x00fe:
            throw r3;	 Catch:{ all -> 0x00c5 }
        L_0x00ff:
            throw r3;	 Catch:{ all -> 0x0100 }
        L_0x0100:
            r3 = move-exception;
            throw r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lrj$b.a(miw, boolean):boolean");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x00c2 in {6, 9, 12, 13, 16, 17, 19} preds:[]
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
        public static final defpackage.mhi<? extends defpackage.mha> b(defpackage.lrj.a r6, defpackage.lsu r7, defpackage.ajdp<defpackage.lrg> r8, defpackage.ajdp<defpackage.lsd> r9) {
            /*
            r0 = "parentComponent";
            r1 = "component";
            defpackage.akcr.b(r6, r1);
            r1 = "layoutConfiguration";
            defpackage.akcr.b(r7, r1);
            r1 = "carouselAppearance";
            defpackage.akcr.b(r8, r1);
            r1 = "viewProvider";
            defpackage.akcr.b(r9, r1);
            r7 = r7.e;	 Catch:{ all -> 0x00c0 }
            if (r7 == 0) goto L_0x00bc;	 Catch:{ all -> 0x00c0 }
            r7 = (java.lang.Number) r7;	 Catch:{ all -> 0x00c0 }
            r7 = r7.intValue();	 Catch:{ all -> 0x00c0 }
            r6 = (defpackage.lvq.d) r6;	 Catch:{ all -> 0x00c0 }
            defpackage.akcr.b(r6, r0);	 Catch:{ all -> 0x00c0 }
            r1 = defpackage.lvp.c();	 Catch:{ all -> 0x00c0 }
            defpackage.akcr.b(r6, r0);	 Catch:{ all -> 0x00c0 }
            r2 = r1;	 Catch:{ all -> 0x00c0 }
            r2 = (defpackage.lvq.a) r2;	 Catch:{ all -> 0x00c0 }
            r2.a(r6);	 Catch:{ all -> 0x00c0 }
            r2.d = r6;	 Catch:{ all -> 0x00c0 }
            r1 = (defpackage.lvq.a) r1;	 Catch:{ all -> 0x00c0 }
            r6 = defpackage.ajot.a;	 Catch:{ all -> 0x00c0 }
            r6 = defpackage.ajvo.a(r6);	 Catch:{ all -> 0x00c0 }
            r2 = "Observable.empty<Boolean>()";	 Catch:{ all -> 0x00c0 }
            defpackage.akcr.a(r6, r2);	 Catch:{ all -> 0x00c0 }
            r6 = r1.a(r6);	 Catch:{ all -> 0x00c0 }
            r8 = defpackage.lrk.a(r8);	 Catch:{ all -> 0x00c0 }
            r6 = r6.a(r8);	 Catch:{ all -> 0x00c0 }
            r7 = defpackage.mit.a(r7, r9);	 Catch:{ all -> 0x00c0 }
            r8 = "viewStub";	 Catch:{ all -> 0x00c0 }
            defpackage.akcr.b(r7, r8);	 Catch:{ all -> 0x00c0 }
            r8 = r6;	 Catch:{ all -> 0x00c0 }
            r8 = (defpackage.lvq.a) r8;	 Catch:{ all -> 0x00c0 }
            r9 = r8.d;	 Catch:{ all -> 0x00c0 }
            if (r9 != 0) goto L_0x0060;	 Catch:{ all -> 0x00c0 }
            defpackage.akcr.a(r0);	 Catch:{ all -> 0x00c0 }
            r9.i();	 Catch:{ all -> 0x00c0 }
            r9 = r8.d;	 Catch:{ all -> 0x00c0 }
            if (r9 != 0) goto L_0x006a;	 Catch:{ all -> 0x00c0 }
            defpackage.akcr.a(r0);	 Catch:{ all -> 0x00c0 }
            r9 = r9.h();	 Catch:{ all -> 0x00c0 }
            r1 = "LockedComponent.Builder#attachToViewStub";	 Catch:{ all -> 0x00c0 }
            r9 = defpackage.zgb.a(r9, r1);	 Catch:{ all -> 0x00c0 }
            r1 = r8.d;	 Catch:{ all -> 0x00c0 }
            if (r1 != 0) goto L_0x007b;	 Catch:{ all -> 0x00c0 }
            defpackage.akcr.a(r0);	 Catch:{ all -> 0x00c0 }
            r3 = r1.k();	 Catch:{ all -> 0x00c0 }
            r0 = 2131558926; // 0x7f0d020e float:1.8743182E38 double:1.0531300374E-314;	 Catch:{ all -> 0x00c0 }
            r1 = android.view.ViewGroup.class;	 Catch:{ all -> 0x00c0 }
            r2 = 1;	 Catch:{ all -> 0x00c0 }
            r4 = 0;	 Catch:{ all -> 0x00c0 }
            r5 = 1;	 Catch:{ all -> 0x00c0 }
            r0 = defpackage.mit.a(r0, r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00c0 }
            r7 = r7.a(r0);	 Catch:{ all -> 0x00c0 }
            r0 = r9.l();	 Catch:{ all -> 0x00c0 }
            r0 = (defpackage.zfr) r0;	 Catch:{ all -> 0x00c0 }
            r0 = (defpackage.ajdw) r0;	 Catch:{ all -> 0x00c0 }
            r7 = r7.b(r0);	 Catch:{ all -> 0x00c0 }
            r9 = r9.l();	 Catch:{ all -> 0x00c0 }
            r9 = (defpackage.zfr) r9;	 Catch:{ all -> 0x00c0 }
            r9 = (defpackage.ajdw) r9;	 Catch:{ all -> 0x00c0 }
            r7 = r7.c(r9);	 Catch:{ all -> 0x00c0 }
            r7 = r7.i();	 Catch:{ all -> 0x00c0 }
            r7 = r7.a();	 Catch:{ all -> 0x00c0 }
            r9 = "viewStub.compose(ViewObs…              .refCount()";	 Catch:{ all -> 0x00c0 }
            defpackage.akcr.a(r7, r9);	 Catch:{ all -> 0x00c0 }
            r8.b(r7);	 Catch:{ all -> 0x00c0 }
            r6 = (defpackage.lvq.a) r6;	 Catch:{ all -> 0x00c0 }
            r6 = (defpackage.mhi) r6;	 Catch:{ all -> 0x00c0 }
            goto L_0x00bf;	 Catch:{ all -> 0x00c0 }
            r6 = defpackage.mhc.a;	 Catch:{ all -> 0x00c0 }
            goto L_0x00b9;
            return r6;
            r6 = move-exception;
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lrj$b.b(lrj$a, lsu, ajdp, ajdp):mhi");
        }

        public static final boolean b(miw miw) {
            Object a;
            akcr.b(miw, "configurationRepository");
            miw.c a2 = miw.a(defpackage.miw.b.a.a);
            mje mje = mja.CAMERA_LEFT_CAROUSEL_SUPPORT;
            try {
                ajdp f;
                Object obj = Boolean.class;
                if (!akcr.a(obj, Boolean.TYPE)) {
                    if (!akcr.a(obj, (Object) Boolean.class)) {
                        if (!akcr.a(obj, (Object) Integer.class)) {
                            if (!akcr.a(obj, (Object) Integer.class)) {
                                if (!akcr.a(obj, Long.TYPE)) {
                                    if (!akcr.a(obj, (Object) Long.class)) {
                                        if (!akcr.a(obj, Float.TYPE)) {
                                            if (!akcr.a(obj, (Object) Float.class)) {
                                                if (!akcr.a(obj, Double.TYPE)) {
                                                    if (!akcr.a(obj, (Object) Double.class)) {
                                                        if (!akcr.a(obj, (Object) String.class)) {
                                                            if (!akcr.a(obj, (Object) String.class)) {
                                                                StringBuilder stringBuilder = new StringBuilder("Unsupported input type: [");
                                                                stringBuilder.append(Boolean.class);
                                                                stringBuilder.append(']');
                                                                throw new IllegalArgumentException(stringBuilder.toString());
                                                            }
                                                        }
                                                        f = a2.f(mje);
                                                        a = f.a(Boolean.class);
                                                        akcr.a(a, "cast(R::class.java)");
                                                        a = a.b();
                                                        akcr.a(a, "observe<T>(key).blockingFirst()");
                                                        return ((Boolean) a).booleanValue();
                                                    }
                                                }
                                                f = a2.c(mje);
                                                a = f.a(Boolean.class);
                                                akcr.a(a, "cast(R::class.java)");
                                                a = a.b();
                                                akcr.a(a, "observe<T>(key).blockingFirst()");
                                                return ((Boolean) a).booleanValue();
                                            }
                                        }
                                        f = a2.b(mje);
                                        a = f.a(Boolean.class);
                                        akcr.a(a, "cast(R::class.java)");
                                        a = a.b();
                                        akcr.a(a, "observe<T>(key).blockingFirst()");
                                        return ((Boolean) a).booleanValue();
                                    }
                                }
                                f = a2.e(mje);
                                a = f.a(Boolean.class);
                                akcr.a(a, "cast(R::class.java)");
                                a = a.b();
                                akcr.a(a, "observe<T>(key).blockingFirst()");
                                return ((Boolean) a).booleanValue();
                            }
                        }
                        f = a2.d(mje);
                        a = f.a(Boolean.class);
                        akcr.a(a, "cast(R::class.java)");
                        a = a.b();
                        akcr.a(a, "observe<T>(key).blockingFirst()");
                        return ((Boolean) a).booleanValue();
                    }
                }
                f = a2.a(mje);
                a = f.a(Boolean.class);
                akcr.a(a, "cast(R::class.java)");
                a = a.b();
                akcr.a(a, "observe<T>(key).blockingFirst()");
            } catch (Throwable th) {
                if (Throwables.getRootCause(th) instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                    a = mje.a();
                    akcr.a(a, "key.delegate");
                    a = a.b();
                    if (a != null) {
                        a = (Boolean) a;
                    } else {
                        ajxt ajxt = new ajxt("null cannot be cast to non-null type kotlin.Boolean");
                    }
                }
            }
            return ((Boolean) a).booleanValue();
        }

        public static final ajdp<Boolean> c(miw miw) {
            akcr.b(miw, "configurationRepository");
            return miw.a(defpackage.miw.b.a.a).a(mja.CAMERA_LENS_BLUE_BADGES);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:62:0x0105 in {6, 11, 16, 21, 26, 31, 33, 34, 35, 36, 37, 38, 39, 41, 50, 53, 55, 56, 59, 60, 61} preds:[]
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
        public static final defpackage.lsw d(defpackage.miw r3) {
            /*
            r0 = "configurationRepository";
            defpackage.akcr.b(r3, r0);
            r3 = r3.a(defpackage.miw.b.a.a);
            r0 = defpackage.mja.MOVE_SPONSORED_GEO_LENSES_TO_BACK;
            r0 = (defpackage.mje) r0;
            r1 = java.lang.Boolean.class;	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 != 0) goto L_0x00ac;	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.Boolean.class;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 == 0) goto L_0x0021;	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00ac;	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.Integer.class;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 != 0) goto L_0x00a7;	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.Integer.class;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 == 0) goto L_0x0032;	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00a7;	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 != 0) goto L_0x00a2;	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.Long.class;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 == 0) goto L_0x0043;	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00a2;	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.Float.TYPE;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 != 0) goto L_0x009d;	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.Float.class;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 == 0) goto L_0x0054;	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x009d;	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.Double.TYPE;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 != 0) goto L_0x0098;	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.Double.class;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 == 0) goto L_0x0065;	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x0098;	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.String.class;	 Catch:{ Throwable -> 0x00c7 }
            r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r2 != 0) goto L_0x0093;	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.String.class;	 Catch:{ Throwable -> 0x00c7 }
            r1 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00c7 }
            if (r1 == 0) goto L_0x0076;	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x0093;	 Catch:{ Throwable -> 0x00c7 }
            r3 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x00c7 }
            r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00c7 }
            r2 = "Unsupported input type: [";	 Catch:{ Throwable -> 0x00c7 }
            r1.<init>(r2);	 Catch:{ Throwable -> 0x00c7 }
            r2 = java.lang.Boolean.class;	 Catch:{ Throwable -> 0x00c7 }
            r1.append(r2);	 Catch:{ Throwable -> 0x00c7 }
            r2 = 93;	 Catch:{ Throwable -> 0x00c7 }
            r1.append(r2);	 Catch:{ Throwable -> 0x00c7 }
            r1 = r1.toString();	 Catch:{ Throwable -> 0x00c7 }
            r3.<init>(r1);	 Catch:{ Throwable -> 0x00c7 }
            r3 = (java.lang.Throwable) r3;	 Catch:{ Throwable -> 0x00c7 }
            throw r3;	 Catch:{ Throwable -> 0x00c7 }
            r3 = r3.f(r0);	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00b0;	 Catch:{ Throwable -> 0x00c7 }
            r3 = r3.c(r0);	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00b0;	 Catch:{ Throwable -> 0x00c7 }
            r3 = r3.b(r0);	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00b0;	 Catch:{ Throwable -> 0x00c7 }
            r3 = r3.e(r0);	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00b0;	 Catch:{ Throwable -> 0x00c7 }
            r3 = r3.d(r0);	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00b0;	 Catch:{ Throwable -> 0x00c7 }
            r3 = r3.a(r0);	 Catch:{ Throwable -> 0x00c7 }
            r1 = java.lang.Boolean.class;	 Catch:{ Throwable -> 0x00c7 }
            r3 = r3.a(r1);	 Catch:{ Throwable -> 0x00c7 }
            r1 = "cast(R::class.java)";	 Catch:{ Throwable -> 0x00c7 }
            defpackage.akcr.a(r3, r1);	 Catch:{ Throwable -> 0x00c7 }
            r3 = r3.b();	 Catch:{ Throwable -> 0x00c7 }
            r1 = "observe<T>(key).blockingFirst()";	 Catch:{ Throwable -> 0x00c7 }
            defpackage.akcr.a(r3, r1);	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00e8;
            r3 = move-exception;
            goto L_0x0104;
            r3 = move-exception;
            r1 = com.google.common.base.Throwables.getRootCause(r3);	 Catch:{ all -> 0x00c5 }
            r1 = r1 instanceof java.lang.InterruptedException;	 Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x0103;	 Catch:{ all -> 0x00c5 }
            r3 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x00c5 }
            r3.interrupt();	 Catch:{ all -> 0x00c5 }
            r3 = r0.a();	 Catch:{ all -> 0x00c5 }
            r0 = "key.delegate";	 Catch:{ all -> 0x00c5 }
            defpackage.akcr.a(r3, r0);	 Catch:{ all -> 0x00c5 }
            r3 = r3.b();	 Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x00fb;	 Catch:{ all -> 0x00c5 }
            r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x00c5 }
            r3 = (java.lang.Boolean) r3;
            r3 = r3.booleanValue();
            if (r3 == 0) goto L_0x00f8;
            r3 = new lrj$b$b;
            r3.<init>();
            r3 = (defpackage.lsw) r3;
            return r3;
            r3 = defpackage.lsv.a;
            goto L_0x00f5;
            r3 = new ajxt;	 Catch:{ all -> 0x00c5 }
            r0 = "null cannot be cast to non-null type kotlin.Boolean";	 Catch:{ all -> 0x00c5 }
            r3.<init>(r0);	 Catch:{ all -> 0x00c5 }
            throw r3;	 Catch:{ all -> 0x00c5 }
            throw r3;	 Catch:{ all -> 0x00c5 }
            throw r3;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lrj$b.d(miw):lsw");
        }
    }

    public lrj(c cVar) {
        akcr.b(cVar, "parentComponent");
        this.n = cVar;
        Object a = ajvo.a(ajot.a);
        akcr.a(a, "empty()");
        this.a = a;
        a = ajdp.a(lrg.a.b.a, lrg.b.b.a);
        akcr.a(a, "just<CarouselAppearance>…CloseButton.Visible\n    )");
        this.e = a;
        this.f = ajvo.a(ajot.a);
        a = ajdp.b(mih.e);
        akcr.a(a, "Observable.just(Rectangle.ZERO)");
        this.g = a;
        this.h = lth.a.a;
        this.i = lpi.b.a;
        this.j = mzk.a.a;
        this.k = mtj.b.a;
        this.l = mwa.a.a;
        this.m = myr.a(this.n.q(), new g(this));
    }

    public final /* synthetic */ Object a() {
        a b = lsf.g().a(this.a).a(this.b).a(this.c).b(this.e);
        Object obj = this.f;
        akcr.a(obj, "cameraAverageFps");
        return b.c(obj).b(this.d).d(this.g).a(this.n).a(this.h).a(this.i).a(this.j).a(this.k).a(this.n).a(this.l).a();
    }
}
