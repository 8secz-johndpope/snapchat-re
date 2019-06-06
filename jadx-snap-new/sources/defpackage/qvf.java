package defpackage;

import com.snap.core.db.DbConstantsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import java.util.List;
import java.util.Set;

/* renamed from: qvf */
public final class qvf implements itq {
    final ajxe a = ajxh.a(new a(this));
    final SnapDb b;
    final qvd c;

    /* renamed from: qvf$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ qvf a;

        a(qvf qvf) {
            this.a = qvf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.getDbClient(pry.a.callsite("MischiefNameProcessor"));
        }
    }

    /* renamed from: qvf$b */
    static final class b extends akcs implements akbl<List<? extends Long>, ajxw> {
        private /* synthetic */ qvf a;

        b(qvf qvf) {
            this.a = qvf;
            super(1);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0063 in {6, 8, 14, 16} preds:[]
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
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r7) {
            /*
            r6 = this;
            r7 = (java.util.List) r7;
            r0 = "it";
            defpackage.akcr.b(r7, r0);
            r0 = com.snap.core.db.record.FeedMemberRecord.FACTORY;
            r7 = (java.util.Collection) r7;
            r7 = defpackage.ajyu.g(r7);
            r7 = r0.getAllFeedsWithMembers(r7);
            r0 = "FeedMemberRecord.FACTORY…Members(it.toLongArray())";
            defpackage.akcr.a(r7, r0);
            r0 = com.snap.core.db.record.FeedMemberRecord.FACTORY;
            r1 = "FeedMemberRecord.FACTORY";
            defpackage.akcr.a(r0, r1);
            r0 = r0.getAllFeedsWithMembersMapper();
            r1 = r6.a;
            r1 = r1.a;
            r1 = r1.b();
            r1 = (com.snap.core.db.api.DbClient) r1;
            r7 = r1.query(r7);
            r7 = (java.io.Closeable) r7;
            r1 = 0;
            r2 = r7;	 Catch:{ Throwable -> 0x005c }
            r2 = (android.database.Cursor) r2;	 Catch:{ Throwable -> 0x005c }
            r3 = r2.moveToNext();	 Catch:{ Throwable -> 0x005c }
            if (r3 == 0) goto L_0x0054;	 Catch:{ Throwable -> 0x005c }
            r3 = r6.a;	 Catch:{ Throwable -> 0x005c }
            r3 = r3.c;	 Catch:{ Throwable -> 0x005c }
            r4 = r0.map(r2);	 Catch:{ Throwable -> 0x005c }
            r5 = "mapper.map(cursor)";	 Catch:{ Throwable -> 0x005c }
            defpackage.akcr.a(r4, r5);	 Catch:{ Throwable -> 0x005c }
            r4 = (java.lang.Number) r4;	 Catch:{ Throwable -> 0x005c }
            r4 = r4.longValue();	 Catch:{ Throwable -> 0x005c }
            r3.j(r4);	 Catch:{ Throwable -> 0x005c }
            goto L_0x0037;
            defpackage.akax.a(r7, r1);
            r7 = defpackage.ajxw.a;
            return r7;
            r0 = move-exception;
            goto L_0x005f;
            r0 = move-exception;
            r1 = r0;
            throw r1;	 Catch:{ all -> 0x005a }
            defpackage.akax.a(r7, r1);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qvf$b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(qvf.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;");
    }

    public qvf(SnapDb snapDb, qvd qvd) {
        akcr.b(snapDb, "snapDb");
        akcr.b(qvd, "messagingRepository");
        this.b = snapDb;
        this.c = qvd;
    }

    public final void a(Set<Long> set, DbTransaction dbTransaction) {
        akcr.b(set, "friends");
        akcr.b(dbTransaction, "tx");
        ajyu.a(set, DbConstantsKt.MAX_QUERY_VARIABLE_COUNT, new b(this));
    }
}
