package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@zzabh
public final class zzaid {
    public static final ThreadPoolExecutor zzdfi = new ThreadPoolExecutor(20, 20, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), zzch("Default"));
    private static final ThreadPoolExecutor zzdfj = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), zzch("Loader"));

    static {
        zzdfi.allowCoreThreadTimeOut(true);
        zzdfj.allowCoreThreadTimeOut(true);
    }

    public static zzalt<Void> zza(int i, Runnable runnable) {
        ExecutorService executorService;
        Callable zzaie;
        if (i == 1) {
            executorService = zzdfj;
            zzaie = new zzaie(runnable);
        } else {
            executorService = zzdfi;
            zzaie = new zzaif(runnable);
        }
        return zza(executorService, zzaie);
    }

    public static <T> zzalt<T> zza(ExecutorService executorService, Callable<T> callable) {
        zzamd zzamd = new zzamd();
        try {
            zzamd.zza(new zzaih(zzamd, executorService.submit(new zzaig(zzamd, callable))), zzaly.zzdjt);
        } catch (RejectedExecutionException e) {
            zzaky.zzc("Thread execution is rejected.", e);
            zzamd.setException(e);
        }
        return zzamd;
    }

    public static zzalt<Void> zzb(Runnable runnable) {
        return zza(0, runnable);
    }

    private static ThreadFactory zzch(String str) {
        return new zzaii(str);
    }
}
