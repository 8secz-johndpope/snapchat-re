package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzmh extends IInterface {
    void initialize();

    void setAppMuted(boolean z);

    void setAppVolume(float f);

    void zza(String str, IObjectWrapper iObjectWrapper);

    void zzb(IObjectWrapper iObjectWrapper, String str);

    float zzdp();

    boolean zzdq();

    void zzu(String str);
}
