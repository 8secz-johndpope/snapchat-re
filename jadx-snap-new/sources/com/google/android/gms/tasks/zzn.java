package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

final class zzn<TResult> {
    private final Object mLock = new Object();
    private Queue<zzm<TResult>> zzlej;
    private boolean zzlek;

    zzn() {
    }

    public final void zza(zzm<TResult> zzm) {
        synchronized (this.mLock) {
            if (this.zzlej == null) {
                this.zzlej = new ArrayDeque();
            }
            this.zzlej.add(zzm);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x002f in {7, 17, 19, 23, 26, 29} preds:[]
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
    public final void zzb(com.google.android.gms.tasks.Task<TResult> r3) {
        /*
        r2 = this;
        r0 = r2.mLock;
        monitor-enter(r0);
        r1 = r2.zzlej;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x002a;	 Catch:{ all -> 0x002c }
        r1 = r2.zzlek;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x000c;	 Catch:{ all -> 0x002c }
        goto L_0x002a;	 Catch:{ all -> 0x002c }
        r1 = 1;	 Catch:{ all -> 0x002c }
        r2.zzlek = r1;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        r1 = r2.mLock;
        monitor-enter(r1);
        r0 = r2.zzlej;	 Catch:{ all -> 0x0027 }
        r0 = r0.poll();	 Catch:{ all -> 0x0027 }
        r0 = (com.google.android.gms.tasks.zzm) r0;	 Catch:{ all -> 0x0027 }
        if (r0 != 0) goto L_0x0022;	 Catch:{ all -> 0x0027 }
        r3 = 0;	 Catch:{ all -> 0x0027 }
        r2.zzlek = r3;	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        return;	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        r0.onComplete(r3);
        goto L_0x0010;
        r3 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        throw r3;
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        return;	 Catch:{ all -> 0x002c }
        r3 = move-exception;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.zzn.zzb(com.google.android.gms.tasks.Task):void");
    }
}
