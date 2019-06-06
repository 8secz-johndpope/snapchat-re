package com.google.android.gms.internal;

public final class zzec extends zzeu {
    private static final Object zzakj = new Object();
    private static volatile Long zzeh;

    public zzec(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2) {
        super(zzdm, str, str2, zzba, i, 44);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        if (zzeh == null) {
            synchronized (zzakj) {
                if (zzeh == null) {
                    zzeh = (Long) this.zzaku.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzakm) {
            this.zzakm.zzeh = zzeh;
        }
    }
}
