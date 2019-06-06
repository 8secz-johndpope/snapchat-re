package defpackage;

import com.google.common.base.Supplier;
import defpackage.miw.b;
import defpackage.miw.c;
import defpackage.miw.d;
import defpackage.tnj.a;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: lbj */
public final class lbj implements miw {
    final ftl a;
    final tnj b;
    final Supplier<hxs> c;
    final zfw d;
    final long e;
    final TimeUnit f;
    private final Supplier<hxu> g;

    /* renamed from: lbj$a */
    public static final class a implements c {
        final /* synthetic */ lbj a;
        private /* synthetic */ b b;

        /* renamed from: lbj$a$a */
        public static final class a<V> implements Callable<ajdt<? extends T>> {
            final /* synthetic */ mje a;
            final /* synthetic */ b b;
            private /* synthetic */ a c;
            private /* synthetic */ a d;
            private /* synthetic */ mje e;

            /* renamed from: lbj$a$a$1 */
            public static final class 1<T, R> implements ajfc<Throwable, ajdt<? extends R>> {
                private /* synthetic */ a a;

                public 1(a aVar) {
                    this.a = aVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((Throwable) obj, "error");
                    obj = this.a.b;
                    if (akcr.a(obj, defpackage.miw.b.a.a)) {
                        mje mje = this.a.a;
                        Object a = mje.a();
                        String str = "key.delegate";
                        akcr.a(a, str);
                        a = a.b();
                        if (a != null ? a instanceof Boolean : true) {
                            obj = mje.a();
                            akcr.a(obj, str);
                            obj = ajdp.b((Boolean) obj.b());
                            akcr.a(obj, "Observable.just(key.delegate.defaultValue as R)");
                            return (ajdt) obj;
                        }
                        StringBuilder stringBuilder = new StringBuilder("Unexpected default value: [");
                        stringBuilder.append(a);
                        stringBuilder.append("] for expected type: [");
                        stringBuilder.append(Boolean.class);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    } else if (akcr.a(obj, b.b.a)) {
                        obj = ajvo.a(ajot.a);
                        akcr.a(obj, "Observable.empty()");
                        return (ajdt) obj;
                    } else {
                        throw new ajxk();
                    }
                }
            }

            public a(a aVar, mje mje, b bVar, a aVar2, mje mje2) {
                this.a = mje;
                this.b = bVar;
                this.d = aVar2;
                this.e = mje2;
                this.c = aVar;
            }

            public final /* synthetic */ Object call() {
                ajdp p = (this.c.a.a(this.a) && this.c.a.b(this.a)) ? ajdp.a((ajdt) this.d.a.a.p(this.e.d()), (ajdt) this.c.a.a.p(fxs.FEATURE_CONFIG_SYNCED_TOOLTIPS), (ajex) lbk.a).a((ajfl) lbl.a).p(lbm.a) : this.d.a.a.p(this.e.d());
                Object q = p.a((ajdt) ajdp.a(5, this.c.a.f, (ajdw) this.c.a.d.b()), (ajfc) lbn.a).q(new 1(this));
                akcr.a(q, "if (isFeatureKey(key) &&…                        }");
                return q.f((ajdt) ajvo.a(ajot.a));
            }
        }

        /* renamed from: lbj$a$f */
        public static final class f<V> implements Callable<ajdt<? extends T>> {
            final /* synthetic */ mje a;
            final /* synthetic */ b b;
            private /* synthetic */ a c;
            private /* synthetic */ a d;
            private /* synthetic */ mje e;

            /* renamed from: lbj$a$f$1 */
            public static final class 1<T, R> implements ajfc<Throwable, ajdt<? extends R>> {
                private /* synthetic */ f a;

                public 1(f fVar) {
                    this.a = fVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((Throwable) obj, "error");
                    obj = this.a.b;
                    if (akcr.a(obj, defpackage.miw.b.a.a)) {
                        mje mje = this.a.a;
                        Object a = mje.a();
                        String str = "key.delegate";
                        akcr.a(a, str);
                        a = a.b();
                        if (a != null ? a instanceof String : true) {
                            obj = mje.a();
                            akcr.a(obj, str);
                            obj = ajdp.b((String) obj.b());
                            akcr.a(obj, "Observable.just(key.delegate.defaultValue as R)");
                            return (ajdt) obj;
                        }
                        StringBuilder stringBuilder = new StringBuilder("Unexpected default value: [");
                        stringBuilder.append(a);
                        stringBuilder.append("] for expected type: [");
                        stringBuilder.append(String.class);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    } else if (akcr.a(obj, b.b.a)) {
                        obj = ajvo.a(ajot.a);
                        akcr.a(obj, "Observable.empty()");
                        return (ajdt) obj;
                    } else {
                        throw new ajxk();
                    }
                }
            }

