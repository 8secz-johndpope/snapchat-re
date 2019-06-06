package com.snap.core.db;

import android.content.Context;
import com.google.common.base.Supplier;
import com.snap.core.db.api.DbSchema;
import defpackage.gqr;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$SqliteDbManager$aSXcRouj9kFt01g3ShrBGQWfVKA implements Supplier {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ DbSchema f$1;
    private final /* synthetic */ gqr f$2;

    public /* synthetic */ -$$Lambda$SqliteDbManager$aSXcRouj9kFt01g3ShrBGQWfVKA(Context context, DbSchema dbSchema, gqr gqr) {
        this.f$0 = context;
        this.f$1 = dbSchema;
        this.f$2 = gqr;
    }

    public final Object get() {
        return SqliteDbManager.lambda$new$0(this.f$0, this.f$1, this.f$2);
    }
}
