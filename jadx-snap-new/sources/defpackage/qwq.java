package defpackage;

/* renamed from: qwq */
public final class qwq {
    public final long a;
    public final long b;
    public final iin c;
    public final Long d;
    public final Long e;
    public final Long f;
    private final long g;

    public qwq(long j, long j2, long j3, iin iin, Long l, Long l2, Long l3) {
        akcr.b(iin, "displayInteractionType");
        this.g = j;
        this.a = j2;
        this.b = j3;
        this.c = iin;
        this.d = l;
        this.e = l2;
        this.f = l3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qwq) {
                qwq qwq = (qwq) obj;
                if ((this.g == qwq.g ? 1 : null) != null) {
                    if ((this.a == qwq.a ? 1 : null) != null) {
                        if (!((this.b == qwq.b ? 1 : null) != null && akcr.a(this.c, qwq.c) && akcr.a(this.d, qwq.d) && akcr.a(this.e, qwq.e) && akcr.a(this.f, qwq.f))) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.g;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.a;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.b;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        iin iin = this.c;
        int i2 = 0;
        i = (i + (iin != null ? iin.hashCode() : 0)) * 31;
        Long l = this.d;
        i = (i + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        i = (i + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        if (l != null) {
            i2 = l.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisplayInfo(feedId=");
        stringBuilder.append(this.g);
        stringBuilder.append(", displayTimestamp=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sortingTimestamp=");
        stringBuilder.append(this.b);
        stringBuilder.append(", displayInteractionType=");
        stringBuilder.append(this.c);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.d);
        stringBuilder.append(", lastInteractionUserId=");
        stringBuilder.append(this.e);
        stringBuilder.append(", lastInteractionWriterId=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
