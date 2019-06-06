package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfln<M extends zzflm<M>, T> {
    public final int tag;
    private int type;
    protected final Class<T> zznro;
    protected final boolean zzpvm;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfln)) {
            return false;
        }
        zzfln zzfln = (zzfln) obj;
        return this.type == zzfln.type && this.zznro == zzfln.zznro && this.tag == zzfln.tag && this.zzpvm == zzfln.zzpvm;
    }

    public final int hashCode() {
        return ((((((this.type + 1147) * 31) + this.zznro.hashCode()) * 31) + this.tag) * 31) + this.zzpvm;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(Object obj, zzflk zzflk) {
        try {
            zzflk.zzmy(this.tag);
            int i = this.type;
            if (i == 10) {
                i = this.tag >>> 3;
                ((zzfls) obj).zza(zzflk);
                zzflk.zzac(i, 4);
            } else if (i == 11) {
                zzflk.zzb((zzfls) obj);
            } else {
                int i2 = this.type;
                StringBuilder stringBuilder = new StringBuilder(24);
                stringBuilder.append("Unknown type ");
                stringBuilder.append(i2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzcw(Object obj) {
        int i = this.tag >>> 3;
        int i2 = this.type;
        if (i2 == 10) {
            return (zzflk.zzlw(i) << 1) + ((zzfls) obj).zzhs();
        } else if (i2 == 11) {
            return zzflk.zzb(i, (zzfls) obj);
        } else {
            StringBuilder stringBuilder = new StringBuilder(24);
            stringBuilder.append("Unknown type ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
