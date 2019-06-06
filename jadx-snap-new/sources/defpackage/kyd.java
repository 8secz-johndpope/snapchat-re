package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.common.base.Supplier;
import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.dpv.a;
import defpackage.dpv.a.b.c;
import defpackage.dpv.a.b.d;
import defpackage.kqe.ak;
import defpackage.kxe.f;
import defpackage.kxe.g;
import defpackage.kxe.h;
import defpackage.kxe.i;
import defpackage.kxe.j;
import defpackage.kxe.l;
import defpackage.kxe.m;
import defpackage.kxe.q;
import defpackage.kxe.r;
import defpackage.kxe.t;
import defpackage.kxe.v;
import defpackage.kxe.w;
import defpackage.lqf.b.b;
import defpackage.mwd.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: kyd */
abstract class kyd {

    /* renamed from: kyd$a */
    public static final class a {

        /* renamed from: kyd$a$b */
        public static final class b extends ide {
            private final idj a;
            private /* synthetic */ ide b;
            private /* synthetic */ ide c;

            b(ide ide, ide ide2, String str, idi idi) {
                this.b = ide;
                this.c = ide2;
                super(str, idi);
                this.a = typedUiPage((idl) ide.getPage(), new String[0]);
            }

            public final idj getPage() {
                return this.a;
            }
        }

        /* renamed from: kyd$a$z */
        static final class z<V> implements Callable<T> {
            private /* synthetic */ ajwy a;

            z(ajwy ajwy) {
                this.a = ajwy;
            }

            public final /* synthetic */ Object call() {
                kvl kvl = (kvl) this.a.get();
                if (kvl != null) {
                    ajdp d = kvl.d();
                    if (d != null) {
                        return d;
                    }
                }
                Object a = ajvo.a(ajot.a);
                akcr.a(a, "Observable.empty()");
                return a;
            }
        }

        /* renamed from: kyd$a$aa */
        static final class aa<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final aa a = new aa();

