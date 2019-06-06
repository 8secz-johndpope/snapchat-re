package defpackage;

import android.net.Uri;
import com.google.common.collect.Sets;
import defpackage.gfw.b;
import defpackage.gfw.c;
import defpackage.gfw.d;
import defpackage.git.a;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: giv */
public final class giv {
    final Set<a> a = Sets.newConcurrentHashSet();
    final Set<ajdq<gfw>> b = Sets.newConcurrentHashSet();
    private final AtomicReference<gfw> c = new AtomicReference();
    private volatile gfw d = c.a;
    private final Uri e;

    public giv(Uri uri) {
        akcr.b(uri, "contentUri");
        this.e = uri;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x0054 in {6, 12, 14, 18, 21, 22, 23, 26, 29} preds:[]
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
    public final synchronized defpackage.giv a(defpackage.git.a r2, defpackage.gej r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = "tracker";	 Catch:{ all -> 0x0051 }
        defpackage.akcr.b(r2, r0);	 Catch:{ all -> 0x0051 }
        r0 = "result";	 Catch:{ all -> 0x0051 }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x0051 }
        r0 = r1.a;	 Catch:{ all -> 0x0051 }
        r2 = r0.remove(r2);	 Catch:{ all -> 0x0051 }
        if (r2 != 0) goto L_0x0016;
        r2 = 0;
        monitor-exit(r1);
        return r2;
        r2 = r3.a();	 Catch:{ all -> 0x0051 }
        if (r2 != 0) goto L_0x0027;	 Catch:{ all -> 0x0051 }
        r2 = r1.a;	 Catch:{ all -> 0x0051 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0051 }
        if (r2 == 0) goto L_0x0025;
        goto L_0x0027;
        monitor-exit(r1);
        return r1;
        r2 = r1.d;	 Catch:{ all -> 0x0051 }
        r0 = "result";	 Catch:{ all -> 0x0051 }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x0051 }
        r0 = r2 instanceof defpackage.gfw.a;	 Catch:{ all -> 0x0051 }
        if (r0 == 0) goto L_0x0033;	 Catch:{ all -> 0x0051 }
        goto L_0x004d;	 Catch:{ all -> 0x0051 }
        r2 = r3.a();	 Catch:{ all -> 0x0051 }
        if (r2 == 0) goto L_0x004a;	 Catch:{ all -> 0x0051 }
        r2 = new gfw$a;	 Catch:{ all -> 0x0051 }
        r3 = r3.f();	 Catch:{ all -> 0x0051 }
        r0 = "result.metrics";	 Catch:{ all -> 0x0051 }
        defpackage.akcr.a(r3, r0);	 Catch:{ all -> 0x0051 }
        r2.<init>(r3);	 Catch:{ all -> 0x0051 }
        r2 = (defpackage.gfw) r2;	 Catch:{ all -> 0x0051 }
        goto L_0x004d;	 Catch:{ all -> 0x0051 }
        r2 = defpackage.gfw.c.a;	 Catch:{ all -> 0x0051 }
        goto L_0x0047;	 Catch:{ all -> 0x0051 }
        r1.d = r2;	 Catch:{ all -> 0x0051 }
        monitor-exit(r1);
        return r1;
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.giv.a(git$a, gej):giv");
    }

    public final boolean a() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    public final synchronized giv b() {
        if (this.a.isEmpty()) {
            return this;
        }
        gfw gfw = this.d;
        if (!(gfw instanceof gfw.a)) {
            gfw = d.a;
        }
        this.d = gfw;
        return this;
    }

    public final synchronized giv c() {
        if (this.a.isEmpty()) {
            return this;
        }
        gfw gfw = this.d;
        if (!(gfw instanceof gfw.a)) {
            gfw = b.a;
        }
        this.d = gfw;
        return this;
    }

    public final void d() {
        Object obj = this.d;
        akcr.a((gfw) this.c.getAndSet(obj), obj);
        Object obj2 = this.b;
        akcr.a(obj2, "statusEmitters");
        for (ajdq ajdq : (Iterable) obj2) {
            ajdq.a(obj);
            if (obj instanceof gfw.a) {
                ajdq.a();
            }
        }
    }
}
