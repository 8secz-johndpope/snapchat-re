package com.google.android.gms.internal;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import defpackage.ppy;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@zzabh
public final class zzol {
    private Context mContext;
    private String zzavp;
    private String zzbwd;
    private BlockingQueue<zzov> zzbwf;
    private ExecutorService zzbwg;
    private LinkedHashMap<String, String> zzbwh = new LinkedHashMap();
    private Map<String, zzop> zzbwi = new HashMap();
    private AtomicBoolean zzbwj;
    private File zzbwk;

    public zzol(Context context, String str, String str2, Map<String, String> map) {
        this.mContext = context;
        this.zzavp = str;
        this.zzbwd = str2;
        this.zzbwj = new AtomicBoolean(false);
        this.zzbwj.set(((Boolean) zzlc.zzio().zzd(zzoi.zzbng)).booleanValue());
        if (this.zzbwj.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.zzbwk = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.zzbwh.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.zzbwf = new ArrayBlockingQueue(30);
        this.zzbwg = Executors.newSingleThreadExecutor();
        this.zzbwg.execute(new zzom(this));
        this.zzbwi.put("action", zzop.zzbwn);
        this.zzbwi.put("ad_format", zzop.zzbwn);
        this.zzbwi.put("e", zzop.zzbwo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0002 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099 A:{SYNTHETIC, Splitter:B:30:0x0099} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6 A:{SYNTHETIC, Splitter:B:36:0x00a6} */
    private final void zzjk() {
        /*
        r6 = this;
        r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt.";
    L_0x0002:
        r1 = r6.zzbwf;	 Catch:{ InterruptedException -> 0x00c2 }
        r1 = r1.take();	 Catch:{ InterruptedException -> 0x00c2 }
        r1 = (com.google.android.gms.internal.zzov) r1;	 Catch:{ InterruptedException -> 0x00c2 }
        r2 = r1.zzjp();	 Catch:{ InterruptedException -> 0x00c2 }
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 != 0) goto L_0x0002;
    L_0x0014:
        r3 = r6.zzbwh;
        r1 = r1.zzjq();
        r1 = r6.zza(r3, r1);
        r3 = r6.zzbwd;
        r3 = android.net.Uri.parse(r3);
        r3 = r3.buildUpon();
        r1 = r1.entrySet();
        r1 = r1.iterator();
    L_0x0030:
        r4 = r1.hasNext();
        if (r4 == 0) goto L_0x004c;
    L_0x0036:
        r4 = r1.next();
        r4 = (java.util.Map.Entry) r4;
        r5 = r4.getKey();
        r5 = (java.lang.String) r5;
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r3.appendQueryParameter(r5, r4);
        goto L_0x0030;
    L_0x004c:
        r1 = new java.lang.StringBuilder;
        r3 = r3.build();
        r3 = r3.toString();
        r1.<init>(r3);
        r3 = "&it=";
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r2 = r6.zzbwj;
        r2 = r2.get();
        if (r2 == 0) goto L_0x00b6;
    L_0x006d:
        r2 = r6.zzbwk;
        if (r2 == 0) goto L_0x00af;
    L_0x0071:
        r3 = 0;
        r4 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0091 }
        r5 = 1;
        r4.<init>(r2, r5);	 Catch:{ IOException -> 0x0091 }
        r1 = r1.getBytes();	 Catch:{ IOException -> 0x008c, all -> 0x0089 }
        r4.write(r1);	 Catch:{ IOException -> 0x008c, all -> 0x0089 }
        r1 = 10;
        r4.write(r1);	 Catch:{ IOException -> 0x008c, all -> 0x0089 }
        r4.close();	 Catch:{ IOException -> 0x009e }
        goto L_0x0002;
    L_0x0089:
        r1 = move-exception;
        r3 = r4;
        goto L_0x00a4;
    L_0x008c:
        r1 = move-exception;
        r3 = r4;
        goto L_0x0092;
    L_0x008f:
        r1 = move-exception;
        goto L_0x00a4;
    L_0x0091:
        r1 = move-exception;
    L_0x0092:
        r2 = "CsiReporter: Cannot write to file: sdk_csi_data.txt.";
        com.google.android.gms.internal.zzaky.zzc(r2, r1);	 Catch:{ all -> 0x008f }
        if (r3 == 0) goto L_0x0002;
    L_0x0099:
        r3.close();	 Catch:{ IOException -> 0x009e }
        goto L_0x0002;
    L_0x009e:
        r1 = move-exception;
        com.google.android.gms.internal.zzaky.zzc(r0, r1);
        goto L_0x0002;
    L_0x00a4:
        if (r3 == 0) goto L_0x00ae;
    L_0x00a6:
        r3.close();	 Catch:{ IOException -> 0x00aa }
        goto L_0x00ae;
    L_0x00aa:
        r2 = move-exception;
        com.google.android.gms.internal.zzaky.zzc(r0, r2);
    L_0x00ae:
        throw r1;
    L_0x00af:
        r1 = "CsiReporter: File doesn't exists. Cannot write CSI data to file.";
        com.google.android.gms.internal.zzaky.zzcz(r1);
        goto L_0x0002;
    L_0x00b6:
        com.google.android.gms.ads.internal.zzbt.zzel();
        r2 = r6.mContext;
        r3 = r6.zzavp;
        com.google.android.gms.internal.zzaij.zze(r2, r3, r1);
        goto L_0x0002;
    L_0x00c2:
        r0 = move-exception;
        r1 = "CsiReporter:reporter interrupted";
        com.google.android.gms.internal.zzaky.zzc(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzol.zzjk():void");
    }

    /* Access modifiers changed, original: final */
    public final Map<String, String> zza(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, zzam(str).zze(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final boolean zza(zzov zzov) {
        return this.zzbwf.offer(zzov);
    }

    public final zzop zzam(String str) {
        zzop zzop = (zzop) this.zzbwi.get(str);
        return zzop != null ? zzop : zzop.zzbwm;
    }

    public final void zzg(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.zzbwh.put("e", TextUtils.join(ppy.b, list));
        }
    }
}
