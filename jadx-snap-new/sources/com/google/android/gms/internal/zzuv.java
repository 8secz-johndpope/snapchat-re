package com.google.android.gms.internal;

@zzabh
final class zzuv {
    private static final zzus zzceu = zzus.zzln();
    private static final float zzcev = ((Float) zzlc.zzio().zzd(zzoi.zzbqd)).floatValue();
    private static final long zzcew = ((Long) zzlc.zzio().zzd(zzoi.zzbqb)).longValue();
    private static final float zzcex = ((Float) zzlc.zzio().zzd(zzoi.zzbqe)).floatValue();
    private static final long zzcey = ((Long) zzlc.zzio().zzd(zzoi.zzbqc)).longValue();

    private static int zzb(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    static boolean zzlx() {
        /*
        r0 = zzceu;
        r0 = r0.zzlu();
        r1 = zzceu;
        r1 = r1.zzlv();
        r2 = zzceu;
        r2 = r2.zzlt();
        r3 = zzceu;
        r3 = r3.zzls();
        r2 = r2 + r3;
        r3 = 1;
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r5 = 0;
        r7 = 0;
        r8 = 16;
        if (r0 >= r8) goto L_0x002f;
    L_0x0024:
        r9 = zzcey;
        r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r11 == 0) goto L_0x002f;
    L_0x002a:
        r9 = zzb(r9, r0);
        goto L_0x003d;
    L_0x002f:
        r9 = zzcex;
        r10 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r10 == 0) goto L_0x003a;
    L_0x0035:
        r10 = (float) r0;
        r9 = r9 * r10;
        r9 = (int) r9;
        r9 = r9 + r3;
        goto L_0x003d;
    L_0x003a:
        r9 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x003d:
        if (r1 > r9) goto L_0x0058;
    L_0x003f:
        if (r0 >= r8) goto L_0x004c;
    L_0x0041:
        r8 = zzcew;
        r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r1 == 0) goto L_0x004c;
    L_0x0047:
        r4 = zzb(r8, r0);
        goto L_0x0055;
    L_0x004c:
        r1 = zzcev;
        r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r5 == 0) goto L_0x0055;
    L_0x0052:
        r0 = (float) r0;
        r1 = r1 * r0;
        r4 = (int) r1;
    L_0x0055:
        if (r2 > r4) goto L_0x0058;
    L_0x0057:
        return r3;
    L_0x0058:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzuv.zzlx():boolean");
    }
}
