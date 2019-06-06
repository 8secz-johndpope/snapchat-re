package com.google.android.gms.internal;

public final class zzeg extends zzeu {
    private static final Object zzakj = new Object();
    private static volatile Long zzakn;

    public zzeg(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2) {
        super(zzdm, str, str2, zzba, i, 22);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        if (zzakn == null) {
            synchronized (zzakj) {
                if (zzakn == null) {
                    zzakn = (Long) this.zzaku.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzakm) {
            this.zzakm.zzdt = zzakn;
        }
    }
}
