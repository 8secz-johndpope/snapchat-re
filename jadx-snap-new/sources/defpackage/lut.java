package defpackage;

import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.lvh.a.a;
import defpackage.lvh.c;
import defpackage.mjn.c.b;
import defpackage.mjn.d;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: lut */
public final class lut implements lvh {
    final ajwo<a> a;
    final ajwo<a> b;
    final ajwo<lvh.a> c;
    final ajxe d;
    final ajxe e;
    final mtj f;
    private final ajfb<lvh.a> g;
    private final ajxe h;
    private final zfw i;
    private final long j;
    private final TimeUnit k;

    /* renamed from: lut$a */
    static final class a extends akcq implements akbl<defpackage.lvh.a, ajxw> {
        a(ajwo ajwo) {
            super(1, ajwo);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajwo.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (defpackage.lvh.a) obj;
            akcr.b(obj, "p1");
            ((ajwo) this.receiver).a(obj);
            return ajxw.a;
        }
    }

    /* renamed from: lut$e */
    static final class e extends akcs implements akbk<ajdp<c>> {
        final /* synthetic */ lut a;
        final /* synthetic */ ajdp b;

        /* renamed from: lut$e$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final a a = new a();

            /* renamed from: lut$e$a$a */
            public static final class a<T> implements ajfl<d> {
                public static final a a = new a();

                public final /* synthetic */ boolean test(Object obj) {
                    d dVar = (d) obj;
                    akcr.b(dVar, "it");
                    return dVar.b() instanceof b;
                }
            }

