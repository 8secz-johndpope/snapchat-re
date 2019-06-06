package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;
import com.google.android.gms.internal.zzly;
import com.google.android.gms.internal.zzlz;

@zzabh
public final class PublisherAdViewOptions extends zzbgl {
    public static final Creator<PublisherAdViewOptions> CREATOR = new zzc();
    private final boolean zzamp;
    private final zzly zzamq;

    PublisherAdViewOptions(boolean z, IBinder iBinder) {
        this.zzamp = z;
        this.zzamq = iBinder != null ? zzlz.zzg(iBinder) : null;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzamp;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 1, getManualImpressionsEnabled());
        zzly zzly = this.zzamq;
        zzbgo.zza(parcel, 2, zzly == null ? null : zzly.asBinder(), false);
        zzbgo.zzai(parcel, i);
    }

    public final zzly zzbk() {
        return this.zzamq;
    }
}
