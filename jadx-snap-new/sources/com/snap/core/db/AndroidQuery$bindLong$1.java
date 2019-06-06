package com.snap.core.db;

import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.pc;

final class AndroidQuery$bindLong$1 extends akcs implements akbl<pc, ajxw> {
    final /* synthetic */ int $index;
    final /* synthetic */ Long $long;

    AndroidQuery$bindLong$1(Long l, int i) {
        this.$long = l;
        this.$index = i;
        super(1);
    }

    public final void invoke(pc pcVar) {
        akcr.b(pcVar, "it");
        Long l = this.$long;
        if (l == null) {
            pcVar.bindNull(this.$index);
        } else {
            pcVar.bindLong(this.$index, l.longValue());
        }
    }
}
