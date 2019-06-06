package defpackage;

import defpackage.miw.b;
import defpackage.miw.c;
import defpackage.miw.d;
import defpackage.mje.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: miy */
public final class miy implements miw {
    private final ConcurrentHashMap<mje, ajws<Object>> a = new ConcurrentHashMap();

    /* renamed from: miy$a */
    public static final class a implements c {
        private /* synthetic */ miy a;

        /* renamed from: miy$a$a */
        public static final class a extends akcs implements akbk<String> {
            private /* synthetic */ mje a;

            public a(mje mje) {
                this.a = mje;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(Boolean.class);
                stringBuilder.append("] does not fit expected key type: [");
                Object a = this.a.a();
                akcr.a(a, "key.delegate");
                stringBuilder.append(a.a());
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }

        /* renamed from: miy$a$f */
        public static final class f extends akcs implements akbk<String> {
            private /* synthetic */ mje a;

            public f(mje mje) {
                this.a = mje;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(String.class);
                stringBuilder.append("] does not fit expected key type: [");
                Object a = this.a.a();
                akcr.a(a, "key.delegate");
                stringBuilder.append(a.a());
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }

        /* renamed from: miy$a$e */
        public static final class e extends akcs implements akbk<String> {
            private /* synthetic */ mje a;

            public e(mje mje) {
                this.a = mje;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(Long.class);
                stringBuilder.append("] does not fit expected key type: [");
                Object a = this.a.a();
                akcr.a(a, "key.delegate");
                stringBuilder.append(a.a());
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }

        /* renamed from: miy$a$b */
        public static final class b extends akcs implements akbk<String> {
            private /* synthetic */ mje a;

            public b(mje mje) {
                this.a = mje;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(Double.class);
                stringBuilder.append("] does not fit expected key type: [");
                Object a = this.a.a();
                akcr.a(a, "key.delegate");
                stringBuilder.append(a.a());
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }

        /* renamed from: miy$a$c */
        public static final class c extends akcs implements akbk<String> {
            private /* synthetic */ mje a;

            public c(mje mje) {
                this.a = mje;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(Float.class);
                stringBuilder.append("] does not fit expected key type: [");
                Object a = this.a.a();
                akcr.a(a, "key.delegate");
                stringBuilder.append(a.a());
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }

        /* renamed from: miy$a$d */
        public static final class d extends akcs implements akbk<String> {
            private /* synthetic */ mje a;

            public d(mje mje) {
                this.a = mje;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(Integer.class);
                stringBuilder.append("] does not fit expected key type: [");
                Object a = this.a.a();
                akcr.a(a, "key.delegate");
                stringBuilder.append(a.a());
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }

        a(miy miy) {
            this.a = miy;
        }

        public final ajdp<Boolean> a(mje mje) {
            akcr.b(mje, "key");
            if (mje.c().contains(defpackage.mje.a.READ)) {
                akbk aVar = new a(mje);
                Object obj = Boolean.class;
                Object obj2 = 1;
                String str = "key.delegate";
                if (akcr.a(obj, Boolean.TYPE) || akcr.a(obj, (Object) Boolean.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.BOOLEAN) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(aVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) Integer.class) || akcr.a(obj, (Object) Integer.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.INTEGER) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(aVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Long.TYPE) || akcr.a(obj, (Object) Long.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.LONG) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(aVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Float.TYPE) || akcr.a(obj, (Object) Float.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.FLOAT) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(aVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Double.TYPE) || akcr.a(obj, (Object) Double.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.DOUBLE) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(aVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) String.class) || akcr.a(obj, (Object) String.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.STRING) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(aVar.invoke().toString());
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Unsupported input type: [");
                    stringBuilder.append(Boolean.class);
                    stringBuilder.append(']');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                Object a = this.a.a(mje).f().a(Boolean.class);
                akcr.a(a, "subjectFor(it).hide().cast(I::class.java)");
                return a;
            }
            StringBuilder stringBuilder2 = new StringBuilder("Configuration key [");
            stringBuilder2.append(mje);
            stringBuilder2.append("] is not readable");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }

