package com.snap.core.db.column;

import defpackage.ainu;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.iha;

public final class DdmlRecordColumnAdapter implements ainu<DdmlRecord, String> {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(DdmlRecordColumnAdapter.class), "serializationHelper", "getSerializationHelper()Lcom/snap/framework/serialization/SerializationHelper;")};
    private final DdmlRecordColumnAdapter$ddmlRecord$1 ddmlRecord = new DdmlRecordColumnAdapter$ddmlRecord$1();
    private final ajxe serializationHelper$delegate = ajxh.a(DdmlRecordColumnAdapter$serializationHelper$2.INSTANCE);

    private final iha getSerializationHelper() {
        return (iha) this.serializationHelper$delegate.b();
    }

    public final DdmlRecord decode(String str) {
        akcr.b(str, "databaseValue");
        Object a = getSerializationHelper().a(str, this.ddmlRecord.getType());
        akcr.a(a, "serializationHelper.from…seValue, ddmlRecord.type)");
        return (DdmlRecord) a;
    }

    public final String encode(DdmlRecord ddmlRecord) {
        akcr.b(ddmlRecord, "ddmlRecord");
        Object b = getSerializationHelper().b(ddmlRecord);
        akcr.a(b, "serializationHelper.toJsonString(ddmlRecord)");
        return b;
    }
}
