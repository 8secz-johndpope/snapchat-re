package com.snap.core.db.column;

import com.google.protobuf.nano.MessageNano;
import defpackage.adsh;
import defpackage.aina;
import defpackage.akcr;

public final class SqlDelightDataConsumptionBlobAdapter implements aina<adsh, byte[]> {
    public final adsh decode(byte[] bArr) {
        akcr.b(bArr, "databaseValue");
        Object a = adsh.a(bArr);
        akcr.a(a, "DataConsumptionBlob.parseFrom(databaseValue)");
        return a;
    }

    public final byte[] encode(adsh adsh) {
        akcr.b(adsh, "blob");
        Object toByteArray = MessageNano.toByteArray(adsh);
        akcr.a(toByteArray, "DataConsumptionBlob.toByteArray(blob)");
        return toByteArray;
    }
}
