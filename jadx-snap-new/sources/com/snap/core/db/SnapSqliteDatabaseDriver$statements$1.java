package com.snap.core.db;

import android.util.LruCache;
import defpackage.akcr;

public final class SnapSqliteDatabaseDriver$statements$1 extends LruCache<Integer, AndroidStatement> {
    final /* synthetic */ SnapSqliteDatabaseDriver this$0;

    SnapSqliteDatabaseDriver$statements$1(SnapSqliteDatabaseDriver snapSqliteDatabaseDriver, int i) {
        this.this$0 = snapSqliteDatabaseDriver;
        super(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void entryRemoved(boolean z, int i, AndroidStatement androidStatement, AndroidStatement androidStatement2) {
        akcr.b(androidStatement, "oldValue");
        if (z) {
            androidStatement.close();
        }
    }
}