        public final ajdp<Float> b(mje mje) {
            akcr.b(mje, "key");
            if (mje.c().contains(defpackage.mje.a.READ)) {
                akbk cVar = new c(mje);
                Object obj = Float.class;
                Object obj2 = 1;
                String str = "key.delegate";
                if (akcr.a(obj, Boolean.TYPE) || akcr.a(obj, (Object) Boolean.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.BOOLEAN) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(cVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) Integer.class) || akcr.a(obj, (Object) Integer.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.INTEGER) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(cVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Long.TYPE) || akcr.a(obj, (Object) Long.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.LONG) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(cVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Float.TYPE) || akcr.a(obj, (Object) Float.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.FLOAT) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(cVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Double.TYPE) || akcr.a(obj, (Object) Double.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.DOUBLE) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(cVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) String.class) || akcr.a(obj, (Object) String.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.STRING) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(cVar.invoke().toString());
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Unsupported input type: [");
                    stringBuilder.append(Float.class);
                    stringBuilder.append(']');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                Object a = this.a.a(mje).f().a(Float.class);
                akcr.a(a, "subjectFor(it).hide().cast(I::class.java)");
                return a;
            }
            StringBuilder stringBuilder2 = new StringBuilder("Configuration key [");
            stringBuilder2.append(mje);
            stringBuilder2.append("] is not readable");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }

        public final ajdp<Double> c(mje mje) {
            akcr.b(mje, "key");
            if (mje.c().contains(defpackage.mje.a.READ)) {
                akbk bVar = new b(mje);
                Object obj = Double.class;
                Object obj2 = 1;
                String str = "key.delegate";
                if (akcr.a(obj, Boolean.TYPE) || akcr.a(obj, (Object) Boolean.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.BOOLEAN) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(bVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) Integer.class) || akcr.a(obj, (Object) Integer.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.INTEGER) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(bVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Long.TYPE) || akcr.a(obj, (Object) Long.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.LONG) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(bVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Float.TYPE) || akcr.a(obj, (Object) Float.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.FLOAT) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(bVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Double.TYPE) || akcr.a(obj, (Object) Double.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.DOUBLE) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(bVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) String.class) || akcr.a(obj, (Object) String.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.STRING) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(bVar.invoke().toString());
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Unsupported input type: [");
                    stringBuilder.append(Double.class);
                    stringBuilder.append(']');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                Object a = this.a.a(mje).f().a(Double.class);
                akcr.a(a, "subjectFor(it).hide().cast(I::class.java)");
                return a;
            }
            StringBuilder stringBuilder2 = new StringBuilder("Configuration key [");
            stringBuilder2.append(mje);
            stringBuilder2.append("] is not readable");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }

        public final ajdp<Integer> d(mje mje) {
            akcr.b(mje, "key");
            if (mje.c().contains(defpackage.mje.a.READ)) {
                akbk dVar = new d(mje);
                Object obj = Integer.class;
                Object obj2 = 1;
                String str = "key.delegate";
                if (akcr.a(obj, Boolean.TYPE) || akcr.a(obj, (Object) Boolean.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.BOOLEAN) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(dVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) Integer.class) || akcr.a(obj, (Object) Integer.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.INTEGER) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(dVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Long.TYPE) || akcr.a(obj, (Object) Long.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.LONG) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(dVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Float.TYPE) || akcr.a(obj, (Object) Float.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.FLOAT) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(dVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Double.TYPE) || akcr.a(obj, (Object) Double.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.DOUBLE) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(dVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) String.class) || akcr.a(obj, (Object) String.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.STRING) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(dVar.invoke().toString());
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Unsupported input type: [");
                    stringBuilder.append(Integer.class);
                    stringBuilder.append(']');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                Object a = this.a.a(mje).f().a(Integer.class);
                akcr.a(a, "subjectFor(it).hide().cast(I::class.java)");
                return a;
            }
            StringBuilder stringBuilder2 = new StringBuilder("Configuration key [");
            stringBuilder2.append(mje);
            stringBuilder2.append("] is not readable");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }

