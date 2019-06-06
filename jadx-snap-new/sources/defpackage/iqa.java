package defpackage;

import android.content.Context;
import android.location.LocationManager;
import com.mapbox.services.android.telemetry.MapboxEvent;

/* renamed from: iqa */
public final class iqa {
    final ajxe a = ajxh.a(new a(this));
    final Context b;
    final ifs c;
    final ajwy<iqm> d;
    private final ajxe e;

    /* renamed from: iqa$d */
    static final class d extends akcs implements akbk<seo> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (seo) this.a.get();
        }
    }

    /* renamed from: iqa$a */
    static final class a extends akcs implements akbk<iqm> {
        private /* synthetic */ iqa a;

        a(iqa iqa) {
            this.a = iqa;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iqm) this.a.d.get();
        }
    }

    /* renamed from: iqa$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ iqa a;

        b(iqa iqa) {
            this.a = iqa;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            Object obj2 = (Boolean) ajxm.a;
            obj = (Boolean) ajxm.b;
            alev alev = new alev();
            boolean b = gr.a(this.a.b).b();
            boolean d = this.a.c.d();
            boolean j = this.a.c.j();
            Object k = this.a.c.k();
            akcr.a(k, "permissionHelper.locationPermissionState");
            boolean e = this.a.c.e();
            boolean f = this.a.c.f();
            akcr.a(obj2, "notificationEnabled");
            alev.b(obj2.booleanValue());
            alev.h(b);
            alev.a();
            alev.f(d);
            alev.d(j);
            alev.c(k.a);
            alev.i(k.b);
            alev.e(e);
            alev.a(f);
            akcr.a(obj, "userContactsEnabled");
            alev.j(obj.booleanValue());
            alev.b();
            alev.g(this.a.b());
            return alev;
        }
    }

    /* renamed from: iqa$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ iqa a;

        c(iqa iqa) {
            this.a = iqa;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "notificationEnabled");
            alev alev = new alev();
            boolean b = gr.a(this.a.b).b();
            alev.b(bool.booleanValue());
            alev.h(b);
            alev.a();
            alev.f(true);
            alev.d(true);
            alev.c(true);
            alev.e(true);
            alev.a(true);
            alev.b();
            alev.g(this.a.b());
            return alev;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(iqa.class), "notificationPreferences", "getNotificationPreferences()Lcom/snap/notification/api/config/NotificationPreferences;"), new akdc(akde.a(iqa.class), "contactApi", "getContactApi()Lcom/snap/identity/api/ContactApi;")};
    }

    public iqa(Context context, ifs ifs, ajwy<iqm> ajwy, ajwy<seo> ajwy2) {
        akcr.b(context, "context");
        akcr.b(ifs, "permissionHelper");
        akcr.b(ajwy, "contactApiProvider");
        akcr.b(ajwy2, "notificationPreferencesProvider");
        this.b = context;
        this.c = ifs;
        this.d = ajwy;
        this.e = ajxh.a(new d(ajwy2));
    }

    /* Access modifiers changed, original: final */
    public final seo a() {
        return (seo) this.e.b();
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        Object systemService = this.b.getSystemService(MapboxEvent.TYPE_LOCATION);
        if (systemService != null) {
            try {
                return ((LocationManager) systemService).isProviderEnabled("network");
            } catch (Exception unused) {
                return false;
            }
        }
        throw new ajxt("null cannot be cast to non-null type android.location.LocationManager");
    }
}
