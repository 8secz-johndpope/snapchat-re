package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzn;

final class zzxy implements zzn {
    private /* synthetic */ zzxx zzckr;

    zzxy(zzxx zzxx) {
        this.zzckr = zzxx;
    }

    public final void onPause() {
        zzaky.zzby("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void onResume() {
        zzaky.zzby("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzcf() {
        zzaky.zzby("AdMobCustomTabsAdapter overlay is closed.");
        this.zzckr.zzckq.onAdClosed(this.zzckr);
    }

    public final void zzcg() {
        zzaky.zzby("Opening AdMobCustomTabsAdapter overlay.");
        this.zzckr.zzckq.onAdOpened(this.zzckr);
    }
}
