package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

@zzabh
public class zzle extends AdListener {
    private final Object lock = new Object();
    private AdListener zzbjg;

    public void onAdClosed() {
        synchronized (this.lock) {
            if (this.zzbjg != null) {
                this.zzbjg.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.lock) {
            if (this.zzbjg != null) {
                this.zzbjg.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.lock) {
            if (this.zzbjg != null) {
                this.zzbjg.onAdLeftApplication();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.lock) {
            if (this.zzbjg != null) {
                this.zzbjg.onAdLoaded();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.lock) {
            if (this.zzbjg != null) {
                this.zzbjg.onAdOpened();
            }
        }
    }

    public final void zza(AdListener adListener) {
        synchronized (this.lock) {
            this.zzbjg = adListener;
        }
    }
}
