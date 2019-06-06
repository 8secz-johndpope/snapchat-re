package com.snap.core.db;

import com.snap.core.db.api.TransactionTracker.TrackingToken;
import defpackage.akbl;
import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$SqliteDbManager$C-7Bp60dHdtlsg3yse5ruh3bpdE implements Callable {
    private final /* synthetic */ SqliteDbManager f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ TrackingToken f$2;
    private final /* synthetic */ akbl f$3;

    public /* synthetic */ -$$Lambda$SqliteDbManager$C-7Bp60dHdtlsg3yse5ruh3bpdE(SqliteDbManager sqliteDbManager, String str, TrackingToken trackingToken, akbl akbl) {
        this.f$0 = sqliteDbManager;
        this.f$1 = str;
        this.f$2 = trackingToken;
        this.f$3 = akbl;
    }

    public final Object call() {
        return this.f$0.lambda$scheduleCallInTransaction$11$SqliteDbManager(this.f$1, this.f$2, this.f$3);
    }
}
