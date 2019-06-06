package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzmo extends zzev implements zzmm {
    zzmo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final float getAspectRatio() {
        Parcel zza = zza(9, zzbc());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final int getPlaybackState() {
        Parcel zza = zza(5, zzbc());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final boolean isClickToExpandEnabled() {
        Parcel zza = zza(12, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final boolean isCustomControlsEnabled() {
        Parcel zza = zza(10, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final boolean isMuted() {
        Parcel zza = zza(4, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final void mute(boolean z) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, z);
        zzb(3, zzbc);
    }

    public final void pause() {
        zzb(2, zzbc());
    }

    public final void play() {
        zzb(1, zzbc());
    }

    public final void zza(zzmp zzmp) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzmp);
        zzb(8, zzbc);
    }

    public final float zziq() {
        Parcel zza = zza(6, zzbc());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final float zzir() {
        Parcel zza = zza(7, zzbc());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final zzmp zzis() {
        zzmp zzmp;
        Parcel zza = zza(11, zzbc());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzmp = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzmp = queryLocalInterface instanceof zzmp ? (zzmp) queryLocalInterface : new zzmr(readStrongBinder);
        }
        zza.recycle();
        return zzmp;
    }
}
