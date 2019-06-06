package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

final class zzapd implements OnCancelListener {
    private /* synthetic */ JsResult zzdsc;

    zzapd(JsResult jsResult) {
        this.zzdsc = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zzdsc.cancel();
    }
}
