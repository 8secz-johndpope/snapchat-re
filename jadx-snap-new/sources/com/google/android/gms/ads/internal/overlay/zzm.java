package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzap;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzbgm;

public final class zzm implements Creator<AdOverlayInfoParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbgm.zzd(parcel);
        zzc zzc = null;
        IBinder iBinder = zzc;
        IBinder iBinder2 = iBinder;
        IBinder iBinder3 = iBinder2;
        IBinder iBinder4 = iBinder3;
        String str = iBinder4;
        String str2 = str;
        IBinder iBinder5 = str2;
        String str3 = iBinder5;
        zzala zzala = str3;
        String str4 = zzala;
        zzap zzap = str4;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    zzc = (zzc) zzbgm.zza(parcel2, readInt, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = zzbgm.zzr(parcel2, readInt);
                    break;
                case 4:
                    iBinder2 = zzbgm.zzr(parcel2, readInt);
                    break;
                case 5:
                    iBinder3 = zzbgm.zzr(parcel2, readInt);
                    break;
                case 6:
                    iBinder4 = zzbgm.zzr(parcel2, readInt);
                    break;
                case 7:
                    str = zzbgm.zzq(parcel2, readInt);
                    break;
                case 8:
                    z = zzbgm.zzc(parcel2, readInt);
                    break;
                case 9:
                    str2 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 10:
                    iBinder5 = zzbgm.zzr(parcel2, readInt);
                    break;
                case 11:
                    i = zzbgm.zzg(parcel2, readInt);
                    break;
                case 12:
                    i2 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 13:
                    str3 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 14:
                    zzala = (zzala) zzbgm.zza(parcel2, readInt, zzala.CREATOR);
                    break;
                case 16:
                    str4 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 17:
                    zzap = (zzap) zzbgm.zza(parcel2, readInt, zzap.CREATOR);
                    break;
                default:
                    zzbgm.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbgm.zzaf(parcel2, zzd);
        return new AdOverlayInfoParcel(zzc, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzala, str4, zzap);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
