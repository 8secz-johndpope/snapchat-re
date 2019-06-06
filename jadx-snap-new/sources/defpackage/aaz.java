package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: aaz */
final class aaz implements zd {
    private static final ahi<Class<?>, byte[]> b = new ahi(50);
    private final abd c;
    private final zd d;
    private final zd e;
    private final int f;
    private final int g;
    private final Class<?> h;
    private final zf i;
    private final zi<?> j;

    aaz(abd abd, zd zdVar, zd zdVar2, int i, int i2, zi<?> ziVar, Class<?> cls, zf zfVar) {
        this.c = abd;
        this.d = zdVar;
        this.e = zdVar2;
        this.f = i;
        this.g = i2;
        this.j = ziVar;
        this.h = cls;
        this.i = zfVar;
    }

    public final void a(MessageDigest messageDigest) {
        Object obj = (byte[]) this.c.a(byte[].class);
        ByteBuffer.wrap(obj).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(obj);
        zi ziVar = this.j;
        if (ziVar != null) {
            ziVar.a(messageDigest);
        }
        this.i.a(messageDigest);
        byte[] bArr = (byte[]) b.b(this.h);
        if (bArr == null) {
            bArr = this.h.getName().getBytes(a);
            b.b(this.h, bArr);
        }
        messageDigest.update(bArr);
        this.c.a(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aaz) {
            aaz aaz = (aaz) obj;
            if (this.g == aaz.g && this.f == aaz.f && ahm.a(this.j, aaz.j) && this.h.equals(aaz.h) && this.d.equals(aaz.d) && this.e.equals(aaz.e) && this.i.equals(aaz.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g;
        zi ziVar = this.j;
        if (ziVar != null) {
            hashCode = (hashCode * 31) + ziVar.hashCode();
        }
        return (((hashCode * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ResourceCacheKey{sourceKey=");
        stringBuilder.append(this.d);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.e);
        stringBuilder.append(", width=");
        stringBuilder.append(this.f);
        stringBuilder.append(", height=");
        stringBuilder.append(this.g);
        stringBuilder.append(", decodedResourceClass=");
        stringBuilder.append(this.h);
        stringBuilder.append(", transformation='");
        stringBuilder.append(this.j);
        stringBuilder.append('\'');
        stringBuilder.append(", options=");
        stringBuilder.append(this.i);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
