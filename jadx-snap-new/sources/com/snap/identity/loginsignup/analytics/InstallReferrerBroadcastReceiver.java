package com.snap.identity.loginsignup.analytics;

import android.content.BroadcastReceiver;

public final class InstallReferrerBroadcastReceiver extends BroadcastReceiver {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    /* JADX WARNING: Missing block: B:3:0x000d, code skipped:
            if (r3 == null) goto L_0x000f;
     */
    public final void onReceive(android.content.Context r2, android.content.Intent r3) {
        /*
        r1 = this;
        r0 = "context";
        defpackage.akcr.b(r2, r0);
        r2 = "referrer";
        if (r3 == 0) goto L_0x000f;
    L_0x0009:
        r3 = r3.getStringExtra(r2);
        if (r3 != 0) goto L_0x0011;
    L_0x000f:
        r3 = "";
    L_0x0011:
        defpackage.akcr.b(r3, r2);
        r2 = defpackage.jbj.g;
        r2.a(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.analytics.InstallReferrerBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
