package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class zze extends zzi<Boolean> {
    private int statusCode;
    private Bundle zzgfj;
    private /* synthetic */ zzd zzgfk;

    protected zze(zzd zzd, int i, Bundle bundle) {
        this.zzgfk = zzd;
        super(zzd, Boolean.TRUE);
        this.statusCode = i;
        this.zzgfj = bundle;
    }

    public abstract boolean zzama();

    /* Access modifiers changed, original: protected|final */
    public final void zzamb() {
    }

    public abstract void zzj(ConnectionResult connectionResult);

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void zzw(Object obj) {
        PendingIntent pendingIntent = null;
        if (((Boolean) obj) == null) {
            this.zzgfk.zza(1, null);
            return;
        }
        int i = this.statusCode;
        if (i != 0) {
            if (i != 10) {
                this.zzgfk.zza(1, null);
                Bundle bundle = this.zzgfj;
                if (bundle != null) {
                    pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                }
                zzj(new ConnectionResult(this.statusCode, pendingIntent));
            } else {
                this.zzgfk.zza(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
        } else if (!zzama()) {
            this.zzgfk.zza(1, null);
            zzj(new ConnectionResult(8, null));
        }
    }
}
