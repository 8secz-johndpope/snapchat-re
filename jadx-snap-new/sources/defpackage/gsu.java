package defpackage;

/* renamed from: gsu */
public final class gsu implements gqw {
    final grt a;

    /* renamed from: gsu$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: gsu$b */
    static final class b implements ajev {
        private /* synthetic */ gsu a;
        private /* synthetic */ gqv b;

        b(gsu gsu, gqv gqv) {
            this.a = gsu;
            this.b = gqv;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x00af in {4, 8, 9, 12, 13, 18, 19, 20, 22, 24} preds:[]
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
        public final void run() {
            /*
            r14 = this;
            r0 = r14.a;
            r1 = r0.a;
            r0 = r14.b;
            r2 = r0.a;
            r0 = r14.b;
            r0 = r0.e;
            r3 = r0.length();
            r4 = 0;
            r5 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
            if (r3 >= r5) goto L_0x0017;
            r5 = r0;
            goto L_0x0023;
            if (r0 == 0) goto L_0x00a7;
            r0 = r0.substring(r4, r5);
            r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            defpackage.akcr.a(r0, r3);
            goto L_0x0015;
            r0 = r14.b;
            r6 = r0.c;
            r0 = r14.b;
            r7 = r0.j;
            r0 = r14.b;
            r8 = r0.k;
            r0 = r14.b;
            r0 = r0.c;
            r3 = r14.b;
            r3 = r3.b;
            r9 = java.lang.OutOfMemoryError.class;
            r9 = r9.getName();
            r0 = defpackage.akcr.a(r0, r9);
            if (r0 != 0) goto L_0x004b;
            r0 = "GL_OUT_OF_MEMORY";
            r0 = defpackage.akcr.a(r3, r0);
            if (r0 == 0) goto L_0x004c;
            r4 = 1;
            r0 = "crashId";
            defpackage.akcr.b(r2, r0);
            r0 = r1.a;
            r0 = r0.get();
            r0 = (defpackage.ilv) r0;
            r3 = defpackage.iot.APP_CRASH;
            r9 = "category";
            r10 = "java";
            r3 = r3.a(r9, r10);
            r9 = "";
            if (r7 != 0) goto L_0x0069;
            r10 = r9;
            goto L_0x006a;
            r10 = r7;
            r11 = "app_version";
            r3 = r3.a(r11, r10);
            r10 = android.os.Build.VERSION.RELEASE;
            r12 = "Build.VERSION.RELEASE";
            defpackage.akcr.a(r10, r12);
            r13 = "os_version";
            r3 = r3.a(r13, r10);
            r0.c(r3, 1);
            if (r4 == 0) goto L_0x00a0;
            r0 = r1.a;
            r0 = r0.get();
            r0 = (defpackage.ilv) r0;
            r3 = defpackage.iot.OOM_CRASH;
            if (r7 != 0) goto L_0x008f;
            goto L_0x0090;
            r9 = r7;
            r3 = r3.a(r11, r9);
            r4 = android.os.Build.VERSION.RELEASE;
            defpackage.akcr.a(r4, r12);
            r3 = r3.a(r13, r4);
            r0.c(r3, 1);
            r3 = defpackage.aaal.JAVA;
            r4 = 0;
            r1.a(r2, r3, r4, r5, r6, r7, r8);
            return;
            r0 = new ajxt;
            r1 = "null cannot be cast to non-null type java.lang.String";
            r0.<init>(r1);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gsu$b.run():void");
        }
    }

    static {
        a aVar = new a();
    }

    public gsu(grt grt) {
        akcr.b(grt, "crashAnalyticsHelper");
        this.a = grt;
    }

    public final ajcx a(gqv gqv) {
        akcr.b(gqv, "annotatedJavaCrash");
        Object a = ajcx.a((ajev) new b(this, gqv));
        akcr.a(a, "Completable.fromAction {….crashMessage))\n        }");
        return a;
    }
}
