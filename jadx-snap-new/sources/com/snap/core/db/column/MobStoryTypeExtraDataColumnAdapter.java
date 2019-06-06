package com.snap.core.db.column;

import defpackage.agec;
import defpackage.ainu;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.iha;

public final class MobStoryTypeExtraDataColumnAdapter implements ainu<agec, byte[]> {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(MobStoryTypeExtraDataColumnAdapter.class), "serializationHelper", "getSerializationHelper()Lcom/snap/framework/serialization/SerializationHelper;")};
    private final ajxe serializationHelper$delegate = ajxh.a(MobStoryTypeExtraDataColumnAdapter$serializationHelper$2.INSTANCE);

    private final iha getSerializationHelper() {
        return (iha) this.serializationHelper$delegate.b();
    }

    /* JADX WARNING: Missing block: B:10:0x0025, code skipped:
            defpackage.akax.a(r0, r5);
     */
    public final defpackage.agec decode(byte[] r5) {
        /*
        r4 = this;
        if (r5 == 0) goto L_0x0029;
    L_0x0002:
        r0 = new java.io.ByteArrayInputStream;
        r0.<init>(r5);
        r0 = (java.io.Closeable) r0;
        r5 = 0;
        r1 = r0;
        r1 = (java.io.ByteArrayInputStream) r1;	 Catch:{ Throwable -> 0x0023 }
        r2 = r4.getSerializationHelper();	 Catch:{ Throwable -> 0x0023 }
        r1 = (java.io.InputStream) r1;	 Catch:{ Throwable -> 0x0023 }
        r3 = defpackage.agec.class;
        r1 = r2.a(r1, r3);	 Catch:{ Throwable -> 0x0023 }
        r1 = (defpackage.agec) r1;	 Catch:{ Throwable -> 0x0023 }
        defpackage.akax.a(r0, r5);
        if (r1 != 0) goto L_0x002e;
    L_0x0020:
        goto L_0x0029;
    L_0x0021:
        r1 = move-exception;
        goto L_0x0025;
    L_0x0023:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0021 }
    L_0x0025:
        defpackage.akax.a(r0, r5);
        throw r1;
    L_0x0029:
        r1 = new agec;
        r1.<init>();
    L_0x002e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.column.MobStoryTypeExtraDataColumnAdapter.decode(byte[]):agec");
    }

    public final byte[] encode(agec agec) {
        akcr.b(agec, "mobStoryTypeExtraData");
        Object a = getSerializationHelper().a((Object) agec);
        akcr.a(a, "serializationHelper.toJson(mobStoryTypeExtraData)");
        return a;
    }
}
