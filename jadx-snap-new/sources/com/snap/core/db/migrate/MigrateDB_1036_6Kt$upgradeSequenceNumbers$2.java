package com.snap.core.db.migrate;

import defpackage.akbl;
import defpackage.akcs;

final class MigrateDB_1036_6Kt$upgradeSequenceNumbers$2 extends akcs implements akbl<Long, String> {
    public static final MigrateDB_1036_6Kt$upgradeSequenceNumbers$2 INSTANCE = new MigrateDB_1036_6Kt$upgradeSequenceNumbers$2();

    MigrateDB_1036_6Kt$upgradeSequenceNumbers$2() {
        super(1);
    }

    public final String invoke(Long l) {
        return l == null ? "null" : String.valueOf(l.longValue());
    }
}
