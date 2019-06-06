package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzan;
import com.google.android.gms.common.internal.zzj;
import java.util.Set;

final class zzbu implements zzcy, zzj {
    private Set<Scope> zzenh = null;
    private final zzh<?> zzfsn;
    private final zze zzfwd;
    private zzan zzfxp = null;
    final /* synthetic */ zzbm zzfzq;
    private boolean zzgad = false;

    public zzbu(zzbm zzbm, zze zze, zzh<?> zzh) {
        this.zzfzq = zzbm;
        this.zzfwd = zze;
        this.zzfsn = zzh;
    }

    private final void zzakp() {
        if (this.zzgad) {
            zzan zzan = this.zzfxp;
            if (zzan != null) {
                this.zzfwd.zza(zzan, this.zzenh);
            }
        }
    }

    public final void zzb(zzan zzan, Set<Scope> set) {
        if (zzan == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            zzh(new ConnectionResult(4));
            return;
        }
        this.zzfxp = zzan;
        this.zzenh = set;
        zzakp();
    }

    public final void zzf(ConnectionResult connectionResult) {
        this.zzfzq.mHandler.post(new zzbv(this, connectionResult));
    }

    public final void zzh(ConnectionResult connectionResult) {
        ((zzbo) this.zzfzq.zzfwg.get(this.zzfsn)).zzh(connectionResult);
    }
}
