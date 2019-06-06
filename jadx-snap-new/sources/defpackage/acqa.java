package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import defpackage.alhh.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: acqa */
public final class acqa implements acpv {
    private final ajwy<nbo> a;
    private final acpy b;
    private final ajwy<acqb> c;
    private final ajwy<niw> d;
    private ImmutableList<acqf> e;
    private ImmutableList<acqf> f;
    private ImmutableList<acqf> g;
    private ImmutableList<acqf> h;
    private Set<String> i;
    private boolean j = false;
    private final Set<acqg> k = new HashSet();

    public acqa(ajwy<nbo> ajwy, ajwy<niw> ajwy2, ajwy<acqb> ajwy3, acpy acpy) {
        this.d = ajwy2;
        this.a = ajwy;
        this.b = acpy;
        this.e = ImmutableList.builder().build();
        this.f = ImmutableList.builder().build();
        this.g = ImmutableList.builder().build();
        this.h = ImmutableList.builder().build();
        this.i = new HashSet();
        this.c = ajwy3;
    }

    private boolean a(aljr aljr) {
        if (aljr.a == null || aljr.a.b == null || aljr.a.b.c == null || aljr.a.b.c.length == 0) {
            return false;
        }
        for (a aVar : aljr.a.b.c) {
            int b = 1 ^ ((acqb) this.c.get()).b(((niw) this.d.get()).b(), aVar.c);
            if (!acqa.h(aVar.b) && b != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean c(acqf acqf) {
        if (acqf.c == null) {
            return false;
        }
        for (a aVar : acqf.c.c) {
            if (this.a.get() != null && ((nbo) this.a.get()).b(aVar.d) == null) {
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x0083 in {5, 8, 11, 12, 19, 23} preds:[]
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
    private void d(java.util.List<defpackage.acqf> r7) {
        /*
        r6 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = new java.util.ArrayList;
        r3.<init>();
        r7 = r7.iterator();
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0046;
        r4 = r7.next();
        r4 = (defpackage.acqf) r4;
        r5 = defpackage.acqa.d(r4);
        if (r5 == 0) goto L_0x002e;
        r3.add(r4);
        goto L_0x0018;
        r5 = r6.c(r4);
        if (r5 == 0) goto L_0x0038;
        r2.add(r4);
        goto L_0x0018;
        r5 = r6.b(r4);
        if (r5 != 0) goto L_0x0042;
        r0.add(r4);
        goto L_0x0018;
        r1.add(r4);
        goto L_0x0018;
        r7 = new java.util.ArrayList;
        r7.<init>(r1);
        r7.addAll(r0);
        r0 = com.google.common.collect.ImmutableList.builder();
        r7 = r0.addAll(r7);
        r7 = r7.build();
        monitor-enter(r6);
        r6.e = r7;	 Catch:{ all -> 0x0080 }
        r0 = com.google.common.collect.ImmutableList.builder();	 Catch:{ all -> 0x0080 }
        r0 = r0.addAll(r2);	 Catch:{ all -> 0x0080 }
        r0 = r0.build();	 Catch:{ all -> 0x0080 }
        r6.f = r0;	 Catch:{ all -> 0x0080 }
        r0 = com.google.common.collect.ImmutableList.builder();	 Catch:{ all -> 0x0080 }
        r0 = r0.addAll(r3);	 Catch:{ all -> 0x0080 }
        r0 = r0.build();	 Catch:{ all -> 0x0080 }
        r6.g = r0;	 Catch:{ all -> 0x0080 }
        monitor-exit(r6);	 Catch:{ all -> 0x0080 }
        r0 = r6.b;
        r0.a(r7);
        return;
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0080 }
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqa.d(java.util.List):void");
    }

    private static boolean d(acqf acqf) {
        if (acqf.c == null) {
            return false;
        }
        for (a aVar : acqf.c.c) {
            if (aVar.i) {
                return true;
            }
        }
        return false;
    }

    private int e(List<acqf> list) {
        int i = 0;
        for (acqf b : list) {
            if (!b(b)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static boolean h(String str) {
        return TextUtils.equals(str, "mystatus.ghost") || TextUtils.equals(str, "mystatus.empty");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0021 in {7, 9, 10, 13} preds:[]
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
    private synchronized boolean k() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.h;	 Catch:{ all -> 0x001e }
        r0 = r0.iterator();	 Catch:{ all -> 0x001e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x001e }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x001e }
        r1 = r0.next();	 Catch:{ all -> 0x001e }
        r1 = (defpackage.acqf) r1;	 Catch:{ all -> 0x001e }
        r1 = r2.b(r1);	 Catch:{ all -> 0x001e }
        if (r1 != 0) goto L_0x0007;
        r0 = 1;
        monitor-exit(r2);
        return r0;
        r0 = 0;
        goto L_0x001a;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqa.k():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0039 in {13, 14, 16, 20} preds:[]
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
    public final defpackage.acqf a(java.lang.String r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.f;	 Catch:{ all -> 0x0036 }
        r1 = r6.e;	 Catch:{ all -> 0x0036 }
        r0 = com.google.common.collect.Iterables.concat(r0, r1);	 Catch:{ all -> 0x0036 }
        monitor-exit(r6);	 Catch:{ all -> 0x0036 }
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0034;
        r1 = r0.next();
        r1 = (defpackage.acqf) r1;
        r2 = r1.c;
        if (r2 == 0) goto L_0x000e;
        r2 = r1.c;
        r2 = r2.c;
        r3 = r2.length;
        r4 = 0;
        if (r4 >= r3) goto L_0x000e;
        r5 = r2[r4];
        r5 = r5.d;
        r5 = r7.equals(r5);
        if (r5 == 0) goto L_0x0031;
        return r1;
        r4 = r4 + 1;
        goto L_0x0024;
        r7 = 0;
        return r7;
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0036 }
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqa.a(java.lang.String):acqf");
    }

    public final void a(acqf acqf) {
        boolean b = b(acqf);
        ((acqb) this.c.get()).a(acqf);
        if (acqf.b != null) {
            this.b.a.a(Boolean.valueOf(k()));
        }
        if (!(acqf.c == null || b)) {
            this.b.e.a(acqf.c.a);
        }
        if (acqf.c != null) {
            for (a aVar : acqf.c.c) {
                this.k.add(new acqg(aVar.b, aVar.d));
            }
        }
    }

    public final void a(List<alhj> list) {
        List arrayList = new ArrayList();
        for (alhj acqf : list) {
            arrayList.add(new acqf(acqf));
        }
        d(arrayList);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:34:0x0056 in {9, 10, 21, 23, 25, 29, 33} preds:[]
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
    public final boolean a() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f;	 Catch:{ all -> 0x0053 }
        monitor-exit(r7);	 Catch:{ all -> 0x0053 }
        r1 = r0.iterator();
        r2 = r1.hasNext();
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x001e;
        r2 = r1.next();
        r2 = (defpackage.acqf) r2;
        r2 = r7.c(r2);
        if (r2 != 0) goto L_0x0008;
        r1 = 1;
        goto L_0x001f;
        r1 = 0;
        monitor-enter(r7);
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0050 }
        r5 = r7.e;	 Catch:{ all -> 0x0050 }
        r2.<init>(r5);	 Catch:{ all -> 0x0050 }
        monitor-exit(r7);	 Catch:{ all -> 0x0050 }
        if (r1 != 0) goto L_0x0041;
        r5 = r2.iterator();
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x0041;
        r6 = r5.next();
        r6 = (defpackage.acqf) r6;
        r6 = r7.c(r6);
        if (r6 == 0) goto L_0x002e;
        r1 = 1;
        if (r1 != 0) goto L_0x0044;
        return r3;
        r1 = new java.util.ArrayList;
        r1.<init>(r0);
        r1.addAll(r2);
        r7.d(r1);
        return r4;
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0050 }
        throw r0;
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0053 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqa.a():boolean");
    }

    public final boolean a(int i) {
        return i <= 2;
    }

    public final boolean a(a aVar) {
        return ((acqb) this.c.get()).a(aVar);
    }

    public final boolean a(String str, long j) {
        return ((acqb) this.c.get()).a(str, j);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x003b in {13, 14, 16, 20} preds:[]
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
    public final defpackage.acqf b(java.lang.String r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.f;	 Catch:{ all -> 0x0038 }
        r1 = r6.e;	 Catch:{ all -> 0x0038 }
        r2 = r6.g;	 Catch:{ all -> 0x0038 }
        r0 = com.google.common.collect.Iterables.concat(r0, r1, r2);	 Catch:{ all -> 0x0038 }
        monitor-exit(r6);	 Catch:{ all -> 0x0038 }
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0036;
        r1 = r0.next();
        r1 = (defpackage.acqf) r1;
        r2 = r1.c;
        if (r2 == 0) goto L_0x0010;
        r2 = r1.c;
        r2 = r2.c;
        r3 = r2.length;
        r4 = 0;
        if (r4 >= r3) goto L_0x0010;
        r5 = r2[r4];
        r5 = r5.d;
        r5 = r7.equals(r5);
        if (r5 == 0) goto L_0x0033;
        return r1;
        r4 = r4 + 1;
        goto L_0x0026;
        r7 = 0;
        return r7;
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0038 }
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqa.b(java.lang.String):acqf");
    }

    public final Set<acqg> b() {
        return this.k;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0085 in {13, 14, 21, 25} preds:[]
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
    public final void b(java.util.List<defpackage.aljr> r6) {
        /*
        r5 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r6 = r6.iterator();
        r1 = r6.hasNext();
        if (r1 == 0) goto L_0x005d;
        r1 = r6.next();
        r1 = (defpackage.aljr) r1;
        r2 = r1.a;
        r3 = 0;
        if (r2 == 0) goto L_0x0054;
        r2 = r1.a;
        r2 = r2.b;
        if (r2 == 0) goto L_0x0054;
        r2 = r1.a;
        r2 = r2.b;
        r2 = r2.c;
        if (r2 == 0) goto L_0x0054;
        r2 = r1.a;
        r2 = r2.b;
        r2 = r2.c;
        r2 = r2.length;
        if (r2 <= 0) goto L_0x0054;
        r2 = r1.a;
        r2 = r2.b;
        r2 = r2.c;
        r2 = r2[r3];
        r3 = r2.i;
        if (r3 != 0) goto L_0x0009;
        r2 = r2.b;
        r3 = "mystatus.ghost";
        r3 = android.text.TextUtils.equals(r3, r2);
        r4 = "mystatus.empty";
        r2 = android.text.TextUtils.equals(r4, r2);
        r4 = new acqf;
        r4.<init>(r1, r3, r2);
        r0.add(r4);
        goto L_0x0009;
        r2 = new acqf;
        r2.<init>(r1, r3, r3);
        r0.add(r2);
        goto L_0x0009;
        r6 = com.google.common.collect.ImmutableList.builder();
        r6 = r6.addAll(r0);
        r6 = r6.build();
        monitor-enter(r5);
        r5.h = r6;	 Catch:{ all -> 0x0082 }
        monitor-exit(r5);	 Catch:{ all -> 0x0082 }
        r0 = r5.b;
        r0 = r0.a;
        r1 = r5.k();
        r1 = java.lang.Boolean.valueOf(r1);
        r0.a(r1);
        r0 = r5.b;
        r0.b(r6);
        return;
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0082 }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqa.b(java.util.List):void");
    }

    public final boolean b(acqf acqf) {
        if (acqf.c == null) {
            return acqf.d != null ? a(acqf.d.b, acqf.d.c) : acqf.b != null && a(acqf.b);
        } else {
            for (a a : acqf.c.c) {
                if (!a(a)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final List<acqf> c(List<acqf> list) {
        ArrayList arrayList = new ArrayList();
        for (acqf acqf : list) {
            if (!b(acqf)) {
                arrayList.add(acqf);
            }
        }
        return arrayList;
    }

    public final void c() {
        this.k.clear();
    }

    public final void c(String str) {
        this.i.add(str);
    }

    public final void d() {
        for (acqf a : g()) {
            a(a);
        }
    }

    public final void d(String str) {
        this.i.remove(str);
    }

    public final Pair<List<acqf>, Integer> e() {
        List arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.e);
        }
        int e = e(arrayList);
        if (e == -1) {
            e = 0;
        }
        return new Pair(arrayList, Integer.valueOf(e));
    }

    public final boolean e(String str) {
        return this.i.contains(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x004c in {15, 19, 20, 24, 27} preds:[]
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
    public final synchronized defpackage.acpv.b f(java.lang.String r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.e;	 Catch:{ all -> 0x0049 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0049 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0049 }
        r2 = 0;	 Catch:{ all -> 0x0049 }
        if (r1 == 0) goto L_0x0042;	 Catch:{ all -> 0x0049 }
        r1 = r0.next();	 Catch:{ all -> 0x0049 }
        r1 = (defpackage.acqf) r1;	 Catch:{ all -> 0x0049 }
        r3 = r1.c;	 Catch:{ all -> 0x0049 }
        if (r3 == 0) goto L_0x0007;	 Catch:{ all -> 0x0049 }
        r3 = r1.c;	 Catch:{ all -> 0x0049 }
        r3 = r3.c;	 Catch:{ all -> 0x0049 }
        r4 = r3.length;	 Catch:{ all -> 0x0049 }
        r5 = 0;	 Catch:{ all -> 0x0049 }
        if (r5 >= r4) goto L_0x0007;	 Catch:{ all -> 0x0049 }
        r6 = r3[r5];	 Catch:{ all -> 0x0049 }
        r6 = r6.d;	 Catch:{ all -> 0x0049 }
        r6 = r8.equals(r6);	 Catch:{ all -> 0x0049 }
        if (r6 == 0) goto L_0x003f;	 Catch:{ all -> 0x0049 }
        r8 = r7.b(r1);	 Catch:{ all -> 0x0049 }
        r0 = 1;	 Catch:{ all -> 0x0049 }
        if (r8 == 0) goto L_0x0038;	 Catch:{ all -> 0x0049 }
        r8 = new acpv$b;	 Catch:{ all -> 0x0049 }
        r8.<init>(r0, r0);	 Catch:{ all -> 0x0049 }
        monitor-exit(r7);
        return r8;
        r8 = new acpv$b;	 Catch:{ all -> 0x0049 }
        r8.<init>(r0, r2);	 Catch:{ all -> 0x0049 }
        monitor-exit(r7);
        return r8;
        r5 = r5 + 1;
        goto L_0x001e;
        r8 = new acpv$b;	 Catch:{ all -> 0x0049 }
        r8.<init>(r2, r2);	 Catch:{ all -> 0x0049 }
        monitor-exit(r7);
        return r8;
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqa.f(java.lang.String):acpv$b");
    }

    public final synchronized List<acqf> f() {
        return this.e;
    }

    public final int g(String str) {
        for (int i = 0; i < f().size(); i++) {
            acqf acqf = (acqf) f().get(i);
            if (acqf.c != null) {
                for (a aVar : acqf.c.c) {
                    if (str.equals(aVar.d)) {
                        return i;
                    }
                }
                continue;
            }
        }
        return -1;
    }

    public final synchronized List<acqf> g() {
        return this.h;
    }

    public final void h() {
        ImmutableList build = ImmutableList.builder().build();
        synchronized (this) {
            this.e = build;
            this.f = build;
            this.g = build;
            this.h = build;
        }
        this.b.a(build);
        this.b.b(build);
        this.b.a.a(Boolean.FALSE);
        this.i = new HashSet();
    }

    public final boolean i() {
        return this.j;
    }

    public final void j() {
        this.j = true;
    }
}
