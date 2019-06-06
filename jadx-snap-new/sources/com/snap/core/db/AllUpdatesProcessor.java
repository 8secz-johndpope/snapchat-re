package com.snap.core.db;

import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import defpackage.aecy;

public interface AllUpdatesProcessor {
    void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction);
}
