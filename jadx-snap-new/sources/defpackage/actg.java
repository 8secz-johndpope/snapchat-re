package defpackage;

import android.content.Context;

/* renamed from: actg */
public final class actg {
    public final zfw a;
    public final ajxe b;
    public final ajxe c;
    public final ajxe d = ajxh.a(e.a);
    public final ajxe e;
    public final ajxe f;
    public final Context g;
    public final aipn<sso> h;
    public final iib i;
    public final ajwy<usd> j;
    public final zgb k;
    public final ajwy<yhl> l;
    private final ajxe m;

    /* renamed from: actg$a */
    public static final class a {
        public final String a;
        public final String b;
        public final sri c;

        public a(String str, String str2, sri sri) {
            akcr.b(str, "friendUserName");
            akcr.b(str2, "friendUserID");
            this.a = str;
            this.b = str2;
            this.c = sri;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.actg.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.actg.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.actg$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            sri sri = this.c;
            if (sri != null) {
                i = sri.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("LaunchConfig(friendUserName=");
            stringBuilder.append(this.a);
            stringBuilder.append(", friendUserID=");
            stringBuilder.append(this.b);
            stringBuilder.append(", closedAnimationState=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: actg$g */
    public static final class g<T> implements ajfb<actc> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: actg$h */
    public static final class h implements ajev {
        private /* synthetic */ ajei a;

        public h(ajei ajei) {
            this.a = ajei;
        }

        public final void run() {
            this.a.dispose();
        }
    }

    /* renamed from: actg$b */
    static final class b extends akcs implements akbk<jwa> {
        private /* synthetic */ jwb a;
        private /* synthetic */ ide b;

        b(jwb jwb, ide ide) {
            this.a = jwb;
            this.b = ide;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a(this.b);
        }
    }

    /* renamed from: actg$c */
    static final class c extends akcs implements akbk<jwc> {
        private /* synthetic */ jwe a;

        c(jwe jwe) {
            this.a = jwe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a();
        }
    }

    /* renamed from: actg$d */
    static final class d extends akcs implements akbk<ihh> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) this.a.get();
        }
    }

    /* renamed from: actg$e */
    static final class e extends akcs implements akbk<fvk> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new fvk();
        }
    }

    /* renamed from: actg$f */
    static final class f extends akcq implements akbk<ynp> {
        f(ajwy ajwy) {
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
            return (ynp) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: actg$i */
    static final class i extends akcq implements akbk<sku> {
        i(ajwy ajwy) {
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
            return (sku) ((ajwy) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(actg.class), "playbackPerformanceAnalytics", "getPlaybackPerformanceAnalytics()Lcom/snap/opera/extensions/api/analytics/PlaybackPerformanceAnalytics;"), new akdc(akde.a(actg.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;"), new akdc(akde.a(actg.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(actg.class), "contextCardsAnalyticsPlugin", "getContextCardsAnalyticsPlugin()Lcom/snap/contextcards/api/opera/analytics/DefaultContextCardsAnalyticsPlugin;"), new akdc(akde.a(actg.class), "friendStoryOperaPluginProvider", "getFriendStoryOperaPluginProvider()Lcom/snap/stories/opera/FriendStoryOperaPluginProvider;"), new akdc(akde.a(actg.class), "clock", "getClock()Lcom/snap/framework/time/Clock;")};
    }

    public actg(ide ide, Context context, aipn<sso> aipn, jwb jwb, jwe jwe, iib iib, ajwy<usd> ajwy, zgb zgb, ajwy<yhl> ajwy2, ajwy<sku> ajwy3, ajwy<ynp> ajwy4, ajwy<ihh> ajwy5) {
        akcr.b(ide, "feature");
        akcr.b(context, "context");
        akcr.b(aipn, "operaLauncher");
        akcr.b(jwb, "bitmapFactoryProvider");
        akcr.b(jwe, "bitmapLoaderFactory");
        akcr.b(iib, "screenParameterProvider");
        akcr.b(ajwy, "profileLauncherProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy2, "storySnapOperaAnalyticsFactoryProvider");
        akcr.b(ajwy3, "playbackPerformanceAnalyticsProvider");
        akcr.b(ajwy4, "friendStoryOperaPluginProvider");
        akcr.b(ajwy5, "clockProvider");
        this.g = context;
        this.h = aipn;
        this.i = iib;
        this.j = ajwy;
        this.k = zgb;
        this.l = ajwy2;
        this.m = ajxh.a(new i(ajwy3));
        this.a = zgb.a(ide.callsite("story_viewer"));
        this.b = ajxh.a(new b(jwb, ide));
        this.c = ajxh.a(new c(jwe));
        this.e = ajxh.a(new f(ajwy4));
        this.f = ajxh.a(new d(ajwy5));
    }

    public final sku a() {
        return (sku) this.m.b();
    }
}
