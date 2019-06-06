package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzbt;
import org.json.JSONObject;

@zzabh
public final class zzaef extends zzaeh {
    private final Context mApplicationContext;
    private final Object mLock = new Object();
    private SharedPreferences zzcze;
    private final zzux<JSONObject, JSONObject> zzczf;

    public zzaef(Context context, zzux<JSONObject, JSONObject> zzux) {
        this.mApplicationContext = context.getApplicationContext();
        this.zzczf = zzux;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Void zzm(JSONObject jSONObject) {
        zzoi.zza(this.mApplicationContext, 1, jSONObject);
        this.zzcze.edit().putLong("js_last_update", zzbt.zzes().currentTimeMillis()).apply();
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0096 in {8, 12, 17, 20, 24} preds:[]
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
    public final com.google.android.gms.internal.zzalt<java.lang.Void> zzon() {
        /*
        r6 = this;
        r0 = r6.mLock;
        monitor-enter(r0);
        r1 = r6.zzcze;	 Catch:{ all -> 0x0093 }
        if (r1 == 0) goto L_0x0009;	 Catch:{ all -> 0x0093 }
        monitor-exit(r0);	 Catch:{ all -> 0x0093 }
        goto L_0x0015;	 Catch:{ all -> 0x0093 }
        r1 = r6.mApplicationContext;	 Catch:{ all -> 0x0093 }
        r2 = "google_ads_flags_meta";	 Catch:{ all -> 0x0093 }
        r3 = 0;	 Catch:{ all -> 0x0093 }
        r1 = r1.getSharedPreferences(r2, r3);	 Catch:{ all -> 0x0093 }
        r6.zzcze = r1;	 Catch:{ all -> 0x0093 }
        goto L_0x0007;
        r0 = r6.zzcze;
        r1 = 0;
        r3 = "js_last_update";
        r0 = r0.getLong(r3, r1);
        r2 = com.google.android.gms.ads.internal.zzbt.zzes();
        r2 = r2.currentTimeMillis();
        r2 = r2 - r0;
        r0 = com.google.android.gms.internal.zzoi.zzbse;
        r1 = com.google.android.gms.internal.zzlc.zzio();
        r0 = r1.zzd(r0);
        r0 = (java.lang.Long) r0;
        r0 = r0.longValue();
        r4 = 0;
        r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r5 >= 0) goto L_0x0042;
        r0 = com.google.android.gms.internal.zzali.zzh(r4);
        return r0;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = "js";	 Catch:{ JSONException -> 0x0088 }
        r2 = com.google.android.gms.internal.zzala.zzse();	 Catch:{ JSONException -> 0x0088 }
        r2 = r2.zzcu;	 Catch:{ JSONException -> 0x0088 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0088 }
        r1 = "mf";	 Catch:{ JSONException -> 0x0088 }
        r2 = com.google.android.gms.internal.zzoi.zzbsf;	 Catch:{ JSONException -> 0x0088 }
        r3 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ JSONException -> 0x0088 }
        r2 = r3.zzd(r2);	 Catch:{ JSONException -> 0x0088 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0088 }
        r1 = "cl";	 Catch:{ JSONException -> 0x0088 }
        r2 = "190237664";	 Catch:{ JSONException -> 0x0088 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0088 }
        r1 = "rapid_rc";	 Catch:{ JSONException -> 0x0088 }
        r2 = "dev";	 Catch:{ JSONException -> 0x0088 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0088 }
        r1 = "rapid_rollup";	 Catch:{ JSONException -> 0x0088 }
        r2 = "HEAD";	 Catch:{ JSONException -> 0x0088 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0088 }
        r1 = r6.zzczf;
        r0 = r1.zzf(r0);
        r1 = new com.google.android.gms.internal.zzaeg;
        r1.<init>(r6);
        r2 = com.google.android.gms.internal.zzaly.zzdju;
        r0 = com.google.android.gms.internal.zzali.zza(r0, r1, r2);
        return r0;
        r0 = move-exception;
        r1 = "Unable to populate SDK Core Constants parameters.";
        com.google.android.gms.internal.zzaky.zzb(r1, r0);
        r0 = com.google.android.gms.internal.zzali.zzh(r4);
        return r0;
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0093 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaef.zzon():com.google.android.gms.internal.zzalt");
    }
}
