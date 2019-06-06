package com.snap.core.db.migrate;

import com.snap.core.db.record.ContactModel;
import defpackage.akcr;
import defpackage.pa;

public final class MigrateDb_1033_12Kt {
    public static final void updateContactTableSchema(pa paVar) {
        akcr.b(paVar, "db");
        paVar.a();
        try {
            paVar.c("ALTER TABLE Contact ADD COLUMN added INTEGER DEFAULT 0 NOT NULL");
            paVar.c("ALTER TABLE Contact RENAME TO old_Contact");
            paVar.c(ContactModel.CREATE_TABLE);
            paVar.c("INSERT INTO Contact SELECT * FROM old_Contact");
            paVar.c("DROP TABLE old_Contact");
            paVar.d();
        } finally {
            paVar.c();
        }
    }
}
