package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@zzabh
public final class zzvz implements zzvo {
    private final Context mContext;
    private final Object mLock = new Object();
    private final long mStartTime;
    private final zzwf zzanu;
    private final boolean zzavr;
    private final zzvq zzcir;
    private final boolean zzciv;
    private final boolean zzciw;
    private final zzacf zzcjk;
    private final long zzcjl;
    private final int zzcjm;
    private boolean zzcjn = false;
    private final Map<zzalt<zzvw>, zzvt> zzcjo = new HashMap();
    private final String zzcjp;
    private List<zzvw> zzcjq = new ArrayList();

    public zzvz(Context context, zzacf zzacf, zzwf zzwf, zzvq zzvq, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.mContext = context;
        this.zzcjk = zzacf;
        this.zzanu = zzwf;
        this.zzcir = zzvq;
        this.zzavr = z;
        this.zzciv = z2;
        this.zzcjp = str;
        this.mStartTime = j;
        this.zzcjl = j2;
        this.zzcjm = 2;
        this.zzciw = z3;
    }

    private final void zza(zzalt<zzvw> zzalt) {
        zzaij.zzdfn.post(new zzwb(this, zzalt));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x004c in {7, 19, 21, 22, 23, 25, 29} preds:[]
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
    private final com.google.android.gms.internal.zzvw zzi(java.util.List<com.google.android.gms.internal.zzalt<com.google.android.gms.internal.zzvw>> r4) {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzcjn;	 Catch:{ all -> 0x0049 }
        if (r1 == 0) goto L_0x000f;	 Catch:{ all -> 0x0049 }
        r4 = new com.google.android.gms.internal.zzvw;	 Catch:{ all -> 0x0049 }
        r1 = -1;	 Catch:{ all -> 0x0049 }
        r4.<init>(r1);	 Catch:{ all -> 0x0049 }
        monitor-exit(r0);	 Catch:{ all -> 0x0049 }
        return r4;	 Catch:{ all -> 0x0049 }
        monitor-exit(r0);	 Catch:{ all -> 0x0049 }
        r4 = r4.iterator();
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x003e;
        r0 = r4.next();
        r0 = (com.google.android.gms.internal.zzalt) r0;
        r1 = r0.get();	 Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
        r1 = (com.google.android.gms.internal.zzvw) r1;	 Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
        r2 = r3.zzcjq;	 Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
        r2.add(r1);	 Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
        if (r1 == 0) goto L_0x0014;	 Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
        r2 = r1.zzcjd;	 Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
        if (r2 != 0) goto L_0x0014;	 Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
        r3.zza(r0);	 Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
        return r1;
        r0 = move-exception;
        goto L_0x0038;
        r0 = move-exception;
        r1 = "Exception while processing an adapter; continuing with other adapters";
        com.google.android.gms.internal.zzaky.zzc(r1, r0);
        goto L_0x0014;
        r4 = 0;
        r3.zza(r4);
        r4 = new com.google.android.gms.internal.zzvw;
        r0 = 1;
        r4.<init>(r0);
        return r4;
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0049 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzvz.zzi(java.util.List):com.google.android.gms.internal.zzvw");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:57:0x00af in {7, 11, 12, 21, 23, 33, 37, 39, 41, 42, 44, 45, 47, 51, 52, 56} preds:[]
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
    private final com.google.android.gms.internal.zzvw zzj(java.util.List<com.google.android.gms.internal.zzalt<com.google.android.gms.internal.zzvw>> r14) {
        /*
        r13 = this;
        r0 = r13.mLock;
        monitor-enter(r0);
        r1 = r13.zzcjn;	 Catch:{ all -> 0x00ac }
        r2 = -1;	 Catch:{ all -> 0x00ac }
        if (r1 == 0) goto L_0x000f;	 Catch:{ all -> 0x00ac }
        r14 = new com.google.android.gms.internal.zzvw;	 Catch:{ all -> 0x00ac }
        r14.<init>(r2);	 Catch:{ all -> 0x00ac }
        monitor-exit(r0);	 Catch:{ all -> 0x00ac }
        return r14;	 Catch:{ all -> 0x00ac }
        monitor-exit(r0);	 Catch:{ all -> 0x00ac }
        r0 = r13.zzcir;
        r0 = r0.zzcig;
        r3 = -1;
        r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x001f;
        r0 = r13.zzcir;
        r0 = r0.zzcig;
        goto L_0x0021;
        r0 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r14 = r14.iterator();
        r3 = 0;
        r1 = r0;
        r0 = r3;
        r4 = -1;
        r5 = r14.hasNext();
        if (r5 == 0) goto L_0x009f;
        r5 = r14.next();
        r5 = (com.google.android.gms.internal.zzalt) r5;
        r6 = com.google.android.gms.ads.internal.zzbt.zzes();
        r6 = r6.currentTimeMillis();
        r8 = 0;
        r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r10 != 0) goto L_0x0050;
        r10 = r5.isDone();	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        if (r10 == 0) goto L_0x0050;	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        r10 = r5.get();	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        r10 = (com.google.android.gms.internal.zzvw) r10;	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        goto L_0x0057;	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        r10 = r5.get(r1, r10);	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        goto L_0x004d;	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        r11 = r13.zzcjq;	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        r11.add(r10);	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        if (r10 == 0) goto L_0x0082;	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        r11 = r10.zzcjd;	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        if (r11 != 0) goto L_0x0082;	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        r11 = r10.zzcji;	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        if (r11 == 0) goto L_0x0082;	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        r12 = r11.zzmn();	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        if (r12 <= r4) goto L_0x0082;	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        r0 = r11.zzmn();	 Catch:{ InterruptedException -> 0x007c, ExecutionException -> 0x007a, RemoteException -> 0x0078, TimeoutException -> 0x0076 }
        r4 = r0;
        r3 = r5;
        r0 = r10;
        goto L_0x0082;
        r14 = move-exception;
        goto L_0x0091;
        r5 = move-exception;
        goto L_0x007d;
        r5 = move-exception;
        goto L_0x007d;
        r5 = move-exception;
        goto L_0x007d;
        r5 = move-exception;
        r10 = "Exception while processing an adapter; continuing with other adapters";	 Catch:{ all -> 0x0074 }
        com.google.android.gms.internal.zzaky.zzc(r10, r5);	 Catch:{ all -> 0x0074 }
        r5 = com.google.android.gms.ads.internal.zzbt.zzes();
        r10 = r5.currentTimeMillis();
        r10 = r10 - r6;
        r1 = r1 - r10;
        r1 = java.lang.Math.max(r1, r8);
        goto L_0x0029;
        r0 = com.google.android.gms.ads.internal.zzbt.zzes();
        r3 = r0.currentTimeMillis();
        r3 = r3 - r6;
        r1 = r1 - r3;
        java.lang.Math.max(r1, r8);
        throw r14;
        r13.zza(r3);
        if (r0 != 0) goto L_0x00ab;
        r14 = new com.google.android.gms.internal.zzvw;
        r0 = 1;
        r14.<init>(r0);
        return r14;
        return r0;
        r14 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ac }
        throw r14;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzvz.zzj(java.util.List):com.google.android.gms.internal.zzvw");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0025 in {7, 9, 12} preds:[]
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
    public final void cancel() {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = 1;
        r3.zzcjn = r1;	 Catch:{ all -> 0x0022 }
        r1 = r3.zzcjo;	 Catch:{ all -> 0x0022 }
        r1 = r1.values();	 Catch:{ all -> 0x0022 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0022 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0022 }
        if (r2 == 0) goto L_0x0020;	 Catch:{ all -> 0x0022 }
        r2 = r1.next();	 Catch:{ all -> 0x0022 }
        r2 = (com.google.android.gms.internal.zzvt) r2;	 Catch:{ all -> 0x0022 }
        r2.cancel();	 Catch:{ all -> 0x0022 }
        goto L_0x0010;	 Catch:{ all -> 0x0022 }
        monitor-exit(r0);	 Catch:{ all -> 0x0022 }
        return;	 Catch:{ all -> 0x0022 }
        r1 = move-exception;	 Catch:{ all -> 0x0022 }
        monitor-exit(r0);	 Catch:{ all -> 0x0022 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzvz.cancel():void");
    }

    public final zzvw zzh(List<zzvp> list) {
        ArrayList arrayList;
        zzaky.zzby("Starting mediation.");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList2 = new ArrayList();
        zzko zzko = this.zzcjk.zzaud;
        int[] iArr = new int[2];
        if (zzko.zzbic != null) {
            zzbt.zzfd();
            if (zzvy.zza(this.zzcjp, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzko[] zzkoArr = zzko.zzbic;
                int length = zzkoArr.length;
                while (i < length) {
                    zzko zzko2 = zzkoArr[i];
                    if (i2 == zzko2.width && i3 == zzko2.height) {
                        zzko = zzko2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzvp zzvp = (zzvp) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(zzvp.zzchc);
            zzaky.zzcy(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = zzvp.zzchd.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                Context context = this.mContext;
                zzwf zzwf = this.zzanu;
                zzvq zzvq = this.zzcir;
                zzkk zzkk = this.zzcjk.zzcrv;
                zzala zzala = this.zzcjk.zzatz;
                boolean z = this.zzavr;
                Iterator it3 = it;
                Iterator it4 = it2;
                ArrayList arrayList3 = arrayList2;
                boolean z2 = z;
                zzala zzala2 = zzala;
                zzvt zzvt = new zzvt(context, str2, zzwf, zzvq, zzvp, zzkk, zzko, zzala2, z2, this.zzciv, this.zzcjk.zzauq, this.zzcjk.zzauy, this.zzcjk.zzcsk, this.zzcjk.zzctf, this.zzciw);
                zzalt zza = zzaid.zza(newCachedThreadPool, new zzwa(this, zzvt));
                this.zzcjo.put(zza, zzvt);
                arrayList = arrayList3;
                arrayList.add(zza);
                it = it3;
                arrayList2 = arrayList;
                it2 = it4;
            }
        }
        arrayList = arrayList2;
        return this.zzcjm != 2 ? zzi(arrayList) : zzj(arrayList);
    }

    public final List<zzvw> zzmf() {
        return this.zzcjq;
    }
}
