package com.google.android.gms.internal;

final class zzua extends zzafd {
    private /* synthetic */ zztl zzcdm;

    zzua(zztl zztl) {
        this.zzcdm = zztl;
    }

    public final void onRewardedVideoAdClosed() {
        this.zzcdm.zzaoz.add(new zzue(this));
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        this.zzcdm.zzaoz.add(new zzuh(this, i));
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.zzcdm.zzaoz.add(new zzug(this));
    }

    public final void onRewardedVideoAdLoaded() {
        this.zzcdm.zzaoz.add(new zzub(this));
    }

    public final void onRewardedVideoAdOpened() {
        this.zzcdm.zzaoz.add(new zzuc(this));
    }

    public final void onRewardedVideoCompleted() {
        this.zzcdm.zzaoz.add(new zzui(this));
    }

    public final void onRewardedVideoStarted() {
        this.zzcdm.zzaoz.add(new zzud(this));
    }

    public final void zza(zzaeu zzaeu) {
        this.zzcdm.zzaoz.add(new zzuf(this, zzaeu));
    }
}