        public final ajdp<Long> e(mje mje) {
            akcr.b(mje, "key");
            if (mje.c().contains(defpackage.mje.a.READ)) {
                akbk eVar = new e(mje);
                Object obj = Long.class;
                Object obj2 = 1;
                String str = "key.delegate";
                if (akcr.a(obj, Boolean.TYPE) || akcr.a(obj, (Object) Boolean.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.BOOLEAN) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(eVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) Integer.class) || akcr.a(obj, (Object) Integer.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.INTEGER) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(eVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Long.TYPE) || akcr.a(obj, (Object) Long.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.LONG) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(eVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Float.TYPE) || akcr.a(obj, (Object) Float.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.FLOAT) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(eVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Double.TYPE) || akcr.a(obj, (Object) Double.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.DOUBLE) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(eVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) String.class) || akcr.a(obj, (Object) String.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.STRING) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(eVar.invoke().toString());
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Unsupported input type: [");
                    stringBuilder.append(Long.class);
                    stringBuilder.append(']');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                Object a = this.a.a(mje).f().a(Long.class);
                akcr.a(a, "subjectFor(it).hide().cast(I::class.java)");
                return a;
            }
            StringBuilder stringBuilder2 = new StringBuilder("Configuration key [");
            stringBuilder2.append(mje);
            stringBuilder2.append("] is not readable");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }

