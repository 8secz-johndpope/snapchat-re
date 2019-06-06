package defpackage;

/* renamed from: adpu */
public final class adpu {
    public final long a;
    public final long b;
    private final Long c;

    public adpu() {
        this(0, 0, null, 7);
    }

    private adpu(long j, long j2, Long l) {
        this.a = j;
        this.b = j2;
        this.c = l;
    }

    public /* synthetic */ adpu(long j, long j2, Long l, int i) {
        long j3 = -1;
        long j4 = (i & 1) != 0 ? -1 : j;
        if ((i & 2) == 0) {
            j3 = j2;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        this(j4, j3, l);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof adpu) {
                adpu adpu = (adpu) obj;
                if ((this.a == adpu.a ? 1 : null) != null) {
                    if ((this.b == adpu.b ? 1 : null) == null || !akcr.a(this.c, adpu.c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l = this.c;
        return i + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapEntry(feedId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", messageId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", storySnapRowId=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
