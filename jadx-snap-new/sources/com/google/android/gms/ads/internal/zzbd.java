package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.zzacf;
import com.google.android.gms.internal.zzacg;
import com.google.android.gms.internal.zzahe;
import com.google.android.gms.internal.zzali;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzov;
import com.google.android.gms.internal.zzpx;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

final class zzbd implements Callable<zzpx> {
    private /* synthetic */ zzahe zzant;
    private /* synthetic */ zzbb zzaro;
    private /* synthetic */ int zzarp;
    private /* synthetic */ JSONArray zzarq;
    private /* synthetic */ int zzarr;

    zzbd(zzbb zzbb, int i, JSONArray jSONArray, int i2, zzahe zzahe) {
        this.zzaro = zzbb;
        this.zzarp = i;
        this.zzarq = jSONArray;
        this.zzarr = i2;
        this.zzant = zzahe;
    }

    public final /* synthetic */ Object call() {
        if (this.zzarp >= this.zzarq.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.zzarq.get(this.zzarp));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        zzbb zzbb = new zzbb(this.zzaro.zzanm.zzaiq, this.zzaro.zzanp, this.zzaro.zzanm.zzaud, this.zzaro.zzanm.zzatx, this.zzaro.zzanu, this.zzaro.zzanm.zzatz, true);
        zzbb = this.zzaro;
        zzbb.zza(zzbb.zzanm, zzbb.zzanm);
        zzbb.zzdr();
        zzbb.zza(this.zzaro.zzani);
        zzov zzov = zzbb.zzanh;
        int i = this.zzarp;
        zzov.zzf("num_ads_requested", String.valueOf(this.zzarr));
        zzov.zzf("ad_index", String.valueOf(i));
        zzacf zzacf = this.zzant.zzcvm;
        Bundle bundle = zzacf.zzcrv.extras != null ? new Bundle(zzacf.zzcrv.extras) : new Bundle();
        bundle.putString("_ad", jSONObject.toString());
        zzkk zzkk = r5;
        zzkk zzkk2 = new zzkk(zzacf.zzcrv.versionCode, zzacf.zzcrv.zzbgv, bundle, zzacf.zzcrv.zzbgw, zzacf.zzcrv.zzbgx, zzacf.zzcrv.zzbgy, zzacf.zzcrv.zzbgz, zzacf.zzcrv.zzbha, zzacf.zzcrv.zzbhb, zzacf.zzcrv.zzbhc, zzacf.zzcrv.zzbhd, zzacf.zzcrv.zzbhe, zzacf.zzcrv.zzbhf, zzacf.zzcrv.zzbhg, zzacf.zzcrv.zzbhh, zzacf.zzcrv.zzbhi, zzacf.zzcrv.zzbhj, zzacf.zzcrv.zzbhk);
        zzbb.zza(new zzacg(zzacf.zzcru, zzkk, zzacf.zzaud, zzacf.zzatx, zzacf.applicationInfo, zzacf.zzcrw, zzacf.zzcry, zzacf.zzcrz, zzacf.zzatz, zzacf.zzcsa, zzacf.zzauy, zzacf.zzcsk, zzacf.zzcsc, zzacf.zzcsd, zzacf.zzcse, zzacf.zzcsf, zzacf.zzaxz, zzacf.zzcsg, zzacf.zzcsh, zzacf.zzcsi, zzacf.zzcsj, zzacf.zzatw, zzacf.zzauq, zzacf.zzcsm, zzacf.zzcsn, zzacf.zzcst, zzacf.zzcso, zzacf.zzcsp, zzacf.zzcsq, zzacf.zzcsr, zzali.zzh(zzacf.zzcss), zzacf.zzcsu, zzacf.zzcia, zzacf.zzcsv, zzacf.zzcsw, zzacf.zzcsx, zzacf.zzaus, zzacf.zzcsy, zzacf.zzcsz, zzacf.zzctd, zzali.zzh(zzacf.zzcrx), zzacf.zzauu, zzacf.zzcte, zzacf.zzctf, 1, zzacf.zzcth, zzacf.zzcti, zzacf.zzctj), zzbb.zzanh);
        return (zzpx) zzbb.zzdt().get();
    }
}
