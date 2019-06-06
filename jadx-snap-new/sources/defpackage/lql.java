package defpackage;

import defpackage.lqh.b.a;
import defpackage.mmi.c;
import defpackage.mmi.c.a.b;
import defpackage.mmi.c.a.d;

/* renamed from: lql */
public final class lql {
    static final akbl<c, ajdp<low>> a = a.a;

    /* renamed from: lql$a */
    static final class a extends akcs implements akbl<c, ajdp<low>> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            c cVar = (c) obj;
            akcr.b(cVar, "filterLifecycle");
            if (cVar instanceof defpackage.mmi.c.a.a) {
                return ajdp.b(new low(new defpackage.lqh.b.a.c(((defpackage.mmi.c.a.a) cVar).a)));
            }
            if (cVar instanceof d) {
                return ajdp.b(new low(new defpackage.lqh.b.a.c(((d) cVar).a)));
            }
            if (cVar instanceof b) {
                return ajdp.b(new low(new defpackage.lqh.b.a.c(((b) cVar).a), true));
            }
            if (cVar instanceof defpackage.mmi.c.a.c) {
                return ajvo.a(ajot.a);
            }
            if (cVar instanceof c.b) {
                return ajdp.b(new low(new defpackage.lqh.b.a.a()));
            }
            throw new ajxk();
        }
    }

    /* renamed from: lql$c */
    static final class c<T1, T2> implements ajey<low, low> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            low low = (low) obj;
            low low2 = (low) obj2;
            akcr.b(low, "old");
            akcr.b(low2, "new");
            return akcr.a(low.a, low2.a);
        }
    }

    /* renamed from: lql$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            low low = (low) obj;
            akcr.b(low, "it");
            return low.a;
        }
    }

    /* renamed from: lql$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x005f in {2, 4, 7, 9, 12, 15, 17} preds:[]
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
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r4) {
            /*
            r3 = this;
            r4 = (defpackage.lqh.b.a) r4;
            r0 = "it";
            defpackage.akcr.b(r4, r0);
            r0 = r4 instanceof defpackage.lqh.b.a.c;
            r1 = "lensId";
            r2 = "tag";
            if (r0 == 0) goto L_0x0023;
            r4 = (defpackage.lqh.b.a.c) r4;
            r0 = r3.a;
            r4 = r4.a;
            defpackage.akcr.b(r4, r1);
            defpackage.akcr.b(r0, r2);
            r1 = new lqh$b$a$c;
            r1.<init>(r4, r0);
            r1 = (defpackage.lqh.b.a) r1;
            return r1;
            r0 = r4 instanceof defpackage.lqh.b.a.a;
            if (r0 == 0) goto L_0x0034;
            r4 = r3.a;
            defpackage.akcr.b(r4, r2);
            r0 = new lqh$b$a$a;
            r0.<init>(r4);
            r0 = (defpackage.lqh.b.a) r0;
            return r0;
            r0 = r4 instanceof defpackage.lqh.b.a.b.a;
            if (r0 == 0) goto L_0x0043;
            r4 = r3.a;
            defpackage.akcr.b(r4, r2);
            r0 = new lqh$b$a$b$a;
            r0.<init>(r4);
            goto L_0x0031;
            r0 = r4 instanceof defpackage.lqh.b.a.b.b;
            if (r0 == 0) goto L_0x0059;
            r4 = (defpackage.lqh.b.a.b.b) r4;
            r0 = r3.a;
            r4 = r4.a;
            defpackage.akcr.b(r4, r1);
            defpackage.akcr.b(r0, r2);
            r1 = new lqh$b$a$b$b;
            r1.<init>(r4, r0);
            goto L_0x0020;
            r4 = new ajxk;
            r4.<init>();
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lql$b.apply(java.lang.Object):java.lang.Object");
        }
    }

    static final ajdp<a> a(ajdp<low> ajdp) {
        return ajdp.a((ajey) c.a).p(d.a);
    }

    static final ajdp<a> a(ajdp<a> ajdp, String str) {
        return ajdp.p(new b(str));
    }
}
