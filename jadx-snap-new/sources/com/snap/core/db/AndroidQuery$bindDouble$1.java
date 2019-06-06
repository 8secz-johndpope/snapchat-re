package com.snap.core.db;

import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.pc;

final class AndroidQuery$bindDouble$1 extends akcs implements akbl<pc, ajxw> {
    final /* synthetic */ Double $double;
    final /* synthetic */ int $index;

    AndroidQuery$bindDouble$1(Double d, int i) {
        this.$double = d;
        this.$index = i;
        super(1);
    }

    public final void invoke(pc pcVar) {
        akcr.b(pcVar, "it");
        Double d = this.$double;
        if (d == null) {
            pcVar.bindNull(this.$index);
        } else {
            pcVar.bindDouble(this.$index, d.doubleValue());
        }
    }
}
