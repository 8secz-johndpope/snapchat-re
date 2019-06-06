package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class zzn extends zze {
    private /* synthetic */ zzd zzgfk;
    private IBinder zzgfo;

    public zzn(zzd zzd, int i, IBinder iBinder, Bundle bundle) {
        this.zzgfk = zzd;
        super(zzd, i, bundle);
        this.zzgfo = iBinder;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzama() {
        String str = "GmsClient";
        try {
            String interfaceDescriptor = this.zzgfo.getInterfaceDescriptor();
            if (this.zzgfk.zzhn().equals(interfaceDescriptor)) {
                IInterface zzd = this.zzgfk.zzd(this.zzgfo);
                if (zzd == null || (!this.zzgfk.zza(2, 4, zzd) && !this.zzgfk.zza(3, 4, zzd))) {
                    return false;
                }
                this.zzgfk.zzgff = null;
                Bundle zzagp = this.zzgfk.zzagp();
                if (this.zzgfk.zzgfb != null) {
                    this.zzgfk.zzgfb.onConnected(zzagp);
                }
                return true;
            }
            String zzhn = this.zzgfk.zzhn();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzhn).length() + 34) + String.valueOf(interfaceDescriptor).length());
            stringBuilder.append("service descriptor mismatch: ");
            stringBuilder.append(zzhn);
            stringBuilder.append(" vs. ");
            stringBuilder.append(interfaceDescriptor);
            Log.e(str, stringBuilder.toString());
            return false;
        } catch (RemoteException unused) {
            Log.w(str, "service probably died");
            return false;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzj(ConnectionResult connectionResult) {
        if (this.zzgfk.zzgfc != null) {
            this.zzgfk.zzgfc.onConnectionFailed(connectionResult);
        }
        this.zzgfk.onConnectionFailed(connectionResult);
    }
}
