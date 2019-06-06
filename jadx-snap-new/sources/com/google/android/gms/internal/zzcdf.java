package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzcdf extends zzbgl {
    public static final Creator<zzcdf> CREATOR = new zzcdg();
    private int versionCode;
    private zzba zzijg = null;
    private byte[] zzijh;

    zzcdf(int i, byte[] bArr) {
        this.versionCode = i;
        this.zzijh = bArr;
        zzaot();
    }

    private final void zzaot() {
        if (this.zzijg == null && this.zzijh != null) {
            return;
        }
        if (this.zzijg != null && this.zzijh == null) {
            return;
        }
        if (this.zzijg != null && this.zzijh != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.zzijg == null && this.zzijh == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 1, this.versionCode);
        byte[] bArr = this.zzijh;
        if (bArr == null) {
            bArr = zzfls.zzc(this.zzijg);
        }
        zzbgo.zza(parcel, 2, bArr, false);
        zzbgo.zzai(parcel, i);
    }

    public final zzba zzawd() {
        if ((this.zzijg != null ? 1 : null) == null) {
            try {
                this.zzijg = (zzba) zzfls.zza(new zzba(), this.zzijh);
                this.zzijh = null;
            } catch (zzflr e) {
                throw new IllegalStateException(e);
            }
        }
        zzaot();
        return this.zzijg;
    }
}
