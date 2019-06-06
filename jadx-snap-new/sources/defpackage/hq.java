package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

/* renamed from: hq */
public final class hq {
    public static File a(Context context) {
        StringBuilder stringBuilder = new StringBuilder(".font");
        stringBuilder.append(Process.myPid());
        String str = "-";
        stringBuilder.append(str);
        stringBuilder.append(Process.myTid());
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        int i = 0;
        while (i < 100) {
            File cacheDir = context.getCacheDir();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append(i);
            File file = new File(cacheDir, stringBuilder3.toString());
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static ByteBuffer a(Context context, Resources resources, int i) {
        File a = hq.a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!hq.a(a, resources, i)) {
                return null;
            }
            ByteBuffer a2 = hq.a(a);
            a.delete();
            return a2;
        } finally {
            a.delete();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x004d A:{ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0013} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:32:0x004d, code skipped:
            r9 = th;
     */
    /* JADX WARNING: Missing block: B:33:0x004e, code skipped:
            r10 = null;
     */
    /* JADX WARNING: Missing block: B:37:0x0052, code skipped:
            r10 = move-exception;
     */
    /* JADX WARNING: Missing block: B:38:0x0053, code skipped:
            r7 = r10;
            r10 = r9;
            r9 = r7;
     */
    public static java.nio.ByteBuffer a(android.content.Context r8, android.os.CancellationSignal r9, android.net.Uri r10) {
        /*
        r8 = r8.getContentResolver();
        r0 = 0;
        r1 = "r";
        r8 = r8.openFileDescriptor(r10, r1, r9);	 Catch:{ IOException -> 0x0067 }
        if (r8 != 0) goto L_0x0013;
    L_0x000d:
        if (r8 == 0) goto L_0x0012;
    L_0x000f:
        r8.close();	 Catch:{ IOException -> 0x0067 }
    L_0x0012:
        return r0;
    L_0x0013:
        r9 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x0050, all -> 0x004d }
        r10 = r8.getFileDescriptor();	 Catch:{ Throwable -> 0x0050, all -> 0x004d }
        r9.<init>(r10);	 Catch:{ Throwable -> 0x0050, all -> 0x004d }
        r1 = r9.getChannel();	 Catch:{ Throwable -> 0x0038, all -> 0x0035 }
        r5 = r1.size();	 Catch:{ Throwable -> 0x0038, all -> 0x0035 }
        r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ Throwable -> 0x0038, all -> 0x0035 }
        r3 = 0;
        r10 = r1.map(r2, r3, r5);	 Catch:{ Throwable -> 0x0038, all -> 0x0035 }
        r9.close();	 Catch:{ Throwable -> 0x0050, all -> 0x004d }
        if (r8 == 0) goto L_0x0034;
    L_0x0031:
        r8.close();	 Catch:{ IOException -> 0x0067 }
    L_0x0034:
        return r10;
    L_0x0035:
        r10 = move-exception;
        r1 = r0;
        goto L_0x003e;
    L_0x0038:
        r10 = move-exception;
        throw r10;	 Catch:{ all -> 0x003a }
    L_0x003a:
        r1 = move-exception;
        r7 = r1;
        r1 = r10;
        r10 = r7;
    L_0x003e:
        if (r1 == 0) goto L_0x0049;
    L_0x0040:
        r9.close();	 Catch:{ Throwable -> 0x0044, all -> 0x004d }
        goto L_0x004c;
    L_0x0044:
        r9 = move-exception;
        r1.addSuppressed(r9);	 Catch:{ Throwable -> 0x0050, all -> 0x004d }
        goto L_0x004c;
    L_0x0049:
        r9.close();	 Catch:{ Throwable -> 0x0050, all -> 0x004d }
    L_0x004c:
        throw r10;	 Catch:{ Throwable -> 0x0050, all -> 0x004d }
    L_0x004d:
        r9 = move-exception;
        r10 = r0;
        goto L_0x0056;
    L_0x0050:
        r9 = move-exception;
        throw r9;	 Catch:{ all -> 0x0052 }
    L_0x0052:
        r10 = move-exception;
        r7 = r10;
        r10 = r9;
        r9 = r7;
    L_0x0056:
        if (r8 == 0) goto L_0x0066;
    L_0x0058:
        if (r10 == 0) goto L_0x0063;
    L_0x005a:
        r8.close();	 Catch:{ Throwable -> 0x005e }
        goto L_0x0066;
    L_0x005e:
        r8 = move-exception;
        r10.addSuppressed(r8);	 Catch:{ IOException -> 0x0067 }
        goto L_0x0066;
    L_0x0063:
        r8.close();	 Catch:{ IOException -> 0x0067 }
    L_0x0066:
        throw r9;	 Catch:{ IOException -> 0x0067 }
    L_0x0067:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq.a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    private static ByteBuffer a(File file) {
        Throwable th;
        Throwable th2;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th22) {
                Throwable th3 = th22;
                th22 = th;
                th = th3;
            }
            throw th;
            if (th22 != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th22.addSuppressed(th4);
                }
            } else {
                fileInputStream.close();
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean a(File file, Resources resources, int i) {
        Throwable th;
        Closeable openRawResource;
        try {
            openRawResource = resources.openRawResource(i);
            try {
                boolean a = hq.a(file, openRawResource);
                hq.a(openRawResource);
                return a;
            } catch (Throwable th2) {
                th = th2;
                hq.a(openRawResource);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            openRawResource = null;
            hq.a(openRawResource);
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0043 in {9, 11, 13, 15, 17, 18, 22, 24} preds:[]
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
    public static boolean a(java.io.File r4, java.io.InputStream r5) {
        /*
        r0 = 0;
        r1 = 0;
        r2 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0023 }
        r2.<init>(r4, r0);	 Catch:{ IOException -> 0x0023 }
        r4 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r4 = new byte[r4];	 Catch:{ IOException -> 0x001e, all -> 0x001b }
        r1 = r5.read(r4);	 Catch:{ IOException -> 0x001e, all -> 0x001b }
        r3 = -1;	 Catch:{ IOException -> 0x001e, all -> 0x001b }
        if (r1 == r3) goto L_0x0016;	 Catch:{ IOException -> 0x001e, all -> 0x001b }
        r2.write(r4, r0, r1);	 Catch:{ IOException -> 0x001e, all -> 0x001b }
        goto L_0x000b;
        defpackage.hq.a(r2);
        r4 = 1;
        return r4;
        r4 = move-exception;
        r1 = r2;
        goto L_0x003f;
        r4 = move-exception;
        r1 = r2;
        goto L_0x0024;
        r4 = move-exception;
        goto L_0x003f;
        r4 = move-exception;
        r5 = "TypefaceCompatUtil";	 Catch:{ all -> 0x0021 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0021 }
        r3 = "Error copying resource contents to temp file: ";	 Catch:{ all -> 0x0021 }
        r2.<init>(r3);	 Catch:{ all -> 0x0021 }
        r4 = r4.getMessage();	 Catch:{ all -> 0x0021 }
        r2.append(r4);	 Catch:{ all -> 0x0021 }
        r4 = r2.toString();	 Catch:{ all -> 0x0021 }
        android.util.Log.e(r5, r4);	 Catch:{ all -> 0x0021 }
        defpackage.hq.a(r1);
        return r0;
        defpackage.hq.a(r1);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq.a(java.io.File, java.io.InputStream):boolean");
    }
}
