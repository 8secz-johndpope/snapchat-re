package com.snap.core.db;

import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.pc;

final class AndroidQuery$bindBytes$1 extends akcs implements akbl<pc, ajxw> {
    final /* synthetic */ byte[] $bytes;
    final /* synthetic */ int $index;

    AndroidQuery$bindBytes$1(byte[] bArr, int i) {
        this.$bytes = bArr;
        this.$index = i;
        super(1);
    }

    public final void invoke(pc pcVar) {
        akcr.b(pcVar, "it");
        byte[] bArr = this.$bytes;
        if (bArr == null) {
            pcVar.bindNull(this.$index);
        } else {
            pcVar.bindBlob(this.$index, bArr);
        }
    }
}
