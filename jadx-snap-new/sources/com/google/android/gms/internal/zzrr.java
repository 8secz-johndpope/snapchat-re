package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.zzn;
import java.util.WeakHashMap;

@zzabh
public final class zzrr implements NativeCustomTemplateAd {
    private static WeakHashMap<IBinder, zzrr> zzcap = new WeakHashMap();
    private final VideoController zzbjt = new VideoController();
    private final zzro zzcaq;
    private final MediaView zzcar;

    private zzrr(zzro zzro) {
        Context context;
        this.zzcaq = zzro;
        MediaView mediaView = null;
        try {
            context = (Context) zzn.zzy(zzro.zzkk());
        } catch (RemoteException | NullPointerException e) {
            zzaky.zzb("Unable to inflate MediaView.", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.zzcaq.zzf(zzn.zzz(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                zzaky.zzb("Unable to render video in MediaView.", e2);
            }
        }
        this.zzcar = mediaView;
    }

    public static zzrr zza(zzro zzro) {
        synchronized (zzcap) {
            zzrr zzrr = (zzrr) zzcap.get(zzro.asBinder());
            if (zzrr != null) {
                return zzrr;
            }
            zzrr = new zzrr(zzro);
            zzcap.put(zzro.asBinder(), zzrr);
            return zzrr;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.zzcaq.getCustomTemplateId();
        } catch (RemoteException e) {
            zzaky.zzb("Failed to get custom template id.", e);
            return null;
        }
    }

    public final zzro zzkx() {
        return this.zzcaq;
    }
}
