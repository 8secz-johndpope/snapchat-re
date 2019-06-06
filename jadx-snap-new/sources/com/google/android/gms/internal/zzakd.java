package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbt;

@zzabh
public final class zzakd extends zzahs {
    private final String zzag;
    private final zzakz zzdhq;

    public zzakd(Context context, String str, String str2) {
        this(str2, zzbt.zzel().zzl(context, str));
    }

    private zzakd(String str, String str2) {
        this.zzdhq = new zzakz(str2);
        this.zzag = str;
    }

    public final void onStop() {
    }

    public final void zzdo() {
        this.zzdhq.zzcp(this.zzag);
    }
}
