package com.google.android.gms.internal;

public abstract class zzwj extends zzew implements zzwi {
    public zzwj() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* JADX WARNING: Missing block: B:18:0x007a, code skipped:
            r13.writeNoException();
            com.google.android.gms.internal.zzex.zzb(r13, r11);
     */
    /* JADX WARNING: Missing block: B:30:0x00d7, code skipped:
            r13.writeNoException();
            com.google.android.gms.internal.zzex.zza(r13, r11);
     */
    /* JADX WARNING: Missing block: B:54:0x01a6, code skipped:
            r13.writeNoException();
     */
    /* JADX WARNING: Missing block: B:63:0x01dd, code skipped:
            r13.writeNoException();
            com.google.android.gms.internal.zzex.zza(r13, r11);
     */
    /* JADX WARNING: Missing block: B:72:0x0221, code skipped:
            return true;
     */
    public boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) {
        /*
        r10 = this;
        r14 = r10.zza(r11, r12, r13, r14);
        r0 = 1;
        if (r14 == 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r14 = 0;
        r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
        switch(r11) {
            case 1: goto L_0x01e4;
            case 2: goto L_0x01d9;
            case 3: goto L_0x01aa;
            case 4: goto L_0x01a3;
            case 5: goto L_0x019f;
            case 6: goto L_0x015e;
            case 7: goto L_0x0126;
            case 8: goto L_0x0121;
            case 9: goto L_0x011c;
            case 10: goto L_0x00f5;
            case 11: goto L_0x00e4;
            case 12: goto L_0x00df;
            case 13: goto L_0x00d3;
            case 14: goto L_0x008e;
            case 15: goto L_0x0088;
            case 16: goto L_0x0082;
            case 17: goto L_0x0076;
            case 18: goto L_0x0071;
            case 19: goto L_0x006c;
            case 20: goto L_0x0057;
            case 21: goto L_0x004a;
            case 22: goto L_0x0044;
            case 23: goto L_0x002b;
            case 24: goto L_0x0025;
            case 25: goto L_0x001c;
            case 26: goto L_0x0016;
            case 27: goto L_0x0010;
            default: goto L_0x000e;
        };
    L_0x000e:
        r11 = 0;
        return r11;
    L_0x0010:
        r11 = r10.zzmv();
        goto L_0x01dd;
    L_0x0016:
        r11 = r10.getVideoController();
        goto L_0x01dd;
    L_0x001c:
        r11 = com.google.android.gms.internal.zzex.zza(r12);
        r10.setImmersiveMode(r11);
        goto L_0x01a6;
    L_0x0025:
        r11 = r10.zzmu();
        goto L_0x01dd;
    L_0x002b:
        r11 = r12.readStrongBinder();
        r11 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r11);
        r14 = r12.readStrongBinder();
        r14 = com.google.android.gms.internal.zzaga.zzab(r14);
        r12 = r12.createStringArrayList();
        r10.zza(r11, r14, r12);
        goto L_0x01a6;
    L_0x0044:
        r11 = r10.zzmt();
        goto L_0x00d7;
    L_0x004a:
        r11 = r12.readStrongBinder();
        r11 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r11);
        r10.zzg(r11);
        goto L_0x01a6;
    L_0x0057:
        r11 = com.google.android.gms.internal.zzkk.CREATOR;
        r11 = com.google.android.gms.internal.zzex.zza(r12, r11);
        r11 = (com.google.android.gms.internal.zzkk) r11;
        r14 = r12.readString();
        r12 = r12.readString();
        r10.zza(r11, r14, r12);
        goto L_0x01a6;
    L_0x006c:
        r11 = r10.zzms();
        goto L_0x007a;
    L_0x0071:
        r11 = r10.getInterstitialAdapterInfo();
        goto L_0x007a;
    L_0x0076:
        r11 = r10.zzmr();
    L_0x007a:
        r13.writeNoException();
        com.google.android.gms.internal.zzex.zzb(r13, r11);
        goto L_0x0221;
    L_0x0082:
        r11 = r10.zzmq();
        goto L_0x01dd;
    L_0x0088:
        r11 = r10.zzmp();
        goto L_0x01dd;
    L_0x008e:
        r11 = r12.readStrongBinder();
        r3 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r11);
        r11 = com.google.android.gms.internal.zzkk.CREATOR;
        r11 = com.google.android.gms.internal.zzex.zza(r12, r11);
        r4 = r11;
        r4 = (com.google.android.gms.internal.zzkk) r4;
        r5 = r12.readString();
        r6 = r12.readString();
        r11 = r12.readStrongBinder();
        if (r11 != 0) goto L_0x00af;
    L_0x00ad:
        r7 = r14;
        goto L_0x00c0;
    L_0x00af:
        r14 = r11.queryLocalInterface(r1);
        r1 = r14 instanceof com.google.android.gms.internal.zzwl;
        if (r1 == 0) goto L_0x00ba;
    L_0x00b7:
        r14 = (com.google.android.gms.internal.zzwl) r14;
        goto L_0x00ad;
    L_0x00ba:
        r14 = new com.google.android.gms.internal.zzwn;
        r14.<init>(r11);
        goto L_0x00ad;
    L_0x00c0:
        r11 = com.google.android.gms.internal.zzqh.CREATOR;
        r11 = com.google.android.gms.internal.zzex.zza(r12, r11);
        r8 = r11;
        r8 = (com.google.android.gms.internal.zzqh) r8;
        r9 = r12.createStringArrayList();
        r2 = r10;
        r2.zza(r3, r4, r5, r6, r7, r8, r9);
        goto L_0x01a6;
    L_0x00d3:
        r11 = r10.isInitialized();
    L_0x00d7:
        r13.writeNoException();
        com.google.android.gms.internal.zzex.zza(r13, r11);
        goto L_0x0221;
    L_0x00df:
        r10.showVideo();
        goto L_0x01a6;
    L_0x00e4:
        r11 = com.google.android.gms.internal.zzkk.CREATOR;
        r11 = com.google.android.gms.internal.zzex.zza(r12, r11);
        r11 = (com.google.android.gms.internal.zzkk) r11;
        r12 = r12.readString();
        r10.zzc(r11, r12);
        goto L_0x01a6;
    L_0x00f5:
        r11 = r12.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r11);
        r11 = com.google.android.gms.internal.zzkk.CREATOR;
        r11 = com.google.android.gms.internal.zzex.zza(r12, r11);
        r3 = r11;
        r3 = (com.google.android.gms.internal.zzkk) r3;
        r4 = r12.readString();
        r11 = r12.readStrongBinder();
        r5 = com.google.android.gms.internal.zzaga.zzab(r11);
        r6 = r12.readString();
        r1 = r10;
        r1.zza(r2, r3, r4, r5, r6);
        goto L_0x01a6;
    L_0x011c:
        r10.resume();
        goto L_0x01a6;
    L_0x0121:
        r10.pause();
        goto L_0x01a6;
    L_0x0126:
        r11 = r12.readStrongBinder();
        r3 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r11);
        r11 = com.google.android.gms.internal.zzkk.CREATOR;
        r11 = com.google.android.gms.internal.zzex.zza(r12, r11);
        r4 = r11;
        r4 = (com.google.android.gms.internal.zzkk) r4;
        r5 = r12.readString();
        r6 = r12.readString();
        r11 = r12.readStrongBinder();
        if (r11 != 0) goto L_0x0147;
    L_0x0145:
        r7 = r14;
        goto L_0x0159;
    L_0x0147:
        r12 = r11.queryLocalInterface(r1);
        r14 = r12 instanceof com.google.android.gms.internal.zzwl;
        if (r14 == 0) goto L_0x0153;
    L_0x014f:
        r14 = r12;
        r14 = (com.google.android.gms.internal.zzwl) r14;
        goto L_0x0145;
    L_0x0153:
        r14 = new com.google.android.gms.internal.zzwn;
        r14.<init>(r11);
        goto L_0x0145;
    L_0x0159:
        r2 = r10;
        r2.zza(r3, r4, r5, r6, r7);
        goto L_0x01a6;
    L_0x015e:
        r11 = r12.readStrongBinder();
        r3 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r11);
        r11 = com.google.android.gms.internal.zzko.CREATOR;
        r11 = com.google.android.gms.internal.zzex.zza(r12, r11);
        r4 = r11;
        r4 = (com.google.android.gms.internal.zzko) r4;
        r11 = com.google.android.gms.internal.zzkk.CREATOR;
        r11 = com.google.android.gms.internal.zzex.zza(r12, r11);
        r5 = r11;
        r5 = (com.google.android.gms.internal.zzkk) r5;
        r6 = r12.readString();
        r7 = r12.readString();
        r11 = r12.readStrongBinder();
        if (r11 != 0) goto L_0x0188;
    L_0x0186:
        r8 = r14;
        goto L_0x019a;
    L_0x0188:
        r12 = r11.queryLocalInterface(r1);
        r14 = r12 instanceof com.google.android.gms.internal.zzwl;
        if (r14 == 0) goto L_0x0194;
    L_0x0190:
        r14 = r12;
        r14 = (com.google.android.gms.internal.zzwl) r14;
        goto L_0x0186;
    L_0x0194:
        r14 = new com.google.android.gms.internal.zzwn;
        r14.<init>(r11);
        goto L_0x0186;
    L_0x019a:
        r2 = r10;
        r2.zza(r3, r4, r5, r6, r7, r8);
        goto L_0x01a6;
    L_0x019f:
        r10.destroy();
        goto L_0x01a6;
    L_0x01a3:
        r10.showInterstitial();
    L_0x01a6:
        r13.writeNoException();
        goto L_0x0221;
    L_0x01aa:
        r11 = r12.readStrongBinder();
        r11 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r11);
        r2 = com.google.android.gms.internal.zzkk.CREATOR;
        r2 = com.google.android.gms.internal.zzex.zza(r12, r2);
        r2 = (com.google.android.gms.internal.zzkk) r2;
        r3 = r12.readString();
        r12 = r12.readStrongBinder();
        if (r12 != 0) goto L_0x01c5;
    L_0x01c4:
        goto L_0x01d5;
    L_0x01c5:
        r14 = r12.queryLocalInterface(r1);
        r1 = r14 instanceof com.google.android.gms.internal.zzwl;
        if (r1 == 0) goto L_0x01d0;
    L_0x01cd:
        r14 = (com.google.android.gms.internal.zzwl) r14;
        goto L_0x01d5;
    L_0x01d0:
        r14 = new com.google.android.gms.internal.zzwn;
        r14.<init>(r12);
    L_0x01d5:
        r10.zza(r11, r2, r3, r14);
        goto L_0x01a6;
    L_0x01d9:
        r11 = r10.getView();
    L_0x01dd:
        r13.writeNoException();
        com.google.android.gms.internal.zzex.zza(r13, r11);
        goto L_0x0221;
    L_0x01e4:
        r11 = r12.readStrongBinder();
        r3 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzaq(r11);
        r11 = com.google.android.gms.internal.zzko.CREATOR;
        r11 = com.google.android.gms.internal.zzex.zza(r12, r11);
        r4 = r11;
        r4 = (com.google.android.gms.internal.zzko) r4;
        r11 = com.google.android.gms.internal.zzkk.CREATOR;
        r11 = com.google.android.gms.internal.zzex.zza(r12, r11);
        r5 = r11;
        r5 = (com.google.android.gms.internal.zzkk) r5;
        r6 = r12.readString();
        r11 = r12.readStrongBinder();
        if (r11 != 0) goto L_0x020a;
    L_0x0208:
        r7 = r14;
        goto L_0x021c;
    L_0x020a:
        r12 = r11.queryLocalInterface(r1);
        r14 = r12 instanceof com.google.android.gms.internal.zzwl;
        if (r14 == 0) goto L_0x0216;
    L_0x0212:
        r14 = r12;
        r14 = (com.google.android.gms.internal.zzwl) r14;
        goto L_0x0208;
    L_0x0216:
        r14 = new com.google.android.gms.internal.zzwn;
        r14.<init>(r11);
        goto L_0x0208;
    L_0x021c:
        r2 = r10;
        r2.zza(r3, r4, r5, r6, r7);
        goto L_0x01a6;
    L_0x0221:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzwj.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
