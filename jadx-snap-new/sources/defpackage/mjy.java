package defpackage;

import defpackage.mjo.c.c;
import defpackage.mpe.b;
import defpackage.mpg.a;

/* renamed from: mjy */
public final class mjy implements aiqc<mpf> {
    private final ajwy<mok<? super moc>> a;
    private final ajwy<mpc> b;
    private final ajwy<miw> c;
    private final ajwy<mpd> d;
    private final ajwy<mob> e;
    private final ajwy<mxa> f;
    private final ajwy<zfw> g;

    public static mpf a(mok<? super moc> mok, mpc mpc, miw miw, mpd mpd, mob mob, mxa mxa, zfw zfw) {
        String str = "resourceUriResolver";
        akcr.b(mok, str);
        String str2 = "cacheResolver";
        akcr.b(mpc, str2);
        akcr.b(miw, "configurationRepository");
        akcr.b(mpd, "trackingDataChecksumValidator");
        akcr.b(mob, "resourceChecksumProvider");
        akcr.b(mxa, "remoteServiceFactory");
        String str3 = "qualifiedSchedulers";
        akcr.b(zfw, str3);
        akbk cVar = new c(mpc, mxa, mpd, zfw);
        akcr.b(cVar, "receiver$0");
        mpf aVar = new a(ajxh.a(cVar));
        akcr.b(mok, str);
        akcr.b(mob, "checksumProvider");
        mpf moi = new moi(mok, mob);
        akcr.b(moi, "repository");
        akcr.b(mpc, str2);
        akcr.b(zfw, str3);
        return (mpf) aiqf.a(new mlz(mkx.e, miw, mpe.a(new b(moi, mpc, zfw), aVar), zfw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mjy.a((mok) this.a.get(), (mpc) this.b.get(), (miw) this.c.get(), (mpd) this.d.get(), (mob) this.e.get(), (mxa) this.f.get(), (zfw) this.g.get());
    }
}
