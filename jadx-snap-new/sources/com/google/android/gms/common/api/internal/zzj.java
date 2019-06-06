package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.iv;
import java.util.Map;
import java.util.Set;

public final class zzj {
    private final iv<zzh<?>, ConnectionResult> zzfse = new iv();
    private final iv<zzh<?>, String> zzfuk = new iv();
    private final TaskCompletionSource<Map<zzh<?>, String>> zzful = new TaskCompletionSource();
    private int zzfum;
    private boolean zzfun = false;

    public zzj(Iterable<? extends GoogleApi<?>> iterable) {
        for (GoogleApi zzahv : iterable) {
            this.zzfse.put(zzahv.zzahv(), null);
        }
        this.zzfum = this.zzfse.keySet().size();
    }

    public final Task<Map<zzh<?>, String>> getTask() {
        return this.zzful.getTask();
    }

    public final void zza(zzh<?> zzh, ConnectionResult connectionResult, String str) {
        this.zzfse.put(zzh, connectionResult);
        this.zzfuk.put(zzh, str);
        this.zzfum--;
        if (!connectionResult.isSuccess()) {
            this.zzfun = true;
        }
        if (this.zzfum == 0) {
            if (this.zzfun) {
                this.zzful.setException(new AvailabilityException(this.zzfse));
                return;
            }
            this.zzful.setResult(this.zzfuk);
        }
    }

    public final Set<zzh<?>> zzaii() {
        return this.zzfse.keySet();
    }
}
