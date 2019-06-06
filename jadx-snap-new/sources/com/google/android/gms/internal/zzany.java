package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

@zzabh
public abstract class zzany implements Releasable {
    protected Context mContext;
    private String zzddt;
    private WeakReference<zzann> zzdop;

    public zzany(zzann zzann) {
        this.mContext = zzann.getContext();
        this.zzddt = zzbt.zzel().zzl(this.mContext, zzann.zztl().zzcu);
        this.zzdop = new WeakReference(zzann);
    }

    private final void zza(String str, Map<String, String> map) {
        zzann zzann = (zzann) this.zzdop.get();
        if (zzann != null) {
            zzann.zza(str, map);
        }
    }

    private static java.lang.String zzdd(java.lang.String r1) {
        /*
        r0 = r1.hashCode();
        switch(r0) {
            case -1396664534: goto L_0x0064;
            case -1347010958: goto L_0x005a;
            case -918817863: goto L_0x0050;
            case -659376217: goto L_0x0046;
            case -642208130: goto L_0x003c;
            case -354048396: goto L_0x0031;
            case -32082395: goto L_0x0026;
            case 96784904: goto L_0x001c;
            case 580119100: goto L_0x0012;
            case 725497484: goto L_0x0008;
            default: goto L_0x0007;
        };
    L_0x0007:
        goto L_0x006e;
    L_0x0008:
        r0 = "noCacheDir";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x006e;
    L_0x0010:
        r1 = 4;
        goto L_0x006f;
    L_0x0012:
        r0 = "expireFailed";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x006e;
    L_0x001a:
        r1 = 5;
        goto L_0x006f;
    L_0x001c:
        r0 = "error";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x006e;
    L_0x0024:
        r1 = 0;
        goto L_0x006f;
    L_0x0026:
        r0 = "externalAbort";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x006e;
    L_0x002e:
        r1 = 9;
        goto L_0x006f;
    L_0x0031:
        r0 = "sizeExceeded";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x006e;
    L_0x0039:
        r1 = 8;
        goto L_0x006f;
    L_0x003c:
        r0 = "playerFailed";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x006e;
    L_0x0044:
        r1 = 1;
        goto L_0x006f;
    L_0x0046:
        r0 = "contentLengthMissing";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x006e;
    L_0x004e:
        r1 = 3;
        goto L_0x006f;
    L_0x0050:
        r0 = "downloadTimeout";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x006e;
    L_0x0058:
        r1 = 7;
        goto L_0x006f;
    L_0x005a:
        r0 = "inProgress";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x006e;
    L_0x0062:
        r1 = 2;
        goto L_0x006f;
    L_0x0064:
        r0 = "badUrl";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x006e;
    L_0x006c:
        r1 = 6;
        goto L_0x006f;
    L_0x006e:
        r1 = -1;
    L_0x006f:
        r0 = "internal";
        switch(r1) {
            case 0: goto L_0x007d;
            case 1: goto L_0x007d;
            case 2: goto L_0x007d;
            case 3: goto L_0x007d;
            case 4: goto L_0x007b;
            case 5: goto L_0x007b;
            case 6: goto L_0x0078;
            case 7: goto L_0x0078;
            case 8: goto L_0x0075;
            case 9: goto L_0x0075;
            default: goto L_0x0074;
        };
    L_0x0074:
        goto L_0x007d;
    L_0x0075:
        r0 = "policy";
        goto L_0x007d;
    L_0x0078:
        r0 = "network";
        goto L_0x007d;
    L_0x007b:
        r0 = "io";
    L_0x007d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzany.zzdd(java.lang.String):java.lang.String");
    }

    public abstract void abort();

    public void release() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(String str, String str2, int i) {
        zzako.zzaju.post(new zzaoa(this, str, str2, i));
    }

    public final void zza(String str, String str2, String str3, String str4) {
        zzako.zzaju.post(new zzaob(this, str, str2, str3, str4));
    }

    public abstract boolean zzdc(String str);
}
