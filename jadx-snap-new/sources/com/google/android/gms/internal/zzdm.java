package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzdm {
    private static final String TAG = "zzdm";
    private volatile boolean zzahq = false;
    protected Context zzaiq;
    private ExecutorService zzair;
    private DexClassLoader zzais;
    private zzcx zzait;
    private byte[] zzaiu;
    private volatile AdvertisingIdClient zzaiv = null;
    private Future zzaiw = null;
    private boolean zzaix;
    private volatile zzba zzaiy = null;
    private Future zzaiz = null;
    private zzcp zzaja;
    private boolean zzajb = false;
    private boolean zzajc = false;
    private Map<Pair<String, String>, zzes> zzajd;
    private boolean zzaje = false;
    private boolean zzajf;
    private boolean zzajg;

    final class zza extends BroadcastReceiver {
        private zza() {
        }

        /* synthetic */ zza(zzdm zzdm, zzdn zzdn) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                zzdm.this.zzajf = true;
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                zzdm.this.zzajf = false;
            }
        }
    }

    private zzdm(Context context) {
        boolean z = true;
        this.zzajf = true;
        this.zzajg = false;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            z = false;
        }
        this.zzaix = z;
        if (this.zzaix) {
            context = applicationContext;
        }
        this.zzaiq = context;
        this.zzajd = new HashMap();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051 A:{Catch:{ zzcy -> 0x015e, zzdj -> 0x0165 }} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A:{Catch:{ all -> 0x012d, FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af A:{Catch:{ all -> 0x012d, FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0103 A:{Catch:{ zzcy -> 0x015e, zzdj -> 0x0165 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0048 */
    /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|27|(15:28|29|(2:31|(1:33)(2:34|35))|36|(1:38)|39|40|41|42|43|44|45|(2:47|(1:49)(1:50))|51|72)) */
    public static com.google.android.gms.internal.zzdm zza(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
        r0 = "%s/%s.dex";
        r1 = new com.google.android.gms.internal.zzdm;
        r1.<init>(r9);
        r9 = java.util.concurrent.Executors.newCachedThreadPool();	 Catch:{ zzdj -> 0x0165 }
        r1.zzair = r9;	 Catch:{ zzdj -> 0x0165 }
        r1.zzahq = r12;	 Catch:{ zzdj -> 0x0165 }
        if (r12 == 0) goto L_0x001e;
    L_0x0011:
        r9 = r1.zzair;	 Catch:{ zzdj -> 0x0165 }
        r12 = new com.google.android.gms.internal.zzdn;	 Catch:{ zzdj -> 0x0165 }
        r12.<init>(r1);	 Catch:{ zzdj -> 0x0165 }
        r9 = r9.submit(r12);	 Catch:{ zzdj -> 0x0165 }
        r1.zzaiw = r9;	 Catch:{ zzdj -> 0x0165 }
    L_0x001e:
        r9 = r1.zzair;	 Catch:{ zzdj -> 0x0165 }
        r12 = new com.google.android.gms.internal.zzdp;	 Catch:{ zzdj -> 0x0165 }
        r12.<init>(r1);	 Catch:{ zzdj -> 0x0165 }
        r9.execute(r12);	 Catch:{ zzdj -> 0x0165 }
        r9 = 1;
        r12 = 0;
        r2 = com.google.android.gms.common.zzf.zzahf();	 Catch:{ Throwable -> 0x0048 }
        r3 = r1.zzaiq;	 Catch:{ Throwable -> 0x0048 }
        r3 = com.google.android.gms.common.zzf.zzcg(r3);	 Catch:{ Throwable -> 0x0048 }
        if (r3 <= 0) goto L_0x0038;
    L_0x0036:
        r3 = 1;
        goto L_0x0039;
    L_0x0038:
        r3 = 0;
    L_0x0039:
        r1.zzajb = r3;	 Catch:{ Throwable -> 0x0048 }
        r3 = r1.zzaiq;	 Catch:{ Throwable -> 0x0048 }
        r2 = r2.isGooglePlayServicesAvailable(r3);	 Catch:{ Throwable -> 0x0048 }
        if (r2 != 0) goto L_0x0045;
    L_0x0043:
        r2 = 1;
        goto L_0x0046;
    L_0x0045:
        r2 = 0;
    L_0x0046:
        r1.zzajc = r2;	 Catch:{ Throwable -> 0x0048 }
    L_0x0048:
        r1.zza(r12, r9);	 Catch:{ zzdj -> 0x0165 }
        r2 = com.google.android.gms.internal.zzds.zzas();	 Catch:{ zzdj -> 0x0165 }
        if (r2 == 0) goto L_0x006c;
    L_0x0051:
        r2 = com.google.android.gms.internal.zzoi.zzbrs;	 Catch:{ zzdj -> 0x0165 }
        r3 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ zzdj -> 0x0165 }
        r2 = r3.zzd(r2);	 Catch:{ zzdj -> 0x0165 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ zzdj -> 0x0165 }
        r2 = r2.booleanValue();	 Catch:{ zzdj -> 0x0165 }
        if (r2 != 0) goto L_0x0064;
    L_0x0063:
        goto L_0x006c;
    L_0x0064:
        r9 = new java.lang.IllegalStateException;	 Catch:{ zzdj -> 0x0165 }
        r10 = "Task Context initialization must not be called from the UI thread.";
        r9.<init>(r10);	 Catch:{ zzdj -> 0x0165 }
        throw r9;	 Catch:{ zzdj -> 0x0165 }
    L_0x006c:
        r2 = new com.google.android.gms.internal.zzcx;	 Catch:{ zzdj -> 0x0165 }
        r3 = 0;
        r2.<init>(r3);	 Catch:{ zzdj -> 0x0165 }
        r1.zzait = r2;	 Catch:{ zzdj -> 0x0165 }
        r2 = r1.zzait;	 Catch:{ zzcy -> 0x015e }
        r10 = r2.zzl(r10);	 Catch:{ zzcy -> 0x015e }
        r1.zzaiu = r10;	 Catch:{ zzcy -> 0x015e }
        r10 = r1.zzaiq;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r10 = r10.getCacheDir();	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        if (r10 != 0) goto L_0x0095;
    L_0x0084:
        r10 = r1.zzaiq;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r2 = "dex";
        r10 = r10.getDir(r2, r12);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        if (r10 == 0) goto L_0x008f;
    L_0x008e:
        goto L_0x0095;
    L_0x008f:
        r9 = new com.google.android.gms.internal.zzdj;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r9.<init>();	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        throw r9;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
    L_0x0095:
        r2 = "1510898742191";
        r4 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r5 = "%s/%s.jar";
        r6 = 2;
        r7 = new java.lang.Object[r6];	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r7[r12] = r10;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r7[r9] = r2;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r5 = java.lang.String.format(r5, r7);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r4.<init>(r5);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r5 = r4.exists();	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        if (r5 != 0) goto L_0x00c6;
    L_0x00af:
        r5 = r1.zzait;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r7 = r1.zzaiu;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r11 = r5.zzb(r7, r11);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r4.createNewFile();	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r5 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r5.<init>(r4);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r7 = r11.length;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r5.write(r11, r12, r7);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r5.close();	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
    L_0x00c6:
        r1.zzb(r10, r2);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r11 = new dalvik.system.DexClassLoader;	 Catch:{ all -> 0x012d }
        r5 = r4.getAbsolutePath();	 Catch:{ all -> 0x012d }
        r7 = r10.getAbsolutePath();	 Catch:{ all -> 0x012d }
        r8 = r1.zzaiq;	 Catch:{ all -> 0x012d }
        r8 = r8.getClassLoader();	 Catch:{ all -> 0x012d }
        r11.<init>(r5, r7, r3, r8);	 Catch:{ all -> 0x012d }
        r1.zzais = r11;	 Catch:{ all -> 0x012d }
        zzb(r4);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r1.zza(r10, r2);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r11 = new java.lang.Object[r6];	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r11[r12] = r10;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r11[r9] = r2;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r10 = java.lang.String.format(r0, r11);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        zzm(r10);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r10 = com.google.android.gms.internal.zzoi.zzbrk;	 Catch:{ zzdj -> 0x0165 }
        r11 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ zzdj -> 0x0165 }
        r10 = r11.zzd(r10);	 Catch:{ zzdj -> 0x0165 }
        r10 = (java.lang.Boolean) r10;	 Catch:{ zzdj -> 0x0165 }
        r10 = r10.booleanValue();	 Catch:{ zzdj -> 0x0165 }
        if (r10 == 0) goto L_0x0123;
    L_0x0103:
        r10 = r1.zzajg;	 Catch:{ zzdj -> 0x0165 }
        if (r10 == 0) goto L_0x0108;
    L_0x0107:
        goto L_0x0123;
    L_0x0108:
        r10 = new android.content.IntentFilter;	 Catch:{ zzdj -> 0x0165 }
        r10.<init>();	 Catch:{ zzdj -> 0x0165 }
        r11 = "android.intent.action.USER_PRESENT";
        r10.addAction(r11);	 Catch:{ zzdj -> 0x0165 }
        r11 = "android.intent.action.SCREEN_OFF";
        r10.addAction(r11);	 Catch:{ zzdj -> 0x0165 }
        r11 = r1.zzaiq;	 Catch:{ zzdj -> 0x0165 }
        r12 = new com.google.android.gms.internal.zzdm$zza;	 Catch:{ zzdj -> 0x0165 }
        r12.<init>(r1, r3);	 Catch:{ zzdj -> 0x0165 }
        r11.registerReceiver(r12, r10);	 Catch:{ zzdj -> 0x0165 }
        r1.zzajg = r9;	 Catch:{ zzdj -> 0x0165 }
    L_0x0123:
        r10 = new com.google.android.gms.internal.zzcp;	 Catch:{ zzdj -> 0x0165 }
        r10.<init>(r1);	 Catch:{ zzdj -> 0x0165 }
        r1.zzaja = r10;	 Catch:{ zzdj -> 0x0165 }
        r1.zzaje = r9;	 Catch:{ zzdj -> 0x0165 }
        goto L_0x0165;
    L_0x012d:
        r11 = move-exception;
        zzb(r4);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r1.zza(r10, r2);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r3 = new java.lang.Object[r6];	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r3[r12] = r10;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r3[r9] = r2;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        r9 = java.lang.String.format(r0, r3);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        zzm(r9);	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
        throw r11;	 Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0150, zzcy -> 0x0149, NullPointerException -> 0x0142 }
    L_0x0142:
        r9 = move-exception;
        r10 = new com.google.android.gms.internal.zzdj;	 Catch:{ zzdj -> 0x0165 }
        r10.<init>(r9);	 Catch:{ zzdj -> 0x0165 }
        throw r10;	 Catch:{ zzdj -> 0x0165 }
    L_0x0149:
        r9 = move-exception;
        r10 = new com.google.android.gms.internal.zzdj;	 Catch:{ zzdj -> 0x0165 }
        r10.<init>(r9);	 Catch:{ zzdj -> 0x0165 }
        throw r10;	 Catch:{ zzdj -> 0x0165 }
    L_0x0150:
        r9 = move-exception;
        r10 = new com.google.android.gms.internal.zzdj;	 Catch:{ zzdj -> 0x0165 }
        r10.<init>(r9);	 Catch:{ zzdj -> 0x0165 }
        throw r10;	 Catch:{ zzdj -> 0x0165 }
    L_0x0157:
        r9 = move-exception;
        r10 = new com.google.android.gms.internal.zzdj;	 Catch:{ zzdj -> 0x0165 }
        r10.<init>(r9);	 Catch:{ zzdj -> 0x0165 }
        throw r10;	 Catch:{ zzdj -> 0x0165 }
    L_0x015e:
        r9 = move-exception;
        r10 = new com.google.android.gms.internal.zzdj;	 Catch:{ zzdj -> 0x0165 }
        r10.<init>(r9);	 Catch:{ zzdj -> 0x0165 }
        throw r10;	 Catch:{ zzdj -> 0x0165 }
    L_0x0165:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdm.zza(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.zzdm");
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2 A:{SYNTHETIC, Splitter:B:52:0x00b2} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7 A:{SYNTHETIC, Splitter:B:56:0x00b7} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3 A:{SYNTHETIC, Splitter:B:39:0x00a3} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8 A:{SYNTHETIC, Splitter:B:43:0x00a8} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2 A:{SYNTHETIC, Splitter:B:52:0x00b2} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7 A:{SYNTHETIC, Splitter:B:56:0x00b7} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3 A:{SYNTHETIC, Splitter:B:39:0x00a3} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8 A:{SYNTHETIC, Splitter:B:43:0x00a8} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0091 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:20|21|22|23|24|25|26|27|28|30) */
    private final void zza(java.io.File r9, java.lang.String r10) {
        /*
        r8 = this;
        r0 = new java.io.File;
        r1 = 2;
        r2 = new java.lang.Object[r1];
        r3 = 0;
        r2[r3] = r9;
        r4 = 1;
        r2[r4] = r10;
        r5 = "%s/%s.tmp";
        r2 = java.lang.String.format(r5, r2);
        r0.<init>(r2);
        r2 = r0.exists();
        if (r2 == 0) goto L_0x001b;
    L_0x001a:
        return;
    L_0x001b:
        r2 = new java.io.File;
        r1 = new java.lang.Object[r1];
        r1[r3] = r9;
        r1[r4] = r10;
        r9 = "%s/%s.dex";
        r9 = java.lang.String.format(r9, r1);
        r2.<init>(r9);
        r9 = r2.exists();
        if (r9 != 0) goto L_0x0033;
    L_0x0032:
        return;
    L_0x0033:
        r4 = r2.length();
        r6 = 0;
        r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r9 > 0) goto L_0x003e;
    L_0x003d:
        return;
    L_0x003e:
        r9 = (int) r4;
        r9 = new byte[r9];
        r1 = 0;
        r4 = new java.io.FileInputStream;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00af, zzcy | IOException | NoSuchAlgorithmException -> 0x00af, zzcy | IOException | NoSuchAlgorithmException -> 0x00af, all -> 0x009f }
        r4.<init>(r2);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00af, zzcy | IOException | NoSuchAlgorithmException -> 0x00af, zzcy | IOException | NoSuchAlgorithmException -> 0x00af, all -> 0x009f }
        r5 = r4.read(r9);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        if (r5 > 0) goto L_0x0054;
    L_0x004d:
        r4.close();	 Catch:{ IOException -> 0x0050 }
    L_0x0050:
        zzb(r2);
        return;
    L_0x0054:
        r5 = new com.google.android.gms.internal.zzbe;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r5.<init>();	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r6 = android.os.Build.VERSION.SDK;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r6 = r6.getBytes();	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r5.zzgm = r6;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r10 = r10.getBytes();	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r5.zzgl = r10;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r10 = r8.zzait;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r6 = r8.zzaiu;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r9 = r10.zzc(r6, r9);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r9 = r9.getBytes();	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r5.data = r9;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r9 = com.google.android.gms.internal.zzbx.zzb(r9);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r5.zzgk = r9;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r0.createNewFile();	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r9 = new java.io.FileOutputStream;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r9.<init>(r0);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, zzcy | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
        r10 = com.google.android.gms.internal.zzfls.zzc(r5);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x009b, zzcy | IOException | NoSuchAlgorithmException -> 0x009b, zzcy | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
        r0 = r10.length;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x009b, zzcy | IOException | NoSuchAlgorithmException -> 0x009b, zzcy | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
        r9.write(r10, r3, r0);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x009b, zzcy | IOException | NoSuchAlgorithmException -> 0x009b, zzcy | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
        r9.close();	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x009b, zzcy | IOException | NoSuchAlgorithmException -> 0x009b, zzcy | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
        r4.close();	 Catch:{ IOException -> 0x0091 }
    L_0x0091:
        r9.close();	 Catch:{ IOException -> 0x0094 }
    L_0x0094:
        zzb(r2);
        return;
    L_0x0098:
        r10 = move-exception;
        r1 = r9;
        goto L_0x00a1;
    L_0x009b:
        r1 = r9;
        goto L_0x00b0;
    L_0x009d:
        r10 = move-exception;
        goto L_0x00a1;
    L_0x009f:
        r10 = move-exception;
        r4 = r1;
    L_0x00a1:
        if (r4 == 0) goto L_0x00a6;
    L_0x00a3:
        r4.close();	 Catch:{ IOException -> 0x00a6 }
    L_0x00a6:
        if (r1 == 0) goto L_0x00ab;
    L_0x00a8:
        r1.close();	 Catch:{ IOException -> 0x00ab }
    L_0x00ab:
        zzb(r2);
        throw r10;
    L_0x00af:
        r4 = r1;
    L_0x00b0:
        if (r4 == 0) goto L_0x00b5;
    L_0x00b2:
        r4.close();	 Catch:{ IOException -> 0x00b5 }
    L_0x00b5:
        if (r1 == 0) goto L_0x00ba;
    L_0x00b7:
        r1.close();	 Catch:{ IOException -> 0x00ba }
    L_0x00ba:
        zzb(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdm.zza(java.io.File, java.lang.String):void");
    }

    private static boolean zza(int i, zzba zzba) {
        if (i < 4) {
            if (zzba == null) {
                return true;
            }
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbrv)).booleanValue() && (zzba.zzcv == null || zzba.zzcv.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                return true;
            }
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbrw)).booleanValue() && (zzba.zzfh == null || zzba.zzfh.zzgf == null || zzba.zzfh.zzgf.longValue() == -2)) {
                return true;
            }
        }
        return false;
    }

    private final void zzao() {
        try {
            if (this.zzaiv == null && this.zzaix) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zzaiq);
                advertisingIdClient.start();
                this.zzaiv = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzaiv = null;
        }
    }

    private final zzba zzap() {
        try {
            return zzcda.zzm(this.zzaiq, this.zzaiq.getPackageName(), Integer.toString(this.zzaiq.getPackageManager().getPackageInfo(this.zzaiq.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void zzb(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        Log.d(TAG, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d3 A:{SYNTHETIC, Splitter:B:64:0x00d3} */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8 A:{SYNTHETIC, Splitter:B:68:0x00d8} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7 A:{SYNTHETIC, Splitter:B:52:0x00c7} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cc A:{SYNTHETIC, Splitter:B:56:0x00cc} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d3 A:{SYNTHETIC, Splitter:B:64:0x00d3} */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8 A:{SYNTHETIC, Splitter:B:68:0x00d8} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7 A:{SYNTHETIC, Splitter:B:52:0x00c7} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cc A:{SYNTHETIC, Splitter:B:56:0x00cc} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00b1 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:29|30|31|32|33|34|35|36) */
    private final boolean zzb(java.io.File r10, java.lang.String r11) {
        /*
        r9 = this;
        r0 = new java.io.File;
        r1 = 2;
        r2 = new java.lang.Object[r1];
        r3 = 0;
        r2[r3] = r10;
        r4 = 1;
        r2[r4] = r11;
        r5 = "%s/%s.tmp";
        r2 = java.lang.String.format(r5, r2);
        r0.<init>(r2);
        r2 = r0.exists();
        if (r2 != 0) goto L_0x001b;
    L_0x001a:
        return r3;
    L_0x001b:
        r2 = new java.io.File;
        r1 = new java.lang.Object[r1];
        r1[r3] = r10;
        r1[r4] = r11;
        r10 = "%s/%s.dex";
        r10 = java.lang.String.format(r10, r1);
        r2.<init>(r10);
        r10 = r2.exists();
        if (r10 == 0) goto L_0x0033;
    L_0x0032:
        return r3;
    L_0x0033:
        r10 = 0;
        r5 = r0.length();	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
        r7 = 0;
        r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r1 > 0) goto L_0x0042;
    L_0x003e:
        zzb(r0);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
        return r3;
    L_0x0042:
        r1 = (int) r5;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
        r1 = new byte[r1];	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
        r5 = new java.io.FileInputStream;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
        r5.<init>(r0);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, zzcy | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
        r6 = r5.read(r1);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        if (r6 > 0) goto L_0x005e;
    L_0x0050:
        r11 = TAG;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r1 = "Cannot read the cache data.";
        android.util.Log.d(r11, r1);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        zzb(r0);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r5.close();	 Catch:{ IOException -> 0x005d }
    L_0x005d:
        return r3;
    L_0x005e:
        r6 = new com.google.android.gms.internal.zzbe;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r6.<init>();	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r1 = com.google.android.gms.internal.zzfls.zza(r6, r1);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r1 = (com.google.android.gms.internal.zzbe) r1;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r6 = new java.lang.String;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r7 = r1.zzgl;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r6.<init>(r7);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r11 = r11.equals(r6);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        if (r11 == 0) goto L_0x00ba;
    L_0x0076:
        r11 = r1.zzgk;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r6 = r1.data;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r6 = com.google.android.gms.internal.zzbx.zzb(r6);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r11 = java.util.Arrays.equals(r11, r6);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        if (r11 == 0) goto L_0x00ba;
    L_0x0084:
        r11 = r1.zzgm;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r6 = android.os.Build.VERSION.SDK;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r6 = r6.getBytes();	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r11 = java.util.Arrays.equals(r11, r6);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        if (r11 != 0) goto L_0x0093;
    L_0x0092:
        goto L_0x00ba;
    L_0x0093:
        r11 = r9.zzait;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r0 = r9.zzaiu;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r6 = new java.lang.String;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r1 = r1.data;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r6.<init>(r1);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r11 = r11.zzb(r0, r6);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r2.createNewFile();	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r0 = new java.io.FileOutputStream;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r0.<init>(r2);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r10 = r11.length;	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b8, zzcy | IOException | NoSuchAlgorithmException -> 0x00b8, zzcy | IOException | NoSuchAlgorithmException -> 0x00b8, all -> 0x00b5 }
        r0.write(r11, r3, r10);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00b8, zzcy | IOException | NoSuchAlgorithmException -> 0x00b8, zzcy | IOException | NoSuchAlgorithmException -> 0x00b8, all -> 0x00b5 }
        r5.close();	 Catch:{ IOException -> 0x00b1 }
    L_0x00b1:
        r0.close();	 Catch:{ IOException -> 0x00b4 }
    L_0x00b4:
        return r4;
    L_0x00b5:
        r11 = move-exception;
        r10 = r0;
        goto L_0x00c5;
    L_0x00b8:
        r10 = r0;
        goto L_0x00d1;
    L_0x00ba:
        zzb(r0);	 Catch:{ zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, zzcy | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
        r5.close();	 Catch:{ IOException -> 0x00c0 }
    L_0x00c0:
        return r3;
    L_0x00c1:
        r11 = move-exception;
        goto L_0x00c5;
    L_0x00c3:
        r11 = move-exception;
        r5 = r10;
    L_0x00c5:
        if (r5 == 0) goto L_0x00ca;
    L_0x00c7:
        r5.close();	 Catch:{ IOException -> 0x00ca }
    L_0x00ca:
        if (r10 == 0) goto L_0x00cf;
    L_0x00cc:
        r10.close();	 Catch:{ IOException -> 0x00cf }
    L_0x00cf:
        throw r11;
    L_0x00d0:
        r5 = r10;
    L_0x00d1:
        if (r5 == 0) goto L_0x00d6;
    L_0x00d3:
        r5.close();	 Catch:{ IOException -> 0x00d6 }
    L_0x00d6:
        if (r10 == 0) goto L_0x00db;
    L_0x00d8:
        r10.close();	 Catch:{ IOException -> 0x00db }
    L_0x00db:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdm.zzb(java.io.File, java.lang.String):boolean");
    }

    private static void zzm(String str) {
        zzb(new File(str));
    }

    public final Context getContext() {
        return this.zzaiq;
    }

    public final ExecutorService getExecutorService() {
        return this.zzair;
    }

    public final boolean isInitialized() {
        return this.zzaje;
    }

    public final Method zza(String str, String str2) {
        zzes zzes = (zzes) this.zzajd.get(new Pair(str, str2));
        return zzes == null ? null : zzes.zzbb();
    }

    /* Access modifiers changed, original: final */
    public final void zza(int i, boolean z) {
        if (this.zzajc) {
            Future submit = this.zzair.submit(new zzdo(this, i, z));
            if (i == 0) {
                this.zzaiz = submit;
            }
        }
    }

    public final boolean zza(String str, String str2, Class<?>... clsArr) {
        if (this.zzajd.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzajd.put(new Pair(str, str2), new zzes(this, str, str2, clsArr));
        return true;
    }

    public final int zzab() {
        return this.zzaja != null ? zzcp.zzab() : Integer.MIN_VALUE;
    }

    public final DexClassLoader zzaf() {
        return this.zzais;
    }

    public final zzcx zzag() {
        return this.zzait;
    }

    public final byte[] zzah() {
        return this.zzaiu;
    }

    public final boolean zzai() {
        return this.zzajb;
    }

    public final zzcp zzaj() {
        return this.zzaja;
    }

    public final boolean zzal() {
        return this.zzajf;
    }

    public final zzba zzam() {
        return this.zzaiy;
    }

    public final Future zzan() {
        return this.zzaiz;
    }

    public final AdvertisingIdClient zzaq() {
        if (!this.zzahq) {
            return null;
        }
        if (this.zzaiv != null) {
            return this.zzaiv;
        }
        Future future = this.zzaiw;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.zzaiw = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.zzaiw.cancel(true);
            }
        }
        return this.zzaiv;
    }

    /* Access modifiers changed, original: final */
    public final zzba zzb(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep((long) (i * MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL));
            } catch (InterruptedException unused) {
            }
        }
        return zzap();
    }
}
