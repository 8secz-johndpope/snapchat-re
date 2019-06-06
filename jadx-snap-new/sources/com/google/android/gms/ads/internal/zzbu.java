package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzafc;
import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzahe;
import com.google.android.gms.internal.zzahf;
import com.google.android.gms.internal.zzahp;
import com.google.android.gms.internal.zzahs;
import com.google.android.gms.internal.zzajb;
import com.google.android.gms.internal.zzake;
import com.google.android.gms.internal.zzako;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzlf;
import com.google.android.gms.internal.zzli;
import com.google.android.gms.internal.zzly;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zzms;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzpb;
import com.google.android.gms.internal.zzqh;
import com.google.android.gms.internal.zzrs;
import com.google.android.gms.internal.zzrv;
import com.google.android.gms.internal.zzry;
import com.google.android.gms.internal.zzsb;
import com.google.android.gms.internal.zzse;
import com.google.android.gms.internal.zzsh;
import defpackage.jh;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@zzabh
public final class zzbu implements OnGlobalLayoutListener, OnScrollChangedListener {
    public final Context zzaiq;
    boolean zzaqp;
    final String zzatw;
    public String zzatx;
    final zzcv zzaty;
    public final zzala zzatz;
    zzbv zzaua;
    public zzahs zzaub;
    public zzajb zzauc;
    public zzko zzaud;
    public zzahd zzaue;
    public zzahe zzauf;
    public zzahf zzaug;
    zzlf zzauh;
    zzli zzaui;
    zzly zzauj;
    zzme zzauk;
    zzrs zzaul;
    zzrv zzaum;
    zzsh zzaun;
    jh<String, zzry> zzauo;
    jh<String, zzsb> zzaup;
    zzqh zzauq;
    zzns zzaur;
    zzms zzaus;
    zzse zzaut;
    List<Integer> zzauu;
    zzpb zzauv;
    zzafc zzauw;
    public String zzaux;
    List<String> zzauy;
    public zzahp zzauz;
    View zzava;
    public int zzavb;
    private HashSet<zzahf> zzavc;
    private int zzavd;
    private int zzave;
    private zzake zzavf;
    private boolean zzavg;
    private boolean zzavh;
    private boolean zzavi;

    public zzbu(Context context, zzko zzko, String str, zzala zzala) {
        this(context, zzko, str, zzala, null);
    }

    private zzbu(Context context, zzko zzko, String str, zzala zzala, zzcv zzcv) {
        this.zzauz = null;
        this.zzava = null;
        this.zzavb = 0;
        this.zzaqp = false;
        this.zzavc = null;
        this.zzavd = -1;
        this.zzave = -1;
        this.zzavg = true;
        this.zzavh = true;
        this.zzavi = false;
        zzoi.initialize(context);
        if (zzbt.zzep().zzpv() != null) {
            List zzjg = zzoi.zzjg();
            if (zzala.zzdiz != 0) {
                zzjg.add(Integer.toString(zzala.zzdiz));
            }
            zzbt.zzep().zzpv().zzg(zzjg);
        }
        this.zzatw = UUID.randomUUID().toString();
        if (zzko.zzbib || zzko.zzbid) {
            this.zzaua = null;
        } else {
            this.zzaua = new zzbv(context, str, zzala.zzcu, this, this);
            this.zzaua.setMinimumWidth(zzko.widthPixels);
            this.zzaua.setMinimumHeight(zzko.heightPixels);
            this.zzaua.setVisibility(4);
        }
        this.zzaud = zzko;
        this.zzatx = str;
        this.zzaiq = context;
        this.zzatz = zzala;
        this.zzaty = new zzcv(new zzaf(this));
        this.zzavf = new zzake(200);
        this.zzaup = new jh();
    }

    private final void zzf(boolean z) {
        if (this.zzaua != null) {
            zzahd zzahd = this.zzaue;
            if (zzahd != null && zzahd.zzcnm != null && this.zzaue.zzcnm.zzua() != null && (!z || this.zzavf.tryAcquire())) {
                if (this.zzaue.zzcnm.zzua().zzfz()) {
                    int[] iArr = new int[2];
                    this.zzaua.getLocationOnScreen(iArr);
                    zzlc.zzij();
                    int zzb = zzako.zzb(this.zzaiq, iArr[0]);
                    zzlc.zzij();
                    int zzb2 = zzako.zzb(this.zzaiq, iArr[1]);
                    if (!(zzb == this.zzavd && zzb2 == this.zzave)) {
                        this.zzavd = zzb;
                        this.zzave = zzb2;
                        this.zzaue.zzcnm.zzua().zza(this.zzavd, this.zzave, z ^ 1);
                    }
                }
                zzbv zzbv = this.zzaua;
                if (zzbv != null) {
                    View findViewById = zzbv.getRootView().findViewById(16908290);
                    if (findViewById != null) {
                        Rect rect = new Rect();
                        Rect rect2 = new Rect();
                        this.zzaua.getGlobalVisibleRect(rect);
                        findViewById.getGlobalVisibleRect(rect2);
                        if (rect.top != rect2.top) {
                            this.zzavg = false;
                        }
                        if (rect.bottom != rect2.bottom) {
                            this.zzavh = false;
                        }
                    }
                }
            }
        }
    }

    public final void onGlobalLayout() {
        zzf(false);
    }

    public final void onScrollChanged() {
        zzf(true);
        this.zzavi = true;
    }

    public final void zza(HashSet<zzahf> hashSet) {
        this.zzavc = hashSet;
    }

    public final HashSet<zzahf> zzfl() {
        return this.zzavc;
    }

    public final void zzfm() {
        zzahd zzahd = this.zzaue;
        if (zzahd != null && zzahd.zzcnm != null) {
            this.zzaue.zzcnm.destroy();
        }
    }

    public final void zzfn() {
        zzahd zzahd = this.zzaue;
        if (!(zzahd == null || zzahd.zzcjf == null)) {
            try {
                this.zzaue.zzcjf.destroy();
            } catch (RemoteException unused) {
                zzaky.zzcz("Could not destroy mediation adapter.");
            }
        }
    }

    public final boolean zzfo() {
        return this.zzavb == 0;
    }

    public final boolean zzfp() {
        return this.zzavb == 1;
    }

    public final String zzfq() {
        String str = "";
        return (this.zzavg && this.zzavh) ? str : this.zzavg ? this.zzavi ? "top-scrollable" : "top-locked" : this.zzavh ? this.zzavi ? "bottom-scrollable" : "bottom-locked" : str;
    }

    public final void zzg(boolean z) {
        if (this.zzavb == 0) {
            zzahd zzahd = this.zzaue;
            if (!(zzahd == null || zzahd.zzcnm == null)) {
                this.zzaue.zzcnm.stopLoading();
            }
        }
        zzahs zzahs = this.zzaub;
        if (zzahs != null) {
            zzahs.cancel();
        }
        zzajb zzajb = this.zzauc;
        if (zzajb != null) {
            zzajb.cancel();
        }
        if (z) {
            this.zzaue = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzi(View view) {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbrm)).booleanValue()) {
            zzcr zzae = this.zzaty.zzae();
            if (zzae != null) {
                zzae.zzb(view);
            }
        }
    }
}
