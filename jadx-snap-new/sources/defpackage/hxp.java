package defpackage;

/* renamed from: hxp */
public final class hxp {
    public final Object a;
    public final boolean b;
    public final long c;

    public hxp(Object obj) {
        this(obj, true, 1);
    }

    public hxp(Object obj, boolean z, long j) {
        this.a = obj;
        this.b = z;
        this.c = j;
    }

    public final hxp a() {
        return new hxp(this.a, false, this.c);
    }

    public final hxp a(Object obj) {
        return new hxp(obj, true, this.c + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hxp) {
            hxp hxp = (hxp) obj;
            Object obj2 = this.a;
            return obj2 == null ? this.b == hxp.b && this.c == hxp.c && hxp.a == null : this.b == hxp.b && this.c == hxp.c && obj2.equals(hxp.a);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeatureConfigData(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ver=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sync=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