            public f(a aVar, mje mje, b bVar, a aVar2, mje mje2) {
                this.a = mje;
                this.b = bVar;
                this.d = aVar2;
                this.e = mje2;
                this.c = aVar;
            }

            public final /* synthetic */ Object call() {
                ajdp p = (this.c.a.a(this.a) && this.c.a.b(this.a)) ? ajdp.a((ajdt) this.d.a.a.u(this.e.d()), (ajdt) this.c.a.a.p(fxs.FEATURE_CONFIG_SYNCED_TOOLTIPS), (ajex) lbk.a).a((ajfl) lbl.a).p(lbm.a) : this.d.a.a.u(this.e.d());
                Object q = p.a((ajdt) ajdp.a(5, this.c.a.f, (ajdw) this.c.a.d.b()), (ajfc) lbn.a).q(new 1(this));
                akcr.a(q, "if (isFeatureKey(key) &&…                        }");
                return q.f((ajdt) ajvo.a(ajot.a));
            }
        }

        /* renamed from: lbj$a$e */
        public static final class e<V> implements Callable<ajdt<? extends T>> {
            final /* synthetic */ mje a;
            final /* synthetic */ b b;
            private /* synthetic */ a c;
            private /* synthetic */ a d;
            private /* synthetic */ mje e;

            /* renamed from: lbj$a$e$1 */
            public static final class 1<T, R> implements ajfc<Throwable, ajdt<? extends R>> {
                private /* synthetic */ e a;

                public 1(e eVar) {
                    this.a = eVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((Throwable) obj, "error");
                    obj = this.a.b;
                    if (akcr.a(obj, defpackage.miw.b.a.a)) {
                        mje mje = this.a.a;
                        Object a = mje.a();
                        String str = "key.delegate";
                        akcr.a(a, str);
                        a = a.b();
                        if (a != null ? a instanceof Long : true) {
                            obj = mje.a();
                            akcr.a(obj, str);
                            obj = ajdp.b((Long) obj.b());
                            akcr.a(obj, "Observable.just(key.delegate.defaultValue as R)");
                            return (ajdt) obj;
                        }
                        StringBuilder stringBuilder = new StringBuilder("Unexpected default value: [");
                        stringBuilder.append(a);
                        stringBuilder.append("] for expected type: [");
                        stringBuilder.append(Long.class);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    } else if (akcr.a(obj, b.b.a)) {
                        obj = ajvo.a(ajot.a);
                        akcr.a(obj, "Observable.empty()");
                        return (ajdt) obj;
                    } else {
                        throw new ajxk();
                    }
                }
            }

            public e(a aVar, mje mje, b bVar, a aVar2, mje mje2) {
                this.a = mje;
                this.b = bVar;
                this.d = aVar2;
                this.e = mje2;
                this.c = aVar;
            }

            public final /* synthetic */ Object call() {
                ajdp p = (this.c.a.a(this.a) && this.c.a.b(this.a)) ? ajdp.a((ajdt) this.d.a.a.t(this.e.d()), (ajdt) this.c.a.a.p(fxs.FEATURE_CONFIG_SYNCED_TOOLTIPS), (ajex) lbk.a).a((ajfl) lbl.a).p(lbm.a) : this.d.a.a.t(this.e.d());
                Object q = p.a((ajdt) ajdp.a(5, this.c.a.f, (ajdw) this.c.a.d.b()), (ajfc) lbn.a).q(new 1(this));
                akcr.a(q, "if (isFeatureKey(key) &&…                        }");
                return q.f((ajdt) ajvo.a(ajot.a));
            }
        }

