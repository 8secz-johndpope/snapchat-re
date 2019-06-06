package defpackage;

import defpackage.vpj.a;
import defpackage.vpl.b;

/* renamed from: vqb */
public final class vqb implements ajdu<vpk, dnk> {
    final vpl a;
    final ajdo<ajxm<vpj, b>, b> b;

    /* renamed from: vqb$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ vqb a;

        a(vqb vqb) {
            this.a = vqb;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x00c6 in {2, 3, 6, 7, 14, 15, 16, 17, 19, 21} preds:[]
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
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r7) {
            /*
            r6 = this;
            r7 = (defpackage.vpk) r7;
            r0 = "request";
            defpackage.akcr.b(r7, r0);
            r0 = r7 instanceof defpackage.vpk.b;
            if (r0 == 0) goto L_0x0011;
            r0 = r7;
            r0 = (defpackage.vpk.b) r0;
            r0 = r0.a;
            goto L_0x0012;
            r0 = 0;
            r1 = r6.a;
            r7 = r7.a();
            r2 = r7 instanceof defpackage.vpj.a;
            if (r2 == 0) goto L_0x0048;
            r7 = (defpackage.vpj.a) r7;
            r1 = r1.a;
            r2 = new vpl$a$a$a;
            r3 = r7.a;
            r4 = 0;
            r2.<init>(r3, r4);
            r2 = (defpackage.vpl.a) r2;
            r1 = r1.a(r2);
            r1 = defpackage.vqc.a(r1);
            r2 = new vqb$c;
            r2.<init>(r7);
            r2 = (defpackage.ajev) r2;
            r7 = r1.b(r2);
            r1 = "unlocker.unlock(Unlocker…d\")\n                    }";
            defpackage.akcr.a(r7, r1);
            r1 = "unlockRequest.run {\n    …              }\n        }";
            defpackage.akcr.a(r7, r1);
            goto L_0x00b6;
            r2 = r7 instanceof defpackage.vpj.b;
            if (r2 == 0) goto L_0x00c0;
            r7 = (defpackage.vpj.b) r7;
            r2 = r7.a;
            r2 = (defpackage.vse) r2;
            r2 = defpackage.vwy.a(r2);
            if (r2 == 0) goto L_0x00b2;
            r2 = r1.a;
            r3 = new vpl$a$a$b;
            r4 = r7.a;
            r5 = r7.b;
            r3.<init>(r4, r5);
            r3 = (defpackage.vpl.a) r3;
            r2 = r2.a(r3);
            r3 = new vqb$d;
            r3.<init>(r1, r7);
            r3 = (defpackage.ajfc) r3;
            r2 = r2.f(r3);
            r1 = r1.b;
            r3 = "transformer is null";
            r1 = defpackage.ajfv.a(r1, r3);
            r1 = (defpackage.ajdo) r1;
            r1 = r1.a(r2);
            r2 = r1 instanceof defpackage.ajdj;
            if (r2 == 0) goto L_0x008d;
            r1 = (defpackage.ajdj) r1;
            r1 = defpackage.ajvo.a(r1);
            goto L_0x009b;
            r2 = "onSubscribe is null";
            defpackage.ajfv.a(r1, r2);
            r2 = new ajnb;
            r2.<init>(r1);
            r1 = defpackage.ajvo.a(r2);
            r2 = "unlocker.unlock(Unlocker…pose(analyticsTransfomer)";
            defpackage.akcr.a(r1, r2);
            r1 = defpackage.vqc.a(r1);
            r2 = new vqb$e;
            r2.<init>(r7);
            r2 = (defpackage.ajev) r2;
            r7 = r1.b(r2);
            r1 = "unlocker.unlock(Unlocker…                        }";
            goto L_0x0044;
            r7 = defpackage.vqc.a();
            r1 = new dnk$e$d;
            r1.<init>(r0);
            r7 = r7.h(r1);
            return r7;
            r7 = new ajxk;
            r7.<init>();
            throw r7;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vqb$a.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: vqb$b */
    static final class b<T, R> implements ajfc<Throwable, ajdt<? extends dnk>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "error");
            return vqc.a();
        }
    }

    /* renamed from: vqb$c */
    static final class c implements ajev {
        private /* synthetic */ a a;

        c(a aVar) {
            this.a = aVar;
        }

        public final void run() {
        }
    }

    /* renamed from: vqb$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ vqb a;
        private /* synthetic */ vpj.b b;

        d(vqb vqb, vpj.b bVar) {
            this.a = vqb;
            this.b = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "it");
            return ajxs.a(this.b, bVar);
        }
    }

    /* renamed from: vqb$e */
    static final class e implements ajev {
        private /* synthetic */ vpj.b a;

        e(vpj.b bVar) {
            this.a = bVar;
        }

        public final void run() {
        }
    }

    public vqb(vpl vpl, ajdo<ajxm<vpj, b>, b> ajdo) {
        akcr.b(vpl, "unlocker");
        akcr.b(ajdo, "analyticsTransfomer");
        this.a = vpl;
        this.b = ajdo;
    }

    public final ajdt<dnk> apply(ajdp<vpk> ajdp) {
        akcr.b(ajdp, "upstream");
        Object q = ajdp.u(new a(this)).q(b.a);
        akcr.a(q, "upstream\n               …nCard()\n                }");
        return (ajdt) q;
    }
}
