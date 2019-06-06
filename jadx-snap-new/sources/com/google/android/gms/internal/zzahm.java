package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.snap.core.db.record.UploadedMediaModel;

@zzabh
public final class zzahm {
    private final Object mLock = new Object();
    private String mSessionId;
    private long zzdec = -1;
    private long zzded = -1;
    private int zzdee = -1;
    int zzdef = -1;
    private long zzdeg = 0;
    private int zzdeh = 0;
    private int zzdei = 0;

    public zzahm(String str) {
        this.mSessionId = str;
    }

    private static boolean zzae(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        String str = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
        if (identifier == 0) {
            zzaky.zzcy(str);
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            zzaky.zzcy(str);
            return false;
        } catch (NameNotFoundException unused) {
            zzaky.zzcz("Fail to fetch AdActivity theme");
            zzaky.zzcy(str);
            return false;
        }
    }

    /* JADX WARNING: Missing block: B:23:0x008f, code skipped:
            return;
     */
    public final void zzb(com.google.android.gms.internal.zzkk r11, long r12) {
        /*
        r10 = this;
        r0 = r10.mLock;
        monitor-enter(r0);
        r1 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ all -> 0x0090 }
        r1 = r1.zzqe();	 Catch:{ all -> 0x0090 }
        r1 = r1.zzqw();	 Catch:{ all -> 0x0090 }
        r3 = com.google.android.gms.ads.internal.zzbt.zzes();	 Catch:{ all -> 0x0090 }
        r3 = r3.currentTimeMillis();	 Catch:{ all -> 0x0090 }
        r5 = r10.zzded;	 Catch:{ all -> 0x0090 }
        r7 = -1;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 != 0) goto L_0x004b;
    L_0x001f:
        r1 = r3 - r1;
        r5 = com.google.android.gms.internal.zzoi.zzbpc;	 Catch:{ all -> 0x0090 }
        r6 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0090 }
        r5 = r6.zzd(r5);	 Catch:{ all -> 0x0090 }
        r5 = (java.lang.Long) r5;	 Catch:{ all -> 0x0090 }
        r5 = r5.longValue();	 Catch:{ all -> 0x0090 }
        r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x0039;
    L_0x0035:
        r1 = -1;
        r10.zzdef = r1;	 Catch:{ all -> 0x0090 }
        goto L_0x0047;
    L_0x0039:
        r1 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ all -> 0x0090 }
        r1 = r1.zzqe();	 Catch:{ all -> 0x0090 }
        r1 = r1.zzqx();	 Catch:{ all -> 0x0090 }
        r10.zzdef = r1;	 Catch:{ all -> 0x0090 }
    L_0x0047:
        r10.zzded = r12;	 Catch:{ all -> 0x0090 }
        r12 = r10.zzded;	 Catch:{ all -> 0x0090 }
    L_0x004b:
        r10.zzdec = r12;	 Catch:{ all -> 0x0090 }
        r12 = 1;
        if (r11 == 0) goto L_0x0061;
    L_0x0050:
        r13 = r11.extras;	 Catch:{ all -> 0x0090 }
        if (r13 == 0) goto L_0x0061;
    L_0x0054:
        r11 = r11.extras;	 Catch:{ all -> 0x0090 }
        r13 = "gw";
        r1 = 2;
        r11 = r11.getInt(r13, r1);	 Catch:{ all -> 0x0090 }
        if (r11 != r12) goto L_0x0061;
    L_0x005f:
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;
    L_0x0061:
        r11 = r10.zzdee;	 Catch:{ all -> 0x0090 }
        r11 = r11 + r12;
        r10.zzdee = r11;	 Catch:{ all -> 0x0090 }
        r11 = r10.zzdef;	 Catch:{ all -> 0x0090 }
        r11 = r11 + r12;
        r10.zzdef = r11;	 Catch:{ all -> 0x0090 }
        r11 = r10.zzdef;	 Catch:{ all -> 0x0090 }
        if (r11 != 0) goto L_0x007f;
    L_0x006f:
        r11 = 0;
        r10.zzdeg = r11;	 Catch:{ all -> 0x0090 }
        r11 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ all -> 0x0090 }
        r11 = r11.zzqe();	 Catch:{ all -> 0x0090 }
        r11.zzk(r3);	 Catch:{ all -> 0x0090 }
        goto L_0x008e;
    L_0x007f:
        r11 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ all -> 0x0090 }
        r11 = r11.zzqe();	 Catch:{ all -> 0x0090 }
        r11 = r11.zzqy();	 Catch:{ all -> 0x0090 }
        r3 = r3 - r11;
        r10.zzdeg = r3;	 Catch:{ all -> 0x0090 }
    L_0x008e:
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;
    L_0x0090:
        r11 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzahm.zzb(com.google.android.gms.internal.zzkk, long):void");
    }

    public final Bundle zzk(Context context, String str) {
        Bundle bundle;
        synchronized (this.mLock) {
            bundle = new Bundle();
            bundle.putString(UploadedMediaModel.SESSION_ID, this.mSessionId);
            bundle.putLong("basets", this.zzded);
            bundle.putLong("currts", this.zzdec);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzdee);
            bundle.putInt("preqs_in_session", this.zzdef);
            bundle.putLong("time_in_session", this.zzdeg);
            bundle.putInt("pclick", this.zzdeh);
            bundle.putInt("pimp", this.zzdei);
            bundle.putBoolean("support_transparent_background", zzae(context));
        }
        return bundle;
    }

    public final void zzpk() {
        synchronized (this.mLock) {
            this.zzdei++;
        }
    }

    public final void zzpl() {
        synchronized (this.mLock) {
            this.zzdeh++;
        }
    }
}
