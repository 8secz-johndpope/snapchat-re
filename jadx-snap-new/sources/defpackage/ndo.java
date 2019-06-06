package defpackage;

import android.location.Location;
import com.google.common.collect.ImmutableList;
import defpackage.abkb.a;
import defpackage.abkb.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ndo */
public abstract class ndo implements c {
    protected final String a;
    protected final List<Location> b = new ArrayList();
    a c;
    final abka d;
    private final ndx e;
    private final ndv f;
    private volatile ajwy<nbt> g;
    private final CopyOnWriteArraySet<b> h = new CopyOnWriteArraySet();

    /* renamed from: ndo$b */
    public interface b {
        void a(Location location);
    }

    /* renamed from: ndo$a */
    static class a extends nbn<Location> {
        a(Iterable<Location> iterable, long j) {
            super(iterable, 60000);
        }

        public final /* synthetic */ long a(Object obj) {
            return ((Location) obj).getTime();
        }
    }

    protected ndo(String str, ndx ndx, ndv ndv, abka abka, ajwy<nbt> ajwy) {
        this.a = str;
        this.e = ndx;
        this.f = ndv;
        this.g = ajwy;
        this.d = abka;
        this.c = abka.a();
    }

    private static boolean a(double d) {
        return Math.abs(d) < 1.0E-5d;
    }

    public abstract int a(Location location);

    public abstract void a();

    public final void a(nbt nbt) {
        if (nbt != null) {
            this.g = new -$$Lambda$ndo$eD_8u6wKse7mueAFKOSRCuDe3qM(nbt);
        }
    }

    public final void a(b bVar) {
        this.h.add(bVar);
    }

    public abstract void b();

    public final void b(b bVar) {
        this.h.remove(bVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x0067 in {13, 17, 18, 23, 24, 26, 29} preds:[]
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
    public android.location.Location c() {
        /*
        r9 = this;
        r0 = "This method must not be called from the Main Thread.";
        defpackage.abmr.a(r0);
        r0 = r9.b;
        monitor-enter(r0);
        r1 = new ndo$a;	 Catch:{ all -> 0x0064 }
        r2 = r9.b;	 Catch:{ all -> 0x0064 }
        r3 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;	 Catch:{ all -> 0x0064 }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x0064 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0064 }
        r2 = 0;	 Catch:{ all -> 0x0064 }
        r3 = r1.hasNext();	 Catch:{ all -> 0x0064 }
        if (r3 == 0) goto L_0x0062;	 Catch:{ all -> 0x0064 }
        r3 = r1.next();	 Catch:{ all -> 0x0064 }
        r3 = (android.location.Location) r3;	 Catch:{ all -> 0x0064 }
        if (r2 == 0) goto L_0x0060;	 Catch:{ all -> 0x0064 }
        r4 = r2.getElapsedRealtimeNanos();	 Catch:{ all -> 0x0064 }
        r6 = r3.getElapsedRealtimeNanos();	 Catch:{ all -> 0x0064 }
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x0064 }
        if (r8 > 0) goto L_0x0017;	 Catch:{ all -> 0x0064 }
        r4 = 1;	 Catch:{ all -> 0x0064 }
        if (r2 != 0) goto L_0x0037;	 Catch:{ all -> 0x0064 }
        if (r3 == 0) goto L_0x0037;	 Catch:{ all -> 0x0064 }
        goto L_0x004a;	 Catch:{ all -> 0x0064 }
        if (r3 == 0) goto L_0x0049;	 Catch:{ all -> 0x0064 }
        r5 = r3.getAccuracy();	 Catch:{ all -> 0x0064 }
        r6 = r2.getAccuracy();	 Catch:{ all -> 0x0064 }
        r5 = r5 - r6;	 Catch:{ all -> 0x0064 }
        r6 = 1084227584; // 0x40a00000 float:5.0 double:5.356796015E-315;	 Catch:{ all -> 0x0064 }
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));	 Catch:{ all -> 0x0064 }
        if (r5 > 0) goto L_0x0049;	 Catch:{ all -> 0x0064 }
        goto L_0x004a;	 Catch:{ all -> 0x0064 }
        r4 = 0;	 Catch:{ all -> 0x0064 }
        if (r4 == 0) goto L_0x0017;	 Catch:{ all -> 0x0064 }
        r4 = r3.getLatitude();	 Catch:{ all -> 0x0064 }
        r4 = defpackage.ndo.a(r4);	 Catch:{ all -> 0x0064 }
        if (r4 == 0) goto L_0x0060;	 Catch:{ all -> 0x0064 }
        r4 = r3.getLongitude();	 Catch:{ all -> 0x0064 }
        r4 = defpackage.ndo.a(r4);	 Catch:{ all -> 0x0064 }
        if (r4 != 0) goto L_0x0017;	 Catch:{ all -> 0x0064 }
        r2 = r3;	 Catch:{ all -> 0x0064 }
        goto L_0x0017;	 Catch:{ all -> 0x0064 }
        monitor-exit(r0);	 Catch:{ all -> 0x0064 }
        return r2;	 Catch:{ all -> 0x0064 }
        r1 = move-exception;	 Catch:{ all -> 0x0064 }
        monitor-exit(r0);	 Catch:{ all -> 0x0064 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndo.c():android.location.Location");
    }

    /* Access modifiers changed, original: protected|final */
    public final nbt d() {
        return (nbt) this.g.get();
    }

    public final ImmutableList<Location> e() {
        ImmutableList copyOf;
        synchronized (this.b) {
            copyOf = ImmutableList.copyOf(new a(this.b, 60000));
        }
        return copyOf;
    }

    public final String f() {
        return this.a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x007e in {1, 4, 7, 17, 18, 23, 24, 26, 30, 31, 35} preds:[]
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
    public void onLocationChanged(android.location.Location r8) {
        /*
        r7 = this;
        if (r8 != 0) goto L_0x0003;
        return;
        r0 = r7.d();
        if (r0 == 0) goto L_0x0013;
        r1 = r7.a(r8);
        r8.getProvider();
        r0.a(r1);
        r0 = r8.getAccuracy();
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x001d;
        return;
        r0 = r7.b;
        monitor-enter(r0);
        r1 = r7.b;	 Catch:{ all -> 0x007b }
        r1.add(r8);	 Catch:{ all -> 0x007b }
        r1 = new ndo$a;	 Catch:{ all -> 0x007b }
        r2 = r7.b;	 Catch:{ all -> 0x007b }
        r3 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;	 Catch:{ all -> 0x007b }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x007b }
        r1 = r1.iterator();	 Catch:{ all -> 0x007b }
        r1.hasNext();	 Catch:{ all -> 0x007b }
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        r0 = r8.hasAltitude();
        if (r0 == 0) goto L_0x0064;
        r0 = r7.f;
        r0 = r0.b;
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0048;
        goto L_0x0049;
        r0 = -r0;
        r4 = r8.getAltitude();
        r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r6 != 0) goto L_0x0059;
        r2 = 4621819117588971520; // 0x4024000000000000 float:0.0 double:10.0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0059;
        r0 = 1;
        goto L_0x005a;
        r0 = 0;
        if (r0 != 0) goto L_0x0064;
        r0 = r7.f;
        r1 = r8.getAltitude();
        r0.b = r1;
        r0 = r7.h;
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x007a;
        r1 = r0.next();
        r1 = (defpackage.ndo.b) r1;
        r1.a(r8);
        goto L_0x006a;
        return;
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndo.onLocationChanged(android.location.Location):void");
    }
}
