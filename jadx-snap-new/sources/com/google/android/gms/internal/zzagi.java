package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import defpackage.qan;
import java.io.ByteArrayOutputStream;

final class zzagi implements Runnable {
    private /* synthetic */ Bitmap val$bitmap;
    private /* synthetic */ zzagf zzdbk;

    zzagi(zzagf zzagf, Bitmap bitmap) {
        this.zzdbk = zzagf;
        this.val$bitmap = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.val$bitmap.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.zzdbk.mLock) {
            this.zzdbk.zzdba.zzpwl = new zzfmd();
            this.zzdbk.zzdba.zzpwl.zzpxg = byteArrayOutputStream.toByteArray();
            this.zzdbk.zzdba.zzpwl.mimeType = qan.b;
            this.zzdbk.zzdba.zzpwl.zzbdh = Integer.valueOf(1);
        }
    }
}
