package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.util.Base64;
import com.snap.core.db.record.ConnectedAppsModel;
import defpackage.iib.a;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: ciu */
public final class ciu implements cii {
    final ajxe a;
    private final ajxe b = ajxh.a(a.a);
    private final ajxe c;
    private final ajxe d;
    private final ajxe e;
    private final ajxe f;
    private final ajxe g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j;
    private final ajxe k;
    private final ajxe l;
    private final ajxe m;
    private final ajxe n;
    private final ajxe o;
    private final ajxe p;
    private final ajxe q;
    private final ajxe r;
    private final cij s;

    /* renamed from: ciu$a */
    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return cir.a.callsite("DeviceInfoSupplier");
        }
    }

    /* renamed from: ciu$i */
    static final class i extends akcs implements akbk<Context> {
        private /* synthetic */ aipn a;

        i(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Context) this.a.get();
        }
    }

    /* renamed from: ciu$q */
    static final class q extends akcs implements akbk<ifb> {
        private /* synthetic */ ajwy a;

        q(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ifb) this.a.get();
        }
    }

    /* renamed from: ciu$b */
    static final class b extends akcs implements akbk<String> {
        private /* synthetic */ ciu a;

        b(ciu ciu) {
            this.a = ciu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object v = this.a.v();
            String str = "context";
            akcr.a(v, str);
            PackageManager packageManager = v.getPackageManager();
            Object v2 = this.a.v();
            akcr.a(v2, str);
            CharSequence applicationLabel = packageManager.getApplicationLabel(v2.getApplicationInfo());
            if (applicationLabel != null) {
                String obj = applicationLabel.toString();
                if (obj != null) {
                    return obj;
                }
            }
            return "";
        }
    }

    /* renamed from: ciu$d */
    static final class d extends akcs implements akbk<String> {
        private /* synthetic */ ciu a;

        d(ciu ciu) {
            this.a = ciu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ifb) this.a.d.b()).h();
        }
    }

    /* renamed from: ciu$e */
    static final class e extends akcs implements akbk<Long> {
        private /* synthetic */ ciu a;

        e(ciu ciu) {
            this.a = ciu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(ihq.a(this.a.w()));
        }
    }

    /* renamed from: ciu$c */
    static final class c extends akcs implements akbk<String> {
        private /* synthetic */ ciu a;

        c(ciu ciu) {
            this.a = ciu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ifb) this.a.d.b()).c();
        }
    }

    /* renamed from: ciu$j */
    static final class j extends akcs implements akbk<Integer> {
        private /* synthetic */ ciu a;

        j(ciu ciu) {
            this.a = ciu;
            super(0);
        }

        /* JADX WARNING: Missing block: B:23:0x0058, code skipped:
            if (r0.equals("PROD") != false) goto L_0x001d;
     */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
            r4 = this;
            r0 = r4.a;
            r0 = ((defpackage.ifb) r0.d.b());
            r0 = r0.k();
            r1 = r0;
            r1 = (java.lang.CharSequence) r1;
            r2 = 0;
            r3 = 1;
            if (r1 == 0) goto L_0x001a;
        L_0x0011:
            r1 = r1.length();
            if (r1 != 0) goto L_0x0018;
        L_0x0017:
            goto L_0x001a;
        L_0x0018:
            r1 = 0;
            goto L_0x001b;
        L_0x001a:
            r1 = 1;
        L_0x001b:
            if (r1 == 0) goto L_0x001f;
        L_0x001d:
            r2 = 1;
            goto L_0x006e;
        L_0x001f:
            if (r0 == 0) goto L_0x0035;
        L_0x0021:
            if (r0 == 0) goto L_0x002d;
        L_0x0023:
            r0 = r0.toUpperCase();
            r1 = "(this as java.lang.String).toUpperCase()";
            defpackage.akcr.a(r0, r1);
            goto L_0x0036;
        L_0x002d:
            r0 = new ajxt;
            r1 = "null cannot be cast to non-null type java.lang.String";
            r0.<init>(r1);
            throw r0;
        L_0x0035:
            r0 = 0;
        L_0x0036:
            r1 = r0.hashCode();
            switch(r1) {
                case -2027938206: goto L_0x0065;
                case 2035184: goto L_0x005b;
                case 2464599: goto L_0x0052;
                case 62372158: goto L_0x0048;
                case 64921139: goto L_0x003e;
                default: goto L_0x003d;
            };
        L_0x003d:
            goto L_0x006e;
        L_0x003e:
            r1 = "DEBUG";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x006e;
        L_0x0046:
            r2 = 5;
            goto L_0x006e;
        L_0x0048:
            r1 = "ALPHA";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x006e;
        L_0x0050:
            r2 = 3;
            goto L_0x006e;
        L_0x0052:
            r1 = "PROD";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x006e;
        L_0x005a:
            goto L_0x001d;
        L_0x005b:
            r1 = "BETA";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x006e;
        L_0x0063:
            r2 = 2;
            goto L_0x006e;
        L_0x0065:
            r1 = "MASTER";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x006e;
        L_0x006d:
            r2 = 4;
        L_0x006e:
            r0 = java.lang.Integer.valueOf(r2);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ciu$j.invoke():java.lang.Object");
        }
    }

    /* renamed from: ciu$o */
    static final class o extends akcs implements akbk<Long> {
        private /* synthetic */ ciu a;

        o(ciu ciu) {
            this.a = ciu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(ihq.a(((ifb) this.a.d.b()).f()));
        }
    }

    /* renamed from: ciu$h */
    static final class h extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        h(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: ciu$n */
    static final class n extends akcs implements akbk<ifa> {
        private /* synthetic */ ajwy a;

        n(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ifa) this.a.get();
        }
    }

    /* renamed from: ciu$r */
    static final class r extends akcs implements akbk<cil> {
        private /* synthetic */ ajwy a;

        r(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cil) this.a.get();
        }
    }

    /* renamed from: ciu$m */
    static final class m extends akcs implements akbk<gqr> {
        private /* synthetic */ ajwy a;

        m(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gqr) this.a.get();
        }
    }

    /* renamed from: ciu$p */
    static final class p extends akcs implements akbk<iib> {
        private /* synthetic */ ajwy a;

        p(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iib) this.a.get();
        }
    }

    /* renamed from: ciu$l */
    static final class l extends akcs implements akbk<cik> {
        private /* synthetic */ ciu a;

        l(ciu ciu) {
            this.a = ciu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = (iib) this.a.a.b();
            akcr.a(obj, "screenParameterProvider");
            a a = obj.a();
            return new cik(a.h, a.g, a.c, a.d);
        }
    }

    /* renamed from: ciu$g */
    static final class g extends akcs implements akbk<rxj> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rxj) this.a.get();
        }
    }

    /* renamed from: ciu$f */
    static final class f extends akcs implements akbk<AudioManager> {
        private /* synthetic */ ciu a;

        f(ciu ciu) {
            this.a = ciu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.a.v().getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            return (AudioManager) systemService;
        }
    }

    /* renamed from: ciu$k */
    static final class k extends akcs implements akbk<String> {
        public static final k a = new k();

        k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
            akcr.a(format, "java.lang.String.format(format, *args)");
            return format;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ciu.class), "adCallsite", "getAdCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(ciu.class), "context", "getContext()Landroid/content/Context;"), new akdc(akde.a(ciu.class), "userAgent", "getUserAgent()Lcom/snap/framework/network/UserAgent;"), new akdc(akde.a(ciu.class), ConnectedAppsModel.APPNAME, "getAppName()Ljava/lang/String;"), new akdc(akde.a(ciu.class), "appVersion", "getAppVersion()Ljava/lang/String;"), new akdc(akde.a(ciu.class), "appVersionNumeric", "getAppVersionNumeric()J"), new akdc(akde.a(ciu.class), "appVariant", "getAppVariant()Ljava/lang/String;"), new akdc(akde.a(ciu.class), "convertedAppType", "getConvertedAppType()I"), new akdc(akde.a(ciu.class), "deviceModelString", "getDeviceModelString()Ljava/lang/String;"), new akdc(akde.a(ciu.class), "osVersionNumeric", "getOsVersionNumeric()J"), new akdc(akde.a(ciu.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(ciu.class), "networkStatusManager", "getNetworkStatusManager()Lcom/snap/framework/network/RxNetworkStatusManager;"), new akdc(akde.a(ciu.class), "userIdfaProvider", "getUserIdfaProvider()Lcom/snap/adinfo/api/idfa/IdfaProviderInterface;"), new akdc(akde.a(ciu.class), "exceptionTracker", "getExceptionTracker()Lcom/snap/crash/api/exceptiontracker/ExceptionTracker;"), new akdc(akde.a(ciu.class), "screenParameterProvider", "getScreenParameterProvider()Lcom/snap/framework/util/ScreenParameterProvider;"), new akdc(akde.a(ciu.class), "deviceScreenInfo", "getDeviceScreenInfo()Lcom/snap/adinfo/api/deviceinfo/ScreenInfo;"), new akdc(akde.a(ciu.class), "bandwidthClassManager", "getBandwidthClassManager()Lcom/snap/network/bandwidth/api/BandwidthClassManager;"), new akdc(akde.a(ciu.class), "audioManager", "getAudioManager()Landroid/media/AudioManager;")};
    }

    public ciu(aipn<Context> aipn, ajwy<ifb> ajwy, ajwy<ftl> ajwy2, ajwy<iib> ajwy3, ajwy<ifa> ajwy4, ajwy<cil> ajwy5, cij cij, ajwy<gqr> ajwy6, ajwy<rxj> ajwy7) {
        akcr.b(aipn, "contextLazy");
        akcr.b(ajwy, "userAgentProvider");
        akcr.b(ajwy2, "configProviderProvider");
        akcr.b(ajwy3, "screenParameterProvider");
        akcr.b(ajwy4, "networkStatusManagerProvider");
        akcr.b(ajwy5, "userIdfaProvider");
        akcr.b(cij, "adUserDataStore");
        akcr.b(ajwy6, "exceptionTrackerProvider");
        akcr.b(ajwy7, "bandwidthClassManagerProvider");
        this.s = cij;
        this.c = ajxh.a(new i(aipn));
        this.d = ajxh.a(new q(ajwy));
        this.e = ajxh.a(new b(this));
        this.f = ajxh.a(new d(this));
        this.g = ajxh.a(new e(this));
        this.h = ajxh.a(new c(this));
        this.i = ajxh.a(new j(this));
        this.j = ajxh.a(k.a);
        this.k = ajxh.a(new o(this));
        this.l = ajxh.a(new h(ajwy2));
        this.m = ajxh.a(new n(ajwy4));
        this.n = ajxh.a(new r(ajwy5));
        this.o = ajxh.a(new m(ajwy6));
        this.a = ajxh.a(new p(ajwy3));
        this.p = ajxh.a(new l(this));
        this.q = ajxh.a(new g(ajwy7));
        this.r = ajxh.a(new f(this));
    }

    private final cil A() {
        return (cil) this.n.b();
    }

    private final AudioManager B() {
        return (AudioManager) this.r.b();
    }

    private final String x() {
        return (String) this.e.b();
    }

    private final ftl y() {
        return (ftl) this.l.b();
    }

    private final ifa z() {
        return (ifa) this.m.b();
    }

    public final boolean a() {
        return b() > 0;
    }

    public final int b() {
        AudioManager B = B();
        return B != null ? B.getStreamVolume(3) : 0;
    }

    public final float c() {
        AudioManager B = B();
        float f = -1.0f;
        if (B != null) {
            int streamVolume = B.getStreamVolume(3);
            int streamMaxVolume = B.getStreamMaxVolume(3);
            if (streamMaxVolume <= 0) {
                return -1.0f;
            }
            f = ((float) streamVolume) / ((float) streamMaxVolume);
        }
        return f;
    }

    public final cik d() {
        return (cik) this.p.b();
    }

    public final String e() {
        Object obj = Locale.getDefault();
        akcr.a(obj, "Locale.getDefault()");
        String language = obj.getLanguage();
        return language == null ? "en" : language;
    }

    public final String f() {
        Object obj = Locale.getDefault();
        akcr.a(obj, "Locale.getDefault()");
        String country = obj.getCountry();
        return country == null ? juk.c : country;
    }

    public final String g() {
        return (String) this.j.b();
    }

    public final byte[] h() {
        byte[] decode;
        String b = this.s.b();
        CharSequence charSequence = b;
        Object obj = 1;
        Object obj2 = (charSequence == null || akgb.a(charSequence)) ? 1 : null;
        if (obj2 == null) {
            if (b == null) {
                akcr.a();
            }
            decode = Base64.decode(akgb.a(akgb.a(b, '_', '/'), '-', '+'), 2);
        } else {
            decode = null;
        }
        if (decode != null) {
            if (decode.length != 0) {
                obj = null;
            }
            if (obj == null) {
                return decode;
            }
        }
        return new byte[0];
    }

    public final byte[] i() {
        String a = A().a();
        if ((((CharSequence) a).length() == 0 ? 1 : null) != null) {
            return new byte[0];
        }
        UUID fromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
        try {
            fromString = UUID.fromString(a);
        } catch (Exception e) {
            ((gqr) this.o.b()).a(gqt.HIGH, e, (idd) this.b.b());
        }
        Object a2 = abps.a(fromString);
        akcr.a(a2, "StringUtils.getBytesFromUUID(uuid)");
        return a2;
    }

    public final String j() {
        String j = y().j(cip.SCEID);
        CharSequence charSequence = j;
        int i = (charSequence == null || charSequence.length() == 0) ? 1 : 0;
        return (i ^ 1) != 0 ? j : null;
    }

    public final String k() {
        String j = y().j(cip.PIXEL_TOKEN);
        CharSequence charSequence = j;
        int i = (charSequence == null || charSequence.length() == 0) ? 1 : 0;
        return (i ^ 1) != 0 ? j : null;
    }

    public final alby l() {
        alby alby = new alby();
        alby.a(h());
        alby.a(y().a((fth) cip.ENABLE_TEST_GROUP_QA));
        return alby;
    }

    public final String m() {
        return x();
    }

    public final String n() {
        return w();
    }

    public final akzw o() {
        akzw akzw = new akzw();
        akzw.a(x());
        akzw.a(((Number) this.g.b()).longValue());
        akzw.b((String) this.h.b());
        akzw.a();
        akzw.a(((Number) this.i.b()).intValue());
        return akzw;
    }

    public final albd p() {
        albd albd = new albd();
        albd.a(A().b());
        albd.b(y().a((fth) cip.AUDIENCE_MATCH_OPT_OUT));
        albd.c(y().a((fth) cip.EXTERNAL_ACTIVITY_MATCH_OPT_OUT));
        return albd;
    }

    public final alaj q() {
        alaj alaj = new alaj();
        alaj.a(i());
        alaj.a();
        alaj.a(g());
        alaj.a(((Number) this.k.b()).longValue());
        Object locale = Locale.getDefault().toString();
        akcr.a(locale, "Locale.getDefault().toString()");
        alaj.b(akgb.a(locale, "_", "-", false));
        alaj.a(a());
        String str = Build.ID;
        if (str == null) {
            str = "";
        }
        alaj.c(str);
        return alaj;
    }

    /* JADX WARNING: Missing block: B:29:0x0099, code skipped:
            if (r3.equals(com.mapbox.services.android.telemetry.MapboxEvent.KEY_WIFI) != false) goto L_0x009d;
     */
    public final defpackage.albb r() {
        /*
        r8 = this;
        r0 = new albb;
        r0.<init>();
        r1 = r8.v();
        r2 = "phone";
        r1 = r1.getSystemService(r2);
        r3 = r1 instanceof android.telephony.TelephonyManager;
        r4 = 0;
        if (r3 != 0) goto L_0x0015;
    L_0x0014:
        r1 = r4;
    L_0x0015:
        r1 = (android.telephony.TelephonyManager) r1;
        if (r1 == 0) goto L_0x001e;
    L_0x0019:
        r1 = r1.getNetworkOperatorName();
        goto L_0x001f;
    L_0x001e:
        r1 = r4;
    L_0x001f:
        r3 = "";
        if (r1 != 0) goto L_0x0024;
    L_0x0023:
        r1 = r3;
    L_0x0024:
        r0.b(r1);
        r1 = r8.v();
        r1 = r1.getSystemService(r2);
        r2 = r1 instanceof android.telephony.TelephonyManager;
        if (r2 != 0) goto L_0x0034;
    L_0x0033:
        r1 = r4;
    L_0x0034:
        r1 = (android.telephony.TelephonyManager) r1;
        if (r1 == 0) goto L_0x003c;
    L_0x0038:
        r4 = r1.getNetworkOperator();
    L_0x003c:
        r1 = 1;
        r2 = 2;
        r5 = 0;
        if (r4 == 0) goto L_0x006f;
    L_0x0041:
        r6 = r4.length();
        r7 = 3;
        if (r6 <= r7) goto L_0x006f;
    L_0x0048:
        r3 = r4.substring(r5, r7);
        r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
        defpackage.akcr.a(r3, r6);
        r4 = r4.substring(r7);
        r6 = "(this as java.lang.String).substring(startIndex)";
        defpackage.akcr.a(r4, r6);
        r6 = new java.lang.Object[r2];
        r6[r5] = r3;
        r6[r1] = r4;
        r3 = java.util.Arrays.copyOf(r6, r2);
        r4 = "%s-%s";
        r3 = java.lang.String.format(r4, r3);
        r4 = "java.lang.String.format(format, *args)";
        defpackage.akcr.a(r3, r4);
    L_0x006f:
        r0.a(r3);
        r3 = r8.z();
        r3 = r3.d();
        r4 = r3.hashCode();
        r6 = 3649301; // 0x37af15 float:5.11376E-39 double:1.8029943E-317;
        if (r4 == r6) goto L_0x0093;
    L_0x0083:
        r1 = 3662605; // 0x37e30d float:5.132403E-39 double:1.8095673E-317;
        if (r4 == r1) goto L_0x0089;
    L_0x0088:
        goto L_0x009c;
    L_0x0089:
        r1 = "wwan";
        r1 = r3.equals(r1);
        if (r1 == 0) goto L_0x009c;
    L_0x0091:
        r1 = 2;
        goto L_0x009d;
    L_0x0093:
        r2 = "wifi";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x009c;
    L_0x009b:
        goto L_0x009d;
    L_0x009c:
        r1 = 0;
    L_0x009d:
        r0.a(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciu.r():albb");
    }

    public final boolean s() {
        return y().a((fth) cip.ENABLE_DEBUG_REQUEST);
    }

    public final String t() {
        Object obj = (rxj) this.q.b();
        akcr.a(obj, "bandwidthClassManager");
        rxm a = obj.a();
        if (a != null) {
            String rxm = a.toString();
            if (rxm != null) {
                return rxm;
            }
        }
        return String.valueOf(rxm.UNRECOGNIZED_VALUE);
    }

    public final String u() {
        return z().d();
    }

    /* Access modifiers changed, original: final */
    public final Context v() {
        return (Context) this.c.b();
    }

    /* Access modifiers changed, original: final */
    public final String w() {
        return (String) this.f.b();
    }
}
