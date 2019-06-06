package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.PrivacyType;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.PostableStoryModel.DeletePostableStoryByKey;
import com.snap.core.db.record.StoryModel.PopulateGroupChatGroupStories;
import com.snap.core.db.record.StoryNoteModel;
import com.snap.core.db.record.StoryRecord;
import com.snap.core.db.record.StorySnapModel.MarkAsViewed;
import com.snap.core.db.record.StorySnapModel.SelectSnapDataForDeletionModel;
import com.snap.core.db.record.StorySnapModel.UpdateStatusByRowId;
import com.snap.core.db.record.StorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.RowIdAndViewedRecord;
import com.snapchat.android.R;
import defpackage.aemz.b;
import defpackage.yif.a;
import defpackage.ylo.o;
import defpackage.ylp.c;
import defpackage.ylq.d;
import defpackage.ylq.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: yip */
public final class yip implements yid {
    private final ajxe A;
    private final idd B = yhy.j.callsite("StoryRepositoryClientKt");
    private final Context C;
    final ajxe a;
    final ajxe b;
    public final DbClient c = g().getDbClient((ide) yhy.j);
    final ajxe d = ajxh.a(new at(this.c));
    public final zfw e;
    final ajei f;
    final ajwl<Boolean> g;
    final ajdx<String> h;
    final Map<String, Boolean> i;
    final ajxe<PopulateGroupChatGroupStories> j;
    String k;
    final ajwl<Long> l;
    private final ajxe m;
    private final ajxe n;
    private final ajxe o;
    private final ajxe p;
    private final ajxe q;
    private final ajxe r;
    private final ajxe s;
    private final ajxe t;
    private final ajxe u;
    private final ajxe v;
    private final ajxe w;
    private final ajxe x;
    private final ajxe y;
    private final ajxe z;

    /* renamed from: yip$an */
    static final class an<T, R> implements ajfc<PrivacyType, ajdb> {
        final /* synthetic */ yip a;

