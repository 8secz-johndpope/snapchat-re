package defpackage;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import defpackage.aib.b;
import java.io.InputStream;

/* renamed from: ahs */
public final class ahs<ModelType> extends ahr<ModelType> {
    public final akw<ModelType, InputStream> a;
    public final b b;
    private final akw<ModelType, ParcelFileDescriptor> e;

    ahs(Class<ModelType> cls, akw<ModelType, InputStream> akw, akw<ModelType, ParcelFileDescriptor> akw2, Context context, ahx ahx, aob aob, anv anv, b bVar) {
        aoj aoj;
        akw<ModelType, InputStream> akw3 = akw;
        akw<ModelType, ParcelFileDescriptor> akw4 = akw2;
        ahx ahx2 = ahx;
        Class cls2 = and.class;
        Class cls3 = amo.class;
        if (akw3 == null && akw4 == null) {
            aoj = null;
        } else {
            aoj = new aoi(new akq(akw, akw2), ahx.a(cls2, cls3), ahx.b(akr.class, cls2));
        }
        super(context, cls, aoj, ahx, aob, anv);
        this.a = akw3;
        this.e = akw4;
        this.b = bVar;
    }

    public final ahq<ModelType> a() {
        return new ahq(this, this.a, this.e, this.b);
    }
}
