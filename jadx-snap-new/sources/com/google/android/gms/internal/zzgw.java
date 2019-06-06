package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class zzgw implements ActivityLifecycleCallbacks {
    private final Application zzaxi;
    private final WeakReference<ActivityLifecycleCallbacks> zzaya;
    private boolean zzayb = false;

    public zzgw(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzaya = new WeakReference(activityLifecycleCallbacks);
        this.zzaxi = application;
    }

    private final void zza(zzhe zzhe) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.zzaya.get();
            if (activityLifecycleCallbacks != null) {
                zzhe.zza(activityLifecycleCallbacks);
                return;
            }
            if (!this.zzayb) {
                this.zzaxi.unregisterActivityLifecycleCallbacks(this);
                this.zzayb = true;
            }
        } catch (Exception e) {
            zzaky.zzb("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzgx(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzhd(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzha(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzgz(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzhc(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzgy(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzhb(this, activity));
    }
}