        public final ajdp<String> f(mje mje) {
            akcr.b(mje, "key");
            if (mje.c().contains(defpackage.mje.a.READ)) {
                akbk fVar = new f(mje);
                Object obj = String.class;
                Object obj2 = 1;
                String str = "key.delegate";
                if (akcr.a(obj, Boolean.TYPE) || akcr.a(obj, (Object) Boolean.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.BOOLEAN) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(fVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) Integer.class) || akcr.a(obj, (Object) Integer.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.INTEGER) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(fVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Long.TYPE) || akcr.a(obj, (Object) Long.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.LONG) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(fVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Float.TYPE) || akcr.a(obj, (Object) Float.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.FLOAT) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(fVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Double.TYPE) || akcr.a(obj, (Object) Double.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.DOUBLE) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(fVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) String.class) || akcr.a(obj, (Object) String.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.STRING) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(fVar.invoke().toString());
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Unsupported input type: [");
                    stringBuilder.append(String.class);
                    stringBuilder.append(']');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                Object a = this.a.a(mje).f().a(String.class);
                akcr.a(a, "subjectFor(it).hide().cast(I::class.java)");
                return a;
            }
            StringBuilder stringBuilder2 = new StringBuilder("Configuration key [");
            stringBuilder2.append(mje);
            stringBuilder2.append("] is not readable");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    /* renamed from: miy$b */
    public static final class b implements d {
        final List<akbk<ajxw>> a = new ArrayList();
        final /* synthetic */ miy b;

        /* renamed from: miy$b$a */
        static final class a implements ajev {
            private /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
            }

            public final void run() {
                for (akbk invoke : this.a.a) {
                    invoke.invoke();
                }
            }
        }

        /* renamed from: miy$b$b */
        public static final class b extends akcs implements akbk<String> {
            private /* synthetic */ mje a;

            public b(mje mje) {
                this.a = mje;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(Boolean.class);
                stringBuilder.append("] does not fit expected key type: [");
                Object a = this.a.a();
                akcr.a(a, "key.delegate");
                stringBuilder.append(a.a());
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }

        /* renamed from: miy$b$c */
        public static final class c extends akcs implements akbk<String> {
            private /* synthetic */ mje a;

            public c(mje mje) {
                this.a = mje;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(Long.class);
                stringBuilder.append("] does not fit expected key type: [");
                Object a = this.a.a();
                akcr.a(a, "key.delegate");
                stringBuilder.append(a.a());
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }

        /* renamed from: miy$b$d */
        public static final class d extends akcs implements akbk<ajxw> {
            private /* synthetic */ b a;
            private /* synthetic */ mje b;
            private /* synthetic */ Object c;

            public d(b bVar, mje mje, Object obj) {
                this.a = bVar;
                this.b = mje;
                this.c = obj;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.a.b.a(this.b).a(this.c);
                return ajxw.a;
            }
        }

        /* renamed from: miy$b$e */
        public static final class e extends akcs implements akbk<ajxw> {
            private /* synthetic */ b a;
            private /* synthetic */ mje b;
            private /* synthetic */ Object c;

            public e(b bVar, mje mje, Object obj) {
                this.a = bVar;
                this.b = mje;
                this.c = obj;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.a.b.a(this.b).a(this.c);
                return ajxw.a;
            }
        }

        b(miy miy) {
            this.b = miy;
        }

        public final ajcx a() {
            Object a = ajcx.a((ajev) new a(this));
            akcr.a(a, "Completable.fromAction {… it() }\n                }");
            return a;
        }

        public final d a(mje mje, long j) {
            akcr.b(mje, "key");
            Long valueOf = Long.valueOf(j);
            if (mje.c().contains(a.WRITE)) {
                akbk cVar = new c(mje);
                Object obj = Long.class;
                Object obj2 = 1;
                String str = "key.delegate";
                if (akcr.a(obj, Boolean.TYPE) || akcr.a(obj, (Object) Boolean.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.BOOLEAN) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(cVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) Integer.class) || akcr.a(obj, (Object) Integer.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.INTEGER) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(cVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Long.TYPE) || akcr.a(obj, (Object) Long.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.LONG) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(cVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Float.TYPE) || akcr.a(obj, (Object) Float.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.FLOAT) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(cVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Double.TYPE) || akcr.a(obj, (Object) Double.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.DOUBLE) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(cVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) String.class) || akcr.a(obj, (Object) String.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.STRING) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(cVar.invoke().toString());
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Unsupported input type: [");
                    stringBuilder.append(Long.class);
                    stringBuilder.append(']');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                this.a.add(new e(this, mje, valueOf));
                return this;
            }
            StringBuilder stringBuilder2 = new StringBuilder("Configuration key [");
            stringBuilder2.append(mje);
            stringBuilder2.append("] is not writable");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }

        public final d a(mje mje, boolean z) {
            akcr.b(mje, "key");
            Boolean valueOf = Boolean.valueOf(z);
            if (mje.c().contains(a.WRITE)) {
                akbk bVar = new b(mje);
                Object obj = Boolean.class;
                Object obj2 = 1;
                String str = "key.delegate";
                if (akcr.a(obj, Boolean.TYPE) || akcr.a(obj, (Object) Boolean.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.BOOLEAN) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(bVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) Integer.class) || akcr.a(obj, (Object) Integer.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.INTEGER) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(bVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Long.TYPE) || akcr.a(obj, (Object) Long.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.LONG) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(bVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Float.TYPE) || akcr.a(obj, (Object) Float.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.FLOAT) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(bVar.invoke().toString());
                    }
                } else if (akcr.a(obj, Double.TYPE) || akcr.a(obj, (Object) Double.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.DOUBLE) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(bVar.invoke().toString());
                    }
                } else if (akcr.a(obj, (Object) String.class) || akcr.a(obj, (Object) String.class)) {
                    obj = mje.a();
                    akcr.a(obj, str);
                    if (obj.a() != fti.STRING) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        throw new IllegalArgumentException(bVar.invoke().toString());
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Unsupported input type: [");
                    stringBuilder.append(Boolean.class);
                    stringBuilder.append(']');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                this.a.add(new d(this, mje, valueOf));
                return this;
            }
            StringBuilder stringBuilder2 = new StringBuilder("Configuration key [");
            stringBuilder2.append(mje);
            stringBuilder2.append("] is not writable");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final ajws<Object> a(mje mje) {
        ajws ajws;
        synchronized (this.a) {
            ConcurrentMap concurrentMap = this.a;
            Object obj = concurrentMap.get(mje);
            if (obj == null) {
                obj = mje.a();
                akcr.a(obj, "configurationKey.delegate");
                obj = ajwl.i(obj.b());
                Object putIfAbsent = concurrentMap.putIfAbsent(mje, obj);
                if (putIfAbsent != null) {
                    obj = putIfAbsent;
                }
            }
            akcr.a(obj, "configurationKeyUpdates.…aultValue)\n            })");
            ajws = (ajws) obj;
        }
        return ajws;
    }

    public final c a(b bVar) {
        akcr.b(bVar, "fallbackPolicy");
        return new a(this);
    }

    public final d a() {
        return new b(this);
    }
}
