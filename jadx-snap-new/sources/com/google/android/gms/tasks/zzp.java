package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.zzbq;
import java.util.concurrent.Executor;

final class zzp<TResult> extends Task<TResult> {
    private final Object mLock = new Object();
    private final zzn<TResult> zzlen = new zzn();
    private boolean zzleo;
    private TResult zzlep;
    private Exception zzleq;

    zzp() {
    }

    private final void zzbld() {
        zzbq.zza(this.zzleo, "Task is not yet complete");
    }

    private final void zzble() {
        zzbq.zza(this.zzleo ^ 1, "Task is already complete");
    }

    private final void zzblf() {
        synchronized (this.mLock) {
            if (this.zzleo) {
                this.zzlen.zzb(this);
                return;
            }
        }
    }

    public final Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        return addOnCompleteListener(TaskExecutors.MAIN_THREAD, onCompleteListener);
    }

    public final Task<TResult> addOnCompleteListener(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.zzlen.zza(new zze(executor, onCompleteListener));
        zzblf();
        return this;
    }

    public final Task<TResult> addOnFailureListener(OnFailureListener onFailureListener) {
        return addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
    }

    public final Task<TResult> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        this.zzlen.zza(new zzg(executor, onFailureListener));
        zzblf();
        return this;
    }

    public final Task<TResult> addOnSuccessListener(OnSuccessListener<? super TResult> onSuccessListener) {
        return addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
    }

    public final Task<TResult> addOnSuccessListener(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.zzlen.zza(new zzi(executor, onSuccessListener));
        zzblf();
        return this;
    }

    public final Exception getException() {
        Exception exception;
        synchronized (this.mLock) {
            exception = this.zzleq;
        }
        return exception;
    }

    public final TResult getResult() {
        Object obj;
        synchronized (this.mLock) {
            zzbld();
            if (this.zzleq == null) {
                obj = this.zzlep;
            } else {
                throw new RuntimeExecutionException(this.zzleq);
            }
        }
        return obj;
    }

    public final boolean isComplete() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzleo;
        }
        return z;
    }

    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzleo && this.zzleq == null;
        }
        return z;
    }

    public final void setException(Exception exception) {
        zzbq.checkNotNull(exception, "Exception must not be null");
        synchronized (this.mLock) {
            zzble();
            this.zzleo = true;
            this.zzleq = exception;
        }
        this.zzlen.zzb(this);
    }

    public final void setResult(TResult tResult) {
        synchronized (this.mLock) {
            zzble();
            this.zzleo = true;
            this.zzlep = tResult;
        }
        this.zzlen.zzb(this);
    }

    public final boolean trySetException(Exception exception) {
        zzbq.checkNotNull(exception, "Exception must not be null");
        synchronized (this.mLock) {
            if (this.zzleo) {
                return false;
            }
            this.zzleo = true;
            this.zzleq = exception;
            this.zzlen.zzb(this);
            return true;
        }
    }

    public final boolean trySetResult(TResult tResult) {
        synchronized (this.mLock) {
            if (this.zzleo) {
                return false;
            }
            this.zzleo = true;
            this.zzlep = tResult;
            this.zzlen.zzb(this);
            return true;
        }
    }
}
