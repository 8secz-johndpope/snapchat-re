package defpackage;

@ftr(a = "sticker_tag_data")
/* renamed from: xtd */
public final class xtd extends ggm {
    private final ajxe a;
    private final xtb b;

    /* renamed from: xtd$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xtd$b */
    static final class b extends akcq implements akbk<gee> {
        b(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (gee) ((ajwy) this.receiver).get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(xtd.class), "contentManager", "getContentManager()Lcom/snap/core/net/content/api/ContentManager;");
        a aVar = new a();
    }

    public xtd(xtb xtb, ajwy<gee> ajwy) {
        akcr.b(xtb, "contentType");
        akcr.b(ajwy, "contentManager");
        this.b = xtb;
        this.a = ajxh.a(new b(ajwy));
    }

    private final gee a() {
        return (gee) this.a.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0094 in {4, 7, 8, 10, 12, 13, 15} preds:[]
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
    public final defpackage.ajdx<defpackage.gej> a(android.net.Uri r12, java.util.Set<defpackage.rzg> r13, boolean r14, java.util.Set<? extends defpackage.gdy> r15) {
        /*
        r11 = this;
        r0 = "uri";
        defpackage.akcr.b(r12, r0);
        r0 = "schedulingContexts";
        defpackage.akcr.b(r13, r0);
        r0 = "cacheAccessControls";
        defpackage.akcr.b(r15, r0);
        r0 = "tag_type";
        r2 = r12.getQueryParameter(r0);
        if (r2 == 0) goto L_0x008a;
        r0 = "url";
        r12 = r12.getQueryParameter(r0);
        if (r12 != 0) goto L_0x0021;
        r12 = "";
        r0 = r12;
        r0 = (java.lang.CharSequence) r0;
        r0 = r0.length();
        if (r0 != 0) goto L_0x002c;
        r0 = 1;
        goto L_0x002d;
        r0 = 0;
        if (r0 == 0) goto L_0x0055;
        r12 = r11.a();
        r0 = new gew;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r11.b;
        r6 = r1;
        r6 = (defpackage.geo) r6;
        r9 = 286; // 0x11e float:4.01E-43 double:1.413E-321;
        r1 = r0;
        r7 = r13;
        r8 = r15;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r0 = (defpackage.geg) r0;
        r12 = r12.a(r0);
        r12 = r12.a(r14);
        r13 = "contentManager.submit(\n …tResult(closeOnTerminate)";
        defpackage.akcr.a(r12, r13);
        return r12;
        r0 = r11.a();
        r10 = new gew;
        r1 = new sbm$a;
        r3 = defpackage.sac.GET;
        r1.<init>(r12, r3);
        r12 = r1.e();
        r1 = "SimpleRequest.Builder<An…, HttpMethod.GET).build()";
        defpackage.akcr.a(r12, r1);
        r3 = r12;
        r3 = (defpackage.sak) r3;
        r4 = 0;
        r5 = 0;
        r12 = r11.b;
        r6 = r12;
        r6 = (defpackage.geo) r6;
        r9 = 284; // 0x11c float:3.98E-43 double:1.403E-321;
        r1 = r10;
        r7 = r13;
        r8 = r15;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r10 = (defpackage.geg) r10;
        r12 = r0.a(r10);
        r12 = r12.a(r14);
        r13 = "contentManager.submit(De…tResult(closeOnTerminate)";
        goto L_0x0051;
        r12 = new java.lang.IllegalArgumentException;
        r13 = "Tag type ID was null";
        r12.<init>(r13);
        r12 = (java.lang.Throwable) r12;
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtd.a(android.net.Uri, java.util.Set, boolean, java.util.Set):ajdx");
    }
}
