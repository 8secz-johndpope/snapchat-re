package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

/* renamed from: amb */
public class amb implements aiq<ParcelFileDescriptor, Bitmap> {
    private final amm a;
    private final ajr b;
    private aim c;

    public amb(ajr ajr, aim aim) {
        this(new amm(), ajr, aim);
    }

    private amb(amm amm, ajr ajr, aim aim) {
        this.a = amm;
        this.b = ajr;
        this.c = aim;
    }

    public ajn<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
        amm amm = this.a;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        Bitmap frameAtTime = amm.a >= 0 ? mediaMetadataRetriever.getFrameAtTime((long) amm.a) : mediaMetadataRetriever.getFrameAtTime();
        mediaMetadataRetriever.release();
        parcelFileDescriptor.close();
        return alw.a(frameAtTime, this.b);
    }

    public final String a() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }
}
