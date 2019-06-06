package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.zzap;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.dynamic.IObjectWrapper.zza;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;
import com.google.android.gms.internal.zzkf;

@zzabh
public final class AdOverlayInfoParcel extends zzbgl implements ReflectedParcelable {
    public static final Creator<AdOverlayInfoParcel> CREATOR = new zzm();
    public final int orientation;
    public final String url;
    public final zzala zzatz;
    public final zzc zzcnj;
    public final zzkf zzcnk;
    public final zzn zzcnl;
    public final zzaof zzcnm;
    public final zzb zzcnn;
    public final String zzcno;
    public final boolean zzcnp;
    public final String zzcnq;
    public final zzt zzcnr;
    public final int zzcns;
    public final String zzcnt;
    public final zzap zzcnu;

    AdOverlayInfoParcel(zzc zzc, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzala zzala, String str4, zzap zzap) {
        this.zzcnj = zzc;
        this.zzcnk = (zzkf) zzn.zzy(zza.zzaq(iBinder));
        this.zzcnl = (zzn) zzn.zzy(zza.zzaq(iBinder2));
        this.zzcnm = (zzaof) zzn.zzy(zza.zzaq(iBinder3));
        this.zzcnn = (zzb) zzn.zzy(zza.zzaq(iBinder4));
        this.zzcno = str;
        this.zzcnp = z;
        this.zzcnq = str2;
        this.zzcnr = (zzt) zzn.zzy(zza.zzaq(iBinder5));
        this.orientation = i;
        this.zzcns = i2;
        this.url = str3;
        this.zzatz = zzala;
        this.zzcnt = str4;
        this.zzcnu = zzap;
    }

    public AdOverlayInfoParcel(zzc zzc, zzkf zzkf, zzn zzn, zzt zzt, zzala zzala) {
        this.zzcnj = zzc;
        this.zzcnk = zzkf;
        this.zzcnl = zzn;
        this.zzcnm = null;
        this.zzcnn = null;
        this.zzcno = null;
        this.zzcnp = false;
        this.zzcnq = null;
        this.zzcnr = zzt;
        this.orientation = -1;
        this.zzcns = 4;
        this.url = null;
        this.zzatz = zzala;
        this.zzcnt = null;
        this.zzcnu = null;
    }

    public AdOverlayInfoParcel(zzkf zzkf, zzn zzn, zzb zzb, zzt zzt, zzaof zzaof, boolean z, int i, String str, zzala zzala) {
        this.zzcnj = null;
        this.zzcnk = zzkf;
        this.zzcnl = zzn;
        this.zzcnm = zzaof;
        this.zzcnn = zzb;
        this.zzcno = null;
        this.zzcnp = z;
        this.zzcnq = null;
        this.zzcnr = zzt;
        this.orientation = i;
        this.zzcns = 3;
        this.url = str;
        this.zzatz = zzala;
        this.zzcnt = null;
        this.zzcnu = null;
    }

    public AdOverlayInfoParcel(zzkf zzkf, zzn zzn, zzb zzb, zzt zzt, zzaof zzaof, boolean z, int i, String str, String str2, zzala zzala) {
        this.zzcnj = null;
        this.zzcnk = zzkf;
        this.zzcnl = zzn;
        this.zzcnm = zzaof;
        this.zzcnn = zzb;
        this.zzcno = str2;
        this.zzcnp = z;
        this.zzcnq = str;
        this.zzcnr = zzt;
        this.orientation = i;
        this.zzcns = 3;
        this.url = null;
        this.zzatz = zzala;
        this.zzcnt = null;
        this.zzcnu = null;
    }

    public AdOverlayInfoParcel(zzkf zzkf, zzn zzn, zzt zzt, zzaof zzaof, int i, zzala zzala, String str, zzap zzap) {
        this.zzcnj = null;
        this.zzcnk = zzkf;
        this.zzcnl = zzn;
        this.zzcnm = zzaof;
        this.zzcnn = null;
        this.zzcno = null;
        this.zzcnp = false;
        this.zzcnq = null;
        this.zzcnr = zzt;
        this.orientation = i;
        this.zzcns = 1;
        this.url = null;
        this.zzatz = zzala;
        this.zzcnt = str;
        this.zzcnu = zzap;
    }

    public AdOverlayInfoParcel(zzkf zzkf, zzn zzn, zzt zzt, zzaof zzaof, boolean z, int i, zzala zzala) {
        this.zzcnj = null;
        this.zzcnk = zzkf;
        this.zzcnl = zzn;
        this.zzcnm = zzaof;
        this.zzcnn = null;
        this.zzcno = null;
        this.zzcnp = z;
        this.zzcnq = null;
        this.zzcnr = zzt;
        this.orientation = i;
        this.zzcns = 2;
        this.url = null;
        this.zzatz = zzala;
        this.zzcnt = null;
        this.zzcnu = null;
    }

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        String str = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";
        bundle.putParcelable(str, adOverlayInfoParcel);
        intent.putExtra(str, bundle);
    }

    public static AdOverlayInfoParcel zzc(Intent intent) {
        String str = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";
        try {
            Bundle bundleExtra = intent.getBundleExtra(str);
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzcnj, i, false);
        zzbgo.zza(parcel, 3, zzn.zzz(this.zzcnk).asBinder(), false);
        zzbgo.zza(parcel, 4, zzn.zzz(this.zzcnl).asBinder(), false);
        zzbgo.zza(parcel, 5, zzn.zzz(this.zzcnm).asBinder(), false);
        zzbgo.zza(parcel, 6, zzn.zzz(this.zzcnn).asBinder(), false);
        zzbgo.zza(parcel, 7, this.zzcno, false);
        zzbgo.zza(parcel, 8, this.zzcnp);
        zzbgo.zza(parcel, 9, this.zzcnq, false);
        zzbgo.zza(parcel, 10, zzn.zzz(this.zzcnr).asBinder(), false);
        zzbgo.zzc(parcel, 11, this.orientation);
        zzbgo.zzc(parcel, 12, this.zzcns);
        zzbgo.zza(parcel, 13, this.url, false);
        zzbgo.zza(parcel, 14, this.zzatz, i, false);
        zzbgo.zza(parcel, 16, this.zzcnt, false);
        zzbgo.zza(parcel, 17, this.zzcnu, i, false);
        zzbgo.zzai(parcel, zze);
    }
}
