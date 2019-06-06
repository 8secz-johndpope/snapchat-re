package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzabk;
import com.google.android.gms.internal.zzacg;
import com.google.android.gms.internal.zzada;
import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzahf;
import com.google.android.gms.internal.zzahh;
import com.google.android.gms.internal.zzahs;
import com.google.android.gms.internal.zzaid;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzaip;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzalt;
import com.google.android.gms.internal.zzaly;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzbih;
import com.google.android.gms.internal.zzhm;
import com.google.android.gms.internal.zziw.zza.zzb;
import com.google.android.gms.internal.zziz;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzms;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzov;
import com.google.android.gms.internal.zzqh;
import com.google.android.gms.internal.zzro;
import com.google.android.gms.internal.zzry;
import com.google.android.gms.internal.zzus;
import com.google.android.gms.internal.zzvr;
import com.google.android.gms.internal.zzvy;
import com.google.android.gms.internal.zzwf;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.snap.core.db.record.UploadedMediaModel;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public abstract class zzd extends zza implements zzn, zzbm, zzvr {
    protected final zzwf zzanu;
    private transient boolean zzanv;

    public zzd(Context context, zzko zzko, String str, zzwf zzwf, zzala zzala, zzv zzv) {
        this(new zzbu(context, zzko, str, zzala), zzwf, null, zzv);
    }

    private zzd(zzbu zzbu, zzwf zzwf, zzbj zzbj, zzv zzv) {
        super(zzbu, null, zzv);
        this.zzanu = zzwf;
        this.zzanv = false;
    }

    private final zzacg zza(zzkk zzkk, Bundle bundle, zzahh zzahh, int i) {
        PackageInfo packageInfo;
        Bundle bundle2;
        int i2;
        String str;
        ApplicationInfo applicationInfo = this.zzanm.zzaiq.getApplicationInfo();
        String str2 = null;
        int i3 = 0;
        try {
            packageInfo = zzbih.zzdd(this.zzanm.zzaiq).getPackageInfo(applicationInfo.packageName, 0);
        } catch (NameNotFoundException unused) {
            packageInfo = null;
        }
        DisplayMetrics displayMetrics = this.zzanm.zzaiq.getResources().getDisplayMetrics();
        if (this.zzanm.zzaua == null || this.zzanm.zzaua.getParent() == null) {
            bundle2 = null;
        } else {
            int[] iArr = new int[2];
            this.zzanm.zzaua.getLocationOnScreen(iArr);
            i2 = iArr[0];
            int i4 = 1;
            int i5 = iArr[1];
            int width = this.zzanm.zzaua.getWidth();
            int height = this.zzanm.zzaua.getHeight();
            if (!this.zzanm.zzaua.isShown() || i2 + width <= 0 || i5 + height <= 0 || i2 > displayMetrics.widthPixels || i5 > displayMetrics.heightPixels) {
                i4 = 0;
            }
            Bundle bundle3 = new Bundle(5);
            bundle3.putInt("x", i2);
            bundle3.putInt("y", i5);
            bundle3.putInt("width", width);
            bundle3.putInt("height", height);
            bundle3.putInt(Property.VISIBLE, i4);
            bundle2 = bundle3;
        }
        String zzqg = zzbt.zzep().zzpu().zzqg();
        this.zzanm.zzaug = new zzahf(zzqg, this.zzanm.zzatx);
        this.zzanm.zzaug.zzn(zzkk);
        zzbt.zzel();
        String zza = zzaij.zza(this.zzanm.zzaiq, this.zzanm.zzaua, this.zzanm.zzaud);
        long j = 0;
        if (this.zzanm.zzauk != null) {
            try {
                j = this.zzanm.zzauk.getValue();
            } catch (RemoteException unused2) {
                zzaky.zzcz("Cannot get correlation id, default to 0.");
            }
        }
        long j2 = j;
        String uuid = UUID.randomUUID().toString();
        Bundle zza2 = zzbt.zzeq().zza(this.zzanm.zzaiq, this, zzqg);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (i2 = 0; i2 < this.zzanm.zzaup.size(); i2++) {
            str = (String) this.zzanm.zzaup.b(i2);
            arrayList.add(str);
            if (this.zzanm.zzauo.containsKey(str) && this.zzanm.zzauo.get(str) != null) {
                arrayList2.add(str);
            }
        }
        zzalt zza3 = zzaid.zza(zzaid.zzdfi, new zzg(this));
        zzalt zza4 = zzaid.zza(zzaid.zzdfi, new zzh(this));
        String zzps = zzahh != null ? zzahh.zzps() : null;
        if (this.zzanm.zzauy != null && this.zzanm.zzauy.size() > 0) {
            if (packageInfo != null) {
                i3 = packageInfo.versionCode;
            }
            if (i3 > zzbt.zzep().zzqe().zzqu()) {
                zzbt.zzep().zzqe().zzra();
                zzbt.zzep().zzqe().zzac(i3);
            } else {
                JSONObject zzqz = zzbt.zzep().zzqe().zzqz();
                if (zzqz != null) {
                    JSONArray optJSONArray = zzqz.optJSONArray(this.zzanm.zzatx);
                    if (optJSONArray != null) {
                        str2 = optJSONArray.toString();
                    }
                }
            }
        }
        String str3 = str2;
        zzko zzko = this.zzanm.zzaud;
        str = this.zzanm.zzatx;
        String zzil = zzlc.zzil();
        zzala zzala = this.zzanm.zzatz;
        ArrayList arrayList3 = arrayList2;
        List list = this.zzanm.zzauy;
        boolean zzqo = zzbt.zzep().zzqe().zzqo();
        int i6 = displayMetrics.widthPixels;
        int i7 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        List zzjf = zzoi.zzjf();
        String str4 = this.zzanm.zzatw;
        zzqh zzqh = this.zzanm.zzauq;
        String zzfq = this.zzanm.zzfq();
        float zzdp = zzbt.zzfj().zzdp();
        boolean zzdq = zzbt.zzfj().zzdq();
        zzbt.zzel();
        int zzap = zzaij.zzap(this.zzanm.zzaiq);
        zzbt.zzel();
        int zzw = zzaij.zzw(this.zzanm.zzaua);
        boolean z = this.zzanm.zzaiq instanceof Activity;
        boolean zzqt = zzbt.zzep().zzqe().zzqt();
        boolean zzpx = zzbt.zzep().zzpx();
        int zzts = zzbt.zzff().zzts();
        zzbt.zzel();
        Bundle zzrf = zzaij.zzrf();
        String zzrq = zzbt.zzev().zzrq();
        zzms zzms = this.zzanm.zzaus;
        boolean zzrr = zzbt.zzev().zzrr();
        Bundle asBundle = zzus.zzln().asBundle();
        boolean zzcf = zzbt.zzep().zzqe().zzcf(this.zzanm.zzatx);
        List list2 = this.zzanm.zzauu;
        boolean zzaoe = zzbih.zzdd(this.zzanm.zzaiq).zzaoe();
        boolean zzpy = zzbt.zzep().zzpy();
        zzbt.zzen();
        return new zzacg(bundle2, zzkk, zzko, str, applicationInfo, packageInfo, zzqg, zzil, zzala, zza2, list, arrayList, bundle, zzqo, i6, i7, f, zza, j2, uuid, zzjf, str4, zzqh, zzfq, zzdp, zzdq, zzap, zzw, z, zzqt, zza3, zzps, zzpx, zzts, zzrf, zzrq, zzms, zzrr, asBundle, zzcf, zza4, list2, str3, arrayList3, i, zzaoe, zzpy, zzaip.zzrk());
    }

    static String zzc(zzahd zzahd) {
        if (zzahd == null) {
            return null;
        }
        String str = zzahd.zzcjg;
        Object obj = ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) ? 1 : null;
        if (!(obj == null || zzahd.zzcje == null)) {
            try {
                return new JSONObject(zzahd.zzcje.zzchk).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    public final String getMediationAdapterClassName() {
        return this.zzanm.zzaue == null ? null : this.zzanm.zzaue.zzcjg;
    }

    public void onAdClicked() {
        if (this.zzanm.zzaue == null) {
            zzaky.zzcz("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.zzanm.zzaue.zzdcj == null || this.zzanm.zzaue.zzdcj.zzchw == null)) {
            zzbt.zzfd();
            zzvy.zza(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, this.zzanm.zzaue, this.zzanm.zzatx, false, zzc(this.zzanm.zzaue.zzdcj.zzchw));
        }
        if (!(this.zzanm.zzaue.zzcje == null || this.zzanm.zzaue.zzcje.zzchg == null)) {
            zzbt.zzfd();
            zzvy.zza(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, this.zzanm.zzaue, this.zzanm.zzatx, false, this.zzanm.zzaue.zzcje.zzchg);
        }
        super.onAdClicked();
    }

    public final void onPause() {
        this.zzano.zzj(this.zzanm.zzaue);
    }

    public final void onResume() {
        this.zzano.zzk(this.zzanm.zzaue);
    }

    public void pause() {
        zzbq.zzgn("pause must be called on the main UI thread.");
        if (!(this.zzanm.zzaue == null || this.zzanm.zzaue.zzcnm == null || !this.zzanm.zzfo())) {
            zzbt.zzen();
            zzaip.zzh(this.zzanm.zzaue.zzcnm);
        }
        if (!(this.zzanm.zzaue == null || this.zzanm.zzaue.zzcjf == null)) {
            try {
                this.zzanm.zzaue.zzcjf.pause();
            } catch (RemoteException unused) {
                zzaky.zzcz("Could not pause mediation adapter.");
            }
        }
        this.zzano.zzj(this.zzanm.zzaue);
        this.zzanl.pause();
    }

    public final void recordImpression() {
        zza(this.zzanm.zzaue, false);
    }

    public void resume() {
        zzbq.zzgn("resume must be called on the main UI thread.");
        zzaof zzaof = (this.zzanm.zzaue == null || this.zzanm.zzaue.zzcnm == null) ? null : this.zzanm.zzaue.zzcnm;
        if (zzaof != null && this.zzanm.zzfo()) {
            zzbt.zzen();
            zzaip.zzi(this.zzanm.zzaue.zzcnm);
        }
        if (!(this.zzanm.zzaue == null || this.zzanm.zzaue.zzcjf == null)) {
            try {
                this.zzanm.zzaue.zzcjf.resume();
            } catch (RemoteException unused) {
                zzaky.zzcz("Could not resume mediation adapter.");
            }
        }
        if (zzaof == null || !zzaof.zzug()) {
            this.zzanl.resume();
        }
        this.zzano.zzk(this.zzanm.zzaue);
    }

    public void showInterstitial() {
        zzaky.zzcz("showInterstitial is not supported for current ad type");
    }

    /* Access modifiers changed, original: protected */
    public void zza(zzahd zzahd, boolean z) {
        String str = "Ad state was null when trying to ping impression URLs.";
        if (zzahd == null) {
            zzaky.zzcz(str);
            return;
        }
        if (zzahd == null) {
            zzaky.zzcz(str);
        } else {
            zzaky.zzby("Pinging Impression URLs.");
            if (this.zzanm.zzaug != null) {
                this.zzanm.zzaug.zzpk();
            }
            zzahd.zzdcu.zza(zzb.AD_IMPRESSION);
            if (!(zzahd.zzchx == null || zzahd.zzdcq)) {
                zzbt.zzel();
                zzaij.zza(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, zzc(zzahd.zzchx));
                zzahd.zzdcq = true;
            }
        }
        if (!zzahd.zzdcr || z) {
            if (!(zzahd.zzdcj == null || zzahd.zzdcj.zzchx == null)) {
                zzbt.zzfd();
                zzvy.zza(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, zzahd, this.zzanm.zzatx, z, zzc(zzahd.zzdcj.zzchx));
            }
            if (!(zzahd.zzcje == null || zzahd.zzcje.zzchh == null)) {
                zzbt.zzfd();
                zzvy.zza(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, zzahd, this.zzanm.zzatx, z, zzahd.zzcje.zzchh);
            }
            zzahd.zzdcr = true;
        }
    }

    public final void zza(zzro zzro, String str) {
        Object customTemplateId;
        zzry zzry = null;
        if (zzro != null) {
            try {
                customTemplateId = zzro.getCustomTemplateId();
            } catch (RemoteException e) {
                zzaky.zzc("Unable to call onCustomClick.", e);
                return;
            }
        }
        customTemplateId = null;
        if (!(this.zzanm.zzauo == null || customTemplateId == null)) {
            zzry = (zzry) this.zzanm.zzauo.get(customTemplateId);
        }
        if (zzry == null) {
            zzaky.zzcz("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            zzry.zzb(zzro, str);
        }
    }

    public final boolean zza(zzacg zzacg, zzov zzov) {
        this.zzanh = zzov;
        zzov.zzf("seq_num", zzacg.zzcry);
        zzov.zzf("request_id", zzacg.zzcsi);
        zzov.zzf(UploadedMediaModel.SESSION_ID, zzacg.zzcrz);
        if (zzacg.zzcrw != null) {
            zzov.zzf("app_version", String.valueOf(zzacg.zzcrw.versionCode));
        }
        zzbu zzbu = this.zzanm;
        zzbt.zzeh();
        Context context = this.zzanm.zzaiq;
        zziz zziz = this.zzanp.zzaon;
        zzahs zzada = zzacg.zzcrv.extras.getBundle("sdk_less_server_data") != null ? new zzada(context, zzacg, this, zziz) : new zzabk(context, zzacg, this, zziz);
        zzada.zzqj();
        zzbu.zzaub = zzada;
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(zzahd zzahd) {
        zzkk zzkk;
        boolean z = false;
        if (this.zzann != null) {
            zzkk = this.zzann;
            this.zzann = null;
        } else {
            zzkk = zzahd.zzcrv;
            if (zzkk.extras != null) {
                z = zzkk.extras.getBoolean("_noRefresh", false);
            }
        }
        return zza(zzkk, zzahd, z);
    }

    /* Access modifiers changed, original: protected */
    public boolean zza(zzahd zzahd, zzahd zzahd2) {
        int i;
        if (!(zzahd == null || zzahd.zzcjh == null)) {
            zzahd.zzcjh.zza(null);
        }
        if (zzahd2.zzcjh != null) {
            zzahd2.zzcjh.zza((zzvr) this);
        }
        int i2 = 0;
        if (zzahd2.zzdcj != null) {
            i2 = zzahd2.zzdcj.zzcik;
            i = zzahd2.zzdcj.zzcil;
        } else {
            i = 0;
        }
        this.zzanm.zzauz.zze(i2, i);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean zza(zzkk zzkk, zzahd zzahd, boolean z) {
        if (!z && this.zzanm.zzfo()) {
            zzbj zzbj;
            long j;
            if (zzahd.zzcic > 0) {
                zzbj = this.zzanl;
                j = zzahd.zzcic;
            } else if (zzahd.zzdcj != null && zzahd.zzdcj.zzcic > 0) {
                zzbj = this.zzanl;
                j = zzahd.zzdcj.zzcic;
            } else if (!zzahd.zzcto && zzahd.errorCode == 2) {
                this.zzanl.zzg(zzkk);
            }
            zzbj.zza(zzkk, j);
        }
        return this.zzanl.zzea();
    }

    public boolean zza(zzkk zzkk, zzov zzov) {
        return zza(zzkk, zzov, 1);
    }

    public final boolean zza(zzkk zzkk, zzov zzov, int i) {
        if (!zzce()) {
            return false;
        }
        zzahh zzqv;
        zzbt.zzel();
        zzhm zzad = zzbt.zzep().zzad(this.zzanm.zzaiq);
        String str = null;
        Bundle zza = zzad == null ? null : zzaij.zza(zzad);
        this.zzanl.cancel();
        this.zzanm.zzavb = 0;
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbti)).booleanValue()) {
            zzqv = zzbt.zzep().zzqe().zzqv();
            zzac zzet = zzbt.zzet();
            Context context = this.zzanm.zzaiq;
            zzala zzala = this.zzanm.zzatz;
            String str2 = this.zzanm.zzatx;
            if (zzqv != null) {
                str = zzqv.getAppId();
            }
            zzet.zza(context, zzala, false, zzqv, str, str2, null);
        } else {
            zzqv = null;
        }
        return zza(zza(zzkk, zza, zzqv, i), zzov);
    }

    public final void zzb(zzahd zzahd) {
        super.zzb(zzahd);
        if (zzahd.zzcje != null) {
            zzaky.zzby("Disable the debug gesture detector on the mediation ad frame.");
            if (this.zzanm.zzaua != null) {
                this.zzanm.zzaua.zzfu();
            }
            zzaky.zzby("Pinging network fill URLs.");
            zzbt.zzfd();
            zzvy.zza(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, zzahd, this.zzanm.zzatx, false, zzahd.zzcje.zzchj);
            if (!(zzahd.zzdcj == null || zzahd.zzdcj.zzchz == null || zzahd.zzdcj.zzchz.size() <= 0)) {
                zzaky.zzby("Pinging urls remotely");
                zzbt.zzel().zza(this.zzanm.zzaiq, zzahd.zzdcj.zzchz);
            }
        } else {
            zzaky.zzby("Enable the debug gesture detector on the admob ad frame.");
            if (this.zzanm.zzaua != null) {
                this.zzanm.zzaua.zzft();
            }
        }
        if (zzahd.errorCode == 3 && zzahd.zzdcj != null && zzahd.zzdcj.zzchy != null) {
            zzaky.zzby("Pinging no fill URLs.");
            zzbt.zzfd();
            zzvy.zza(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, zzahd, this.zzanm.zzatx, false, zzahd.zzdcj.zzchy);
        }
    }

    public final void zzc(String str, String str2) {
        onAppEvent(str, str2);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzc(zzkk zzkk) {
        return super.zzc(zzkk) && !this.zzanv;
    }

    /* Access modifiers changed, original: protected */
    public boolean zzce() {
        zzbt.zzel();
        if (zzaij.zzd(this.zzanm.zzaiq, this.zzanm.zzaiq.getPackageName(), "android.permission.INTERNET")) {
            zzbt.zzel();
            if (zzaij.zzag(this.zzanm.zzaiq)) {
                return true;
            }
        }
        return false;
    }

    public void zzcf() {
        this.zzanv = false;
        zzbt();
        this.zzanm.zzaug.zzpm();
    }

    public void zzcg() {
        this.zzanv = true;
        zzbv();
    }

    public void zzch() {
        zzaky.zzcz("Mediated ad does not support onVideoEnd callback");
    }

    public void zzci() {
        onAdClicked();
    }

    public final void zzcj() {
        zzcf();
    }

    public final void zzck() {
        zzbu();
    }

    public final void zzcl() {
        zzcg();
    }

    public final void zzcm() {
        if (this.zzanm.zzaue != null) {
            String str = this.zzanm.zzaue.zzcjg;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 74);
            stringBuilder.append("Mediation adapter ");
            stringBuilder.append(str);
            stringBuilder.append(" refreshed, but mediation adapters should never refresh.");
            zzaky.zzcz(stringBuilder.toString());
        }
        zza(this.zzanm.zzaue, true);
        zzbw();
    }

    public void zzcn() {
        recordImpression();
    }

    public final String zzco() {
        return this.zzanm.zzaue == null ? null : zzc(this.zzanm.zzaue);
    }

    public final void zzcp() {
        Executor executor = zzaly.zzdjt;
        zzbj zzbj = this.zzanl;
        zzbj.getClass();
        executor.execute(zze.zza(zzbj));
    }

    public final void zzcq() {
        Executor executor = zzaly.zzdjt;
        zzbj zzbj = this.zzanl;
        zzbj.getClass();
        executor.execute(zzf.zza(zzbj));
    }
}
