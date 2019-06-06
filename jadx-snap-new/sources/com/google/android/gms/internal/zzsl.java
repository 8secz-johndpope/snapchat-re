package com.google.android.gms.internal;

public abstract class zzsl extends zzew implements zzsk {
    public zzsl() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: Missing block: B:13:0x004a, code skipped:
            r4.writeNoException();
     */
    /* JADX WARNING: Missing block: B:22:0x007b, code skipped:
            r4.writeNoException();
            com.google.android.gms.internal.zzex.zza(r4, r2);
     */
    /* JADX WARNING: Missing block: B:26:0x0096, code skipped:
            r4.writeNoException();
            r4.writeString(r2);
     */
    /* JADX WARNING: Missing block: B:27:0x009c, code skipped:
            return true;
     */
    public boolean onTransact(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
        r1 = this;
        r5 = r1.zza(r2, r3, r4, r5);
        r0 = 1;
        if (r5 == 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        switch(r2) {
            case 2: goto L_0x0092;
            case 3: goto L_0x0087;
            case 4: goto L_0x0082;
            case 5: goto L_0x0077;
            case 6: goto L_0x0072;
            case 7: goto L_0x006d;
            case 8: goto L_0x0062;
            case 9: goto L_0x005d;
            case 10: goto L_0x0058;
            case 11: goto L_0x0053;
            case 12: goto L_0x004e;
            case 13: goto L_0x0047;
            case 14: goto L_0x0042;
            case 15: goto L_0x0036;
            case 16: goto L_0x0023;
            case 17: goto L_0x0017;
            case 18: goto L_0x0012;
            case 19: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = 0;
        return r2;
    L_0x000d:
        r2 = r1.zzkh();
        goto L_0x007b;
    L_0x0012:
        r2 = r1.zzkd();
        goto L_0x007b;
    L_0x0017:
        r2 = android.os.Bundle.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (android.os.Bundle) r2;
        r1.reportTouchEvent(r2);
        goto L_0x004a;
    L_0x0023:
        r2 = android.os.Bundle.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (android.os.Bundle) r2;
        r2 = r1.recordImpression(r2);
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zza(r4, r2);
        goto L_0x009c;
    L_0x0036:
        r2 = android.os.Bundle.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (android.os.Bundle) r2;
        r1.performClick(r2);
        goto L_0x004a;
    L_0x0042:
        r2 = r1.zzki();
        goto L_0x007b;
    L_0x0047:
        r1.destroy();
    L_0x004a:
        r4.writeNoException();
        goto L_0x009c;
    L_0x004e:
        r2 = r1.getMediationAdapterClassName();
        goto L_0x0096;
    L_0x0053:
        r2 = r1.getVideoController();
        goto L_0x007b;
    L_0x0058:
        r2 = r1.getPrice();
        goto L_0x0096;
    L_0x005d:
        r2 = r1.getStore();
        goto L_0x0096;
    L_0x0062:
        r2 = r1.getStarRating();
        r4.writeNoException();
        r4.writeDouble(r2);
        goto L_0x009c;
    L_0x006d:
        r2 = r1.getAdvertiser();
        goto L_0x0096;
    L_0x0072:
        r2 = r1.getCallToAction();
        goto L_0x0096;
    L_0x0077:
        r2 = r1.zzkc();
    L_0x007b:
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zza(r4, r2);
        goto L_0x009c;
    L_0x0082:
        r2 = r1.getBody();
        goto L_0x0096;
    L_0x0087:
        r2 = r1.getImages();
        r4.writeNoException();
        r4.writeList(r2);
        goto L_0x009c;
    L_0x0092:
        r2 = r1.getHeadline();
    L_0x0096:
        r4.writeNoException();
        r4.writeString(r2);
    L_0x009c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzsl.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
