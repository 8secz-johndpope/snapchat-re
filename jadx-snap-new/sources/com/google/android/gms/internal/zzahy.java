package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@zzabh
public final class zzahy {
    private final Object mLock = new Object();
    private SharedPreferences zzbkx;
    private boolean zzcxd = true;
    private boolean zzcxe = true;
    private boolean zzcxf = true;
    private boolean zzcxm = false;
    private String zzddm = "";
    private int zzdef = -1;
    private zzalt<?> zzdet;
    private CopyOnWriteArraySet<zzaic> zzdeu = new CopyOnWriteArraySet();
    Editor zzdev;
    private boolean zzdew = false;
    private String zzdex;
    private String zzdey;
    private long zzdez = 0;
    private long zzdfa = 0;
    private long zzdfb = 0;
    private int zzdfc = 0;
    private Set<String> zzdfd = Collections.emptySet();
    private JSONObject zzdfe = new JSONObject();

    private final void zzc(Bundle bundle) {
        new zzaia(this, bundle).zzns();
    }

    @TargetApi(23)
    private static boolean zzql() {
        return VERSION.SDK_INT >= 23 && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    private final void zzqm() {
        zzalt zzalt = this.zzdet;
        if (zzalt != null && !zzalt.isDone()) {
            try {
                this.zzdet.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                zzaky.zzc("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                zzaky.zzb("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    private final Bundle zzqn() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.mLock) {
            bundle.putBoolean("use_https", this.zzcxd);
            bundle.putBoolean("content_url_opted_out", this.zzcxe);
            bundle.putBoolean("content_vertical_opted_out", this.zzcxf);
            bundle.putBoolean("auto_collect_location", this.zzcxm);
            bundle.putInt("version_code", this.zzdfc);
            bundle.putStringArray("never_pool_slots", (String[]) this.zzdfd.toArray(new String[this.zzdfd.size()]));
            bundle.putString("app_settings_json", this.zzddm);
            bundle.putLong("app_settings_last_update_ms", this.zzdez);
            bundle.putLong("app_last_background_time_ms", this.zzdfa);
            bundle.putInt("request_in_session_count", this.zzdef);
            bundle.putLong("first_ad_req_time_ms", this.zzdfb);
            bundle.putString("native_advanced_settings", this.zzdfe.toString());
            if (this.zzdex != null) {
                bundle.putString("content_url_hashes", this.zzdex);
            }
            if (this.zzdey != null) {
                bundle.putString("content_vertical_hashes", this.zzdey);
            }
        }
        return bundle;
    }

    public final void initialize(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzdet = (zzalt) new zzahz(this, context).zzns();
    }

    public final void zza(zzaic zzaic) {
        synchronized (this.mLock) {
            if (this.zzdet != null && this.zzdet.isDone()) {
                zzaic.zzb(zzqn());
            }
            this.zzdeu.add(zzaic);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x009e in {5, 12, 20, 21, 22, 25, 28, 31, 34, 37} preds:[]
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
    public final void zza(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
        r7 = this;
        r7.zzqm();
        r0 = r7.mLock;
        monitor-enter(r0);
        r1 = r7.zzdfe;	 Catch:{ all -> 0x009b }
        r1 = r1.optJSONArray(r8);	 Catch:{ all -> 0x009b }
        if (r1 != 0) goto L_0x0013;	 Catch:{ all -> 0x009b }
        r1 = new org.json.JSONArray;	 Catch:{ all -> 0x009b }
        r1.<init>();	 Catch:{ all -> 0x009b }
        r2 = r1.length();	 Catch:{ all -> 0x009b }
        r3 = 0;	 Catch:{ all -> 0x009b }
        r4 = 0;	 Catch:{ all -> 0x009b }
        r5 = r1.length();	 Catch:{ all -> 0x009b }
        if (r4 >= r5) goto L_0x0045;	 Catch:{ all -> 0x009b }
        r5 = r1.optJSONObject(r4);	 Catch:{ all -> 0x009b }
        if (r5 != 0) goto L_0x0027;	 Catch:{ all -> 0x009b }
        monitor-exit(r0);	 Catch:{ all -> 0x009b }
        return;	 Catch:{ all -> 0x009b }
        r6 = "template_id";	 Catch:{ all -> 0x009b }
        r6 = r5.optString(r6);	 Catch:{ all -> 0x009b }
        r6 = r9.equals(r6);	 Catch:{ all -> 0x009b }
        if (r6 == 0) goto L_0x0042;	 Catch:{ all -> 0x009b }
        r2 = 1;	 Catch:{ all -> 0x009b }
        if (r10 != r2) goto L_0x0040;	 Catch:{ all -> 0x009b }
        r2 = "uses_media_view";	 Catch:{ all -> 0x009b }
        r2 = r5.optBoolean(r2, r3);	 Catch:{ all -> 0x009b }
        if (r2 != r10) goto L_0x0040;	 Catch:{ all -> 0x009b }
        monitor-exit(r0);	 Catch:{ all -> 0x009b }
        return;
        r2 = r4;
        goto L_0x0045;
        r4 = r4 + 1;
        goto L_0x0019;
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x006a }
        r3.<init>();	 Catch:{ JSONException -> 0x006a }
        r4 = "template_id";	 Catch:{ JSONException -> 0x006a }
        r3.put(r4, r9);	 Catch:{ JSONException -> 0x006a }
        r9 = "uses_media_view";	 Catch:{ JSONException -> 0x006a }
        r3.put(r9, r10);	 Catch:{ JSONException -> 0x006a }
        r9 = "timestamp_ms";	 Catch:{ JSONException -> 0x006a }
        r10 = com.google.android.gms.ads.internal.zzbt.zzes();	 Catch:{ JSONException -> 0x006a }
        r4 = r10.currentTimeMillis();	 Catch:{ JSONException -> 0x006a }
        r3.put(r9, r4);	 Catch:{ JSONException -> 0x006a }
        r1.put(r2, r3);	 Catch:{ JSONException -> 0x006a }
        r9 = r7.zzdfe;	 Catch:{ JSONException -> 0x006a }
        r9.put(r8, r1);	 Catch:{ JSONException -> 0x006a }
        goto L_0x0070;
        r8 = move-exception;
        r9 = "Could not update native advanced settings";	 Catch:{ all -> 0x009b }
        com.google.android.gms.internal.zzaky.zzc(r9, r8);	 Catch:{ all -> 0x009b }
        r8 = r7.zzdev;	 Catch:{ all -> 0x009b }
        if (r8 == 0) goto L_0x0086;	 Catch:{ all -> 0x009b }
        r8 = r7.zzdev;	 Catch:{ all -> 0x009b }
        r9 = "native_advanced_settings";	 Catch:{ all -> 0x009b }
        r10 = r7.zzdfe;	 Catch:{ all -> 0x009b }
        r10 = r10.toString();	 Catch:{ all -> 0x009b }
        r8.putString(r9, r10);	 Catch:{ all -> 0x009b }
        r8 = r7.zzdev;	 Catch:{ all -> 0x009b }
        r8.apply();	 Catch:{ all -> 0x009b }
        r8 = new android.os.Bundle;	 Catch:{ all -> 0x009b }
        r8.<init>();	 Catch:{ all -> 0x009b }
        r9 = "native_advanced_settings";	 Catch:{ all -> 0x009b }
        r10 = r7.zzdfe;	 Catch:{ all -> 0x009b }
        r10 = r10.toString();	 Catch:{ all -> 0x009b }
        r8.putString(r9, r10);	 Catch:{ all -> 0x009b }
        r7.zzc(r8);	 Catch:{ all -> 0x009b }
        monitor-exit(r0);	 Catch:{ all -> 0x009b }
        return;	 Catch:{ all -> 0x009b }
        r8 = move-exception;	 Catch:{ all -> 0x009b }
        monitor-exit(r0);	 Catch:{ all -> 0x009b }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzahy.zza(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Missing block: B:14:0x0030, code skipped:
            return;
     */
    public final void zzaa(boolean r4) {
        /*
        r3 = this;
        r3.zzqm();
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzcxd;	 Catch:{ all -> 0x0031 }
        if (r1 != r4) goto L_0x000c;
    L_0x000a:
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        return;
    L_0x000c:
        r3.zzcxd = r4;	 Catch:{ all -> 0x0031 }
        r1 = r3.zzdev;	 Catch:{ all -> 0x0031 }
        if (r1 == 0) goto L_0x001e;
    L_0x0012:
        r1 = r3.zzdev;	 Catch:{ all -> 0x0031 }
        r2 = "use_https";
        r1.putBoolean(r2, r4);	 Catch:{ all -> 0x0031 }
        r1 = r3.zzdev;	 Catch:{ all -> 0x0031 }
        r1.apply();	 Catch:{ all -> 0x0031 }
    L_0x001e:
        r1 = r3.zzdew;	 Catch:{ all -> 0x0031 }
        if (r1 != 0) goto L_0x002f;
    L_0x0022:
        r1 = new android.os.Bundle;	 Catch:{ all -> 0x0031 }
        r1.<init>();	 Catch:{ all -> 0x0031 }
        r2 = "use_https";
        r1.putBoolean(r2, r4);	 Catch:{ all -> 0x0031 }
        r3.zzc(r1);	 Catch:{ all -> 0x0031 }
    L_0x002f:
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        return;
    L_0x0031:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzahy.zzaa(boolean):void");
    }

    public final void zzab(boolean z) {
        zzqm();
        synchronized (this.mLock) {
            if (this.zzcxe == z) {
                return;
            }
            this.zzcxe = z;
            if (this.zzdev != null) {
                this.zzdev.putBoolean("content_url_opted_out", z);
                this.zzdev.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.zzcxe);
            bundle.putBoolean("content_vertical_opted_out", this.zzcxf);
            zzc(bundle);
        }
    }

    public final void zzac(int i) {
        zzqm();
        synchronized (this.mLock) {
            if (this.zzdfc == i) {
                return;
            }
            this.zzdfc = i;
            if (this.zzdev != null) {
                this.zzdev.putInt("version_code", i);
                this.zzdev.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("version_code", i);
            zzc(bundle);
        }
    }

    public final void zzac(boolean z) {
        zzqm();
        synchronized (this.mLock) {
            if (this.zzcxf == z) {
                return;
            }
            this.zzcxf = z;
            if (this.zzdev != null) {
                this.zzdev.putBoolean("content_vertical_opted_out", z);
                this.zzdev.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.zzcxe);
            bundle.putBoolean("content_vertical_opted_out", this.zzcxf);
            zzc(bundle);
        }
    }

    public final void zzad(int i) {
        zzqm();
        synchronized (this.mLock) {
            if (this.zzdef == i) {
                return;
            }
            this.zzdef = i;
            if (this.zzdev != null) {
                this.zzdev.putInt("request_in_session_count", i);
                this.zzdev.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request_in_session_count", i);
            zzc(bundle);
        }
    }

    public final void zzad(boolean z) {
        zzqm();
        synchronized (this.mLock) {
            if (this.zzcxm == z) {
                return;
            }
            this.zzcxm = z;
            if (this.zzdev != null) {
                this.zzdev.putBoolean("auto_collect_location", z);
                this.zzdev.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("auto_collect_location", z);
            zzc(bundle);
        }
    }

    /* JADX WARNING: Missing block: B:14:0x0033, code skipped:
            return;
     */
    public final void zzcb(java.lang.String r4) {
        /*
        r3 = this;
        r3.zzqm();
        r0 = r3.mLock;
        monitor-enter(r0);
        if (r4 == 0) goto L_0x0032;
    L_0x0008:
        r1 = r3.zzdex;	 Catch:{ all -> 0x0034 }
        r1 = r4.equals(r1);	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0032;
    L_0x0011:
        r3.zzdex = r4;	 Catch:{ all -> 0x0034 }
        r1 = r3.zzdev;	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0023;
    L_0x0017:
        r1 = r3.zzdev;	 Catch:{ all -> 0x0034 }
        r2 = "content_url_hashes";
        r1.putString(r2, r4);	 Catch:{ all -> 0x0034 }
        r1 = r3.zzdev;	 Catch:{ all -> 0x0034 }
        r1.apply();	 Catch:{ all -> 0x0034 }
    L_0x0023:
        r1 = new android.os.Bundle;	 Catch:{ all -> 0x0034 }
        r1.<init>();	 Catch:{ all -> 0x0034 }
        r2 = "content_url_hashes";
        r1.putString(r2, r4);	 Catch:{ all -> 0x0034 }
        r3.zzc(r1);	 Catch:{ all -> 0x0034 }
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        return;
    L_0x0032:
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        return;
    L_0x0034:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzahy.zzcb(java.lang.String):void");
    }

    /* JADX WARNING: Missing block: B:14:0x0033, code skipped:
            return;
     */
    public final void zzcc(java.lang.String r4) {
        /*
        r3 = this;
        r3.zzqm();
        r0 = r3.mLock;
        monitor-enter(r0);
        if (r4 == 0) goto L_0x0032;
    L_0x0008:
        r1 = r3.zzdey;	 Catch:{ all -> 0x0034 }
        r1 = r4.equals(r1);	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0032;
    L_0x0011:
        r3.zzdey = r4;	 Catch:{ all -> 0x0034 }
        r1 = r3.zzdev;	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0023;
    L_0x0017:
        r1 = r3.zzdev;	 Catch:{ all -> 0x0034 }
        r2 = "content_vertical_hashes";
        r1.putString(r2, r4);	 Catch:{ all -> 0x0034 }
        r1 = r3.zzdev;	 Catch:{ all -> 0x0034 }
        r1.apply();	 Catch:{ all -> 0x0034 }
    L_0x0023:
        r1 = new android.os.Bundle;	 Catch:{ all -> 0x0034 }
        r1.<init>();	 Catch:{ all -> 0x0034 }
        r2 = "content_vertical_hashes";
        r1.putString(r2, r4);	 Catch:{ all -> 0x0034 }
        r3.zzc(r1);	 Catch:{ all -> 0x0034 }
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        return;
    L_0x0032:
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        return;
    L_0x0034:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzahy.zzcc(java.lang.String):void");
    }

    public final void zzcd(String str) {
        zzqm();
        synchronized (this.mLock) {
            if (this.zzdfd.contains(str)) {
                return;
            }
            this.zzdfd.add(str);
            if (this.zzdev != null) {
                this.zzdev.putStringSet("never_pool_slots", this.zzdfd);
                this.zzdev.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putStringArray("never_pool_slots", (String[]) this.zzdfd.toArray(new String[this.zzdfd.size()]));
            zzc(bundle);
        }
    }

    public final void zzce(String str) {
        zzqm();
        synchronized (this.mLock) {
            if (this.zzdfd.contains(str)) {
                this.zzdfd.remove(str);
                if (this.zzdev != null) {
                    this.zzdev.putStringSet("never_pool_slots", this.zzdfd);
                    this.zzdev.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.zzdfd.toArray(new String[this.zzdfd.size()]));
                zzc(bundle);
                return;
            }
        }
    }

    public final boolean zzcf(String str) {
        boolean contains;
        zzqm();
        synchronized (this.mLock) {
            contains = this.zzdfd.contains(str);
        }
        return contains;
    }

    /* JADX WARNING: Missing block: B:15:0x0049, code skipped:
            return;
     */
    public final void zzcg(java.lang.String r6) {
        /*
        r5 = this;
        r5.zzqm();
        r0 = r5.mLock;
        monitor-enter(r0);
        r1 = com.google.android.gms.ads.internal.zzbt.zzes();	 Catch:{ all -> 0x004a }
        r1 = r1.currentTimeMillis();	 Catch:{ all -> 0x004a }
        r5.zzdez = r1;	 Catch:{ all -> 0x004a }
        if (r6 == 0) goto L_0x0048;
    L_0x0012:
        r3 = r5.zzddm;	 Catch:{ all -> 0x004a }
        r3 = r6.equals(r3);	 Catch:{ all -> 0x004a }
        if (r3 == 0) goto L_0x001b;
    L_0x001a:
        goto L_0x0048;
    L_0x001b:
        r5.zzddm = r6;	 Catch:{ all -> 0x004a }
        r3 = r5.zzdev;	 Catch:{ all -> 0x004a }
        if (r3 == 0) goto L_0x0034;
    L_0x0021:
        r3 = r5.zzdev;	 Catch:{ all -> 0x004a }
        r4 = "app_settings_json";
        r3.putString(r4, r6);	 Catch:{ all -> 0x004a }
        r3 = r5.zzdev;	 Catch:{ all -> 0x004a }
        r4 = "app_settings_last_update_ms";
        r3.putLong(r4, r1);	 Catch:{ all -> 0x004a }
        r3 = r5.zzdev;	 Catch:{ all -> 0x004a }
        r3.apply();	 Catch:{ all -> 0x004a }
    L_0x0034:
        r3 = new android.os.Bundle;	 Catch:{ all -> 0x004a }
        r3.<init>();	 Catch:{ all -> 0x004a }
        r4 = "app_settings_json";
        r3.putString(r4, r6);	 Catch:{ all -> 0x004a }
        r6 = "app_settings_last_update_ms";
        r3.putLong(r6, r1);	 Catch:{ all -> 0x004a }
        r5.zzc(r3);	 Catch:{ all -> 0x004a }
        monitor-exit(r0);	 Catch:{ all -> 0x004a }
        return;
    L_0x0048:
        monitor-exit(r0);	 Catch:{ all -> 0x004a }
        return;
    L_0x004a:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x004a }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzahy.zzcg(java.lang.String):void");
    }

    public final void zzj(long j) {
        zzqm();
        synchronized (this.mLock) {
            if (this.zzdfa == j) {
                return;
            }
            this.zzdfa = j;
            if (this.zzdev != null) {
                this.zzdev.putLong("app_last_background_time_ms", j);
                this.zzdev.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("app_last_background_time_ms", j);
            zzc(bundle);
        }
    }

    public final void zzk(long j) {
        zzqm();
        synchronized (this.mLock) {
            if (this.zzdfb == j) {
                return;
            }
            this.zzdfb = j;
            if (this.zzdev != null) {
                this.zzdev.putLong("first_ad_req_time_ms", j);
                this.zzdev.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("first_ad_req_time_ms", j);
            zzc(bundle);
        }
    }

    public final boolean zzqo() {
        boolean z;
        zzqm();
        synchronized (this.mLock) {
            if (!this.zzcxd) {
                if (!this.zzdew) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final boolean zzqp() {
        boolean z;
        zzqm();
        synchronized (this.mLock) {
            z = this.zzcxe;
        }
        return z;
    }

    public final String zzqq() {
        String str;
        zzqm();
        synchronized (this.mLock) {
            str = this.zzdex;
        }
        return str;
    }

    public final boolean zzqr() {
        boolean z;
        zzqm();
        synchronized (this.mLock) {
            z = this.zzcxf;
        }
        return z;
    }

    public final String zzqs() {
        String str;
        zzqm();
        synchronized (this.mLock) {
            str = this.zzdey;
        }
        return str;
    }

    public final boolean zzqt() {
        boolean z;
        zzqm();
        synchronized (this.mLock) {
            z = this.zzcxm;
        }
        return z;
    }

    public final int zzqu() {
        int i;
        zzqm();
        synchronized (this.mLock) {
            i = this.zzdfc;
        }
        return i;
    }

    public final zzahh zzqv() {
        zzahh zzahh;
        zzqm();
        synchronized (this.mLock) {
            zzahh = new zzahh(this.zzddm, this.zzdez);
        }
        return zzahh;
    }

    public final long zzqw() {
        long j;
        zzqm();
        synchronized (this.mLock) {
            j = this.zzdfa;
        }
        return j;
    }

    public final int zzqx() {
        int i;
        zzqm();
        synchronized (this.mLock) {
            i = this.zzdef;
        }
        return i;
    }

    public final long zzqy() {
        long j;
        zzqm();
        synchronized (this.mLock) {
            j = this.zzdfb;
        }
        return j;
    }

    public final JSONObject zzqz() {
        JSONObject jSONObject;
        zzqm();
        synchronized (this.mLock) {
            jSONObject = this.zzdfe;
        }
        return jSONObject;
    }

    public final void zzra() {
        zzqm();
        synchronized (this.mLock) {
            this.zzdfe = new JSONObject();
            if (this.zzdev != null) {
                this.zzdev.remove("native_advanced_settings");
                this.zzdev.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            zzc(bundle);
        }
    }
}
