package defpackage;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.column.FriendmojiCategory;
import com.snap.core.db.query.LegacyFriendsFeedQueries.WithFriendAndStory;
import com.snap.core.db.record.FriendmojiRecord.FriendmojiDict;
import com.snap.ui.view.emoji.SnapEmojiSpanFactory;
import defpackage.rbb.a;
import defpackage.yic.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: rcz */
public final class rcz extends ajed implements zma {
    private static /* synthetic */ aken[] A = new aken[]{new akdc(akde.a(rcz.class), "contextRef", "getContextRef()Landroid/content/Context;"), new akdc(akde.a(rcz.class), "config", "getConfig()Lio/reactivex/Observable;"), new akdc(akde.a(rcz.class), "viewModelSource", "getViewModelSource()Lio/reactivex/Observable;")};
    private final iim B;
    private final ajei C;
    private final LongSparseArray<ajei> D;
    private final ajxe E;
    private final zfw F;
    final ajxe a;
    boolean b = true;
    final ihl c = new ihl();
    final ajdw d = this.F.h();
    final ajdw e = zfx.a((ajdw) this.F.b(), 1);
    final rbi f;
    final a g;
    final qzm h;
    final qzm i;
    final ajdp<Boolean> j;
    final qzn k;
    final yic l;
    final rbe m;
    final ihi n;
    final ajdp<znh<WithFriendAndStory>> o;
    final ajwo<Integer> p;
    final ajwm q;
    final ajdp<abkq> r;
    final ajcx s;
    final ajdp<List<FriendmojiDict>> t;
    final qwi u;
    final SnapEmojiSpanFactory v;
    final ajwy<gqr> w;
    final eyn x;
    final hmm y;
    final ajdp<Boolean> z;

    /* renamed from: rcz$b */
    static final class b extends akcs implements akbk<ajdp<rbj>> {
        private /* synthetic */ rbk a;

        b(rbk rbk) {
            this.a = rbk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a();
        }
    }

    /* renamed from: rcz$j */
    static final class j extends akcs implements akbk<ajdp<znh<zmy>>> {
        final /* synthetic */ rcz a;

        /* renamed from: rcz$j$d */
        static final class d extends akcq implements akbl<rdx, ajdp<znh<zmy>>> {
            d(rcz rcz) {
                super(1, rcz);
            }

            public final String getName() {
                return "toViewModels";
            }

            public final akej getOwner() {
                return akde.a(rcz.class);
            }

            public final String getSignature() {
                return "toViewModels(Lcom/snap/messaging/friendsfeed/ui/viewmodel/FriendsFeedState;)Lio/reactivex/Observable;";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                rdx rdx = (rdx) obj;
                akcr.b(rdx, "p1");
                return ((rcz) this.receiver).a(rdx);
            }
        }

        /* renamed from: rcz$j$f */
        static final class f<T> implements ajfl<Boolean> {
            public static final f a = new f();

