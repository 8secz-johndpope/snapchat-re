package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.js.zzn;
import java.util.ArrayList;
import java.util.WeakHashMap;

@zzabh
public final class zzfu implements zzgc {
    private final Context mApplicationContext;
    private final Object mLock = new Object();
    private final zzala zzapq;
    private final WeakHashMap<zzahd, zzfv> zzavs = new WeakHashMap();
    private final ArrayList<zzfv> zzavt = new ArrayList();
    private final zzn zzavu;

    public zzfu(Context context, zzala zzala) {
        this.mApplicationContext = context.getApplicationContext();
        this.zzapq = zzala;
        this.zzavu = new zzn(context.getApplicationContext(), zzala, (String) zzlc.zzio().zzd(zzoi.zzblc));
    }

    private final boolean zzg(zzahd zzahd) {
        boolean z;
        synchronized (this.mLock) {
            zzfv zzfv = (zzfv) this.zzavs.get(zzahd);
            z = zzfv != null && zzfv.zzge();
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0033 in {10, 12, 15} preds:[]
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
    public final void zza(com.google.android.gms.internal.zzfv r4) {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r4.zzge();	 Catch:{ all -> 0x0030 }
        if (r1 != 0) goto L_0x002e;	 Catch:{ all -> 0x0030 }
        r1 = r3.zzavt;	 Catch:{ all -> 0x0030 }
        r1.remove(r4);	 Catch:{ all -> 0x0030 }
        r1 = r3.zzavs;	 Catch:{ all -> 0x0030 }
        r1 = r1.entrySet();	 Catch:{ all -> 0x0030 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0030 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0030 }
        if (r2 == 0) goto L_0x002e;	 Catch:{ all -> 0x0030 }
        r2 = r1.next();	 Catch:{ all -> 0x0030 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0030 }
        r2 = r2.getValue();	 Catch:{ all -> 0x0030 }
        if (r2 != r4) goto L_0x0018;	 Catch:{ all -> 0x0030 }
        r1.remove();	 Catch:{ all -> 0x0030 }
        goto L_0x0018;	 Catch:{ all -> 0x0030 }
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        return;	 Catch:{ all -> 0x0030 }
        r4 = move-exception;	 Catch:{ all -> 0x0030 }
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfu.zza(com.google.android.gms.internal.zzfv):void");
    }

    public final void zza(zzko zzko, zzahd zzahd) {
        zza(zzko, zzahd, zzahd.zzcnm.getView());
    }

    public final void zza(zzko zzko, zzahd zzahd, View view) {
        zza(zzko, zzahd, new zzgb(view, zzahd), null);
    }

    public final void zza(zzko zzko, zzahd zzahd, View view, zzaof zzaof) {
        zza(zzko, zzahd, new zzgb(view, zzahd), zzaof);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0047 in {5, 6, 8, 10, 12, 15} preds:[]
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
    public final void zza(com.google.android.gms.internal.zzko r9, com.google.android.gms.internal.zzahd r10, com.google.android.gms.internal.zzhf r11, com.google.android.gms.internal.zzaof r12) {
        /*
        r8 = this;
        r0 = r8.mLock;
        monitor-enter(r0);
        r1 = r8.zzg(r10);	 Catch:{ all -> 0x0044 }
        if (r1 == 0) goto L_0x0012;	 Catch:{ all -> 0x0044 }
        r9 = r8.zzavs;	 Catch:{ all -> 0x0044 }
        r9 = r9.get(r10);	 Catch:{ all -> 0x0044 }
        r9 = (com.google.android.gms.internal.zzfv) r9;	 Catch:{ all -> 0x0044 }
        goto L_0x002d;	 Catch:{ all -> 0x0044 }
        r7 = new com.google.android.gms.internal.zzfv;	 Catch:{ all -> 0x0044 }
        r2 = r8.mApplicationContext;	 Catch:{ all -> 0x0044 }
        r5 = r8.zzapq;	 Catch:{ all -> 0x0044 }
        r1 = r7;	 Catch:{ all -> 0x0044 }
        r3 = r9;	 Catch:{ all -> 0x0044 }
        r4 = r10;	 Catch:{ all -> 0x0044 }
        r6 = r11;	 Catch:{ all -> 0x0044 }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0044 }
        r7.zza(r8);	 Catch:{ all -> 0x0044 }
        r9 = r8.zzavs;	 Catch:{ all -> 0x0044 }
        r9.put(r10, r7);	 Catch:{ all -> 0x0044 }
        r9 = r8.zzavt;	 Catch:{ all -> 0x0044 }
        r9.add(r7);	 Catch:{ all -> 0x0044 }
        r9 = r7;	 Catch:{ all -> 0x0044 }
        if (r12 == 0) goto L_0x0038;	 Catch:{ all -> 0x0044 }
        r10 = new com.google.android.gms.internal.zzgd;	 Catch:{ all -> 0x0044 }
        r10.<init>(r9, r12);	 Catch:{ all -> 0x0044 }
        r9.zza(r10);	 Catch:{ all -> 0x0044 }
        goto L_0x0042;	 Catch:{ all -> 0x0044 }
        r10 = new com.google.android.gms.internal.zzgh;	 Catch:{ all -> 0x0044 }
        r11 = r8.zzavu;	 Catch:{ all -> 0x0044 }
        r12 = r8.mApplicationContext;	 Catch:{ all -> 0x0044 }
        r10.<init>(r9, r11, r12);	 Catch:{ all -> 0x0044 }
        goto L_0x0034;	 Catch:{ all -> 0x0044 }
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        return;	 Catch:{ all -> 0x0044 }
        r9 = move-exception;	 Catch:{ all -> 0x0044 }
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfu.zza(com.google.android.gms.internal.zzko, com.google.android.gms.internal.zzahd, com.google.android.gms.internal.zzhf, com.google.android.gms.internal.zzaof):void");
    }

    public final void zzh(zzahd zzahd) {
        synchronized (this.mLock) {
            zzfv zzfv = (zzfv) this.zzavs.get(zzahd);
            if (zzfv != null) {
                zzfv.zzgc();
            }
        }
    }

    public final void zzi(zzahd zzahd) {
        synchronized (this.mLock) {
            zzfv zzfv = (zzfv) this.zzavs.get(zzahd);
            if (zzfv != null) {
                zzfv.stop();
            }
        }
    }

    public final void zzj(zzahd zzahd) {
        synchronized (this.mLock) {
            zzfv zzfv = (zzfv) this.zzavs.get(zzahd);
            if (zzfv != null) {
                zzfv.pause();
            }
        }
    }

    public final void zzk(zzahd zzahd) {
        synchronized (this.mLock) {
            zzfv zzfv = (zzfv) this.zzavs.get(zzahd);
            if (zzfv != null) {
                zzfv.resume();
            }
        }
    }
}
