package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class zzapi implements OnClickListener {
    private /* synthetic */ JsPromptResult zzdsd;
    private /* synthetic */ EditText zzdse;

    zzapi(JsPromptResult jsPromptResult, EditText editText) {
        this.zzdsd = jsPromptResult;
        this.zzdse = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdsd.confirm(this.zzdse.getText().toString());
    }
}
