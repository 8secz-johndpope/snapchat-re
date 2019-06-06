package com.google.android.gms.internal;

import android.content.ComponentName;
import defpackage.cb;
import defpackage.cd;
import java.lang.ref.WeakReference;

public final class zzfxe extends cd {
    private WeakReference<zzfxf> zzrni;

    public zzfxe(zzfxf zzfxf) {
        this.zzrni = new WeakReference(zzfxf);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, cb cbVar) {
        zzfxf zzfxf = (zzfxf) this.zzrni.get();
        if (zzfxf != null) {
            zzfxf.zza(cbVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzfxf zzfxf = (zzfxf) this.zzrni.get();
        if (zzfxf != null) {
            zzfxf.zzjt();
        }
    }
}
