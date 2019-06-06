package com.snap.core.db.record;

import com.snap.core.db.column.UnlockMechanism;
import com.snapchat.soju.android.Geofence;
import defpackage.akce;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class UnlockablesRecord$Companion$SIMPLE_UNLOCKABLE_MAPPER$1 extends akcq implements akce<Long, UnlockMechanism, Geofence, Long, Boolean, Boolean, byte[], AutoValue_UnlockablesRecord_SimpleUnlockable> {
    public static final UnlockablesRecord$Companion$SIMPLE_UNLOCKABLE_MAPPER$1 INSTANCE = new UnlockablesRecord$Companion$SIMPLE_UNLOCKABLE_MAPPER$1();

    UnlockablesRecord$Companion$SIMPLE_UNLOCKABLE_MAPPER$1() {
        super(7);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_UnlockablesRecord_SimpleUnlockable.class);
    }

    public final String getSignature() {
        return "<init>(JLcom/snap/core/db/column/UnlockMechanism;Lcom/snapchat/soju/android/Geofence;Ljava/lang/Long;ZZ[B)V";
    }

    public final AutoValue_UnlockablesRecord_SimpleUnlockable invoke(long j, UnlockMechanism unlockMechanism, Geofence geofence, Long l, boolean z, boolean z2, byte[] bArr) {
        return new AutoValue_UnlockablesRecord_SimpleUnlockable(j, unlockMechanism, geofence, l, z, z2, bArr);
    }
}
