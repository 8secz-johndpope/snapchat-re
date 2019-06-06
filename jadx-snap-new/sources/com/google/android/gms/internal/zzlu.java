package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzlu extends zzew implements zzlt {
    public zzlu() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzlt zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzlt ? (zzlt) queryLocalInterface : new zzlv(iBinder);
    }

    /* JADX WARNING: Missing block: B:35:0x00c3, code skipped:
            r4.writeNoException();
            r4.writeString(r2);
     */
    /* JADX WARNING: Missing block: B:61:0x0161, code skipped:
            r4.writeNoException();
            com.google.android.gms.internal.zzex.zza(r4, r2);
     */
    /* JADX WARNING: Missing block: B:63:0x016b, code skipped:
            r4.writeNoException();
     */
    /* JADX WARNING: Missing block: B:65:0x0173, code skipped:
            r4.writeNoException();
            com.google.android.gms.internal.zzex.zza(r4, r2);
     */
    /* JADX WARNING: Missing block: B:66:0x0179, code skipped:
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
        r5 = 0;
        switch(r2) {
            case 1: goto L_0x016f;
            case 2: goto L_0x0168;
            case 3: goto L_0x015d;
            case 4: goto L_0x0150;
            case 5: goto L_0x014c;
            case 6: goto L_0x0148;
            case 7: goto L_0x012a;
            case 8: goto L_0x010c;
            case 9: goto L_0x0108;
            case 10: goto L_0x0104;
            case 11: goto L_0x0100;
            case 12: goto L_0x00f5;
            case 13: goto L_0x00e9;
            case 14: goto L_0x00dc;
            case 15: goto L_0x00cb;
            case 16: goto L_0x000c;
            case 17: goto L_0x000c;
            case 18: goto L_0x00bf;
            case 19: goto L_0x00b2;
            case 20: goto L_0x0093;
            case 21: goto L_0x0074;
            case 22: goto L_0x006b;
            case 23: goto L_0x0065;
            case 24: goto L_0x0058;
            case 25: goto L_0x004f;
            case 26: goto L_0x0049;
            case 27: goto L_0x000c;
            case 28: goto L_0x000c;
            case 29: goto L_0x003c;
            case 30: goto L_0x002f;
            case 31: goto L_0x0029;
            case 32: goto L_0x0023;
            case 33: goto L_0x001d;
            case 34: goto L_0x0014;
            case 35: goto L_0x000e;
            default: goto L_0x000c;
        };
    L_0x000c:
        r2 = 0;
        return r2;
    L_0x000e:
        r2 = r1.zzco();
        goto L_0x00c3;
    L_0x0014:
        r2 = com.google.android.gms.internal.zzex.zza(r3);
        r1.setImmersiveMode(r2);
        goto L_0x016b;
    L_0x001d:
        r2 = r1.zzcd();
        goto L_0x0173;
    L_0x0023:
        r2 = r1.zzcc();
        goto L_0x0173;
    L_0x0029:
        r2 = r1.getAdUnitId();
        goto L_0x00c3;
    L_0x002f:
        r2 = com.google.android.gms.internal.zzms.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (com.google.android.gms.internal.zzms) r2;
        r1.zza(r2);
        goto L_0x016b;
    L_0x003c:
        r2 = com.google.android.gms.internal.zzns.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (com.google.android.gms.internal.zzns) r2;
        r1.zza(r2);
        goto L_0x016b;
    L_0x0049:
        r2 = r1.getVideoController();
        goto L_0x0173;
    L_0x004f:
        r2 = r3.readString();
        r1.setUserId(r2);
        goto L_0x016b;
    L_0x0058:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.internal.zzafd.zzaa(r2);
        r1.zza(r2);
        goto L_0x016b;
    L_0x0065:
        r2 = r1.isLoading();
        goto L_0x0161;
    L_0x006b:
        r2 = com.google.android.gms.internal.zzex.zza(r3);
        r1.setManualImpressionsEnabled(r2);
        goto L_0x016b;
    L_0x0074:
        r2 = r3.readStrongBinder();
        if (r2 != 0) goto L_0x007b;
    L_0x007a:
        goto L_0x008e;
    L_0x007b:
        r3 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider";
        r3 = r2.queryLocalInterface(r3);
        r5 = r3 instanceof com.google.android.gms.internal.zzme;
        if (r5 == 0) goto L_0x0089;
    L_0x0085:
        r5 = r3;
        r5 = (com.google.android.gms.internal.zzme) r5;
        goto L_0x008e;
    L_0x0089:
        r5 = new com.google.android.gms.internal.zzmg;
        r5.<init>(r2);
    L_0x008e:
        r1.zza(r5);
        goto L_0x016b;
    L_0x0093:
        r2 = r3.readStrongBinder();
        if (r2 != 0) goto L_0x009a;
    L_0x0099:
        goto L_0x00ad;
    L_0x009a:
        r3 = "com.google.android.gms.ads.internal.client.IAdClickListener";
        r3 = r2.queryLocalInterface(r3);
        r5 = r3 instanceof com.google.android.gms.internal.zzlf;
        if (r5 == 0) goto L_0x00a8;
    L_0x00a4:
        r5 = r3;
        r5 = (com.google.android.gms.internal.zzlf) r5;
        goto L_0x00ad;
    L_0x00a8:
        r5 = new com.google.android.gms.internal.zzlh;
        r5.<init>(r2);
    L_0x00ad:
        r1.zza(r5);
        goto L_0x016b;
    L_0x00b2:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.internal.zzpc.zzi(r2);
        r1.zza(r2);
        goto L_0x016b;
    L_0x00bf:
        r2 = r1.getMediationAdapterClassName();
    L_0x00c3:
        r4.writeNoException();
        r4.writeString(r2);
        goto L_0x0179;
    L_0x00cb:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.internal.zzze.zzy(r2);
        r3 = r3.readString();
        r1.zza(r2, r3);
        goto L_0x016b;
    L_0x00dc:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.internal.zzyy.zzw(r2);
        r1.zza(r2);
        goto L_0x016b;
    L_0x00e9:
        r2 = com.google.android.gms.internal.zzko.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (com.google.android.gms.internal.zzko) r2;
        r1.zza(r2);
        goto L_0x016b;
    L_0x00f5:
        r2 = r1.zzbq();
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zzb(r4, r2);
        goto L_0x0179;
    L_0x0100:
        r1.zzbs();
        goto L_0x016b;
    L_0x0104:
        r1.stopLoading();
        goto L_0x016b;
    L_0x0108:
        r1.showInterstitial();
        goto L_0x016b;
    L_0x010c:
        r2 = r3.readStrongBinder();
        if (r2 != 0) goto L_0x0113;
    L_0x0112:
        goto L_0x0126;
    L_0x0113:
        r3 = "com.google.android.gms.ads.internal.client.IAppEventListener";
        r3 = r2.queryLocalInterface(r3);
        r5 = r3 instanceof com.google.android.gms.internal.zzly;
        if (r5 == 0) goto L_0x0121;
    L_0x011d:
        r5 = r3;
        r5 = (com.google.android.gms.internal.zzly) r5;
        goto L_0x0126;
    L_0x0121:
        r5 = new com.google.android.gms.internal.zzma;
        r5.<init>(r2);
    L_0x0126:
        r1.zza(r5);
        goto L_0x016b;
    L_0x012a:
        r2 = r3.readStrongBinder();
        if (r2 != 0) goto L_0x0131;
    L_0x0130:
        goto L_0x0144;
    L_0x0131:
        r3 = "com.google.android.gms.ads.internal.client.IAdListener";
        r3 = r2.queryLocalInterface(r3);
        r5 = r3 instanceof com.google.android.gms.internal.zzli;
        if (r5 == 0) goto L_0x013f;
    L_0x013b:
        r5 = r3;
        r5 = (com.google.android.gms.internal.zzli) r5;
        goto L_0x0144;
    L_0x013f:
        r5 = new com.google.android.gms.internal.zzlk;
        r5.<init>(r2);
    L_0x0144:
        r1.zza(r5);
        goto L_0x016b;
    L_0x0148:
        r1.resume();
        goto L_0x016b;
    L_0x014c:
        r1.pause();
        goto L_0x016b;
    L_0x0150:
        r2 = com.google.android.gms.internal.zzkk.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r3, r2);
        r2 = (com.google.android.gms.internal.zzkk) r2;
        r2 = r1.zzb(r2);
        goto L_0x0161;
    L_0x015d:
        r2 = r1.isReady();
    L_0x0161:
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zza(r4, r2);
        goto L_0x0179;
    L_0x0168:
        r1.destroy();
    L_0x016b:
        r4.writeNoException();
        goto L_0x0179;
    L_0x016f:
        r2 = r1.zzbp();
    L_0x0173:
        r4.writeNoException();
        com.google.android.gms.internal.zzex.zza(r4, r2);
    L_0x0179:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzlu.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
