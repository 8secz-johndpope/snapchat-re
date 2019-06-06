package defpackage;

import defpackage.maf.a;
import defpackage.maf.a.b;

/* renamed from: lzs */
public final class lzs implements mad {
    private final ajdp<maf> a;
    private final mae b;
    private final zfw c;
    private final ajdu<a, a> d;

    /* renamed from: lzs$b */
    static final class b<T1, T2> implements ajey<a, a> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            a aVar = (a) obj;
            a aVar2 = (a) obj2;
            akcr.b(aVar, "old");
            akcr.b(aVar2, "new");
            if (aVar instanceof defpackage.maf.a.b) {
                return akcr.a(akde.a(aVar.getClass()), akde.a(aVar2.getClass()));
            }
            if (aVar instanceof a.a) {
                return (aVar2 instanceof a.a) && akcr.a(((a.a) aVar).a(), ((a.a) aVar2).a());
            } else {
                throw new ajxk();
            }
        }
    }

    /* renamed from: lzs$a */
    static final class a<T> implements ajfb<ajxm<? extends maf, ? extends defpackage.maf.a>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((maf) ajxm.a).accept((defpackage.maf.a) ajxm.b);
        }
    }

    public lzs(ajdp<maf> ajdp, mae mae, zfw zfw, ajdu<a, a> ajdu) {
        akcr.b(ajdp, "viewProvider");
        akcr.b(mae, "hintUseCase");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ajdu, "viewModelTransformer");
        this.a = ajdp;
        this.b = mae;
        this.c = zfw;
        this.d = ajdu;
    }

    public final ajej a() {
        ajdp b = this.b.b();
        akbl akbl = lzt.a;
        if (akbl != null) {
            akbl = new lzu(akbl);
        }
        Object a = b.p((ajfc) akbl).h(new b(false)).a(this.d).a((ajey) b.a);
        ajdp ajdp = this.a;
        akcr.a(a, "viewModels");
        a = myu.a(ajdp, a).a((ajdw) this.c.l()).f((ajfb) a.a);
        akcr.a(a, "pairLatest(viewProvider,…) -> view.accept(model) }");
        return a;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
