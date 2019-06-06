package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@zzabh
public final class zzmy {
    private final Context mContext;
    private final zzkn zzaln;
    private AppEventListener zzamr;
    private String zzapp;
    private boolean zzaqf;
    private zzkf zzbgt;
    private AdListener zzbgu;
    private final zzwe zzbjr;
    private Correlator zzbjv;
    private zzlt zzbjw;
    private OnCustomRenderedAdLoadedListener zzbjx;
    private PublisherInterstitialAd zzbkb;
    private boolean zzbkc;
    private RewardedVideoAdListener zzgy;

    public zzmy(Context context) {
        this(context, zzkn.zzbhz, null);
    }

    private zzmy(Context context, zzkn zzkn, PublisherInterstitialAd publisherInterstitialAd) {
        this.zzbjr = new zzwe();
        this.mContext = context;
        this.zzaln = zzkn;
        this.zzbkb = publisherInterstitialAd;
    }

    private final void zzak(String str) {
        if (this.zzbjw == null) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 63);
            stringBuilder.append("The ad unit ID must be set on InterstitialAd before ");
            stringBuilder.append(str);
            stringBuilder.append(" is called.");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void setAdListener(AdListener adListener) {
        try {
            this.zzbgu = adListener;
            if (this.zzbjw != null) {
                this.zzbjw.zza(adListener != null ? new zzkh(adListener) : null);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Failed to set the AdListener.", e);
        }
    }

    public final void setAdUnitId(String str) {
        if (this.zzapp == null) {
            this.zzapp = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    public final void setImmersiveMode(boolean z) {
        try {
            this.zzaqf = z;
            if (this.zzbjw != null) {
                this.zzbjw.setImmersiveMode(z);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Failed to set immersive mode", e);
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.zzgy = rewardedVideoAdListener;
            if (this.zzbjw != null) {
                this.zzbjw.zza(rewardedVideoAdListener != null ? new zzafh(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Failed to set the AdListener.", e);
        }
    }

    public final void show() {
        try {
            zzak("show");
            this.zzbjw.showInterstitial();
        } catch (RemoteException e) {
            zzaky.zzc("Failed to show interstitial.", e);
        }
    }

    public final void zza(zzkf zzkf) {
        try {
            this.zzbgt = zzkf;
            if (this.zzbjw != null) {
                this.zzbjw.zza(zzkf != null ? new zzkg(zzkf) : null);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Failed to set the AdClickListener.", e);
        }
    }

    public final void zza(zzmu zzmu) {
        try {
            if (this.zzbjw == null) {
                String str = "loadAd";
                if (this.zzapp == null) {
                    zzak(str);
                }
                zzko zzib = this.zzbkc ? zzko.zzib() : new zzko();
                zzks zzik = zzlc.zzik();
                Context context = this.mContext;
                this.zzbjw = (zzlt) zzks.zza(context, false, new zzkv(zzik, context, zzib, this.zzapp, this.zzbjr));
                if (this.zzbgu != null) {
                    this.zzbjw.zza(new zzkh(this.zzbgu));
                }
                if (this.zzbgt != null) {
                    this.zzbjw.zza(new zzkg(this.zzbgt));
                }
                if (this.zzamr != null) {
                    this.zzbjw.zza(new zzkq(this.zzamr));
                }
                if (this.zzbjx != null) {
                    this.zzbjw.zza(new zzpe(this.zzbjx));
                }
                if (this.zzbjv != null) {
                    this.zzbjw.zza(this.zzbjv.zzbf());
                }
                if (this.zzgy != null) {
                    this.zzbjw.zza(new zzafh(this.zzgy));
                }
                this.zzbjw.setImmersiveMode(this.zzaqf);
            }
            if (this.zzbjw.zzb(zzkn.zza(this.mContext, zzmu))) {
                this.zzbjr.zzn(zzmu.zziv());
            }
        } catch (RemoteException e) {
            zzaky.zzc("Failed to load ad.", e);
        }
    }

    public final void zza(boolean z) {
        this.zzbkc = true;
    }
}
