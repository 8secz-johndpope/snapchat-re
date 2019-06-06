package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;

public final class zzah {
    private final ComponentName mComponentName = null;
    private final String zzdxe;
    private final String zzggu;
    private final int zzggv;

    public zzah(String str, String str2, int i) {
        this.zzdxe = zzbq.zzgv(str);
        this.zzggu = zzbq.zzgv(str2);
        this.zzggv = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzah = (zzah) obj;
        return zzbg.equal(this.zzdxe, zzah.zzdxe) && zzbg.equal(this.zzggu, zzah.zzggu) && zzbg.equal(this.mComponentName, zzah.mComponentName) && this.zzggv == zzah.zzggv;
    }

    public final ComponentName getComponentName() {
        return this.mComponentName;
    }

    public final String getPackage() {
        return this.zzggu;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzdxe, this.zzggu, this.mComponentName, Integer.valueOf(this.zzggv)});
    }

    public final String toString() {
        String str = this.zzdxe;
        return str == null ? this.mComponentName.flattenToString() : str;
    }

    public final int zzamu() {
        return this.zzggv;
    }

    public final Intent zzcq(Context context) {
        String str = this.zzdxe;
        return str != null ? new Intent(str).setPackage(this.zzggu) : new Intent().setComponent(this.mComponentName);
    }
}
