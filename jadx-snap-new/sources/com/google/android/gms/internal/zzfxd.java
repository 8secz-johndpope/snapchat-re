package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

public final class zzfxd {
    private static String zzrnh;

    /* JADX WARNING: Missing block: B:34:0x00ab, code skipped:
            if (r6.contains(r10) != false) goto L_0x0072;
     */
    public static java.lang.String zzfk(android.content.Context r10) {
        /*
        r0 = zzrnh;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r0 = r10.getPackageManager();
        r1 = new android.content.Intent;
        r2 = "http://www.example.com";
        r2 = android.net.Uri.parse(r2);
        r3 = "android.intent.action.VIEW";
        r1.<init>(r3, r2);
        r2 = 0;
        r3 = r0.resolveActivity(r1, r2);
        r4 = 0;
        if (r3 == 0) goto L_0x0023;
    L_0x001e:
        r3 = r3.activityInfo;
        r3 = r3.packageName;
        goto L_0x0024;
    L_0x0023:
        r3 = r4;
    L_0x0024:
        r5 = r0.queryIntentActivities(r1, r2);
        r6 = new java.util.ArrayList;
        r6.<init>();
        r5 = r5.iterator();
    L_0x0031:
        r7 = r5.hasNext();
        if (r7 == 0) goto L_0x005c;
    L_0x0037:
        r7 = r5.next();
        r7 = (android.content.pm.ResolveInfo) r7;
        r8 = new android.content.Intent;
        r8.<init>();
        r9 = "android.support.customtabs.action.CustomTabsService";
        r8.setAction(r9);
        r9 = r7.activityInfo;
        r9 = r9.packageName;
        r8.setPackage(r9);
        r8 = r0.resolveService(r8, r2);
        if (r8 == 0) goto L_0x0031;
    L_0x0054:
        r7 = r7.activityInfo;
        r7 = r7.packageName;
        r6.add(r7);
        goto L_0x0031;
    L_0x005c:
        r0 = r6.isEmpty();
        if (r0 == 0) goto L_0x0065;
    L_0x0062:
        zzrnh = r4;
        goto L_0x00ae;
    L_0x0065:
        r0 = r6.size();
        r4 = 1;
        if (r0 != r4) goto L_0x0075;
    L_0x006c:
        r10 = r6.get(r2);
        r10 = (java.lang.String) r10;
    L_0x0072:
        zzrnh = r10;
        goto L_0x00ae;
    L_0x0075:
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 != 0) goto L_0x008a;
    L_0x007b:
        r10 = zzj(r10, r1);
        if (r10 != 0) goto L_0x008a;
    L_0x0081:
        r10 = r6.contains(r3);
        if (r10 == 0) goto L_0x008a;
    L_0x0087:
        zzrnh = r3;
        goto L_0x00ae;
    L_0x008a:
        r10 = "com.android.chrome";
        r0 = r6.contains(r10);
        if (r0 == 0) goto L_0x0093;
    L_0x0092:
        goto L_0x0072;
    L_0x0093:
        r10 = "com.chrome.beta";
        r0 = r6.contains(r10);
        if (r0 == 0) goto L_0x009c;
    L_0x009b:
        goto L_0x0092;
    L_0x009c:
        r10 = "com.chrome.dev";
        r0 = r6.contains(r10);
        if (r0 == 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x0092;
    L_0x00a5:
        r10 = "com.google.android.apps.chrome";
        r0 = r6.contains(r10);
        if (r0 == 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x0092;
    L_0x00ae:
        r10 = zzrnh;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfxd.zzfk(android.content.Context):java.lang.String");
    }

    private static boolean zzj(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities != null) {
                if (queryIntentActivities.size() != 0) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        IntentFilter intentFilter = resolveInfo.filter;
                        if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
    }
}
