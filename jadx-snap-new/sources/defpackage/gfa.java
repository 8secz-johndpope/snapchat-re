package defpackage;

/* renamed from: gfa */
public final class gfa {
    final long a;
    public final long b;

    private /* synthetic */ gfa() {
        this(-1, -1);
    }

    public gfa(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gfa) {
                gfa gfa = (gfa) obj;
                if ((this.a == gfa.a ? 1 : null) != null) {
                    if ((this.b == gfa.b ? 1 : null) != null) {
                        return true;
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
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ImportMetrics(totalLatencyMillis=");
        stringBuilder.append(this.a);
        stringBuilder.append(", payloadProcessingMillis=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
