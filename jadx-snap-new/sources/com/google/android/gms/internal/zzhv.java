package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;

final class zzhv {
    private ByteArrayOutputStream zzbah = new ByteArrayOutputStream(4096);
    private Base64OutputStream zzbai = new Base64OutputStream(this.zzbah, 10);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x002b in {3, 5, 8, 10, 16, 18} preds:[]
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
    public final java.lang.String toString() {
        /*
        r3 = this;
        r0 = "HashManager: Unable to convert to Base64.";
        r1 = r3.zzbai;	 Catch:{ IOException -> 0x0008 }
        r1.close();	 Catch:{ IOException -> 0x0008 }
        goto L_0x000c;
        r1 = move-exception;
        com.google.android.gms.internal.zzaky.zzb(r0, r1);
        r1 = 0;
        r2 = r3.zzbah;	 Catch:{ IOException -> 0x001f }
        r2.close();	 Catch:{ IOException -> 0x001f }
        r2 = r3.zzbah;	 Catch:{ IOException -> 0x001f }
        r0 = r2.toString();	 Catch:{ IOException -> 0x001f }
        r3.zzbah = r1;
        r3.zzbai = r1;
        return r0;
        r0 = move-exception;
        goto L_0x0026;
        r2 = move-exception;
        com.google.android.gms.internal.zzaky.zzb(r0, r2);	 Catch:{ all -> 0x001d }
        r0 = "";	 Catch:{ all -> 0x001d }
        goto L_0x0018;
        r3.zzbah = r1;
        r3.zzbai = r1;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhv.toString():java.lang.String");
    }

    public final void write(byte[] bArr) {
        this.zzbai.write(bArr);
    }
}
