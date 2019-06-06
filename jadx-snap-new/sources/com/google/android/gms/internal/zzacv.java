package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.util.zzp;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;

@zzabh
public final class zzacv extends zzbgl {
    public static final Creator<zzacv> CREATOR = new zzacx();
    private ParcelFileDescriptor zzcup;
    private Parcelable zzcuq;
    private boolean zzcur;

    public zzacv(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzcup = parcelFileDescriptor;
        this.zzcuq = null;
        this.zzcur = true;
    }

    public zzacv(zzbgp zzbgp) {
        this.zzcup = null;
        this.zzcuq = zzbgp;
        this.zzcur = false;
    }

    private final <T> ParcelFileDescriptor zze(byte[] bArr) {
        Throwable e;
        Closeable autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new zzacw(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e2) {
                e = e2;
                zzaky.zzb("Error transporting the ad response", e);
                zzbt.zzep().zza(e, "LargeParcelTeleporter.pipeData.2");
                zzp.closeQuietly(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = null;
            zzaky.zzb("Error transporting the ad response", e);
            zzbt.zzep().zza(e, "LargeParcelTeleporter.pipeData.2");
            zzp.closeQuietly(autoCloseOutputStream);
            return null;
        }
    }

    private final ParcelFileDescriptor zzob() {
        if (this.zzcup == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzcuq.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                this.zzcup = zze(marshall);
            } finally {
                obtain.recycle();
            }
        }
        return this.zzcup;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzob();
        int zze = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzcup, i, false);
        zzbgo.zzai(parcel, zze);
    }

    public final <T extends zzbgp> T zza(Creator<T> creator) {
        if (this.zzcur) {
            byte[] bArr = this.zzcup;
            if (bArr == null) {
                zzaky.e("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new AutoCloseInputStream(bArr));
            Creator creator2;
            try {
                bArr = new byte[dataInputStream.readInt()];
                boolean z = false;
                dataInputStream.readFully(bArr, z, bArr.length);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, z, bArr.length);
                    obtain.setDataPosition(z);
                    this.zzcuq = (zzbgp) creator2.createFromParcel(obtain);
                    this.zzcur = z;
                } finally {
                    obtain.recycle();
                }
            } catch (IOException e) {
                creator2 = e;
                bArr = "Could not read from parcel file descriptor";
                zzaky.zzb(bArr, creator2);
                return null;
            } finally {
                zzp.closeQuietly(dataInputStream);
            }
        }
        return (zzbgp) this.zzcuq;
    }
}
