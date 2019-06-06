package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Collection;

/* renamed from: akkz */
public final class akkz {
    private static BigInteger a;
    private static BigInteger b;
    private static BigInteger c = a.multiply(b);
    private static BigInteger d = a.multiply(c);
    private static BigInteger e = a.multiply(d);
    private static BigInteger f = a.multiply(e);
    private static BigInteger g = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(1152921504606846976L));

    static {
        BigInteger valueOf = BigInteger.valueOf(1024);
        a = valueOf;
        b = valueOf.multiply(valueOf);
        a.multiply(g);
    }

    public static long a(File file, OutputStream outputStream) {
        InputStream fileInputStream = new FileInputStream(file);
        try {
            long b = aklc.b(fileInputStream, outputStream);
            return b;
        } finally {
            fileInputStream.close();
        }
    }

    public static FileInputStream a(File file) {
        String str = "File '";
        StringBuilder stringBuilder;
        if (!file.exists()) {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(file);
            stringBuilder.append("' does not exist");
            throw new FileNotFoundException(stringBuilder.toString());
        } else if (file.isDirectory()) {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(file);
            stringBuilder.append("' exists but is a directory");
            throw new IOException(stringBuilder.toString());
        } else if (file.canRead()) {
            return new FileInputStream(file);
        } else {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(file);
            stringBuilder.append("' cannot be read");
            throw new IOException(stringBuilder.toString());
        }
    }

    public static FileOutputStream a(File file, boolean z) {
        if (file.exists()) {
            String str = "File '";
            StringBuilder stringBuilder;
            if (file.isDirectory()) {
                stringBuilder = new StringBuilder(str);
                stringBuilder.append(file);
                stringBuilder.append("' exists but is a directory");
                throw new IOException(stringBuilder.toString());
            } else if (!file.canWrite()) {
                stringBuilder = new StringBuilder(str);
                stringBuilder.append(file);
                stringBuilder.append("' cannot be written to");
                throw new IOException(stringBuilder.toString());
            }
        }
        File parentFile = file.getParentFile();
        if (!(parentFile == null || parentFile.mkdirs() || parentFile.isDirectory())) {
            StringBuilder stringBuilder2 = new StringBuilder("Directory '");
            stringBuilder2.append(parentFile);
            stringBuilder2.append("' could not be created");
            throw new IOException(stringBuilder2.toString());
        }
        return new FileOutputStream(file, false);
    }

    public static String a(File file, Charset charset) {
        Throwable th;
        Closeable a;
        try {
            a = akkz.a(file);
            try {
                String a2 = aklc.a((InputStream) a, akky.a(charset));
                aklc.a(a);
                return a2;
            } catch (Throwable th2) {
                th = th2;
                aklc.a(a);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            aklc.a(a);
            throw th;
        }
    }

    public static String a(BigInteger bigInteger) {
        StringBuilder stringBuilder;
        String str;
        if (bigInteger.divide(f).compareTo(BigInteger.ZERO) > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(bigInteger.divide(f)));
            str = " EB";
        } else if (bigInteger.divide(e).compareTo(BigInteger.ZERO) > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(bigInteger.divide(e)));
            str = " PB";
        } else if (bigInteger.divide(d).compareTo(BigInteger.ZERO) > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(bigInteger.divide(d)));
            str = " TB";
        } else if (bigInteger.divide(c).compareTo(BigInteger.ZERO) > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(bigInteger.divide(c)));
            str = " GB";
        } else if (bigInteger.divide(b).compareTo(BigInteger.ZERO) > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(bigInteger.divide(b)));
            str = " MB";
        } else if (bigInteger.divide(a).compareTo(BigInteger.ZERO) > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(bigInteger.divide(a)));
            str = " KB";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(bigInteger));
            str = " bytes";
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:43:0x00d3 in {4, 6, 20, 21, 25, 29, 31, 33, 35, 37, 39, 40, 42} preds:[]
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
    public static void a(java.io.File r23, java.io.File r24) {
        /*
        r0 = r23;
        r1 = r24;
        r2 = r24.exists();
        if (r2 == 0) goto L_0x002a;
        r2 = r24.isDirectory();
        if (r2 != 0) goto L_0x0011;
        goto L_0x002a;
        r0 = new java.io.IOException;
        r2 = new java.lang.StringBuilder;
        r3 = "Destination '";
        r2.<init>(r3);
        r2.append(r1);
        r1 = "' exists but is a directory";
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
        r2 = 3;
        r3 = 2;
        r4 = 1;
        r5 = 0;
        r6 = 4;
        r7 = 0;
        r8 = new java.io.FileInputStream;	 Catch:{ all -> 0x00c0 }
        r8.<init>(r0);	 Catch:{ all -> 0x00c0 }
        r9 = new java.io.FileOutputStream;	 Catch:{ all -> 0x00bd }
        r9.<init>(r1);	 Catch:{ all -> 0x00bd }
        r16 = r8.getChannel();	 Catch:{ all -> 0x00b9 }
        r7 = r9.getChannel();	 Catch:{ all -> 0x00b7 }
        r17 = r16.size();	 Catch:{ all -> 0x00b7 }
        r19 = 0;	 Catch:{ all -> 0x00b7 }
        r21 = r19;	 Catch:{ all -> 0x00b7 }
        r10 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1));	 Catch:{ all -> 0x00b7 }
        if (r10 >= 0) goto L_0x006a;	 Catch:{ all -> 0x00b7 }
        r10 = r17 - r21;	 Catch:{ all -> 0x00b7 }
        r12 = 31457280; // 0x1e00000 float:8.2284605E-38 double:1.55419614E-316;	 Catch:{ all -> 0x00b7 }
        r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));	 Catch:{ all -> 0x00b7 }
        if (r14 <= 0) goto L_0x0059;	 Catch:{ all -> 0x00b7 }
        r14 = r12;	 Catch:{ all -> 0x00b7 }
        goto L_0x005a;	 Catch:{ all -> 0x00b7 }
        r14 = r10;	 Catch:{ all -> 0x00b7 }
        r10 = r7;	 Catch:{ all -> 0x00b7 }
        r11 = r16;	 Catch:{ all -> 0x00b7 }
        r12 = r21;	 Catch:{ all -> 0x00b7 }
        r10 = r10.transferFrom(r11, r12, r14);	 Catch:{ all -> 0x00b7 }
        r12 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1));
        if (r12 == 0) goto L_0x006a;
        r21 = r21 + r10;
        goto L_0x004a;
        r6 = new java.io.Closeable[r6];
        r6[r5] = r7;
        r6[r4] = r9;
        r6[r3] = r16;
        r6[r2] = r8;
        defpackage.aklc.a(r6);
        r2 = r23.length();
        r4 = r24.length();
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x008b;
        r2 = r23.lastModified();
        r1.setLastModified(r2);
        return;
        r6 = new java.io.IOException;
        r7 = new java.lang.StringBuilder;
        r8 = "Failed to copy full contents from '";
        r7.<init>(r8);
        r7.append(r0);
        r0 = "' to '";
        r7.append(r0);
        r7.append(r1);
        r0 = "' Expected length: ";
        r7.append(r0);
        r7.append(r2);
        r0 = " Actual: ";
        r7.append(r0);
        r7.append(r4);
        r0 = r7.toString();
        r6.<init>(r0);
        throw r6;
        r0 = move-exception;
        goto L_0x00c5;
        r0 = move-exception;
        r16 = r7;
        goto L_0x00c5;
        r0 = move-exception;
        r9 = r7;
        goto L_0x00c3;
        r0 = move-exception;
        r8 = r7;
        r9 = r8;
        r16 = r9;
        r1 = new java.io.Closeable[r6];
        r1[r5] = r7;
        r1[r4] = r9;
        r1[r3] = r16;
        r1[r2] = r8;
        defpackage.aklc.a(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkz.a(java.io.File, java.io.File):void");
    }

    public static void a(File file, String str, Charset charset) {
        Throwable th;
        Closeable a;
        try {
            a = akkz.a(file, false);
            try {
                aklc.a(str, (OutputStream) a, charset);
                a.close();
                aklc.a(a);
            } catch (Throwable th2) {
                th = th2;
                aklc.a(a);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            aklc.a(a);
            throw th;
        }
    }

    public static void a(Collection<File> collection, File file, aklj aklj, boolean z) {
        File[] listFiles = file.listFiles(aklj);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (z) {
                        collection.add(file2);
                    }
                    akkz.a(collection, file2, aklj, z);
                } else {
                    collection.add(file2);
                }
            }
        }
    }

    public static void b(File file) {
        if (file.isDirectory()) {
            akkz.d(file);
            return;
        }
        boolean exists = file.exists();
        if (!file.delete()) {
            if (exists) {
                throw new IOException("Unable to delete file: ".concat(String.valueOf(file)));
            } else {
                throw new FileNotFoundException("File does not exist: ".concat(String.valueOf(file)));
            }
        }
    }

    public static long c(File file) {
        if (file.exists()) {
            return file.isDirectory() ? akkz.e(file) : file.length();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(file);
            stringBuilder.append(" does not exist");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x0090 in {2, 16, 17, 18, 20, 21, 23, 25, 27, 30, 32} preds:[]
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
    private static void d(java.io.File r5) {
        /*
        r0 = r5.exists();
        if (r0 != 0) goto L_0x0007;
        return;
        r0 = defpackage.akkz.f(r5);
        if (r0 != 0) goto L_0x0070;
        r0 = r5.exists();
        if (r0 == 0) goto L_0x0059;
        r0 = r5.isDirectory();
        if (r0 == 0) goto L_0x0042;
        r0 = r5.listFiles();
        if (r0 == 0) goto L_0x0032;
        r1 = 0;
        r2 = r0.length;
        r3 = 0;
        if (r3 >= r2) goto L_0x002e;
        r4 = r0[r3];
        defpackage.akkz.b(r4);	 Catch:{ IOException -> 0x002a }
        goto L_0x002b;
        r1 = move-exception;
        r3 = r3 + 1;
        goto L_0x0022;
        if (r1 != 0) goto L_0x0031;
        goto L_0x0070;
        throw r1;
        r0 = new java.io.IOException;
        r5 = java.lang.String.valueOf(r5);
        r1 = "Failed to list contents of ";
        r5 = r1.concat(r5);
        r0.<init>(r5);
        throw r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r5);
        r5 = " is not a directory";
        r0.append(r5);
        r5 = r0.toString();
        r0 = new java.lang.IllegalArgumentException;
        r0.<init>(r5);
        throw r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r5);
        r5 = " does not exist";
        r0.append(r5);
        r5 = r0.toString();
        r0 = new java.lang.IllegalArgumentException;
        r0.<init>(r5);
        throw r0;
        r0 = r5.delete();
        if (r0 == 0) goto L_0x0077;
        return;
        r0 = new java.lang.StringBuilder;
        r1 = "Unable to delete directory ";
        r0.<init>(r1);
        r0.append(r5);
        r5 = ".";
        r0.append(r5);
        r5 = r0.toString();
        r0 = new java.io.IOException;
        r0.<init>(r5);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkz.d(java.io.File):void");
    }

    private static long e(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        long j = 0;
        for (File file2 : listFiles) {
            try {
                if (akkz.f(file2)) {
                    continue;
                } else {
                    j += file2.isDirectory() ? akkz.e(file2) : file2.length();
                    if (j < 0) {
                        break;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return j;
    }

    private static boolean f(File file) {
        if (akld.a) {
            return akld.a(file);
        }
        if (file == null) {
            throw new NullPointerException("File must not be null");
        } else if (akla.a()) {
            return false;
        } else {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            return file2.getCanonicalFile().equals(file2.getAbsoluteFile()) ? akkz.g(file) : true;
        }
    }

    private static boolean g(File file) {
        if (file.exists()) {
            return false;
        }
        file = file.getCanonicalFile();
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            File[] listFiles = parentFile.listFiles(new FileFilter() {
                public final boolean accept(File file) {
                    return file.equals(file);
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                return true;
            }
        }
        return false;
    }
}
