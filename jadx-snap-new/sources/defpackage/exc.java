package defpackage;

/* renamed from: exc */
public final class exc {
    public final ewz a;
    public final ilz b;
    public final long c;

    public exc(ewz ewz, ilz ilz, long j) {
        akcr.b(ewz, "type");
        akcr.b(ilz, "metricWithDimensions");
        this.a = ewz;
        this.b = ilz;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof exc) {
                exc exc = (exc) obj;
                if (akcr.a(this.a, exc.a) && akcr.a(this.b, exc.b)) {
                    if ((this.c == exc.c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ewz ewz = this.a;
        int i = 0;
        int hashCode = (ewz != null ? ewz.hashCode() : 0) * 31;
        ilz ilz = this.b;
        if (ilz != null) {
            i = ilz.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j = this.c;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WriteGrapheneMetricEvent(type=");
        stringBuilder.append(this.a);
        stringBuilder.append(", metricWithDimensions=");
        stringBuilder.append(this.b);
        stringBuilder.append(", magnitude=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
