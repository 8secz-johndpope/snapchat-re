package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzbg;

@zzabh
public final class zzaep extends zzaev {
    private final String zzczr;
    private final int zzczs;

    public zzaep(String str, int i) {
        this.zzczr = str;
        this.zzczs = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzaep)) {
            zzaep zzaep = (zzaep) obj;
            if (zzbg.equal(this.zzczr, zzaep.zzczr) && zzbg.equal(Integer.valueOf(this.zzczs), Integer.valueOf(zzaep.zzczs))) {
                return true;
            }
        }
        return false;
    }

    public final int getAmount() {
        return this.zzczs;
    }

    public final String getType() {
        return this.zzczr;
    }
}
