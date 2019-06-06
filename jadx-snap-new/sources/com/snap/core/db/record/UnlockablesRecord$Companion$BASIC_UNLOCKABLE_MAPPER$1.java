package com.snap.core.db.record;

import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.column.UnlockMechanism;
import com.snapchat.soju.android.Geofence;
import defpackage.akcf;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class UnlockablesRecord$Companion$BASIC_UNLOCKABLE_MAPPER$1 extends akcq implements akcf<Long, PersistableUnlockableType, UnlockMechanism, Geofence, Long, byte[], Long, byte[], AutoValue_UnlockablesRecord_BasicUnlockable> {
    public static final UnlockablesRecord$Companion$BASIC_UNLOCKABLE_MAPPER$1 INSTANCE = new UnlockablesRecord$Companion$BASIC_UNLOCKABLE_MAPPER$1();

    UnlockablesRecord$Companion$BASIC_UNLOCKABLE_MAPPER$1() {
        super(8);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_UnlockablesRecord_BasicUnlockable.class);
    }

    public final String getSignature() {
        return "<init>(JLcom/snap/core/db/column/PersistableUnlockableType;Lcom/snap/core/db/column/UnlockMechanism;Lcom/snapchat/soju/android/Geofence;Ljava/lang/Long;[BJ[B)V";
    }

    public final AutoValue_UnlockablesRecord_BasicUnlockable invoke(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, Geofence geofence, Long l, byte[] bArr, long j2, byte[] bArr2) {
        return new AutoValue_UnlockablesRecord_BasicUnlockable(j, persistableUnlockableType, unlockMechanism, geofence, l, bArr, j2, bArr2);
    }
}
