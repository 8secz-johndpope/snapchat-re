package com.snap.core.db;

import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajfc;
import defpackage.akcr;

final class SnapSqlDelightDbManager$callInTransaction$2<T, R> implements ajfc<T, ajeb<? extends R>> {
    public static final SnapSqlDelightDbManager$callInTransaction$2 INSTANCE = new SnapSqlDelightDbManager$callInTransaction$2();

    SnapSqlDelightDbManager$callInTransaction$2() {
    }

    public final ajdx<TValue> apply(ajdx<TValue> ajdx) {
        akcr.b(ajdx, "single");
        return ajdx;
    }
}
