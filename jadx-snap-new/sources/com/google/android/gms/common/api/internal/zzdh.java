package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.zzbq;
import java.lang.ref.WeakReference;

public final class zzdh<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    private final Object zzfvc;
    private final WeakReference<GoogleApiClient> zzfve;
    private ResultTransform<? super R, ? extends Result> zzgbh;
    private zzdh<? extends Result> zzgbi;
    private volatile ResultCallbacks<? super R> zzgbj;
    private PendingResult<R> zzgbk;
    private Status zzgbl;
    private final zzdj zzgbm;
    private boolean zzgbn;

    private final void zzala() {
        if (this.zzgbh != null || this.zzgbj != null) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.zzfve.get();
            if (!(this.zzgbn || this.zzgbh == null || googleApiClient == null)) {
                googleApiClient.zza(this);
                this.zzgbn = true;
            }
            Status status = this.zzgbl;
            if (status != null) {
                zzx(status);
                return;
            }
            PendingResult pendingResult = this.zzgbk;
            if (pendingResult != null) {
                pendingResult.setResultCallback(this);
            }
        }
    }

    private final boolean zzalc() {
        return (this.zzgbj == null || ((GoogleApiClient) this.zzfve.get()) == null) ? false : true;
    }

    private static void zzd(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(result);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                stringBuilder.append("Unable to release ");
                stringBuilder.append(valueOf);
                Log.w("TransformedResultImpl", stringBuilder.toString(), e);
            }
        }
    }

    private final void zzd(Status status) {
        synchronized (this.zzfvc) {
            this.zzgbl = status;
            zzx(this.zzgbl);
        }
    }

    private final void zzx(Status status) {
        synchronized (this.zzfvc) {
            if (this.zzgbh != null) {
                status = this.zzgbh.onFailure(status);
                zzbq.checkNotNull(status, "onFailure must not return null");
                this.zzgbi.zzd(status);
            } else if (zzalc()) {
                this.zzgbj.onFailure(status);
            }
        }
    }

    public final void onResult(R r) {
        synchronized (this.zzfvc) {
            if (!r.getStatus().isSuccess()) {
                zzd(r.getStatus());
                zzd((Result) r);
            } else if (this.zzgbh != null) {
                zzcs.zzajx().submit(new zzdi(this, r));
            } else if (zzalc()) {
                this.zzgbj.onSuccess(r);
            }
        }
    }

    public final void zza(PendingResult<?> pendingResult) {
        synchronized (this.zzfvc) {
            this.zzgbk = pendingResult;
            zzala();
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzalb() {
        this.zzgbj = null;
    }
}
