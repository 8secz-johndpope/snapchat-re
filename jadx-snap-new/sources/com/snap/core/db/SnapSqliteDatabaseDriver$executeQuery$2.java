package com.snap.core.db;

import defpackage.ainn;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;

final class SnapSqliteDatabaseDriver$executeQuery$2 extends akcq implements akbl<AndroidStatement, ainn> {
    public static final SnapSqliteDatabaseDriver$executeQuery$2 INSTANCE = new SnapSqliteDatabaseDriver$executeQuery$2();

    SnapSqliteDatabaseDriver$executeQuery$2() {
        super(1);
    }

    public final String getName() {
        return "executeQuery";
    }

    public final akej getOwner() {
        return akde.a(AndroidStatement.class);
    }

    public final String getSignature() {
        return "executeQuery()Lcom/squareup/sqldelight/db/SqlCursor;";
    }

    public final ainn invoke(AndroidStatement androidStatement) {
        akcr.b(androidStatement, "p1");
        return androidStatement.executeQuery();
    }
}
