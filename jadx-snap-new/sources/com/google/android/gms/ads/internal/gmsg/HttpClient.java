package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.support.annotation.Keep;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.brightcove.player.event.EventType;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaid;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzala;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
@KeepName
@zzabh
public class HttpClient implements zzt<com.google.android.gms.ads.internal.js.zza> {
    private final Context mContext;
    private final zzala zzapq;

    @zzabh
    static class zza {
        private final String mValue;
        private final String zzbkr;

        public zza(String str, String str2) {
            this.zzbkr = str;
            this.mValue = str2;
        }

        public final String getKey() {
            return this.zzbkr;
        }

        public final String getValue() {
            return this.mValue;
        }
    }

    @zzabh
    static class zzb {
        private final String zzccc;
        private final URL zzccd;
        private final ArrayList<zza> zzcce;
        private final String zzccf;

        zzb(String str, URL url, ArrayList<zza> arrayList, String str2) {
            this.zzccc = str;
            this.zzccd = url;
            this.zzcce = arrayList;
            this.zzccf = str2;
        }

        public final String zzky() {
            return this.zzccc;
        }

        public final URL zzkz() {
            return this.zzccd;
        }

        public final ArrayList<zza> zzla() {
            return this.zzcce;
        }

        public final String zzlb() {
            return this.zzccf;
        }
    }

    @zzabh
    class zzc {
        private final zzd zzccg;
        private final boolean zzcch;
        private final String zzcci;

        public zzc(HttpClient httpClient, boolean z, zzd zzd, String str) {
            this.zzcch = z;
            this.zzccg = zzd;
            this.zzcci = str;
        }

        public final String getReason() {
            return this.zzcci;
        }

        public final boolean isSuccess() {
            return this.zzcch;
        }

        public final zzd zzlc() {
            return this.zzccg;
        }
    }

    @zzabh
    static class zzd {
        private final String zzbxx;
        private final String zzccc;
        private final int zzccj;
        private final List<zza> zzcd;

        zzd(String str, int i, List<zza> list, String str2) {
            this.zzccc = str;
            this.zzccj = i;
            this.zzcd = list;
            this.zzbxx = str2;
        }

        public final String getBody() {
            return this.zzbxx;
        }

        public final int getResponseCode() {
            return this.zzccj;
        }

        public final String zzky() {
            return this.zzccc;
        }

        public final Iterable<zza> zzld() {
            return this.zzcd;
        }
    }

