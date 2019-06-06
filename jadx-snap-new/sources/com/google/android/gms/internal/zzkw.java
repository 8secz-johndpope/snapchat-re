package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.zzn;

final class zzkw extends zza<zzlo> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ String zzbiq;
    private /* synthetic */ zzwf zzbir;
    private /* synthetic */ zzks zzbis;

    zzkw(zzks zzks, Context context, String str, zzwf zzwf) {
        this.zzbis = zzks;
        this.val$context = context;
        this.zzbiq = str;
        this.zzbir = zzwf;
        super();
    }

    public final /* synthetic */ Object zza(zzmb zzmb) {
        return zzmb.createAdLoaderBuilder(zzn.zzz(this.val$context), this.zzbiq, this.zzbir, zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final /* synthetic */ Object zzif() {
        zzlo zza = this.zzbis.zzbij.zza(this.val$context, this.zzbiq, this.zzbir);
        if (zza != null) {
            return zza;
        }
        zzks.zza(this.val$context, "native_ad");
        return new zznd();
    }
}
