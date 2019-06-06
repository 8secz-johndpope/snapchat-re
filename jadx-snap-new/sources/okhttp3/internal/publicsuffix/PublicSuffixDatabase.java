package okhttp3.internal.publicsuffix;

import com.brightcove.player.event.EventType;
import defpackage.akib;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase {
    public static final PublicSuffixDatabase a = new PublicSuffixDatabase();
    private static final byte[] b = new byte[]{(byte) 42};
    private static final String[] c = new String[0];
    private static final String[] d = new String[]{EventType.ANY};
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final CountDownLatch f = new CountDownLatch(1);
    private byte[] g;
    private byte[] h;

    private static String a(byte[] bArr, byte[][] bArr2, int i) {
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i2 = 0;
        while (i2 < length) {
            int i3;
            int i4;
            int i5 = (i2 + length) / 2;
            while (i5 >= 0 && bArr3[i5] != (byte) 10) {
                i5--;
            }
            i5++;
            int i6 = 1;
            while (true) {
                i3 = i5 + i6;
                if (bArr3[i3] == (byte) 10) {
                    break;
                }
                i6++;
            }
            int i7 = i3 - i5;
            int i8 = i;
            Object obj = null;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (obj != null) {
                    obj = null;
                    i4 = 46;
                } else {
                    i4 = bArr4[i8][i9] & 255;
                }
                i4 -= bArr3[i5 + i10] & 255;
                if (i4 != 0) {
                    break;
                }
                i10++;
                i9++;
                if (i10 != i7) {
                    if (bArr4[i8].length == i9) {
                        if (i8 == bArr4.length - 1) {
                            break;
                        }
                        i8++;
                        obj = 1;
                        i9 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i11 = i7 - i10;
                    i6 = bArr4[i8].length - i9;
                    while (true) {
                        i8++;
                        if (i8 >= bArr4.length) {
                            break;
                        }
                        i6 += bArr4[i8].length;
                    }
                    if (i6 >= i11) {
                        if (i6 <= i11) {
                            return new String(bArr, i5, i7, akib.d);
                        }
                    }
                }
                i2 = i3 + 1;
            }
            length = i5 - 1;
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:103:0x011b in {19, 24, 27, 28, 29, 36, 38, 39, 40, 43, 45, 53, 59, 60, 61, 69, 70, 71, 77, 78, 79, 82, 86, 88, 89, 91, 92, 95, 96, 99, 102} preds:[]
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
    private java.lang.String[] a(java.lang.String[] r8) {
        /*
        r7 = this;
        r0 = r7.e;
        r0 = r0.get();
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0077;
        r0 = r7.e;
        r0 = r0.compareAndSet(r1, r2);
        if (r0 == 0) goto L_0x0077;
        r0 = 0;
        r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class;	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        r4 = "publicsuffixes.gz";	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        r3 = r3.getResourceAsStream(r4);	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        if (r3 == 0) goto L_0x0053;	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        r4 = new akkm;	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        r3 = defpackage.akko.a(r3);	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        r4.<init>(r3);	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        r3 = defpackage.akko.a(r4);	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        r4 = r3.i();	 Catch:{ all -> 0x004e }
        r4 = new byte[r4];	 Catch:{ all -> 0x004e }
        r3.a(r4);	 Catch:{ all -> 0x004e }
        r5 = r3.i();	 Catch:{ all -> 0x004e }
        r5 = new byte[r5];	 Catch:{ all -> 0x004e }
        r3.a(r5);	 Catch:{ all -> 0x004e }
        defpackage.akib.a(r3);	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        monitor-enter(r7);	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        r7.g = r4;	 Catch:{ all -> 0x004b }
        r7.h = r5;	 Catch:{ all -> 0x004b }
        monitor-exit(r7);	 Catch:{ all -> 0x004b }
        r3 = r7.f;	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        r3.countDown();	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        goto L_0x0053;
        r3 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x004b }
        throw r3;	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        r4 = move-exception;	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        defpackage.akib.a(r3);	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        throw r4;	 Catch:{ InterruptedIOException -> 0x0075, IOException -> 0x005f }
        if (r0 == 0) goto L_0x007c;
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        goto L_0x007c;
        r8 = move-exception;
        goto L_0x006b;
        r3 = move-exception;
        r4 = defpackage.akju.a;	 Catch:{ all -> 0x005d }
        r5 = 5;	 Catch:{ all -> 0x005d }
        r6 = "Failed to read public suffix list";	 Catch:{ all -> 0x005d }
        r4.a(r5, r6, r3);	 Catch:{ all -> 0x005d }
        if (r0 == 0) goto L_0x007c;
        goto L_0x0055;
        if (r0 == 0) goto L_0x0074;
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        throw r8;
        r0 = 1;
        goto L_0x0013;
        r0 = r7.f;	 Catch:{ InterruptedException -> 0x007c }
        r0.await();	 Catch:{ InterruptedException -> 0x007c }
        monitor-enter(r7);
        r0 = r7.g;	 Catch:{ all -> 0x0118 }
        if (r0 == 0) goto L_0x0110;	 Catch:{ all -> 0x0118 }
        monitor-exit(r7);	 Catch:{ all -> 0x0118 }
        r0 = r8.length;
        r0 = new byte[r0][];
        r3 = 0;
        r4 = r8.length;
        if (r3 >= r4) goto L_0x0096;
        r4 = r8[r3];
        r5 = defpackage.akib.d;
        r4 = r4.getBytes(r5);
        r0[r3] = r4;
        r3 = r3 + 1;
        goto L_0x0086;
        r8 = 0;
        r3 = r0.length;
        r4 = 0;
        if (r8 >= r3) goto L_0x00a7;
        r3 = r7.g;
        r3 = a(r3, r0, r8);
        if (r3 == 0) goto L_0x00a4;
        goto L_0x00a8;
        r8 = r8 + 1;
        goto L_0x0097;
        r3 = r4;
        r8 = r0.length;
        if (r8 <= r2) goto L_0x00c6;
        r8 = r0.clone();
        r8 = (byte[][]) r8;
        r5 = 0;
        r6 = r8.length;
        r6 = r6 - r2;
        if (r5 >= r6) goto L_0x00c6;
        r6 = b;
        r8[r5] = r6;
        r6 = r7.g;
        r6 = a(r6, r8, r5);
        if (r6 == 0) goto L_0x00c3;
        goto L_0x00c7;
        r5 = r5 + 1;
        goto L_0x00b2;
        r6 = r4;
        if (r6 == 0) goto L_0x00d9;
        r8 = r0.length;
        r8 = r8 - r2;
        if (r1 >= r8) goto L_0x00d9;
        r8 = r7.h;
        r8 = a(r8, r0, r1);
        if (r8 == 0) goto L_0x00d6;
        goto L_0x00da;
        r1 = r1 + 1;
        goto L_0x00c9;
        r8 = r4;
        if (r8 == 0) goto L_0x00ed;
        r8 = java.lang.String.valueOf(r8);
        r0 = "!";
        r8 = r0.concat(r8);
        r0 = "\\.";
        r8 = r8.split(r0);
        return r8;
        if (r3 != 0) goto L_0x00f4;
        if (r6 != 0) goto L_0x00f4;
        r8 = d;
        return r8;
        if (r3 == 0) goto L_0x00fd;
        r8 = "\\.";
        r8 = r3.split(r8);
        goto L_0x00ff;
        r8 = c;
        if (r6 == 0) goto L_0x0108;
        r0 = "\\.";
        r0 = r6.split(r0);
        goto L_0x010a;
        r0 = c;
        r1 = r8.length;
        r2 = r0.length;
        if (r1 <= r2) goto L_0x010f;
        return r8;
        return r0;
        r8 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0118 }
        r0 = "Unable to load publicsuffixes.gz resource from the classpath.";	 Catch:{ all -> 0x0118 }
        r8.<init>(r0);	 Catch:{ all -> 0x0118 }
        throw r8;	 Catch:{ all -> 0x0118 }
        r8 = move-exception;	 Catch:{ all -> 0x0118 }
        monitor-exit(r7);	 Catch:{ all -> 0x0118 }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String[]):java.lang.String[]");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0060 in {6, 9, 10, 14, 16, 18} preds:[]
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
    public final java.lang.String a(java.lang.String r8) {
        /*
        r7 = this;
        if (r8 == 0) goto L_0x0058;
        r0 = java.net.IDN.toUnicode(r8);
        r1 = "\\.";
        r0 = r0.split(r1);
        r2 = r7.a(r0);
        r3 = r0.length;
        r4 = r2.length;
        r5 = 33;
        r6 = 0;
        if (r3 != r4) goto L_0x0021;
        r3 = r2[r6];
        r3 = r3.charAt(r6);
        if (r3 == r5) goto L_0x0021;
        r8 = 0;
        return r8;
        r3 = r2[r6];
        r3 = r3.charAt(r6);
        if (r3 != r5) goto L_0x002c;
        r0 = r0.length;
        r2 = r2.length;
        goto L_0x0030;
        r0 = r0.length;
        r2 = r2.length;
        r2 = r2 + 1;
        r0 = r0 - r2;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r8 = r8.split(r1);
        r1 = r8.length;
        if (r0 >= r1) goto L_0x004a;
        r1 = r8[r0];
        r2.append(r1);
        r1 = 46;
        r2.append(r1);
        r0 = r0 + 1;
        goto L_0x003a;
        r8 = r2.length();
        r8 = r8 + -1;
        r2.deleteCharAt(r8);
        r8 = r2.toString();
        return r8;
        r8 = new java.lang.NullPointerException;
        r0 = "domain == null";
        r8.<init>(r0);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }
}