            /* renamed from: kyd$a$aa$1 */
            static final class 1<T, R> implements ajfc<T, R> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    kqr kqr = (kqr) obj;
                    akcr.b(kqr, "lensInfoPackage");
                    akcr.b(kqr, "receiver$0");
                    aepx aepx = new aepx();
                    aepx.a = kqr.a;
                    aepx.b = null;
                    aepx.f = kqr.b;
                    aepx.d = kqr.c;
                    aepx.e = kqr.d;
                    aepx.h = kqr.g;
                    aepx.c = kqr.i;
                    aepx.i = kqr.f;
                    aepx.j = kqr.e;
                    aepx.k = Boolean.valueOf(kqr.l);
                    aepx.l = Boolean.valueOf(kqr.m);
                    return aepx;
                }
            }

            aa() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajdp ajdp = (ajdp) obj;
                akcr.b(ajdp, "observable");
                return ajdp.p(1.a).j(ajfu.a);
            }
        }

        /* renamed from: kyd$a$ac */
        public static final class ac<T1, T2, R> implements ajex<T1, T2, R> {
            public final R apply(T1 t1, T2 t2) {
                return new dpx((dpw) t1, (aepx) t2);
            }
        }

        /* renamed from: kyd$a$ai */
        static final class ai extends akcs implements akbk<mxa> {
            private /* synthetic */ ajwy a;

            ai(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lfu lfu = (lfu) this.a.get();
                if (lfu != null) {
                    mxa k = lfu.k();
                    if (k != null) {
                        return k;
                    }
                }
                return defpackage.mxa.a.a;
            }
        }

        /* renamed from: kyd$a$aj */
        static final class aj extends akcs implements akbk<mof> {
            private /* synthetic */ ajwy a;

            aj(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lfu lfu = (lfu) this.a.get();
                if (lfu != null) {
                    mof b = lfu.r().b();
                    if (b != null) {
                        return b;
                    }
                }
                return defpackage.mof.a.a;
            }
        }

        /* renamed from: kyd$a$ak */
        static final class ak extends akcs implements akbk<mok<? super moc>> {
            private /* synthetic */ ajwy a;

            ak(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lfu lfu = (lfu) this.a.get();
                if (lfu != null) {
                    mok c = lfu.r().c();
                    if (c != null) {
                        return c;
                    }
                }
                return defpackage.mok.a.a;
            }
        }

        /* renamed from: kyd$a$ao */
        static final class ao<T, R> implements ajfc<T, R> {
            public static final ao a = new ao();

            ao() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Rect rect = (Rect) obj;
                akcr.b(rect, "rect");
                return new mih(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        /* renamed from: kyd$a$ag */
        static final class ag extends akcs implements akbk<mng> {
            private /* synthetic */ ajwy a;

            ag(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                kvl kvl = (kvl) this.a.get();
                if (kvl != null) {
                    mng c = kvl.c();
                    if (c != null) {
                        return c;
                    }
                }
                return defpackage.mng.a.a;
            }
        }

        /* renamed from: kyd$a$d */
        static final class d extends akcs implements akbk<lth> {
            private /* synthetic */ ajwy a;

            d(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                kws kws = (kws) this.a.get();
                if (kws != null) {
                    lth a = kws.a();
                    if (a != null) {
                        return a;
                    }
                }
                return defpackage.lth.a.a;
            }
        }

        /* renamed from: kyd$a$y */
        static final class y extends akcs implements akbk<kqf> {
            private /* synthetic */ ajwy a;

            y(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                kvl kvl = (kvl) this.a.get();
                if (kvl != null) {
                    kqf b = kvl.b();
                    if (b != null) {
                        return b;
                    }
                }
                return defpackage.kqf.a.a;
            }
        }

        /* renamed from: kyd$a$e */
        static final class e<T> implements ajfb<lwo> {
            private /* synthetic */ ajws a;

            e(ajws ajws) {
                this.a = ajws;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x003a in {2, 6, 9, 12, 15, 18, 20, 22} preds:[]
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
                	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
                	at java.lang.Iterable.forEach(Iterable.java:75)
                	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
                	at jadx.core.ProcessClass.process(ProcessClass.java:37)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                */
            public final /* synthetic */ void accept(java.lang.Object r2) {
                /*
                r1 = this;
                r2 = (defpackage.lwo) r2;
                r0 = r2 instanceof defpackage.lwo.c.a;
                if (r0 == 0) goto L_0x000b;
                r2 = defpackage.dpq.c.c.a.a;
                r2 = (defpackage.dpq) r2;
                goto L_0x002e;
                r0 = r2 instanceof defpackage.lwo.c.b;
                if (r0 == 0) goto L_0x0012;
                r2 = defpackage.dpq.c.c.b.a;
                goto L_0x0008;
                r0 = r2 instanceof defpackage.lwo.b;
                if (r0 == 0) goto L_0x0019;
                r2 = defpackage.dpq.c.b.a;
                goto L_0x0008;
                r0 = r2 instanceof defpackage.lwo.d;
                if (r0 == 0) goto L_0x0020;
                r2 = defpackage.dpq.b.a.a;
                goto L_0x0008;
                r0 = r2 instanceof defpackage.lwo.a.b;
                if (r0 == 0) goto L_0x0027;
                r2 = defpackage.dpq.c.a.b.a;
                goto L_0x0008;
                r2 = r2 instanceof defpackage.lwo.a.a;
                if (r2 == 0) goto L_0x0034;
                r2 = defpackage.dpq.c.a.a.a;
                goto L_0x0008;
                r0 = r1.a;
                r0.a(r2);
                return;
                r2 = new ajxk;
                r2.<init>();
                throw r2;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kyd$a$e.accept(java.lang.Object):void");
            }
        }

        /* renamed from: kyd$a$x */
        static final class x extends akcs implements akbk<mwe> {
            private /* synthetic */ ajwy a;
            private /* synthetic */ dpv b;
            private /* synthetic */ dpr c;
            private /* synthetic */ ajdp d;

            /* renamed from: kyd$a$x$a */
            public static final class a implements mwe {
                final /* synthetic */ akbl a;
                private /* synthetic */ mwe b;

                /* renamed from: kyd$a$x$a$1 */
                public static final class 1<T, R> implements ajfc<T, R> {
                    private /* synthetic */ a a;

                    public 1(a aVar) {
                        this.a = aVar;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        akcr.b(list, "lenses");
                        if (list.isEmpty()) {
                            return list;
                        }
                        if (list.size() == 1) {
                            return ((Boolean) this.a.a.invoke(ajyu.f(list))).booleanValue() ? list : ajyw.a;
                        } else {
                            Collection arrayList = new ArrayList();
                            for (Object next : list) {
                                if (((Boolean) this.a.a.invoke(next)).booleanValue()) {
                                    arrayList.add(next);
                                }
                            }
                            return (List) arrayList;
                        }
                    }
                }

                public a(mwe mwe, akbl akbl) {
                    this.b = mwe;
                    this.a = akbl;
                }

                public final ajde<List<mux>> a(defpackage.mwe.a aVar) {
                    akcr.b(aVar, "queryCriteria");
                    Object d = this.b.a(aVar).d((ajfc) new 1(this));
                    akcr.a(d, "lensRepository.query(que…dicate)\n                }");
                    return d;
                }
            }

            /* renamed from: kyd$a$x$f */
            static final class f<T, R> implements ajfc<T, R> {
                public static final f a = new f();

                f() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    lqf lqf = (lqf) obj;
                    akcr.b(lqf, "cameraLifecycle");
                    return Boolean.valueOf(lqf instanceof b);
                }
            }

            /* renamed from: kyd$a$x$b */
            public static final class b implements mwe {
                final /* synthetic */ akbl a;
                private /* synthetic */ mwe b;

                /* renamed from: kyd$a$x$b$1 */
                public static final class 1<T, R> implements ajfc<T, R> {
                    private /* synthetic */ b a;

                    public 1(b bVar) {
                        this.a = bVar;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        akcr.b(list, "lenses");
                        if (list.isEmpty()) {
                            return list;
                        }
                        if (list.size() == 1) {
                            return ((Boolean) this.a.a.invoke(ajyu.f(list))).booleanValue() ? list : ajyw.a;
                        } else {
                            Collection arrayList = new ArrayList();
                            for (Object next : list) {
                                if (((Boolean) this.a.a.invoke(next)).booleanValue()) {
                                    arrayList.add(next);
                                }
                            }
                            return (List) arrayList;
                        }
                    }
                }

                public b(mwe mwe, akbl akbl) {
                    this.b = mwe;
                    this.a = akbl;
                }

                public final ajde<List<mux>> a(defpackage.mwe.a aVar) {
                    akcr.b(aVar, "queryCriteria");
                    Object d = this.b.a(aVar).d((ajfc) new 1(this));
                    akcr.a(d, "lensRepository.query(que…dicate)\n                }");
                    return d;
                }
            }

            /* renamed from: kyd$a$x$c */
            public static final class c implements mwe {
                final /* synthetic */ akbl a;
                private /* synthetic */ mwe b;

                /* renamed from: kyd$a$x$c$1 */
                public static final class 1<T, R> implements ajfc<T, R> {
                    private /* synthetic */ c a;

                    public 1(c cVar) {
                        this.a = cVar;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        akcr.b(list, "lenses");
                        if (list.isEmpty()) {
                            return list;
                        }
                        if (list.size() == 1) {
                            return ((Boolean) this.a.a.invoke(ajyu.f(list))).booleanValue() ? list : ajyw.a;
                        } else {
                            Collection arrayList = new ArrayList();
                            for (Object next : list) {
                                if (((Boolean) this.a.a.invoke(next)).booleanValue()) {
                                    arrayList.add(next);
                                }
                            }
                            return (List) arrayList;
                        }
                    }
                }

                public c(mwe mwe, akbl akbl) {
                    this.b = mwe;
                    this.a = akbl;
                }

                public final ajde<List<mux>> a(defpackage.mwe.a aVar) {
                    akcr.b(aVar, "queryCriteria");
                    Object d = this.b.a(aVar).d((ajfc) new 1(this));
                    akcr.a(d, "lensRepository.query(que…dicate)\n                }");
                    return d;
                }
            }

            /* renamed from: kyd$a$x$d */
            public static final class d implements mwe {
                final /* synthetic */ akbl a;
                private /* synthetic */ mwe b;

                /* renamed from: kyd$a$x$d$1 */
                public static final class 1<T, R> implements ajfc<T, R> {
                    private /* synthetic */ d a;

                    public 1(d dVar) {
                        this.a = dVar;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        akcr.b(list, "lenses");
                        if (list.isEmpty()) {
                            return list;
                        }
                        if (list.size() == 1) {
                            return ((Boolean) this.a.a.invoke(ajyu.f(list))).booleanValue() ? list : ajyw.a;
                        } else {
                            Collection arrayList = new ArrayList();
                            for (Object next : list) {
                                if (((Boolean) this.a.a.invoke(next)).booleanValue()) {
                                    arrayList.add(next);
                                }
                            }
                            return (List) arrayList;
                        }
                    }
                }

                public d(mwe mwe, akbl akbl) {
                    this.b = mwe;
                    this.a = akbl;
                }

                public final ajde<List<mux>> a(defpackage.mwe.a aVar) {
                    akcr.b(aVar, "queryCriteria");
                    Object d = this.b.a(aVar).d((ajfc) new 1(this));
                    akcr.a(d, "lensRepository.query(que…dicate)\n                }");
                    return d;
                }
            }

            /* renamed from: kyd$a$x$e */
            public static final class e implements mwe {
                final /* synthetic */ akbl a;
                private /* synthetic */ mwe b;

                /* renamed from: kyd$a$x$e$1 */
                public static final class 1<T, R> implements ajfc<T, R> {
                    private /* synthetic */ e a;

                    public 1(e eVar) {
                        this.a = eVar;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        akcr.b(list, "lenses");
                        if (list.isEmpty()) {
                            return list;
                        }
                        if (list.size() == 1) {
                            return ((Boolean) this.a.a.invoke(ajyu.f(list))).booleanValue() ? list : ajyw.a;
                        } else {
                            Collection arrayList = new ArrayList();
                            for (Object next : list) {
                                if (((Boolean) this.a.a.invoke(next)).booleanValue()) {
                                    arrayList.add(next);
                                }
                            }
                            return (List) arrayList;
                        }
                    }
                }

                public e(mwe mwe, akbl akbl) {
                    this.b = mwe;
                    this.a = akbl;
                }

                public final ajde<List<mux>> a(defpackage.mwe.a aVar) {
                    akcr.b(aVar, "queryCriteria");
                    Object d = this.b.a(aVar).d((ajfc) new 1(this));
                    akcr.a(d, "lensRepository.query(que…dicate)\n                }");
                    return d;
                }
            }

            x(ajwy ajwy, dpv dpv, dpr dpr, ajdp ajdp) {
                this.a = ajwy;
                this.b = dpv;
                this.c = dpr;
                this.d = ajdp;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lfu lfu = (lfu) this.a.get();
                if (lfu == null) {
                    return mwd.a();
                }
                Object n;
                dpv dpv = this.b;
                String str = "lensRepository";
                if (dpv instanceof defpackage.dpv.a.b) {
                    if (dpv instanceof d) {
                        n = lfu.n();
                    } else if ((dpv instanceof c) || (dpv instanceof defpackage.dpv.a.b.a) || (dpv instanceof defpackage.dpv.a.b.b)) {
                        n = lfu.m();
                    } else {
                        throw new ajxk();
                    }
                    mhs.b bVar = new mhs.b(((defpackage.dpv.a.b) this.b).a());
                    akcr.b(n, str);
                    akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                    mwe cVar = new mwd.c(n, bVar);
                    akcr.b(cVar, str);
                    n = new mwd.d(cVar);
                } else {
                    a aVar;
                    mwe l = lfu.l();
                    Object obj = this.c;
                    if (akcr.a(obj, dpr.b.b)) {
                        aVar = new a(l, mwi.d);
                    } else if (obj instanceof dpr.c) {
                        aVar = new b(l, mwi.e);
                    } else if (akcr.a(obj, dpr.d.b)) {
                        n = new d(new c(l, mwi.f), mwi.g);
                    } else {
                        aVar = new e(l, mwi.f);
                    }
                    n = aVar;
                }
                akcr.b(n, "repository");
                mwe muh = new muh(n);
                n = this.d.a(ajcw.LATEST).d((ajfc) f.a).b(ajfu.a).c(Boolean.FALSE);
                akcr.a(n, "cameraLifecycle.toFlowab…hanged().startWith(false)");
                akcr.b(muh, str);
                akcr.b(n, "signal");
                return mwd.a(muh, (mvv) new e(n));
            }
        }

        /* renamed from: kyd$a$j */
        static final class j<T> implements ajfb<lqo> {
            private /* synthetic */ ajws a;

            j(ajws ajws) {
                this.a = ajws;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x0054 in {2, 3, 6, 9, 13, 17, 18, 20, 21, 23} preds:[]
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
                	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
                	at java.lang.Iterable.forEach(Iterable.java:75)
                	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
                	at jadx.core.ProcessClass.process(ProcessClass.java:37)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                */
            public final /* synthetic */ void accept(java.lang.Object r3) {
                /*
                r2 = this;
                r3 = (defpackage.lqo) r3;
                r0 = r3.a();
                r1 = defpackage.lqo.a.b.a;
                r1 = defpackage.akcr.a(r0, r1);
                if (r1 == 0) goto L_0x0013;
                r0 = defpackage.dpq.a.a.b.a;
                r0 = (defpackage.dpq.a.a) r0;
                goto L_0x0027;
                r1 = defpackage.lqo.a.a.a;
                r1 = defpackage.akcr.a(r0, r1);
                if (r1 == 0) goto L_0x001e;
                r0 = defpackage.dpq.a.a.a.a;
                goto L_0x0010;
                r1 = defpackage.lqo.a.c.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x004e;
                r0 = 0;
                if (r0 == 0) goto L_0x004d;
                r1 = r3 instanceof defpackage.lqo.c;
                if (r1 == 0) goto L_0x0035;
                r3 = new dpq$a$c;
                r3.<init>(r0);
                r3 = (defpackage.dpq.a) r3;
                goto L_0x003f;
                r3 = r3 instanceof defpackage.lqo.b;
                if (r3 == 0) goto L_0x0047;
                r3 = new dpq$a$b;
                r3.<init>(r0);
                goto L_0x0032;
                r0 = r2.a;
                r3 = (defpackage.dpq) r3;
                r0.a(r3);
                goto L_0x004d;
                r3 = new ajxk;
                r3.<init>();
                throw r3;
                return;
                r3 = new ajxk;
                r3.<init>();
                throw r3;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kyd$a$j.accept(java.lang.Object):void");
            }
        }

        /* renamed from: kyd$a$s */
        static final class s extends akcs implements akbk<ajfb<muo>> {
            private /* synthetic */ ajwy a;

            s(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lfu lfu = (lfu) this.a.get();
                if (lfu != null) {
                    ajfb p = lfu.p();
                    if (p != null) {
                        return p;
                    }
                }
                return myr.a();
            }
        }

        /* renamed from: kyd$a$w */
        static final class w extends akcs implements akbk<mwa> {
            private /* synthetic */ ajwy a;

            w(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lfu lfu = (lfu) this.a.get();
                if (lfu != null) {
                    mwa s = lfu.s();
                    if (s != null) {
                        return s;
                    }
                }
                return defpackage.mwa.a.a;
            }
        }

        /* renamed from: kyd$a$v */
        static final class v extends akcs implements akbk<mvu> {
            private /* synthetic */ ajwy a;

            v(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lfu lfu = (lfu) this.a.get();
                if (lfu != null) {
                    mvu t = lfu.t();
                    if (t != null) {
                        return t;
                    }
                }
                return defpackage.mvu.a.a;
            }
        }

        /* renamed from: kyd$a$ae */
        static final class ae extends akcs implements akbk<mtj> {
            private /* synthetic */ ajwy a;

            ae(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                ljj ljj = (ljj) this.a.get();
                if (ljj != null) {
                    mtj f = ljj.f();
                    if (f != null) {
                        return f;
                    }
                }
                return mtj.b.a;
            }
        }

        /* renamed from: kyd$a$f */
        static final class f<T> implements ajfb<ajxr<? extends mhs, ? extends List<? extends mhs>, ? extends ak>> {
            private /* synthetic */ ajdp A;
            private /* synthetic */ kyc a;
            private /* synthetic */ ajdp b;
            private /* synthetic */ ajdp c;
            private /* synthetic */ lth d;
            private /* synthetic */ ajfb e;
            private /* synthetic */ ajfb f;
            private /* synthetic */ ajfb g;
            private /* synthetic */ mzk h;
            private /* synthetic */ mwa i;
            private /* synthetic */ mvu j;
            private /* synthetic */ mtj k;
            private /* synthetic */ dpr l;
            private /* synthetic */ dpv m;
            private /* synthetic */ ViewStub n;
            private /* synthetic */ ViewGroup o;
            private /* synthetic */ View p;
            private /* synthetic */ String q;
            private /* synthetic */ boolean r;
            private /* synthetic */ boolean s;
            private /* synthetic */ boolean t;
            private /* synthetic */ boolean u;
            private /* synthetic */ ajdp v;
            private /* synthetic */ ViewStub w;
            private /* synthetic */ View x;
            private /* synthetic */ dnc y;
            private /* synthetic */ czq z;

            f(kyc kyc, ajdp ajdp, ajdp ajdp2, lth lth, ajfb ajfb, ajfb ajfb2, ajfb ajfb3, mzk mzk, mwa mwa, mvu mvu, mtj mtj, dpr dpr, dpv dpv, ViewStub viewStub, ViewGroup viewGroup, View view, String str, boolean z, boolean z2, boolean z3, boolean z4, ajdp ajdp3, ViewStub viewStub2, View view2, dnc dnc, czq czq, ajdp ajdp4) {
                this.a = kyc;
                this.b = ajdp;
                this.c = ajdp2;
                this.d = lth;
                this.e = ajfb;
                this.f = ajfb2;
                this.g = ajfb3;
                this.h = mzk;
                this.i = mwa;
                this.j = mvu;
                this.k = mtj;
                this.l = dpr;
                this.m = dpv;
                this.n = viewStub;
                this.o = viewGroup;
                this.p = view;
                this.q = str;
                this.r = z;
                this.s = z2;
                this.t = z3;
                this.u = z4;
                this.v = ajdp3;
                this.w = viewStub2;
                this.x = view2;
                this.y = dnc;
                this.z = czq;
                this.A = ajdp4;
            }

            public final /* synthetic */ void accept(Object obj) {
                ajxr ajxr = (ajxr) obj;
                mhs mhs = (mhs) ajxr.a;
                List list = (List) ajxr.b;
                mhs.b bVar = (mhs.b) (!(mhs instanceof mhs.b) ? null : mhs);
                int indexOf = list.indexOf(mhs);
                if (indexOf != -1) {
                    akcr.b(list, "receiver$0");
                    int i = 0;
                    akdy a = akef.a(0, list.size());
                    if (a.a(indexOf)) {
                        List arrayList = new ArrayList();
                        int max = Math.max(list.size() - indexOf, indexOf) << 1;
                        if (max >= 0) {
                            while (true) {
                                int i2 = i / 2;
                                if ((i2 << 1) != i) {
                                    i2++;
                                }
                                i2 = (i2 * (i % 2 == 0 ? -1 : 1)) + indexOf;
                                if (a.a(i2)) {
                                    arrayList.add(list.get(i2));
                                }
                                if (i == max) {
                                    break;
                                }
                                i++;
                            }
                        }
                        list = arrayList;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("pivot(");
                        stringBuilder.append(indexOf);
                        stringBuilder.append(") is out of list size(");
                        stringBuilder.append(list.size());
                        stringBuilder.append(")!");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                Collection arrayList2 = new ArrayList();
                for (mhs mhs2 : list) {
                    mhs mhs22;
                    if (!(mhs22 instanceof mhs.b)) {
                        mhs22 = null;
                    }
                    mhs.b bVar2 = (mhs.b) mhs22;
                    if (bVar2 != null) {
                        arrayList2.add(bVar2);
                    }
                }
                this.g.accept(new muo.b(bVar, (List) arrayList2));
            }
        }

        /* renamed from: kyd$a$g */
        static final class g<T, R> implements ajfc<T, R> {
            public static final g a = new g();

            g() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                boolean z;
                defpackage.dpu.a.a aVar = (defpackage.dpu.a.a) obj;
                akcr.b(aVar, "it");
                if (aVar instanceof defpackage.dpu.a.a.a) {
                    z = true;
                } else if (aVar instanceof defpackage.dpu.a.a.b) {
                    z = false;
                } else {
                    throw new ajxk();
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: kyd$a$h */
        static final class h<T> implements ajfl<kya> {
            public static final h a = new h();

            h() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                kya kya = (kya) obj;
                akcr.b(kya, "it");
                return kya.a() != null;
            }
        }

        /* renamed from: kyd$a$i */
        static final class i<T, R> implements ajfc<T, R> {
            public static final i a = new i();

            i() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((kya) obj, "it");
                return ajxw.a;
            }
        }

        /* renamed from: kyd$a$al */
        static final class al extends akcs implements akbk<nay> {
            private /* synthetic */ ajwy a;

            al(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lni lni = (lni) this.a.get();
                if (lni != null) {
                    nay a = lni.a();
                    if (a != null) {
                        return a;
                    }
                }
                return defpackage.nay.a.a;
            }
        }

        /* renamed from: kyd$a$t */
        static final class t extends akcs implements akbk<String> {
            public static final t a = new t();

            t() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Object uuid = iig.a().toString();
                akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
                Object obj = Locale.US;
                akcr.a(obj, "Locale.US");
                if (uuid != null) {
                    uuid = uuid.toUpperCase(obj);
                    akcr.a(uuid, "(this as java.lang.String).toUpperCase(locale)");
                    return uuid;
                }
                throw new ajxt("null cannot be cast to non-null type java.lang.String");
            }
        }

        /* renamed from: kyd$a$c */
        static final class c extends akcs implements akbk<lop> {
            private /* synthetic */ ajwy a;

            c(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                kws kws = (kws) this.a.get();
                if (kws != null) {
                    lop b = kws.b();
                    if (b != null) {
                        return b;
                    }
                }
                return defpackage.lop.a.a;
            }
        }

        /* renamed from: kyd$a$ah */
        static final class ah extends akcs implements akbk<mhi<? extends mha>> {
            private /* synthetic */ ajwy a;
            private /* synthetic */ ide b;
            private /* synthetic */ nay c;
            private /* synthetic */ lop d;
            private /* synthetic */ miw e;

            ah(ajwy ajwy, ide ide, nay nay, lop lop, miw miw) {
                this.a = ajwy;
                this.b = ide;
                this.c = nay;
                this.d = lop;
                this.e = miw;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lfu lfu = (lfu) this.a.get();
                return lfu != null ? lfu.o().a(this.b).a(this.c).a(this.d).b(this.e.a(defpackage.miw.b.a.a).f(mja.TRACKING_DATA_NAME)).a(this.e.a(defpackage.miw.b.a.a).f(mja.TRACKING_DATA_CHECKSUM)) : mhc.a;
            }
        }

        /* renamed from: kyd$a$l */
        public static final class l<T> implements ajfl<Object> {
            public static final l a = new l();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof b;
            }
        }

        /* renamed from: kyd$a$m */
        static final class m<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final m a = new m();

            m() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                b bVar = (b) obj;
                akcr.b(bVar, "it");
                return ((akcr.a(bVar.b(), mim.a) ^ 1) == 0 || (akcr.a(bVar.c(), mim.a) ^ 1) == 0) ? ajdp.b((Throwable) new IllegalAccessException("CameraLifecycle.Opened.Streaming inputSize and previewSize should be defined")) : ajdp.b(new myw(bVar.b(), bVar.c()));
            }
        }

        /* renamed from: kyd$a$k */
        static final class k<T, R> implements ajfc<T, R> {
            public static final k a = new k();

            k() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                defpackage.dpu.b.a.a aVar = (defpackage.dpu.b.a.a) obj;
                akcr.b(aVar, "it");
                return new mhs.b(aVar.a);
            }
        }

        /* renamed from: kyd$a$af */
        static final class af extends akcs implements akbk<mtr> {
            private /* synthetic */ ajwy a;

            af(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                ljx ljx = (ljx) this.a.get();
                if (ljx != null) {
                    mtr c = ljx.c();
                    if (c != null) {
                        return c;
                    }
                }
                return defpackage.mtr.a.a;
            }
        }

        /* renamed from: kyd$a$am */
        static final class am extends akcs implements akbk<mtv> {
            private /* synthetic */ ajwy a;

            am(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                ljx ljx = (ljx) this.a.get();
                if (ljx != null) {
                    mtv d = ljx.d();
                    if (d != null) {
                        return d;
                    }
                }
                return defpackage.mtv.a.a;
            }
        }

        /* renamed from: kyd$a$q */
        static final class q<T, R> implements ajfc<T, R> {
            public static final q a = new q();

            q() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                defpackage.dpu.b.a.a aVar = (defpackage.dpu.b.a.a) obj;
                akcr.b(aVar, "it");
                return new mhs.b(aVar.a);
            }
        }

        /* renamed from: kyd$a$n */
        public static final class n<T> implements ajfl<Object> {
            public static final n a = new n();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.nak.a.a;
            }
        }

        /* renamed from: kyd$a$r */
        static final class r<T, R> implements ajfc<T, R> {
            public static final r a = new r();

            r() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                defpackage.nak.a.a aVar = (defpackage.nak.a.a) obj;
                akcr.b(aVar, "<name for destructuring parameter 0>");
                return Boolean.valueOf(aVar.a);
            }
        }

        /* renamed from: kyd$a$o */
        static final class o<T1, T2, T3, R> implements ajfd<Boolean, Boolean, Boolean, Boolean> {
            public static final o a = new o();

            o() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                boolean z = ((Boolean) obj).booleanValue() && !((Boolean) obj2).booleanValue() && ((Boolean) obj3).booleanValue();
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: kyd$a$p */
        static final class p<T1, T2, T3, R> implements ajfd<Boolean, Boolean, Boolean, Boolean> {
            public static final p a = new p();

            p() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                boolean z = ((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue() && ((Boolean) obj3).booleanValue();
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: kyd$a$ab */
        static final class ab<T> implements ajfb<dpu> {
            private /* synthetic */ ajws a;

            ab(ajws ajws) {
                this.a = ajws;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.a.a((Object) (dpu) obj);
            }
        }

        /* renamed from: kyd$a$u */
        static final class u extends akcs implements akbk<lxh> {
            private /* synthetic */ ajwy a;

            u(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                kwd kwd = (kwd) this.a.get();
                if (kwd != null) {
                    lxh b = kwd.b();
                    if (b != null) {
                        return b;
                    }
                }
                return lxh.b.a;
            }
        }

        /* renamed from: kyd$a$a */
        static final class a extends akcs implements akbk<kpk> {
            private /* synthetic */ ajwy a;

            a(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                kvg kvg = (kvg) this.a.get();
                if (kvg != null) {
                    kpk a = kvg.a();
                    if (a != null) {
                        return a;
                    }
                }
                return defpackage.kpk.a.a;
            }
        }

        /* renamed from: kyd$a$an */
        static final class an extends akcs implements akbk<nbh> {
            private /* synthetic */ ajwy a;

            an(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lno lno = (lno) this.a.get();
                if (lno != null) {
                    nbh b = lno.b();
                    if (b != null) {
                        return b;
                    }
                }
                return nbh.b.a;
            }
        }

        /* renamed from: kyd$a$ad */
        static final class ad extends akcs implements akbl<Boolean, mqt> {
            private /* synthetic */ mqt a;
            private /* synthetic */ nbh b;
            private /* synthetic */ kqf c;

            ad(mqt mqt, nbh nbh, kqf kqf) {
                this.a = mqt;
                this.b = nbh;
                this.c = kqf;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                obj = (Boolean) obj;
                akcr.a(obj, "enabled");
                return obj.booleanValue() ? this.a : new liy(this.b, new liw(this.c));
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static lba a(Supplier<mmf> supplier, ajdp<dpw> ajdp, ajws<lqf> ajws, ajdp<ebs> ajdp2, ajdp<ebk> ajdp3, ajdp<Float> ajdp4, dnr dnr, ide ide, zgb zgb, boolean z, Supplier<iib> supplier2, ajdp<mih> ajdp5) {
            ide ide2 = ide;
            Supplier<mmf> supplier3 = supplier;
            akcr.b(supplier, "lensCoreSupplier");
            ajdp<dpw> ajdp6 = ajdp;
            akcr.b(ajdp, "lensesLifecycle");
            akcr.b(ajws, "cameraLifecycleSubject");
            akcr.b(ajdp2, "streamingStateObservable");
            akcr.b(ajdp3, "captureStateObservable");
            akcr.b(ajdp4, "zoomObservable");
            akcr.b(dnr, "navigator");
            akcr.b(ide2, "attributedFeature");
            akcr.b(zgb, "schedulersProvider");
            akcr.b(supplier2, "screenParameterSupplier");
            akcr.b(ajdp5, "windowRect");
            return new lba(supplier, ajdp, ajws, ajdp2, ajdp3, ajdp4, dnr, zgb.a(ide2.callsite("LensesFeatureProcessingCoreSub")), z, supplier2, ajdp5);
        }

        public static lfu a(defpackage.lfu.a aVar, kxt kxt, miw miw, ide ide) {
            akcr.b(kxt, "placeholderLensRepository");
            akcr.b(miw, "configurationRepository");
            akcr.b(ide, "attributedFeature");
            if (aVar == null) {
                return null;
            }
            aVar = aVar.a(ide);
            mwe mwe = kxt;
            akcr.b(mwe, "lensRepository");
            defpackage.lfu.a aVar2 = aVar;
            Set set = aVar2.n;
            set.add(mwe);
            aVar2.a(ajyu.m(set));
            return aVar.a();
        }

        /* JADX WARNING: Missing block: B:59:0x0403, code skipped:
            if (r1 == null) goto L_0x0405;
     */
        /* JADX WARNING: Missing block: B:64:0x0419, code skipped:
            if (r1 == null) goto L_0x041b;
     */
        public static defpackage.lpj.a a(defpackage.kyc r32, defpackage.ajdp<java.lang.Double> r33, defpackage.ajdp<defpackage.mih> r34, android.view.ViewStub r35, android.view.ViewGroup r36, android.view.View r37, android.view.ViewStub r38, android.view.View r39, defpackage.lth r40, defpackage.dnc r41, java.lang.String r42, defpackage.ajdp<defpackage.dpu> r43, boolean r44, boolean r45, boolean r46, boolean r47, defpackage.dpr r48, defpackage.dpv r49, defpackage.ajfb<defpackage.lqo> r50, defpackage.ajfb<defpackage.lwo> r51, defpackage.ajfb<defpackage.muo> r52, defpackage.czq<byte[]> r53, defpackage.mzk r54, defpackage.ajdp<defpackage.kya> r55, defpackage.mwa r56, defpackage.mvu r57, defpackage.mtj r58) {
            /*
            r0 = r32;
            r3 = r33;
            r4 = r34;
            r15 = r35;
            r14 = r36;
            r5 = r40;
            r13 = r41;
            r12 = r42;
            r11 = r43;
            r10 = r48;
            r9 = r49;
            r6 = r50;
            r7 = r51;
            r8 = r53;
            r2 = r54;
            r1 = r55;
            r15 = r56;
            r14 = r57;
            r13 = r58;
            r12 = "parentComponent";
            r16 = r12;
            r12 = "Observable.empty()";
            r17 = r12;
            r12 = "lensesCameraFeatureComponent";
            defpackage.akcr.b(r0, r12);
            r12 = "cameraAverageFps";
            defpackage.akcr.b(r3, r12);
            r12 = "windowRect";
            defpackage.akcr.b(r4, r12);
            r12 = "bitmojiLensInteractor";
            defpackage.akcr.b(r5, r12);
            r12 = "lensesCameraInteractions";
            defpackage.akcr.b(r11, r12);
            r12 = "lensesCameraContext";
            defpackage.akcr.b(r10, r12);
            r12 = "lensesCameraLaunchState";
            defpackage.akcr.b(r9, r12);
            r12 = "externalControlAppearanceActionConsumer";
            defpackage.akcr.b(r6, r12);
            r12 = "captureActionConsumer";
            defpackage.akcr.b(r7, r12);
            r12 = "downloadPriorityConsumer";
            r9 = r52;
            defpackage.akcr.b(r9, r12);
            r12 = "audioSource";
            defpackage.akcr.b(r8, r12);
            r12 = "lensStatisticsRepository";
            defpackage.akcr.b(r2, r12);
            r12 = "lensesCameraExternalMetadata";
            defpackage.akcr.b(r1, r12);
            r12 = "lensDownloadStatusProvider";
            defpackage.akcr.b(r15, r12);
            r12 = "lensContentInfoProvider";
            defpackage.akcr.b(r14, r12);
            r12 = "externalImagesRepository";
            defpackage.akcr.b(r13, r12);
            r12 = r0;
            r12 = (defpackage.lpj.d) r12;	 Catch:{ all -> 0x045e }
            r0 = r16;
            defpackage.akcr.b(r12, r0);	 Catch:{ all -> 0x045e }
            r16 = defpackage.lqj.f();	 Catch:{ all -> 0x045e }
            defpackage.akcr.b(r12, r0);	 Catch:{ all -> 0x045e }
            r18 = r0;
            r0 = r16;
            r0 = (defpackage.lpj.a) r0;	 Catch:{ all -> 0x045e }
            r0.a(r12);	 Catch:{ all -> 0x045e }
            r0.a = r12;	 Catch:{ all -> 0x045e }
            r12 = r12.v();	 Catch:{ all -> 0x045e }
            r1 = "context";
            defpackage.akcr.b(r12, r1);	 Catch:{ all -> 0x045e }
            r1 = new mgz$b;	 Catch:{ all -> 0x045e }
            r1.<init>(r12);	 Catch:{ all -> 0x045e }
            r1 = (defpackage.akbk) r1;	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajxh.a(r1);	 Catch:{ all -> 0x045e }
            r12 = new mgz$c;	 Catch:{ all -> 0x045e }
            r12.<init>(r1);	 Catch:{ all -> 0x045e }
            r12 = (defpackage.akbl) r12;	 Catch:{ all -> 0x045e }
            r0.a(r12);	 Catch:{ all -> 0x045e }
            r0.b = r12;	 Catch:{ all -> 0x045e }
            r1 = r0.c;	 Catch:{ all -> 0x045e }
            r0.b(r1);	 Catch:{ all -> 0x045e }
            r1 = r0.d;	 Catch:{ all -> 0x045e }
            r0.d(r1);	 Catch:{ all -> 0x045e }
            r1 = r0.e;	 Catch:{ all -> 0x045e }
            r0.e(r1);	 Catch:{ all -> 0x045e }
            r1 = r0.f;	 Catch:{ all -> 0x045e }
            r0.j(r1);	 Catch:{ all -> 0x045e }
            r0 = r16;
            r0 = (defpackage.lpj.a) r0;	 Catch:{ all -> 0x045e }
            r1 = 0;
            r0 = r0.b(r1);	 Catch:{ all -> 0x045e }
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r0 = r0.c(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajot.a;	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajvo.a(r1);	 Catch:{ all -> 0x045e }
            r12 = r17;
            defpackage.akcr.a(r1, r12);	 Catch:{ all -> 0x045e }
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajot.a;	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajvo.a(r1);	 Catch:{ all -> 0x045e }
            defpackage.akcr.a(r1, r12);	 Catch:{ all -> 0x045e }
            r0 = r0.c(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajot.a;	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajvo.a(r1);	 Catch:{ all -> 0x045e }
            defpackage.akcr.a(r1, r12);	 Catch:{ all -> 0x045e }
            r0 = r0.f(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.mih.e;	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajdp.b(r1);	 Catch:{ all -> 0x045e }
            r2 = "Observable.just(Rectangle.ZERO)";
            defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x045e }
            r0 = r0.g(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajot.a;	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajvo.a(r1);	 Catch:{ all -> 0x045e }
            defpackage.akcr.a(r1, r12);	 Catch:{ all -> 0x045e }
            r0 = r0.h(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajot.a;	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajvo.a(r1);	 Catch:{ all -> 0x045e }
            defpackage.akcr.a(r1, r12);	 Catch:{ all -> 0x045e }
            r0 = r0.b(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.myr.a();	 Catch:{ all -> 0x045e }
            r0 = r0.b(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.myr.a();	 Catch:{ all -> 0x045e }
            r0 = r0.c(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.myr.a();	 Catch:{ all -> 0x045e }
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.lth.a.a;	 Catch:{ all -> 0x045e }
            r1 = (defpackage.lth) r1;	 Catch:{ all -> 0x045e }
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.lpi.b.a;	 Catch:{ all -> 0x045e }
            r1 = (defpackage.lpi) r1;	 Catch:{ all -> 0x045e }
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.lpj.b.a.a;	 Catch:{ all -> 0x045e }
            r1 = (defpackage.akbl) r1;	 Catch:{ all -> 0x045e }
            r0 = r0.b(r1);	 Catch:{ all -> 0x045e }
            r1 = "";
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.mzk.a.a;	 Catch:{ all -> 0x045e }
            r1 = (defpackage.mzk) r1;	 Catch:{ all -> 0x045e }
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.mwa.a.a;	 Catch:{ all -> 0x045e }
            r1 = (defpackage.mwa) r1;	 Catch:{ all -> 0x045e }
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.mvu.a.a;	 Catch:{ all -> 0x045e }
            r1 = (defpackage.mvu) r1;	 Catch:{ all -> 0x045e }
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.mtj.b.a;	 Catch:{ all -> 0x045e }
            r1 = (defpackage.mtj) r1;	 Catch:{ all -> 0x045e }
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajot.a;	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajvo.a(r1);	 Catch:{ all -> 0x045e }
            defpackage.akcr.a(r1, r12);	 Catch:{ all -> 0x045e }
            r0 = r0.i(r1);	 Catch:{ all -> 0x045e }
            r0 = r0.f(r3);	 Catch:{ all -> 0x045e }
            r0 = r0.g(r4);	 Catch:{ all -> 0x045e }
            r0 = r0.a(r5);	 Catch:{ all -> 0x045e }
            r0 = r0.b(r6);	 Catch:{ all -> 0x045e }
            r0 = r0.c(r7);	 Catch:{ all -> 0x045e }
            r29 = new kyd$a$f;	 Catch:{ all -> 0x045e }
            r2 = r55;
            r1 = r29;
            r2 = r32;
            r3 = r33;
            r4 = r34;
            r5 = r40;
            r6 = r50;
            r7 = r51;
            r8 = r52;
            r9 = r54;
            r10 = r56;
            r11 = r57;
            r30 = r12;
            r31 = r18;
            r12 = r58;
            r13 = r48;
            r14 = r49;
            r15 = r35;
            r16 = r36;
            r17 = r37;
            r18 = r42;
            r19 = r45;
            r20 = r44;
            r21 = r47;
            r22 = r46;
            r23 = r43;
            r24 = r38;
            r25 = r39;
            r26 = r41;
            r27 = r53;
            r28 = r55;
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28);	 Catch:{ all -> 0x045e }
            r1 = r29;
            r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x045e }
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = r54;
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = r56;
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = r57;
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = r58;
            r0 = r0.a(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.dpr.d.b;	 Catch:{ all -> 0x045e }
            r2 = r48;
            r1 = defpackage.akcr.a(r2, r1);	 Catch:{ all -> 0x045e }
            r3 = 1;
            if (r1 == 0) goto L_0x0221;
        L_0x0216:
            r1 = r0;
            r1 = (defpackage.lpj.a) r1;	 Catch:{ all -> 0x045e }
            r1.a(r3);	 Catch:{ all -> 0x045e }
            r4 = defpackage.lqp.o;	 Catch:{ all -> 0x045e }
            r1.a(r4);	 Catch:{ all -> 0x045e }
        L_0x0221:
            r1 = r49;
            r4 = r1 instanceof defpackage.dpv.a.b;	 Catch:{ all -> 0x045e }
            if (r4 == 0) goto L_0x0232;
        L_0x0227:
            r4 = r0;
            r4 = (defpackage.lpj.a) r4;	 Catch:{ all -> 0x045e }
            r4.b(r3);	 Catch:{ all -> 0x045e }
            r5 = defpackage.lqp.p;	 Catch:{ all -> 0x045e }
            r4.a(r5);	 Catch:{ all -> 0x045e }
        L_0x0232:
            r4 = "asyncLayoutInflaterFactory";
            r5 = r35;
            if (r5 == 0) goto L_0x029f;
        L_0x0238:
            r6 = "viewStub";
            defpackage.akcr.b(r5, r6);	 Catch:{ all -> 0x045e }
            r6 = r0;
            r6 = (defpackage.lpj.a) r6;	 Catch:{ all -> 0x045e }
            r7 = r6.a;	 Catch:{ all -> 0x045e }
            if (r7 != 0) goto L_0x0247;
        L_0x0244:
            defpackage.akcr.a(r31);	 Catch:{ all -> 0x045e }
        L_0x0247:
            r7.u();	 Catch:{ all -> 0x045e }
            r7 = r6.a;	 Catch:{ all -> 0x045e }
            if (r7 != 0) goto L_0x0251;
        L_0x024e:
            defpackage.akcr.a(r31);	 Catch:{ all -> 0x045e }
        L_0x0251:
            r7 = r7.I();	 Catch:{ all -> 0x045e }
            r8 = "CameraComponent.Builder#attachToViewStub";
            r7 = defpackage.zgb.a(r7, r8);	 Catch:{ all -> 0x045e }
            r5 = defpackage.ajdp.b(r35);	 Catch:{ all -> 0x045e }
            r8 = r6.c;	 Catch:{ all -> 0x045e }
            r9 = r8.a;	 Catch:{ all -> 0x045e }
            r12 = r6.b;	 Catch:{ all -> 0x045e }
            if (r12 != 0) goto L_0x026a;
        L_0x0267:
            defpackage.akcr.a(r4);	 Catch:{ all -> 0x045e }
        L_0x026a:
            r10 = android.view.ViewGroup.class;
            r11 = 1;
            r13 = 1;
            r14 = 0;
            r8 = defpackage.mit.a(r9, r10, r11, r12, r13, r14);	 Catch:{ all -> 0x045e }
            r5 = r5.a(r8);	 Catch:{ all -> 0x045e }
            r8 = r7.l();	 Catch:{ all -> 0x045e }
            r8 = (defpackage.zfr) r8;	 Catch:{ all -> 0x045e }
            r8 = (defpackage.ajdw) r8;	 Catch:{ all -> 0x045e }
            r5 = r5.b(r8);	 Catch:{ all -> 0x045e }
            r7 = r7.l();	 Catch:{ all -> 0x045e }
            r7 = (defpackage.zfr) r7;	 Catch:{ all -> 0x045e }
            r7 = (defpackage.ajdw) r7;	 Catch:{ all -> 0x045e }
            r5 = r5.c(r7);	 Catch:{ all -> 0x045e }
            r5 = r5.i();	 Catch:{ all -> 0x045e }
            r5 = r5.a();	 Catch:{ all -> 0x045e }
            r7 = "Observable.just(viewStub…              .refCount()";
            defpackage.akcr.a(r5, r7);	 Catch:{ all -> 0x045e }
            r6.a(r5);	 Catch:{ all -> 0x045e }
        L_0x029f:
            r5 = r36;
            if (r5 == 0) goto L_0x0312;
        L_0x02a3:
            r6 = "viewGroup";
            defpackage.akcr.b(r5, r6);	 Catch:{ all -> 0x045e }
            r6 = r0;
            r6 = (defpackage.lpj.a) r6;	 Catch:{ all -> 0x045e }
            r7 = r6.a;	 Catch:{ all -> 0x045e }
            if (r7 != 0) goto L_0x02b2;
        L_0x02af:
            defpackage.akcr.a(r31);	 Catch:{ all -> 0x045e }
        L_0x02b2:
            r7.u();	 Catch:{ all -> 0x045e }
            r7 = r6.a;	 Catch:{ all -> 0x045e }
            if (r7 != 0) goto L_0x02bc;
        L_0x02b9:
            defpackage.akcr.a(r31);	 Catch:{ all -> 0x045e }
        L_0x02bc:
            r7 = r7.I();	 Catch:{ all -> 0x045e }
            r8 = "CameraComponent.Builder#attachToViewGroup";
            r7 = defpackage.zgb.a(r7, r8);	 Catch:{ all -> 0x045e }
            r5 = defpackage.ajdp.b(r36);	 Catch:{ all -> 0x045e }
            r8 = r6.c;	 Catch:{ all -> 0x045e }
            r8 = r8.a;	 Catch:{ all -> 0x045e }
            r9 = r6.b;	 Catch:{ all -> 0x045e }
            if (r9 != 0) goto L_0x02d5;
        L_0x02d2:
            defpackage.akcr.a(r4);	 Catch:{ all -> 0x045e }
        L_0x02d5:
            r10 = android.view.ViewGroup.class;
            r11 = "viewClass";
            defpackage.akcr.b(r10, r11);	 Catch:{ all -> 0x045e }
            defpackage.akcr.b(r9, r4);	 Catch:{ all -> 0x045e }
            r4 = new mit$a;	 Catch:{ all -> 0x045e }
            r4.<init>(r8, r10, r9);	 Catch:{ all -> 0x045e }
            r4 = (defpackage.ajdu) r4;	 Catch:{ all -> 0x045e }
            r4 = r5.a(r4);	 Catch:{ all -> 0x045e }
            r5 = r7.l();	 Catch:{ all -> 0x045e }
            r5 = (defpackage.zfr) r5;	 Catch:{ all -> 0x045e }
            r5 = (defpackage.ajdw) r5;	 Catch:{ all -> 0x045e }
            r4 = r4.b(r5);	 Catch:{ all -> 0x045e }
            r5 = r7.l();	 Catch:{ all -> 0x045e }
            r5 = (defpackage.zfr) r5;	 Catch:{ all -> 0x045e }
            r5 = (defpackage.ajdw) r5;	 Catch:{ all -> 0x045e }
            r4 = r4.c(r5);	 Catch:{ all -> 0x045e }
            r4 = r4.i();	 Catch:{ all -> 0x045e }
            r4 = r4.a();	 Catch:{ all -> 0x045e }
            r5 = "Observable.just(viewGrou…              .refCount()";
            defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x045e }
            r6.a(r4);	 Catch:{ all -> 0x045e }
        L_0x0312:
            if (r37 == 0) goto L_0x0320;
        L_0x0314:
            r4 = defpackage.ajdp.b(r37);	 Catch:{ all -> 0x045e }
            r5 = "Observable.just(it)";
            defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x045e }
            r0.c(r4);	 Catch:{ all -> 0x045e }
        L_0x0320:
            r4 = r42;
            if (r4 == 0) goto L_0x0327;
        L_0x0324:
            r0.a(r4);	 Catch:{ all -> 0x045e }
        L_0x0327:
            r4 = r2 instanceof defpackage.dpr.c;	 Catch:{ all -> 0x045e }
            if (r45 != 0) goto L_0x032f;
        L_0x032b:
            if (r44 != 0) goto L_0x032f;
        L_0x032d:
            if (r4 == 0) goto L_0x0335;
        L_0x032f:
            r5 = r0;
            r5 = (defpackage.lpj.a) r5;	 Catch:{ all -> 0x045e }
            r5.c(r3);	 Catch:{ all -> 0x045e }
        L_0x0335:
            r1 = r1 instanceof defpackage.dpv.a.b;	 Catch:{ all -> 0x045e }
            if (r1 != 0) goto L_0x0368;
        L_0x0339:
            r1 = defpackage.dpr.b.b;	 Catch:{ all -> 0x045e }
            r1 = defpackage.akcr.a(r2, r1);	 Catch:{ all -> 0x045e }
            if (r1 != 0) goto L_0x0343;
        L_0x0341:
            if (r4 == 0) goto L_0x0368;
        L_0x0343:
            r1 = r0;
            r1 = (defpackage.lpj.a) r1;	 Catch:{ all -> 0x045e }
            r5 = r1.c;	 Catch:{ all -> 0x045e }
            r6 = 0;
            r7 = 0;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 0;
            r13 = 0;
            r14 = 0;
            r15 = 0;
            r16 = 0;
            r17 = 0;
            r2 = 2131428869; // 0x7f0b0605 float:1.8479395E38 double:1.0530657807E-314;
            r18 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x045e }
            r19 = 0;
            r20 = 12287; // 0x2fff float:1.7218E-41 double:6.0706E-320;
            r2 = defpackage.lqp.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ all -> 0x045e }
            r1.a(r2);	 Catch:{ all -> 0x045e }
        L_0x0368:
            if (r44 != 0) goto L_0x036c;
        L_0x036a:
            if (r4 == 0) goto L_0x0389;
        L_0x036c:
            r1 = r0;
            r1 = (defpackage.lpj.a) r1;	 Catch:{ all -> 0x045e }
            r2 = r1.c;	 Catch:{ all -> 0x045e }
            r3 = 0;
            r4 = 0;
            r5 = 0;
            r6 = 0;
            r7 = 0;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 0;
            r13 = 0;
            r14 = 0;
            r15 = 0;
            r16 = 0;
            r17 = 16375; // 0x3ff7 float:2.2946E-41 double:8.0903E-320;
            r2 = defpackage.lqp.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x045e }
            r1.a(r2);	 Catch:{ all -> 0x045e }
        L_0x0389:
            if (r47 == 0) goto L_0x03a8;
        L_0x038b:
            r1 = r0;
            r1 = (defpackage.lpj.a) r1;	 Catch:{ all -> 0x045e }
            r2 = r1.c;	 Catch:{ all -> 0x045e }
            r3 = 0;
            r4 = 0;
            r5 = 0;
            r6 = 0;
            r7 = 0;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 0;
            r13 = 0;
            r14 = 0;
            r15 = 0;
            r16 = 0;
            r17 = 16319; // 0x3fbf float:2.2868E-41 double:8.0627E-320;
            r2 = defpackage.lqp.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x045e }
            r1.a(r2);	 Catch:{ all -> 0x045e }
        L_0x03a8:
            if (r46 == 0) goto L_0x03c7;
        L_0x03aa:
            r1 = r0;
            r1 = (defpackage.lpj.a) r1;	 Catch:{ all -> 0x045e }
            r2 = r1.d;	 Catch:{ all -> 0x045e }
            r3 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x045e }
            r3 = defpackage.ajdp.b(r3);	 Catch:{ all -> 0x045e }
            r3 = (defpackage.ajdt) r3;	 Catch:{ all -> 0x045e }
            r2 = r2.e(r3);	 Catch:{ all -> 0x045e }
            r3 = "carouselCloseButtonHideS…th(Observable.just(true))";
            defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x045e }
            r1.d = r2;	 Catch:{ all -> 0x045e }
            r2 = r1.d;	 Catch:{ all -> 0x045e }
            r1.d(r2);	 Catch:{ all -> 0x045e }
        L_0x03c7:
            r1 = defpackage.dpu.a.a.class;
            r2 = r43;
            r1 = r2.b(r1);	 Catch:{ all -> 0x045e }
            r2 = "ofType(R::class.java)";
            defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x045e }
            r2 = defpackage.kyd.a.g.a;	 Catch:{ all -> 0x045e }
            r2 = (defpackage.ajfc) r2;	 Catch:{ all -> 0x045e }
            r1 = r1.p(r2);	 Catch:{ all -> 0x045e }
            r2 = "lensesCameraInteractions…                        }";
            defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x045e }
            r2 = "signal";
            defpackage.akcr.b(r1, r2);	 Catch:{ all -> 0x045e }
            r2 = r0;
            r2 = (defpackage.lpj.a) r2;	 Catch:{ all -> 0x045e }
            r3 = r2.e;	 Catch:{ all -> 0x045e }
            r1 = (defpackage.ajdt) r1;	 Catch:{ all -> 0x045e }
            r1 = r3.e(r1);	 Catch:{ all -> 0x045e }
            r3 = "carouselHideSignal.mergeWith(signal)";
            defpackage.akcr.a(r1, r3);	 Catch:{ all -> 0x045e }
            r2.e = r1;	 Catch:{ all -> 0x045e }
            r1 = r2.e;	 Catch:{ all -> 0x045e }
            r2.e(r1);	 Catch:{ all -> 0x045e }
            if (r38 == 0) goto L_0x0405;
        L_0x03ff:
            r1 = defpackage.ajdp.b(r38);	 Catch:{ all -> 0x045e }
            if (r1 != 0) goto L_0x040b;
        L_0x0405:
            r1 = defpackage.ajot.a;	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajvo.a(r1);	 Catch:{ all -> 0x045e }
        L_0x040b:
            r2 = "startButtonStub\n        …    ?: Observable.empty()";
            defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x045e }
            r0.h(r1);	 Catch:{ all -> 0x045e }
            if (r39 == 0) goto L_0x041b;
        L_0x0415:
            r1 = defpackage.ajdp.b(r39);	 Catch:{ all -> 0x045e }
            if (r1 != 0) goto L_0x0426;
        L_0x041b:
            r1 = defpackage.ajot.a;	 Catch:{ all -> 0x045e }
            r1 = defpackage.ajvo.a(r1);	 Catch:{ all -> 0x045e }
            r2 = r30;
            defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x045e }
        L_0x0426:
            r0.i(r1);	 Catch:{ all -> 0x045e }
            r1 = r41;
            if (r1 == 0) goto L_0x0437;
        L_0x042d:
            r2 = new kxk;	 Catch:{ all -> 0x045e }
            r2.<init>(r1);	 Catch:{ all -> 0x045e }
            r2 = (defpackage.lpi) r2;	 Catch:{ all -> 0x045e }
            r0.a(r2);	 Catch:{ all -> 0x045e }
        L_0x0437:
            r1 = new kxa;	 Catch:{ all -> 0x045e }
            r2 = r53;
            r1.<init>(r2);	 Catch:{ all -> 0x045e }
            r1 = (defpackage.akbl) r1;	 Catch:{ all -> 0x045e }
            r0.b(r1);	 Catch:{ all -> 0x045e }
            r1 = defpackage.kyd.a.h.a;	 Catch:{ all -> 0x045e }
            r1 = (defpackage.ajfl) r1;	 Catch:{ all -> 0x045e }
            r2 = r55;
            r1 = r2.a(r1);	 Catch:{ all -> 0x045e }
            r2 = defpackage.kyd.a.i.a;	 Catch:{ all -> 0x045e }
            r2 = (defpackage.ajfc) r2;	 Catch:{ all -> 0x045e }
            r1 = r1.p(r2);	 Catch:{ all -> 0x045e }
            r2 = "startButtonLoadingSignal";
            defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x045e }
            r0.b(r1);	 Catch:{ all -> 0x045e }
            return r0;
        L_0x045e:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kyd$a.a(kyc, ajdp, ajdp, android.view.ViewStub, android.view.ViewGroup, android.view.View, android.view.ViewStub, android.view.View, lth, dnc, java.lang.String, ajdp, boolean, boolean, boolean, boolean, dpr, dpv, ajfb, ajfb, ajfb, czq, mzk, ajdp, mwa, mvu, mtj):lpj$a");
        }

        public static mhi<? extends mha> a(kyc kyc) {
            akcr.b(kyc, "component");
            mww.d dVar = kyc;
            akcr.b(dVar, "parentComponent");
            return mwu.c().a(dVar);
        }

        public static mhi<? extends mha> a(kyc kyc, ajdp<dps> ajdp, ajdp<myw> ajdp2) {
            akcr.b(kyc, "component");
            akcr.b(ajdp, "lensesCameraControlLocation");
            akcr.b(ajdp2, "cameraSizeProperties");
            mza.d dVar = kyc;
            akcr.b(dVar, "parentComponent");
            return new kwz(ajdp, myx.c().a(dVar).a((ajdp) ajdp2));
        }

        public static mhi<? extends mha> a(mwe mwe, ajdp<lqf> ajdp, dpv dpv, ajdp<dpu> ajdp2, ajfb<lwo> ajfb) {
            akcr.b(mwe, "lensRepository");
            akcr.b(ajdp, "cameraLifecycle");
            akcr.b(dpv, "lensesCameraLaunchState");
            akcr.b(ajdp2, "lensesCameraInteractions");
            akcr.b(ajfb, "cameraFlipConsumer");
            Object b = dpv instanceof defpackage.dpv.a.b ? ajdp.b(new mhs.b(((defpackage.dpv.a.b) dpv).a())) : ajvo.a(ajot.a);
            akcr.a(b, "if (lensesCameraLaunchSt…ble.empty()\n            }");
            Object b2 = ajdp2.b(defpackage.dpu.b.a.a.class);
            akcr.a(b2, "ofType(R::class.java)");
            b = ajdp.b((ajdt) b, (ajdt) b2.p(k.a));
            akcr.a(b, "Observable.merge(singleM…s, externalLensSelection)");
            return new kwy(mwe, ajdp, b, ajfb);
        }

        public static mjo a(kyc kyc, mxa mxa, mof mof, boolean z, boolean z2, mok<moc> mok, mng mng, moa moa, lnr lnr, Set<akbl<mmt, mph>> set, mio mio, mmh mmh) {
            akcr.b(kyc, "lensesCameraFeatureComponent");
            akcr.b(mxa, "remoteServiceFactory");
            akcr.b(mof, "resourceResolverFactory");
            akcr.b(mok, "resourceUriResolver");
            akcr.b(mng, "nativeExceptionHandler");
            akcr.b(moa, "nativeCrashCrumbPicker");
            akcr.b(lnr, "assetUploader");
            akcr.b(set, "uriDataHandlerFactories");
            akcr.b(mio, "systemUiElementsPositionProvider");
            akcr.b(mmh, "fallbackGestureHandler");
            return mjo.b.a(kyc).a(mxa).a(z).b(z2).a(mng).a(mof).a((mok) mok).a((mns) moa).a((Set) set).a(lnr).a(mio).a(mmh).c();
        }

        public static mhi<? extends mha> b(kyc kyc) {
            akcr.b(kyc, "component");
            nbe.d dVar = kyc;
            akcr.b(dVar, "parentComponent");
            return nbb.c().a(dVar);
        }
    }

    static {
        a aVar = new a();
    }

    public static final ajdp<mih> a(ajdp<Rect> ajdp) {
        akcr.b(ajdp, "windowRect");
        Object p = ajdp.p(ao.a);
        akcr.a(p, "windowRect.map { rect ->…ect.right, rect.bottom) }");
        return p;
    }

    public static final ajdp<dpx> a(ajdp<dpw> ajdp, ajdp<aepx> ajdp2) {
        akcr.b(ajdp, "lensesCameraLifecycleObservable");
        akcr.b(ajdp2, "lensMetadataObservable");
        ajdp a = ajdp.a((ajdt) ajdp, (ajdt) ajdp2, (ajex) new ac());
        if (a == null) {
            akcr.a();
        }
        return a;
    }

    public static final ajdp<lqf> a(ajws<lqf> ajws, ajdp<achi<zjm, zjk>> ajdp) {
        akcr.b(ajws, "cameraLifecycleSubject");
        akcr.b(ajdp, "navigationEventObservable");
        Object a = ajws.a((ajdu) new lbe(ajdp));
        akcr.a(a, "cameraLifecycleSubject\n …vigationEventObservable))");
        return a;
    }

    public static final ajdp<dpu> a(ajws<dpu> ajws, kxt kxt, mwe mwe, ajdp<dpw> ajdp, zgb zgb, ide ide) {
        akcr.b(ajws, "lensesCameraInteractionSubject");
        akcr.b(kxt, "placeholderLensRepository");
        akcr.b(mwe, "lensRepository");
        akcr.b(ajdp, "lensesCameraLifecycle");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        Object a = ajpy.k(ajws.a((ajdu) new kxu(kxt, mwe, ajdp, zgb.a(ide, "InsertPlaceholderLensesCameraInteractionObservableTransformer")))).a();
        akcr.a(a, "lensesCameraInteractionS…\n                .share()");
        return a;
    }

    /* JADX WARNING: Missing block: B:10:0x003a, code skipped:
            if (r2 == null) goto L_0x003c;
     */
    public static final defpackage.ajdp<java.util.Set<defpackage.mhs.b>> a(defpackage.dpr r2) {
        /*
        r0 = "lensesCameraContext";
        defpackage.akcr.b(r2, r0);
        r0 = r2 instanceof defpackage.dpr.c;
        r1 = "Observable.empty()";
        if (r0 != 0) goto L_0x0015;
    L_0x000b:
        r2 = defpackage.ajot.a;
        r2 = defpackage.ajvo.a(r2);
        defpackage.akcr.a(r2, r1);
        return r2;
    L_0x0015:
        r2 = (defpackage.dpr.c) r2;
        r2 = r2.b;
        if (r2 == 0) goto L_0x003c;
    L_0x001b:
        r0 = r2;
        r0 = (java.lang.CharSequence) r0;
        r0 = defpackage.akgb.a(r0);
        r0 = r0 ^ 1;
        if (r0 == 0) goto L_0x0034;
    L_0x0026:
        r0 = new mhs$b;
        r0.<init>(r2);
        r2 = defpackage.ajzs.a(r0);
        r2 = defpackage.ajdp.b(r2);
        goto L_0x003a;
    L_0x0034:
        r2 = defpackage.ajot.a;
        r2 = defpackage.ajvo.a(r2);
    L_0x003a:
        if (r2 != 0) goto L_0x0045;
    L_0x003c:
        r2 = defpackage.ajot.a;
        r2 = defpackage.ajvo.a(r2);
        defpackage.akcr.a(r2, r1);
    L_0x0045:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyd.a(dpr):ajdp");
    }

    public static final ajdp<kya> a(dpv dpv) {
        Object b;
        String str;
        akcr.b(dpv, "lensesCameraLaunchState");
        if (dpv instanceof a.b) {
            a.b bVar = (a.b) dpv;
            b = ajdp.b(new kya(mhs.a.a(bVar.a()), bVar.b()));
            str = "Observable.just(LensesCa…meraLaunchState.payload))";
        } else {
            b = ajvo.a(ajot.a);
            str = "Observable.empty()";
        }
        akcr.a(b, str);
        return b;
    }

    public static final ajdp<mmt> a(lba lba, ajdu<mmt, mmt> ajdu) {
        akcr.b(lba, "lensesProcessingCoreSub");
        akcr.b(ajdu, "lensCoreObservableTransformer");
        ajdp a = ajdp.a((ajdt) lba);
        akcr.a((Object) a, "Observable.unsafeCreate(lensesProcessingCoreSub)");
        Object a2 = mip.b(a, "LensCore#unsafeCreate").a((ajdu) ajdu);
        akcr.a(a2, "Observable.unsafeCreate(…oreObservableTransformer)");
        return a2;
    }

    public static final ajdu<mmt, mmt> a(Set<ajec<mmi.d, mmi.d>> set, mni mni) {
        akcr.b(set, "filterRequestSingleTransformers");
        akcr.b(mni, "nativeSupportAssessor");
        r5 = new ajdu[2];
        int i = 0;
        r5[0] = new lbg(mni);
        Collection collection = set;
        akcr.b(collection, "receiver$0");
        Object[] toArray = collection.toArray(new ajec[0]);
        if (toArray != null) {
            ajec[] ajecArr = (ajec[]) toArray;
            ajecArr = (ajec[]) Arrays.copyOf(ajecArr, ajecArr.length);
            akcr.b(ajecArr, "singleTransformers");
            if (ajecArr.length == 0) {
                i = 1;
            }
            i ^= 1;
            if (ajxy.a && i == 0) {
                throw new AssertionError("singleTransformers cannot be empty");
            }
            r5[1] = new kxp(new mil.b(ajecArr));
            return mic.a(r5);
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final ajdv<dpw> a(ajws<dpw> ajws) {
        akcr.b(ajws, "lensesLifecycleSubject");
        return ajws;
    }

    public static final ajec<mmi.d, mmi.d> a(mwe mwe, nay nay, mnr mnr, ajdp<kya> ajdp, kqf kqf, kxm kxm) {
        akcr.b(mwe, "lensRepository");
        akcr.b(nay, "userDataRepository");
        akcr.b(mnr, "persistenceRepository");
        akcr.b(ajdp, "lensesCameraExternalMetadata");
        akcr.b(kqf, "analyticsEventHandler");
        akcr.b(kxm, "lensEntryPointTracker");
        return new kxr(mwe, nay, mnr, ajdp, t.a, kxm, kqf);
    }

    public static final ajws<lqf> a() {
        Object r = new ajwl().r();
        akcr.a(r, "BehaviorSubject.create<C…fecycle>().toSerialized()");
        return r;
    }

    public static final dno a(lpj.a aVar, kxe kxe, ajdv<dpw> ajdv, zgb zgb, ide ide) {
        akcr.b(aVar, "cameraBuilder");
        akcr.b(kxe, "cameraUseCaseActionSource");
        akcr.b(ajdv, "lensesCameraLifecyleObserver");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        return new kyb(aVar, kxe, ajdv, zgb.a(ide, "LensesCameraFeatureActivator"));
    }

    public static final dns a(miw miw, boolean z) {
        akcr.b(miw, "configurationRepository");
        return new law(miw, z);
    }

    public static final ide a(ide ide, ide ide2) {
        akcr.b(ide, "parentAttributedFeature");
        akcr.b(ide2, "attributedFeature");
        return new b(ide2, ide, ide.getName(), idi.CAMERA_PLATFORM);
    }

    public static final kxe a(dpv dpv, mwe mwe, ajdp<mmt> ajdp, ajdp<Point> ajdp2, ajdp<ebn> ajdp3, ajdp<lqf> ajdp4, ajdp<ebs> ajdp5, ajdp<ebk> ajdp6, ajdp<dpu> ajdp7, kqf kqf, lnz.a aVar, ide ide, zgb zgb, miw miw, nar.a aVar2, lon.a aVar3, mxg.a aVar4, mhi<? extends mha> mhi, lwq.a aVar5, ajdv<Boolean> ajdv, mni mni, ajdv<Boolean> ajdv2, mhi<? extends mha> mhi2, mhi<? extends mha> mhi3, nal nal, mhi<? extends mha> mhi4, mhi<? extends mha> mhi5, ajdp<achi<zjm, zjk>> ajdp8, mzi.a aVar6, mto.a aVar7, kxm kxm, lkn lkn) {
        ajdp a;
        dpv dpv2 = dpv;
        mwe mwe2 = mwe;
        ajdp<mmt> ajdp9 = ajdp;
        ajdp<Point> ajdp10 = ajdp2;
        ajdp<ebn> ajdp11 = ajdp3;
        ajdp<lqf> ajdp12 = ajdp4;
        ajdp<ebs> ajdp13 = ajdp5;
        ajdp<ebk> ajdp14 = ajdp6;
        ajdp<dpu> ajdp15 = ajdp7;
        kqf kqf2 = kqf;
        lnz.a aVar8 = aVar;
        ide ide2 = ide;
        miw miw2 = miw;
        nar.a aVar9 = aVar2;
        lon.a aVar10 = aVar3;
        mxg.a aVar11 = aVar4;
        akcr.b(dpv2, "lensesCameraLaunchState");
        akcr.b(mwe2, "lensRepository");
        akcr.b(ajdp9, "lensCore");
        akcr.b(ajdp10, "singleTapObservable");
        akcr.b(ajdp11, "longPressUpdateObservable");
        akcr.b(ajdp12, "cameraLifecycle");
        akcr.b(ajdp13, "streamingStateObservable");
        akcr.b(ajdp14, "captureStateObservable");
        akcr.b(ajdp15, "lensesCameraInteractions");
        akcr.b(kqf2, "analyticsEventHandler");
        akcr.b(aVar8, "remoteAssetsBuilder");
        akcr.b(ide2, "attributedFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(miw2, "configurationRepository");
        akcr.b(aVar9, "userComponentBuilder");
        akcr.b(aVar10, "bitmojiDataComponentBuilder");
        akcr.b(aVar4, "persistenceBuilder");
        akcr.b(mhi, "prefetchComponentBuilder");
        lwq.a aVar12 = aVar5;
        akcr.b(aVar12, "captureComponentBuilder");
        akcr.b(ajdv, "enableMultisnapObserver");
        akcr.b(mni, "coreNativeSupportAssessor");
        akcr.b(ajdv2, "enableHardwareCaptureObserver");
        akcr.b(mhi2, "screenZonesBuilder");
        akcr.b(mhi3, "cameraFlipBuilder");
        akcr.b(mhi4, "modalBuilder");
        akcr.b(mhi5, "wakeLockBuilder");
        akcr.b(ajdp8, "navigationEventObservable");
        akcr.b(aVar6, "lensStatisticsComponentBuilder");
        akcr.b(aVar7, "geoDataComponentBuilder");
        akcr.b(kxm, "lensEntryPointTracker");
        akcr.b(lkn, "notifier");
        zfw a2 = zgb.a(ide2.callsite("CameraUseCaseActionSource"));
        Object b = ajdp15.b(dpu.b.a.b.class);
        String str = "ofType(R::class.java)";
        akcr.a(b, str);
        ajdp a3 = b.a(Object.class);
        String str2 = "cast(R::class.java)";
        akcr.a((Object) a3, str2);
        Object b2 = ajdp15.b(dpu.b.a.a.class);
        akcr.a(b2, str);
        Object p = b2.p(q.a);
        Object b3 = ajdp15.b(dpu.b.a.c.class);
        akcr.a(b3, str);
        ajdp a4 = b3.a(Object.class);
        akcr.a((Object) a4, str2);
        ajdj a5 = ajvo.a(ajlu.a);
        akcr.a((Object) a5, "Maybe.empty()");
        if (dpv2 instanceof a.a.a.b) {
            a3 = a3.e((ajdt) ajdp.b(ajxw.a)).c(1);
            akcr.a((Object) a3, "firstLensExternal.mergeW…                 .take(1)");
        } else if (dpv2 instanceof a.a.a.a) {
            b = mhs.a.a(((a.a.a.a) dpv2).a);
            if (b instanceof mhs.b) {
                p = p.e((ajdt) ajdp.b(b));
            }
        } else if (dpv2 instanceof a.a.a.c) {
            a4 = a4.e((ajdt) ajdp.b(ajxw.a));
            akcr.a((Object) a4, "idleExternal.mergeWith(Observable.just(Unit))");
        } else if (!(dpv2 instanceof a.a.b) && (dpv2 instanceof a.b)) {
            b = mhs.a.a(((a.b) dpv2).a());
            if (b instanceof mhs.b) {
                a5 = ajdj.b(b);
                akcr.a((Object) a5, "Maybe.just(identifier)");
            }
        }
        if (nal != null) {
            b = nal.d().b().a((ajfl) n.a).a(nak.a.a.class);
            akcr.a(b, "this.filter { it is R }.cast(R::class.java)");
            a = ajpy.k(b.p(r.a).c(1)).a();
        } else {
            a = ajdp.b(Boolean.FALSE);
        }
        kxe a6 = new h(ajdp10, ajdp11, ajdp12).a((kxe) new f(ajdp12, a2)).a((kxe) new v(mwe2, a5, ajdp12)).a((kxe) new t(mwe2, a3, ajdp12));
        akcr.a(p, "preselectedLensExternal");
        a6 = a6.a((kxe) new w(mwe2, p, ajdp12)).a((kxe) new j(a4, ajdp12));
        kxe eVar = new kxe.e(ajdp12);
        ajdp a7 = miw.a(miw.b.a.a).a(mja.CAMERA_LENS_DEACTIVATE_ON_CLOSE);
        str = "condition";
        akcr.b(a7, str);
        a6 = a6.a(i.a(eVar, a7));
        mhi[] mhiArr = new mhi[10];
        mhiArr[0] = aVar8;
        mhiArr[1] = aVar9;
        mhiArr[2] = aVar4;
        mhiArr[3] = aVar12;
        mhiArr[4] = mhi2;
        mhiArr[5] = aVar3;
        mhiArr[6] = aVar6;
        mhiArr[7] = aVar7;
        mhiArr[8] = mhi4;
        ajdp<achi<zjm, zjk>> ajdp16 = ajdp8;
        mhiArr[9] = mhi5;
        List c = ajym.c(mhiArr);
        if (nal != null) {
            mha mha = nal;
            akcr.b(mha, "attachable");
            c.add(new mhx(mha));
        }
        Object[] toArray = c.toArray(new mhi[0]);
        if (toArray != null) {
            mhiArr = (mhi[]) toArray;
            mhiArr = (mhi[]) Arrays.copyOf(mhiArr, mhiArr.length);
            akcr.b(mhiArr, "builders");
            mhi mhl = new mhl(mhiArr);
            kxe.b bVar = dpv2 instanceof a.b ? new kxe.b(mhl) : new kxe.c(mhl);
            kqf kqf3 = kqf;
            mhi<? extends mha> mhi6 = mhi;
            kxe a8 = a6.a((kxe) bVar).a((kxe) new kxe.a(ajdp5, ajdp6, kqf3)).a((kxe) new q(miw, kqf3)).a((kxe) new r(ajdv, mwe2)).a((kxe) new kxe.d(ajdp12, mhi3, a2));
            a6 = new kxe.d(ajdp12, mhi6, a2);
            ajdt ajdt = a;
            ajdp c2 = ajdp.b(miw.a(miw.b.a.a).a(mja.LENSES_FOREGROUND_PREFETCH_ENABLED), miw.a(miw.b.a.a).a(mja.LENSES_FOREGROUND_PREFETCH_RUN_IN_BACKGROUND), ajdt, o.a).c(1).c();
            String str3 = "Observable.zip(\n        …                 .cache()";
            akcr.a((Object) c2, str3);
            akcr.b(c2, str);
            a8 = a8.a(i.a(a6, c2));
            kxe bVar2 = new kxe.b(mhi6);
            ajdp c3 = ajdp.b(miw.a(miw.b.a.a).a(mja.LENSES_FOREGROUND_PREFETCH_ENABLED), miw.a(miw.b.a.a).a(mja.LENSES_FOREGROUND_PREFETCH_RUN_IN_BACKGROUND), ajdt, p.a).c(1).c();
            akcr.a((Object) c3, str3);
            akcr.b(c3, str);
            a8 = a8.a(i.a(bVar2, c3)).a((kxe) new r(ajdv2, mwe2));
            kxe gVar = new g(ajdp16);
            c2 = miw.a(miw.b.a.a).a(mja.DEACTIVATE_LENSES_AFTER_SNAP_SEND).c(1).c();
            akcr.a((Object) c2, "configurationRepository.…                 .cache()");
            akcr.b(c2, str);
            return a8.a(i.a(gVar, c2)).a((kxe) new m(mni, lkn)).a((kxe) kxm).a((kxe) new l(ajdp, ajdp16));
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final kxm a(dpv dpv, ajdp<achi<zjm, zjk>> ajdp, ajdp<dpq> ajdp2) {
        akcr.b(dpv, "lensesCameraLaunchState");
        akcr.b(ajdp, "navigationEventObservable");
        akcr.b(ajdp2, "lensesCameraAction");
        return new kxm(dpv, ajdp, ajdp2);
    }

    public static final lba a(Supplier<mmf> supplier, ajdp<dpw> ajdp, ajws<lqf> ajws, ajdp<ebs> ajdp2, ajdp<ebk> ajdp3, ajdp<Float> ajdp4, dnr dnr, ide ide, zgb zgb, boolean z, Supplier<iib> supplier2, ajdp<mih> ajdp5) {
        return a.a((Supplier) supplier, (ajdp) ajdp, (ajws) ajws, (ajdp) ajdp2, (ajdp) ajdp3, (ajdp) ajdp4, dnr, ide, zgb, z, (Supplier) supplier2, (ajdp) ajdp5);
    }

    public static final lnz.a a(dpv dpv, kyc kyc, mok<moc> mok, miw miw, nay nay, ajdp<Set<mhs.b>> ajdp, lop lop) {
        mok mok2;
        akcr.b(dpv, "launchState");
        akcr.b(kyc, "lensesCameraFeatureComponent");
        akcr.b(mok2, "defaultResourceUriResolver");
        akcr.b(miw, "configurationRepository");
        akcr.b(nay, "userDataRepository");
        akcr.b(ajdp, "friendUserIds");
        akcr.b(lop, "bitmojiDataRepository");
        if (!(dpv instanceof c)) {
            dpv = null;
        }
        if (((c) dpv) != null) {
            mok2 = new lfd(mok2, miw);
        }
        return lnz.b.a(kyc).a(mok2).a(nay).a((ajdp) ajdp).a(lop);
    }

    public static final lon.a a(kyc kyc, nay nay, ajdp<Set<mhs.b>> ajdp, lop lop) {
        akcr.b(kyc, "lensesCameraFeatureComponent");
        akcr.b(nay, "userDataRepository");
        akcr.b(ajdp, "friendUserIds");
        akcr.b(lop, "bitmojiDataRepository");
        lon.c cVar = kyc;
        akcr.b(cVar, "parentComponent");
        lon.a a = los.d().a(cVar).a((nay) nay.a.a);
        ajdp a2 = ajvo.a(ajot.a);
        akcr.a((Object) a2, "Observable.empty()");
        return a.a(a2).a((lop) lop.a.a).a(nay).a((ajdp) ajdp).a(lop);
    }

    public static final lpj.a a(kyc kyc, ajdp<Double> ajdp, ajdp<mih> ajdp2, ViewStub viewStub, ViewGroup viewGroup, View view, ViewStub viewStub2, View view2, lth lth, dnc dnc, String str, ajdp<dpu> ajdp3, boolean z, boolean z2, boolean z3, boolean z4, dpr dpr, dpv dpv, ajfb<lqo> ajfb, ajfb<lwo> ajfb2, ajfb<muo> ajfb3, czq<byte[]> czq, mzk mzk, ajdp<kya> ajdp4, mwa mwa, mvu mvu, mtj mtj) {
        return a.a(kyc, ajdp, ajdp2, viewStub, viewGroup, view, viewStub2, view2, lth, dnc, str, ajdp3, z, z2, z3, z4, dpr, dpv, ajfb, ajfb2, ajfb3, czq, mzk, ajdp4, mwa, mvu, mtj);
    }

    public static final lwq.a a(kyc kyc, ajfb<lwo> ajfb) {
        akcr.b(kyc, "lensesCameraFeatureComponent");
        akcr.b(ajfb, "consumer");
        lwq.c cVar = kyc;
        akcr.b(cVar, "parentComponent");
        return lws.d().a(cVar).a((ajfb) ajfb);
    }

    public static final mhi<? extends mha> a(ajwy<lfu> ajwy, ide ide, nay nay, lop lop, miw miw) {
        akcr.b(ajwy, "lensesDataComponent");
        akcr.b(ide, "attributedFeature");
        akcr.b(nay, "userDataRepository");
        akcr.b(lop, "bitmojiDataRepository");
        akcr.b(miw, "configurationRepository");
        akbk ahVar = new ah(ajwy, ide, nay, lop, miw);
        akcr.b(ahVar, "receiver$0");
        return new mhb.a(ajxh.a(ahVar));
    }

    public static final mhi<? extends mha> a(mwe mwe, ajdp<lqf> ajdp, dpv dpv, ajdp<dpu> ajdp2, ajfb<lwo> ajfb) {
        return a.a(mwe, ajdp, dpv, ajdp2, ajfb);
    }

    public static final miw a(ajwy<lbp> ajwy) {
        akcr.b(ajwy, "lensesConfigurationComponent");
        lbp lbp = (lbp) ajwy.get();
        if (lbp != null) {
            miw e = lbp.e();
            if (e != null) {
                return e;
            }
        }
        return new miy();
    }

    public static final miw a(miw miw, Map<mje, kxq> map) {
        akcr.b(miw, "configurationRepository");
        akcr.b(map, "keys");
        return new kxi(miw, map);
    }

    public static final mjo a(kyc kyc, mxa mxa, mof mof, boolean z, boolean z2, mok<moc> mok, mng mng, moa moa, lnr lnr, Set<akbl<mmt, mph>> set, mio mio, mmh mmh) {
        return a.a(kyc, mxa, mof, z, z2, (mok) mok, mng, moa, lnr, (Set) set, mio, mmh);
    }

    public static final mmh a(ajfb<lwo> ajfb) {
        akcr.b(ajfb, "captureActionConsumer");
        return new kxl(ajfb);
    }

    public static final mni a(mjo mjo) {
        akcr.b(mjo, "coreComponent");
        return mjo.a();
    }

    public static final mqt a(miw miw, kqf kqf, nbh nbh, mqt mqt) {
        akcr.b(miw, "configurationRepository");
        akcr.b(kqf, "analyticsEventHandler");
        akcr.b(nbh, "webViewLauncher");
        akcr.b(mqt, "nativeLensExplorerController");
        Object c = miw.a(miw.b.a.a).a(mja.LENS_EXPLORER_NATIVE_ENABLED).c(1).c();
        akcr.a(c, "isEnabled");
        return new lix(c, new ad(mqt, nbh, kqf));
    }

    public static final mto.a a(kyc kyc, mtr mtr, mtv mtv) {
        akcr.b(kyc, "lensesCameraFeatureComponent");
        akcr.b(mtr, "locationRepository");
        akcr.b(mtv, "weatherRepository");
        mto.d dVar = kyc;
        akcr.b(dVar, "parentComponent");
        return mtm.c().a(dVar).a((mtr) mtr.a.a).a((mtv) mtv.a.a).a(mtr).a(mtv);
    }

    public static final mwe a(ajwy<lfu> ajwy, dpr dpr, dpv dpv, ajdp<lqf> ajdp) {
        akcr.b(ajwy, "lensesDataComponent");
        akcr.b(dpr, "lensesCameraContext");
        akcr.b(dpv, "lensesCameraLaunchState");
        akcr.b(ajdp, "cameraLifecycle");
        return mwf.a(new x(ajwy, dpv, dpr, ajdp));
    }

    public static final mxg.a a(kyc kyc) {
        akcr.b(kyc, "lensesCameraFeatureComponent");
        mxg.d dVar = kyc;
        akcr.b(dVar, "parentComponent");
        return mxc.c().a(dVar);
    }

    public static final myv a(vpc vpc, ajfb<dpz> ajfb, ajfb<dpu> ajfb2) {
        akcr.b(vpc, "scanCardsClient");
        akcr.b(ajfb, "scanSendToEventConsumer");
        akcr.b(ajfb2, "lensesCameraInteractor");
        return new kxn(vpc, ajfb, ajfb2);
    }

    public static final mzi.a a(kyc kyc, mzk mzk) {
        akcr.b(kyc, "lensesCameraFeatureComponent");
        akcr.b(mzk, "lensStatisticsRepository");
        mzi.d dVar = kyc;
        akcr.b(dVar, "parentComponent");
        return mzg.c().a((mzk) mzk.a.a).a(dVar).a(mzk);
    }

    public static final nar.a a(kyc kyc, nay nay) {
        akcr.b(kyc, "lensesCameraFeatureComponent");
        akcr.b(nay, "userDataRepository");
        nar.d dVar = kyc;
        akcr.b(dVar, "parentComponent");
        return nae.c().a(dVar).a((nay) nay.a.a).a(nay);
    }

    public static final ajdp<myw> b(ajdp<lqf> ajdp) {
        akcr.b(ajdp, "cameraLifecycle");
        Object a = ajdp.a((ajfl) l.a).a(b.class);
        akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
        return a.u(m.a);
    }

    public static final ajdp<dpw> b(ajws<dpw> ajws) {
        akcr.b(ajws, "lensesLifecycleSubject");
        Object f = ajws.f();
        akcr.a(f, "lensesLifecycleSubject.hide()");
        return f;
    }

    public static final ajws<dpw> b() {
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Le…fecycle>().toSerialized()");
        return r;
    }

    public static final Supplier<mmf> b(mjo mjo) {
        akcr.b(mjo, "coreComponent");
        return mjo.b();
    }

    public static final mnr b(ajwy<lkp> ajwy) {
        akcr.b(ajwy, "lensesPersistenceComponent");
        lkp lkp = (lkp) ajwy.get();
        if (lkp != null) {
            mnr b = lkp.b();
            if (b != null) {
                return b;
            }
        }
        return mnr.a.a;
    }

    public static final ajfb<dpu> c(ajws<dpu> ajws) {
        akcr.b(ajws, "lensesCameraInteractionPublisher");
        return new ab(ajws);
    }

    public static final Map<mje, kxq> c() {
        Map hashMap = new HashMap();
        hashMap.put(mja.CAMERA_ONBOARINDG_CAPTURE_TOOLTIP_SHOWN, new kxq(dnd.HAS_SEEN_TAKE_SNAP_ONBOARDING_MESSAGE));
        return hashMap;
    }

    public static final mzk c(ajwy<lna> ajwy) {
        akcr.b(ajwy, "lensesStatisticsComponent");
        lna lna = (lna) ajwy.get();
        if (lna != null) {
            mzk c = lna.c();
            if (c != null) {
                return c;
            }
        }
        return mzk.a.a;
    }

    public static final ajdp<dpq> d(ajws<dpq> ajws) {
        akcr.b(ajws, "lensesCaptureSubject");
        return ajws;
    }

    public static final ajws<dpu> d() {
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<LensesCameraInteraction>()");
        return (ajws) ajwo;
    }

    public static final nay d(ajwy<lni> ajwy) {
        akcr.b(ajwy, "lensesUserComponent");
        akbk alVar = new al(ajwy);
        akcr.b(alVar, "receiver$0");
        return new naz.a(ajxh.a(alVar));
    }

    public static final ajfb<lwo> e(ajws<dpq> ajws) {
        akcr.b(ajws, "actionSubject");
        return new e(ajws);
    }

    public static final ajws<dpq> e() {
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Le…aAction>().toSerialized()");
        return r;
    }

    public static final lop e(ajwy<kws> ajwy) {
        akcr.b(ajwy, "lensesBitmojiComponent");
        akbk cVar = new c(ajwy);
        akcr.b(cVar, "receiver$0");
        return new loq.a(ajxh.a(cVar));
    }

    public static final ajfb<lqo> f(ajws<dpq> ajws) {
        akcr.b(ajws, "actionSubject");
        return new j(ajws);
    }

    public static final mtr f(ajwy<ljx> ajwy) {
        akcr.b(ajwy, "lensesGeoDataComponent");
        akbk afVar = new af(ajwy);
        akcr.b(afVar, "receiver$0");
        return new mts.a(ajxh.a(afVar));
    }

    public static final mtv g(ajwy<ljx> ajwy) {
        akcr.b(ajwy, "lensesGeoDataComponent");
        akbk amVar = new am(ajwy);
        akcr.b(amVar, "receiver$0");
        return new mtw.a(ajxh.a(amVar));
    }

    public static final lth h(ajwy<kws> ajwy) {
        akcr.b(ajwy, "lensesBitmojiComponent");
        akbk dVar = new d(ajwy);
        akcr.b(dVar, "receiver$0");
        return new lti.a(ajxh.a(dVar));
    }

    public static final lxh i(ajwy<kwd> ajwy) {
        akcr.b(ajwy, "lensesAttachmentComponent");
        akbk uVar = new u(ajwy);
        akcr.b(uVar, "receiver$0");
        return new lxi.a(ajxh.a(uVar));
    }

    public static final nbh j(ajwy<lno> ajwy) {
        akcr.b(ajwy, "lensesWebViewComponent");
        akbk anVar = new an(ajwy);
        akcr.b(anVar, "receiver$0");
        return new nbi.a(ajxh.a(anVar));
    }

    public static final kpk k(ajwy<kvg> ajwy) {
        akcr.b(ajwy, "lensesAdInfoComponent");
        akbk aVar = new a(ajwy);
        akcr.b(aVar, "receiver$0");
        return new kpl.a(ajxh.a(aVar));
    }

    public static final ajfb<muo> l(ajwy<lfu> ajwy) {
        akcr.b(ajwy, "lensesDataComponent");
        akbk sVar = new s(ajwy);
        akcr.b(sVar, "receiver$0");
        return new mhy.a(ajxh.a(sVar));
    }

    public static final mwa m(ajwy<lfu> ajwy) {
        akcr.b(ajwy, "lensesDataComponent");
        akbk wVar = new w(ajwy);
        akcr.b(wVar, "receiver$0");
        return new mwb.a(ajxh.a(wVar));
    }

    public static final mvu n(ajwy<lfu> ajwy) {
        akcr.b(ajwy, "lensesDataComponent");
        akbk vVar = new v(ajwy);
        akcr.b(vVar, "receiver$0");
        return new mvt.a(ajxh.a(vVar));
    }

    public static final mxa o(ajwy<lfu> ajwy) {
        akcr.b(ajwy, "lensesDataComponent");
        return mxb.a(new ai(ajwy));
    }

    public static final mtj p(ajwy<ljj> ajwy) {
        akcr.b(ajwy, "lensesExternalImagesComponent");
        akbk aeVar = new ae(ajwy);
        akcr.b(aeVar, "receiver$0");
        return new mtk.a(ajxh.a(aeVar));
    }

    public static final mof q(ajwy<lfu> ajwy) {
        akcr.b(ajwy, "lensesDataComponent");
        return mog.a(new aj(ajwy));
    }

    public static final mok<moc> r(ajwy<lfu> ajwy) {
        akcr.b(ajwy, "lensesDataComponent");
        return mol.a(new ak(ajwy));
    }

    public static final kqf s(ajwy<kvl> ajwy) {
        akcr.b(ajwy, "lensesAnalyticsComponent");
        akbk yVar = new y(ajwy);
        akcr.b(yVar, "receiver$0");
        return new kqg.a(ajxh.a(yVar));
    }

    public static final ajdp<aepx> t(ajwy<kvl> ajwy) {
        akcr.b(ajwy, "lensesAnalyticsComponent");
        Object d = ajdx.c((Callable) new z(ajwy)).d((ajfc) aa.a);
        akcr.a(d, "Single.fromCallable { le…d()\n                    }");
        return d;
    }

    public static final mng u(ajwy<kvl> ajwy) {
        akcr.b(ajwy, "lensesAnalyticsComponent");
        akbk agVar = new ag(ajwy);
        akcr.b(agVar, "receiver$0");
        return new mnh.a(ajxh.a(agVar));
    }
}
