package com.google.android.gms.internal;

final class zztv implements zzuk {
    private /* synthetic */ String val$name;
    private /* synthetic */ String zzcdo;

    zztv(zztu zztu, String str, String str2) {
        this.val$name = str;
        this.zzcdo = str2;
    }

    public final void zzb(zzul zzul) {
        if (zzul.zzcdt != null) {
            zzul.zzcdt.onAppEvent(this.val$name, this.zzcdo);
        }
    }
}
