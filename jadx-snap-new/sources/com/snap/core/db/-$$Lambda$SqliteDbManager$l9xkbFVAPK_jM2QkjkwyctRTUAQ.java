package com.snap.core.db;

import com.snap.core.db.api.TransactionTracker.TrackingToken;
import defpackage.akbl;
import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$SqliteDbManager$l9xkbFVAPK_jM2QkjkwyctRTUAQ implements Callable {
    private final /* synthetic */ SqliteDbManager f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ akbl f$2;
    private final /* synthetic */ TrackingToken f$3;

    public /* synthetic */ -$$Lambda$SqliteDbManager$l9xkbFVAPK_jM2QkjkwyctRTUAQ(SqliteDbManager sqliteDbManager, String str, akbl akbl, TrackingToken trackingToken) {
        this.f$0 = sqliteDbManager;
        this.f$1 = str;
        this.f$2 = akbl;
        this.f$3 = trackingToken;
    }

    public final Object call() {
        return this.f$0.lambda$callInTransaction$9$SqliteDbManager(this.f$1, this.f$2, this.f$3);
    }
}
