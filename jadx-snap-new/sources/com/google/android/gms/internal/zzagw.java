package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzagw implements ThreadFactory {
    private final AtomicInteger zzdcf = new AtomicInteger(1);

    zzagw(zzagu zzagu) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zzdcf.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(42);
        stringBuilder.append("AdWorker(SCION_TASK_EXECUTOR) #");
        stringBuilder.append(andIncrement);
        return new Thread(runnable, stringBuilder.toString());
    }
}
