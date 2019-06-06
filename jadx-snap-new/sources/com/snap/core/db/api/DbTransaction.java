package com.snap.core.db.api;

import com.google.common.collect.Lists;
import defpackage.aimv.c;
import defpackage.ajfb;
import defpackage.akco;
import defpackage.akcr;
import defpackage.igb;
import defpackage.ihh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class DbTransaction implements c {
    public static final Companion Companion = new Companion();
    private static final int MAX_TRANSACTION_END_STAGES = 2;
    private final c briteTransaction;
    private final ihh clock;
    private final DbLogger dbLogger;
    private long endTimeMillis = -1;
    private final igb noDiskExceptionDetector;
    private final String queryTag;
    private ArrayList<ajfb<DbTransaction>> runAfterEnd = Lists.newArrayList();
    private final long startTimeMillis = this.clock.a();
    private final long submittedTimeMillis;
    private int transactionEndStage;
    private TransactionState transactionState = TransactionState.RUNNING;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public enum TransactionState {
        RUNNING,
        POST_TRANSACTION,
        FINISHED
    }

    public DbTransaction(c cVar, String str, long j, ihh ihh, DbLogger dbLogger, igb igb) {
        akcr.b(cVar, "briteTransaction");
        akcr.b(str, "queryTag");
        akcr.b(ihh, "clock");
        akcr.b(dbLogger, "dbLogger");
        akcr.b(igb, "noDiskExceptionDetector");
        this.briteTransaction = cVar;
        this.queryTag = str;
        this.submittedTimeMillis = j;
        this.clock = ihh;
        this.dbLogger = dbLogger;
        this.noDiskExceptionDetector = igb;
    }

    private final void doPostTransactionEnd() {
        this.transactionState = TransactionState.POST_TRANSACTION;
        while (!this.runAfterEnd.isEmpty()) {
            this.transactionEndStage++;
            ArrayList arrayList = this.runAfterEnd;
            this.runAfterEnd = Lists.newArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ajfb) it.next()).accept(this);
            }
        }
        this.dbLogger.logLongRunningDbExecutionIfNeeded(this.queryTag, this.endTimeMillis - this.startTimeMillis);
    }

    public final void checkInTransaction() {
        if (this.transactionState != TransactionState.RUNNING) {
            StringBuilder stringBuilder = new StringBuilder("Transaction in inconsistent state: ");
            stringBuilder.append(this.transactionState);
            stringBuilder.append(", transactionSubmitTime: ");
            stringBuilder.append(this.submittedTimeMillis);
            stringBuilder.append(", transactionStartTime: ");
            stringBuilder.append(this.startTimeMillis);
            stringBuilder.append(", transactionEndTime: ");
            stringBuilder.append(this.endTimeMillis);
            stringBuilder.append(", transactionEndStage: ");
            stringBuilder.append(this.transactionEndStage);
            stringBuilder.append(", query: ");
            stringBuilder.append(this.queryTag);
            stringBuilder.append(", currentTime: ");
            stringBuilder.append(this.clock.a());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void close() {
        end();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0036 in {1, 3, 10, 12, 14} preds:[]
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
    public final void end() {
        /*
        r3 = this;
        r0 = r3.briteTransaction;	 Catch:{ Exception -> 0x0017 }
        r0.end();	 Catch:{ Exception -> 0x0017 }
        r0 = r3.clock;	 Catch:{ Exception -> 0x0017 }
        r0 = r0.a();	 Catch:{ Exception -> 0x0017 }
        r3.endTimeMillis = r0;	 Catch:{ Exception -> 0x0017 }
        r3.doPostTransactionEnd();
        r0 = com.snap.core.db.api.DbTransaction.TransactionState.FINISHED;
        r3.transactionState = r0;
        return;
        r0 = move-exception;
        goto L_0x002e;
        r0 = move-exception;
        r1 = r3.noDiskExceptionDetector;	 Catch:{ all -> 0x0015 }
        r2 = r0;	 Catch:{ all -> 0x0015 }
        r2 = (java.lang.Throwable) r2;	 Catch:{ all -> 0x0015 }
        r1 = r1.b(r2);	 Catch:{ all -> 0x0015 }
        if (r1 == 0) goto L_0x002b;	 Catch:{ all -> 0x0015 }
        r1 = r3.noDiskExceptionDetector;	 Catch:{ all -> 0x0015 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x0015 }
        r1.a(r0);	 Catch:{ all -> 0x0015 }
        goto L_0x000d;	 Catch:{ all -> 0x0015 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x0015 }
        throw r0;	 Catch:{ all -> 0x0015 }
        r3.doPostTransactionEnd();
        r1 = com.snap.core.db.api.DbTransaction.TransactionState.FINISHED;
        r3.transactionState = r1;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.api.DbTransaction.end():void");
    }

    public final TransactionState getState() {
        return this.transactionState;
    }

    public final void markSuccessful() {
        this.briteTransaction.markSuccessful();
    }

    public final void runAfter(ajfb<DbTransaction> ajfb) {
        akcr.b(ajfb, "funcToRun");
        if (this.transactionState == TransactionState.FINISHED) {
            throw new RuntimeException("Trying to access a transaction which is already finished");
        } else if (this.transactionEndStage < 2) {
            this.runAfterEnd.add(ajfb);
        } else {
            throw new RuntimeException("Adding a runAfter with too many levels of recursion");
        }
    }

    public final boolean yieldIfContendedSafely() {
        return this.briteTransaction.yieldIfContendedSafely();
    }

    public final boolean yieldIfContendedSafely(long j, TimeUnit timeUnit) {
        akcr.b(timeUnit, "timeUnit");
        return this.briteTransaction.yieldIfContendedSafely(j, timeUnit);
    }
}
