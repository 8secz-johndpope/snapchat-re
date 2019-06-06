package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: acwc */
public final class acwc {
    public final int[] a = acwg.a();
    public final List<acvm> b = new ArrayList();
    public final List<acvm> c = new ArrayList();
    public final acwf d = new acwf();
    public final acvq e = new acvq();
    public final HashMap<String, acvm> f = new HashMap();
    public final aclj g;
    public String h;
    public acwe i;
    public boolean j;
    public boolean k;
    public boolean l;
    private final acvq m = new acvq();
    private final ajwy<aclo> n;
    private final ajwl<Optional<String>> o = ajwl.i(Optional.absent());
    private final ajdp<Optional<String>> p = this.o.j(ajfu.a).f();
    private final acqn q;

    /* renamed from: acwc$a */
    public interface a {
        float a();

        float a(acvr acvr, acwk acwk);

        String a(acvp acvp, Resources resources);

        boolean a(boolean z, String str);

        String b(acvp acvp, Resources resources);

        String c(acvp acvp, Resources resources);
    }

    public acwc(aclj aclj, ajwy<aclo> ajwy, acqn acqn) {
        this.g = aclj;
        this.n = ajwy;
        this.q = acqn;
    }

    public final acvm a(String str) {
        acvm acvm;
        synchronized (this.b) {
            acvm = (acvm) this.f.get(str);
        }
        return acvm;
    }

    public final String a() {
        String str;
        synchronized (this.d) {
            str = this.h;
        }
        return str;
    }

    public final void a(acvm acvm) {
        boolean remove;
        synchronized (this.b) {
            remove = this.b.remove(acvm);
        }
        if (remove) {
            e();
        }
    }

    public final void a(boolean z) {
        synchronized (this.d) {
            this.k = z;
        }
    }

    public final void b() {
        b(null);
    }

    public final void b(String str) {
        String str2;
        synchronized (this.d) {
            str2 = this.h;
            this.h = str;
        }
        this.q.a.a(acqk.a);
        this.o.a(Optional.fromNullable(str));
        e();
        if (this.i == null) {
            return;
        }
        if (str == null || !TextUtils.equals(str2, str)) {
            this.i.a(str2, str);
        }
    }

    public final ajdp<Optional<String>> c() {
        return this.p;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0040 in {6, 16, 17, 19, 22} preds:[]
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
    public final defpackage.acvm d() {
        /*
        r9 = this;
        r0 = r9.d;
        monitor-enter(r0);
        r1 = r9.h;	 Catch:{ all -> 0x003d }
        r2 = 0;	 Catch:{ all -> 0x003d }
        if (r1 != 0) goto L_0x000a;	 Catch:{ all -> 0x003d }
        monitor-exit(r0);	 Catch:{ all -> 0x003d }
        return r2;	 Catch:{ all -> 0x003d }
        r1 = r9.a;	 Catch:{ all -> 0x003d }
        r3 = r1.length;	 Catch:{ all -> 0x003d }
        r4 = 0;	 Catch:{ all -> 0x003d }
        if (r4 >= r3) goto L_0x003b;	 Catch:{ all -> 0x003d }
        r5 = r1[r4];	 Catch:{ all -> 0x003d }
        r6 = r9.e;	 Catch:{ all -> 0x003d }
        r5 = r6.a(r5);	 Catch:{ all -> 0x003d }
        r5 = r5.iterator();	 Catch:{ all -> 0x003d }
        r6 = r5.hasNext();	 Catch:{ all -> 0x003d }
        if (r6 == 0) goto L_0x0038;	 Catch:{ all -> 0x003d }
        r6 = r5.next();	 Catch:{ all -> 0x003d }
        r6 = (defpackage.acvr) r6;	 Catch:{ all -> 0x003d }
        r7 = r6.p;	 Catch:{ all -> 0x003d }
        r7 = r7.a;	 Catch:{ all -> 0x003d }
        r8 = r9.h;	 Catch:{ all -> 0x003d }
        r7 = r7.equals(r8);	 Catch:{ all -> 0x003d }
        if (r7 == 0) goto L_0x001c;	 Catch:{ all -> 0x003d }
        r1 = r6.p;	 Catch:{ all -> 0x003d }
        monitor-exit(r0);	 Catch:{ all -> 0x003d }
        return r1;	 Catch:{ all -> 0x003d }
        r4 = r4 + 1;	 Catch:{ all -> 0x003d }
        goto L_0x000e;	 Catch:{ all -> 0x003d }
        monitor-exit(r0);	 Catch:{ all -> 0x003d }
        return r2;	 Catch:{ all -> 0x003d }
        r1 = move-exception;	 Catch:{ all -> 0x003d }
        monitor-exit(r0);	 Catch:{ all -> 0x003d }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acwc.d():acvm");
    }

    public final void e() {
        ((aclo) this.n.get()).i();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0033 in {5, 9, 13} preds:[]
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
    public final defpackage.acwf f() {
        /*
        r7 = this;
        r0 = r7.d;
        monitor-enter(r0);
        r1 = r7.a;	 Catch:{ all -> 0x0030 }
        r2 = r1.length;	 Catch:{ all -> 0x0030 }
        r3 = 0;	 Catch:{ all -> 0x0030 }
        if (r3 >= r2) goto L_0x0020;	 Catch:{ all -> 0x0030 }
        r4 = r1[r3];	 Catch:{ all -> 0x0030 }
        r5 = r7.m;	 Catch:{ all -> 0x0030 }
        r5 = r5.a(r4);	 Catch:{ all -> 0x0030 }
        r5.a();	 Catch:{ all -> 0x0030 }
        r6 = r7.e;	 Catch:{ all -> 0x0030 }
        r4 = r6.a(r4);	 Catch:{ all -> 0x0030 }
        r5.a(r4);	 Catch:{ all -> 0x0030 }
        r3 = r3 + 1;	 Catch:{ all -> 0x0030 }
        goto L_0x0007;	 Catch:{ all -> 0x0030 }
        r1 = r7.d;	 Catch:{ all -> 0x0030 }
        r2 = r7.m;	 Catch:{ all -> 0x0030 }
        r1.a = r2;	 Catch:{ all -> 0x0030 }
        r1 = r7.d;	 Catch:{ all -> 0x0030 }
        r2 = r7.h;	 Catch:{ all -> 0x0030 }
        r1.b = r2;	 Catch:{ all -> 0x0030 }
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        r0 = r7.d;
        return r0;
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acwc.f():acwf");
    }
}
