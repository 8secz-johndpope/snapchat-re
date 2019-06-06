package com.google.android.gms.internal;

final class zzvu implements Runnable {
    private /* synthetic */ zzvs zzcja;
    private /* synthetic */ zzvt zzcjb;

    zzvu(zzvt zzvt, zzvs zzvs) {
        this.zzcjb = zzvt;
        this.zzcja = zzvs;
    }

    public final void run() {
        synchronized (this.zzcjb.mLock) {
            if (this.zzcjb.zzciy != -2) {
                return;
            }
            this.zzcjb.zzcix = this.zzcjb.zzmk();
            if (this.zzcjb.zzcix == null) {
                this.zzcjb.zzv(4);
            } else if (!this.zzcjb.zzml() || this.zzcjb.zzw(1)) {
                this.zzcja.zza(this.zzcjb);
                this.zzcjb.zza(this.zzcja);
            } else {
                String zzf = this.zzcjb.zzcip;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(zzf).length() + 56);
                stringBuilder.append("Ignoring adapter ");
                stringBuilder.append(zzf);
                stringBuilder.append(" as delayed impression is not supported");
                zzaky.zzcz(stringBuilder.toString());
                this.zzcjb.zzv(2);
            }
        }
    }
}
