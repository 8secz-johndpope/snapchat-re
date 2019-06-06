package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.zzbg;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.util.Arrays;

public final class Status extends zzbgl implements Result, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new zzg();
    public static final Status zzftq = new Status(0);
    public static final Status zzftr = new Status(14);
    public static final Status zzfts = new Status(8);
    public static final Status zzftt = new Status(15);
    public static final Status zzftu = new Status(16);
    private static Status zzftv = new Status(17);
    private static Status zzftw = new Status(18);
    private final int zzcc;
    private int zzehz;
    private final PendingIntent zzekd;
    private final String zzfqu;

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.zzehz = i;
        this.zzcc = i2;
        this.zzfqu = str;
        this.zzekd = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.zzehz == status.zzehz && this.zzcc == status.zzcc && zzbg.equal(this.zzfqu, status.zzfqu) && zzbg.equal(this.zzekd, status.zzekd);
    }

    public final Status getStatus() {
        return this;
    }

    public final int getStatusCode() {
        return this.zzcc;
    }

    public final String getStatusMessage() {
        return this.zzfqu;
    }

    public final boolean hasResolution() {
        return this.zzekd != null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzehz), Integer.valueOf(this.zzcc), this.zzfqu, this.zzekd});
    }

    public final boolean isSuccess() {
        return this.zzcc <= 0;
    }

    public final void startResolutionForResult(Activity activity, int i) {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.zzekd.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final String toString() {
        return zzbg.zzx(this).zzg("statusCode", zzaif()).zzg(MapboxEvent.KEY_RESOLUTION, this.zzekd).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 1, getStatusCode());
        zzbgo.zza(parcel, 2, getStatusMessage(), false);
        zzbgo.zza(parcel, 3, this.zzekd, i, false);
        zzbgo.zzc(parcel, MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL, this.zzehz);
        zzbgo.zzai(parcel, zze);
    }

    public final String zzaif() {
        String str = this.zzfqu;
        return str != null ? str : CommonStatusCodes.getStatusCodeString(this.zzcc);
    }
}
