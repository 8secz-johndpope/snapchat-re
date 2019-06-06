package com.google.android.gms.internal;

import java.lang.Thread.UncaughtExceptionHandler;

final class zzabd implements UncaughtExceptionHandler {
    private /* synthetic */ zzabb zzcra;
    private /* synthetic */ UncaughtExceptionHandler zzcrb;

    zzabd(zzabb zzabb, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzcra = zzabb;
        this.zzcrb = uncaughtExceptionHandler;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000f */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:8:?, code skipped:
            com.google.android.gms.internal.zzaky.e("AdMob exception reporter failed reporting the exception.");
     */
    /* JADX WARNING: Missing block: B:10:0x001c, code skipped:
            r1 = r2.zzcrb;
     */
    /* JADX WARNING: Missing block: B:11:0x001e, code skipped:
            if (r1 != null) goto L_0x0020;
     */
    /* JADX WARNING: Missing block: B:12:0x0020, code skipped:
            r1.uncaughtException(r3, r4);
     */
    public final void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
        /*
        r2 = this;
        r0 = r2.zzcra;	 Catch:{ Throwable -> 0x000f }
        r0.zza(r3, r4);	 Catch:{ Throwable -> 0x000f }
        r0 = r2.zzcrb;
        if (r0 == 0) goto L_0x001b;
    L_0x0009:
        r0.uncaughtException(r3, r4);
        return;
    L_0x000d:
        r0 = move-exception;
        goto L_0x001c;
    L_0x000f:
        r0 = "AdMob exception reporter failed reporting the exception.";
        com.google.android.gms.internal.zzaky.e(r0);	 Catch:{ all -> 0x000d }
        r0 = r2.zzcrb;
        if (r0 == 0) goto L_0x001b;
    L_0x0018:
        r0.uncaughtException(r3, r4);
    L_0x001b:
        return;
    L_0x001c:
        r1 = r2.zzcrb;
        if (r1 == 0) goto L_0x0023;
    L_0x0020:
        r1.uncaughtException(r3, r4);
    L_0x0023:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzabd.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
