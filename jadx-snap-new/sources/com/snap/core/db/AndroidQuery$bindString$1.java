package com.snap.core.db;

import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.pc;

final class AndroidQuery$bindString$1 extends akcs implements akbl<pc, ajxw> {
    final /* synthetic */ int $index;
    final /* synthetic */ String $string;

    AndroidQuery$bindString$1(String str, int i) {
        this.$string = str;
        this.$index = i;
        super(1);
    }

    public final void invoke(pc pcVar) {
        akcr.b(pcVar, "it");
        String str = this.$string;
        if (str == null) {
            pcVar.bindNull(this.$index);
        } else {
            pcVar.bindString(this.$index, str);
        }
    }
}
