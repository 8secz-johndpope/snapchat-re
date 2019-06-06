package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.media.Image;
import android.media.Image.Plane;
import android.media.ImageReader;
import defpackage.dvk.a;
import java.nio.ByteBuffer;

@TargetApi(19)
/* renamed from: dvu */
public final class dvu implements dvk {
    private final jwa a;
    private int b;
    private int c;
    private ImageReader d;
    private adie e;
    private dya f;
    private dxz g;
    private a h;

    public dvu(jwa jwa) {
        this.a = jwa;
    }

    public final adie a() {
        return this.e;
    }

    public final void a(int i, int i2, int i3, int i4, adie adie, dxz dxz, a aVar) {
        this.b = i;
        this.c = i2;
        this.e = adie;
        this.g = dxz;
        this.h = aVar;
        this.e.a((float) (-i4));
        this.d = ImageReader.newInstance(this.b, this.c, 1, 1);
    }

    public final void a(dvl dvl) {
        this.h.a(dvl);
    }

    public final dya b() {
        if (this.f == null) {
            this.f = this.g.a(this.d.getSurface());
        }
        return this.f;
    }

    public final void c() {
        this.f.g();
    }

    public final kaz<jwj> d() {
        try {
            Image acquireNextImage = this.d.acquireNextImage();
            if (acquireNextImage != null) {
                Plane plane = acquireNextImage.getPlanes()[0];
                ByteBuffer buffer = plane.getBuffer();
                int pixelStride = plane.getPixelStride();
                int rowStride = plane.getRowStride();
                int i = this.b;
                rowStride -= pixelStride * i;
                kaz a = this.a.a(i + (rowStride / pixelStride), this.c, Config.ARGB_8888, "ImageBitmapReader");
                ((jwj) a.a()).a().copyPixelsFromBuffer(buffer);
                if (rowStride <= 0) {
                    return a;
                }
                kaz a2 = this.a.a(((jwj) a.a()).a(), 0, 0, this.b, this.c, "ImageBitmapReader");
                a.dispose();
                return a2;
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    public final dvs.a e() {
        return dvs.a.IMAGE_READER;
    }

    public final void f() {
        this.f.d();
        this.d.close();
    }
}
