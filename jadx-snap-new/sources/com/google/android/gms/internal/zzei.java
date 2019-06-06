package com.google.android.gms.internal;

public final class zzei extends zzeu {
    private static final Object zzakj = new Object();
    private static volatile String zzda;

    public zzei(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2) {
        super(zzdm, str, str2, zzba, i, 1);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        this.zzakm.zzda = "E";
        if (zzda == null) {
            synchronized (zzakj) {
                if (zzda == null) {
                    zzda = (String) this.zzaku.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzakm) {
            this.zzakm.zzda = zzda;
        }
    }
}
