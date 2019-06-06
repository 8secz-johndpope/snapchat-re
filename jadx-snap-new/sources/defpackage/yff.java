package defpackage;

import com.snap.core.db.api.DbSchemaVersionController;

/* renamed from: yff */
public final class yff extends DbSchemaVersionController {
    public yff(yfi yfi) {
        akcr.b(yfi, "schema");
        super(yfi);
    }

    public final void upgrade(pa paVar, int i, int i2) {
        akcr.b(paVar, "db");
        if (i < 3) {
            reset(paVar);
        }
    }
}
