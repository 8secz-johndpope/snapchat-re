package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: fdd */
public final class fdd {
    public final LinkedHashMap<String, fgm> a = new LinkedHashMap();
    public aipn<fcj> b;
    public aipn<ezd> c;
    private final LinkedHashMap<String, fgm> d = new LinkedHashMap();
    private final ajwl<List<fgm>> e = ajwl.i(new ArrayList());
    private final ConcurrentMap<String, fgn> f = new ConcurrentHashMap();
    private final ConcurrentMap<String, List<fgo>> g = new ConcurrentHashMap();
    private boolean h;

    public final ajdp<List<fgm>> a() {
        return this.e;
    }

    public final ajdx<List<fgo>> a(String str) {
        return this.g.containsKey(str) ? ajdx.b(ImmutableList.copyOf((Collection) this.g.get(str))) : ((fcj) this.b.get()).a(((ezd) this.c.get()).k(), str);
    }

    public final List<fgo> a(String str, aebv[] aebvArr) {
        String str2 = str;
        aebv[] aebvArr2 = aebvArr;
        ArrayList arrayList = new ArrayList();
        fgn fgn = (fgn) this.f.get(str2);
        if (fgn == null) {
            return arrayList;
        }
        int length = aebvArr2.length;
        int i = 0;
        while (i < length) {
            aebv aebv = aebvArr2[i];
            int i2 = i;
            fgh fgh = r1;
            fgh fgh2 = new fgh(str, aebv.b, fgn.c(), aebv.c, aebv.a, aebv.e, aebv.f, aebv.d != null ? aebv.d.getSeconds() : 0);
            arrayList.add(fgh);
            i = i2 + 1;
            aebvArr2 = aebvArr;
        }
        Collections.sort(arrayList, -$$Lambda$fdd$LbeZy1O9SHqweX2yz0kht4CjPv8.INSTANCE);
        this.g.put(str2, arrayList);
        return arrayList;
    }

    public final void a(aeca aeca) {
        aecb[] aecbArr = aeca.a;
        HashMap hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        for (aecb aecb : aecbArr) {
            fgg fgg = new fgg(aecb.a, aecb.b, aecb.c);
            hashMap.put(fgg.a(), fgg);
            stringBuilder.append(fgg);
            stringBuilder.append("\n");
        }
        this.f.clear();
        this.f.putAll(hashMap);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0046 in {6, 10, 14} preds:[]
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
    public final void a(java.lang.Iterable<defpackage.fgm> r6) {
        /*
        r5 = this;
        r0 = r5.d;
        monitor-enter(r0);
        r1 = r5.d;	 Catch:{ all -> 0x0043 }
        r1.clear();	 Catch:{ all -> 0x0043 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0043 }
        r1.<init>();	 Catch:{ all -> 0x0043 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0043 }
        r2 = r6.hasNext();	 Catch:{ all -> 0x0043 }
        if (r2 == 0) goto L_0x002f;	 Catch:{ all -> 0x0043 }
        r2 = r6.next();	 Catch:{ all -> 0x0043 }
        r2 = (defpackage.fgm) r2;	 Catch:{ all -> 0x0043 }
        r3 = r5.d;	 Catch:{ all -> 0x0043 }
        r4 = r2.a();	 Catch:{ all -> 0x0043 }
        r3.put(r4, r2);	 Catch:{ all -> 0x0043 }
        r3 = ", ";	 Catch:{ all -> 0x0043 }
        r1.append(r3);	 Catch:{ all -> 0x0043 }
        r1.append(r2);	 Catch:{ all -> 0x0043 }
        goto L_0x0011;	 Catch:{ all -> 0x0043 }
        r6 = r5.e;	 Catch:{ all -> 0x0043 }
        r1 = r5.d;	 Catch:{ all -> 0x0043 }
        r1 = r1.values();	 Catch:{ all -> 0x0043 }
        r1 = com.google.common.collect.ImmutableList.copyOf(r1);	 Catch:{ all -> 0x0043 }
        r6.a(r1);	 Catch:{ all -> 0x0043 }
        monitor-exit(r0);	 Catch:{ all -> 0x0043 }
        r6 = 1;
        r5.h = r6;
        return;
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0043 }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdd.a(java.lang.Iterable):void");
    }

    public final fgm b(String str) {
        synchronized (this.d) {
            fgm fgm;
            if (this.d.containsKey(str)) {
                fgm = (fgm) this.d.get(str);
                return fgm;
            }
            synchronized (this.a) {
                fgm = (fgm) this.a.get(str);
            }
            return fgm;
        }
    }

    public final List<fgm> b() {
        ImmutableList copyOf;
        synchronized (this.d) {
            copyOf = ImmutableList.copyOf(this.d.values());
        }
        return copyOf;
    }

    public final List<fgn> c() {
        return ImmutableList.copyOf(this.f.values());
    }

    public final boolean d() {
        return this.h;
    }

    public final void e() {
        this.e.a(b());
    }

    public final boolean f() {
        return !this.f.isEmpty();
    }
}
