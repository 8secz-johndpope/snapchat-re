package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dm */
final class dm {

    /* renamed from: dm$a */
    static class a extends File {
        public long a = -1;

        public a(File file, String str) {
            super(file, str);
        }
    }

    private static long a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("multidex.version", VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:60:0x0155 in {14, 15, 16, 19, 24, 25, 27, 31, 33, 34, 36, 40, 41, 43, 45, 47, 49, 53, 54, 57, 59} preds:[]
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
    static java.util.List<? extends java.io.File> a(android.content.Context r19, java.io.File r20, java.io.File r21, java.lang.String r22) {
        /*
        r2 = r22;
        r8 = "Failed to release lock on ";
        r0 = new java.lang.StringBuilder;
        r1 = "MultiDexExtractor.load(";
        r0.<init>(r1);
        r1 = r20.getPath();
        r0.append(r1);
        r1 = ", false, ";
        r0.append(r1);
        r0.append(r2);
        r1 = ")";
        r0.append(r1);
        r0 = r0.toString();
        r9 = "MultiDex";
        android.util.Log.i(r9, r0);
        r5 = defpackage.dm.b(r20);
        r10 = new java.io.File;
        r0 = "MultiDex.lock";
        r1 = r21;
        r10.<init>(r1, r0);
        r11 = new java.io.RandomAccessFile;
        r0 = "rw";
        r11.<init>(r10, r0);
        r13 = r11.getChannel();	 Catch:{ all -> 0x012f }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012a }
        r3 = "Blocking on lock ";	 Catch:{ all -> 0x012a }
        r0.<init>(r3);	 Catch:{ all -> 0x012a }
        r3 = r10.getPath();	 Catch:{ all -> 0x012a }
        r0.append(r3);	 Catch:{ all -> 0x012a }
        r0 = r0.toString();	 Catch:{ all -> 0x012a }
        android.util.Log.i(r9, r0);	 Catch:{ all -> 0x012a }
        r14 = r13.lock();	 Catch:{ all -> 0x012a }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0126 }
        r0.<init>();	 Catch:{ all -> 0x0126 }
        r3 = r10.getPath();	 Catch:{ all -> 0x0126 }
        r0.append(r3);	 Catch:{ all -> 0x0126 }
        r3 = " locked";	 Catch:{ all -> 0x0126 }
        r0.append(r3);	 Catch:{ all -> 0x0126 }
        r0 = r0.toString();	 Catch:{ all -> 0x0126 }
        android.util.Log.i(r9, r0);	 Catch:{ all -> 0x0126 }
        r0 = defpackage.dm.a(r19);	 Catch:{ all -> 0x0126 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0126 }
        r3.<init>();	 Catch:{ all -> 0x0126 }
        r3.append(r2);	 Catch:{ all -> 0x0126 }
        r4 = "timestamp";	 Catch:{ all -> 0x0126 }
        r3.append(r4);	 Catch:{ all -> 0x0126 }
        r3 = r3.toString();	 Catch:{ all -> 0x0126 }
        r16 = r13;
        r12 = -1;
        r3 = r0.getLong(r3, r12);	 Catch:{ all -> 0x0124 }
        r17 = defpackage.dm.a(r20);	 Catch:{ all -> 0x0124 }
        r7 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1));	 Catch:{ all -> 0x0124 }
        if (r7 != 0) goto L_0x00b2;	 Catch:{ all -> 0x0124 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0124 }
        r3.<init>();	 Catch:{ all -> 0x0124 }
        r3.append(r2);	 Catch:{ all -> 0x0124 }
        r4 = "crc";	 Catch:{ all -> 0x0124 }
        r3.append(r4);	 Catch:{ all -> 0x0124 }
        r3 = r3.toString();	 Catch:{ all -> 0x0124 }
        r3 = r0.getLong(r3, r12);	 Catch:{ all -> 0x0124 }
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 == 0) goto L_0x00b0;
        goto L_0x00b2;
        r0 = 0;
        goto L_0x00b3;
        r0 = 1;
        if (r0 != 0) goto L_0x00d3;
        r0 = defpackage.dm.b(r19, r20, r21, r22);	 Catch:{ IOException -> 0x00bb }
        r1 = r0;
        goto L_0x00e1;
        r0 = move-exception;
        r3 = r0;
        r0 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction";	 Catch:{ all -> 0x0124 }
        android.util.Log.w(r9, r0, r3);	 Catch:{ all -> 0x0124 }
        r0 = defpackage.dm.a(r20, r21);	 Catch:{ all -> 0x0124 }
        r3 = defpackage.dm.a(r20);	 Catch:{ all -> 0x0124 }
        r1 = r19;	 Catch:{ all -> 0x0124 }
        r2 = r22;	 Catch:{ all -> 0x0124 }
        r7 = r0;	 Catch:{ all -> 0x0124 }
        defpackage.dm.a(r1, r2, r3, r5, r7);	 Catch:{ all -> 0x0124 }
        goto L_0x00b9;	 Catch:{ all -> 0x0124 }
        r0 = "Detected that extraction must be performed.";	 Catch:{ all -> 0x0124 }
        android.util.Log.i(r9, r0);	 Catch:{ all -> 0x0124 }
        r0 = defpackage.dm.a(r20, r21);	 Catch:{ all -> 0x0124 }
        r3 = defpackage.dm.a(r20);	 Catch:{ all -> 0x0124 }
        goto L_0x00ca;
        if (r14 == 0) goto L_0x00fd;
        r14.release();	 Catch:{ IOException -> 0x00e7 }
        goto L_0x00fd;
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r8);
        r3 = r10.getPath();
        r2.append(r3);
        r2 = r2.toString();
        android.util.Log.e(r9, r2);
        r15 = r0;
        goto L_0x00fe;
        r15 = 0;
        if (r16 == 0) goto L_0x0103;
        defpackage.dm.a(r16);
        defpackage.dm.a(r11);
        if (r15 != 0) goto L_0x0123;
        r0 = new java.lang.StringBuilder;
        r2 = "load found ";
        r0.<init>(r2);
        r2 = r1.size();
        r0.append(r2);
        r2 = " secondary dex files";
        r0.append(r2);
        r0 = r0.toString();
        android.util.Log.i(r9, r0);
        return r1;
        throw r15;
        r0 = move-exception;
        goto L_0x0133;
        r0 = move-exception;
        r16 = r13;
        goto L_0x0133;
        r0 = move-exception;
        r16 = r13;
        r14 = 0;
        goto L_0x0133;
        r0 = move-exception;
        r14 = 0;
        r16 = 0;
        if (r14 == 0) goto L_0x014c;
        r14.release();	 Catch:{ IOException -> 0x0139 }
        goto L_0x014c;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r8);
        r2 = r10.getPath();
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.e(r9, r1);
        if (r16 == 0) goto L_0x0151;
        defpackage.dm.a(r16);
        defpackage.dm.a(r11);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm.a(android.content.Context, java.io.File, java.io.File, java.lang.String):java.util.List");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:42:0x013f in {12, 15, 18, 19, 24, 26, 28, 31, 33, 34, 38, 40, 41} preds:[]
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
    private static java.util.List<defpackage.dm.a> a(java.io.File r13, java.io.File r14) {
        /*
        r0 = "Failed to close resource";
        r1 = "MultiDex";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r13.getName();
        r2.append(r3);
        r3 = ".classes";
        r2.append(r3);
        r2 = r2.toString();
        defpackage.dm.a(r14, r2);
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = new java.util.zip.ZipFile;
        r4.<init>(r13);
        r13 = 2;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0135 }
        r6 = "classes2.dex";	 Catch:{ all -> 0x0135 }
        r5.<init>(r6);	 Catch:{ all -> 0x0135 }
        r5 = r5.toString();	 Catch:{ all -> 0x0135 }
        r5 = r4.getEntry(r5);	 Catch:{ all -> 0x0135 }
        if (r5 == 0) goto L_0x012c;	 Catch:{ all -> 0x0135 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0135 }
        r6.<init>();	 Catch:{ all -> 0x0135 }
        r6.append(r2);	 Catch:{ all -> 0x0135 }
        r6.append(r13);	 Catch:{ all -> 0x0135 }
        r7 = ".zip";	 Catch:{ all -> 0x0135 }
        r6.append(r7);	 Catch:{ all -> 0x0135 }
        r6 = r6.toString();	 Catch:{ all -> 0x0135 }
        r7 = new dm$a;	 Catch:{ all -> 0x0135 }
        r7.<init>(r14, r6);	 Catch:{ all -> 0x0135 }
        r3.add(r7);	 Catch:{ all -> 0x0135 }
        r6 = "Extraction is needed for file ";	 Catch:{ all -> 0x0135 }
        r8 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x0135 }
        r6 = r6.concat(r8);	 Catch:{ all -> 0x0135 }
        android.util.Log.i(r1, r6);	 Catch:{ all -> 0x0135 }
        r6 = 0;	 Catch:{ all -> 0x0135 }
        r8 = 0;	 Catch:{ all -> 0x0135 }
        r9 = 0;	 Catch:{ all -> 0x0135 }
        r10 = 3;	 Catch:{ all -> 0x0135 }
        if (r8 >= r10) goto L_0x00ee;	 Catch:{ all -> 0x0135 }
        if (r9 != 0) goto L_0x00ee;	 Catch:{ all -> 0x0135 }
        r8 = r8 + 1;	 Catch:{ all -> 0x0135 }
        defpackage.dm.a(r4, r5, r7, r2);	 Catch:{ all -> 0x0135 }
        r9 = defpackage.dm.b(r7);	 Catch:{ IOException -> 0x0076 }
        r7.a = r9;	 Catch:{ IOException -> 0x0076 }
        r9 = 1;
        goto L_0x008d;
        r9 = move-exception;
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0135 }
        r11 = "Failed to read crc from ";	 Catch:{ all -> 0x0135 }
        r10.<init>(r11);	 Catch:{ all -> 0x0135 }
        r11 = r7.getAbsolutePath();	 Catch:{ all -> 0x0135 }
        r10.append(r11);	 Catch:{ all -> 0x0135 }
        r10 = r10.toString();	 Catch:{ all -> 0x0135 }
        android.util.Log.w(r1, r10, r9);	 Catch:{ all -> 0x0135 }
        r9 = 0;	 Catch:{ all -> 0x0135 }
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0135 }
        r11 = "Extraction ";	 Catch:{ all -> 0x0135 }
        r10.<init>(r11);	 Catch:{ all -> 0x0135 }
        if (r9 == 0) goto L_0x0099;	 Catch:{ all -> 0x0135 }
        r11 = "succeeded";	 Catch:{ all -> 0x0135 }
        goto L_0x009b;	 Catch:{ all -> 0x0135 }
        r11 = "failed";	 Catch:{ all -> 0x0135 }
        r10.append(r11);	 Catch:{ all -> 0x0135 }
        r11 = " - length ";	 Catch:{ all -> 0x0135 }
        r10.append(r11);	 Catch:{ all -> 0x0135 }
        r11 = r7.getAbsolutePath();	 Catch:{ all -> 0x0135 }
        r10.append(r11);	 Catch:{ all -> 0x0135 }
        r11 = ": ";	 Catch:{ all -> 0x0135 }
        r10.append(r11);	 Catch:{ all -> 0x0135 }
        r11 = r7.length();	 Catch:{ all -> 0x0135 }
        r10.append(r11);	 Catch:{ all -> 0x0135 }
        r11 = " - crc: ";	 Catch:{ all -> 0x0135 }
        r10.append(r11);	 Catch:{ all -> 0x0135 }
        r11 = r7.a;	 Catch:{ all -> 0x0135 }
        r10.append(r11);	 Catch:{ all -> 0x0135 }
        r10 = r10.toString();	 Catch:{ all -> 0x0135 }
        android.util.Log.i(r1, r10);	 Catch:{ all -> 0x0135 }
        if (r9 != 0) goto L_0x0064;	 Catch:{ all -> 0x0135 }
        r7.delete();	 Catch:{ all -> 0x0135 }
        r10 = r7.exists();	 Catch:{ all -> 0x0135 }
        if (r10 == 0) goto L_0x0064;	 Catch:{ all -> 0x0135 }
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0135 }
        r11 = "Failed to delete corrupted secondary dex '";	 Catch:{ all -> 0x0135 }
        r10.<init>(r11);	 Catch:{ all -> 0x0135 }
        r11 = r7.getPath();	 Catch:{ all -> 0x0135 }
        r10.append(r11);	 Catch:{ all -> 0x0135 }
        r11 = "'";	 Catch:{ all -> 0x0135 }
        r10.append(r11);	 Catch:{ all -> 0x0135 }
        r10 = r10.toString();	 Catch:{ all -> 0x0135 }
        android.util.Log.w(r1, r10);	 Catch:{ all -> 0x0135 }
        goto L_0x0064;	 Catch:{ all -> 0x0135 }
        if (r9 == 0) goto L_0x0107;	 Catch:{ all -> 0x0135 }
        r13 = r13 + 1;	 Catch:{ all -> 0x0135 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0135 }
        r6 = "classes";	 Catch:{ all -> 0x0135 }
        r5.<init>(r6);	 Catch:{ all -> 0x0135 }
        r5.append(r13);	 Catch:{ all -> 0x0135 }
        r6 = ".dex";	 Catch:{ all -> 0x0135 }
        r5.append(r6);	 Catch:{ all -> 0x0135 }
        r5 = r5.toString();	 Catch:{ all -> 0x0135 }
        goto L_0x0032;	 Catch:{ all -> 0x0135 }
        r14 = new java.io.IOException;	 Catch:{ all -> 0x0135 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0135 }
        r3 = "Could not create zip file ";	 Catch:{ all -> 0x0135 }
        r2.<init>(r3);	 Catch:{ all -> 0x0135 }
        r3 = r7.getAbsolutePath();	 Catch:{ all -> 0x0135 }
        r2.append(r3);	 Catch:{ all -> 0x0135 }
        r3 = " for secondary dex (";	 Catch:{ all -> 0x0135 }
        r2.append(r3);	 Catch:{ all -> 0x0135 }
        r2.append(r13);	 Catch:{ all -> 0x0135 }
        r13 = ")";	 Catch:{ all -> 0x0135 }
        r2.append(r13);	 Catch:{ all -> 0x0135 }
        r13 = r2.toString();	 Catch:{ all -> 0x0135 }
        r14.<init>(r13);	 Catch:{ all -> 0x0135 }
        throw r14;	 Catch:{ all -> 0x0135 }
        r4.close();	 Catch:{ IOException -> 0x0130 }
        goto L_0x0134;
        r13 = move-exception;
        android.util.Log.w(r1, r0, r13);
        return r3;
        r13 = move-exception;
        r4.close();	 Catch:{ IOException -> 0x013a }
        goto L_0x013e;
        r14 = move-exception;
        android.util.Log.w(r1, r0, r14);
        throw r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm.a(java.io.File, java.io.File):java.util.List");
    }

    private static void a(Context context, String str, long j, long j2, List<a> list) {
        Editor edit = dm.a(context).edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("timestamp");
        edit.putLong(stringBuilder.toString(), j);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append("crc");
        edit.putLong(stringBuilder2.toString(), j2);
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append("dex.number");
        edit.putInt(stringBuilder2.toString(), list.size() + 1);
        int i = 2;
        for (a aVar : list) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append("dex.crc.");
            stringBuilder3.append(i);
            edit.putLong(stringBuilder3.toString(), aVar.a);
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append("dex.time.");
            stringBuilder3.append(i);
            edit.putLong(stringBuilder3.toString(), aVar.lastModified());
            i++;
        }
        edit.commit();
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    private static void a(File file, final String str) {
        File[] listFiles = file.listFiles(new FileFilter() {
            public final boolean accept(File file) {
                String name = file.getName();
                return (name.startsWith(str) || name.equals("MultiDex.lock")) ? false : true;
            }
        });
        String str2 = "MultiDex";
        if (listFiles == null) {
            StringBuilder stringBuilder = new StringBuilder("Failed to list secondary dex dir content (");
            stringBuilder.append(file.getPath());
            stringBuilder.append(").");
            Log.w(str2, stringBuilder.toString());
            return;
        }
        for (File file2 : listFiles) {
            StringBuilder stringBuilder2 = new StringBuilder("Trying to delete old file ");
            stringBuilder2.append(file2.getPath());
            stringBuilder2.append(" of size ");
            stringBuilder2.append(file2.length());
            Log.i(str2, stringBuilder2.toString());
            if (file2.delete()) {
                stringBuilder2 = new StringBuilder("Deleted old file ");
                stringBuilder2.append(file2.getPath());
                Log.i(str2, stringBuilder2.toString());
            } else {
                stringBuilder2 = new StringBuilder("Failed to delete old file ");
                stringBuilder2.append(file2.getPath());
                Log.w(str2, stringBuilder2.toString());
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x00ec in {7, 15, 18, 20, 23, 26} preds:[]
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
    private static void a(java.util.zip.ZipFile r5, java.util.zip.ZipEntry r6, java.io.File r7, java.lang.String r8) {
        /*
        r5 = r5.getInputStream(r6);
        r8 = java.lang.String.valueOf(r8);
        r0 = "tmp-";
        r8 = r0.concat(r8);
        r0 = r7.getParentFile();
        r1 = ".zip";
        r8 = java.io.File.createTempFile(r8, r1, r0);
        r0 = new java.lang.StringBuilder;
        r1 = "Extracting ";
        r0.<init>(r1);
        r1 = r8.getPath();
        r0.append(r1);
        r0 = r0.toString();
        r1 = "MultiDex";
        android.util.Log.i(r1, r0);
        r0 = new java.util.zip.ZipOutputStream;	 Catch:{ all -> 0x00e4 }
        r2 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x00e4 }
        r3 = new java.io.FileOutputStream;	 Catch:{ all -> 0x00e4 }
        r3.<init>(r8);	 Catch:{ all -> 0x00e4 }
        r2.<init>(r3);	 Catch:{ all -> 0x00e4 }
        r0.<init>(r2);	 Catch:{ all -> 0x00e4 }
        r2 = new java.util.zip.ZipEntry;	 Catch:{ all -> 0x00df }
        r3 = "classes.dex";	 Catch:{ all -> 0x00df }
        r2.<init>(r3);	 Catch:{ all -> 0x00df }
        r3 = r6.getTime();	 Catch:{ all -> 0x00df }
        r2.setTime(r3);	 Catch:{ all -> 0x00df }
        r0.putNextEntry(r2);	 Catch:{ all -> 0x00df }
        r6 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;	 Catch:{ all -> 0x00df }
        r6 = new byte[r6];	 Catch:{ all -> 0x00df }
        r2 = r5.read(r6);	 Catch:{ all -> 0x00df }
        r3 = -1;	 Catch:{ all -> 0x00df }
        if (r2 == r3) goto L_0x005f;	 Catch:{ all -> 0x00df }
        r3 = 0;	 Catch:{ all -> 0x00df }
        r0.write(r6, r3, r2);	 Catch:{ all -> 0x00df }
        goto L_0x0053;	 Catch:{ all -> 0x00df }
        r0.closeEntry();	 Catch:{ all -> 0x00df }
        r0.close();	 Catch:{ all -> 0x00e4 }
        r6 = r8.setReadOnly();	 Catch:{ all -> 0x00e4 }
        if (r6 == 0) goto L_0x00b6;	 Catch:{ all -> 0x00e4 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e4 }
        r0 = "Renaming to ";	 Catch:{ all -> 0x00e4 }
        r6.<init>(r0);	 Catch:{ all -> 0x00e4 }
        r0 = r7.getPath();	 Catch:{ all -> 0x00e4 }
        r6.append(r0);	 Catch:{ all -> 0x00e4 }
        r6 = r6.toString();	 Catch:{ all -> 0x00e4 }
        android.util.Log.i(r1, r6);	 Catch:{ all -> 0x00e4 }
        r6 = r8.renameTo(r7);	 Catch:{ all -> 0x00e4 }
        if (r6 == 0) goto L_0x008d;
        defpackage.dm.a(r5);
        r8.delete();
        return;
        r6 = new java.io.IOException;	 Catch:{ all -> 0x00e4 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e4 }
        r1 = "Failed to rename \"";	 Catch:{ all -> 0x00e4 }
        r0.<init>(r1);	 Catch:{ all -> 0x00e4 }
        r1 = r8.getAbsolutePath();	 Catch:{ all -> 0x00e4 }
        r0.append(r1);	 Catch:{ all -> 0x00e4 }
        r1 = "\" to \"";	 Catch:{ all -> 0x00e4 }
        r0.append(r1);	 Catch:{ all -> 0x00e4 }
        r7 = r7.getAbsolutePath();	 Catch:{ all -> 0x00e4 }
        r0.append(r7);	 Catch:{ all -> 0x00e4 }
        r7 = "\"";	 Catch:{ all -> 0x00e4 }
        r0.append(r7);	 Catch:{ all -> 0x00e4 }
        r7 = r0.toString();	 Catch:{ all -> 0x00e4 }
        r6.<init>(r7);	 Catch:{ all -> 0x00e4 }
        throw r6;	 Catch:{ all -> 0x00e4 }
        r6 = new java.io.IOException;	 Catch:{ all -> 0x00e4 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e4 }
        r1 = "Failed to mark readonly \"";	 Catch:{ all -> 0x00e4 }
        r0.<init>(r1);	 Catch:{ all -> 0x00e4 }
        r1 = r8.getAbsolutePath();	 Catch:{ all -> 0x00e4 }
        r0.append(r1);	 Catch:{ all -> 0x00e4 }
        r1 = "\" (tmp of \"";	 Catch:{ all -> 0x00e4 }
        r0.append(r1);	 Catch:{ all -> 0x00e4 }
        r7 = r7.getAbsolutePath();	 Catch:{ all -> 0x00e4 }
        r0.append(r7);	 Catch:{ all -> 0x00e4 }
        r7 = "\")";	 Catch:{ all -> 0x00e4 }
        r0.append(r7);	 Catch:{ all -> 0x00e4 }
        r7 = r0.toString();	 Catch:{ all -> 0x00e4 }
        r6.<init>(r7);	 Catch:{ all -> 0x00e4 }
        throw r6;	 Catch:{ all -> 0x00e4 }
        r6 = move-exception;	 Catch:{ all -> 0x00e4 }
        r0.close();	 Catch:{ all -> 0x00e4 }
        throw r6;	 Catch:{ all -> 0x00e4 }
        r6 = move-exception;
        defpackage.dm.a(r5);
        r8.delete();
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm.a(java.util.zip.ZipFile, java.util.zip.ZipEntry, java.io.File, java.lang.String):void");
    }

    private static long b(File file) {
        long a = dn.a(file);
        return a == -1 ? a - 1 : a;
    }

    private static List<a> b(Context context, File file, File file2, String str) {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getName());
        stringBuilder.append(".classes");
        String stringBuilder2 = stringBuilder.toString();
        SharedPreferences a = dm.a(context);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str2);
        stringBuilder3.append("dex.number");
        int i = a.getInt(stringBuilder3.toString(), 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder2);
            stringBuilder4.append(i2);
            stringBuilder4.append(".zip");
            a aVar = new a(file2, stringBuilder4.toString());
            if (aVar.isFile()) {
                aVar.a = dm.b(aVar);
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str2);
                stringBuilder4.append("dex.crc.");
                stringBuilder4.append(i2);
                long j = a.getLong(stringBuilder4.toString(), -1);
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str2);
                stringBuilder4.append("dex.time.");
                stringBuilder4.append(i2);
                long j2 = a.getLong(stringBuilder4.toString(), -1);
                long lastModified = aVar.lastModified();
                if (j2 == lastModified) {
                    String str3 = stringBuilder2;
                    SharedPreferences sharedPreferences = a;
                    if (j == aVar.a) {
                        arrayList.add(aVar);
                        i2++;
                        a = sharedPreferences;
                        stringBuilder2 = str3;
                    }
                }
                StringBuilder stringBuilder5 = new StringBuilder("Invalid extracted dex: ");
                stringBuilder5.append(aVar);
                stringBuilder5.append(" (key \"");
                stringBuilder5.append(str2);
                stringBuilder5.append("\"), expected modification time: ");
                stringBuilder5.append(j2);
                stringBuilder5.append(", modification time: ");
                stringBuilder5.append(lastModified);
                stringBuilder5.append(", expected crc: ");
                stringBuilder5.append(j);
                stringBuilder5.append(", file crc: ");
                stringBuilder5.append(aVar.a);
                throw new IOException(stringBuilder5.toString());
            }
            stringBuilder = new StringBuilder("Missing extracted secondary dex file '");
            stringBuilder.append(aVar.getPath());
            stringBuilder.append("'");
            throw new IOException(stringBuilder.toString());
        }
        return arrayList;
    }
}
