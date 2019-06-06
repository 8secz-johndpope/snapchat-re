package com.google.android.gms.ads.internal;

import android.os.Handler;

public final class zzbl {
    private final Handler mHandler;

    public zzbl(Handler handler) {
        this.mHandler = handler;
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        return this.mHandler.postDelayed(runnable, j);
    }

    public final void removeCallbacks(Runnable runnable) {
        this.mHandler.removeCallbacks(runnable);
    }
}
