package defpackage;

import android.media.MediaCodecInfo;

/* renamed from: sxh */
public final class sxh {
    private static jh<String, Integer> a = new jh();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:37:0x006f in {3, 11, 18, 19, 22, 23, 29, 32, 36} preds:[]
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
    public static int a(java.lang.String r5) {
        /*
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 23;
        if (r0 >= r1) goto L_0x0008;
        r5 = -2;
        return r5;
        r0 = a;
        monitor-enter(r0);
        r1 = a;	 Catch:{ all -> 0x006c }
        r1 = r1.get(r5);	 Catch:{ all -> 0x006c }
        r1 = (java.lang.Integer) r1;	 Catch:{ all -> 0x006c }
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        if (r1 == 0) goto L_0x001b;
        r5 = r1.intValue();
        return r5;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = android.media.MediaCodecList.getCodecCount();
        r2 = 0;
        if (r2 >= r1) goto L_0x0049;
        r3 = android.media.MediaCodecList.getCodecInfoAt(r2);
        r4 = r3.isEncoder();
        if (r4 != 0) goto L_0x0046;
        r4 = defpackage.sxh.a(r3, r5);
        if (r4 == 0) goto L_0x0046;
        r3 = r3.getCapabilitiesForType(r5);
        r3 = r3.getMaxSupportedInstances();
        r3 = java.lang.Integer.valueOf(r3);
        r0.add(r3);
        r2 = r2 + 1;
        goto L_0x0025;
        r1 = r0.isEmpty();
        if (r1 == 0) goto L_0x0051;
        r0 = -3;
        goto L_0x005b;
        r0 = java.util.Collections.min(r0);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r1 = a;
        monitor-enter(r1);
        r2 = a;	 Catch:{ all -> 0x0069 }
        r3 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x0069 }
        r2.put(r5, r3);	 Catch:{ all -> 0x0069 }
        monitor-exit(r1);	 Catch:{ all -> 0x0069 }
        return r0;	 Catch:{ all -> 0x0069 }
        r5 = move-exception;	 Catch:{ all -> 0x0069 }
        monitor-exit(r1);	 Catch:{ all -> 0x0069 }
        throw r5;
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxh.a(java.lang.String):int");
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        for (String equalsIgnoreCase : mediaCodecInfo.getSupportedTypes()) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
