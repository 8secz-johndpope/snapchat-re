package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* renamed from: aap */
final class aap implements zd {
    private final Object b;
    private final int c;
    private final int d;
    private final Class<?> e;
    private final Class<?> f;
    private final zd g;
    private final Map<Class<?>, zi<?>> h;
    private final zf i;
    private int j;

    aap(Object obj, zd zdVar, int i, int i2, Map<Class<?>, zi<?>> map, Class<?> cls, Class<?> cls2, zf zfVar) {
        String str = "Argument must not be null";
        this.b = ahl.a(obj, str);
        this.g = (zd) ahl.a((Object) zdVar, "Signature must not be null");
        this.c = i;
        this.d = i2;
        this.h = (Map) ahl.a((Object) map, str);
        this.e = (Class) ahl.a((Object) cls, "Resource class must not be null");
        this.f = (Class) ahl.a((Object) cls2, "Transcode class must not be null");
        this.i = (zf) ahl.a((Object) zfVar, str);
    }

    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aap) {
            aap aap = (aap) obj;
            if (this.b.equals(aap.b) && this.g.equals(aap.g) && this.d == aap.d && this.c == aap.c && this.h.equals(aap.h) && this.e.equals(aap.e) && this.f.equals(aap.f) && this.i.equals(aap.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.j == 0) {
            this.j = this.b.hashCode();
            this.j = (this.j * 31) + this.g.hashCode();
            this.j = (this.j * 31) + this.c;
            this.j = (this.j * 31) + this.d;
            this.j = (this.j * 31) + this.h.hashCode();
            this.j = (this.j * 31) + this.e.hashCode();
            this.j = (this.j * 31) + this.f.hashCode();
            this.j = (this.j * 31) + this.i.hashCode();
        }
        return this.j;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("EngineKey{model=");
        stringBuilder.append(this.b);
        stringBuilder.append(", width=");
        stringBuilder.append(this.c);
        stringBuilder.append(", height=");
        stringBuilder.append(this.d);
        stringBuilder.append(", resourceClass=");
        stringBuilder.append(this.e);
        stringBuilder.append(", transcodeClass=");
        stringBuilder.append(this.f);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.g);
        stringBuilder.append(", hashCode=");
        stringBuilder.append(this.j);
        stringBuilder.append(", transformations=");
        stringBuilder.append(this.h);
        stringBuilder.append(", options=");
        stringBuilder.append(this.i);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
