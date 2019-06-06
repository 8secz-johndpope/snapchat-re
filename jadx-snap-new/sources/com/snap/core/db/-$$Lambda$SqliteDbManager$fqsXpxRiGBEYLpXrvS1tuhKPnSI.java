package com.snap.core.db;

import com.snap.core.db.api.TransactionTracker.TrackingToken;
import defpackage.ajfb;
import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$SqliteDbManager$fqsXpxRiGBEYLpXrvS1tuhKPnSI implements Callable {
    private final /* synthetic */ SqliteDbManager f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ ajfb f$2;
    private final /* synthetic */ TrackingToken f$3;

    public /* synthetic */ -$$Lambda$SqliteDbManager$fqsXpxRiGBEYLpXrvS1tuhKPnSI(SqliteDbManager sqliteDbManager, String str, ajfb ajfb, TrackingToken trackingToken) {
        this.f$0 = sqliteDbManager;
        this.f$1 = str;
        this.f$2 = ajfb;
        this.f$3 = trackingToken;
    }

    public final Object call() {
        return this.f$0.lambda$runInTransaction$5$SqliteDbManager(this.f$1, this.f$2, this.f$3);
    }
}
