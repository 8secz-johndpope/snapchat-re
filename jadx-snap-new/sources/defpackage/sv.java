package defpackage;

/* renamed from: sv */
public final class sv {
    public static sw a = new tp();
    private static sy b = null;

    /* renamed from: sv$1 */
    static class 1 implements sy {
        private /* synthetic */ int a;
        private /* synthetic */ int b;
        private /* synthetic */ int c;
        private /* synthetic */ String d;

        1(int i, int i2, int i3, String str) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = str;
        }

        public final String a() {
            return this.d;
        }

        public final String toString() {
            return this.d;
        }
    }

    private sv() {
    }

    public static String a(su suVar, uc ucVar) {
        if (suVar instanceof tk) {
            return tq.a((tk) suVar, ucVar);
        }
        throw new UnsupportedOperationException("The serializing service works onlywith the XMPMeta implementation of this library");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x0091 in {21, 22, 23, 25, 28, 31} preds:[]
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
    public static synchronized defpackage.sy a() {
        /*
        r0 = defpackage.sv.class;
        monitor-enter(r0);
        r1 = b;	 Catch:{ all -> 0x008e }
        if (r1 != 0) goto L_0x008a;	 Catch:{ all -> 0x008e }
        r1 = "Test.SNAPSHOT";	 Catch:{ all -> 0x008e }
        r2 = 5;
        r3 = 0;
        r4 = defpackage.sv.class;	 Catch:{ IOException -> 0x0078 }
        r4 = r4.getClassLoader();	 Catch:{ IOException -> 0x0078 }
        r5 = "META-INF/MANIFEST.MF";	 Catch:{ IOException -> 0x0078 }
        r4 = r4.getResources(r5);	 Catch:{ IOException -> 0x0078 }
        r5 = r4.hasMoreElements();	 Catch:{ IOException -> 0x0078 }
        if (r5 == 0) goto L_0x0078;	 Catch:{ IOException -> 0x0078 }
        r5 = new java.util.jar.Manifest;	 Catch:{ IOException -> 0x0078 }
        r6 = r4.nextElement();	 Catch:{ IOException -> 0x0078 }
        r6 = (java.net.URL) r6;	 Catch:{ IOException -> 0x0078 }
        r6 = r6.openStream();	 Catch:{ IOException -> 0x0078 }
        r5.<init>(r6);	 Catch:{ IOException -> 0x0078 }
        r5 = r5.getMainAttributes();	 Catch:{ IOException -> 0x0078 }
        r6 = "com.adobe.xmp.xmpcore";	 Catch:{ IOException -> 0x0078 }
        r7 = "Bundle-SymbolicName";	 Catch:{ IOException -> 0x0078 }
        r7 = r5.getValue(r7);	 Catch:{ IOException -> 0x0078 }
        r6 = r6.equals(r7);	 Catch:{ IOException -> 0x0078 }
        if (r6 == 0) goto L_0x0017;	 Catch:{ IOException -> 0x0078 }
        r6 = "Bundle-Version";	 Catch:{ IOException -> 0x0078 }
        r6 = r5.getValue(r6);	 Catch:{ IOException -> 0x0078 }
        if (r6 == 0) goto L_0x0017;	 Catch:{ IOException -> 0x0078 }
        r6 = "Bundle-Version";	 Catch:{ IOException -> 0x0078 }
        r1 = r5.getValue(r6);	 Catch:{ IOException -> 0x0078 }
        r5 = "(\\d+)\\.(\\d+)\\.(\\d+).*";	 Catch:{ IOException -> 0x0078 }
        r5 = java.util.regex.Pattern.compile(r5);	 Catch:{ IOException -> 0x0078 }
        r5 = r5.matcher(r1);	 Catch:{ IOException -> 0x0078 }
        r6 = r5.find();	 Catch:{ IOException -> 0x0078 }
        if (r6 == 0) goto L_0x0017;	 Catch:{ IOException -> 0x0078 }
        r4 = 1;	 Catch:{ IOException -> 0x0078 }
        r4 = r5.group(r4);	 Catch:{ IOException -> 0x0078 }
        r2 = java.lang.Integer.parseInt(r4);	 Catch:{ IOException -> 0x0078 }
        r4 = 2;	 Catch:{ IOException -> 0x0078 }
        r4 = r5.group(r4);	 Catch:{ IOException -> 0x0078 }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ IOException -> 0x0078 }
        r6 = 3;
        r5 = r5.group(r6);	 Catch:{ IOException -> 0x0079 }
        r3 = java.lang.Integer.parseInt(r5);	 Catch:{ IOException -> 0x0079 }
        goto L_0x0079;
        r4 = 0;
    L_0x0079:
        r5 = "Adobe XMP Core ";	 Catch:{ all -> 0x008e }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x008e }
        r1 = r5.concat(r1);	 Catch:{ all -> 0x008e }
        r5 = new sv$1;	 Catch:{ all -> 0x008e }
        r5.<init>(r2, r4, r3, r1);	 Catch:{ all -> 0x008e }
        b = r5;	 Catch:{ all -> 0x008e }
        r1 = b;	 Catch:{ all -> 0x008e }
        monitor-exit(r0);
        return r1;
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv.a():sy");
    }
}
