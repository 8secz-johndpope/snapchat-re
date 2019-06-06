package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzaex extends IInterface {
    void destroy();

    String getMediationAdapterClassName();

    boolean isLoaded();

    void pause();

    void resume();

    void setImmersiveMode(boolean z);

    void setUserId(String str);

    void show();

    void zza(zzafc zzafc);

    void zza(zzafi zzafi);

    void zzb(IObjectWrapper iObjectWrapper);

    void zzc(IObjectWrapper iObjectWrapper);

    void zzd(IObjectWrapper iObjectWrapper);
}
