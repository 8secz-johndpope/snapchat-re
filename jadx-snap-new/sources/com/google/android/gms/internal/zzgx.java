package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class zzgx implements zzhe {
    private /* synthetic */ Activity val$activity;
    private /* synthetic */ Bundle zzaik;

    zzgx(zzgw zzgw, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzaik = bundle;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.val$activity, this.zzaik);
    }
}
