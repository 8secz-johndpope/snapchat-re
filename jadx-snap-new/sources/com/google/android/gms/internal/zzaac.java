package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.zzs;
import java.io.InputStream;

final class zzaac implements zzajx<zzpj> {
    private /* synthetic */ String zzclo;
    private /* synthetic */ zzzy zzcpf;
    private /* synthetic */ boolean zzcpp;
    private /* synthetic */ double zzcpq;
    private /* synthetic */ boolean zzcpr;

    zzaac(zzzy zzzy, boolean z, double d, boolean z2, String str) {
        this.zzcpf = zzzy;
        this.zzcpp = z;
        this.zzcpq = d;
        this.zzcpr = z2;
        this.zzclo = str;
    }

    @TargetApi(19)
    private final zzpj zzd(InputStream inputStream) {
        Bitmap decodeStream;
        Options options = new Options();
        options.inDensity = (int) (this.zzcpq * 160.0d);
        if (!this.zzcpr) {
            options.inPreferredConfig = Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Exception e) {
            zzaky.zzb("Error grabbing image.", e);
            decodeStream = null;
        }
        if (decodeStream == null) {
            this.zzcpf.zzd(2, this.zzcpp);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (zzs.zzanv() && zzahw.zzqk()) {
            int width = decodeStream.getWidth();
            int height = decodeStream.getHeight();
            int allocationByteCount = decodeStream.getAllocationByteCount();
            uptimeMillis2 -= uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder stringBuilder = new StringBuilder(108);
            stringBuilder.append("Decoded image w: ");
            stringBuilder.append(width);
            stringBuilder.append(" h:");
            stringBuilder.append(height);
            stringBuilder.append(" bytes: ");
            stringBuilder.append(allocationByteCount);
            stringBuilder.append(" time: ");
            stringBuilder.append(uptimeMillis2);
            stringBuilder.append(" on ui thread: ");
            stringBuilder.append(z);
            zzahw.v(stringBuilder.toString());
        }
        return new zzpj(new BitmapDrawable(Resources.getSystem(), decodeStream), Uri.parse(this.zzclo), this.zzcpq);
    }

    @TargetApi(19)
    public final /* synthetic */ Object zze(InputStream inputStream) {
        return zzd(inputStream);
    }

    public final /* synthetic */ Object zznx() {
        this.zzcpf.zzd(2, this.zzcpp);
        return null;
    }
}
