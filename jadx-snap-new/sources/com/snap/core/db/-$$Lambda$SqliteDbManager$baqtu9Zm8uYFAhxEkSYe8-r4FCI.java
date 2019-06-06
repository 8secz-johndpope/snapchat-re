package com.snap.core.db;

import com.snap.core.db.api.TransactionTracker.TrackingToken;
import defpackage.ajev;
import defpackage.ajfb;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$SqliteDbManager$baqtu9Zm8uYFAhxEkSYe8-r4FCI implements ajev {
    private final /* synthetic */ SqliteDbManager f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ int f$2;
    private final /* synthetic */ TrackingToken f$3;
    private final /* synthetic */ ajfb f$4;

    public /* synthetic */ -$$Lambda$SqliteDbManager$baqtu9Zm8uYFAhxEkSYe8-r4FCI(SqliteDbManager sqliteDbManager, String str, int i, TrackingToken trackingToken, ajfb ajfb) {
        this.f$0 = sqliteDbManager;
        this.f$1 = str;
        this.f$2 = i;
        this.f$3 = trackingToken;
        this.f$4 = ajfb;
    }

    public final void run() {
        this.f$0.lambda$scheduleRunInTransaction$7$SqliteDbManager(this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
