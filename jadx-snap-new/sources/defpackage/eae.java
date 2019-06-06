package defpackage;

import com.google.common.base.MoreObjects;

/* renamed from: eae */
final class eae {
    public final a a;
    public final eca b;
    public final ebx c;
    public final edi d;
    public final boolean e;
    public final doc f;
    private idd g;

    /* renamed from: eae$a */
    enum a {
        OPEN,
        START,
        STOP,
        CLOSE
    }

    eae(a aVar, eca eca, ebx ebx, edi edi, doc doc, boolean z, idd idd) {
        this.a = aVar;
        this.b = eca;
        this.c = ebx;
        this.d = edi;
        this.f = doc;
        this.e = z;
        this.g = idd;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("operation", this.a).add("scCameraApi", this.b).add("cameraType", this.c).add("usageType", this.d).add("payload", this.f).add("callsite", this.g).toString();
    }
}
