package defpackage;

/* renamed from: zsj */
public final class zsj {
    public final String a;
    public final int b;
    public final Throwable c;
    public final long d;
    public final aebf e;
    private final String f;

    public /* synthetic */ zsj(String str, int i, String str2, Throwable th, long j) {
        this(str, i, str2, th, j, null);
    }

    public zsj(String str, int i, String str2, Throwable th, long j, aebf aebf) {
        akcr.b(str, "url");
        this.a = str;
        this.b = i;
        this.f = str2;
        this.c = th;
        this.d = j;
        this.e = aebf;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zsj) {
                zsj zsj = (zsj) obj;
                if (akcr.a(this.a, zsj.a)) {
                    if ((this.b == zsj.b ? 1 : null) != null && akcr.a(this.f, zsj.f) && akcr.a(this.c, zsj.c)) {
                        if ((this.d == zsj.d ? 1 : null) == null || !akcr.a(this.e, zsj.e)) {
                            return false;
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
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
        String str2 = this.f;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Throwable th = this.c;
        hashCode = (hashCode + (th != null ? th.hashCode() : 0)) * 31;
        long j = this.d;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        aebf aebf = this.e;
        if (aebf != null) {
            i = aebf.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GTQNetworkResponse(url=");
        stringBuilder.append(this.a);
        stringBuilder.append(", code=");
        stringBuilder.append(this.b);
        stringBuilder.append(", message=");
        stringBuilder.append(this.f);
        stringBuilder.append(", exception=");
        stringBuilder.append(this.c);
        stringBuilder.append(", latencyMs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", gtqServeResponse=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
