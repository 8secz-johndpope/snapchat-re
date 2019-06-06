package defpackage;

import android.location.Location;
import com.brightcove.player.event.EventType;
import com.google.common.base.Optional;
import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.record.TalkAuthContextModel;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import com.snap.unlockables.lib.network.api.GtqHttpInterface;
import defpackage.zpq.b;
import defpackage.zpq.b.a;
import defpackage.zrj.c;
import defpackage.zru.d;
import defpackage.zru.e;
import defpackage.zru.f;
import defpackage.zru.j;
import defpackage.zru.k;
import defpackage.zru.l;
import defpackage.zru.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: zrx */
public final class zrx implements b {
    final ajxe a;
    final ajxe b;
    final ajxe c;
    final ftl d;
    final ajdx<a> e;
    private final ajxe f;
    private final ajxe g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j;
    private final ajxe k;
    private final zru l;

    /* renamed from: zrx$q */
    static final class q extends akcq implements akbl<alrt, ajdx<alrt>> {
        q(zrx zrx) {
            super(1, zrx);
        }

        public final String getName() {
            return "appendGtqAuthPayload";
        }

        public final akej getOwner() {
            return akde.a(zrx.class);
        }

        public final String getSignature() {
            return "appendGtqAuthPayload(Lsnapchat/unlockables/request/schema/nano/GtqServeRequest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            alrt alrt = (alrt) obj;
            akcr.b(alrt, "p1");
            obj = ((zrx) this.receiver).e.a((ajfc) new zry(d.a)).f(new e(alrt));
            akcr.a(obj, "authProviderSingle\n     …          }\n            }");
            return obj;
        }
    }

