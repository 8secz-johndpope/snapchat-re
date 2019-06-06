package com.snap.core.db;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbManager;
import defpackage.akcr;
import defpackage.ide;

public abstract class BaseRepository {
    private final DbClient dbClient;
    private final String name;

    public BaseRepository(ide ide, DbManager dbManager) {
        akcr.b(ide, "feature");
        akcr.b(dbManager, "dbManager");
        Object dbClient = dbManager.getDbClient(ide);
        akcr.a(dbClient, "dbManager.getDbClient(feature)");
        this.dbClient = dbClient;
        this.name = ide.getName();
    }

    public final DbClient getDbClient() {
        return this.dbClient;
    }
}
