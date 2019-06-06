package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;

/* renamed from: amj */
public final class amj implements aof<InputStream, Bitmap> {
    private final amk a;
    private final alv b;
    private final akz c = new akz();
    private final amr<Bitmap> d;

    public amj(ajr ajr, aim aim) {
        this.a = new amk(ajr, aim);
        this.b = new alv();
        this.d = new amr(this.a);
    }

    public final aiq<File, Bitmap> a() {
        return this.d;
    }

    public final aiq<InputStream, Bitmap> b() {
        return this.a;
    }

    public final ain<InputStream> c() {
        return this.c;
    }

    public final air<Bitmap> d() {
        return this.b;
    }
}
