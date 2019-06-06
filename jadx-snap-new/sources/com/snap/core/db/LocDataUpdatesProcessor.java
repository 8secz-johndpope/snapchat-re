package com.snap.core.db;

import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import defpackage.aerc;

public interface LocDataUpdatesProcessor {
    void applyUpdates(aerc aerc, SnapDb snapDb, DbTransaction dbTransaction);
}
