package defpackage;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;

/* renamed from: ama */
public final class ama implements aof<ParcelFileDescriptor, Bitmap> {
    private final aiq<File, Bitmap> a;
    private final amb b;
    private final alv c = new alv();
    private final ain<ParcelFileDescriptor> d = alq.a;

    public ama(ajr ajr, aim aim) {
        this.a = new amr(new amk(ajr, aim));
        this.b = new amb(ajr, aim);
    }

    public final aiq<File, Bitmap> a() {
        return this.a;
    }

    public final aiq<ParcelFileDescriptor, Bitmap> b() {
        return this.b;
    }

    public final ain<ParcelFileDescriptor> c() {
        return this.d;
    }

    public final air<Bitmap> d() {
        return this.c;
    }
}
