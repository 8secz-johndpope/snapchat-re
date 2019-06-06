package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class zzda implements ActivityLifecycleCallbacks {
    private final Application zzaih;
    private final WeakReference<ActivityLifecycleCallbacks> zzaii;
    private boolean zzaij = false;

    public zzda(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzaii = new WeakReference(activityLifecycleCallbacks);
        this.zzaih = application;
    }

    private final void zza(zzdi zzdi) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.zzaii.get();
            if (activityLifecycleCallbacks != null) {
                zzdi.zza(activityLifecycleCallbacks);
                return;
            }
            if (!this.zzaij) {
                this.zzaih.unregisterActivityLifecycleCallbacks(this);
                this.zzaij = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzdb(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzdh(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzde(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzdd(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzdg(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzdc(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzdf(this, activity));
    }
}
