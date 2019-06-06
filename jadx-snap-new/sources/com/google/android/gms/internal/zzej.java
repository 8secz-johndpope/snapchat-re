package com.google.android.gms.internal;

public final class zzej extends zzeu {
    public zzej(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2) {
        super(zzdm, str, str2, zzba, i, 3);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        synchronized (this.zzakm) {
            zzcz zzcz = new zzcz((String) this.zzaku.invoke(null, new Object[]{this.zzagq.getContext()}));
            synchronized (this.zzakm) {
                this.zzakm.zzdb = Long.valueOf(zzcz.zzaif);
                this.zzakm.zzew = Long.valueOf(zzcz.zzaig);
            }
        }
    }
}
