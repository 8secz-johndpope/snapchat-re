package defpackage;

import defpackage.vpl.b;
import defpackage.vpl.b.a.a;
import defpackage.vve.k;
import java.security.InvalidParameterException;

/* renamed from: vpz */
public final class vpz implements vpl {
    final idd a = vpg.e.callsite("DefaultUnlocker");
    private final ajxe b;
    private final ajxe c;

    /* renamed from: vpz$f */
    static final class f extends akcs implements akbk<zpo> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zpo) this.a.get();
        }
    }

    /* renamed from: vpz$a */
    static final class a extends akcs implements akbk<vvf> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (vvf) this.a.get();
        }
    }

    /* renamed from: vpz$b */
    static final class b<T, R> implements ajfc<T, ajdn<? extends R>> {
        final /* synthetic */ vse a;
        private /* synthetic */ vpz b;
        private /* synthetic */ boolean c;
        private /* synthetic */ aenr d;

        /* renamed from: vpz$b$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((defpackage.zsk.b) obj, "it");
                return new a((defpackage.vse.b) this.a.a);
            }
        }

        /* renamed from: vpz$b$2 */
        static final class 2<T> implements ajfb<defpackage.vpl.b> {
            private /* synthetic */ b a;

            2(b bVar) {
                this.a = bVar;
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: vpz$b$3 */
        static final class 3 implements ajev {
            private /* synthetic */ b a;

            3(b bVar) {
                this.a = bVar;
            }

            public final void run() {
            }
        }

        b(vpz vpz, vse vse, boolean z, aenr aenr) {
            this.b = vpz;
            this.a = vse;
            this.c = z;
            this.d = aenr;
        }

        public final /* synthetic */ Object apply(Object obj) {
            zpp zpp = (zpp) obj;
            akcr.b(zpp, "api");
            return zpp.a((defpackage.zst.b) new defpackage.zst.b.b(((defpackage.vse.b) this.a).a, this.c, this.d), this.b.a).f(new 1(this)).c((ajfb) new 2(this)).b((ajev) new 3(this));
        }
    }

    /* renamed from: vpz$c */
    static final class c<T, R> implements ajfc<T, ajdn<? extends R>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            vvh vvh = (vvh) obj;
            akcr.b(vvh, "it");
            for (vve vve : vvh.b) {
                if (vve instanceof k) {
                    break;
                }
            }
            vve vve2 = null;
            return vve2 != null ? ajdj.b((k) vve2) : ajvo.a(ajlu.a);
        }
    }

    /* renamed from: vpz$d */
    static final class d<T> implements ajfl<k> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            k kVar = (k) obj;
            akcr.b(kVar, "it");
            obj = kVar.a.u;
            akcr.a(obj, "it.response.isLens");
            return obj.booleanValue();
        }
    }

    /* renamed from: vpz$e */
    static final class e<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ vpz a;

        e(vpz vpz) {
            this.a = vpz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            k kVar = (k) obj;
            akcr.b(kVar, "it");
            aenr aenr = kVar.a;
            return this.a.a(vse.a.a(kVar.a.a), false, aenr);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(vpz.class), "unlockablesApi", "getUnlockablesApi()Lcom/snap/unlockables/api/UnlockablesApi;"), new akdc(akde.a(vpz.class), "scannableQuery", "getScannableQuery()Lcom/snap/scan/scannable/ScannableQuery;")};
    }

    public vpz(ajwy<vvf> ajwy, ajwy<zpo> ajwy2) {
        akcr.b(ajwy, "lazyScannableQuery");
        akcr.b(ajwy2, "lazyUnlockablesApi");
        this.b = ajxh.a(new f(ajwy2));
        this.c = ajxh.a(new a(ajwy));
    }

    private final zpo a() {
        return (zpo) this.b.b();
    }

    public final ajdj<b> a(vpl.a aVar) {
        akcr.b(aVar, "item");
        if (aVar instanceof vpl.a.a.a) {
            return a(((vpl.a.a.a) aVar).a, true, null);
        }
        if (aVar instanceof vpl.a.a.b) {
            vpl.a.a.b bVar = (vpl.a.a.b) aVar;
            vse.b bVar2 = bVar.a;
            Object a = ((vvf) this.c.b()).a(bVar2.a, bVar.b).b((ajfc) c.a).a((ajfl) d.a).a((ajfc) new e(this));
            akcr.a(a, "scannableQuery.getRespon…sponse)\n                }");
            return a;
        }
        throw new ajxk();
    }

    /* Access modifiers changed, original: final */
    public final ajdj<b> a(vse vse, boolean z, aenr aenr) {
        Object d;
        String str;
        if (vse instanceof vse.b) {
            d = a().a(this.a).w(new b(this, vse, z, aenr)).d();
            str = "unlockablesApi.connect(c…         }.firstElement()";
        } else {
            StringBuilder stringBuilder = new StringBuilder("Lens ID[");
            stringBuilder.append(vse);
            stringBuilder.append("] is not valid. Show error");
            d = ajdj.b((Throwable) new InvalidParameterException(stringBuilder.toString()));
            str = "Maybe.error(InvalidParam… not valid. Show error\"))";
        }
        akcr.a(d, str);
        return d;
    }
}
