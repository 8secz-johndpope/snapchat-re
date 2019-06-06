package com.snap.core.db.record;

import com.snap.core.db.record.CharmsOwnerMetadataModel.Creator;
import defpackage.akcb;
import defpackage.akcr;

final class CharmsOwnerMetadataRecord$sam$com_snap_core_db_record_CharmsOwnerMetadataModel_Creator$0 implements Creator {
    private final /* synthetic */ akcb function;

    CharmsOwnerMetadataRecord$sam$com_snap_core_db_record_CharmsOwnerMetadataModel_Creator$0(akcb akcb) {
        this.function = akcb;
    }

    public final /* synthetic */ CharmsOwnerMetadataModel create(long j, String str, byte[] bArr, long j2) {
        akcr.b(str, "ownerId");
        akcr.b(bArr, CharmsOwnerMetadataModel.SYNCTOKEN);
        return (CharmsOwnerMetadataModel) this.function.invoke(Long.valueOf(j), str, bArr, Long.valueOf(j2));
    }
}
