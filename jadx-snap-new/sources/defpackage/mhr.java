package defpackage;

import com.google.common.io.BaseEncoding;
import defpackage.miq.c.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.zip.ZipEntry;

/* renamed from: mhr */
public final class mhr {
    public static final akbw<ZipEntry, File, Boolean> a = a.a;

    /* renamed from: mhr$a */
    static final class a extends akcs implements akbw<ZipEntry, File, Boolean> {
        public static final a a = new a();

        a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean z;
            ZipEntry zipEntry = (ZipEntry) obj;
            File file = (File) obj2;
            akcr.b(zipEntry, "entry");
            akcr.b(file, "file");
            if (!zipEntry.isDirectory()) {
                obj = file.getName();
                akcr.a(obj, "file.name");
                if (akgc.a((CharSequence) obj, '.')) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    public static final File a(File file, String str) {
        akcr.b(file, "receiver$0");
        akcr.b(str, "name");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getPath());
        stringBuilder.append('/');
        stringBuilder.append(str);
        return new File(stringBuilder.toString());
    }

    public static final ArrayList<String> a(File file, MessageDigest messageDigest, ArrayList<String> arrayList) {
        Object listFiles = file.listFiles();
        akcr.a(listFiles, "listFiles()");
        for (File file2 : listFiles) {
            akcr.a((Object) file2, "currentFile");
            if (file2.isDirectory()) {
                mhr.a(file2, messageDigest, (ArrayList) arrayList);
            } else {
                Closeable fileInputStream = new FileInputStream(file2);
                try {
                    InputStream inputStream = (FileInputStream) fileInputStream;
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read);
                    }
                    akax.a(fileInputStream, null);
                    arrayList.add(BaseEncoding.base16().encode(messageDigest.digest()));
                } catch (Throwable th) {
                    akax.a(fileInputStream, th);
                }
            }
        }
        return arrayList;
    }

    public static final boolean a(File file) {
        akcr.b(file, "receiver$0");
        if (file.exists()) {
            Object list = file.list();
            akcr.a(list, "list()");
            if (((list.length == 0 ? 1 : 0) ^ 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0055 in {5, 9, 11} preds:[]
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
    public static final byte[] a(java.util.ArrayList<java.lang.String> r3, java.security.MessageDigest r4) {
        /*
        r3 = (java.util.List) r3;
        defpackage.ajyq.c(r3);
        r0 = r3.isEmpty();
        r1 = "";
        if (r0 != 0) goto L_0x0031;
        r0 = r3.size();
        r3 = r3.listIterator(r0);
        r0 = r3.hasPrevious();
        if (r0 == 0) goto L_0x0031;
        r0 = r3.previous();
        r0 = (java.lang.String) r0;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r0);
        r2.append(r1);
        r1 = r2.toString();
        goto L_0x0015;
        r3 = com.google.common.base.Charsets.UTF_8;
        r0 = "Charsets.UTF_8";
        defpackage.akcr.a(r3, r0);
        if (r1 == 0) goto L_0x004d;
        r3 = r1.getBytes(r3);
        r0 = "(this as java.lang.String).getBytes(charset)";
        defpackage.akcr.a(r3, r0);
        r3 = r4.digest(r3);
        r4 = "digest.digest(hashSum.toByteArray(Charsets.UTF_8))";
        defpackage.akcr.a(r3, r4);
        return r3;
        r3 = new ajxt;
        r4 = "null cannot be cast to non-null type java.lang.String";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhr.a(java.util.ArrayList, java.security.MessageDigest):byte[]");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:35:0x008c in {9, 17, 20, 26, 29, 31, 34} preds:[]
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
    private static byte[] a(java.util.zip.ZipInputStream r8, java.io.File r9, java.security.MessageDigest r10, defpackage.akbw<? super java.util.zip.ZipEntry, ? super java.io.File, java.lang.Boolean> r11) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r8, r0);
        r0 = "outputDirectory";
        defpackage.akcr.b(r9, r0);
        r0 = "digest";
        defpackage.akcr.b(r10, r0);
        r0 = "filter";
        defpackage.akcr.b(r11, r0);
        r0 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x0087 }
        r0.<init>();	 Catch:{ Throwable -> 0x0087 }
        r1 = r8.getNextEntry();	 Catch:{ Throwable -> 0x0087 }
        if (r1 == 0) goto L_0x0082;	 Catch:{ Throwable -> 0x0087 }
        r2 = new java.io.File;	 Catch:{ Throwable -> 0x0087 }
        r3 = r1.getName();	 Catch:{ Throwable -> 0x0087 }
        r2.<init>(r9, r3);	 Catch:{ Throwable -> 0x0087 }
        r3 = r11.invoke(r1, r2);	 Catch:{ Throwable -> 0x0087 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ Throwable -> 0x0087 }
        r3 = r3.booleanValue();	 Catch:{ Throwable -> 0x0087 }
        if (r3 == 0) goto L_0x0019;	 Catch:{ Throwable -> 0x0087 }
        r1 = r1.isDirectory();	 Catch:{ Throwable -> 0x0087 }
        if (r1 == 0) goto L_0x003e;	 Catch:{ Throwable -> 0x0087 }
        r2.mkdirs();	 Catch:{ Throwable -> 0x0087 }
        goto L_0x0019;	 Catch:{ Throwable -> 0x0087 }
        r1 = new java.io.FileOutputStream;	 Catch:{ Throwable -> 0x0087 }
        r1.<init>(r2);	 Catch:{ Throwable -> 0x0087 }
        r1 = (java.io.OutputStream) r1;	 Catch:{ Throwable -> 0x0087 }
        r2 = new java.io.BufferedOutputStream;	 Catch:{ Throwable -> 0x0087 }
        r3 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;	 Catch:{ Throwable -> 0x0087 }
        r2.<init>(r1, r3);	 Catch:{ Throwable -> 0x0087 }
        r2 = (java.io.Closeable) r2;	 Catch:{ Throwable -> 0x0087 }
        r1 = 0;
        r4 = r2;	 Catch:{ Throwable -> 0x007b }
        r4 = (java.io.BufferedOutputStream) r4;	 Catch:{ Throwable -> 0x007b }
        r5 = r8;	 Catch:{ Throwable -> 0x007b }
        r5 = (java.io.InputStream) r5;	 Catch:{ Throwable -> 0x007b }
        r3 = new byte[r3];	 Catch:{ Throwable -> 0x007b }
        r6 = r5.read(r3);	 Catch:{ Throwable -> 0x007b }
        r7 = -1;	 Catch:{ Throwable -> 0x007b }
        if (r6 == r7) goto L_0x0066;	 Catch:{ Throwable -> 0x007b }
        r7 = 0;	 Catch:{ Throwable -> 0x007b }
        r4.write(r3, r7, r6);	 Catch:{ Throwable -> 0x007b }
        r10.update(r3, r7, r6);	 Catch:{ Throwable -> 0x007b }
        goto L_0x0057;
        defpackage.akax.a(r2, r1);	 Catch:{ Throwable -> 0x0087 }
        r1 = com.google.common.io.BaseEncoding.base16();	 Catch:{ Throwable -> 0x0087 }
        r2 = r10.digest();	 Catch:{ Throwable -> 0x0087 }
        r1 = r1.encode(r2);	 Catch:{ Throwable -> 0x0087 }
        r0.add(r1);	 Catch:{ Throwable -> 0x0087 }
        goto L_0x0019;
        r8 = move-exception;
        goto L_0x007e;
        r8 = move-exception;
        r1 = r8;
        throw r1;	 Catch:{ all -> 0x0079 }
        defpackage.akax.a(r2, r1);	 Catch:{ Throwable -> 0x0087 }
        throw r8;	 Catch:{ Throwable -> 0x0087 }
        r8 = defpackage.mhr.a(r0, r10);	 Catch:{ Throwable -> 0x0087 }
        return r8;
        r8 = move-exception;
        r10.reset();
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhr.a(java.util.zip.ZipInputStream, java.io.File, java.security.MessageDigest, akbw):byte[]");
    }

    public static final a b(File file) {
        akcr.b(file, "receiver$0");
        StringBuilder stringBuilder = new StringBuilder("file://");
        stringBuilder.append(file.getPath());
        return miq.a.a(stringBuilder.toString());
    }
}
