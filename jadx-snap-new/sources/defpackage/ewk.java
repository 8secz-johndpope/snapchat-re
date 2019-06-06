package defpackage;

import com.google.common.base.Optional;

/* renamed from: ewk */
public final class ewk implements ftk {
    final ajwy<evg> a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: ewk$a */
    static final class a extends akcs implements akbk<evg> {
        private /* synthetic */ ewk a;

        a(ewk ewk) {
            this.a = ewk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (evg) this.a.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ewk.class), "circumstanceEngine", "getCircumstanceEngine()Lcom/snap/circumstanceengine/api/CircumstanceEngineApi;");
    }

    public ewk(ajwy<evg> ajwy) {
        akcr.b(ajwy, "circumstanceEngineProvider");
        this.a = ajwy;
    }

    private final evg a() {
        return (evg) this.b.b();
    }

    public final Optional<Boolean> a(fth fth) {
        akcr.b(fth, "configurationKey");
        evg a = a();
        Object fromNullable;
        if (a().a(fth)) {
            fromNullable = Optional.fromNullable(Boolean.valueOf(a.b(fth, ewm.a)));
            akcr.a(fromNullable, "Optional.fromNullable(ge…rationKey, emptySignals))");
            return fromNullable;
        }
        fromNullable = Optional.absent();
        akcr.a(fromNullable, "Optional.absent()");
        return fromNullable;
    }

    public final Optional<Float> b(fth fth) {
        akcr.b(fth, "configurationKey");
        evg a = a();
        Object fromNullable;
        if (a().a(fth)) {
            fromNullable = Optional.fromNullable(Float.valueOf(a.c(fth, ewm.a)));
            akcr.a(fromNullable, "Optional.fromNullable(ge…rationKey, emptySignals))");
            return fromNullable;
        }
        fromNullable = Optional.absent();
        akcr.a(fromNullable, "Optional.absent()");
        return fromNullable;
    }

    public final Optional<Double> c(fth fth) {
        akcr.b(fth, "configurationKey");
        evg a = a();
        Object fromNullable;
        if (a().a(fth)) {
            fromNullable = Optional.fromNullable(Double.valueOf(a.d(fth, ewm.a)));
            akcr.a(fromNullable, "Optional.fromNullable(ge…rationKey, emptySignals))");
            return fromNullable;
        }
        fromNullable = Optional.absent();
        akcr.a(fromNullable, "Optional.absent()");
        return fromNullable;
    }

    public final Optional<Integer> d(fth fth) {
        akcr.b(fth, "configurationKey");
        evg a = a();
        Object fromNullable;
        if (a().a(fth)) {
            fromNullable = Optional.fromNullable(Integer.valueOf(a.e(fth, ewm.a)));
            akcr.a(fromNullable, "Optional.fromNullable(ge…rationKey, emptySignals))");
            return fromNullable;
        }
        fromNullable = Optional.absent();
        akcr.a(fromNullable, "Optional.absent()");
        return fromNullable;
    }

    public final Optional<Long> e(fth fth) {
        akcr.b(fth, "configurationKey");
        evg a = a();
        Object fromNullable;
        if (a().a(fth)) {
            fromNullable = Optional.fromNullable(Long.valueOf(a.f(fth, ewm.a)));
            akcr.a(fromNullable, "Optional.fromNullable(ge…rationKey, emptySignals))");
            return fromNullable;
        }
        fromNullable = Optional.absent();
        akcr.a(fromNullable, "Optional.absent()");
        return fromNullable;
    }

    public final Optional<String> f(fth fth) {
        akcr.b(fth, "configurationKey");
        evg a = a();
        Object fromNullable;
        if (a().a(fth)) {
            fromNullable = Optional.fromNullable(a.g(fth, ewm.a));
            akcr.a(fromNullable, "Optional.fromNullable(ge…rationKey, emptySignals))");
            return fromNullable;
        }
        fromNullable = Optional.absent();
        akcr.a(fromNullable, "Optional.absent()");
        return fromNullable;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0072 in {2, 4, 7, 8, 9, 10, 11, 12, 13, 15, 17} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final defpackage.ajdp<com.google.common.base.Optional<java.lang.Object>> g(defpackage.fth r3) {
        /*
        r2 = this;
        r0 = "configurationKey";
        defpackage.akcr.b(r3, r0);
        r0 = r3.a();
        r1 = "configurationKey.delegate";
        defpackage.akcr.a(r0, r1);
        r0 = r0.b();
        r0 = r0 instanceof com.google.protobuf.nano.MessageNano;
        if (r0 == 0) goto L_0x0024;
        r3 = com.google.common.base.Optional.absent();
        r3 = defpackage.ajdp.b(r3);
        r0 = "Observable.just(Optional.absent())";
        defpackage.akcr.a(r3, r0);
        return r3;
        r0 = r3.a();
        defpackage.akcr.a(r0, r1);
        r0 = r0.a();
        r1 = defpackage.ewl.a;
        r0 = r0.ordinal();
        r0 = r1[r0];
        switch(r0) {
            case 1: goto L_0x005d;
            case 2: goto L_0x0058;
            case 3: goto L_0x0053;
            case 4: goto L_0x004e;
            case 5: goto L_0x0049;
            case 6: goto L_0x0044;
            default: goto L_0x003a;
        };
        r3 = com.google.common.base.Optional.absent();
        r0 = "Optional.absent()";
        defpackage.akcr.a(r3, r0);
        goto L_0x0061;
        r3 = r2.f(r3);
        goto L_0x0061;
        r3 = r2.b(r3);
        goto L_0x0061;
        r3 = r2.c(r3);
        goto L_0x0061;
        r3 = r2.e(r3);
        goto L_0x0061;
        r3 = r2.d(r3);
        goto L_0x0061;
        r3 = r2.a(r3);
        if (r3 == 0) goto L_0x006a;
        r3 = defpackage.ajdp.b(r3);
        r0 = "Observable.just(getConfi…ionKey) as Optional<Any>)";
        goto L_0x0020;
        r3 = new ajxt;
        r0 = "null cannot be cast to non-null type com.google.common.base.Optional<kotlin.Any>";
        r3.<init>(r0);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewk.g(fth):ajdp");
    }

    public final void h(fth fth) {
        akcr.b(fth, "configurationKey");
    }

    public final void i(fth fth) {
        akcr.b(fth, "configurationKey");
    }
}
