package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.formats.NativeAdOptions;

@zzabh
public final class zzqh extends zzbgl {
    public static final Creator<zzqh> CREATOR = new zzqi();
    public final int versionCode;
    public final boolean zzbzj;
    public final int zzbzk;
    public final boolean zzbzl;
    public final int zzbzm;
    public final zzns zzbzn;

    public zzqh(int i, boolean z, int i2, boolean z2, int i3, zzns zzns) {
        this.versionCode = i;
        this.zzbzj = z;
        this.zzbzk = i2;
        this.zzbzl = z2;
        this.zzbzm = i3;
        this.zzbzn = zzns;
    }

    public zzqh(NativeAdOptions nativeAdOptions) {
        boolean shouldReturnUrlsForImageAssets = nativeAdOptions.shouldReturnUrlsForImageAssets();
        int imageOrientation = nativeAdOptions.getImageOrientation();
        boolean shouldRequestMultipleImages = nativeAdOptions.shouldRequestMultipleImages();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        zzns zzns = nativeAdOptions.getVideoOptions() != null ? new zzns(nativeAdOptions.getVideoOptions()) : null;
        this(3, shouldReturnUrlsForImageAssets, imageOrientation, shouldRequestMultipleImages, adChoicesPlacement, zzns);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 1, this.versionCode);
        zzbgo.zza(parcel, 2, this.zzbzj);
        zzbgo.zzc(parcel, 3, this.zzbzk);
        zzbgo.zza(parcel, 4, this.zzbzl);
        zzbgo.zzc(parcel, 5, this.zzbzm);
        zzbgo.zza(parcel, 6, this.zzbzn, i, false);
        zzbgo.zzai(parcel, zze);
    }
}
