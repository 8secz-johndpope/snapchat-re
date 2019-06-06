package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

@zzabh
public final class zzacj extends zzbgl {
    public static final Creator<zzacj> CREATOR = new zzack();
    public String body;
    public final int errorCode;
    public final int orientation;
    private int versionCode;
    public final boolean zzaqw;
    public final String zzbdl;
    public final boolean zzbid;
    public final boolean zzbie;
    public final boolean zzbif;
    public final List<String> zzchw;
    public final List<String> zzchx;
    public final List<String> zzchz;
    public final boolean zzcia;
    public final long zzcic;
    private zzacf zzcjk;
    public final String zzcno;
    public final boolean zzcsd;
    public final boolean zzcsr;
    public String zzcss;
    public final boolean zzctd;
    public final long zzctn;
    public final boolean zzcto;
    public final long zzctp;
    public final List<String> zzctq;
    public final String zzctr;
    public final long zzcts;
    public final String zzctt;
    public final boolean zzctu;
    public final String zzctv;
    public final String zzctw;
    public final boolean zzctx;
    public final boolean zzcty;
    public final boolean zzctz;
    private zzacv zzcua;
    public String zzcub;
    public final zzagd zzcuc;
    public final List<String> zzcud;
    public final List<String> zzcue;
    public final boolean zzcuf;
    public final zzacl zzcug;
    public final String zzcuh;
    public final zzagn zzcui;
    public final String zzcuj;
    public final boolean zzcuk;
    private Bundle zzcul;
    public final int zzcum;

    public zzacj(int i) {
        this(19, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0);
    }

    public zzacj(int i, long j) {
        this(19, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0);
    }

    zzacj(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzacv zzacv, String str7, String str8, boolean z8, boolean z9, zzagd zzagd, List<String> list4, List<String> list5, boolean z10, zzacl zzacl, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzagn zzagn, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4) {
        this.versionCode = i;
        this.zzcno = str;
        this.body = str2;
        List list7 = null;
        this.zzchw = list != null ? Collections.unmodifiableList(list) : null;
        this.errorCode = i2;
        this.zzchx = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.zzctn = j;
        this.zzcto = z;
        this.zzctp = j2;
        if (list3 != null) {
            list7 = Collections.unmodifiableList(list3);
        }
        this.zzctq = list7;
        this.zzcic = j3;
        this.orientation = i3;
        this.zzctr = str3;
        this.zzcts = j4;
        this.zzctt = str4;
        this.zzctu = z2;
        this.zzctv = str5;
        this.zzctw = str6;
        this.zzctx = z3;
        this.zzbid = z4;
        this.zzcsd = z5;
        this.zzcty = z6;
        this.zzcuk = z13;
        this.zzctz = z7;
        this.zzcua = zzacv;
        this.zzcub = str7;
        this.zzbdl = str8;
        if (this.body == null) {
            zzacv zzacv2 = this.zzcua;
            if (zzacv2 != null) {
                zzadj zzadj = (zzadj) zzacv2.zza(zzadj.CREATOR);
                if (!(zzadj == null || TextUtils.isEmpty(zzadj.zzbwz))) {
                    this.body = zzadj.zzbwz;
                }
            }
        }
        this.zzbie = z8;
        this.zzbif = z9;
        this.zzcuc = zzagd;
        this.zzcud = list4;
        this.zzcue = list5;
        this.zzcuf = z10;
        this.zzcug = zzacl;
        this.zzcsr = z11;
        this.zzcss = str9;
        this.zzchz = list6;
        this.zzcia = z12;
        this.zzcuh = str10;
        this.zzcui = zzagn;
        this.zzcuj = str11;
        this.zzctd = z14;
        this.zzcul = bundle;
        this.zzaqw = z15;
        this.zzcum = i4;
    }