            f() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "it");
                return bool.booleanValue();
            }
        }

        /* renamed from: rcz$j$e */
        static final class e<T, R> implements ajfc<T, R> {
            private /* synthetic */ j a;

            e(j jVar) {
                this.a = jVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return this.a.a.f.a(list);
            }
        }

        /* renamed from: rcz$j$a */
        public static final class a<T1, T2, T3, T4, T5, T6, T7, R> implements ajfh<T1, T2, T3, T4, T5, T6, T7, R> {
            public final R a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
                return new rdx((znh) t1, (rbj) t2, ((Boolean) t3).booleanValue(), (rbf) t4, (rbi) t5, (abkq) t6, ((Boolean) t7).booleanValue());
            }
        }

        /* renamed from: rcz$j$b */
        public static final class b<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
            public final R apply(T1 t1, T2 t2, T3 t3) {
                return new a((qzn.a) t1, (defpackage.yic.b) t2, (qwj) t3);
            }
        }

        /* renamed from: rcz$j$c */
        public static final class c<T1, T2, R> implements ajex<T1, T2, R> {
            private /* synthetic */ rcz a;

            public c(rcz rcz) {
                this.a = rcz;
            }

            public final R apply(T1 t1, T2 t2) {
                return rcz.a((znh) t1, (a) t2);
            }
        }

        /* renamed from: rcz$j$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ j a;

            1(j jVar) {
                this.a = jVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                obj = (znh) obj;
                akcr.b(obj, "it");
                return this.a.a.s.a((ajdt) ajdp.b(obj));
            }
        }

        j(rcz rcz) {
            this.a = rcz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object h = this.a.j.a(this.a.d).a((ajfl) f.a).b(1).h(Boolean.TRUE);
            Object a = this.a.m.a().a(this.a.d);
            Object p = this.a.t.p(new e(this));
            ajdp ajdp = this.a.k.a;
            ajdp a2 = this.a.l.a();
            Object a3 = this.a.u.r.a(this.a.d);
            ajdp ajdp2 = this.a.o;
            ajdp ajdp3 = (ajdp) this.a.a.b();
            akcr.a(h, Property.VISIBLE);
            akcr.a(a, "activeConversationState");
            akcr.a(p, "friendmojiMap");
            ajdp a4 = ajdp.a(ajdp2, ajdp3, (ajdt) h, (ajdt) a, (ajdt) p, this.a.r, this.a.z, new a());
            if (a4 == null) {
                akcr.a();
            }
            h = a4.u(new rdb(new d(this.a)));
            akcr.a(a3, "feedViewState");
            ajdp a5 = ajdp.a((ajdt) ajdp, (ajdt) a2, (ajdt) a3, (ajfd) new b());
            if (a5 == null) {
                akcr.a();
            }
            a = a5.f(200, TimeUnit.MILLISECONDS, this.a.d);
            akcr.a(h, "baseModels");
            akcr.a(a, "mediaUpdates");
            a4 = ajdp.a((ajdt) h, (ajdt) a, (ajex) new c(this.a));
            if (a4 == null) {
                akcr.a();
            }
            h = a4.u(new 1(this)).d((ajfb) new rda(new akbl<znh<zmy>, ajxw>(this.a) {
                public final String getName() {
                    return "handleModelsChange";
                }

                public final akej getOwner() {
                    return akde.a(rcz.class);
                }

                public final String getSignature() {
                    return "handleModelsChange(Lcom/snap/ui/seeking/Seekable;)V";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    znh znh = (znh) obj;
                    akcr.b(znh, "p1");
                    rcz rcz = (rcz) this.receiver;
                    znh.a();
                    rcz.b = false;
                    rcz.q.a();
                    rcz.p.a(Integer.valueOf(znh.a()));
                    return ajxw.a;
                }
            }));
            akcr.a(h, "combineLatest(baseModels…xt (::handleModelsChange)");
            return igs.a(h);
        }
    }

    /* renamed from: rcz$a */
    public static final class a {
        final defpackage.qzn.a a;
        final b b;
        final qwj c;

        public a(defpackage.qzn.a aVar, b bVar, qwj qwj) {
            akcr.b(aVar, "snaps");
            akcr.b(bVar, "stories");
            akcr.b(qwj, "feedViewState");
            this.a = aVar;
            this.b = bVar;
            this.c = qwj;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.rcz.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.rcz.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rcz$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            defpackage.qzn.a aVar = this.a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            b bVar = this.b;
            hashCode = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            qwj qwj = this.c;
            if (qwj != null) {
                i = qwj.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("MediaSources(snaps=");
            stringBuilder.append(this.a);
            stringBuilder.append(", stories=");
            stringBuilder.append(this.b);
            stringBuilder.append(", feedViewState=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: rcz$f */
    static final class f<T> implements ajfb<ajej> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ void accept(Object obj) {
            in.a("ff:vm");
        }
    }

    /* renamed from: rcz$g */
    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ rcz a;
        private /* synthetic */ b b;
        private /* synthetic */ qzn.a c;
        private /* synthetic */ qwj d;
        private /* synthetic */ rdw e;
        private /* synthetic */ rdx f;

        g(rcz rcz, b bVar, qzn.a aVar, qwj qwj, rdw rdw, rdx rdx) {
            this.a = rcz;
            this.b = bVar;
            this.c = aVar;
            this.d = qwj;
            this.e = rdw;
            this.f = rdx;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x00f0 in {5, 6, 11, 15, 17, 18, 19, 22, 23, 26, 27, 29, 31} preds:[]
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
        private defpackage.rdt a(com.snap.core.db.query.LegacyFriendsFeedQueries.WithFriendAndStory r19) {
            /*
            r18 = this;
            r1 = r18;
            r0 = "record";
            r8 = r19;
            defpackage.akcr.b(r8, r0);
            r0 = r1.b;	 Catch:{ all -> 0x00ee }
            r0 = r0.a;	 Catch:{ all -> 0x00ee }
            r2 = r19.storyId();	 Catch:{ all -> 0x00ee }
            r0 = defpackage.akcr.a(r0, r2);	 Catch:{ all -> 0x00ee }
            r2 = r1.b;	 Catch:{ all -> 0x00ee }
            r3 = r19.storyId();	 Catch:{ all -> 0x00ee }
            r2 = r2.a(r3);	 Catch:{ all -> 0x00ee }
            r3 = r19.displayInteractionType();	 Catch:{ all -> 0x00ee }
            if (r3 == 0) goto L_0x0030;	 Catch:{ all -> 0x00ee }
            r4 = "displayInteractionType";	 Catch:{ all -> 0x00ee }
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x00ee }
            r3 = defpackage.iin.valueOf(r3);	 Catch:{ all -> 0x00ee }
            if (r3 != 0) goto L_0x0032;	 Catch:{ all -> 0x00ee }
            r3 = defpackage.iin.UNKNOWN;	 Catch:{ all -> 0x00ee }
            r4 = r1.c;	 Catch:{ all -> 0x00ee }
            r5 = r19._id();	 Catch:{ all -> 0x00ee }
            r4 = r4.a(r5);	 Catch:{ all -> 0x00ee }
            r3 = r3.a();	 Catch:{ all -> 0x00ee }
            if (r3 == 0) goto L_0x009c;	 Catch:{ all -> 0x00ee }
            r3 = r1.a;	 Catch:{ all -> 0x00ee }
            r3 = r3.k;	 Catch:{ all -> 0x00ee }
            r4 = r19._id();	 Catch:{ all -> 0x00ee }
            r6 = r19.lastInteractionTimestamp();	 Catch:{ all -> 0x00ee }
            r9 = 0;	 Catch:{ all -> 0x00ee }
            if (r6 != 0) goto L_0x0056;	 Catch:{ all -> 0x00ee }
            r6 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x00ee }
            r6 = r6.longValue();	 Catch:{ all -> 0x00ee }
            r11 = r3.c;	 Catch:{ all -> 0x00ee }
            r12 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x00ee }
            r11 = r11.get(r12);	 Catch:{ all -> 0x00ee }
            r11 = (java.lang.Long) r11;	 Catch:{ all -> 0x00ee }
            r12 = r3.c;	 Catch:{ all -> 0x00ee }
            r12 = (java.util.Map) r12;	 Catch:{ all -> 0x00ee }
            r13 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x00ee }
            r14 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x00ee }
            r12.put(r13, r14);	 Catch:{ all -> 0x00ee }
            r12 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));	 Catch:{ all -> 0x00ee }
            if (r12 == 0) goto L_0x008c;	 Catch:{ all -> 0x00ee }
            if (r11 != 0) goto L_0x007c;	 Catch:{ all -> 0x00ee }
            goto L_0x0084;	 Catch:{ all -> 0x00ee }
            r9 = r11.longValue();	 Catch:{ all -> 0x00ee }
            r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));	 Catch:{ all -> 0x00ee }
            if (r11 == 0) goto L_0x008c;	 Catch:{ all -> 0x00ee }
            r6 = defpackage.prl.NOT_STARTED;	 Catch:{ all -> 0x00ee }
            r3.a(r4, r6);	 Catch:{ all -> 0x00ee }
            r3 = defpackage.prl.NOT_STARTED;	 Catch:{ all -> 0x00ee }
            goto L_0x009b;	 Catch:{ all -> 0x00ee }
            r3 = r3.b;	 Catch:{ all -> 0x00ee }
            r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x00ee }
            r3 = r3.get(r4);	 Catch:{ all -> 0x00ee }
            r3 = (defpackage.prl) r3;	 Catch:{ all -> 0x00ee }
            if (r3 != 0) goto L_0x009b;	 Catch:{ all -> 0x00ee }
            goto L_0x0089;	 Catch:{ all -> 0x00ee }
            r4 = r3;	 Catch:{ all -> 0x00ee }
            r9 = new reb;	 Catch:{ all -> 0x00ee }
            r3 = r1.d;	 Catch:{ all -> 0x00ee }
            r9.<init>(r0, r2, r4, r3);	 Catch:{ all -> 0x00ee }
            r0 = new rdt;	 Catch:{ all -> 0x00ee }
            r2 = r1.a;	 Catch:{ all -> 0x00ee }
            r3 = r2.a();	 Catch:{ all -> 0x00ee }
            r2 = r1.a;	 Catch:{ all -> 0x00ee }
            r4 = r2.e;	 Catch:{ all -> 0x00ee }
            r2 = r1.a;	 Catch:{ all -> 0x00ee }
            r5 = r2.b;	 Catch:{ all -> 0x00ee }
            r6 = r1.e;	 Catch:{ all -> 0x00ee }
            r7 = r1.f;	 Catch:{ all -> 0x00ee }
            r2 = r1.a;	 Catch:{ all -> 0x00ee }
            r10 = r2.n;	 Catch:{ all -> 0x00ee }
            r2 = r1.a;	 Catch:{ all -> 0x00ee }
            r2 = r2.c;	 Catch:{ all -> 0x00ee }
            r11 = r2;	 Catch:{ all -> 0x00ee }
            r11 = (defpackage.ihh) r11;	 Catch:{ all -> 0x00ee }
            r2 = r1.a;	 Catch:{ all -> 0x00ee }
            r12 = r2.v;	 Catch:{ all -> 0x00ee }
            r2 = r1.a;	 Catch:{ all -> 0x00ee }
            r13 = r2.g;	 Catch:{ all -> 0x00ee }
            r2 = r1.a;	 Catch:{ all -> 0x00ee }
            r14 = r2.w;	 Catch:{ all -> 0x00ee }
            r2 = r1.a;	 Catch:{ all -> 0x00ee }
            r15 = r2.x;	 Catch:{ all -> 0x00ee }
            r2 = r1.f;	 Catch:{ all -> 0x00ee }
            r2 = r2.g;	 Catch:{ all -> 0x00ee }
            r16 = r2;	 Catch:{ all -> 0x00ee }
            r2 = r1.f;	 Catch:{ all -> 0x00ee }
            r2 = r2.b;	 Catch:{ all -> 0x00ee }
            r2 = r2.d;	 Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x00e3;	 Catch:{ all -> 0x00ee }
            r2 = defpackage.ras.FEED_LIST_ITEM_SDL;	 Catch:{ all -> 0x00ee }
            goto L_0x00e5;	 Catch:{ all -> 0x00ee }
            r2 = defpackage.ras.FEED_LIST_ITEM;	 Catch:{ all -> 0x00ee }
            r17 = r2;	 Catch:{ all -> 0x00ee }
            r2 = r0;	 Catch:{ all -> 0x00ee }
            r8 = r19;	 Catch:{ all -> 0x00ee }
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x00ee }
            return r0;
            r0 = move-exception;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rcz$g.a(com.snap.core.db.query.LegacyFriendsFeedQueries$WithFriendAndStory):rdt");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((WithFriendAndStory) obj);
        }
    }

    /* renamed from: rcz$h */
    static final class h<T, R> implements ajfc<T, R> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return znk.a(list);
        }
    }

    /* renamed from: rcz$i */
    static final class i<T> implements ajfb<znh<zmy>> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ void accept(Object obj) {
            in.a();
        }
    }

    /* renamed from: rcz$c */
    static final class c implements Runnable {
        final /* synthetic */ rcz a;
        final /* synthetic */ rdt b;
        private /* synthetic */ ajei c;

        /* renamed from: rcz$c$1 */
        static final class 1 implements ajev {
            public static final 1 a = new 1();

            1() {
            }

            public final void run() {
            }
        }

        c(rcz rcz, rdt rdt, ajei ajei) {
            this.a = rcz;
            this.b = rdt;
            this.c = ajei;
        }

        public final void run() {
            final long _id = this.b.L._id();
            if (!(this.b.m || this.b.n)) {
                ajej a = this.a.h.a(this.b).a((ajev) 1.a, (ajfb) new ajfb<Throwable>(this) {
                    private /* synthetic */ c a;

                    public final /* synthetic */ void accept(Object obj) {
                        this.a.a.h.d(this.a.b);
                    }
                });
                akcr.a((Object) a, "chatSnapFetcher.prefetch…      }\n                )");
                ajvv.a(a, this.c);
            }
            if (!this.a.y.f) {
                rcz rcz = this.a;
                rdt rdt = this.b;
                ajei ajei = this.c;
                if (!rdt.a) {
                    ajej a2 = rcz.i.a(rdt).a((ajev) d.a, (ajfb) new e(rcz, rdt, _id));
                    akcr.a((Object) a2, "storySnapFetcher.prefetc…              }\n        )");
                    ajvv.a(a2, ajei);
                }
            }
        }
    }

    /* renamed from: rcz$d */
    static final class d implements ajev {
        public static final d a = new d();

        d() {
        }

        public final void run() {
        }
    }

    /* renamed from: rcz$e */
    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ rcz a;
        private /* synthetic */ rdt b;
        private /* synthetic */ long c;

        e(rcz rcz, rdt rdt, long j) {
            this.a = rcz;
            this.b = rdt;
            this.c = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.i.d(this.b);
        }
    }

    public rcz(Context context, rbk rbk, qzm qzm, qzm qzm2, ajdp<Boolean> ajdp, qzn qzn, yic yic, rbe rbe, ihi ihi, ajdp<znh<WithFriendAndStory>> ajdp2, ajwo<Integer> ajwo, ajwm ajwm, ajdp<abkq> ajdp3, ajcx ajcx, zfw zfw, ajdp<List<FriendmojiDict>> ajdp4, qwi qwi, SnapEmojiSpanFactory snapEmojiSpanFactory, ajwy<gqr> ajwy, eyn eyn, hmm hmm, ajdp<Boolean> ajdp5) {
        rbk rbk2 = rbk;
        qzm qzm3 = qzm;
        qzm qzm4 = qzm2;
        ajdp<Boolean> ajdp6 = ajdp;
        qzn qzn2 = qzn;
        yic yic2 = yic;
        rbe rbe2 = rbe;
        ihi ihi2 = ihi;
        ajdp<znh<WithFriendAndStory>> ajdp7 = ajdp2;
        ajwo<Integer> ajwo2 = ajwo;
        ajwm ajwm2 = ajwm;
        ajdp<abkq> ajdp8 = ajdp3;
        ajcx ajcx2 = ajcx;
        zfw zfw2 = zfw;
        ajdp<List<FriendmojiDict>> ajdp9 = ajdp4;
        akcr.b(context, "context");
        akcr.b(rbk2, "friendsFeedConfigProvider");
        akcr.b(qzm3, "chatSnapFetcher");
        akcr.b(qzm4, "storySnapFetcher");
        akcr.b(ajdp6, "screenVisibilityObservable");
        akcr.b(qzn2, "snapFetchSnapStateStore");
        akcr.b(yic2, "storyLoadStore");
        akcr.b(rbe2, "activeConversationManager");
        akcr.b(ihi2, "dateTimeUtils");
        akcr.b(ajdp7, "source");
        akcr.b(ajwo2, "feedItemViewModelsSubject");
        akcr.b(ajwm2, "initialLoadCompletionSubject");
        akcr.b(ajdp8, "observableUserSession");
        akcr.b(ajcx2, "delayedBind");
        akcr.b(zfw2, "schedulers");
        akcr.b(ajdp4, "friendmojiSource");
        qwi qwi2 = qwi;
        akcr.b(qwi2, "feedViewingSessionManager");
        akcr.b(snapEmojiSpanFactory, "snapEmojiSpanFactory");
        akcr.b(ajwy, "exceptionTracker");
        akcr.b(eyn, "cognacFeedDataProvider");
        akcr.b(hmm, "storyPrefetchConfiguration");
        akcr.b(ajdp5, "isFriendStoriesInterweavingEnabled");
        ajdp<List<FriendmojiDict>> ajdp10 = ajdp4;
        this.h = qzm3;
        this.i = qzm4;
        this.j = ajdp6;
        this.k = qzn2;
        this.l = yic2;
        this.m = rbe2;
        this.n = ihi2;
        this.o = ajdp7;
        this.p = ajwo2;
        this.q = ajwm2;
        this.r = ajdp8;
        this.s = ajcx2;
        this.F = zfw2;
        this.t = ajdp10;
        this.u = qwi2;
        ajwy<gqr> ajwy2 = ajwy;
        this.v = snapEmojiSpanFactory;
        this.w = ajwy2;
        hmm hmm2 = hmm;
        this.x = eyn;
        this.y = hmm2;
        this.z = ajdp5;
        this.B = new iim(context);
        this.a = ajxh.a(new b(rbk));
        FriendmojiCategory[] values = FriendmojiCategory.values();
        Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(values.length), 16));
        for (FriendmojiCategory friendmojiCategory : values) {
            linkedHashMap.put(friendmojiCategory.getCategory(), friendmojiCategory.getEmoji());
        }
        this.f = new rbi(linkedHashMap);
        this.C = new ajei();
        this.D = new LongSparseArray();
        this.g = new a(this.j);
        this.E = ajxh.a(new j(this));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x00f9 in {8, 9, 10, 12, 14} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static defpackage.znh<defpackage.zmy> a(defpackage.znh<defpackage.zmy> r28, defpackage.rcz.a r29) {
        /*
        r0 = r28;
        r1 = r29;
        r2 = "models";
        defpackage.akcr.b(r0, r2);
        r2 = "mediaUpdates";
        defpackage.akcr.b(r1, r2);
        r2 = new znl;	 Catch:{ all -> 0x00f7 }
        r2.<init>(r0);	 Catch:{ all -> 0x00f7 }
        r3 = 0;	 Catch:{ all -> 0x00f7 }
        r4 = r28.a();	 Catch:{ all -> 0x00f7 }
        if (r3 >= r4) goto L_0x00f2;	 Catch:{ all -> 0x00f7 }
        r5 = r0.a(r3);	 Catch:{ all -> 0x00f7 }
        r5 = (defpackage.zmy) r5;	 Catch:{ all -> 0x00f7 }
        r6 = r5 instanceof defpackage.rdt;	 Catch:{ all -> 0x00f7 }
        if (r6 == 0) goto L_0x00e4;	 Catch:{ all -> 0x00f7 }
        r6 = r1.b;	 Catch:{ all -> 0x00f7 }
        r6 = r6.a;	 Catch:{ all -> 0x00f7 }
        r7 = r5;	 Catch:{ all -> 0x00f7 }
        r7 = (defpackage.rdt) r7;	 Catch:{ all -> 0x00f7 }
        r7 = r7.e();	 Catch:{ all -> 0x00f7 }
        r6 = defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x00f7 }
        r7 = r1.b;	 Catch:{ all -> 0x00f7 }
        r8 = r5;	 Catch:{ all -> 0x00f7 }
        r8 = (defpackage.rdt) r8;	 Catch:{ all -> 0x00f7 }
        r8 = r8.e();	 Catch:{ all -> 0x00f7 }
        r7 = r7.a(r8);	 Catch:{ all -> 0x00f7 }
        r8 = r1.a;	 Catch:{ all -> 0x00f7 }
        r9 = r5;	 Catch:{ all -> 0x00f7 }
        r9 = (defpackage.rdt) r9;	 Catch:{ all -> 0x00f7 }
        r9 = r9.L;	 Catch:{ all -> 0x00f7 }
        r9 = r9._id();	 Catch:{ all -> 0x00f7 }
        r8 = r8.a(r9);	 Catch:{ all -> 0x00f7 }
        r9 = r1.c;	 Catch:{ all -> 0x00f7 }
        r15 = new reb;	 Catch:{ all -> 0x00f7 }
        r15.<init>(r6, r7, r8, r9);	 Catch:{ all -> 0x00f7 }
        r6 = r5;	 Catch:{ all -> 0x00f7 }
        r6 = (defpackage.rdt) r6;	 Catch:{ all -> 0x00f7 }
        r6 = r6.M;	 Catch:{ all -> 0x00f7 }
        r6 = defpackage.akcr.a(r15, r6);	 Catch:{ all -> 0x00f7 }
        r6 = r6 ^ 1;	 Catch:{ all -> 0x00f7 }
        if (r6 == 0) goto L_0x00e4;	 Catch:{ all -> 0x00f7 }
        r5 = (defpackage.rdt) r5;	 Catch:{ all -> 0x00f7 }
        r11 = r5.H;	 Catch:{ all -> 0x00f7 }
        r12 = r5.I;	 Catch:{ all -> 0x00f7 }
        r14 = r5.J;	 Catch:{ all -> 0x00f7 }
        r6 = r5.K;	 Catch:{ all -> 0x00f7 }
        r7 = r5.L;	 Catch:{ all -> 0x00f7 }
        r8 = r5.N;	 Catch:{ all -> 0x00f7 }
        r9 = r5.O;	 Catch:{ all -> 0x00f7 }
        r13 = r5.P;	 Catch:{ all -> 0x00f7 }
        r10 = r5.Q;	 Catch:{ all -> 0x00f7 }
        r0 = r5.R;	 Catch:{ all -> 0x00f7 }
        r1 = r5.S;	 Catch:{ all -> 0x00f7 }
        r26 = r4;	 Catch:{ all -> 0x00f7 }
        r4 = r5.T;	 Catch:{ all -> 0x00f7 }
        r5 = r5.U;	 Catch:{ all -> 0x00f7 }
        r27 = r2;	 Catch:{ all -> 0x00f7 }
        r2 = "scheduler";	 Catch:{ all -> 0x00f7 }
        defpackage.akcr.b(r12, r2);	 Catch:{ all -> 0x00f7 }
        r2 = "assets";	 Catch:{ all -> 0x00f7 }
        defpackage.akcr.b(r14, r2);	 Catch:{ all -> 0x00f7 }
        r2 = "friendsFeedState";	 Catch:{ all -> 0x00f7 }
        defpackage.akcr.b(r6, r2);	 Catch:{ all -> 0x00f7 }
        r2 = "record";	 Catch:{ all -> 0x00f7 }
        defpackage.akcr.b(r7, r2);	 Catch:{ all -> 0x00f7 }
        r2 = "mediaLoadingState";	 Catch:{ all -> 0x00f7 }
        defpackage.akcr.b(r15, r2);	 Catch:{ all -> 0x00f7 }
        r2 = "dateTimeUtils";	 Catch:{ all -> 0x00f7 }
        defpackage.akcr.b(r8, r2);	 Catch:{ all -> 0x00f7 }
        r2 = "clock";	 Catch:{ all -> 0x00f7 }
        defpackage.akcr.b(r9, r2);	 Catch:{ all -> 0x00f7 }
        r2 = "snapEmojiSpanFactory";	 Catch:{ all -> 0x00f7 }
        defpackage.akcr.b(r13, r2);	 Catch:{ all -> 0x00f7 }
        r2 = "textToggleFactory";	 Catch:{ all -> 0x00f7 }
        defpackage.akcr.b(r10, r2);	 Catch:{ all -> 0x00f7 }
        r2 = "exceptionTracker";	 Catch:{ all -> 0x00f7 }
        defpackage.akcr.b(r0, r2);	 Catch:{ all -> 0x00f7 }
        r2 = "cognacFeedDataProvider";	 Catch:{ all -> 0x00f7 }
        defpackage.akcr.b(r1, r2);	 Catch:{ all -> 0x00f7 }
        r2 = "viewType";	 Catch:{ all -> 0x00f7 }
        defpackage.akcr.b(r5, r2);	 Catch:{ all -> 0x00f7 }
        r2 = new rdt;	 Catch:{ all -> 0x00f7 }
        r16 = 0;	 Catch:{ all -> 0x00f7 }
        r21 = r10;	 Catch:{ all -> 0x00f7 }
        r10 = r2;	 Catch:{ all -> 0x00f7 }
        r20 = r13;	 Catch:{ all -> 0x00f7 }
        r13 = r16;	 Catch:{ all -> 0x00f7 }
        r17 = r15;	 Catch:{ all -> 0x00f7 }
        r15 = r6;	 Catch:{ all -> 0x00f7 }
        r16 = r7;	 Catch:{ all -> 0x00f7 }
        r18 = r8;	 Catch:{ all -> 0x00f7 }
        r19 = r9;	 Catch:{ all -> 0x00f7 }
        r22 = r0;	 Catch:{ all -> 0x00f7 }
        r23 = r1;	 Catch:{ all -> 0x00f7 }
        r24 = r4;	 Catch:{ all -> 0x00f7 }
        r25 = r5;	 Catch:{ all -> 0x00f7 }
        r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);	 Catch:{ all -> 0x00f7 }
        r0 = r27;	 Catch:{ all -> 0x00f7 }
        r0.a(r3, r2);	 Catch:{ all -> 0x00f7 }
        goto L_0x00e7;	 Catch:{ all -> 0x00f7 }
        r0 = r2;	 Catch:{ all -> 0x00f7 }
        r26 = r4;	 Catch:{ all -> 0x00f7 }
        r3 = r3 + 1;	 Catch:{ all -> 0x00f7 }
        r1 = r29;	 Catch:{ all -> 0x00f7 }
        r2 = r0;	 Catch:{ all -> 0x00f7 }
        r4 = r26;	 Catch:{ all -> 0x00f7 }
        r0 = r28;	 Catch:{ all -> 0x00f7 }
        goto L_0x0018;	 Catch:{ all -> 0x00f7 }
        r0 = r2;	 Catch:{ all -> 0x00f7 }
        r2 = r0;	 Catch:{ all -> 0x00f7 }
        r2 = (defpackage.znh) r2;	 Catch:{ all -> 0x00f7 }
        return r2;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcz.a(znh, rcz$a):znh");
    }

    /* Access modifiers changed, original: final */
    public final ajdp<znh<zmy>> a(rdx rdx) {
        Object p = this.k.a.p();
        if (p == null) {
            akcr.a();
        }
        akcr.a(p, "loadingSnapsSubject.value!!");
        qzn.a aVar = (qzn.a) p;
        b b = this.l.b();
        p = this.u.r.p();
        if (p == null) {
            akcr.a();
        }
        akcr.a(p, "updatesSubject.value!!");
        qwj qwj = (qwj) p;
        in.a("");
        try {
            rdw rdw = new rdw(a(), this.c);
            Object i = ajdp.b((Iterable) rdx.a).e((ajfb) f.a).p(new g(this, b, aVar, qwj, rdw, rdx)).a(16).f(h.a).a((ajfb) i.a).i();
            akcr.a(i, "Observable\n             …          .toObservable()");
            return i;
        } finally {
            in.a();
        }
    }

    /* Access modifiers changed, original: final */
    public final Context a() {
        return (Context) this.B.a(A[0]);
    }

    public final void a(View view, zmy zmy) {
        if (zmy instanceof rdt) {
            ajei ajei = (ajei) this.D.get(((rdt) zmy).getId());
            if (ajei != null) {
                ajei.a();
                this.h.d((rdt) zmy);
                this.i.d((rdt) zmy);
            }
        }
    }

    public final void a(rdt rdt) {
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        ajei ajei = (ajei) this.D.get(rdt.getId());
        if (ajei == null) {
            ajei = new ajei();
            this.D.put(rdt.getId(), ajei);
        }
        ajei.a(this.F.b().a((Runnable) new c(this, rdt, ajei)));
    }

    public final void b(View view, zmy zmy) {
        if (zmy instanceof rdt) {
            a((rdt) zmy);
        }
    }

    public final ajdp<znh<zmy>> c() {
        return (ajdp) this.E.b();
    }

    public final void onDispose() {
        this.C.dispose();
    }
}
