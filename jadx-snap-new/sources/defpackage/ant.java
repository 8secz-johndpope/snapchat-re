package defpackage;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import defpackage.anr.a;

/* renamed from: ant */
public final class ant implements anr {
    final a a;
    boolean b;
    private final Context c;
    private boolean d;
    private final BroadcastReceiver e = new 1();

    /* renamed from: ant$1 */
    class 1 extends BroadcastReceiver {
        1() {
        }

        public final void onReceive(Context context, Intent intent) {
            boolean z = ant.this.b;
            ant.this.b = ant.a(context);
            if (z != ant.this.b) {
                ant.this.a.a(ant.this.b);
            }
        }
    }

    public ant(Context context, a aVar) {
        this.c = context.getApplicationContext();
        this.a = aVar;
    }

    @SuppressLint({"MissingPermission"})
    static boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void a() {
        if (!this.d) {
            this.b = ant.a(this.c);
            this.c.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = true;
        }
    }

    public final void b() {
        if (this.d) {
            this.c.unregisterReceiver(this.e);
            this.d = false;
        }
    }

    public final void c_() {
    }
}