    /* renamed from: zrx$y */
    static final class y extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        y(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(zpy.a.callsite("UnlockablesNetClient"));
        }
    }

    /* renamed from: zrx$v */
    static final class v extends akcs implements akbk<GtqHttpInterface> {
        private /* synthetic */ ajwy a;

        v(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((zsb) this.a.get()).a();
        }
    }

    /* renamed from: zrx$w */
    static final class w extends akcs implements akbk<zsc> {
        private /* synthetic */ ajwy a;

        w(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zsc) this.a.get();
        }
    }

    /* renamed from: zrx$a */
    static final class a extends akcs implements akbk<cih> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cih) this.a.get();
        }
    }

    /* renamed from: zrx$f */
    static final class f extends akcs implements akbk<zre> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zre) this.a.get();
        }
    }

    /* renamed from: zrx$x */
    static final class x extends akcs implements akbk<zsq> {
        private /* synthetic */ ajwy a;

        x(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zsq) this.a.get();
        }
    }

    /* renamed from: zrx$z */
    static final class z extends akcs implements akbk<ihm> {
        private /* synthetic */ ajwy a;

        z(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihm) this.a.get();
        }
    }

    /* renamed from: zrx$ab */
    static final class ab extends akcs implements akbk<zpm> {
        private /* synthetic */ ajwy a;

        ab(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zpm) this.a.get();
        }
    }

    /* renamed from: zrx$aa */
    static final class aa extends akcs implements akbk<zsg> {
        private /* synthetic */ ajwy a;

        aa(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zsg) this.a.get();
        }
    }

    /* renamed from: zrx$p */
    static final class p<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ zrx a;
        private /* synthetic */ Location b;

        p(zrx zrx, Location location) {
            this.a = zrx;
            this.b = location;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (alrt) obj;
            akcr.b(obj, "it");
            Location location = this.b;
            if (location != null) {
                alrr alrr = new alrr();
                alrs alrs = new alrs();
                alrs.a(location.getLatitude());
                alrs.b(location.getLongitude());
                alrr.a = alrs;
                alrr.a((double) location.getAccuracy());
                obj.a = alrr;
            }
            obj = ajdx.b(obj);
            akcr.a(obj, "Single.just(\n           …}\n                }?:req)");
            return obj;
        }
    }

    /* renamed from: zrx$s */
    static final class s<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ zrx a;
        private /* synthetic */ Map b;

        s(zrx zrx, Map map) {
            this.a = zrx;
            this.b = map;
        }

        public final /* synthetic */ Object apply(Object obj) {
            alrt alrt = (alrt) obj;
            akcr.b(alrt, "it");
            obj = this.a.d.b((fth) zpt.UNLOCKABLES_SUPPLY_GTQ_CHECKSUM_REQUEST).f(new c(this.b, alrt));
            akcr.a(obj, "configProvider.getBoolea…      }\n                }");
            return obj;
        }
    }

    /* renamed from: zrx$t */
    static final class t<T> implements ajfb<alrt> {
        private /* synthetic */ zrx a;
        private /* synthetic */ List b;
        private /* synthetic */ Map c;

        t(zrx zrx, List list, Map map) {
            this.a = zrx;
            this.b = list;
            this.c = map;
        }

        public final /* synthetic */ void accept(Object obj) {
            alrt alrt = (alrt) obj;
            List list = this.b;
            obj = alrt.d.b;
            akcr.a(obj, "request.syncInfo.purposeTypes");
            Collection arrayList = new ArrayList(obj.length);
            int i = 0;
            for (int i2 : obj) {
                Object obj2 = i2 != 0 ? i2 != 1 ? zsf.UNKNOWN : zsf.LOW : zsf.HIGH;
                arrayList.add(obj2);
            }
            list.addAll((List) arrayList);
            zsg a = ((zsg) this.a.k.b());
            Map map = this.c;
            if (map != null) {
                i = map.size();
            }
            a.a().b((ily) ipg.CHECKSUM_LIST_SIZE_REQUEST, (long) i);
        }
    }

    /* renamed from: zrx$u */
    static final class u<T> implements ajfb<Throwable> {
        public static final u a = new u();

        u() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zrx$g */
    static final class g implements ajev {
        private /* synthetic */ zrx a;

        g(zrx zrx) {
            this.a = zrx;
        }

        public final void run() {
            ((ihm) this.a.i.b()).a();
        }
    }

    /* renamed from: zrx$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ zrx a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ Map d;

        h(zrx zrx, String str, String str2, Map map) {
            this.a = zrx;
            this.b = str;
            this.c = str2;
            this.d = map;
        }

        public final /* synthetic */ Object apply(Object obj) {
            alrt alrt = (alrt) obj;
            akcr.b(alrt, "it");
            ((zpm) this.a.j.b()).a(this.b, alrt);
            GtqHttpInterface gtqHttpInterface = (GtqHttpInterface) this.a.a.b();
            String str = this.b;
            Object obj2 = this.c;
            akcr.a(obj2, TalkAuthContextModel.SCOPEID);
            return gtqHttpInterface.fetchUnlockables(str, obj2, this.d, alrt);
        }
    }

    /* renamed from: zrx$i */
    static final class i<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ zrx a;
        private /* synthetic */ String b;

        i(zrx zrx, String str) {
            this.a = zrx;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akws akws = (akws) obj;
            akcr.b(akws, "it");
            return akws.e() ? ajdx.b((Object) new zsj(this.b, akws.b(), akws.c(), null, ((ihm) this.a.i.b()).c(), (aebf) akws.f())) : ajdx.b((Throwable) new akwn(akws));
        }
    }

    /* renamed from: zrx$j */
    static final class j<T> implements ajfb<zsj> {
        private /* synthetic */ zrx a;
        private /* synthetic */ List b;

        j(zrx zrx, List list) {
            this.a = zrx;
            this.b = list;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (zsj) obj;
            ((zsg) this.a.k.b()).a(zrt.GTQ_FETCH, obj.b);
            zsg a = ((zsg) this.a.k.b());
            List list = this.b;
            aebf aebf = obj.e;
            if (aebf == null) {
                akcr.a();
            }
            Object obj2 = aebf.a.g;
            akcr.a(obj2, "response.gtqServeResponse!!.unlockables.purposes");
            Collection arrayList = new ArrayList(obj2.length);
            for (adzy adzy : obj2) {
                Object obj3 = adzy.a;
                akcr.a(obj3, "it.purposeType");
                akcr.b(obj3, "responsePurpose");
                int hashCode = obj3.hashCode();
                if (hashCode != -1720379677) {
                    if (hashCode == 263357011 && obj3.equals("UNLOCKABLE_LOW_SENSITIVITY")) {
                        obj3 = zsf.LOW;
                        arrayList.add(obj3);
                    }
                } else if (obj3.equals("UNLOCKABLE_HIGH_SENSITIVITY")) {
                    obj3 = zsf.HIGH;
                    arrayList.add(obj3);
                }
                obj3 = zsf.UNKNOWN;
                arrayList.add(obj3);
            }
            List list2 = (List) arrayList;
            akcr.b(list, "requestSyncSensitivityList");
            akcr.b(list2, "responseSyncSensitivityList");
            String str = "_";
            a.a().c(ipg.GTQ_SERVE_SENSITIVITY.a("req_purpose", ajyu.a((Iterable) ajyu.i((Iterable) list), (CharSequence) str, null, null, 0, null, null, 62)).a("resp_purpose", ajyu.a((Iterable) ajyu.i((Iterable) list2), (CharSequence) str, null, null, 0, null, null, 62)), 1);
            a = ((zsg) this.a.k.b());
            aebf aebf2 = obj.e;
            if (aebf2 == null) {
                akcr.a();
            }
            a.a().b((ily) ipg.CHECKSUM_LIST_SIZE_RESPONSE, (long) aebf2.a.k.length);
            a = ((zsg) this.a.k.b());
            aebf2 = obj.e;
            if (aebf2 == null) {
                akcr.a();
            }
            aebg aebg = aebf2.a;
            a.a().b((ily) ipg.FULL_GEOFILTER_SIZE_RESPONSE, (long) ((((((aebg.a.length + aebg.c.length) + aebg.d.length) + aebg.e.length) + aebg.f.length) + aebg.j.length) + aebg.i.length));
            zpm c = ((zpm) this.a.j.b());
            akcr.a(obj, EventType.RESPONSE);
            c.a(obj);
        }
    }

    /* renamed from: zrx$k */
    static final class k<T> implements ajfb<Throwable> {
        private /* synthetic */ zrx a;
        private /* synthetic */ akdd.a b;
        private /* synthetic */ String c;

        k(zrx zrx, akdd.a aVar, String str) {
            this.a = zrx;
            this.b = aVar;
            this.c = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.b.a = false;
            zsg a = ((zsg) this.a.k.b());
            zrt zrt = zrt.GTQ_FETCH;
            akcr.a((Object) th, "it");
            a.a(zrt, th);
            ((zpm) this.a.j.b()).a(new zsj(this.c, -1, null, th, ((ihm) this.a.i.b()).c(), null));
        }
    }

    /* renamed from: zrx$l */
    static final class l implements ajev {
        private /* synthetic */ zrx a;
        private /* synthetic */ akdd.a b;
        private /* synthetic */ idd c;

        l(zrx zrx, akdd.a aVar, idd idd) {
            this.a = zrx;
            this.b = aVar;
            this.c = idd;
        }

        public final void run() {
            ((ihm) this.a.i.b()).b();
            ((zsg) this.a.k.b()).a(this.b.a, zrt.GTQ_FETCH, ((ihm) this.a.i.b()).c());
            ((zsg) this.a.k.b()).a(zrt.GTQ_FETCH, this.c);
        }
    }

    /* renamed from: zrx$m */
    static final class m<T, R> implements ajfc<T, R> {
        private /* synthetic */ zrx a;

        m(zrx zrx) {
            this.a = zrx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            zsj zsj = (zsj) obj;
            akcr.b(zsj, EventType.RESPONSE);
            aebf aebf = zsj.e;
            if (aebf == null) {
                akcr.a();
            }
            for (adzy adzy : aebf.a.g) {
                if (aerj.a.a(adzy.a) == aerj.a.UNLOCKABLE_LOW_SENSITIVITY) {
                    zre zre = (zre) this.a.c.b();
                    zre.a().b().a((fth) zpt.LAST_LOW_SENSITIVITY_RESPONSE_TIME_MILLIS, Long.valueOf(zre.b().a())).b();
                    break;
                }
            }
            return aebf;
        }
    }

    /* renamed from: zrx$n */
    static final class n<T, R> implements ajfc<T, R> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            aebf aebf = (aebf) obj;
            akcr.b(aebf, "it");
            return Optional.of(aebf);
        }
    }

    /* renamed from: zrx$o */
    static final class o<T, R> implements ajfc<T, ajdn<? extends R>> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return optional.isPresent() ? ajdj.b(optional.get()) : ajvo.a(ajlu.a);
        }
    }

    /* renamed from: zrx$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ alrt a;

        e(alrt alrt) {
            this.a = alrt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            byte[] bArr = (byte[]) obj;
            akcr.b(bArr, "it");
            alrt alrt = this.a;
            alrt.a(bArr);
            return alrt;
        }
    }

    /* renamed from: zrx$r */
    static final class r extends akcq implements akbl<alrt, ajdx<alrt>> {
        r(zrx zrx) {
            super(1, zrx);
        }

        public final String getName() {
            return "appendAdsPayload";
        }

        public final akej getOwner() {
            return akde.a(zrx.class);
        }

        public final String getSignature() {
            return "appendAdsPayload(Lsnapchat/unlockables/request/schema/nano/GtqServeRequest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            alrt alrt = (alrt) obj;
            akcr.b(alrt, "p1");
            zrx zrx = (zrx) this.receiver;
            zrx.a();
            obj = ((cih) zrx.b.b()).a(ajyl.a(new cjg(cje.E2E_TEST, "", -1, false, zrx.d.j(cip.DEBUG_AD_ID), 0, false, null, null, (int) MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL)), null).f(new b(alrt));
            akcr.a(obj, "adRequestFactoryApi\n    …) }\n                    }");
            return obj;
        }
    }

    /* renamed from: zrx$d */
    static final class d extends akcq implements akbl<a, ajdx<byte[]>> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final String getName() {
            return "fetch";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "fetch()Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "p1");
            return aVar.a();
        }
    }

    /* renamed from: zrx$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ alrt a;

        b(alrt alrt) {
            this.a = alrt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akzp akzp = (akzp) obj;
            akcr.b(akzp, "it");
            alrt alrt = this.a;
            alrt.b = akzp;
            return alrt;
        }
    }

    /* renamed from: zrx$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ Map a;
        private /* synthetic */ alrt b;

        c(Map map, alrt alrt) {
            this.a = map;
            this.b = alrt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "shouldSupplyGtqChecksum");
            if (bool.booleanValue()) {
                Map map = this.a;
                if (map != null) {
                    alrt alrt = this.b;
                    alrt.f = map;
                    if (alrt != null) {
                        return alrt;
                    }
                }
            }
            return this.b;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zrx.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(zrx.class), "gtqRequestHttpInterface", "getGtqRequestHttpInterface()Lcom/snap/unlockables/lib/network/api/GtqHttpInterface;"), new akdc(akde.a(zrx.class), "gtqServeRequestFactory", "getGtqServeRequestFactory()Lcom/snap/unlockables/lib/network/factory/GtqServeRequestFactory;"), new akdc(akde.a(zrx.class), "adRequestFactoryApi", "getAdRequestFactoryApi()Lcom/snap/adinfo/api/AdRequestFactoryApi;"), new akdc(akde.a(zrx.class), "configUpdater", "getConfigUpdater()Lcom/snap/unlockables/lib/config/UnlockablesConfigUpdater;"), new akdc(akde.a(zrx.class), "networkConfiguration", "getNetworkConfiguration()Lcom/snap/unlockables/model/UnlockablesNetworkConfiguration;"), new akdc(akde.a(zrx.class), "stopwatch", "getStopwatch()Lcom/snap/framework/time/Stopwatch;"), new akdc(akde.a(zrx.class), "unlockablesLoggerApi", "getUnlockablesLoggerApi()Lcom/snap/unlockables/api/GTQServeNetworkingLoggerApi;"), new akdc(akde.a(zrx.class), "unlockablesGrapheneLogger", "getUnlockablesGrapheneLogger()Lcom/snap/unlockables/lib/network/util/UnlockablesGrapheneLogger;")};
    }

    public zrx(zgb zgb, ajwy<zsb> ajwy, ajwy<zsc> ajwy2, ajwy<cih> ajwy3, ajwy<zre> ajwy4, ajwy<zsq> ajwy5, ajwy<ihm> ajwy6, ajwy<zpm> ajwy7, ajwy<zsg> ajwy8, ftl ftl, ajdx<a> ajdx, zru zru) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "gtqHttpInterfaceFactoryProvider");
        akcr.b(ajwy2, "gtqServeRequestFactoryProvider");
        akcr.b(ajwy3, "adRequestFactoryApiProvider");
        akcr.b(ajwy4, "unlockablesConfigUpdaterProvider");
        akcr.b(ajwy5, "networkConfigurationProvider");
        akcr.b(ajwy6, "stopwatchProvider");
        akcr.b(ajwy7, "gtqServeNetworkingLoggerApiProvider");
        akcr.b(ajwy8, "unlockablesGrapheneLoggerProvider");
        akcr.b(ftl, "configProvider");
        akcr.b(ajdx, "authProviderSingle");
        akcr.b(zru, "unlocker");
        this.d = ftl;
        this.e = ajdx;
        this.l = zru;
        this.f = ajxh.a(new y(zgb));
        this.a = ajxh.a(new v(ajwy));
        this.g = ajxh.a(new w(ajwy2));
        this.b = ajxh.a(new a(ajwy3));
        this.c = ajxh.a(new f(ajwy4));
        this.h = ajxh.a(new x(ajwy5));
        this.i = ajxh.a(new z(ajwy6));
        this.j = ajxh.a(new ab(ajwy7));
        this.k = ajxh.a(new aa(ajwy8));
    }

    private final zfw b() {
        return (zfw) this.f.b();
    }

    public final ajdj<aebf> a(Location location, idd idd, Map<Long, byte[]> map) {
        Object d;
        String str;
        akcr.b(idd, "callsite");
        if (this.d.a((fth) zpt.UNLOCKABLES_NETWORK_REQUEST_ENABLED)) {
            List arrayList = new ArrayList();
            zsc zsc = (zsc) this.g.b();
            Object a = a();
            String str2 = "networkConfiguration";
            akcr.a(a, str2);
            akcr.b(a, str2);
            Object f = ((ajdx) zsc.b.b()).f(new zsc.b(zsc, a));
            akcr.a(f, "screenParameters.map { s…}\n            }\n        }");
            ajdx a2 = f.a((ajfc) new p(this, location));
            zrx zrx = this;
            d = a2.a((ajfc) new zry(new q(zrx))).a((ajfc) new zry(new r(zrx))).a((ajfc) new s(this, map)).c((ajfb) new t(this, arrayList, map)).d((ajfb) u.a);
            akcr.a(d, "gtqServeRequestFactory.c…sage}\")\n                }");
            String j = this.d.j(zpt.GTQ_SERVER_CUSTOM_HOST_URL);
            CharSequence charSequence = j;
            f = (charSequence == null || charSequence.length() == 0) ? 1 : null;
            if (f != null) {
                j = ((zpx) this.d.l(zpt.GTQ_SERVER_ENDPOINT)).hostUrl;
            }
            String j2 = this.d.j(zpt.GTQ_SERVE_PATH);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(j);
            stringBuilder.append(j2);
            j = stringBuilder.toString();
            akdd.a aVar = new akdd.a();
            aVar.a = true;
            String a3 = wjd.GTQ_UNLOCKABLES.a();
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("__xsc_local__gzip", "request");
            d = d.b((ajdw) b().g()).b((ajev) new g(this)).a((ajfc) new h(this, j, a3, linkedHashMap));
            akcr.a(d, "gtqRequest.subscribeOn(s…ap, it)\n                }");
            d = igq.a(d, new igo(igq.a, this.d.f(zpt.GTQ_SERVE_RETRY_COUNT), 1, 5, b().b())).a((ajfc) new i(this, j)).c((ajfb) new j(this, arrayList)).d((ajfb) new k(this, aVar, j)).b((ajev) new l(this, aVar, idd)).f(new m(this)).a();
            akcr.a(d, "gtqRequest.subscribeOn(s…\n                .cache()");
            d = d.h(zrj.b.a).d((ajfb) new c("UnlockablesNetClient"));
            akcr.a(d, "onErrorResumeNext {\n    …{it.localizedMessage}\")\n}");
            d = d.f(n.a).c(Optional.absent()).b((ajfc) o.a);
            str = "gtqRequest.subscribeOn(s…t()) else Maybe.empty() }";
        } else {
            d = ajvo.a(ajlu.a);
            str = "Maybe.empty()";
        }
        akcr.a(d, str);
        return d;
    }

    public final ajdj<zsk.a> a(PersistableUnlockableType persistableUnlockableType, idd idd) {
        Object a;
        String str;
        String str2 = "type";
        akcr.b(persistableUnlockableType, str2);
        String str3 = "callsite";
        akcr.b(idd, str3);
        zru zru = this.l;
        akcr.b(persistableUnlockableType, str2);
        akcr.b(idd, str3);
        if (zru.c.a((fth) zpt.UNLOCKABLES_NETWORK_REQUEST_ENABLED)) {
            a = ((ajdx) zru.a.b()).a((ajdw) zru.a().g()).a((ajfc) new zru.b(zru, persistableUnlockableType)).a((ajdw) zru.a().b()).f(zru.c.a).f(new d(zru)).d((ajfb) new e(persistableUnlockableType)).b((ajev) new f(zru, idd)).h().a((ajdn) ajvo.a(ajlu.a));
            str = "screenParams\n           …ResumeNext(Maybe.empty())";
        } else {
            a = ajvo.a(ajlu.a);
            str = "Maybe.empty()";
        }
        akcr.a(a, str);
        return a;
    }

    public final ajdj<zsk.b> a(zst.b bVar, idd idd) {
        Object a;
        String str;
        String str2 = "unlockRequest";
        akcr.b(bVar, str2);
        String str3 = "callsite";
        akcr.b(idd, str3);
        zru zru = this.l;
        akcr.b(bVar, str2);
        akcr.b(idd, str3);
        if (zru.c.a((fth) zpt.UNLOCKABLES_NETWORK_REQUEST_ENABLED)) {
            a = ajdx.b((Object) bVar).a((ajdw) zru.a().g()).a((ajfc) new j(zru, bVar)).d((ajfb) new k(bVar)).c((ajfb) new l(bVar)).b((ajev) new m(zru, idd)).h().a((ajdn) ajvo.a(ajlu.a));
            str = "Single\n                .…ResumeNext(Maybe.empty())";
        } else {
            a = ajvo.a(ajlu.a);
            str = "Maybe.empty()";
        }
        akcr.a(a, str);
        return a;
    }

    /* Access modifiers changed, original: final */
    public final zsq a() {
        return (zsq) this.h.b();
    }
}