    public zzacj(zzacf zzacf, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzagd zzagd, List<String> list4, List<String> list5, boolean z9, zzacl zzacl, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzagn zzagn, String str9, boolean z12, boolean z13, boolean z14, int i2) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z7, z8, zzagd, list4, list5, z9, zzacl, z10, str7, list6, z11, str8, zzagn, str9, z12, z13, null, z14, i2);
        this.zzcjk = zzacf;
    }

    public zzacj(zzacf zzacf, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzagd zzagd, List<String> list4, List<String> list5, boolean z10, zzacl zzacl, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzagn zzagn, String str10, boolean z13, boolean z14, boolean z15, int i2) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, zzagd, list4, list5, z10, zzacl, z11, str8, list6, z12, str9, zzagn, str10, z13, z14, null, z15, 0);
        this.zzcjk = zzacf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzacf zzacf = this.zzcjk;
        if (!(zzacf == null || zzacf.versionCode < 9 || TextUtils.isEmpty(this.body))) {
            this.zzcua = new zzacv(new zzadj(this.body));
            this.body = null;
        }
        int zze = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 1, this.versionCode);
        zzbgo.zza(parcel, 2, this.zzcno, false);
        zzbgo.zza(parcel, 3, this.body, false);
        zzbgo.zzb(parcel, 4, this.zzchw, false);
        zzbgo.zzc(parcel, 5, this.errorCode);
        zzbgo.zzb(parcel, 6, this.zzchx, false);
        zzbgo.zza(parcel, 7, this.zzctn);
        zzbgo.zza(parcel, 8, this.zzcto);
        zzbgo.zza(parcel, 9, this.zzctp);
        zzbgo.zzb(parcel, 10, this.zzctq, false);
        zzbgo.zza(parcel, 11, this.zzcic);
        zzbgo.zzc(parcel, 12, this.orientation);
        zzbgo.zza(parcel, 13, this.zzctr, false);
        zzbgo.zza(parcel, 14, this.zzcts);
        zzbgo.zza(parcel, 15, this.zzctt, false);
        zzbgo.zza(parcel, 18, this.zzctu);
        zzbgo.zza(parcel, 19, this.zzctv, false);
        zzbgo.zza(parcel, 21, this.zzctw, false);
        zzbgo.zza(parcel, 22, this.zzctx);
        zzbgo.zza(parcel, 23, this.zzbid);
        zzbgo.zza(parcel, 24, this.zzcsd);
        zzbgo.zza(parcel, 25, this.zzcty);
        zzbgo.zza(parcel, 26, this.zzctz);
        zzbgo.zza(parcel, 28, this.zzcua, i, false);
        zzbgo.zza(parcel, 29, this.zzcub, false);
        zzbgo.zza(parcel, 30, this.zzbdl, false);
        zzbgo.zza(parcel, 31, this.zzbie);
        zzbgo.zza(parcel, 32, this.zzbif);
        zzbgo.zza(parcel, 33, this.zzcuc, i, false);
        zzbgo.zzb(parcel, 34, this.zzcud, false);
        zzbgo.zzb(parcel, 35, this.zzcue, false);
        zzbgo.zza(parcel, 36, this.zzcuf);
        zzbgo.zza(parcel, 37, this.zzcug, i, false);
        zzbgo.zza(parcel, 38, this.zzcsr);
        zzbgo.zza(parcel, 39, this.zzcss, false);
        zzbgo.zzb(parcel, 40, this.zzchz, false);
        zzbgo.zza(parcel, 42, this.zzcia);
        zzbgo.zza(parcel, 43, this.zzcuh, false);
        zzbgo.zza(parcel, 44, this.zzcui, i, false);
        zzbgo.zza(parcel, 45, this.zzcuj, false);
        zzbgo.zza(parcel, 46, this.zzcuk);
        zzbgo.zza(parcel, 47, this.zzctd);
        zzbgo.zza(parcel, 48, this.zzcul, false);
        zzbgo.zza(parcel, 49, this.zzaqw);
        zzbgo.zzc(parcel, 50, this.zzcum);
        zzbgo.zzai(parcel, zze);
    }
}
