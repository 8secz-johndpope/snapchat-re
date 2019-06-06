package com.snap.core.db.record;

import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.column.UnlockMechanism;
import com.snap.core.db.record.UnlockablesModel.SelectByTypeCreator;
import com.snap.core.db.record.UnlockablesModel.SelectByTypeModel;
import com.snapchat.soju.android.Geofence;
import defpackage.akcf;
import defpackage.akcr;

final class UnlockablesRecord$sam$com_snap_core_db_record_UnlockablesModel_SelectByTypeCreator$0 implements SelectByTypeCreator {
    private final /* synthetic */ akcf function;

    UnlockablesRecord$sam$com_snap_core_db_record_UnlockablesModel_SelectByTypeCreator$0(akcf akcf) {
        this.function = akcf;
    }

    public final /* synthetic */ SelectByTypeModel create(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, Geofence geofence, Long l, byte[] bArr, long j2, byte[] bArr2) {
        PersistableUnlockableType persistableUnlockableType2 = persistableUnlockableType;
        akcr.b(persistableUnlockableType, "type");
        UnlockMechanism unlockMechanism2 = unlockMechanism;
        akcr.b(unlockMechanism, UnlockablesModel.UNLOCKMECHANISM);
        Object obj = bArr;
        akcr.b(obj, UnlockablesModel.DATA);
        return (SelectByTypeModel) this.function.invoke(Long.valueOf(j), persistableUnlockableType2, unlockMechanism2, geofence, l, obj, Long.valueOf(j2), bArr2);
    }
}
