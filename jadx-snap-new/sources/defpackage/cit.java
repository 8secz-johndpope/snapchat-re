package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import java.util.Set;

/* renamed from: cit */
public final class cit implements AllUpdatesProcessor {
    private final ajwy<cij> a;
    private final abqo b;
    private final ajwy<ilv> c;
    private final Set<cin> d;

    public cit(ajwy<cij> ajwy, abqo abqo, ajwy<ilv> ajwy2, Set<cin> set) {
        akcr.b(ajwy, "adUserDataStoreProvider");
        akcr.b(abqo, "clock");
        akcr.b(ajwy2, "graphene");
        akcr.b(set, "adInfoUpdateProcessorSet");
        this.a = ajwy;
        this.b = abqo;
        this.c = ajwy2;
        this.d = set;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:48:0x0112 in {6, 7, 9, 14, 19, 24, 29, 34, 39, 44, 45, 47} preds:[]
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
    public final void applyUpdates(defpackage.aecy r9, com.snap.core.db.api.SnapDb r10, com.snap.core.db.api.DbTransaction r11) {
        /*
        r8 = this;
        r0 = "updates";
        defpackage.akcr.b(r9, r0);
        r0 = "database";
        defpackage.akcr.b(r10, r0);
        r0 = "tx";
        defpackage.akcr.b(r11, r0);
        r0 = r9.c;	 Catch:{ all -> 0x0110 }
        if (r0 == 0) goto L_0x00f7;	 Catch:{ all -> 0x0110 }
        r1 = r8.a;	 Catch:{ all -> 0x0110 }
        r1 = r1.get();	 Catch:{ all -> 0x0110 }
        r1 = (defpackage.cij) r1;	 Catch:{ all -> 0x0110 }
        r1 = r1.e();	 Catch:{ all -> 0x0110 }
        r3 = defpackage.abqo.a();	 Catch:{ all -> 0x0110 }
        r3 = r3 - r1;	 Catch:{ all -> 0x0110 }
        r1 = (double) r3;	 Catch:{ all -> 0x0110 }
        r1 = java.lang.Math.log(r1);	 Catch:{ all -> 0x0110 }
        r3 = defpackage.akdm.a;	 Catch:{ all -> 0x0110 }
        r1 = r1 / r3;	 Catch:{ all -> 0x0110 }
        r3 = r8.a;	 Catch:{ all -> 0x0110 }
        r3 = r3.get();	 Catch:{ all -> 0x0110 }
        r3 = (defpackage.cij) r3;	 Catch:{ all -> 0x0110 }
        r3 = r3.f();	 Catch:{ all -> 0x0110 }
        r5 = r8.c;	 Catch:{ all -> 0x0110 }
        r5 = r5.get();	 Catch:{ all -> 0x0110 }
        r5 = (defpackage.ilv) r5;	 Catch:{ all -> 0x0110 }
        r6 = defpackage.inm.RAW_USER_DATA_TTL;	 Catch:{ all -> 0x0110 }
        r7 = "ttl_millis";	 Catch:{ all -> 0x0110 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0110 }
        r3 = r6.a(r7, r3);	 Catch:{ all -> 0x0110 }
        r5.c(r3, 1);	 Catch:{ all -> 0x0110 }
        r3 = r8.c;	 Catch:{ all -> 0x0110 }
        r3 = r3.get();	 Catch:{ all -> 0x0110 }
        r3 = (defpackage.ilv) r3;	 Catch:{ all -> 0x0110 }
        r4 = defpackage.inm.RAW_USER_DATA_STORE_TIME;	 Catch:{ all -> 0x0110 }
        r4 = (defpackage.ily) r4;	 Catch:{ all -> 0x0110 }
        r1 = (long) r1;	 Catch:{ all -> 0x0110 }
        r3.b(r4, r1);	 Catch:{ all -> 0x0110 }
        r1 = "updatesResponse";	 Catch:{ all -> 0x0110 }
        defpackage.akcr.b(r0, r1);	 Catch:{ all -> 0x0110 }
        r1 = r0.bb;	 Catch:{ all -> 0x0110 }
        if (r1 == 0) goto L_0x006b;	 Catch:{ all -> 0x0110 }
        r1 = r1.f;	 Catch:{ all -> 0x0110 }
        goto L_0x006c;	 Catch:{ all -> 0x0110 }
        r1 = 0;	 Catch:{ all -> 0x0110 }
        if (r1 != 0) goto L_0x007d;	 Catch:{ all -> 0x0110 }
        r1 = r8.c;	 Catch:{ all -> 0x0110 }
        r1 = r1.get();	 Catch:{ all -> 0x0110 }
        r1 = (defpackage.ilv) r1;	 Catch:{ all -> 0x0110 }
        r2 = defpackage.inm.EMPTY_RAW_USER_DATA;	 Catch:{ all -> 0x0110 }
        r2 = (defpackage.ily) r2;	 Catch:{ all -> 0x0110 }
        r1.c(r2, 1);	 Catch:{ all -> 0x0110 }
        r1 = r0.bb;	 Catch:{ all -> 0x0110 }
        if (r1 == 0) goto L_0x0090;	 Catch:{ all -> 0x0110 }
        r1 = r1.f;	 Catch:{ all -> 0x0110 }
        if (r1 == 0) goto L_0x0090;	 Catch:{ all -> 0x0110 }
        r2 = r8.a;	 Catch:{ all -> 0x0110 }
        r2 = r2.get();	 Catch:{ all -> 0x0110 }
        r2 = (defpackage.cij) r2;	 Catch:{ all -> 0x0110 }
        r2.b(r1);	 Catch:{ all -> 0x0110 }
        r1 = r0.bb;	 Catch:{ all -> 0x0110 }
        if (r1 == 0) goto L_0x00a3;	 Catch:{ all -> 0x0110 }
        r1 = r1.b;	 Catch:{ all -> 0x0110 }
        if (r1 == 0) goto L_0x00a3;	 Catch:{ all -> 0x0110 }
        r2 = r8.a;	 Catch:{ all -> 0x0110 }
        r2 = r2.get();	 Catch:{ all -> 0x0110 }
        r2 = (defpackage.cij) r2;	 Catch:{ all -> 0x0110 }
        r2.a(r1);	 Catch:{ all -> 0x0110 }
        r1 = r0.bb;	 Catch:{ all -> 0x0110 }
        if (r1 == 0) goto L_0x00b6;	 Catch:{ all -> 0x0110 }
        r1 = r1.a;	 Catch:{ all -> 0x0110 }
        if (r1 == 0) goto L_0x00b6;	 Catch:{ all -> 0x0110 }
        r2 = r8.a;	 Catch:{ all -> 0x0110 }
        r2 = r2.get();	 Catch:{ all -> 0x0110 }
        r2 = (defpackage.cij) r2;	 Catch:{ all -> 0x0110 }
        r2.c(r1);	 Catch:{ all -> 0x0110 }
        r1 = r0.bb;	 Catch:{ all -> 0x0110 }
        if (r1 == 0) goto L_0x00c9;	 Catch:{ all -> 0x0110 }
        r1 = r1.d;	 Catch:{ all -> 0x0110 }
        if (r1 == 0) goto L_0x00c9;	 Catch:{ all -> 0x0110 }
        r2 = r8.a;	 Catch:{ all -> 0x0110 }
        r2 = r2.get();	 Catch:{ all -> 0x0110 }
        r2 = (defpackage.cij) r2;	 Catch:{ all -> 0x0110 }
        r2.d(r1);	 Catch:{ all -> 0x0110 }
        r1 = r0.ai;	 Catch:{ all -> 0x0110 }
        if (r1 == 0) goto L_0x00e0;	 Catch:{ all -> 0x0110 }
        r1 = r1.a;	 Catch:{ all -> 0x0110 }
        if (r1 == 0) goto L_0x00e0;	 Catch:{ all -> 0x0110 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0110 }
        r2 = r8.a;	 Catch:{ all -> 0x0110 }
        r2 = r2.get();	 Catch:{ all -> 0x0110 }
        r2 = (defpackage.cij) r2;	 Catch:{ all -> 0x0110 }
        r2.a(r1);	 Catch:{ all -> 0x0110 }
        r0 = r0.ai;	 Catch:{ all -> 0x0110 }
        if (r0 == 0) goto L_0x00f7;	 Catch:{ all -> 0x0110 }
        r0 = r0.b;	 Catch:{ all -> 0x0110 }
        if (r0 == 0) goto L_0x00f7;	 Catch:{ all -> 0x0110 }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0110 }
        r1 = r8.a;	 Catch:{ all -> 0x0110 }
        r1 = r1.get();	 Catch:{ all -> 0x0110 }
        r1 = (defpackage.cij) r1;	 Catch:{ all -> 0x0110 }
        r1.b(r0);	 Catch:{ all -> 0x0110 }
        r0 = r8.d;	 Catch:{ all -> 0x0110 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0110 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0110 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0110 }
        if (r1 == 0) goto L_0x010f;	 Catch:{ all -> 0x0110 }
        r1 = r0.next();	 Catch:{ all -> 0x0110 }
        r1 = (defpackage.cin) r1;	 Catch:{ all -> 0x0110 }
        r1.a(r9, r10, r11);	 Catch:{ all -> 0x0110 }
        goto L_0x00ff;
        return;
        r9 = move-exception;
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cit.applyUpdates(aecy, com.snap.core.db.api.SnapDb, com.snap.core.db.api.DbTransaction):void");
    }
}