    public HttpClient(Context context, zzala zzala) {
        this.mContext = context;
        this.zzapq = zzala;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:39:0x0108 in {6, 9, 10, 19, 22, 23, 25, 27, 29, 33, 34, 35, 37, 38} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final com.google.android.gms.ads.internal.gmsg.HttpClient.zzc zza(com.google.android.gms.ads.internal.gmsg.HttpClient.zzb r13) {
        /*
        r12 = this;
        r0 = 0;
        r1 = 0;
        r2 = r13.zzkz();	 Catch:{ Exception -> 0x00f0, all -> 0x00ed }
        r2 = r2.openConnection();	 Catch:{ Exception -> 0x00f0, all -> 0x00ed }
        r2 = (java.net.HttpURLConnection) r2;	 Catch:{ Exception -> 0x00f0, all -> 0x00ed }
        r3 = com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ Exception -> 0x00eb }
        r4 = r12.mContext;	 Catch:{ Exception -> 0x00eb }
        r5 = r12.zzapq;	 Catch:{ Exception -> 0x00eb }
        r5 = r5.zzcu;	 Catch:{ Exception -> 0x00eb }
        r3.zza(r4, r5, r0, r2);	 Catch:{ Exception -> 0x00eb }
        r3 = r13.zzla();	 Catch:{ Exception -> 0x00eb }
        r3 = (java.util.ArrayList) r3;	 Catch:{ Exception -> 0x00eb }
        r4 = r3.size();	 Catch:{ Exception -> 0x00eb }
        r5 = 0;	 Catch:{ Exception -> 0x00eb }
        if (r5 >= r4) goto L_0x003a;	 Catch:{ Exception -> 0x00eb }
        r6 = r3.get(r5);	 Catch:{ Exception -> 0x00eb }
        r5 = r5 + 1;	 Catch:{ Exception -> 0x00eb }
        r6 = (com.google.android.gms.ads.internal.gmsg.HttpClient.zza) r6;	 Catch:{ Exception -> 0x00eb }
        r7 = r6.getKey();	 Catch:{ Exception -> 0x00eb }
        r6 = r6.getValue();	 Catch:{ Exception -> 0x00eb }
        r2.addRequestProperty(r7, r6);	 Catch:{ Exception -> 0x00eb }
        goto L_0x0024;	 Catch:{ Exception -> 0x00eb }
        r3 = r13.zzlb();	 Catch:{ Exception -> 0x00eb }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ Exception -> 0x00eb }
        r4 = 1;	 Catch:{ Exception -> 0x00eb }
        if (r3 != 0) goto L_0x0064;	 Catch:{ Exception -> 0x00eb }
        r2.setDoOutput(r4);	 Catch:{ Exception -> 0x00eb }
        r3 = r13.zzlb();	 Catch:{ Exception -> 0x00eb }
        r3 = r3.getBytes();	 Catch:{ Exception -> 0x00eb }
        r5 = r3.length;	 Catch:{ Exception -> 0x00eb }
        r2.setFixedLengthStreamingMode(r5);	 Catch:{ Exception -> 0x00eb }
        r5 = new java.io.BufferedOutputStream;	 Catch:{ Exception -> 0x00eb }
        r6 = r2.getOutputStream();	 Catch:{ Exception -> 0x00eb }
        r5.<init>(r6);	 Catch:{ Exception -> 0x00eb }
        r5.write(r3);	 Catch:{ Exception -> 0x00eb }
        r5.close();	 Catch:{ Exception -> 0x00eb }
        goto L_0x0065;	 Catch:{ Exception -> 0x00eb }
        r3 = r1;	 Catch:{ Exception -> 0x00eb }
        r5 = new com.google.android.gms.internal.zzaks;	 Catch:{ Exception -> 0x00eb }
        r5.<init>();	 Catch:{ Exception -> 0x00eb }
        r5.zza(r2, r3);	 Catch:{ Exception -> 0x00eb }
        r3 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00eb }
        r3.<init>();	 Catch:{ Exception -> 0x00eb }
        r6 = r2.getHeaderFields();	 Catch:{ Exception -> 0x00eb }
        if (r6 == 0) goto L_0x00b5;	 Catch:{ Exception -> 0x00eb }
        r6 = r2.getHeaderFields();	 Catch:{ Exception -> 0x00eb }
        r6 = r6.entrySet();	 Catch:{ Exception -> 0x00eb }
        r6 = r6.iterator();	 Catch:{ Exception -> 0x00eb }
        r7 = r6.hasNext();	 Catch:{ Exception -> 0x00eb }
        if (r7 == 0) goto L_0x00b5;	 Catch:{ Exception -> 0x00eb }
        r7 = r6.next();	 Catch:{ Exception -> 0x00eb }
        r7 = (java.util.Map.Entry) r7;	 Catch:{ Exception -> 0x00eb }
        r8 = r7.getValue();	 Catch:{ Exception -> 0x00eb }
        r8 = (java.util.List) r8;	 Catch:{ Exception -> 0x00eb }
        r8 = r8.iterator();	 Catch:{ Exception -> 0x00eb }
        r9 = r8.hasNext();	 Catch:{ Exception -> 0x00eb }
        if (r9 == 0) goto L_0x0084;	 Catch:{ Exception -> 0x00eb }
        r9 = r8.next();	 Catch:{ Exception -> 0x00eb }
        r9 = (java.lang.String) r9;	 Catch:{ Exception -> 0x00eb }
        r10 = new com.google.android.gms.ads.internal.gmsg.HttpClient$zza;	 Catch:{ Exception -> 0x00eb }
        r11 = r7.getKey();	 Catch:{ Exception -> 0x00eb }
        r11 = (java.lang.String) r11;	 Catch:{ Exception -> 0x00eb }
        r10.<init>(r11, r9);	 Catch:{ Exception -> 0x00eb }
        r3.add(r10);	 Catch:{ Exception -> 0x00eb }
        goto L_0x009a;	 Catch:{ Exception -> 0x00eb }
        r6 = new com.google.android.gms.ads.internal.gmsg.HttpClient$zzd;	 Catch:{ Exception -> 0x00eb }
        r13 = r13.zzky();	 Catch:{ Exception -> 0x00eb }
        r7 = r2.getResponseCode();	 Catch:{ Exception -> 0x00eb }
        com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ Exception -> 0x00eb }
        r8 = new java.io.InputStreamReader;	 Catch:{ Exception -> 0x00eb }
        r9 = r2.getInputStream();	 Catch:{ Exception -> 0x00eb }
        r8.<init>(r9);	 Catch:{ Exception -> 0x00eb }
        r8 = com.google.android.gms.internal.zzaij.zza(r8);	 Catch:{ Exception -> 0x00eb }
        r6.<init>(r13, r7, r3, r8);	 Catch:{ Exception -> 0x00eb }
        r13 = r6.getResponseCode();	 Catch:{ Exception -> 0x00eb }
        r5.zza(r2, r13);	 Catch:{ Exception -> 0x00eb }
        r13 = r6.getBody();	 Catch:{ Exception -> 0x00eb }
        r5.zzcw(r13);	 Catch:{ Exception -> 0x00eb }
        r13 = new com.google.android.gms.ads.internal.gmsg.HttpClient$zzc;	 Catch:{ Exception -> 0x00eb }
        r13.<init>(r12, r4, r6, r1);	 Catch:{ Exception -> 0x00eb }
        if (r2 == 0) goto L_0x00ea;
        r2.disconnect();
        return r13;
        r13 = move-exception;
        goto L_0x00f2;
        r13 = move-exception;
        r2 = r1;
        goto L_0x0102;
        r13 = move-exception;
        r2 = r1;
        r3 = new com.google.android.gms.ads.internal.gmsg.HttpClient$zzc;	 Catch:{ all -> 0x0101 }
        r13 = r13.toString();	 Catch:{ all -> 0x0101 }
        r3.<init>(r12, r0, r1, r13);	 Catch:{ all -> 0x0101 }
        if (r2 == 0) goto L_0x0100;
        r2.disconnect();
        return r3;
        r13 = move-exception;
        if (r2 == 0) goto L_0x0107;
        r2.disconnect();
        throw r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.HttpClient.zza(com.google.android.gms.ads.internal.gmsg.HttpClient$zzb):com.google.android.gms.ads.internal.gmsg.HttpClient$zzc");
    }

    private static JSONObject zza(zzd zzd) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", zzd.zzky());
            if (zzd.getBody() != null) {
                jSONObject.put(Tags.BODY, zzd.getBody());
            }
            JSONArray jSONArray = new JSONArray();
            for (zza zza : zzd.zzld()) {
                jSONArray.put(new JSONObject().put("key", zza.getKey()).put("value", zza.getValue()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", zzd.getResponseCode());
        } catch (JSONException e) {
            zzaky.zzb("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    private static zzb zzc(JSONObject jSONObject) {
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        URL url = null;
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e) {
            zzaky.zzb("Error constructing http request.", e);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new zza(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new zzb(optString, url, arrayList, optString3);
    }

    @Keep
    @KeepName
    public JSONObject send(JSONObject jSONObject) {
        String str = "reason";
        String str2 = "success";
        String str3 = EventType.RESPONSE;
        String str4 = "http_request_id";
        JSONObject jSONObject2 = new JSONObject();
        String str5 = "";
        try {
            str5 = jSONObject.optString(str4);
            zzc zza = zza(zzc(jSONObject));
            if (zza.isSuccess()) {
                jSONObject2.put(str3, zza(zza.zzlc()));
                jSONObject2.put(str2, true);
            } else {
                jSONObject2.put(str3, new JSONObject().put(str4, str5));
                jSONObject2.put(str2, false);
                jSONObject2.put(str, zza.getReason());
            }
        } catch (Exception e) {
            String str6 = "Error executing http request.";
            zzaky.zzb(str6, e);
            try {
                jSONObject2.put(str3, new JSONObject().put(str4, str5));
                jSONObject2.put(str2, false);
                jSONObject2.put(str, e.toString());
            } catch (JSONException e2) {
                zzaky.zzb(str6, e2);
            }
        }
        return jSONObject2;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzaid.zzb(new zzu(this, map, (com.google.android.gms.ads.internal.js.zza) obj));
    }
}
