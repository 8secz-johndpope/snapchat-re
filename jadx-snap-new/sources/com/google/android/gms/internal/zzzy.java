package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbb;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzzy implements Callable<zzahd> {
    private static long zzcow = 10;
    private final Context mContext;
    private int mErrorCode;
    private final Object mLock = new Object();
    private final zzov zzanh;
    private final zzaan zzarm;
    private final zzcv zzbyz;
    private final zzahe zzcob;
    private final zzajr zzcox;
    private final zzbb zzcoy;
    private boolean zzcoz;
    private List<String> zzcpa;
    private JSONObject zzcpb;
    private String zzcpc;

    public zzzy(Context context, zzbb zzbb, zzajr zzajr, zzcv zzcv, zzahe zzahe, zzov zzov) {
        this.mContext = context;
        this.zzcoy = zzbb;
        this.zzcox = zzajr;
        this.zzcob = zzahe;
        this.zzbyz = zzcv;
        this.zzanh = zzov;
        this.zzarm = zzbb.zzds();
        this.zzcoz = false;
        this.mErrorCode = -2;
        this.zzcpa = null;
        this.zzcpc = null;
    }

    private final zzalt<zzpj> zza(JSONObject jSONObject, boolean z, boolean z2) {
        String str = "url";
        CharSequence string = z ? jSONObject.getString(str) : jSONObject.optString(str);
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? zzali.zzh(new zzpj(null, Uri.parse(string), optDouble)) : this.zzcox.zza(string, new zzaac(this, z, optDouble, optBoolean, string));
        } else {
            zzd(0, z);
            return zzali.zzh(null);
        }
    }

    static zzaof zzb(zzalt<zzaof> zzalt) {
        try {
            return (zzaof) zzalt.get((long) ((Integer) zzlc.zzio().zzd(zzoi.zzbsq)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            zzaky.zzc("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            zzaky.zzc("Exception occurred while waiting for video to load", e2);
            return null;
        }
    }

    private static Integer zzb(JSONObject jSONObject, String str) {
        try {
            jSONObject = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject.getInt("r"), jSONObject.getInt("g"), jSONObject.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final zzahd zzc(zzpx zzpx) {
        int i;
        synchronized (this.mLock) {
            i = (zzpx == null && this.mErrorCode == -2) ? 0 : this.mErrorCode;
        }
        return new zzahd(this.zzcob.zzcvm.zzcrv, null, this.zzcob.zzdcw.zzchw, i, this.zzcob.zzdcw.zzchx, this.zzcpa, this.zzcob.zzdcw.orientation, this.zzcob.zzdcw.zzcic, this.zzcob.zzcvm.zzcry, false, null, null, null, null, null, 0, this.zzcob.zzaud, this.zzcob.zzdcw.zzctn, this.zzcob.zzdcn, this.zzcob.zzdco, this.zzcob.zzdcw.zzctt, this.zzcpb, i != -2 ? null : zzpx, null, null, null, this.zzcob.zzdcw.zzcuf, this.zzcob.zzdcw.zzcug, null, this.zzcob.zzdcw.zzchz, this.zzcpc, this.zzcob.zzdcu, this.zzcob.zzdcw.zzaqw, this.zzcob.zzdcv);
    }

    private final void zzc(zzro zzro, String str) {
        try {
            zzry zzs = this.zzcoy.zzs(zzro.getCustomTemplateId());
            if (zzs != null) {
                zzs.zzb(zzro, str);
            }
        } catch (RemoteException e) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 40);
            stringBuilder.append("Failed to call onCustomClick for asset ");
            stringBuilder.append(str);
            stringBuilder.append(".");
            zzaky.zzc(stringBuilder.toString(), e);
        }
    }

    private static String[] zzd(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    private static <V> zzalt<List<V>> zzl(List<zzalt<V>> list) {
        zzamd zzamd = new zzamd();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzalt zza : list) {
            zza.zza(new zzaad(atomicInteger, size, zzamd, list), zzaid.zzdfi);
        }
        return zzamd;
    }

    private static <V> List<V> zzm(List<zzalt<V>> list) {
        ArrayList arrayList = new ArrayList();
        for (zzalt zzalt : list) {
            Object obj = zzalt.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171 A:{Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0129 A:{Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0128 A:{Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f A:{Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0128 A:{Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0129 A:{Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019e  */
    /* JADX WARNING: Missing block: B:14:0x004a, code skipped:
            if (r4.length() != 0) goto L_0x0050;
     */
    private final com.google.android.gms.internal.zzahd zznv() {
        /*
        r13 = this;
        r0 = "custom_template_id";
        r1 = 0;
        r2 = 0;
        r3 = r13.zzcoy;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r12 = r3.getUuid();	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = r13.zznw();	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r3 != 0) goto L_0x0078;
    L_0x0010:
        r3 = new com.google.android.gms.internal.zzamd;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3.<init>();	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = new com.google.android.gms.internal.zzzx;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3.<init>();	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = new org.json.JSONObject;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r13.zzcob;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r4.zzdcw;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r4.body;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3.<init>(r4);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = new org.json.JSONObject;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5 = r13.zzcob;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5 = r5.zzdcw;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5 = r5.body;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4.<init>(r5);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5 = r4.length();	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r6 = "ads";
        if (r5 == 0) goto L_0x004c;
    L_0x0038:
        r4 = r4.optJSONArray(r6);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r4 == 0) goto L_0x0043;
    L_0x003e:
        r4 = r4.optJSONObject(r1);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        goto L_0x0044;
    L_0x0043:
        r4 = r2;
    L_0x0044:
        if (r4 == 0) goto L_0x004c;
    L_0x0046:
        r4 = r4.length();	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r4 != 0) goto L_0x0050;
    L_0x004c:
        r4 = 3;
        r13.zzz(r4);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
    L_0x0050:
        r4 = r13.zzarm;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = r4.zzh(r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = zzcow;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r7 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = r3.get(r4, r7);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = (org.json.JSONObject) r3;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = "success";
        r4 = r3.optBoolean(r4, r1);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r4 == 0) goto L_0x0078;
    L_0x0068:
        r4 = "json";
        r3 = r3.getJSONObject(r4);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = r3.optJSONArray(r6);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = r3.getJSONObject(r1);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r9 = r3;
        goto L_0x0079;
    L_0x0078:
        r9 = r2;
    L_0x0079:
        r3 = r13.zznw();	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r3 != 0) goto L_0x011d;
    L_0x007f:
        if (r9 != 0) goto L_0x0083;
    L_0x0081:
        goto L_0x011d;
    L_0x0083:
        r3 = "template_id";
        r3 = r9.getString(r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r13.zzcob;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r4.zzcvm;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r4.zzauq;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r4 == 0) goto L_0x009a;
    L_0x0091:
        r4 = r13.zzcob;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r4.zzcvm;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r4.zzauq;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r4.zzbzj;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        goto L_0x009b;
    L_0x009a:
        r4 = 0;
    L_0x009b:
        r5 = r13.zzcob;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5 = r5.zzcvm;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5 = r5.zzauq;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r5 == 0) goto L_0x00ac;
    L_0x00a3:
        r5 = r13.zzcob;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5 = r5.zzcvm;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5 = r5.zzauq;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5 = r5.zzbzl;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        goto L_0x00ad;
    L_0x00ac:
        r5 = 0;
    L_0x00ad:
        r6 = "2";
        r6 = r6.equals(r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r6 == 0) goto L_0x00bf;
    L_0x00b5:
        r0 = new com.google.android.gms.internal.zzaao;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = r13.zzcob;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = r3.zzdcv;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r0.<init>(r4, r5, r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        goto L_0x011e;
    L_0x00bf:
        r6 = "1";
        r6 = r6.equals(r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r6 == 0) goto L_0x00d1;
    L_0x00c7:
        r0 = new com.google.android.gms.internal.zzaap;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = r13.zzcob;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = r3.zzdcv;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r0.<init>(r4, r5, r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        goto L_0x011e;
    L_0x00d1:
        r5 = "3";
        r3 = r5.equals(r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r3 == 0) goto L_0x011a;
    L_0x00d9:
        r3 = r9.getString(r0);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5 = new com.google.android.gms.internal.zzamd;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5.<init>();	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r6 = com.google.android.gms.internal.zzaij.zzdfn;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r7 = new com.google.android.gms.internal.zzzz;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r7.<init>(r13, r5, r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r6.post(r7);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r6 = zzcow;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = r5.get(r6, r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r3 == 0) goto L_0x00fc;
    L_0x00f6:
        r0 = new com.google.android.gms.internal.zzaaq;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r0.<init>(r4);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        goto L_0x011e;
    L_0x00fc:
        r3 = "No handler for custom template: ";
        r0 = r9.getString(r0);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r0.length();	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r4 == 0) goto L_0x0111;
    L_0x010c:
        r0 = r3.concat(r0);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        goto L_0x0116;
    L_0x0111:
        r0 = new java.lang.String;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r0.<init>(r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
    L_0x0116:
        com.google.android.gms.internal.zzaky.e(r0);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        goto L_0x011d;
    L_0x011a:
        r13.zzz(r1);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
    L_0x011d:
        r0 = r2;
    L_0x011e:
        r3 = r13.zznw();	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r3 != 0) goto L_0x016c;
    L_0x0124:
        if (r0 == 0) goto L_0x016c;
    L_0x0126:
        if (r9 != 0) goto L_0x0129;
    L_0x0128:
        goto L_0x016c;
    L_0x0129:
        r3 = "tracking_urls_and_actions";
        r3 = r9.getJSONObject(r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = "impression_tracking_urls";
        r4 = zzd(r3, r4);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r4 != 0) goto L_0x0139;
    L_0x0137:
        r4 = r2;
        goto L_0x013d;
    L_0x0139:
        r4 = java.util.Arrays.asList(r4);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
    L_0x013d:
        r13.zzcpa = r4;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = "active_view";
        r3 = r3.optJSONObject(r4);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r13.zzcpb = r3;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = "debug_signals";
        r3 = r9.optString(r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r13.zzcpc = r3;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r0 = r0.zza(r13, r9);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = new com.google.android.gms.internal.zzpz;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5 = r13.mContext;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r6 = r13.zzcoy;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r7 = r13.zzarm;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r8 = r13.zzbyz;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r13.zzcob;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r4.zzcvm;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r11 = r4.zzatz;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = r3;
        r10 = r0;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r0.zzb(r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        goto L_0x016d;
    L_0x016c:
        r0 = r2;
    L_0x016d:
        r3 = r0 instanceof com.google.android.gms.internal.zzpo;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        if (r3 == 0) goto L_0x0187;
    L_0x0171:
        r3 = r0;
        r3 = (com.google.android.gms.internal.zzpo) r3;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = new com.google.android.gms.internal.zzzx;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4.<init>();	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5 = new com.google.android.gms.internal.zzaaa;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r5.<init>(r13, r3);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4.zzcov = r5;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r3 = r13.zzarm;	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        r4 = "/nativeAdCustomClick";
        r3.zza(r4, r5);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
    L_0x0187:
        r0 = r13.zzc(r0);	 Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, InterruptedException | CancellationException | ExecutionException -> 0x019a, JSONException -> 0x0194, TimeoutException -> 0x0190, Exception -> 0x018c }
        return r0;
    L_0x018c:
        r0 = move-exception;
        r3 = "Error occured while doing native ads initialization.";
        goto L_0x0197;
    L_0x0190:
        r0 = move-exception;
        r3 = "Timeout when loading native ad.";
        goto L_0x0197;
    L_0x0194:
        r0 = move-exception;
        r3 = "Malformed native JSON response.";
    L_0x0197:
        com.google.android.gms.internal.zzaky.zzc(r3, r0);
    L_0x019a:
        r0 = r13.zzcoz;
        if (r0 != 0) goto L_0x01a1;
    L_0x019e:
        r13.zzz(r1);
    L_0x01a1:
        r0 = r13.zzc(r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzzy.zznv():com.google.android.gms.internal.zzahd");
    }

    private final boolean zznw() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcoz;
        }
        return z;
    }

    private final void zzz(int i) {
        synchronized (this.mLock) {
            this.zzcoz = true;
            this.mErrorCode = i;
        }
    }

    public final /* synthetic */ Object call() {
        return zznv();
    }

    public final zzalt<zzpj> zza(JSONObject jSONObject, String str, boolean z, boolean z2) {
        jSONObject = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return zza(jSONObject, z, z2);
    }

    public final List<zzalt<zzpj>> zza(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            zzd(0, false);
            return arrayList;
        }
        int length = z3 ? optJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(zza(jSONObject2, false, z2));
        }
        return arrayList;
    }

    public final Future<zzpj> zza(JSONObject jSONObject, String str, boolean z) {
        jSONObject = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject.optBoolean("require", true);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return zza(jSONObject, optBoolean, z);
    }

    public final zzalt<zzaof> zzc(JSONObject jSONObject, String str) {
        jSONObject = jSONObject.optJSONObject(str);
        if (jSONObject == null) {
            return zzali.zzh(null);
        }
        if (TextUtils.isEmpty(jSONObject.optString("vast_xml"))) {
            zzaky.zzcz("Required field 'vast_xml' is missing");
            return zzali.zzh(null);
        }
        zzaaf zzaaf = new zzaaf(this.mContext, this.zzbyz, this.zzcob, this.zzanh, this.zzcoy);
        zzamd zzamd = new zzamd();
        zzaly.zzdjt.execute(new zzaag(zzaaf, jSONObject, zzamd));
        return zzamd;
    }

    public final void zzd(int i, boolean z) {
        if (z) {
            zzz(i);
        }
    }

    public final zzalt<zzph> zzg(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzali.zzh(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer zzb = zzb(optJSONObject, "text_color");
        Integer zzb2 = zzb(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i = (this.zzcob.zzcvm.zzauq == null || this.zzcob.zzcvm.zzauq.versionCode < 2) ? 1 : this.zzcob.zzcvm.zzauq.zzbzm;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List arrayList = new ArrayList();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = zza(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(zza(optJSONObject, "image", false, false));
        }
        return zzali.zza(zzl(arrayList), new zzaab(this, optString, zzb2, zzb, optInt, optInt3, optInt2, i, optBoolean), zzaid.zzdfi);
    }
}
