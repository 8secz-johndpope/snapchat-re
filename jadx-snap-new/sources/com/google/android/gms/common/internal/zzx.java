package com.google.android.gms.common.internal;

import android.content.Intent;
import defpackage.fv;

final class zzx extends zzv {
    private /* synthetic */ fv val$fragment;
    private /* synthetic */ Intent val$intent;
    private /* synthetic */ int val$requestCode;

    zzx(Intent intent, fv fvVar, int i) {
        this.val$intent = intent;
        this.val$fragment = fvVar;
        this.val$requestCode = i;
    }

    public final void zzamo() {
        Intent intent = this.val$intent;
        if (intent != null) {
            this.val$fragment.startActivityForResult(intent, this.val$requestCode);
        }
    }
}
