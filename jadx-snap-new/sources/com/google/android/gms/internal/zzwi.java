package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzwi extends IInterface {
    void destroy();

    Bundle getInterstitialAdapterInfo();

    zzmm getVideoController();

    IObjectWrapper getView();

    boolean isInitialized();

    void pause();

    void resume();

    void setImmersiveMode(boolean z);

    void showInterstitial();

    void showVideo();

    void zza(IObjectWrapper iObjectWrapper, zzafz zzafz, List<String> list);

    void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, zzafz zzafz, String str2);

    void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, zzwl zzwl);

    void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, String str2, zzwl zzwl);

    void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, String str2, zzwl zzwl, zzqh zzqh, List<String> list);

    void zza(IObjectWrapper iObjectWrapper, zzko zzko, zzkk zzkk, String str, zzwl zzwl);

    void zza(IObjectWrapper iObjectWrapper, zzko zzko, zzkk zzkk, String str, String str2, zzwl zzwl);

    void zza(zzkk zzkk, String str, String str2);

    void zzc(zzkk zzkk, String str);

    void zzg(IObjectWrapper iObjectWrapper);

    zzwr zzmp();

    zzwu zzmq();

    Bundle zzmr();

    Bundle zzms();

    boolean zzmt();

    zzro zzmu();

    zzwx zzmv();
}
