package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class zzapf implements OnClickListener {
    private /* synthetic */ JsResult zzdsc;

    zzapf(JsResult jsResult) {
        this.zzdsc = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdsc.confirm();
    }
}
