package defpackage;

import android.content.ContentResolver;
import android.location.LocationManager;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: nbw */
public class nbw implements nbv {
    final ajxe a;
    private final ajxe b = ajxh.a(c.a);
    private final ajxe c = ajxh.a(b.a);

    /* renamed from: nbw$c */
    static final class c extends akcs implements akbk<LocationManager> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = AppContext.get().getSystemService(MapboxEvent.TYPE_LOCATION);
            if (systemService != null) {
                return (LocationManager) systemService;
            }
            throw new ajxt("null cannot be cast to non-null type android.location.LocationManager");
        }
    }

    /* renamed from: nbw$b */
    static final class b extends akcs implements akbk<ContentResolver> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = AppContext.get();
            akcr.a(obj, "AppContext.get()");
            return obj.getContentResolver();
        }
    }

    /* renamed from: nbw$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: nbw$d */
    static final class d extends akcs implements akbk<nce> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (nce) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(nbw.class), "locationPreferences", "getLocationPreferences()Lcom/snap/location/LocationPreferences;"), new akdc(akde.a(nbw.class), "locationManager", "getLocationManager()Landroid/location/LocationManager;"), new akdc(akde.a(nbw.class), "contentResolver", "getContentResolver()Landroid/content/ContentResolver;")};
        a aVar = new a();
    }

    public nbw(ajwy<nce> ajwy) {
        akcr.b(ajwy, "locationPreferencesProvider");
        this.a = ajxh.a(new d(ajwy));
    }

    private final LocationManager c() {
        return (LocationManager) this.b.b();
    }

    private boolean d() {
        try {
            return c().isProviderEnabled("gps");
        } catch (RuntimeException unused) {
            return false;
        }
    }

    private boolean e() {
        try {
            return c().isProviderEnabled("network");
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public final boolean a() {
        try {
            return Secure.getInt((ContentResolver) this.c.b(), "location_mode") == 3;
        } catch (SettingNotFoundException unused) {
            return e();
        }
    }

    public final boolean b() {
        return d() || e();
    }
}
