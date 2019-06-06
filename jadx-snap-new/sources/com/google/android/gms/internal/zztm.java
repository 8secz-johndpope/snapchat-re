package com.google.android.gms.internal;

final class zztm extends zzlj {
    private /* synthetic */ zztl zzcdm;

    zztm(zztl zztl) {
        this.zzcdm = zztl;
    }

    public final void onAdClicked() {
        this.zzcdm.zzaoz.add(new zztt(this));
    }

    public final void onAdClosed() {
        this.zzcdm.zzaoz.add(new zztn(this));
    }

    public final void onAdFailedToLoad(int i) {
        this.zzcdm.zzaoz.add(new zzto(this, i));
        zzahw.v("Pooled interstitial failed to load.");
    }

    public final void onAdImpression() {
        this.zzcdm.zzaoz.add(new zzts(this));
    }

    public final void onAdLeftApplication() {
        this.zzcdm.zzaoz.add(new zztp(this));
    }

    public final void onAdLoaded() {
        this.zzcdm.zzaoz.add(new zztq(this));
        zzahw.v("Pooled interstitial loaded.");
    }

    public final void onAdOpened() {
        this.zzcdm.zzaoz.add(new zztr(this));
    }
}
