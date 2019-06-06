package defpackage;

/* renamed from: gbd */
public final class gbd {
    public final gay<?> a;
    public final boolean b;
    public final boolean c;

    public gbd(gay<?> gay, boolean z, boolean z2) {
        akcr.b(gay, "job");
        this.a = gay;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gbd) {
                gbd gbd = (gbd) obj;
                if (akcr.a(this.a, gbd.a)) {
                    if ((this.b == gbd.b ? 1 : null) != null) {
                        if ((this.c == gbd.c ? 1 : null) != null) {
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
        gay gay = this.a;
        int hashCode = (gay != null ? gay.hashCode() : 0) * 31;
        int i = this.b;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.c;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DurableJobResult(job=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isSuccess=");
        stringBuilder.append(this.b);
        stringBuilder.append(", shouldRetry=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
