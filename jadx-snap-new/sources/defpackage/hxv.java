package defpackage;

import com.google.common.base.Optional;

/* renamed from: hxv */
public final class hxv implements ftk {
    private hxs a;

    public hxv(hxs hxs) {
        this.a = hxs;
    }

    public final Optional<Boolean> a(fth fth) {
        hxs hxs = this.a;
        akcr.b(fth, "configurationKey");
        Object obj = null;
        if (hxs.b.d(fth)) {
            hxp a = hxs.a.a(fth);
            if (a != null) {
                obj = a.a;
            }
            obj = (Boolean) obj;
        }
        return Optional.fromNullable(obj);
    }

    public final Optional<Float> b(fth fth) {
        hxs hxs = this.a;
        akcr.b(fth, "configurationKey");
        Object obj = null;
        if (hxs.b.d(fth)) {
            hxp a = hxs.a.a(fth);
            if (a != null) {
                obj = a.a;
            }
            obj = (Float) obj;
        }
        return Optional.fromNullable(obj);
    }

    public final Optional<Double> c(fth fth) {
        hxs hxs = this.a;
        akcr.b(fth, "configurationKey");
        Object obj = null;
        if (hxs.b.d(fth)) {
            hxp a = hxs.a.a(fth);
            if (a != null) {
                obj = a.a;
            }
            obj = (Double) obj;
        }
        return Optional.fromNullable(obj);
    }

    public final Optional<Integer> d(fth fth) {
        hxs hxs = this.a;
        akcr.b(fth, "configurationKey");
        Object obj = null;
        if (hxs.b.d(fth)) {
            hxp a = hxs.a.a(fth);
            if (a != null) {
                obj = a.a;
            }
            obj = (Integer) obj;
        }
        return Optional.fromNullable(obj);
    }

    public final Optional<Long> e(fth fth) {
        hxs hxs = this.a;
        akcr.b(fth, "configurationKey");
        Object obj = null;
        if (hxs.b.d(fth)) {
            hxp a = hxs.a.a(fth);
            if (a != null) {
                obj = a.a;
            }
            obj = (Long) obj;
        }
        return Optional.fromNullable(obj);
    }

    public final Optional<String> f(fth fth) {
        hxs hxs = this.a;
        akcr.b(fth, "configurationKey");
        Object obj = null;
        if (hxs.b.d(fth)) {
            hxp a = hxs.a.a(fth);
            if (a != null) {
                obj = a.a;
            }
            obj = (String) obj;
        }
        return Optional.fromNullable(obj);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0076 in {4, 8, 9, 11, 12, 14} preds:[]
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
    public final defpackage.ajdp<com.google.common.base.Optional<java.lang.Object>> g(defpackage.fth r6) {
        /*
        r5 = this;
        r0 = "key";
        r1 = r5.a;	 Catch:{ all -> 0x0074 }
        r2 = "configurationKey";	 Catch:{ all -> 0x0074 }
        defpackage.akcr.b(r6, r2);	 Catch:{ all -> 0x0074 }
        r2 = r1.b;	 Catch:{ all -> 0x0074 }
        r2 = r2.d(r6);	 Catch:{ all -> 0x0074 }
        if (r2 != 0) goto L_0x001f;	 Catch:{ all -> 0x0074 }
        r6 = com.google.common.base.Optional.absent();	 Catch:{ all -> 0x0074 }
        r6 = defpackage.ajdp.b(r6);	 Catch:{ all -> 0x0074 }
        r0 = "Observable.just(Optional.absent())";	 Catch:{ all -> 0x0074 }
        defpackage.akcr.a(r6, r0);	 Catch:{ all -> 0x0074 }
        goto L_0x0073;	 Catch:{ all -> 0x0074 }
        r1 = r1.a;	 Catch:{ all -> 0x0074 }
        defpackage.akcr.b(r6, r0);	 Catch:{ all -> 0x0074 }
        r1 = r1.a;	 Catch:{ all -> 0x0074 }
        r2 = defpackage.tno.FEATURE;	 Catch:{ all -> 0x0074 }
        r3 = defpackage.tnj.a(r2);	 Catch:{ all -> 0x0074 }
        if (r3 == 0) goto L_0x0042;	 Catch:{ all -> 0x0074 }
        r1 = r1.b;	 Catch:{ all -> 0x0074 }
        r1.get();	 Catch:{ all -> 0x0074 }
        defpackage.akcr.b(r6, r0);	 Catch:{ all -> 0x0074 }
        r6 = defpackage.ajot.a;	 Catch:{ all -> 0x0074 }
        r6 = defpackage.ajvo.a(r6);	 Catch:{ all -> 0x0074 }
        r0 = "Observable.empty()";	 Catch:{ all -> 0x0074 }
        defpackage.akcr.a(r6, r0);	 Catch:{ all -> 0x0074 }
        goto L_0x005d;	 Catch:{ all -> 0x0074 }
        r1 = r1.a;	 Catch:{ all -> 0x0074 }
        defpackage.akcr.b(r6, r0);	 Catch:{ all -> 0x0074 }
        r0 = "type";	 Catch:{ all -> 0x0074 }
        defpackage.akcr.b(r2, r0);	 Catch:{ all -> 0x0074 }
        r0 = r1.b;	 Catch:{ all -> 0x0074 }
        r3 = defpackage.tni.a(r6);	 Catch:{ all -> 0x0074 }
        r4 = new tnx$k;	 Catch:{ all -> 0x0074 }
        r4.<init>(r1, r6, r2);	 Catch:{ all -> 0x0074 }
        r4 = (defpackage.akbk) r4;	 Catch:{ all -> 0x0074 }
        r6 = r0.a(r3, r2, r4);	 Catch:{ all -> 0x0074 }
        r0 = "prefs.observeFeatureKey(… PreferencesType.FEATURE)";	 Catch:{ all -> 0x0074 }
        defpackage.akcr.a(r6, r0);	 Catch:{ all -> 0x0074 }
        r0 = defpackage.hxs.c.a;	 Catch:{ all -> 0x0074 }
        r0 = (defpackage.ajfc) r0;	 Catch:{ all -> 0x0074 }
        r6 = r6.p(r0);	 Catch:{ all -> 0x0074 }
        r0 = defpackage.ajfu.a;	 Catch:{ all -> 0x0074 }
        r6 = r6.j(r0);	 Catch:{ all -> 0x0074 }
        r0 = "prefs.observeFeatureKey(…  .distinctUntilChanged()";	 Catch:{ all -> 0x0074 }
        goto L_0x001b;
        return r6;
        r6 = move-exception;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxv.g(fth):ajdp");
    }

    public final void h(fth fth) {
    }

    public final void i(fth fth) {
    }
}
