package com.snap.core.db.column;

import com.google.protobuf.nano.MessageNano;
import defpackage.acgp;
import defpackage.ainu;
import defpackage.akcr;

public final class UploadLocationColumnAdapter implements ainu<acgp, byte[]> {
    public final acgp decode(byte[] bArr) {
        Object a = acgp.a(bArr);
        akcr.a(a, "UploadLocation.parseFrom(databaseValue)");
        return a;
    }

    public final byte[] encode(acgp acgp) {
        akcr.b(acgp, "value");
        Object toByteArray = MessageNano.toByteArray(acgp);
        akcr.a(toByteArray, "UploadLocation.toByteArray(value)");
        return toByteArray;
    }
}
