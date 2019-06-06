package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final class zzama implements Executor {
    zzama() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
