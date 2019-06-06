package defpackage;

import android.text.TextUtils;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapModel.UpdatePendingServerVerificationSnapsToFailed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: yio */
public class yio implements yib {
    private final ajxe a;
    private final ajxe b;
    private final ajxe c;
    private final ajxe d;
    private final ajxe e;
    private final ajxe f;
    private boolean g;

    /* renamed from: yio$n */
    static final class n extends akcq implements akbk<yip> {
        n(ajwy ajwy) {
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

    /* renamed from: yio$l */
    static final class l extends akcq implements akbk<yik> {
        l(ajwy ajwy) {
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
            return (yik) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yio$i */
    static final class i extends akcq implements akbk<abss> {
        i(ajwy ajwy) {
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
            return (abss) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yio$m */
    static final class m extends akcq implements akbk<yhi> {
        m(ajwy ajwy) {
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
            return (yhi) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yio$f */
    static final class f extends akcs implements akbk<ajxw> {
        private /* synthetic */ yio a;
        private /* synthetic */ afbe b;
        private /* synthetic */ DbTransaction c;

        f(yio yio, afbe afbe, DbTransaction dbTransaction) {
            this.a = yio;
            this.b = afbe;
            this.c = dbTransaction;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ageu ageu = this.b.h;
            if (ageu != null) {
                yip a = this.a.a();
                DbTransaction dbTransaction = this.c;
                String str = "tx";
                akcr.b(dbTransaction, str);
                akcr.b(ageu, "orderingResponse");
                List list = ageu.c;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = ((agew) list.get(i)).b;
                        if (!TextUtils.isEmpty((CharSequence) obj)) {
                            ylo i2 = a.i();
                            akcr.a(obj, "key");
                            long j = (long) i;
                            akcr.b(dbTransaction, str);
                            akcr.b(obj, "storyId");
                            dbTransaction.checkInTransaction();
                            i2.b().bind(Long.valueOf(j), obj);
                            i2.c.executeUpdateDelete(i2.b(), dbTransaction);
                        }
                    }
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: yio$g */
    static final class g extends akcs implements akbk<ajxw> {
        private /* synthetic */ yio a;
        private /* synthetic */ afbe b;
        private /* synthetic */ DbTransaction c;
        private /* synthetic */ List d;

        g(yio yio, afbe afbe, DbTransaction dbTransaction, List list) {
            this.a = yio;
            this.b = afbe;
            this.c = dbTransaction;
            this.d = list;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            List arrayList = new ArrayList();
            List list = this.b.a;
            if (list != null) {
                arrayList.addAll(yio.a(this.a, this.c, list));
            }
            list = this.b.d;
            if (list != null) {
                arrayList.addAll(yio.b(this.a, this.c, list));
            }
            list = this.b.k;
            if (list != null) {
                arrayList.addAll(yio.a(this.a, this.c, list, this.d));
            }
            yip a = this.a.a();
            DbTransaction dbTransaction = this.c;
            String str = "tx";
            akcr.b(dbTransaction, str);
            ylq h = a.h();
            long a2 = a.f().a() - 30000;
            akcr.b(dbTransaction, str);
            dbTransaction.checkInTransaction();
            UpdatePendingServerVerificationSnapsToFailed updatePendingServerVerificationSnapsToFailed = new UpdatePendingServerVerificationSnapsToFailed(h.a());
            updatePendingServerVerificationSnapsToFailed.bind(Long.valueOf(a2));
            h.a.executeUpdateDelete(updatePendingServerVerificationSnapsToFailed);
            a = this.a.a();
            akcr.b(arrayList, "syncedSnapIds");
            ajcx e = a.h.b((ajdw) a.e.b()).a(a.g().scheduler()).e((ajfc) new defpackage.yip.g(a, arrayList));
            akcr.a((Object) e, "currentUsername\n        …      }\n                }");
            ajvv.a(yit.a(e, null, null, 3), a.f);
            return ajxw.a;
        }
    }

    /* renamed from: yio$b */
    static final class b extends akcs implements akbk<ajxw> {
        private /* synthetic */ yio a;
        private /* synthetic */ DbTransaction b;

        b(yio yio, DbTransaction dbTransaction) {
            this.a = yio;
            this.b = dbTransaction;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a().a(this.b);
            return ajxw.a;
        }
    }

    /* renamed from: yio$a */
    static final class a<T> implements ajfb<DbTransaction> {
        private /* synthetic */ yio a;

        a(yio yio) {
            this.a = yio;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a().g.a(Boolean.TRUE);
        }
    }

    /* renamed from: yio$d */
    static final class d extends akcs implements akbk<ajxw> {
        private /* synthetic */ yio a;
        private /* synthetic */ afbe b;
        private /* synthetic */ DbTransaction c;

        d(yio yio, afbe afbe, DbTransaction dbTransaction) {
            this.a = yio;
            this.b = afbe;
            this.c = dbTransaction;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.b.o;
            if (obj != null) {
                if ((obj.isEmpty() ^ 1) == 0) {
                    obj = null;
                }
                if (obj != null) {
                    yip a = this.a.a();
                    DbTransaction dbTransaction = this.c;
                    akcr.b(dbTransaction, "tx");
                    akcr.b(obj, "deletedFriendStories");
                    if ((obj.isEmpty() ^ 1) != 0) {
                        a.a(dbTransaction, a.h().b(ajyn.b((Iterable) obj.values())));
                    } else {
                        throw new IllegalStateException("syncDeletedFriendStories() deletion map must not be empty!".toString());
                    }
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: yio$j */
    static final class j extends akcs implements akbk<zfw> {
        private /* synthetic */ ajwy a;

        j(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(yhy.j.callsite("StoriesResponseProcessorImpl"));
        }
    }

    /* renamed from: yio$k */
    static final class k extends akcs implements akbk<ajei> {
        private /* synthetic */ ajwy a;

        k(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((gpu) this.a.get()).a;
        }
    }

    /* renamed from: yio$h */
    static final class h extends akcs implements akbk<ajxw> {
        private /* synthetic */ yio a;
        private /* synthetic */ DbTransaction b;
        private /* synthetic */ afbe c;

        h(yio yio, DbTransaction dbTransaction, afbe afbe) {
            this.a = yio;
            this.b = dbTransaction;
            this.c = afbe;
            super(0);
        }

        /* JADX WARNING: Missing block: B:3:0x001a, code skipped:
            if (r4 == null) goto L_0x001c;
     */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
            r6 = this;
            r0 = r6.a;
            r0 = r0.a();
            r1 = r6.b;
            r2 = r6.c;
            r3 = "tx";
            defpackage.akcr.b(r1, r3);
            r4 = "response";
            defpackage.akcr.b(r2, r4);
            r4 = r2.i;
            if (r4 == 0) goto L_0x001c;
        L_0x0018:
            r4 = r4.b;
            if (r4 != 0) goto L_0x001e;
        L_0x001c:
            r4 = "";
        L_0x001e:
            r0 = r0.k();
            r2 = r2.l;
            r5 = "response.syncMetadata";
            defpackage.akcr.a(r2, r5);
            defpackage.akcr.b(r1, r3);
            r3 = "checksum";
            defpackage.akcr.b(r4, r3);
            r3 = "metaData";
            defpackage.akcr.b(r2, r3);
            r1.checkInTransaction();
            r3 = r0.c;
            r3 = r3.b();
            r3 = (com.snap.core.db.record.StorySyncStateModel.UpdateValue) r3;
            r3.bind(r4, r2);
            r2 = r0.a;
            r3 = (defpackage.ainy) r3;
            r2 = r2.executeUpdateDelete(r3);
            if (r2 != 0) goto L_0x0065;
        L_0x004e:
            r2 = new com.snap.core.db.record.StorySyncStateModel$CreateEntry;
            r4 = r0.a;
            r4 = r4.getWritableDatabase();
            r2.<init>(r4);
            r4 = r0.a;
            r2 = (defpackage.ainy) r2;
            r4.executeInsert(r2, r1);
            r0 = r0.a;
            r0.executeUpdateDelete(r3, r1);
        L_0x0065:
            r0 = defpackage.ajxw.a;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yio$h.invoke():java.lang.Object");
        }
    }

    /* renamed from: yio$e */
    static final class e extends akcs implements akbk<ajxw> {
        private /* synthetic */ yio a;
        private /* synthetic */ afbe b;
        private /* synthetic */ DbTransaction c;
        private /* synthetic */ Map d;
        private /* synthetic */ String e;
        private /* synthetic */ List f;

        e(yio yio, afbe afbe, DbTransaction dbTransaction, Map map, String str, List list) {
            this.a = yio;
            this.b = afbe;
            this.c = dbTransaction;
            this.d = map;
            this.e = str;
            this.f = list;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            List list = this.b.c;
            if (list != null) {
                this.a.a().a(this.c, list, this.d, this.e);
                List list2 = this.f;
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    Object obj = (aeml) next;
                    akcr.a(obj, "it");
                    if ((obj.a() == agdk.MOB_STORY ? 1 : null) != null) {
                        arrayList.add(next);
                    }
                }
                Iterable<aeml> iterable = (List) arrayList;
                Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (aeml aeml : iterable) {
                    arrayList2.add(aeml.a);
                }
                list2.addAll((List) arrayList2);
            }
            return ajxw.a;
        }
    }

    /* renamed from: yio$c */
    static final class c extends akcs implements akbl<Throwable, ajxw> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "throwable");
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(yio.class), "storyRepository", "getStoryRepository()Lcom/snap/stories/client/StoryRepositoryClient;"), new akdc(akde.a(yio.class), "storiesNetworkApi", "getStoriesNetworkApi()Lcom/snap/stories/client/StoriesNetworkApiClient;"), new akdc(akde.a(yio.class), "releaseManager", "getReleaseManager()Lcom/snapchat/android/framework/release/ReleaseManager;"), new akdc(akde.a(yio.class), "storiesPerformanceAnalytics", "getStoriesPerformanceAnalytics()Lcom/snap/stories/analytics/StoriesPerformanceAnalytics;"), new akdc(akde.a(yio.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(yio.class), "sessionDisposable", "getSessionDisposable()Lio/reactivex/disposables/CompositeDisposable;")};
    }

    public yio(ajwy<yip> ajwy, ajwy<yik> ajwy2, ajwy<zgb> ajwy3, ajwy<gpu> ajwy4, ajwy<abss> ajwy5, ajwy<yhi> ajwy6) {
        akcr.b(ajwy, "storyRepositoryProvider");
        akcr.b(ajwy2, "storiesNetworkApiProvider");
        akcr.b(ajwy3, "schedulersProvider");
        akcr.b(ajwy4, "userSessionProvider");
        akcr.b(ajwy5, "releaseManagerProvider");
        akcr.b(ajwy6, "storiesPerformanceAnalyticsProvider");
        this.a = ajxh.a(new n(ajwy));
        this.b = ajxh.a(new l(ajwy2));
        this.c = ajxh.a(new i(ajwy5));
        this.d = ajxh.a(new m(ajwy6));
        this.e = ajxh.a(new j(ajwy3));
        this.f = ajxh.a(new k(ajwy4));
    }

    private final void a(ipd ipd, boolean z, akbk<ajxw> akbk) {
        Object uuid = UUID.randomUUID().toString();
        akcr.a(uuid, "UUID.randomUUID().toString()");
        c().a(uuid);
        akbk.invoke();
        c().a(ipd, uuid, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0012 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0012 A:{SYNTHETIC} */
    private void a(java.util.List<? extends defpackage.afbs> r8) {
        /*
        r7 = this;
        r0 = "storyLogbooks";
        defpackage.akcr.b(r8, r0);
        r8 = (java.lang.Iterable) r8;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r8 = r8.iterator();
    L_0x0012:
        r1 = r8.hasNext();
        r2 = 1;
        if (r1 == 0) goto L_0x0062;
    L_0x0019:
        r1 = r8.next();
        r3 = r1;
        r3 = (defpackage.afbs) r3;
        r4 = "receiver$0";
        defpackage.akcr.b(r3, r4);
        r4 = r3.d;
        r5 = 0;
        if (r4 == 0) goto L_0x0033;
    L_0x002a:
        r4 = r4.a;
        if (r4 == 0) goto L_0x0033;
    L_0x002e:
        r4 = r4.intValue();
        goto L_0x0034;
    L_0x0033:
        r4 = 0;
    L_0x0034:
        r6 = r3.e;
        if (r6 == 0) goto L_0x0041;
    L_0x0038:
        r6 = r6.a;
        if (r6 == 0) goto L_0x0041;
    L_0x003c:
        r6 = r6.intValue();
        goto L_0x0042;
    L_0x0041:
        r6 = 0;
    L_0x0042:
        r4 = r4 + r6;
        r6 = r3.i;
        if (r6 == 0) goto L_0x004c;
    L_0x0047:
        r6 = r6.size();
        goto L_0x004d;
    L_0x004c:
        r6 = 0;
    L_0x004d:
        r3 = r3.j;
        if (r3 == 0) goto L_0x0056;
    L_0x0051:
        r3 = r3.size();
        goto L_0x0057;
    L_0x0056:
        r3 = 0;
    L_0x0057:
        r6 = r6 + r3;
        if (r4 < r6) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        r2 = 0;
    L_0x005c:
        if (r2 != 0) goto L_0x0012;
    L_0x005e:
        r0.add(r1);
        goto L_0x0012;
    L_0x0062:
        r0 = (java.util.List) r0;
        r0 = (java.util.Collection) r0;
        r8 = r0.isEmpty();
        r8 = r8 ^ r2;
        if (r8 == 0) goto L_0x0078;
    L_0x006d:
        r8 = r7.g;
        if (r8 != 0) goto L_0x0078;
    L_0x0071:
        r7.g = r2;
        r8 = "Story Management view count invalid, please S2R to Stories";
        defpackage.ieg.a(r8, r2, r2);
    L_0x0078:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yio.a(java.util.List):void");
    }

    private final abss b() {
        return (abss) this.c.b();
    }

    public static final /* synthetic */ List b(yio yio, DbTransaction dbTransaction, List list) {
        List arrayList = new ArrayList();
        for (aeti aeti : list) {
            List list2 = aeti.c;
            if (list2 != null && (list2.isEmpty() ^ 1) == 1) {
                String str = "myGroupStoriesResponse.stories";
                if (yio.b().d()) {
                    Object obj = aeti.c;
                    akcr.a(obj, str);
                    yio.a(ajyt.a((Iterable) obj, afbs.class));
                }
                yip a = yio.a();
                Object obj2 = aeti.a;
                akcr.a(obj2, "myGroupStoriesResponse.groupId");
                StoryKind storyKind = StoryKind.OUR;
                String str2 = aeti.b;
                Object obj3 = aeti.c;
                akcr.a(obj3, str);
                a.a(dbTransaction, obj2, storyKind, str2, obj3, false, null);
                Object obj4 = aeti.c;
                akcr.a(obj4, str);
                Iterable<aeug> iterable = (Iterable) obj4;
                Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (aeug aeug : iterable) {
                    arrayList2.add(aeug.b.a);
                }
                arrayList.addAll((List) arrayList2);
            }
        }
        return arrayList;
    }

    private final yhi c() {
        return (yhi) this.d.b();
    }

    /* Access modifiers changed, original: final */
    public final yip a() {
        return (yip) this.a.b();
    }

    public final void a(afbe afbe, Map<String, ? extends ahaz> map, DbTransaction dbTransaction, String str) {
        afbe afbe2 = afbe;
        DbTransaction dbTransaction2 = dbTransaction;
        String str2 = "storiesResponse";
        akcr.b(afbe2, str2);
        Map<String, ? extends ahaz> map2 = map;
        akcr.b(map2, "mobIdToMischiefMap");
        String str3 = "tx";
        akcr.b(dbTransaction2, str3);
        dbTransaction.checkInTransaction();
        String uuid = UUID.randomUUID().toString();
        akcr.a((Object) uuid, "UUID.randomUUID().toString()");
        c().a(uuid);
        ipd ipd = ipd.PROCESS_STORY_SYNC_STATE;
        Object obj = afbe2.g;
        String str4 = "storiesResponse.friendStoriesDelta";
        akcr.a(obj, str4);
        a(ipd, obj.booleanValue(), (akbk) new h(this, dbTransaction2, afbe2));
        List arrayList = new ArrayList();
        ipd ipd2 = ipd.PROCESS_FRIENDS_STORIES;
        Object obj2 = afbe2.g;
        akcr.a(obj2, str4);
        String str5 = uuid;
        a(ipd2, obj2.booleanValue(), (akbk) new e(this, afbe, dbTransaction, map2, str, arrayList));
        ipd = ipd.PROCESS_DELETED_STORIES;
        obj = afbe2.g;
        akcr.a(obj, str4);
        a(ipd, obj.booleanValue(), (akbk) new d(this, afbe2, dbTransaction2));
        ipd = ipd.PROCESS_ORDERING_RESPONSE;
        obj = afbe2.g;
        akcr.a(obj, str4);
        a(ipd, obj.booleanValue(), (akbk) new f(this, afbe2, dbTransaction2));
        akcr.b(dbTransaction2, str3);
        akcr.b(afbe2, str2);
        akcr.b(arrayList, "processedGroupStoryIds");
        dbTransaction.checkInTransaction();
        ipd = ipd.PROCESS_STORY_MANAGEMENT;
        obj = afbe2.g;
        akcr.a(obj, str4);
        a(ipd, obj.booleanValue(), (akbk) new g(this, afbe2, dbTransaction2, arrayList));
        akcr.b(arrayList, "groupStoryIds");
        if ((arrayList.isEmpty() ^ 1) != 0) {
            ajcx b = ((yik) this.b.b()).a(arrayList).b((ajdw) ((zfw) this.e.b()).g());
            akcr.a((Object) b, "storiesNetworkApi\n      …eOn(schedulers.network())");
            std.a(yit.a(b, (akbl) c.a, null, 2), (ajei) this.f.b());
        }
        ipd = ipd.DELETE_EXPIRED_STORY_SNAPS;
        obj = afbe2.g;
        akcr.a(obj, str4);
        a(ipd, obj.booleanValue(), (akbk) new b(this, dbTransaction2));
        yhi c = c();
        ipd ipd3 = ipd.PROCESS_STORIES_RESPONSE;
        Object obj3 = afbe2.g;
        akcr.a(obj3, str4);
        c.a(ipd3, str5, obj3.booleanValue());
        dbTransaction2.runAfter(new a(this));
    }
}
