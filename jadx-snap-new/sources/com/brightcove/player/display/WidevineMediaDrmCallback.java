package com.brightcove.player.display;

import android.annotation.TargetApi;
import android.text.TextUtils;
import defpackage.beg.a;
import defpackage.beg.c;
import defpackage.bek;
import defpackage.bku;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

@TargetApi(18)
public class WidevineMediaDrmCallback implements bek {
    public static final String DEFAULT_URL = "defaultUrl";
    private static final String a = "WidevineMediaDrmCallback";
    private static final Map<String, String> b = Collections.singletonMap("Content-Type", "application/octet-stream");
    private Map<String, Object> c;
    private Map<String, Object> d;

    public WidevineMediaDrmCallback(Map<String, Object> map, Map<String, Object> map2) {
        this.c = map;
        this.d = map2;
    }

    public byte[] executeKeyRequest(UUID uuid, a aVar) {
        String b = aVar.b();
        if (TextUtils.isEmpty(b)) {
            b = getDefaultUrl();
        }
        return bku.a(b, aVar.a(), b);
    }

    public byte[] executeProvisionRequest(UUID uuid, c cVar) {
        String b = cVar.b();
        if (TextUtils.isEmpty(b)) {
            b = getDefaultUrl();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b);
        stringBuilder.append("&signedRequest=");
        stringBuilder.append(new String(cVar.a()));
        return bku.a(stringBuilder.toString(), null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    public java.lang.String getDefaultUrl() {
        /*
        r3 = this;
        r0 = r3.d;
        r1 = "key_systems";
        r0 = r0.get(r1);
        r0 = (java.util.Map) r0;
        if (r0 == 0) goto L_0x001f;
    L_0x000c:
        r1 = "com.widevine.alpha";
        r0 = r0.get(r1);
        r0 = (java.util.Map) r0;
        if (r0 == 0) goto L_0x001f;
    L_0x0016:
        r1 = "license_url";
        r0 = r0.get(r1);
        r0 = (java.lang.String) r0;
        goto L_0x0020;
    L_0x001f:
        r0 = 0;
    L_0x0020:
        if (r0 != 0) goto L_0x002c;
    L_0x0022:
        r0 = r3.c;
        r1 = "defaultUrl";
        r0 = r0.get(r1);
        r0 = (java.lang.String) r0;
    L_0x002c:
        if (r0 != 0) goto L_0x0050;
    L_0x002e:
        r1 = r3.c;
        r2 = "id";
        r1 = r1.get(r2);
        r1 = (java.lang.String) r1;
        r2 = android.text.TextUtils.isEmpty(r1);
        if (r2 == 0) goto L_0x0046;
    L_0x003e:
        r1 = a;
        r2 = "Video ID required for Brightcove Widevine Modular videos.";
        android.util.Log.e(r1, r2);
        goto L_0x0050;
    L_0x0046:
        r0 = java.lang.String.valueOf(r1);
        r1 = "https://wvlic.brightcove.com/proxy/";
        r0 = r1.concat(r0);
    L_0x0050:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.display.WidevineMediaDrmCallback.getDefaultUrl():java.lang.String");
    }
}
