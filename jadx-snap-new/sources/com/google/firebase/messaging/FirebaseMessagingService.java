package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.iid.zzb;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.cbq;
import defpackage.cbu;
import defpackage.cbz;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class FirebaseMessagingService extends zzb {
    private static final Queue<String> b = new ArrayDeque(10);

    public static void a(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    public static boolean b(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return SCamera.CAMERA_ID_FRONT.equals(bundle.getString("google.c.a.e"));
    }

    public final Intent a(Intent intent) {
        return (Intent) cbq.a().b.poll();
    }

    public void a(cbu cbu) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    public final void b(android.content.Intent r12) {
        /*
        r11 = this;
        r0 = r12.getAction();
        if (r0 != 0) goto L_0x0008;
    L_0x0006:
        r0 = "";
    L_0x0008:
        r1 = r0.hashCode();
        r2 = 75300319; // 0x47cfddf float:2.973903E-36 double:3.72033007E-316;
        r3 = -1;
        r4 = 0;
        r5 = 1;
        if (r1 == r2) goto L_0x0024;
    L_0x0014:
        r2 = 366519424; // 0x15d8a480 float:8.750124E-26 double:1.81084656E-315;
        if (r1 == r2) goto L_0x001a;
    L_0x0019:
        goto L_0x002e;
    L_0x001a:
        r1 = "com.google.android.c2dm.intent.RECEIVE";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x002e;
    L_0x0022:
        r0 = 0;
        goto L_0x002f;
    L_0x0024:
        r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x002e;
    L_0x002c:
        r0 = 1;
        goto L_0x002f;
    L_0x002e:
        r0 = -1;
    L_0x002f:
        r1 = "FirebaseMessaging";
        if (r0 == 0) goto L_0x0063;
    L_0x0033:
        if (r0 == r5) goto L_0x0053;
    L_0x0035:
        r0 = "Unknown intent action: ";
        r12 = r12.getAction();
        r12 = java.lang.String.valueOf(r12);
        r2 = r12.length();
        if (r2 == 0) goto L_0x004a;
    L_0x0045:
        r12 = r0.concat(r12);
        goto L_0x004f;
    L_0x004a:
        r12 = new java.lang.String;
        r12.<init>(r0);
    L_0x004f:
        android.util.Log.d(r1, r12);
        goto L_0x0062;
    L_0x0053:
        r0 = r12.getExtras();
        r0 = b(r0);
        if (r0 == 0) goto L_0x0062;
    L_0x005d:
        r0 = "_nd";
        defpackage.cbz.a(r11, r0, r12);
    L_0x0062:
        return;
    L_0x0063:
        r0 = "google.message_id";
        r2 = r12.getStringExtra(r0);
        r6 = android.text.TextUtils.isEmpty(r2);
        r7 = 3;
        if (r6 == 0) goto L_0x0072;
    L_0x0070:
        r6 = 0;
        goto L_0x00b1;
    L_0x0072:
        r6 = b;
        r6 = r6.contains(r2);
        if (r6 == 0) goto L_0x009c;
    L_0x007a:
        r6 = android.util.Log.isLoggable(r1, r7);
        if (r6 == 0) goto L_0x009a;
    L_0x0080:
        r6 = "Received duplicate message: ";
        r8 = java.lang.String.valueOf(r2);
        r9 = r8.length();
        if (r9 == 0) goto L_0x0091;
    L_0x008c:
        r6 = r6.concat(r8);
        goto L_0x0097;
    L_0x0091:
        r8 = new java.lang.String;
        r8.<init>(r6);
        r6 = r8;
    L_0x0097:
        android.util.Log.d(r1, r6);
    L_0x009a:
        r6 = 1;
        goto L_0x00b1;
    L_0x009c:
        r6 = b;
        r6 = r6.size();
        r8 = 10;
        if (r6 < r8) goto L_0x00ab;
    L_0x00a6:
        r6 = b;
        r6.remove();
    L_0x00ab:
        r6 = b;
        r6.add(r2);
        goto L_0x0070;
    L_0x00b1:
        if (r6 != 0) goto L_0x0196;
    L_0x00b3:
        r6 = "message_type";
        r6 = r12.getStringExtra(r6);
        r8 = "gcm";
        if (r6 != 0) goto L_0x00be;
    L_0x00bd:
        r6 = r8;
    L_0x00be:
        r9 = r6.hashCode();
        r10 = 2;
        switch(r9) {
            case -2062414158: goto L_0x00e3;
            case 102161: goto L_0x00db;
            case 814694033: goto L_0x00d1;
            case 814800675: goto L_0x00c7;
            default: goto L_0x00c6;
        };
    L_0x00c6:
        goto L_0x00ec;
    L_0x00c7:
        r8 = "send_event";
        r8 = r6.equals(r8);
        if (r8 == 0) goto L_0x00ec;
    L_0x00cf:
        r3 = 2;
        goto L_0x00ec;
    L_0x00d1:
        r8 = "send_error";
        r8 = r6.equals(r8);
        if (r8 == 0) goto L_0x00ec;
    L_0x00d9:
        r3 = 3;
        goto L_0x00ec;
    L_0x00db:
        r8 = r6.equals(r8);
        if (r8 == 0) goto L_0x00ec;
    L_0x00e1:
        r3 = 0;
        goto L_0x00ec;
    L_0x00e3:
        r8 = "deleted_messages";
        r8 = r6.equals(r8);
        if (r8 == 0) goto L_0x00ec;
    L_0x00eb:
        r3 = 1;
    L_0x00ec:
        if (r3 == 0) goto L_0x012b;
    L_0x00ee:
        if (r3 == r5) goto L_0x0196;
    L_0x00f0:
        if (r3 == r10) goto L_0x0127;
    L_0x00f2:
        if (r3 == r7) goto L_0x0110;
    L_0x00f4:
        r12 = "Received message with unknown type: ";
        r3 = java.lang.String.valueOf(r6);
        r4 = r3.length();
        if (r4 == 0) goto L_0x0105;
    L_0x0100:
        r12 = r12.concat(r3);
        goto L_0x010b;
    L_0x0105:
        r3 = new java.lang.String;
        r3.<init>(r12);
        r12 = r3;
    L_0x010b:
        android.util.Log.w(r1, r12);
        goto L_0x0196;
    L_0x0110:
        r1 = r12.getStringExtra(r0);
        if (r1 != 0) goto L_0x011b;
    L_0x0116:
        r1 = "message_id";
        r12.getStringExtra(r1);
    L_0x011b:
        r1 = new cbv;
        r3 = "error";
        r12 = r12.getStringExtra(r3);
        r1.<init>(r12);
        goto L_0x0196;
    L_0x0127:
        r12.getStringExtra(r0);
        goto L_0x0196;
    L_0x012b:
        r1 = r12.getExtras();
        r1 = b(r1);
        if (r1 == 0) goto L_0x0150;
    L_0x0135:
        r1 = "google.c.a.abt";
        r1 = r12.getStringExtra(r1);
        if (r1 == 0) goto L_0x014b;
    L_0x013d:
        r1 = android.util.Base64.decode(r1, r4);
        r3 = new cbx;
        r3.<init>();
        r6 = "fcm";
        defpackage.cby.a(r11, r6, r1, r3);
    L_0x014b:
        r1 = "_nr";
        defpackage.cbz.a(r11, r1, r12);
    L_0x0150:
        r1 = r12.getExtras();
        if (r1 != 0) goto L_0x015b;
    L_0x0156:
        r1 = new android.os.Bundle;
        r1.<init>();
    L_0x015b:
        r3 = "android.support.content.wakelockid";
        r1.remove(r3);
        r3 = "gcm.n.e";
        r3 = defpackage.cbw.a(r1, r3);
        r6 = "1";
        r3 = r6.equals(r3);
        if (r3 != 0) goto L_0x0176;
    L_0x016e:
        r3 = "gcm.n.icon";
        r3 = defpackage.cbw.a(r1, r3);
        if (r3 == 0) goto L_0x0177;
    L_0x0176:
        r4 = 1;
    L_0x0177:
        if (r4 == 0) goto L_0x018e;
    L_0x0179:
        r3 = defpackage.cbw.a(r11);
        r3 = r3.a(r1);
        if (r3 != 0) goto L_0x0196;
    L_0x0183:
        r3 = b(r1);
        if (r3 == 0) goto L_0x018e;
    L_0x0189:
        r3 = "_nf";
        defpackage.cbz.a(r11, r3, r12);
    L_0x018e:
        r12 = new cbu;
        r12.<init>(r1);
        r11.a(r12);
    L_0x0196:
        r12 = android.text.TextUtils.isEmpty(r2);
        if (r12 != 0) goto L_0x01b4;
    L_0x019c:
        r12 = new android.os.Bundle;
        r12.<init>();
        r12.putString(r0, r2);
        r0 = defpackage.cbc.a(r11);
        r1 = new cbj;
        r2 = r0.a();
        r1.<init>(r2, r12);
        r0.a(r1);
    L_0x01b4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.b(android.content.Intent):void");
    }

    public final boolean d(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        String str = "FirebaseMessaging";
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (CanceledException unused) {
                Log.e(str, "Notification pending intent canceled");
            }
        }
        if (b(intent.getExtras())) {
            if (intent != null) {
                if (SCamera.CAMERA_ID_FRONT.equals(intent.getStringExtra("google.c.a.tc"))) {
                    AppMeasurement a = cbz.a(this);
                    if (Log.isLoggable(str, 3)) {
                        Log.d(str, "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (a != null) {
                        str = intent.getStringExtra("google.c.a.c_id");
                        String str2 = "fcm";
                        a.setUserPropertyInternal(str2, "_ln", str);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "Firebase");
                        bundle.putString("medium", "notification");
                        bundle.putString("campaign", str);
                        a.logEventInternal(str2, "_cmp", bundle);
                    } else {
                        Log.w(str, "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Received event with track-conversion=false. Do not set user property");
                }
            }
            cbz.a(this, "_no", intent);
        }
        return true;
    }
}