        /* renamed from: lbj$a$b */
        public static final class b<V> implements Callable<ajdt<? extends T>> {
            final /* synthetic */ mje a;
            final /* synthetic */ defpackage.miw.b b;
            private /* synthetic */ a c;
            private /* synthetic */ a d;
            private /* synthetic */ mje e;

            /* renamed from: lbj$a$b$1 */
            public static final class 1<T, R> implements ajfc<Throwable, ajdt<? extends R>> {
                private /* synthetic */ b a;

                public 1(b bVar) {
                    this.a = bVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((Throwable) obj, "error");
                    obj = this.a.b;
                    if (akcr.a(obj, defpackage.miw.b.a.a)) {
                        mje mje = this.a.a;
                        Object a = mje.a();
                        String str = "key.delegate";
                        akcr.a(a, str);
                        a = a.b();
                        if (a != null ? a instanceof Double : true) {
                            obj = mje.a();
                            akcr.a(obj, str);
                            obj = ajdp.b((Double) obj.b());
                            akcr.a(obj, "Observable.just(key.delegate.defaultValue as R)");
                            return (ajdt) obj;
                        }
                        StringBuilder stringBuilder = new StringBuilder("Unexpected default value: [");
                        stringBuilder.append(a);
                        stringBuilder.append("] for expected type: [");
                        stringBuilder.append(Double.class);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    } else if (akcr.a(obj, defpackage.miw.b.b.a)) {
                        obj = ajvo.a(ajot.a);
                        akcr.a(obj, "Observable.empty()");
                        return (ajdt) obj;
                    } else {
                        throw new ajxk();
                    }
                }
            }

            public b(a aVar, mje mje, defpackage.miw.b bVar, a aVar2, mje mje2) {
                this.a = mje;
                this.b = bVar;
                this.d = aVar2;
                this.e = mje2;
                this.c = aVar;
            }

            public final /* synthetic */ Object call() {
                ajdp p = (this.c.a.a(this.a) && this.c.a.b(this.a)) ? ajdp.a((ajdt) this.d.a.a.r(this.e.d()), (ajdt) this.c.a.a.p(fxs.FEATURE_CONFIG_SYNCED_TOOLTIPS), (ajex) lbk.a).a((ajfl) lbl.a).p(lbm.a) : this.d.a.a.r(this.e.d());
                Object q = p.a((ajdt) ajdp.a(5, this.c.a.f, (ajdw) this.c.a.d.b()), (ajfc) lbn.a).q(new 1(this));
                akcr.a(q, "if (isFeatureKey(key) &&…                        }");
                return q.f((ajdt) ajvo.a(ajot.a));
            }
        }

        /* renamed from: lbj$a$c */
        public static final class c<V> implements Callable<ajdt<? extends T>> {
            final /* synthetic */ mje a;
            final /* synthetic */ b b;
            private /* synthetic */ a c;
            private /* synthetic */ a d;
            private /* synthetic */ mje e;

            /* renamed from: lbj$a$c$1 */
            public static final class 1<T, R> implements ajfc<Throwable, ajdt<? extends R>> {
                private /* synthetic */ c a;

                public 1(c cVar) {
                    this.a = cVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((Throwable) obj, "error");
                    obj = this.a.b;
                    if (akcr.a(obj, defpackage.miw.b.a.a)) {
                        mje mje = this.a.a;
                        Object a = mje.a();
                        String str = "key.delegate";
                        akcr.a(a, str);
                        a = a.b();
                        if (a != null ? a instanceof Float : true) {
                            obj = mje.a();
                            akcr.a(obj, str);
                            obj = ajdp.b((Float) obj.b());
                            akcr.a(obj, "Observable.just(key.delegate.defaultValue as R)");
                            return (ajdt) obj;
                        }
                        StringBuilder stringBuilder = new StringBuilder("Unexpected default value: [");
                        stringBuilder.append(a);
                        stringBuilder.append("] for expected type: [");
                        stringBuilder.append(Float.class);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    } else if (akcr.a(obj, b.b.a)) {
                        obj = ajvo.a(ajot.a);
                        akcr.a(obj, "Observable.empty()");
                        return (ajdt) obj;
                    } else {
                        throw new ajxk();
                    }
                }
            }

            public c(a aVar, mje mje, b bVar, a aVar2, mje mje2) {
                this.a = mje;
                this.b = bVar;
                this.d = aVar2;
                this.e = mje2;
                this.c = aVar;
            }

