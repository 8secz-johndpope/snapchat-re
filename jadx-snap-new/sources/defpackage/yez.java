package defpackage;

/* renamed from: yez */
public final class yez {
    final String a;
    final long b;
    final long c;
    private final long d;

    public /* synthetic */ yez(String str, long j, long j2) {
        this(str, j, j2, -1);
    }

    public yez(String str, long j, long j2, long j3) {
        akcr.b(str, "key");
        this.a = str;
        this.d = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yez) {
                yez yez = (yez) obj;
                if (akcr.a(this.a, yez.a)) {
                    if ((this.d == yez.d ? 1 : null) != null) {
                        if ((this.b == yez.b ? 1 : null) != null) {
                            if ((this.c == yez.c ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.d;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.b;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.c;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReadRequest(key=");
        stringBuilder.append(this.a);
        stringBuilder.append(", pathId=");
        stringBuilder.append(this.d);
        stringBuilder.append(", readTime=");
        stringBuilder.append(this.b);
        stringBuilder.append(", newExpirationTime=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
