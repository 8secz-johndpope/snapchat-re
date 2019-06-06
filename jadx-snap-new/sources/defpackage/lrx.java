package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.lsd.b;

/* renamed from: lrx */
public final class lrx implements ajdu<b, b> {
    final mzk a;

    /* renamed from: lrx$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ lrx a;

        /* renamed from: lrx$a$b */
        static final class b extends akcs implements akbl<defpackage.lrw.a, mhs> {
            public static final b a = new b();

            b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                defpackage.lrw.a aVar = (defpackage.lrw.a) obj;
                akcr.b(aVar, "it");
                return aVar.d();
            }
        }

        /* renamed from: lrx$a$a */
        public static final class a extends akcs implements akbl<Object, Boolean> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(obj instanceof mhs.b);
            }
        }

        a(lrx lrx) {
            this.a = lrx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (b) obj;
            akcr.b(obj, MapboxEvent.KEY_MODEL);
            if (obj instanceof b.b) {
                return this.a.a.a((mzk.b) new defpackage.mzk.b.a.b(akfh.d(akfh.a(akfh.c(ajyu.v(((b.b) obj).b), b.a), (akbl) a.a)))).f(new ajfc<T, R>() {
                    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x00a4 in {7, 12, 13, 14, 19, 24, 25, 27, 28, 30, 32} preds:[]
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
                        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                        	at java.util.ArrayList.forEach(ArrayList.java:1257)
                        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
                        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                        */
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object r19) {
                        /*
                        r18 = this;
                        r0 = r19;
                        r0 = (defpackage.mzk.c) r0;
                        r1 = "it";
                        defpackage.akcr.b(r0, r1);
                        r1 = r0 instanceof defpackage.mzk.c.a;
                        if (r1 == 0) goto L_0x009c;
                        r1 = r18;
                        r2 = r3;
                        r3 = r2;
                        r3 = (defpackage.lsd.b.b) r3;
                        r0 = (defpackage.mzk.c.a) r0;
                        r0 = r0.a;
                        r2 = new lry$a;
                        r2.<init>(r0);
                        r0 = r3.b;
                        r0 = (java.lang.Iterable) r0;
                        r4 = new java.util.ArrayList;
                        r5 = 10;
                        r5 = defpackage.ajyn.a(r0, r5);
                        r4.<init>(r5);
                        r4 = (java.util.Collection) r4;
                        r0 = r0.iterator();
                        r5 = 0;
                        r6 = 0;
                        r7 = r0.hasNext();
                        if (r7 == 0) goto L_0x008a;
                        r7 = r0.next();
                        r8 = r6 + 1;
                        if (r6 >= 0) goto L_0x0045;
                        defpackage.ajym.a();
                        r7 = (defpackage.lrw.a) r7;
                        r9 = r3.c;
                        if (r6 == r9) goto L_0x0058;
                        r6 = r7.d();
                        r6 = r2.a(r6);
                        if (r6 == 0) goto L_0x0056;
                        goto L_0x0058;
                        r13 = 0;
                        goto L_0x005a;
                        r6 = 1;
                        r13 = 1;
                        r6 = r7 instanceof defpackage.lrw.a.c;
                        if (r6 != 0) goto L_0x0085;
                        r6 = r7 instanceof defpackage.lrw.a.d;
                        if (r6 == 0) goto L_0x0063;
                        goto L_0x0085;
                        r6 = r7 instanceof defpackage.lrw.a.a;
                        if (r6 == 0) goto L_0x007f;
                        r9 = r7;
                        r9 = (defpackage.lrw.a.a) r9;
                        r6 = r9.a;
                        if (r6 == r13) goto L_0x007b;
                        r10 = 0;
                        r11 = 0;
                        r12 = 0;
                        r14 = 0;
                        r15 = 0;
                        r16 = 0;
                        r17 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
                        r9 = defpackage.lrw.a.a.a(r9, r10, r11, r12, r13, r14, r15, r16, r17);
                        r7 = r9;
                        r7 = (defpackage.lrw.a) r7;
                        goto L_0x0085;
                        r0 = new ajxk;
                        r0.<init>();
                        throw r0;
                        r4.add(r7);
                        r6 = r8;
                        goto L_0x0034;
                        r5 = r4;
                        r5 = (java.util.List) r5;
                        r4 = 0;
                        r6 = 0;
                        r7 = 0;
                        r8 = 0;
                        r9 = 0;
                        r10 = 0;
                        r11 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
                        r0 = defpackage.lsd.b.b.a(r3, r4, r5, r6, r7, r8, r9, r10, r11);
                        r0 = (defpackage.lsd.b) r0;
                        return r0;
                        r1 = r18;
                        r0 = new ajxk;
                        r0.<init>();
                        throw r0;
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrx$a$1.apply(java.lang.Object):java.lang.Object");
                    }
                });
            } else if (akcr.a(obj, defpackage.lsd.b.a.a)) {
                return ajdx.b(obj);
            } else {
                throw new ajxk();
            }
        }
    }

    public lrx(mzk mzk) {
        akcr.b(mzk, "lensStatisticsRepository");
        this.a = mzk;
    }

    public final ajdt<b> apply(ajdp<b> ajdp) {
        akcr.b(ajdp, "upstream");
        Object x = ajdp.x(new a(this));
        akcr.a(x, "upstream.switchMapSingle…)\n            }\n        }");
        return (ajdt) x;
    }
}
