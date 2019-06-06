package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzv {
    private final zzm zzaa;
    private final AtomicInteger zzba;
    private final Set<zzr<?>> zzbb;
    private final PriorityBlockingQueue<zzr<?>> zzbc;
    private final PriorityBlockingQueue<zzr<?>> zzbd;
    private final zzn[] zzbe;
    private final List<zzw> zzbf;
    private final zzb zzj;
    private final zzaa zzk;
    private zzd zzq;

    public zzv(zzb zzb, zzm zzm) {
        this(zzb, zzm, 4);
    }

    private zzv(zzb zzb, zzm zzm, int i) {
        this(zzb, zzm, 4, new zzi(new Handler(Looper.getMainLooper())));
    }

    private zzv(zzb zzb, zzm zzm, int i, zzaa zzaa) {
        this.zzba = new AtomicInteger();
        this.zzbb = new HashSet();
        this.zzbc = new PriorityBlockingQueue();
        this.zzbd = new PriorityBlockingQueue();
        this.zzbf = new ArrayList();
        this.zzj = zzb;
        this.zzaa = zzm;
        this.zzbe = new zzn[4];
        this.zzk = zzaa;
    }

    public final void start() {
        zzd zzd = this.zzq;
        if (zzd != null) {
            zzd.quit();
        }
        for (zzn zzn : this.zzbe) {
            if (zzn != null) {
                zzn.quit();
            }
        }
        this.zzq = new zzd(this.zzbc, this.zzbd, this.zzj, this.zzk);
        this.zzq.start();
        for (int i = 0; i < this.zzbe.length; i++) {
            zzn zzn2 = new zzn(this.zzbd, this.zzaa, this.zzj, this.zzk);
            this.zzbe[i] = zzn2;
            zzn2.start();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x002c in {7, 9, 10, 14} preds:[]
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
    public final <T> com.google.android.gms.internal.zzr<T> zze(com.google.android.gms.internal.zzr<T> r3) {
        /*
        r2 = this;
        r3.zza(r2);
        r0 = r2.zzbb;
        monitor-enter(r0);
        r1 = r2.zzbb;	 Catch:{ all -> 0x0029 }
        r1.add(r3);	 Catch:{ all -> 0x0029 }
        monitor-exit(r0);	 Catch:{ all -> 0x0029 }
        r0 = r2.zzba;
        r0 = r0.incrementAndGet();
        r3.zza(r0);
        r0 = "add-to-queue";
        r3.zzb(r0);
        r0 = r3.zzg();
        if (r0 != 0) goto L_0x0026;
        r0 = r2.zzbd;
        r0.add(r3);
        return r3;
        r0 = r2.zzbc;
        goto L_0x0022;
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0029 }
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzv.zze(com.google.android.gms.internal.zzr):com.google.android.gms.internal.zzr");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x002a in {11, 13, 16, 20} preds:[]
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
    final <T> void zzf(com.google.android.gms.internal.zzr<T> r4) {
        /*
        r3 = this;
        r0 = r3.zzbb;
        monitor-enter(r0);
        r1 = r3.zzbb;	 Catch:{ all -> 0x0027 }
        r1.remove(r4);	 Catch:{ all -> 0x0027 }
        monitor-exit(r0);	 Catch:{ all -> 0x0027 }
        r1 = r3.zzbf;
        monitor-enter(r1);
        r0 = r3.zzbf;	 Catch:{ all -> 0x0024 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0024 }
        r2 = r0.hasNext();	 Catch:{ all -> 0x0024 }
        if (r2 == 0) goto L_0x0022;	 Catch:{ all -> 0x0024 }
        r2 = r0.next();	 Catch:{ all -> 0x0024 }
        r2 = (com.google.android.gms.internal.zzw) r2;	 Catch:{ all -> 0x0024 }
        r2.zzg(r4);	 Catch:{ all -> 0x0024 }
        goto L_0x0012;	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        return;	 Catch:{ all -> 0x0024 }
        r4 = move-exception;	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        throw r4;
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0027 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzv.zzf(com.google.android.gms.internal.zzr):void");
    }
}
