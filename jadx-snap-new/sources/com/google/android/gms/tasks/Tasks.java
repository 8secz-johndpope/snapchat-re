package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.zzbq;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks {

    interface zzb extends OnFailureListener, OnSuccessListener<Object> {
    }

    static final class zza implements zzb {
        private final CountDownLatch zzapc;

        private zza() {
            this.zzapc = new CountDownLatch(1);
        }

        /* synthetic */ zza(zzq zzq) {
            this();
        }

        public final void await() {
            this.zzapc.await();
        }

        public final boolean await(long j, TimeUnit timeUnit) {
            return this.zzapc.await(j, timeUnit);
        }

        public final void onFailure(Exception exception) {
            this.zzapc.countDown();
        }

        public final void onSuccess(Object obj) {
            this.zzapc.countDown();
        }
    }

    public static <TResult> TResult await(Task<TResult> task) {
        zzbq.zzgw("Must not be called on the main application thread");
        zzbq.checkNotNull(task, "Task must not be null");
        if (task.isComplete()) {
            return zzc(task);
        }
        zza zza = new zza();
        zza(task, zza);
        zza.await();
        return zzc(task);
    }

    public static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) {
        zzbq.zzgw("Must not be called on the main application thread");
        zzbq.checkNotNull(task, "Task must not be null");
        zzbq.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return zzc(task);
        }
        zza zza = new zza();
        zza(task, zza);
        if (zza.await(j, timeUnit)) {
            return zzc(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static void zza(Task<?> task, zzb zzb) {
        task.addOnSuccessListener(TaskExecutors.zzlem, zzb);
        task.addOnFailureListener(TaskExecutors.zzlem, zzb);
    }

    private static <TResult> TResult zzc(Task<TResult> task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }
}
