package defpackage;

/* renamed from: qvq */
public final class qvq {
    final long a;
    final String b;
    public Long c;
    Long d;
    Long e;
    Long f;
    public Long g;

    public /* synthetic */ qvq(long j, String str, Long l, Long l2, int i) {
        this(j, str, (i & 4) != 0 ? null : l, null, null, null, (i & 64) != 0 ? null : l2);
    }

    public qvq(long j, String str, Long l, Long l2, Long l3, Long l4, Long l5) {
        akcr.b(str, "username");
        this.a = j;
        this.b = str;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = l5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qvq) {
                qvq qvq = (qvq) obj;
                if (!((this.a == qvq.a ? 1 : null) != null && akcr.a(this.b, qvq.b) && akcr.a(this.c, qvq.c) && akcr.a(this.d, qvq.d) && akcr.a(this.e, qvq.e) && akcr.a(this.f, qvq.f) && akcr.a(this.g, qvq.g))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.c;
        i = (i + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        i = (i + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        i = (i + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        i = (i + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        if (l != null) {
            i2 = l.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SequenceNumbers(feedId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", username=");
        stringBuilder.append(this.b);
        stringBuilder.append(", serverLatest=");
        stringBuilder.append(this.c);
        stringBuilder.append(", serverEarliest=");
        stringBuilder.append(this.d);
        stringBuilder.append(", processedLatest=");
        stringBuilder.append(this.e);
        stringBuilder.append(", processedEarliest=");
        stringBuilder.append(this.f);
        stringBuilder.append(", updateNumber=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