        an(yip yip) {
            this.a = yip;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final PrivacyType privacyType = (PrivacyType) obj;
            akcr.b(privacyType, "it");
            return this.a.c.runInTransaction("StoryRepositoryClient:subscribeToMyStoryPrivacySettingsChanges", new akbl<DbTransaction, ajxw>(this) {
                private /* synthetic */ an a;

                public final /* synthetic */ Object invoke(Object obj) {
                    DbTransaction dbTransaction = (DbTransaction) obj;
                    akcr.b(dbTransaction, "tx");
                    yip yip = this.a.a;
                    PrivacyType privacyType = privacyType;
                    akcr.a((Object) privacyType, "it");
                    yip.m().a(dbTransaction, "my_story_ads79sdf", StoryKind.MY_OVERRIDDEN_PRIVACY, privacyType == PrivacyType.EVERYONE);
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: yip$as */
    static final class as extends akcq implements akbk<gpu> {
        as(ajwy ajwy) {
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
            return (gpu) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$a */
    static final class a extends akcq implements akbk<ihh> {
        a(ajwy ajwy) {
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
            return (ihh) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$ah */
    static final class ah extends akcq implements akbk<SnapDb> {
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
            return (SnapDb) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$al */
    static final class al extends akcq implements akbk<ylq> {
        al(ajwy ajwy) {
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
            return (ylq) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$ai */
    static final class ai extends akcq implements akbk<ylo> {
        ai(ajwy ajwy) {
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
            return (ylo) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$u */
    static final class u extends akcq implements akbk<ylj> {
        u(ajwy ajwy) {
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
            return (ylj) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$am */
    static final class am extends akcq implements akbk<yif> {
        am(ajwy ajwy) {
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
            return (yif) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$aj */
    static final class aj extends akcq implements akbk<ylp> {
        aj(ajwy ajwy) {
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
            return (ylp) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$ad */
    static final class ad extends akcq implements akbk<yln> {
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
            return (yln) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$ac */
    static final class ac extends akcq implements akbk<ylm> {
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
            return (ylm) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$z */
    static final class z extends akcq implements akbk<yll> {
        z(ajwy ajwy) {
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
            return (yll) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$ag */
    static final class ag extends akcq implements akbk<psm> {
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
            return (psm) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$s */
    static final class s extends akcq implements akbk<iqx> {
        s(ajwy ajwy) {
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
            return (iqx) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$c */
    static final class c extends akcq implements akbk<quk> {
        c(ajwy ajwy) {
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
            return (quk) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$b */
    static final class b extends akcq implements akbk<ftl> {
        b(ajwy ajwy) {
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
            return (ftl) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$ae */
    static final class ae extends akcq implements akbk<tnj> {
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
            return (tnj) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$q */
    static final class q extends akcq implements akbk<Set<? extends yhv>> {
        q(ajwy ajwy) {
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
            return (Set) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yip$at */
    static final class at extends akcq implements akbk<pa> {
        at(DbClient dbClient) {
            super(0, dbClient);
        }

        public final String getName() {
            return "getWritableDatabase";
        }

        public final akej getOwner() {
            return akde.a(DbClient.class);
        }

        public final String getSignature() {
            return "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;";
        }

        public final /* synthetic */ Object invoke() {
            return ((DbClient) this.receiver).getWritableDatabase();
        }
    }

    /* renamed from: yip$e */
    static final class e<T> implements ajfl<abkq> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "it");
            CharSequence charSequence = abkq.b;
            obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
            return obj == null;
        }
    }

    /* renamed from: yip$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "it");
            return abkq.b;
        }
    }

    /* renamed from: yip$ab */
    static final class ab extends akcs implements akbk<PopulateGroupChatGroupStories> {
        private /* synthetic */ yip a;

        ab(yip yip) {
            this.a = yip;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PopulateGroupChatGroupStories((pa) this.a.d.b());
        }
    }

    /* renamed from: yip$1 */
    static final class 1<T> implements ajfb<String> {
        private /* synthetic */ yip a;

        1(yip yip) {
            this.a = yip;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (String) obj;
            yip yip = this.a;
            akcr.a(obj, "username");
            yip.k = obj;
            ajvv.a(yit.a(yip.c.runInTransaction("StoryRepositoryClient:initDbTransaction", new v(yip, obj)), null, null, 3), yip.f);
            ajcx a = ((ftl) yip.b.b()).v(yiz.MY_STORY_PRIVACY).a(yip.g().scheduler()).a((ajfc) new an(yip), false);
            akcr.a((Object) a, "compositeConfigurationPr…      }\n                }");
            ajvv.a(yit.a(a, null, null, 3), yip.f);
        }
    }

    /* renamed from: yip$v */
    static final class v extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ yip a;
        private /* synthetic */ String b;

        v(yip yip, String str) {
            this.a = yip;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            this.a.a(dbTransaction, this.b);
            this.a.a(dbTransaction);
            return ajxw.a;
        }
    }

    /* renamed from: yip$aq */
    static final class aq<T> implements ajfb<DbTransaction> {
        private /* synthetic */ yip a;
        private /* synthetic */ long b;

        aq(yip yip, long j) {
            this.a = yip;
            this.b = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.l.a(Long.valueOf(this.b));
        }
    }

    /* renamed from: yip$g */
    static final class g<T, R> implements ajfc<String, ajdb> {
        final /* synthetic */ yip a;
        final /* synthetic */ List b;

        g(yip yip, List list) {
            this.a = yip;
            this.b = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            akcr.b(str, "username");
            return this.a.c.runInTransaction("StoryRepositoryClient:deleteObsoletePostedStorySnaps", new akbl<DbTransaction, ajxw>(this) {
                private /* synthetic */ g a;

                public final /* synthetic */ Object invoke(Object obj) {
                    DbTransaction dbTransaction = (DbTransaction) obj;
                    akcr.b(dbTransaction, "tx");
                    ylq h = this.a.a.h();
                    Object obj2 = str;
                    String str = "username";
                    akcr.a(obj2, str);
                    akcr.b(obj2, str);
                    DbClient dbClient = h.a;
                    obj2 = StorySnapRecord.FACTORY.getPostedAndServerConfirmedStorySnapIds(obj2);
                    akcr.a(obj2, "StorySnapRecord.FACTORY.…medStorySnapIds(username)");
                    Object obj3 = StorySnapRecord.FACTORY;
                    akcr.a(obj3, "StorySnapRecord.FACTORY");
                    obj3 = obj3.getPostedAndServerConfirmedStorySnapIdsMapper();
                    akcr.a(obj3, "StorySnapRecord.FACTORY.…nfirmedStorySnapIdsMapper");
                    Set a = ajzu.a(ajyu.m(dbClient.query(obj2, obj3)), (Iterable) ajyu.m(this.a.b));
                    if ((a.isEmpty() ^ 1) != 0) {
                        this.a.a.a(dbTransaction, this.a.a.h().b(ajyu.k(a)));
                    }
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: yip$ak */
    static final class ak<V> implements Callable<T> {
        private /* synthetic */ yip a;
        private /* synthetic */ yle b;

        ak(yip yip, yle yle) {
            this.a = yip;
            this.b = yle;
        }

        public final /* synthetic */ Object call() {
            return Optional.fromNullable(this.a.i().a(this.b.a, this.b.b));
        }
    }

    /* renamed from: yip$ao */
    static final class ao<V> implements Callable<T> {
        private /* synthetic */ yip a;
        private /* synthetic */ agcw b;

        ao(yip yip, agcw agcw) {
            this.a = yip;
            this.b = agcw;
        }

        public final /* synthetic */ Object call() {
            yip yip = this.a;
            Object obj = this.b.a;
            akcr.a(obj, "mobResponse.mobStoriesList");
            Iterable<agdu> iterable = (Iterable) obj;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (agdu agdu : iterable) {
                arrayList.add(agdu.a);
            }
            return yip.a(yip, (List) arrayList);
        }
    }

    /* renamed from: yip$r */
    static final class r<V> implements Callable<T> {
        private /* synthetic */ yip a;
        private /* synthetic */ long b;

        r(yip yip, long j) {
            this.a = yip;
            this.b = j;
        }

        public final /* synthetic */ Object call() {
            ylq h = this.a.h();
            Object failedRetryableStorySnapClientIds = StorySnapRecord.FACTORY.getFailedRetryableStorySnapClientIds(this.b);
            akcr.a(failedRetryableStorySnapClientIds, "StorySnapRecord.FACTORY.…SnapClientIds(storyRowId)");
            Object obj = h.a;
            akcr.a(obj, "db");
            Object obj2 = StorySnapRecord.FACTORY;
            akcr.a(obj2, "StorySnapRecord.FACTORY");
            obj2 = obj2.getFailedRetryableStorySnapClientIdsMapper();
            akcr.a(obj2, "StorySnapRecord.FACTORY.…eStorySnapClientIdsMapper");
            return BriteDatabaseExtensionsKt.queryList(obj, failedRetryableStorySnapClientIds, obj2);
        }
    }

    /* renamed from: yip$x */
    static final class x<V> implements Callable<T> {
        private /* synthetic */ yip a;
        private /* synthetic */ List b;

        x(yip yip, List list) {
            this.a = yip;
            this.b = list;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x00a8 in {9, 10, 12, 14, 16} preds:[]
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
        public final /* synthetic */ java.lang.Object call() {
            /*
            r14 = this;
            r0 = r14.a;
            r0 = r0.c;
            r1 = "dbClient";
            defpackage.akcr.a(r0, r1);
            r1 = com.snap.core.db.query.LegacyDiscoverFeedQueries.FACTORY;
            r2 = r14.b;
            r2 = (java.util.Collection) r2;
            if (r2 == 0) goto L_0x00a0;
            r3 = 0;
            r3 = new java.lang.String[r3];
            r2 = r2.toArray(r3);
            if (r2 == 0) goto L_0x0098;
            r2 = (java.lang.String[]) r2;
            r1 = r1.selectFriendStoryForNotificationWithStoryIds(r2);
            r2 = "LegacyDiscoverFeedQuerie…s(userIds.toTypedArray())";
            defpackage.akcr.a(r1, r2);
            r2 = com.snap.core.db.query.LegacyDiscoverFeedQueries.NOTIFICATION_FRIEND_STORY_ROW_MAPPER;
            r3 = "LegacyDiscoverFeedQuerie…N_FRIEND_STORY_ROW_MAPPER";
            defpackage.akcr.a(r2, r3);
            r0 = com.snap.core.db.api.BriteDatabaseExtensionsKt.queryList(r0, r1, r2);
            r0 = (java.lang.Iterable) r0;
            r1 = new java.util.ArrayList;
            r2 = 10;
            r2 = defpackage.ajyn.a(r0, r2);
            r1.<init>(r2);
            r1 = (java.util.Collection) r1;
            r0 = r0.iterator();
            r2 = r0.hasNext();
            if (r2 == 0) goto L_0x0095;
            r2 = r0.next();
            r2 = (com.snap.core.db.query.LegacyDiscoverFeedQueries.NotificationFriendStory) r2;
            r3 = "it";
            defpackage.akcr.a(r2, r3);
            r3 = "receiver$0";
            defpackage.akcr.b(r2, r3);
            r3 = new ymn;
            r5 = r2.storyId();
            r4 = "storyId()";
            defpackage.akcr.a(r5, r4);
            r6 = r2.storyRowId();
            r8 = r2.storyLatestTimestamp();
            r9 = r2.bitmojiAvatarId();
            r10 = r2.bitmojiSelfieId();
            r11 = r2.friendDisplayName();
            r12 = r2.storyId();
            defpackage.akcr.a(r12, r4);
            r13 = r2.friendUserId();
            if (r13 != 0) goto L_0x0088;
            defpackage.akcr.a();
            r2 = "friendUserId()!!";
            defpackage.akcr.a(r13, r2);
            r4 = r3;
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13);
            r1.add(r3);
            goto L_0x0043;
            r1 = (java.util.List) r1;
            return r1;
            r0 = new ajxt;
            r1 = "null cannot be cast to non-null type kotlin.Array<T>";
            r0.<init>(r1);
            throw r0;
            r0 = new ajxt;
            r1 = "null cannot be cast to non-null type java.util.Collection<T>";
            r0.<init>(r1);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yip$x.call():java.lang.Object");
        }
    }

    /* renamed from: yip$aa */
    static final class aa<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ yip a;

        aa(yip yip) {
            this.a = yip;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            if (optional.isPresent()) {
                ylq h = this.a.h();
                List a = ajyl.a(optional.get());
                String str = this.a.k;
                if (str == null) {
                    akcr.a();
                }
                return h.a(a, str, false);
            }
            obj = ajdp.b((Object) ajyw.a);
            akcr.a(obj, "Observable.just(emptyList())");
            return obj;
        }
    }

    /* renamed from: yip$ap */
    static final class ap<T, R> implements ajfc<Map<String, ? extends String>, ajdb> {
        final /* synthetic */ yip a;
        final /* synthetic */ agcw b;

        ap(yip yip, agcw agcw) {
            this.a = yip;
            this.b = agcw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Map map = (Map) obj;
            akcr.b(map, "groupChatDisplayNames");
            return this.a.c.runInTransaction("StoryRepositoryClient:syncGroupStories", new akbl<DbTransaction, ajxw>(this) {
                private /* synthetic */ ap a;

                public final /* synthetic */ Object invoke(Object obj) {
                    DbTransaction dbTransaction = (DbTransaction) obj;
                    akcr.b(dbTransaction, "tx");
                    for (agdu agdu : this.a.b.a) {
                        akcr.a((Object) agdu, "story");
                        if (agdu.a() == ageb.PRIVATE) {
                            quk o = this.a.a.o();
                            String str = agdu.g;
                            akcr.a((Object) str, "story.creatorUsername");
                            quk.a(o, str, null, null, false, 14);
                        }
                        this.a.a.a(dbTransaction, agdu, (String) map.get(agdu.a));
                    }
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: yip$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ yip a;

        d(yip yip) {
            this.a = yip;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            ylo i = this.a.i();
            akcr.b(str, "username");
            obj = StoryRecord.FACTORY.selectUserManagedStories(str);
            akcr.a(obj, "StoryRecord.FACTORY.sele…rManagedStories(username)");
            return i.c.queryAndMapToList("s:userManagedStories", obj, o.a);
        }
    }

    /* renamed from: yip$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ yip a;

        h(yip yip) {
            this.a = yip;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            String str2 = "pendingSnapId";
            akcr.b(str, str2);
            CharSequence charSequence = str;
            String str3 = "~";
            final String str4 = (String) ajyu.h(akgc.a(charSequence, new String[]{str3}, 0, 6));
            akcr.b(str, str2);
            str = (String) ajyu.f(akgc.a(charSequence, new String[]{str3}, 0, 6));
            return ((psm) this.a.a.b()).a(str4, str).c((Callable) new Callable<ajxm<? extends String, ? extends String>>() {
                public final /* synthetic */ Object call() {
                    return new ajxm(str4, str);
                }
            });
        }
    }

    /* renamed from: yip$l */
    public static final class l<T, R> implements ajfc<String, ajdb> {
        final /* synthetic */ yip a;
        private /* synthetic */ boolean b = true;
        private /* synthetic */ String c;

        /* renamed from: yip$l$1 */
        static final class 1<T, R> implements ajfc<Long, ajdb> {
            private /* synthetic */ l a;

            1(l lVar) {
                this.a = lVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Long l = (Long) obj;
                akcr.b(l, StoryNoteModel.STORYSNAPROWID);
                return this.a.a.a(l.longValue());
            }
        }

        public l(yip yip, String str) {
            this.a = yip;
            this.c = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx a;
            String str = (String) obj;
            akcr.b(str, "it");
            if (this.b) {
                ylq h = this.a.h();
                akcr.b(str, "snapId");
                obj = StorySnapRecord.FACTORY.getIsPendingServerConfirmation(str);
                akcr.a(obj, "StorySnapRecord.FACTORY.…erverConfirmation(snapId)");
                DbClient dbClient = h.a;
                Object obj2 = StorySnapRecord.FACTORY;
                akcr.a(obj2, "StorySnapRecord.FACTORY");
                obj2 = obj2.getIsPendingServerConfirmationMapper();
                akcr.a(obj2, "StorySnapRecord.FACTORY.…gServerConfirmationMapper");
                Long l = (Long) dbClient.queryFirst(obj, obj2);
                obj = (l != null && l.longValue() == 1) ? 1 : null;
                if (obj != null) {
                    a = ajvo.a(ajhn.a);
                    return a;
                }
            }
            a = ajdp.b((Iterable) this.a.h().b(ajyl.a(this.c))).a((ajfc) new 1(this), false);
            return a;
        }
    }

    /* renamed from: yip$af */
    static final class af extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ yip a;

        af(yip yip) {
            this.a = yip;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((DbTransaction) obj, "it");
            this.a.c.executeUpdateDelete((ainy) this.a.j.b());
            return ajxw.a;
        }
    }

    /* renamed from: yip$ar */
    static final class ar extends akcs implements akbl<DbTransaction, Long> {
        private /* synthetic */ yip a;
        private /* synthetic */ afbi b;
        private /* synthetic */ MessageClientStatus c;

        ar(yip yip, afbi afbi, MessageClientStatus messageClientStatus) {
            this.a = yip;
            this.b = afbi;
            this.c = messageClientStatus;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            String str = "tx";
            akcr.b(dbTransaction, str);
            ylo i = this.a.i();
            String str2 = this.b.b;
            akcr.a((Object) str2, "story.username");
            akcr.b(dbTransaction, str);
            akcr.b(str2, "username");
            dbTransaction.checkInTransaction();
            ylo ylo = i;
            DbTransaction dbTransaction2 = dbTransaction;
            return Long.valueOf(ylq.a(this.a.h(), dbTransaction2, ylo.a(ylo, dbTransaction2, str2, StoryKind.USER_SHARE, str2, str2, null, null, null, null, false, 992), this.b, false, null, this.c, null, null, null, null, null, 1984).b);
        }
    }

    /* renamed from: yip$i */
    static final class i extends akcs implements akbl<ajxm<? extends String, ? extends String>, ajxw> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ajxw.a;
        }
    }

    /* renamed from: yip$j */
    static final class j extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ List a;

        j(List list) {
            this.a = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: yip$k */
    static final class k extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ yip a;
        private /* synthetic */ long b;

        k(yip yip, long j) {
            this.a = yip;
            this.b = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            List a = this.a.a(dbTransaction, ajyl.a(Long.valueOf(this.b)));
            Map map = this.a.i;
            Iterable<String> iterable = a;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (String ajxm : iterable) {
                arrayList.add(new ajxm(ajxm, Boolean.TRUE));
            }
            ajzm.a(map, (Iterable) (List) arrayList);
            return ajxw.a;
        }
    }

    /* renamed from: yip$m */
    static final class m extends akcs implements akbl<List<? extends Long>, ajxw> {
        private /* synthetic */ yip a;

        m(yip yip) {
            this.a = yip;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            ylp l = this.a.l();
            akcr.b(list, "storySnapRowIds");
            ymf.b(list, new c(l));
            return ajxw.a;
        }
    }

    /* renamed from: yip$n */
    static final class n extends akcs implements akbl<List<? extends Long>, ajxw> {
        private /* synthetic */ yip a;
        private /* synthetic */ DbTransaction b;

        n(yip yip, DbTransaction dbTransaction) {
            this.a = yip;
            this.b = dbTransaction;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            ylq h = this.a.h();
            DbTransaction dbTransaction = this.b;
            akcr.b(dbTransaction, "tx");
            akcr.b(list, "storySnapRowIds");
            dbTransaction.checkInTransaction();
            ymf.b(list, new d(h));
            return ajxw.a;
        }
    }

    /* renamed from: yip$o */
    static final class o extends akcs implements akbl<List<? extends Long>, ajxw> {
        private /* synthetic */ yip a;
        private /* synthetic */ DbTransaction b;

        o(yip yip, DbTransaction dbTransaction) {
            this.a = yip;
            this.b = dbTransaction;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            this.a.h().a(this.b, list);
            return ajxw.a;
        }
    }

    /* renamed from: yip$p */
    static final class p extends akcs implements akbl<List<? extends Long>, List<? extends SelectSnapDataForDeletionModel>> {
        private /* synthetic */ yip a;

        p(yip yip) {
            this.a = yip;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            ylq h = this.a.h();
            akcr.b(list, "storySnapIds");
            return ymf.a(list, new i(h));
        }
    }

    /* renamed from: yip$t */
    public static final class t extends akcs implements akbl<DbTransaction, Optional<MessageClientStatus>> {
        private /* synthetic */ yip a;
        private /* synthetic */ long b;

        public t(yip yip, long j) {
            this.a = yip;
            this.b = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((DbTransaction) obj, "it");
            MessageClientStatus c = this.a.h().c(this.b);
            if (c != null) {
                Optional of = Optional.of(c);
                if (of != null) {
                    return of;
                }
            }
            obj = Optional.absent();
            akcr.a(obj, "Optional.absent()");
            return obj;
        }
    }

    /* renamed from: yip$w */
    static final class w extends akcs implements akbl<DbTransaction, Boolean> {
        private /* synthetic */ yip a;
        private /* synthetic */ aetk b;

        w(yip yip, aetk aetk) {
            this.a = yip;
            this.b = aetk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            String str = "tx";
            akcr.b(dbTransaction, str);
            boolean z = false;
            for (aeti aeti : this.b.a) {
                ylo i = this.a.i();
                String str2 = "ourStory";
                akcr.a((Object) aeti, str2);
                akcr.b(dbTransaction, str);
                akcr.b(aeti, str2);
                dbTransaction.checkInTransaction();
                Object obj2 = aeti.a;
                akcr.a(obj2, "ourStory.groupId");
                String str3 = str;
                aeti aeti2 = aeti;
                long a = ylo.a(i, dbTransaction, obj2, StoryKind.OUR, null, aeti.b, Boolean.TRUE, null, aeti.a, null, false, 832);
                if (a != -1) {
                    yip yip = this.a;
                    StoryKind storyKind = StoryKind.OUR;
                    List list = aeti2.c;
                    akcr.a((Object) list, "ourStory.stories");
                    boolean z2 = true;
                    if ((yip.a(dbTransaction, a, storyKind, list, false, null).isEmpty() ^ 1) == 0 && !z) {
                        z2 = false;
                    }
                    z = z2;
                }
                str = str3;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: yip$y */
    static final class y extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ yip a;
        private /* synthetic */ ylg b;

        y(yip yip, ylg ylg) {
            this.a = yip;
            this.b = ylg;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            String str = "tx";
            akcr.b(dbTransaction, str);
            ylq h = this.a.h();
            ylg ylg = this.b;
            akcr.b(dbTransaction, str);
            akcr.b(ylg, "storySnapKey");
            dbTransaction.checkInTransaction();
            MarkAsViewed markAsViewed = new MarkAsViewed(h.a(), StoryRecord.FACTORY);
            yle yle = ylg.a;
            markAsViewed.bind(yle.a, yle.b, ylg.b);
            h.a.executeUpdateDelete(markAsViewed, dbTransaction);
            yip yip = this.a;
            yle yle2 = this.b.a;
            Long a = yip.h().a(yle2);
            if (a != null && a.longValue() == 0) {
                ylo i = yip.i();
                akcr.b(dbTransaction, str);
                akcr.b(yle2, "storyKey");
                dbTransaction.checkInTransaction();
                i.a().bind(yle2.a, yle2.b);
                i.c.executeUpdateDelete(i.a(), dbTransaction);
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(yip.class), "userSession", "getUserSession()Lcom/snap/core/user/UserSession;"), new akdc(akde.a(yip.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(yip.class), "snapDb", "getSnapDb()Lcom/snap/core/db/api/SnapDb;"), new akdc(akde.a(yip.class), "storySnapData", "getStorySnapData()Lcom/snap/stories/db/inserts/StorySnapData;"), new akdc(akde.a(yip.class), "storyData", "getStoryData()Lcom/snap/stories/db/inserts/StoryData;"), new akdc(akde.a(yip.class), "groupStoryData", "getGroupStoryData()Lcom/snap/stories/db/inserts/GroupStoryData;"), new akdc(akde.a(yip.class), "storySyncData", "getStorySyncData()Lcom/snap/stories/api/StorySyncData;"), new akdc(akde.a(yip.class), "storyNoteData", "getStoryNoteData()Lcom/snap/stories/db/inserts/StoryNoteData;"), new akdc(akde.a(yip.class), "postableStoryMetadataData", "getPostableStoryMetadataData()Lcom/snap/stories/db/inserts/PostableStoryMetadataData;"), new akdc(akde.a(yip.class), "postableStoryData", "getPostableStoryData()Lcom/snap/stories/db/inserts/PostableStoryData;"), new akdc(akde.a(yip.class), "mobStoryMetadataData", "getMobStoryMetadataData()Lcom/snap/stories/db/inserts/MobStoryMetadataData;"), new akdc(akde.a(yip.class), "sendApi", "getSendApi()Lcom/snap/messaging/api/SendMessageApi;"), new akdc(akde.a(yip.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/api/FriendRepositoryApi;"), new akdc(akde.a(yip.class), "conversationsRepository", "getConversationsRepository()Lcom/snap/messaging/db/ConversationsRepository;"), new akdc(akde.a(yip.class), "compositeConfigurationProvider", "getCompositeConfigurationProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(yip.class), "prefs", "getPrefs()Lcom/snap/prefs/Preferences;"), new akdc(akde.a(yip.class), "externalStorySources", "getExternalStorySources()Ljava/util/Set;"), new akdc(akde.a(yip.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;")};
    }

    public yip(Context context, ajwy<gpb> ajwy, ajwy<gpu> ajwy2, ajwy<ihh> ajwy3, ajwy<SnapDb> ajwy4, ajwy<ylq> ajwy5, ajwy<ylo> ajwy6, ajwy<ylj> ajwy7, ajwy<yif> ajwy8, ajwy<ylp> ajwy9, ajwy<yln> ajwy10, ajwy<ylm> ajwy11, ajwy<yll> ajwy12, ajwy<zgb> ajwy13, ajwy<psm> ajwy14, ajwy<iqx> ajwy15, ajwy<quk> ajwy16, ajwy<ftl> ajwy17, ajwy<tnj> ajwy18, ajwy<Set<yhv>> ajwy19) {
        ajwy<gpu> ajwy20 = ajwy2;
        ajwy<ihh> ajwy21 = ajwy3;
        ajwy<SnapDb> ajwy22 = ajwy4;
        ajwy<ylq> ajwy23 = ajwy5;
        ajwy<ylo> ajwy24 = ajwy6;
        ajwy<ylj> ajwy25 = ajwy7;
        ajwy<yif> ajwy26 = ajwy8;
        ajwy<ylp> ajwy27 = ajwy9;
        ajwy<yln> ajwy28 = ajwy10;
        ajwy<ylm> ajwy29 = ajwy11;
        ajwy<yll> ajwy30 = ajwy12;
        ajwy<psm> ajwy31 = ajwy14;
        ajwy<iqx> ajwy32 = ajwy15;
        ajwy<quk> ajwy33 = ajwy16;
        ajwy<ftl> ajwy34 = ajwy17;
        akcr.b(context, "context");
        akcr.b(ajwy, "userAuthProvider");
        akcr.b(ajwy20, "userSessionProvider");
        akcr.b(ajwy21, "clockProvider");
        akcr.b(ajwy22, "snapDbProvider");
        akcr.b(ajwy23, "storySnapDataProvider");
        akcr.b(ajwy24, "storyDataProvider");
        akcr.b(ajwy25, "groupStoryDataProvider");
        akcr.b(ajwy26, "storySyncDataProvider");
        akcr.b(ajwy27, "storyNoteDataProvider");
        akcr.b(ajwy28, "postableStoryMetadataDataProvider");
        akcr.b(ajwy29, "postableStoryDataProvider");
        akcr.b(ajwy30, "mobStoryMetadataDataProvider");
        akcr.b(ajwy13, "schedulersProvider");
        akcr.b(ajwy31, "sendApiProvider");
        akcr.b(ajwy32, "friendRepositoryProvider");
        akcr.b(ajwy33, "conversationsRepositoryProvider");
        akcr.b(ajwy17, "compositeConfigurationProviderProvider");
        akcr.b(ajwy18, "prefsProvider");
        akcr.b(ajwy19, "externalStorySources");
        this.C = context;
        this.m = ajxh.a(new as(ajwy20));
        this.n = ajxh.a(new a(ajwy21));
        this.o = ajxh.a(new ah(ajwy22));
        this.p = ajxh.a(new al(ajwy23));
        this.q = ajxh.a(new ai(ajwy24));
        this.r = ajxh.a(new u(ajwy25));
        this.s = ajxh.a(new am(ajwy26));
        this.t = ajxh.a(new aj(ajwy27));
        this.u = ajxh.a(new ad(ajwy28));
        this.v = ajxh.a(new ac(ajwy29));
        this.w = ajxh.a(new z(ajwy30));
        this.a = ajxh.a(new ag(ajwy31));
        this.x = ajxh.a(new s(ajwy32));
        this.y = ajxh.a(new c(ajwy33));
        this.b = ajxh.a(new b(ajwy17));
        ajwy<Set<yhv>> ajwy35 = ajwy19;
        this.z = ajxh.a(new ae(ajwy18));
        this.A = ajxh.a(new q(ajwy35));
        ajwy13.get();
        this.e = zgb.a(this.B);
        this.f = e().a;
        Object i = ajwl.i(Boolean.FALSE);
        akcr.a(i, "BehaviorSubject.createDefault(false)");
        this.g = i;
        i = ((gpb) ajwy.get()).c().a((ajfl) e.a).e().f(f.a);
        akcr.a(i, "userAuthProvider.get().o…     .map { it.username }");
        this.h = i;
        this.i = new ConcurrentHashMap();
        this.j = ajxh.a(new ab(this));
        i = new ajwl();
        akcr.a(i, "BehaviorSubject.create<Long>()");
        this.l = i;
        ajej e = this.h.b((ajdw) this.e.b()).e((ajfb) new 1(this));
        akcr.a((Object) e, "currentUsername\n        …-> initialize(username) }");
        ajvv.a(e, this.f);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x00f0 in {6, 7, 8, 10, 18, 19, 22, 25, 26, 31, 32, 33, 34, 35, 37, 38, 40} preds:[]
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
    private void a(com.snap.core.db.api.DbTransaction r26, long r27, defpackage.aeml r29, java.lang.String r30) {
        /*
        r25 = this;
        r0 = r29;
        r1 = "tx";
        r15 = r26;
        defpackage.akcr.b(r15, r1);
        r1 = "friendStories";
        defpackage.akcr.b(r0, r1);
        r26.checkInTransaction();	 Catch:{ all -> 0x00ee }
        r0 = r0.b;	 Catch:{ all -> 0x00ee }
        r1 = r0;	 Catch:{ all -> 0x00ee }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x00ee }
        r16 = 1;	 Catch:{ all -> 0x00ee }
        r17 = 0;	 Catch:{ all -> 0x00ee }
        if (r1 == 0) goto L_0x0025;	 Catch:{ all -> 0x00ee }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x00ee }
        if (r1 == 0) goto L_0x0023;	 Catch:{ all -> 0x00ee }
        goto L_0x0025;	 Catch:{ all -> 0x00ee }
        r1 = 0;	 Catch:{ all -> 0x00ee }
        goto L_0x0026;	 Catch:{ all -> 0x00ee }
        r1 = 1;	 Catch:{ all -> 0x00ee }
        if (r1 == 0) goto L_0x0029;	 Catch:{ all -> 0x00ee }
        return;	 Catch:{ all -> 0x00ee }
        r0 = r0.iterator();	 Catch:{ all -> 0x00ee }
        r1 = 0;	 Catch:{ all -> 0x00ee }
        r6 = r1;	 Catch:{ all -> 0x00ee }
        r10 = 1;	 Catch:{ all -> 0x00ee }
        r2 = r6;	 Catch:{ all -> 0x00ee }
        r1 = 0;	 Catch:{ all -> 0x00ee }
        r4 = r0.hasNext();	 Catch:{ all -> 0x00ee }
        if (r4 == 0) goto L_0x00d5;	 Catch:{ all -> 0x00ee }
        r4 = r0.next();	 Catch:{ all -> 0x00ee }
        r4 = (defpackage.aemn) r4;	 Catch:{ all -> 0x00ee }
        r8 = r4.a;	 Catch:{ all -> 0x00ee }
        r5 = "storySnap";	 Catch:{ all -> 0x00ee }
        defpackage.akcr.a(r8, r5);	 Catch:{ all -> 0x00ee }
        r5 = com.snap.core.db.column.StoryKind.FRIEND;	 Catch:{ all -> 0x00ee }
        r14 = r25;	 Catch:{ all -> 0x00ee }
        r5 = r14.a(r8, r5);	 Catch:{ all -> 0x00ee }
        if (r5 == 0) goto L_0x00d1;	 Catch:{ all -> 0x00ee }
        r5 = r8.e;	 Catch:{ all -> 0x00ee }
        r11 = r5.longValue();	 Catch:{ all -> 0x00ee }
        r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1));	 Catch:{ all -> 0x00ee }
        if (r5 <= 0) goto L_0x0068;	 Catch:{ all -> 0x00ee }
        r5 = r8.e;	 Catch:{ all -> 0x00ee }
        r6 = "storySnap.timestamp";	 Catch:{ all -> 0x00ee }
        defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x00ee }
        r5 = r5.longValue();	 Catch:{ all -> 0x00ee }
        r18 = r5;	 Catch:{ all -> 0x00ee }
        goto L_0x006a;	 Catch:{ all -> 0x00ee }
        r18 = r6;	 Catch:{ all -> 0x00ee }
        r5 = r8.o;	 Catch:{ all -> 0x00ee }
        r5 = r5.longValue();	 Catch:{ all -> 0x00ee }
        r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));	 Catch:{ all -> 0x00ee }
        if (r7 <= 0) goto L_0x0081;	 Catch:{ all -> 0x00ee }
        r2 = r4.a;	 Catch:{ all -> 0x00ee }
        r2 = r2.o;	 Catch:{ all -> 0x00ee }
        r3 = "friendStorySnap.story.timeLeft";	 Catch:{ all -> 0x00ee }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x00ee }
        r2 = r2.longValue();	 Catch:{ all -> 0x00ee }
        r20 = r2;	 Catch:{ all -> 0x00ee }
        r2 = r4.b;	 Catch:{ all -> 0x00ee }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x00ee }
        if (r2 != 0) goto L_0x008e;	 Catch:{ all -> 0x00ee }
        r22 = 0;	 Catch:{ all -> 0x00ee }
        goto L_0x0090;	 Catch:{ all -> 0x00ee }
        r22 = r10;	 Catch:{ all -> 0x00ee }
        r2 = r25.h();	 Catch:{ all -> 0x00ee }
        r3 = r4.b;	 Catch:{ all -> 0x00ee }
        r5 = "friendStorySnap.viewed";	 Catch:{ all -> 0x00ee }
        defpackage.akcr.a(r3, r5);	 Catch:{ all -> 0x00ee }
        r7 = r3.booleanValue();	 Catch:{ all -> 0x00ee }
        r9 = r4.c;	 Catch:{ all -> 0x00ee }
        r10 = com.snap.core.db.column.MessageClientStatus.OK;	 Catch:{ all -> 0x00ee }
        r11 = 0;	 Catch:{ all -> 0x00ee }
        r12 = 0;	 Catch:{ all -> 0x00ee }
        r13 = 0;	 Catch:{ all -> 0x00ee }
        r23 = 0;	 Catch:{ all -> 0x00ee }
        r24 = 1728; // 0x6c0 float:2.421E-42 double:8.537E-321;	 Catch:{ all -> 0x00ee }
        r3 = r26;	 Catch:{ all -> 0x00ee }
        r4 = r27;	 Catch:{ all -> 0x00ee }
        r6 = r8;	 Catch:{ all -> 0x00ee }
        r8 = r9;	 Catch:{ all -> 0x00ee }
        r9 = r10;	 Catch:{ all -> 0x00ee }
        r10 = r11;	 Catch:{ all -> 0x00ee }
        r11 = r12;	 Catch:{ all -> 0x00ee }
        r12 = r30;	 Catch:{ all -> 0x00ee }
        r14 = r23;	 Catch:{ all -> 0x00ee }
        r15 = r24;	 Catch:{ all -> 0x00ee }
        r2 = defpackage.ylq.a(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x00ee }
        r2 = r2.a;	 Catch:{ all -> 0x00ee }
        if (r1 != 0) goto L_0x00ca;	 Catch:{ all -> 0x00ee }
        r4 = -1;	 Catch:{ all -> 0x00ee }
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ all -> 0x00ee }
        if (r1 == 0) goto L_0x00c8;	 Catch:{ all -> 0x00ee }
        goto L_0x00ca;	 Catch:{ all -> 0x00ee }
        r1 = 0;	 Catch:{ all -> 0x00ee }
        goto L_0x00cb;	 Catch:{ all -> 0x00ee }
        r1 = 1;	 Catch:{ all -> 0x00ee }
        r6 = r18;	 Catch:{ all -> 0x00ee }
        r2 = r20;	 Catch:{ all -> 0x00ee }
        r10 = r22;	 Catch:{ all -> 0x00ee }
        r15 = r26;	 Catch:{ all -> 0x00ee }
        goto L_0x0033;	 Catch:{ all -> 0x00ee }
        if (r1 == 0) goto L_0x00ed;	 Catch:{ all -> 0x00ee }
        r0 = r25.i();	 Catch:{ all -> 0x00ee }
        r1 = r25.f();	 Catch:{ all -> 0x00ee }
        r4 = r1.a();	 Catch:{ all -> 0x00ee }
        r8 = r4 + r2;	 Catch:{ all -> 0x00ee }
        r2 = r0;	 Catch:{ all -> 0x00ee }
        r3 = r26;	 Catch:{ all -> 0x00ee }
        r4 = r27;	 Catch:{ all -> 0x00ee }
        r2.a(r3, r4, r6, r8, r10);	 Catch:{ all -> 0x00ee }
        return;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yip.a(com.snap.core.db.api.DbTransaction, long, aeml, java.lang.String):void");
    }

    private final void a(DbTransaction dbTransaction, long j, StoryKind storyKind) {
        i().a(dbTransaction, j);
        if (storyKind == StoryKind.GROUP) {
            n().a(dbTransaction, j);
        }
        List b = h().b(j);
        if ((b.isEmpty() ^ 1) != 0) {
            a(dbTransaction, b);
        }
    }

    private final void a(DbTransaction dbTransaction, Set<String> set, StoryKind storyKind) {
        for (String str : m().a(storyKind)) {
            if (!set.contains(str)) {
                m().a(dbTransaction, str, storyKind, false);
                yln p = p();
                akcr.b(dbTransaction, "tx");
                akcr.b(str, "storyId");
                dbTransaction.checkInTransaction();
                ((DeletePostableStoryByKey) p.b.get()).bind(str);
                DbClient dbClient = p.a;
                Object obj = p.b.get();
                akcr.a(obj, "deletePostableStoryMetadataById.get()");
                dbClient.executeUpdateDelete((ainy) obj, dbTransaction);
            }
        }
    }

    private final boolean a(afbi afbi, StoryKind storyKind) {
        return (storyKind == StoryKind.BUSINESS || this.i.containsKey(afbi.a)) ? false : true;
    }

    private final ajej b(List<String> list) {
        Object n = ajdp.b((Iterable) list).b((ajdw) this.e.b()).n(new h(this));
        akcr.a(n, "Observable.fromIterable(…) }\n                    }");
        return ajvv.a(yit.a(n, new j(list), null, i.a, 2), this.f);
    }

    private final void b(DbTransaction dbTransaction, List<? extends aikk> list) {
        HashSet hashSet = new HashSet();
        for (aikk aikk : list) {
            hashSet.add(aikk.a);
            m().a(dbTransaction, aikk);
        }
        a(dbTransaction, (Set) hashSet, StoryKind.OFFICIAL);
    }

    private final yln p() {
        return (yln) this.u.b();
    }

    private final iqx q() {
        return (iqx) this.x.b();
    }

    private final tnj r() {
        return (tnj) this.z.b();
    }

    /* Access modifiers changed, original: final */
    public final long a(DbTransaction dbTransaction, String str) {
        DbTransaction dbTransaction2 = dbTransaction;
        String str2 = str;
        dbTransaction.checkInTransaction();
        if (this.l.q()) {
            Object p = this.l.p();
            if (p == null) {
                akcr.a();
            }
            akcr.a(p, "myStoryRowId.value!!");
            return ((Number) p).longValue();
        }
        dbTransaction.checkInTransaction();
        ylo i = i();
        StoryKind storyKind = StoryKind.MY;
        Object string = this.C.getString(R.string.story_my_story_name);
        String str3 = "context.getString(R.string.story_my_story_name)";
        akcr.a(string, str3);
        long a = i.a(dbTransaction2, str2, storyKind, string);
        Object obj = 1;
        if ((a != -1 ? 1 : null) != null) {
            dbTransaction2.runAfter(new aq(this, a));
            i = i();
            storyKind = StoryKind.MY_OVERRIDDEN_PRIVACY;
            string = this.C.getString(R.string.story_my_story_name);
            akcr.a(string, str3);
            long a2 = i.a(dbTransaction2, str2, storyKind, string);
            yln.a(p(), dbTransaction, a2, "my_story_ads79sdf", this.C.getString(R.string.story_settings_privacy_friends_only), null, null, null, null, PrivacyType.FRIENDS, 2032);
            if (a2 == -1) {
                obj = null;
            }
            if (obj != null) {
                return a;
            }
            throw new IllegalStateException("Error upserting My Story w/Overridden Privacy record".toString());
        }
        throw new IllegalStateException("Error upserting My Story record".toString());
    }

    public final ajcx a() {
        return this.c.runInTransaction("StoryRepositoryClient:refreshGroupChatGroupStories", new af(this));
    }

    public final ajcx a(long j) {
        return this.c.runInTransaction("StoryRepositoryClient:deleteStorySnap", new k(this, j));
    }

    public final ajcx a(ylg ylg) {
        akcr.b(ylg, "storySnapKey");
        return this.c.runInTransaction("StoryRepositoryClient:markStorySnapAsViewed", new y(this, ylg));
    }

    public final ajdx<Long> a(afbi afbi, MessageClientStatus messageClientStatus) {
        akcr.b(afbi, "story");
        akcr.b(messageClientStatus, "clientStatus");
        return this.c.callInTransaction("StoryRepositoryClient:upsertUserStoryShareSnap", new ar(this, afbi, messageClientStatus));
    }

    public final ajdx<List<ymn>> a(List<String> list) {
        akcr.b(list, "userIds");
        Object c = ajdx.c((Callable) new x(this, list));
        akcr.a(c, "Single.fromCallable {\n  …otification() }\n        }");
        return c;
    }

    public final Long a(DbTransaction dbTransaction, aenb aenb, String str, StoryKind storyKind, String str2, MessageClientStatus messageClientStatus) {
        DbTransaction dbTransaction2 = dbTransaction;
        aenb aenb2 = aenb;
        String str3 = str;
        StoryKind storyKind2 = storyKind;
        MessageClientStatus messageClientStatus2 = messageClientStatus;
        String str4 = "tx";
        akcr.b(dbTransaction2, str4);
        akcr.b(aenb2, "pendingStorySnap");
        akcr.b(str3, "storyId");
        akcr.b(storyKind2, "storyKind");
        String str5 = "clientStatus";
        akcr.b(messageClientStatus2, str5);
        dbTransaction.checkInTransaction();
        if ((messageClientStatus2 != MessageClientStatus.OK ? 1 : null) != null) {
            StoryKind storyKind3 = storyKind2 == StoryKind.MY_OVERRIDDEN_PRIVACY ? StoryKind.MY : storyKind2;
            Long a = i().a(str3, storyKind3);
            if (a == null) {
                if (storyKind2 == StoryKind.GROUP) {
                    a = Long.valueOf(i().b(dbTransaction2, str3, storyKind3, str2));
                } else {
                    StringBuilder stringBuilder = new StringBuilder("storyRowId not found for pending story snap storyId=");
                    stringBuilder.append(str3);
                    stringBuilder.append(' ');
                    stringBuilder.append("storyKind=");
                    stringBuilder.append(storyKind3);
                    stringBuilder.append(" status=");
                    stringBuilder.append(messageClientStatus2);
                    stringBuilder.append(" storySnap=");
                    stringBuilder.append(aenb2);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            Long l = null;
            if (messageClientStatus2 == MessageClientStatus.FAILED_NON_RECOVERABLE) {
                h().a(dbTransaction2, a.longValue(), aenb2.o);
                return null;
            }
            long longValue;
            ylq h = h();
            Number number = a;
            long longValue2 = number.longValue();
            String str6 = aenb2.o;
            akcr.b(dbTransaction2, str4);
            akcr.b(messageClientStatus2, str5);
            dbTransaction.checkInTransaction();
            if (str6 == null) {
                h.c();
            } else {
                MessageClientStatus c;
                RowIdAndViewedRecord a2 = h.a(longValue2, str6);
                Long valueOf = a2 != null ? Long.valueOf(a2._id()) : null;
                if (valueOf != null) {
                    valueOf.longValue();
                    c = h.c(valueOf.longValue());
                } else {
                    c = null;
                }
                if (!(c == null || c == messageClientStatus2)) {
                    if (c != MessageClientStatus.OK) {
                        ((UpdateStatusByRowId) h.b.get()).bind(messageClientStatus2, valueOf.longValue());
                        DbClient dbClient = h.a;
                        Object obj = h.b.get();
                        akcr.a(obj, "storySnapUpdateStatusByRowId.get()");
                        if (dbClient.executeUpdateDelete((ainy) obj) > 0) {
                            l = valueOf;
                        }
                    } else if (h.b().d()) {
                        ieg.a("Please S2R to Stories: Attempted to set story snap status from posted to pending", true, 0);
                    }
                }
            }
            if (l != null) {
                longValue = l.longValue();
            } else {
                h = h();
                long longValue3 = number.longValue();
                akcr.b(aenb2, "receiver$0");
                afbi afbi = new afbi();
                afbi.a = aenb2.O;
                afbi.e = aenb2.S;
                afbi.m = aenb2.Q;
                afbi.y = Boolean.FALSE;
                afbi.b = aenb2.a;
                afbi.d = aenb2.o;
                afbi.o = Long.valueOf(ylv.a);
                longValue = ylq.a(h, dbTransaction, longValue3, afbi, false, null, messageClientStatus, null, null, null, null, null, 1984).a;
            }
            return Long.valueOf(longValue);
        }
        throw new IllegalStateException("clientStatus == OK should be handled separately with the response data when the send operation is successful".toString());
    }

    public final Collection<String> a(StoryKind storyKind) {
        akcr.b(storyKind, "storyKind");
        return m().a(storyKind);
    }

    /* JADX WARNING: Missing block: B:8:0x0053, code skipped:
            if (r2 == null) goto L_0x0055;
     */
    public final java.util.List<java.lang.Long> a(com.snap.core.db.api.DbTransaction r28, long r29, com.snap.core.db.column.StoryKind r31, java.util.List<? extends defpackage.aeug> r32, boolean r33, java.lang.Long r34) {
        /*
        r27 = this;
        r0 = r27;
        r15 = r28;
        r14 = r31;
        r1 = "tx";
        defpackage.akcr.b(r15, r1);
        r1 = "storyKind";
        defpackage.akcr.b(r14, r1);
        r1 = "storySnapLogbooks";
        r2 = r32;
        defpackage.akcr.b(r2, r1);
        r28.checkInTransaction();
        r13 = new java.util.ArrayList;
        r13.<init>();
        r1 = r27.h();
        r3 = java.lang.Long.valueOf(r29);
        r3 = defpackage.ajyl.a(r3);
        r12 = r1.a(r3);
        r16 = r32.iterator();
    L_0x0033:
        r1 = r16.hasNext();
        if (r1 == 0) goto L_0x015a;
    L_0x0039:
        r1 = r16.next();
        r11 = r1;
        r11 = (defpackage.aeug) r11;
        r10 = r11.b;
        r1 = com.snap.core.db.column.StoryKind.GROUP;
        if (r14 != r1) goto L_0x0062;
    L_0x0046:
        r1 = r10.d;
        r2 = "storySnap.clientId";
        defpackage.akcr.a(r1, r2);
        r2 = r10.F;
        if (r2 == 0) goto L_0x0055;
    L_0x0051:
        r2 = r2.c;
        if (r2 != 0) goto L_0x005c;
    L_0x0055:
        r2 = r0.k;
        if (r2 != 0) goto L_0x005c;
    L_0x0059:
        defpackage.akcr.a();
    L_0x005c:
        r1 = defpackage.ytr.d(r1, r2);
        r10.d = r1;
    L_0x0062:
        r1 = r27.h();
        r2 = r10.d;
        r8 = r29;
        r1.a(r15, r8, r2);
        r1 = "storySnap";
        defpackage.akcr.a(r10, r1);
        r1 = r0.a(r10, r14);
        if (r1 == 0) goto L_0x0150;
    L_0x0078:
        r1 = java.lang.Long.valueOf(r29);
        r1 = r12.get(r1);
        r1 = (java.util.Map) r1;
        r2 = 0;
        if (r1 == 0) goto L_0x008e;
    L_0x0085:
        r3 = r10.d;
        r1 = r1.get(r3);
        r1 = (com.snap.core.db.record.StorySnapRecord.SelectLocallyPersistedPostedFieldsRecord) r1;
        goto L_0x008f;
    L_0x008e:
        r1 = r2;
    L_0x008f:
        r3 = r27.h();
        if (r1 == 0) goto L_0x009a;
    L_0x0095:
        r4 = r1.viewed();
        goto L_0x009b;
    L_0x009a:
        r4 = r2;
    L_0x009b:
        r5 = java.lang.Boolean.TRUE;
        r6 = defpackage.akcr.a(r4, r5);
        r7 = 0;
        r17 = com.snap.core.db.column.MessageClientStatus.OK;
        r5 = r11.d;
        r4 = r11.e;
        r18 = 0;
        r19 = java.lang.Boolean.valueOf(r33);
        if (r34 != 0) goto L_0x00bc;
    L_0x00b0:
        if (r1 == 0) goto L_0x00b9;
    L_0x00b2:
        r1 = r1.postedTimestamp();
        r20 = r1;
        goto L_0x00be;
    L_0x00b9:
        r20 = r2;
        goto L_0x00be;
    L_0x00bc:
        r20 = r34;
    L_0x00be:
        r21 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r1 = r3;
        r2 = r28;
        r22 = r4;
        r3 = r29;
        r23 = r5;
        r5 = r10;
        r8 = r17;
        r9 = r23;
        r24 = r10;
        r10 = r22;
        r25 = r11;
        r11 = r18;
        r17 = r12;
        r12 = r19;
        r26 = r13;
        r13 = r20;
        r14 = r21;
        r1 = defpackage.ylq.a(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
        r8 = r1.a;
        r1 = -1;
        r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1));
        if (r3 == 0) goto L_0x014d;
    L_0x00ec:
        r1 = r25;
        r2 = r1 instanceof defpackage.afbs;
        if (r2 == 0) goto L_0x0143;
    L_0x00f2:
        r11 = r1;
        r11 = (defpackage.afbs) r11;
        r2 = r11.i;
        r1 = r2;
        r1 = (java.util.Collection) r1;
        r10 = 0;
        r12 = 1;
        if (r1 == 0) goto L_0x0107;
    L_0x00fe:
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0105;
    L_0x0104:
        goto L_0x0107;
    L_0x0105:
        r1 = 0;
        goto L_0x0108;
    L_0x0107:
        r1 = 1;
    L_0x0108:
        r13 = "storySnap.id";
        if (r1 != 0) goto L_0x0120;
    L_0x010c:
        r1 = r27.l();
        r14 = r24;
        r3 = r14.a;
        defpackage.akcr.a(r3, r13);
        r6 = com.snap.core.db.column.StoryNoteType.FRIEND_STORY_NOTE;
        r4 = r8;
        r7 = r28;
        r1.a(r2, r3, r4, r6, r7);
        goto L_0x0122;
    L_0x0120:
        r14 = r24;
    L_0x0122:
        r2 = r11.j;
        r1 = r2;
        r1 = (java.util.Collection) r1;
        if (r1 == 0) goto L_0x012f;
    L_0x0129:
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0130;
    L_0x012f:
        r10 = 1;
    L_0x0130:
        if (r10 != 0) goto L_0x0143;
    L_0x0132:
        r1 = r27.l();
        r3 = r14.a;
        defpackage.akcr.a(r3, r13);
        r6 = com.snap.core.db.column.StoryNoteType.OTHER_STORY_NOTE;
        r4 = r8;
        r7 = r28;
        r1.a(r2, r3, r4, r6, r7);
    L_0x0143:
        r1 = java.lang.Long.valueOf(r8);
        r2 = r26;
        r2.add(r1);
        goto L_0x0153;
    L_0x014d:
        r2 = r26;
        goto L_0x0153;
    L_0x0150:
        r17 = r12;
        r2 = r13;
    L_0x0153:
        r14 = r31;
        r13 = r2;
        r12 = r17;
        goto L_0x0033;
    L_0x015a:
        r2 = r13;
        r13 = r2;
        r13 = (java.util.List) r13;
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yip.a(com.snap.core.db.api.DbTransaction, long, com.snap.core.db.column.StoryKind, java.util.List, boolean, java.lang.Long):java.util.List");
    }

    public final List<String> a(DbTransaction dbTransaction, List<Long> list) {
        akcr.b(dbTransaction, "tx");
        akcr.b(list, "storySnapRowIds");
        dbTransaction.checkInTransaction();
        if (!list.isEmpty()) {
            List a = ymf.a(list, new p(this));
            if (!a.isEmpty()) {
                Iterable<SelectSnapDataForDeletionModel> iterable = a;
                Collection arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (true) {
                    int i = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((SelectSnapDataForDeletionModel) next).clientStatus() == MessageClientStatus.OK) {
                        i = 0;
                    }
                    if (i != 0) {
                        arrayList.add(next);
                    }
                }
                Iterable<SelectSnapDataForDeletionModel> iterable2 = (List) arrayList;
                Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable2, 10));
                for (SelectSnapDataForDeletionModel snapId : iterable2) {
                    arrayList2.add(snapId.snapId());
                }
                b((List) arrayList2);
                ymf.b(list, new m(this));
                ymf.b(list, new n(this, dbTransaction));
                ylq h = h();
                arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (SelectSnapDataForDeletionModel snapId2 : iterable) {
                    arrayList.add(Long.valueOf(snapId2.snapRowId()));
                }
                Set c = h.c((List) arrayList);
                if ((c.isEmpty() ^ 1) != 0) {
                    ymf.b(ajyu.k(c), new o(this, dbTransaction));
                }
                Collection arrayList3 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (SelectSnapDataForDeletionModel storyRowId : iterable) {
                    arrayList3.add(Long.valueOf(storyRowId.storyRowId()));
                }
                for (Number longValue : ajyu.o((List) arrayList3)) {
                    i().b(dbTransaction, longValue.longValue());
                }
                Collection arrayList4 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (SelectSnapDataForDeletionModel snapId3 : iterable) {
                    arrayList4.add(snapId3.snapId());
                }
                return (List) arrayList4;
            }
        }
        return ajyw.a;
    }

    public final void a(aecy aecy, DbTransaction dbTransaction) {
        akcr.b(aecy, "allUpdatesResponse");
        akcr.b(dbTransaction, "tx");
        afeq afeq = aecy.c;
        if (afeq != null) {
            a(afeq, dbTransaction);
            aemz aemz = aecy.d;
            String str = afeq.O;
            if (aemz != null) {
                CharSequence charSequence = str;
                Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
                if (obj != null) {
                    r().b().a((fth) yiz.MY_STORY_PRIVACY, (Enum) PrivacyType.FRIENDS).b();
                } else if (akcr.a(aemz.c, b.FULL.a())) {
                    Collection arrayList;
                    List list = aemz.a;
                    if (str == null) {
                        akcr.a();
                    }
                    if (list != null) {
                        Collection arrayList2 = new ArrayList();
                        for (Object next : list) {
                            if (akcr.a(((aelf) next).j, Boolean.FALSE)) {
                                arrayList2.add(next);
                            }
                        }
                        Iterable<aelf> iterable = (List) arrayList2;
                        arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                        for (aelf aelf : iterable) {
                            Object obj2 = aelf.b;
                            akcr.a(obj2, "it.userId");
                            Object obj3 = aelf.a;
                            akcr.a(obj3, "it.name");
                            arrayList.add(new yiw(obj2, obj3, aelf.d));
                        }
                    } else {
                        arrayList = ajyw.a;
                    }
                    r().b().a((fth) yiz.MY_STORY_PRIVACY, (Enum) PrivacyType.valueOf(str)).b(yiz.MY_STORY_PRIVACY_CUSTOM_USER_BLACKLIST, (List) arrayList).b();
                }
            }
        }
    }

    public final void a(afeq afeq, DbTransaction dbTransaction) {
        akcr.b(afeq, "updatesResponse");
        akcr.b(dbTransaction, "tx");
        dbTransaction.checkInTransaction();
        Preconditions.checkNotNull(afeq);
        List list = afeq.bn;
        if (list != null) {
            b(dbTransaction, list);
        }
    }

    public final void a(DbTransaction dbTransaction) {
        akcr.b(dbTransaction, "tx");
        dbTransaction.checkInTransaction();
        List a = h().a(f().a());
        if ((a.isEmpty() ^ 1) != 0) {
            a(dbTransaction, a);
        }
    }

    public final void a(DbTransaction dbTransaction, agdu agdu, String str) {
        akcr.b(dbTransaction, "tx");
        akcr.b(agdu, "mobStory");
        j().a(dbTransaction, agdu, str);
        n().a(dbTransaction, agdu);
    }

    public final void a(DbTransaction dbTransaction, StoryKind storyKind, String str) {
        akcr.b(dbTransaction, "tx");
        akcr.b(storyKind, "storyKind");
        akcr.b(str, "id");
        Long a = i().a(str, storyKind);
        if (a != null) {
            a(dbTransaction, a.longValue(), storyKind);
        }
    }

    public final void a(DbTransaction dbTransaction, StoryKind storyKind, String str, String str2, String str3, String str4) {
        DbTransaction dbTransaction2 = dbTransaction;
        StoryKind storyKind2 = storyKind;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = "tx";
        akcr.b(dbTransaction2, str8);
        String str9 = "storyKind";
        akcr.b(storyKind2, str9);
        akcr.b(str5, "id");
        String str10 = "username";
        akcr.b(str6, str10);
        String str11 = "displayName";
        akcr.b(str7, str11);
        akcr.b(str4, "thumbnailUrl");
        ylo m = m();
        akcr.b(dbTransaction2, str8);
        akcr.b(storyKind2, str9);
        akcr.b(str5, "storyId");
        akcr.b(str6, str10);
        akcr.b(str7, str11);
        dbTransaction.checkInTransaction();
        long a = m.a(dbTransaction2, str5, storyKind2);
        if (a == -1) {
            a = ylo.a(m, dbTransaction, str, storyKind, str2, str3, null, null, null, null, true, 480);
        }
        yln.a((yln) m.b.get(), dbTransaction, a, str, null, null, null, null, str4, null, 3064);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x008f in {12, 13, 14, 17, 18, 21, 23, 25} preds:[]
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
    public final void a(com.snap.core.db.api.DbTransaction r9, java.lang.String r10, com.snap.core.db.column.StoryKind r11, java.lang.String r12, java.util.List<? extends defpackage.aeug> r13, boolean r14, java.lang.Long r15) {
        /*
        r8 = this;
        r0 = "tx";
        defpackage.akcr.b(r9, r0);
        r0 = "storyId";
        defpackage.akcr.b(r10, r0);
        r0 = "storyKind";
        defpackage.akcr.b(r11, r0);
        r0 = "postedStorySnaps";
        defpackage.akcr.b(r13, r0);
        r9.checkInTransaction();
        r0 = r13;
        r0 = (java.util.Collection) r0;
        r0 = r0.isEmpty();
        r1 = 1;
        r0 = r0 ^ r1;
        if (r0 == 0) goto L_0x0081;
        r0 = defpackage.yiq.a;
        r2 = r11.ordinal();
        r0 = r0[r2];
        if (r0 == r1) goto L_0x0047;
        r1 = 2;
        if (r0 == r1) goto L_0x0047;
        r1 = 3;
        if (r0 == r1) goto L_0x003a;
        r1 = 4;
        if (r0 == r1) goto L_0x003a;
        r1 = 5;
        if (r0 == r1) goto L_0x003a;
        r12 = 0;
        goto L_0x0053;
        r0 = r8.i();
        r0 = r0.b(r9, r10, r11, r12);
        r12 = java.lang.Long.valueOf(r0);
        goto L_0x0053;
        r12 = r8.k;
        if (r12 != 0) goto L_0x004e;
        defpackage.akcr.a();
        r0 = r8.a(r9, r12);
        goto L_0x0042;
        if (r12 == 0) goto L_0x0063;
        r2 = r12.longValue();
        r0 = r8;
        r1 = r9;
        r4 = r11;
        r5 = r13;
        r6 = r14;
        r7 = r15;
        r0.a(r1, r2, r4, r5, r6, r7);
        return;
        r9 = new java.lang.IllegalArgumentException;
        r12 = new java.lang.StringBuilder;
        r13 = "ensurePostedStory() cannot be performed for storyId=";
        r12.<init>(r13);
        r12.append(r10);
        r10 = " storyKind=";
        r12.append(r10);
        r12.append(r11);
        r10 = r12.toString();
        r9.<init>(r10);
        r9 = (java.lang.Throwable) r9;
        throw r9;
        r9 = new java.lang.IllegalStateException;
        r10 = "Error inserting posted story snaps, empty data list";
        r10 = r10.toString();
        r9.<init>(r10);
        r9 = (java.lang.Throwable) r9;
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yip.a(com.snap.core.db.api.DbTransaction, java.lang.String, com.snap.core.db.column.StoryKind, java.lang.String, java.util.List, boolean, java.lang.Long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:57:0x0119 in {9, 15, 24, 25, 30, 31, 34, 36, 39, 43, 45, 47, 49, 51, 53, 55, 56} preds:[]
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
    public final void a(com.snap.core.db.api.DbTransaction r19, java.util.List<? extends defpackage.aeml> r20, java.util.Map<java.lang.String, ? extends defpackage.ahaz> r21, java.lang.String r22) {
        /*
        r18 = this;
        r0 = r19;
        r7 = r21;
        r1 = "tx";
        defpackage.akcr.b(r0, r1);
        r1 = "friendStories";
        r2 = r20;
        defpackage.akcr.b(r2, r1);
        r1 = "mobIdToMischiefMap";
        defpackage.akcr.b(r7, r1);
        r19.checkInTransaction();	 Catch:{ all -> 0x0115 }
        r8 = r20.iterator();	 Catch:{ all -> 0x0115 }
        r1 = r8.hasNext();	 Catch:{ all -> 0x0115 }
        if (r1 == 0) goto L_0x0112;	 Catch:{ all -> 0x0115 }
        r1 = r8.next();	 Catch:{ all -> 0x0115 }
        r5 = r1;	 Catch:{ all -> 0x0115 }
        r5 = (defpackage.aeml) r5;	 Catch:{ all -> 0x0115 }
        r1 = r5.p;	 Catch:{ all -> 0x0115 }
        r2 = "story.type";	 Catch:{ all -> 0x0115 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0115 }
        r1 = r5.a();	 Catch:{ all -> 0x010c }
        if (r1 != 0) goto L_0x0037;	 Catch:{ all -> 0x010c }
        goto L_0x001c;	 Catch:{ all -> 0x010c }
        r2 = defpackage.yiq.b;	 Catch:{ all -> 0x010c }
        r1 = r1.ordinal();	 Catch:{ all -> 0x010c }
        r1 = r2[r1];	 Catch:{ all -> 0x010c }
        r2 = 1;
        r3 = -1;
        r6 = "story.username";
        if (r1 == r2) goto L_0x00c6;
        r2 = 2;
        if (r1 == r2) goto L_0x004c;
        r9 = r18;
        goto L_0x001c;
        r1 = r5.a;	 Catch:{ all -> 0x010c }
        r1 = r7.get(r1);	 Catch:{ all -> 0x010c }
        r1 = (defpackage.ahaz) r1;	 Catch:{ all -> 0x010c }
        r2 = r5.b;	 Catch:{ all -> 0x010c }
        r9 = "story.stories";	 Catch:{ all -> 0x010c }
        defpackage.akcr.a(r2, r9);	 Catch:{ all -> 0x010c }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x010c }
        r2 = r2.iterator();	 Catch:{ all -> 0x010c }
        r9 = r2.hasNext();	 Catch:{ all -> 0x010c }
        if (r9 == 0) goto L_0x0097;	 Catch:{ all -> 0x010c }
        r9 = r2.next();	 Catch:{ all -> 0x010c }
        r9 = (defpackage.aemn) r9;	 Catch:{ all -> 0x010c }
        r10 = r9.a;	 Catch:{ all -> 0x010c }
        r11 = r9.a;	 Catch:{ all -> 0x010c }
        r11 = r11.d;	 Catch:{ all -> 0x010c }
        r12 = "it.story.clientId";	 Catch:{ all -> 0x010c }
        defpackage.akcr.a(r11, r12);	 Catch:{ all -> 0x010c }
        r9 = r9.a;	 Catch:{ all -> 0x010c }
        r9 = r9.F;	 Catch:{ all -> 0x010c }
        if (r9 == 0) goto L_0x0087;	 Catch:{ all -> 0x010c }
        r9 = r9.c;	 Catch:{ all -> 0x010c }
        if (r9 != 0) goto L_0x0083;
        goto L_0x0087;
        r12 = r9;
        r9 = r18;
        goto L_0x0090;
        r9 = r18;
        r12 = r9.k;	 Catch:{ all -> 0x010a }
        if (r12 != 0) goto L_0x0090;	 Catch:{ all -> 0x010a }
        defpackage.akcr.a();	 Catch:{ all -> 0x010a }
        r11 = defpackage.ytr.d(r11, r12);	 Catch:{ all -> 0x010a }
        r10.d = r11;	 Catch:{ all -> 0x010a }
        goto L_0x0061;	 Catch:{ all -> 0x010a }
        r9 = r18;	 Catch:{ all -> 0x010a }
        if (r1 == 0) goto L_0x00a5;	 Catch:{ all -> 0x010a }
        r2 = r18.i();	 Catch:{ all -> 0x010a }
        r1 = r2.a(r0, r1);	 Catch:{ all -> 0x010a }
        r10 = r1;	 Catch:{ all -> 0x010a }
        goto L_0x00b6;	 Catch:{ all -> 0x010a }
        r1 = r18.i();	 Catch:{ all -> 0x010a }
        r2 = r5.a;	 Catch:{ all -> 0x010a }
        defpackage.akcr.a(r2, r6);	 Catch:{ all -> 0x010a }
        r6 = com.snap.core.db.column.StoryKind.GROUP;	 Catch:{ all -> 0x010a }
        r10 = 0;	 Catch:{ all -> 0x010a }
        r1 = r1.b(r0, r2, r6, r10);	 Catch:{ all -> 0x010a }
        goto L_0x00a3;	 Catch:{ all -> 0x010a }
        r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));	 Catch:{ all -> 0x010a }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x010a }
        r1 = r18;	 Catch:{ all -> 0x010a }
        r2 = r19;	 Catch:{ all -> 0x010a }
        r3 = r10;	 Catch:{ all -> 0x010a }
        r6 = r22;	 Catch:{ all -> 0x010a }
        r1.a(r2, r3, r5, r6);	 Catch:{ all -> 0x010a }
        goto L_0x001c;	 Catch:{ all -> 0x010a }
        r9 = r18;	 Catch:{ all -> 0x010a }
        r1 = r18.q();	 Catch:{ all -> 0x010a }
        r2 = r5.a;	 Catch:{ all -> 0x010a }
        defpackage.akcr.a(r2, r6);	 Catch:{ all -> 0x010a }
        r10 = r1.f(r2);	 Catch:{ all -> 0x010a }
        r12 = r18.o();	 Catch:{ all -> 0x010a }
        r13 = r5.a;	 Catch:{ all -> 0x010a }
        defpackage.akcr.a(r13, r6);	 Catch:{ all -> 0x010a }
        r14 = 0;	 Catch:{ all -> 0x010a }
        r15 = 0;	 Catch:{ all -> 0x010a }
        r16 = 1;	 Catch:{ all -> 0x010a }
        r17 = 6;	 Catch:{ all -> 0x010a }
        defpackage.quk.a(r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x010a }
        r1 = r18.i();	 Catch:{ all -> 0x010a }
        r12 = r1.a(r0, r5);	 Catch:{ all -> 0x010a }
        r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1));	 Catch:{ all -> 0x010a }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x010a }
        r1 = r18;	 Catch:{ all -> 0x010a }
        r2 = r19;	 Catch:{ all -> 0x010a }
        r3 = r12;	 Catch:{ all -> 0x010a }
        r6 = r22;	 Catch:{ all -> 0x010a }
        r1.a(r2, r3, r5, r6);	 Catch:{ all -> 0x010a }
        r1 = r18.i();	 Catch:{ all -> 0x010a }
        r2 = r19;	 Catch:{ all -> 0x010a }
        r3 = r12;	 Catch:{ all -> 0x010a }
        r5 = r10;	 Catch:{ all -> 0x010a }
        r1.a(r2, r3, r5);	 Catch:{ all -> 0x010a }
        goto L_0x001c;
        r0 = move-exception;
        goto L_0x010f;
        r0 = move-exception;
        r9 = r18;
        throw r0;	 Catch:{ all -> 0x0110 }
        r0 = move-exception;
        goto L_0x0118;
        r9 = r18;
        return;
        r0 = move-exception;
        r9 = r18;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yip.a(com.snap.core.db.api.DbTransaction, java.util.List, java.util.Map, java.lang.String):void");
    }

    public final void a(DbTransaction dbTransaction, alrb[] alrbArr) {
        DbTransaction dbTransaction2 = dbTransaction;
        Object obj = alrbArr;
        String str = "tx";
        akcr.b(dbTransaction2, str);
        akcr.b(obj, "ourStoryAuths");
        HashSet hashSet = new HashSet();
        int length = obj.length;
        int i = 0;
        while (i < length) {
            String str2;
            int i2;
            int i3;
            long a;
            ylm ylm;
            alrb alrb = obj[i];
            hashSet.add(alrb.b());
            ylo m = m();
            String b = alrb.b();
            akcr.a((Object) b, "ourStory.storyId");
            Object c = alrb.c();
            akcr.a(c, "ourStory.displayName");
            akcr.b(dbTransaction2, str);
            akcr.b(b, "storyId");
            akcr.b(c, "displayName");
            dbTransaction.checkInTransaction();
            dbTransaction.checkInTransaction();
            long a2 = m.a(dbTransaction2, b, StoryKind.OUR);
            if (a2 == -1) {
                str2 = b;
                ylo ylo = m;
                i2 = i;
                i3 = length;
                a = ylo.a(m, dbTransaction, b, StoryKind.OUR, null, c, Boolean.TRUE, null, null, null, true, 448);
                ylm = ylo;
            } else {
                str2 = b;
                i2 = i;
                i3 = length;
                a = a2;
                ylm = m;
            }
            yln.a((yln) ylm.b.get(), dbTransaction, a, str2, null, null, null, null, null, null, 4088);
            i = i2 + 1;
            length = i3;
        }
        a(dbTransaction2, (Set) hashSet, StoryKind.OUR);
    }

    public final ajej b() {
        ajei ajei = new ajei();
        Object obj = (Set) this.A.b();
        akcr.a(obj, "externalStorySources");
        for (yhv a : (Iterable) obj) {
            ajei.a(a.a(this));
        }
        return ajei;
    }

    public final ajdx<a> c() {
        yif k = k();
        String str = "";
        return k.a.queryAndMapToOneOrDefault(k.b, yif.b.a, new a(str, str));
    }

    public final ajdp<Boolean> d() {
        Object f = ajpy.k(this.g).a().f();
        akcr.a(f, "storySyncEventPublisher.share().hide()");
        return f;
    }

    public final gpu e() {
        return (gpu) this.m.b();
    }

    /* Access modifiers changed, original: final */
    public final ihh f() {
        return (ihh) this.n.b();
    }

    /* Access modifiers changed, original: final */
    public final SnapDb g() {
        return (SnapDb) this.o.b();
    }

    /* Access modifiers changed, original: final */
    public final ylq h() {
        return (ylq) this.p.b();
    }

    /* Access modifiers changed, original: final */
    public final ylo i() {
        return (ylo) this.q.b();
    }

    /* Access modifiers changed, original: final */
    public final ylj j() {
        return (ylj) this.r.b();
    }

    /* Access modifiers changed, original: final */
    public final yif k() {
        return (yif) this.s.b();
    }

    /* Access modifiers changed, original: final */
    public final ylp l() {
        return (ylp) this.t.b();
    }

    public final ylm m() {
        return (ylm) this.v.b();
    }

    /* Access modifiers changed, original: final */
    public final yll n() {
        return (yll) this.w.b();
    }

    /* Access modifiers changed, original: final */
    public final quk o() {
        return (quk) this.y.b();
    }
}
