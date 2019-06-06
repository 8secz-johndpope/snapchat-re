package com.google.android.gms.internal;

public final class zzel extends zzeu {
    public zzel(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2) {
        super(zzdm, str, str2, zzba, i, 61);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        long longValue = ((Long) this.zzaku.invoke(null, new Object[]{this.zzagq.getContext(), Boolean.valueOf(this.zzagq.zzal())})).longValue();
        synchronized (this.zzakm) {
            this.zzakm.zzex = Long.valueOf(longValue);
        }
    }
}
