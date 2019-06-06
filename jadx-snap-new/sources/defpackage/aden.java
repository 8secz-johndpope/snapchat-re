package defpackage;

import android.content.Context;
import com.brightcove.player.media.MediaService;
import defpackage.aclg.c;
import defpackage.acpa.a;

/* renamed from: aden */
public final class aden {
    private final ajxe A = ajxh.a(new a(this));
    final Context a;
    final ihh b;
    final ide c;
    final zgb d;
    final adcl e;
    final adbe f;
    final adbr g;
    final ajei h;
    final njw i;
    final acru j;
    final c k;
    final adbv l;
    final acxj m;
    final actz n;
    final acyj o;
    final adce p;
    final aclj q;
    final aclo r;
    final acuj s;
    final acyc t;
    final acli u;
    final addk v;
    final acqi w;
    final acmh x;
    final acxs y;
    final a z;

    /* renamed from: aden$a */
    static final class a extends akcs implements akbk<aclg> {
        private /* synthetic */ aden a;

        a(aden aden) {
            this.a = aden;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new aclg(this.a.a, this.a.b, this.a.c, this.a.d, this.a.e, this.a.f, this.a.g, this.a.h, this.a.i, this.a.j, this.a.l, this.a.m, this.a.n, this.a.o, this.a.p, this.a.s, this.a.q, this.a.r, this.a.t, this.a.u, this.a.v, this.a.w, this.a.x, this.a.y, this.a.k, this.a.z);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(aden.class), "snapMap", "getSnapMap()Lcom/snapchat/map/SnapMap;");
    }

    public aden(Context context, ihh ihh, ide ide, zgb zgb, adcl adcl, adbe adbe, adbr adbr, ajei ajei, njw njw, acru acru, c cVar, adbv adbv, acxj acxj, actz actz, acyj acyj, adce adce, aclj aclj, aclo aclo, acuj acuj, acyc acyc, acli acli, addk addk, acqi acqi, acmh acmh, acxs acxs, a aVar) {
        Context context2 = context;
        ihh ihh2 = ihh;
        ide ide2 = ide;
        zgb zgb2 = zgb;
        adcl adcl2 = adcl;
        adbe adbe2 = adbe;
        adbr adbr2 = adbr;
        ajei ajei2 = ajei;
        njw njw2 = njw;
        acru acru2 = acru;
        adbv adbv2 = adbv;
        acxj acxj2 = acxj;
        actz actz2 = actz;
        acyj acyj2 = acyj;
        adce adce2 = adce;
        aclj aclj2 = aclj;
        akcr.b(context2, "appContext");
        akcr.b(ihh2, "clock");
        akcr.b(ide2, "feature");
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(adcl2, "client");
        akcr.b(adbe2, "bitmojiProvider");
        akcr.b(adbr2, "mapStatusBitmapProvider");
        akcr.b(ajei2, "compositeDisposable");
        akcr.b(njw2, "friendDataProvider");
        akcr.b(acru2, "mapPlaybackAborter");
        akcr.b(adbv2, "mapViewHost");
        akcr.b(acxj2, "mediaManager");
        akcr.b(actz2, "glThread");
        akcr.b(acyj2, "memoryPool");
        akcr.b(adce2, "queuedHandlerThread");
        akcr.b(aclj, "snapMapStore");
        akcr.b(aclo, "viewStateManager");
        akcr.b(acuj, "tracker");
        akcr.b(acyc, "thumbnailRenderRatio");
        akcr.b(acli, MediaService.OPTIONS);
        akcr.b(addk, "eggHunt");
        akcr.b(acqi, "eggHuntRenderState");
        akcr.b(acmh, "localeChecker");
        akcr.b(aVar, "trackingStateListener");
        aclj aclj3 = aclj;
        this.a = context2;
        this.b = ihh2;
        this.c = ide2;
        this.d = zgb2;
        this.e = adcl2;
        this.f = adbe2;
        this.g = adbr2;
        this.h = ajei2;
        this.i = njw2;
        this.j = acru2;
        this.k = cVar;
        this.l = adbv2;
        this.m = acxj2;
        this.n = actz2;
        this.o = acyj2;
        this.p = adce;
        this.q = aclj3;
        acuj acuj2 = acuj;
        this.r = aclo;
        this.s = acuj2;
        acli acli2 = acli;
        this.t = acyc;
        this.u = acli2;
        acqi acqi2 = acqi;
        this.v = addk;
        this.w = acqi2;
        a aVar2 = aVar;
        this.x = acmh;
        this.y = acxs;
        this.z = aVar2;
    }

    public final aclg a() {
        return (aclg) this.A.b();
    }
}
