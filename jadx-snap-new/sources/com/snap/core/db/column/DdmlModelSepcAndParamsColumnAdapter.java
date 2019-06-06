package com.snap.core.db.column;

import com.google.protobuf.nano.MessageNano;
import defpackage.adsy;
import defpackage.ainu;
import defpackage.akcr;

public final class DdmlModelSepcAndParamsColumnAdapter implements ainu<adsy, byte[]> {
    public final adsy decode(byte[] bArr) {
        akcr.b(bArr, "databaseValue");
        Object a = adsy.a(bArr);
        akcr.a(a, "DdmlModelSpecAndParams.parseFrom(databaseValue)");
        return a;
    }

    public final byte[] encode(adsy adsy) {
        akcr.b(adsy, "ddmlModelSpecAndParams");
        Object toByteArray = MessageNano.toByteArray(adsy);
        akcr.a(toByteArray, "DdmlModelSpecAndParams.t…y(ddmlModelSpecAndParams)");
        return toByteArray;
    }
}
