package defpackage;

import defpackage.mft.a.c;
import defpackage.mft.b;
import defpackage.mfu.a;

/* renamed from: mfe */
public final class mfe {
    static final akbl<b, mfu.b> a = a.a;
    static final akbl<a, mft.a> b = b.a;

    /* renamed from: mfe$a */
    static final class a extends akcs implements akbl<b, mfu.b> {
        public static final a a = new a();

        a() {
            super(1);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0029 in {2, 4, 7, 10, 13, 15} preds:[]
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
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r2) {
            /*
            r1 = this;
            r2 = (defpackage.mft.b) r2;
            r0 = "result";
            defpackage.akcr.b(r2, r0);
            r0 = r2 instanceof defpackage.mft.b.b.a;
            if (r0 == 0) goto L_0x0010;
            r2 = defpackage.mfu.b.b.a.a;
            r2 = (defpackage.mfu.b) r2;
            return r2;
            r0 = r2 instanceof defpackage.mft.b.b.b;
            if (r0 == 0) goto L_0x0017;
            r2 = defpackage.mfu.b.b.b.a;
            goto L_0x000d;
            r0 = r2 instanceof defpackage.mft.b.a;
            if (r0 == 0) goto L_0x001e;
            r2 = defpackage.mfu.b.a.a;
            goto L_0x000d;
            r2 = r2 instanceof defpackage.mft.b.c;
            if (r2 == 0) goto L_0x0023;
            goto L_0x001b;
            r2 = new ajxk;
            r2.<init>();
            throw r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mfe$a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: mfe$b */
    static final class b extends akcs implements akbl<a, mft.a> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "event");
            if (aVar instanceof a.a) {
                return c.a;
            }
            throw new ajxk();
        }
    }
}
