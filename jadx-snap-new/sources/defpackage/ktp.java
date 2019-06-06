package defpackage;

import defpackage.ksw.v;
import defpackage.ksw.w;

/* renamed from: ktp */
public final class ktp implements aiqc<ajdp<achi<zjm, zjk>>> {
    private final ajwy<achb<zjm, zjk>> a;
    private final ajwy<zgb> b;

    public static ajdp<achi<zjm, zjk>> a(ajwy<achb<zjm, zjk>> ajwy, zgb zgb) {
        akcr.b(ajwy, "navigationHostProvider");
        akcr.b(zgb, "schedulersProvider");
        zfw a = zgb.a(kus.b, "NavigationEventObservable");
        Object c = ajdp.a((ajdr) new lkh(new v(ajwy), new w(ajwy))).b((ajdw) a.l()).c((ajdw) a.l());
        akcr.a(c, "Observable.create(Naviga…dSchedulers.mainThread())");
        return (ajdp) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ktp.a(this.a, (zgb) this.b.get());
    }
}
