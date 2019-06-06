package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class zzaph implements OnClickListener {
    private /* synthetic */ JsPromptResult zzdsd;

    zzaph(JsPromptResult jsPromptResult) {
        this.zzdsd = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdsd.cancel();
    }
}
