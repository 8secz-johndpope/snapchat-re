package defpackage;

import javax.security.auth.x500.X500Principal;

/* renamed from: aizy */
final class aizy {
    final String a;
    final int b = this.a.length();
    int c;
    int d;
    int e;
    int f;
    char[] g;

    public aizy(X500Principal x500Principal) {
        this.a = x500Principal.getName("RFC2253");
    }

    private int a(int i) {
        int i2 = i + 1;
        String str = "Malformed DN: ";
        StringBuilder stringBuilder;
        if (i2 < this.b) {
            char c = this.g[i];
            if (c >= '0' && c <= '9') {
                i = c - 48;
            } else if (c >= 'a' && c <= 'f') {
                i = c - 87;
            } else if (c < 'A' || c > 'F') {
                stringBuilder = new StringBuilder(str);
                stringBuilder.append(this.a);
                throw new IllegalStateException(stringBuilder.toString());
            } else {
                i = c - 55;
            }
            char c2 = this.g[i2];
            if (c2 >= '0' && c2 <= '9') {
                i2 = c2 - 48;
            } else if (c2 >= 'a' && c2 <= 'f') {
                i2 = c2 - 87;
            } else if (c2 < 'A' || c2 > 'F') {
                stringBuilder = new StringBuilder(str);
                stringBuilder.append(this.a);
                throw new IllegalStateException(stringBuilder.toString());
            } else {
                i2 = c2 - 55;
            }
            return (i << 4) + i2;
        }
        stringBuilder = new StringBuilder(str);
        stringBuilder.append(this.a);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private char e() {
        int a = a(this.c);
        this.c++;
        if (a < 128) {
            return (char) a;
        }
        if (a < 192 || a > 247) {
            return '?';
        }
        int i;
        if (a <= 223) {
            a &= 31;
            i = 1;
        } else if (a <= 239) {
            i = 2;
            a &= 15;
        } else {
            i = 3;
            a &= 7;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.c++;
            int i3 = this.c;
            if (i3 == this.b || this.g[i3] != '\\') {
                return '?';
            }
            this.c = i3 + 1;
            i3 = a(this.c);
            this.c++;
            if ((i3 & 192) != 128) {
                return '?';
            }
            a = (a << 6) + (i3 & 63);
        }
        return (char) a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:60:0x00f8 in {4, 8, 16, 27, 32, 34, 38, 46, 50, 54, 55, 57, 59} preds:[]
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
    final java.lang.String a() {
        /*
        r6 = this;
        r0 = r6.c;
        r1 = r6.b;
        r2 = 32;
        if (r0 >= r1) goto L_0x0013;
        r1 = r6.g;
        r1 = r1[r0];
        if (r1 != r2) goto L_0x0013;
        r0 = r0 + 1;
        r6.c = r0;
        goto L_0x0000;
        r0 = r6.c;
        r1 = r6.b;
        if (r0 != r1) goto L_0x001b;
        r0 = 0;
        return r0;
        r6.d = r0;
        r0 = r0 + 1;
        r6.c = r0;
        r0 = r6.c;
        r1 = r6.b;
        r3 = 61;
        if (r0 >= r1) goto L_0x0034;
        r1 = r6.g;
        r4 = r1[r0];
        if (r4 == r3) goto L_0x0034;
        r1 = r1[r0];
        if (r1 == r2) goto L_0x0034;
        goto L_0x001d;
        r0 = r6.c;
        r1 = r6.b;
        r4 = "Unexpected end of DN: ";
        if (r0 >= r1) goto L_0x00e4;
        r6.e = r0;
        r1 = r6.g;
        r0 = r1[r0];
        if (r0 != r2) goto L_0x007a;
        r0 = r6.c;
        r1 = r6.b;
        if (r0 >= r1) goto L_0x0059;
        r1 = r6.g;
        r5 = r1[r0];
        if (r5 == r3) goto L_0x0059;
        r1 = r1[r0];
        if (r1 != r2) goto L_0x0059;
        r0 = r0 + 1;
        r6.c = r0;
        goto L_0x0044;
        r0 = r6.g;
        r1 = r6.c;
        r0 = r0[r1];
        if (r0 != r3) goto L_0x0066;
        r0 = r6.b;
        if (r1 == r0) goto L_0x0066;
        goto L_0x007a;
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r4);
        r2 = r6.a;
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        r0 = r6.c;
        r0 = r0 + 1;
        r6.c = r0;
        r0 = r6.c;
        r1 = r6.b;
        if (r0 >= r1) goto L_0x008c;
        r1 = r6.g;
        r0 = r1[r0];
        if (r0 == r2) goto L_0x007a;
        r0 = r6.e;
        r1 = r6.d;
        r0 = r0 - r1;
        r2 = 4;
        if (r0 <= r2) goto L_0x00d7;
        r0 = r6.g;
        r3 = r1 + 3;
        r3 = r0[r3];
        r4 = 46;
        if (r3 != r4) goto L_0x00d7;
        r3 = r0[r1];
        r4 = 79;
        if (r3 == r4) goto L_0x00aa;
        r0 = r0[r1];
        r1 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        if (r0 != r1) goto L_0x00d7;
        r0 = r6.g;
        r1 = r6.d;
        r3 = r1 + 1;
        r3 = r0[r3];
        r4 = 73;
        if (r3 == r4) goto L_0x00be;
        r1 = r1 + 1;
        r0 = r0[r1];
        r1 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r0 != r1) goto L_0x00d7;
        r0 = r6.g;
        r1 = r6.d;
        r3 = r1 + 2;
        r3 = r0[r3];
        r4 = 68;
        if (r3 == r4) goto L_0x00d2;
        r1 = r1 + 2;
        r0 = r0[r1];
        r1 = 100;
        if (r0 != r1) goto L_0x00d7;
        r0 = r6.d;
        r0 = r0 + r2;
        r6.d = r0;
        r0 = new java.lang.String;
        r1 = r6.g;
        r2 = r6.d;
        r3 = r6.e;
        r3 = r3 - r2;
        r0.<init>(r1, r2, r3);
        return r0;
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r4);
        r2 = r6.a;
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizy.a():java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x00b1 in {11, 19, 24, 25, 26, 34, 36, 38, 40} preds:[]
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
    final java.lang.String b() {
        /*
        r6 = this;
        r0 = r6.c;
        r1 = r0 + 4;
        r2 = r6.b;
        r3 = "Unexpected end of DN: ";
        if (r1 >= r2) goto L_0x009d;
        r6.d = r0;
        r0 = r0 + 1;
        r6.c = r0;
        r0 = r6.c;
        r1 = r6.b;
        if (r0 == r1) goto L_0x0059;
        r1 = r6.g;
        r2 = r1[r0];
        r4 = 43;
        if (r2 == r4) goto L_0x0059;
        r2 = r1[r0];
        r4 = 44;
        if (r2 == r4) goto L_0x0059;
        r2 = r1[r0];
        r4 = 59;
        if (r2 != r4) goto L_0x002b;
        goto L_0x0059;
        r2 = r1[r0];
        r4 = 32;
        if (r2 != r4) goto L_0x0044;
        r6.e = r0;
        r0 = r0 + 1;
        r6.c = r0;
        r0 = r6.c;
        r1 = r6.b;
        if (r0 >= r1) goto L_0x005d;
        r1 = r6.g;
        r1 = r1[r0];
        if (r1 != r4) goto L_0x005d;
        goto L_0x0033;
        r2 = r1[r0];
        r5 = 65;
        if (r2 < r5) goto L_0x0056;
        r2 = r1[r0];
        r5 = 70;
        if (r2 > r5) goto L_0x0056;
        r2 = r1[r0];
        r2 = r2 + r4;
        r2 = (char) r2;
        r1[r0] = r2;
        r0 = r6.c;
        goto L_0x000c;
        r0 = r6.c;
        r6.e = r0;
        r0 = r6.e;
        r1 = r6.d;
        r0 = r0 - r1;
        r2 = 5;
        if (r0 < r2) goto L_0x0089;
        r2 = r0 & 1;
        if (r2 == 0) goto L_0x0089;
        r2 = r0 / 2;
        r2 = new byte[r2];
        r3 = 0;
        r1 = r1 + 1;
        r4 = r2.length;
        if (r3 >= r4) goto L_0x007f;
        r4 = r6.a(r1);
        r4 = (byte) r4;
        r2[r3] = r4;
        r1 = r1 + 2;
        r3 = r3 + 1;
        goto L_0x0070;
        r1 = new java.lang.String;
        r2 = r6.g;
        r3 = r6.d;
        r1.<init>(r2, r3, r0);
        return r1;
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r3);
        r2 = r6.a;
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r3);
        r2 = r6.a;
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizy.b():java.lang.String");
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:31:0x0097, code skipped:
            r1 = r8.g;
            r2 = r8.d;
     */
    /* JADX WARNING: Missing block: B:32:0x00a3, code skipped:
            return new java.lang.String(r1, r2, r8.f - r2);
     */
    public final java.lang.String c() {
        /*
        r8 = this;
        r0 = r8.c;
        r8.d = r0;
        r8.e = r0;
    L_0x0006:
        r0 = r8.c;
        r1 = r8.b;
        if (r0 < r1) goto L_0x0019;
    L_0x000c:
        r0 = new java.lang.String;
        r1 = r8.g;
        r2 = r8.d;
        r3 = r8.e;
        r3 = r3 - r2;
        r0.<init>(r1, r2, r3);
        return r0;
    L_0x0019:
        r1 = r8.g;
        r2 = r1[r0];
        r3 = 44;
        r4 = 43;
        r5 = 59;
        r6 = 32;
        if (r2 == r6) goto L_0x005c;
    L_0x0027:
        if (r2 == r5) goto L_0x004f;
    L_0x0029:
        r5 = 92;
        if (r2 == r5) goto L_0x0040;
    L_0x002d:
        if (r2 == r4) goto L_0x004f;
    L_0x002f:
        if (r2 == r3) goto L_0x004f;
    L_0x0031:
        r2 = r8.e;
        r3 = r2 + 1;
        r8.e = r3;
        r3 = r1[r0];
        r1[r2] = r3;
    L_0x003b:
        r0 = r0 + 1;
        r8.c = r0;
        goto L_0x0006;
    L_0x0040:
        r0 = r8.e;
        r2 = r0 + 1;
        r8.e = r2;
        r2 = r8.d();
        r1[r0] = r2;
        r0 = r8.c;
        goto L_0x003b;
    L_0x004f:
        r0 = new java.lang.String;
        r1 = r8.g;
        r2 = r8.d;
        r3 = r8.e;
        r3 = r3 - r2;
        r0.<init>(r1, r2, r3);
        return r0;
    L_0x005c:
        r2 = r8.e;
        r8.f = r2;
        r0 = r0 + 1;
        r8.c = r0;
        r0 = r2 + 1;
        r8.e = r0;
        r1[r2] = r6;
    L_0x006a:
        r0 = r8.c;
        r1 = r8.b;
        if (r0 >= r1) goto L_0x0083;
    L_0x0070:
        r1 = r8.g;
        r2 = r1[r0];
        if (r2 != r6) goto L_0x0083;
    L_0x0076:
        r2 = r8.e;
        r7 = r2 + 1;
        r8.e = r7;
        r1[r2] = r6;
        r0 = r0 + 1;
        r8.c = r0;
        goto L_0x006a;
    L_0x0083:
        r0 = r8.c;
        r1 = r8.b;
        if (r0 == r1) goto L_0x0097;
    L_0x0089:
        r1 = r8.g;
        r2 = r1[r0];
        if (r2 == r3) goto L_0x0097;
    L_0x008f:
        r2 = r1[r0];
        if (r2 == r4) goto L_0x0097;
    L_0x0093:
        r0 = r1[r0];
        if (r0 != r5) goto L_0x0006;
    L_0x0097:
        r0 = new java.lang.String;
        r1 = r8.g;
        r2 = r8.d;
        r3 = r8.f;
        r3 = r3 - r2;
        r0.<init>(r1, r2, r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizy.c():java.lang.String");
    }

    /* Access modifiers changed, original: final */
    public final char d() {
        this.c++;
        int i = this.c;
        if (i != this.b) {
            char c = this.g[i];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return e();
                        }
                }
            }
            return this.g[this.c];
        }
        StringBuilder stringBuilder = new StringBuilder("Unexpected end of DN: ");
        stringBuilder.append(this.a);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
