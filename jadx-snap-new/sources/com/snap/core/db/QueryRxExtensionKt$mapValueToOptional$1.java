package com.snap.core.db;

import com.google.common.base.Optional;
import defpackage.ainb;
import defpackage.ajfc;
import defpackage.akcr;

final class QueryRxExtensionKt$mapValueToOptional$1<T, R> implements ajfc<T, R> {
    public static final QueryRxExtensionKt$mapValueToOptional$1 INSTANCE = new QueryRxExtensionKt$mapValueToOptional$1();

    QueryRxExtensionKt$mapValueToOptional$1() {
    }

    public final Optional<T> apply(ainb<? extends T> ainb) {
        akcr.b(ainb, "it");
        return Optional.fromNullable(ainb.e());
    }
}
