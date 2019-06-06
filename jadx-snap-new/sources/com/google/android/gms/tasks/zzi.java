package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzi<TResult> implements zzm<TResult> {
    private final Object mLock = new Object();
    private final Executor zzkou;
    private OnSuccessListener<? super TResult> zzlef;

    public zzi(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.zzkou = executor;
        this.zzlef = onSuccessListener;
    }

    /* JADX WARNING: Missing block: B:10:0x0010, code skipped:
            r2.zzkou.execute(new com.google.android.gms.tasks.zzj(r2, r3));
     */
    public final void onComplete(com.google.android.gms.tasks.Task<TResult> r3) {
        /*
        r2 = this;
        r0 = r3.isSuccessful();
        if (r0 == 0) goto L_0x001e;
    L_0x0006:
        r0 = r2.mLock;
        monitor-enter(r0);
        r1 = r2.zzlef;	 Catch:{ all -> 0x001b }
        if (r1 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        return;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        r0 = r2.zzkou;
        r1 = new com.google.android.gms.tasks.zzj;
        r1.<init>(r2, r3);
        r0.execute(r1);
        goto L_0x001e;
    L_0x001b:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        throw r3;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.zzi.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
