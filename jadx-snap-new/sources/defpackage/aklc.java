package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* renamed from: aklc */
public final class aklc {
    static {
        PrintWriter printWriter = new PrintWriter(new aklp((byte) 0));
        printWriter.println();
        printWriter.close();
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        long b = aklc.b(inputStream, outputStream);
        return b > 2147483647L ? -1 : (int) b;
    }

    public static int a(InputStream inputStream, byte[] bArr) {
        return aklc.a(inputStream, bArr, bArr.length);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0022 in {5, 7, 9} preds:[]
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
    public static int a(java.io.InputStream r3, byte[] r4, int r5) {
        /*
        if (r5 < 0) goto L_0x0012;
        r0 = r5;
        if (r0 <= 0) goto L_0x0010;
        r1 = r5 - r0;
        r1 = r3.read(r4, r1, r0);
        r2 = -1;
        if (r2 == r1) goto L_0x0010;
        r0 = r0 - r1;
        goto L_0x0003;
        r5 = r5 - r0;
        return r5;
        r3 = new java.lang.IllegalArgumentException;
        r4 = java.lang.String.valueOf(r5);
        r5 = "Length must not be negative: ";
        r4 = r5.concat(r4);
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklc.a(java.io.InputStream, byte[], int):int");
    }

    private static int a(Reader reader, Writer writer) {
        long b = aklc.b(reader, writer);
        return b > 2147483647L ? -1 : (int) b;
    }

    public static long a(InputStream inputStream, OutputStream outputStream, int i) {
        return aklc.a(inputStream, outputStream, new byte[i]);
    }

    private static long a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    private static long a(Reader reader, Writer writer, char[] cArr) {
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j;
            }
            writer.write(cArr, 0, read);
            j += (long) read;
        }
    }

    public static String a(InputStream inputStream, Charset charset) {
        Writer aklp = new aklp();
        aklc.a(inputStream, aklp, charset);
        return aklp.toString();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static void a(InputStream inputStream, Writer writer, Charset charset) {
        aklc.a(new InputStreamReader(inputStream, akky.a(charset)), writer);
    }

    public static void a(String str, OutputStream outputStream, Charset charset) {
        if (str != null) {
            outputStream.write(str.getBytes(akky.a(charset)));
        }
    }

    public static void a(byte[] bArr, OutputStream outputStream) {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static void a(Closeable... closeableArr) {
        for (int i = 0; i < 4; i++) {
            aklc.a(closeableArr[i]);
        }
    }

    public static byte[] a(InputStream inputStream) {
        OutputStream aklo = new aklo();
        aklc.a(inputStream, aklo);
        return aklo.a();
    }

    public static long b(InputStream inputStream, OutputStream outputStream) {
        return aklc.a(inputStream, outputStream, 4096);
    }

    private static long b(Reader reader, Writer writer) {
        return aklc.a(reader, writer, new char[4096]);
    }
}
