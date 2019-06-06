package defpackage;

import android.content.Context;

/* renamed from: aod */
public final class aod {
    private final Context a;

    public aod(Context context) {
        this.a = context;
    }

    private static aoc a(String str) {
        String str2 = "Unable to instantiate GlideModule implementation for ";
        try {
            Object cls = Class.forName(str);
            try {
                cls = cls.newInstance();
                if (cls instanceof aoc) {
                    return (aoc) cls;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(cls)));
            } catch (InstantiationException e) {
                throw new RuntimeException(str2.concat(String.valueOf(cls)), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(str2.concat(String.valueOf(cls)), e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e3);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0051 in {10, 11, 14} preds:[]
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
    public final java.util.List<defpackage.aoc> a() {
        /*
        r6 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r6.a;	 Catch:{ NameNotFoundException -> 0x0048 }
        r1 = r1.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0048 }
        r2 = r6.a;	 Catch:{ NameNotFoundException -> 0x0048 }
        r2 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x0048 }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0048 }
        r1 = r1.getApplicationInfo(r2, r3);	 Catch:{ NameNotFoundException -> 0x0048 }
        r2 = r1.metaData;	 Catch:{ NameNotFoundException -> 0x0048 }
        if (r2 == 0) goto L_0x0047;	 Catch:{ NameNotFoundException -> 0x0048 }
        r2 = r1.metaData;	 Catch:{ NameNotFoundException -> 0x0048 }
        r2 = r2.keySet();	 Catch:{ NameNotFoundException -> 0x0048 }
        r2 = r2.iterator();	 Catch:{ NameNotFoundException -> 0x0048 }
        r3 = r2.hasNext();	 Catch:{ NameNotFoundException -> 0x0048 }
        if (r3 == 0) goto L_0x0047;	 Catch:{ NameNotFoundException -> 0x0048 }
        r3 = r2.next();	 Catch:{ NameNotFoundException -> 0x0048 }
        r3 = (java.lang.String) r3;	 Catch:{ NameNotFoundException -> 0x0048 }
        r4 = "GlideModule";	 Catch:{ NameNotFoundException -> 0x0048 }
        r5 = r1.metaData;	 Catch:{ NameNotFoundException -> 0x0048 }
        r5 = r5.get(r3);	 Catch:{ NameNotFoundException -> 0x0048 }
        r4 = r4.equals(r5);	 Catch:{ NameNotFoundException -> 0x0048 }
        if (r4 == 0) goto L_0x0025;	 Catch:{ NameNotFoundException -> 0x0048 }
        r3 = defpackage.aod.a(r3);	 Catch:{ NameNotFoundException -> 0x0048 }
        r0.add(r3);	 Catch:{ NameNotFoundException -> 0x0048 }
        goto L_0x0025;
        return r0;
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = "Unable to find metadata to parse GlideModules";
        r1.<init>(r2, r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aod.a():java.util.List");
    }
}
