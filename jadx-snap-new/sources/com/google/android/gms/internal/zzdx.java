package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;

public final class zzdx extends zzeu {
    private final Activity zzakg;
    private final View zzakh;

    public zzdx(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2, View view, Activity activity) {
        super(zzdm, str, str2, zzba, i, 62);
        this.zzakh = view;
        this.zzakg = activity;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        if (this.zzakh != null) {
            long[] jArr = (long[]) this.zzaku.invoke(null, new Object[]{this.zzakh, this.zzakg});
            synchronized (this.zzakm) {
                this.zzakm.zzey = Long.valueOf(jArr[0]);
                this.zzakm.zzez = Long.valueOf(jArr[1]);
            }
        }
    }
}
