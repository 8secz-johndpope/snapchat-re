package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ast */
final class ast {
    static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    static final IntentFilter b = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
    static final IntentFilter c = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
    final AtomicBoolean d = new AtomicBoolean(false);
    final Context e;
    final BroadcastReceiver f = new 2();
    final BroadcastReceiver g = new 1();
    boolean h;

    /* renamed from: ast$1 */
    class 1 extends BroadcastReceiver {
        1() {
        }

        public final void onReceive(Context context, Intent intent) {
            ast.this.h = true;
        }
    }

    /* renamed from: ast$2 */
    class 2 extends BroadcastReceiver {
        2() {
        }

        public final void onReceive(Context context, Intent intent) {
            ast.this.h = false;
        }
    }

    public ast(Context context) {
        this.e = context;
    }
}
