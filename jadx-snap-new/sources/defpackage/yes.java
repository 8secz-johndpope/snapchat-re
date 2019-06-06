package defpackage;

import android.content.res.AssetFileDescriptor;
import android.util.SparseBooleanArray;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: yes */
public final class yes implements Closeable {
    static final Charset a = Charset.forName("US-ASCII");
    static final Charset b = Charset.forName("UTF-8");
    private static Pattern g = Pattern.compile("[\\.~a-zA-Z0-9_-]{1,120}");
    public final File c;
    public yew d = null;
    long e;
    final AtomicBoolean f = new AtomicBoolean(false);
    private final int h;
    private long i = 0;
    private ExecutorService j;
    private final Runnable k = new 1();
    private a l;
    private ihh m;
    private yex n;
    private Set<yex> o;

    /* renamed from: yes$a */
    public interface a {
        void a(String str, boolean z);

        boolean a(String str);

        void b(String str);
    }

    /* renamed from: yes$1 */
    class 1 implements Runnable {
        1() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0042 in {6, 11, 13, 17, 18, 21, 24} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void run() {
            /*
            r5 = this;
            r0 = defpackage.yes.this;
            monitor-enter(r0);
            r1 = defpackage.yes.this;	 Catch:{ all -> 0x003f }
            r1 = r1.d;	 Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x000b;	 Catch:{ all -> 0x003f }
            monitor-exit(r0);	 Catch:{ all -> 0x003f }
            return;
            r1 = 0;
            r2 = defpackage.yes.this;	 Catch:{ Exception -> 0x0038, all -> 0x002f }
            r3 = defpackage.yes.this;	 Catch:{ Exception -> 0x0038, all -> 0x002f }
            r3 = r3.e;	 Catch:{ Exception -> 0x0038, all -> 0x002f }
            r2.a(r3);	 Catch:{ Exception -> 0x0038, all -> 0x002f }
            r2 = defpackage.yes.this;	 Catch:{ Exception -> 0x0038, all -> 0x002f }
            r2 = r2.d;	 Catch:{ Exception -> 0x0038, all -> 0x002f }
            r2 = r2.m();	 Catch:{ Exception -> 0x0038, all -> 0x002f }
            if (r2 == 0) goto L_0x0027;	 Catch:{ Exception -> 0x0038, all -> 0x002f }
            r2 = defpackage.yes.this;	 Catch:{ Exception -> 0x0038, all -> 0x002f }
            r2 = r2.d;	 Catch:{ Exception -> 0x0038, all -> 0x002f }
            r3 = 0;	 Catch:{ Exception -> 0x0038, all -> 0x002f }
            r2.a(r3);	 Catch:{ Exception -> 0x0038, all -> 0x002f }
            r2 = defpackage.yes.this;	 Catch:{ all -> 0x003f }
            r2 = r2.f;	 Catch:{ all -> 0x003f }
            r2.set(r1);	 Catch:{ all -> 0x003f }
            goto L_0x003d;	 Catch:{ all -> 0x003f }
            r2 = move-exception;	 Catch:{ all -> 0x003f }
            r3 = defpackage.yes.this;	 Catch:{ all -> 0x003f }
            r3 = r3.f;	 Catch:{ all -> 0x003f }
            r3.set(r1);	 Catch:{ all -> 0x003f }
            throw r2;	 Catch:{ all -> 0x003f }
            r2 = defpackage.yes.this;	 Catch:{ all -> 0x003f }
            r2 = r2.f;	 Catch:{ all -> 0x003f }
            goto L_0x002b;	 Catch:{ all -> 0x003f }
            monitor-exit(r0);	 Catch:{ all -> 0x003f }
            return;	 Catch:{ all -> 0x003f }
            r1 = move-exception;	 Catch:{ all -> 0x003f }
            monitor-exit(r0);	 Catch:{ all -> 0x003f }
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yes$1.run():void");
        }
    }

    /* renamed from: yes$b */
    public class b {
        final yep a;
        final SparseBooleanArray b;
        long c;
        private boolean d;

        private b(yep yep) {
            this.c = 0;
            this.a = yep;
            this.b = yep.b() ? null : new SparseBooleanArray();
        }

        /* synthetic */ b(yes yes, yep yep, byte b) {
            this(yep);
        }

        private AssetFileDescriptor i() {
            synchronized (yes.this) {
                if (this.a.f != null) {
                    throw new IllegalStateException();
                } else if (this.a.b()) {
                    AssetFileDescriptor c = yev.c(yes.a(yes.this.c, this.a.a, 0));
                    return c;
                } else {
                    return null;
                }
            }
        }

        @Deprecated
        private File j() {
            synchronized (yes.this) {
                if (this.a.f != null) {
                    throw new IllegalStateException();
                } else if (this.a.b()) {
                    File a = yes.a(yes.this.c, this.a.a, 0);
                    return a;
                } else {
                    return null;
                }
            }
        }

        @Deprecated
        private File k() {
            File b;
            synchronized (yes.this) {
                if (this.a.f == this) {
                    if (!this.a.b()) {
                        this.b.put(0, true);
                    }
                    b = yes.b(yes.this.c, this.a.a, 0);
                } else {
                    throw new IllegalStateException();
                }
            }
            return b;
        }

        public final AssetFileDescriptor a() {
            return i();
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0029 */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:5|(1:7)|8|9|10|11|12|13) */
        public final java.io.FileOutputStream a(int r4) {
            /*
            r3 = this;
            r0 = defpackage.yes.this;
            monitor-enter(r0);
            r1 = r3.a;	 Catch:{ all -> 0x003d }
            r1 = r1.f;	 Catch:{ all -> 0x003d }
            if (r1 != r3) goto L_0x0037;
        L_0x0009:
            r1 = r3.a;	 Catch:{ all -> 0x003d }
            r1 = r1.b();	 Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x0017;
        L_0x0011:
            r1 = r3.b;	 Catch:{ all -> 0x003d }
            r2 = 1;
            r1.put(r4, r2);	 Catch:{ all -> 0x003d }
        L_0x0017:
            r1 = defpackage.yes.this;	 Catch:{ all -> 0x003d }
            r1 = r1.c;	 Catch:{ all -> 0x003d }
            r2 = r3.a;	 Catch:{ all -> 0x003d }
            r2 = r2.a;	 Catch:{ all -> 0x003d }
            r4 = defpackage.yes.b(r1, r2, r4);	 Catch:{ all -> 0x003d }
            r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0029 }
            r1.<init>(r4);	 Catch:{ FileNotFoundException -> 0x0029 }
            goto L_0x0035;
        L_0x0029:
            r1 = defpackage.yes.this;	 Catch:{ all -> 0x003d }
            r1 = r1.c;	 Catch:{ all -> 0x003d }
            r1.mkdirs();	 Catch:{ all -> 0x003d }
            r1 = new java.io.FileOutputStream;	 Catch:{ all -> 0x003d }
            r1.<init>(r4);	 Catch:{ all -> 0x003d }
        L_0x0035:
            monitor-exit(r0);	 Catch:{ all -> 0x003d }
            return r1;
        L_0x0037:
            r4 = new java.io.IOException;	 Catch:{ all -> 0x003d }
            r4.<init>();	 Catch:{ all -> 0x003d }
            throw r4;	 Catch:{ all -> 0x003d }
        L_0x003d:
            r4 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x003d }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yes$b.a(int):java.io.FileOutputStream");
        }

        public final void a(long j) {
            this.c = j;
        }

        public final void a(String str) {
            Throwable th;
            Closeable closeable = null;
            try {
                Closeable outputStreamWriter = new OutputStreamWriter(a(0), yes.b);
                try {
                    outputStreamWriter.write(str);
                    yev.a(outputStreamWriter);
                } catch (Throwable th2) {
                    th = th2;
                    closeable = outputStreamWriter;
                    yev.a(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                yev.a(closeable);
                throw th;
            }
        }

        @Deprecated
        public final File b() {
            return j();
        }

        @Deprecated
        public final File c() {
            return k();
        }

        public final FileOutputStream d() {
            return a(0);
        }

        public final void e() {
            yes.this.a(this, true);
            yes.this.a();
            this.d = true;
        }

        public final void f() {
            yes.this.a(this, true);
            yes.this.a(this.a.a);
            yes.this.a();
            this.d = true;
        }

        public final void g() {
            yes.this.a(this, false);
            yes.this.a();
        }

        public final void h() {
            if (!this.d) {
                try {
                    g();
                } catch (IOException | IllegalStateException unused) {
                }
            }
        }
    }

    public yes(File file, long j, ExecutorService executorService, a aVar, ihh ihh, yex yex, Set<yex> set) {
        this.c = file;
        this.h = 1;
        this.e = j;
        this.j = executorService;
        this.l = aVar;
        this.m = ihh;
        this.n = yex;
        this.o = set;
    }

    public static File a(File file, String str, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".");
        stringBuilder.append(i);
        return new File(file, stringBuilder.toString());
    }

    private File a(yep yep, int i) {
        File file = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(yep.a);
        stringBuilder.append(".");
        stringBuilder.append(i);
        return new File(file, stringBuilder.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0022 in {4, 7, 10} preds:[]
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
    static java.lang.String a(java.io.Reader r4) {
        /*
        r0 = new java.io.StringWriter;	 Catch:{ all -> 0x001d }
        r0.<init>();	 Catch:{ all -> 0x001d }
        r1 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ all -> 0x001d }
        r1 = new char[r1];	 Catch:{ all -> 0x001d }
        r2 = r4.read(r1);	 Catch:{ all -> 0x001d }
        r3 = -1;	 Catch:{ all -> 0x001d }
        if (r2 == r3) goto L_0x0015;	 Catch:{ all -> 0x001d }
        r3 = 0;	 Catch:{ all -> 0x001d }
        r0.write(r1, r3, r2);	 Catch:{ all -> 0x001d }
        goto L_0x0009;	 Catch:{ all -> 0x001d }
        r0 = r0.toString();	 Catch:{ all -> 0x001d }
        r4.close();
        return r0;
        r0 = move-exception;
        r4.close();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yes.a(java.io.Reader):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x002b in {7, 10, 13} preds:[]
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
    private synchronized java.util.Set<java.lang.String> a(java.util.Set<java.lang.String> r4, long r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r3.d();	 Catch:{ all -> 0x0028 }
        r0 = new java.util.HashSet;	 Catch:{ all -> 0x0028 }
        r0.<init>();	 Catch:{ all -> 0x0028 }
        r4 = r4.iterator();	 Catch:{ all -> 0x0028 }
        r1 = r4.hasNext();	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x0023;	 Catch:{ all -> 0x0028 }
        r1 = r4.next();	 Catch:{ all -> 0x0028 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0028 }
        r2 = r3.b(r1, r5);	 Catch:{ all -> 0x0028 }
        if (r2 == 0) goto L_0x000d;	 Catch:{ all -> 0x0028 }
        r0.add(r1);	 Catch:{ all -> 0x0028 }
        goto L_0x000d;	 Catch:{ all -> 0x0028 }
        r3.a();	 Catch:{ all -> 0x0028 }
        monitor-exit(r3);
        return r0;
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yes.a(java.util.Set, long):java.util.Set");
    }

    private void a(String str, yep yep) {
        a aVar;
        boolean z;
        if (yep != null) {
            yep.i = this.m.a();
            aVar = this.l;
            z = true;
        } else {
            aVar = this.l;
            z = false;
        }
        aVar.a(str, z);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x005a in {6, 11, 17, 25, 27, 28, 32, 35} preds:[]
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
    private synchronized boolean a(java.lang.String r3, boolean r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r2.d();	 Catch:{ all -> 0x0057 }
        defpackage.yes.i(r3);	 Catch:{ all -> 0x0057 }
        r0 = r2.d;	 Catch:{ all -> 0x0057 }
        r3 = r0.a(r3);	 Catch:{ all -> 0x0057 }
        r0 = 0;
        if (r3 != 0) goto L_0x0012;
        monitor-exit(r2);
        return r0;
        r1 = r3.f;	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x0018;
        monitor-exit(r2);
        return r0;
        r1 = r3.e;	 Catch:{ all -> 0x0057 }
        if (r1 <= 0) goto L_0x0020;
        if (r4 != 0) goto L_0x0020;
        monitor-exit(r2);
        return r0;
        r4 = r3.b;	 Catch:{ all -> 0x0057 }
        if (r0 >= r4) goto L_0x004c;	 Catch:{ all -> 0x0057 }
        r4 = r2.c;	 Catch:{ all -> 0x0057 }
        r1 = r3.a;	 Catch:{ all -> 0x0057 }
        r4 = defpackage.yes.a(r4, r1, r0);	 Catch:{ all -> 0x0057 }
        r1 = r4.exists();	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x0049;	 Catch:{ all -> 0x0057 }
        r1 = r4.delete();	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x0039;	 Catch:{ all -> 0x0057 }
        goto L_0x0049;	 Catch:{ all -> 0x0057 }
        r3 = new java.io.IOException;	 Catch:{ all -> 0x0057 }
        r0 = "failed to delete ";	 Catch:{ all -> 0x0057 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x0057 }
        r4 = r0.concat(r4);	 Catch:{ all -> 0x0057 }
        r3.<init>(r4);	 Catch:{ all -> 0x0057 }
        throw r3;	 Catch:{ all -> 0x0057 }
        r0 = r0 + 1;	 Catch:{ all -> 0x0057 }
        goto L_0x0020;	 Catch:{ all -> 0x0057 }
        r4 = r2.d;	 Catch:{ all -> 0x0057 }
        r4.a(r3);	 Catch:{ all -> 0x0057 }
        r2.a();	 Catch:{ all -> 0x0057 }
        monitor-exit(r2);
        r3 = 1;
        return r3;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yes.a(java.lang.String, boolean):boolean");
    }

    private boolean a(yep yep) {
        return yep.e == 0 && this.l.a(yep.a);
    }

    public static File b(File file, String str, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".");
        stringBuilder.append(i);
        stringBuilder.append(".tmp");
        return new File(file, stringBuilder.toString());
    }

    private File b(yep yep, int i) {
        File file = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(yep.a);
        stringBuilder.append(".");
        stringBuilder.append(i);
        stringBuilder.append(".tmp");
        return new File(file, stringBuilder.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x0043 in {6, 9, 13, 16, 18, 21, 24, 26, 29} preds:[]
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
    private synchronized void b(java.lang.String r3, int r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r2.d();	 Catch:{ all -> 0x0040 }
        defpackage.yes.i(r3);	 Catch:{ all -> 0x0040 }
        r0 = r2.d;	 Catch:{ all -> 0x0040 }
        r3 = r0.a(r3);	 Catch:{ all -> 0x0040 }
        if (r3 == 0) goto L_0x003e;	 Catch:{ all -> 0x0040 }
        r0 = r3.b();	 Catch:{ all -> 0x0040 }
        if (r0 != 0) goto L_0x0016;	 Catch:{ all -> 0x0040 }
        goto L_0x003e;	 Catch:{ all -> 0x0040 }
        r0 = 1;	 Catch:{ all -> 0x0040 }
        if (r4 != r0) goto L_0x001f;	 Catch:{ all -> 0x0040 }
        r4 = r2.d;	 Catch:{ all -> 0x0040 }
        r4.c(r3);	 Catch:{ all -> 0x0040 }
        goto L_0x0039;	 Catch:{ all -> 0x0040 }
        r1 = r3.e;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x0025;
        monitor-exit(r2);
        return;
        r1 = 3;
        if (r4 != r1) goto L_0x002a;
        r4 = 0;
        goto L_0x002d;
        r4 = r3.e;	 Catch:{ all -> 0x0040 }
        r4 = r4 - r0;	 Catch:{ all -> 0x0040 }
        r0 = r3.e;	 Catch:{ all -> 0x0040 }
        if (r0 <= r4) goto L_0x0039;	 Catch:{ all -> 0x0040 }
        r1 = r2.d;	 Catch:{ all -> 0x0040 }
        r1.d(r3);	 Catch:{ all -> 0x0040 }
        r0 = r0 + -1;	 Catch:{ all -> 0x0040 }
        goto L_0x002f;	 Catch:{ all -> 0x0040 }
        r2.a();	 Catch:{ all -> 0x0040 }
        monitor-exit(r2);
        return;
        monitor-exit(r2);
        return;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yes.b(java.lang.String, int):void");
    }

    /* JADX WARNING: Missing block: B:20:0x0036, code skipped:
            return false;
     */
    private synchronized boolean b(java.lang.String r7, long r8) {
        /*
        r6 = this;
        monitor-enter(r6);
        defpackage.yes.i(r7);	 Catch:{ all -> 0x0037 }
        r0 = r6.d;	 Catch:{ all -> 0x0037 }
        r0 = r0.a(r7);	 Catch:{ all -> 0x0037 }
        r6.a(r7, r0);	 Catch:{ all -> 0x0037 }
        r1 = 0;
        if (r0 == 0) goto L_0x0035;
    L_0x0010:
        r2 = r0.b();	 Catch:{ all -> 0x0037 }
        if (r2 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0035;
    L_0x0017:
        r2 = r6.b(r0);	 Catch:{ all -> 0x0037 }
        if (r2 == 0) goto L_0x0028;
    L_0x001d:
        r2 = r6.a(r0);	 Catch:{ all -> 0x0037 }
        if (r2 == 0) goto L_0x0028;
    L_0x0023:
        r6.g(r7);	 Catch:{ all -> 0x0037 }
        monitor-exit(r6);
        return r1;
    L_0x0028:
        r1 = r6.d;	 Catch:{ all -> 0x0037 }
        r2 = r0.d;	 Catch:{ all -> 0x0037 }
        r0 = r1;
        r1 = r7;
        r4 = r8;
        r0.a(r1, r2, r4);	 Catch:{ all -> 0x0037 }
        r7 = 1;
        monitor-exit(r6);
        return r7;
    L_0x0035:
        monitor-exit(r6);
        return r1;
    L_0x0037:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yes.b(java.lang.String, long):boolean");
    }

    private boolean b(yep yep) {
        return yep.d > 0 && yep.d < this.m.a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x0062 in {6, 11, 19, 27, 28, 32, 35} preds:[]
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
    private synchronized defpackage.yeu h(java.lang.String r14) {
        /*
        r13 = this;
        monitor-enter(r13);
        r13.d();	 Catch:{ all -> 0x005f }
        defpackage.yes.i(r14);	 Catch:{ all -> 0x005f }
        r0 = r13.d;	 Catch:{ all -> 0x005f }
        r0 = r0.a(r14);	 Catch:{ all -> 0x005f }
        r13.a(r14, r0);	 Catch:{ all -> 0x005f }
        r1 = 0;
        if (r0 != 0) goto L_0x0015;
        monitor-exit(r13);
        return r1;
        r2 = r0.b();	 Catch:{ all -> 0x005f }
        if (r2 != 0) goto L_0x001d;
        monitor-exit(r13);
        return r1;
        r2 = r13.b(r0);	 Catch:{ all -> 0x005f }
        if (r2 == 0) goto L_0x002e;	 Catch:{ all -> 0x005f }
        r2 = r13.a(r0);	 Catch:{ all -> 0x005f }
        if (r2 == 0) goto L_0x002e;	 Catch:{ all -> 0x005f }
        r13.g(r14);	 Catch:{ all -> 0x005f }
        monitor-exit(r13);
        return r1;
        r2 = 0;
        r3 = r0.b;	 Catch:{ all -> 0x005f }
        if (r2 >= r3) goto L_0x0044;	 Catch:{ all -> 0x005f }
        r3 = r13.c;	 Catch:{ all -> 0x005f }
        r3 = defpackage.yes.a(r3, r14, r2);	 Catch:{ all -> 0x005f }
        r3 = r3.exists();	 Catch:{ all -> 0x005f }
        if (r3 != 0) goto L_0x0041;
        monitor-exit(r13);
        return r1;
        r2 = r2 + 1;
        goto L_0x002f;
        r1 = r13.d;	 Catch:{ all -> 0x005f }
        r3 = r0.d;	 Catch:{ all -> 0x005f }
        r5 = -1;	 Catch:{ all -> 0x005f }
        r2 = r14;	 Catch:{ all -> 0x005f }
        r1.a(r2, r3, r5);	 Catch:{ all -> 0x005f }
        r13.a();	 Catch:{ all -> 0x005f }
        r1 = new yeo;	 Catch:{ all -> 0x005f }
        r10 = r0.g;	 Catch:{ all -> 0x005f }
        r12 = r0.c;	 Catch:{ all -> 0x005f }
        r7 = r1;	 Catch:{ all -> 0x005f }
        r8 = r13;	 Catch:{ all -> 0x005f }
        r9 = r14;	 Catch:{ all -> 0x005f }
        r7.<init>(r8, r9, r10, r12);	 Catch:{ all -> 0x005f }
        monitor-exit(r13);
        return r1;
        r14 = move-exception;
        monitor-exit(r13);
        throw r14;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yes.h(java.lang.String):yeu");
    }

    private static void i(String str) {
        if (!g.matcher(str).matches()) {
            StringBuilder stringBuilder = new StringBuilder("keys must match regex [\\.~a-zA-Z0-9_-]{1,120}: \"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final synchronized b a(String str, int i) {
        d();
        yes.i(str);
        yep a = this.d.a(str);
        if (a != null && b(a) && a(a) && g(str)) {
            a = null;
        }
        if (a == null) {
            if (i == -2) {
                i = 0;
            }
            a = new yep(str, i);
        } else if (a.f != null) {
            return null;
        } else {
            if (i == -2) {
                i = 0;
            }
        }
        int i2 = a.e;
        if (a.b != i) {
            if (!a(str, true)) {
                return null;
            }
            a = new yep(str, i);
            a.e = i2;
        }
        b bVar = new b(this, a, (byte) 0);
        a.f = bVar;
        a.h = this.m.a();
        this.d.b(a);
        return bVar;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        Object obj;
        synchronized (this) {
            if (this.d.c() - this.d.d() <= this.e) {
                if (!this.d.m()) {
                    obj = null;
                }
            }
            obj = 1;
        }
        if (obj != null && this.f.compareAndSet(false, true)) {
            this.j.execute(this.k);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0042 in {14, 16, 19} preds:[]
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
    final synchronized void a(long r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.d;	 Catch:{ all -> 0x003f }
        r0 = r0.h();	 Catch:{ all -> 0x003f }
        r1 = r5.d;	 Catch:{ all -> 0x003f }
        r1 = r1.c();	 Catch:{ all -> 0x003f }
        r3 = r5.d;	 Catch:{ all -> 0x003f }
        r3 = r3.d();	 Catch:{ all -> 0x003f }
        r1 = r1 - r3;	 Catch:{ all -> 0x003f }
        r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));	 Catch:{ all -> 0x003f }
        if (r3 <= 0) goto L_0x003d;	 Catch:{ all -> 0x003f }
        r1 = r0.hasNext();	 Catch:{ all -> 0x003f }
        if (r1 == 0) goto L_0x003d;	 Catch:{ all -> 0x003f }
        r1 = r0.next();	 Catch:{ all -> 0x003f }
        r1 = (defpackage.yep) r1;	 Catch:{ all -> 0x003f }
        if (r1 == 0) goto L_0x0007;	 Catch:{ all -> 0x003f }
        r2 = r5.a(r1);	 Catch:{ all -> 0x003f }
        if (r2 == 0) goto L_0x0007;	 Catch:{ all -> 0x003f }
        r2 = r1.a;	 Catch:{ all -> 0x003f }
        r3 = 0;	 Catch:{ all -> 0x003f }
        r2 = r5.a(r2, r3);	 Catch:{ all -> 0x003f }
        if (r2 == 0) goto L_0x0007;	 Catch:{ all -> 0x003f }
        r2 = r5.l;	 Catch:{ all -> 0x003f }
        r1 = r1.a;	 Catch:{ all -> 0x003f }
        r2.b(r1);	 Catch:{ all -> 0x003f }
        goto L_0x0007;
        monitor-exit(r5);
        return;
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yes.a(long):void");
    }

    public final synchronized void a(String str) {
        b(str, 1);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:64:0x00da in {12, 13, 22, 23, 26, 28, 31, 33, 42, 43, 44, 48, 51, 55, 58, 60, 63} preds:[]
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
    final synchronized void a(defpackage.yes.b r8, boolean r9) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r8.a;	 Catch:{ all -> 0x00d7 }
        r1 = r0.f;	 Catch:{ all -> 0x00d7 }
        if (r1 == 0) goto L_0x00cf;	 Catch:{ all -> 0x00d7 }
        r1 = r0.f;	 Catch:{ all -> 0x00d7 }
        if (r1 != r8) goto L_0x00c7;	 Catch:{ all -> 0x00d7 }
        r1 = r0.a();	 Catch:{ all -> 0x00d7 }
        r3 = 0;	 Catch:{ all -> 0x00d7 }
        if (r9 == 0) goto L_0x0071;	 Catch:{ all -> 0x00d7 }
        r4 = r0.b();	 Catch:{ all -> 0x00d7 }
        if (r4 != 0) goto L_0x0071;	 Catch:{ all -> 0x00d7 }
        r4 = r8.a;	 Catch:{ all -> 0x00d7 }
        r4 = r4.b;	 Catch:{ all -> 0x00d7 }
        if (r4 != 0) goto L_0x0025;	 Catch:{ all -> 0x00d7 }
        r4 = r8.b;	 Catch:{ all -> 0x00d7 }
        r4 = r4.size();	 Catch:{ all -> 0x00d7 }
        goto L_0x0029;	 Catch:{ all -> 0x00d7 }
        r4 = r8.a;	 Catch:{ all -> 0x00d7 }
        r4 = r4.b;	 Catch:{ all -> 0x00d7 }
        r5 = 0;	 Catch:{ all -> 0x00d7 }
        if (r5 >= r4) goto L_0x0059;	 Catch:{ all -> 0x00d7 }
        r6 = r8.b;	 Catch:{ all -> 0x00d7 }
        r6 = r6.get(r5);	 Catch:{ all -> 0x00d7 }
        if (r6 == 0) goto L_0x0046;	 Catch:{ all -> 0x00d7 }
        r6 = r7.b(r0, r5);	 Catch:{ all -> 0x00d7 }
        r6 = r6.exists();	 Catch:{ all -> 0x00d7 }
        if (r6 != 0) goto L_0x0043;	 Catch:{ all -> 0x00d7 }
        r8.g();	 Catch:{ all -> 0x00d7 }
        monitor-exit(r7);
        return;
        r5 = r5 + 1;
        goto L_0x002a;
        r8.g();	 Catch:{ all -> 0x00d7 }
        r8 = new java.io.IOException;	 Catch:{ all -> 0x00d7 }
        r9 = "Newly created entry didn't create value for index ";	 Catch:{ all -> 0x00d7 }
        r0 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x00d7 }
        r9 = r9.concat(r0);	 Catch:{ all -> 0x00d7 }
        r8.<init>(r9);	 Catch:{ all -> 0x00d7 }
        throw r8;	 Catch:{ all -> 0x00d7 }
        if (r4 <= 0) goto L_0x0064;	 Catch:{ all -> 0x00d7 }
        r0.b = r4;	 Catch:{ all -> 0x00d7 }
        r4 = r0.b;	 Catch:{ all -> 0x00d7 }
        r4 = new long[r4];	 Catch:{ all -> 0x00d7 }
        r0.c = r4;	 Catch:{ all -> 0x00d7 }
        goto L_0x0071;	 Catch:{ all -> 0x00d7 }
        r4 = r0.b;	 Catch:{ all -> 0x00d7 }
        if (r4 <= 0) goto L_0x0069;	 Catch:{ all -> 0x00d7 }
        goto L_0x0071;	 Catch:{ all -> 0x00d7 }
        r8 = new java.io.IOException;	 Catch:{ all -> 0x00d7 }
        r9 = "Has no files written";	 Catch:{ all -> 0x00d7 }
        r8.<init>(r9);	 Catch:{ all -> 0x00d7 }
        throw r8;	 Catch:{ all -> 0x00d7 }
        r4 = r0.b;	 Catch:{ all -> 0x00d7 }
        if (r3 >= r4) goto L_0x00a0;	 Catch:{ all -> 0x00d7 }
        r4 = r7.c;	 Catch:{ all -> 0x00d7 }
        r5 = r0.a;	 Catch:{ all -> 0x00d7 }
        r4 = defpackage.yes.b(r4, r5, r3);	 Catch:{ all -> 0x00d7 }
        if (r9 == 0) goto L_0x009a;	 Catch:{ all -> 0x00d7 }
        r5 = r4.exists();	 Catch:{ all -> 0x00d7 }
        if (r5 == 0) goto L_0x009d;	 Catch:{ all -> 0x00d7 }
        r5 = r0.b;	 Catch:{ all -> 0x00d7 }
        if (r3 >= r5) goto L_0x009d;	 Catch:{ all -> 0x00d7 }
        r5 = r7.a(r0, r3);	 Catch:{ all -> 0x00d7 }
        r6 = 1;	 Catch:{ all -> 0x00d7 }
        defpackage.yev.a(r4, r5, r6);	 Catch:{ all -> 0x00d7 }
        r4 = r0.c;	 Catch:{ all -> 0x00d7 }
        r5 = r5.length();	 Catch:{ all -> 0x00d7 }
        r4[r3] = r5;	 Catch:{ all -> 0x00d7 }
        goto L_0x009d;	 Catch:{ all -> 0x00d7 }
        defpackage.yev.a(r4);	 Catch:{ all -> 0x00d7 }
        r3 = r3 + 1;	 Catch:{ all -> 0x00d7 }
        goto L_0x0071;	 Catch:{ all -> 0x00d7 }
        r3 = 0;	 Catch:{ all -> 0x00d7 }
        r0.f = r3;	 Catch:{ all -> 0x00d7 }
        r3 = r8.c;	 Catch:{ all -> 0x00d7 }
        r0.d = r3;	 Catch:{ all -> 0x00d7 }
        r8 = r0.b();	 Catch:{ all -> 0x00d7 }
        r8 = r8 | r9;	 Catch:{ all -> 0x00d7 }
        if (r8 == 0) goto L_0x00c0;	 Catch:{ all -> 0x00d7 }
        if (r9 == 0) goto L_0x00b9;	 Catch:{ all -> 0x00d7 }
        r8 = r7.i;	 Catch:{ all -> 0x00d7 }
        r3 = 1;	 Catch:{ all -> 0x00d7 }
        r3 = r3 + r8;	 Catch:{ all -> 0x00d7 }
        r7.i = r3;	 Catch:{ all -> 0x00d7 }
        r0.g = r8;	 Catch:{ all -> 0x00d7 }
        r8 = r7.d;	 Catch:{ all -> 0x00d7 }
        r8.a(r0, r1);	 Catch:{ all -> 0x00d7 }
        monitor-exit(r7);
        return;
        r8 = r7.d;	 Catch:{ all -> 0x00d7 }
        r8.a(r0);	 Catch:{ all -> 0x00d7 }
        monitor-exit(r7);
        return;
        r8 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00d7 }
        r9 = "Entry's current editor is not self!";	 Catch:{ all -> 0x00d7 }
        r8.<init>(r9);	 Catch:{ all -> 0x00d7 }
        throw r8;	 Catch:{ all -> 0x00d7 }
        r8 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00d7 }
        r9 = "Entry's current editor should not be null!";	 Catch:{ all -> 0x00d7 }
        r8.<init>(r9);	 Catch:{ all -> 0x00d7 }
        throw r8;	 Catch:{ all -> 0x00d7 }
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yes.a(yes$b, boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x009e in {9, 11, 12, 16, 18, 20, 27, 32, 34, 37} preds:[]
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
    public final synchronized void a(boolean r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.c;	 Catch:{ all -> 0x009b }
        r0.mkdirs();	 Catch:{ all -> 0x009b }
        r0 = 0;	 Catch:{ all -> 0x009b }
        r1 = r7.o;	 Catch:{ all -> 0x009b }
        r1 = r1.iterator();	 Catch:{ all -> 0x009b }
        r2 = r1.hasNext();	 Catch:{ all -> 0x009b }
        r3 = 0;	 Catch:{ all -> 0x009b }
        r4 = 1;	 Catch:{ all -> 0x009b }
        if (r2 == 0) goto L_0x0031;	 Catch:{ all -> 0x009b }
        r2 = r1.next();	 Catch:{ all -> 0x009b }
        r2 = (defpackage.yex) r2;	 Catch:{ all -> 0x009b }
        r5 = r7.c;	 Catch:{ IOException -> 0x002b }
        r6 = r7.m;	 Catch:{ IOException -> 0x002b }
        r0 = r2.a(r5, r4, r6);	 Catch:{ IOException -> 0x002b }
        r2 = r0.a(r8, r3);	 Catch:{ IOException -> 0x002b }
        if (r2 == 0) goto L_0x000d;
        r1 = 1;
        goto L_0x0032;
    L_0x002b:
        r2 = r7.c;	 Catch:{ all -> 0x009b }
        defpackage.yev.b(r2);	 Catch:{ all -> 0x009b }
        goto L_0x000d;	 Catch:{ all -> 0x009b }
        r1 = 0;	 Catch:{ all -> 0x009b }
        r2 = r7.n;	 Catch:{ all -> 0x009b }
        r5 = r7.c;	 Catch:{ all -> 0x009b }
        r6 = r7.m;	 Catch:{ all -> 0x009b }
        r2 = r2.a(r5, r4, r6);	 Catch:{ all -> 0x009b }
        r7.d = r2;	 Catch:{ all -> 0x009b }
        r2 = r7.d;	 Catch:{ IOException -> 0x0044 }
        r2.a(r8, r4);	 Catch:{ IOException -> 0x0044 }
        goto L_0x004e;
    L_0x0044:
        r2 = r7.c;	 Catch:{ all -> 0x009b }
        defpackage.yev.b(r2);	 Catch:{ all -> 0x009b }
        r2 = r7.d;	 Catch:{ all -> 0x009b }
        r2.a(r8, r4);	 Catch:{ all -> 0x009b }
        if (r1 == 0) goto L_0x005c;	 Catch:{ all -> 0x009b }
        r8 = r7.d;	 Catch:{ all -> 0x009b }
        r1 = r0.f();	 Catch:{ all -> 0x009b }
        r8.a(r1);	 Catch:{ all -> 0x009b }
        r0.n();	 Catch:{ all -> 0x009b }
        r8 = r7.d;	 Catch:{ all -> 0x009b }
        r8 = r8.i();	 Catch:{ all -> 0x009b }
        r8 = r8.iterator();	 Catch:{ all -> 0x009b }
        r0 = r8.hasNext();	 Catch:{ all -> 0x009b }
        if (r0 == 0) goto L_0x0099;	 Catch:{ all -> 0x009b }
        r0 = r8.next();	 Catch:{ all -> 0x009b }
        r0 = (defpackage.yep) r0;	 Catch:{ all -> 0x009b }
        r1 = r0.b();	 Catch:{ all -> 0x009b }
        if (r1 == 0) goto L_0x007e;	 Catch:{ all -> 0x009b }
        r1 = r7.a(r0);	 Catch:{ all -> 0x009b }
        if (r1 == 0) goto L_0x0066;	 Catch:{ all -> 0x009b }
        r1 = r7.d;	 Catch:{ all -> 0x009b }
        r1.a(r0);	 Catch:{ all -> 0x009b }
        r1 = 0;	 Catch:{ all -> 0x009b }
        r2 = r0.b;	 Catch:{ all -> 0x009b }
        if (r1 >= r2) goto L_0x0066;	 Catch:{ all -> 0x009b }
        r2 = r7.a(r0, r1);	 Catch:{ all -> 0x009b }
        defpackage.yev.a(r2);	 Catch:{ all -> 0x009b }
        r2 = r7.b(r0, r1);	 Catch:{ all -> 0x009b }
        defpackage.yev.a(r2);	 Catch:{ all -> 0x009b }
        r1 = r1 + 1;
        goto L_0x0084;
        monitor-exit(r7);
        return;
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yes.a(boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0017 in {4, 6, 7, 10} preds:[]
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
    public final synchronized boolean a(java.lang.String r1, long r2) {
        /*
        r0 = this;
        monitor-enter(r0);
        r1 = com.google.common.collect.ImmutableSet.of(r1);	 Catch:{ all -> 0x0014 }
        r1 = r0.a(r1, r2);	 Catch:{ all -> 0x0014 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0014 }
        if (r1 != 0) goto L_0x0012;
        r1 = 1;
        monitor-exit(r0);
        return r1;
        r1 = 0;
        goto L_0x0010;
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yes.a(java.lang.String, long):boolean");
    }

    public final synchronized long b() {
        return this.d.c();
    }

    public final synchronized void b(String str) {
        b(str, 2);
    }

    public final synchronized void c() {
        d();
        a(0);
        this.d.k();
    }

    public final synchronized void c(String str) {
        b(str, 3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0039 in {5, 12, 15, 18} preds:[]
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
    public final synchronized void close() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.d;	 Catch:{ all -> 0x0036 }
        if (r0 != 0) goto L_0x0007;
        monitor-exit(r3);
        return;
        r0 = r3.d;	 Catch:{ all -> 0x0036 }
        r0 = r0.e();	 Catch:{ all -> 0x0036 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0036 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0036 }
        if (r1 == 0) goto L_0x0027;	 Catch:{ all -> 0x0036 }
        r1 = r0.next();	 Catch:{ all -> 0x0036 }
        r1 = (defpackage.yep) r1;	 Catch:{ all -> 0x0036 }
        r2 = r1.f;	 Catch:{ all -> 0x0036 }
        if (r2 == 0) goto L_0x0011;	 Catch:{ all -> 0x0036 }
        r1 = r1.f;	 Catch:{ all -> 0x0036 }
        r1.g();	 Catch:{ all -> 0x0036 }
        goto L_0x0011;	 Catch:{ all -> 0x0036 }
        r0 = r3.e;	 Catch:{ all -> 0x0036 }
        r3.a(r0);	 Catch:{ all -> 0x0036 }
        r0 = r3.d;	 Catch:{ all -> 0x0036 }
        r0.j();	 Catch:{ all -> 0x0036 }
        r0 = 0;	 Catch:{ all -> 0x0036 }
        r3.d = r0;	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);
        return;
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yes.close():void");
    }

    public final synchronized void d() {
        if (this.d == null) {
            throw new IOException("cache is closed");
        }
    }

    /* JADX WARNING: Missing block: B:15:0x0021, code skipped:
            return false;
     */
    public final synchronized boolean d(java.lang.String r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r2.d();	 Catch:{ all -> 0x0022 }
        defpackage.yes.i(r3);	 Catch:{ all -> 0x0022 }
        r0 = r2.d;	 Catch:{ all -> 0x0022 }
        r3 = r0.a(r3);	 Catch:{ all -> 0x0022 }
        r0 = 0;
        if (r3 == 0) goto L_0x0020;
    L_0x0010:
        r1 = r3.b();	 Catch:{ all -> 0x0022 }
        if (r1 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0020;
    L_0x0017:
        r3 = r3.e;	 Catch:{ all -> 0x0022 }
        if (r3 <= 0) goto L_0x001e;
    L_0x001b:
        r3 = 1;
        monitor-exit(r2);
        return r3;
    L_0x001e:
        monitor-exit(r2);
        return r0;
    L_0x0020:
        monitor-exit(r2);
        return r0;
    L_0x0022:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yes.d(java.lang.String):boolean");
    }

    public final synchronized boolean e(String str) {
        boolean z;
        d();
        yes.i(str);
        yep a = this.d.a(str);
        z = a != null && a.b();
        if (z) {
            this.d.a(str, a.d, -1);
            a();
        }
        return z;
    }

    public final synchronized yeu f(String str) {
        return h(str);
    }

    public final synchronized boolean g(String str) {
        return a(str, false);
    }
}
