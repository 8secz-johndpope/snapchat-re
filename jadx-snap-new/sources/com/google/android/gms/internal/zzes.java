package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class zzes {
    private static String TAG = "zzes";
    private final String className;
    private final zzdm zzagq;
    private final String zzaks;
    private final int zzakt = 2;
    private volatile Method zzaku = null;
    private final Class<?>[] zzakv;
    private CountDownLatch zzakw = new CountDownLatch(1);

    public zzes(zzdm zzdm, String str, String str2, Class<?>... clsArr) {
        this.zzagq = zzdm;
        this.className = str;
        this.zzaks = str2;
        this.zzakv = clsArr;
        this.zzagq.getExecutorService().submit(new zzet(this));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x003c in {4, 5, 8, 11} preds:[]
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
    private final void zzba() {
        /*
        r3 = this;
        r0 = r3.zzagq;	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r0 = r0.zzaf();	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r1 = r3.zzagq;	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r1 = r1.zzah();	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r2 = r3.className;	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r1 = r3.zzc(r1, r2);	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r0 = r0.loadClass(r1);	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        if (r0 != 0) goto L_0x001e;
        r0 = r3.zzakw;
        r0.countDown();
        return;
        r1 = r3.zzagq;	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r1 = r1.zzah();	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r2 = r3.zzaks;	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r1 = r3.zzc(r1, r2);	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r2 = r3.zzakv;	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r0 = r0.getMethod(r1, r2);	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r3.zzaku = r0;	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        r0 = r3.zzaku;	 Catch:{ zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException -> 0x0018, all -> 0x0035 }
        goto L_0x0018;
        r0 = move-exception;
        r1 = r3.zzakw;
        r1.countDown();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzes.zzba():void");
    }

    private final String zzc(byte[] bArr, String str) {
        return new String(this.zzagq.zzag().zzb(bArr, str), "UTF-8");
    }

    public final Method zzbb() {
        if (this.zzaku != null) {
            return this.zzaku;
        }
        Method method = null;
        try {
            if (!this.zzakw.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            method = this.zzaku;
            return method;
        } catch (InterruptedException unused) {
        }
    }
}
