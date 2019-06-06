package defpackage;

import java.util.List;

/* renamed from: ohs */
public final class ohs extends ieo implements abyk {
    public final List<ieo> a;
    public final String b;
    private final List<abyi> c;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x008a in {5, 8, 10, 12, 14} preds:[]
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
    public ohs(java.util.List<defpackage.abyi> r4, defpackage.idd r5) {
        /*
        r3 = this;
        r0 = "mediaPackages";
        defpackage.akcr.b(r4, r0);
        r0 = "caller";
        defpackage.akcr.b(r5, r0);
        r5 = 0;
        r3.<init>(r5);
        r3.c = r4;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r4 = (java.util.List) r4;
        r3.a = r4;
        r4 = r3.c();
        r4 = r4.get(r5);
        r4 = (defpackage.abyi) r4;
        r4 = r4.a;
        r3.b = r4;
        r4 = r3.c();
        r4 = r4.isEmpty();
        r0 = 1;
        r4 = r4 ^ r0;
        if (r4 == 0) goto L_0x007c;
        r4 = r3.c();
        r4 = (java.lang.Iterable) r4;
        r1 = new java.util.ArrayList;
        r2 = 10;
        r2 = defpackage.ajyn.a(r4, r2);
        r1.<init>(r2);
        r1 = (java.util.Collection) r1;
        r4 = r4.iterator();
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x005c;
        r2 = r4.next();
        r2 = (defpackage.abyi) r2;
        r2 = r2.a;
        r1.add(r2);
        goto L_0x004a;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r4 = defpackage.ajyu.m(r1);
        r4 = r4.size();
        if (r4 != r0) goto L_0x006b;
        r5 = 1;
        if (r5 == 0) goto L_0x006e;
        return;
        r4 = new java.lang.IllegalStateException;
        r5 = "Media packages with a session must share the same session id";
        r5 = r5.toString();
        r4.<init>(r5);
        r4 = (java.lang.Throwable) r4;
        throw r4;
        r4 = new java.lang.IllegalStateException;
        r5 = "Media package session requires at least one media package";
        r5 = r5.toString();
        r4.<init>(r5);
        r4 = (java.lang.Throwable) r4;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohs.<init>(java.util.List, idd):void");
    }

    public final void a() {
        for (ieo m : this.a) {
            m.m();
        }
    }

    public final String b() {
        return this.b;
    }

    public final List<abyi> c() {
        return this.c;
    }
}
