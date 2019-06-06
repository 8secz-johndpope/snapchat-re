package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.Callable;

final /* synthetic */ class zzagv implements Callable {
    private final zzagu zzdcd;
    private final Context zzdce;

    zzagv(zzagu zzagu, Context context) {
        this.zzdcd = zzagu;
        this.zzdce = context;
    }

    public final Object call() {
        return this.zzdcd.zzab(this.zzdce);
    }
}
