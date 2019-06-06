package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.query.LocationSharingModel.Factory;
import com.snap.core.db.query.LocationSharingModel.GetFriendsLinkTypeMapper;
import com.snap.core.db.record.FriendRecord;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: acto */
public final class acto implements ngh {
    final DbClient a = ((DbClient) ajxh.a(new a(this)).b());
    final Factory<FriendRecord> b = new Factory(FriendRecord.FACTORY);
    final GetFriendsLinkTypeMapper<actm, FriendRecord> c;
    final ide d;
    final aipn<SnapDb> e;
    private final ajxe f;

    /* renamed from: acto$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ acto a;

        a(acto acto) {
            this.a = acto;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.e.get()).getDbClient(this.a.d);
        }
    }

    /* renamed from: acto$b */
    static final class b extends akcs implements akbk<actn> {
        private /* synthetic */ acto a;

        b(acto acto) {
            this.a = acto;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            DbClient dbClient = this.a.a;
            Object friendsLinkType = this.a.b.getFriendsLinkType();
            akcr.a(friendsLinkType, "dbModel.friendsLinkType");
            List<Object> query = dbClient.query(friendsLinkType, this.a.c);
            Map linkedHashMap = new LinkedHashMap();
            Map linkedHashMap2 = new LinkedHashMap();
            for (Object obj : query) {
                String userId = obj.userId();
                String str = "friend";
                if (userId != null) {
                    akcr.a(obj, str);
                    linkedHashMap.put(userId, obj);
                }
                userId = obj.b;
                akcr.a(obj, str);
                linkedHashMap2.put(userId, obj);
            }
            return new actn(linkedHashMap, linkedHashMap2);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(acto.class), "friendMap", "getFriendMap()Lcom/snapchat/map/feature/sharing/LocationSharingFriendMap;");
    }

    public acto(ide ide, aipn<SnapDb> aipn) {
        akcr.b(ide, "attributedFeature");
        akcr.b(aipn, "snapDb");
        this.d = ide;
        this.e = aipn;
        Object friendsLinkTypeMapper = this.b.getFriendsLinkTypeMapper(new actp());
        akcr.a(friendsLinkTypeMapper, "dbModel.getFriendsLinkTy…(SharingFriendsCreator())");
        this.c = friendsLinkTypeMapper;
        this.f = ajxh.a(new b(this));
    }

    private final actn b() {
        return (actn) this.f.b();
    }

