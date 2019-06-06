package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailView;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: yp */
public final class yp implements Closeable {
    final File a;
    final int b;
    Writer c;
    int d;
    private final File e;
    private final File f;
    private final File g;
    private final int h;
    private long i;
    private long j = 0;
    private final LinkedHashMap<String, c> k = new LinkedHashMap(0, 0.75f, true);
    private long l = 0;
    private ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());
    private final Callable<Void> n = new 1();

    /* renamed from: yp$1 */
    class 1 implements Callable<Void> {
        1() {
        }

        /* JADX WARNING: Missing block: B:11:0x0024, code skipped:
            return null;
     */
        private java.lang.Void a() {
            /*
            r4 = this;
            r0 = defpackage.yp.this;
            monitor-enter(r0);
            r1 = defpackage.yp.this;	 Catch:{ all -> 0x0025 }
            r1 = r1.c;	 Catch:{ all -> 0x0025 }
            r2 = 0;
            if (r1 != 0) goto L_0x000c;
        L_0x000a:
            monitor-exit(r0);	 Catch:{ all -> 0x0025 }
            return r2;
        L_0x000c:
            r1 = defpackage.yp.this;	 Catch:{ all -> 0x0025 }
            r1.c();	 Catch:{ all -> 0x0025 }
            r1 = defpackage.yp.this;	 Catch:{ all -> 0x0025 }
            r1 = r1.b();	 Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023;
        L_0x0019:
            r1 = defpackage.yp.this;	 Catch:{ all -> 0x0025 }
            r1.a();	 Catch:{ all -> 0x0025 }
            r1 = defpackage.yp.this;	 Catch:{ all -> 0x0025 }
            r3 = 0;
            r1.d = r3;	 Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r0);	 Catch:{ all -> 0x0025 }
            return r2;
        L_0x0025:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0025 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yp$1.a():java.lang.Void");
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: yp$a */
    static final class a implements ThreadFactory {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: yp$b */
    public final class b {
        final c a;
        final boolean[] b;
        public boolean c;

        private b(c cVar) {
            this.a = cVar;
            this.b = cVar.e ? null : new boolean[1];
        }

        /* synthetic */ b(yp ypVar, c cVar, byte b) {
            this(cVar);
        }

        public final File a() {
            File file;
            synchronized (yp.this) {
                if (this.a.f == this) {
                    if (!this.a.e) {
                        this.b[0] = true;
                    }
                    file = this.a.d[0];
                    if (!yp.this.a.exists()) {
                        yp.this.a.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }

        public final void b() {
            yp.this.a(this, false);
        }

        public final void c() {
            if (!this.c) {
                try {
                    b();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: yp$c */
    final class c {
        final String a;
        final long[] b;
        File[] c;
        File[] d;
        boolean e;
        b f;
        long g;

        private c(String str) {
            this.a = str;
            this.b = new long[1];
            this.c = new File[1];
            this.d = new File[1];
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append('.');
            int length = stringBuilder.length();
            for (int i = 0; i <= 0; i++) {
                stringBuilder.append(0);
                this.c[0] = new File(yp.this.a, stringBuilder.toString());
                stringBuilder.append(".tmp");
                this.d[0] = new File(yp.this.a, stringBuilder.toString());
                stringBuilder.setLength(length);
            }
        }

        /* synthetic */ c(yp ypVar, String str, byte b) {
            this(str);
        }

        private static IOException b(String[] strArr) {
            StringBuilder stringBuilder = new StringBuilder("unexpected journal line: ");
            stringBuilder.append(Arrays.toString(strArr));
            throw new IOException(stringBuilder.toString());
        }

        public final String a() {
            StringBuilder stringBuilder = new StringBuilder();
            for (long j : this.b) {
                stringBuilder.append(' ');
                stringBuilder.append(j);
            }
            return stringBuilder.toString();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0020 in {7, 8, 11, 13} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final void a(java.lang.String[] r5) {
            /*
            r4 = this;
            r0 = r5.length;
            r1 = 1;
            if (r0 != r1) goto L_0x001b;
            r0 = 0;
            r1 = r5.length;	 Catch:{ NumberFormatException -> 0x0016 }
            if (r0 >= r1) goto L_0x0015;	 Catch:{ NumberFormatException -> 0x0016 }
            r1 = r4.b;	 Catch:{ NumberFormatException -> 0x0016 }
            r2 = r5[r0];	 Catch:{ NumberFormatException -> 0x0016 }
            r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x0016 }
            r1[r0] = r2;	 Catch:{ NumberFormatException -> 0x0016 }
            r0 = r0 + 1;
            goto L_0x0005;
            return;
            r5 = defpackage.yp.c.b(r5);
            throw r5;
            r5 = defpackage.yp.c.b(r5);
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yp$c.a(java.lang.String[]):void");
        }
    }

    /* renamed from: yp$d */
    public final class d {
        public final File[] a;
        private final String b;
        private final long c;
        private final long[] d;

        private d(String str, long j, File[] fileArr, long[] jArr) {
            this.b = str;
            this.c = j;
            this.a = fileArr;
            this.d = jArr;
        }

        /* synthetic */ d(yp ypVar, String str, long j, File[] fileArr, long[] jArr, byte b) {
            this(str, j, fileArr, jArr);
        }
    }

    private yp(File file, long j) {
        File file2 = file;
        this.a = file2;
        this.h = 1;
        this.e = new File(file2, "journal");
        this.f = new File(file2, "journal.tmp");
        this.g = new File(file2, "journal.bkp");
        this.b = 1;
        this.i = j;
    }

    public static yp a(File file, long j) {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    yp.a(file2, file3, false);
                }
            }
            yp ypVar = new yp(file, j);
            if (ypVar.e.exists()) {
                try {
                    ypVar.d();
                    ypVar.e();
                    return ypVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder stringBuilder = new StringBuilder("DiskLruCache ");
                    stringBuilder.append(file);
                    stringBuilder.append(" is corrupt: ");
                    stringBuilder.append(e.getMessage());
                    stringBuilder.append(", removing");
                    printStream.println(stringBuilder.toString());
                    ypVar.close();
                    yr.a(ypVar.a);
                }
            }
            file.mkdirs();
            ypVar = new yp(file, j);
            ypVar.a();
            return ypVar;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private static void a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) {
        if (z) {
            yp.a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x0083 in {6, 13, 15, 16, 19, 21, 23, 26} preds:[]
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
    private synchronized boolean c(java.lang.String r9) {
        /*
        r8 = this;
        monitor-enter(r8);
        r8.f();	 Catch:{ all -> 0x0080 }
        r0 = r8.k;	 Catch:{ all -> 0x0080 }
        r0 = r0.get(r9);	 Catch:{ all -> 0x0080 }
        r0 = (defpackage.yp.c) r0;	 Catch:{ all -> 0x0080 }
        r1 = 0;	 Catch:{ all -> 0x0080 }
        if (r0 == 0) goto L_0x007e;	 Catch:{ all -> 0x0080 }
        r2 = r0.f;	 Catch:{ all -> 0x0080 }
        if (r2 == 0) goto L_0x0014;	 Catch:{ all -> 0x0080 }
        goto L_0x007e;	 Catch:{ all -> 0x0080 }
        r2 = 0;	 Catch:{ all -> 0x0080 }
        if (r2 > 0) goto L_0x004a;	 Catch:{ all -> 0x0080 }
        r3 = r0.c;	 Catch:{ all -> 0x0080 }
        r3 = r3[r1];	 Catch:{ all -> 0x0080 }
        r4 = r3.exists();	 Catch:{ all -> 0x0080 }
        if (r4 == 0) goto L_0x0038;	 Catch:{ all -> 0x0080 }
        r4 = r3.delete();	 Catch:{ all -> 0x0080 }
        if (r4 == 0) goto L_0x0028;	 Catch:{ all -> 0x0080 }
        goto L_0x0038;	 Catch:{ all -> 0x0080 }
        r9 = new java.io.IOException;	 Catch:{ all -> 0x0080 }
        r0 = "failed to delete ";	 Catch:{ all -> 0x0080 }
        r1 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0080 }
        r0 = r0.concat(r1);	 Catch:{ all -> 0x0080 }
        r9.<init>(r0);	 Catch:{ all -> 0x0080 }
        throw r9;	 Catch:{ all -> 0x0080 }
        r3 = r8.j;	 Catch:{ all -> 0x0080 }
        r5 = r0.b;	 Catch:{ all -> 0x0080 }
        r6 = r5[r1];	 Catch:{ all -> 0x0080 }
        r3 = r3 - r6;	 Catch:{ all -> 0x0080 }
        r8.j = r3;	 Catch:{ all -> 0x0080 }
        r3 = r0.b;	 Catch:{ all -> 0x0080 }
        r4 = 0;	 Catch:{ all -> 0x0080 }
        r3[r1] = r4;	 Catch:{ all -> 0x0080 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0080 }
        goto L_0x0015;	 Catch:{ all -> 0x0080 }
        r0 = r8.d;	 Catch:{ all -> 0x0080 }
        r1 = 1;	 Catch:{ all -> 0x0080 }
        r0 = r0 + r1;	 Catch:{ all -> 0x0080 }
        r8.d = r0;	 Catch:{ all -> 0x0080 }
        r0 = r8.c;	 Catch:{ all -> 0x0080 }
        r2 = "REMOVE";	 Catch:{ all -> 0x0080 }
        r0.append(r2);	 Catch:{ all -> 0x0080 }
        r0 = r8.c;	 Catch:{ all -> 0x0080 }
        r2 = 32;	 Catch:{ all -> 0x0080 }
        r0.append(r2);	 Catch:{ all -> 0x0080 }
        r0 = r8.c;	 Catch:{ all -> 0x0080 }
        r0.append(r9);	 Catch:{ all -> 0x0080 }
        r0 = r8.c;	 Catch:{ all -> 0x0080 }
        r2 = 10;	 Catch:{ all -> 0x0080 }
        r0.append(r2);	 Catch:{ all -> 0x0080 }
        r0 = r8.k;	 Catch:{ all -> 0x0080 }
        r0.remove(r9);	 Catch:{ all -> 0x0080 }
        r9 = r8.b();	 Catch:{ all -> 0x0080 }
        if (r9 == 0) goto L_0x007c;	 Catch:{ all -> 0x0080 }
        r9 = r8.m;	 Catch:{ all -> 0x0080 }
        r0 = r8.n;	 Catch:{ all -> 0x0080 }
        r9.submit(r0);	 Catch:{ all -> 0x0080 }
        monitor-exit(r8);
        return r1;
        monitor-exit(r8);
        return r1;
        r9 = move-exception;
        monitor-exit(r8);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp.c(java.lang.String):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:67:0x0157 in {26, 27, 30, 36, 41, 46, 47, 49, 51, 55, 57, 58, 60, 63, 66} preds:[]
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
    private void d() {
        /*
        r12 = this;
        r0 = ", ";
        r1 = new yq;
        r2 = new java.io.FileInputStream;
        r3 = r12.e;
        r2.<init>(r3);
        r3 = defpackage.yr.a;
        r1.<init>(r2, r3);
        r2 = r1.a();	 Catch:{ all -> 0x0152 }
        r3 = r1.a();	 Catch:{ all -> 0x0152 }
        r4 = r1.a();	 Catch:{ all -> 0x0152 }
        r5 = r1.a();	 Catch:{ all -> 0x0152 }
        r6 = r1.a();	 Catch:{ all -> 0x0152 }
        r7 = "libcore.io.DiskLruCache";	 Catch:{ all -> 0x0152 }
        r7 = r7.equals(r2);	 Catch:{ all -> 0x0152 }
        if (r7 == 0) goto L_0x0127;	 Catch:{ all -> 0x0152 }
        r7 = "1";	 Catch:{ all -> 0x0152 }
        r7 = r7.equals(r3);	 Catch:{ all -> 0x0152 }
        if (r7 == 0) goto L_0x0127;	 Catch:{ all -> 0x0152 }
        r7 = 1;	 Catch:{ all -> 0x0152 }
        r8 = java.lang.Integer.toString(r7);	 Catch:{ all -> 0x0152 }
        r4 = r8.equals(r4);	 Catch:{ all -> 0x0152 }
        if (r4 == 0) goto L_0x0127;	 Catch:{ all -> 0x0152 }
        r4 = java.lang.Integer.toString(r7);	 Catch:{ all -> 0x0152 }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x0152 }
        if (r4 == 0) goto L_0x0127;	 Catch:{ all -> 0x0152 }
        r4 = "";	 Catch:{ all -> 0x0152 }
        r4 = r4.equals(r6);	 Catch:{ all -> 0x0152 }
        if (r4 == 0) goto L_0x0127;
        r0 = 0;
        r2 = 0;
        r3 = -1;
        r4 = r1.a();	 Catch:{ EOFException -> 0x00fa }
        r5 = 32;	 Catch:{ EOFException -> 0x00fa }
        r6 = r4.indexOf(r5);	 Catch:{ EOFException -> 0x00fa }
        r8 = "unexpected journal line: ";
        if (r6 == r3) goto L_0x00ec;
        r9 = r6 + 1;
        r5 = r4.indexOf(r5, r9);	 Catch:{ EOFException -> 0x00fa }
        if (r5 != r3) goto L_0x007f;	 Catch:{ EOFException -> 0x00fa }
        r9 = r4.substring(r9);	 Catch:{ EOFException -> 0x00fa }
        r10 = 6;	 Catch:{ EOFException -> 0x00fa }
        if (r6 != r10) goto L_0x0083;	 Catch:{ EOFException -> 0x00fa }
        r10 = "REMOVE";	 Catch:{ EOFException -> 0x00fa }
        r10 = r4.startsWith(r10);	 Catch:{ EOFException -> 0x00fa }
        if (r10 == 0) goto L_0x0083;	 Catch:{ EOFException -> 0x00fa }
        r4 = r12.k;	 Catch:{ EOFException -> 0x00fa }
        r4.remove(r9);	 Catch:{ EOFException -> 0x00fa }
        goto L_0x00da;	 Catch:{ EOFException -> 0x00fa }
        r9 = r4.substring(r9, r5);	 Catch:{ EOFException -> 0x00fa }
        r10 = r12.k;	 Catch:{ EOFException -> 0x00fa }
        r10 = r10.get(r9);	 Catch:{ EOFException -> 0x00fa }
        r10 = (defpackage.yp.c) r10;	 Catch:{ EOFException -> 0x00fa }
        if (r10 != 0) goto L_0x0097;	 Catch:{ EOFException -> 0x00fa }
        r10 = new yp$c;	 Catch:{ EOFException -> 0x00fa }
        r10.<init>(r12, r9, r0);	 Catch:{ EOFException -> 0x00fa }
        r11 = r12.k;	 Catch:{ EOFException -> 0x00fa }
        r11.put(r9, r10);	 Catch:{ EOFException -> 0x00fa }
        r9 = 5;	 Catch:{ EOFException -> 0x00fa }
        if (r5 == r3) goto L_0x00b9;	 Catch:{ EOFException -> 0x00fa }
        if (r6 != r9) goto L_0x00b9;	 Catch:{ EOFException -> 0x00fa }
        r11 = "CLEAN";	 Catch:{ EOFException -> 0x00fa }
        r11 = r4.startsWith(r11);	 Catch:{ EOFException -> 0x00fa }
        if (r11 == 0) goto L_0x00b9;	 Catch:{ EOFException -> 0x00fa }
        r5 = r5 + 1;	 Catch:{ EOFException -> 0x00fa }
        r4 = r4.substring(r5);	 Catch:{ EOFException -> 0x00fa }
        r5 = " ";	 Catch:{ EOFException -> 0x00fa }
        r4 = r4.split(r5);	 Catch:{ EOFException -> 0x00fa }
        r10.e = r7;	 Catch:{ EOFException -> 0x00fa }
        r5 = 0;	 Catch:{ EOFException -> 0x00fa }
        r10.f = r5;	 Catch:{ EOFException -> 0x00fa }
        r10.a(r4);	 Catch:{ EOFException -> 0x00fa }
        goto L_0x00da;	 Catch:{ EOFException -> 0x00fa }
        if (r5 != r3) goto L_0x00cd;	 Catch:{ EOFException -> 0x00fa }
        if (r6 != r9) goto L_0x00cd;	 Catch:{ EOFException -> 0x00fa }
        r9 = "DIRTY";	 Catch:{ EOFException -> 0x00fa }
        r9 = r4.startsWith(r9);	 Catch:{ EOFException -> 0x00fa }
        if (r9 == 0) goto L_0x00cd;	 Catch:{ EOFException -> 0x00fa }
        r4 = new yp$b;	 Catch:{ EOFException -> 0x00fa }
        r4.<init>(r12, r10, r0);	 Catch:{ EOFException -> 0x00fa }
        r10.f = r4;	 Catch:{ EOFException -> 0x00fa }
        goto L_0x00da;	 Catch:{ EOFException -> 0x00fa }
        if (r5 != r3) goto L_0x00de;	 Catch:{ EOFException -> 0x00fa }
        r5 = 4;	 Catch:{ EOFException -> 0x00fa }
        if (r6 != r5) goto L_0x00de;	 Catch:{ EOFException -> 0x00fa }
        r5 = "READ";	 Catch:{ EOFException -> 0x00fa }
        r5 = r4.startsWith(r5);	 Catch:{ EOFException -> 0x00fa }
        if (r5 == 0) goto L_0x00de;	 Catch:{ EOFException -> 0x00fa }
        r2 = r2 + 1;	 Catch:{ EOFException -> 0x00fa }
        goto L_0x0053;	 Catch:{ EOFException -> 0x00fa }
        r5 = new java.io.IOException;	 Catch:{ EOFException -> 0x00fa }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ EOFException -> 0x00fa }
        r4 = r8.concat(r4);	 Catch:{ EOFException -> 0x00fa }
        r5.<init>(r4);	 Catch:{ EOFException -> 0x00fa }
        throw r5;	 Catch:{ EOFException -> 0x00fa }
        r5 = new java.io.IOException;	 Catch:{ EOFException -> 0x00fa }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ EOFException -> 0x00fa }
        r4 = r8.concat(r4);	 Catch:{ EOFException -> 0x00fa }
        r5.<init>(r4);	 Catch:{ EOFException -> 0x00fa }
        throw r5;	 Catch:{ EOFException -> 0x00fa }
    L_0x00fa:
        r4 = r12.k;	 Catch:{ all -> 0x0152 }
        r4 = r4.size();	 Catch:{ all -> 0x0152 }
        r2 = r2 - r4;	 Catch:{ all -> 0x0152 }
        r12.d = r2;	 Catch:{ all -> 0x0152 }
        r2 = r1.b;	 Catch:{ all -> 0x0152 }
        if (r2 != r3) goto L_0x0108;	 Catch:{ all -> 0x0152 }
        r0 = 1;	 Catch:{ all -> 0x0152 }
        if (r0 == 0) goto L_0x010e;	 Catch:{ all -> 0x0152 }
        r12.a();	 Catch:{ all -> 0x0152 }
        goto L_0x0123;	 Catch:{ all -> 0x0152 }
        r0 = new java.io.BufferedWriter;	 Catch:{ all -> 0x0152 }
        r2 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x0152 }
        r3 = new java.io.FileOutputStream;	 Catch:{ all -> 0x0152 }
        r4 = r12.e;	 Catch:{ all -> 0x0152 }
        r3.<init>(r4, r7);	 Catch:{ all -> 0x0152 }
        r4 = defpackage.yr.a;	 Catch:{ all -> 0x0152 }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x0152 }
        r0.<init>(r2);	 Catch:{ all -> 0x0152 }
        r12.c = r0;	 Catch:{ all -> 0x0152 }
        defpackage.yr.a(r1);
        return;
        r4 = new java.io.IOException;	 Catch:{ all -> 0x0152 }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0152 }
        r8 = "unexpected journal header: [";	 Catch:{ all -> 0x0152 }
        r7.<init>(r8);	 Catch:{ all -> 0x0152 }
        r7.append(r2);	 Catch:{ all -> 0x0152 }
        r7.append(r0);	 Catch:{ all -> 0x0152 }
        r7.append(r3);	 Catch:{ all -> 0x0152 }
        r7.append(r0);	 Catch:{ all -> 0x0152 }
        r7.append(r5);	 Catch:{ all -> 0x0152 }
        r7.append(r0);	 Catch:{ all -> 0x0152 }
        r7.append(r6);	 Catch:{ all -> 0x0152 }
        r0 = "]";	 Catch:{ all -> 0x0152 }
        r7.append(r0);	 Catch:{ all -> 0x0152 }
        r0 = r7.toString();	 Catch:{ all -> 0x0152 }
        r4.<init>(r0);	 Catch:{ all -> 0x0152 }
        throw r4;	 Catch:{ all -> 0x0152 }
        r0 = move-exception;
        defpackage.yr.a(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp.d():void");
    }

    private void e() {
        yp.a(this.f);
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i;
            if (cVar.f == null) {
                for (i = 0; i <= 0; i++) {
                    this.j += cVar.b[0];
                }
            } else {
                cVar.f = null;
                for (i = 0; i <= 0; i++) {
                    yp.a(cVar.c[0]);
                    yp.a(cVar.d[0]);
                }
                it.remove();
            }
        }
    }

    private void f() {
        if (this.c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x006b in {6, 11, 18, 19, 23, 26, 29} preds:[]
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
    public final synchronized defpackage.yp.d a(java.lang.String r10) {
        /*
        r9 = this;
        monitor-enter(r9);
        r9.f();	 Catch:{ all -> 0x0068 }
        r0 = r9.k;	 Catch:{ all -> 0x0068 }
        r0 = r0.get(r10);	 Catch:{ all -> 0x0068 }
        r0 = (defpackage.yp.c) r0;	 Catch:{ all -> 0x0068 }
        r1 = 0;
        if (r0 != 0) goto L_0x0011;
        monitor-exit(r9);
        return r1;
        r2 = r0.e;	 Catch:{ all -> 0x0068 }
        if (r2 != 0) goto L_0x0017;
        monitor-exit(r9);
        return r1;
        r2 = r0.c;	 Catch:{ all -> 0x0068 }
        r3 = r2.length;	 Catch:{ all -> 0x0068 }
        r4 = 0;	 Catch:{ all -> 0x0068 }
        if (r4 >= r3) goto L_0x002a;	 Catch:{ all -> 0x0068 }
        r5 = r2[r4];	 Catch:{ all -> 0x0068 }
        r5 = r5.exists();	 Catch:{ all -> 0x0068 }
        if (r5 != 0) goto L_0x0027;
        monitor-exit(r9);
        return r1;
        r4 = r4 + 1;
        goto L_0x001b;
        r1 = r9.d;	 Catch:{ all -> 0x0068 }
        r1 = r1 + 1;	 Catch:{ all -> 0x0068 }
        r9.d = r1;	 Catch:{ all -> 0x0068 }
        r1 = r9.c;	 Catch:{ all -> 0x0068 }
        r2 = "READ";	 Catch:{ all -> 0x0068 }
        r1.append(r2);	 Catch:{ all -> 0x0068 }
        r1 = r9.c;	 Catch:{ all -> 0x0068 }
        r2 = 32;	 Catch:{ all -> 0x0068 }
        r1.append(r2);	 Catch:{ all -> 0x0068 }
        r1 = r9.c;	 Catch:{ all -> 0x0068 }
        r1.append(r10);	 Catch:{ all -> 0x0068 }
        r1 = r9.c;	 Catch:{ all -> 0x0068 }
        r2 = 10;	 Catch:{ all -> 0x0068 }
        r1.append(r2);	 Catch:{ all -> 0x0068 }
        r1 = r9.b();	 Catch:{ all -> 0x0068 }
        if (r1 == 0) goto L_0x0057;	 Catch:{ all -> 0x0068 }
        r1 = r9.m;	 Catch:{ all -> 0x0068 }
        r2 = r9.n;	 Catch:{ all -> 0x0068 }
        r1.submit(r2);	 Catch:{ all -> 0x0068 }
        r8 = new yp$d;	 Catch:{ all -> 0x0068 }
        r3 = r0.g;	 Catch:{ all -> 0x0068 }
        r5 = r0.c;	 Catch:{ all -> 0x0068 }
        r6 = r0.b;	 Catch:{ all -> 0x0068 }
        r7 = 0;	 Catch:{ all -> 0x0068 }
        r0 = r8;	 Catch:{ all -> 0x0068 }
        r1 = r9;	 Catch:{ all -> 0x0068 }
        r2 = r10;	 Catch:{ all -> 0x0068 }
        r0.<init>(r1, r2, r3, r5, r6, r7);	 Catch:{ all -> 0x0068 }
        monitor-exit(r9);
        return r8;
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp.a(java.lang.String):yp$d");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x00db in {4, 12, 13, 15, 19, 22, 26, 29} preds:[]
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
    final synchronized void a() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.c;	 Catch:{ all -> 0x00d8 }
        if (r0 == 0) goto L_0x000a;	 Catch:{ all -> 0x00d8 }
        r0 = r7.c;	 Catch:{ all -> 0x00d8 }
        r0.close();	 Catch:{ all -> 0x00d8 }
        r0 = new java.io.BufferedWriter;	 Catch:{ all -> 0x00d8 }
        r1 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x00d8 }
        r2 = new java.io.FileOutputStream;	 Catch:{ all -> 0x00d8 }
        r3 = r7.f;	 Catch:{ all -> 0x00d8 }
        r2.<init>(r3);	 Catch:{ all -> 0x00d8 }
        r3 = defpackage.yr.a;	 Catch:{ all -> 0x00d8 }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x00d8 }
        r0.<init>(r1);	 Catch:{ all -> 0x00d8 }
        r1 = "libcore.io.DiskLruCache";	 Catch:{ all -> 0x00d3 }
        r0.write(r1);	 Catch:{ all -> 0x00d3 }
        r1 = "\n";	 Catch:{ all -> 0x00d3 }
        r0.write(r1);	 Catch:{ all -> 0x00d3 }
        r1 = "1";	 Catch:{ all -> 0x00d3 }
        r0.write(r1);	 Catch:{ all -> 0x00d3 }
        r1 = "\n";	 Catch:{ all -> 0x00d3 }
        r0.write(r1);	 Catch:{ all -> 0x00d3 }
        r1 = 1;	 Catch:{ all -> 0x00d3 }
        r2 = java.lang.Integer.toString(r1);	 Catch:{ all -> 0x00d3 }
        r0.write(r2);	 Catch:{ all -> 0x00d3 }
        r2 = "\n";	 Catch:{ all -> 0x00d3 }
        r0.write(r2);	 Catch:{ all -> 0x00d3 }
        r2 = java.lang.Integer.toString(r1);	 Catch:{ all -> 0x00d3 }
        r0.write(r2);	 Catch:{ all -> 0x00d3 }
        r2 = "\n";	 Catch:{ all -> 0x00d3 }
        r0.write(r2);	 Catch:{ all -> 0x00d3 }
        r2 = "\n";	 Catch:{ all -> 0x00d3 }
        r0.write(r2);	 Catch:{ all -> 0x00d3 }
        r2 = r7.k;	 Catch:{ all -> 0x00d3 }
        r2 = r2.values();	 Catch:{ all -> 0x00d3 }
        r2 = r2.iterator();	 Catch:{ all -> 0x00d3 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x00d3 }
        if (r3 == 0) goto L_0x009d;	 Catch:{ all -> 0x00d3 }
        r3 = r2.next();	 Catch:{ all -> 0x00d3 }
        r3 = (defpackage.yp.c) r3;	 Catch:{ all -> 0x00d3 }
        r4 = r3.f;	 Catch:{ all -> 0x00d3 }
        r5 = 10;	 Catch:{ all -> 0x00d3 }
        if (r4 == 0) goto L_0x0082;	 Catch:{ all -> 0x00d3 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d3 }
        r6 = "DIRTY ";	 Catch:{ all -> 0x00d3 }
        r4.<init>(r6);	 Catch:{ all -> 0x00d3 }
        r3 = r3.a;	 Catch:{ all -> 0x00d3 }
        r4.append(r3);	 Catch:{ all -> 0x00d3 }
        r4.append(r5);	 Catch:{ all -> 0x00d3 }
        r3 = r4.toString();	 Catch:{ all -> 0x00d3 }
        r0.write(r3);	 Catch:{ all -> 0x00d3 }
        goto L_0x0059;	 Catch:{ all -> 0x00d3 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d3 }
        r6 = "CLEAN ";	 Catch:{ all -> 0x00d3 }
        r4.<init>(r6);	 Catch:{ all -> 0x00d3 }
        r6 = r3.a;	 Catch:{ all -> 0x00d3 }
        r4.append(r6);	 Catch:{ all -> 0x00d3 }
        r3 = r3.a();	 Catch:{ all -> 0x00d3 }
        r4.append(r3);	 Catch:{ all -> 0x00d3 }
        r4.append(r5);	 Catch:{ all -> 0x00d3 }
        r3 = r4.toString();	 Catch:{ all -> 0x00d3 }
        goto L_0x007e;
        r0.close();	 Catch:{ all -> 0x00d8 }
        r0 = r7.e;	 Catch:{ all -> 0x00d8 }
        r0 = r0.exists();	 Catch:{ all -> 0x00d8 }
        if (r0 == 0) goto L_0x00af;	 Catch:{ all -> 0x00d8 }
        r0 = r7.e;	 Catch:{ all -> 0x00d8 }
        r2 = r7.g;	 Catch:{ all -> 0x00d8 }
        defpackage.yp.a(r0, r2, r1);	 Catch:{ all -> 0x00d8 }
        r0 = r7.f;	 Catch:{ all -> 0x00d8 }
        r2 = r7.e;	 Catch:{ all -> 0x00d8 }
        r3 = 0;	 Catch:{ all -> 0x00d8 }
        defpackage.yp.a(r0, r2, r3);	 Catch:{ all -> 0x00d8 }
        r0 = r7.g;	 Catch:{ all -> 0x00d8 }
        r0.delete();	 Catch:{ all -> 0x00d8 }
        r0 = new java.io.BufferedWriter;	 Catch:{ all -> 0x00d8 }
        r2 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x00d8 }
        r3 = new java.io.FileOutputStream;	 Catch:{ all -> 0x00d8 }
        r4 = r7.e;	 Catch:{ all -> 0x00d8 }
        r3.<init>(r4, r1);	 Catch:{ all -> 0x00d8 }
        r1 = defpackage.yr.a;	 Catch:{ all -> 0x00d8 }
        r2.<init>(r3, r1);	 Catch:{ all -> 0x00d8 }
        r0.<init>(r2);	 Catch:{ all -> 0x00d8 }
        r7.c = r0;	 Catch:{ all -> 0x00d8 }
        monitor-exit(r7);
        return;
        r1 = move-exception;
        r0.close();	 Catch:{ all -> 0x00d8 }
        throw r1;	 Catch:{ all -> 0x00d8 }
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp.a():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:49:0x00ee in {16, 17, 20, 27, 28, 29, 34, 35, 39, 40, 42, 45, 48} preds:[]
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
    public final synchronized void a(defpackage.yp.b r9, boolean r10) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r9.a;	 Catch:{ all -> 0x00eb }
        r1 = r0.f;	 Catch:{ all -> 0x00eb }
        if (r1 != r9) goto L_0x00e5;	 Catch:{ all -> 0x00eb }
        r1 = 0;	 Catch:{ all -> 0x00eb }
        if (r10 == 0) goto L_0x003a;	 Catch:{ all -> 0x00eb }
        r2 = r0.e;	 Catch:{ all -> 0x00eb }
        if (r2 != 0) goto L_0x003a;	 Catch:{ all -> 0x00eb }
        r2 = 0;	 Catch:{ all -> 0x00eb }
        if (r2 > 0) goto L_0x003a;	 Catch:{ all -> 0x00eb }
        r3 = r9.b;	 Catch:{ all -> 0x00eb }
        r3 = r3[r1];	 Catch:{ all -> 0x00eb }
        if (r3 == 0) goto L_0x0029;	 Catch:{ all -> 0x00eb }
        r3 = r0.d;	 Catch:{ all -> 0x00eb }
        r3 = r3[r1];	 Catch:{ all -> 0x00eb }
        r3 = r3.exists();	 Catch:{ all -> 0x00eb }
        if (r3 != 0) goto L_0x0026;	 Catch:{ all -> 0x00eb }
        r9.b();	 Catch:{ all -> 0x00eb }
        monitor-exit(r8);
        return;
        r2 = r2 + 1;
        goto L_0x000f;
        r9.b();	 Catch:{ all -> 0x00eb }
        r9 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00eb }
        r10 = "Newly created entry didn't create value for index ";	 Catch:{ all -> 0x00eb }
        r0 = "0";	 Catch:{ all -> 0x00eb }
        r10 = r10.concat(r0);	 Catch:{ all -> 0x00eb }
        r9.<init>(r10);	 Catch:{ all -> 0x00eb }
        throw r9;	 Catch:{ all -> 0x00eb }
        r9 = 0;	 Catch:{ all -> 0x00eb }
        if (r9 > 0) goto L_0x0069;	 Catch:{ all -> 0x00eb }
        r2 = r0.d;	 Catch:{ all -> 0x00eb }
        r2 = r2[r1];	 Catch:{ all -> 0x00eb }
        if (r10 == 0) goto L_0x0063;	 Catch:{ all -> 0x00eb }
        r3 = r2.exists();	 Catch:{ all -> 0x00eb }
        if (r3 == 0) goto L_0x0066;	 Catch:{ all -> 0x00eb }
        r3 = r0.c;	 Catch:{ all -> 0x00eb }
        r3 = r3[r1];	 Catch:{ all -> 0x00eb }
        r2.renameTo(r3);	 Catch:{ all -> 0x00eb }
        r2 = r0.b;	 Catch:{ all -> 0x00eb }
        r4 = r2[r1];	 Catch:{ all -> 0x00eb }
        r2 = r3.length();	 Catch:{ all -> 0x00eb }
        r6 = r0.b;	 Catch:{ all -> 0x00eb }
        r6[r1] = r2;	 Catch:{ all -> 0x00eb }
        r6 = r8.j;	 Catch:{ all -> 0x00eb }
        r6 = r6 - r4;	 Catch:{ all -> 0x00eb }
        r6 = r6 + r2;	 Catch:{ all -> 0x00eb }
        r8.j = r6;	 Catch:{ all -> 0x00eb }
        goto L_0x0066;	 Catch:{ all -> 0x00eb }
        defpackage.yp.a(r2);	 Catch:{ all -> 0x00eb }
        r9 = r9 + 1;	 Catch:{ all -> 0x00eb }
        goto L_0x003b;	 Catch:{ all -> 0x00eb }
        r9 = r8.d;	 Catch:{ all -> 0x00eb }
        r1 = 1;	 Catch:{ all -> 0x00eb }
        r9 = r9 + r1;	 Catch:{ all -> 0x00eb }
        r8.d = r9;	 Catch:{ all -> 0x00eb }
        r9 = 0;	 Catch:{ all -> 0x00eb }
        r0.f = r9;	 Catch:{ all -> 0x00eb }
        r9 = r0.e;	 Catch:{ all -> 0x00eb }
        r9 = r9 | r10;	 Catch:{ all -> 0x00eb }
        r2 = 10;	 Catch:{ all -> 0x00eb }
        r3 = 32;	 Catch:{ all -> 0x00eb }
        if (r9 == 0) goto L_0x00aa;	 Catch:{ all -> 0x00eb }
        r0.e = r1;	 Catch:{ all -> 0x00eb }
        r9 = r8.c;	 Catch:{ all -> 0x00eb }
        r1 = "CLEAN";	 Catch:{ all -> 0x00eb }
        r9.append(r1);	 Catch:{ all -> 0x00eb }
        r9 = r8.c;	 Catch:{ all -> 0x00eb }
        r9.append(r3);	 Catch:{ all -> 0x00eb }
        r9 = r8.c;	 Catch:{ all -> 0x00eb }
        r1 = r0.a;	 Catch:{ all -> 0x00eb }
        r9.append(r1);	 Catch:{ all -> 0x00eb }
        r9 = r8.c;	 Catch:{ all -> 0x00eb }
        r1 = r0.a();	 Catch:{ all -> 0x00eb }
        r9.append(r1);	 Catch:{ all -> 0x00eb }
        r9 = r8.c;	 Catch:{ all -> 0x00eb }
        r9.append(r2);	 Catch:{ all -> 0x00eb }
        if (r10 == 0) goto L_0x00c9;	 Catch:{ all -> 0x00eb }
        r9 = r8.l;	 Catch:{ all -> 0x00eb }
        r1 = 1;	 Catch:{ all -> 0x00eb }
        r1 = r1 + r9;	 Catch:{ all -> 0x00eb }
        r8.l = r1;	 Catch:{ all -> 0x00eb }
        r0.g = r9;	 Catch:{ all -> 0x00eb }
        goto L_0x00c9;	 Catch:{ all -> 0x00eb }
        r9 = r8.k;	 Catch:{ all -> 0x00eb }
        r10 = r0.a;	 Catch:{ all -> 0x00eb }
        r9.remove(r10);	 Catch:{ all -> 0x00eb }
        r9 = r8.c;	 Catch:{ all -> 0x00eb }
        r10 = "REMOVE";	 Catch:{ all -> 0x00eb }
        r9.append(r10);	 Catch:{ all -> 0x00eb }
        r9 = r8.c;	 Catch:{ all -> 0x00eb }
        r9.append(r3);	 Catch:{ all -> 0x00eb }
        r9 = r8.c;	 Catch:{ all -> 0x00eb }
        r10 = r0.a;	 Catch:{ all -> 0x00eb }
        r9.append(r10);	 Catch:{ all -> 0x00eb }
        r9 = r8.c;	 Catch:{ all -> 0x00eb }
        r9.append(r2);	 Catch:{ all -> 0x00eb }
        r9 = r8.c;	 Catch:{ all -> 0x00eb }
        r9.flush();	 Catch:{ all -> 0x00eb }
        r9 = r8.j;	 Catch:{ all -> 0x00eb }
        r0 = r8.i;	 Catch:{ all -> 0x00eb }
        r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));	 Catch:{ all -> 0x00eb }
        if (r2 > 0) goto L_0x00dc;	 Catch:{ all -> 0x00eb }
        r9 = r8.b();	 Catch:{ all -> 0x00eb }
        if (r9 == 0) goto L_0x00e3;	 Catch:{ all -> 0x00eb }
        r9 = r8.m;	 Catch:{ all -> 0x00eb }
        r10 = r8.n;	 Catch:{ all -> 0x00eb }
        r9.submit(r10);	 Catch:{ all -> 0x00eb }
        monitor-exit(r8);
        return;
        r9 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00eb }
        r9.<init>();	 Catch:{ all -> 0x00eb }
        throw r9;	 Catch:{ all -> 0x00eb }
        r9 = move-exception;
        monitor-exit(r8);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp.a(yp$b, boolean):void");
    }

    public final synchronized b b(String str) {
        f();
        c cVar = (c) this.k.get(str);
        if (cVar == null) {
            cVar = new c(this, str, (byte) 0);
            this.k.put(str, cVar);
        } else if (cVar.f != null) {
            return null;
        }
        b bVar = new b(this, cVar, (byte) 0);
        cVar.f = bVar;
        this.c.append("DIRTY");
        this.c.append(' ');
        this.c.append(str);
        this.c.append(10);
        this.c.flush();
        return bVar;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        int i = this.d;
        return i >= MultiSnapThumbnailView.MIN_SEGMENT_DURATION_MS && i >= this.k.size();
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        while (this.j > this.i) {
            c((String) ((Entry) this.k.entrySet().iterator().next()).getKey());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x003c in {5, 12, 15, 18} preds:[]
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
    public final synchronized void close() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.c;	 Catch:{ all -> 0x0039 }
        if (r0 != 0) goto L_0x0007;
        monitor-exit(r3);
        return;
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0039 }
        r1 = r3.k;	 Catch:{ all -> 0x0039 }
        r1 = r1.values();	 Catch:{ all -> 0x0039 }
        r0.<init>(r1);	 Catch:{ all -> 0x0039 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0039 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0039 }
        if (r1 == 0) goto L_0x002c;	 Catch:{ all -> 0x0039 }
        r1 = r0.next();	 Catch:{ all -> 0x0039 }
        r1 = (defpackage.yp.c) r1;	 Catch:{ all -> 0x0039 }
        r2 = r1.f;	 Catch:{ all -> 0x0039 }
        if (r2 == 0) goto L_0x0016;	 Catch:{ all -> 0x0039 }
        r1 = r1.f;	 Catch:{ all -> 0x0039 }
        r1.b();	 Catch:{ all -> 0x0039 }
        goto L_0x0016;	 Catch:{ all -> 0x0039 }
        r3.c();	 Catch:{ all -> 0x0039 }
        r0 = r3.c;	 Catch:{ all -> 0x0039 }
        r0.close();	 Catch:{ all -> 0x0039 }
        r0 = 0;	 Catch:{ all -> 0x0039 }
        r3.c = r0;	 Catch:{ all -> 0x0039 }
        monitor-exit(r3);
        return;
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp.close():void");
    }
}
