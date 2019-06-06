package defpackage;

import com.mapbox.mapboxsdk.style.sources.RasterSource;

/* renamed from: akmf */
public class akmf {
    private static volatile akmg a = akmg.a;
    public final StringBuffer b;
    final Object c;
    public final akmg d;

    public akmf(Object obj) {
        this(obj, null);
    }

    public akmf(Object obj, akmg akmg) {
        if (akmg == null) {
            akmg = a;
        }
        StringBuffer stringBuffer = new StringBuffer(RasterSource.DEFAULT_TILE_SIZE);
        this.b = stringBuffer;
        this.d = akmg;
        this.c = obj;
        if (obj != null) {
            if (akmg.d && obj != null) {
                akmg.a(obj);
                stringBuffer.append(akmg.e ? akls.a(obj.getClass()) : obj.getClass().getName());
            }
            if (akmg.f && obj != null) {
                akmg.a(obj);
                stringBuffer.append('@');
                stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            }
            stringBuffer.append(akmg.g);
            if (akmg.i) {
                akmg.b(stringBuffer);
            }
        }
    }

    public final akmf a(String str, Object obj) {
        this.d.a(this.b, str, obj);
        return this;
    }

    public final akmf a(String str, boolean z) {
        this.d.a(this.b, str, z);
        return this;
    }

    public String toString() {
        Object obj = this.c;
        if (obj == null) {
            this.b.append(this.d.o);
        } else {
            akmg akmg = this.d;
            StringBuffer stringBuffer = this.b;
            int length = stringBuffer.length();
            int length2 = akmg.j.length();
            if (length > 0 && length2 > 0 && length >= length2) {
                Object obj2 = null;
                for (int i = 0; i < length2; i++) {
                    if (stringBuffer.charAt((length - 1) - i) != akmg.j.charAt((length2 - 1) - i)) {
                        break;
                    }
                }
                obj2 = 1;
                if (obj2 != null) {
                    stringBuffer.setLength(length - length2);
                }
            }
            stringBuffer.append(akmg.h);
            akmg.b(obj);
        }
        return this.b.toString();
    }
}
