package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbm;
import com.google.android.gms.ads.internal.zzv;

@zzabh
public final class zzaol {
    public static zzalt<zzaof> zza(Context context, zzala zzala, String str, zzcv zzcv, zzv zzv) {
        return zzali.zza(zzali.zzh(null), new zzaom(context, zzcv, zzala, zzv, str), zzaly.zzdjt);
    }

    public final zzaof zza(Context context, zzaqa zzaqa, String str, boolean z, boolean z2, zzcv zzcv, zzala zzala, zzov zzov, zzbm zzbm, zzv zzv, zziu zziu) {
        zzoi.initialize(context);
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbov)).booleanValue()) {
            return zzaqc.zza(context, zzaqa, str, z2, z, zzcv, zzala, zzov, zzbm, zzv, zziu);
        }
        try {
            zzaoo zzaoo = new zzaoo(this, context, zzaqa, str, z, z2, zzcv, zzala, zzov, zzbm, zzv, zziu);
            Context context2 = context;
            return (zzaof) zzakg.zzb(context, zzaoo);
        } catch (Throwable th) {
            zzaop zzaop = new zzaop("Webview initialization failed.", th);
        }
    }
}
