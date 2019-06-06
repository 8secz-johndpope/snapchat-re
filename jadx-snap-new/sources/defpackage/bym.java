package defpackage;

import android.os.ConditionVariable;
import defpackage.bxx.b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: bym */
public final class bym implements bxx {
    private static final HashSet<File> c = new HashSet();
    final File a;
    final byg b;
    private final byc d;
    private final HashMap<String, ArrayList<b>> e;
    private long f;

    public bym(File file, byc byc) {
        this(file, byc, (byte) 0);
    }

    private bym(File file, byc byc, byte b) {
        this(file, byc, new byg(file));
    }

    private bym(File file, byc byc, byg byg) {
        if (bym.b(file)) {
            this.a = file;
            this.d = byc;
            this.b = byg;
            this.e = new HashMap();
            final ConditionVariable conditionVariable = new ConditionVariable();
            new Thread("SimpleCache.initialize()") {
                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:39:0x0090 in {5, 8, 9, 12, 21, 22, 24, 25, 26, 30, 33, 35, 38} preds:[]
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
                public final void run() {
                    /*
                    r11 = this;
                    r0 = defpackage.bym.this;
                    monitor-enter(r0);
                    r1 = r2;	 Catch:{ all -> 0x008d }
                    r1.open();	 Catch:{ all -> 0x008d }
                    r1 = defpackage.bym.this;	 Catch:{ all -> 0x008d }
                    r2 = r1.a;	 Catch:{ all -> 0x008d }
                    r2 = r2.exists();	 Catch:{ all -> 0x008d }
                    if (r2 != 0) goto L_0x0018;	 Catch:{ all -> 0x008d }
                    r1 = r1.a;	 Catch:{ all -> 0x008d }
                    r1.mkdirs();	 Catch:{ all -> 0x008d }
                    goto L_0x008b;	 Catch:{ all -> 0x008d }
                    r2 = r1.b;	 Catch:{ all -> 0x008d }
                    r3 = r2.d;	 Catch:{ all -> 0x008d }
                    r4 = 0;	 Catch:{ all -> 0x008d }
                    if (r3 != 0) goto L_0x0021;	 Catch:{ all -> 0x008d }
                    r3 = 1;	 Catch:{ all -> 0x008d }
                    goto L_0x0022;	 Catch:{ all -> 0x008d }
                    r3 = 0;	 Catch:{ all -> 0x008d }
                    defpackage.byo.b(r3);	 Catch:{ all -> 0x008d }
                    r3 = r2.c();	 Catch:{ all -> 0x008d }
                    if (r3 != 0) goto L_0x0041;	 Catch:{ all -> 0x008d }
                    r3 = r2.c;	 Catch:{ all -> 0x008d }
                    r5 = r3.a;	 Catch:{ all -> 0x008d }
                    r5.delete();	 Catch:{ all -> 0x008d }
                    r3 = r3.b;	 Catch:{ all -> 0x008d }
                    r3.delete();	 Catch:{ all -> 0x008d }
                    r3 = r2.a;	 Catch:{ all -> 0x008d }
                    r3.clear();	 Catch:{ all -> 0x008d }
                    r2 = r2.b;	 Catch:{ all -> 0x008d }
                    r2.clear();	 Catch:{ all -> 0x008d }
                    r2 = r1.a;	 Catch:{ all -> 0x008d }
                    r2 = r2.listFiles();	 Catch:{ all -> 0x008d }
                    if (r2 == 0) goto L_0x008b;	 Catch:{ all -> 0x008d }
                    r3 = r2.length;	 Catch:{ all -> 0x008d }
                    if (r4 >= r3) goto L_0x0078;	 Catch:{ all -> 0x008d }
                    r5 = r2[r4];	 Catch:{ all -> 0x008d }
                    r6 = r5.getName();	 Catch:{ all -> 0x008d }
                    r7 = "cached_content_index.exi";	 Catch:{ all -> 0x008d }
                    r6 = r6.equals(r7);	 Catch:{ all -> 0x008d }
                    if (r6 != 0) goto L_0x0075;	 Catch:{ all -> 0x008d }
                    r6 = r5.length();	 Catch:{ all -> 0x008d }
                    r8 = 0;	 Catch:{ all -> 0x008d }
                    r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));	 Catch:{ all -> 0x008d }
                    if (r10 <= 0) goto L_0x006b;	 Catch:{ all -> 0x008d }
                    r6 = r1.b;	 Catch:{ all -> 0x008d }
                    r6 = defpackage.byn.a(r5, r6);	 Catch:{ all -> 0x008d }
                    goto L_0x006c;	 Catch:{ all -> 0x008d }
                    r6 = 0;	 Catch:{ all -> 0x008d }
                    if (r6 == 0) goto L_0x0072;	 Catch:{ all -> 0x008d }
                    r1.a(r6);	 Catch:{ all -> 0x008d }
                    goto L_0x0075;	 Catch:{ all -> 0x008d }
                    r5.delete();	 Catch:{ all -> 0x008d }
                    r4 = r4 + 1;	 Catch:{ all -> 0x008d }
                    goto L_0x004a;	 Catch:{ all -> 0x008d }
                    r2 = r1.b;	 Catch:{ all -> 0x008d }
                    r2.b();	 Catch:{ all -> 0x008d }
                    r1 = r1.b;	 Catch:{ a -> 0x0083 }
                    r1.a();	 Catch:{ a -> 0x0083 }
                    goto L_0x008b;
                    r1 = move-exception;
                    r2 = "SimpleCache";	 Catch:{ all -> 0x008d }
                    r3 = "Storing index file failed";	 Catch:{ all -> 0x008d }
                    android.util.Log.e(r2, r3, r1);	 Catch:{ all -> 0x008d }
                    monitor-exit(r0);	 Catch:{ all -> 0x008d }
                    return;	 Catch:{ all -> 0x008d }
                    r1 = move-exception;	 Catch:{ all -> 0x008d }
                    monitor-exit(r0);	 Catch:{ all -> 0x008d }
                    throw r1;
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bym$1.run():void");
                }
            }.start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: ".concat(String.valueOf(file)));
    }

    private void a(byd byd, boolean z) {
        byf b = this.b.b(byd.a);
        if (b != null && b.a(byd)) {
            this.f -= byd.c;
            if (z) {
                try {
                    this.b.d(b.b);
                    this.b.a();
                } catch (Throwable th) {
                    c(byd);
                }
            }
            c(byd);
        }
    }

    private void a(byn byn, byd byd) {
        ArrayList arrayList = (ArrayList) this.e.get(byn.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a(this, byn, byd);
            }
        }
        this.d.a(this, byn, byd);
    }

    private void b() {
        ArrayList arrayList = new ArrayList();
        for (byf byf : this.b.a.values()) {
            Iterator it = byf.c.iterator();
            while (it.hasNext()) {
                byd byd = (byd) it.next();
                if (!byd.e.exists()) {
                    arrayList.add(byd);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            a((byd) arrayList.get(i), false);
        }
        this.b.b();
        this.b.a();
    }

    private void b(byn byn) {
        ArrayList arrayList = (ArrayList) this.e.get(byn.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a(this, byn);
            }
        }
        this.d.a(this, byn);
    }

    private static synchronized boolean b(File file) {
        boolean add;
        synchronized (bym.class) {
            add = c.add(file.getAbsoluteFile());
        }
        return add;
    }

    private void c(byd byd) {
        ArrayList arrayList = (ArrayList) this.e.get(byd.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a(byd);
            }
        }
        this.d.a(byd);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0010 in {5, 8, 11} preds:[]
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
    private synchronized defpackage.byn d(java.lang.String r2, long r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.e(r2, r3);	 Catch:{ all -> 0x000d }
        if (r0 == 0) goto L_0x0009;
        monitor-exit(r1);
        return r0;
        r1.wait();	 Catch:{ all -> 0x000d }
        goto L_0x0001;
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bym.d(java.lang.String, long):byn");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x00ab in {5, 10, 11, 18, 21, 26, 29, 32} preds:[]
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
    private synchronized defpackage.byn e(java.lang.String r12, long r13) {
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = 1;
        defpackage.byo.b(r0);	 Catch:{ all -> 0x00a8 }
        r1 = r11.b;	 Catch:{ all -> 0x00a8 }
        r1 = r1.b(r12);	 Catch:{ all -> 0x00a8 }
        if (r1 != 0) goto L_0x0012;	 Catch:{ all -> 0x00a8 }
        r13 = defpackage.byn.a(r12, r13);	 Catch:{ all -> 0x00a8 }
        goto L_0x0027;	 Catch:{ all -> 0x00a8 }
        r2 = r1.a(r13);	 Catch:{ all -> 0x00a8 }
        r3 = r2.d;	 Catch:{ all -> 0x00a8 }
        if (r3 == 0) goto L_0x0026;	 Catch:{ all -> 0x00a8 }
        r3 = r2.e;	 Catch:{ all -> 0x00a8 }
        r3 = r3.exists();	 Catch:{ all -> 0x00a8 }
        if (r3 != 0) goto L_0x0026;	 Catch:{ all -> 0x00a8 }
        r11.b();	 Catch:{ all -> 0x00a8 }
        goto L_0x0012;	 Catch:{ all -> 0x00a8 }
        r13 = r2;	 Catch:{ all -> 0x00a8 }
        r14 = r13.d;	 Catch:{ all -> 0x00a8 }
        if (r14 == 0) goto L_0x0097;	 Catch:{ all -> 0x00a8 }
        r14 = r11.b;	 Catch:{ all -> 0x00a8 }
        r12 = r14.b(r12);	 Catch:{ all -> 0x00a8 }
        r14 = r12.c;	 Catch:{ all -> 0x00a8 }
        r14 = r14.remove(r13);	 Catch:{ all -> 0x00a8 }
        defpackage.byo.b(r14);	 Catch:{ all -> 0x00a8 }
        r1 = r12.a;	 Catch:{ all -> 0x00a8 }
        r14 = r13.d;	 Catch:{ all -> 0x00a8 }
        defpackage.byo.b(r14);	 Catch:{ all -> 0x00a8 }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00a8 }
        r14 = r13.e;	 Catch:{ all -> 0x00a8 }
        r0 = r14.getParentFile();	 Catch:{ all -> 0x00a8 }
        r2 = r13.b;	 Catch:{ all -> 0x00a8 }
        r4 = r8;	 Catch:{ all -> 0x00a8 }
        r10 = defpackage.byn.a(r0, r1, r2, r4);	 Catch:{ all -> 0x00a8 }
        r14 = new byn;	 Catch:{ all -> 0x00a8 }
        r3 = r13.a;	 Catch:{ all -> 0x00a8 }
        r4 = r13.b;	 Catch:{ all -> 0x00a8 }
        r6 = r13.c;	 Catch:{ all -> 0x00a8 }
        r2 = r14;	 Catch:{ all -> 0x00a8 }
        r2.<init>(r3, r4, r6, r8, r10);	 Catch:{ all -> 0x00a8 }
        r0 = r13.e;	 Catch:{ all -> 0x00a8 }
        r1 = r14.e;	 Catch:{ all -> 0x00a8 }
        r0 = r0.renameTo(r1);	 Catch:{ all -> 0x00a8 }
        if (r0 == 0) goto L_0x0072;	 Catch:{ all -> 0x00a8 }
        r12 = r12.c;	 Catch:{ all -> 0x00a8 }
        r12.add(r14);	 Catch:{ all -> 0x00a8 }
        r11.a(r13, r14);	 Catch:{ all -> 0x00a8 }
        monitor-exit(r11);
        return r14;
        r12 = new bxx$a;	 Catch:{ all -> 0x00a8 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a8 }
        r1 = "Renaming of ";	 Catch:{ all -> 0x00a8 }
        r0.<init>(r1);	 Catch:{ all -> 0x00a8 }
        r13 = r13.e;	 Catch:{ all -> 0x00a8 }
        r0.append(r13);	 Catch:{ all -> 0x00a8 }
        r13 = " to ";	 Catch:{ all -> 0x00a8 }
        r0.append(r13);	 Catch:{ all -> 0x00a8 }
        r13 = r14.e;	 Catch:{ all -> 0x00a8 }
        r0.append(r13);	 Catch:{ all -> 0x00a8 }
        r13 = " failed.";	 Catch:{ all -> 0x00a8 }
        r0.append(r13);	 Catch:{ all -> 0x00a8 }
        r13 = r0.toString();	 Catch:{ all -> 0x00a8 }
        r12.<init>(r13);	 Catch:{ all -> 0x00a8 }
        throw r12;	 Catch:{ all -> 0x00a8 }
        r14 = r11.b;	 Catch:{ all -> 0x00a8 }
        r12 = r14.a(r12);	 Catch:{ all -> 0x00a8 }
        r14 = r12.e;	 Catch:{ all -> 0x00a8 }
        if (r14 != 0) goto L_0x00a5;	 Catch:{ all -> 0x00a8 }
        r12.e = r0;	 Catch:{ all -> 0x00a8 }
        monitor-exit(r11);
        return r13;
        r12 = 0;
        monitor-exit(r11);
        return r12;
        r12 = move-exception;
        monitor-exit(r11);
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bym.e(java.lang.String, long):byn");
    }

    public final synchronized long a() {
        byo.b(true);
        return this.f;
    }

    public final synchronized long a(String str) {
        return byi.a(b(str));
    }

    public final synchronized File a(String str, long j, long j2) {
        Object b;
        byo.b(true);
        b = this.b.b(str);
        byo.a(b);
        byo.b(b.e);
        if (!this.a.exists()) {
            this.a.mkdirs();
            b();
        }
        this.d.a(this, j2);
        return byn.a(this.a, b.a, j, System.currentTimeMillis());
    }

    public final synchronized NavigableSet<byd> a(String str, b bVar) {
        byo.b(true);
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.e.put(str, arrayList);
        }
        arrayList.add(bVar);
        return c(str);
    }

    public final synchronized void a(byd byd) {
        byo.b(true);
        Object b = this.b.b(byd.a);
        byo.a(b);
        byo.b(b.e);
        b.e = false;
        this.b.d(b.b);
        notifyAll();
    }

    /* Access modifiers changed, original: final */
    public final void a(byn byn) {
        this.b.a(byn.a).a(byn);
        this.f += byn.c;
        b(byn);
    }

    public final synchronized void a(File file) {
        boolean z = true;
        byo.b(true);
        byn a = byn.a(file, this.b);
        byo.b(a != null);
        Object b = this.b.b(a.a);
        byo.a(b);
        byo.b(b.e);
        if (!file.exists()) {
            return;
        }
        if (file.length() == 0) {
            file.delete();
            return;
        }
        long a2 = byi.a(b.d);
        if (a2 != -1) {
            if (a.b + a.c > a2) {
                z = false;
            }
            byo.b(z);
        }
        a(a);
        this.b.a();
        notifyAll();
    }

    public final synchronized void a(String str, byj byj) {
        byo.b(true);
        byg byg = this.b;
        if (byg.a(str).a(byj)) {
            byg.d = true;
        }
        this.b.a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x006d in {9, 10, 12, 14, 25, 28, 29, 32} preds:[]
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
    public final synchronized long b(java.lang.String r10, long r11, long r13) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = 1;
        defpackage.byo.b(r0);	 Catch:{ all -> 0x006a }
        r0 = r9.b;	 Catch:{ all -> 0x006a }
        r10 = r0.b(r10);	 Catch:{ all -> 0x006a }
        if (r10 == 0) goto L_0x0068;	 Catch:{ all -> 0x006a }
        r0 = r10.a(r11);	 Catch:{ all -> 0x006a }
        r1 = r0.b();	 Catch:{ all -> 0x006a }
        if (r1 == 0) goto L_0x002c;	 Catch:{ all -> 0x006a }
        r10 = r0.a();	 Catch:{ all -> 0x006a }
        if (r10 == 0) goto L_0x0023;	 Catch:{ all -> 0x006a }
        r10 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;	 Catch:{ all -> 0x006a }
        goto L_0x0025;	 Catch:{ all -> 0x006a }
        r10 = r0.c;	 Catch:{ all -> 0x006a }
        r10 = java.lang.Math.min(r10, r13);	 Catch:{ all -> 0x006a }
        r10 = -r10;
        monitor-exit(r9);
        return r10;
        r1 = r11 + r13;
        r3 = r0.b;	 Catch:{ all -> 0x006a }
        r5 = r0.c;	 Catch:{ all -> 0x006a }
        r3 = r3 + r5;	 Catch:{ all -> 0x006a }
        r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));	 Catch:{ all -> 0x006a }
        if (r5 >= 0) goto L_0x0061;	 Catch:{ all -> 0x006a }
        r10 = r10.c;	 Catch:{ all -> 0x006a }
        r5 = 0;	 Catch:{ all -> 0x006a }
        r10 = r10.tailSet(r0, r5);	 Catch:{ all -> 0x006a }
        r10 = r10.iterator();	 Catch:{ all -> 0x006a }
        r0 = r10.hasNext();	 Catch:{ all -> 0x006a }
        if (r0 == 0) goto L_0x0061;	 Catch:{ all -> 0x006a }
        r0 = r10.next();	 Catch:{ all -> 0x006a }
        r0 = (defpackage.byn) r0;	 Catch:{ all -> 0x006a }
        r5 = r0.b;	 Catch:{ all -> 0x006a }
        r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));	 Catch:{ all -> 0x006a }
        if (r7 > 0) goto L_0x0061;	 Catch:{ all -> 0x006a }
        r5 = r0.b;	 Catch:{ all -> 0x006a }
        r7 = r0.c;	 Catch:{ all -> 0x006a }
        r5 = r5 + r7;	 Catch:{ all -> 0x006a }
        r3 = java.lang.Math.max(r3, r5);	 Catch:{ all -> 0x006a }
        r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));	 Catch:{ all -> 0x006a }
        if (r0 < 0) goto L_0x0042;	 Catch:{ all -> 0x006a }
        r3 = r3 - r11;	 Catch:{ all -> 0x006a }
        r10 = java.lang.Math.min(r3, r13);	 Catch:{ all -> 0x006a }
        monitor-exit(r9);
        return r10;
        r10 = -r13;
        goto L_0x002a;
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bym.b(java.lang.String, long, long):long");
    }

    public final /* synthetic */ byd b(String str, long j) {
        return e(str, j);
    }

    public final synchronized byh b(String str) {
        byo.b(true);
        byf b = this.b.b(str);
        if (b != null) {
            return b.d;
        }
        return byk.a;
    }

    public final synchronized void b(byd byd) {
        byo.b(true);
        a(byd, true);
    }

    public final synchronized NavigableSet<byd> c(String str) {
        byo.b(true);
        byf b = this.b.b(str);
        if (b != null) {
            if (!b.c.isEmpty()) {
                return new TreeSet(b.c);
            }
        }
        return new TreeSet();
    }

    public final synchronized void c(String str, long j) {
        byj byj = new byj();
        byi.a(byj, j);
        a(str, byj);
    }
}
