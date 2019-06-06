package com.looksery.sdk;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;

public class ProfilingSessionReceiver extends BroadcastReceiver {
    public static final String EXTRA_BOOLEAN_FIELD_ACTIVE = "active";
    public static final String EXTRA_BOOLEAN_FIELD_RUNTIME_REPORT = "runtimeReport";
    public static final String EXTRA_STRING_FIELD_FILTER = "filter";
    public static final String EXTRA_STRING_FIELD_MODE = "mode";
    private Handler intentHandler = null;

    public ProfilingSessionReceiver() {
        HandlerThread handlerThread = new HandlerThread("ProfilingIntents");
        handlerThread.start();
        this.intentHandler = new Handler(handlerThread.getLooper());
    }

    private static void runTimeReportCheck(Intent intent) {
        String str = EXTRA_BOOLEAN_FIELD_RUNTIME_REPORT;
        if (intent.hasExtra(str)) {
            if (intent.getBooleanExtra(str, false)) {
                ProfilingEngine.beginRuntimeReport();
                return;
            }
            ProfilingEngine.endRuntimeReport();
        }
    }

    public void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        if (intent.hasExtra(EXTRA_BOOLEAN_FIELD_ACTIVE) || intent.hasExtra(EXTRA_BOOLEAN_FIELD_RUNTIME_REPORT) || intent.hasExtra(EXTRA_STRING_FIELD_MODE)) {
            final PendingResult goAsync = goAsync();
            this.intentHandler.post(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:15:0x0059  */
                public void run() {
                    /*
                    r6 = this;
                    r0 = r4;
                    com.looksery.sdk.ProfilingEngine.create(r0);
                    r0 = r5;
                    r1 = "active";
                    r0 = r0.hasExtra(r1);
                    r2 = 0;
                    if (r0 == 0) goto L_0x004a;
                L_0x0010:
                    r0 = r5;
                    r0 = r0.getBooleanExtra(r1, r2);
                    r1 = "filter";
                    if (r0 == 0) goto L_0x0035;
                L_0x001a:
                    r0 = r5;
                    com.looksery.sdk.ProfilingSessionReceiver.runTimeReportCheck(r0);
                    r0 = r5;
                    r0 = r0.hasExtra(r1);
                    if (r0 == 0) goto L_0x0031;
                L_0x0027:
                    r0 = r5;
                    r0 = r0.getStringExtra(r1);
                    com.looksery.sdk.ProfilingEngine.enableFilter(r0);
                    goto L_0x004f;
                L_0x0031:
                    com.looksery.sdk.ProfilingEngine.startSession();
                    goto L_0x004f;
                L_0x0035:
                    r0 = r5;
                    r0 = r0.hasExtra(r1);
                    if (r0 == 0) goto L_0x0047;
                L_0x003d:
                    r0 = r5;
                    r0 = r0.getStringExtra(r1);
                    com.looksery.sdk.ProfilingEngine.disableFilter(r0);
                    goto L_0x004a;
                L_0x0047:
                    com.looksery.sdk.ProfilingEngine.endSession();
                L_0x004a:
                    r0 = r5;
                    com.looksery.sdk.ProfilingSessionReceiver.runTimeReportCheck(r0);
                L_0x004f:
                    r0 = r5;
                    r1 = "mode";
                    r0 = r0.hasExtra(r1);
                    if (r0 == 0) goto L_0x0093;
                L_0x0059:
                    r0 = r5;
                    r0 = r0.getStringExtra(r1);
                    r0 = r0.toLowerCase();
                    r1 = -1;
                    r3 = r0.hashCode();
                    r4 = 3443924; // 0x348cd4 float:4.825965E-39 double:1.7015245E-317;
                    r5 = 1;
                    if (r3 == r4) goto L_0x007e;
                L_0x006e:
                    r2 = 1976461976; // 0x75ce6a98 float:5.233277E32 double:9.765019627E-315;
                    if (r3 == r2) goto L_0x0074;
                L_0x0073:
                    goto L_0x0087;
                L_0x0074:
                    r2 = "systrace";
                    r0 = r0.equals(r2);
                    if (r0 == 0) goto L_0x0087;
                L_0x007c:
                    r1 = 1;
                    goto L_0x0087;
                L_0x007e:
                    r3 = "plog";
                    r0 = r0.equals(r3);
                    if (r0 == 0) goto L_0x0087;
                L_0x0086:
                    r1 = 0;
                L_0x0087:
                    if (r1 == 0) goto L_0x0090;
                L_0x0089:
                    if (r1 == r5) goto L_0x008c;
                L_0x008b:
                    goto L_0x0093;
                L_0x008c:
                    com.looksery.sdk.ProfilingEngine.switchToSystraceRunningMode();
                    goto L_0x0093;
                L_0x0090:
                    com.looksery.sdk.ProfilingEngine.switchToPLogRunningMode();
                L_0x0093:
                    r0 = r0;
                    r0.finish();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.ProfilingSessionReceiver$AnonymousClass1.run():void");
                }
            });
        }
    }
}
