package com.google.android.gms.internal;

public final class zzem extends zzeu {
    private final StackTraceElement[] zzakq;

    public zzem(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzdm, str, str2, zzba, i, 45);
        this.zzakq = stackTraceElementArr;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        if (this.zzakq != null) {
            int i = 1;
            zzdk zzdk = new zzdk((String) this.zzaku.invoke(null, new Object[]{this.zzakq}));
            synchronized (this.zzakm) {
                this.zzakm.zzei = zzdk.zzail;
                if (zzdk.zzaim.booleanValue()) {
                    zzba zzba = this.zzakm;
                    if (zzdk.zzain.booleanValue()) {
                        i = 0;
                    }
                    zzba.zzeq = Integer.valueOf(i);
                }
            }
        }
    }
}
