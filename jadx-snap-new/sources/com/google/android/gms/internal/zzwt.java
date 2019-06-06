package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.zza;
import java.util.ArrayList;
import java.util.List;

public final class zzwt extends zzev implements zzwr {
    zzwt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String getBody() {
        Parcel zza = zza(4, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final String getCallToAction() {
        Parcel zza = zza(6, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final Bundle getExtras() {
        Parcel zza = zza(15, zzbc());
        Bundle bundle = (Bundle) zzex.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    public final String getHeadline() {
        Parcel zza = zza(2, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final List getImages() {
        Parcel zza = zza(3, zzbc());
        ArrayList zzb = zzex.zzb(zza);
        zza.recycle();
        return zzb;
    }

    public final boolean getOverrideClickHandling() {
        Parcel zza = zza(14, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final boolean getOverrideImpressionRecording() {
        Parcel zza = zza(13, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final String getPrice() {
        Parcel zza = zza(9, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final double getStarRating() {
        Parcel zza = zza(7, zzbc());
        double readDouble = zza.readDouble();
        zza.recycle();
        return readDouble;
    }

    public final String getStore() {
        Parcel zza = zza(8, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final zzmm getVideoController() {
        Parcel zza = zza(17, zzbc());
        zzmm zzh = zzmn.zzh(zza.readStrongBinder());
        zza.recycle();
        return zzh;
    }

    public final void recordImpression() {
        zzb(10, zzbc());
    }

    public final void zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (IInterface) iObjectWrapper2);
        zzex.zza(zzbc, (IInterface) iObjectWrapper3);
        zzb(22, zzbc);
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzb(11, zzbc);
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzb(12, zzbc);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzb(16, zzbc);
    }

    public final zzqs zzkc() {
        Parcel zza = zza(5, zzbc());
        zzqs zzk = zzqt.zzk(zza.readStrongBinder());
        zza.recycle();
        return zzk;
    }

    public final IObjectWrapper zzkh() {
        Parcel zza = zza(21, zzbc());
        IObjectWrapper zzaq = zza.zzaq(zza.readStrongBinder());
        zza.recycle();
        return zzaq;
    }

    public final zzqo zzki() {
        Parcel zza = zza(19, zzbc());
        zzqo zzj = zzqp.zzj(zza.readStrongBinder());
        zza.recycle();
        return zzj;
    }

    public final IObjectWrapper zzmw() {
        Parcel zza = zza(18, zzbc());
        IObjectWrapper zzaq = zza.zzaq(zza.readStrongBinder());
        zza.recycle();
        return zzaq;
    }

    public final IObjectWrapper zzmx() {
        Parcel zza = zza(20, zzbc());
        IObjectWrapper zzaq = zza.zzaq(zza.readStrongBinder());
        zza.recycle();
        return zzaq;
    }
}
