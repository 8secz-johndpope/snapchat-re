package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzbb;
import com.google.android.gms.common.util.zzs;

@zzabh
public final class zzzm {
    public static zzajb zza(Context context, zza zza, zzahe zzahe, zzcv zzcv, zzaof zzaof, zzwf zzwf, zzzn zzzn, zzov zzov) {
        Object zzzr;
        zzacj zzacj = zzahe.zzdcw;
        if (zzacj.zzcto) {
            zzzs zzzs = new zzzs(context, zzahe, zzwf, zzzn, zzov, zzaof);
        } else if (!zzacj.zzbid && !(zza instanceof zzbb)) {
            zzzr = (((Boolean) zzlc.zzio().zzd(zzoi.zzboa)).booleanValue() && zzs.zzanv() && !zzs.zzanx() && zzaof != null && zzaof.zzty().zzvl()) ? new zzzr(context, zzahe, zzaof, zzzn) : new zzzo(context, zzahe, zzaof, zzzn);
        } else if (zzacj.zzbid && (zza instanceof zzbb)) {
            zzzu zzzu = new zzzu(context, (zzbb) zza, zzahe, zzcv, zzzn, zzov);
        } else {
            zzzr = new zzzp(zzahe, zzzn);
        }
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(zzzr.getClass().getName());
        zzaky.zzby(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        zzzr.zzns();
        return zzzr;
    }
}
