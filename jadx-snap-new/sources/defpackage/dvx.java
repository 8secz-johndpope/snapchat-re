package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: dvx */
public final class dvx {
    public final Object a = new Object();
    public boolean b;
    public final List<a> c;
    public final abtl d;
    final int e;
    int f;
    public volatile int g;
    final b h;
    private final dyf i;
    private final adhk j;

    /* renamed from: dvx$b */
    public interface b {
        void a(a aVar);
    }

    /* renamed from: dvx$a */
    public static class a {
        public final adhd a;
        volatile boolean b;
        public volatile dyy c;
        public final dye d;
        private final dvx e;
        private final adhk f;
        private int g;

        private a(dvx dvx, adhk adhk, dyf dyf, int i, int i2) {
            this.a = new adhd(i, i2, -1);
            this.e = dvx;
            this.f = adhk;
            this.d = dyf.a == adhl.GLES30 ? new dyg(dyf.b) : new dyh();
        }

        /* synthetic */ a(dvx dvx, adhk adhk, dyf dyf, int i, int i2, byte b) {
            this(dvx, adhk, dyf, i, i2);
        }

        public final synchronized void a() {
            this.g++;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0026 */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:14|15|16|17|18|19) */
        /* JADX WARNING: Missing block: B:31:0x0048, code skipped:
            return;
     */
        public final synchronized void b() {
            /*
            r5 = this;
            monitor-enter(r5);
            r0 = r5.g;	 Catch:{ all -> 0x0049 }
            r1 = 1;
            r0 = r0 - r1;
            r5.g = r0;	 Catch:{ all -> 0x0049 }
            r0 = r5.g;	 Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0047;
        L_0x000b:
            r0 = r5.b;	 Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0047;
        L_0x000f:
            r5.b = r1;	 Catch:{ all -> 0x0049 }
            r0 = r5.e;	 Catch:{ all -> 0x0049 }
            r1 = r0.a;	 Catch:{ all -> 0x0049 }
            monitor-enter(r1);	 Catch:{ all -> 0x0049 }
            r2 = r0.h;	 Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x001f;
        L_0x001a:
            r2 = r0.h;	 Catch:{ all -> 0x0044 }
            r2.a(r5);	 Catch:{ all -> 0x0044 }
        L_0x001f:
            r2 = r0.b;	 Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0029;
        L_0x0023:
            r5.c();	 Catch:{ adjw -> 0x0026 }
        L_0x0026:
            monitor-exit(r1);	 Catch:{ all -> 0x0044 }
            monitor-exit(r5);
            return;
        L_0x0029:
            r2 = r0.c;	 Catch:{ all -> 0x0044 }
            r2.add(r5);	 Catch:{ all -> 0x0044 }
            r2 = r0.a;	 Catch:{ all -> 0x0044 }
            r2.notifyAll();	 Catch:{ all -> 0x0044 }
            r2 = r0.c;	 Catch:{ all -> 0x0044 }
            r2 = r2.size();	 Catch:{ all -> 0x0044 }
            r3 = r0.e;	 Catch:{ all -> 0x0044 }
            r4 = r0.f;	 Catch:{ all -> 0x0044 }
            r3 = r3 - r4;
            r2 = r2 + r3;
            r0.g = r2;	 Catch:{ all -> 0x0044 }
            monitor-exit(r1);	 Catch:{ all -> 0x0044 }
            monitor-exit(r5);
            return;
        L_0x0044:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0044 }
            throw r0;	 Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r5);
            return;
        L_0x0049:
            r0 = move-exception;
            monitor-exit(r5);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dvx$a.b():void");
        }

        public final void c() {
            this.a.b();
            this.d.c();
        }
    }

    public dvx(int i, int i2, int i3, dyf dyf, adhk adhk, b bVar) {
        synchronized (this.a) {
            this.b = false;
            this.c = new ArrayList(i);
        }
        this.j = adhk;
        this.i = dyf;
        this.d = new abtl((i2 / 4) << 2, (i3 / 4) << 2);
        this.f = 0;
        this.e = i;
        this.g = i;
        this.h = bVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0060 in {6, 9, 11, 16, 20} preds:[]
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
    public final defpackage.dvx.a a() {
        /*
        r9 = this;
        r0 = 0;
        r1 = r9.a;
        monitor-enter(r1);
        r2 = r9.c;	 Catch:{ all -> 0x005d }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x005d }
        if (r2 != 0) goto L_0x001d;	 Catch:{ all -> 0x005d }
        r0 = r9.c;	 Catch:{ all -> 0x005d }
        r2 = r9.c;	 Catch:{ all -> 0x005d }
        r2 = r2.size();	 Catch:{ all -> 0x005d }
        r2 = r2 + -1;	 Catch:{ all -> 0x005d }
        r0 = r0.remove(r2);	 Catch:{ all -> 0x005d }
        r0 = (defpackage.dvx.a) r0;	 Catch:{ all -> 0x005d }
        goto L_0x0041;	 Catch:{ all -> 0x005d }
        r2 = r9.f;	 Catch:{ all -> 0x005d }
        r3 = r9.e;	 Catch:{ all -> 0x005d }
        if (r2 >= r3) goto L_0x0041;	 Catch:{ all -> 0x005d }
        r0 = r9.f;	 Catch:{ all -> 0x005d }
        r0 = r0 + 1;	 Catch:{ all -> 0x005d }
        r9.f = r0;	 Catch:{ all -> 0x005d }
        r0 = new dvx$a;	 Catch:{ all -> 0x005d }
        r4 = r9.j;	 Catch:{ all -> 0x005d }
        r5 = r9.i;	 Catch:{ all -> 0x005d }
        r2 = r9.d;	 Catch:{ all -> 0x005d }
        r6 = r2.b();	 Catch:{ all -> 0x005d }
        r2 = r9.d;	 Catch:{ all -> 0x005d }
        r7 = r2.c();	 Catch:{ all -> 0x005d }
        r8 = 0;	 Catch:{ all -> 0x005d }
        r2 = r0;	 Catch:{ all -> 0x005d }
        r3 = r9;	 Catch:{ all -> 0x005d }
        r2.<init>(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x005d }
        if (r0 != 0) goto L_0x0048;	 Catch:{ all -> 0x005d }
        r2 = r9.a;	 Catch:{ all -> 0x005d }
        r2.wait();	 Catch:{ all -> 0x005d }
        r2 = r9.c;	 Catch:{ all -> 0x005d }
        r2 = r2.size();	 Catch:{ all -> 0x005d }
        r3 = r9.e;	 Catch:{ all -> 0x005d }
        r4 = r9.f;	 Catch:{ all -> 0x005d }
        r3 = r3 - r4;	 Catch:{ all -> 0x005d }
        r2 = r2 + r3;	 Catch:{ all -> 0x005d }
        r9.g = r2;	 Catch:{ all -> 0x005d }
        monitor-exit(r1);	 Catch:{ all -> 0x005d }
        if (r0 == 0) goto L_0x0001;
        r1 = 0;
        r0.b = r1;
        return r0;
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x005d }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvx.a():dvx$a");
    }
}
