package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: acux */
public final class acux {
    private final HashMap<String, Long> a;
    private final int b;

    private acux() {
        this.b = 5000;
        this.a = new HashMap();
    }

    public acux(char c) {
        this();
    }

    public final synchronized void a(List<String> list) {
        akcr.b(list, "temporaryWorkerThreadStorage");
        Object keySet = this.a.keySet();
        akcr.a(keySet, "keyExpirations.keys");
        list.addAll((Collection) keySet);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0033 in {7, 9, 12, 15} preds:[]
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
    public final synchronized boolean a(java.lang.String r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = "id";	 Catch:{ all -> 0x0030 }
        defpackage.akcr.b(r8, r0);	 Catch:{ all -> 0x0030 }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0030 }
        r2 = r7.a;	 Catch:{ all -> 0x0030 }
        r2 = r2.get(r8);	 Catch:{ all -> 0x0030 }
        r2 = (java.lang.Long) r2;	 Catch:{ all -> 0x0030 }
        if (r2 == 0) goto L_0x0023;	 Catch:{ all -> 0x0030 }
        r2 = r2.longValue();	 Catch:{ all -> 0x0030 }
        r2 = r0 - r2;
        r4 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 >= 0) goto L_0x0023;
        r8 = 0;
        monitor-exit(r7);
        return r8;
        r2 = r7.a;	 Catch:{ all -> 0x0030 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x0030 }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x0030 }
        r2.put(r8, r0);	 Catch:{ all -> 0x0030 }
        r8 = 1;
        goto L_0x0021;
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acux.a(java.lang.String):boolean");
    }

    public final synchronized void b(String str) {
        akcr.b(str, "id");
        this.a.remove(str);
    }
}
