package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.mapbox.services.android.telemetry.permissions.PermissionsManager;
import java.util.Calendar;

/* renamed from: lv */
final class lv {
    private static lv a;
    private final Context b;
    private final LocationManager c;
    private final a d = new a();

    /* renamed from: lv$a */
    static class a {
        boolean a;
        long b;
        long c;
        long d;
        long e;
        long f;

        a() {
        }
    }

    private lv(Context context, LocationManager locationManager) {
        this.b = context;
        this.c = locationManager;
    }

    private Location a(String str) {
        try {
            if (this.c.isProviderEnabled(str)) {
                return this.c.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    static lv a(Context context) {
        if (a == null) {
            context = context.getApplicationContext();
            a = new lv(context, (LocationManager) context.getSystemService(MapboxEvent.TYPE_LOCATION));
        }
        return a;
    }

    private void a(Location location) {
        long j;
        a aVar = this.d;
        long currentTimeMillis = System.currentTimeMillis();
        lu a = lu.a();
        lu luVar = a;
        luVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.a;
        luVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.c == 1;
        long j3 = a.b;
        long j4 = j2;
        j2 = a.a;
        long j5 = j3;
        boolean z2 = z;
        a.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        j3 = a.b;
        if (j5 == -1 || j2 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = currentTimeMillis > j2 ? j3 : currentTimeMillis > j5 ? j2 : j5;
            j += 60000;
        }
        aVar.a = z2;
        aVar.b = j4;
        aVar.c = j5;
        aVar.d = j2;
        aVar.e = j3;
        aVar.f = j;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location a = he.a(this.b, PermissionsManager.COARSE_LOCATION_PERMISSION) == 0 ? a("network") : null;
        if (he.a(this.b, PermissionsManager.FINE_LOCATION_PERMISSION) == 0) {
            location = a("gps");
        }
        return (location == null || a == null) ? location != null ? location : a : location.getTime() > a.getTime() ? location : a;
    }

    private boolean c() {
        return this.d.f > System.currentTimeMillis();
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        a aVar = this.d;
        if (c()) {
            return aVar.a;
        }
        Location b = b();
        if (b != null) {
            a(b);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
