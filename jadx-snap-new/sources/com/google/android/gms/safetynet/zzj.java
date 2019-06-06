package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.zzbgm;
import com.google.android.gms.internal.zzbgo;

public final class zzj implements Creator<SafeBrowsingData> {
    static void zza(SafeBrowsingData safeBrowsingData, Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, safeBrowsingData.getMetadata(), false);
        zzbgo.zza(parcel, 3, safeBrowsingData.getBlacklistsDataHolder(), i, false);
        zzbgo.zza(parcel, 4, safeBrowsingData.getFileDescriptor(), i, false);
        zzbgo.zza(parcel, 5, safeBrowsingData.getLastUpdateTimeMs());
        zzbgo.zza(parcel, 6, safeBrowsingData.getState(), false);
        zzbgo.zzai(parcel, zze);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        String str = null;
        DataHolder dataHolder = str;
        ParcelFileDescriptor parcelFileDescriptor = dataHolder;
        byte[] bArr = parcelFileDescriptor;
        long j = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = zzbgm.zzq(parcel, readInt);
            } else if (i == 3) {
                dataHolder = (DataHolder) zzbgm.zza(parcel, readInt, DataHolder.CREATOR);
            } else if (i == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) zzbgm.zza(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (i == 5) {
                j = zzbgm.zzi(parcel, readInt);
            } else if (i != 6) {
                zzbgm.zzb(parcel, readInt);
            } else {
                bArr = zzbgm.zzt(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new SafeBrowsingData(str, dataHolder, parcelFileDescriptor, j, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeBrowsingData[i];
    }
}
