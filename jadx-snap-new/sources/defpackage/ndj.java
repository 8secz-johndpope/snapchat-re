package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ndj */
public final class ndj {
    final ajdw a;
    final aipn<ncc> b;
    final aipn<ndz> c;
    final aipn<ndm> d;

    /* renamed from: ndj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ndj$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ndj a;

        b(ndj ndj) {
            this.a = ndj;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Long) obj, "it");
            ndj ndj = this.a;
            Object obj2 = ndj.d.get();
            akcr.a(obj2, "listenerSetupManager.get()");
            ndm ndm = (ndm) obj2;
            Object obj3 = ndj.c.get();
            akcr.a(obj3, "currentLocationProvider.get()");
            obj = ajcx.a((ajda) new ndh(ndm, (ndz) obj3)).c(15, TimeUnit.SECONDS).h().b(ndj.a);
            akcr.a(obj, "Completable.create(GpsPo…       .subscribeOn(idle)");
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            return obj.f((ajdt) a);
        }
    }

    static {
        a aVar = new a();
    }

    public ndj(aipn<ncc> aipn, aipn<ndz> aipn2, aipn<ndm> aipn3, aipn<ide> aipn4, aipn<zgb> aipn5) {
        akcr.b(aipn, "locationPermissionsProvider");
        akcr.b(aipn2, "currentLocationProvider");
        akcr.b(aipn3, "listenerSetupManager");
        akcr.b(aipn4, "attributedFeature");
        akcr.b(aipn5, "schedulersProvider");
        this.b = aipn;
        this.c = aipn2;
        this.d = aipn3;
        aipn5.get();
        this.a = zgb.a(((ide) aipn4.get()).callsite("GpsStateResolver")).j();
    }
}
