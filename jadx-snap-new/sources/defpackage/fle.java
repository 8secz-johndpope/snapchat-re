package defpackage;

import com.snap.commerce.lib.api.CommerceApiHttpInterface;
import defpackage.flc.f;
import defpackage.flc.g;

/* renamed from: fle */
public final class fle implements fiw {
    final flc a;
    final tjj b;
    final tfw c;
    private final zfw d = zgb.a(fiq.o.callsite("CommerceDataProvider"));
    private final tjn e;
    private final flt f;

    /* renamed from: fle$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: fle$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ fle a;
        private /* synthetic */ aghe b;

        b(fle fle, aghe aghe) {
            this.a = fle;
            this.b = aghe;
        }

        public final /* synthetic */ Object apply(Object obj) {
            agij agij = (agij) obj;
            akcr.b(agij, "it");
            flc flc = this.a.a;
            obj = agij.a;
            akcr.a(obj, "it.opaqueToken");
            aghe aghe = this.b;
            akcr.b(obj, "token");
            akcr.b(aghe, "checkout");
            CommerceApiHttpInterface commerceApiHttpInterface = (CommerceApiHttpInterface) flc.b.get();
            String a = flc.a(obj);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(flc.a.a());
            stringBuilder.append("/commerce/orders/checkouts");
            obj = commerceApiHttpInterface.createCheckout(a, stringBuilder.toString(), aghe).f(new fld(defpackage.flc.b.a));
            akcr.a(obj, "commerceApiHttpInterface…ckout>::checkApiResponse)");
            return obj;
        }
    }

    /* renamed from: fle$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ fle a;
        private /* synthetic */ String b;

        c(fle fle, String str) {
            this.a = fle;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            agij agij = (agij) obj;
            akcr.b(agij, "it");
            flc flc = this.a.a;
            obj = agij.a;
            akcr.a(obj, "it.opaqueToken");
            String str = this.b;
            akcr.b(obj, "token");
            akcr.b(str, "productId");
            CommerceApiHttpInterface commerceApiHttpInterface = (CommerceApiHttpInterface) flc.b.get();
            String a = flc.a(obj);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(flc.a.a());
            stringBuilder.append("/commerce/catalog/products/");
            stringBuilder.append(str);
            obj = commerceApiHttpInterface.getProductInfo(a, stringBuilder.toString()).f(new fld(defpackage.flc.c.a));
            akcr.a(obj, "commerceApiHttpInterface…tInfo>::checkApiResponse)");
            return obj;
        }
    }

    /* renamed from: fle$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ fle a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ long d;
        private /* synthetic */ long e;

        d(fle fle, String str, String str2, long j, long j2) {
            this.a = fle;
            this.b = str;
            this.c = str2;
            this.d = j;
            this.e = j2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            agij agij = (agij) obj;
            akcr.b(agij, "it");
            flc flc = this.a.a;
            obj = agij.a;
            akcr.a(obj, "it.opaqueToken");
            String str = this.b;
            String str2 = this.c;
            long j = this.d;
            long j2 = this.e;
            akcr.b(obj, "token");
            akcr.b(str, "storeId");
            akcr.b(str2, "categoryId");
            CommerceApiHttpInterface commerceApiHttpInterface = (CommerceApiHttpInterface) flc.b.get();
            String a = flc.a(obj);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(flc.a.a());
            stringBuilder.append("/commerce/sellers/");
            stringBuilder.append(str);
            stringBuilder.append("/products");
            obj = commerceApiHttpInterface.getProductInfoList(a, stringBuilder.toString(), str2, j, j2).f(new fld(defpackage.flc.d.a));
            akcr.a(obj, "commerceApiHttpInterface…oList>::checkApiResponse)");
            return obj;
        }
    }

    /* renamed from: fle$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ fle a;
        private /* synthetic */ String b;

        e(fle fle, String str) {
            this.a = fle;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            agij agij = (agij) obj;
            akcr.b(agij, "it");
            flc flc = this.a.a;
            obj = agij.a;
            akcr.a(obj, "it.opaqueToken");
            String str = this.b;
            akcr.b(obj, "token");
            akcr.b(str, "storeId");
            CommerceApiHttpInterface commerceApiHttpInterface = (CommerceApiHttpInterface) flc.b.get();
            String a = flc.a(obj);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(flc.a.a());
            stringBuilder.append("/commerce/sellers/");
            stringBuilder.append(str);
            obj = commerceApiHttpInterface.getStoreInfo(a, stringBuilder.toString()).f(new fld(defpackage.flc.e.a));
            akcr.a(obj, "commerceApiHttpInterface…eInfo>::checkApiResponse)");
            return obj;
        }
    }

    /* renamed from: fle$f */
    static final class f<T> implements ajfb<ajej> {
        private /* synthetic */ fle a;
        private /* synthetic */ tgn b;

        f(fle fle, tgn tgn) {
            this.a = fle;
            this.b = tgn;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.b.c = System.currentTimeMillis();
        }
    }

    /* renamed from: fle$g */
    static final class g<T> implements ajfb<T> {
        private /* synthetic */ fle a;
        private /* synthetic */ tgn b;

        g(fle fle, tgn tgn) {
            this.a = fle;
            this.b = tgn;
        }

        public final void accept(T t) {
            fle fle = this.a;
            tgn tgn = this.b;
            long currentTimeMillis = System.currentTimeMillis() - tgn.c;
            fle.b.a(tgn.a, tgn.b, currentTimeMillis);
            fle.c.a(tgn, currentTimeMillis);
        }
    }

    /* renamed from: fle$h */
    static final class h<T> implements ajfb<Throwable> {
        private /* synthetic */ fle a;
        private /* synthetic */ tgn b;

        h(fle fle, tgn tgn) {
            this.a = fle;
            this.b = tgn;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "throwable");
            fle fle = this.a;
            tgn tgn = this.b;
            if (th instanceof thg) {
                long currentTimeMillis = System.currentTimeMillis() - tgn.c;
                tjj tjj = fle.b;
                aafz aafz = tgn.a;
                aaxv aaxv = tgn.b;
                thg thg = (thg) th;
                long j = thg.b;
                Object obj2 = thg.a;
                String str = "throwable.mErrorResponse";
                akcr.a(obj2, str);
                tjj.a(aafz, aaxv, j, obj2.b(), currentTimeMillis);
                tfw tfw = fle.c;
                obj = thg.a;
                akcr.a(obj, str);
                obj = obj.b();
                akcr.a(obj, "throwable.mErrorResponse.code");
                tfw.a(tgn, obj, currentTimeMillis);
            }
        }
    }

    /* renamed from: fle$i */
    static final class i<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ fle a;
        private /* synthetic */ agiz b;

        i(fle fle, agiz agiz) {
            this.a = fle;
            this.b = agiz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            agij agij = (agij) obj;
            akcr.b(agij, "it");
            flc flc = this.a.a;
            obj = agij.a;
            akcr.a(obj, "it.opaqueToken");
            agiz agiz = this.b;
            akcr.b(obj, "token");
            akcr.b(agiz, "payRequest");
            CommerceApiHttpInterface commerceApiHttpInterface = (CommerceApiHttpInterface) flc.b.get();
            String a = flc.a(obj);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(flc.a.a());
            stringBuilder.append("/commerce/orders/checkouts/");
            stringBuilder.append(agiz.a);
            stringBuilder.append("/pay");
            obj = commerceApiHttpInterface.placeOrder(a, stringBuilder.toString(), agiz).f(new fld(f.a));
            akcr.a(obj, "commerceApiHttpInterface…Order>::checkApiResponse)");
            return obj;
        }
    }

    /* renamed from: fle$j */
    static final class j<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ fle a;
        private /* synthetic */ aghe b;

        j(fle fle, aghe aghe) {
            this.a = fle;
            this.b = aghe;
        }

        public final /* synthetic */ Object apply(Object obj) {
            agij agij = (agij) obj;
            akcr.b(agij, "it");
            flc flc = this.a.a;
            obj = agij.a;
            akcr.a(obj, "it.opaqueToken");
            Object obj2 = this.b;
            akcr.a(obj2, "checkoutNative");
            akcr.b(obj, "token");
            akcr.b(obj2, "checkout");
            CommerceApiHttpInterface commerceApiHttpInterface = (CommerceApiHttpInterface) flc.b.get();
            String a = flc.a(obj);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(flc.a.a());
            stringBuilder.append("/commerce/orders/checkouts/");
            stringBuilder.append(obj2.a);
            obj = commerceApiHttpInterface.updateCheckout(a, stringBuilder.toString(), obj2).f(new fld(g.a));
            akcr.a(obj, "commerceApiHttpInterface…ckout>::checkApiResponse)");
            return obj;
        }
    }

    static {
        a aVar = new a();
    }

    public fle(tjn tjn, flc flc, zgb zgb, flt flt, tjj tjj, tfw tfw) {
        akcr.b(tjn, "tokenManager");
        akcr.b(flc, "apiCaller");
        akcr.b(zgb, "schedulerProvider");
        akcr.b(flt, "checkoutConverter");
        akcr.b(tjj, "logger");
        akcr.b(tfw, "commerceGrapheneMetrics");
        this.e = tjn;
        this.a = flc;
        this.f = flt;
        this.b = tjj;
        this.c = tfw;
    }

    private final <T> ajdx<T> a(ajdx<T> ajdx, tgn tgn) {
        Object d = ajdx.b((ajfb) new f(this, tgn)).c((ajfb) new g(this, tgn)).d((ajfb) new h(this, tgn));
        akcr.a(d, "doOnSubscribe { startRec…(restAction, throwable) }");
        return d;
    }

    public final ajdx<agip> a(agiz agiz) {
        akcr.b(agiz, "payRequest");
        ajdx a = this.e.a().a((ajdw) this.d.g()).a((ajfc) new i(this, agiz));
        akcr.a((Object) a, "tokenManager.getAuthToke…paqueToken, payRequest) }");
        return a(a, new tgn(aafz.PLACEORDER, aaxv.CREATE, (byte) 0));
    }

    public final ajdx<aghe> a(fiz fiz) {
        akcr.b(fiz, "checkoutModel");
        ajdx a = this.e.a().a((ajdw) this.d.g()).a((ajfc) new j(this, flt.a(fiz)));
        akcr.a((Object) a, "tokenManager.getAuthToke…eToken, checkoutNative) }");
        return a(a, new tgn(aafz.CHECKOUT, aaxv.EDIT, (byte) 0));
    }

    public final ajdx<aghe> a(fiz fiz, Boolean bool) {
        akcr.b(fiz, "checkoutModel");
        aghe aghe = new aghe();
        aghe.b = fiz.b();
        aghe.c = fiz.c();
        aghe.h = fiz.d();
        aghe.p = bool;
        thh a = fiz.a();
        aghe.f = a != null ? flu.a(a) : null;
        ajdx a2 = this.e.a().a((ajdw) this.d.g()).a((ajfc) new b(this, aghe));
        akcr.a((Object) a2, "tokenManager.getAuthToke…eToken, checkoutNative) }");
        return a(a2, new tgn(aafz.CHECKOUT, aaxv.CREATE, (byte) 0));
    }

    public final ajdx<agjb> a(String str) {
        akcr.b(str, "productId");
        ajdx a = this.e.a().a((ajdw) this.d.g()).a((ajfc) new c(this, str));
        akcr.a((Object) a, "tokenManager.getAuthToke…opaqueToken, productId) }");
        return a(a, new tgn(aafz.PRODUCTS, aaxv.GET, (byte) 0));
    }

    public final ajdx<agjd> a(String str, String str2, long j, long j2) {
        akcr.b(str, "storeId");
        akcr.b(str2, "categoryId");
        ajdx a = this.e.a().a((ajdw) this.d.g()).a((ajfc) new d(this, str, str2, 20, j2));
        akcr.a((Object) a, "tokenManager.getAuthToke…egoryId, limit, offset) }");
        return a(a, new tgn(aafz.PRODUCTS, aaxv.LIST, (byte) 0));
    }

    public final ajdx<agkd> b(String str) {
        akcr.b(str, "storeId");
        ajdx a = this.e.a().a((ajdw) this.d.g()).a((ajfc) new e(this, str));
        akcr.a((Object) a, "tokenManager.getAuthToke…t.opaqueToken, storeId) }");
        return a(a, new tgn(aafz.STORE, aaxv.GET, (byte) 0));
    }
}
