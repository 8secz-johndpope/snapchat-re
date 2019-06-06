package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.StorageNotLowProxy;
import defpackage.pq;
import defpackage.sf;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    private static final String a = pq.a("ConstrntProxyUpdtRecvr");

    public void onReceive(Context context, Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            pq.a().a(a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false)), Boolean.valueOf(intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false)), Boolean.valueOf(intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false)), Boolean.valueOf(intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false))}), new Throwable[0]);
            sf.a(context, BatteryNotLowProxy.class, r0);
            sf.a(context, BatteryChargingProxy.class, r1);
            sf.a(context, StorageNotLowProxy.class, r4);
            sf.a(context, NetworkStateProxy.class, r11);
            return;
        }
        pq.a().a(a, String.format("Ignoring unknown action %s", new Object[]{intent != null ? intent.getAction() : null}), new Throwable[0]);
    }
}
