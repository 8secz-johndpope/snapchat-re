package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zze<TResult> implements zzm<TResult> {
    private final Object mLock = new Object();
    private final Executor zzkou;
    private OnCompleteListener<TResult> zzleb;

    public zze(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.zzkou = executor;
        this.zzleb = onCompleteListener;
    }

    public final void onComplete(Task<TResult> task) {
        synchronized (this.mLock) {
            if (this.zzleb == null) {
                return;
            }
            this.zzkou.execute(new zzf(this, task));
        }
    }
}
