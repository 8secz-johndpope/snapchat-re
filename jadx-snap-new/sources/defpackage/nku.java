package defpackage;

import android.content.res.AssetFileDescriptor;
import android.util.Base64;
import com.snap.map.core.SnapMapHttpInterface;
import com.snap.map.core.SnapMapHttpInterface.DefaultImpls;
import defpackage.njs.a;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: nku */
public final class nku implements adcl {
    final Object a = new Object();
    final Map<String, ajej> b = new LinkedHashMap();
    final aipn<SnapMapHttpInterface> c;
    final aipn<ygi> d;
    final aipn<ftl> e;
    private final ajdw f;
    private ajei g = new ajei();
    private ajdx<String> h;
    private ajdx<Boolean> i;
    private final ajei j;
    private final adbk k;

    /* renamed from: nku$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: nku$ac */
    static final class ac<V> implements Callable<T> {
        private /* synthetic */ nku a;

        ac(nku nku) {
            this.a = nku;
        }

        public final /* synthetic */ Object call() {
            return ((ftl) this.a.e.get()).j(adew.PERSONAL_INSTANCE_VERSION);
        }
    }

    /* renamed from: nku$k */
    static final class k<V> implements Callable<T> {
        private /* synthetic */ nku a;

        k(nku nku) {
            this.a = nku;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(((ftl) this.a.e.get()).a((fth) adew.ERROR_MAP_REQUESTS));
        }
    }

    /* renamed from: nku$f */
    static final class f implements Runnable {
        private /* synthetic */ ajei a;

        f(ajei ajei) {
            this.a = ajei;
        }

        public final void run() {
            this.a.a();
        }
    }

    /* renamed from: nku$ai */
    static final class ai<V> implements Callable<T> {
        private /* synthetic */ alim a;

        ai(alim alim) {
            this.a = alim;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a;
        }
    }

    /* renamed from: nku$am */
    static final class am<V> implements Callable<T> {
        private /* synthetic */ alik a;

        am(alik alik) {
            this.a = alik;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a;
        }
    }

    /* renamed from: nku$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ algm a;

        b(algm algm) {
            this.a = algm;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a;
        }
    }

    /* renamed from: nku$g */
    static final class g<V> implements Callable<T> {
        private /* synthetic */ alhb a;

        g(alhb alhb) {
            this.a = alhb;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a;
        }
    }

    /* renamed from: nku$o */
    static final class o<V> implements Callable<T> {
        private /* synthetic */ aljm a;

        o(aljm aljm) {
            this.a = aljm;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a;
        }
    }

    /* renamed from: nku$v */
    static final class v<V> implements Callable<T> {
        private /* synthetic */ String a;
        private /* synthetic */ String b;

        v(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final /* synthetic */ Object call() {
            return new nkj(this.a, this.b);
        }
    }

    /* renamed from: nku$ad */
    static final class ad<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final ad a = new ad();

