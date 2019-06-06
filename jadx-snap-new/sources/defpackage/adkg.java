package defpackage;

import android.os.Debug;
import com.google.common.base.Preconditions;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: adkg */
public final class adkg {
    volatile long a;
    private final long b;
    private final b c;
    private final admz d;
    private final zfw e;
    private Set<a> f;
    private volatile boolean g;
    private ajej h;

    /* renamed from: adkg$a */
    public interface a {
        void b();
    }

    /* renamed from: adkg$b */
    public interface b {
        void w();
    }

    private adkg(b bVar, admz admz, zfw zfw) {
        this.f = new HashSet();
        this.g = false;
        Preconditions.checkArgument(true);
        this.b = 5000;
        this.c = (b) Preconditions.checkNotNull(bVar);
        this.d = admz;
        this.e = zfw;
    }

    public adkg(b bVar, zfw zfw) {
        this(bVar, new admz(), zfw);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x001c in {6, 8, 11} preds:[]
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
    private synchronized void c() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f;	 Catch:{ all -> 0x0019 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0019 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0019 }
        if (r1 == 0) goto L_0x0017;	 Catch:{ all -> 0x0019 }
        r1 = r0.next();	 Catch:{ all -> 0x0019 }
        r1 = (defpackage.adkg.a) r1;	 Catch:{ all -> 0x0019 }
        r1.b();	 Catch:{ all -> 0x0019 }
        goto L_0x0007;
        monitor-exit(r2);
        return;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adkg.c():void");
    }

    private /* synthetic */ void d() {
        if (this.g) {
            Object obj = ((System.nanoTime() - this.a) / 1000000 <= 5000 || Debug.isDebuggerConnected()) ? null : 1;
            if (obj != null) {
                b();
                c();
                this.c.w();
            }
        }
    }

    public final synchronized void a() {
        if (!this.g) {
            this.g = true;
            this.a = System.nanoTime();
            this.h = this.e.b().a(new -$$Lambda$adkg$Gf1JMkpELRl2O4qWPGfIMA3cTzw(this), 0, 1000, TimeUnit.MILLISECONDS);
        }
    }

    public final synchronized void a(a aVar) {
        this.f.add(aVar);
    }

    public final synchronized void b() {
        if (this.g) {
            this.g = false;
            this.h.dispose();
        }
    }
}
