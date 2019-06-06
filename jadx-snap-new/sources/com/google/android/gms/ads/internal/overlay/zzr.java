package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzahw;

@zzabh
public final class zzr extends zzd {
    public zzr(Activity activity) {
        super(activity);
    }

    public final void onCreate(Bundle bundle) {
        zzahw.v("AdOverlayParcel is null or does not contain valid overlay type.");
        this.zzcmv = 3;
        this.mActivity.finish();
    }
}
