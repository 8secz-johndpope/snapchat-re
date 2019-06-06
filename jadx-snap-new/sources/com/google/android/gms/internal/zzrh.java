package com.google.android.gms.internal;

public abstract class zzrh extends zzew implements zzrg {
    public zzrh() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* JADX WARNING: Missing block: B:14:0x0052, code skipped:
            r4.writeNoException();
     */
    /* JADX WARNING: Missing block: B:24:0x0094, code skipped:
            r4.writeNoException();
            r4.writeString(r2);
     */
    /* JADX WARNING: Missing block: B:26:0x009f, code skipped:
            r4.writeNoException();
            com.google.android.gms.internal.zzex.zza(r4, r2);
     */
    /* JADX WARNING: Missing block: B:27:0x00a5, code skipped:
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
            case 2: goto L_0x009b;
            case 3: goto L_0x0090;
            case 4: goto L_0x0085;
            case 5: goto L_0x0080;
            case 6: goto L_0x007b;
            case 7: goto L_0x0076;
            case 8: goto L_0x006b;
            case 9: goto L_0x0066;
            case 10: goto L_0x0061;
            case 11: goto L_0x0056;
            case 12: goto L_0x004f;
            case 13: goto L_0x004a;
            case 14: goto L_0x003e;
            case 15: goto L_0x002b;
            case 16: goto L_0x001f;
            case 17: goto L_0x0019;
            case 18: goto L_0x0013;
            case 19: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = 0;
        return r2;
    L_0x000d:
        r2 = r1.getMediationAdapterClassName();
        goto L_0x0094;
    L_0x0013:
        r2 = r1.zzkh();
        goto L_0x009f;
    L_0x0019:
        r2 = r1.zzki();
        goto L_0x009f;
    L_0x001f:
        r2 = android.os.Bundle.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (android.os.Bundle) r2;
        r1.reportTouchEvent(r2);
        goto L_0x0052;
    L_0x002b:
        r2 = android.os.Bundle.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (android.os.Bundle) r2;
        r2 = r1.recordImpression(r2);
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zza(r4, r2);
        goto L_0x00a5;
    L_0x003e:
        r2 = android.os.Bundle.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (android.os.Bundle) r2;
        r1.performClick(r2);
        goto L_0x0052;
    L_0x004a:
        r2 = r1.getVideoController();
        goto L_0x009f;
    L_0x004f:
        r1.destroy();
    L_0x0052:
        r4.writeNoException();
        goto L_0x00a5;
    L_0x0056:
        r2 = r1.getExtras();
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zzb(r4, r2);
        goto L_0x00a5;
    L_0x0061:
        r2 = r1.getPrice();
        goto L_0x0094;
    L_0x0066:
        r2 = r1.getStore();
        goto L_0x0094;
    L_0x006b:
        r2 = r1.getStarRating();
        r4.writeNoException();
        r4.writeDouble(r2);
        goto L_0x00a5;
    L_0x0076:
        r2 = r1.getCallToAction();
        goto L_0x0094;
    L_0x007b:
        r2 = r1.zzkc();
        goto L_0x009f;
    L_0x0080:
        r2 = r1.getBody();
        goto L_0x0094;
    L_0x0085:
        r2 = r1.getImages();
        r4.writeNoException();
        r4.writeList(r2);
        goto L_0x00a5;
    L_0x0090:
        r2 = r1.getHeadline();
    L_0x0094:
        r4.writeNoException();
        r4.writeString(r2);
        goto L_0x00a5;
    L_0x009b:
        r2 = r1.zzkd();
    L_0x009f:
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zza(r4, r2);
    L_0x00a5:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzrh.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
