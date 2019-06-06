package defpackage;

/* renamed from: ppo */
public final class ppo {
    private final long a;
    private final long b;

    public ppo(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    private static long a(long j) {
        return (j / 1024) / 1024;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ppo) {
                ppo ppo = (ppo) obj;
                if ((this.a == ppo.a ? 1 : null) != null) {
                    if ((this.b == ppo.b ? 1 : null) != null) {
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
        StringBuilder stringBuilder = new StringBuilder("Memory: ");
        stringBuilder.append(ppo.a(this.a));
        stringBuilder.append("M/");
        stringBuilder.append(ppo.a(this.b));
        stringBuilder.append('M');
        return stringBuilder.toString();
    }
}
