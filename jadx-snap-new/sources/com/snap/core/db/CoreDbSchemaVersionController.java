package com.snap.core.db;

import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.DbSchemaVersionController;
import defpackage.akcr;
import defpackage.pa;

public final class CoreDbSchemaVersionController extends DbSchemaVersionController {
    public CoreDbSchemaVersionController(DbSchema dbSchema) {
        akcr.b(dbSchema, "schema");
        super(dbSchema);
    }

    public final void upgrade(pa paVar, int i, int i2) {
        akcr.b(paVar, "db");
        if (i != i2 && i2 <= 3) {
            reset(paVar);
        }
    }
}
