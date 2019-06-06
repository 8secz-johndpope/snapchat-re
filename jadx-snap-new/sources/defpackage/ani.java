package defpackage;

import android.graphics.Bitmap;

/* renamed from: ani */
public final class ani implements ais<and> {
    private final ais<Bitmap> a;
    private final ais<amu> b;

    private ani(ais<Bitmap> ais, ais<amu> ais2) {
        this.a = ais;
        this.b = ais2;
    }

    public ani(ajr ajr, ais<Bitmap> ais) {
        this((ais) ais, new amx(ais, ajr));
    }

    public final ajn<and> a(ajn<and> ajn, int i, int i2) {
        ajn a;
        ajn ajn2 = ((and) ajn.a()).b;
        ajn ajn3 = ((and) ajn.a()).a;
        if (ajn2 != null) {
            ais ais = this.a;
            if (ais != null) {
                a = ais.a(ajn2, i, i2);
                if (!ajn2.equals(a)) {
                    return new ane(new and(a, ((and) ajn.a()).a));
                }
                return ajn;
            }
        }
        if (ajn3 != null) {
            ais ais2 = this.b;
            if (ais2 != null) {
                a = ais2.a(ajn3, i, i2);
                if (!ajn3.equals(a)) {
                    ajn = new ane(new and(((and) ajn.a()).b, a));
                }
            }
        }
        return ajn;
    }

    public final String a() {
        return this.a.a();
    }
}
