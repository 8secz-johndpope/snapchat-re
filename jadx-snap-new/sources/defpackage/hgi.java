package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.query.LegacyDiscoverFeedQueries;
import com.snap.core.db.query.LegacyDiscoverFeedQueries.SnapDbFriendStory;
import com.snap.core.db.record.StoryRecord;
import defpackage.ihx.a;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hgi */
public final class hgi {
    final ajxe a;
    final ajei b;
    final AtomicBoolean c = new AtomicBoolean(false);
    AtomicBoolean d = new AtomicBoolean(false);
    final ajwl<List<SnapDbFriendStory>> e;
    final AtomicBoolean f;
    Long g;
    boolean h;
    ajwy<hhb> i;
    final gpb j;
    final ajwy<ftl> k;
    private final ajxe l;
    private final ajxe m;
    private final ajxe n;
    private final ajxe o;
    private final HashMap<a, Integer> p = new HashMap();
    private final vdj q;

    /* renamed from: hgi$b */
    static final class b extends akcq implements akbk<ihh> {
        b(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: hgi$r */
    static final class r extends akcq implements akbk<zfw> {
        r(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (zfw) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: hgi$u */
    static final class u extends akcq implements akbk<yid> {
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
            return (yid) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hgi$q */
    static final class q extends akcq implements akbk<hno> {
        q(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (hno) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: hgi$p */
    static final class p extends akcq implements akbl<Cursor, Long> {
        p(ainw ainw) {
            super(1, ainw);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(ainw.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (Long) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: hgi$s */
    static final class s extends akcs implements akbk<DbClient> {
        private /* synthetic */ aipn a;

        s(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.get()).getDbClient((ide) yhy.j);
        }
    }

    /* renamed from: hgi$o */
    static final class o<T, R> implements ajfc<T, R> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return (((Collection) list).isEmpty() ^ 1) != 0 ? (Long) list.get(0) : Long.valueOf(0);
        }
    }

    /* renamed from: hgi$a */
    static final class a {
        final long a;
        final String b;

        public a(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.a == aVar.a ? 1 : null) == null || !akcr.a(this.b, aVar.b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Story(storyRowId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", firstUnviewedSnapId=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: hgi$t */
    public static final class t<T> implements Comparator<T> {
        private /* synthetic */ Map a;

        public t(Map map) {
            this.a = map;
        }

        public final int compare(T t, T t2) {
            Object obj;
            Integer num;
            Object obj2;
            SnapDbFriendStory snapDbFriendStory = (SnapDbFriendStory) t;
            Iterator it = this.a.entrySet().iterator();
            do {
                num = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((a) ((Entry) obj2).getKey()).a == snapDbFriendStory._id()) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
            } while (obj == null);
            Entry entry = (Entry) obj2;
            Comparable comparable = entry != null ? (Integer) entry.getValue() : null;
            SnapDbFriendStory snapDbFriendStory2 = (SnapDbFriendStory) t2;
            for (Object obj22 : this.a.entrySet()) {
                if (((a) ((Entry) obj22).getKey()).a == snapDbFriendStory2._id()) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    break;
                }
            }
            obj22 = null;
            entry = (Entry) obj22;
            if (entry != null) {
                num = (Integer) entry.getValue();
            }
            return ajzy.a(comparable, num);
        }
    }

    /* renamed from: hgi$c */
    static final class c<T> implements a<T> {
        private /* synthetic */ hgi a;
        private /* synthetic */ List b;

        c(hgi hgi, List list) {
            this.a = hgi;
            this.b = list;
        }

        public final /* synthetic */ Object initialize() {
            return Boolean.valueOf(((ftl) this.a.k.get()).a((fth) gvt.ENABLE_PRIVATE_STORY_SHOWS_FRIEND_DISPLAY_NAME));
        }
    }

    /* renamed from: hgi$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ hgi a;

        d(hgi hgi) {
            this.a = hgi;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0049 in {7, 10, 11, 14, 16, 18} preds:[]
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
        private java.util.List<com.snap.core.db.query.LegacyDiscoverFeedQueries.SnapDbFriendStory> a(java.util.List<? extends com.snap.core.db.query.LegacyDiscoverFeedQueries.SnapDbFriendStory> r10) {
            /*
            r9 = this;
            r0 = "it";
            defpackage.akcr.b(r10, r0);
            r10 = (java.lang.Iterable) r10;	 Catch:{ all -> 0x0047 }
            r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0047 }
            r0.<init>();	 Catch:{ all -> 0x0047 }
            r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0047 }
            r10 = r10.iterator();	 Catch:{ all -> 0x0047 }
            r1 = r10.hasNext();	 Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0044;	 Catch:{ all -> 0x0047 }
            r1 = r10.next();	 Catch:{ all -> 0x0047 }
            r2 = r1;	 Catch:{ all -> 0x0047 }
            r2 = (com.snap.core.db.query.LegacyDiscoverFeedQueries.SnapDbFriendStory) r2;	 Catch:{ all -> 0x0047 }
            r3 = r9.a;	 Catch:{ all -> 0x0047 }
            r3 = r3.b();	 Catch:{ all -> 0x0047 }
            r3 = r3.c();	 Catch:{ all -> 0x0047 }
            r2 = r2.storyLatestExpirationTimestamp();	 Catch:{ all -> 0x0047 }
            r5 = 1;	 Catch:{ all -> 0x0047 }
            r6 = 0;	 Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x0032;	 Catch:{ all -> 0x0047 }
            goto L_0x003c;	 Catch:{ all -> 0x0047 }
            r7 = r2.longValue();	 Catch:{ all -> 0x0047 }
            r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));	 Catch:{ all -> 0x0047 }
            if (r2 <= 0) goto L_0x003b;	 Catch:{ all -> 0x0047 }
            goto L_0x003c;	 Catch:{ all -> 0x0047 }
            r6 = 1;	 Catch:{ all -> 0x0047 }
            r2 = r6 ^ 1;	 Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0012;	 Catch:{ all -> 0x0047 }
            r0.add(r1);	 Catch:{ all -> 0x0047 }
            goto L_0x0012;	 Catch:{ all -> 0x0047 }
            r0 = (java.util.List) r0;	 Catch:{ all -> 0x0047 }
            return r0;
            r10 = move-exception;
            throw r10;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hgi$d.a(java.util.List):java.util.List");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((List) obj);
        }
    }

    /* renamed from: hgi$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ hgi a;

        e(hgi hgi) {
            this.a = hgi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return this.a.b(list);
        }
    }

    /* renamed from: hgi$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ hgi a;

        f(hgi hgi) {
            this.a = hgi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return this.a.a(list);
        }
    }

    /* renamed from: hgi$h */
    static final class h<T> implements ajfb<ajej> {
        final /* synthetic */ hgi a;

        /* renamed from: hgi$h$1 */
        static final class 1<T> implements ajfl<abkq> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                abkq abkq = (abkq) obj;
                akcr.b(abkq, "it");
                CharSequence charSequence = abkq.b;
                obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
                return obj == null;
            }
        }

        /* renamed from: hgi$h$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                abkq abkq = (abkq) obj;
                akcr.b(abkq, "it");
                String str = abkq.b;
                if (str == null) {
                    akcr.a();
                }
                return str;
            }
        }

        /* renamed from: hgi$h$3 */
        static final class 3<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ h a;

            3(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                String str = (String) obj;
                akcr.b(str, "it");
                hgi hgi = this.a.a;
                obj = LegacyDiscoverFeedQueries.FACTORY.selectLatestFriendStoriesForDiscoverFeed(StoryRecord.FACTORY, Long.valueOf(hgi.b().a()), str, GroupStoryType.values());
                akcr.a(obj, "LegacyDiscoverFeedQuerie… GroupStoryType.values())");
                obj = hgi.a().queryAndMapToList("df:latestWithStories", obj, new m(LegacyDiscoverFeedQueries.FRIENDS_STORIES_FOR_DISCOVER_FEED_MAPPER)).b((ajdw) hgi.c().i());
                akcr.a(obj, "snapDb\n                 …eOn(schedulers.queries())");
                return obj;
            }
        }

        /* renamed from: hgi$h$4 */
        static final class 4<T, R> implements ajfc<T, R> {
            private /* synthetic */ h a;

            4(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return ((hhb) this.a.a.i.get()).a(list);
            }
        }

        /* renamed from: hgi$h$6 */
        static final class 6<T> implements ajfb<Throwable> {
            public static final 6 a = new 6();

            6() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        h(hgi hgi) {
            this.a = hgi;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (!this.a.c.getAndSet(true)) {
                hgi hgi = this.a;
                hgi.g = Long.valueOf(hgi.b().c());
                ajej a = this.a.j.c().a((ajfl) 1.a).c(1).p(2.a).k((ajfc) new 3(this)).p(new 4(this)).a((ajfb) new hgk(new akbl<List<? extends SnapDbFriendStory>, ajxw>(this.a.e) {
                    public final String getName() {
                        return "onNext";
                    }

                    public final akej getOwner() {
                        return akde.a(ajwl.class);
                    }

                    public final String getSignature() {
                        return "onNext(Ljava/lang/Object;)V";
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        obj = (List) obj;
                        akcr.b(obj, "p1");
                        ((ajwl) this.receiver).a(obj);
                        return ajxw.a;
                    }
                }), (ajfb) 6.a);
                akcr.a((Object) a, "userAuthStore.observeUse…                       })");
                ajvv.a(a, this.a.b);
            }
        }
    }

    /* renamed from: hgi$i */
    static final class i<T1, T2, R> implements ajex<List<? extends hjx>, Boolean, ajxm<? extends List<? extends hjx>, ? extends Boolean>> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            List list = (List) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            akcr.b(list, "stories");
            return new ajxm(list, Boolean.valueOf(booleanValue));
        }
    }

    /* renamed from: hgi$j */
    static final class j<T> implements ajfl<ajxm<? extends List<? extends hjx>, ? extends Boolean>> {
        public static final j a = new j();

        j() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return (((Collection) ajxm.a).isEmpty() ^ 1) != 0 || ((Boolean) ajxm.b).booleanValue();
        }
    }

    /* renamed from: hgi$k */
    static final class k<T> implements ajfb<ajxm<? extends List<? extends hjx>, ? extends Boolean>> {
        private /* synthetic */ hgi a;

        k(hgi hgi) {
            this.a = hgi;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            hgi hgi = this.a;
            boolean booleanValue = ((Boolean) ajxm.b).booleanValue();
            ((List) ajxm.a).size();
            if (!hgi.f.getAndSet(true)) {
                int i = booleanValue ^ 1;
                hno hno = (hno) hgi.a.b();
                hno.a aVar = hno.a.FRIENDS;
                Long l = hgi.g;
                if (l == null) {
                    akcr.a();
                }
                hno.a(aVar, i, l.longValue(), hgi.b().c());
            }
        }
    }

    /* renamed from: hgi$l */
    static final class l<T, R> implements ajfc<T, R> {
        public static final l a = new l();

        l() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return (List) ajxm.a;
        }
    }

    /* renamed from: hgi$g */
    static final class g extends akcq implements akbw<List<? extends hjx>, List<? extends hjx>, Boolean> {
        g(hgi hgi) {
            super(2, hgi);
        }

        public final String getName() {
            return "isNotDistinct";
        }

        public final akej getOwner() {
            return akde.a(hgi.class);
        }

        public final String getSignature() {
            return "isNotDistinct(Ljava/util/List;Ljava/util/List;)Z";
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            /*
            r6 = this;
            r7 = (java.util.List) r7;
            r8 = (java.util.List) r8;
            r0 = r6.receiver;
            r0 = (defpackage.hgi) r0;
            r0 = r0.d;
            r1 = 0;
            r0 = r0.getAndSet(r1);
            r2 = 1;
            if (r0 != 0) goto L_0x0052;
        L_0x0012:
            if (r7 != 0) goto L_0x0016;
        L_0x0014:
            if (r8 == 0) goto L_0x004c;
        L_0x0016:
            if (r7 == 0) goto L_0x004e;
        L_0x0018:
            if (r8 != 0) goto L_0x001b;
        L_0x001a:
            goto L_0x004e;
        L_0x001b:
            r0 = r7.size();
            r3 = r8.size();
            if (r0 == r3) goto L_0x0026;
        L_0x0025:
            goto L_0x004e;
        L_0x0026:
            r0 = r7.size();
            r3 = 0;
        L_0x002b:
            if (r3 >= r0) goto L_0x004c;
        L_0x002d:
            r4 = r7.get(r3);
            r4 = (defpackage.hjx) r4;
            r4 = r4.a();
            r5 = r8.get(r3);
            r5 = (defpackage.hjx) r5;
            r5 = r5.a();
            r4 = defpackage.akcr.a(r4, r5);
            r4 = r4 ^ r2;
            if (r4 == 0) goto L_0x0049;
        L_0x0048:
            goto L_0x004e;
        L_0x0049:
            r3 = r3 + 1;
            goto L_0x002b;
        L_0x004c:
            r7 = 0;
            goto L_0x004f;
        L_0x004e:
            r7 = 1;
        L_0x004f:
            if (r7 != 0) goto L_0x0052;
        L_0x0051:
            r1 = 1;
        L_0x0052:
            r7 = java.lang.Boolean.valueOf(r1);
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hgi$g.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: hgi$m */
    static final class m extends akcq implements akbl<Cursor, SnapDbFriendStory> {
        m(ainw ainw) {
            super(1, ainw);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(ainw.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (SnapDbFriendStory) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: hgi$n */
    static final class n extends akcq implements akbl<Cursor, Long> {
        n(ainw ainw) {
            super(1, ainw);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(ainw.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (Long) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hgi.class), "snapDb", "getSnapDb()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(hgi.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(hgi.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(hgi.class), "storyRepository", "getStoryRepository()Lcom/snap/stories/api/StoryRepository;"), new akdc(akde.a(hgi.class), "perfAnalytics", "getPerfAnalytics()Lcom/snap/discoverfeed/shared/analytics/DiscoverFeedPerformanceAnalytics;")};
    }

    public hgi(aipn<SnapDb> aipn, aipn<ihh> aipn2, ajwy<yid> ajwy, aipn<zfw> aipn3, aipn<hno> aipn4, ajwy<hhb> ajwy2, gpu gpu, vdj vdj, gpb gpb, ajwy<ftl> ajwy3) {
        akcr.b(aipn, "snapDbLazy");
        akcr.b(aipn2, "clockLazy");
        akcr.b(ajwy, "storyRepositoryProvider");
        akcr.b(aipn3, "schedulersLazy");
        akcr.b(aipn4, "perfAnalyticsLazy");
        akcr.b(ajwy2, "teamSnapchatFilter");
        akcr.b(gpu, "userSession");
        akcr.b(vdj, "rankingSessionTracker");
        akcr.b(gpb, "userAuthStore");
        akcr.b(ajwy3, "configProvider");
        this.i = ajwy2;
        this.q = vdj;
        this.j = gpb;
        this.k = ajwy3;
        this.l = ajxh.a(new s(aipn));
        this.m = ajxh.a(new b(aipn2));
        this.n = ajxh.a(new r(aipn3));
        this.o = ajxh.a(new u(ajwy));
        this.a = ajxh.a(new q(aipn4));
        ajei ajei = new ajei();
        gpu.a.a((ajej) ajei);
        this.b = ajei;
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create()");
        this.e = ajwl;
        this.f = new AtomicBoolean(false);
    }

    private static boolean a(Set<a> set, Set<a> set2) {
        Iterable iterable = set;
        Iterator it = ajzu.a((Set) set2, iterable).iterator();
        boolean z;
        do {
            z = false;
            if (it.hasNext()) {
                a aVar = (a) it.next();
                for (Object next : iterable) {
                    Object obj;
                    if (((a) next).a == aVar.a) {
                        obj = 1;
                        continue;
                    } else {
                        obj = null;
                        continue;
                    }
                    if (obj != null) {
                        break;
                    }
                }
                Object next2 = null;
                a aVar2 = (a) next2;
                Object obj2 = aVar2 == null ? 1 : null;
                if (!(aVar2 == null || aVar2.b != null || aVar.b == null)) {
                    z = true;
                }
                if (obj2 != null) {
                    break;
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    private final void c(List<a> list) {
        this.p.clear();
        int i = 0;
        for (a put : list) {
            this.p.put(put, Integer.valueOf(i));
            i++;
        }
    }

    /* Access modifiers changed, original: final */
    public final DbClient a() {
        return (DbClient) this.l.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0036 in {6, 8, 10} preds:[]
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
    final java.util.List<defpackage.hjx> a(java.util.List<? extends com.snap.core.db.query.LegacyDiscoverFeedQueries.SnapDbFriendStory> r5) {
        /*
        r4 = this;
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0034 }
        r0.<init>();	 Catch:{ all -> 0x0034 }
        r1 = new ihx;	 Catch:{ all -> 0x0034 }
        r2 = new hgi$c;	 Catch:{ all -> 0x0034 }
        r2.<init>(r4, r5);	 Catch:{ all -> 0x0034 }
        r2 = (defpackage.ihx.a) r2;	 Catch:{ all -> 0x0034 }
        r1.<init>(r2);	 Catch:{ all -> 0x0034 }
        r5 = r5.iterator();	 Catch:{ all -> 0x0034 }
        r2 = r5.hasNext();	 Catch:{ all -> 0x0034 }
        if (r2 == 0) goto L_0x0031;	 Catch:{ all -> 0x0034 }
        r2 = r5.next();	 Catch:{ all -> 0x0034 }
        r2 = (com.snap.core.db.query.LegacyDiscoverFeedQueries.SnapDbFriendStory) r2;	 Catch:{ all -> 0x0034 }
        r3 = r4.q;	 Catch:{ all -> 0x0034 }
        r3 = r3.a();	 Catch:{ all -> 0x0034 }
        r2 = defpackage.hpg.a(r2, r3, r1);	 Catch:{ all -> 0x0034 }
        if (r2 == 0) goto L_0x0015;	 Catch:{ all -> 0x0034 }
        r0.add(r2);	 Catch:{ all -> 0x0034 }
        goto L_0x0015;	 Catch:{ all -> 0x0034 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0034 }
        return r0;
        r5 = move-exception;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgi.a(java.util.List):java.util.List");
    }

    /* Access modifiers changed, original: final */
    public final ihh b() {
        return (ihh) this.m.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x0077 in {5, 10, 16, 20, 23} preds:[]
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
    public final synchronized java.util.List<com.snap.core.db.query.LegacyDiscoverFeedQueries.SnapDbFriendStory> b(java.util.List<? extends com.snap.core.db.query.LegacyDiscoverFeedQueries.SnapDbFriendStory> r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = "dbStories";	 Catch:{ all -> 0x0074 }
        defpackage.akcr.b(r7, r0);	 Catch:{ all -> 0x0074 }
        r0 = r7;	 Catch:{ all -> 0x0074 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0074 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0074 }
        r2 = 10;	 Catch:{ all -> 0x0074 }
        r2 = defpackage.ajyn.a(r0, r2);	 Catch:{ all -> 0x0074 }
        r1.<init>(r2);	 Catch:{ all -> 0x0074 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0074 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0074 }
        r2 = r0.hasNext();	 Catch:{ all -> 0x0074 }
        if (r2 == 0) goto L_0x0037;	 Catch:{ all -> 0x0074 }
        r2 = r0.next();	 Catch:{ all -> 0x0074 }
        r2 = (com.snap.core.db.query.LegacyDiscoverFeedQueries.SnapDbFriendStory) r2;	 Catch:{ all -> 0x0074 }
        r3 = new hgi$a;	 Catch:{ all -> 0x0074 }
        r4 = r2._id();	 Catch:{ all -> 0x0074 }
        r2 = r2.firstUnviewedSnapId();	 Catch:{ all -> 0x0074 }
        r3.<init>(r4, r2);	 Catch:{ all -> 0x0074 }
        r1.add(r3);	 Catch:{ all -> 0x0074 }
        goto L_0x001a;	 Catch:{ all -> 0x0074 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x0074 }
        r0 = r6.h;	 Catch:{ all -> 0x0074 }
        if (r0 != 0) goto L_0x0042;	 Catch:{ all -> 0x0074 }
        r6.c(r1);	 Catch:{ all -> 0x0074 }
        monitor-exit(r6);
        return r7;
        r0 = r6.p;	 Catch:{ all -> 0x0074 }
        r0 = r0.keySet();	 Catch:{ all -> 0x0074 }
        r2 = "customSortMap.keys";	 Catch:{ all -> 0x0074 }
        defpackage.akcr.a(r0, r2);	 Catch:{ all -> 0x0074 }
        r2 = r1;	 Catch:{ all -> 0x0074 }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x0074 }
        r2 = defpackage.ajyu.j(r2);	 Catch:{ all -> 0x0074 }
        r2 = (java.util.Set) r2;	 Catch:{ all -> 0x0074 }
        r0 = defpackage.hgi.a(r0, r2);	 Catch:{ all -> 0x0074 }
        if (r0 == 0) goto L_0x0061;	 Catch:{ all -> 0x0074 }
        r6.c(r1);	 Catch:{ all -> 0x0074 }
        monitor-exit(r6);
        return r7;
        r0 = r6.p;	 Catch:{ all -> 0x0074 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0074 }
        r7 = (java.lang.Iterable) r7;	 Catch:{ all -> 0x0074 }
        r1 = new hgi$t;	 Catch:{ all -> 0x0074 }
        r1.<init>(r0);	 Catch:{ all -> 0x0074 }
        r1 = (java.util.Comparator) r1;	 Catch:{ all -> 0x0074 }
        r7 = defpackage.ajyu.a(r7, r1);	 Catch:{ all -> 0x0074 }
        monitor-exit(r6);
        return r7;
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgi.b(java.util.List):java.util.List");
    }

    /* Access modifiers changed, original: final */
    public final zfw c() {
        return (zfw) this.n.b();
    }

    public final ajdp<List<hjx>> d() {
        Object p = ajdp.a((ajdt) this.e.a((ajdw) c().f()).p(new d(this)).a((ajdw) c().i()).p(new e(this)).p(new f(this)).a((ajdw) c().f()).a((ajey) new hgj(new g(this))).e((ajfb) new h(this)), (ajdt) ((yid) this.o.b()).d(), (ajex) i.a).a((ajdw) c().f()).a((ajfl) j.a).d((ajfb) new k(this)).p(l.a);
        akcr.a(p, "Observable.combineLatest…        .map { it.first }");
        return p;
    }

    public final synchronized void e() {
        this.p.clear();
        if (this.e.q()) {
            this.d.set(true);
            ajwl ajwl = this.e;
            Object p = this.e.p();
            if (p == null) {
                akcr.a();
            }
            ajwl.a(p);
        }
    }
}
