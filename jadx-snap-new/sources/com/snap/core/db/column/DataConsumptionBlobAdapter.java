package com.snap.core.db.column;

import com.google.protobuf.nano.MessageNano;
import defpackage.adsh;
import defpackage.ainu;
import defpackage.akcr;

public final class DataConsumptionBlobAdapter implements ainu<adsh, byte[]> {
    public final adsh decode(byte[] bArr) {
        Object a = adsh.a(bArr);
        akcr.a(a, "DataConsumptionBlob.parseFrom(p0)");
        return a;
    }

    public final byte[] encode(adsh adsh) {
        akcr.b(adsh, "p0");
        Object toByteArray = MessageNano.toByteArray(adsh);
        akcr.a(toByteArray, "DataConsumptionBlob.toByteArray(p0)");
        return toByteArray;
    }
}
