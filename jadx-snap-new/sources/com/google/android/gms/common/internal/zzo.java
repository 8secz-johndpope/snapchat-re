package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class zzo extends zze {
    private /* synthetic */ zzd zzgfk;

    public zzo(zzd zzd, int i, Bundle bundle) {
        this.zzgfk = zzd;
        super(zzd, i, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzama() {
        this.zzgfk.zzgew.zzf(ConnectionResult.zzfqt);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzj(ConnectionResult connectionResult) {
        this.zzgfk.zzgew.zzf(connectionResult);
        this.zzgfk.onConnectionFailed(connectionResult);
    }
}
