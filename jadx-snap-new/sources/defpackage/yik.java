package defpackage;

import android.location.Location;
import com.brightcove.player.event.EventType;
import com.google.common.base.Optional;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.MobStoryMetadataModel;
import com.snap.stories.api.StoriesHttpInterface;
import defpackage.yin.a;
import defpackage.yip.ao;
import defpackage.yip.ap;
import defpackage.yip.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: yik */
public final class yik implements yhz {
    final ajxe a;
    final ajxe b;
    final DbClient c;
    public final zfw d = zgb.a(yhy.j.callsite("StoriesNetworkApiClient"));
    final ihh e;
    private final ajxe f;
    private final ajxe g;
    private final ajxe h;
    private final ajxe i;

    /* renamed from: yik$ah */
    static final class ah extends akcq implements akbk<yip> {
        ah(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (yip) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yik$ag */
    static final class ag extends akcq implements akbk<yib> {
        ag(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (yib) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yik$ad */
    static final class ad extends akcq implements akbk<yij> {
        ad(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (yij) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yik$af */
    static final class af extends akcq implements akbk<yin> {
        af(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (yin) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yik$ae */
    static final class ae extends akcq implements akbk<StoriesHttpInterface> {
        ae(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (StoriesHttpInterface) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yik$ac */
    static final class ac extends akcq implements akbk<yln> {
        ac(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (yln) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yik$r */
    static final class r extends akcq implements akbl<alqz, ajdx<alra>> {
        r(StoriesHttpInterface storiesHttpInterface) {
            super(1, storiesHttpInterface);
        }

        public final String getName() {
            return "fetchPostableCustomStories";
        }

        public final akej getOwner() {
            return akde.a(StoriesHttpInterface.class);
        }

        public final String getSignature() {
            return "fetchPostableCustomStories(Lsnapchat/stories/nano/StoryAuthRequest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            alqz alqz = (alqz) obj;
            akcr.b(alqz, "p1");
            return ((StoriesHttpInterface) this.receiver).fetchPostableCustomStories(alqz);
        }
    }

    /* renamed from: yik$q */
    static final class q<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ yik a;

        q(yik yik) {
            this.a = yik;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            this.a.b();
            Location location = (Location) optional.orNull();
            Object alqz = new alqz();
            if (location != null) {
                alqy alqy = new alqy();
                alqy.a(location.getLatitude());
                alqy.b(location.getLongitude());
                alqz.a = alqy;
                alqz.a((double) location.getAccuracy());
            }
            obj = ajdx.b(alqz);
            akcr.a(obj, "Single.just(StoryAuthReq…         }\n            })");
            return obj;
        }
    }

    /* renamed from: yik$s */
    static final class s extends akcq implements akbl<alra, ajcx> {
        s(yik yik) {
            super(1, yik);
        }

        public final String getName() {
            return "handleStoryAuthResponse";
        }

        public final akej getOwner() {
            return akde.a(yik.class);
        }

        public final String getSignature() {
            return "handleStoryAuthResponse(Lsnapchat/stories/nano/StoryAuthResponse;)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            alra alra = (alra) obj;
            akcr.b(alra, "p1");
            yik yik = (yik) this.receiver;
            akcr.b(alra, EventType.RESPONSE);
            List arrayList = new ArrayList();
            arrayList.add(yik.c.runInTransaction("StoriesNetworkApiClient:story_auth_response", new y(yik, alra)));
            obj = alra.a;
            akcr.a(obj, "it");
            Collection arrayList2 = new ArrayList(obj.length);
            for (alqx alqx : obj) {
                Object obj2 = alqx.a;
                akcr.a(obj2, "it.storyId");
                arrayList2.add(ymd.a(obj2).toString());
            }
            arrayList.add(yik.a((List) arrayList2));
            obj = ajcx.b((Iterable) arrayList);
            akcr.a(obj, "Completable.merge(completables)");
            return obj;
        }
    }

    /* renamed from: yik$y */
    static final class y extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ yik a;
        private /* synthetic */ alra b;

        y(yik yik, alra alra) {
            this.a = yik;
            this.b = alra;
            super(1);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:43:0x01ca in {2, 7, 8, 15, 16, 17, 18, 19, 20, 28, 30, 32, 36, 38, 40, 42} preds:[]
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
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r32) {
            /*
            r31 = this;
            r1 = r31;
            r0 = r32;
            r0 = (com.snap.core.db.api.DbTransaction) r0;
            r14 = "tx";
            defpackage.akcr.b(r0, r14);
            r2 = r1.a;
            r15 = ((defpackage.yip) r2.f.b());
            r2 = r1.b;
            r2 = r2.a;
            r13 = 0;
            if (r2 != 0) goto L_0x001a;
            r2 = new defpackage.alqx[r13];
            r12 = r2;
            r11 = defpackage.yil.a;
            defpackage.akcr.b(r0, r14);
            r2 = "groupStories";
            defpackage.akcr.b(r12, r2);
            r2 = "groupStoryTypes";
            defpackage.akcr.b(r11, r2);
            r10 = new java.util.HashSet;
            r10.<init>();
            r9 = r12.length;
            r8 = 0;
            if (r8 >= r9) goto L_0x014c;
            r6 = r12[r8];
            r5 = r15.m();
            defpackage.akcr.b(r0, r14);
            r2 = "groupStory";
            defpackage.akcr.b(r6, r2);
            r0.checkInTransaction();
            r0.checkInTransaction();
            r2 = r6.a;
            r4 = "groupStory.storyId";
            defpackage.akcr.a(r2, r4);
            r2 = defpackage.ymd.a(r2);
            r3 = r2.toString();
            r2 = "groupStory.storyId.toNativeUUID().toString()";
            defpackage.akcr.a(r3, r2);
            r7 = com.snap.core.db.column.StoryKind.GROUP;
            r16 = r5.a(r0, r3, r7);
            r18 = -1;
            r7 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1));
            if (r7 != 0) goto L_0x00bb;
            r7 = r6.b;
            r13 = "groupStory.creatorUserId";
            defpackage.akcr.a(r7, r13);
            r7 = defpackage.ymd.a(r7);
            r7 = r7.toString();
            r13 = r6.b();
            r16 = com.snap.core.db.column.StoryKind.GROUP;
            r17 = 0;
            r19 = 0;
            r20 = 0;
            r21 = 0;
            r22 = 1;
            r23 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
            r24 = r2;
            r2 = r5;
            r25 = r3;
            r3 = r0;
            r26 = r4;
            r4 = r25;
            r27 = r5;
            r5 = r16;
            r28 = r6;
            r6 = r7;
            r7 = r13;
            r25 = r8;
            r8 = r17;
            r29 = r9;
            r9 = r19;
            r13 = r10;
            r10 = r20;
            r30 = r11;
            r11 = r21;
            r19 = r12;
            r12 = r22;
            r1 = r13;
            r32 = r14;
            r14 = 0;
            r13 = r23;
            r2 = defpackage.ylo.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
            r4 = r2;
            r2 = r27;
            goto L_0x00d0;
            r24 = r2;
            r26 = r4;
            r28 = r6;
            r25 = r8;
            r29 = r9;
            r1 = r10;
            r30 = r11;
            r19 = r12;
            r32 = r14;
            r14 = 0;
            r2 = r5;
            r4 = r16;
            r2 = r2.b;
            r2 = r2.get();
            r2 = (defpackage.yln) r2;
            r13 = r28;
            r3 = r13.a;
            r12 = r26;
            defpackage.akcr.a(r3, r12);
            r3 = defpackage.ymd.a(r3);
            r6 = r3.toString();
            r3 = r24;
            defpackage.akcr.a(r6, r3);
            r3 = r13.f();
            if (r3 == 0) goto L_0x0102;
            r7 = 1;
            if (r3 == r7) goto L_0x00ff;
            r7 = 2;
            if (r3 == r7) goto L_0x00fc;
            r8 = 0;
            goto L_0x0105;
            r3 = com.snap.core.db.column.GroupStoryRankType.RANK_GEOFENCE_2D;
            goto L_0x0104;
            r3 = com.snap.core.db.column.GroupStoryRankType.RANK_GEOFENCE_1D;
            goto L_0x0104;
            r3 = com.snap.core.db.column.GroupStoryRankType.RANK_CUSTOM;
            r8 = r3;
            r9 = r13.e();
            r10 = java.lang.Long.valueOf(r9);
            r16 = r13.d();
            r9 = java.lang.Long.valueOf(r16);
            r7 = r13.c();
            r11 = 0;
            r16 = 0;
            r17 = 3680; // 0xe60 float:5.157E-42 double:1.818E-320;
            r3 = r0;
            r14 = r12;
            r12 = r16;
            r16 = r0;
            r0 = r13;
            r13 = r17;
            defpackage.yln.a(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13);
            r0 = r0.a;
            defpackage.akcr.a(r0, r14);
            r0 = defpackage.ymd.a(r0);
            r0 = r0.toString();
            r1.add(r0);
            r8 = r25 + 1;
            r14 = r32;
            r10 = r1;
            r0 = r16;
            r12 = r19;
            r9 = r29;
            r11 = r30;
            r13 = 0;
            r1 = r31;
            goto L_0x0031;
            r16 = r0;
            r1 = r10;
            r30 = r11;
            r32 = r14;
            r0 = r15.j();
            r10 = r1;
            r10 = (java.util.Collection) r10;
            r1 = 0;
            r2 = new java.lang.String[r1];
            r1 = r10.toArray(r2);
            if (r1 == 0) goto L_0x01c0;
            r1 = (java.lang.String[]) r1;
            r3 = r32;
            r2 = r16;
            defpackage.akcr.b(r2, r3);
            r3 = "groupStoryIdsSynced";
            defpackage.akcr.b(r1, r3);
            r3 = "groupStoryTypesSynced";
            r4 = r30;
            defpackage.akcr.b(r4, r3);
            r2.checkInTransaction();
            r0 = r0.a;
            r3 = com.snap.core.db.record.StoryRecord.FACTORY;
            r1 = r3.removeGroupStoryPostabilityExcept(r1, r4);
            r3 = "StoryRecord.FACTORY.remo…d, groupStoryTypesSynced)";
            defpackage.akcr.a(r1, r3);
            r0 = r0.query(r1);
            r1 = r0;
            r1 = (java.io.Closeable) r1;
            r0 = r1;	 Catch:{ Throwable -> 0x01b5, all -> 0x01b0 }
            r0 = (android.database.Cursor) r0;	 Catch:{ Throwable -> 0x01b5, all -> 0x01b0 }
            r0.getCount();	 Catch:{ Throwable -> 0x01b5, all -> 0x01b0 }
            r3 = 0;
            defpackage.akax.a(r1, r3);
            r4 = r31;
            r0 = r4.a;
            r0 = ((defpackage.yip) r0.f.b());
            r1 = r4.b;
            r1 = r1.b;
            if (r1 != 0) goto L_0x01aa;
            r3 = 0;
            r1 = new defpackage.alrb[r3];
            r0.a(r2, r1);
            r0 = defpackage.ajxw.a;
            return r0;
            r0 = move-exception;
            r3 = 0;
            r4 = r31;
            goto L_0x01bc;
            r0 = move-exception;
            r4 = r31;
            r7 = r0;
            throw r7;	 Catch:{ all -> 0x01ba }
            r0 = move-exception;
            r3 = r7;
            defpackage.akax.a(r1, r3);
            throw r0;
            r4 = r31;
            r0 = new ajxt;
            r1 = "null cannot be cast to non-null type kotlin.Array<T>";
            r0.<init>(r1);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yik$y.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: yik$k */
    static final class k<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ yik a;

        /* renamed from: yik$k$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                agcu agcu = (agcu) obj;
                akcr.b(agcu, "it");
                return Optional.of(agcu);
            }
        }

        k(yik yik) {
            this.a = yik;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "ids");
            if ((list.isEmpty() ^ 1) == 0) {
                return ajdx.b(Optional.absent());
            }
            this.a.b();
            akcr.b(list, "storyIds");
            Object agcu = new agcu();
            agcu.a = list;
            obj = ajdx.b(agcu);
            akcr.a(obj, "Single.just(GetMobStorie…= storyIds\n            })");
            return obj.f(1.a);
        }
    }

    /* renamed from: yik$l */
    static final class l<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ yik a;

        /* renamed from: yik$l$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                agcw agcw = (agcw) obj;
                akcr.b(agcw, "it");
                return Optional.of(agcw);
            }
        }

        l(yik yik) {
            this.a = yik;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "mobStoriesRequest");
            if (!optional.isPresent()) {
                return ajdx.b(Optional.absent());
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            StoriesHttpInterface c = this.a.c();
            obj = optional.get();
            akcr.a(obj, "mobStoriesRequest.get()");
            return c.fetchGroupStories((agcu) obj).f(1.a).d((ajfb) new ajfb<Throwable>() {
                public final /* synthetic */ void accept(Object obj) {
                    atomicBoolean.set(true);
                }
            }).c((ajev) new ajev() {
                public final void run() {
                    atomicBoolean.set(true);
                }
            }).h(new ajfc<Throwable, ajeb<? extends Optional<agcw>>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    akcr.b(th, "e");
                    return atomicBoolean.get() ? ajvo.a(ajsn.a) : ajdx.b(th);
                }
            });
        }
    }

    /* renamed from: yik$m */
    static final class m<T> implements ajfb<Optional<agcw>> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Optional) obj;
            akcr.a(obj, "it");
            obj.isPresent();
        }
    }

    /* renamed from: yik$n */
    static final class n<T, R> implements ajfc<Optional<agcw>, ajdb> {
        private /* synthetic */ yik a;

        n(yik yik) {
            this.a = yik;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx e;
            Optional optional = (Optional) obj;
            akcr.b(optional, "mobStoriesResponse");
            if (optional.isPresent()) {
                List list = ((agcw) optional.get()).a;
                if (list != null && (list.isEmpty() ^ 1) == 1) {
                    yip a = ((yip) this.a.f.b());
                    obj = optional.get();
                    akcr.a(obj, "mobStoriesResponse.get()");
                    agcw agcw = (agcw) obj;
                    akcr.b(agcw, "mobResponse");
                    e = ajdx.c((Callable) new ao(a, agcw)).e((ajfc) new ap(a, agcw));
                    akcr.a((Object) e, "Single.fromCallable {\n  …          }\n            }");
                    return e;
                }
            }
            e = ajvo.a(ajhn.a);
            return e;
        }
    }

    /* renamed from: yik$aa */
    static final class aa<V> implements Callable<yip> {
        private /* synthetic */ yik a;

        aa(yik yik) {
            this.a = yik;
        }

        public final /* synthetic */ Object call() {
            return ((yip) this.a.f.b());
        }
    }

    /* renamed from: yik$d */
    public static final class d<V> implements Callable<yip> {
        private /* synthetic */ yik a;

        public d(yik yik) {
            this.a = yik;
        }

        public final /* synthetic */ Object call() {
            return ((yip) this.a.f.b());
        }
    }

    /* renamed from: yik$g */
    public static final class g<V> implements Callable<yip> {
        private /* synthetic */ yik a;

        public g(yik yik) {
            this.a = yik;
        }

        public final /* synthetic */ Object call() {
            return ((yip) this.a.f.b());
        }
    }

    /* renamed from: yik$ab */
    static final class ab<T, R> implements ajfc<yip, ajdb> {
        final /* synthetic */ String a;
        private /* synthetic */ yik b;

        ab(yik yik, String str) {
            this.b = yik;
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final yip yip = (yip) obj;
            akcr.b(yip, "it");
            return this.b.c.runInTransaction("StoriesNetworkApiClient:leaveMobStory", new akbl<DbTransaction, ajxw>(this) {
                private /* synthetic */ ab a;

                public final /* synthetic */ Object invoke(Object obj) {
                    DbTransaction dbTransaction = (DbTransaction) obj;
                    akcr.b(dbTransaction, "tx");
                    yip.a(dbTransaction, StoryKind.GROUP, this.a.a);
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: yik$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ yik a;

        b(yik yik) {
            this.a = yik;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (agde) obj;
            akcr.b(obj, "it");
            if (!ylz.a((agde) obj)) {
                return ajdx.b(obj);
            }
            return this.a.c.runInTransaction("StoriesNetworkApiClient:createMobStory", new akbl<DbTransaction, ajxw>(this) {
                private /* synthetic */ b a;

                public final /* synthetic */ Object invoke(Object obj) {
                    DbTransaction dbTransaction = (DbTransaction) obj;
                    String str = "tx";
                    akcr.b(dbTransaction, str);
                    yip a = ((yip) this.a.a.f.b());
                    agdu agdu = obj.a;
                    akcr.a((Object) agdu, "it.mobStory");
                    akcr.b(dbTransaction, str);
                    akcr.b(agdu, "mobStory");
                    long a2 = a.j().a(dbTransaction, agdu, agdu.d, true);
                    a.n().a(dbTransaction, agdu);
                    yln yln = (yln) this.a.a.b.b();
                    str = obj.a.a;
                    akcr.a((Object) str, "it.mobStory.id");
                    yln.a(yln, dbTransaction, a2, str, null, null, null, Long.valueOf(this.a.a.e.a()), null, null, 3832);
                    return ajxw.a;
                }
            }).a(obj);
        }
    }

    /* renamed from: yik$e */
    public static final class e<T, R> implements ajfc<yip, ajdb> {
        final /* synthetic */ String a;
        private /* synthetic */ yik b;

        public e(yik yik, String str) {
            this.b = yik;
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final yip yip = (yip) obj;
            akcr.b(yip, "it");
            return this.b.c.runInTransaction("StoriesNetworkApiClient:deleteMobStory", new akbl<DbTransaction, ajxw>(this) {
                private /* synthetic */ e a;

                public final /* synthetic */ Object invoke(Object obj) {
                    DbTransaction dbTransaction = (DbTransaction) obj;
                    akcr.b(dbTransaction, "tx");
                    yip.a(dbTransaction, StoryKind.GROUP, this.a.a);
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: yik$f */
    public static final class f<T, R> implements ajfc<aeje, ajdb> {
        private /* synthetic */ yik a;
        private /* synthetic */ StoryKind b;

        public f(yik yik, StoryKind storyKind) {
            this.a = yik;
            this.b = storyKind;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aeje aeje = (aeje) obj;
            akcr.b(aeje, "it");
            return this.b == StoryKind.OUR ? this.a.c().deleteSharedStorySnap(aeje) : this.a.c().deleteStorySnap(aeje);
        }
    }

    /* renamed from: yik$h */
    public static final class h<T, R> implements ajfc<yip, ajdb> {
        private /* synthetic */ long a;

        public h(long j) {
            this.a = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            yip yip = (yip) obj;
            akcr.b(yip, "it");
            return yip.a(this.a);
        }
    }

    /* renamed from: yik$j */
    static final class j<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ yik a;

        j(yik yik) {
            this.a = yik;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (agde) obj;
            akcr.b(obj, "it");
            if (!ylz.a((agde) obj) || obj.a == null) {
                return ajdx.b(obj);
            }
            return this.a.c.runInTransaction("StoriesNetworkApiClient:editMobStory", new akbl<DbTransaction, ajxw>(this) {
                private /* synthetic */ j a;

                public final /* synthetic */ Object invoke(Object obj) {
                    DbTransaction dbTransaction = (DbTransaction) obj;
                    akcr.b(dbTransaction, "tx");
                    yip a = ((yip) this.a.a.f.b());
                    agdu agdu = obj.a;
                    akcr.a((Object) agdu, "it.mobStory");
                    a.a(dbTransaction, agdu, null);
                    return ajxw.a;
                }
            }).a(obj);
        }
    }

    /* renamed from: yik$o */
    public static final class o<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ yik a;

        public o(yik yik) {
            this.a = yik;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aetk aetk = (aetk) obj;
            String str = "myGroupStoriesResponse";
            akcr.b(aetk, str);
            yip a = ((yip) this.a.f.b());
            akcr.b(aetk, str);
            return a.c.callInTransaction("StoryRepositoryClient:insertOurStories", new w(a, aetk));
        }
    }

    /* renamed from: yik$p */
    public static final class p<T> implements ajfb<Throwable> {
        public static final p a = new p();

        p() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: yik$u */
    static final class u<T> implements ajfl<aelz> {
        public static final u a = new u();

        u() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            aelz aelz = (aelz) obj;
            akcr.b(aelz, "it");
            return aelz.b != null;
        }
    }

    /* renamed from: yik$v */
    static final class v<T, R> implements ajfc<aelz, ajdb> {
        final /* synthetic */ yik a;

        v(yik yik) {
            this.a = yik;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Map linkedHashMap;
            final aelz aelz = (aelz) obj;
            akcr.b(aelz, EventType.RESPONSE);
            aegb aegb = aelz.a;
            if (aegb != null) {
                List list = aegb.f;
                if (list != null) {
                    Collection arrayList = new ArrayList();
                    for (Object next : list) {
                        if ((((ahaz) next).D != null ? 1 : null) != null) {
                            arrayList.add(next);
                        }
                    }
                    Iterable iterable = (List) arrayList;
                    linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a(iterable, 10)), 16));
                    for (Object next2 : iterable) {
                        linkedHashMap.put(((ahaz) next2).D, next2);
                    }
                    return this.a.c.runInTransaction("StoriesNetworkApiClient:fetchPostedAndFriendStories", new akbl<DbTransaction, ajxw>(this) {
                        private /* synthetic */ v a;

                        public final /* synthetic */ Object invoke(Object obj) {
                            DbTransaction dbTransaction = (DbTransaction) obj;
                            akcr.b(dbTransaction, "tx");
                            yib yib = (yib) this.a.a.a.b();
                            Object obj2 = aelz.b;
                            akcr.a(obj2, "response.storyFeedResponse");
                            yib.a(obj2, linkedHashMap, dbTransaction, aelz.g);
                            return ajxw.a;
                        }
                    });
                }
            }
            linkedHashMap = ajyx.a;
            return this.a.c.runInTransaction("StoriesNetworkApiClient:fetchPostedAndFriendStories", /* anonymous class already generated */);
        }
    }

    /* renamed from: yik$x */
    static final class x<T, R> implements ajfc<agbc, ajdb> {
        final /* synthetic */ yik a;

        x(yik yik) {
            this.a = yik;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx runInTransaction;
            final agbc agbc = (agbc) obj;
            akcr.b(agbc, EventType.RESPONSE);
            aeml aeml = agbc.a;
            if (aeml != null) {
                List list = aeml.b;
                if (list != null && (list.isEmpty() ^ 1) == 1) {
                    runInTransaction = this.a.c.runInTransaction("StoriesNetworkApiClient:fetchPublicUserStory", new akbl<DbTransaction, ajxw>(this) {
                        private /* synthetic */ x a;

                        public final /* synthetic */ Object invoke(Object obj) {
                            DbTransaction dbTransaction = (DbTransaction) obj;
                            akcr.b(dbTransaction, "tx");
                            ((yip) this.a.a.f.b()).a(dbTransaction, ajyl.a(agbc.a), (Map) ajyx.a, null);
                            return ajxw.a;
                        }
                    });
                    return runInTransaction;
                }
            }
            runInTransaction = ajvo.a(ajhn.a);
            return runInTransaction;
        }
    }

    /* renamed from: yik$a */
    static final class a extends akcq implements akbl<agdc, ajdx<agde>> {
        a(StoriesHttpInterface storiesHttpInterface) {
            super(1, storiesHttpInterface);
        }

        public final String getName() {
            return "createMobStory";
        }

        public final akej getOwner() {
            return akde.a(StoriesHttpInterface.class);
        }

        public final String getSignature() {
            return "createMobStory(Lcom/snapchat/soju/android/broadcast/mobs/api/UpdateMobStoryRequest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            agdc agdc = (agdc) obj;
            akcr.b(agdc, "p1");
            return ((StoriesHttpInterface) this.receiver).createMobStory(agdc);
        }
    }

    /* renamed from: yik$c */
    public static final class c extends akcq implements akbl<agcq, ajcx> {
        public c(StoriesHttpInterface storiesHttpInterface) {
            super(1, storiesHttpInterface);
        }

        public final String getName() {
            return "deleteMobStory";
        }

        public final akej getOwner() {
            return akde.a(StoriesHttpInterface.class);
        }

        public final String getSignature() {
            return "deleteMobStory(Lcom/snapchat/soju/android/broadcast/mobs/api/DeleteMobStoryRequest;)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            agcq agcq = (agcq) obj;
            akcr.b(agcq, "p1");
            return ((StoriesHttpInterface) this.receiver).deleteMobStory(agcq);
        }
    }

    /* renamed from: yik$i */
    static final class i extends akcq implements akbl<agdc, ajdx<agde>> {
        i(StoriesHttpInterface storiesHttpInterface) {
            super(1, storiesHttpInterface);
        }

        public final String getName() {
            return "editMobStory";
        }

        public final akej getOwner() {
            return akde.a(StoriesHttpInterface.class);
        }

        public final String getSignature() {
            return "editMobStory(Lcom/snapchat/soju/android/broadcast/mobs/api/UpdateMobStoryRequest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            agdc agdc = (agdc) obj;
            akcr.b(agdc, "p1");
            return ((StoriesHttpInterface) this.receiver).editMobStory(agdc);
        }
    }

    /* renamed from: yik$t */
    static final class t extends akcq implements akbl<aelt, ajdx<aelz>> {
        t(StoriesHttpInterface storiesHttpInterface) {
            super(1, storiesHttpInterface);
        }

        public final String getName() {
            return "fetchStoriesUFS";
        }

        public final akej getOwner() {
            return akde.a(StoriesHttpInterface.class);
        }

        public final String getSignature() {
            return "fetchStoriesUFS(Lcom/snapchat/soju/android/FriendFeedRequest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aelt aelt = (aelt) obj;
            akcr.b(aelt, "p1");
            return ((StoriesHttpInterface) this.receiver).fetchStoriesUFS(aelt);
        }
    }

    /* renamed from: yik$w */
    static final class w extends akcq implements akbl<agba, ajdx<agbc>> {
        w(StoriesHttpInterface storiesHttpInterface) {
            super(1, storiesHttpInterface);
        }

        public final String getName() {
            return "fetchPublicUserStory";
        }

        public final akej getOwner() {
            return akde.a(StoriesHttpInterface.class);
        }

        public final String getSignature() {
            return "fetchPublicUserStory(Lcom/snapchat/soju/android/broadcast/PreviewStoryRequest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            agba agba = (agba) obj;
            akcr.b(agba, "p1");
            return ((StoriesHttpInterface) this.receiver).fetchPublicUserStory(agba);
        }
    }

    /* renamed from: yik$z */
    static final class z extends akcq implements akbl<agcy, ajcx> {
        z(StoriesHttpInterface storiesHttpInterface) {
            super(1, storiesHttpInterface);
        }

        public final String getName() {
            return "leaveMobStory";
        }

        public final akej getOwner() {
            return akde.a(StoriesHttpInterface.class);
        }

        public final String getSignature() {
            return "leaveMobStory(Lcom/snapchat/soju/android/broadcast/mobs/api/LeaveMobStoryRequest;)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            agcy agcy = (agcy) obj;
            akcr.b(agcy, "p1");
            return ((StoriesHttpInterface) this.receiver).leaveMobStory(agcy);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(yik.class), "storyRepository", "getStoryRepository()Lcom/snap/stories/client/StoryRepositoryClient;"), new akdc(akde.a(yik.class), "storiesResponseProcessor", "getStoriesResponseProcessor()Lcom/snap/stories/api/StoriesResponseProcessor;"), new akdc(akde.a(yik.class), "storiesDataProvider", "getStoriesDataProvider()Lcom/snap/stories/client/StoriesDataProviderClient;"), new akdc(akde.a(yik.class), "storiesRequestFactory", "getStoriesRequestFactory()Lcom/snap/stories/client/StoriesRequestFactory;"), new akdc(akde.a(yik.class), "storiesHttpInterface", "getStoriesHttpInterface()Lcom/snap/stories/api/StoriesHttpInterface;"), new akdc(akde.a(yik.class), "postableStoryMetadata", "getPostableStoryMetadata()Lcom/snap/stories/db/inserts/PostableStoryMetadataData;")};
    }

    public yik(ajwy<yip> ajwy, ajwy<yib> ajwy2, ajwy<yij> ajwy3, ajwy<yin> ajwy4, ajwy<StoriesHttpInterface> ajwy5, ajwy<yln> ajwy6, ajwy<SnapDb> ajwy7, zgb zgb, ihh ihh) {
        akcr.b(ajwy, "storyRepositoryProvider");
        akcr.b(ajwy2, "storiesResponseProcessorProvider");
        akcr.b(ajwy3, "storiesDataProviderProvider");
        akcr.b(ajwy4, "storiesRequestFactoryProvider");
        akcr.b(ajwy5, "storiesHttpInterfaceProvider");
        akcr.b(ajwy6, "postableStoryMetadataDataProvider");
        akcr.b(ajwy7, "snapDb");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ihh, "clock");
        this.e = ihh;
        this.f = ajxh.a(new ah(ajwy));
        this.a = ajxh.a(new ag(ajwy2));
        this.g = ajxh.a(new ad(ajwy3));
        this.h = ajxh.a(new af(ajwy4));
        this.i = ajxh.a(new ae(ajwy5));
        this.b = ajxh.a(new ac(ajwy6));
        this.c = ((SnapDb) ajwy7.get()).getDbClient((ide) yhy.j);
    }

    public final ajcx a() {
        yin b = b();
        Object f = b.a.c().f(new a(b));
        akcr.a(f, "storyRepository.storySyn…          }\n            }");
        f = f.a((ajfc) new yim(new t(c()))).b((ajdw) this.d.g()).a((ajfl) u.a).e(new v(this));
        akcr.a(f, "storiesRequestFactory.fe…  }\n                    }");
        return f;
    }

    public final ajcx a(Location location) {
        Object e = ajdx.b(Optional.fromNullable(location)).a((ajfc) new q(this)).a((ajfc) new yim(new r(c()))).e((ajfc) new yim(new s(this)));
        akcr.a(e, "Single.just(Optional.fro…:handleStoryAuthResponse)");
        return e;
    }

    public final ajcx a(String str) {
        String str2 = "username";
        akcr.b(str, str2);
        b();
        akcr.b(str, str2);
        Object agba = new agba();
        agba.a = str;
        Object b = ajdx.b(agba);
        akcr.a(b, "Single.just(PreviewStory…= username\n            })");
        b = b.a((ajfc) new yim(new w(c()))).b((ajdw) this.d.g()).e((ajfc) new x(this));
        akcr.a(b, "storiesRequestFactory.fe…  }\n                    }");
        return b;
    }

    public final ajcx a(String str, boolean z) {
        String str2 = "storyId";
        akcr.b(str, str2);
        b();
        akcr.b(str, str2);
        Object agcy = new agcy();
        agcy.a = str;
        agcy.b = Boolean.valueOf(z);
        Object b = ajdx.b(agcy);
        akcr.a(b, "Single.just(LeaveMobStor… = isBlock\n            })");
        Object e = b.a((ajdw) this.d.g()).e((ajfc) new yim(new z(c()))).c((Callable) new aa(this)).a((ajdw) this.d.m()).e((ajfc) new ab(this, str));
        akcr.a(e, "storiesRequestFactory.le…  }\n                    }");
        return e;
    }

    /* JADX WARNING: Missing block: B:2:0x0006, code skipped:
            if (r4 == null) goto L_0x0008;
     */
    public final defpackage.ajcx a(java.util.List<java.lang.String> r4) {
        /*
        r3 = this;
        if (r4 == 0) goto L_0x0008;
    L_0x0002:
        r4 = defpackage.ajdx.b(r4);
        if (r4 != 0) goto L_0x0048;
    L_0x0008:
        r4 = r3.g;
        r4 = r4.b();
        r4 = (defpackage.yij) r4;
        r0 = r4.d();
        r0 = r0.j();
        r1 = com.snap.core.db.record.StoryRecord.FACTORY;
        r1 = r1.selectAllGroupStoryIds();
        r2 = "StoryRecord.FACTORY.selectAllGroupStoryIds()";
        defpackage.akcr.a(r1, r2);
        r0 = r0.a;
        r2 = defpackage.ylj.c.a;
        r2 = (defpackage.akbl) r2;
        r0 = r0.queryAndMapToList(r1, r2);
        r1 = defpackage.ajyw.a;
        r1 = (java.util.List) r1;
        r0 = r0.d(r1);
        r4 = r4.e();
        r4 = r4.i();
        r4 = (defpackage.ajdw) r4;
        r4 = r0.b(r4);
        r0 = "storyRepository.groupSto…eOn(schedulers.queries())";
        defpackage.akcr.a(r4, r0);
    L_0x0048:
        r0 = r3.d;
        r0 = r0.g();
        r0 = (defpackage.ajdw) r0;
        r4 = r4.a(r0);
        r0 = new yik$k;
        r0.<init>(r3);
        r0 = (defpackage.ajfc) r0;
        r4 = r4.a(r0);
        r0 = new yik$l;
        r0.<init>(r3);
        r0 = (defpackage.ajfc) r0;
        r4 = r4.a(r0);
        r0 = defpackage.yik.m.a;
        r0 = (defpackage.ajfb) r0;
        r4 = r4.c(r0);
        r0 = r3.d;
        r0 = r0.i();
        r0 = (defpackage.ajdw) r0;
        r4 = r4.a(r0);
        r0 = new yik$n;
        r0.<init>(r3);
        r0 = (defpackage.ajfc) r0;
        r4 = r4.e(r0);
        r0 = "groupStoryIdsToFetch\n   …      }\n                }";
        defpackage.akcr.a(r4, r0);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yik.a(java.util.List):ajcx");
    }

    public final ajdx<agde> a(ageb ageb, String str, List<String> list, List<String> list2, boolean z) {
        String str2 = MobStoryMetadataModel.STORYTYPE;
        akcr.b(ageb, str2);
        akcr.b(str, "displayName");
        String str3 = "posterUserIds";
        akcr.b(list, str3);
        String str4 = "viewerUserIds";
        akcr.b(list2, str4);
        b();
        akcr.b(ageb, str2);
        akcr.b(str, "storyDisplayName");
        akcr.b(list, str3);
        akcr.b(list2, str4);
        Object agdc = new agdc();
        agdc.b = ageb.a();
        agdc.c = str;
        agdc.i = Boolean.FALSE;
        agdc.d = list;
        agdc.h = list2;
        Object b = ajdx.b(agdc);
        akcr.a(b, "Single.just(UpdateMobSto…werUserIds\n            })");
        b = b.a((ajdw) this.d.g()).a((ajfc) new yim(new a(c()))).a((ajdw) this.d.m()).a((ajfc) new b(this));
        akcr.a(b, "storiesRequestFactory.cr…  }\n                    }");
        return b;
    }

    public final ajdx<agde> a(String str, String str2, List<String> list, List<String> list2, boolean z) {
        String str3 = "storyId";
        akcr.b(str, str3);
        akcr.b(str2, "displayName");
        String str4 = "posterUserIds";
        akcr.b(list, str4);
        String str5 = "viewerUserIds";
        akcr.b(list2, str5);
        b();
        akcr.b(str, str3);
        akcr.b(str2, "storyDisplayName");
        akcr.b(list, str4);
        akcr.b(list2, str5);
        Object agdc = new agdc();
        agdc.a = str;
        agdc.c = str2;
        agdc.i = Boolean.valueOf(z);
        agdc.d = list;
        agdc.h = list2;
        Object b = ajdx.b(agdc);
        akcr.a(b, "Single.just(UpdateMobSto…werUserIds\n            })");
        b = b.a((ajdw) this.d.g()).a((ajfc) new yim(new i(c()))).a((ajdw) this.d.m()).a((ajfc) new j(this));
        akcr.a(b, "storiesRequestFactory.ed…  }\n                    }");
        return b;
    }

    public final yin b() {
        return (yin) this.h.b();
    }

    public final StoriesHttpInterface c() {
        return (StoriesHttpInterface) this.i.b();
    }
}
