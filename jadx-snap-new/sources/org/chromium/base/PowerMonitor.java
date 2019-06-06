package org.chromium.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.akon;
import org.chromium.base.annotations.CalledByNative;

public class PowerMonitor {
    private static PowerMonitor a;
    private static /* synthetic */ boolean c = (PowerMonitor.class.desiredAssertionStatus() ^ 1);
    private boolean b;

    private PowerMonitor() {
    }

    static void a(Intent intent) {
        if (c || a != null) {
            int intExtra = intent.getIntExtra("plugged", -1);
            PowerMonitor powerMonitor = a;
            boolean z = true;
            if (intExtra == 2 || intExtra == 1) {
                z = false;
            }
            powerMonitor.b = z;
            nativeOnBatteryChargingChanged();
            return;
        }
        throw new AssertionError();
    }

    @CalledByNative
    private static boolean isBatteryPower() {
        if (a == null) {
            if (!ThreadUtils.a && !ThreadUtils.b()) {
                throw new AssertionError("Must be called on the UI thread.");
            } else if (a == null) {
                Context context = akon.a;
                a = new PowerMonitor();
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    a(registerReceiver);
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                context.registerReceiver(new BroadcastReceiver() {
                    public final void onReceive(Context context, Intent intent) {
                        PowerMonitor.a(intent);
                    }
                }, intentFilter);
            }
        }
        return a.b;
    }

    private static native void nativeOnBatteryChargingChanged();
}
