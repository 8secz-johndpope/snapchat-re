package defpackage;

import defpackage.moc.d;

/* renamed from: moi */
public final class moi implements mpf {
    private final mok<d> a;
    private final mob b;

    /* renamed from: moi$b */
    static final class b extends akcq implements akbl<d, ajdj<miq>> {
        b(mok mok) {
            super(1, mok);
        }

        public final String getName() {
            return "resolve";
        }

        public final akej getOwner() {
            return akde.a(mok.class);
        }

        public final String getSignature() {
            return "resolve(Lcom/snap/lenses/core/ResourceRequest;)Lio/reactivex/Maybe;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            d dVar = (d) obj;
            akcr.b(dVar, "p1");
            return ((mok) this.receiver).a(dVar);
        }
    }

    /* renamed from: moi$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return new d(this.a, str);
        }
    }

    public moi(mok<? super d> mok, mob mob) {
        akcr.b(mok, "resourceUriResolver");
        akcr.b(mob, "checksumProvider");
        this.a = mok;
        this.b = mob;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0068 in {2, 4, 7, 9} preds:[]
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
    public final defpackage.ajdp<defpackage.miq> a(defpackage.mpf.a r3) {
        /*
        r2 = this;
        r0 = "queryCriteria";
        defpackage.akcr.b(r3, r0);
        r0 = defpackage.mpf.a.a.a;
        r0 = defpackage.akcr.a(r3, r0);
        if (r0 == 0) goto L_0x0019;
        r3 = defpackage.ajot.a;
        r3 = defpackage.ajvo.a(r3);
        r0 = "Observable.empty()";
        defpackage.akcr.a(r3, r0);
        return r3;
        r0 = r3 instanceof defpackage.mpf.a.b;
        if (r0 == 0) goto L_0x0062;
        r3 = (defpackage.mpf.a.b) r3;
        r3 = r3.a;
        r0 = r2.b;
        r0 = r0.a(r3);
        r0 = r0.e();
        r1 = new moi$a;
        r1.<init>(r3);
        r1 = (defpackage.ajfc) r1;
        r3 = r0.f(r1);
        r0 = "checksumProvider.provide….TrackingData(name, it) }";
        defpackage.akcr.a(r3, r0);
        r0 = new moi$b;
        r1 = r2.a;
        r0.<init>(r1);
        r0 = (defpackage.akbl) r0;
        r1 = new moj;
        r1.<init>(r0);
        r1 = (defpackage.ajfc) r1;
        r3 = r3.b(r1);
        r3 = r3.g();
        r0 = defpackage.ajot.a;
        r0 = defpackage.ajvo.a(r0);
        r0 = (defpackage.ajdt) r0;
        r3 = r3.f(r0);
        r0 = "createRequest(queryCrite…eNext(Observable.empty())";
        goto L_0x0015;
        r3 = new ajxk;
        r3.<init>();
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moi.a(mpf$a):ajdp");
    }
}
