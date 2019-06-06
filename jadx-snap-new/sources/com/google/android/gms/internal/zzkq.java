package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.AppEventListener;

@zzabh
public final class zzkq extends zzlz {
    private final AppEventListener zzamr;

    public zzkq(AppEventListener appEventListener) {
        this.zzamr = appEventListener;
    }

    public final void onAppEvent(String str, String str2) {
        this.zzamr.onAppEvent(str, str2);
    }
}
