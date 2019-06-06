package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class zzak {
    private static Comparator<byte[]> zzbv = new zzal();
    private final List<byte[]> zzbr = new LinkedList();
    private final List<byte[]> zzbs = new ArrayList(64);
    private int zzbt = 0;
    private final int zzbu = 4096;

    public zzak(int i) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0021 in {5, 7, 10} preds:[]
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
    private final synchronized void zzm() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.zzbt;	 Catch:{ all -> 0x001e }
        r1 = r2.zzbu;	 Catch:{ all -> 0x001e }
        if (r0 <= r1) goto L_0x001c;	 Catch:{ all -> 0x001e }
        r0 = r2.zzbr;	 Catch:{ all -> 0x001e }
        r1 = 0;	 Catch:{ all -> 0x001e }
        r0 = r0.remove(r1);	 Catch:{ all -> 0x001e }
        r0 = (byte[]) r0;	 Catch:{ all -> 0x001e }
        r1 = r2.zzbs;	 Catch:{ all -> 0x001e }
        r1.remove(r0);	 Catch:{ all -> 0x001e }
        r1 = r2.zzbt;	 Catch:{ all -> 0x001e }
        r0 = r0.length;	 Catch:{ all -> 0x001e }
        r1 = r1 - r0;	 Catch:{ all -> 0x001e }
        r2.zzbt = r1;	 Catch:{ all -> 0x001e }
        goto L_0x0001;
        monitor-exit(r2);
        return;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzak.zzm():void");
    }

    /* JADX WARNING: Missing block: B:16:0x002f, code skipped:
            return;
     */
    public final synchronized void zza(byte[] r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        if (r3 == 0) goto L_0x002e;
    L_0x0003:
        r0 = r3.length;	 Catch:{ all -> 0x002b }
        r1 = r2.zzbu;	 Catch:{ all -> 0x002b }
        if (r0 <= r1) goto L_0x0009;
    L_0x0008:
        goto L_0x002e;
    L_0x0009:
        r0 = r2.zzbr;	 Catch:{ all -> 0x002b }
        r0.add(r3);	 Catch:{ all -> 0x002b }
        r0 = r2.zzbs;	 Catch:{ all -> 0x002b }
        r1 = zzbv;	 Catch:{ all -> 0x002b }
        r0 = java.util.Collections.binarySearch(r0, r3, r1);	 Catch:{ all -> 0x002b }
        if (r0 >= 0) goto L_0x001b;
    L_0x0018:
        r0 = -r0;
        r0 = r0 + -1;
    L_0x001b:
        r1 = r2.zzbs;	 Catch:{ all -> 0x002b }
        r1.add(r0, r3);	 Catch:{ all -> 0x002b }
        r0 = r2.zzbt;	 Catch:{ all -> 0x002b }
        r3 = r3.length;	 Catch:{ all -> 0x002b }
        r0 = r0 + r3;
        r2.zzbt = r0;	 Catch:{ all -> 0x002b }
        r2.zzm();	 Catch:{ all -> 0x002b }
        monitor-exit(r2);
        return;
    L_0x002b:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
    L_0x002e:
        monitor-exit(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzak.zza(byte[]):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0031 in {9, 10, 14, 17} preds:[]
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
    public final synchronized byte[] zzb(int r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = 0;
        r1 = r3.zzbs;	 Catch:{ all -> 0x002e }
        r1 = r1.size();	 Catch:{ all -> 0x002e }
        if (r0 >= r1) goto L_0x002a;	 Catch:{ all -> 0x002e }
        r1 = r3.zzbs;	 Catch:{ all -> 0x002e }
        r1 = r1.get(r0);	 Catch:{ all -> 0x002e }
        r1 = (byte[]) r1;	 Catch:{ all -> 0x002e }
        r2 = r1.length;	 Catch:{ all -> 0x002e }
        if (r2 < r4) goto L_0x0027;	 Catch:{ all -> 0x002e }
        r4 = r3.zzbt;	 Catch:{ all -> 0x002e }
        r2 = r1.length;	 Catch:{ all -> 0x002e }
        r4 = r4 - r2;	 Catch:{ all -> 0x002e }
        r3.zzbt = r4;	 Catch:{ all -> 0x002e }
        r4 = r3.zzbs;	 Catch:{ all -> 0x002e }
        r4.remove(r0);	 Catch:{ all -> 0x002e }
        r4 = r3.zzbr;	 Catch:{ all -> 0x002e }
        r4.remove(r1);	 Catch:{ all -> 0x002e }
        monitor-exit(r3);
        return r1;
        r0 = r0 + 1;
        goto L_0x0002;
        r4 = new byte[r4];	 Catch:{ all -> 0x002e }
        monitor-exit(r3);
        return r4;
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzak.zzb(int):byte[]");
    }
}
