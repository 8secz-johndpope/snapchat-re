package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.zzcf;

final class zzy extends zzv {
    private /* synthetic */ Intent val$intent;
    private /* synthetic */ int val$requestCode;
    private /* synthetic */ zzcf zzgfw;

    zzy(Intent intent, zzcf zzcf, int i) {
        this.val$intent = intent;
        this.zzgfw = zzcf;
        this.val$requestCode = i;
    }

    public final void zzamo() {
        Intent intent = this.val$intent;
        if (intent != null) {
            this.zzgfw.startActivityForResult(intent, this.val$requestCode);
        }
    }
}
