package com.google.android.gms.internal;

public abstract class zzwv extends zzew implements zzwu {
    public zzwv() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* JADX WARNING: Missing block: B:16:0x0062, code skipped:
            r4.writeNoException();
            com.google.android.gms.internal.zzex.zza(r4, r2);
     */
    /* JADX WARNING: Missing block: B:20:0x0084, code skipped:
            r4.writeNoException();
     */
    /* JADX WARNING: Missing block: B:24:0x0096, code skipped:
            r4.writeNoException();
            com.google.android.gms.internal.zzex.zza(r4, r2);
     */
    /* JADX WARNING: Missing block: B:28:0x00b1, code skipped:
            r4.writeNoException();
            r4.writeString(r2);
     */
    /* JADX WARNING: Missing block: B:29:0x00b7, code skipped:
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
            case 2: goto L_0x00ad;
            case 3: goto L_0x00a2;
            case 4: goto L_0x009d;
            case 5: goto L_0x0092;
            case 6: goto L_0x008d;
            case 7: goto L_0x0088;
            case 8: goto L_0x0081;
            case 9: goto L_0x0075;
            case 10: goto L_0x0069;
            case 11: goto L_0x005e;
            case 12: goto L_0x0059;
            case 13: goto L_0x004e;
            case 14: goto L_0x0042;
            case 15: goto L_0x003d;
            case 16: goto L_0x0038;
            case 17: goto L_0x000b;
            case 18: goto L_0x000b;
            case 19: goto L_0x0033;
            case 20: goto L_0x002e;
            case 21: goto L_0x0029;
            case 22: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = 0;
        return r2;
    L_0x000d:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r2);
        r5 = r3.readStrongBinder();
        r5 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r5);
        r3 = r3.readStrongBinder();
        r3 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r3);
        r1.zzb(r2, r5, r3);
        goto L_0x0084;
    L_0x0029:
        r2 = r1.zzkh();
        goto L_0x0096;
    L_0x002e:
        r2 = r1.zzmx();
        goto L_0x0096;
    L_0x0033:
        r2 = r1.zzki();
        goto L_0x0096;
    L_0x0038:
        r2 = r1.getVideoController();
        goto L_0x0096;
    L_0x003d:
        r2 = r1.zzmw();
        goto L_0x0096;
    L_0x0042:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r2);
        r1.zzj(r2);
        goto L_0x0084;
    L_0x004e:
        r2 = r1.getExtras();
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zzb(r4, r2);
        goto L_0x00b7;
    L_0x0059:
        r2 = r1.getOverrideClickHandling();
        goto L_0x0062;
    L_0x005e:
        r2 = r1.getOverrideImpressionRecording();
    L_0x0062:
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zza(r4, r2);
        goto L_0x00b7;
    L_0x0069:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r2);
        r1.zzi(r2);
        goto L_0x0084;
    L_0x0075:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r2);
        r1.zzh(r2);
        goto L_0x0084;
    L_0x0081:
        r1.recordImpression();
    L_0x0084:
        r4.writeNoException();
        goto L_0x00b7;
    L_0x0088:
        r2 = r1.getAdvertiser();
        goto L_0x00b1;
    L_0x008d:
        r2 = r1.getCallToAction();
        goto L_0x00b1;
    L_0x0092:
        r2 = r1.zzkj();
    L_0x0096:
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zza(r4, r2);
        goto L_0x00b7;
    L_0x009d:
        r2 = r1.getBody();
        goto L_0x00b1;
    L_0x00a2:
        r2 = r1.getImages();
        r4.writeNoException();
        r4.writeList(r2);
        goto L_0x00b7;
    L_0x00ad:
        r2 = r1.getHeadline();
    L_0x00b1:
        r4.writeNoException();
        r4.writeString(r2);
    L_0x00b7:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzwv.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
