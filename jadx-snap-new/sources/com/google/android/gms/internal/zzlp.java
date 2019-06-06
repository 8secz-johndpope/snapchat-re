package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public abstract class zzlp extends zzew implements zzlo {
    public zzlp() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        zzli zzli = null;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                IInterface zzdi = zzdi();
                parcel2.writeNoException();
                zzex.zza(parcel2, zzdi);
                break;
            case 2:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzli = queryLocalInterface instanceof zzli ? (zzli) queryLocalInterface : new zzlk(readStrongBinder);
                }
                zzb(zzli);
                break;
            case 3:
                zza(zzrt.zzo(parcel.readStrongBinder()));
                break;
            case 4:
                zza(zzrw.zzp(parcel.readStrongBinder()));
                break;
            case 5:
                zza(parcel.readString(), zzsc.zzr(parcel.readStrongBinder()), zzrz.zzq(parcel.readStrongBinder()));
                break;
            case 6:
                zza((zzqh) zzex.zza(parcel, zzqh.CREATOR));
                break;
            case 7:
                zzme zzmg;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzmg = queryLocalInterface instanceof zzme ? (zzme) queryLocalInterface : new zzmg(readStrongBinder);
                }
                zzb(zzmg);
                break;
            case 8:
                zza(zzsf.zzs(parcel.readStrongBinder()), (zzko) zzex.zza(parcel, zzko.CREATOR));
                break;
            case 9:
                zza((PublisherAdViewOptions) zzex.zza(parcel, PublisherAdViewOptions.CREATOR));
                break;
            case 10:
                zza(zzsi.zzt(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