            public final /* synthetic */ Object call() {
                ajdp p = (this.c.a.a(this.a) && this.c.a.b(this.a)) ? ajdp.a((ajdt) this.d.a.a.q(this.e.d()), (ajdt) this.c.a.a.p(fxs.FEATURE_CONFIG_SYNCED_TOOLTIPS), (ajex) lbk.a).a((ajfl) lbl.a).p(lbm.a) : this.d.a.a.q(this.e.d());
                Object q = p.a((ajdt) ajdp.a(5, this.c.a.f, (ajdw) this.c.a.d.b()), (ajfc) lbn.a).q(new 1(this));
                akcr.a(q, "if (isFeatureKey(key) &&…                        }");
                return q.f((ajdt) ajvo.a(ajot.a));
            }
        }

        /* renamed from: lbj$a$d */
        public static final class d<V> implements Callable<ajdt<? extends T>> {
            final /* synthetic */ mje a;
            final /* synthetic */ b b;
            private /* synthetic */ a c;
            private /* synthetic */ a d;
            private /* synthetic */ mje e;

            /* renamed from: lbj$a$d$1 */
            public static final class 1<T, R> implements ajfc<Throwable, ajdt<? extends R>> {
                private /* synthetic */ d a;

                public 1(d dVar) {
                    this.a = dVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((Throwable) obj, "error");
                    obj = this.a.b;
                    if (akcr.a(obj, defpackage.miw.b.a.a)) {
                        mje mje = this.a.a;
                        Object a = mje.a();
                        String str = "key.delegate";
                        akcr.a(a, str);
                        a = a.b();
                        if (a != null ? a instanceof Integer : true) {
                            obj = mje.a();
                            akcr.a(obj, str);
                            obj = ajdp.b((Integer) obj.b());
                            akcr.a(obj, "Observable.just(key.delegate.defaultValue as R)");
                            return (ajdt) obj;
                        }
                        StringBuilder stringBuilder = new StringBuilder("Unexpected default value: [");
                        stringBuilder.append(a);
                        stringBuilder.append("] for expected type: [");
                        stringBuilder.append(Integer.class);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    } else if (akcr.a(obj, b.b.a)) {
                        obj = ajvo.a(ajot.a);
                        akcr.a(obj, "Observable.empty()");
                        return (ajdt) obj;
                    } else {
                        throw new ajxk();
                    }
                }
            }

            public d(a aVar, mje mje, b bVar, a aVar2, mje mje2) {
                this.a = mje;
                this.b = bVar;
                this.d = aVar2;
                this.e = mje2;
                this.c = aVar;
            }

            public final /* synthetic */ Object call() {
                ajdp p = (this.c.a.a(this.a) && this.c.a.b(this.a)) ? ajdp.a((ajdt) this.d.a.a.s(this.e.d()), (ajdt) this.c.a.a.p(fxs.FEATURE_CONFIG_SYNCED_TOOLTIPS), (ajex) lbk.a).a((ajfl) lbl.a).p(lbm.a) : this.d.a.a.s(this.e.d());
                Object q = p.a((ajdt) ajdp.a(5, this.c.a.f, (ajdw) this.c.a.d.b()), (ajfc) lbn.a).q(new 1(this));
                akcr.a(q, "if (isFeatureKey(key) &&…                        }");
                return q.f((ajdt) ajvo.a(ajot.a));
            }
        }

        a(lbj lbj, b bVar) {
            this.a = lbj;
            this.b = bVar;
        }

