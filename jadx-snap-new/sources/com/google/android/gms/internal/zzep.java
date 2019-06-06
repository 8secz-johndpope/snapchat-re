package com.google.android.gms.internal;

public final class zzep extends zzeu {
    private static final Object zzakj = new Object();
    private static volatile Long zzakr;

    public zzep(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2) {
        super(zzdm, str, str2, zzba, i, 33);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        if (zzakr == null) {
            synchronized (zzakj) {
                if (zzakr == null) {
                    zzakr = (Long) this.zzaku.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzakm) {
            this.zzakm.zzdy = zzakr;
        }
    }
}
