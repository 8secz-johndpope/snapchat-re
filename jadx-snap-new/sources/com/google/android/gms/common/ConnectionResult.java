package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.brightcove.player.media.ErrorFields;
import com.google.android.gms.common.internal.zzbg;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;
import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.Arrays;

public final class ConnectionResult extends zzbgl {
    public static final Creator<ConnectionResult> CREATOR = new zzb();
    public static final ConnectionResult zzfqt = new ConnectionResult(0);
    private final int zzcc;
    private int zzehz;
    private final PendingIntent zzekd;
    private final String zzfqu;

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.zzehz = i;
        this.zzcc = i2;
        this.zzekd = pendingIntent;
        this.zzfqu = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    static String getStatusString(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder stringBuilder = new StringBuilder(31);
                        stringBuilder.append("UNKNOWN_ERROR_CODE(");
                        stringBuilder.append(i);
                        stringBuilder.append(")");
                        return stringBuilder.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.zzcc == connectionResult.zzcc && zzbg.equal(this.zzekd, connectionResult.zzekd) && zzbg.equal(this.zzfqu, connectionResult.zzfqu);
    }

    public final int getErrorCode() {
        return this.zzcc;
    }

    public final String getErrorMessage() {
        return this.zzfqu;
    }

    public final PendingIntent getResolution() {
        return this.zzekd;
    }

    public final boolean hasResolution() {
        return (this.zzcc == 0 || this.zzekd == null) ? false : true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzcc), this.zzekd, this.zzfqu});
    }

    public final boolean isSuccess() {
        return this.zzcc == 0;
    }

    public final String toString() {
        return zzbg.zzx(this).zzg("statusCode", getStatusString(this.zzcc)).zzg(MapboxEvent.KEY_RESOLUTION, this.zzekd).zzg(ErrorFields.MESSAGE, this.zzfqu).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 1, this.zzehz);
        zzbgo.zzc(parcel, 2, getErrorCode());
        zzbgo.zza(parcel, 3, getResolution(), i, false);
        zzbgo.zza(parcel, 4, getErrorMessage(), false);
        zzbgo.zzai(parcel, zze);
    }
}
