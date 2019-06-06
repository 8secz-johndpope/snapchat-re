package defpackage;

import android.content.Context;
import defpackage.acmx.a;

/* renamed from: acmw */
public final class acmw {
    private final Context a;
    private final zgb b;
    private final aczt c;
    private final aczu d;
    private final a e;
    private final acmf f;
    private final abss g;
    private final ncn h;
    private final ncq i;

    public acmw(Context context, zgb zgb, aczt aczt, aczu aczu, a aVar, acmf acmf, abss abss, ncn ncn, ncq ncq) {
        akcr.b(context, "context");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aczt, "mapDownloadableContentDownloader");
        akcr.b(aczu, "client");
        akcr.b(aVar, "requestMakerFactory");
        akcr.b(acmf, "factory");
        akcr.b(abss, "releaseManager");
        akcr.b(ncn, "nycSharingManager");
        akcr.b(ncq, "shareUsagePermissionProvider");
        this.a = context;
        this.b = zgb;
        this.c = aczt;
        this.d = aczu;
        this.e = aVar;
        this.f = acmf;
        this.g = abss;
        this.h = ncn;
        this.i = ncq;
    }
}
