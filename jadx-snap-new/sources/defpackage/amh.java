package defpackage;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;

/* renamed from: amh */
public final class amh implements aof<akr, Bitmap> {
    private final amg a;
    private final aiq<File, Bitmap> b;
    private final air<Bitmap> c;
    private final aks d;

    public amh(aof<InputStream, Bitmap> aof, aof<ParcelFileDescriptor, Bitmap> aof2) {
        this.c = aof.d();
        this.d = new aks(aof.c(), aof2.c());
        this.b = aof.a();
        this.a = new amg(aof.b(), aof2.b());
    }

    public final aiq<File, Bitmap> a() {
        return this.b;
    }

    public final aiq<akr, Bitmap> b() {
        return this.a;
    }

    public final ain<akr> c() {
        return this.d;
    }

    public final air<Bitmap> d() {
        return this.c;
    }
}
