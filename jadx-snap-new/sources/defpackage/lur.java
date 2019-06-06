package defpackage;

import defpackage.lvh.c;
import defpackage.lvi.b;

/* renamed from: lur */
public final class lur {
    static final akbl<c, b> a = a.a;

    /* renamed from: lur$a */
    static final class a extends akcs implements akbl<c, b> {
        public static final a a = new a();

        a() {
            super(1);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0077 in {5, 6, 8, 11, 15, 17} preds:[]
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
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r9) {
            /*
            r8 = this;
            r9 = (defpackage.lvh.c) r9;
            r0 = "result";
            defpackage.akcr.b(r9, r0);
            r0 = r9 instanceof defpackage.lvh.c.c;
            if (r0 == 0) goto L_0x0056;
            r0 = r9;
            r0 = (defpackage.lvh.c.c) r0;
            r1 = r0.a();
            r0 = r0.b();
            r0 = (java.lang.Iterable) r0;
            r2 = new java.util.ArrayList;
            r3 = 10;
            r3 = defpackage.ajyn.a(r0, r3);
            r2.<init>(r3);
            r2 = (java.util.Collection) r2;
            r0 = r0.iterator();
            r3 = r0.hasNext();
            if (r3 == 0) goto L_0x004a;
            r3 = r0.next();
            r3 = (defpackage.lvh.b) r3;
            r4 = new lvf$a$b$a;
            r5 = r3.a;
            r6 = r3.b;
            r7 = r3.a;
            r7 = defpackage.akcr.a(r1, r7);
            r3 = r3.c;
            r4.<init>(r5, r6, r7, r3);
            r2.add(r4);
            goto L_0x0029;
            r2 = (java.util.List) r2;
            r0 = new lvi$b$c;
            r9 = r9 instanceof defpackage.lvh.c.c.b;
            r0.<init>(r2, r9);
            r0 = (defpackage.lvi.b) r0;
            return r0;
            r0 = r9 instanceof defpackage.lvh.c.b;
            if (r0 == 0) goto L_0x0064;
            r0 = new lvi$b$b;
            r9 = (defpackage.lvh.c.b) r9;
            r9 = r9.a;
            r0.<init>(r9);
            goto L_0x0053;
            r0 = defpackage.lvh.c.a.a;
            r9 = defpackage.akcr.a(r9, r0);
            if (r9 == 0) goto L_0x0071;
            r9 = defpackage.lvi.b.a.a;
            r9 = (defpackage.lvi.b) r9;
            return r9;
            r9 = new ajxk;
            r9.<init>();
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lur$a.invoke(java.lang.Object):java.lang.Object");
        }
    }
}
