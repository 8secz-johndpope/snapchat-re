package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzae {
    private final Map<BasePendingResult<?>, Boolean> zzfww = Collections.synchronizedMap(new WeakHashMap());
    private final Map<TaskCompletionSource<?>, Boolean> zzfwx = Collections.synchronizedMap(new WeakHashMap());

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:35:0x007a in {16, 17, 24, 25, 26, 30, 34} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final void zza(boolean r5, com.google.android.gms.common.api.Status r6) {
        /*
        r4 = this;
        r0 = r4.zzfww;
        monitor-enter(r0);
        r1 = new java.util.HashMap;	 Catch:{ all -> 0x0077 }
        r2 = r4.zzfww;	 Catch:{ all -> 0x0077 }
        r1.<init>(r2);	 Catch:{ all -> 0x0077 }
        monitor-exit(r0);	 Catch:{ all -> 0x0077 }
        r2 = r4.zzfwx;
        monitor-enter(r2);
        r0 = new java.util.HashMap;	 Catch:{ all -> 0x0074 }
        r3 = r4.zzfwx;	 Catch:{ all -> 0x0074 }
        r0.<init>(r3);	 Catch:{ all -> 0x0074 }
        monitor-exit(r2);	 Catch:{ all -> 0x0074 }
        r1 = r1.entrySet();
        r1 = r1.iterator();
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0042;
        r2 = r1.next();
        r2 = (java.util.Map.Entry) r2;
        if (r5 != 0) goto L_0x0038;
        r3 = r2.getValue();
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x001e;
        r2 = r2.getKey();
        r2 = (com.google.android.gms.common.api.internal.BasePendingResult) r2;
        r2.zzv(r6);
        goto L_0x001e;
        r0 = r0.entrySet();
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0073;
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        if (r5 != 0) goto L_0x0064;
        r2 = r1.getValue();
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 == 0) goto L_0x004a;
        r1 = r1.getKey();
        r1 = (com.google.android.gms.tasks.TaskCompletionSource) r1;
        r2 = new com.google.android.gms.common.api.ApiException;
        r2.<init>(r6);
        r1.trySetException(r2);
        goto L_0x004a;
        return;
        r5 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0074 }
        throw r5;
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0077 }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzae.zza(boolean, com.google.android.gms.common.api.Status):void");
    }

    /* Access modifiers changed, original: final */
    public final void zza(BasePendingResult<? extends Result> basePendingResult, boolean z) {
        this.zzfww.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.zza(new zzaf(this, basePendingResult));
    }

    /* Access modifiers changed, original: final */
    public final <TResult> void zza(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.zzfwx.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.getTask().addOnCompleteListener(new zzag(this, taskCompletionSource));
    }

    /* Access modifiers changed, original: final */
    public final boolean zzajc() {
        return (this.zzfww.isEmpty() && this.zzfwx.isEmpty()) ? false : true;
    }

    public final void zzajd() {
        zza(false, zzbm.zzfzg);
    }

    public final void zzaje() {
        zza(true, zzdk.zzgbq);
    }
}
