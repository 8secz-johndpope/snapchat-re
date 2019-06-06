package defpackage;

import java.util.concurrent.Callable;

/* renamed from: hgc */
public final class hgc implements hch {
    final ajxe a;
    final ajxe b;
    private final zfw c;

    /* renamed from: hgc$b */
    static final class b extends akcq implements akbk<hgm> {
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
            return (hgm) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hgc$a */
    static final class a extends akcq implements akbk<ftl> {
        a(ajwy ajwy) {
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
            return (ftl) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hgc$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ hgc a;

        c(hgc hgc) {
            this.a = hgc;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(((ftl) this.a.b.b()).a((fth) gvt.PRELOAD_DISCOVER_FEED));
        }
    }

    /* renamed from: hgc$d */
    static final class d<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ hgc a;

        /* renamed from: hgc$d$1 */
        static final class 1 implements ajev {
            public static final 1 a = new 1();

            1() {
            }

            public final void run() {
            }
        }

        d(hgc hgc) {
            this.a = hgc;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0041 in {2, 4, 7, 9} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r2) {
            /*
            r1 = this;
            r2 = (java.lang.Boolean) r2;
            r0 = "shouldSync";
            defpackage.akcr.b(r2, r0);
            r0 = java.lang.Boolean.TRUE;
            r0 = defpackage.akcr.a(r2, r0);
            if (r0 == 0) goto L_0x002c;
            r2 = r1.a;
            r2 = r2.a;
            r2 = r2.b();
            r2 = (defpackage.hgm) r2;
            r2 = r2.f();
            r2 = r2.g();
            r0 = defpackage.hgc.d.1.a;
            r0 = (defpackage.ajev) r0;
            r2 = r2.b(r0);
            r2 = (defpackage.ajdb) r2;
            return r2;
            r0 = java.lang.Boolean.FALSE;
            r2 = defpackage.akcr.a(r2, r0);
            if (r2 == 0) goto L_0x003b;
            r2 = defpackage.ajhn.a;
            r2 = defpackage.ajvo.a(r2);
            goto L_0x0029;
            r2 = new ajxk;
            r2.<init>();
            throw r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hgc$d.apply(java.lang.Object):java.lang.Object");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hgc.class), "dataSource", "getDataSource()Lcom/snap/discoverfeed/data/DiscoverFeedStoriesDataSource;"), new akdc(akde.a(hgc.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;")};
    }

    public hgc(zfw zfw, ajwy<hgm> ajwy, ajwy<ftl> ajwy2) {
        akcr.b(zfw, "schedulers");
        akcr.b(ajwy, "dataSourceProvider");
        akcr.b(ajwy2, "configProviderProvider");
        this.c = zfw;
        this.a = ajxh.a(new b(ajwy));
        this.b = ajxh.a(new a(ajwy2));
    }

    public final ajcx a() {
        Object c = ajdx.c((Callable) new c(this));
        akcr.a(c, "Single.fromCallable {\n  …_DISCOVER_FEED)\n        }");
        c = c.b((ajdw) this.c.b()).e((ajfc) new d(this)).a((ajdw) this.c.f()).a(ajfu.g);
        akcr.a(c, "shouldSyncContent()\n    …       .onErrorComplete()");
        return c;
    }
}
