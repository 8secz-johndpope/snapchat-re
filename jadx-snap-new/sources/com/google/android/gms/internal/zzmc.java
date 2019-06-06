package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.zza;

public abstract class zzmc extends zzew implements zzmb {
    public zzmc() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static zzmb asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return queryLocalInterface instanceof zzmb ? (zzmb) queryLocalInterface : new zzmd(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        IInterface createBannerAdManager;
        switch (i) {
            case 1:
                createBannerAdManager = createBannerAdManager(zza.zzaq(parcel.readStrongBinder()), (zzko) zzex.zza(parcel, zzko.CREATOR), parcel.readString(), zzwg.zzu(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                createBannerAdManager = createInterstitialAdManager(zza.zzaq(parcel.readStrongBinder()), (zzko) zzex.zza(parcel, zzko.CREATOR), parcel.readString(), zzwg.zzu(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                createBannerAdManager = createAdLoaderBuilder(zza.zzaq(parcel.readStrongBinder()), parcel.readString(), zzwg.zzu(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                createBannerAdManager = getMobileAdsSettingsManager(zza.zzaq(parcel.readStrongBinder()));
                break;
            case 5:
                createBannerAdManager = createNativeAdViewDelegate(zza.zzaq(parcel.readStrongBinder()), zza.zzaq(parcel.readStrongBinder()));
                break;
            case 6:
                createBannerAdManager = createRewardedVideoAd(zza.zzaq(parcel.readStrongBinder()), zzwg.zzu(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                createBannerAdManager = createInAppPurchaseManager(zza.zzaq(parcel.readStrongBinder()));
                break;
            case 8:
                createBannerAdManager = createAdOverlay(zza.zzaq(parcel.readStrongBinder()));
                break;
            case 9:
                createBannerAdManager = getMobileAdsSettingsManagerWithClientJarVersion(zza.zzaq(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                createBannerAdManager = createSearchAdManager(zza.zzaq(parcel.readStrongBinder()), (zzko) zzex.zza(parcel, zzko.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                createBannerAdManager = createNativeAdViewHolderDelegate(zza.zzaq(parcel.readStrongBinder()), zza.zzaq(parcel.readStrongBinder()), zza.zzaq(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        zzex.zza(parcel2, createBannerAdManager);
        return true;
    }
}
