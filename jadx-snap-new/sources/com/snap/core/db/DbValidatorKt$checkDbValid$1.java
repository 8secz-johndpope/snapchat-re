package com.snap.core.db;

import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajfc;
import defpackage.akcr;

final class DbValidatorKt$checkDbValid$1<T, R> implements ajfc<Throwable, ajdt<? extends T>> {
    final /* synthetic */ Object $defaultValue;
    final /* synthetic */ boolean $isValid;

    DbValidatorKt$checkDbValid$1(boolean z, Object obj) {
        this.$isValid = z;
        this.$defaultValue = obj;
    }

    public final ajdt<? extends T> apply(Throwable th) {
        akcr.b(th, "t");
        return this.$isValid ? ajdp.b(th) : ajdp.b(this.$defaultValue);
    }
}
