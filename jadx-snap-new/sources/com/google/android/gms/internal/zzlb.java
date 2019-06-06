package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.dynamic.zzn;

final class zzlb extends zza<zzyq> {
    private /* synthetic */ Activity val$activity;
    private /* synthetic */ zzks zzbis;

    zzlb(zzks zzks, Activity activity) {
        this.zzbis = zzks;
        this.val$activity = activity;
        super();
    }

    public final /* synthetic */ Object zza(zzmb zzmb) {
        return zzmb.createAdOverlay(zzn.zzz(this.val$activity));
    }

    public final /* synthetic */ Object zzif() {
        zzyq zze = this.zzbis.zzbin.zze(this.val$activity);
        if (zze != null) {
            return zze;
        }
        zzks.zza(this.val$activity, "ad_overlay");
        return null;
    }
}
