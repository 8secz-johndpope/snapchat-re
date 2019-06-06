package com.snap.core.db.record;

import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.column.UnlockMechanism;
import com.snapchat.soju.android.Geofence;
import defpackage.akbp;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class UnlockablesRecord$Companion$FACTORY$1 extends akcq implements akbp<Long, PersistableUnlockableType, UnlockMechanism, byte[], Long, Boolean, Boolean, Geofence, Long, Long, Integer, Boolean, byte[], AutoValue_UnlockablesRecord> {
    public static final UnlockablesRecord$Companion$FACTORY$1 INSTANCE = new UnlockablesRecord$Companion$FACTORY$1();

    UnlockablesRecord$Companion$FACTORY$1() {
        super(13);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_UnlockablesRecord.class);
    }

    public final String getSignature() {
        return "<init>(JLcom/snap/core/db/column/PersistableUnlockableType;Lcom/snap/core/db/column/UnlockMechanism;[BJZZLcom/snapchat/soju/android/Geofence;Ljava/lang/Long;JIZ[B)V";
    }

    public final AutoValue_UnlockablesRecord invoke(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, byte[] bArr, long j2, boolean z, boolean z2, Geofence geofence, Long l, long j3, int i, boolean z3, byte[] bArr2) {
        return new AutoValue_UnlockablesRecord(j, persistableUnlockableType, unlockMechanism, bArr, j2, z, z2, geofence, l, j3, i, z3, bArr2);
    }
}
