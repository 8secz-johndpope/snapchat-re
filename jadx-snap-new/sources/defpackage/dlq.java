package defpackage;

/* renamed from: dlq */
public enum dlq implements ygk {
    JSON_GZIP;
    
    public static final a Companion = null;
    final String extension;

    /* renamed from: dlq$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0038 in {5, 6, 8} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public static defpackage.ygk a(java.lang.String r5) {
            /*
            r0 = "extension";
            defpackage.akcr.b(r5, r0);
            r0 = defpackage.dlq.values();
            r1 = r0.length;
            r2 = 0;
            if (r2 >= r1) goto L_0x001d;
            r3 = r0[r2];
            r4 = r3.extension;
            r4 = defpackage.akcr.a(r4, r5);
            if (r4 == 0) goto L_0x001a;
            r3 = (defpackage.ygk) r3;
            return r3;
            r2 = r2 + 1;
            goto L_0x000b;
            r0 = new java.lang.IllegalArgumentException;
            r1 = new java.lang.StringBuilder;
            r2 = "No BlizzardFileType with extension [";
            r1.<init>(r2);
            r1.append(r5);
            r5 = "] found";
            r1.append(r5);
            r5 = r1.toString();
            r0.<init>(r5);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dlq$a.a(java.lang.String):ygk");
        }
    }

    static {
        Companion = new a();
    }

    private dlq() {
        akcr.b(r3, "extension");
        this.extension = r3;
    }

    public final String a() {
        return this.extension;
    }
}
