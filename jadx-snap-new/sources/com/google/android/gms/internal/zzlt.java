package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzlt extends IInterface {
    void destroy();

    String getAdUnitId();

    String getMediationAdapterClassName();

    zzmm getVideoController();

    boolean isLoading();

    boolean isReady();

    void pause();

    void resume();

    void setImmersiveMode(boolean z);

    void setManualImpressionsEnabled(boolean z);

    void setUserId(String str);

    void showInterstitial();

    void stopLoading();

    void zza(zzafc zzafc);

    void zza(zzko zzko);

    void zza(zzlf zzlf);

    void zza(zzli zzli);

    void zza(zzly zzly);

    void zza(zzme zzme);

    void zza(zzms zzms);

    void zza(zzns zzns);

    void zza(zzpb zzpb);

    void zza(zzyx zzyx);

    void zza(zzzd zzzd, String str);

    boolean zzb(zzkk zzkk);

    IObjectWrapper zzbp();

    zzko zzbq();

    void zzbs();

    zzly zzcc();

    zzli zzcd();

    String zzco();
}
