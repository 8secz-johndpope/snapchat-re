package org.jcodec.platform;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Platform {
    public static String arrayToString(Object[] objArr) {
        return Arrays.toString(objArr);
    }

    public static int[] copyOfRangeI(int[] iArr, int i, int i2) {
        return Arrays.copyOfRange(iArr, i, i2);
    }

    public static void deleteFile(File file) {
        file.delete();
    }

    public static byte[] getBytes(String str) {
        try {
            return str.getBytes("iso8859-1");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static byte[] getBytesForCharset(String str, Charset charset) {
        return str.getBytes(charset);
    }

    public static Method[] getMethods(Class<?> cls) {
        return cls.getMethods();
    }

    public static boolean isAssignableFrom(Class cls, Class cls2) {
        return cls.isAssignableFrom(cls2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0022 in {3, 6, 9} preds:[]
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
    public static <T> T newInstance(java.lang.Class<T> r3, java.lang.Object[] r4) {
        /*
        r0 = r4.length;
        r0 = new java.lang.Class[r0];
        r1 = 0;
        r2 = r4.length;
        if (r1 >= r2) goto L_0x0012;
        r2 = r4[r1];
        r2 = r2.getClass();
        r0[r1] = r2;
        r1 = r1 + 1;
        goto L_0x0004;
        r3 = r3.getConstructor(r0);	 Catch:{ Exception -> 0x001b }
        r3 = r3.newInstance(r4);	 Catch:{ Exception -> 0x001b }
        return r3;
        r3 = move-exception;
        r4 = new java.lang.RuntimeException;
        r4.<init>(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.platform.Platform.newInstance(java.lang.Class, java.lang.Object[]):java.lang.Object");
    }

    public static String stringFromBytes(byte[] bArr) {
        try {
            return new String(bArr, "iso8859-1");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String stringFromCharset(byte[] bArr, Charset charset) {
        return new String(bArr, charset);
    }

    public static String stringFromCharset4(byte[] bArr, int i, int i2, Charset charset) {
        return new String(bArr, i, i2, charset);
    }
}
