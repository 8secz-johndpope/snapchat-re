package com.google.android.gms.internal;

public abstract class zzrl extends zzew implements zzrk {
    public zzrl() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* JADX WARNING: Missing block: B:14:0x004f, code skipped:
            r4.writeNoException();
     */
    /* JADX WARNING: Missing block: B:22:0x0081, code skipped:
            r4.writeNoException();
            r4.writeString(r2);
     */
    /* JADX WARNING: Missing block: B:24:0x008c, code skipped:
            r4.writeNoException();
            com.google.android.gms.internal.zzex.zza(r4, r2);
     */
    /* JADX WARNING: Missing block: B:25:0x0092, code skipped:
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
            case 2: goto L_0x0088;
            case 3: goto L_0x007d;
            case 4: goto L_0x0072;
            case 5: goto L_0x006d;
            case 6: goto L_0x0068;
            case 7: goto L_0x0063;
            case 8: goto L_0x005e;
            case 9: goto L_0x0053;
            case 10: goto L_0x004c;
            case 11: goto L_0x0047;
            case 12: goto L_0x003b;
            case 13: goto L_0x0028;
            case 14: goto L_0x001c;
            case 15: goto L_0x0017;
            case 16: goto L_0x0012;
            case 17: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = 0;
        return r2;
    L_0x000d:
        r2 = r1.getMediationAdapterClassName();
        goto L_0x0081;
    L_0x0012:
        r2 = r1.zzkh();
        goto L_0x008c;
    L_0x0017:
        r2 = r1.zzki();
        goto L_0x008c;
    L_0x001c:
        r2 = android.os.Bundle.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (android.os.Bundle) r2;
        r1.reportTouchEvent(r2);
        goto L_0x004f;
    L_0x0028:
        r2 = android.os.Bundle.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (android.os.Bundle) r2;
        r2 = r1.recordImpression(r2);
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zza(r4, r2);
        goto L_0x0092;
    L_0x003b:
        r2 = android.os.Bundle.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (android.os.Bundle) r2;
        r1.performClick(r2);
        goto L_0x004f;
    L_0x0047:
        r2 = r1.getVideoController();
        goto L_0x008c;
    L_0x004c:
        r1.destroy();
    L_0x004f:
        r4.writeNoException();
        goto L_0x0092;
    L_0x0053:
        r2 = r1.getExtras();
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zzb(r4, r2);
        goto L_0x0092;
    L_0x005e:
        r2 = r1.getAdvertiser();
        goto L_0x0081;
    L_0x0063:
        r2 = r1.getCallToAction();
        goto L_0x0081;
    L_0x0068:
        r2 = r1.zzkj();
        goto L_0x008c;
    L_0x006d:
        r2 = r1.getBody();
        goto L_0x0081;
    L_0x0072:
        r2 = r1.getImages();
        r4.writeNoException();
        r4.writeList(r2);
        goto L_0x0092;
    L_0x007d:
        r2 = r1.getHeadline();
    L_0x0081:
        r4.writeNoException();
        r4.writeString(r2);
        goto L_0x0092;
    L_0x0088:
        r2 = r1.zzkd();
    L_0x008c:
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zza(r4, r2);
    L_0x0092:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzrl.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
