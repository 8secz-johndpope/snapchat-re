package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzyr;

@zzabh
public final class zzs extends zzyr {
    private Activity zzakg;
    private AdOverlayInfoParcel zzcnx;
    private boolean zzcny = false;
    private boolean zzcnz = false;

    public zzs(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzcnx = adOverlayInfoParcel;
        this.zzakg = activity;
    }

    private final synchronized void zznq() {
        if (!this.zzcnz) {
            if (this.zzcnx.zzcnl != null) {
                this.zzcnx.zzcnl.zzcf();
            }
            this.zzcnz = true;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed() {
    }

    public final void onCreate(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzcnx;
        if (adOverlayInfoParcel == null || z) {
            this.zzakg.finish();
            return;
        }
        if (bundle == null) {
            if (adOverlayInfoParcel.zzcnk != null) {
                this.zzcnx.zzcnk.onAdClicked();
            }
            if (!(this.zzakg.getIntent() == null || !this.zzakg.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || this.zzcnx.zzcnl == null)) {
                this.zzcnx.zzcnl.zzcg();
            }
        }
        zzbt.zzei();
        if (!zza.zza(this.zzakg, this.zzcnx.zzcnj, this.zzcnx.zzcnr)) {
            this.zzakg.finish();
        }
    }

    public final void onDestroy() {
        if (this.zzakg.isFinishing()) {
            zznq();
        }
    }

    public final void onPause() {
        if (this.zzcnx.zzcnl != null) {
            this.zzcnx.zzcnl.onPause();
        }
        if (this.zzakg.isFinishing()) {
            zznq();
        }
    }

    public final void onRestart() {
    }

    public final void onResume() {
        if (this.zzcny) {
            this.zzakg.finish();
            return;
        }
        this.zzcny = true;
        if (this.zzcnx.zzcnl != null) {
            this.zzcnx.zzcnl.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzcny);
    }

    public final void onStart() {
    }

    public final void onStop() {
        if (this.zzakg.isFinishing()) {
            zznq();
        }
    }

    public final void zzbd() {
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
    }

    public final boolean zzni() {
        return false;
    }
}
