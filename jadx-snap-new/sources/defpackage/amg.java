package defpackage;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: amg */
public final class amg implements aiq<akr, Bitmap> {
    private final aiq<InputStream, Bitmap> a;
    private final aiq<ParcelFileDescriptor, Bitmap> b;

    public amg(aiq<InputStream, Bitmap> aiq, aiq<ParcelFileDescriptor, Bitmap> aiq2) {
        this.a = aiq;
        this.b = aiq2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    private defpackage.ajn<android.graphics.Bitmap> a(defpackage.akr r4, int r5, int r6) {
        /*
        r3 = this;
        r0 = r4.a;
        if (r0 == 0) goto L_0x001a;
    L_0x0004:
        r1 = r3.a;	 Catch:{ IOException -> 0x000b }
        r0 = r1.a(r0, r5, r6);	 Catch:{ IOException -> 0x000b }
        goto L_0x001b;
    L_0x000b:
        r0 = move-exception;
        r1 = 2;
        r2 = "ImageVideoDecoder";
        r1 = android.util.Log.isLoggable(r2, r1);
        if (r1 == 0) goto L_0x001a;
    L_0x0015:
        r1 = "Failed to load image from stream, trying FileDescriptor";
        android.util.Log.v(r2, r1, r0);
    L_0x001a:
        r0 = 0;
    L_0x001b:
        if (r0 != 0) goto L_0x0027;
    L_0x001d:
        r4 = r4.b;
        if (r4 == 0) goto L_0x0027;
    L_0x0021:
        r0 = r3.b;
        r0 = r0.a(r4, r5, r6);
    L_0x0027:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amg.a(akr, int, int):ajn");
    }

    public final String a() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}
