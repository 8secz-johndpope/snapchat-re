package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@zzabh
@TargetApi(14)
public final class zzang {
    private final long zzdmb = TimeUnit.MILLISECONDS.toNanos(((Long) zzlc.zzio().zzd(zzoi.zzbme)).longValue());
    private long zzdmc;
    private boolean zzdmd = true;

    zzang() {
    }

    public final void zza(SurfaceTexture surfaceTexture, zzamy zzamy) {
        if (zzamy != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.zzdmd || Math.abs(timestamp - this.zzdmc) >= this.zzdmb) {
                this.zzdmd = false;
                this.zzdmc = timestamp;
                zzaij.zzdfn.post(new zzanh(this, zzamy));
            }
        }
    }

    public final void zzsq() {
        this.zzdmd = true;
    }
}
