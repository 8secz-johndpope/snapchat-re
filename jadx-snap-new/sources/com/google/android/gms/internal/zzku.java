package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.zzn;

final class zzku extends zza<zzlt> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzko zzbip;
    private /* synthetic */ String zzbiq;
    private /* synthetic */ zzks zzbis;

    zzku(zzks zzks, Context context, zzko zzko, String str) {
        this.zzbis = zzks;
        this.val$context = context;
        this.zzbip = zzko;
        this.zzbiq = str;
        super();
    }

    public final /* synthetic */ Object zza(zzmb zzmb) {
        return zzmb.createSearchAdManager(zzn.zzz(this.val$context), this.zzbip, this.zzbiq, zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final /* synthetic */ Object zzif() {
        zzlt zza = this.zzbis.zzbii.zza(this.val$context, this.zzbip, this.zzbiq, null, 3);
        if (zza != null) {
            return zza;
        }
        zzks.zza(this.val$context, "search");
        return new zznh();
    }
}
