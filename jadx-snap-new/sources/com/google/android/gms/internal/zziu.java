package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.internal.zziw.zza.zzb;
import defpackage.ppy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzabh
public final class zziu {
    private final zziz zzbbh;
    private final zzjk zzbbi;
    private final boolean zzbbj;

    private zziu() {
        this.zzbbj = false;
        this.zzbbh = new zziz();
        this.zzbbi = new zzjk();
        zzhq();
    }

    public zziu(zziz zziz) {
        this.zzbbh = zziz;
        this.zzbbj = ((Boolean) zzlc.zzio().zzd(zzoi.zzbvc)).booleanValue();
        this.zzbbi = new zzjk();
        zzhq();
    }

    private final synchronized void zzb(zzb zzb) {
        this.zzbbi.zzben = zzhr();
        this.zzbbh.zzd(zzfls.zzc(this.zzbbi)).zzq(zzb.zzhu()).log();
        String str = "Logging Event with event code : ";
        String valueOf = String.valueOf(Integer.toString(zzb.zzhu(), 10));
        zzahw.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x003e */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:20|31|32|33|34|35) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|28|29|30) */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            com.google.android.gms.internal.zzahw.v("Could not close Clearcut output stream.");
     */
    /* JADX WARNING: Missing block: B:19:0x0031, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:22:?, code skipped:
            com.google.android.gms.internal.zzahw.v("Could not write Clearcut to file.");
     */
    /* JADX WARNING: Missing block: B:24:?, code skipped:
            r0.close();
     */
    /* JADX WARNING: Missing block: B:26:0x003d, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            com.google.android.gms.internal.zzahw.v("Could not close Clearcut output stream.");
     */
    /* JADX WARNING: Missing block: B:30:0x0044, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            r0.close();
     */
    /* JADX WARNING: Missing block: B:34:?, code skipped:
            com.google.android.gms.internal.zzahw.v("Could not close Clearcut output stream.");
     */
    private final synchronized void zzc(com.google.android.gms.internal.zziw.zza.zzb r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ all -> 0x0056 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r3);
        return;
    L_0x0009:
        r1 = new java.io.File;	 Catch:{ all -> 0x0056 }
        r2 = "clearcut_events.txt";
        r1.<init>(r0, r2);	 Catch:{ all -> 0x0056 }
        r0 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x004f }
        r2 = 1;
        r0.<init>(r1, r2);	 Catch:{ FileNotFoundException -> 0x004f }
        r4 = r3.zzd(r4);	 Catch:{ IOException -> 0x0034 }
        r4 = r4.getBytes();	 Catch:{ IOException -> 0x0034 }
        r0.write(r4);	 Catch:{ IOException -> 0x0034 }
        r4 = 10;
        r0.write(r4);	 Catch:{ IOException -> 0x0034 }
        r0.close();	 Catch:{ IOException -> 0x002b }
        monitor-exit(r3);
        return;
    L_0x002b:
        r4 = "Could not close Clearcut output stream.";
        com.google.android.gms.internal.zzahw.v(r4);	 Catch:{ FileNotFoundException -> 0x004f }
        monitor-exit(r3);
        return;
    L_0x0032:
        r4 = move-exception;
        goto L_0x0045;
    L_0x0034:
        r4 = "Could not write Clearcut to file.";
        com.google.android.gms.internal.zzahw.v(r4);	 Catch:{ all -> 0x0032 }
        r0.close();	 Catch:{ IOException -> 0x003e }
        monitor-exit(r3);
        return;
    L_0x003e:
        r4 = "Could not close Clearcut output stream.";
        com.google.android.gms.internal.zzahw.v(r4);	 Catch:{ FileNotFoundException -> 0x004f }
        monitor-exit(r3);
        return;
    L_0x0045:
        r0.close();	 Catch:{ IOException -> 0x0049 }
        goto L_0x004e;
    L_0x0049:
        r0 = "Could not close Clearcut output stream.";
        com.google.android.gms.internal.zzahw.v(r0);	 Catch:{ FileNotFoundException -> 0x004f }
    L_0x004e:
        throw r4;	 Catch:{ FileNotFoundException -> 0x004f }
    L_0x004f:
        r4 = "Could not find file for Clearcut";
        com.google.android.gms.internal.zzahw.v(r4);	 Catch:{ all -> 0x0056 }
        monitor-exit(r3);
        return;
    L_0x0056:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zziu.zzc(com.google.android.gms.internal.zziw$zza$zzb):void");
    }

    private final synchronized String zzd(zzb zzb) {
        return String.format("id=%s,timestamp=%s,event=%s", new Object[]{this.zzbbi.zzbej, Long.valueOf(zzbt.zzes().elapsedRealtime()), Integer.valueOf(zzb.zzhu())});
    }

    public static zziu zzhp() {
        return new zziu();
    }

    private final synchronized void zzhq() {
        this.zzbbi.zzber = new zzjd();
        this.zzbbi.zzber.zzbcy = new zzjg();
        this.zzbbi.zzbeo = new zzji();
    }

    private static long[] zzhr() {
        int i;
        int length;
        List zzjg = zzoi.zzjg();
        ArrayList arrayList = new ArrayList();
        Iterator it = zzjg.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = ((String) it.next()).split(ppy.b);
            length = split.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(split[i]));
                } catch (NumberFormatException unused) {
                    zzahw.v("Experiment ID is not a number");
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        arrayList = arrayList;
        int size = arrayList.size();
        length = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jArr[length] = ((Long) obj).longValue();
            length++;
        }
        return jArr;
    }

    public final synchronized void zza(zziv zziv) {
        if (this.zzbbj) {
            try {
                zziv.zza(this.zzbbi);
            } catch (NullPointerException e) {
                zzbt.zzep().zza(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zza(zzb zzb) {
        if (this.zzbbj) {
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbvd)).booleanValue()) {
                zzc(zzb);
            } else {
                zzb(zzb);
            }
        }
    }
}
