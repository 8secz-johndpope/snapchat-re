package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

final class zzapg implements OnCancelListener {
    private /* synthetic */ JsPromptResult zzdsd;

    zzapg(JsPromptResult jsPromptResult) {
        this.zzdsd = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zzdsd.cancel();
    }
}
