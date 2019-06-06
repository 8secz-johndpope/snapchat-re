package defpackage;

import defpackage.mhs.b;
import defpackage.mjl.c;
import defpackage.mmi.c.a.d;
import defpackage.nay.b.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: lot */
public final class lot implements lor {
    final ajdp<nau> a;
    final ajdp<mmt> b;
    final nay c;
    final ajdp<Set<b>> d;
    private final ajxe e = ajxh.a(new g(this));
    private final lop f;

    /* renamed from: lot$g */
    static final class g extends akcs implements akbk<ajdp> {
        final /* synthetic */ lot a;

        /* renamed from: lot$g$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ g a;

            b(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final mmt mmt = (mmt) obj;
                akcr.b(mmt, "lensCore");
                return mmt.e().a().u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ b a;

                    public final /* synthetic */ Object apply(Object obj) {
                        akcr.b((defpackage.mjl.b) obj, "it");
                        lot lot = this.a.a.a;
                        Object obj2 = mmt;
                        akcr.a(obj2, "lensCore");
                        ajdp u = lot.a.u(new f(lot, obj2));
                        akcr.a((Object) u, "replayedUserData\n       …  }\n                    }");
                        return myu.a(u);
                    }
                });
            }
        }

        /* renamed from: lot$g$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ g a;

            /* renamed from: lot$g$a$a */
            public static final class a<T> implements ajfl<Object> {
                public static final a a = new a();

                public final boolean test(Object obj) {
                    akcr.b(obj, "it");
                    return obj instanceof d;
                }
            }

            /* renamed from: lot$g$a$1 */
            static final class 1<T> implements ajfl<d> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ boolean test(Object obj) {
                    d dVar = (d) obj;
                    akcr.b(dVar, "it");
                    return dVar.b.h;
                }
            }

            a(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final mmt mmt = (mmt) obj;
                akcr.b(mmt, "lensCore");
                Object a = mmt.a().b().a((ajfl) a.a).a(d.class);
                akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
                return a.a((ajfl) 1.a).u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ a a;

                    public final /* synthetic */ Object apply(Object obj) {
                        akcr.b((d) obj, "it");
                        lot lot = this.a.a.a;
                        Object obj2 = mmt;
                        akcr.a(obj2, "lensCore");
                        ajdp u = lot.a.p(d.a).u(new e(obj2));
                        akcr.a((Object) u, "replayedUserData\n       …us)\n                    }");
                        return myu.a(u);
                    }
                });
            }
        }

        g(lot lot) {
            this.a = lot;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.b((ajdt) this.a.b.u(new b(this)), (ajdt) this.a.b.u(new a(this)));
        }
    }

    /* renamed from: lot$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ mmt a;
        private /* synthetic */ lot b;

        a(lot lot, mmt mmt) {
            this.b = lot;
            this.a = mmt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final lom lom = (lom) obj;
            akcr.b(lom, "selfMetadata");
            lot lot = this.b;
            Object u = lot.d.u(new c(lot));
            akcr.a(u, "friendUserIds\n          …())\n                    }");
            Object u2 = u.u(new b(lot));
            akcr.a(u2, "friendUserDataList()\n   …())\n                    }");
            return u2.u(new ajfc<T, ajdt<? extends R>>(this) {
                private /* synthetic */ a a;

                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    akcr.b(list, "friendsMetadata");
                    mmt mmt = this.a.a;
                    Object obj2 = lom;
                    akcr.a(obj2, "selfMetadata");
                    return lot.a(mmt, obj2, list);
                }
            }).i((ajdt) lot.a(this.a, lom, ajyw.a));
        }
    }

    /* renamed from: lot$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lot a;

        /* renamed from: lot$b$1 */
        static final class 1<T, R> implements ajfc<Object[], R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "result");
                Collection arrayList = new ArrayList();
                for (Object obj2 : objArr) {
                    Object obj22;
                    if (!(obj22 instanceof lom)) {
                        obj22 = null;
                    }
                    lom lom = (lom) obj22;
                    if (lom != null) {
                        arrayList.add(lom);
                    }
                }
                return (List) arrayList;
            }
        }

        b(lot lot) {
            this.a = lot;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "userDataList");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((nau) next).a()) {
                    arrayList.add(next);
                }
            }
            Iterable<nau> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (nau a : iterable) {
                arrayList2.add(this.a.a(a));
            }
            return ajdp.a((Iterable) (List) arrayList2, (ajfc) 1.a).i((ajdt) myt.a());
        }
    }

    /* renamed from: lot$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lot a;

        /* renamed from: lot$c$1 */
        static final class 1<T, R> implements ajfc<Object[], R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "result");
                Collection arrayList = new ArrayList();
                for (Object obj2 : objArr) {
                    Object obj22;
                    if (!(obj22 instanceof nau)) {
                        obj22 = null;
                    }
                    nau nau = (nau) obj22;
                    if (nau != null) {
                        arrayList.add(nau);
                    }
                }
                return (List) arrayList;
            }
        }

        c(lot lot) {
            this.a = lot;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Set set = (Set) obj;
            akcr.b(set, "userIds");
            Iterable<b> iterable = set;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (b aVar : iterable) {
                arrayList.add(this.a.c.a(new a(aVar)));
            }
            return ajdp.a((Iterable) (List) arrayList, (ajfc) 1.a).i((ajdt) myt.a());
        }
    }

    /* renamed from: lot$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            nau nau = (nau) obj;
            akcr.b(nau, "it");
            return nau.a() ? c.b.a.a : c.b.b.a;
        }
    }

    /* renamed from: lot$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mmt a;

        e(mmt mmt) {
            this.a = mmt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            c.b bVar = (c.b) obj;
            akcr.b(bVar, "linkStatus");
            return this.a.e().b().c(bVar);
        }
    }

    /* renamed from: lot$f */
    static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lot a;
        private /* synthetic */ mmt b;

        f(lot lot, mmt mmt) {
            this.a = lot;
            this.b = mmt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            nau nau = (nau) obj;
            akcr.b(nau, "selfUserData");
            if (nau.a()) {
                lot lot = this.a;
                obj = lot.a(nau).u(new a(lot, this.b));
                akcr.a(obj, "requestMetadata(selfUser…a))\n                    }");
                return obj;
            }
            String str = nau.a;
            return str != null ? lot.a(this.b, (lom) lou.a.invoke(str), ajyw.a) : null;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lot.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public lot(ajdp<mmt> ajdp, nay nay, ajdp<Set<b>> ajdp2, lop lop) {
        akcr.b(ajdp, "lensCore");
        akcr.b(nay, "userDataRepository");
        akcr.b(ajdp2, "friendUserIds");
        akcr.b(lop, "bitmojiDataRepository");
        this.b = ajdp;
        this.c = nay;
        this.d = ajdp2;
        this.f = lop;
        Object a = this.c.a(nay.b.b.a).i().a();
        akcr.a(a, "userDataRepository\n     …)\n            .refCount()");
        this.a = a;
    }

    static ajdp<ajxw> a(mmt mmt, lom lom, List<lom> list) {
        mid b = mmt.e().b();
        c.a a = lou.a(lom);
        Iterable<lom> iterable = list;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (lom a2 : iterable) {
            arrayList.add(lou.a(a2));
        }
        return b.c(new c.c(a, (List) arrayList));
    }

    /* Access modifiers changed, original: final */
    public final ajdp<lom> a(nau nau) {
        Object a;
        String str = nau.a;
        String str2 = nau.g;
        if (str == null || str2 == null) {
            a = ajvo.a(ajot.a);
            str = "Observable.empty()";
        } else {
            a = this.f.a(new b(str), new b(str2)).g();
            str = "bitmojiDataRepository.re…          .toObservable()";
        }
        akcr.a(a, str);
        return a;
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp b() {
        return (ajdp) this.e.b();
    }
}
