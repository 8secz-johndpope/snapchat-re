package defpackage;

/* renamed from: iyc */
public final class iyc {
    final long a;

    public iyc(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iyc) {
                if ((this.a == ((iyc) obj).a ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UpdateSeenAddedMeData(timestamp=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
