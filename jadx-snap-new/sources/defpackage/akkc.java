package defpackage;

/* renamed from: akkc */
final class akkc {
    static final byte[] a = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x00b7 in {2, 6, 7, 8, 11, 14} preds:[]
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
    static java.lang.String a(byte[] r9, byte[] r10) {
        /*
        r0 = r9.length;
        r1 = 2;
        r0 = r0 + r1;
        r0 = r0 / 3;
        r0 = r0 << r1;
        r0 = new byte[r0];
        r2 = r9.length;
        r3 = r9.length;
        r3 = r3 % 3;
        r2 = r2 - r3;
        r3 = 0;
        r4 = 0;
        if (r3 >= r2) goto L_0x0052;
        r5 = r4 + 1;
        r6 = r9[r3];
        r6 = r6 & 255;
        r6 = r6 >> r1;
        r6 = r10[r6];
        r0[r4] = r6;
        r4 = r5 + 1;
        r6 = r9[r3];
        r6 = r6 & 3;
        r6 = r6 << 4;
        r7 = r3 + 1;
        r8 = r9[r7];
        r8 = r8 & 255;
        r8 = r8 >> 4;
        r6 = r6 | r8;
        r6 = r10[r6];
        r0[r5] = r6;
        r5 = r4 + 1;
        r6 = r9[r7];
        r6 = r6 & 15;
        r6 = r6 << r1;
        r7 = r3 + 2;
        r8 = r9[r7];
        r8 = r8 & 255;
        r8 = r8 >> 6;
        r6 = r6 | r8;
        r6 = r10[r6];
        r0[r4] = r6;
        r4 = r5 + 1;
        r6 = r9[r7];
        r6 = r6 & 63;
        r6 = r10[r6];
        r0[r5] = r6;
        r3 = r3 + 3;
        goto L_0x000f;
        r3 = r9.length;
        r3 = r3 % 3;
        r5 = 61;
        r6 = 1;
        if (r3 == r6) goto L_0x008a;
        if (r3 == r1) goto L_0x005d;
        goto L_0x00a8;
        r3 = r4 + 1;
        r7 = r9[r2];
        r7 = r7 & 255;
        r7 = r7 >> r1;
        r7 = r10[r7];
        r0[r4] = r7;
        r4 = r3 + 1;
        r7 = r9[r2];
        r7 = r7 & 3;
        r7 = r7 << 4;
        r2 = r2 + r6;
        r6 = r9[r2];
        r6 = r6 & 255;
        r6 = r6 >> 4;
        r6 = r6 | r7;
        r6 = r10[r6];
        r0[r3] = r6;
        r3 = r4 + 1;
        r9 = r9[r2];
        r9 = r9 & 15;
        r9 = r9 << r1;
        r9 = r10[r9];
        r0[r4] = r9;
        r0[r3] = r5;
        goto L_0x00a8;
        r3 = r4 + 1;
        r6 = r9[r2];
        r6 = r6 & 255;
        r1 = r6 >> 2;
        r1 = r10[r1];
        r0[r4] = r1;
        r1 = r3 + 1;
        r9 = r9[r2];
        r9 = r9 & 3;
        r9 = r9 << 4;
        r9 = r10[r9];
        r0[r3] = r9;
        r9 = r1 + 1;
        r0[r1] = r5;
        r0[r9] = r5;
        r9 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r10 = "US-ASCII";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r9.<init>(r0, r10);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        return r9;
        r9 = move-exception;
        r10 = new java.lang.AssertionError;
        r10.<init>(r9);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkc.a(byte[], byte[]):java.lang.String");
    }

    public static byte[] a(String str) {
        int length = str.length();
        while (length > 0) {
            char charAt = str.charAt(length - 1);
            if (charAt != '=' && charAt != 10 && charAt != 13 && charAt != ' ' && charAt != 9) {
                break;
            }
            length--;
        }
        byte[] bArr = new byte[((int) ((((long) length) * 6) / 8))];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5;
            char charAt2 = str.charAt(i4);
            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                i5 = charAt2 - 65;
            } else if (charAt2 >= 'a' && charAt2 <= 'z') {
                i5 = charAt2 - 71;
            } else if (charAt2 >= '0' && charAt2 <= '9') {
                i5 = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i5 = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i5 = 63;
            } else {
                if (!(charAt2 == 10 || charAt2 == 13 || charAt2 == ' ' || charAt2 == 9)) {
                    return null;
                }
            }
            i2 = (i2 << 6) | ((byte) i5);
            i++;
            if (i % 4 == 0) {
                int i6 = i3 + 1;
                bArr[i3] = (byte) (i2 >> 16);
                i3 = i6 + 1;
                bArr[i6] = (byte) (i2 >> 8);
                i6 = i3 + 1;
                bArr[i3] = (byte) i2;
                i3 = i6;
            }
        }
        i %= 4;
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            length = i3 + 1;
            bArr[i3] = (byte) ((i2 << 12) >> 16);
            i3 = length;
        } else if (i == 3) {
            int i7 = i2 << 6;
            length = i3 + 1;
            bArr[i3] = (byte) (i7 >> 16);
            i3 = length + 1;
            bArr[length] = (byte) (i7 >> 8);
        }
        if (i3 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        return bArr2;
    }
}
