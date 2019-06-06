package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

@zzabh
public final class zzaha implements zzahc {
    public final zzalt<String> zza(String str, PackageInfo packageInfo) {
        return zzali.zzh(str);
    }

    public final zzalt<Info> zzac(Context context) {
        zzamd zzamd = new zzamd();
        zzlc.zzij();
        if (zzako.zzbe(context)) {
            zzaid.zzb(new zzahb(this, context, zzamd));
        }
        return zzamd;
    }
}
