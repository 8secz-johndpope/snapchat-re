package com.google.android.gms.internal;

import android.content.Context;
import java.io.File;
import java.util.Map;

@zzabh
public final class zzajr {
    private static zzv zzdha;
    private static final Object zzdhb = new Object();
    @Deprecated
    private static zzajx<Void> zzdhc = new zzajs();

    public zzajr(Context context) {
        zzay(context);
    }

    private static zzv zzay(Context context) {
        zzv zzax;
        synchronized (zzdhb) {
            if (zzdha == null) {
                context = context.getApplicationContext();
                zzoi.initialize(context);
                if (((Boolean) zzlc.zzio().zzd(zzoi.zzbul)).booleanValue()) {
                    zzax = zzajl.zzax(context);
                } else {
                    zzax = new zzv(new zzam(new File(context.getCacheDir(), "volley")), new zzaj(new zzas()));
                    zzax.start();
                }
                zzdha = zzax;
            }
            zzax = zzdha;
        }
        return zzax;
    }

    public final zzalt<String> zza(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        zzajy zzajy = new zzajy();
        zzajv zzajv = new zzajv(this, str2, zzajy);
        zzaks zzaks = new zzaks(null);
        zzajw zzajw = new zzajw(this, i, str, zzajy, zzajv, bArr, map, zzaks);
        if (zzaks.isEnabled()) {
            try {
                zzaks.zza(str2, "GET", zzajw.getHeaders(), zzajw.zzf());
            } catch (zza e) {
                zzaky.zzcz(e.getMessage());
            }
        }
        zzdha.zze(zzajw);
        return zzajy;
    }

    @Deprecated
    public final <T> zzalt<T> zza(String str, zzajx<T> zzajx) {
        zzalt zzamd = new zzamd();
        zzdha.zze(new zzajz(str, zzamd));
        return zzali.zza(zzali.zza(zzamd, new zzaju(this, zzajx), zzaly.zzdju), Throwable.class, new zzajt(this, zzajx), zzaly.zzdju);
    }

    public final zzalt<String> zzb(String str, Map<String, String> map) {
        return zza(0, str, map, null);
    }
}
