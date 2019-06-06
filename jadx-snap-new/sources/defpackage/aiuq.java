package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aiuq */
public class aiuq {
    static final Logger a = Logger.getLogger(aiuq.class.getName());
    private static final aivr<Object<?>, Object> c = new aivr();
    private static aiuq d = new aiuq(c);
    private static final AtomicReference<e> e = new AtomicReference();
    public ArrayList<c> b;
    private b f = new d(this, (byte) 0);
    private a g = null;
    private aivr<Object<?>, Object> h;
    private int i;

    /* renamed from: aiuq$b */
    public interface b {
        void a(aiuq aiuq);
    }

    /* renamed from: aiuq$e */
    public static abstract class e {
        public abstract aiuq a();

        public aiuq a(aiuq aiuq) {
            a();
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        public abstract void a(aiuq aiuq, aiuq aiuq2);
    }

    /* renamed from: aiuq$d */
    class d implements b {
        private d() {
        }

        /* synthetic */ d(aiuq aiuq, byte b) {
            this();
        }

        public final void a(aiuq aiuq) {
            aiuq aiuq2 = aiuq.this;
            if (aiuq2 instanceof a) {
                ((a) aiuq2).a(aiuq.e());
            } else {
                aiuq2.g();
            }
        }
    }

    /* renamed from: aiuq$c */
    public class c implements Runnable {
        final b a;
        private final Executor b;

        private c(Executor executor, b bVar) {
            this.b = executor;
            this.a = bVar;
        }

        public /* synthetic */ c(aiuq aiuq, Executor executor, b bVar, byte b) {
            this(executor, bVar);
        }

        public final void a() {
            try {
                this.b.execute(this);
            } catch (Throwable th) {
                aiuq.a.log(Level.INFO, "Exception notifying context listener", th);
            }
        }

        public final void run() {
            this.a.a(aiuq.this);
        }
    }

    /* renamed from: aiuq$a */
    public static final class a extends aiuq implements Closeable {
        private aius c;
        private final aiuq d;
        private boolean e;
        private Throwable f;

        public final void a(aiuq aiuq) {
            this.d.a(aiuq);
        }

        public final boolean a(Throwable th) {
            boolean z;
            synchronized (this) {
                z = true;
                if (this.e) {
                    z = false;
                } else {
                    this.e = true;
                    this.f = th;
                }
            }
            if (z) {
                g();
            }
            return z;
        }

        /* Access modifiers changed, original: final */
        public final boolean b() {
            return true;
        }

        public final aiuq c() {
            return this.d.c();
        }

        public final void close() {
            a(null);
        }

