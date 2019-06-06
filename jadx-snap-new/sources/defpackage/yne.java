package defpackage;

import android.util.Base64;
import defpackage.yna.a;
import java.util.concurrent.Callable;

/* renamed from: yne */
public final class yne implements ymw {
    private final ajxe a;
    private final ajxe b;

    /* renamed from: yne$i */
    static final class i extends akcs implements akbk<zfw> {
        private /* synthetic */ ajwy a;

        i(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(yhy.j.callsite("FriendStoryNotificationExperimentImpl"));
        }
    }

    /* renamed from: yne$a */
    static final class a extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: yne$e */
    static final class e<V> implements Callable<T> {
        private /* synthetic */ ymu a;

        e(ymu ymu) {
            this.a = ymu;
        }

        public final /* synthetic */ Object call() {
            return vdp.a(Base64.decode(this.a.a, 0));
        }
    }

    /* renamed from: yne$c */
    static final class c<T> implements ajfb<Long> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: yne$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ yna a;

        d(yna yna) {
            this.a = yna;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (Boolean) obj;
            akcr.b(obj, "iconEnabled");
            if (akcr.a(obj, Boolean.TRUE)) {
                return this.a;
            }
            if (akcr.a(obj, Boolean.FALSE)) {
                return new yna(this.a.a, ymx.NONE, this.a.c, this.a.d);
            }
            throw new ajxk();
        }
    }

    /* renamed from: yne$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ yne a;
        private /* synthetic */ yna b;

        f(yne yne, yna yna) {
            this.a = yne;
            this.b = yna;
        }

        public final /* synthetic */ Object apply(Object obj) {
            vdp vdp = (vdp) obj;
            akcr.b(vdp, "it");
            yna yna = this.b;
            int a = vdp.a();
            ymz ymz = a != 1 ? a != 2 ? yna.a : ymz.WATCH : ymz.UPDATE;
            int b = vdp.b();
            ymx ymx = b != 1 ? b != 2 ? b != 3 ? yna.b : ymx.STORY_THUMBNAIL_COMPOSITE : ymx.BITMOJI_COMPOSITE : ymx.NONE;
            int c = vdp.c();
            ymt ymt = c != 1 ? c != 2 ? c != 3 ? yna.c : ymt.OPERA_AUTO_PLAY : ymt.OPERA_UP_NEXT : ymt.DF;
            return new yna(ymz, ymx, ymt, ymy.NAME);
        }
    }

    /* renamed from: yne$g */
    static final class g<T> implements ajfb<yna> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: yne$h */
    static final class h<T> implements ajfb<Throwable> {
        private /* synthetic */ ymu a;

        h(ymu ymu) {
            this.a = ymu;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: yne$b */
    static final class b extends akcq implements akbl<yna, ajdx<yna>> {
        b(yne yne) {
            super(1, yne);
        }

        public final String getName() {
            return "overwriteIfNeeded";
        }

        public final akej getOwner() {
            return akde.a(yne.class);
        }

        public final String getSignature() {
            return "overwriteIfNeeded(Lcom/snap/stories/notification/FriendStoryNotificationUiVariance;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            yna yna = (yna) obj;
            akcr.b(yna, "p1");
            obj = ((yne) this.receiver).c().b((fth) yiz.FRIEND_STORY_NOTIFICATION_ICON).f(new d(yna));
            akcr.a(obj, "experimentConfigProvider…      }\n                }");
            return obj;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(yne.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(yne.class), "experimentConfigProvider", "getExperimentConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;")};
    }

    public yne(ajwy<zgb> ajwy, ajwy<ftl> ajwy2) {
        akcr.b(ajwy, "schedulersProvider");
        akcr.b(ajwy2, "compositeConfigurationProvider");
        this.a = ajxh.a(new i(ajwy));
        this.b = ajxh.a(new a(ajwy2));
    }

    private final zfw d() {
        return (zfw) this.a.b();
    }

    public final ajdx<Boolean> a() {
        Object b = c().b((fth) yiz.OPT_IN_FRIEND_NOTIFICATION_ENABLED);
        akcr.a(b, "experimentConfigProvider…END_NOTIFICATION_ENABLED)");
        return b;
    }

    public final ajdx<yna> a(ymu ymu) {
        ajdx c;
        Object a;
        akcr.b(ymu, "config");
        boolean z = ymu.b;
        boolean z2 = false;
        Object a2 = a.a(z, false);
        String str = "Single.just(defaultConfig)";
        if (z) {
            CharSequence charSequence = ymu.a;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                c = ajdx.c((Callable) new e(ymu)).b((ajdw) d().b()).f(new f(this, a2)).c((ajfb) g.a).d((ajfb) new h(ymu)).c(a2);
                akcr.a((Object) c, "Single.fromCallable {\n  …ReturnItem(defaultConfig)");
                a = c.a((ajfc) new ynf(new b(this)));
                akcr.a(a, "parseServerConfig(config…(this::overwriteIfNeeded)");
                return a;
            }
        }
        c = ajdx.b(a2);
        akcr.a((Object) c, str);
        a = c.a((ajfc) new ynf(new b(this)));
        akcr.a(a, "parseServerConfig(config…(this::overwriteIfNeeded)");
        return a;
    }

    public final ajdx<Long> b() {
        Object c = c().i(yiz.FRIEND_STORY_NOTIFICATION_TIMEOUT_MIN).b((ajdw) d().f()).c((ajfb) c.a);
        akcr.a(c, "experimentConfigProvider…R config applied: $it\") }");
        return c;
    }

    /* Access modifiers changed, original: final */
    public final ftl c() {
        return (ftl) this.b.b();
    }
}
