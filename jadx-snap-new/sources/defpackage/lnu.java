package defpackage;

import defpackage.loj.a;
import defpackage.mhs.b;
import defpackage.miq.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: lnu */
public final class lnu implements loj {
    final ajwo<a> a;
    final loi b;
    final nay c;
    final ajdp<Set<b>> d;
    final mwe e;
    final lop f;
    private final ajxe g = ajxh.a(new f(this));
    private final ajxe h = ajxh.a(new g(this));

    /* renamed from: lnu$f */
    static final class f extends akcs implements akbk<ajfb<a>> {
        private /* synthetic */ lnu a;

        f(lnu lnu) {
            this.a = lnu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new lnv(new akbl<a, ajxw>(this.a.a) {
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
            });
        }
    }

    /* renamed from: lnu$g */
    static final class g extends akcs implements akbk<ajdp<loj.b>> {
        private /* synthetic */ lnu a;

        g(lnu lnu) {
            this.a = lnu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.m(new lnw(new akbl<a, ajdj<loj.b>>(this.a) {
                public final String getName() {
                    return "processAction";
                }

                public final akej getOwner() {
                    return akde.a(lnu.class);
                }

                public final String getSignature() {
                    return "processAction(Lcom/snap/lenses/assets/RemoteAssetsUseCase$Action;)Lio/reactivex/Maybe;";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    Object a;
                    String str;
                    a aVar = (a) obj;
                    akcr.b(aVar, "p1");
                    lnu lnu = (lnu) this.receiver;
                    mny.b bVar = aVar.a;
                    lny lny = bVar.a;
                    b bVar2 = bVar.b;
                    mhs mhs = bVar.c;
                    b bVar3 = bVar.d;
                    ajdj a2 = lnu.b.a(lny, bVar2, bVar3, mhs, bVar.e, bVar.f).a((ajfl) h.a);
                    if (lny instanceof lny.a) {
                        a = lnu.e.a(new mwe.a.b(bVar3)).b((ajfl) b.a).b().a((ajfc) new c(lnu, bVar2, mhs));
                        str = "lensRepository.query(Len…  }\n                    }";
                    } else {
                        a = ajvo.a(ajlu.a);
                        str = "Maybe.empty()";
                    }
                    akcr.a(a, str);
                    obj = a2.b((ajdn) a).f(new i(lny, bVar2, mhs, bVar3)).f(new lnw(j.a));
                    akcr.a(obj, "remoteAssetsRepository.r…           .map(::Result)");
                    return obj;
                }
            }));
        }
    }

