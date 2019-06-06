package defpackage;

/* renamed from: exa */
public final class exa {
    final long a;

    public exa(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof exa) {
                if ((this.a == ((exa) obj).a ? 1 : null) != null) {
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
        StringBuilder stringBuilder = new StringBuilder("RefreshConfigTtlsEvent(time=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
