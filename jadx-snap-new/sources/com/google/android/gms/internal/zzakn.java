package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import com.google.android.gms.ads.internal.zzbt;

@zzabh
public final class zzakn {
    private final View mView;
    private Activity zzdid;
    private boolean zzdie;
    private boolean zzdif;
    private boolean zzdig;
    private OnGlobalLayoutListener zzdih;
    private OnScrollChangedListener zzdii;

    public zzakn(Activity activity, View view, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.zzdid = activity;
        this.mView = view;
        this.zzdih = onGlobalLayoutListener;
        this.zzdii = onScrollChangedListener;
    }

    private static ViewTreeObserver zzj(Activity activity) {
        if (activity == null) {
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        View decorView = window.getDecorView();
        return decorView == null ? null : decorView.getViewTreeObserver();
    }

    private final void zzrx() {
        if (!this.zzdie) {
            Activity activity;
            ViewTreeObserver zzj;
            OnGlobalLayoutListener onGlobalLayoutListener = this.zzdih;
            if (onGlobalLayoutListener != null) {
                activity = this.zzdid;
                if (activity != null) {
                    zzj = zzj(activity);
                    if (zzj != null) {
                        zzj.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    }
                }
                zzbt.zzfg();
                zzaml.zza(this.mView, this.zzdih);
            }
            OnScrollChangedListener onScrollChangedListener = this.zzdii;
            if (onScrollChangedListener != null) {
                activity = this.zzdid;
                if (activity != null) {
                    zzj = zzj(activity);
                    if (zzj != null) {
                        zzj.addOnScrollChangedListener(onScrollChangedListener);
                    }
                }
                zzbt.zzfg();
                zzaml.zza(this.mView, this.zzdii);
            }
            this.zzdie = true;
        }
    }

    private final void zzry() {
        Activity activity = this.zzdid;
        if (activity != null && this.zzdie) {
            OnGlobalLayoutListener onGlobalLayoutListener = this.zzdih;
            if (onGlobalLayoutListener != null) {
                ViewTreeObserver zzj = zzj(activity);
                if (zzj != null) {
                    zzbt.zzen().zza(zzj, onGlobalLayoutListener);
                }
            }
            OnScrollChangedListener onScrollChangedListener = this.zzdii;
            if (onScrollChangedListener != null) {
                ViewTreeObserver zzj2 = zzj(this.zzdid);
                if (zzj2 != null) {
                    zzj2.removeOnScrollChangedListener(onScrollChangedListener);
                }
            }
            this.zzdie = false;
        }
    }

    public final void onAttachedToWindow() {
        this.zzdif = true;
        if (this.zzdig) {
            zzrx();
        }
    }

    public final void onDetachedFromWindow() {
        this.zzdif = false;
        zzry();
    }

    public final void zzi(Activity activity) {
        this.zzdid = activity;
    }

    public final void zzrv() {
        this.zzdig = true;
        if (this.zzdif) {
            zzrx();
        }
    }

    public final void zzrw() {
        this.zzdig = false;
        zzry();
    }
}
