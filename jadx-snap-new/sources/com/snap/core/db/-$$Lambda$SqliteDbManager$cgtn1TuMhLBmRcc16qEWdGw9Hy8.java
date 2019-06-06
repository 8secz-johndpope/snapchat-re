package com.snap.core.db;

import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.TransactionTracker.TrackingToken;
import defpackage.ajfb;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$SqliteDbManager$cgtn1TuMhLBmRcc16qEWdGw9Hy8 implements ajfb {
    private final /* synthetic */ SqliteDbManager f$0;
    private final /* synthetic */ DbTransaction f$1;
    private final /* synthetic */ TrackingToken f$2;

    public /* synthetic */ -$$Lambda$SqliteDbManager$cgtn1TuMhLBmRcc16qEWdGw9Hy8(SqliteDbManager sqliteDbManager, DbTransaction dbTransaction, TrackingToken trackingToken) {
        this.f$0 = sqliteDbManager;
        this.f$1 = dbTransaction;
        this.f$2 = trackingToken;
    }

    public final void accept(Object obj) {
        this.f$0.lambda$newTransaction$2$SqliteDbManager(this.f$1, this.f$2, (DbTransaction) obj);
    }
}
