package com.google.android.gms.internal;

final class zztu extends zzlz {
    private /* synthetic */ zztl zzcdm;

    zztu(zztl zztl) {
        this.zzcdm = zztl;
    }

    public final void onAppEvent(String str, String str2) {
        this.zzcdm.zzaoz.add(new zztv(this, str, str2));
    }
}
