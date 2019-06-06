package defpackage;

/* renamed from: aimp */
public final class aimp {
    public final aimn a;
    public final aimm b;
    private final String c;
    private final aimq d;
    private final Object e;

    /* renamed from: aimp$a */
    public static class a {
        public aimn a;
        String b = "GET";
        defpackage.aimm.a c = new defpackage.aimm.a();

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0090 in {8, 10, 17, 19, 21, 23, 25} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final defpackage.aimp.a a(java.lang.String r11, java.lang.String r12) {
            /*
            r10 = this;
            r0 = r10.c;
            r1 = r11.isEmpty();
            if (r1 != 0) goto L_0x0088;
            r1 = r11.length();
            r2 = 0;
            r3 = 0;
            r4 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
            r5 = 2;
            r6 = 3;
            r7 = 31;
            r8 = 1;
            if (r3 >= r1) goto L_0x003e;
            r9 = r11.charAt(r3);
            if (r9 <= r7) goto L_0x0022;
            if (r9 >= r4) goto L_0x0022;
            r3 = r3 + 1;
            goto L_0x000e;
            r12 = new java.lang.IllegalArgumentException;
            r0 = new java.lang.Object[r6];
            r1 = java.lang.Integer.valueOf(r9);
            r0[r2] = r1;
            r1 = java.lang.Integer.valueOf(r3);
            r0[r8] = r1;
            r0[r5] = r11;
            r11 = "Unexpected char %#04x at %d in header name: %s";
            r11 = java.lang.String.format(r11, r0);
            r12.<init>(r11);
            throw r12;
            if (r12 == 0) goto L_0x0080;
            r1 = r12.length();
            r3 = 0;
            if (r3 >= r1) goto L_0x006e;
            r9 = r12.charAt(r3);
            if (r9 <= r7) goto L_0x0052;
            if (r9 >= r4) goto L_0x0052;
            r3 = r3 + 1;
            goto L_0x0045;
            r11 = new java.lang.IllegalArgumentException;
            r0 = new java.lang.Object[r6];
            r1 = java.lang.Integer.valueOf(r9);
            r0[r2] = r1;
            r1 = java.lang.Integer.valueOf(r3);
            r0[r8] = r1;
            r0[r5] = r12;
            r12 = "Unexpected char %#04x at %d in header value: %s";
            r12 = java.lang.String.format(r12, r0);
            r11.<init>(r12);
            throw r11;
            r0.a(r11);
            r1 = r0.a;
            r1.add(r11);
            r11 = r0.a;
            r12 = r12.trim();
            r11.add(r12);
            return r10;
            r11 = new java.lang.IllegalArgumentException;
            r12 = "value == null";
            r11.<init>(r12);
            throw r11;
            r11 = new java.lang.IllegalArgumentException;
            r12 = "name is empty";
            r11.<init>(r12);
            throw r11;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aimp$a.a(java.lang.String, java.lang.String):aimp$a");
        }
    }

    private aimp(a aVar) {
        this.a = aVar.a;
        this.c = aVar.b;
        this.b = new aimm(aVar.c, (byte) 0);
        this.d = null;
        this.e = this;
    }

    public /* synthetic */ aimp(a aVar, byte b) {
        this(aVar);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Request{method=");
        stringBuilder.append(this.c);
        stringBuilder.append(", url=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tag=");
        Object obj = this.e;
        if (obj == this) {
            obj = null;
        }
        stringBuilder.append(obj);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
