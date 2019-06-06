package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzbq;

final class zzp {
    private final int zzfuv;
    private final ConnectionResult zzfuw;

    zzp(ConnectionResult connectionResult, int i) {
        zzbq.checkNotNull(connectionResult);
        this.zzfuw = connectionResult;
        this.zzfuv = i;
    }

    /* Access modifiers changed, original: final */
    public final int zzaim() {
        return this.zzfuv;
    }

    /* Access modifiers changed, original: final */
    public final ConnectionResult zzain() {
        return this.zzfuw;
    }
}
