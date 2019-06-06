package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class zzcq<A extends zzb, L> {
    private final zzci<L> zzgbb;

    public final void zzaky() {
        this.zzgbb.clear();
    }

    public abstract void zzb(A a, TaskCompletionSource<Void> taskCompletionSource);
}
