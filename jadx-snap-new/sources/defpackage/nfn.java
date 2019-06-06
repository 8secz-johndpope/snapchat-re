package defpackage;

import com.snap.location.http.LocationHttpInterface;
import com.snap.ui.view.TakeSnapButton;
import defpackage.nfx.a;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: nfn */
public final class nfn implements nfx {
    private final ajxe a = ajxh.a(new i(this));
    private final ajei b = new ajei();
    private final zgb c;
    private final ajwy<LocationHttpInterface> d;

    /* renamed from: nfn$i */
    static final class i extends akcs implements akbk<zfw> {
        private /* synthetic */ nfn a;

        i(nfn nfn) {
            this.a = nfn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(nbz.a.callsite("LocationNetworkRequestMakerImpl"));
        }
    }

    /* renamed from: nfn$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            LocationHttpInterface locationHttpInterface = (LocationHttpInterface) obj;
            akcr.b(locationHttpInterface, "it");
            return locationHttpInterface.clearLocation(new alge());
        }
    }

    /* renamed from: nfn$c */
    static final class c<T> implements ajfb<akxa<Object>> {
        private /* synthetic */ a a;

        c(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a();
        }
    }

    /* renamed from: nfn$d */
    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ a a;

        d(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a();
        }
    }

    /* renamed from: nfn$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ HashMap a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ algo d;

        f(HashMap hashMap, String str, String str2, algo algo) {
            this.a = hashMap;
            this.b = str;
            this.c = str2;
            this.d = algo;
        }

        public final /* synthetic */ Object apply(Object obj) {
            LocationHttpInterface locationHttpInterface = (LocationHttpInterface) obj;
            akcr.b(locationHttpInterface, "it");
            return locationHttpInterface.batchLocation(this.a, akcr.a(this.b, this.c), this.d);
        }
    }

    /* renamed from: nfn$g */
    static final class g<T> implements ajfb<akxa<algp>> {
        private /* synthetic */ abkc.a a;

        g(abkc.a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            akxa akxa = (akxa) obj;
            akws a = akxa.a();
            boolean z2 = false;
            if (a != null) {
                boolean z3 = a.b() > TakeSnapButton.LONG_PRESS_TIME;
                if (a.b() >= 400) {
                    z2 = true;
                }
                z = z2;
                z2 = z3;
            } else {
                z = false;
            }
            algp algp = null;
            Exception exception = akxa.b() != null ? new Exception(akxa.b()) : null;
            abkc.a aVar = this.a;
            akws a2 = akxa.a();
            if (a2 != null) {
                algp = (algp) a2.f();
            }
            aVar.a(z2, z, exception, algp);
        }
    }

    /* renamed from: nfn$h */
    static final class h<T> implements ajfb<Throwable> {
        private /* synthetic */ abkc.a a;

        h(abkc.a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(true, true, new Exception((Throwable) obj), null);
        }
    }

    /* renamed from: nfn$a */
    static final class a extends akcq implements akbk<LocationHttpInterface> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (LocationHttpInterface) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: nfn$e */
    static final class e extends akcq implements akbk<LocationHttpInterface> {
        e(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (LocationHttpInterface) ((ajwy) this.receiver).get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(nfn.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public nfn(zgb zgb, ajwy<LocationHttpInterface> ajwy) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "httpInterface");
        this.c = zgb;
        this.d = ajwy;
    }

    private final zfw b() {
        return (zfw) this.a.b();
    }

    public final void a() {
        this.b.a();
    }

    public final void a(algo algo, abkc.a aVar, String str, String str2, HashMap<String, String> hashMap) {
        akcr.b(algo, "req");
        akcr.b(aVar, "handler");
        akcr.b(str2, "endpoint");
        this.b.a(ajdx.c((Callable) new nfo(new e(this.d))).a((ajfc) new f(hashMap, str, str2, algo)).b((ajdw) b().g()).c((ajfb) new g(aVar)).d((ajfb) new h(aVar)).c());
    }

    public final void a(a<Object> aVar) {
        akcr.b(aVar, "callback");
        this.b.a(ajdx.c((Callable) new nfo(new a(this.d))).a((ajfc) b.a).b((ajdw) b().g()).c((ajfb) new c(aVar)).d((ajfb) new d(aVar)).c());
    }
}
