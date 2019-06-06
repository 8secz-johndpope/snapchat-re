package com.google.android.gms.internal;

@zzabh
public final class zzame {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:35:0x00b7 in {17, 18, 20, 23, 24, 25, 27, 29, 30, 32, 34} preds:[]
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
    public static java.net.HttpURLConnection zzb(java.lang.String r6, int r7) {
        /*
        r0 = new java.net.URL;
        r0.<init>(r6);
        r6 = 0;
        r1 = r0;
        r0 = 0;
        r0 = r0 + 1;
        r2 = 20;
        if (r0 > r2) goto L_0x00af;
        r2 = r1.openConnection();
        r2.setConnectTimeout(r7);
        r2.setReadTimeout(r7);
        r3 = r2 instanceof java.net.HttpURLConnection;
        if (r3 == 0) goto L_0x00a7;
        r2 = (java.net.HttpURLConnection) r2;
        r3 = new com.google.android.gms.internal.zzaks;
        r3.<init>();
        r4 = 0;
        r3.zza(r2, r4);
        r2.setInstanceFollowRedirects(r6);
        r4 = r2.getResponseCode();
        r3.zza(r2, r4);
        r4 = r4 / 100;
        r3 = 3;
        if (r4 != r3) goto L_0x00a6;
        r3 = "Location";
        r3 = r2.getHeaderField(r3);
        if (r3 == 0) goto L_0x009e;
        r4 = new java.net.URL;
        r4.<init>(r1, r3);
        r1 = r4.getProtocol();
        if (r1 == 0) goto L_0x0096;
        r5 = "http";
        r5 = r1.equals(r5);
        if (r5 != 0) goto L_0x0076;
        r5 = "https";
        r5 = r1.equals(r5);
        if (r5 != 0) goto L_0x0076;
        r6 = new java.io.IOException;
        r7 = "Unsupported scheme: ";
        r0 = java.lang.String.valueOf(r1);
        r1 = r0.length();
        if (r1 == 0) goto L_0x006c;
        r7 = r7.concat(r0);
        goto L_0x0072;
        r0 = new java.lang.String;
        r0.<init>(r7);
        r7 = r0;
        r6.<init>(r7);
        throw r6;
        r1 = "Redirecting to ";
        r3 = java.lang.String.valueOf(r3);
        r5 = r3.length();
        if (r5 == 0) goto L_0x0087;
        r1 = r1.concat(r3);
        goto L_0x008d;
        r3 = new java.lang.String;
        r3.<init>(r1);
        r1 = r3;
        com.google.android.gms.internal.zzaky.zzby(r1);
        r2.disconnect();
        r1 = r4;
        goto L_0x0008;
        r6 = new java.io.IOException;
        r7 = "Protocol is null";
        r6.<init>(r7);
        throw r6;
        r6 = new java.io.IOException;
        r7 = "Missing Location header in redirect";
        r6.<init>(r7);
        throw r6;
        return r2;
        r6 = new java.io.IOException;
        r7 = "Invalid protocol.";
        r6.<init>(r7);
        throw r6;
        r6 = new java.io.IOException;
        r7 = "Too many redirects (20)";
        r6.<init>(r7);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzame.zzb(java.lang.String, int):java.net.HttpURLConnection");
    }
}