    /* renamed from: lnu$h */
    static final class h<T> implements ajfl<miq> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            miq miq = (miq) obj;
            akcr.b(miq, "it");
            return miq instanceof e;
        }
    }

    /* renamed from: lnu$b */
    static final class b<T> implements ajfl<List<? extends mux>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return !((Collection) list).isEmpty();
        }
    }

    /* renamed from: lnu$c */
    static final class c<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ lnu a;
        private /* synthetic */ b b;
        private /* synthetic */ mhs c;

        c(lnu lnu, b bVar, mhs mhs) {
            this.a = lnu;
            this.b = bVar;
            this.c = mhs;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            List list = (List) obj;
            akcr.b(list, "it");
            muc a = ((mux) list.get(0)).a(this.b);
            if (a == null || a.d == muc.b.AVATAR_ASSET) {
                lnu lnu = this.a;
                obj = lnu.c.a(nay.b.b.a).m(new a(lnu, this.c, this.b)).d();
                str = "userDataRepository\n     …          .firstElement()";
            } else {
                obj = ajvo.a(ajlu.a);
                str = "Maybe.empty()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: lnu$i */
    static final class i<T, R> implements ajfc<T, R> {
        private /* synthetic */ lny a;
        private /* synthetic */ b b;
        private /* synthetic */ mhs c;
        private /* synthetic */ b d;

        i(lny lny, b bVar, mhs mhs, b bVar2) {
            this.a = lny;
            this.b = bVar;
            this.c = mhs;
            this.d = bVar2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            miq miq = (miq) obj;
            akcr.b(miq, "it");
            return new mny.a(this.a, this.b, this.c, this.d, (e) miq);
        }
    }

    /* renamed from: lnu$j */
    static final class j extends akcq implements akbl<mny.a, loj.b> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(loj.b.class);
        }

        public final String getSignature() {
            return "<init>(Lcom/snap/lenses/core/RemoteAssetsProcessor$RemoteAssetDescriptor;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mny.a aVar = (mny.a) obj;
            akcr.b(aVar, "p1");
            return new loj.b(aVar);
        }
    }

    /* renamed from: lnu$a */
    static final class a<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ lnu a;
        private /* synthetic */ mhs b;
        private /* synthetic */ b c;

        a(lnu lnu, mhs mhs, b bVar) {
            this.a = lnu;
            this.b = mhs;
            this.c = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            nau nau = (nau) obj;
            akcr.b(nau, "it");
            String str = nau.a;
            String str2 = nau.g;
            if (str == null || !nau.a() || str2 == null) {
                return ajvo.a(ajlu.a);
            }
            mhs mhs = this.b;
            if (!(mhs instanceof b) || akcr.a((Object) str2, ((b) mhs).a)) {
                return this.a.f.a(new b(str), new b(str2), this.c);
            }
            lnu lnu = this.a;
            b bVar = (b) this.b;
            b bVar2 = this.c;
            Object u = lnu.d.u(new e(lnu));
            akcr.a(u, "friendUserIds\n          …())\n                    }");
            obj = u.u(new d(lnu, bVar, bVar2)).d();
            akcr.a(obj, "friendUserDataList()\n   …          .firstElement()");
            return obj;
        }
    }

    /* renamed from: lnu$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ lnu a;
        final /* synthetic */ b b;
        private /* synthetic */ b c;

        /* renamed from: lnu$d$1 */
        static final class 1<T, R> implements ajfc<T, ajdn<? extends R>> {
            private /* synthetic */ d a;

            1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                nau nau = (nau) obj;
                akcr.b(nau, "it");
                String str = nau.a;
                String str2 = nau.g;
                if (str != null && str2 != null) {
                    return this.a.a.f.a(new b(str), new b(str2), this.a.b);
                }
                obj = ajvo.a(ajlu.a);
                akcr.a(obj, "Maybe.empty()");
                return obj;
            }
        }

        d(lnu lnu, b bVar, b bVar2) {
            this.a = lnu;
            this.c = bVar;
            this.b = bVar2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object obj2;
            String str;
            List list = (List) obj;
            akcr.b(list, "userDataList");
            Iterator it = list.iterator();
            do {
                str = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
            } while (!akcr.a(((nau) obj2).g, this.c.a));
            nau nau = (nau) obj2;
            if (nau != null) {
                str = nau.a;
            }
            return str == null ? ajvo.a(ajot.a) : this.a.c.a(new nay.b.a(new b(str))).m(new 1(this));
        }
    }

    /* renamed from: lnu$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lnu a;

        /* renamed from: lnu$e$1 */
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

        e(lnu lnu) {
            this.a = lnu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Set set = (Set) obj;
            akcr.b(set, "userIds");
            Iterable<b> iterable = set;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (b aVar : iterable) {
                arrayList.add(this.a.c.a(new nay.b.a(aVar)));
            }
            return ajdp.a((Iterable) (List) arrayList, (ajfc) 1.a).i((ajdt) myt.a());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lnu.class), "inputs", "getInputs()Lio/reactivex/functions/Consumer;"), new akdc(akde.a(lnu.class), "outputs", "getOutputs()Lio/reactivex/Observable;")};
    }

    public lnu(loi loi, nay nay, ajdp<Set<b>> ajdp, mwe mwe, lop lop) {
        akcr.b(loi, "remoteAssetsRepository");
        akcr.b(nay, "userDataRepository");
        akcr.b(ajdp, "friendUserIds");
        akcr.b(mwe, "lensRepository");
        akcr.b(lop, "bitmojiDataRepository");
        this.b = loi;
        this.c = nay;
        this.d = ajdp;
        this.e = mwe;
        this.f = lop;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Re…teAssetsUseCase.Action>()");
        this.a = ajwo;
    }

    public final ajfb<a> a() {
        return (ajfb) this.g.b();
    }

    public final ajdp<loj.b> b() {
        return (ajdp) this.h.b();
    }
}
