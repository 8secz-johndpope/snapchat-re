package com.snap.core.db.record;

import defpackage.akbw;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class UnlockablesRecord$Companion$UNLOCKABLE_CHECKSUM_MAPPER$1 extends akcq implements akbw<Long, byte[], AutoValue_UnlockablesRecord_UnlockableChecksum> {
    public static final UnlockablesRecord$Companion$UNLOCKABLE_CHECKSUM_MAPPER$1 INSTANCE = new UnlockablesRecord$Companion$UNLOCKABLE_CHECKSUM_MAPPER$1();

    UnlockablesRecord$Companion$UNLOCKABLE_CHECKSUM_MAPPER$1() {
        super(2);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_UnlockablesRecord_UnlockableChecksum.class);
    }

    public final String getSignature() {
        return "<init>(J[B)V";
    }

    public final AutoValue_UnlockablesRecord_UnlockableChecksum invoke(long j, byte[] bArr) {
        return new AutoValue_UnlockablesRecord_UnlockableChecksum(j, bArr);
    }
}
