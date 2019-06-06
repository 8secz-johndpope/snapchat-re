package com.google.android.gms.internal;

import java.util.concurrent.CopyOnWriteArrayList;

public final class zzdti {
    private static final CopyOnWriteArrayList<zzdth> zzmeu = new CopyOnWriteArrayList();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0035 in {5, 8, 9, 11} preds:[]
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
    public static com.google.android.gms.internal.zzdth zzol(java.lang.String r3) {
        /*
        r0 = zzmeu;
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0019;
        r1 = r0.next();
        r1 = (com.google.android.gms.internal.zzdth) r1;
        r2 = r1.zzoj(r3);
        if (r2 == 0) goto L_0x0006;
        return r1;
        r0 = new java.security.GeneralSecurityException;
        r1 = "No KMS client does support: ";
        r3 = java.lang.String.valueOf(r3);
        r2 = r3.length();
        if (r2 == 0) goto L_0x002c;
        r3 = r1.concat(r3);
        goto L_0x0031;
        r3 = new java.lang.String;
        r3.<init>(r1);
        r0.<init>(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdti.zzol(java.lang.String):com.google.android.gms.internal.zzdth");
    }
}
