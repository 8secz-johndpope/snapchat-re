package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.dynamic.zzn;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzvt implements zzvx {
    private final Context mContext;
    private final Object mLock = new Object();
    private final zzwf zzanu;
    private final zzqh zzapm;
    private final List<String> zzapn;
    private final zzala zzapq;
    private zzkk zzarx;
    private final zzko zzasd;
    private final boolean zzavr;
    private final String zzcip;
    private final long zzciq;
    private final zzvq zzcir;
    private final zzvp zzcis;
    private final List<String> zzcit;
    private final List<String> zzciu;
    private final boolean zzciv;
    private final boolean zzciw;
    private zzwi zzcix;
    private int zzciy = -2;
    private zzwo zzciz;

    public zzvt(Context context, String str, zzwf zzwf, zzvq zzvq, zzvp zzvp, zzkk zzkk, zzko zzko, zzala zzala, boolean z, boolean z2, zzqh zzqh, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        zzvq zzvq2 = zzvq;
        zzvp zzvp2 = zzvp;
        this.mContext = context;
        this.zzanu = zzwf;
        this.zzcis = zzvp2;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            str2 = zzmi();
        }
        this.zzcip = str2;
        this.zzcir = zzvq2;
        long j = zzvp2.zzchu != -1 ? zzvp2.zzchu : zzvq2.zzchu != -1 ? zzvq2.zzchu : TelemetryConstants.FLUSH_DELAY_MS;
        this.zzciq = j;
        this.zzarx = zzkk;
        this.zzasd = zzko;
        this.zzapq = zzala;
        this.zzavr = z;
        this.zzciv = z2;
        this.zzapm = zzqh;
        this.zzapn = list;
        this.zzcit = list2;
        this.zzciu = list3;
        this.zzciw = z3;
    }

    private static zzwi zza(MediationAdapter mediationAdapter) {
        return new zzxc(mediationAdapter);
    }

    private final void zza(zzvs zzvs) {
        String zzbe = zzbe(this.zzcis.zzchk);
        try {
            if (this.zzapq.zzdja >= 4100000) {
                if (!this.zzavr) {
                    if (!this.zzcis.zzmh()) {
                        if (this.zzasd.zzbib) {
                            this.zzcix.zza(zzn.zzz(this.mContext), this.zzarx, zzbe, this.zzcis.zzchb, (zzwl) zzvs);
                            return;
                        } else if (!this.zzciv) {
                            this.zzcix.zza(zzn.zzz(this.mContext), this.zzasd, this.zzarx, zzbe, this.zzcis.zzchb, zzvs);
                            return;
                        } else if (this.zzcis.zzcho != null) {
                            this.zzcix.zza(zzn.zzz(this.mContext), this.zzarx, zzbe, this.zzcis.zzchb, zzvs, new zzqh(zzbf(this.zzcis.zzchs)), this.zzcis.zzchr);
                            return;
                        } else {
                            this.zzcix.zza(zzn.zzz(this.mContext), this.zzasd, this.zzarx, zzbe, this.zzcis.zzchb, zzvs);
                            return;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(this.zzapn);
                if (this.zzcit != null) {
                    for (String str : this.zzcit) {
                        String str2 = ":false";
                        if (this.zzciu != null && this.zzciu.contains(str)) {
                            str2 = ":true";
                        }
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 7) + str2.length());
                        stringBuilder.append("custom:");
                        stringBuilder.append(str);
                        stringBuilder.append(str2);
                        arrayList.add(stringBuilder.toString());
                    }
                }
                this.zzcix.zza(zzn.zzz(this.mContext), this.zzarx, zzbe, this.zzcis.zzchb, zzvs, this.zzapm, arrayList);
            } else if (this.zzasd.zzbib) {
                this.zzcix.zza(zzn.zzz(this.mContext), this.zzarx, zzbe, zzvs);
            } else {
                this.zzcix.zza(zzn.zzz(this.mContext), this.zzasd, this.zzarx, zzbe, (zzwl) zzvs);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not request ad from mediation adapter.", e);
            zzv(5);
        }
    }

    private final String zzbe(String str) {
        if (!(str == null || !zzml() || zzw(2))) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                str = jSONObject.toString();
                return str;
            } catch (JSONException unused) {
                zzaky.zzcz("Could not remove field. Returning the original value");
            }
        }
        return str;
    }

    private static NativeAdOptions zzbf(String str) {
        String str2 = "any";
        Builder builder = new Builder();
        if (str == null) {
            return builder.build();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            builder.setRequestMultipleImages(jSONObject.optBoolean("multiple_images", false));
            builder.setReturnUrlsForImageAssets(jSONObject.optBoolean("only_urls", false));
            str = jSONObject.optString("native_image_orientation", str2);
            if ("landscape".equals(str)) {
                i = 2;
            } else if ("portrait".equals(str)) {
                i = 1;
            } else if (!str2.equals(str)) {
                i = -1;
            }
            builder.setImageOrientation(i);
        } catch (JSONException e) {
            zzaky.zzc("Exception occurred when creating native ad options", e);
        }
        return builder.build();
    }

    private final String zzmi() {
        String str = "com.google.ads.mediation.customevent.CustomEventAdapter";
        try {
            if (!TextUtils.isEmpty(this.zzcis.zzchf)) {
                if (this.zzanu.zzbh(this.zzcis.zzchf)) {
                    str = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
                }
                return str;
            }
        } catch (RemoteException unused) {
            zzaky.zzcz("Fail to determine the custom event's version, assuming the old one.");
        }
        return str;
    }

    private final zzwo zzmj() {
        if (this.zzciy != 0 || !zzml()) {
            return null;
        }
        try {
            if (!(!zzw(4) || this.zzciz == null || this.zzciz.zzmn() == 0)) {
                return this.zzciz;
            }
        } catch (RemoteException unused) {
            zzaky.zzcz("Could not get cpm value from MediationResponseMetadata");
        }
        return new zzvv(zzmm());
    }

    private final zzwi zzmk() {
        String valueOf = String.valueOf(this.zzcip);
        String str = "Instantiating mediation adapter: ";
        zzaky.zzcy(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (!(this.zzavr || this.zzcis.zzmh())) {
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbrb)).booleanValue()) {
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzcip)) {
                    return zza(new AdMobAdapter());
                }
            }
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbrc)).booleanValue()) {
                if ("com.google.ads.mediation.AdUrlAdapter".equals(this.zzcip)) {
                    return zza(new AdUrlAdapter());
                }
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.zzcip)) {
                return new zzxc(new zzxx());
            }
        }
        try {
            return this.zzanu.zzbg(this.zzcip);
        } catch (RemoteException e) {
            String str2 = "Could not instantiate mediation adapter: ";
            str = String.valueOf(this.zzcip);
            zzaky.zza(str.length() != 0 ? str2.concat(str) : new String(str2), e);
            return null;
        }
    }

    private final boolean zzml() {
        return this.zzcir.zzcif != -1;
    }

    private final int zzmm() {
        if (this.zzcis.zzchk == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.zzcis.zzchk);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzcip)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = zzw(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            if (optInt == 0) {
                optInt = jSONObject.optInt("penalized_average_cpm_cents", 0);
            }
            return optInt;
        } catch (JSONException unused) {
            zzaky.zzcz("Could not convert to json. Returning 0");
            return 0;
        }
    }

    private final boolean zzw(int i) {
        try {
            Bundle zzms = this.zzavr ? this.zzcix.zzms() : this.zzasd.zzbib ? this.zzcix.getInterstitialAdapterInfo() : this.zzcix.zzmr();
            return zzms != null && (zzms.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException unused) {
            zzaky.zzcz("Could not get adapter info. Returning false");
            return false;
        }
    }

    public final void cancel() {
        synchronized (this.mLock) {
            try {
                if (this.zzcix != null) {
                    this.zzcix.destroy();
                }
            } catch (RemoteException e) {
                zzaky.zzc("Could not destroy mediation adapter.", e);
            }
            this.zzciy = -1;
            this.mLock.notify();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x006c in {8, 14, 17, 21, 22, 25} preds:[]
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
    public final com.google.android.gms.internal.zzvw zza(long r15, long r17) {
        /*
        r14 = this;
        r1 = r14;
        r2 = r1.mLock;
        monitor-enter(r2);
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0069 }
        r9 = new com.google.android.gms.internal.zzvs;	 Catch:{ all -> 0x0069 }
        r9.<init>();	 Catch:{ all -> 0x0069 }
        r0 = com.google.android.gms.internal.zzaij.zzdfn;	 Catch:{ all -> 0x0069 }
        r5 = new com.google.android.gms.internal.zzvu;	 Catch:{ all -> 0x0069 }
        r5.<init>(r14, r9);	 Catch:{ all -> 0x0069 }
        r0.post(r5);	 Catch:{ all -> 0x0069 }
        r5 = r1.zzciq;	 Catch:{ all -> 0x0069 }
        r0 = r1.zzciy;	 Catch:{ all -> 0x0069 }
        r7 = -2;	 Catch:{ all -> 0x0069 }
        if (r0 == r7) goto L_0x003c;	 Catch:{ all -> 0x0069 }
        r0 = com.google.android.gms.ads.internal.zzbt.zzes();	 Catch:{ all -> 0x0069 }
        r5 = r0.elapsedRealtime();	 Catch:{ all -> 0x0069 }
        r12 = r5 - r3;	 Catch:{ all -> 0x0069 }
        r0 = new com.google.android.gms.internal.zzvw;	 Catch:{ all -> 0x0069 }
        r6 = r1.zzcis;	 Catch:{ all -> 0x0069 }
        r7 = r1.zzcix;	 Catch:{ all -> 0x0069 }
        r8 = r1.zzcip;	 Catch:{ all -> 0x0069 }
        r10 = r1.zzciy;	 Catch:{ all -> 0x0069 }
        r11 = r14.zzmj();	 Catch:{ all -> 0x0069 }
        r5 = r0;	 Catch:{ all -> 0x0069 }
        r5.<init>(r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x0069 }
        monitor-exit(r2);	 Catch:{ all -> 0x0069 }
        return r0;	 Catch:{ all -> 0x0069 }
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0069 }
        r10 = r7 - r3;
        r10 = r5 - r10;
        r7 = r7 - r15;
        r7 = r17 - r7;
        r12 = 0;
        r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r0 <= 0) goto L_0x0060;
        r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1));
        if (r0 > 0) goto L_0x0052;
        goto L_0x0060;
        r0 = r1.mLock;	 Catch:{ InterruptedException -> 0x005c }
        r7 = java.lang.Math.min(r10, r7);	 Catch:{ InterruptedException -> 0x005c }
        r0.wait(r7);	 Catch:{ InterruptedException -> 0x005c }
        goto L_0x0019;
        r0 = 5;
        r1.zzciy = r0;	 Catch:{ all -> 0x0069 }
        goto L_0x0019;	 Catch:{ all -> 0x0069 }
        r0 = "Timed out waiting for adapter.";	 Catch:{ all -> 0x0069 }
        com.google.android.gms.internal.zzaky.zzcy(r0);	 Catch:{ all -> 0x0069 }
        r0 = 3;	 Catch:{ all -> 0x0069 }
        r1.zzciy = r0;	 Catch:{ all -> 0x0069 }
        goto L_0x0019;	 Catch:{ all -> 0x0069 }
        r0 = move-exception;	 Catch:{ all -> 0x0069 }
        monitor-exit(r2);	 Catch:{ all -> 0x0069 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzvt.zza(long, long):com.google.android.gms.internal.zzvw");
    }

    public final void zza(int i, zzwo zzwo) {
        synchronized (this.mLock) {
            this.zzciy = 0;
            this.zzciz = zzwo;
            this.mLock.notify();
        }
    }

    public final void zzv(int i) {
        synchronized (this.mLock) {
            this.zzciy = i;
            this.mLock.notify();
        }
    }
}
