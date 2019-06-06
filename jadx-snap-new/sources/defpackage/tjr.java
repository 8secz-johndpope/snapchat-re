package defpackage;

import android.app.Activity;
import com.snap.payments.lib.api.PaymentsApiHttpInterface;

/* renamed from: tjr */
public final class tjr {
    final ajxe a = ajxh.a(new e(this));
    final ajwy<iha> b;
    final aipn<PaymentsApiHttpInterface> c;
    final ftl d;
    private final ajxe e = ajxh.a(new b(this));

    /* renamed from: tjr$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: tjr$e */
    static final class e extends akcs implements akbk<Boolean> {
        private /* synthetic */ tjr a;

        e(tjr tjr) {
            this.a = tjr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.d.a((fth) tgt.ENABLE_PAYMENTS_CUSTOM_ENDPOINT));
        }
    }

    /* renamed from: tjr$b */
    static final class b extends akcs implements akbk<String> {
        private /* synthetic */ tjr a;

        b(tjr tjr) {
            this.a = tjr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((Boolean) this.a.a.b()).booleanValue() ? "https://snapchat-payments-gateway.snap-dev.net" : "https://snapchat-payments-gateway.snapchat.com";
        }
    }

    /* renamed from: tjr$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ tjr a;
        private /* synthetic */ String b;

        c(tjr tjr, String str) {
            this.a = tjr;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            tjr tjr = this.a;
            String str2 = this.b;
            ahix ahix = new ahix();
            ahix.a = "BRAINTREE";
            ahix.b = str;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(tjr.a());
            stringBuilder.append("/paymentmethods/creditcards");
            obj = ((PaymentsApiHttpInterface) tjr.c.get()).createCreditCard(tjr.a(str2), stringBuilder.toString(), ahix).f(new tjt(d.a));
            akcr.a(obj, "paymentsApiHttpInterface…ponse>::checkApiResponse)");
            return obj;
        }
    }

    /* renamed from: tjr$f */
    static final class f<T, R> implements ajfc<akxa<akhw>, ajdb> {
        private /* synthetic */ tjr a;

        /* renamed from: tjr$f$1 */
        static final class 1 extends akcq implements akbw<akxa<akhw>, ajwy<iha>, ajcx> {
            public static final 1 a = new 1();

            1() {
                super(2);
            }

            public final String getName() {
                return "check204Response";
            }

            public final akej getOwner() {
                return akde.a(tjs.class, "payments-core_release");
            }

            public final String getSignature() {
                return "check204Response(Lretrofit2/adapter/rxjava2/Result;Ljavax/inject/Provider;)Lio/reactivex/Completable;";
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                akxa akxa = (akxa) obj;
                ajwy ajwy = (ajwy) obj2;
                akcr.b(akxa, "p1");
                akcr.b(ajwy, "p2");
                akcr.b(akxa, "receiver$0");
                akcr.b(ajwy, "serializationHelper");
                obj2 = ajwy.get();
                akcr.a(obj2, "serializationHelper.get()");
                tjs.a(akxa, (iha) obj2);
                akws a = akxa.a();
                if ((a != null ? (akhw) a.f() : null) == null) {
                    a = akxa.a();
                    if (a != null && a.b() == 204) {
                        obj = ajvo.a(ajhn.a);
                        akcr.a(obj, "Completable.complete()");
                        return obj;
                    }
                }
                the f = the.f();
                akws a2 = akxa.a();
                throw new thg(f, a2 != null ? (long) a2.b() : 0);
            }
        }

        f(tjr tjr) {
            this.a = tjr;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "it");
            return (ajcx) 1.a.invoke(akxa, this.a.b);
        }
    }

    /* renamed from: tjr$m */
    static final class m<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ Activity a;
        private /* synthetic */ thm b;

        m(Activity activity, thm thm) {
            this.a = activity;
            this.b = thm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ahio ahio = (ahio) obj;
            akcr.b(ahio, "it");
            return new tjx(ahio.a, this.a, this.b).a();
        }
    }

    /* renamed from: tjr$n */
    static final class n<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ tjr a;
        private /* synthetic */ String b;
        private /* synthetic */ thm c;

        n(tjr tjr, String str, thm thm) {
            this.a = tjr;
            this.b = str;
            this.c = thm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            tjr tjr = this.a;
            String str2 = this.b;
            thm thm = this.c;
            ahix ahix = new ahix();
            ahix.a = "BRAINTREE";
            ahix.b = str;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(tjr.a());
            stringBuilder.append("/paymentmethods/creditcards/");
            stringBuilder.append(thm.a());
            obj = ((PaymentsApiHttpInterface) tjr.c.get()).updateCreditCard(tjr.a(str2), stringBuilder.toString(), ahix).f(new tjt(o.a));
            akcr.a(obj, "paymentsApiHttpInterface…ponse>::checkApiResponse)");
            return obj;
        }
    }

    /* renamed from: tjr$d */
    static final class d extends akcq implements akbl<akxa<ahir>, ahir> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final String getName() {
            return "checkApiResponse";
        }

        public final akej getOwner() {
            return akde.a(tjs.class, "payments-core_release");
        }

        public final String getSignature() {
            return "checkApiResponse(Lretrofit2/adapter/rxjava2/Result;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "p1");
            return (ahir) tjs.a(akxa);
        }
    }

    /* renamed from: tjr$g */
    static final class g extends akcq implements akbl<akxa<aggw>, aggw> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final String getName() {
            return "checkApiResponse";
        }

        public final akej getOwner() {
            return akde.a(tjs.class, "payments-core_release");
        }

        public final String getSignature() {
            return "checkApiResponse(Lretrofit2/adapter/rxjava2/Result;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "p1");
            return (aggw) tjs.a(akxa);
        }
    }

    /* renamed from: tjr$h */
    static final class h extends akcq implements akbl<akxa<ahio>, ahio> {
        public static final h a = new h();

        h() {
            super(1);
        }

        public final String getName() {
            return "checkApiResponse";
        }

        public final akej getOwner() {
            return akde.a(tjs.class, "payments-core_release");
        }

        public final String getSignature() {
            return "checkApiResponse(Lretrofit2/adapter/rxjava2/Result;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "p1");
            return (ahio) tjs.a(akxa);
        }
    }

    /* renamed from: tjr$i */
    static final class i extends akcq implements akbl<akxa<agit>, agit> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final String getName() {
            return "checkApiResponse";
        }

        public final akej getOwner() {
            return akde.a(tjs.class, "payments-core_release");
        }

        public final String getSignature() {
            return "checkApiResponse(Lretrofit2/adapter/rxjava2/Result;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "p1");
            return (agit) tjs.a(akxa);
        }
    }

    /* renamed from: tjr$j */
    static final class j extends akcq implements akbl<akxa<ahjg>, ahjg> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final String getName() {
            return "checkApiResponse";
        }

        public final akej getOwner() {
            return akde.a(tjs.class, "payments-core_release");
        }

        public final String getSignature() {
            return "checkApiResponse(Lretrofit2/adapter/rxjava2/Result;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "p1");
            return (ahjg) tjs.a(akxa);
        }
    }

    /* renamed from: tjr$k */
    static final class k extends akcq implements akbl<akxa<akhw>, akhw> {
        public static final k a = new k();

        k() {
            super(1);
        }

        public final String getName() {
            return "checkApiResponse";
        }

        public final akej getOwner() {
            return akde.a(tjs.class, "payments-core_release");
        }

        public final String getSignature() {
            return "checkApiResponse(Lretrofit2/adapter/rxjava2/Result;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "p1");
            return (akhw) tjs.a(akxa);
        }
    }

    /* renamed from: tjr$l */
    static final class l extends akcq implements akbl<akxa<agjm>, agjm> {
        public static final l a = new l();

        l() {
            super(1);
        }

        public final String getName() {
            return "checkApiResponse";
        }

        public final akej getOwner() {
            return akde.a(tjs.class, "payments-core_release");
        }

        public final String getSignature() {
            return "checkApiResponse(Lretrofit2/adapter/rxjava2/Result;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "p1");
            return (agjm) tjs.a(akxa);
        }
    }

    /* renamed from: tjr$o */
    static final class o extends akcq implements akbl<akxa<ahjl>, ahjl> {
        public static final o a = new o();

        o() {
            super(1);
        }

        public final String getName() {
            return "checkApiResponse";
        }

        public final akej getOwner() {
            return akde.a(tjs.class, "payments-core_release");
        }

        public final String getSignature() {
            return "checkApiResponse(Lretrofit2/adapter/rxjava2/Result;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "p1");
            return (ahjl) tjs.a(akxa);
        }
    }

    /* renamed from: tjr$p */
    static final class p extends akcq implements akbl<akxa<aghn>, aghn> {
        public static final p a = new p();

        p() {
            super(1);
        }

        public final String getName() {
            return "checkApiResponse";
        }

        public final akej getOwner() {
            return akde.a(tjs.class, "payments-core_release");
        }

        public final String getSignature() {
            return "checkApiResponse(Lretrofit2/adapter/rxjava2/Result;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "p1");
            return (aghn) tjs.a(akxa);
        }
    }

    /* renamed from: tjr$q */
    static final class q extends akcq implements akbl<akxa<agjm>, agjm> {
        public static final q a = new q();

        q() {
            super(1);
        }

        public final String getName() {
            return "checkApiResponse";
        }

        public final akej getOwner() {
            return akde.a(tjs.class, "payments-core_release");
        }

        public final String getSignature() {
            return "checkApiResponse(Lretrofit2/adapter/rxjava2/Result;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "p1");
            return (agjm) tjs.a(akxa);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tjr.class), "customEndpointEnabled", "getCustomEndpointEnabled()Z"), new akdc(akde.a(tjr.class), "PAYMENT_BASE_URL", "getPAYMENT_BASE_URL()Ljava/lang/String;")};
        a aVar = new a();
    }

    public tjr(ajwy<iha> ajwy, aipn<PaymentsApiHttpInterface> aipn, ftl ftl) {
        akcr.b(ajwy, "serializationHelperProvider");
        akcr.b(aipn, "paymentsApiHttpInterface");
        akcr.b(ftl, "configurationProvider");
        this.b = ajwy;
        this.c = aipn;
        this.d = ftl;
    }

    static String a(String str) {
        return "SnapchatCommerceMobileBearer ".concat(String.valueOf(str));
    }

    /* Access modifiers changed, original: final */
    public final ajdx<String> a(String str, thm thm, Activity activity) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a());
        stringBuilder.append("/paymentmethods/braintree_client_token");
        Object f = ((PaymentsApiHttpInterface) this.c.get()).getBraintreeClientToken(tjr.a(str), stringBuilder.toString()).f(new tjt(h.a));
        akcr.a(f, "paymentsApiHttpInterface…Token>::checkApiResponse)");
        f = f.a((ajfc) new m(activity, thm));
        akcr.a(f, "getBraintreeClientToken(…vity, card).executeRx() }");
        return f;
    }

    public final String a() {
        return (String) this.e.b();
    }
}
