package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.zzn;

final class zzkt extends zza<zzlt> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzko zzbip;
    private /* synthetic */ String zzbiq;
    private /* synthetic */ zzwf zzbir;
    private /* synthetic */ zzks zzbis;

    zzkt(zzks zzks, Context context, zzko zzko, String str, zzwf zzwf) {
        this.zzbis = zzks;
        this.val$context = context;
        this.zzbip = zzko;
        this.zzbiq = str;
        this.zzbir = zzwf;
        super();
    }

    public final /* synthetic */ Object zza(zzmb zzmb) {
        return zzmb.createBannerAdManager(zzn.zzz(this.val$context), this.zzbip, this.zzbiq, this.zzbir, zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final /* synthetic */ Object zzif() {
        zzlt zza = this.zzbis.zzbii.zza(this.val$context, this.zzbip, this.zzbiq, this.zzbir, 1);
        if (zza != null) {
            return zza;
        }
        zzks.zza(this.val$context, "banner");
        return new zznh();
    }
}
