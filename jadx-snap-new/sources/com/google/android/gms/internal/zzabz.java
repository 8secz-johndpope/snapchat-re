package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;

@zzabh
public abstract class zzabz implements zzabx, zzajb<Void> {
    private final Object mLock = new Object();
    private final zzamf<zzacf> zzcro;
    private final zzabx zzcrp;

    public zzabz(zzamf<zzacf> zzamf, zzabx zzabx) {
        this.zzcro = zzamf;
        this.zzcrp = zzabx;
    }

    public final void cancel() {
        zzny();
    }

    public final void zza(zzacj zzacj) {
        synchronized (this.mLock) {
            this.zzcrp.zza(zzacj);
            zzny();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(zzacn zzacn, zzacf zzacf) {
        try {
            zzacn.zza(zzacf, new zzaci(this));
            return true;
        } catch (Throwable th) {
            zzaky.zzc("Could not fetch ad response from ad request service due to an Exception.", th);
            zzbt.zzep().zza(th, "AdRequestClientTask.getAdResponseFromService");
            this.zzcrp.zza(new zzacj(0));
            return false;
        }
    }

    public final /* synthetic */ Object zzns() {
        zzacn zznz = zznz();
        if (zznz == null) {
            this.zzcrp.zza(new zzacj(0));
            zzny();
            return null;
        }
        this.zzcro.zza(new zzaca(this, zznz), new zzacb(this));
        return null;
    }

    public abstract void zzny();

    public abstract zzacn zznz();
}
