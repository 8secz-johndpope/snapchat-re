package com.snap.core.db;

import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajfc;
import defpackage.akcr;

final class SnapSqlDelightDbManager$runInTransaction$2<T, R> implements ajfc<ajcx, ajdb> {
    public static final SnapSqlDelightDbManager$runInTransaction$2 INSTANCE = new SnapSqlDelightDbManager$runInTransaction$2();

    SnapSqlDelightDbManager$runInTransaction$2() {
    }

    public final ajcx apply(ajcx ajcx) {
        akcr.b(ajcx, "completable");
        return ajcx;
    }
}
