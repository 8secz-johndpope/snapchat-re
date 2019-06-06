package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzak;
import com.google.android.gms.ads.internal.zzv;

@zzabh
public final class zztk {
    private final Context mContext;
    private final zzv zzanp;
    private final zzwf zzanu;
    private final zzala zzapq;

    zztk(Context context, zzwf zzwf, zzala zzala, zzv zzv) {
        this.mContext = context;
        this.zzanu = zzwf;
        this.zzapq = zzala;
        this.zzanp = zzv;
    }

    public final Context getApplicationContext() {
        return this.mContext.getApplicationContext();
    }

    public final zzak zzav(String str) {
        return new zzak(this.mContext, new zzko(), str, this.zzanu, this.zzapq, this.zzanp);
    }

    public final zzak zzaw(String str) {
        return new zzak(this.mContext.getApplicationContext(), new zzko(), str, this.zzanu, this.zzapq, this.zzanp);
    }

    public final zztk zzlf() {
        return new zztk(this.mContext.getApplicationContext(), this.zzanu, this.zzapq, this.zzanp);
    }
}
