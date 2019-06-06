package com.google.android.gms.internal;

final class zzfis implements zzfjb {
    private zzfjb[] zzpqy;

    zzfis(zzfjb... zzfjbArr) {
        this.zzpqy = zzfjbArr;
    }

    public final boolean zzi(Class<?> cls) {
        for (zzfjb zzi : this.zzpqy) {
            if (zzi.zzi(cls)) {
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0036 in {5, 6, 9, 10, 12} preds:[]
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
    public final com.google.android.gms.internal.zzfja zzj(java.lang.Class<?> r6) {
        /*
        r5 = this;
        r0 = r5.zzpqy;
        r1 = r0.length;
        r2 = 0;
        if (r2 >= r1) goto L_0x0016;
        r3 = r0[r2];
        r4 = r3.zzi(r6);
        if (r4 == 0) goto L_0x0013;
        r6 = r3.zzj(r6);
        return r6;
        r2 = r2 + 1;
        goto L_0x0004;
        r0 = new java.lang.UnsupportedOperationException;
        r1 = "No factory is available for message type: ";
        r6 = r6.getName();
        r6 = java.lang.String.valueOf(r6);
        r2 = r6.length();
        if (r2 == 0) goto L_0x002d;
        r6 = r1.concat(r6);
        goto L_0x0032;
        r6 = new java.lang.String;
        r6.<init>(r1);
        r0.<init>(r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfis.zzj(java.lang.Class):com.google.android.gms.internal.zzfja");
    }
}
