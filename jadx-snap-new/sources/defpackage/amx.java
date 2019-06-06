package defpackage;

import android.graphics.Bitmap;

/* renamed from: amx */
public final class amx implements ais<amu> {
    private final ais<Bitmap> a;
    private final ajr b;

    public amx(ais<Bitmap> ais, ajr ajr) {
        this.a = ais;
        this.b = ajr;
    }

    public final ajn<amu> a(ajn<amu> ajn, int i, int i2) {
        amu amu = (amu) ajn.a();
        Bitmap bitmap = ((amu) ajn.a()).a.i;
        Bitmap bitmap2 = (Bitmap) this.a.a(new alw(bitmap, this.b), i, i2).a();
        return !bitmap2.equals(bitmap) ? new amw(new amu(amu, bitmap2, this.a)) : ajn;
    }

    public final String a() {
        return this.a.a();
    }
}