        ad() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "result");
            if (!(akxa.c() || akxa.a() == null)) {
                akws a = akxa.a();
                if (a == null) {
                    akcr.a();
                }
                if (a.f() != null) {
                    akws a2 = akxa.a();
                    if (a2 == null) {
                        akcr.a();
                    }
                    return ajdx.b(a2.f());
                }
            }
            return ajdx.b(akxa.b());
        }
    }

    /* renamed from: nku$ae */
    static final class ae<T, R> implements ajfc<T, R> {
        private /* synthetic */ nku a;
        private /* synthetic */ String b;

        ae(nku nku, String str) {
            this.a = nku;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akhw akhw = (akhw) obj;
            akcr.b(akhw, "it");
            ygi ygi = (ygi) this.a.d.get();
            ygk ygk = njt.THUMBNAIL;
            String str = this.b;
            obj = akhw.d();
            akcr.a(obj, "it.source()");
            return ygi.a(ygk, str, (akkv) obj);
        }
    }

    /* renamed from: nku$af */
    static final class af<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ nku a;
        private /* synthetic */ alii b;

        af(nku nku, alii alii) {
            this.a = nku;
            this.b = alii;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "flavor");
            this.b.a(str);
            return ((SnapMapHttpInterface) this.a.c.get()).rpcGetLatestTileSet(this.a.a("/rpc/getLatestTileSet"), this.b);
        }
    }

    /* renamed from: nku$aj */
    static final class aj<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ nku a;

        aj(nku nku) {
            this.a = nku;
        }

        public final /* synthetic */ Object apply(Object obj) {
            alim alim = (alim) obj;
            akcr.b(alim, "req");
            return ((SnapMapHttpInterface) this.a.c.get()).rpcGetMapTiles(this.a.a("/rpc/getMapTiles"), alim);
        }
    }

    /* renamed from: nku$an */
    static final class an<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ nku a;

        an(nku nku) {
            this.a = nku;
        }

        public final /* synthetic */ Object apply(Object obj) {
            alik alik = (alik) obj;
            akcr.b(alik, "req");
            return ((SnapMapHttpInterface) this.a.c.get()).tileMetadata(this.a.a("/rpc/getMapTilesMetadata"), alik);
        }
    }

    /* renamed from: nku$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ nku a;

        c(nku nku) {
            this.a = nku;
        }

        public final /* synthetic */ Object apply(Object obj) {
            algm algm = (algm) obj;
            akcr.b(algm, "req");
            SnapMapHttpInterface snapMapHttpInterface = (SnapMapHttpInterface) this.a.c.get();
            Object a = wjd.EXPLORE.a();
            akcr.a(a, "SnapTokenAccessTokenScop…PLORE.serverSideScopeName");
            return snapMapHttpInterface.getBatchExplorerViews(a, "https://st-lb.sc-jpl.com/rpc/addViews", algm);
        }
    }

    /* renamed from: nku$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ nku a;

        h(nku nku) {
            this.a = nku;
        }

        public final /* synthetic */ Object apply(Object obj) {
            alhb alhb = (alhb) obj;
            akcr.b(alhb, "req");
            SnapMapHttpInterface snapMapHttpInterface = (SnapMapHttpInterface) this.a.c.get();
            Object a = wjd.EXPLORE.a();
            akcr.a(a, "SnapTokenAccessTokenScop…PLORE.serverSideScopeName");
            return snapMapHttpInterface.deleteExplorerStatus(a, "https://st-lb.sc-jpl.com/rpc/deleteStatus", alhb);
        }
    }

    /* renamed from: nku$l */
    static final class l<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ nku a;
        private /* synthetic */ alig b;

        l(nku nku, alig alig) {
            this.a = nku;
            this.b = alig;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            Object obj2 = (String) ajxm.a;
            obj = (Boolean) ajxm.b;
            akcr.a(obj, "errorRequest");
            if (obj.booleanValue()) {
                obj = ajdx.b(akxa.a(new Throwable()));
                akcr.a(obj, "Single.just(Result.error…esResponse>(Throwable()))");
                return obj;
            }
            SnapMapHttpInterface snapMapHttpInterface = (SnapMapHttpInterface) this.a.c.get();
            Object a = wjd.EXPLORE.a();
            akcr.a(a, "SnapTokenAccessTokenScop…PLORE.serverSideScopeName");
            alig alig = this.b;
            akcr.a(obj2, "personalVersion");
            return snapMapHttpInterface.getExplorerStatuses(a, "https://st-lb.sc-jpl.com/rpc/getStatuses", alig, obj2);
        }
    }

    /* renamed from: nku$p */
    static final class p<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ nku a;

        p(nku nku) {
            this.a = nku;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aljm aljm = (aljm) obj;
            akcr.b(aljm, "req");
            return ((SnapMapHttpInterface) this.a.c.get()).getMapConfiguration(aljm);
        }
    }

    /* renamed from: nku$s */
    static final class s<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ nku a;
        private /* synthetic */ alio b;

        s(nku nku, alio alio) {
            this.a = nku;
            this.b = alio;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "personalVersion");
            SnapMapHttpInterface snapMapHttpInterface = (SnapMapHttpInterface) this.a.c.get();
            Object a = wjd.EXPLORE.a();
            akcr.a(a, "SnapTokenAccessTokenScop…PLORE.serverSideScopeName");
            return snapMapHttpInterface.getMyExplorerStatuses(a, "https://st-lb.sc-jpl.com/rpc/getMyStatuses", this.b, str);
        }
    }

    /* renamed from: nku$y */
    static final class y<T> implements ajfb<ajej> {
        private /* synthetic */ nku a;
        private /* synthetic */ String b;

        y(nku nku, String str) {
            this.a = nku;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (ajej) obj;
            synchronized (this.a.a) {
                Map map = this.a.b;
                String str = this.b;
                akcr.a(obj, "it");
                map.put(str, obj);
            }
        }
    }

    /* renamed from: nku$z */
    static final class z implements ajev {
        private /* synthetic */ nku a;
        private /* synthetic */ String b;

        z(nku nku, String str) {
            this.a = nku;
            this.b = str;
        }

        public final void run() {
            synchronized (this.a.a) {
                this.a.b.remove(this.b);
            }
        }
    }

    /* renamed from: nku$aa */
    static final class aa extends akcs implements akbl<byte[], ajxw> {
        private /* synthetic */ aczq a;

        aa(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.a((byte[]) obj, null);
            return ajxw.a;
        }
    }

    /* renamed from: nku$ab */
    static final class ab extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ aczq a;

        ab(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            this.a.a(null, new aczw(new Exception(th)));
            return ajxw.a;
        }
    }

    /* renamed from: nku$ag */
    static final class ag extends akcs implements akbl<alij, ajxw> {
        private /* synthetic */ aczq a;

        ag(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.a((alij) obj, null);
            return ajxw.a;
        }
    }

    /* renamed from: nku$ah */
    static final class ah extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ aczq a;

        ah(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            this.a.a(null, new aczw(new Exception(th)));
            return ajxw.a;
        }
    }

    /* renamed from: nku$ak */
    static final class ak extends akcs implements akbl<alin, ajxw> {
        private /* synthetic */ aczq a;

        ak(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.a((alin) obj, null);
            return ajxw.a;
        }
    }

    /* renamed from: nku$al */
    static final class al extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ aczq a;

        al(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            this.a.a(null, new aczw(new Exception(th)));
            return ajxw.a;
        }
    }

    /* renamed from: nku$ao */
    static final class ao extends akcs implements akbl<alil, ajxw> {
        private /* synthetic */ aczq a;

        ao(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.a((alil) obj, null);
            return ajxw.a;
        }
    }

    /* renamed from: nku$ap */
    static final class ap extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ aczq a;

        ap(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            this.a.a(null, new aczw(new Exception(th)));
            return ajxw.a;
        }
    }

    /* renamed from: nku$aq */
    static final class aq extends akcs implements akbl<alir, ajxw> {
        private /* synthetic */ aczq a;

        aq(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.a((alir) obj, null);
            return ajxw.a;
        }
    }

    /* renamed from: nku$ar */
    static final class ar extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ aczq a;

        ar(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            this.a.a(null, new aczw(new Exception(th)));
            return ajxw.a;
        }
    }

    /* renamed from: nku$d */
    static final class d extends akcs implements akbl<algn, ajxw> {
        private /* synthetic */ aczq a;

        d(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.a((algn) obj, null);
            return ajxw.a;
        }
    }

    /* renamed from: nku$e */
    static final class e extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ aczq a;

        e(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            this.a.a(null, new aczw(new Exception(th)));
            return ajxw.a;
        }
    }

    /* renamed from: nku$i */
    static final class i extends akcs implements akbl<alhc, ajxw> {
        private /* synthetic */ aczq a;

        i(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.a((alhc) obj, null);
            return ajxw.a;
        }
    }

    /* renamed from: nku$j */
    static final class j extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ aczq a;

        j(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            this.a.a(null, new aczw(new Exception(th)));
            return ajxw.a;
        }
    }

    /* renamed from: nku$m */
    static final class m extends akcs implements akbl<akxa<alih>, ajxw> {
        private /* synthetic */ aczq a;

        m(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (akxa) obj;
            akcr.a(obj, "result");
            nkv.a(obj, this.a);
            return ajxw.a;
        }
    }

    /* renamed from: nku$n */
    static final class n extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ aczq a;

        n(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            this.a.a(null, new aczw(new Exception(th)));
            return ajxw.a;
        }
    }

    /* renamed from: nku$q */
    static final class q extends akcs implements akbl<aljn, ajxw> {
        private /* synthetic */ aczq a;

        q(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.a((aljn) obj, null);
            return ajxw.a;
        }
    }

    /* renamed from: nku$r */
    static final class r extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ aczq a;

        r(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            this.a.a(null, new aczw(new Exception(th)));
            return ajxw.a;
        }
    }

    /* renamed from: nku$t */
    static final class t extends akcs implements akbl<akxa<alip>, ajxw> {
        private /* synthetic */ aczq a;

        t(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (akxa) obj;
            akcr.a(obj, "result");
            nkv.a(obj, this.a);
            return ajxw.a;
        }
    }

    /* renamed from: nku$u */
    static final class u extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ aczq a;

        u(aczq aczq) {
            this.a = aczq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            this.a.a(null, new aczw(new Exception(th)));
            return ajxw.a;
        }
    }

    /* renamed from: nku$w */
    static final class w extends akcq implements akbl<nkj, AssetFileDescriptor> {
        w(nku nku) {
            super(1, nku);
        }

        public final String getName() {
            return "requestToDescriptor";
        }

        public final akej getOwner() {
            return akde.a(nku.class);
        }

        public final String getSignature() {
            return "requestToDescriptor(Lcom/snap/map/core/MapThumbnailRequest;)Landroid/content/res/AssetFileDescriptor;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            nkj nkj = (nkj) obj;
            akcr.b(nkj, "p1");
            nku nku = (nku) this.receiver;
            String str = (((CharSequence) nkj.b).length() == 0 ? 1 : null) != null ? nkj.a : nkj.b;
            Charset charset = akfp.a;
            String str2 = "null cannot be cast to non-null type java.lang.String";
            if (str != null) {
                Object bytes = str.getBytes(charset);
                akcr.a(bytes, "(this as java.lang.String).getBytes(charset)");
                bytes = Base64.encodeToString(bytes, 19);
                String str3 = "key";
                if (bytes.length() > 64) {
                    akcr.a(bytes, str3);
                    if (bytes != null) {
                        bytes = bytes.substring(0, 64);
                        akcr.a(bytes, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new ajxt(str2);
                    }
                }
                akcr.a(bytes, str3);
                String str4 = "";
                str = akgb.a(akgb.a(bytes, "+", str4, false), "=", str4, false);
                AssetFileDescriptor a = ((ygi) nku.d.get()).a(njt.THUMBNAIL, str);
                if (a != null) {
                    return a;
                }
                obj = ((SnapMapHttpInterface) nku.c.get()).downloadThumbnailDirect(nkj.a).a((ajfc) ad.a).f(new ae(nku, str)).b();
                akcr.a(obj, "snapMapApi.get().downloa…           .blockingGet()");
                return (AssetFileDescriptor) obj;
            }
            throw new ajxt(str2);
        }
    }

    /* renamed from: nku$x */
    static final class x extends akcq implements akbl<AssetFileDescriptor, byte[]> {
        x(a aVar) {
            super(1, aVar);
        }

        public final String getName() {
            return "descriptorToBytes";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "descriptorToBytes(Landroid/content/res/AssetFileDescriptor;)[B";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            akcr.b(assetFileDescriptor, "p1");
            akcr.b(assetFileDescriptor, "descriptor");
            FileInputStream createInputStream = assetFileDescriptor.createInputStream();
            byte[] bArr = new byte[createInputStream.available()];
            createInputStream.read(bArr);
            createInputStream.close();
            return bArr;
        }
    }

    static {
        a aVar = new a();
    }

    public nku(ide ide, zgb zgb, ajei ajei, adbk adbk, aipn<SnapMapHttpInterface> aipn, aipn<ygi> aipn2, aipn<ftl> aipn3) {
        akcr.b(ide, "feature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajei, "activityDisposable");
        akcr.b(adbk, "mapEndpointProvider");
        akcr.b(aipn, "snapMapApi");
        akcr.b(aipn2, "fileCache");
        akcr.b(aipn3, "configProvider");
        this.j = ajei;
        this.k = adbk;
        this.c = aipn;
        this.d = aipn2;
        this.e = aipn3;
        this.f = zgb.a(ide.callsite("client")).g();
        String str = "SnapMapClientImpl";
        ajdp b = ajdp.b((Callable) new ac(this)).b((ajdw) zgb.a(ide.callsite(str)).f());
        Object a = adew.PERSONAL_INSTANCE_VERSION.a();
        akcr.a(a, "MapConfigurationKey.PERS…INSTANCE_VERSION.delegate");
        a = a.b();
        if (a != null) {
            Object a2 = b.e((String) a).a();
            akcr.a(a2, "Observable.fromCallable …ing)\n            .cache()");
            this.h = a2;
            ajdp b2 = ajdp.b((Callable) new k(this)).b((ajdw) zgb.a(ide.callsite(str)).f());
            a2 = adew.ERROR_MAP_REQUESTS.a();
            akcr.a(a2, "MapConfigurationKey.ERROR_MAP_REQUESTS.delegate");
            a2 = a2.b();
            if (a2 != null) {
                Object a3 = b2.e((Boolean) a2).a();
                akcr.a(a3, "Observable.fromCallable …ean)\n            .cache()");
                this.i = a3;
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Boolean");
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.String");
    }

    /* Access modifiers changed, original: final */
    public final String a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.k.get());
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final void a() {
        ajei ajei = this.g;
        this.g = new ajei();
        ajej a = this.f.a((Runnable) new f(ajei));
        akcr.a((Object) a, "scheduler.scheduleDirect…Dispose.clear()\n        }");
        ajvv.a(a, this.j);
    }

    public final void a(algm algm, aczq<algn> aczq) {
        akcr.b(algm, "request");
        akcr.b(aczq, "callback");
        Object a = ajdx.c((Callable) new b(algm)).a((ajfc) new c(this)).b(this.f).a(this.f);
        akcr.a(a, "Single.fromCallable<Batc…    .observeOn(scheduler)");
        nkv.a(a, this.g, new d(aczq), new e(aczq));
    }

    public final void a(alhb alhb, aczq<alhc> aczq) {
        akcr.b(alhb, "request");
        akcr.b(aczq, "callback");
        Object a = ajdx.c((Callable) new g(alhb)).a((ajfc) new h(this)).b(this.f).a(this.f);
        akcr.a(a, "Single.fromCallable<Dele…    .observeOn(scheduler)");
        nkv.a(a, this.g, new i(aczq), new j(aczq));
    }

    public final void a(alig alig, aczq<alih> aczq) {
        akcr.b(alig, "request");
        akcr.b(aczq, "callback");
        Object a = ajwc.a(this.h, this.i).a((ajfc) new l(this, alig)).b(this.f).a(this.f);
        akcr.a(a, "Singles.zip(personalHead…    .observeOn(scheduler)");
        nkv.a(a, this.g, new m(aczq), new n(aczq));
    }

    public final void a(alii alii, aczq<alij> aczq) {
        akcr.b(alii, "request");
        akcr.b(aczq, "callback");
        Object a = ((ftl) this.e.get()).u(adew.CUSTOM_TILE_FLAVOR).d((Object) "default").a((ajfc) new af(this, alii)).b(this.f).a(this.f);
        akcr.a(a, "configProvider.get().obs…    .observeOn(scheduler)");
        nkv.a(a, this.g, new ag(aczq), new ah(aczq));
    }

    public final void a(alik alik, aczq<alil> aczq) {
        akcr.b(alik, "request");
        akcr.b(aczq, "callback");
        Object a = ajdx.c((Callable) new am(alik)).a((ajfc) new an(this)).b(this.f).a(this.f);
        akcr.a(a, "Single.fromCallable<GetM…    .observeOn(scheduler)");
        nkv.a(a, this.g, new ao(aczq), new ap(aczq));
    }

    public final void a(alim alim, aczq<alin> aczq) {
        akcr.b(alim, "request");
        akcr.b(aczq, "callback");
        Object a = ajdx.c((Callable) new ai(alim)).a((ajfc) new aj(this)).b(this.f).a(this.f);
        akcr.a(a, "Single.fromCallable<GetM…    .observeOn(scheduler)");
        nkv.a(a, this.g, new ak(aczq), new al(aczq));
    }

    public final void a(alio alio, aczq<alip> aczq) {
        akcr.b(alio, "request");
        akcr.b(aczq, "callback");
        Object a = this.h.a((ajfc) new s(this, alio)).b(this.f).a(this.f);
        akcr.a(a, "personalHeaderVersionSin…    .observeOn(scheduler)");
        nkv.a(a, this.g, new t(aczq), new u(aczq));
    }

    public final void a(aliq aliq, aczq<alir> aczq) {
        akcr.b(aliq, "request");
        akcr.b(aczq, "callback");
        Object b = DefaultImpls.rpcGetOnboardingViewState$default((SnapMapHttpInterface) this.c.get(), a("/rpc/getOnboardingViewState"), aliq, null, 4, null).b(this.f);
        akcr.a(b, "snapMapApi.get().rpcGetO…  .subscribeOn(scheduler)");
        nkv.a(b, this.g, new aq(aczq), new ar(aczq));
    }

    public final void a(aljm aljm, aczq<aljn> aczq) {
        akcr.b(aljm, "request");
        akcr.b(aczq, "callback");
        Object a = ajdx.c((Callable) new o(aljm)).a((ajfc) new p(this)).b(this.f).a(this.f);
        akcr.a(a, "Single.fromCallable<MapS…    .observeOn(scheduler)");
        nkv.a(a, this.g, new q(aczq), new r(aczq));
    }

    public final void a(String str, String str2, aczq<byte[]> aczq) {
        akcr.b(str, "url");
        akcr.b(str2, "cacheKey");
        akcr.b(aczq, "callback");
        Object a = ajdx.c((Callable) new v(str, str2)).f(new nkx(new w(this))).f(new nkx(new x(njs.a))).b(this.f).a(this.f).b((ajfb) new y(this, str2)).a((ajev) new z(this, str2));
        akcr.a(a, "Single.fromCallable<MapT…      }\n                }");
        nkv.a(a, this.g, new aa(aczq), new ab(aczq));
    }

    public final void b(String str) {
        akcr.b(str, "cacheKey");
        synchronized (this.a) {
            ajej ajej = (ajej) this.b.get(str);
            if (ajej != null) {
                ajej.dispose();
            }
        }
    }
}
