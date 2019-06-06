package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class zzdu implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
    private static final Handler zzaju = new Handler(Looper.getMainLooper());
    private final zzdm zzagq;
    private Application zzaih;
    private final Context zzajv;
    private final PowerManager zzajw;
    private final KeyguardManager zzajx;
    private BroadcastReceiver zzajy;
    private WeakReference<ViewTreeObserver> zzajz;
    private WeakReference<View> zzaka;
    private zzda zzakb;
    private boolean zzakc = false;
    private int zzakd = -1;
    private long zzake = -3;

    public zzdu(zzdm zzdm, View view) {
        this.zzagq = zzdm;
        this.zzajv = zzdm.zzaiq;
        this.zzajw = (PowerManager) this.zzajv.getSystemService("power");
        this.zzajx = (KeyguardManager) this.zzajv.getSystemService("keyguard");
        Context context = this.zzajv;
        if (context instanceof Application) {
            this.zzaih = (Application) context;
            this.zzakb = new zzda((Application) context, this);
        }
        zzd(view);
    }

    private final void zza(Activity activity, int i) {
        if (this.zzaka != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.zzaka.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.zzakd = i;
                }
            }
        }
    }

    private final void zzat() {
        zzaju.post(new zzdv(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Missing block: B:22:0x0056, code skipped:
            if (r4 == null) goto L_0x0059;
     */
    private final void zzav() {
        /*
        r9 = this;
        r0 = r9.zzaka;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r0.get();
        r0 = (android.view.View) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x0015;
    L_0x000e:
        r2 = -3;
        r9.zzake = r2;
        r9.zzakc = r1;
        return;
    L_0x0015:
        r2 = new android.graphics.Rect;
        r2.<init>();
        r2 = r0.getGlobalVisibleRect(r2);
        r3 = new android.graphics.Rect;
        r3.<init>();
        r3 = r0.getLocalVisibleRect(r3);
        r4 = r9.zzagq;
        r4 = r4.zzal();
        r5 = 1;
        if (r4 != 0) goto L_0x005b;
    L_0x0030:
        r4 = r9.zzajx;
        r4 = r4.inKeyguardRestrictedInputMode();
        if (r4 == 0) goto L_0x0059;
    L_0x0038:
        r4 = com.google.android.gms.internal.zzds.zzc(r0);
        if (r4 == 0) goto L_0x0055;
    L_0x003e:
        r4 = r4.getWindow();
        if (r4 != 0) goto L_0x0046;
    L_0x0044:
        r4 = 0;
        goto L_0x004a;
    L_0x0046:
        r4 = r4.getAttributes();
    L_0x004a:
        if (r4 == 0) goto L_0x0055;
    L_0x004c:
        r4 = r4.flags;
        r6 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r4 = r4 & r6;
        if (r4 == 0) goto L_0x0055;
    L_0x0053:
        r4 = 1;
        goto L_0x0056;
    L_0x0055:
        r4 = 0;
    L_0x0056:
        if (r4 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x005b;
    L_0x0059:
        r4 = 0;
        goto L_0x005c;
    L_0x005b:
        r4 = 1;
    L_0x005c:
        r6 = r0.getWindowVisibility();
        r7 = r9.zzakd;
        r8 = -1;
        if (r7 == r8) goto L_0x0066;
    L_0x0065:
        r6 = r7;
    L_0x0066:
        r7 = r0.getVisibility();
        if (r7 != 0) goto L_0x0083;
    L_0x006c:
        r0 = r0.isShown();
        if (r0 == 0) goto L_0x0083;
    L_0x0072:
        r0 = r9.zzajw;
        r0 = r0.isScreenOn();
        if (r0 == 0) goto L_0x0083;
    L_0x007a:
        if (r4 == 0) goto L_0x0083;
    L_0x007c:
        if (r3 == 0) goto L_0x0083;
    L_0x007e:
        if (r2 == 0) goto L_0x0083;
    L_0x0080:
        if (r6 != 0) goto L_0x0083;
    L_0x0082:
        r1 = 1;
    L_0x0083:
        r0 = r9.zzakc;
        if (r0 == r1) goto L_0x0094;
    L_0x0087:
        if (r1 == 0) goto L_0x008e;
    L_0x0089:
        r2 = android.os.SystemClock.elapsedRealtime();
        goto L_0x0090;
    L_0x008e:
        r2 = -2;
    L_0x0090:
        r9.zzake = r2;
        r9.zzakc = r1;
    L_0x0094:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdu.zzav():void");
    }

    private final void zze(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzajz = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzajy == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzajy = new zzdw(this);
            this.zzajv.registerReceiver(this.zzajy, intentFilter);
        }
        Application application = this.zzaih;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzakb);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A:{Catch:{ Exception -> 0x002d }} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A:{SYNTHETIC, Splitter:B:17:0x0031} */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A:{SYNTHETIC, Splitter:B:23:0x003c} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Failed to process nested try/catch */
    private final void zzf(android.view.View r4) {
        /*
        r3 = this;
        r0 = 0;
        r1 = r3.zzajz;	 Catch:{ Exception -> 0x001d }
        if (r1 == 0) goto L_0x001d;
    L_0x0005:
        r1 = r3.zzajz;	 Catch:{ Exception -> 0x001d }
        r1 = r1.get();	 Catch:{ Exception -> 0x001d }
        r1 = (android.view.ViewTreeObserver) r1;	 Catch:{ Exception -> 0x001d }
        if (r1 == 0) goto L_0x001b;
    L_0x000f:
        r2 = r1.isAlive();	 Catch:{ Exception -> 0x001d }
        if (r2 == 0) goto L_0x001b;
    L_0x0015:
        r1.removeOnScrollChangedListener(r3);	 Catch:{ Exception -> 0x001d }
        r1.removeGlobalOnLayoutListener(r3);	 Catch:{ Exception -> 0x001d }
    L_0x001b:
        r3.zzajz = r0;	 Catch:{ Exception -> 0x001d }
    L_0x001d:
        r4 = r4.getViewTreeObserver();	 Catch:{ Exception -> 0x002d }
        r1 = r4.isAlive();	 Catch:{ Exception -> 0x002d }
        if (r1 == 0) goto L_0x002d;
    L_0x0027:
        r4.removeOnScrollChangedListener(r3);	 Catch:{ Exception -> 0x002d }
        r4.removeGlobalOnLayoutListener(r3);	 Catch:{ Exception -> 0x002d }
    L_0x002d:
        r4 = r3.zzajy;
        if (r4 == 0) goto L_0x0038;
    L_0x0031:
        r1 = r3.zzajv;	 Catch:{ Exception -> 0x0036 }
        r1.unregisterReceiver(r4);	 Catch:{ Exception -> 0x0036 }
    L_0x0036:
        r3.zzajy = r0;
    L_0x0038:
        r4 = r3.zzaih;
        if (r4 == 0) goto L_0x0041;
    L_0x003c:
        r0 = r3.zzakb;	 Catch:{ Exception -> 0x0041 }
        r4.unregisterActivityLifecycleCallbacks(r0);	 Catch:{ Exception -> 0x0041 }
    L_0x0041:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdu.zzf(android.view.View):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzav();
    }

    public final void onActivityDestroyed(Activity activity) {
        zzav();
    }

    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzav();
    }

    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzav();
        zzat();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzav();
    }

    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzav();
    }

    public final void onActivityStopped(Activity activity) {
        zzav();
    }

    public final void onGlobalLayout() {
        zzav();
    }

    public final void onScrollChanged() {
        zzav();
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzakd = -1;
        zze(view);
        zzav();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzakd = -1;
        zzav();
        zzat();
        zzf(view);
    }

    public final long zzau() {
        if (this.zzake == -2 && this.zzaka.get() == null) {
            this.zzake = -3;
        }
        return this.zzake;
    }

    /* Access modifiers changed, original: final */
    public final void zzd(View view) {
        long j;
        WeakReference weakReference = this.zzaka;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzf(view2);
        }
        this.zzaka = new WeakReference(view);
        if (view != null) {
            Object obj = (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? null : 1;
            if (obj != null) {
                zze(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.zzake = j;
    }
}
