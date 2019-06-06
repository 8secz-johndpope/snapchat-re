package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.snap.search.v2.composer.SearchView;
import java.util.concurrent.atomic.AtomicBoolean;

@zzabh
public final class zzmw {
    private final zzkn zzaln;
    private VideoOptions zzamj;
    private boolean zzamp;
    private AppEventListener zzamr;
    private String zzapp;
    private zzkf zzbgt;
    private AdListener zzbgu;
    private AdSize[] zzbig;
    private final zzwe zzbjr;
    private final AtomicBoolean zzbjs;
    private final VideoController zzbjt;
    private zzle zzbju;
    private Correlator zzbjv;
    private zzlt zzbjw;
    private OnCustomRenderedAdLoadedListener zzbjx;
    private ViewGroup zzbjy;
    private int zzbjz;

    public zzmw(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzkn.zzbhz, i);
    }

    private zzmw(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzkn zzkn, int i) {
        this(viewGroup, attributeSet, z, zzkn, null, i);
    }

    private zzmw(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzkn zzkn, zzlt zzlt, int i) {
        this.zzbjr = new zzwe();
        this.zzbjt = new VideoController();
        this.zzbju = new zzmx(this);
        this.zzbjy = viewGroup;
        this.zzaln = zzkn;
        this.zzbjw = null;
        this.zzbjs = new AtomicBoolean(false);
        this.zzbjz = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzkr zzkr = new zzkr(context, attributeSet);
                this.zzbig = zzkr.zzi(z);
                this.zzapp = zzkr.getAdUnitId();
                if (viewGroup.isInEditMode()) {
                    zzako zzij = zzlc.zzij();
                    AdSize adSize = this.zzbig[0];
                    int i2 = this.zzbjz;
                    zzko zzko = new zzko(context, adSize);
                    zzko.zzbif = zzs(i2);
                    zzij.zza(viewGroup, zzko, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzlc.zzij().zza(viewGroup, new zzko(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    private static zzko zza(Context context, AdSize[] adSizeArr, int i) {
        zzko zzko = new zzko(context, adSizeArr);
        zzko.zzbif = zzs(i);
        return zzko;
    }

    private static boolean zzs(int i) {
        return i == 1;
    }

    public final void destroy() {
        try {
            if (this.zzbjw != null) {
                this.zzbjw.destroy();
            }
        } catch (RemoteException e) {
            zzaky.zzc("Failed to destroy AdView.", e);
        }
    }

    public final AdSize getAdSize() {
        try {
            if (this.zzbjw != null) {
                zzko zzbq = this.zzbjw.zzbq();
                if (zzbq != null) {
                    return zzbq.zzic();
                }
            }
        } catch (RemoteException e) {
            zzaky.zzc("Failed to get the current AdSize.", e);
        }
        AdSize[] adSizeArr = this.zzbig;
        return adSizeArr != null ? adSizeArr[0] : null;
    }

    public final VideoController getVideoController() {
        return this.zzbjt;
    }

    public final void pause() {
        try {
            if (this.zzbjw != null) {
                this.zzbjw.pause();
            }
        } catch (RemoteException e) {
            zzaky.zzc("Failed to call pause.", e);
        }
    }

    public final void resume() {
        try {
            if (this.zzbjw != null) {
                this.zzbjw.resume();
            }
        } catch (RemoteException e) {
            zzaky.zzc("Failed to call resume.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        this.zzbgu = adListener;
        this.zzbju.zza(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (this.zzbig == null) {
            zza(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void setAdUnitId(String str) {
        if (this.zzapp == null) {
            this.zzapp = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzamr = appEventListener;
            if (this.zzbjw != null) {
                this.zzbjw.zza(appEventListener != null ? new zzkq(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Failed to set the AppEventListener.", e);
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
                if ((this.zzbig == null || this.zzapp == null) && this.zzbjw == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Object zza;
                Context context = this.zzbjy.getContext();
                zzko zza2 = zza(context, this.zzbig, this.zzbjz);
                if (SearchView.a.equals(zza2.zzbia)) {
                    zza = zzks.zza(context, false, new zzku(zzlc.zzik(), context, zza2, this.zzapp));
                } else {
                    zza = zzks.zza(context, false, new zzkt(zzlc.zzik(), context, zza2, this.zzapp, this.zzbjr));
                }
                this.zzbjw = (zzlt) zza;
                this.zzbjw.zza(new zzkh(this.zzbju));
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
                if (this.zzamj != null) {
                    this.zzbjw.zza(new zzns(this.zzamj));
                }
                this.zzbjw.setManualImpressionsEnabled(this.zzamp);
                try {
                    IObjectWrapper zzbp = this.zzbjw.zzbp();
                    if (zzbp != null) {
                        this.zzbjy.addView((View) zzn.zzy(zzbp));
                    }
                } catch (RemoteException e) {
                    zzaky.zzc("Failed to get an ad frame.", e);
                }
            }
            if (this.zzbjw.zzb(zzkn.zza(this.zzbjy.getContext(), zzmu))) {
                this.zzbjr.zzn(zzmu.zziv());
            }
        } catch (RemoteException e2) {
            zzaky.zzc("Failed to load ad.", e2);
        }
    }

    public final void zza(AdSize... adSizeArr) {
        this.zzbig = adSizeArr;
        try {
            if (this.zzbjw != null) {
                this.zzbjw.zza(zza(this.zzbjy.getContext(), this.zzbig, this.zzbjz));
            }
        } catch (RemoteException e) {
            zzaky.zzc("Failed to set the ad size.", e);
        }
        this.zzbjy.requestLayout();
    }

    public final zzmm zzbh() {
        zzlt zzlt = this.zzbjw;
        if (zzlt == null) {
            return null;
        }
        try {
            return zzlt.getVideoController();
        } catch (RemoteException e) {
            zzaky.zzc("Failed to retrieve VideoController.", e);
            return null;
        }
    }
}
