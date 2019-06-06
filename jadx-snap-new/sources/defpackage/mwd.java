package defpackage;

import defpackage.mhs.b;
import defpackage.mwe.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mwd */
public final class mwd {

    /* renamed from: mwd$b */
    public static final class b implements mwe {
        b() {
        }

        public final ajde<List<mux>> a(a aVar) {
            akcr.b(aVar, "queryCriteria");
            Object a = ajvo.a(ajjl.b);
            akcr.a(a, "Flowable.empty()");
            return a;
        }
    }

    /* renamed from: mwd$e */
    public static final class e implements mvv {
        private /* synthetic */ ajde a;

        /* renamed from: mwd$e$a */
        static final class a<T, R> implements ajfc<T, akuw<? extends R>> {
            private /* synthetic */ ajde a;

            a(ajde ajde) {
                this.a = ajde;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "it");
                return bool.booleanValue() ? this.a : ajvo.a(ajjl.b);
            }
        }

        public e(ajde ajde) {
            this.a = ajde;
        }

        public final akuw<List<mux>> a(ajde<List<mux>> ajde) {
            akcr.b(ajde, "upstream");
            Object h = this.a.h(new a(ajde));
            akcr.a(h, "signal.switchMap {\n     …      }\n                }");
            return (akuw) h;
        }
    }

    /* renamed from: mwd$f */
    public static final class f implements mwe {
        private /* synthetic */ mwe a;
        private /* synthetic */ mvv b;

        f(mwe mwe, mvv mvv) {
            this.a = mwe;
            this.b = mvv;
        }

        public final ajde<List<mux>> a(a aVar) {
            akcr.b(aVar, "queryCriteria");
            Object a = this.a.a(aVar).a((ajdi) this.b);
            akcr.a(a, "repository.query(queryCr…ria).compose(transformer)");
            return a;
        }
    }

    /* renamed from: mwd$a */
    public static final class a implements mwe {
        private /* synthetic */ mwe[] a;

        /* renamed from: mwd$a$a */
        static final class a<T> implements ajfl<List<? extends mux>> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return !((Collection) list).isEmpty();
            }
        }

        public a(mwe[] mweArr) {
            this.a = mweArr;
        }

        public final ajde<List<mux>> a(defpackage.mwe.a aVar) {
            akcr.b(aVar, "queryCriteria");
            mwe[] mweArr = this.a;
            Collection arrayList = new ArrayList(mweArr.length);
            for (mwe a : mweArr) {
                arrayList.add(a.a(aVar).b((ajfl) a.a));
            }
            Object obj = (List) arrayList;
            ajfv.a(obj, "sources is null");
            Object a2 = ajvo.a(new ajin(obj));
            akcr.a(a2, "Flowable.amb(lensReposit…ty() }\n                })");
            return a2;
        }
    }

    /* renamed from: mwd$c */
    public static final class c implements mwe {
        private /* synthetic */ mwe a;
        private /* synthetic */ b b;

        public c(mwe mwe, b bVar) {
            this.a = mwe;
            this.b = bVar;
        }

        public final ajde<List<mux>> a(a aVar) {
            akcr.b(aVar, "queryCriteria");
            if (aVar instanceof a.a) {
                return this.a.a(new a.b(this.b));
            }
            if (aVar instanceof a.b) {
                return akcr.a(((a.b) aVar).a, this.b) ? this.a.a(aVar) : mys.a();
            } else {
                throw new ajxk();
            }
        }
    }

    /* renamed from: mwd$d */
    public static final class d implements mwe {
        private /* synthetic */ mwe a;

        /* renamed from: mwd$d$a */
        static final class a<T> implements ajfl<List<? extends mux>> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return !((Collection) list).isEmpty();
            }
        }

        public d(mwe mwe) {
            this.a = mwe;
        }

        public final ajde<List<mux>> a(a aVar) {
            akcr.b(aVar, "queryCriteria");
            Object b = this.a.a(aVar).b((ajfl) a.a);
            akcr.a(b, "lensRepository.query(que…ilter { it.isNotEmpty() }");
            return b;
        }
    }

    static {
        mwd mwd = new mwd();
    }

    private mwd() {
    }

    public static final mwe a() {
        return new b();
    }

    public static final mwe a(Collection<? extends mwe> collection, zfw zfw) {
        akcr.b(collection, "repositories");
        akcr.b(zfw, "qualifiedSchedulers");
        int isEmpty = collection.isEmpty() ^ 1;
        if (!ajxy.a || isEmpty != 0) {
            return collection.size() == 1 ? (mwe) ajyu.d((Iterable) collection) : new mwj(collection, zfw);
        } else {
            throw new AssertionError("Assertion failed");
        }
    }

    public static final mwe a(mwe mwe, mvv mvv) {
        akcr.b(mwe, "repository");
        akcr.b(mvv, "transformer");
        return new f(mwe, mvv);
    }

    public static final mwe a(zfw zfw, akbk<? extends mwe> akbk) {
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(akbk, "lensRepositoryInitializer");
        return new muv(zfw, akbk);
    }
}
