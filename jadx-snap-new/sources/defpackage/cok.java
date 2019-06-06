package defpackage;

/* renamed from: cok */
public final class cok {
    final long a;
    final int b;
    final int c;

    public cok(long j, int i, int i2) {
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cok) {
                cok cok = (cok) obj;
                if ((this.a == cok.a ? 1 : null) != null) {
                    if ((this.b == cok.b ? 1 : null) != null) {
                        if ((this.c == cok.c ? 1 : null) != null) {
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
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RetroRetryJobMetaData(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", maxNetworkRetriesPersistence=");
        stringBuilder.append(this.b);
        stringBuilder.append(", maxRetroRetries=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
