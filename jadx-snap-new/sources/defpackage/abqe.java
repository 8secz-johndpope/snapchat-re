package defpackage;

import defpackage.abpy.a;

/* renamed from: abqe */
public final class abqe {
    private final StringBuilder a;
    private final abqa b;

    /* renamed from: abqe$a */
    public static class a {
        public static final abqe a = new abqe();
    }

    private abqe() {
        this.a = new StringBuilder();
        this.b = a.a;
    }

    /* synthetic */ abqe(byte b) {
        this();
    }

    public static abqe a() {
        return a.a;
    }

    private boolean a(int i) {
        return this.b.a(i);
    }

    private synchronized String b(CharSequence charSequence, int i, int i2, int i3) {
        int codePointAt = Character.codePointAt(charSequence, i + i3);
        if (!abqe.b(i2) || !abqe.b(codePointAt)) {
            return null;
        }
        this.a.setLength(0);
        this.a.append(new String(Character.toChars(i2)));
        this.a.append(new String(Character.toChars(codePointAt)));
        return this.a.toString();
    }

    private static boolean b(int i) {
        return i >= 127462 && i <= 127487;
    }

    /* JADX WARNING: Missing block: B:26:0x006b, code skipped:
            return null;
     */
    private synchronized java.lang.String c(java.lang.CharSequence r3, int r4, int r5, int r6) {
        /*
        r2 = this;
        monitor-enter(r2);
        r4 = r4 + r6;
        r6 = java.lang.Character.codePointAt(r3, r4);	 Catch:{ all -> 0x006c }
        r0 = java.lang.Character.charCount(r6);	 Catch:{ all -> 0x006c }
        r4 = r4 + r0;
        r0 = r3.length();	 Catch:{ all -> 0x006c }
        r1 = 0;
        if (r4 < r0) goto L_0x0014;
    L_0x0012:
        monitor-exit(r2);
        return r1;
    L_0x0014:
        r3 = java.lang.Character.codePointAt(r3, r4);	 Catch:{ all -> 0x006c }
        r4 = 65039; // 0xfe0f float:9.1139E-41 double:3.21335E-319;
        if (r6 != r4) goto L_0x006a;
    L_0x001d:
        r4 = 8419; // 0x20e3 float:1.1798E-41 double:4.1595E-320;
        if (r3 != r4) goto L_0x006a;
    L_0x0021:
        r4 = 35;
        if (r5 == r4) goto L_0x0032;
    L_0x0025:
        r4 = 42;
        if (r5 == r4) goto L_0x0032;
    L_0x0029:
        r4 = 48;
        if (r5 < r4) goto L_0x006a;
    L_0x002d:
        r4 = 57;
        if (r5 <= r4) goto L_0x0032;
    L_0x0031:
        goto L_0x006a;
    L_0x0032:
        r4 = r2.a;	 Catch:{ all -> 0x006c }
        r0 = 0;
        r4.setLength(r0);	 Catch:{ all -> 0x006c }
        r4 = r2.a;	 Catch:{ all -> 0x006c }
        r0 = new java.lang.String;	 Catch:{ all -> 0x006c }
        r5 = java.lang.Character.toChars(r5);	 Catch:{ all -> 0x006c }
        r0.<init>(r5);	 Catch:{ all -> 0x006c }
        r4.append(r0);	 Catch:{ all -> 0x006c }
        r4 = r2.a;	 Catch:{ all -> 0x006c }
        r5 = new java.lang.String;	 Catch:{ all -> 0x006c }
        r6 = java.lang.Character.toChars(r6);	 Catch:{ all -> 0x006c }
        r5.<init>(r6);	 Catch:{ all -> 0x006c }
        r4.append(r5);	 Catch:{ all -> 0x006c }
        r4 = r2.a;	 Catch:{ all -> 0x006c }
        r5 = new java.lang.String;	 Catch:{ all -> 0x006c }
        r3 = java.lang.Character.toChars(r3);	 Catch:{ all -> 0x006c }
        r5.<init>(r3);	 Catch:{ all -> 0x006c }
        r4.append(r5);	 Catch:{ all -> 0x006c }
        r3 = r2.a;	 Catch:{ all -> 0x006c }
        r3 = r3.toString();	 Catch:{ all -> 0x006c }
        monitor-exit(r2);
        return r3;
    L_0x006a:
        monitor-exit(r2);
        return r1;
    L_0x006c:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abqe.c(java.lang.CharSequence, int, int, int):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x0071 in {11, 12, 14, 15, 19, 20, 24, 28, 29, 32, 35} preds:[]
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
    private synchronized java.lang.String d(java.lang.CharSequence r9, int r10, int r11, int r12) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.a;	 Catch:{ all -> 0x006e }
        r1 = 0;	 Catch:{ all -> 0x006e }
        r0.setLength(r1);	 Catch:{ all -> 0x006e }
        r0 = r8.a;	 Catch:{ all -> 0x006e }
        r11 = java.lang.Character.toChars(r11);	 Catch:{ all -> 0x006e }
        r0.append(r11);	 Catch:{ all -> 0x006e }
        r11 = 1;	 Catch:{ all -> 0x006e }
        r0 = 1;	 Catch:{ all -> 0x006e }
        r2 = 0;	 Catch:{ all -> 0x006e }
        r3 = 1;	 Catch:{ all -> 0x006e }
        r4 = 1;	 Catch:{ all -> 0x006e }
        r5 = r10 + r12;	 Catch:{ all -> 0x006e }
        r6 = r9.length();	 Catch:{ all -> 0x006e }
        if (r5 >= r6) goto L_0x0066;	 Catch:{ all -> 0x006e }
        r5 = java.lang.Character.codePointAt(r9, r5);	 Catch:{ all -> 0x006e }
        if (r0 == 0) goto L_0x0037;	 Catch:{ all -> 0x006e }
        r0 = 127995; // 0x1f3fb float:1.79359E-40 double:6.3238E-319;	 Catch:{ all -> 0x006e }
        if (r5 < r0) goto L_0x002f;	 Catch:{ all -> 0x006e }
        r0 = 127999; // 0x1f3ff float:1.79365E-40 double:6.324E-319;	 Catch:{ all -> 0x006e }
        if (r5 > r0) goto L_0x002f;	 Catch:{ all -> 0x006e }
        r0 = 1;	 Catch:{ all -> 0x006e }
        goto L_0x0030;	 Catch:{ all -> 0x006e }
        r0 = 0;	 Catch:{ all -> 0x006e }
        if (r0 == 0) goto L_0x0037;	 Catch:{ all -> 0x006e }
        r0 = 0;	 Catch:{ all -> 0x006e }
        r2 = 0;	 Catch:{ all -> 0x006e }
        r3 = 1;	 Catch:{ all -> 0x006e }
        r4 = 1;	 Catch:{ all -> 0x006e }
        goto L_0x0057;	 Catch:{ all -> 0x006e }
        if (r3 == 0) goto L_0x0042;	 Catch:{ all -> 0x006e }
        r0 = 8205; // 0x200d float:1.1498E-41 double:4.054E-320;	 Catch:{ all -> 0x006e }
        if (r5 != r0) goto L_0x0042;	 Catch:{ all -> 0x006e }
        r0 = 0;	 Catch:{ all -> 0x006e }
        r2 = 1;	 Catch:{ all -> 0x006e }
        r3 = 0;	 Catch:{ all -> 0x006e }
        r4 = 0;	 Catch:{ all -> 0x006e }
        goto L_0x0057;	 Catch:{ all -> 0x006e }
        if (r4 == 0) goto L_0x004d;	 Catch:{ all -> 0x006e }
        r0 = 65039; // 0xfe0f float:9.1139E-41 double:3.21335E-319;	 Catch:{ all -> 0x006e }
        if (r5 != r0) goto L_0x004d;	 Catch:{ all -> 0x006e }
        r0 = 0;	 Catch:{ all -> 0x006e }
        r2 = 0;	 Catch:{ all -> 0x006e }
        r3 = 1;	 Catch:{ all -> 0x006e }
        goto L_0x0040;	 Catch:{ all -> 0x006e }
        if (r2 == 0) goto L_0x0066;	 Catch:{ all -> 0x006e }
        r0 = r8.a(r5);	 Catch:{ all -> 0x006e }
        if (r0 == 0) goto L_0x0066;	 Catch:{ all -> 0x006e }
        r0 = 1;	 Catch:{ all -> 0x006e }
        goto L_0x0033;	 Catch:{ all -> 0x006e }
        r6 = r8.a;	 Catch:{ all -> 0x006e }
        r7 = java.lang.Character.toChars(r5);	 Catch:{ all -> 0x006e }
        r6.append(r7);	 Catch:{ all -> 0x006e }
        r5 = java.lang.Character.charCount(r5);	 Catch:{ all -> 0x006e }
        r12 = r12 + r5;	 Catch:{ all -> 0x006e }
        goto L_0x0015;	 Catch:{ all -> 0x006e }
        r9 = r8.a;	 Catch:{ all -> 0x006e }
        r9 = r9.toString();	 Catch:{ all -> 0x006e }
        monitor-exit(r8);
        return r9;
        r9 = move-exception;
        monitor-exit(r8);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abqe.d(java.lang.CharSequence, int, int, int):java.lang.String");
    }

    public final String a(CharSequence charSequence, int i, int i2, int i3) {
        if (Character.isLetterOrDigit(i2) || Character.isWhitespace(i2)) {
            return null;
        }
        Object obj = i + i3 >= charSequence.length() ? 1 : null;
        boolean a = a(i2);
        if (obj != null) {
            return a ? new String(Character.toChars(i2)) : null;
        } else {
            String b = b(charSequence, i, i2, i3);
            if (b != null) {
                return b;
            }
            b = c(charSequence, i, i2, i3);
            return b != null ? b : !a ? null : d(charSequence, i, i2, i3);
        }
    }
}
