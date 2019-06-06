package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.google.common.base.Optional;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import com.snapchat.android.R;

/* renamed from: ziy */
public final class ziy extends zgi implements achk<zjm, zjk> {
    a a = a.CONNECTED;
    private final ajxe b;
    private final ajxe c;
    private boolean d;
    private final Context e;
    private final ajwy<ifa> f;
    private final ajwy<sdu> g;
    private final ajwy<fxi> h;

    /* renamed from: ziy$a */
    public enum a {
        CONNECTED(R.string.connected_notification_message, R.color.regular_green),
        CONNECTING(R.string.connecting_notification_message, R.color.regular_grey),
        NO_CONNECTION(R.string.no_connection_notification_message, R.color.regular_grey);
        
        final int colorRes;
        final int stringRes;

        private a(int i, int i2) {
            this.stringRes = i;
            this.colorRes = i2;
        }
    }

    /* renamed from: ziy$b */
    static final class b extends akcs implements akbk<achb<zjm, zjk>> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (achb) this.a.get();
        }
    }

    /* renamed from: ziy$i */
    static final class i extends akcs implements akbk<zfw> {
        private /* synthetic */ ajwy a;

        i(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(zix.a.callsite("ConnectivityIndicator"));
        }
    }

    /* renamed from: ziy$c */
    static final class c<T> implements ajfl<Optional<NetworkInfo>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "optionalNetworkInfo");
            return optional.isPresent();
        }
    }

    /* renamed from: ziy$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "optionalNetworkInfo");
            return (NetworkInfo) optional.get();
        }
    }

    /* renamed from: ziy$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            NetworkInfo networkInfo = (NetworkInfo) obj;
            akcr.b(networkInfo, "networkInfo");
            State state = networkInfo.getState();
            if (state != null) {
                int i = ziz.a[state.ordinal()];
                if (i == 1) {
                    return a.CONNECTED;
                }
                if (i == 2) {
                    return a.CONNECTING;
                }
            }
            return a.NO_CONNECTION;
        }
    }

    /* renamed from: ziy$f */
    static final class f<T> implements ajfl<a> {
        private /* synthetic */ ziy a;

        f(ziy ziy) {
            this.a = ziy;
        }

        public final /* synthetic */ boolean test(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "networkState");
            return aVar != this.a.a;
        }
    }

    /* renamed from: ziy$g */
    static final class g<T> implements ajfb<a> {
        private /* synthetic */ ziy a;

        g(ziy ziy) {
            this.a = ziy;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (a) obj;
            ziy ziy = this.a;
            akcr.a(obj, "networkState");
            ziy.a = obj;
            this.a.a(obj, this.a.c().c ? (zjm) this.a.c().h() : null);
        }
    }

    /* renamed from: ziy$h */
    static final class h implements ajev {
        private /* synthetic */ ziy a;

        h(ziy ziy) {
            this.a = ziy;
        }

        public final void run() {
            this.a.c().b((achk) this.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ziy.class), "navigationHost", "getNavigationHost()Lcom/snapchat/deck/api/NavigationHost;"), new akdc(akde.a(ziy.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public ziy(zgk<b> zgk, ajwy<zgb> ajwy, Context context, ajwy<ifa> ajwy2, ajwy<sdu> ajwy3, ajwy<fxi> ajwy4, ajwy<achb<zjm, zjk>> ajwy5) {
        akcr.b(zgk, "taskScoper");
        akcr.b(ajwy, "schedulersProvider");
        akcr.b(context, "context");
        akcr.b(ajwy2, "rxNetworkStatusManager");
        akcr.b(ajwy3, "notificationEmitter");
        akcr.b(ajwy4, "lowEndDeviceConfiguration");
        akcr.b(ajwy5, "navigationHostLazy");
        super(zgk);
        this.e = context;
        this.f = ajwy2;
        this.g = ajwy3;
        this.h = ajwy4;
        this.b = ajxh.a(new b(ajwy5));
        this.c = ajxh.a(new i(ajwy));
    }

    private final zfw d() {
        return (zfw) this.c.b();
    }

    public final ajej a() {
        Object f;
        String str;
        if (((fxi) this.h.get()).a) {
            f = ((ifa) this.f.get()).e().b((ajdw) d().b()).a((ajfl) c.a).p(d.a).j(ajfu.a).p(e.a).a((ajdw) d().l()).a((ajfl) new f(this)).f((ajfb) new g(this));
            str = "rxNetworkStatusManager.g…pe)\n                    }";
        } else {
            f = ajfq.INSTANCE;
            str = "Disposables.disposed()";
        }
        akcr.a(f, str);
        return f;
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    /* Access modifiers changed, original: final */
    public final void a(a aVar, zjm zjm) {
        boolean z = true;
        if (zjm != null && zjm.i) {
            String string = this.e.getString(aVar.stringRes);
            akcr.a((Object) string, "context.getString(networkState.stringRes)");
            ((sdu) this.g.get()).b(sdt.a(new seg(string, Integer.valueOf(aVar.colorRes), 12)).h("FLOATING_STATUS_BAR").a(sec.CONNECTIVITY).a());
            z = false;
        }
        this.d = z;
    }

    public final ajej b() {
        Object a;
        String str;
        if (((fxi) this.h.get()).a) {
            c().a((achk) this);
            a = ajek.a((ajev) new h(this));
            str = "Disposables.fromAction {…igationSubscriber(this) }";
        } else {
            a = ajfq.INSTANCE;
            str = "Disposables.disposed()";
        }
        akcr.a(a, str);
        return a;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (this.d) {
            a(this.a, (zjm) achi.f.e());
        }
    }

    /* Access modifiers changed, original: final */
    public final achb<zjm, zjk> c() {
        return (achb) this.b.b();
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }
}
