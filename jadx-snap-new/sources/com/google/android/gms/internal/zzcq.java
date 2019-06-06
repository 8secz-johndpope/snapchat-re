package com.google.android.gms.internal;

final class zzcq implements Runnable {
    private /* synthetic */ zzcp zzagv;

    zzcq(zzcp zzcp) {
        this.zzagv = zzcp;
    }

    public final void run() {
        if (this.zzagv.zzagt == null) {
            synchronized (zzcp.zzagr) {
                if (this.zzagv.zzagt != null) {
                    return;
                }
                boolean booleanValue = ((Boolean) zzlc.zzio().zzd(zzoi.zzbrh)).booleanValue();
                if (booleanValue) {
                    try {
                        zzcp.zzags = new zziz(this.zzagv.zzagq.zzaiq, "ADSHIELD", null);
                    } catch (Throwable unused) {
                        booleanValue = false;
                    }
                }
                this.zzagv.zzagt = Boolean.valueOf(booleanValue);
                zzcp.zzagr.open();
            }
        }
    }
}
