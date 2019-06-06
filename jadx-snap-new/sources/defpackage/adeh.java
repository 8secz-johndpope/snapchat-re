package defpackage;

import android.app.Activity;
import android.content.Context;
import defpackage.aclg.c;
import defpackage.acyc.a;

/* renamed from: adeh */
public final class adeh {

    /* renamed from: adeh$a */
    public interface a {

        /* renamed from: adeh$a$a */
        public interface a {
            a a(c cVar);

            a a(acli acli);

            a a(acru acru);

            a a(Activity activity);

            a a(ide ide);

            a a(idl idl);

            a a();
        }

        aden d();
    }

    /* renamed from: adeh$b */
    public static final class b {
        public static acli a(acli acli) {
            return acli == null ? new acli() : acli;
        }

        public static acmh a(adbb adbb) {
            akcr.b(adbb, "localChecker");
            return adbb;
        }

        public static acxs a(acli acli, ajwy<acxo> ajwy, ajwy<acxt> ajwy2) {
            akcr.b(acli, "snapMapOptions");
            akcr.b(ajwy, "tileFetcherProvider");
            akcr.b(ajwy2, "tileMetadataFetcherProvider");
            return acli.d ? new acxs((acxo) ajwy.get(), (acxt) ajwy2.get()) : null;
        }

        public static acyc a(acli acli, acxs acxs) {
            akcr.b(acli, "snapMapOptions");
            a aVar = acli.f;
            if (aVar == null) {
                aVar = acxs;
            }
            if (aVar == null) {
                akcr.a();
            }
            return new acyc(aVar);
        }

        public static adbv a(Context context, acmf acmf, ide ide, zgb zgb, aczt aczt, adcl adcl, acmx.a aVar, ncn ncn, acli acli, abss abss, ncq ncq) {
            adcl adcl2 = adcl;
            acli acli2 = acli;
            Context context2 = context;
            akcr.b(context, "context");
            acmf acmf2 = acmf;
            akcr.b(acmf2, "delegateFactory");
            ide ide2 = ide;
            akcr.b(ide2, "attributedFeature");
            akcr.b(zgb, "schedulersProvider");
            aczt aczt2 = aczt;
            akcr.b(aczt2, "contentDownloader");
            akcr.b(adcl2, "client");
            acmx.a aVar2 = aVar;
            akcr.b(aVar2, "requestMakerFactory");
            ncn ncn2 = ncn;
            akcr.b(ncn2, "nycSharingManager");
            akcr.b(acli2, "snapMapOptions");
            abss abss2 = abss;
            akcr.b(abss2, "releaseManager");
            ncq ncq2 = ncq;
            akcr.b(ncq2, "shareUsagePermissionProvider");
            return new adbv(context2, acmf2, ide2, aczt2, adcl2, aVar2, ncn2, acmm.DEFAULT, acli2.a, abss2, ncq2);
        }
    }
}
