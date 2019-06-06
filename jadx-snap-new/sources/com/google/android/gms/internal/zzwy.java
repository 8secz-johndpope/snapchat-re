package com.google.android.gms.internal;

public abstract class zzwy extends zzew implements zzwx {
    public zzwy() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* JADX WARNING: Missing block: B:10:0x0044, code skipped:
            r4.writeNoException();
     */
    /* JADX WARNING: Missing block: B:13:0x0051, code skipped:
            r4.writeNoException();
            com.google.android.gms.internal.zzex.zza(r4, r2);
     */
    /* JADX WARNING: Missing block: B:26:0x009f, code skipped:
            r4.writeNoException();
            com.google.android.gms.internal.zzex.zza(r4, r2);
     */
    /* JADX WARNING: Missing block: B:30:0x00ba, code skipped:
            r4.writeNoException();
            r4.writeString(r2);
     */
    /* JADX WARNING: Missing block: B:31:0x00c0, code skipped:
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
            case 2: goto L_0x00b6;
            case 3: goto L_0x00ab;
            case 4: goto L_0x00a6;
            case 5: goto L_0x009b;
            case 6: goto L_0x0096;
            case 7: goto L_0x0091;
            case 8: goto L_0x0086;
            case 9: goto L_0x0081;
            case 10: goto L_0x007c;
            case 11: goto L_0x0077;
            case 12: goto L_0x0072;
            case 13: goto L_0x006d;
            case 14: goto L_0x0068;
            case 15: goto L_0x0063;
            case 16: goto L_0x0058;
            case 17: goto L_0x004d;
            case 18: goto L_0x0048;
            case 19: goto L_0x0041;
            case 20: goto L_0x0035;
            case 21: goto L_0x0019;
            case 22: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = 0;
        return r2;
    L_0x000d:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r2);
        r1.zzj(r2);
        goto L_0x0044;
    L_0x0019:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r2);
        r5 = r3.readStrongBinder();
        r5 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r5);
        r3 = r3.readStrongBinder();
        r3 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r3);
        r1.zzb(r2, r5, r3);
        goto L_0x0044;
    L_0x0035:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r2);
        r1.zzh(r2);
        goto L_0x0044;
    L_0x0041:
        r1.recordImpression();
    L_0x0044:
        r4.writeNoException();
        goto L_0x00c0;
    L_0x0048:
        r2 = r1.getOverrideClickHandling();
        goto L_0x0051;
    L_0x004d:
        r2 = r1.getOverrideImpressionRecording();
    L_0x0051:
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zza(r4, r2);
        goto L_0x00c0;
    L_0x0058:
        r2 = r1.getExtras();
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zzb(r4, r2);
        goto L_0x00c0;
    L_0x0063:
        r2 = r1.zzkh();
        goto L_0x009f;
    L_0x0068:
        r2 = r1.zzmx();
        goto L_0x009f;
    L_0x006d:
        r2 = r1.zzmw();
        goto L_0x009f;
    L_0x0072:
        r2 = r1.zzki();
        goto L_0x009f;
    L_0x0077:
        r2 = r1.getVideoController();
        goto L_0x009f;
    L_0x007c:
        r2 = r1.getPrice();
        goto L_0x00ba;
    L_0x0081:
        r2 = r1.getStore();
        goto L_0x00ba;
    L_0x0086:
        r2 = r1.getStarRating();
        r4.writeNoException();
        r4.writeDouble(r2);
        goto L_0x00c0;
    L_0x0091:
        r2 = r1.getAdvertiser();
        goto L_0x00ba;
    L_0x0096:
        r2 = r1.getCallToAction();
        goto L_0x00ba;
    L_0x009b:
        r2 = r1.zzkc();
    L_0x009f:
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zza(r4, r2);
        goto L_0x00c0;
    L_0x00a6:
        r2 = r1.getBody();
        goto L_0x00ba;
    L_0x00ab:
        r2 = r1.getImages();
        r4.writeNoException();
        r4.writeList(r2);
        goto L_0x00c0;
    L_0x00b6:
        r2 = r1.getHeadline();
    L_0x00ba:
        r4.writeNoException();
        r4.writeString(r2);
    L_0x00c0:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzwy.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
