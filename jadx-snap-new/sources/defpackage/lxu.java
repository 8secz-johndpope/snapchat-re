package defpackage;

import defpackage.lxr.b;
import defpackage.lxs.a;

/* renamed from: lxu */
public final class lxu {
    static final akbl<b, lxs.b> a = a.a;
    static final akbl<a, lxr.a> b = b.a;

    /* renamed from: lxu$a */
    static final class a extends akcs implements akbl<b, lxs.b> {
        public static final a a = new a();

        a() {
            super(1);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x00c8 in {4, 5, 8, 9, 10, 12, 18, 19, 21, 24, 27, 30, 32} preds:[]
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
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
            /*
            r15 = this;
            r0 = r16;
            r0 = (defpackage.lxr.b) r0;
            r1 = "result";
            defpackage.akcr.b(r0, r1);
            r1 = r0 instanceof defpackage.lxr.b.b;
            if (r1 == 0) goto L_0x0050;
            r1 = new lxs$b$b;
            r0 = (defpackage.lxr.b.b) r0;
            r11 = r0.b;
            r2 = r0.b;
            r4 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
            r6 = 0;
            r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
            if (r8 <= 0) goto L_0x0026;
            r2 = r0.b;
            r2 = r4 / r2;
            r9 = r2;
            goto L_0x0027;
            r9 = r6;
            r2 = r0.a;
            r13 = r2.a;
            r2 = r0.a;
            r2 = r2.b;
            r8 = r0.a;
            r4 = r8.a;
            r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r8 <= 0) goto L_0x0046;
            r4 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
            r0 = r0.a;
            r6 = r0.a;
            r4 = r4 / r6;
            r6 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
            r4 = r4 * r6;
            r7 = r4;
            goto L_0x0047;
            r7 = r6;
            r5 = r2;
            r2 = r1;
            r3 = r13;
            r2.<init>(r3, r5, r7, r9, r11);
            r1 = (defpackage.lxs.b) r1;
            return r1;
            r1 = r0 instanceof defpackage.lxr.b.e;
            if (r1 == 0) goto L_0x0099;
            r0 = (defpackage.lxr.b.e) r0;
            r0 = r0.a;
            r1 = new java.util.LinkedHashMap;
            r2 = r0.size();
            r2 = defpackage.ajzm.a(r2);
            r1.<init>(r2);
            r1 = (java.util.Map) r1;
            r0 = r0.entrySet();
            r0 = (java.lang.Iterable) r0;
            r0 = r0.iterator();
            r2 = r0.hasNext();
            if (r2 == 0) goto L_0x0091;
            r2 = r0.next();
            r2 = (java.util.Map.Entry) r2;
            r3 = r2.getKey();
            r2 = r2.getValue();
            r2 = (defpackage.min) r2;
            r4 = r2.a;
            r2 = java.lang.Double.valueOf(r4);
            r1.put(r3, r2);
            goto L_0x0071;
            r0 = new lxs$b$e;
            r0.<init>(r1);
            r0 = (defpackage.lxs.b) r0;
            return r0;
            r1 = r0 instanceof defpackage.lxr.b.d;
            if (r1 == 0) goto L_0x00ac;
            r1 = new lxs$b$d;
            r0 = (defpackage.lxr.b.d) r0;
            r3 = r0.a;
            r5 = r0.b;
            r7 = r0.c;
            r2 = r1;
            r2.<init>(r3, r5, r7);
            goto L_0x004d;
            r1 = defpackage.lxr.b.c.a;
            r1 = defpackage.akcr.a(r0, r1);
            if (r1 == 0) goto L_0x00b7;
            r0 = defpackage.lxs.b.c.a;
            goto L_0x0096;
            r1 = defpackage.lxr.b.a.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x00c2;
            r0 = defpackage.lxs.b.a.a;
            goto L_0x0096;
            r0 = new ajxk;
            r0.<init>();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lxu$a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: lxu$b */
    static final class b extends akcs implements akbl<a, lxr.a> {
        public static final b a = new b();

        b() {
            super(1);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x002b in {2, 4, 7, 10, 13, 15} preds:[]
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
            r2 = (defpackage.lxs.a) r2;
            r0 = "event";
            defpackage.akcr.b(r2, r0);
            r0 = r2 instanceof defpackage.lxs.a.a.b;
            if (r0 == 0) goto L_0x0010;
            r2 = defpackage.lxr.a.a.b.a;
            r2 = (defpackage.lxr.a) r2;
            return r2;
            r0 = r2 instanceof defpackage.lxs.a.a.a;
            if (r0 == 0) goto L_0x0017;
            r2 = defpackage.lxr.a.a.a.a;
            goto L_0x000d;
            r0 = r2 instanceof defpackage.lxs.a.b.b;
            if (r0 == 0) goto L_0x001e;
            r2 = defpackage.lxr.a.b.b.a;
            goto L_0x000d;
            r2 = r2 instanceof defpackage.lxs.a.b.a;
            if (r2 == 0) goto L_0x0025;
            r2 = defpackage.lxr.a.b.a.a;
            goto L_0x000d;
            r2 = new ajxk;
            r2.<init>();
            throw r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lxu$b.invoke(java.lang.Object):java.lang.Object");
        }
    }
}
