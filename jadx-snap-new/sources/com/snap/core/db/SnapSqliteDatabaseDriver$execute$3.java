package com.snap.core.db;

import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;

final class SnapSqliteDatabaseDriver$execute$3 extends akcq implements akbl<AndroidStatement, ajxw> {
    public static final SnapSqliteDatabaseDriver$execute$3 INSTANCE = new SnapSqliteDatabaseDriver$execute$3();

    SnapSqliteDatabaseDriver$execute$3() {
        super(1);
    }

    public final String getName() {
        return "execute";
    }

    public final akej getOwner() {
        return akde.a(AndroidStatement.class);
    }

    public final String getSignature() {
        return "execute()V";
    }

    public final void invoke(AndroidStatement androidStatement) {
        akcr.b(androidStatement, "p1");
        androidStatement.execute();
    }
}
