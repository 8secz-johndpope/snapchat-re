package com.google.android.gms.internal;

import android.content.Context;

final class zzail implements Runnable {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzaij zzdfv;

    zzail(zzaij zzaij, Context context) {
        this.zzdfv = zzaij;
        this.val$context = context;
    }

    public final void run() {
        synchronized (this.zzdfv.mLock) {
            this.zzdfv.zzddt = zzaij.zzaj(this.val$context);
            this.zzdfv.mLock.notifyAll();
        }
    }
}
