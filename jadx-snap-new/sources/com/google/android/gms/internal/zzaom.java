package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzv;

final /* synthetic */ class zzaom implements zzald {
    private final zzcv zzcfn;
    private final Context zzdpw;
    private final zzala zzdpx;
    private final zzv zzdpy;
    private final String zzdpz;

    zzaom(Context context, zzcv zzcv, zzala zzala, zzv zzv, String str) {
        this.zzdpw = context;
        this.zzcfn = zzcv;
        this.zzdpx = zzala;
        this.zzdpy = zzv;
        this.zzdpz = str;
    }

    public final zzalt zzc(Object obj) {
        Context context = this.zzdpw;
        zzcv zzcv = this.zzcfn;
        zzala zzala = this.zzdpx;
        zzv zzv = this.zzdpy;
        String str = this.zzdpz;
        zzaof zza = zzbt.zzem().zza(context, zzaqa.zzvj(), "", false, false, zzcv, zzala, null, null, zzv, zziu.zzhp());
        zzamc zzi = zzamc.zzi(zza);
        zza.zzua().zza(new zzaon(zzi));
        zza.loadUrl(str);
        return zzi;
    }
}
