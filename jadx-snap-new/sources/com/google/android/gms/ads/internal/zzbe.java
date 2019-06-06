package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzpk;
import com.google.android.gms.internal.zzpm;
import com.google.android.gms.internal.zzpx;
import java.util.List;

final class zzbe implements Runnable {
    private /* synthetic */ zzbb zzaro;
    private /* synthetic */ int zzarp;
    private /* synthetic */ zzpx zzars;
    private /* synthetic */ List zzart;

    zzbe(zzbb zzbb, zzpx zzpx, int i, List list) {
        this.zzaro = zzbb;
        this.zzars = zzpx;
        this.zzarp = i;
        this.zzart = list;
    }

    public final void run() {
        try {
            boolean z = false;
            zzbb zzbb;
            if ((this.zzars instanceof zzpm) && this.zzaro.zzanm.zzaun != null) {
                zzbb = this.zzaro;
                if (this.zzarp != this.zzart.size() - 1) {
                    z = true;
                }
                zzbb.zzank = z;
                this.zzaro.zzanm.zzaun.zza(zzbb.zza(this.zzars));
            } else if ((this.zzars instanceof zzpm) && this.zzaro.zzanm.zzaum != null) {
                zzbb = this.zzaro;
                if (this.zzarp != this.zzart.size() - 1) {
                    z = true;
                }
                zzbb.zzank = z;
                this.zzaro.zzanm.zzaum.zza((zzpm) this.zzars);
            } else if ((this.zzars instanceof zzpk) && this.zzaro.zzanm.zzaun != null) {
                zzbb = this.zzaro;
                if (this.zzarp != this.zzart.size() - 1) {
                    z = true;
                }
                zzbb.zzank = z;
                this.zzaro.zzanm.zzaun.zza(zzbb.zza(this.zzars));
            } else if (!(this.zzars instanceof zzpk) || this.zzaro.zzanm.zzaul == null) {
                zzbb = this.zzaro;
                if (this.zzarp != this.zzart.size() - 1) {
                    z = true;
                }
                zzbb.zzc(3, z);
            } else {
                zzbb = this.zzaro;
                if (this.zzarp != this.zzart.size() - 1) {
                    z = true;
                }
                zzbb.zzank = z;
                this.zzaro.zzanm.zzaul.zza((zzpk) this.zzars);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not call native ad loaded", e);
        }
    }
}
