package defpackage;

/* renamed from: qwm */
public final class qwm {
    public final iin a;
    public final long b;
    public final Long c;
    public final Long d;

    public qwm(iin iin, long j, Long l, Long l2) {
        akcr.b(iin, "type");
        this.a = iin;
        this.b = j;
        this.c = l;
        this.d = l2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qwm) {
                qwm qwm = (qwm) obj;
                if (akcr.a(this.a, qwm.a)) {
                    if (!((this.b == qwm.b ? 1 : null) != null && akcr.a(this.c, qwm.c) && akcr.a(this.d, qwm.d))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        iin iin = this.a;
        int i = 0;
        int hashCode = (iin != null ? iin.hashCode() : 0) * 31;
        long j = this.b;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("InteractionInfo(type=");
        stringBuilder.append(this.a);
        stringBuilder.append(", interactionTimestamp=");
        stringBuilder.append(this.b);
        stringBuilder.append(", interactorId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
