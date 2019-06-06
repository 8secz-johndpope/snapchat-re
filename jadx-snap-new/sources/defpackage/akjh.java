package defpackage;

import com.snap.android.linearallocexpander.LaExpander;
import defpackage.akji.b;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: akjh */
public final class akjh implements Closeable {
    static final ExecutorService a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), akib.a("OkHttp Http2Connection", true));
    private static /* synthetic */ boolean u = (akjh.class.desiredAssertionStatus() ^ 1);
    final boolean b;
    final b c;
    final Map<Integer, akjj> d = new LinkedHashMap();
    final String e;
    int f;
    int g;
    boolean h;
    final ExecutorService i;
    final akjn j;
    long k = 0;
    long l;
    public akjo m = new akjo();
    final akjo n = new akjo();
    boolean o = false;
    public final akjk p;
    public final c q;
    final Set<Integer> r = new LinkedHashSet();
    private int s;
    private Socket t;

    /* renamed from: akjh$a */
    public static class a {
        public Socket a;
        public String b;
        public akkf c;
        public akke d;
        public b e = b.l;
        akjn f = akjn.a;
        boolean g = true;
    }

    /* renamed from: akjh$b */
    public static abstract class b {
        public static final b l = new 1();

        /* renamed from: akjh$b$1 */
        class 1 extends b {
            1() {
            }

            public final void a(akjj akjj) {
                akjj.a(akjc.REFUSED_STREAM);
            }
        }

        public void a(akjh akjh) {
        }

        public abstract void a(akjj akjj);
    }

    /* renamed from: akjh$3 */
    class 3 extends akia {
        private /* synthetic */ boolean a = true;
        private /* synthetic */ int b;
        private /* synthetic */ int c;
        private /* synthetic */ akjm d;

        3(String str, Object[] objArr, int i, int i2) {
            this.b = i;
            this.c = i2;
            this.d = null;
            super(str, objArr);
        }

        public final void b() {
            try {
                akjh.this.a(this.a, this.b, this.c, null);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: akjh$4 */
    class 4 extends akia {
        private /* synthetic */ int a;
        private /* synthetic */ List b;

        4(String str, Object[] objArr, int i, List list) {
            this.a = i;
            this.b = list;
            super(str, objArr);
        }

        public final void b() {
            try {
                akjh.this.p.a(this.a, akjc.CANCEL);
                synchronized (akjh.this) {
                    akjh.this.r.remove(Integer.valueOf(this.a));
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: akjh$5 */
    class 5 extends akia {
        private /* synthetic */ int a;
        private /* synthetic */ List b;
        private /* synthetic */ boolean c;

        5(String str, Object[] objArr, int i, List list, boolean z) {
            this.a = i;
            this.b = list;
            this.c = z;
            super(str, objArr);
        }

        public final void b() {
            try {
                akjh.this.p.a(this.a, akjc.CANCEL);
                synchronized (akjh.this) {
                    akjh.this.r.remove(Integer.valueOf(this.a));
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: akjh$6 */
    class 6 extends akia {
        private /* synthetic */ int a;
        private /* synthetic */ akkd b;
        private /* synthetic */ int c;
        private /* synthetic */ boolean d;

        6(String str, Object[] objArr, int i, akkd akkd, int i2, boolean z) {
            this.a = i;
            this.b = akkd;
            this.c = i2;
            this.d = z;
            super(str, objArr);
        }

        public final void b() {
            try {
                akjh.this.j.a(this.b, this.c);
                akjh.this.p.a(this.a, akjc.CANCEL);
                synchronized (akjh.this) {
                    akjh.this.r.remove(Integer.valueOf(this.a));
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: akjh$7 */
    class 7 extends akia {
        private /* synthetic */ int a;
        private /* synthetic */ akjc b;

        7(String str, Object[] objArr, int i, akjc akjc) {
            this.a = i;
            this.b = akjc;
            super(str, objArr);
        }

        public final void b() {
            synchronized (akjh.this) {
                akjh.this.r.remove(Integer.valueOf(this.a));
            }
        }
    }

    /* renamed from: akjh$c */
    class c extends akia implements b {
        private akji b;

        /* renamed from: akjh$c$2 */
        class 2 extends akia {
            2(String str, Object... objArr) {
                super(str, objArr);
            }

            public final void b() {
                akjh.this.c.a(akjh.this);
            }
        }

        /* renamed from: akjh$c$3 */
        class 3 extends akia {
            private /* synthetic */ akjo a;

            3(String str, Object[] objArr, akjo akjo) {
                this.a = akjo;
                super(str, objArr);
            }

            public final void b() {
                try {
                    akjh.this.p.a(this.a);
                } catch (IOException unused) {
                }
            }
        }

        c(akji akji) {
            super("OkHttp %s", r3.e);
            this.b = akji;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0044 in {11, 12, 13, 17} preds:[]
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
        public final void a(int r6) {
            /*
            r5 = this;
            r0 = defpackage.akjh.this;
            monitor-enter(r0);
            r1 = defpackage.akjh.this;	 Catch:{ all -> 0x0041 }
            r1 = r1.d;	 Catch:{ all -> 0x0041 }
            r1 = r1.values();	 Catch:{ all -> 0x0041 }
            r2 = defpackage.akjh.this;	 Catch:{ all -> 0x0041 }
            r2 = r2.d;	 Catch:{ all -> 0x0041 }
            r2 = r2.size();	 Catch:{ all -> 0x0041 }
            r2 = new defpackage.akjj[r2];	 Catch:{ all -> 0x0041 }
            r1 = r1.toArray(r2);	 Catch:{ all -> 0x0041 }
            r1 = (defpackage.akjj[]) r1;	 Catch:{ all -> 0x0041 }
            r2 = defpackage.akjh.this;	 Catch:{ all -> 0x0041 }
            r3 = 1;	 Catch:{ all -> 0x0041 }
            r2.h = r3;	 Catch:{ all -> 0x0041 }
            monitor-exit(r0);	 Catch:{ all -> 0x0041 }
            r0 = r1.length;
            r2 = 0;
            if (r2 >= r0) goto L_0x0040;
            r3 = r1[r2];
            r4 = r3.c;
            if (r4 <= r6) goto L_0x003d;
            r4 = r3.b();
            if (r4 == 0) goto L_0x003d;
            r4 = defpackage.akjc.REFUSED_STREAM;
            r3.c(r4);
            r4 = defpackage.akjh.this;
            r3 = r3.c;
            r4.b(r3);
            r2 = r2 + 1;
            goto L_0x0023;
            return;
            r6 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0041 }
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akjh$c.a(int):void");
        }

        public final void a(int i, long j) {
            if (i == 0) {
                synchronized (akjh.this) {
                    akjh akjh = akjh.this;
                    akjh.l += j;
                    akjh.this.notifyAll();
                }
                return;
            }
            akjj a = akjh.this.a(i);
            if (a != null) {
                synchronized (a) {
                    a.a(j);
                }
            }
        }

        public final void a(int i, akjc akjc) {
            if (akjh.c(i)) {
                akjh akjh = akjh.this;
                akjh.i.execute(new 7("OkHttp %s Push Reset[%s]", new Object[]{akjh.e, Integer.valueOf(i)}, i, akjc));
                return;
            }
            akjj b = akjh.this.b(i);
            if (b != null) {
                b.c(akjc);
            }
        }

        public final void a(int i, List<akjd> list) {
            akjh akjh = akjh.this;
            synchronized (akjh) {
                if (akjh.r.contains(Integer.valueOf(i))) {
                    akjh.a(i, akjc.PROTOCOL_ERROR);
                    return;
                }
                akjh.r.add(Integer.valueOf(i));
                akjh.i.execute(new 4("OkHttp %s Push Request[%s]", new Object[]{akjh.e, Integer.valueOf(i)}, i, list));
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:44:0x00b8 in {8, 9, 17, 18, 21, 22, 35, 38, 39, 43} preds:[]
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
        public final void a(defpackage.akjo r12) {
            /*
            r11 = this;
            r0 = defpackage.akjh.this;
            monitor-enter(r0);
            r1 = defpackage.akjh.this;	 Catch:{ all -> 0x00b5 }
            r1 = r1.n;	 Catch:{ all -> 0x00b5 }
            r1 = r1.b();	 Catch:{ all -> 0x00b5 }
            r2 = defpackage.akjh.this;	 Catch:{ all -> 0x00b5 }
            r2 = r2.n;	 Catch:{ all -> 0x00b5 }
            r3 = 0;	 Catch:{ all -> 0x00b5 }
            r4 = 0;	 Catch:{ all -> 0x00b5 }
            r5 = 10;	 Catch:{ all -> 0x00b5 }
            if (r4 >= r5) goto L_0x0025;	 Catch:{ all -> 0x00b5 }
            r5 = r12.a(r4);	 Catch:{ all -> 0x00b5 }
            if (r5 == 0) goto L_0x0022;	 Catch:{ all -> 0x00b5 }
            r5 = r12.b;	 Catch:{ all -> 0x00b5 }
            r5 = r5[r4];	 Catch:{ all -> 0x00b5 }
            r2.a(r4, r5);	 Catch:{ all -> 0x00b5 }
            r4 = r4 + 1;	 Catch:{ all -> 0x00b5 }
            goto L_0x0011;	 Catch:{ all -> 0x00b5 }
            r2 = defpackage.akjh.a;	 Catch:{ all -> 0x00b5 }
            r4 = new akjh$c$3;	 Catch:{ all -> 0x00b5 }
            r5 = "OkHttp %s ACK Settings";	 Catch:{ all -> 0x00b5 }
            r6 = 1;	 Catch:{ all -> 0x00b5 }
            r7 = new java.lang.Object[r6];	 Catch:{ all -> 0x00b5 }
            r8 = defpackage.akjh.this;	 Catch:{ all -> 0x00b5 }
            r8 = r8.e;	 Catch:{ all -> 0x00b5 }
            r7[r3] = r8;	 Catch:{ all -> 0x00b5 }
            r4.<init>(r5, r7, r12);	 Catch:{ all -> 0x00b5 }
            r2.execute(r4);	 Catch:{ all -> 0x00b5 }
            r12 = defpackage.akjh.this;	 Catch:{ all -> 0x00b5 }
            r12 = r12.n;	 Catch:{ all -> 0x00b5 }
            r12 = r12.b();	 Catch:{ all -> 0x00b5 }
            r2 = -1;	 Catch:{ all -> 0x00b5 }
            r4 = 0;	 Catch:{ all -> 0x00b5 }
            r7 = 0;	 Catch:{ all -> 0x00b5 }
            if (r12 == r2) goto L_0x0088;	 Catch:{ all -> 0x00b5 }
            if (r12 == r1) goto L_0x0088;	 Catch:{ all -> 0x00b5 }
            r12 = r12 - r1;	 Catch:{ all -> 0x00b5 }
            r1 = (long) r12;	 Catch:{ all -> 0x00b5 }
            r12 = defpackage.akjh.this;	 Catch:{ all -> 0x00b5 }
            r12 = r12.o;	 Catch:{ all -> 0x00b5 }
            if (r12 != 0) goto L_0x0064;	 Catch:{ all -> 0x00b5 }
            r12 = defpackage.akjh.this;	 Catch:{ all -> 0x00b5 }
            r8 = r12.l;	 Catch:{ all -> 0x00b5 }
            r8 = r8 + r1;	 Catch:{ all -> 0x00b5 }
            r12.l = r8;	 Catch:{ all -> 0x00b5 }
            r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));	 Catch:{ all -> 0x00b5 }
            if (r8 <= 0) goto L_0x0060;	 Catch:{ all -> 0x00b5 }
            r12.notifyAll();	 Catch:{ all -> 0x00b5 }
            r12 = defpackage.akjh.this;	 Catch:{ all -> 0x00b5 }
            r12.o = r6;	 Catch:{ all -> 0x00b5 }
            r12 = defpackage.akjh.this;	 Catch:{ all -> 0x00b5 }
            r12 = r12.d;	 Catch:{ all -> 0x00b5 }
            r12 = r12.isEmpty();	 Catch:{ all -> 0x00b5 }
            if (r12 != 0) goto L_0x0089;	 Catch:{ all -> 0x00b5 }
            r12 = defpackage.akjh.this;	 Catch:{ all -> 0x00b5 }
            r12 = r12.d;	 Catch:{ all -> 0x00b5 }
            r12 = r12.values();	 Catch:{ all -> 0x00b5 }
            r7 = defpackage.akjh.this;	 Catch:{ all -> 0x00b5 }
            r7 = r7.d;	 Catch:{ all -> 0x00b5 }
            r7 = r7.size();	 Catch:{ all -> 0x00b5 }
            r7 = new defpackage.akjj[r7];	 Catch:{ all -> 0x00b5 }
            r12 = r12.toArray(r7);	 Catch:{ all -> 0x00b5 }
            r7 = r12;	 Catch:{ all -> 0x00b5 }
            r7 = (defpackage.akjj[]) r7;	 Catch:{ all -> 0x00b5 }
            goto L_0x0089;	 Catch:{ all -> 0x00b5 }
            r1 = r4;	 Catch:{ all -> 0x00b5 }
            r12 = defpackage.akjh.a;	 Catch:{ all -> 0x00b5 }
            r8 = new akjh$c$2;	 Catch:{ all -> 0x00b5 }
            r9 = "OkHttp %s settings";	 Catch:{ all -> 0x00b5 }
            r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x00b5 }
            r10 = defpackage.akjh.this;	 Catch:{ all -> 0x00b5 }
            r10 = r10.e;	 Catch:{ all -> 0x00b5 }
            r6[r3] = r10;	 Catch:{ all -> 0x00b5 }
            r8.<init>(r9, r6);	 Catch:{ all -> 0x00b5 }
            r12.execute(r8);	 Catch:{ all -> 0x00b5 }
            monitor-exit(r0);	 Catch:{ all -> 0x00b5 }
            if (r7 == 0) goto L_0x00b4;
            r12 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
            if (r12 == 0) goto L_0x00b4;
            r12 = r7.length;
            if (r3 >= r12) goto L_0x00b4;
            r0 = r7[r3];
            monitor-enter(r0);
            r0.a(r1);	 Catch:{ all -> 0x00b1 }
            monitor-exit(r0);	 Catch:{ all -> 0x00b1 }
            r3 = r3 + 1;	 Catch:{ all -> 0x00b1 }
            goto L_0x00a5;	 Catch:{ all -> 0x00b1 }
            r12 = move-exception;	 Catch:{ all -> 0x00b1 }
            monitor-exit(r0);	 Catch:{ all -> 0x00b1 }
            throw r12;
            return;
            r12 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x00b5 }
            throw r12;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akjh$c.a(akjo):void");
        }

        public final void a(boolean z, int i, int i2) {
            if (!z) {
                akjh akjh = akjh.this;
                akjh.a.execute(new 3("OkHttp %s ping %08x%08x", new Object[]{akjh.e, Integer.valueOf(i), Integer.valueOf(i2)}, i, i2));
            }
        }

        public final void a(boolean z, int i, akkf akkf, int i2) {
            if (akjh.c(i)) {
                akjh akjh = akjh.this;
                akkd akkd = new akkd();
                long j = (long) i2;
                akkf.a(j);
                akkf.a(akkd, j);
                if (akkd.b == j) {
                    akjh.i.execute(new 6("OkHttp %s Push Data[%s]", new Object[]{akjh.e, Integer.valueOf(i)}, i, akkd, i2, z));
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(akkd.b);
                stringBuilder.append(" != ");
                stringBuilder.append(i2);
                throw new IOException(stringBuilder.toString());
            }
            akjj a = akjh.this.a(i);
            if (a == null) {
                akjh.this.a(i, akjc.PROTOCOL_ERROR);
                akkf.f((long) i2);
            } else if (akjj.l || !Thread.holdsLock(a)) {
                a.g.a(akkf, (long) i2);
                if (z) {
                    a.e();
                }
            } else {
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Missing block: B:26:0x0088, code skipped:
            if (defpackage.akjj.l != false) goto L_0x0097;
     */
        /* JADX WARNING: Missing block: B:28:0x008e, code skipped:
            if (java.lang.Thread.holdsLock(r4) != false) goto L_0x0091;
     */
        /* JADX WARNING: Missing block: B:30:0x0096, code skipped:
            throw new java.lang.AssertionError();
     */
        /* JADX WARNING: Missing block: B:31:0x0097, code skipped:
            monitor-enter(r4);
     */
        /* JADX WARNING: Missing block: B:33:?, code skipped:
            r4.f = true;
     */
        /* JADX WARNING: Missing block: B:34:0x009c, code skipped:
            if (r4.e != null) goto L_0x00a8;
     */
        /* JADX WARNING: Missing block: B:35:0x009e, code skipped:
            r4.e = r15;
            r2 = r4.a();
            r4.notifyAll();
     */
        /* JADX WARNING: Missing block: B:36:0x00a8, code skipped:
            r14 = new java.util.ArrayList();
            r14.addAll(r4.e);
            r14.add(null);
            r14.addAll(r15);
            r4.e = r14;
     */
        /* JADX WARNING: Missing block: B:37:0x00bb, code skipped:
            monitor-exit(r4);
     */
        /* JADX WARNING: Missing block: B:38:0x00bc, code skipped:
            if (r2 != false) goto L_0x00c5;
     */
        /* JADX WARNING: Missing block: B:39:0x00be, code skipped:
            r4.d.b(r4.c);
     */
        /* JADX WARNING: Missing block: B:40:0x00c5, code skipped:
            if (r13 == false) goto L_0x00ca;
     */
        /* JADX WARNING: Missing block: B:41:0x00c7, code skipped:
            r4.e();
     */
        /* JADX WARNING: Missing block: B:42:0x00ca, code skipped:
            return;
     */
        public final void a(boolean r13, int r14, java.util.List<defpackage.akjd> r15) {
            /*
            r12 = this;
            r0 = defpackage.akjh.c(r14);
            r1 = 0;
            r2 = 1;
            r3 = 2;
            if (r0 == 0) goto L_0x0028;
        L_0x0009:
            r5 = defpackage.akjh.this;
            r0 = r5.i;
            r11 = new akjh$5;
            r7 = new java.lang.Object[r3];
            r3 = r5.e;
            r7[r1] = r3;
            r1 = java.lang.Integer.valueOf(r14);
            r7[r2] = r1;
            r6 = "OkHttp %s Push Headers[%s]";
            r4 = r11;
            r8 = r14;
            r9 = r15;
            r10 = r13;
            r4.<init>(r6, r7, r8, r9, r10);
            r0.execute(r11);
            return;
        L_0x0028:
            r0 = defpackage.akjh.this;
            monitor-enter(r0);
            r4 = defpackage.akjh.this;	 Catch:{ all -> 0x00ce }
            r4 = r4.a(r14);	 Catch:{ all -> 0x00ce }
            if (r4 != 0) goto L_0x0085;
        L_0x0033:
            r4 = defpackage.akjh.this;	 Catch:{ all -> 0x00ce }
            r4 = r4.h;	 Catch:{ all -> 0x00ce }
            if (r4 == 0) goto L_0x003b;
        L_0x0039:
            monitor-exit(r0);	 Catch:{ all -> 0x00ce }
            return;
        L_0x003b:
            r4 = defpackage.akjh.this;	 Catch:{ all -> 0x00ce }
            r4 = r4.f;	 Catch:{ all -> 0x00ce }
            if (r14 > r4) goto L_0x0043;
        L_0x0041:
            monitor-exit(r0);	 Catch:{ all -> 0x00ce }
            return;
        L_0x0043:
            r4 = r14 % 2;
            r5 = defpackage.akjh.this;	 Catch:{ all -> 0x00ce }
            r5 = r5.g;	 Catch:{ all -> 0x00ce }
            r5 = r5 % r3;
            if (r4 != r5) goto L_0x004e;
        L_0x004c:
            monitor-exit(r0);	 Catch:{ all -> 0x00ce }
            return;
        L_0x004e:
            r10 = new akjj;	 Catch:{ all -> 0x00ce }
            r6 = defpackage.akjh.this;	 Catch:{ all -> 0x00ce }
            r7 = 0;
            r4 = r10;
            r5 = r14;
            r8 = r13;
            r9 = r15;
            r4.<init>(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00ce }
            r13 = defpackage.akjh.this;	 Catch:{ all -> 0x00ce }
            r13.f = r14;	 Catch:{ all -> 0x00ce }
            r13 = defpackage.akjh.this;	 Catch:{ all -> 0x00ce }
            r13 = r13.d;	 Catch:{ all -> 0x00ce }
            r15 = java.lang.Integer.valueOf(r14);	 Catch:{ all -> 0x00ce }
            r13.put(r15, r10);	 Catch:{ all -> 0x00ce }
            r13 = defpackage.akjh.a;	 Catch:{ all -> 0x00ce }
            r15 = new akjh$c$1;	 Catch:{ all -> 0x00ce }
            r4 = "OkHttp %s stream %d";
            r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x00ce }
            r5 = defpackage.akjh.this;	 Catch:{ all -> 0x00ce }
            r5 = r5.e;	 Catch:{ all -> 0x00ce }
            r3[r1] = r5;	 Catch:{ all -> 0x00ce }
            r14 = java.lang.Integer.valueOf(r14);	 Catch:{ all -> 0x00ce }
            r3[r2] = r14;	 Catch:{ all -> 0x00ce }
            r15.<init>(r4, r3, r10);	 Catch:{ all -> 0x00ce }
            r13.execute(r15);	 Catch:{ all -> 0x00ce }
            monitor-exit(r0);	 Catch:{ all -> 0x00ce }
            return;
        L_0x0085:
            monitor-exit(r0);	 Catch:{ all -> 0x00ce }
            r14 = defpackage.akjj.l;
            if (r14 != 0) goto L_0x0097;
        L_0x008a:
            r14 = java.lang.Thread.holdsLock(r4);
            if (r14 != 0) goto L_0x0091;
        L_0x0090:
            goto L_0x0097;
        L_0x0091:
            r13 = new java.lang.AssertionError;
            r13.<init>();
            throw r13;
        L_0x0097:
            monitor-enter(r4);
            r4.f = r2;	 Catch:{ all -> 0x00cb }
            r14 = r4.e;	 Catch:{ all -> 0x00cb }
            if (r14 != 0) goto L_0x00a8;
        L_0x009e:
            r4.e = r15;	 Catch:{ all -> 0x00cb }
            r2 = r4.a();	 Catch:{ all -> 0x00cb }
            r4.notifyAll();	 Catch:{ all -> 0x00cb }
            goto L_0x00bb;
        L_0x00a8:
            r14 = new java.util.ArrayList;	 Catch:{ all -> 0x00cb }
            r14.<init>();	 Catch:{ all -> 0x00cb }
            r0 = r4.e;	 Catch:{ all -> 0x00cb }
            r14.addAll(r0);	 Catch:{ all -> 0x00cb }
            r0 = 0;
            r14.add(r0);	 Catch:{ all -> 0x00cb }
            r14.addAll(r15);	 Catch:{ all -> 0x00cb }
            r4.e = r14;	 Catch:{ all -> 0x00cb }
        L_0x00bb:
            monitor-exit(r4);	 Catch:{ all -> 0x00cb }
            if (r2 != 0) goto L_0x00c5;
        L_0x00be:
            r14 = r4.d;
            r15 = r4.c;
            r14.b(r15);
        L_0x00c5:
            if (r13 == 0) goto L_0x00ca;
        L_0x00c7:
            r4.e();
        L_0x00ca:
            return;
        L_0x00cb:
            r13 = move-exception;
            monitor-exit(r4);	 Catch:{ all -> 0x00cb }
            throw r13;
        L_0x00ce:
            r13 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x00ce }
            throw r13;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akjh$c.a(boolean, int, java.util.List):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x0088 in {6, 8, 11, 18, 19, 21, 22, 25, 32, 34, 36, 37} preds:[]
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
        public final void b() {
            /*
            r9 = this;
            r0 = defpackage.akjc.INTERNAL_ERROR;
            r1 = defpackage.akjc.INTERNAL_ERROR;
            r2 = r9.b;	 Catch:{ IOException -> 0x0076 }
            r3 = r2.c;	 Catch:{ IOException -> 0x0076 }
            r4 = 1;	 Catch:{ IOException -> 0x0076 }
            r5 = 0;	 Catch:{ IOException -> 0x0076 }
            if (r3 == 0) goto L_0x001c;	 Catch:{ IOException -> 0x0076 }
            r2 = r2.a(r4, r9);	 Catch:{ IOException -> 0x0076 }
            if (r2 == 0) goto L_0x0013;	 Catch:{ IOException -> 0x0076 }
            goto L_0x004e;	 Catch:{ IOException -> 0x0076 }
            r2 = "Required SETTINGS preface not received";	 Catch:{ IOException -> 0x0076 }
            r3 = new java.lang.Object[r5];	 Catch:{ IOException -> 0x0076 }
            r2 = defpackage.akjf.b(r2, r3);	 Catch:{ IOException -> 0x0076 }
            throw r2;	 Catch:{ IOException -> 0x0076 }
            r2 = r2.b;	 Catch:{ IOException -> 0x0076 }
            r3 = defpackage.akjf.a;	 Catch:{ IOException -> 0x0076 }
            r3 = r3.g();	 Catch:{ IOException -> 0x0076 }
            r6 = (long) r3;	 Catch:{ IOException -> 0x0076 }
            r2 = r2.c(r6);	 Catch:{ IOException -> 0x0076 }
            r3 = defpackage.akji.a;	 Catch:{ IOException -> 0x0076 }
            r6 = java.util.logging.Level.FINE;	 Catch:{ IOException -> 0x0076 }
            r3 = r3.isLoggable(r6);	 Catch:{ IOException -> 0x0076 }
            if (r3 == 0) goto L_0x0046;	 Catch:{ IOException -> 0x0076 }
            r3 = defpackage.akji.a;	 Catch:{ IOException -> 0x0076 }
            r6 = "<< CONNECTION %s";	 Catch:{ IOException -> 0x0076 }
            r7 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x0076 }
            r8 = r2.e();	 Catch:{ IOException -> 0x0076 }
            r7[r5] = r8;	 Catch:{ IOException -> 0x0076 }
            r6 = defpackage.akib.a(r6, r7);	 Catch:{ IOException -> 0x0076 }
            r3.fine(r6);	 Catch:{ IOException -> 0x0076 }
            r3 = defpackage.akjf.a;	 Catch:{ IOException -> 0x0076 }
            r3 = r3.equals(r2);	 Catch:{ IOException -> 0x0076 }
            if (r3 == 0) goto L_0x0065;	 Catch:{ IOException -> 0x0076 }
            r2 = r9.b;	 Catch:{ IOException -> 0x0076 }
            r2 = r2.a(r5, r9);	 Catch:{ IOException -> 0x0076 }
            if (r2 != 0) goto L_0x004e;	 Catch:{ IOException -> 0x0076 }
            r0 = defpackage.akjc.NO_ERROR;	 Catch:{ IOException -> 0x0076 }
            r1 = defpackage.akjc.CANCEL;	 Catch:{ IOException -> 0x0076 }
            r2 = defpackage.akjh.this;	 Catch:{ IOException -> 0x005f }
            r2.a(r0, r1);	 Catch:{ IOException -> 0x005f }
            r0 = r9.b;
            defpackage.akib.a(r0);
            return;
            r3 = "Expected a connection header but was %s";	 Catch:{ IOException -> 0x0076 }
            r4 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x0076 }
            r2 = r2.a();	 Catch:{ IOException -> 0x0076 }
            r4[r5] = r2;	 Catch:{ IOException -> 0x0076 }
            r2 = defpackage.akjf.b(r3, r4);	 Catch:{ IOException -> 0x0076 }
            throw r2;	 Catch:{ IOException -> 0x0076 }
            r2 = move-exception;
            goto L_0x007d;
        L_0x0076:
            r0 = defpackage.akjc.PROTOCOL_ERROR;	 Catch:{ all -> 0x0074 }
            r1 = defpackage.akjc.PROTOCOL_ERROR;	 Catch:{ all -> 0x0074 }
            r2 = defpackage.akjh.this;	 Catch:{ IOException -> 0x005f }
            goto L_0x005c;
            r3 = defpackage.akjh.this;	 Catch:{ IOException -> 0x0082 }
            r3.a(r0, r1);	 Catch:{ IOException -> 0x0082 }
            r0 = r9.b;
            defpackage.akib.a(r0);
            throw r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akjh$c.b():void");
        }
    }

    public akjh(a aVar) {
        this.j = aVar.f;
        this.b = aVar.g;
        this.c = aVar.e;
        int i = 2;
        this.g = aVar.g ? 1 : 2;
        if (aVar.g) {
            this.g += 2;
        }
        if (aVar.g) {
            i = 1;
        }
        this.s = i;
        if (aVar.g) {
            this.m.a(7, LaExpander.DEFAULT_KITKAT_LINEAR_ALLOC_SIZE);
        }
        this.e = aVar.b;
        this.i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), akib.a(akib.a("OkHttp %s Push Observer", this.e), true));
        this.n.a(7, 65535);
        this.n.a(5, 16384);
        this.l = (long) this.n.b();
        this.t = aVar.a;
        this.p = new akjk(aVar.d, this.b);
        this.q = new c(new akji(aVar.c, this.b));
    }

    private void a(akjc akjc) {
        synchronized (this.p) {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.h = true;
                int i = this.f;
                this.p.a(i, akjc, akib.a);
            }
        }
    }

    static boolean c(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final synchronized int a() {
        akjo akjo = this.n;
        if ((akjo.a & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return akjo.b[4];
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized akjj a(int i) {
        return (akjj) this.d.get(Integer.valueOf(i));
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    public final defpackage.akjj a(java.util.List<defpackage.akjd> r11, boolean r12) {
        /*
        r10 = this;
        r6 = r12 ^ 1;
        r7 = r10.p;
        monitor-enter(r7);
        monitor-enter(r10);	 Catch:{ all -> 0x0058 }
        r0 = r10.h;	 Catch:{ all -> 0x0055 }
        if (r0 != 0) goto L_0x004f;
    L_0x000a:
        r8 = r10.g;	 Catch:{ all -> 0x0055 }
        r0 = r10.g;	 Catch:{ all -> 0x0055 }
        r0 = r0 + 2;
        r10.g = r0;	 Catch:{ all -> 0x0055 }
        r9 = new akjj;	 Catch:{ all -> 0x0055 }
        r4 = 0;
        r0 = r9;
        r1 = r8;
        r2 = r10;
        r3 = r6;
        r5 = r11;
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0055 }
        if (r12 == 0) goto L_0x0030;
    L_0x001f:
        r0 = r10.l;	 Catch:{ all -> 0x0055 }
        r2 = 0;
        r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r12 == 0) goto L_0x0030;
    L_0x0027:
        r0 = r9.b;	 Catch:{ all -> 0x0055 }
        r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r12 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0030;
    L_0x002e:
        r12 = 0;
        goto L_0x0031;
    L_0x0030:
        r12 = 1;
    L_0x0031:
        r0 = r9.a();	 Catch:{ all -> 0x0055 }
        if (r0 == 0) goto L_0x0040;
    L_0x0037:
        r0 = r10.d;	 Catch:{ all -> 0x0055 }
        r1 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x0055 }
        r0.put(r1, r9);	 Catch:{ all -> 0x0055 }
    L_0x0040:
        monitor-exit(r10);	 Catch:{ all -> 0x0055 }
        r0 = r10.p;	 Catch:{ all -> 0x0058 }
        r0.a(r6, r8, r11);	 Catch:{ all -> 0x0058 }
        monitor-exit(r7);	 Catch:{ all -> 0x0058 }
        if (r12 == 0) goto L_0x004e;
    L_0x0049:
        r11 = r10.p;
        r11.b();
    L_0x004e:
        return r9;
    L_0x004f:
        r11 = new akjb;	 Catch:{ all -> 0x0055 }
        r11.<init>();	 Catch:{ all -> 0x0055 }
        throw r11;	 Catch:{ all -> 0x0055 }
    L_0x0055:
        r11 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x0055 }
        throw r11;	 Catch:{ all -> 0x0058 }
    L_0x0058:
        r11 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0058 }
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjh.a(java.util.List, boolean):akjj");
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, long j) {
        final int i2 = i;
        final long j2 = j;
        a.execute(new akia("OkHttp Window Update %s stream %d", new Object[]{this.e, Integer.valueOf(i)}) {
            public final void b() {
                try {
                    akjh.this.p.a(i2, j2);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, akjc akjc) {
        final int i2 = i;
        final akjc akjc2 = akjc;
        a.execute(new akia("OkHttp %s stream %d", new Object[]{this.e, Integer.valueOf(i)}) {
            public final void b() {
                try {
                    akjh.this.b(i2, akjc2);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.l), r8.p.a);
            r6 = (long) r3;
            r8.l -= r6;
     */
    /* JADX WARNING: Missing block: B:28:0x005d, code skipped:
            throw new java.io.InterruptedIOException();
     */
    public final void a(int r9, boolean r10, defpackage.akkd r11, long r12) {
        /*
        r8 = this;
        r0 = 0;
        r1 = 0;
        r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1));
        if (r3 != 0) goto L_0x000d;
    L_0x0007:
        r12 = r8.p;
        r12.a(r10, r9, r11, r0);
        return;
    L_0x000d:
        r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1));
        if (r3 <= 0) goto L_0x0060;
    L_0x0011:
        monitor-enter(r8);
    L_0x0012:
        r3 = r8.l;	 Catch:{ InterruptedException -> 0x0058 }
        r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r5 > 0) goto L_0x0030;
    L_0x0018:
        r3 = r8.d;	 Catch:{ InterruptedException -> 0x0058 }
        r4 = java.lang.Integer.valueOf(r9);	 Catch:{ InterruptedException -> 0x0058 }
        r3 = r3.containsKey(r4);	 Catch:{ InterruptedException -> 0x0058 }
        if (r3 == 0) goto L_0x0028;
    L_0x0024:
        r8.wait();	 Catch:{ InterruptedException -> 0x0058 }
        goto L_0x0012;
    L_0x0028:
        r9 = new java.io.IOException;	 Catch:{ InterruptedException -> 0x0058 }
        r10 = "stream closed";
        r9.<init>(r10);	 Catch:{ InterruptedException -> 0x0058 }
        throw r9;	 Catch:{ InterruptedException -> 0x0058 }
    L_0x0030:
        r3 = r8.l;	 Catch:{ all -> 0x0056 }
        r3 = java.lang.Math.min(r12, r3);	 Catch:{ all -> 0x0056 }
        r4 = (int) r3;	 Catch:{ all -> 0x0056 }
        r3 = r8.p;	 Catch:{ all -> 0x0056 }
        r3 = r3.a;	 Catch:{ all -> 0x0056 }
        r3 = java.lang.Math.min(r4, r3);	 Catch:{ all -> 0x0056 }
        r4 = r8.l;	 Catch:{ all -> 0x0056 }
        r6 = (long) r3;	 Catch:{ all -> 0x0056 }
        r4 = r4 - r6;
        r8.l = r4;	 Catch:{ all -> 0x0056 }
        monitor-exit(r8);	 Catch:{ all -> 0x0056 }
        r12 = r12 - r6;
        r4 = r8.p;
        if (r10 == 0) goto L_0x0051;
    L_0x004b:
        r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1));
        if (r5 != 0) goto L_0x0051;
    L_0x004f:
        r5 = 1;
        goto L_0x0052;
    L_0x0051:
        r5 = 0;
    L_0x0052:
        r4.a(r5, r9, r11, r3);
        goto L_0x000d;
    L_0x0056:
        r9 = move-exception;
        goto L_0x005e;
    L_0x0058:
        r9 = new java.io.InterruptedIOException;	 Catch:{ all -> 0x0056 }
        r9.<init>();	 Catch:{ all -> 0x0056 }
        throw r9;	 Catch:{ all -> 0x0056 }
    L_0x005e:
        monitor-exit(r8);	 Catch:{ all -> 0x0056 }
        throw r9;
    L_0x0060:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjh.a(int, boolean, akkd, long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:46:0x0066 in {4, 6, 10, 11, 16, 24, 27, 28, 31, 34, 37, 38, 40, 41, 45} preds:[]
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
    final void a(defpackage.akjc r5, defpackage.akjc r6) {
        /*
        r4 = this;
        r0 = u;
        if (r0 != 0) goto L_0x0011;
        r0 = java.lang.Thread.holdsLock(r4);
        if (r0 != 0) goto L_0x000b;
        goto L_0x0011;
        r5 = new java.lang.AssertionError;
        r5.<init>();
        throw r5;
        r0 = 0;
        r4.a(r5);	 Catch:{ IOException -> 0x0017 }
        r5 = r0;
        goto L_0x0018;
        r5 = move-exception;
        monitor-enter(r4);
        r1 = r4.d;	 Catch:{ all -> 0x0063 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0063 }
        if (r1 != 0) goto L_0x003a;	 Catch:{ all -> 0x0063 }
        r0 = r4.d;	 Catch:{ all -> 0x0063 }
        r0 = r0.values();	 Catch:{ all -> 0x0063 }
        r1 = r4.d;	 Catch:{ all -> 0x0063 }
        r1 = r1.size();	 Catch:{ all -> 0x0063 }
        r1 = new defpackage.akjj[r1];	 Catch:{ all -> 0x0063 }
        r0 = r0.toArray(r1);	 Catch:{ all -> 0x0063 }
        r0 = (defpackage.akjj[]) r0;	 Catch:{ all -> 0x0063 }
        r1 = r4.d;	 Catch:{ all -> 0x0063 }
        r1.clear();	 Catch:{ all -> 0x0063 }
        monitor-exit(r4);	 Catch:{ all -> 0x0063 }
        if (r0 == 0) goto L_0x004e;
        r1 = r0.length;
        r2 = 0;
        if (r2 >= r1) goto L_0x004e;
        r3 = r0[r2];
        r3.a(r6);	 Catch:{ IOException -> 0x0047 }
        goto L_0x004b;
        r3 = move-exception;
        if (r5 == 0) goto L_0x004b;
        r5 = r3;
        r2 = r2 + 1;
        goto L_0x003f;
        r6 = r4.p;	 Catch:{ IOException -> 0x0054 }
        r6.close();	 Catch:{ IOException -> 0x0054 }
        goto L_0x0058;
        r6 = move-exception;
        if (r5 != 0) goto L_0x0058;
        r5 = r6;
        r6 = r4.t;	 Catch:{ IOException -> 0x005e }
        r6.close();	 Catch:{ IOException -> 0x005e }
        goto L_0x005f;
        r5 = move-exception;
        if (r5 != 0) goto L_0x0062;
        return;
        throw r5;
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0063 }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjh.a(akjc, akjc):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z, int i, int i2, akjm akjm) {
        synchronized (this.p) {
            if (akjm != null) {
                if (akjm.a == -1) {
                    akjm.a = System.nanoTime();
                } else {
                    throw new IllegalStateException();
                }
            }
            this.p.a(z, i, i2);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized akjj b(int i) {
        akjj akjj;
        akjj = (akjj) this.d.remove(Integer.valueOf(i));
        notifyAll();
        return akjj;
    }

    /* Access modifiers changed, original: final */
    public final void b(int i, akjc akjc) {
        this.p.a(i, akjc);
    }

    public final synchronized boolean b() {
        return this.h;
    }

    public final void close() {
        a(akjc.NO_ERROR, akjc.CANCEL);
    }
}
