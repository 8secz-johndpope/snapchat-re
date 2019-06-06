package com.google.android.gms.internal;

final class zzzk implements Runnable {
    private /* synthetic */ zzahd zzarv;
    private /* synthetic */ zzzi zzcoh;

    zzzk(zzzi zzzi, zzahd zzahd) {
        this.zzcoh = zzzi;
        this.zzarv = zzahd;
    }

    public final void run() {
        synchronized (this.zzcoh.mLock) {
            zzzi zzzi = this.zzcoh;
            zzzi.zzcoa.zzb(this.zzarv);
        }
    }
}
