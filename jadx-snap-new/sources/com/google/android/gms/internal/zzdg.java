package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class zzdg implements zzdi {
    private /* synthetic */ Activity val$activity;
    private /* synthetic */ Bundle zzaik;

    zzdg(zzda zzda, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzaik = bundle;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.val$activity, this.zzaik);
    }
}
