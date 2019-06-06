package defpackage;

import android.util.Log;
import defpackage.yp.d;
import java.io.File;
import java.io.IOException;

/* renamed from: abu */
public final class abu implements abq {
    private final abz a;
    private final File b;
    private final long c;
    private final abs d = new abs();
    private yp e;

    @Deprecated
    abu(File file, long j) {
        this.b = file;
        this.c = j;
        this.a = new abz();
    }

    private synchronized yp a() {
        if (this.e == null) {
            this.e = yp.a(this.b, this.c);
        }
        return this.e;
    }

    public final File a(zd zdVar) {
        String a = this.a.a(zdVar);
        String str = "DiskLruCacheWrapper";
        if (Log.isLoggable(str, 2)) {
            StringBuilder stringBuilder = new StringBuilder("Get: Obtained: ");
            stringBuilder.append(a);
            stringBuilder.append(" for for Key: ");
            stringBuilder.append(zdVar);
            Log.v(str, stringBuilder.toString());
        }
        try {
            d a2 = a().a(a);
            return a2 != null ? a2.a[0] : null;
        } catch (IOException e) {
            if (!Log.isLoggable(str, 5)) {
                return null;
            }
            Log.w(str, "Unable to get from disk cache", e);
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:45:0x00aa in {5, 12, 17, 24, 26, 29, 31, 37, 40, 44} preds:[]
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
    public final void a(defpackage.zd r6, defpackage.abq.b r7) {
        /*
        r5 = this;
        r0 = r5.a;
        r0 = r0.a(r6);
        r1 = r5.d;
        monitor-enter(r1);
        r2 = r1.a;	 Catch:{ all -> 0x00a7 }
        r2 = r2.get(r0);	 Catch:{ all -> 0x00a7 }
        r2 = (defpackage.abs.a) r2;	 Catch:{ all -> 0x00a7 }
        if (r2 != 0) goto L_0x001e;	 Catch:{ all -> 0x00a7 }
        r2 = r1.b;	 Catch:{ all -> 0x00a7 }
        r2 = r2.a();	 Catch:{ all -> 0x00a7 }
        r3 = r1.a;	 Catch:{ all -> 0x00a7 }
        r3.put(r0, r2);	 Catch:{ all -> 0x00a7 }
        r3 = r2.b;	 Catch:{ all -> 0x00a7 }
        r4 = 1;	 Catch:{ all -> 0x00a7 }
        r3 = r3 + r4;	 Catch:{ all -> 0x00a7 }
        r2.b = r3;	 Catch:{ all -> 0x00a7 }
        monitor-exit(r1);	 Catch:{ all -> 0x00a7 }
        r1 = r2.a;
        r1.lock();
        r1 = "DiskLruCacheWrapper";	 Catch:{ all -> 0x00a0 }
        r2 = 2;	 Catch:{ all -> 0x00a0 }
        r1 = android.util.Log.isLoggable(r1, r2);	 Catch:{ all -> 0x00a0 }
        if (r1 == 0) goto L_0x004e;	 Catch:{ all -> 0x00a0 }
        r1 = "DiskLruCacheWrapper";	 Catch:{ all -> 0x00a0 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a0 }
        r3 = "Put: Obtained: ";	 Catch:{ all -> 0x00a0 }
        r2.<init>(r3);	 Catch:{ all -> 0x00a0 }
        r2.append(r0);	 Catch:{ all -> 0x00a0 }
        r3 = " for for Key: ";	 Catch:{ all -> 0x00a0 }
        r2.append(r3);	 Catch:{ all -> 0x00a0 }
        r2.append(r6);	 Catch:{ all -> 0x00a0 }
        r6 = r2.toString();	 Catch:{ all -> 0x00a0 }
        android.util.Log.v(r1, r6);	 Catch:{ all -> 0x00a0 }
        r6 = r5.a();	 Catch:{ IOException -> 0x008e }
        r1 = r6.a(r0);	 Catch:{ IOException -> 0x008e }
        if (r1 == 0) goto L_0x005e;
        r6 = r5.d;
        r6.a(r0);
        return;
        r6 = r6.b(r0);	 Catch:{ IOException -> 0x008e }
        if (r6 == 0) goto L_0x007e;
        r1 = r6.a();	 Catch:{ all -> 0x0079 }
        r7 = r7.a(r1);	 Catch:{ all -> 0x0079 }
        if (r7 == 0) goto L_0x0075;	 Catch:{ all -> 0x0079 }
        r7 = defpackage.yp.this;	 Catch:{ all -> 0x0079 }
        r7.a(r6, r4);	 Catch:{ all -> 0x0079 }
        r6.c = r4;	 Catch:{ all -> 0x0079 }
        r6.c();	 Catch:{ IOException -> 0x008e }
        goto L_0x0058;	 Catch:{ IOException -> 0x008e }
        r7 = move-exception;	 Catch:{ IOException -> 0x008e }
        r6.c();	 Catch:{ IOException -> 0x008e }
        throw r7;	 Catch:{ IOException -> 0x008e }
        r6 = new java.lang.IllegalStateException;	 Catch:{ IOException -> 0x008e }
        r7 = "Had two simultaneous puts for: ";	 Catch:{ IOException -> 0x008e }
        r1 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x008e }
        r7 = r7.concat(r1);	 Catch:{ IOException -> 0x008e }
        r6.<init>(r7);	 Catch:{ IOException -> 0x008e }
        throw r6;	 Catch:{ IOException -> 0x008e }
        r6 = move-exception;
        r7 = "DiskLruCacheWrapper";	 Catch:{ all -> 0x00a0 }
        r1 = 5;	 Catch:{ all -> 0x00a0 }
        r7 = android.util.Log.isLoggable(r7, r1);	 Catch:{ all -> 0x00a0 }
        if (r7 == 0) goto L_0x0058;	 Catch:{ all -> 0x00a0 }
        r7 = "DiskLruCacheWrapper";	 Catch:{ all -> 0x00a0 }
        r1 = "Unable to put to disk cache";	 Catch:{ all -> 0x00a0 }
        android.util.Log.w(r7, r1, r6);	 Catch:{ all -> 0x00a0 }
        goto L_0x0058;
        r6 = move-exception;
        r7 = r5.d;
        r7.a(r0);
        throw r6;
        r6 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00a7 }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abu.a(zd, abq$b):void");
    }
}
