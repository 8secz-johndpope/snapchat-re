package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

/* renamed from: rf */
public final class rf extends rh<Boolean> {
    private static final String b = pq.a("BatteryChrgTracker");

    public rf(Context context) {
        super(context);
    }

    public final IntentFilter a() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    public final void a(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            Object obj;
            pq.a().a(b, String.format("Received %s", new Object[]{action}), new Throwable[0]);
            int i = -1;
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        i = 3;
                        break;
                    }
                    break;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        i = 1;
                        break;
                    }
                    break;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        i = 0;
                        break;
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        i = 2;
                        break;
                    }
                    break;
            }
            if (i != 0) {
                if (i == 1) {
                    obj = Boolean.FALSE;
                    a(obj);
                } else if (i != 2) {
                    if (i == 3) {
                        a((Object) Boolean.FALSE);
                    }
                    return;
                }
            }
            obj = Boolean.TRUE;
            a(obj);
        }
    }

    /* JADX WARNING: Missing block: B:9:0x0031, code skipped:
            if (r0 != 5) goto L_0x003e;
     */
    /* JADX WARNING: Missing block: B:12:0x003b, code skipped:
            if (r0.getIntExtra("plugged", 0) != 0) goto L_0x0033;
     */
    public final /* synthetic */ java.lang.Object b() {
        /*
        r5 = this;
        r0 = new android.content.IntentFilter;
        r1 = "android.intent.action.BATTERY_CHANGED";
        r0.<init>(r1);
        r1 = r5.a;
        r2 = 0;
        r0 = r1.registerReceiver(r2, r0);
        r1 = 0;
        if (r0 != 0) goto L_0x001f;
    L_0x0011:
        r0 = defpackage.pq.a();
        r3 = b;
        r1 = new java.lang.Throwable[r1];
        r4 = "getInitialState - null intent received";
        r0.c(r3, r4, r1);
        return r2;
    L_0x001f:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 23;
        r4 = 1;
        if (r2 < r3) goto L_0x0035;
    L_0x0026:
        r2 = -1;
        r3 = "status";
        r0 = r0.getIntExtra(r3, r2);
        r2 = 2;
        if (r0 == r2) goto L_0x0033;
    L_0x0030:
        r2 = 5;
        if (r0 != r2) goto L_0x003e;
    L_0x0033:
        r1 = 1;
        goto L_0x003e;
    L_0x0035:
        r2 = "plugged";
        r0 = r0.getIntExtra(r2, r1);
        if (r0 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0033;
    L_0x003e:
        r0 = java.lang.Boolean.valueOf(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf.b():java.lang.Object");
    }
}
