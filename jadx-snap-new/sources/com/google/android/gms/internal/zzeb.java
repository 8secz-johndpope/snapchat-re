package com.google.android.gms.internal;

public final class zzeb extends zzeu {
    public zzeb(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2) {
        super(zzdm, str, str2, zzba, i, 5);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        zzba zzba = this.zzakm;
        Long valueOf = Long.valueOf(-1);
        zzba.zzdd = valueOf;
        this.zzakm.zzde = valueOf;
        int[] iArr = (int[]) this.zzaku.invoke(null, new Object[]{this.zzagq.getContext()});
        synchronized (this.zzakm) {
            this.zzakm.zzdd = Long.valueOf((long) iArr[0]);
            this.zzakm.zzde = Long.valueOf((long) iArr[1]);
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbrj)).booleanValue() && iArr[2] != Integer.MIN_VALUE) {
                this.zzakm.zzev = Long.valueOf((long) iArr[2]);
            }
        }
    }
}
