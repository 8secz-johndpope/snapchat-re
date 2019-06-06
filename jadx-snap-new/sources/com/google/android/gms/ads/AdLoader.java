package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd.zza;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzkn;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzmu;
import com.google.android.gms.internal.zzqh;
import com.google.android.gms.internal.zzsq;
import com.google.android.gms.internal.zzsr;
import com.google.android.gms.internal.zzss;
import com.google.android.gms.internal.zzst;
import com.google.android.gms.internal.zzsw;
import com.google.android.gms.internal.zzwe;

public class AdLoader {
    private final Context mContext;
    private final zzkn zzaln;
    private final zzll zzalo;

    public static class Builder {
        private final Context mContext;
        private final zzlo zzalp;

        private Builder(Context context, zzlo zzlo) {
            this.mContext = context;
            this.zzalp = zzlo;
        }

        public Builder(Context context, String str) {
            this((Context) zzbq.checkNotNull(context, "context cannot be null"), zzlc.zzik().zzb(context, str, new zzwe()));
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.mContext, this.zzalp.zzdi());
            } catch (RemoteException e) {
                zzaky.zzb("Failed to build AdLoader.", e);
                return null;
            }
        }

        public Builder forAppInstallAd(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.zzalp.zza(new zzsq(onAppInstallAdLoadedListener));
            } catch (RemoteException e) {
                zzaky.zzc("Failed to add app install ad listener", e);
            }
            return this;
        }

        public Builder forContentAd(OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.zzalp.zza(new zzsr(onContentAdLoadedListener));
            } catch (RemoteException e) {
                zzaky.zzc("Failed to add content ad listener", e);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, OnCustomClickListener onCustomClickListener) {
            try {
                this.zzalp.zza(str, new zzst(onCustomTemplateAdLoadedListener), onCustomClickListener == null ? null : new zzss(onCustomClickListener));
            } catch (RemoteException e) {
                zzaky.zzc("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzalp.zzb(new zzkh(adListener));
            } catch (RemoteException e) {
                zzaky.zzc("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzalp.zza(new zzqh(nativeAdOptions));
            } catch (RemoteException e) {
                zzaky.zzc("Failed to specify native ad options", e);
            }
            return this;
        }

        public final Builder zza(zza zza) {
            try {
                this.zzalp.zza(new zzsw(zza));
            } catch (RemoteException e) {
                zzaky.zzc("Failed to add google native ad listener", e);
            }
            return this;
        }
    }

    AdLoader(Context context, zzll zzll) {
        this(context, zzll, zzkn.zzbhz);
    }

    private AdLoader(Context context, zzll zzll, zzkn zzkn) {
        this.mContext = context;
        this.zzalo = zzll;
        this.zzaln = zzkn;
    }

    private final void zza(zzmu zzmu) {
        try {
            this.zzalo.zzd(zzkn.zza(this.mContext, zzmu));
        } catch (RemoteException e) {
            zzaky.zzb("Failed to load ad.", e);
        }
    }

    public void loadAd(AdRequest adRequest) {
        zza(adRequest.zzbe());
    }
}
