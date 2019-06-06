package defpackage;

/* renamed from: gay */
public final class gay<T extends hwg<?>> {
    public final T a;
    final String b;
    final String c;
    public final int d;

    public gay(T t, String str, String str2, int i) {
        akcr.b(t, "job");
        akcr.b(str, "jobIdentifier");
        akcr.b(str2, "uuid");
        this.a = t;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gay) {
                gay gay = (gay) obj;
                if (akcr.a(this.a, gay.a) && akcr.a(this.b, gay.b) && akcr.a(this.c, gay.c)) {
                    if ((this.d == gay.d ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        hwg hwg = this.a;
        int i = 0;
        int hashCode = (hwg != null ? hwg.hashCode() : 0) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ActiveDurableJob(job=");
        stringBuilder.append(this.a);
        stringBuilder.append(", jobIdentifier=");
        stringBuilder.append(this.b);
        stringBuilder.append(", uuid=");
        stringBuilder.append(this.c);
        stringBuilder.append(", attempt=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
