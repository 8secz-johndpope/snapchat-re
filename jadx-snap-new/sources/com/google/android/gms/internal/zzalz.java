package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class zzalz implements Executor {
    private final Handler zzdjx = new Handler(Looper.getMainLooper());

    zzalz() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.zzdjx.post(runnable);
        }
    }
}
