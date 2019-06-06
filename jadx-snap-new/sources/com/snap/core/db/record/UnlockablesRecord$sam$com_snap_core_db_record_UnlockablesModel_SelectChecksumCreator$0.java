package com.snap.core.db.record;

import com.snap.core.db.record.UnlockablesModel.SelectChecksumCreator;
import com.snap.core.db.record.UnlockablesModel.SelectChecksumModel;
import defpackage.akbw;

final class UnlockablesRecord$sam$com_snap_core_db_record_UnlockablesModel_SelectChecksumCreator$0 implements SelectChecksumCreator {
    private final /* synthetic */ akbw function;

    UnlockablesRecord$sam$com_snap_core_db_record_UnlockablesModel_SelectChecksumCreator$0(akbw akbw) {
        this.function = akbw;
    }

    public final /* synthetic */ SelectChecksumModel create(long j, byte[] bArr) {
        return (SelectChecksumModel) this.function.invoke(Long.valueOf(j), bArr);
    }
}
