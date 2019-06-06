package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.InputStream;

/* renamed from: amk */
public class amk implements aiq<InputStream, Bitmap> {
    private final alz a;
    private ajr b;
    private aim c;
    private String d;

    public amk(ajr ajr, aim aim) {
        this(alz.a, ajr, aim);
    }

    public amk(alz alz, ajr ajr, aim aim) {
        this.a = alz;
        this.b = ajr;
        this.c = aim;
    }

    public amk(Context context, aim aim) {
        this(ahx.a(context).d, aim);
    }

    public ajn<Bitmap> a(InputStream inputStream, int i, int i2) {
        return alw.a(this.a.a(inputStream, this.b, i, i2, this.c), this.b);
    }

    public final String a() {
        if (this.d == null) {
            StringBuilder stringBuilder = new StringBuilder("StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap");
            stringBuilder.append(this.a.a());
            stringBuilder.append(this.c.name());
            this.d = stringBuilder.toString();
        }
        return this.d;
    }
}
