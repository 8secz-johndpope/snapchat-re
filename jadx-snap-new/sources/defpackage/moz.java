package defpackage;

import defpackage.mov.c;

/* renamed from: moz */
public final class moz {
    static {
        moz moz = new moz();
    }

    private moz() {
    }

    public static final c a(int i, float[] fArr, boolean z, boolean z2) {
        akcr.b(fArr, "textureTransform");
        Object obj = (mnf) mow.a.a();
        if (obj == null) {
            obj = new mnf();
        }
        akcr.a(obj, "POOL.acquire() ?: Mutabl…tureTransformationInput()");
        obj.a = i;
        obj.a(fArr);
        obj.b = z;
        obj.c = z2;
        return (c) obj;
    }
}
