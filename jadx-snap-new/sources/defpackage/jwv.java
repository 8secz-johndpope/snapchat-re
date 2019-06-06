package defpackage;

/* renamed from: jwv */
public final class jwv {
    public final int a;
    public final int b;
    public final jwt c;
    public final long d;

    public jwv(int i, int i2, jwt jwt, long j) {
        akcr.b(jwt, "loadSource");
        this.a = i;
        this.b = i2;
        this.c = jwt;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jwv) {
                jwv jwv = (jwv) obj;
                if ((this.a == jwv.a ? 1 : null) != null) {
                    if ((this.b == jwv.b ? 1 : null) != null && akcr.a(this.c, jwv.c)) {
                        if ((this.d == jwv.d ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        jwt jwt = this.c;
        i = (i + (jwt != null ? jwt.hashCode() : 0)) * 31;
        long j = this.d;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Metrics(width=");
        stringBuilder.append(this.a);
        stringBuilder.append(", height=");
        stringBuilder.append(this.b);
        stringBuilder.append(", loadSource=");
        stringBuilder.append(this.c);
        stringBuilder.append(", totalLatency=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