            a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                obj = mmt.g().a().a((ajfl) a.a);
                akcr.a(obj, "requests.filter { it.int…faceControl.ImagePicker }");
                return obj;
            }
        }

        /* renamed from: lut$e$b */
        static final class b<T, R> implements ajfc<T, R> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                d dVar = (d) obj;
                akcr.b(dVar, "it");
                return dVar.a();
            }
        }

        /* renamed from: lut$e$c */
        static final class c<T1, T2, R> implements ajex<R, T, R> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                Map map = (Map) obj;
                ajxm ajxm = (ajxm) obj2;
                akcr.b(map, "selections");
                akcr.b(ajxm, "<name for destructuring parameter 1>");
                return ajzm.a(map, ajxs.a((mhs.b) ajxm.b, ((lvh.a.b) ajxm.a).a));
            }
        }

        /* renamed from: lut$e$d */
        static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final d a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                return mmt.a().b();
            }
        }

        /* renamed from: lut$e$e */
        static final class e<T> implements ajfl<mmi.c> {
            public static final e a = new e();

            e() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                mmi.c cVar = (mmi.c) obj;
                akcr.b(cVar, "it");
                return (cVar instanceof mmi.c.a.d) || (cVar instanceof mmi.c.a.c);
            }
        }

        /* renamed from: lut$e$f */
        static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ e a;
            final /* synthetic */ ajdp b;
            private /* synthetic */ ajdp c;
            private /* synthetic */ ajdp d;

            /* renamed from: lut$e$f$d */
            static final class d<T> implements ajfl<defpackage.mjn.d> {
                private /* synthetic */ mhs.b a;

                d(mhs.b bVar) {
                    this.a = bVar;
                }

                public final /* synthetic */ boolean test(Object obj) {
                    defpackage.mjn.d dVar = (defpackage.mjn.d) obj;
                    akcr.b(dVar, "it");
                    return akcr.a(dVar.a(), (mhs) this.a) && (dVar.b() instanceof b);
                }
            }

            /* renamed from: lut$e$f$e */
            static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ f a;
                private /* synthetic */ mmi.b b;
                private /* synthetic */ Map c;

                /* renamed from: lut$e$f$e$1 */
                static final class 1<T, R> implements ajfc<T, R> {
                    public static final 1 a = new 1();

                    /* renamed from: lut$e$f$e$1$a */
                    public static final class a<T> implements Comparator<T> {
                        public final int compare(T t, T t2) {
                            return ajzy.a(Long.valueOf(((mtl) t2).c()), Long.valueOf(((mtl) t).c()));
                        }
                    }

                    /* renamed from: lut$e$f$e$1$b */
                    static final class b extends akcs implements akbl<mtl, lux> {
                        public static final b a = new b();

                        b() {
                            super(1);
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            mtl mtl = (mtl) obj;
                            akcr.b(mtl, "it");
                            return luv.a(mtl);
                        }
                    }

                    1() {
                    }

                    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0060 in {3, 6, 8, 11, 13} preds:[]
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
                        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                        	at java.util.ArrayList.forEach(ArrayList.java:1257)
                        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
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
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object r5) {
                        /*
                        r4 = this;
                        r5 = (defpackage.mtj.c) r5;
                        r0 = "output";
                        defpackage.akcr.b(r5, r0);
                        r0 = r5.b();
                        r0 = (java.lang.Iterable) r0;
                        r0 = defpackage.ajyu.v(r0);
                        r1 = new lut$e$f$e$1$a;
                        r1.<init>();
                        r1 = (java.util.Comparator) r1;
                        r0 = defpackage.akfh.a(r0, r1);
                        r1 = defpackage.lut.e.f.e.1.b.a;
                        r1 = (defpackage.akbl) r1;
                        r0 = defpackage.akfh.c(r0, r1);
                        r1 = new java.util.LinkedHashMap;
                        r1.<init>();
                        r1 = (java.util.Map) r1;
                        r0 = r0.iterator();
                        r2 = r0.hasNext();
                        if (r2 == 0) goto L_0x0044;
                        r2 = r0.next();
                        r3 = r2;
                        r3 = (defpackage.lux) r3;
                        r3 = r3.a();
                        r1.put(r3, r2);
                        goto L_0x002f;
                        r0 = r5 instanceof defpackage.mtj.c.a;
                        if (r0 == 0) goto L_0x0050;
                        r5 = new luo$d$a;
                        r5.<init>(r1);
                        r5 = (defpackage.luo) r5;
                        return r5;
                        r5 = r5 instanceof defpackage.mtj.c.b;
                        if (r5 == 0) goto L_0x005a;
                        r5 = new luo$d$b;
                        r5.<init>(r1);
                        goto L_0x004d;
                        r5 = new ajxk;
                        r5.<init>();
                        throw r5;
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.lut$e$f$e$1.apply(java.lang.Object):java.lang.Object");
                    }
                }

                /* renamed from: lut$e$f$e$2 */
                static final class 2<T, R> implements ajfc<T, R> {
                    public static final 2 a = new 2();

                    /* renamed from: lut$e$f$e$2$a */
                    public static final class a<T> implements Comparator<T> {
                        public final int compare(T t, T t2) {
                            return ajzy.a(Long.valueOf(((mtl) t2).c()), Long.valueOf(((mtl) t).c()));
                        }
                    }

                    /* renamed from: lut$e$f$e$2$b */
                    static final class b extends akcs implements akbl<mtl, lux> {
                        public static final b a = new b();

                        b() {
                            super(1);
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            mtl mtl = (mtl) obj;
                            akcr.b(mtl, "it");
                            return luv.a(mtl);
                        }
                    }

                    2() {
                    }

                    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0064 in {3, 6, 8, 11, 13} preds:[]
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
                        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                        	at java.util.ArrayList.forEach(ArrayList.java:1257)
                        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
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
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object r5) {
                        /*
                        r4 = this;
                        r5 = (defpackage.mtj.c) r5;
                        r0 = "output";
                        defpackage.akcr.b(r5, r0);
                        r0 = r5.b();
                        r0 = (java.lang.Iterable) r0;
                        r0 = defpackage.ajyu.v(r0);
                        r1 = new lut$e$f$e$2$a;
                        r1.<init>();
                        r1 = (java.util.Comparator) r1;
                        r0 = defpackage.akfh.a(r0, r1);
                        r1 = defpackage.lut.e.f.e.2.b.a;
                        r1 = (defpackage.akbl) r1;
                        r0 = defpackage.akfh.c(r0, r1);
                        r1 = new java.util.LinkedHashMap;
                        r1.<init>();
                        r1 = (java.util.Map) r1;
                        r0 = r0.iterator();
                        r2 = r0.hasNext();
                        if (r2 == 0) goto L_0x0044;
                        r2 = r0.next();
                        r3 = r2;
                        r3 = (defpackage.lux) r3;
                        r3 = r3.a();
                        r1.put(r3, r2);
                        goto L_0x002f;
                        r0 = r5.a();
                        r2 = r5 instanceof defpackage.mtj.c.a;
                        if (r2 == 0) goto L_0x0054;
                        r5 = new luo$c$a;
                        r5.<init>(r0, r1);
                        r5 = (defpackage.luo) r5;
                        return r5;
                        r5 = r5 instanceof defpackage.mtj.c.b;
                        if (r5 == 0) goto L_0x005e;
                        r5 = new luo$c$b;
                        r5.<init>(r0, r1);
                        goto L_0x0051;
                        r5 = new ajxk;
                        r5.<init>();
                        throw r5;
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.lut$e$f$e$2.apply(java.lang.Object):java.lang.Object");
                    }
                }

                /* renamed from: lut$e$f$e$a */
                static final class a extends akcq implements akbl<defpackage.lvh.a.a, ajxw> {
                    a(ajwo ajwo) {
                        super(1, ajwo);
                    }

                    public final String getName() {
                        return "onNext";
                    }

                    public final akej getOwner() {
                        return akde.a(ajwo.class);
                    }

                    public final String getSignature() {
                        return "onNext(Ljava/lang/Object;)V";
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        obj = (defpackage.lvh.a.a) obj;
                        akcr.b(obj, "p1");
                        ((ajwo) this.receiver).a(obj);
                        return ajxw.a;
                    }
                }

                /* renamed from: lut$e$f$e$b */
                static final class b extends akcq implements akbl<a, ajxw> {
                    b(ajwo ajwo) {
                        super(1, ajwo);
                    }

                    public final String getName() {
                        return "onNext";
                    }

                    public final akej getOwner() {
                        return akde.a(ajwo.class);
                    }

                    public final String getSignature() {
                        return "onNext(Ljava/lang/Object;)V";
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        obj = (a) obj;
                        akcr.b(obj, "p1");
                        ((ajwo) this.receiver).a(obj);
                        return ajxw.a;
                    }
                }

                e(f fVar, mmi.b bVar, Map map) {
                    this.a = fVar;
                    this.b = bVar;
                    this.c = map;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    d dVar = (d) obj;
                    akcr.b(dVar, "request");
                    if ((dVar instanceof d.c) || (dVar instanceof d.b)) {
                        ajdp d;
                        if (this.b.d) {
                            Object obj2 = this.c.isEmpty() ? luo.a.a : luo.b.a;
                            mjn.c b = dVar.b();
                            if (b != null) {
                                ajdp ajdp;
                                2 2;
                                int i = luu.a[((b) b).a.ordinal()];
                                String str = "trigger";
                                if (i == 1) {
                                    d = this.a.b.d((ajfb) new luw(new a(this.a.a.a.a)));
                                    ajdp = (ajdp) this.a.a.a.d.b();
                                    2 = 1.a;
                                } else if (i == 2) {
                                    d = this.a.b.d((ajfb) new luw(new b(this.a.a.a.b)));
                                    ajdp = (ajdp) this.a.a.a.e.b();
                                    2 = 2.a;
                                } else {
                                    throw new ajxk();
                                }
                                ajdp c = ajdp.p(2).c(obj2);
                                akcr.a((Object) d, str);
                                d = c.e((ajdt) myu.a(d));
                            } else {
                                throw new ajxt("null cannot be cast to non-null type com.snap.lenses.core.ClientInterfaceProcessor.InterfaceControl.ImagePicker");
                            }
                        }
                        d = luv.a;
                        return d;
                    } else if (dVar instanceof d.a) {
                        return luv.b;
                    } else {
                        throw new ajxk();
                    }
                }
            }

            /* renamed from: lut$e$f$f */
            static final class f<T, R> implements ajfc<T, R> {
                final /* synthetic */ mhs.b a;
                private /* synthetic */ Map b;

                f(mhs.b bVar, Map map) {
                    this.a = bVar;
                    this.b = map;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    ajxm ajxm = (ajxm) obj;
                    akcr.b(ajxm, "<name for destructuring parameter 0>");
                    Object obj2 = (luo) ajxm.a;
                    final Map map = (Map) ajxm.b;
                    1 1 = new akbw<Boolean, Map<mhs, ? extends lux>, lun>(this) {
                        private /* synthetic */ f a;

                        public final lun a(boolean z, Map<mhs, ? extends lux> map) {
                            akcr.b(map, "images");
                            Object obj = map;
                            akcr.a(obj, "selections");
                            obj = obj.get(this.a.a);
                            if (obj == null) {
                                obj = mhs.c.a;
                            }
                            obj = map.get((mhs) obj);
                            if (obj == null) {
                                obj = (lux) ajyu.e((Iterable) map.values());
                                if (obj == null) {
                                    obj = lux.b.a;
                                }
                            }
                            lux lux = (lux) obj;
                            return z ? new lun.d.b(lux, map.values()) : new lun.d.a(lux, map.values());
                        }

                        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return a(((Boolean) obj).booleanValue(), (Map) obj2);
                        }
                    };
                    if (akcr.a(obj2, luo.a.a)) {
                        return lun.a.a;
                    }
                    if (akcr.a(obj2, luo.b.a)) {
                        return 1.a(false, this.b);
                    }
                    if (obj2 instanceof luo.d.b) {
                        return 1.a(true, ajzm.a(this.b, ((luo.d.b) obj2).a));
                    }
                    if (obj2 instanceof luo.d.a) {
                        map = ajzm.a(this.b, ((luo.d.a) obj2).a);
                        return (map.isEmpty() ^ 1) != 0 ? 1.a(false, map) : lun.c.a;
                    } else if (obj2 instanceof luo.c.b) {
                        return 1.a(true, ajzm.a(this.b, ((luo.c.b) obj2).a));
                    } else {
                        if (obj2 instanceof luo.c.a) {
                            luo.c.a aVar = (luo.c.a) obj2;
                            map = ajzm.a(this.b, aVar.b);
                            return (1 ^ map.isEmpty()) != 0 ? 1.a(false, map) : aVar.a == 0 ? lun.c.a : lun.b.a;
                        } else {
                            throw new ajxk();
                        }
                    }
                }
            }

            /* renamed from: lut$e$f$a */
            static final class a<T, R> implements ajfc<T, R> {
                public static final a a = new a();

                a() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    obj = (lun) obj;
                    akcr.b(obj, "it");
                    if (akcr.a(obj, lun.b.a) || akcr.a(obj, lun.c.a) || akcr.a(obj, defpackage.lun.a.a)) {
                        return lux.b.a;
                    }
                    if (obj instanceof lun.d) {
                        return ((lun.d) obj).a();
                    }
                    throw new ajxk();
                }
            }

            /* renamed from: lut$e$f$b */
            static final class b<T, R> implements ajfc<lux, ajdb> {
                private /* synthetic */ f a;

                /* renamed from: lut$e$f$b$a */
                static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
                    private /* synthetic */ defpackage.mnt.a a;

                    a(defpackage.mnt.a aVar) {
                        this.a = aVar;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        mmt mmt = (mmt) obj;
                        akcr.b(mmt, "it");
                        return mmt.m().a().b(this.a);
                    }
                }

                b(f fVar) {
                    this.a = fVar;
                }

                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0080 in {2, 3, 6, 9, 12, 17, 19, 21} preds:[]
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
                public final /* synthetic */ java.lang.Object apply(java.lang.Object r8) {
                    /*
                    r7 = this;
                    r8 = (defpackage.lux) r8;
                    r0 = "selected";
                    defpackage.akcr.b(r8, r0);
                    r0 = r8 instanceof defpackage.lux.c;
                    if (r0 == 0) goto L_0x0017;
                    r0 = new mnt$a$b;
                    r8 = (defpackage.lux.c) r8;
                    r8 = r8.b;
                    r0.<init>(r8);
                    r0 = (defpackage.mnt.a) r0;
                    goto L_0x004f;
                    r0 = r8 instanceof defpackage.lux.a.a;
                    if (r0 == 0) goto L_0x002d;
                    r0 = new mnt$a$a$a;
                    r1 = r8.b();
                    r8 = (defpackage.lux.a.a) r8;
                    r2 = r8.a;
                    r3 = r8.b;
                    r8 = r8.c;
                    r0.<init>(r1, r3, r2, r8);
                    goto L_0x0014;
                    r0 = r8 instanceof defpackage.lux.a.b;
                    if (r0 == 0) goto L_0x0046;
                    r0 = new mnt$a$a$b;
                    r2 = r8.b();
                    r8 = (defpackage.lux.a.b) r8;
                    r4 = r8.a;
                    r3 = r8.b;
                    r5 = r8.c;
                    r6 = r8.d;
                    r1 = r0;
                    r1.<init>(r2, r3, r4, r5, r6);
                    goto L_0x0014;
                    r0 = defpackage.lux.b.a;
                    r8 = defpackage.akcr.a(r8, r0);
                    if (r8 == 0) goto L_0x007a;
                    r0 = 0;
                    if (r0 == 0) goto L_0x0071;
                    r8 = r7.a;
                    r8 = r8.a;
                    r8 = r8.b;
                    r1 = 1;
                    r8 = r8.c(r1);
                    r1 = new lut$e$f$b$a;
                    r1.<init>(r0);
                    r1 = (defpackage.ajfc) r1;
                    r8 = r8.x(r1);
                    r8 = r8.g();
                    if (r8 == 0) goto L_0x0071;
                    r8 = (defpackage.ajdb) r8;
                    return r8;
                    r8 = defpackage.ajhn.a;
                    r8 = defpackage.ajvo.a(r8);
                    r8 = (defpackage.ajdb) r8;
                    return r8;
                    r8 = new ajxk;
                    r8.<init>();
                    throw r8;
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lut$e$f$b.apply(java.lang.Object):java.lang.Object");
                }
            }

            /* renamed from: lut$e$f$1 */
            static final class 1<T, R> implements ajfc<T, R> {
                public static final 1 a = new 1();

                1() {
                }

                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x00c2 in {5, 6, 8, 14, 15, 18, 20, 23, 26, 28} preds:[]
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
                    r4 = (defpackage.lun) r4;
                    r0 = "it";
                    defpackage.akcr.b(r4, r0);
                    r0 = r4 instanceof defpackage.lun.d.b;
                    r1 = 10;
                    if (r0 == 0) goto L_0x004c;
                    r4 = (defpackage.lun.d.b) r4;
                    r0 = r4.a;
                    r0 = r0.a();
                    r4 = r4.b;
                    r4 = (java.lang.Iterable) r4;
                    r2 = new java.util.ArrayList;
                    r1 = defpackage.ajyn.a(r4, r1);
                    r2.<init>(r1);
                    r2 = (java.util.Collection) r2;
                    r4 = r4.iterator();
                    r1 = r4.hasNext();
                    if (r1 == 0) goto L_0x003c;
                    r1 = r4.next();
                    r1 = (defpackage.lux) r1;
                    r1 = defpackage.luv.a(r1);
                    r2.add(r1);
                    goto L_0x0028;
                    r2 = (java.util.List) r2;
                    r2 = (java.lang.Iterable) r2;
                    r4 = defpackage.ajyu.k(r2);
                    r1 = new lvh$c$c$b;
                    r1.<init>(r0, r4);
                    r1 = (defpackage.lvh.c) r1;
                    return r1;
                    r0 = r4 instanceof defpackage.lun.d.a;
                    if (r0 == 0) goto L_0x008d;
                    r4 = (defpackage.lun.d.a) r4;
                    r0 = r4.a;
                    r0 = r0.a();
                    r4 = r4.b;
                    r4 = (java.lang.Iterable) r4;
                    r2 = new java.util.ArrayList;
                    r1 = defpackage.ajyn.a(r4, r1);
                    r2.<init>(r1);
                    r2 = (java.util.Collection) r2;
                    r4 = r4.iterator();
                    r1 = r4.hasNext();
                    if (r1 == 0) goto L_0x007f;
                    r1 = r4.next();
                    r1 = (defpackage.lux) r1;
                    r1 = defpackage.luv.a(r1);
                    r2.add(r1);
                    goto L_0x006b;
                    r2 = (java.util.List) r2;
                    r2 = (java.lang.Iterable) r2;
                    r4 = defpackage.ajyu.k(r2);
                    r1 = new lvh$c$c$a;
                    r1.<init>(r0, r4);
                    goto L_0x0049;
                    r0 = defpackage.lun.c.a;
                    r0 = defpackage.akcr.a(r4, r0);
                    if (r0 == 0) goto L_0x00a0;
                    r4 = new lvh$c$b;
                    r0 = 2131887498; // 0x7f12058a float:1.9409605E38 double:1.0532923736E-314;
                    r4.<init>(r0);
                    r4 = (defpackage.lvh.c) r4;
                    return r4;
                    r0 = defpackage.lun.b.a;
                    r0 = defpackage.akcr.a(r4, r0);
                    if (r0 == 0) goto L_0x00b1;
                    r4 = new lvh$c$b;
                    r0 = 2131887497; // 0x7f120589 float:1.9409603E38 double:1.053292373E-314;
                    r4.<init>(r0);
                    goto L_0x009d;
                    r0 = defpackage.lun.a.a;
                    r4 = defpackage.akcr.a(r4, r0);
                    if (r4 == 0) goto L_0x00bc;
                    r4 = defpackage.lvh.c.a.a;
                    goto L_0x009d;
                    r4 = new ajxk;
                    r4.<init>();
                    throw r4;
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lut$e$f$1.apply(java.lang.Object):java.lang.Object");
                }
            }

            /* renamed from: lut$e$f$c */
            static final class c extends akcs implements akbw<Integer, miq, defpackage.lux.c> {
                public static final c a = new c();

                c() {
                    super(2);
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int intValue = ((Number) obj).intValue();
                    miq miq = (miq) obj2;
                    akcr.b(miq, MessageMediaRefModel.URI);
                    return new defpackage.lux.c(new mhs.b(intValue), miq, intValue);
                }
            }

            f(e eVar, ajdp ajdp, ajdp ajdp2, ajdp ajdp3) {
                this.a = eVar;
                this.c = ajdp;
                this.b = ajdp2;
                this.d = ajdp3;
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmi.c cVar = (mmi.c) obj;
                akcr.b(cVar, "event");
                if (cVar instanceof mmi.c.a.d) {
                    mmi.c.a.d dVar = (mmi.c.a.d) cVar;
                    mmi.b bVar = dVar.b;
                    Object obj2 = (bVar.c || bVar.d) ? 1 : null;
                    if (obj2 != null) {
                        Map linkedHashMap;
                        mmi.b bVar2 = dVar.b;
                        mhs.b bVar3 = bVar2.a;
                        if (bVar2.c) {
                            linkedHashMap = new LinkedHashMap();
                            for (Object next : akfh.a(ajyu.v(bVar2.j), (akbw) c.a)) {
                                linkedHashMap.put(((lux.c) next).a, next);
                            }
                        } else {
                            linkedHashMap = ajyx.a;
                        }
                        obj = this.c.a((ajfl) new d(bVar3)).u(new e(this, bVar2, linkedHashMap));
                        akcr.a(obj, "requests");
                        ajdp a = ajpy.k(ajwa.a(obj, this.d).p(new f(bVar3, linkedHashMap))).a();
                        return a.p(1.a).a((ajdb) a.p(a.a).j(ajfu.a).v(new b(this)));
                    }
                }
                return luv.c;
            }
        }

        e(lut lut, ajdp ajdp) {
            this.a = lut;
            this.b = ajdp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object b = this.a.c.b(a.class);
            String str = "ofType(R::class.java)";
            akcr.a(b, str);
            Object u = this.b.u(a.a);
            akcr.a(u, "lensCore.switchMap { it.…sor.imagePickerRequests }");
            u = u.i().a();
            akcr.a(u, "lensCore.switchMap { it.…              .refCount()");
            Object b2 = this.a.c.b(lvh.a.b.class);
            akcr.a(b2, str);
            Object p = u.p(b.a);
            akcr.a(p, "clientInterfaceRequests.map { it.lensId }");
            p = ajwb.a(b2, (ajdt) p).j(ajfu.a).b((Object) ajyx.a, (ajex) c.a);
            akcr.a(p, "relay.ofType<Action.Sele…tifier)\n                }");
            ajdp a = p.i().a();
            akcr.a((Object) a, "relay.ofType<Action.Sele…              .refCount()");
            b = this.b.u(d.a).a((ajfl) e.a).u(new f(this, u, b, a)).j(ajfu.a);
            akcr.a(b, "lensCore.switchMap { it.… }.distinctUntilChanged()");
            return ajpy.k(ajdp.b((ajdt) b, (ajdt) myu.a(a))).a();
        }
    }

    /* renamed from: lut$d */
    static final class d extends akcs implements akbk<ajdp<mtj.c>> {
        private /* synthetic */ lut a;

        d(lut lut) {
            this.a = lut;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            lut lut = this.a;
            return lut.a(lut, new mtj.a.a(lut.a));
        }
    }

    /* renamed from: lut$c */
    static final class c extends akcs implements akbk<ajdp<defpackage.mtj.c>> {
        private /* synthetic */ lut a;

        c(lut lut) {
            this.a = lut;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            lut lut = this.a;
            return lut.a(lut, new mtj.a.b(lut.b));
        }
    }

    /* renamed from: lut$b */
    static final class b<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ lut a;
        private /* synthetic */ mtj.a b;

        b(lut lut, mtj.a aVar) {
            this.a = lut;
            this.b = aVar;
        }

        public final /* synthetic */ Object call() {
            return this.a.f.a(this.b);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lut.class), "outputs", "getOutputs()Lio/reactivex/Observable;"), new akdc(akde.a(lut.class), "observeImages", "getObserveImages()Lio/reactivex/Observable;"), new akdc(akde.a(lut.class), "observeFaces", "getObserveFaces()Lio/reactivex/Observable;")};
    }

    public /* synthetic */ lut(ajdp ajdp, mtj mtj, zfw zfw) {
        this(ajdp, mtj, zfw, TimeUnit.SECONDS);
    }

    private lut(ajdp<mmt> ajdp, mtj mtj, zfw zfw, TimeUnit timeUnit) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mtj, "externalImagesRepository");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "disposeTimeUnit");
        this.f = mtj;
        this.i = zfw;
        this.j = 3;
        this.k = timeUnit;
        Object ajwo = new ajwo();
        String str = "PublishSubject.create<Action.LoadNextPage>()";
        akcr.a(ajwo, str);
        this.a = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str);
        this.b = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Action>()");
        this.c = ajwo;
        this.g = new luw(new a(this.c));
        this.h = ajxh.a(new e(this, ajdp));
        this.d = ajxh.a(new d(this));
        this.e = ajxh.a(new c(this));
    }

    public static final /* synthetic */ ajdp a(lut lut, mtj.a aVar) {
        Object g = ajdp.a((Callable) new b(lut, aVar)).i().g(3, lut.k, lut.i.b());
        akcr.a(g, "Observable.defer { exter…Schedulers.computation())");
        return g;
    }

    public final ajfb<lvh.a> a() {
        return this.g;
    }

    public final ajdp<c> b() {
        return (ajdp) this.h.b();
    }
}
