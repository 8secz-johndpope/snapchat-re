package com.snap.core.db;

import defpackage.ajdp;
import defpackage.akcr;

public final class DbValidatorKt {
    public static final <T> ajdp<T> checkDbValid(ajdp<T> ajdp, T t, boolean z) {
        akcr.b(ajdp, "receiver$0");
        Object q = ajdp.q(new DbValidatorKt$checkDbValid$1(z, t));
        akcr.a(q, "this.onErrorResumeNext {….just(defaultValue)\n    }");
        return q;
    }
}
