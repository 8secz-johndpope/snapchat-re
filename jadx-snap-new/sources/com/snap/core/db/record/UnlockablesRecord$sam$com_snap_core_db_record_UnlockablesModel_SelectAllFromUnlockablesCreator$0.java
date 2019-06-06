package com.snap.core.db.record;

import com.snap.core.db.column.UnlockMechanism;
import com.snap.core.db.record.UnlockablesModel.SelectAllFromUnlockablesCreator;
import com.snap.core.db.record.UnlockablesModel.SelectAllFromUnlockablesModel;
import com.snapchat.soju.android.Geofence;
import defpackage.akce;
import defpackage.akcr;

final class UnlockablesRecord$sam$com_snap_core_db_record_UnlockablesModel_SelectAllFromUnlockablesCreator$0 implements SelectAllFromUnlockablesCreator {
    private final /* synthetic */ akce function;

    UnlockablesRecord$sam$com_snap_core_db_record_UnlockablesModel_SelectAllFromUnlockablesCreator$0(akce akce) {
        this.function = akce;
    }

    public final /* synthetic */ SelectAllFromUnlockablesModel create(long j, UnlockMechanism unlockMechanism, Geofence geofence, Long l, boolean z, boolean z2, byte[] bArr) {
        UnlockMechanism unlockMechanism2 = unlockMechanism;
        akcr.b(unlockMechanism, UnlockablesModel.UNLOCKMECHANISM);
        return (SelectAllFromUnlockablesModel) this.function.invoke(Long.valueOf(j), unlockMechanism2, geofence, l, Boolean.valueOf(z), Boolean.valueOf(z2), bArr);
    }
}
