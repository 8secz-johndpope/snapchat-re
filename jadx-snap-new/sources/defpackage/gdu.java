package defpackage;

/* renamed from: gdu */
public final class gdu {
    public final int a;
    public final long b;

    private /* synthetic */ gdu() {
        this(0, -1);
    }

    public gdu(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gdu) {
                gdu gdu = (gdu) obj;
                if ((this.a == gdu.a ? 1 : null) != null) {
                    if ((this.b == gdu.b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a * 31;
        long j = this.b;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AssetsMetrics(assetsNumber=");
        stringBuilder.append(this.a);
        stringBuilder.append(", totalBytes=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
