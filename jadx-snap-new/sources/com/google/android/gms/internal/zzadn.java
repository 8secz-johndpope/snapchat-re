package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.zzbt;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzadn extends zzaco {
    private static final Object sLock = new Object();
    private static zzadn zzcwb;
    private final Context mContext;
    private final zzadm zzcwc;
    private final ScheduledExecutorService zzcwd = Executors.newSingleThreadScheduledExecutor();

    private zzadn(Context context, zzadm zzadm) {
        this.mContext = context;
        this.zzcwc = zzadm;
    }

    private static zzacj zza(Context context, zzadm zzadm, zzacf zzacf, ScheduledExecutorService scheduledExecutorService) {
        Context context2 = context;
        zzadm zzadm2 = zzadm;
        zzacf zzacf2 = zzacf;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        zzaky.zzby("Starting ad request from service using: google.afma.request.getAdDictionary");
        zzov zzov = new zzov(((Boolean) zzlc.zzio().zzd(zzoi.zzbne)).booleanValue(), "load_ad", zzacf2.zzaud.zzbia);
        if (zzacf2.versionCode > 10 && zzacf2.zzcsl != -1) {
            zzov.zza(zzov.zzd(zzacf2.zzcsl), "cts");
        }
        zzot zzjo = zzov.zzjo();
        Future zza = zzali.zza(zzadm2.zzcvy.zzi(context2), ((Long) zzlc.zzio().zzd(zzoi.zzbtv)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        Future zza2 = zzali.zza(zzadm2.zzcvx.zzp(context2), ((Long) zzlc.zzio().zzd(zzoi.zzbra)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        Future zzbz = zzadm2.zzcvs.zzbz(zzacf2.zzcrw.packageName);
        Future zza3 = zzadm2.zzcvz.zza(zzacf2.zzcrx, zzacf2.zzcrw);
        Future zzo = zzbt.zzew().zzo(context2);
        zzalt zzh = zzali.zzh(null);
        Bundle bundle = zzacf2.zzcrv.extras;
        String str = "_ad";
        Object obj = (bundle == null || bundle.getString(str) == null) ? null : 1;
        if (zzacf2.zzcsr && obj == null) {
            zzh = zzadm2.zzcvv.zza(zzacf2.applicationInfo);
        }
        zzov zzov2 = zzov;
        zzot zzot = zzjo;
        Future zza4 = zzali.zza(zzh, ((Long) zzlc.zzio().zzd(zzoi.zzbte)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        Future zzh2 = zzali.zzh(null);
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbpd)).booleanValue()) {
            zzh2 = zzali.zza(zzadm2.zzcvz.zzac(context2), ((Long) zzlc.zzio().zzd(zzoi.zzbpe)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        }
        Bundle bundle2 = (zzacf2.versionCode < 4 || zzacf2.zzcsc == null) ? null : zzacf2.zzcsc;
        ((Boolean) zzlc.zzio().zzd(zzoi.zzbnu)).booleanValue();
        zzbt.zzel();
        if (zzaij.zzd(context2, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context2.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY)).getActiveNetworkInfo() == null) {
            zzaky.zzby("Device is offline.");
        }
        String uuid = zzacf2.versionCode >= 7 ? zzacf2.zzcsi : UUID.randomUUID().toString();
        zzov zzov3 = zzov2;
        zzadt zzadt = new zzadt(context2, uuid, zzacf2.applicationInfo.packageName);
        if (zzacf2.zzcrv.extras != null) {
            String string = zzacf2.zzcrv.extras.getString(str);
            if (string != null) {
                return zzads.zza(context2, zzacf2, string);
            }
        }
        List zzf = zzadm2.zzcvt.zzf(zzacf2.zzcsj);
        String str2 = uuid;
        Bundle bundle3 = (Bundle) zzali.zza(zza, null, ((Long) zzlc.zzio().zzd(zzoi.zzbtv)).longValue(), TimeUnit.MILLISECONDS);
        zzaek zzaek = (zzaek) zzali.zza(zza2, null);
        Location location = (Location) zzali.zza(zza4, null);
        Info info = (Info) zzali.zza(zzh2, null);
        String str3 = (String) zzali.zza(zza3, null);
        String str4 = (String) zzali.zza(zzbz, null);
        zzaea zzaea = (zzaea) zzali.zza(zzo, null);
        if (zzaea == null) {
            zzaky.zzcz("Error fetching device info. This is not recoverable.");
            return new zzacj(0);
        }
        zzadl zzadl = new zzadl();
        zzadl.zzcvm = zzacf2;
        zzadl.zzcvn = zzaea;
        zzadl.zzcvj = zzaek;
        zzadl.zzbhd = location;
        zzadl.zzcvi = bundle3;
        zzadl.zzcrx = str3;
        zzadl.zzcvl = info;
        if (zzf == null) {
            zzadl.zzcsj.clear();
        }
        zzadl.zzcsj = zzf;
        zzadl.zzcsc = bundle2;
        zzadl.zzcvk = str4;
        zzadl.zzcvo = zzadm2.zzcvr.zze(context2);
        zzadl.zzcvp = zzadm2.zzcvp;
        JSONObject zza5 = zzads.zza(context2, zzadl);
        if (zza5 == null) {
            return new zzacj(0);
        }
        if (zzacf2.versionCode < 7) {
            try {
                zza5.put("request_id", str2);
            } catch (JSONException unused) {
            }
        }
        zzjo = zzot;
        zzov = zzov3;
        zzov.zza(zzjo, "arc");
        zzov.zzjo();
        ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService;
        Future zza6 = zzali.zza(zzali.zza(zzadm2.zzcwa.zzoe().zzf(zza5), zzado.zzaoy, (Executor) scheduledExecutorService3), 10, TimeUnit.SECONDS, scheduledExecutorService3);
        zzalt zzon = zzadm2.zzcvu.zzon();
        if (zzon != null) {
            zzalg.zza(zzon, "AdRequestServiceImpl.loadAd.flags");
        }
        zzacj zzacj = null;
        zzadz zzadz = (zzadz) zzali.zza(zza6, null);
        if (zzadz == null) {
            return new zzacj(0);
        }
        if (zzadz.getErrorCode() != -2) {
            return new zzacj(zzadz.getErrorCode());
        }
        zzov.zzjr();
        if (!TextUtils.isEmpty(zzadz.zzok())) {
            zzacj = zzads.zza(context2, zzacf2, zzadz.zzok());
        }
        if (zzacj == null && !TextUtils.isEmpty(zzadz.getUrl())) {
            zzacj = zza(zzacf, context, zzacf2.zzatz.zzcu, zzadz.getUrl(), str4, zzadz, zzov, zzadm);
        }
        if (zzacj == null) {
            zzacj = new zzacj(0);
        }
        zzov.zza(zzjo, "tts");
        zzacj.zzcub = zzov.zzjp();
        return zzacj;
    }

    /* JADX WARNING: Missing block: B:44:0x00d7, code skipped:
            r0 = r6.toString();
     */
    /* JADX WARNING: Missing block: B:46:?, code skipped:
            r6 = new java.io.InputStreamReader(r11.getInputStream());
     */
    /* JADX WARNING: Missing block: B:48:?, code skipped:
            com.google.android.gms.ads.internal.zzbt.zzel();
            r10 = com.google.android.gms.internal.zzaij.zza(r6);
     */
    /* JADX WARNING: Missing block: B:50:?, code skipped:
            com.google.android.gms.common.util.zzp.closeQuietly(r6);
            r3.zzcw(r10);
            zza(r0, r12, r10, r9);
            r5.zza(r0, r12, r10);
     */
    /* JADX WARNING: Missing block: B:51:0x00f7, code skipped:
            if (r1 == null) goto L_0x0102;
     */
    /* JADX WARNING: Missing block: B:52:0x00f9, code skipped:
            r1.zza(r4, "ufe");
     */
    /* JADX WARNING: Missing block: B:53:0x0102, code skipped:
            r0 = r5.zza(r7, r23.zzol());
     */
    /* JADX WARNING: Missing block: B:55:?, code skipped:
            r11.disconnect();
     */
    /* JADX WARNING: Missing block: B:56:0x010d, code skipped:
            if (r2 == null) goto L_0x0114;
     */
    /* JADX WARNING: Missing block: B:57:0x010f, code skipped:
            r2.zzcvw.zzop();
     */
    /* JADX WARNING: Missing block: B:58:0x0114, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:59:0x0115, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:60:0x0116, code skipped:
            r17 = r6;
     */
    /* JADX WARNING: Missing block: B:61:0x0119, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:62:0x011a, code skipped:
            r17 = null;
     */
    /* JADX WARNING: Missing block: B:64:?, code skipped:
            com.google.android.gms.common.util.zzp.closeQuietly(r17);
     */
    /* JADX WARNING: Missing block: B:65:0x011f, code skipped:
            throw r0;
     */
    /* JADX WARNING: Missing block: B:72:0x013a, code skipped:
            com.google.android.gms.internal.zzaky.zzcz("No location header to follow redirect.");
            r0 = new com.google.android.gms.internal.zzacj(0);
     */
    /* JADX WARNING: Missing block: B:74:?, code skipped:
            r11.disconnect();
     */
    /* JADX WARNING: Missing block: B:75:0x0148, code skipped:
            if (r2 == null) goto L_0x014f;
     */
    /* JADX WARNING: Missing block: B:76:0x014a, code skipped:
            r2.zzcvw.zzop();
     */
    /* JADX WARNING: Missing block: B:77:0x014f, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:81:0x0169, code skipped:
            com.google.android.gms.internal.zzaky.zzcz("Too many redirects.");
            r0 = new com.google.android.gms.internal.zzacj(0);
     */
    /* JADX WARNING: Missing block: B:83:?, code skipped:
            r11.disconnect();
     */
    /* JADX WARNING: Missing block: B:84:0x0177, code skipped:
            if (r2 == null) goto L_0x017e;
     */
    /* JADX WARNING: Missing block: B:85:0x0179, code skipped:
            r2.zzcvw.zzop();
     */
    /* JADX WARNING: Missing block: B:86:0x017e, code skipped:
            return r0;
     */
    public static com.google.android.gms.internal.zzacj zza(com.google.android.gms.internal.zzacf r18, android.content.Context r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.google.android.gms.internal.zzadz r23, com.google.android.gms.internal.zzov r24, com.google.android.gms.internal.zzadm r25) {
        /*
        r0 = r18;
        r1 = r24;
        r2 = r25;
        if (r1 == 0) goto L_0x000d;
    L_0x0008:
        r4 = r24.zzjo();
        goto L_0x000e;
    L_0x000d:
        r4 = 0;
    L_0x000e:
        r5 = new com.google.android.gms.internal.zzadx;	 Catch:{ IOException -> 0x01c4 }
        r6 = r23.zzoh();	 Catch:{ IOException -> 0x01c4 }
        r5.<init>(r0, r6);	 Catch:{ IOException -> 0x01c4 }
        r6 = "AdRequestServiceImpl: Sending request: ";
        r7 = java.lang.String.valueOf(r21);	 Catch:{ IOException -> 0x01c4 }
        r8 = r7.length();	 Catch:{ IOException -> 0x01c4 }
        if (r8 == 0) goto L_0x0028;
    L_0x0023:
        r6 = r6.concat(r7);	 Catch:{ IOException -> 0x01c4 }
        goto L_0x002e;
    L_0x0028:
        r7 = new java.lang.String;	 Catch:{ IOException -> 0x01c4 }
        r7.<init>(r6);	 Catch:{ IOException -> 0x01c4 }
        r6 = r7;
    L_0x002e:
        com.google.android.gms.internal.zzaky.zzby(r6);	 Catch:{ IOException -> 0x01c4 }
        r6 = new java.net.URL;	 Catch:{ IOException -> 0x01c4 }
        r7 = r21;
        r6.<init>(r7);	 Catch:{ IOException -> 0x01c4 }
        r7 = com.google.android.gms.ads.internal.zzbt.zzes();	 Catch:{ IOException -> 0x01c4 }
        r7 = r7.elapsedRealtime();	 Catch:{ IOException -> 0x01c4 }
        r9 = 0;
        r10 = 0;
    L_0x0042:
        if (r2 == 0) goto L_0x0049;
    L_0x0044:
        r11 = r2.zzcvw;	 Catch:{ IOException -> 0x01c4 }
        r11.zzoo();	 Catch:{ IOException -> 0x01c4 }
    L_0x0049:
        r11 = r6.openConnection();	 Catch:{ IOException -> 0x01c4 }
        r11 = (java.net.HttpURLConnection) r11;	 Catch:{ IOException -> 0x01c4 }
        r12 = com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ all -> 0x01b8 }
        r13 = r19;
        r14 = r20;
        r12.zza(r13, r14, r9, r11);	 Catch:{ all -> 0x01b8 }
        r12 = android.text.TextUtils.isEmpty(r22);	 Catch:{ all -> 0x01b8 }
        if (r12 != 0) goto L_0x006e;
    L_0x0060:
        r12 = r23.zzoj();	 Catch:{ all -> 0x01b8 }
        if (r12 == 0) goto L_0x006e;
    L_0x0066:
        r12 = "x-afma-drt-cookie";
        r15 = r22;
        r11.addRequestProperty(r12, r15);	 Catch:{ all -> 0x01b8 }
        goto L_0x0070;
    L_0x006e:
        r15 = r22;
    L_0x0070:
        r12 = r0.zzcss;	 Catch:{ all -> 0x01b8 }
        r16 = android.text.TextUtils.isEmpty(r12);	 Catch:{ all -> 0x01b8 }
        if (r16 != 0) goto L_0x0082;
    L_0x0078:
        r16 = "Sending webview cookie in ad request header.";
        com.google.android.gms.internal.zzaky.zzby(r16);	 Catch:{ all -> 0x01b8 }
        r9 = "Cookie";
        r11.addRequestProperty(r9, r12);	 Catch:{ all -> 0x01b8 }
    L_0x0082:
        r9 = 1;
        if (r23 == 0) goto L_0x00b9;
    L_0x0085:
        r12 = r23.zzoi();	 Catch:{ all -> 0x01b8 }
        r12 = android.text.TextUtils.isEmpty(r12);	 Catch:{ all -> 0x01b8 }
        if (r12 != 0) goto L_0x00b9;
    L_0x008f:
        r11.setDoOutput(r9);	 Catch:{ all -> 0x01b8 }
        r12 = r23.zzoi();	 Catch:{ all -> 0x01b8 }
        r12 = r12.getBytes();	 Catch:{ all -> 0x01b8 }
        r9 = r12.length;	 Catch:{ all -> 0x01b8 }
        r11.setFixedLengthStreamingMode(r9);	 Catch:{ all -> 0x01b8 }
        r9 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x00b2 }
        r3 = r11.getOutputStream();	 Catch:{ all -> 0x00b2 }
        r9.<init>(r3);	 Catch:{ all -> 0x00b2 }
        r9.write(r12);	 Catch:{ all -> 0x00ae }
        com.google.android.gms.common.util.zzp.closeQuietly(r9);	 Catch:{ all -> 0x01b8 }
        goto L_0x00ba;
    L_0x00ae:
        r0 = move-exception;
        r17 = r9;
        goto L_0x00b5;
    L_0x00b2:
        r0 = move-exception;
        r17 = 0;
    L_0x00b5:
        com.google.android.gms.common.util.zzp.closeQuietly(r17);	 Catch:{ all -> 0x01b8 }
        throw r0;	 Catch:{ all -> 0x01b8 }
    L_0x00b9:
        r12 = 0;
    L_0x00ba:
        r3 = new com.google.android.gms.internal.zzaks;	 Catch:{ all -> 0x01b8 }
        r9 = r0.zzcsi;	 Catch:{ all -> 0x01b8 }
        r3.<init>(r9);	 Catch:{ all -> 0x01b8 }
        r3.zza(r11, r12);	 Catch:{ all -> 0x01b8 }
        r9 = r11.getResponseCode();	 Catch:{ all -> 0x01b8 }
        r12 = r11.getHeaderFields();	 Catch:{ all -> 0x01b8 }
        r3.zza(r11, r9);	 Catch:{ all -> 0x01b8 }
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r13 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r9 < r0) goto L_0x0120;
    L_0x00d5:
        if (r9 >= r13) goto L_0x0120;
    L_0x00d7:
        r0 = r6.toString();	 Catch:{ all -> 0x01b8 }
        r6 = new java.io.InputStreamReader;	 Catch:{ all -> 0x0119 }
        r10 = r11.getInputStream();	 Catch:{ all -> 0x0119 }
        r6.<init>(r10);	 Catch:{ all -> 0x0119 }
        com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ all -> 0x0115 }
        r10 = com.google.android.gms.internal.zzaij.zza(r6);	 Catch:{ all -> 0x0115 }
        com.google.android.gms.common.util.zzp.closeQuietly(r6);	 Catch:{ all -> 0x01b8 }
        r3.zzcw(r10);	 Catch:{ all -> 0x01b8 }
        zza(r0, r12, r10, r9);	 Catch:{ all -> 0x01b8 }
        r5.zza(r0, r12, r10);	 Catch:{ all -> 0x01b8 }
        if (r1 == 0) goto L_0x0102;
    L_0x00f9:
        r0 = "ufe";
        r0 = new java.lang.String[]{r0};	 Catch:{ all -> 0x01b8 }
        r1.zza(r4, r0);	 Catch:{ all -> 0x01b8 }
    L_0x0102:
        r0 = r23.zzol();	 Catch:{ all -> 0x01b8 }
        r0 = r5.zza(r7, r0);	 Catch:{ all -> 0x01b8 }
        r11.disconnect();	 Catch:{ IOException -> 0x01c4 }
        if (r2 == 0) goto L_0x0114;
    L_0x010f:
        r1 = r2.zzcvw;	 Catch:{ IOException -> 0x01c4 }
        r1.zzop();	 Catch:{ IOException -> 0x01c4 }
    L_0x0114:
        return r0;
    L_0x0115:
        r0 = move-exception;
        r17 = r6;
        goto L_0x011c;
    L_0x0119:
        r0 = move-exception;
        r17 = 0;
    L_0x011c:
        com.google.android.gms.common.util.zzp.closeQuietly(r17);	 Catch:{ all -> 0x01b8 }
        throw r0;	 Catch:{ all -> 0x01b8 }
    L_0x0120:
        r0 = r6.toString();	 Catch:{ all -> 0x01b8 }
        r3 = 0;
        zza(r0, r12, r3, r9);	 Catch:{ all -> 0x01b8 }
        if (r9 < r13) goto L_0x0191;
    L_0x012a:
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r9 >= r0) goto L_0x0191;
    L_0x012e:
        r0 = "Location";
        r0 = r11.getHeaderField(r0);	 Catch:{ all -> 0x01b8 }
        r6 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x01b8 }
        if (r6 == 0) goto L_0x0150;
    L_0x013a:
        r0 = "No location header to follow redirect.";
        com.google.android.gms.internal.zzaky.zzcz(r0);	 Catch:{ all -> 0x01b8 }
        r0 = new com.google.android.gms.internal.zzacj;	 Catch:{ all -> 0x01b8 }
        r1 = 0;
        r0.<init>(r1);	 Catch:{ all -> 0x01b8 }
        r11.disconnect();	 Catch:{ IOException -> 0x01c4 }
        if (r2 == 0) goto L_0x014f;
    L_0x014a:
        r1 = r2.zzcvw;	 Catch:{ IOException -> 0x01c4 }
        r1.zzop();	 Catch:{ IOException -> 0x01c4 }
    L_0x014f:
        return r0;
    L_0x0150:
        r6 = new java.net.URL;	 Catch:{ all -> 0x01b8 }
        r6.<init>(r0);	 Catch:{ all -> 0x01b8 }
        r0 = 1;
        r10 = r10 + r0;
        r0 = com.google.android.gms.internal.zzoi.zzbvf;	 Catch:{ all -> 0x01b8 }
        r9 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x01b8 }
        r0 = r9.zzd(r0);	 Catch:{ all -> 0x01b8 }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x01b8 }
        r0 = r0.intValue();	 Catch:{ all -> 0x01b8 }
        if (r10 <= r0) goto L_0x017f;
    L_0x0169:
        r0 = "Too many redirects.";
        com.google.android.gms.internal.zzaky.zzcz(r0);	 Catch:{ all -> 0x01b8 }
        r0 = new com.google.android.gms.internal.zzacj;	 Catch:{ all -> 0x01b8 }
        r1 = 0;
        r0.<init>(r1);	 Catch:{ all -> 0x01b8 }
        r11.disconnect();	 Catch:{ IOException -> 0x01c4 }
        if (r2 == 0) goto L_0x017e;
    L_0x0179:
        r1 = r2.zzcvw;	 Catch:{ IOException -> 0x01c4 }
        r1.zzop();	 Catch:{ IOException -> 0x01c4 }
    L_0x017e:
        return r0;
    L_0x017f:
        r5.zzo(r12);	 Catch:{ all -> 0x01b8 }
        r11.disconnect();	 Catch:{ IOException -> 0x01c4 }
        if (r2 == 0) goto L_0x018c;
    L_0x0187:
        r0 = r2.zzcvw;	 Catch:{ IOException -> 0x01c4 }
        r0.zzop();	 Catch:{ IOException -> 0x01c4 }
    L_0x018c:
        r9 = 0;
        r0 = r18;
        goto L_0x0042;
    L_0x0191:
        r0 = 46;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01b8 }
        r1.<init>(r0);	 Catch:{ all -> 0x01b8 }
        r0 = "Received error HTTP response code: ";
        r1.append(r0);	 Catch:{ all -> 0x01b8 }
        r1.append(r9);	 Catch:{ all -> 0x01b8 }
        r0 = r1.toString();	 Catch:{ all -> 0x01b8 }
        com.google.android.gms.internal.zzaky.zzcz(r0);	 Catch:{ all -> 0x01b8 }
        r0 = new com.google.android.gms.internal.zzacj;	 Catch:{ all -> 0x01b8 }
        r1 = 0;
        r0.<init>(r1);	 Catch:{ all -> 0x01b8 }
        r11.disconnect();	 Catch:{ IOException -> 0x01c4 }
        if (r2 == 0) goto L_0x01b7;
    L_0x01b2:
        r1 = r2.zzcvw;	 Catch:{ IOException -> 0x01c4 }
        r1.zzop();	 Catch:{ IOException -> 0x01c4 }
    L_0x01b7:
        return r0;
    L_0x01b8:
        r0 = move-exception;
        r11.disconnect();	 Catch:{ IOException -> 0x01c4 }
        if (r2 == 0) goto L_0x01c3;
    L_0x01be:
        r1 = r2.zzcvw;	 Catch:{ IOException -> 0x01c4 }
        r1.zzop();	 Catch:{ IOException -> 0x01c4 }
    L_0x01c3:
        throw r0;	 Catch:{ IOException -> 0x01c4 }
    L_0x01c4:
        r0 = move-exception;
        r1 = "Error while connecting to ad server: ";
        r0 = r0.getMessage();
        r0 = java.lang.String.valueOf(r0);
        r2 = r0.length();
        if (r2 == 0) goto L_0x01da;
    L_0x01d5:
        r0 = r1.concat(r0);
        goto L_0x01df;
    L_0x01da:
        r0 = new java.lang.String;
        r0.<init>(r1);
    L_0x01df:
        com.google.android.gms.internal.zzaky.zzcz(r0);
        r0 = new com.google.android.gms.internal.zzacj;
        r1 = 2;
        r0.<init>(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzadn.zza(com.google.android.gms.internal.zzacf, android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.zzadz, com.google.android.gms.internal.zzov, com.google.android.gms.internal.zzadm):com.google.android.gms.internal.zzacj");
    }

    public static zzadn zza(Context context, zzadm zzadm) {
        zzadn zzadn;
        synchronized (sLock) {
            if (zzcwb == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                zzoi.initialize(context);
                zzcwb = new zzadn(context, zzadm);
                if (context.getApplicationContext() != null) {
                    zzbt.zzel().zzai(context);
                }
                zzahu.zzaf(context);
            }
            zzadn = zzcwb;
        }
        return zzadn;
    }

    private static void zza(String str, Map<String, List<String>> map, String str2, int i) {
        if (zzaky.zzae(2)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 39);
            stringBuilder.append("Http Response: {\n  URL:\n    ");
            stringBuilder.append(str);
            stringBuilder.append("\n  Headers:");
            zzahw.v(stringBuilder.toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str3).length() + 5);
                    stringBuilder2.append("    ");
                    stringBuilder2.append(str3);
                    stringBuilder2.append(":");
                    zzahw.v(stringBuilder2.toString());
                    for (String valueOf : (List) map.get(str3)) {
                        String str4 = "      ";
                        String valueOf2 = String.valueOf(valueOf2);
                        zzahw.v(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
                    }
                }
            }
            zzahw.v("  Body:");
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
                    zzahw.v(str2.substring(i2, Math.min(str2.length(), i3)));
                    i2 = i3;
                }
            } else {
                zzahw.v("    null");
            }
            StringBuilder stringBuilder3 = new StringBuilder(34);
            stringBuilder3.append("  Response Code:\n    ");
            stringBuilder3.append(i);
            stringBuilder3.append("\n}");
            zzahw.v(stringBuilder3.toString());
        }
    }

    public final void zza(zzacf zzacf, zzacq zzacq) {
        zzbt.zzep().zzd(this.mContext, zzacf.zzatz);
        zzalt zzb = zzaid.zzb(new zzadp(this, zzacf, zzacq));
        zzbt.zzfa().zzrt();
        zzbt.zzfa().getHandler().postDelayed(new zzadq(this, zzb), 60000);
    }

    public final void zza(zzacy zzacy, zzact zzact) {
        zzahw.v("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    public final zzacj zzb(zzacf zzacf) {
        return zza(this.mContext, this.zzcwc, zzacf, this.zzcwd);
    }
}
