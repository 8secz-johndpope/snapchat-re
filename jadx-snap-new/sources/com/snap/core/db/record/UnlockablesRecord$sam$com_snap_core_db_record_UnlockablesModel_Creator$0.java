package com.snap.core.db.record;

import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.column.UnlockMechanism;
import com.snap.core.db.record.UnlockablesModel.Creator;
import com.snapchat.soju.android.Geofence;
import defpackage.akbp;
import defpackage.akcr;

final class UnlockablesRecord$sam$com_snap_core_db_record_UnlockablesModel_Creator$0 implements Creator {
    private final /* synthetic */ akbp function;

    UnlockablesRecord$sam$com_snap_core_db_record_UnlockablesModel_Creator$0(akbp akbp) {
        this.function = akbp;
    }

    public final /* synthetic */ UnlockablesModel create(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, byte[] bArr, long j2, boolean z, boolean z2, Geofence geofence, Long l, long j3, int i, boolean z3, byte[] bArr2) {
        PersistableUnlockableType persistableUnlockableType2 = persistableUnlockableType;
        akcr.b(persistableUnlockableType2, "type");
        UnlockMechanism unlockMechanism2 = unlockMechanism;
        akcr.b(unlockMechanism2, UnlockablesModel.UNLOCKMECHANISM);
        Object obj = bArr;
        akcr.b(obj, UnlockablesModel.DATA);
        return (UnlockablesModel) this.function.invoke(Long.valueOf(j), persistableUnlockableType2, unlockMechanism2, obj, Long.valueOf(j2), Boolean.valueOf(z), Boolean.valueOf(z2), geofence, l, Long.valueOf(j3), Integer.valueOf(i), Boolean.valueOf(z3), bArr2);
    }
}
