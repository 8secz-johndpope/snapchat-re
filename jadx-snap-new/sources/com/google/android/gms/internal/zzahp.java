package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbt;

@zzabh
public final class zzahp {
    private final Object mLock;
    private final zzahq zzatv;
    private final String zzdcz;
    private int zzdek;
    private int zzdel;

    private zzahp(zzahq zzahq, String str) {
        this.mLock = new Object();
        this.zzatv = zzahq;
        this.zzdcz = str;
    }

    public zzahp(String str) {
        this(zzbt.zzeq(), str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahp zzahp = (zzahp) obj;
            String str = this.zzdcz;
            if (str != null) {
                return str.equals(zzahp.zzdcz);
            }
            if (zzahp.zzdcz == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzdcz;
        return str != null ? str.hashCode() : 0;
    }

    public final Bundle toBundle() {
        Bundle bundle;
        synchronized (this.mLock) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.zzdek);
            bundle.putInt("pmnll", this.zzdel);
        }
        return bundle;
    }

    public final void zze(int i, int i2) {
        synchronized (this.mLock) {
            this.zzdek = i;
            this.zzdel = i2;
            this.zzatv.zza(this);
        }
    }

    public final String zzqh() {
        return this.zzdcz;
    }
}