        /* JADX WARNING: Missing block: B:8:0x000d, code skipped:
            if (super.d() == false) goto L_0x0017;
     */
        /* JADX WARNING: Missing block: B:9:0x000f, code skipped:
            a(super.e());
     */
        /* JADX WARNING: Missing block: B:10:0x0016, code skipped:
            return true;
     */
        /* JADX WARNING: Missing block: B:12:0x0018, code skipped:
            return false;
     */
        public final boolean d() {
            /*
            r2 = this;
            monitor-enter(r2);
            r0 = r2.e;	 Catch:{ all -> 0x0019 }
            r1 = 1;
            if (r0 == 0) goto L_0x0008;
        L_0x0006:
            monitor-exit(r2);	 Catch:{ all -> 0x0019 }
            return r1;
        L_0x0008:
            monitor-exit(r2);	 Catch:{ all -> 0x0019 }
            r0 = super.d();
            if (r0 == 0) goto L_0x0017;
        L_0x000f:
            r0 = super.e();
            r2.a(r0);
            return r1;
        L_0x0017:
            r0 = 0;
            return r0;
        L_0x0019:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0019 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aiuq$a.d():boolean");
        }

        public final Throwable e() {
            return d() ? this.f : null;
        }

        public final aius f() {
            return this.c;
        }
    }

    private aiuq(aivr<Object<?>, Object> aivr) {
        this.h = aivr;
        this.i = 0;
    }

    public static aiuq a() {
        aiuq a = aiuq.h().a();
        return a == null ? d : a;
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private static e h() {
        e eVar = (e) e.get();
        return eVar == null ? aiuq.i() : eVar;
    }

    private static e i() {
        try {
            e.compareAndSet(null, (e) Class.forName("io.grpc.override.ContextStorageOverride").getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException e) {
            if (e.compareAndSet(null, new aiwa())) {
                a.log(Level.FINE, "Storage override doesn't exist. Using default", e);
            }
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        return (e) e.get();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x003b in {2, 11, 12, 15, 17, 20} preds:[]
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
    public final void a(defpackage.aiuq.b r3) {
        /*
        r2 = this;
        r0 = r2.b();
        if (r0 != 0) goto L_0x0007;
        return;
        monitor-enter(r2);
        r0 = r2.b;	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0036;	 Catch:{ all -> 0x0038 }
        r0 = r2.b;	 Catch:{ all -> 0x0038 }
        r0 = r0.size();	 Catch:{ all -> 0x0038 }
        r0 = r0 + -1;	 Catch:{ all -> 0x0038 }
        if (r0 < 0) goto L_0x002b;	 Catch:{ all -> 0x0038 }
        r1 = r2.b;	 Catch:{ all -> 0x0038 }
        r1 = r1.get(r0);	 Catch:{ all -> 0x0038 }
        r1 = (defpackage.aiuq.c) r1;	 Catch:{ all -> 0x0038 }
        r1 = r1.a;	 Catch:{ all -> 0x0038 }
        if (r1 != r3) goto L_0x0028;	 Catch:{ all -> 0x0038 }
        r3 = r2.b;	 Catch:{ all -> 0x0038 }
        r3.remove(r0);	 Catch:{ all -> 0x0038 }
        goto L_0x002b;	 Catch:{ all -> 0x0038 }
        r0 = r0 + -1;	 Catch:{ all -> 0x0038 }
        goto L_0x0014;	 Catch:{ all -> 0x0038 }
        r3 = r2.b;	 Catch:{ all -> 0x0038 }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x0038 }
        if (r3 == 0) goto L_0x0036;	 Catch:{ all -> 0x0038 }
        r3 = 0;	 Catch:{ all -> 0x0038 }
        r2.b = r3;	 Catch:{ all -> 0x0038 }
        monitor-exit(r2);	 Catch:{ all -> 0x0038 }
        return;	 Catch:{ all -> 0x0038 }
        r3 = move-exception;	 Catch:{ all -> 0x0038 }
        monitor-exit(r2);	 Catch:{ all -> 0x0038 }
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiuq.a(aiuq$b):void");
    }

    public void a(aiuq aiuq) {
        aiuq.a(aiuq, "toAttach");
        aiuq.h().a(this, aiuq);
    }

    public boolean b() {
        return false;
    }

    public aiuq c() {
        aiuq a = aiuq.h().a(this);
        return a == null ? d : a;
    }

    public boolean d() {
        return false;
    }

    public Throwable e() {
        return null;
    }

    public aius f() {
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x0056 in {2, 8, 16, 17, 22, 23, 24, 28} preds:[]
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
    final void g() {
        /*
        r4 = this;
        r0 = r4.b();
        if (r0 != 0) goto L_0x0007;
        return;
        monitor-enter(r4);
        r0 = r4.b;	 Catch:{ all -> 0x0053 }
        if (r0 != 0) goto L_0x000e;	 Catch:{ all -> 0x0053 }
        monitor-exit(r4);	 Catch:{ all -> 0x0053 }
        return;	 Catch:{ all -> 0x0053 }
        r0 = r4.b;	 Catch:{ all -> 0x0053 }
        r1 = 0;	 Catch:{ all -> 0x0053 }
        r4.b = r1;	 Catch:{ all -> 0x0053 }
        monitor-exit(r4);	 Catch:{ all -> 0x0053 }
        r1 = 0;
        r2 = 0;
        r3 = r0.size();
        if (r2 >= r3) goto L_0x0034;
        r3 = r0.get(r2);
        r3 = (defpackage.aiuq.c) r3;
        r3 = r3.a;
        r3 = r3 instanceof defpackage.aiuq.d;
        if (r3 != 0) goto L_0x0031;
        r3 = r0.get(r2);
        r3 = (defpackage.aiuq.c) r3;
        r3.a();
        r2 = r2 + 1;
        goto L_0x0016;
        r2 = r0.size();
        if (r1 >= r2) goto L_0x0052;
        r2 = r0.get(r1);
        r2 = (defpackage.aiuq.c) r2;
        r2 = r2.a;
        r2 = r2 instanceof defpackage.aiuq.d;
        if (r2 == 0) goto L_0x004f;
        r2 = r0.get(r1);
        r2 = (defpackage.aiuq.c) r2;
        r2.a();
        r1 = r1 + 1;
        goto L_0x0034;
        return;
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0053 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiuq.g():void");
    }
}
