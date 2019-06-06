package com.google.android.gms.internal;

final class zzabt implements Runnable {
    private /* synthetic */ zzabk zzcrm;
    private /* synthetic */ zzamf zzcrn;

    zzabt(zzabk zzabk, zzamf zzamf) {
        this.zzcrm = zzabk;
        this.zzcrn = zzamf;
    }

    public final void run() {
        synchronized (this.zzcrm.zzcoe) {
            this.zzcrm.zzcri = this.zzcrm.zza(this.zzcrm.zzcrf.zzatz, this.zzcrn);
            if (this.zzcrm.zzcri == null) {
                this.zzcrm.zzc(0, "Could not start the ad request service.");
                zzaij.zzdfn.removeCallbacks(this.zzcrm.zzcod);
            }
        }
    }
}
