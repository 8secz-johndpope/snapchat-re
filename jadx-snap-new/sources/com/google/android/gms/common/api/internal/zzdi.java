package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;

final class zzdi implements Runnable {
    private /* synthetic */ Result zzgbo;
    private /* synthetic */ zzdh zzgbp;

    zzdi(zzdh zzdh, Result result) {
        this.zzgbp = zzdh;
        this.zzgbo = result;
    }

    public final void run() {
        GoogleApiClient googleApiClient;
        try {
            BasePendingResult.zzfvb.set(Boolean.TRUE);
            this.zzgbp.zzgbm.sendMessage(this.zzgbp.zzgbm.obtainMessage(0, this.zzgbp.zzgbh.onSuccess(this.zzgbo)));
            BasePendingResult.zzfvb.set(Boolean.FALSE);
            zzdh.zzd(this.zzgbo);
            googleApiClient = (GoogleApiClient) this.zzgbp.zzfve.get();
            if (googleApiClient != null) {
                googleApiClient.zzb(this.zzgbp);
            }
        } catch (RuntimeException e) {
            this.zzgbp.zzgbm.sendMessage(this.zzgbp.zzgbm.obtainMessage(1, e));
            BasePendingResult.zzfvb.set(Boolean.FALSE);
            zzdh.zzd(this.zzgbo);
            googleApiClient = (GoogleApiClient) this.zzgbp.zzfve.get();
            if (googleApiClient != null) {
                googleApiClient.zzb(this.zzgbp);
            }
        } catch (Throwable th) {
            BasePendingResult.zzfvb.set(Boolean.FALSE);
            zzdh.zzd(this.zzgbo);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.zzgbp.zzfve.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zzb(this.zzgbp);
            }
            throw th;
        }
    }
}
