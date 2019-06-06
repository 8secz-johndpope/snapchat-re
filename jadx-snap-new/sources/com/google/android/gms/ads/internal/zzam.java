package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzafs;
import com.google.android.gms.internal.zzagd;

final class zzam implements zzafs {
    private /* synthetic */ zzak zzaql;

    zzam(zzak zzak) {
        this.zzaql = zzak;
    }

    public final void onRewardedVideoAdClosed() {
        this.zzaql.zzcf();
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.zzaql.zzbu();
    }

    public final void onRewardedVideoAdOpened() {
        this.zzaql.zzcg();
    }

    public final void onRewardedVideoCompleted() {
        this.zzaql.zzdm();
    }

    public final void onRewardedVideoStarted() {
        this.zzaql.zzdl();
    }

    public final void zzc(zzagd zzagd) {
        this.zzaql.zzb(zzagd);
    }

    public final void zzdn() {
        this.zzaql.onAdClicked();
    }
}
