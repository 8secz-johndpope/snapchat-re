package com.snap.core.db;

import com.google.common.base.Optional;
import defpackage.ainb;
import defpackage.ajdp;
import defpackage.akcr;

public final class QueryRxExtensionKt {
    public static final <T> ajdp<Optional<T>> mapValueToOptional(ajdp<ainb<T>> ajdp) {
        akcr.b(ajdp, "receiver$0");
        return ajdp.p(QueryRxExtensionKt$mapValueToOptional$1.INSTANCE);
    }
}
