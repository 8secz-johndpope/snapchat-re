package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.ads.internal.js.zzaa;
import com.google.android.gms.ads.internal.js.zzc;
import com.google.android.gms.ads.internal.js.zzn;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.snap.core.db.record.UnlockablesModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzada extends zzahs {
    private static final Object sLock = new Object();
    private static zzn zzcql = null;
    private static long zzcuy = TimeUnit.SECONDS.toMillis(10);
    private static boolean zzcuz = false;
    private static HttpClient zzcva = null;
    private static zzy zzcvb = null;
    private static zzt<Object> zzcvc = null;
    private final Context mContext;
    private final Object zzcoe = new Object();
    private final zzabj zzcre;
    private final zzacg zzcrf;
    private zziz zzcrh;
    private zzaa zzcvd;

    public zzada(Context context, zzacg zzacg, zzabj zzabj, zziz zziz) {
        super(true);
        this.zzcre = zzabj;
        this.mContext = context;
        this.zzcrf = zzacg;
        this.zzcrh = zziz;
        synchronized (sLock) {
            if (!zzcuz) {
                zzcvb = new zzy();
                zzcva = new HttpClient(context.getApplicationContext(), zzacg.zzatz);
                zzcvc = new zzadi();
                zzcql = new zzn(this.mContext.getApplicationContext(), this.zzcrf.zzatz, (String) zzlc.zzio().zzd(zzoi.zzblc), new zzadh(), new zzadg());
                zzcuz = true;
            }
        }
    }

    private final JSONObject zza(zzacf zzacf, String str) {
        Bundle bundle = zzacf.zzcrv.extras.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        zzaea zzaea;
        try {
            zzaea = (zzaea) zzbt.zzew().zzo(this.mContext).get();
        } catch (Exception e) {
            zzaky.zzc("Error grabbing device info: ", e);
            zzaea = null;
        }
        Context context = this.mContext;
        zzadl zzadl = new zzadl();
        zzadl.zzcvm = zzacf;
        zzadl.zzcvn = zzaea;
        JSONObject zza = zzads.zza(context, zzadl);
        if (zza == null) {
            return null;
        }
        Info advertisingIdInfo;
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.mContext);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            zzaky.zzc("Cannot get advertising id info", e2);
            advertisingIdInfo = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_param", zza);
        hashMap.put(UnlockablesModel.DATA, bundle);
        if (advertisingIdInfo != null) {
            hashMap.put("adid", advertisingIdInfo.getId());
            hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
        }
        try {
            return zzbt.zzel().zzq(hashMap);
        } catch (JSONException unused) {
            return null;
        }
    }

    protected static void zzb(zzc zzc) {
        zzc.zza("/loadAd", zzcvb);
        zzc.zza("/fetchHttpRequest", zzcva);
        zzc.zza("/invalidRequest", zzcvc);
    }

    private final zzacj zzc(zzacf zzacf) {
        zzbt.zzel();
        String zzrc = zzaij.zzrc();
        JSONObject zza = zza(zzacf, zzrc);
        if (zza == null) {
            return new zzacj(0);
        }
        long elapsedRealtime = zzbt.zzes().elapsedRealtime();
        Future zzas = zzcvb.zzas(zzrc);
        zzako.zzaju.post(new zzadc(this, zza, zzrc));
        try {
            JSONObject jSONObject = (JSONObject) zzas.get(zzcuy - (zzbt.zzes().elapsedRealtime() - elapsedRealtime), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new zzacj(-1);
            }
            zzacj zza2 = zzads.zza(this.mContext, zzacf, jSONObject.toString());
            if (zza2.errorCode != -3 && TextUtils.isEmpty(zza2.body)) {
                zza2 = new zzacj(3);
            }
            return zza2;
        } catch (InterruptedException | CancellationException unused) {
            return new zzacj(-1);
        } catch (TimeoutException unused2) {
            return new zzacj(2);
        } catch (ExecutionException unused3) {
            return new zzacj(0);
        }
    }

    protected static void zzc(zzc zzc) {
        zzc.zzb("/loadAd", zzcvb);
        zzc.zzb("/fetchHttpRequest", zzcva);
        zzc.zzb("/invalidRequest", zzcvc);
    }

    public final void onStop() {
        synchronized (this.zzcoe) {
            zzako.zzaju.post(new zzadf(this));
        }
    }

    public final void zzdo() {
        zzaky.zzby("SdkLessAdLoaderBackgroundTask started.");
        String zzz = zzbt.zzfh().zzz(this.mContext);
        zzacf zzacf = new zzacf(this.zzcrf, -1, zzbt.zzfh().zzx(this.mContext), zzbt.zzfh().zzy(this.mContext), zzz);
        zzbt.zzfh().zzg(this.mContext, zzz);
        zzacj zzc = zzc(zzacf);
        long elapsedRealtime = zzbt.zzes().elapsedRealtime();
        zzacf = zzacf;
        zzako.zzaju.post(new zzadb(this, new zzahe(zzacf, zzc, null, null, zzc.errorCode, elapsedRealtime, zzc.zzcts, null, this.zzcrh)));
    }
}
