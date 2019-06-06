package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;

/* renamed from: rj */
public final class rj extends ri<qu> {
    static final String b = pq.a("NetworkStateTracker");
    private final ConnectivityManager c = ((ConnectivityManager) this.a.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY));
    private b d;
    private a e;

    /* renamed from: rj$b */
    class b extends NetworkCallback {
        b() {
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            pq.a().a(rj.b, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            rj rjVar = rj.this;
            rjVar.a((Object) rjVar.b());
        }

        public final void onLost(Network network) {
            pq.a().a(rj.b, "Network connection lost", new Throwable[0]);
            rj rjVar = rj.this;
            rjVar.a((Object) rjVar.b());
        }
    }

    /* renamed from: rj$a */
    class a extends BroadcastReceiver {
        a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                pq.a().a(rj.b, "Network broadcast received", new Throwable[0]);
                rj rjVar = rj.this;
                rjVar.a((Object) rjVar.b());
            }
        }
    }

    public rj(Context context) {
        super(context);
        if (rj.e()) {
            this.d = new b();
        } else {
            this.e = new a();
        }
    }

    private static boolean e() {
        return VERSION.SDK_INT >= 24;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: a */
    public final qu b() {
        boolean z;
        boolean a;
        NetworkInfo activeNetworkInfo = this.c.getActiveNetworkInfo();
        boolean z2 = true;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (VERSION.SDK_INT >= 23) {
            NetworkCapabilities networkCapabilities = this.c.getNetworkCapabilities(this.c.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                z = true;
                a = ih.a(this.c);
                if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
                    z2 = false;
                }
                return new qu(z3, z, a, z2);
            }
        }
        z = false;
        a = ih.a(this.c);
        z2 = false;
        return new qu(z3, z, a, z2);
    }

    public final void c() {
        if (rj.e()) {
            pq.a().a(b, "Registering network callback", new Throwable[0]);
            this.c.registerDefaultNetworkCallback(this.d);
            return;
        }
        pq.a().a(b, "Registering broadcast receiver", new Throwable[0]);
        this.a.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void d() {
        if (rj.e()) {
            try {
                pq.a().a(b, "Unregistering network callback", new Throwable[0]);
                this.c.unregisterNetworkCallback(this.d);
                return;
            } catch (IllegalArgumentException e) {
                pq.a().c(b, "Received exception while unregistering network callback", e);
                return;
            }
        }
        pq.a().a(b, "Unregistering broadcast receiver", new Throwable[0]);
        this.a.unregisterReceiver(this.e);
    }
}
