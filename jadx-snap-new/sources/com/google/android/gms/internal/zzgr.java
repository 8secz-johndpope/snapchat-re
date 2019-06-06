package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbt;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@zzabh
@TargetApi(14)
public final class zzgr implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
    private static final long zzaxh = ((Long) zzlc.zzio().zzd(zzoi.zzbqm)).longValue();
    private final Context mApplicationContext;
    private zzake zzavf = new zzake(zzaxh);
    private final WindowManager zzavz;
    private final PowerManager zzawa;
    private final KeyguardManager zzawb;
    private boolean zzawi = false;
    private BroadcastReceiver zzawj;
    private final Rect zzawm;
    private Application zzaxi;
    private WeakReference<ViewTreeObserver> zzaxj;
    private WeakReference<View> zzaxk;
    private zzgw zzaxl;
    private int zzaxm = -1;
    private final HashSet<zzgv> zzaxn = new HashSet();
    private final DisplayMetrics zzaxo;

    public zzgr(Context context, View view) {
        this.mApplicationContext = context.getApplicationContext();
        this.zzavz = (WindowManager) context.getSystemService("window");
        this.zzawa = (PowerManager) this.mApplicationContext.getSystemService("power");
        this.zzawb = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.mApplicationContext;
        if (context2 instanceof Application) {
            this.zzaxi = (Application) context2;
            this.zzaxl = new zzgw((Application) context2, this);
        }
        this.zzaxo = context.getResources().getDisplayMetrics();
        this.zzawm = new Rect();
        this.zzawm.right = this.zzavz.getDefaultDisplay().getWidth();
        this.zzawm.bottom = this.zzavz.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.zzaxk;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzf(view2);
        }
        this.zzaxk = new WeakReference(view);
        if (view != null) {
            if (zzbt.zzen().isAttachedToWindow(view)) {
                zze(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final Rect zza(Rect rect) {
        return new Rect(zzn(rect.left), zzn(rect.top), zzn(rect.right), zzn(rect.bottom));
    }

    private final void zza(Activity activity, int i) {
        if (this.zzaxk != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.zzaxk.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.zzaxm = i;
                }
            }
        }
    }

    private final void zzat() {
        zzbt.zzel();
        zzaij.zzdfn.post(new zzgs(this));
    }

    private final void zze(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzaxj = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzawj == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzawj = new zzgt(this);
            zzbt.zzfk().zza(this.mApplicationContext, this.zzawj, intentFilter);
        }
        Application application = this.zzaxi;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzaxl);
            } catch (Exception e) {
                zzaky.zzb("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zzf(View view) {
        try {
            if (this.zzaxj != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.zzaxj.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzaxj = null;
            }
        } catch (Exception e) {
            zzaky.zzb("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            zzaky.zzb("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zzawj != null) {
            try {
                zzbt.zzfk().zza(this.mApplicationContext, this.zzawj);
            } catch (IllegalStateException e3) {
                zzaky.zzb("Failed trying to unregister the receiver", e3);
            } catch (Exception e22) {
                zzbt.zzep().zza(e22, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zzawj = null;
        }
        Application application = this.zzaxi;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzaxl);
            } catch (Exception e222) {
                zzaky.zzb("Error registering activity lifecycle callbacks.", e222);
            }
        }
    }

    private final void zzm(int i) {
        int i2 = i;
        if (this.zzaxn.size() != 0) {
            WeakReference weakReference = this.zzaxk;
            if (weakReference != null) {
                boolean z;
                boolean z2;
                View view = (View) weakReference.get();
                Object obj = i2 == 1 ? 1 : null;
                Object obj2 = view == null ? 1 : null;
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                Rect rect3 = new Rect();
                Rect rect4 = new Rect();
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                if (view != null) {
                    boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                    boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                    view.getHitRect(rect4);
                    try {
                        view.getLocationOnScreen(iArr);
                        view.getLocationInWindow(iArr2);
                    } catch (Exception e) {
                        zzaky.zzb("Failure getting view location.", e);
                    }
                    rect.left = iArr[0];
                    rect.top = iArr[1];
                    rect.right = rect.left + view.getWidth();
                    rect.bottom = rect.top + view.getHeight();
                    z = globalVisibleRect;
                    z2 = localVisibleRect;
                } else {
                    z = false;
                    z2 = false;
                }
                int windowVisibility = view != null ? view.getWindowVisibility() : 8;
                int i3 = this.zzaxm;
                if (i3 != -1) {
                    windowVisibility = i3;
                }
                boolean z3 = obj2 == null && zzbt.zzel().zza(view, this.zzawa, this.zzawb) && z && z2 && windowVisibility == 0;
                if (obj != null && !this.zzavf.tryAcquire() && z3 == this.zzawi) {
                    return;
                }
                if (z3 || this.zzawi || i2 != 1) {
                    zzgu zzgu = new zzgu(zzbt.zzes().elapsedRealtime(), this.zzawa.isScreenOn(), view != null ? zzbt.zzen().isAttachedToWindow(view) : false, view != null ? view.getWindowVisibility() : 8, zza(this.zzawm), zza(rect), zza(rect2), z, zza(rect3), z2, zza(rect4), this.zzaxo.density, z3);
                    Iterator it = this.zzaxn.iterator();
                    while (it.hasNext()) {
                        ((zzgv) it.next()).zza(zzgu);
                    }
                    this.zzawi = z3;
                }
            }
        }
    }

    private final int zzn(int i) {
        return (int) (((float) i) / this.zzaxo.density);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzm(3);
        zzat();
    }

    public final void onActivityDestroyed(Activity activity) {
        zzm(3);
        zzat();
    }

    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzm(3);
        zzat();
    }

    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzm(3);
        zzat();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzm(3);
        zzat();
    }

    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzm(3);
        zzat();
    }

    public final void onActivityStopped(Activity activity) {
        zzm(3);
        zzat();
    }

    public final void onGlobalLayout() {
        zzm(2);
        zzat();
    }

    public final void onScrollChanged() {
        zzm(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzaxm = -1;
        zze(view);
        zzm(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzaxm = -1;
        zzm(3);
        zzat();
        zzf(view);
    }

    public final void zza(zzgv zzgv) {
        this.zzaxn.add(zzgv);
        zzm(3);
    }

    public final void zzb(zzgv zzgv) {
        this.zzaxn.remove(zzgv);
    }

    public final void zzgm() {
        zzm(4);
    }
}
