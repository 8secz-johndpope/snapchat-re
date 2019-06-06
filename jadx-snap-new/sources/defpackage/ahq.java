package defpackage;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import defpackage.aib.b;
import java.io.InputStream;

/* renamed from: ahq */
public final class ahq<ModelType> extends ahp<ModelType, Bitmap> {
    private final akw<ModelType, InputStream> a;
    private final akw<ModelType, ParcelFileDescriptor> b;
    private final ahx e;
    private final b f;

    ahq(aht<ModelType, ?, ?, ?> aht, akw<ModelType, InputStream> akw, akw<ModelType, ParcelFileDescriptor> akw2, b bVar) {
        aoj aoj;
        ahx ahx = aht.c;
        Class cls = Bitmap.class;
        if (akw == null && akw2 == null) {
            aoj = null;
        } else {
            aoj = new aoi(new akq(akw, akw2), ahx.a(Bitmap.class, cls), ahx.b(akr.class, Bitmap.class));
        }
        super(aoj, Bitmap.class, aht);
        this.a = akw;
        this.b = akw2;
        this.e = aht.c;
        this.f = bVar;
    }
}
