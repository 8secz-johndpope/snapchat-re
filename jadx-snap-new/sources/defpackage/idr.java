package defpackage;

import android.content.Context;
import defpackage.igc.a;

/* renamed from: idr */
public abstract class idr {
    static ajdx<iha> a(ajwy<iha> ajwy) {
        return ajdx.c(new -$$Lambda$idr$Kb2N78-pe3jXbfJvNDhNa2aZkS8(ajwy));
    }

    static igc a(Context context) {
        a aVar = new a();
        aVar.a.a = ajdx.c(new -$$Lambda$idr$kOnl5OhRFGdU4ulS43PInrC7dnw(context));
        aVar.a.b = ajdx.c(new -$$Lambda$idr$kxkFEVySAioJ5yy3yGP_DZAyv-w(context));
        aVar.a.c = ajdx.c(new -$$Lambda$idr$EXT6VWo2yQESylE7MzoJHBNmD98(context));
        aVar.a.d = ajdx.c(new -$$Lambda$idr$nu8IkA3TDIYZcG2wtB8KCplqNh4(context));
        aVar.a.e = ajdx.c(new -$$Lambda$idr$4LZQKQzG2rZFHmA7f4orjw_hqYE(context));
        aVar.a.f = ajdx.c(-$$Lambda$idr$rkVU-npL9_-d9njMdz_No7Y5A-8.INSTANCE);
        return aVar.a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0046 in {5, 7, 11, 13, 15} preds:[]
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
    static defpackage.iha a(defpackage.abss r2, java.util.Map<java.lang.Class<?>, defpackage.igz<?>> r3, java.util.Set<com.google.gson.TypeAdapterFactory> r4) {
        /*
        r2 = r2.l();	 Catch:{ all -> 0x0044 }
        if (r2 == 0) goto L_0x0019;	 Catch:{ all -> 0x0044 }
        r2 = android.os.Looper.myLooper();	 Catch:{ all -> 0x0044 }
        r0 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x0044 }
        if (r2 == r0) goto L_0x0011;	 Catch:{ all -> 0x0044 }
        goto L_0x0019;	 Catch:{ all -> 0x0044 }
        r2 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0044 }
        r3 = "Please ensure SerializationHelper loads on a background thread.";	 Catch:{ all -> 0x0044 }
        r2.<init>(r3);	 Catch:{ all -> 0x0044 }
        throw r2;	 Catch:{ all -> 0x0044 }
        r2 = new java.util.HashMap;	 Catch:{ all -> 0x0044 }
        r2.<init>();	 Catch:{ all -> 0x0044 }
        r3 = r3.entrySet();	 Catch:{ all -> 0x0044 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0044 }
        r0 = r3.hasNext();	 Catch:{ all -> 0x0044 }
        if (r0 == 0) goto L_0x003e;	 Catch:{ all -> 0x0044 }
        r0 = r3.next();	 Catch:{ all -> 0x0044 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0044 }
        r1 = r0.getKey();	 Catch:{ all -> 0x0044 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0044 }
        r2.put(r1, r0);	 Catch:{ all -> 0x0044 }
        goto L_0x0026;	 Catch:{ all -> 0x0044 }
        r3 = new iha;	 Catch:{ all -> 0x0044 }
        r3.<init>(r2, r4);	 Catch:{ all -> 0x0044 }
        return r3;
        r2 = move-exception;
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idr.a(abss, java.util.Map, java.util.Set):iha");
    }

    static ihh a() {
        return new ihl();
    }
}
