package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.internal.zzbz;

public abstract class zzm<R extends Result, A extends zzb> extends BasePendingResult<R> implements zzn<R> {
    private final Api<?> zzfop;
    private final zzc<A> zzfus;

    protected zzm(Api<?> api, GoogleApiClient googleApiClient) {
        super((GoogleApiClient) zzbq.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
        zzbq.checkNotNull(api, "Api must not be null");
        this.zzfus = api.zzahm();
        this.zzfop = api;
    }

    private final void zzc(RemoteException remoteException) {
        zzu(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }

    public abstract void zza(A a);

    public final zzc<A> zzahm() {
        return this.zzfus;
    }

    public final Api<?> zzaht() {
        return this.zzfop;
    }

    public final void zzb(A a) {
        zzb a2;
        if (a2 instanceof zzbz) {
            a2 = zzbz.zzanb();
        }
        try {
            zza(a2);
        } catch (DeadObjectException e) {
            zzc(e);
            throw e;
        } catch (RemoteException e2) {
            zzc(e2);
        }
    }

    public final void zzu(Status status) {
        zzbq.checkArgument(status.isSuccess() ^ 1, "Failed result must not be success");
        setResult(zzb(status));
    }
}
