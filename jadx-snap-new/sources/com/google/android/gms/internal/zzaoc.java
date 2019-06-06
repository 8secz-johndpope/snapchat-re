package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

@zzabh
public final class zzaoc implements zzt<zzann> {
    private zzany zzdow;

    private static Integer zze(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Map map2;
        try {
            map2 = Integer.valueOf(Integer.parseInt((String) map2.get(str)));
            return map2;
        } catch (NumberFormatException unused) {
            String str2 = (String) map2.get(str);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 39) + String.valueOf(str2).length());
            stringBuilder.append("Precache invalid numeric parameter '");
            stringBuilder.append(str);
            stringBuilder.append("': ");
            stringBuilder.append(str2);
            zzaky.zzcz(stringBuilder.toString());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f8  */
    public final /* synthetic */ void zza(java.lang.Object r12, java.util.Map r13) {
        /*
        r11 = this;
        r12 = (com.google.android.gms.internal.zzann) r12;
        com.google.android.gms.ads.internal.zzbt.zzff();
        r0 = "abort";
        r0 = r13.containsKey(r0);
        if (r0 == 0) goto L_0x0021;
    L_0x000d:
        r13 = r11.zzdow;
        if (r13 == 0) goto L_0x0015;
    L_0x0011:
        r13.abort();
        return;
    L_0x0015:
        r12 = com.google.android.gms.internal.zzanx.zzb(r12);
        if (r12 != 0) goto L_0x0020;
    L_0x001b:
        r12 = "Precache abort but no precache task running.";
        com.google.android.gms.internal.zzaky.zzcz(r12);
    L_0x0020:
        return;
    L_0x0021:
        r0 = "src";
        r0 = r13.get(r0);
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x00c1;
    L_0x002b:
        r1 = r11.zzdow;
        if (r1 == 0) goto L_0x0035;
    L_0x002f:
        r12 = "Threadless precache task has already started.";
    L_0x0031:
        com.google.android.gms.internal.zzaky.zzcz(r12);
        return;
    L_0x0035:
        r1 = com.google.android.gms.internal.zzanx.zzc(r12);
        if (r1 == 0) goto L_0x003e;
    L_0x003b:
        r12 = "Precache task is already running.";
        goto L_0x0031;
    L_0x003e:
        r1 = r12.zzbo();
        if (r1 != 0) goto L_0x0047;
    L_0x0044:
        r12 = "Precache requires a dependency provider.";
        goto L_0x0031;
    L_0x0047:
        r1 = new com.google.android.gms.internal.zzanm;
        r2 = "flags";
        r2 = r13.get(r2);
        r2 = (java.lang.String) r2;
        r1.<init>(r2);
        r2 = "notifyBytes";
        r2 = zze(r13, r2);
        r3 = "notifyMillis";
        r3 = zze(r13, r3);
        r4 = "player";
        r4 = zze(r13, r4);
        r5 = 0;
        if (r4 != 0) goto L_0x006d;
    L_0x0069:
        r4 = java.lang.Integer.valueOf(r5);
    L_0x006d:
        r4 = r4.intValue();
        r6 = r12.zzbo();
        r6 = r6.zzaok;
        r7 = 0;
        r4 = r6.zza(r12, r4, r7, r1);
        r6 = 1;
        if (r2 != 0) goto L_0x0084;
    L_0x007f:
        if (r3 == 0) goto L_0x0082;
    L_0x0081:
        goto L_0x0084;
    L_0x0082:
        r7 = 0;
        goto L_0x0085;
    L_0x0084:
        r7 = 1;
    L_0x0085:
        if (r7 == 0) goto L_0x00b8;
    L_0x0087:
        r1 = r1.zzdnm;
        r7 = ",";
        r1 = r1.split(r7);
        r7 = r1.length;
        r8 = 0;
    L_0x0091:
        if (r8 >= r7) goto L_0x00aa;
    L_0x0093:
        r9 = r1[r8];
        r10 = "1";
        r10 = r9.equals(r10);
        if (r10 != 0) goto L_0x00a7;
    L_0x009d:
        r10 = "2";
        r9 = r9.equals(r10);
        if (r9 != 0) goto L_0x00a7;
    L_0x00a5:
        r5 = 1;
        goto L_0x00aa;
    L_0x00a7:
        r8 = r8 + 1;
        goto L_0x0091;
    L_0x00aa:
        if (r5 == 0) goto L_0x00b8;
    L_0x00ac:
        if (r2 == 0) goto L_0x00b2;
    L_0x00ae:
        r2.intValue();
        goto L_0x00b5;
    L_0x00b2:
        r3.intValue();
    L_0x00b5:
        r11.zzdow = r4;
        goto L_0x00cf;
    L_0x00b8:
        r1 = new com.google.android.gms.internal.zzanv;
        r1.<init>(r12, r4, r0);
        r1.zzns();
        goto L_0x00cf;
    L_0x00c1:
        r12 = com.google.android.gms.internal.zzanx.zzc(r12);
        if (r12 != 0) goto L_0x00cf;
    L_0x00c7:
        r12 = r11.zzdow;
        if (r12 != 0) goto L_0x00cf;
    L_0x00cb:
        r12 = "Precache must specify a source.";
        goto L_0x0031;
    L_0x00cf:
        r12 = "minBufferMs";
        r12 = zze(r13, r12);
        if (r12 == 0) goto L_0x00da;
    L_0x00d7:
        r12.intValue();
    L_0x00da:
        r12 = "maxBufferMs";
        r12 = zze(r13, r12);
        if (r12 == 0) goto L_0x00e5;
    L_0x00e2:
        r12.intValue();
    L_0x00e5:
        r12 = "bufferForPlaybackMs";
        r12 = zze(r13, r12);
        if (r12 == 0) goto L_0x00f0;
    L_0x00ed:
        r12.intValue();
    L_0x00f0:
        r12 = "bufferForPlaybackAfterRebufferMs";
        r12 = zze(r13, r12);
        if (r12 == 0) goto L_0x00fb;
    L_0x00f8:
        r12.intValue();
    L_0x00fb:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaoc.zza(java.lang.Object, java.util.Map):void");
    }
}
