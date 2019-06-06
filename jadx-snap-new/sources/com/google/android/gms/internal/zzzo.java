package com.google.android.gms.internal;

import android.content.Context;

@zzabh
public class zzzo extends zzzg implements zzapv {
    zzzo(Context context, zzahe zzahe, zzaof zzaof, zzzn zzzn) {
        super(context, zzahe, zzaof, zzzn);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zznr() {
        if (this.zzcoc.errorCode == -2) {
            this.zzcct.zzua().zza((zzapv) this);
            zznt();
            zzaky.zzby("Loading HTML in WebView.");
            this.zzcct.zzc(this.zzcoc.zzcno, this.zzcoc.body, null);
        }
    }

    /* Access modifiers changed, original: protected */
    public void zznt() {
    }
}
