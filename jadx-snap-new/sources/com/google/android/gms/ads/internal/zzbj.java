package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzkk;
import java.lang.ref.WeakReference;

@zzabh
public final class zzbj {
    private final zzbl zzarw;
    private zzkk zzarx;
    private boolean zzary;
    private boolean zzarz;
    private long zzasa;
    private final Runnable zzy;

    public zzbj(zza zza) {
        this(zza, new zzbl(zzaij.zzdfn));
    }

    private zzbj(zza zza, zzbl zzbl) {
        this.zzary = false;
        this.zzarz = false;
        this.zzasa = 0;
        this.zzarw = zzbl;
        this.zzy = new zzbk(this, new WeakReference(zza));
    }

    public final void cancel() {
        this.zzary = false;
        this.zzarw.removeCallbacks(this.zzy);
    }

    public final void pause() {
        this.zzarz = true;
        if (this.zzary) {
            this.zzarw.removeCallbacks(this.zzy);
        }
    }

    public final void resume() {
        this.zzarz = false;
        if (this.zzary) {
            this.zzary = false;
            zza(this.zzarx, this.zzasa);
        }
    }

    public final void zza(zzkk zzkk, long j) {
        if (this.zzary) {
            zzaky.zzcz("An ad refresh is already scheduled.");
            return;
        }
        this.zzarx = zzkk;
        this.zzary = true;
        this.zzasa = j;
        if (!this.zzarz) {
            StringBuilder stringBuilder = new StringBuilder(65);
            stringBuilder.append("Scheduling ad refresh ");
            stringBuilder.append(j);
            stringBuilder.append(" milliseconds from now.");
            zzaky.zzcy(stringBuilder.toString());
            this.zzarw.postDelayed(this.zzy, j);
        }
    }

    public final void zzdz() {
        this.zzarz = false;
        this.zzary = false;
        zzkk zzkk = this.zzarx;
        if (!(zzkk == null || zzkk.extras == null)) {
            this.zzarx.extras.remove("_ad");
        }
        zza(this.zzarx, 0);
    }

    public final boolean zzea() {
        return this.zzary;
    }

    public final void zzf(zzkk zzkk) {
        this.zzarx = zzkk;
    }

    public final void zzg(zzkk zzkk) {
        zza(zzkk, 60000);
    }
}
