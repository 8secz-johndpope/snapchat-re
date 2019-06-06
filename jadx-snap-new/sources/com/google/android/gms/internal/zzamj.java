package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@zzabh
public class zzamj<T> implements zzamf<T> {
    private final Object mLock = new Object();
    private int zzcfl = 0;
    private BlockingQueue<zzamk> zzdkd = new LinkedBlockingQueue();
    private T zzdke;

    public final int getStatus() {
        return this.zzcfl;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0032 in {8, 11, 13, 16} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void reject() {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzcfl;	 Catch:{ all -> 0x002f }
        if (r1 != 0) goto L_0x0029;	 Catch:{ all -> 0x002f }
        r1 = -1;	 Catch:{ all -> 0x002f }
        r3.zzcfl = r1;	 Catch:{ all -> 0x002f }
        r1 = r3.zzdkd;	 Catch:{ all -> 0x002f }
        r1 = r1.iterator();	 Catch:{ all -> 0x002f }
        r2 = r1.hasNext();	 Catch:{ all -> 0x002f }
        if (r2 == 0) goto L_0x0022;	 Catch:{ all -> 0x002f }
        r2 = r1.next();	 Catch:{ all -> 0x002f }
        r2 = (com.google.android.gms.internal.zzamk) r2;	 Catch:{ all -> 0x002f }
        r2 = r2.zzdkg;	 Catch:{ all -> 0x002f }
        r2.run();	 Catch:{ all -> 0x002f }
        goto L_0x0010;	 Catch:{ all -> 0x002f }
        r1 = r3.zzdkd;	 Catch:{ all -> 0x002f }
        r1.clear();	 Catch:{ all -> 0x002f }
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return;	 Catch:{ all -> 0x002f }
        r1 = new java.lang.UnsupportedOperationException;	 Catch:{ all -> 0x002f }
        r1.<init>();	 Catch:{ all -> 0x002f }
        throw r1;	 Catch:{ all -> 0x002f }
        r1 = move-exception;	 Catch:{ all -> 0x002f }
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzamj.reject():void");
    }

    public final void zza(zzami<T> zzami, zzamg zzamg) {
        synchronized (this.mLock) {
            if (this.zzcfl == 1) {
                zzami.zze(this.zzdke);
            } else if (this.zzcfl == -1) {
                zzamg.run();
            } else if (this.zzcfl == 0) {
                this.zzdkd.add(new zzamk(this, zzami, zzamg));
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0034 in {8, 11, 13, 16} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void zzj(T r4) {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzcfl;	 Catch:{ all -> 0x0031 }
        if (r1 != 0) goto L_0x002b;	 Catch:{ all -> 0x0031 }
        r3.zzdke = r4;	 Catch:{ all -> 0x0031 }
        r1 = 1;	 Catch:{ all -> 0x0031 }
        r3.zzcfl = r1;	 Catch:{ all -> 0x0031 }
        r1 = r3.zzdkd;	 Catch:{ all -> 0x0031 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0031 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0031 }
        if (r2 == 0) goto L_0x0024;	 Catch:{ all -> 0x0031 }
        r2 = r1.next();	 Catch:{ all -> 0x0031 }
        r2 = (com.google.android.gms.internal.zzamk) r2;	 Catch:{ all -> 0x0031 }
        r2 = r2.zzdkf;	 Catch:{ all -> 0x0031 }
        r2.zze(r4);	 Catch:{ all -> 0x0031 }
        goto L_0x0012;	 Catch:{ all -> 0x0031 }
        r4 = r3.zzdkd;	 Catch:{ all -> 0x0031 }
        r4.clear();	 Catch:{ all -> 0x0031 }
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        return;	 Catch:{ all -> 0x0031 }
        r4 = new java.lang.UnsupportedOperationException;	 Catch:{ all -> 0x0031 }
        r4.<init>();	 Catch:{ all -> 0x0031 }
        throw r4;	 Catch:{ all -> 0x0031 }
        r4 = move-exception;	 Catch:{ all -> 0x0031 }
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzamj.zzj(java.lang.Object):void");
    }
}
