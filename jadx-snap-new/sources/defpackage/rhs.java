package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.FeedModel.DeleteLocalTemporaryGroups;

/* renamed from: rhs */
public final class rhs {
    public final zfw a = zgb.a(this.g);
    public final DbClient b;
    final quk c;
    final qvd d;
    public final ajei e;
    final ihh f;
    private final idd g = rgr.d.callsite("SendToLocalGroupsManager");

    /* renamed from: rhs$b */
    public static final class b<T, R> implements ajfc<rgw, ajdb> {
        final /* synthetic */ rhs a;

        /* renamed from: rhs$b$1 */
        static final class 1 extends akcs implements akbl<DbTransaction, ajxw> {
            private /* synthetic */ b a;
            private /* synthetic */ String[] b;

            1(b bVar, String[] strArr) {
                this.a = bVar;
                this.b = strArr;
                super(1);
            }

            /* JADX WARNING: Missing block: B:9:0x003d, code skipped:
            defpackage.akax.a(r3, r0);
     */
            public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                /*
                r2 = this;
                r3 = (com.snap.core.db.api.DbTransaction) r3;
                r0 = "it";
                defpackage.akcr.b(r3, r0);
                r3 = r2.a;
                r3 = r3.a;
                r3 = r3.c;
                r0 = r2.b;
                r1 = "ids";
                defpackage.akcr.b(r0, r1);
                r1 = r3.a;
                r1.throwIfNotDbScheduler();
                r3 = r3.a;
                r1 = com.snap.core.db.record.FeedRecord.FACTORY;
                r0 = r1.deleteLocalTemporaryGroupsExcept(r0);
                r1 = "FeedRecord.FACTORY.delet…emporaryGroupsExcept(ids)";
                defpackage.akcr.a(r0, r1);
                r3 = r3.query(r0);
                r3 = (java.io.Closeable) r3;
                r0 = 0;
                r1 = r3;
                r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x003b }
                r1.getCount();	 Catch:{ Throwable -> 0x003b }
                defpackage.akax.a(r3, r0);
                r3 = defpackage.ajxw.a;
                return r3;
            L_0x0039:
                r1 = move-exception;
                goto L_0x003d;
            L_0x003b:
                r0 = move-exception;
                throw r0;	 Catch:{ all -> 0x0039 }
            L_0x003d:
                defpackage.akax.a(r3, r0);
                throw r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rhs$b$1.invoke(java.lang.Object):java.lang.Object");
            }
        }

        public b(rhs rhs) {
            this.a = rhs;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x008f in {5, 11, 13, 17, 19} preds:[]
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
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r4) {
            /*
            r3 = this;
            r4 = (defpackage.rgw) r4;
            r0 = "it";
            defpackage.akcr.b(r4, r0);
            r4 = r4.a;
            r4 = r4.a;
            r4 = (java.lang.Iterable) r4;
            r4 = defpackage.ajyu.k(r4);
            r4 = (java.lang.Iterable) r4;
            r0 = new java.util.ArrayList;
            r0.<init>();
            r0 = (java.util.Collection) r0;
            r4 = r4.iterator();
            r1 = r4.hasNext();
            if (r1 == 0) goto L_0x0033;
            r1 = r4.next();
            r2 = r1;
            r2 = (defpackage.rhn) r2;
            r2 = r2 instanceof defpackage.rhi;
            if (r2 == 0) goto L_0x001e;
            r0.add(r1);
            goto L_0x001e;
            r0 = (java.util.List) r0;
            r0 = (java.lang.Iterable) r0;
            r4 = new java.util.ArrayList;
            r1 = 10;
            r1 = defpackage.ajyn.a(r0, r1);
            r4.<init>(r1);
            r4 = (java.util.Collection) r4;
            r0 = r0.iterator();
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x0066;
            r1 = r0.next();
            r1 = (defpackage.rhn) r1;
            if (r1 == 0) goto L_0x005e;
            r1 = (defpackage.rhi) r1;
            r1 = r1.a;
            r4.add(r1);
            goto L_0x0048;
            r4 = new ajxt;
            r0 = "null cannot be cast to non-null type com.snap.messaging.sendto.api.ui.model.MischiefRecipient";
            r4.<init>(r0);
            throw r4;
            r4 = (java.util.List) r4;
            r4 = (java.util.Collection) r4;
            r0 = 0;
            r0 = new java.lang.String[r0];
            r4 = r4.toArray(r0);
            if (r4 == 0) goto L_0x0087;
            r4 = (java.lang.String[]) r4;
            r0 = r3.a;
            r0 = r0.b;
            r1 = new rhs$b$1;
            r1.<init>(r3, r4);
            r1 = (defpackage.akbl) r1;
            r4 = "SendToLocalGroupsManager:handleUnusedLocalGroupsForSuccessfulSendToSession";
            r4 = r0.runInTransaction(r4, r1);
            return r4;
            r4 = new ajxt;
            r0 = "null cannot be cast to non-null type kotlin.Array<T>";
            r4.<init>(r0);
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rhs$b.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: rhs$a */
    static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ rhs a;

        a(rhs rhs) {
            this.a = rhs;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((DbTransaction) obj, "it");
            quk quk = this.a.c;
            quk.a.throwIfNotDbScheduler();
            quk.a.executeUpdateDelete((DeleteLocalTemporaryGroups) quk.b.b());
            return ajxw.a;
        }
    }

    /* renamed from: rhs$c */
    public static final class c extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ rhs a;
        private /* synthetic */ String b;

        public c(rhs rhs, String str) {
            this.a = rhs;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((DbTransaction) obj, "it");
            this.a.d.a(this.a.c.b(this.b), this.a.f.a());
            return ajxw.a;
        }
    }

    public rhs(zgb zgb, SnapDb snapDb, quk quk, qvd qvd, ajei ajei, ihh ihh) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(snapDb, "snapDb");
        akcr.b(quk, "conversationRepository");
        akcr.b(qvd, "messagingRepository");
        akcr.b(ajei, "userSessionDisposable");
        akcr.b(ihh, "clock");
        this.c = quk;
        this.d = qvd;
        this.e = ajei;
        this.f = ihh;
        this.b = snapDb.getDbClient(this.g);
    }

    public final void a() {
        ajej e = this.b.runInTransaction("SendToLocalGroupsManager:handleUnusedLocalGroupsForCancelledSendToSession", new a(this)).b((ajdw) this.a.m()).e();
        akcr.a((Object) e, "dbClient.runInTransactio…abaseWrite()).subscribe()");
        ajvv.a(e, this.e);
    }
}
