package com.google.android.gms.internal;

@zzabh
final class zzanp implements Runnable {
    private boolean zzayx = false;
    private zzanb zzdof;

    zzanp(zzanb zzanb) {
        this.zzdof = zzanb;
    }

    private final void zztq() {
        zzaij.zzdfn.removeCallbacks(this);
        zzaij.zzdfn.postDelayed(this, 250);
    }

    public final void pause() {
        this.zzayx = true;
    }

    public final void resume() {
        this.zzayx = false;
        zztq();
    }

    public final void run() {
        if (!this.zzayx) {
            this.zzdof.zzsy();
            zztq();
        }
    }
}
