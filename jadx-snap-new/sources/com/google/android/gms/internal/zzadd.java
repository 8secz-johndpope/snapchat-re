package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzaj;

final class zzadd implements zzami<zzaj> {
    private /* synthetic */ zzadc zzcvh;

    zzadd(zzadc zzadc) {
        this.zzcvh = zzadc;
    }

    public final /* synthetic */ void zze(Object obj) {
        try {
            ((zzaj) obj).zzb("AFMA_getAdapterLessMediationAd", this.zzcvh.zzcvf);
        } catch (Exception e) {
            zzaky.zzb("Error requesting an ad url", e);
            zzada.zzcvb.zzat(this.zzcvh.zzcvg);
        }
    }
}