    public final synchronized int a() {
        return b().a.values().size();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x00a5 in {11, 12, 14, 15, 17, 23, 24, 27, 30} preds:[]
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
    public final synchronized java.util.List<java.lang.String> a(java.util.Set<java.lang.String> r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = "ids";	 Catch:{ all -> 0x00a2 }
        defpackage.akcr.b(r7, r0);	 Catch:{ all -> 0x00a2 }
        r0 = r6.b();	 Catch:{ all -> 0x00a2 }
        r0 = r0.a;	 Catch:{ all -> 0x00a2 }
        r1 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x00a2 }
        r1.<init>();	 Catch:{ all -> 0x00a2 }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x00a2 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x00a2 }
        r0 = r0.iterator();	 Catch:{ all -> 0x00a2 }
        r2 = r0.hasNext();	 Catch:{ all -> 0x00a2 }
        if (r2 == 0) goto L_0x0069;	 Catch:{ all -> 0x00a2 }
        r2 = r0.next();	 Catch:{ all -> 0x00a2 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x00a2 }
        r3 = r2.getKey();	 Catch:{ all -> 0x00a2 }
        r3 = r7.contains(r3);	 Catch:{ all -> 0x00a2 }
        r4 = 1;	 Catch:{ all -> 0x00a2 }
        if (r3 == 0) goto L_0x005a;	 Catch:{ all -> 0x00a2 }
        r3 = r2.getValue();	 Catch:{ all -> 0x00a2 }
        r3 = (defpackage.actm) r3;	 Catch:{ all -> 0x00a2 }
        r3 = r3.b;	 Catch:{ all -> 0x00a2 }
        r5 = "teamsnapchat";	 Catch:{ all -> 0x00a2 }
        r3 = defpackage.akcr.a(r3, r5);	 Catch:{ all -> 0x00a2 }
        r3 = r3 ^ r4;	 Catch:{ all -> 0x00a2 }
        if (r3 == 0) goto L_0x005a;	 Catch:{ all -> 0x00a2 }
        r3 = r2.getValue();	 Catch:{ all -> 0x00a2 }
        r3 = (defpackage.actm) r3;	 Catch:{ all -> 0x00a2 }
        r3 = r3.friendLinkType();	 Catch:{ all -> 0x00a2 }
        if (r3 == 0) goto L_0x0056;	 Catch:{ all -> 0x00a2 }
        r5 = com.snap.core.db.column.FriendLinkType.BLOCKED;	 Catch:{ all -> 0x00a2 }
        r3 = r3.equals(r5);	 Catch:{ all -> 0x00a2 }
        goto L_0x0057;	 Catch:{ all -> 0x00a2 }
        r3 = 1;	 Catch:{ all -> 0x00a2 }
        if (r3 != 0) goto L_0x005a;	 Catch:{ all -> 0x00a2 }
        goto L_0x005b;	 Catch:{ all -> 0x00a2 }
        r4 = 0;	 Catch:{ all -> 0x00a2 }
        if (r4 == 0) goto L_0x001b;	 Catch:{ all -> 0x00a2 }
        r3 = r2.getKey();	 Catch:{ all -> 0x00a2 }
        r2 = r2.getValue();	 Catch:{ all -> 0x00a2 }
        r1.put(r3, r2);	 Catch:{ all -> 0x00a2 }
        goto L_0x001b;	 Catch:{ all -> 0x00a2 }
        r7 = new java.util.ArrayList;	 Catch:{ all -> 0x00a2 }
        r0 = r1.size();	 Catch:{ all -> 0x00a2 }
        r7.<init>(r0);	 Catch:{ all -> 0x00a2 }
        r7 = (java.util.Collection) r7;	 Catch:{ all -> 0x00a2 }
        r0 = r1.entrySet();	 Catch:{ all -> 0x00a2 }
        r0 = r0.iterator();	 Catch:{ all -> 0x00a2 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x00a2 }
        if (r1 == 0) goto L_0x009e;	 Catch:{ all -> 0x00a2 }
        r1 = r0.next();	 Catch:{ all -> 0x00a2 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x00a2 }
        r2 = r1.getValue();	 Catch:{ all -> 0x00a2 }
        r2 = (defpackage.actm) r2;	 Catch:{ all -> 0x00a2 }
        r2 = r2.c;	 Catch:{ all -> 0x00a2 }
        if (r2 != 0) goto L_0x009a;	 Catch:{ all -> 0x00a2 }
        r1 = r1.getValue();	 Catch:{ all -> 0x00a2 }
        r1 = (defpackage.actm) r1;	 Catch:{ all -> 0x00a2 }
        r2 = r1.b;	 Catch:{ all -> 0x00a2 }
        r7.add(r2);	 Catch:{ all -> 0x00a2 }
        goto L_0x007c;	 Catch:{ all -> 0x00a2 }
        r7 = (java.util.List) r7;	 Catch:{ all -> 0x00a2 }
        monitor-exit(r6);
        return r7;
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acto.a(java.util.Set):java.util.List");
    }

    /* JADX WARNING: Missing block: B:16:0x002a, code skipped:
            return false;
     */
    public final synchronized boolean a(java.lang.String r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "username";
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x002b }
        r0 = r2.b();	 Catch:{ all -> 0x002b }
        r0 = r0.b;	 Catch:{ all -> 0x002b }
        r3 = r0.get(r3);	 Catch:{ all -> 0x002b }
        r3 = (defpackage.actm) r3;	 Catch:{ all -> 0x002b }
        r0 = 0;
        if (r3 == 0) goto L_0x0029;
    L_0x0015:
        r3 = r3.friendLinkType();	 Catch:{ all -> 0x002b }
        if (r3 == 0) goto L_0x0029;
    L_0x001b:
        r1 = com.snap.core.db.column.FriendLinkType.MUTUAL;	 Catch:{ all -> 0x002b }
        if (r3 == r1) goto L_0x0026;
    L_0x001f:
        r1 = com.snap.core.db.column.FriendLinkType.OUTGOING;	 Catch:{ all -> 0x002b }
        if (r3 != r1) goto L_0x0024;
    L_0x0023:
        goto L_0x0026;
    L_0x0024:
        monitor-exit(r2);
        return r0;
    L_0x0026:
        r3 = 1;
        monitor-exit(r2);
        return r3;
    L_0x0029:
        monitor-exit(r2);
        return r0;
    L_0x002b:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acto.a(java.lang.String):boolean");
    }

    public final synchronized String b(String str) {
        akcr.b(str, "username");
        actm actm = (actm) b().b.get(str);
        if (actm == null) {
            return null;
        }
        return actm.a;
    }
}
