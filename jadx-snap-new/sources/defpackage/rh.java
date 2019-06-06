package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: rh */
public abstract class rh<T> extends ri<T> {
    private static final String b = pq.a("BrdcstRcvrCnstrntTrckr");
    private final BroadcastReceiver c = new 1();

    /* renamed from: rh$1 */
    class 1 extends BroadcastReceiver {
        1() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                rh.this.a(intent);
            }
        }
    }

    public rh(Context context) {
        super(context);
    }

    public abstract IntentFilter a();

    public abstract void a(Intent intent);

    public final void c() {
        pq.a().a(b, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.a.registerReceiver(this.c, a());
    }

    public final void d() {
        pq.a().a(b, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.a.unregisterReceiver(this.c);
    }
}