        public final ajdp<Boolean> a(mje mje) {
            akcr.b(mje, "key");
            defpackage.mje.a aVar = defpackage.mje.a.READ;
            if (mje.c().contains(aVar)) {
                Object b = ajdp.a((Callable) new a(this, mje, this.b, this, mje)).b((ajdw) this.a.d.f());
                akcr.a(b, "Observable.defer {\n     …qualifiedSchedulers.io())");
                return b;
            }
            StringBuilder stringBuilder = new StringBuilder("Configuration key [");
            stringBuilder.append(mje);
            stringBuilder.append("] lacks [");
            stringBuilder.append(aVar);
            stringBuilder.append("] permission");
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final ajdp<Float> b(mje mje) {
            akcr.b(mje, "key");
            defpackage.mje.a aVar = defpackage.mje.a.READ;
            if (mje.c().contains(aVar)) {
                Object b = ajdp.a((Callable) new c(this, mje, this.b, this, mje)).b((ajdw) this.a.d.f());
                akcr.a(b, "Observable.defer {\n     …qualifiedSchedulers.io())");
                return b;
            }
            StringBuilder stringBuilder = new StringBuilder("Configuration key [");
            stringBuilder.append(mje);
            stringBuilder.append("] lacks [");
            stringBuilder.append(aVar);
            stringBuilder.append("] permission");
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final ajdp<Double> c(mje mje) {
            akcr.b(mje, "key");
            defpackage.mje.a aVar = defpackage.mje.a.READ;
            if (mje.c().contains(aVar)) {
                Object b = ajdp.a((Callable) new b(this, mje, this.b, this, mje)).b((ajdw) this.a.d.f());
                akcr.a(b, "Observable.defer {\n     …qualifiedSchedulers.io())");
                return b;
            }
            StringBuilder stringBuilder = new StringBuilder("Configuration key [");
            stringBuilder.append(mje);
            stringBuilder.append("] lacks [");
            stringBuilder.append(aVar);
            stringBuilder.append("] permission");
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final ajdp<Integer> d(mje mje) {
            akcr.b(mje, "key");
            defpackage.mje.a aVar = defpackage.mje.a.READ;
            if (mje.c().contains(aVar)) {
                Object b = ajdp.a((Callable) new d(this, mje, this.b, this, mje)).b((ajdw) this.a.d.f());
                akcr.a(b, "Observable.defer {\n     …qualifiedSchedulers.io())");
                return b;
            }
            StringBuilder stringBuilder = new StringBuilder("Configuration key [");
            stringBuilder.append(mje);
            stringBuilder.append("] lacks [");
            stringBuilder.append(aVar);
            stringBuilder.append("] permission");
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final ajdp<Long> e(mje mje) {
            akcr.b(mje, "key");
            defpackage.mje.a aVar = defpackage.mje.a.READ;
            if (mje.c().contains(aVar)) {
                Object b = ajdp.a((Callable) new e(this, mje, this.b, this, mje)).b((ajdw) this.a.d.f());
                akcr.a(b, "Observable.defer {\n     …qualifiedSchedulers.io())");
                return b;
            }
            StringBuilder stringBuilder = new StringBuilder("Configuration key [");
            stringBuilder.append(mje);
            stringBuilder.append("] lacks [");
            stringBuilder.append(aVar);
            stringBuilder.append("] permission");
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final ajdp<String> f(mje mje) {
            akcr.b(mje, "key");
            defpackage.mje.a aVar = defpackage.mje.a.READ;
            if (mje.c().contains(aVar)) {
                Object b = ajdp.a((Callable) new f(this, mje, this.b, this, mje)).b((ajdw) this.a.d.f());
                akcr.a(b, "Observable.defer {\n     …qualifiedSchedulers.io())");
                return b;
            }
            StringBuilder stringBuilder = new StringBuilder("Configuration key [");
            stringBuilder.append(mje);
            stringBuilder.append("] lacks [");
            stringBuilder.append(aVar);
            stringBuilder.append("] permission");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: lbj$b */
    public static final class b implements d {
        final a a;
        final HashMap<fth, Object> b = new HashMap();
        private /* synthetic */ lbj c;

        /* renamed from: lbj$b$c */
        static final class c extends akcs implements akbl<mje, a> {
            private /* synthetic */ b a;
            private /* synthetic */ long b;
            private /* synthetic */ mje c;

            c(b bVar, long j, mje mje) {
                this.a = bVar;
                this.b = j;
                this.c = mje;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((mje) obj, "it");
                return this.a.a.a((fth) this.c, Long.valueOf(this.b));
            }
        }

        /* renamed from: lbj$b$a */
        static final class a implements ajev {
            private /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
            }

            public final void run() {
                this.a.b.clear();
            }
        }

        /* renamed from: lbj$b$b */
        static final class b extends akcs implements akbl<mje, a> {
            private /* synthetic */ b a;
            private /* synthetic */ boolean b;
            private /* synthetic */ mje c;

            b(b bVar, boolean z, mje mje) {
                this.a = bVar;
                this.b = z;
                this.c = mje;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((mje) obj, "it");
                return this.a.a.a((fth) this.c, Boolean.valueOf(this.b));
            }
        }

        b(lbj lbj) {
            this.c = lbj;
            this.a = lbj.b.b();
        }

        private final <R> void a(mje mje, Object obj, akbl<? super mje, ? extends R> akbl) {
            if (this.c.a(mje)) {
                this.b.put(mje.d(), obj);
            } else {
                akbl.invoke(mje);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0041 in {3, 6, 7, 9} preds:[]
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
        private final defpackage.ajcx b() {
            /*
            r3 = this;
            r0 = r3.b;	 Catch:{ all -> 0x003f }
            r0 = r0.isEmpty();	 Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0014;	 Catch:{ all -> 0x003f }
            r0 = defpackage.ajhn.a;	 Catch:{ all -> 0x003f }
            r0 = defpackage.ajvo.a(r0);	 Catch:{ all -> 0x003f }
            r1 = "Completable.complete()";	 Catch:{ all -> 0x003f }
            defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x003f }
            goto L_0x003e;	 Catch:{ all -> 0x003f }
            r0 = r3.c;	 Catch:{ all -> 0x003f }
            r0 = r0.c;	 Catch:{ all -> 0x003f }
            r0 = r0.get();	 Catch:{ all -> 0x003f }
            r0 = (defpackage.hxs) r0;	 Catch:{ all -> 0x003f }
            r1 = r3.b;	 Catch:{ all -> 0x003f }
            r1 = (java.util.Map) r1;	 Catch:{ all -> 0x003f }
            r2 = r3.c;	 Catch:{ all -> 0x003f }
            r2 = r2.d;	 Catch:{ all -> 0x003f }
            r0 = r0.a(r1, r2);	 Catch:{ all -> 0x003f }
            r1 = defpackage.ajfu.g;	 Catch:{ all -> 0x003f }
            r0 = r0.a(r1);	 Catch:{ all -> 0x003f }
            r1 = new lbj$b$a;	 Catch:{ all -> 0x003f }
            r1.<init>(r3);	 Catch:{ all -> 0x003f }
            r1 = (defpackage.ajev) r1;	 Catch:{ all -> 0x003f }
            r0 = r0.b(r1);	 Catch:{ all -> 0x003f }
            r1 = "featureConfiguration.get… featuresToSync.clear() }";	 Catch:{ all -> 0x003f }
            goto L_0x0010;
            return r0;
            r0 = move-exception;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lbj$b.b():ajcx");
        }

        public final ajcx a() {
            Object c = this.a.c().d((ajdb) b()).c(5, this.c.f, this.c.d.b());
            akcr.a(c, "editor.applyWithResult()…Schedulers.computation())");
            c = c.a(ajfu.g);
            akcr.a(c, "editor.applyWithResult()…       .onErrorComplete()");
            return c;
        }
    }

    public /* synthetic */ lbj(ftl ftl, tnj tnj, Supplier supplier, Supplier supplier2, zfw zfw) {
        this(ftl, tnj, supplier, supplier2, zfw, TimeUnit.SECONDS);
    }

    private lbj(ftl ftl, tnj tnj, Supplier<hxs> supplier, Supplier<hxu> supplier2, zfw zfw, TimeUnit timeUnit) {
        akcr.b(ftl, "compositeConfigurationProvider");
        akcr.b(tnj, "preferences");
        akcr.b(supplier, "featureConfiguration");
        akcr.b(supplier2, "featureConfigurationMap");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "operationTimeoutUnit");
        this.a = ftl;
        this.b = tnj;
        this.c = supplier;
        this.g = supplier2;
        this.d = zfw;
        this.e = 5;
        this.f = timeUnit;
    }

    public final c a(b bVar) {
        akcr.b(bVar, "fallbackPolicy");
        return new a(this, bVar);
    }

    public final d a() {
        return new b(this);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(mje mje) {
        return ((hxu) this.g.get()).d(mje.d());
    }

    /* Access modifiers changed, original: final */
    public final boolean b(mje mje) {
        return ((hxu) this.g.get()).e(mje.d()) == hxr.TOOLTIP;
    }
}
