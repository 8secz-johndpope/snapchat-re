package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzajc;

@zzabh
final class zzh extends RelativeLayout {
    private zzajc zzavj;
    boolean zzcnf;

    public zzh(Context context, String str, String str2) {
        super(context);
        this.zzavj = new zzajc(context, str);
        this.zzavj.zzcq(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.zzcnf) {
            this.zzavj.zze(motionEvent);
        }
        return false;
    }
}
