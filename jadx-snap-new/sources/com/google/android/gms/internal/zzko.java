package com.google.android.gms.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzb;

@zzabh
public class zzko extends zzbgl {
    public static final Creator<zzko> CREATOR = new zzkp();
    public final int height;
    public final int heightPixels;
    public final int width;
    public final int widthPixels;
    public final String zzbia;
    public final boolean zzbib;
    public final zzko[] zzbic;
    public final boolean zzbid;
    public final boolean zzbie;
    public boolean zzbif;

    public zzko() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public zzko(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    public zzko(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
        r12 = this;
        r12.<init>();
        r0 = 0;
        r1 = r14[r0];
        r12.zzbib = r0;
        r2 = r1.isFluid();
        r12.zzbie = r2;
        r2 = r12.zzbie;
        if (r2 == 0) goto L_0x0021;
    L_0x0012:
        r2 = com.google.android.gms.ads.AdSize.BANNER;
        r2 = r2.getWidth();
        r12.width = r2;
        r2 = com.google.android.gms.ads.AdSize.BANNER;
        r2 = r2.getHeight();
        goto L_0x002b;
    L_0x0021:
        r2 = r1.getWidth();
        r12.width = r2;
        r2 = r1.getHeight();
    L_0x002b:
        r12.height = r2;
        r2 = r12.width;
        r3 = -1;
        r4 = 1;
        if (r2 != r3) goto L_0x0035;
    L_0x0033:
        r2 = 1;
        goto L_0x0036;
    L_0x0035:
        r2 = 0;
    L_0x0036:
        r3 = r12.height;
        r5 = -2;
        if (r3 != r5) goto L_0x003d;
    L_0x003b:
        r3 = 1;
        goto L_0x003e;
    L_0x003d:
        r3 = 0;
    L_0x003e:
        r5 = r13.getResources();
        r5 = r5.getDisplayMetrics();
        if (r2 == 0) goto L_0x0085;
    L_0x0048:
        com.google.android.gms.internal.zzlc.zzij();
        r6 = com.google.android.gms.internal.zzako.zzbf(r13);
        if (r6 == 0) goto L_0x0065;
    L_0x0051:
        com.google.android.gms.internal.zzlc.zzij();
        r6 = com.google.android.gms.internal.zzako.zzbg(r13);
        if (r6 == 0) goto L_0x0065;
    L_0x005a:
        r6 = r5.widthPixels;
        com.google.android.gms.internal.zzlc.zzij();
        r7 = com.google.android.gms.internal.zzako.zzbh(r13);
        r6 = r6 - r7;
        goto L_0x0067;
    L_0x0065:
        r6 = r5.widthPixels;
    L_0x0067:
        r12.widthPixels = r6;
        r6 = r12.widthPixels;
        r6 = (float) r6;
        r7 = r5.density;
        r6 = r6 / r7;
        r6 = (double) r6;
        r8 = (int) r6;
        r9 = (double) r8;
        java.lang.Double.isNaN(r6);
        java.lang.Double.isNaN(r9);
        r6 = r6 - r9;
        r9 = 4576918229304087675; // 0x3f847ae147ae147b float:89128.96 double:0.01;
        r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r11 < 0) goto L_0x0092;
    L_0x0082:
        r8 = r8 + 1;
        goto L_0x0092;
    L_0x0085:
        r8 = r12.width;
        com.google.android.gms.internal.zzlc.zzij();
        r6 = r12.width;
        r6 = com.google.android.gms.internal.zzako.zza(r5, r6);
        r12.widthPixels = r6;
    L_0x0092:
        if (r3 == 0) goto L_0x0099;
    L_0x0094:
        r6 = zzd(r5);
        goto L_0x009b;
    L_0x0099:
        r6 = r12.height;
    L_0x009b:
        com.google.android.gms.internal.zzlc.zzij();
        r5 = com.google.android.gms.internal.zzako.zza(r5, r6);
        r12.heightPixels = r5;
        if (r2 != 0) goto L_0x00b5;
    L_0x00a6:
        if (r3 == 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00b5;
    L_0x00a9:
        r2 = r12.zzbie;
        if (r2 == 0) goto L_0x00b0;
    L_0x00ad:
        r1 = "320x50_mb";
        goto L_0x00d0;
    L_0x00b0:
        r1 = r1.toString();
        goto L_0x00d0;
    L_0x00b5:
        r1 = 26;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r2.append(r8);
        r1 = "x";
        r2.append(r1);
        r2.append(r6);
        r1 = "_as";
        r2.append(r1);
        r1 = r2.toString();
    L_0x00d0:
        r12.zzbia = r1;
        r1 = r14.length;
        if (r1 <= r4) goto L_0x00ec;
    L_0x00d5:
        r1 = r14.length;
        r1 = new com.google.android.gms.internal.zzko[r1];
        r12.zzbic = r1;
        r1 = 0;
    L_0x00db:
        r2 = r14.length;
        if (r1 >= r2) goto L_0x00ef;
    L_0x00de:
        r2 = r12.zzbic;
        r3 = new com.google.android.gms.internal.zzko;
        r4 = r14[r1];
        r3.<init>(r13, r4);
        r2[r1] = r3;
        r1 = r1 + 1;
        goto L_0x00db;
    L_0x00ec:
        r13 = 0;
        r12.zzbic = r13;
    L_0x00ef:
        r12.zzbid = r0;
        r12.zzbif = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzko.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    public zzko(zzko zzko, zzko[] zzkoArr) {
        this(zzko.zzbia, zzko.height, zzko.heightPixels, zzko.zzbib, zzko.width, zzko.widthPixels, zzkoArr, zzko.zzbid, zzko.zzbie, zzko.zzbif);
    }

    zzko(String str, int i, int i2, boolean z, int i3, int i4, zzko[] zzkoArr, boolean z2, boolean z3, boolean z4) {
        this.zzbia = str;
        this.height = i;
        this.heightPixels = i2;
        this.zzbib = z;
        this.width = i3;
        this.widthPixels = i4;
        this.zzbic = zzkoArr;
        this.zzbid = z2;
        this.zzbie = z3;
        this.zzbif = z4;
    }

    public static int zzb(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int zzc(DisplayMetrics displayMetrics) {
        return (int) (((float) zzd(displayMetrics)) * displayMetrics.density);
    }

    private static int zzd(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i <= 400 ? 32 : i <= 720 ? 50 : 90;
    }

    public static zzko zzf(Context context) {
        return new zzko("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    public static zzko zzib() {
        return new zzko("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzbia, false);
        zzbgo.zzc(parcel, 3, this.height);
        zzbgo.zzc(parcel, 4, this.heightPixels);
        zzbgo.zza(parcel, 5, this.zzbib);
        zzbgo.zzc(parcel, 6, this.width);
        zzbgo.zzc(parcel, 7, this.widthPixels);
        zzbgo.zza(parcel, 8, this.zzbic, i, false);
        zzbgo.zza(parcel, 9, this.zzbid);
        zzbgo.zza(parcel, 10, this.zzbie);
        zzbgo.zza(parcel, 11, this.zzbif);
        zzbgo.zzai(parcel, zze);
    }

    public final AdSize zzic() {
        return zzb.zza(this.width, this.height, this.zzbia);
    }
}
