package com.snap.core.db.api;

import defpackage.akco;
import defpackage.akcr;
import defpackage.gqr;
import defpackage.pa;
import defpackage.pb.a;

public final class SnapDbSQLiteOpenCallback extends a {
    public static final Companion Companion = new Companion();
    private static final String TAG = "SnapDbSqliteOpenCallback";
    private final gqr exceptionTracker;
    private final DbSchema schema;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public SnapDbSQLiteOpenCallback(DbSchema dbSchema, gqr gqr) {
        akcr.b(dbSchema, "schema");
        akcr.b(gqr, "exceptionTracker");
        super(dbSchema.getVersion());
        this.schema = dbSchema;
        this.exceptionTracker = gqr;
    }

    public final void onConfigure(pa paVar) {
        akcr.b(paVar, "db");
        paVar.a(false);
    }

    public final void onCreate(pa paVar) {
        akcr.b(paVar, "db");
        this.schema.getSchemaVersionController().create(paVar);
    }

    public final void onDowngrade(pa paVar, int i, int i2) {
        akcr.b(paVar, "db");
        this.schema.getSchemaVersionController().reset(paVar);
    }

    public final void onUpgrade(pa paVar, int i, int i2) {
        akcr.b(paVar, "db");
        this.schema.getSchemaVersionController().onUpgrade(this.exceptionTracker, paVar, i, i2);
    }
}
