package defpackage;

import defpackage.mov.a;
import defpackage.mov.b;

/* renamed from: mox */
public final class mox {
    static {
        mox mox = new mox();
    }

    private mox() {
    }

    public static final a a(int i, int i2, long j, float[] fArr, float[] fArr2, int i3, int i4, int i5, int i6, float f, float f2, int i7, boolean z, b bVar) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        b bVar2 = bVar;
        akcr.b(fArr, "textureTransform");
        akcr.b(fArr2, "viewTransform");
        akcr.b(bVar2, "processingMode");
        Object obj = (mne) moy.b.a();
        if (obj == null) {
            obj = new mne();
        }
        akcr.a(obj, "POOL.acquire() ?: MutableProcessInput()");
        obj.a = i;
        obj.b = i2;
        obj.c = j;
        obj.a(fArr);
        obj.b(fArr2);
        obj.d = i3;
        obj.e = i4;
        obj.f = i5;
        obj.g = i6;
        obj.h = f;
        obj.i = f2;
        obj.j = i7;
        obj.k = z;
        obj.a(bVar2);
        return (a) obj;
    }
}
