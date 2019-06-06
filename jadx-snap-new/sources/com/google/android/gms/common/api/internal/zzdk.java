package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzdk {
    public static final Status zzgbq = new Status(8, "The connection to Google Play services was lost");
    private static final BasePendingResult<?>[] zzgbr = new BasePendingResult[0];
    private final Map<zzc<?>, zze> zzfyj;
    final Set<BasePendingResult<?>> zzgbs = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final zzdn zzgbt = new zzdl(this);

    public zzdk(Map<zzc<?>, zze> map) {
        this.zzfyj = map;
    }

    public final void release() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zzgbs.toArray(zzgbr)) {
            zzdn zzdn = null;
            basePendingResult.zza(zzdn);
            if (basePendingResult.zzaid() != null) {
                basePendingResult.setResultCallback(zzdn);
                IBinder zzaho = ((zze) this.zzfyj.get(((zzm) basePendingResult).zzahm())).zzaho();
                if (basePendingResult.isReady()) {
                    basePendingResult.zza(new zzdm(basePendingResult, zzdn, zzaho, zzdn));
                } else {
                    if (zzaho == null || !zzaho.isBinderAlive()) {
                        basePendingResult.zza(zzdn);
                    } else {
                        zzdn zzdm = new zzdm(basePendingResult, zzdn, zzaho, zzdn);
                        basePendingResult.zza(zzdm);
                        try {
                            zzaho.linkToDeath(zzdm, 0);
                        } catch (RemoteException unused) {
                        }
                    }
                    basePendingResult.cancel();
                    zzdn.remove(basePendingResult.zzaid().intValue());
                }
            } else if (!basePendingResult.zzaip()) {
            }
            this.zzgbs.remove(basePendingResult);
        }
    }

    public final void zzald() {
        for (BasePendingResult zzv : (BasePendingResult[]) this.zzgbs.toArray(zzgbr)) {
            zzv.zzv(zzgbq);
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzb(BasePendingResult<? extends Result> basePendingResult) {
        this.zzgbs.add(basePendingResult);
        basePendingResult.zza(this.zzgbt);
    }
}
