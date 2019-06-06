package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.zzbt;
import java.util.Map;

@zzabh
public final class zzym extends zzyn implements zzt<zzaof> {
    private final Context mContext;
    private final WindowManager zzavz;
    private DisplayMetrics zzaxo;
    private final zzaof zzcct;
    private final zznu zzclw;
    private float zzclx;
    private int zzcly = -1;
    private int zzclz = -1;
    private int zzcma;
    private int zzcmb = -1;
    private int zzcmc = -1;
    private int zzcmd = -1;
    private int zzcme = -1;

    public zzym(zzaof zzaof, Context context, zznu zznu) {
        super(zzaof);
        this.zzcct = zzaof;
        this.mContext = context;
        this.zzclw = zznu;
        this.zzavz = (WindowManager) context.getSystemService("window");
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int i;
        this.zzaxo = new DisplayMetrics();
        Display defaultDisplay = this.zzavz.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zzaxo);
        this.zzclx = this.zzaxo.density;
        this.zzcma = defaultDisplay.getRotation();
        zzlc.zzij();
        DisplayMetrics displayMetrics = this.zzaxo;
        this.zzcly = zzako.zzb(displayMetrics, displayMetrics.widthPixels);
        zzlc.zzij();
        displayMetrics = this.zzaxo;
        this.zzclz = zzako.zzb(displayMetrics, displayMetrics.heightPixels);
        Activity zztj = this.zzcct.zztj();
        if (zztj == null || zztj.getWindow() == null) {
            this.zzcmb = this.zzcly;
            i = this.zzclz;
        } else {
            zzbt.zzel();
            int[] zzf = zzaij.zzf(zztj);
            zzlc.zzij();
            this.zzcmb = zzako.zzb(this.zzaxo, zzf[0]);
            zzlc.zzij();
            i = zzako.zzb(this.zzaxo, zzf[1]);
        }
        this.zzcmc = i;
        if (this.zzcct.zzty().zzvl()) {
            this.zzcmd = this.zzcly;
            this.zzcme = this.zzclz;
        } else {
            this.zzcct.measure(0, 0);
        }
        zza(this.zzcly, this.zzclz, this.zzcmb, this.zzcmc, this.zzclx, this.zzcma);
        String str = "onDeviceFeaturesReceived";
        this.zzcct.zza(str, new zzyj(new zzyl().zzo(this.zzclw.zzja()).zzn(this.zzclw.zzjb()).zzp(this.zzclw.zzjd()).zzq(this.zzclw.zzjc()).zzr(true), null).toJson());
        int[] iArr = new int[2];
        this.zzcct.getLocationOnScreen(iArr);
        zzlc.zzij();
        int zzb = zzako.zzb(this.mContext, iArr[0]);
        zzlc.zzij();
        zzc(zzb, zzako.zzb(this.mContext, iArr[1]));
        if (zzaky.zzae(2)) {
            zzaky.zzcy("Dispatching Ready Event.");
        }
        zzbn(this.zzcct.zztl().zzcu);
    }

    public final void zzc(int i, int i2) {
        int i3 = 0;
        if (this.mContext instanceof Activity) {
            i3 = zzbt.zzel().zzh((Activity) this.mContext)[0];
        }
        if (this.zzcct.zzty() == null || !this.zzcct.zzty().zzvl()) {
            zzlc.zzij();
            this.zzcmd = zzako.zzb(this.mContext, this.zzcct.getWidth());
            zzlc.zzij();
            this.zzcme = zzako.zzb(this.mContext, this.zzcct.getHeight());
        }
        zzc(i, i2 - i3, this.zzcmd, this.zzcme);
        this.zzcct.zzua().zzb(i, i2);
    }
}
