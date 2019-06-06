package com.google.android.gms.internal;

import android.content.Context;

@zzabh
public final class zzuy {
    private final Object mLock = new Object();
    private zzvf zzcgl;

    public final zzvf zzb(Context context, zzala zzala) {
        zzvf zzvf;
        synchronized (this.mLock) {
            if (this.zzcgl == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.zzcgl = new zzvf(context, zzala, (String) zzlc.zzio().zzd(zzoi.zzblc));
            }
            zzvf = this.zzcgl;
        }
        return zzvf;
    }
}
