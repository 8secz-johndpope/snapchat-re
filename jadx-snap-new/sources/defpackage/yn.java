package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: yn */
public class yn implements afl {
    private static final agi e = ((agi) agi.b(Bitmap.class).d());
    private static final agi f = ((agi) agi.b(aeo.class).d());
    protected final yh a;
    protected final Context b;
    final afk c;
    final CopyOnWriteArrayList<agh<Object>> d;
    private final afq g;
    private final afp h;
    private final afr i;
    private final Runnable j;
    private final Handler k;
    private final aff l;
    private agi m;

    /* renamed from: yn$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            yn.this.c.a(yn.this);
        }
    }

    /* renamed from: yn$a */
    class a implements defpackage.aff.a {
        private final afq a;

        a(afq afq) {
            this.a = afq;
        }

        public final void a(boolean z) {
            if (z) {
                synchronized (yn.this) {
                    afq afq = this.a;
                    for (agf agf : ahm.a(afq.a)) {
                        if (!(agf.e() || agf.g())) {
                            agf.c();
                            if (afq.c) {
                                afq.b.add(agf);
                            } else {
                                agf.a();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        ((agi) agi.b(aal.b).a(yk.LOW)).b(true);
    }

    private yn(yh yhVar, afk afk, afp afp, afq afq, afg afg, Context context) {
        this.i = new afr();
        this.j = new 1();
        this.k = new Handler(Looper.getMainLooper());
        this.a = yhVar;
        this.c = afk;
        this.h = afp;
        this.g = afq;
        this.b = context;
        this.l = afg.a(context.getApplicationContext(), new a(afq));
        if (ahm.c()) {
            this.k.post(this.j);
        } else {
            afk.a(this);
        }
        afk.a(this.l);
        this.d = new CopyOnWriteArrayList(yhVar.b.e);
        a(yhVar.b.d);
        synchronized (yhVar.g) {
            if (yhVar.g.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            yhVar.g.add(this);
        }
    }

    public yn(yh yhVar, afk afk, afp afp, Context context) {
        this(yhVar, afk, afp, new afq(), yhVar.f, context);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0030 in {8, 10, 13} preds:[]
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
    private synchronized void g() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.g;	 Catch:{ all -> 0x002d }
        r1 = 1;	 Catch:{ all -> 0x002d }
        r0.c = r1;	 Catch:{ all -> 0x002d }
        r1 = r0.a;	 Catch:{ all -> 0x002d }
        r1 = defpackage.ahm.a(r1);	 Catch:{ all -> 0x002d }
        r1 = r1.iterator();	 Catch:{ all -> 0x002d }
        r2 = r1.hasNext();	 Catch:{ all -> 0x002d }
        if (r2 == 0) goto L_0x002b;	 Catch:{ all -> 0x002d }
        r2 = r1.next();	 Catch:{ all -> 0x002d }
        r2 = (defpackage.agf) r2;	 Catch:{ all -> 0x002d }
        r3 = r2.d();	 Catch:{ all -> 0x002d }
        if (r3 == 0) goto L_0x0010;	 Catch:{ all -> 0x002d }
        r2.c();	 Catch:{ all -> 0x002d }
        r3 = r0.b;	 Catch:{ all -> 0x002d }
        r3.add(r2);	 Catch:{ all -> 0x002d }
        goto L_0x0010;
        monitor-exit(r4);
        return;
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn.g():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0036 in {9, 12, 15} preds:[]
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
    private synchronized void h() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.g;	 Catch:{ all -> 0x0033 }
        r1 = 0;	 Catch:{ all -> 0x0033 }
        r0.c = r1;	 Catch:{ all -> 0x0033 }
        r1 = r0.a;	 Catch:{ all -> 0x0033 }
        r1 = defpackage.ahm.a(r1);	 Catch:{ all -> 0x0033 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0033 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0033 }
        if (r2 == 0) goto L_0x002c;	 Catch:{ all -> 0x0033 }
        r2 = r1.next();	 Catch:{ all -> 0x0033 }
        r2 = (defpackage.agf) r2;	 Catch:{ all -> 0x0033 }
        r3 = r2.e();	 Catch:{ all -> 0x0033 }
        if (r3 != 0) goto L_0x0010;	 Catch:{ all -> 0x0033 }
        r3 = r2.d();	 Catch:{ all -> 0x0033 }
        if (r3 != 0) goto L_0x0010;	 Catch:{ all -> 0x0033 }
        r2.a();	 Catch:{ all -> 0x0033 }
        goto L_0x0010;	 Catch:{ all -> 0x0033 }
        r0 = r0.b;	 Catch:{ all -> 0x0033 }
        r0.clear();	 Catch:{ all -> 0x0033 }
        monitor-exit(r4);
        return;
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn.h():void");
    }

    public <ResourceType> ym<ResourceType> a(Class<ResourceType> cls) {
        return new ym(this.a, this, cls, this.b);
    }

    public final synchronized void a() {
        h();
        this.i.a();
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void a(agi agi) {
        this.m = (agi) ((agi) agi.clone()).e();
    }

    /* JADX WARNING: Missing block: B:13:0x0025, code skipped:
            return;
     */
    public final synchronized void a(defpackage.agr<?> r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        if (r3 != 0) goto L_0x0005;
    L_0x0003:
        monitor-exit(r2);
        return;
    L_0x0005:
        r0 = r2.b(r3);	 Catch:{ all -> 0x0026 }
        if (r0 != 0) goto L_0x0024;
    L_0x000b:
        r0 = r2.a;	 Catch:{ all -> 0x0026 }
        r0 = r0.a(r3);	 Catch:{ all -> 0x0026 }
        if (r0 != 0) goto L_0x0024;
    L_0x0013:
        r0 = r3.d();	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x0024;
    L_0x0019:
        r0 = r3.d();	 Catch:{ all -> 0x0026 }
        r1 = 0;
        r3.a(r1);	 Catch:{ all -> 0x0026 }
        r0.c();	 Catch:{ all -> 0x0026 }
    L_0x0024:
        monitor-exit(r2);
        return;
    L_0x0026:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn.a(agr):void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(agr<?> agr, agf agf) {
        this.i.a.add(agr);
        afq afq = this.g;
        afq.a.add(agf);
        if (afq.c) {
            agf.c();
            if (Log.isLoggable("RequestTracker", 2)) {
                Log.v("RequestTracker", "Paused, delaying request");
            }
            afq.b.add(agf);
            return;
        }
        agf.a();
    }

    /* Access modifiers changed, original: final */
    public final <T> yo<?, T> b(Class<T> cls) {
        GlideContext glideContext = this.a.b;
        yo<?, T> yoVar = (yo) glideContext.f.get(cls);
        if (yoVar == null) {
            for (Entry entry : glideContext.f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    yo yoVar2 = (yo) entry.getValue();
                }
            }
        }
        return yoVar == null ? GlideContext.a : yoVar;
    }

    public final synchronized void b() {
        g();
        this.i.b();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean b(agr<?> agr) {
        agf d = agr.d();
        if (d == null) {
            return true;
        }
        if (!this.g.a(d, true)) {
            return false;
        }
        this.i.a.remove(agr);
        agr.a(null);
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x0081 in {5, 9, 18, 21, 25, 28} preds:[]
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
    public final synchronized void c() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.i;	 Catch:{ all -> 0x007e }
        r0.c();	 Catch:{ all -> 0x007e }
        r0 = r4.i;	 Catch:{ all -> 0x007e }
        r0 = r0.a;	 Catch:{ all -> 0x007e }
        r0 = defpackage.ahm.a(r0);	 Catch:{ all -> 0x007e }
        r0 = r0.iterator();	 Catch:{ all -> 0x007e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x007e }
        if (r1 == 0) goto L_0x0022;	 Catch:{ all -> 0x007e }
        r1 = r0.next();	 Catch:{ all -> 0x007e }
        r1 = (defpackage.agr) r1;	 Catch:{ all -> 0x007e }
        r4.a(r1);	 Catch:{ all -> 0x007e }
        goto L_0x0012;	 Catch:{ all -> 0x007e }
        r0 = r4.i;	 Catch:{ all -> 0x007e }
        r0 = r0.a;	 Catch:{ all -> 0x007e }
        r0.clear();	 Catch:{ all -> 0x007e }
        r0 = r4.g;	 Catch:{ all -> 0x007e }
        r1 = r0.a;	 Catch:{ all -> 0x007e }
        r1 = defpackage.ahm.a(r1);	 Catch:{ all -> 0x007e }
        r1 = r1.iterator();	 Catch:{ all -> 0x007e }
        r2 = r1.hasNext();	 Catch:{ all -> 0x007e }
        if (r2 == 0) goto L_0x0046;	 Catch:{ all -> 0x007e }
        r2 = r1.next();	 Catch:{ all -> 0x007e }
        r2 = (defpackage.agf) r2;	 Catch:{ all -> 0x007e }
        r3 = 0;	 Catch:{ all -> 0x007e }
        r0.a(r2, r3);	 Catch:{ all -> 0x007e }
        goto L_0x0035;	 Catch:{ all -> 0x007e }
        r0 = r0.b;	 Catch:{ all -> 0x007e }
        r0.clear();	 Catch:{ all -> 0x007e }
        r0 = r4.c;	 Catch:{ all -> 0x007e }
        r0.b(r4);	 Catch:{ all -> 0x007e }
        r0 = r4.c;	 Catch:{ all -> 0x007e }
        r1 = r4.l;	 Catch:{ all -> 0x007e }
        r0.b(r1);	 Catch:{ all -> 0x007e }
        r0 = r4.k;	 Catch:{ all -> 0x007e }
        r1 = r4.j;	 Catch:{ all -> 0x007e }
        r0.removeCallbacks(r1);	 Catch:{ all -> 0x007e }
        r0 = r4.a;	 Catch:{ all -> 0x007e }
        r1 = r0.g;	 Catch:{ all -> 0x007e }
        monitor-enter(r1);	 Catch:{ all -> 0x007e }
        r2 = r0.g;	 Catch:{ all -> 0x007b }
        r2 = r2.contains(r4);	 Catch:{ all -> 0x007b }
        if (r2 == 0) goto L_0x0073;	 Catch:{ all -> 0x007b }
        r0 = r0.g;	 Catch:{ all -> 0x007b }
        r0.remove(r4);	 Catch:{ all -> 0x007b }
        monitor-exit(r1);	 Catch:{ all -> 0x007b }
        monitor-exit(r4);
        return;
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x007b }
        r2 = "Cannot unregister not yet registered manager";	 Catch:{ all -> 0x007b }
        r0.<init>(r2);	 Catch:{ all -> 0x007b }
        throw r0;	 Catch:{ all -> 0x007b }
        r0 = move-exception;	 Catch:{ all -> 0x007b }
        monitor-exit(r1);	 Catch:{ all -> 0x007b }
        throw r0;	 Catch:{ all -> 0x007e }
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn.c():void");
    }

    public ym<Bitmap> d() {
        return a(Bitmap.class).b(e);
    }

    public ym<aeo> e() {
        return a(aeo.class).b(f);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized agi f() {
        return this.m;
    }

    public synchronized String toString() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{tracker=");
        stringBuilder.append(this.g);
        stringBuilder.append(", treeNode=");
        stringBuilder.append(this.h);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
