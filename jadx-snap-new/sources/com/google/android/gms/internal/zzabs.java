package com.google.android.gms.internal;

final class zzabs implements Runnable {
    private /* synthetic */ zzabk zzcrm;

    zzabs(zzabk zzabk) {
        this.zzcrm = zzabk;
    }

    public final void run() {
        synchronized (this.zzcrm.zzcoe) {
            if (this.zzcrm.zzcri == null) {
                return;
            }
            this.zzcrm.onStop();
            this.zzcrm.zzc(2, "Timed out waiting for ad response.");
        }
    }
}
