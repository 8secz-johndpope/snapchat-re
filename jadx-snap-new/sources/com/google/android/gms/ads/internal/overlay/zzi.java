package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaof;

@zzabh
public final class zzi {
    public final int index;
    public final ViewGroup parent;
    public final Context zzaiq;
    public final LayoutParams zzcng;

    public zzi(zzaof zzaof) {
        this.zzcng = zzaof.getLayoutParams();
        ViewParent parent = zzaof.getParent();
        this.zzaiq = zzaof.zztv();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        this.parent = (ViewGroup) parent;
        this.index = this.parent.indexOfChild(zzaof.getView());
        this.parent.removeView(zzaof.getView());
        zzaof.zzah(true);
    }
}
