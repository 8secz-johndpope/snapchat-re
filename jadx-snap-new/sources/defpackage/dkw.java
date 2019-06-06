package defpackage;

/* renamed from: dkw */
public final class dkw {
    final boolean a;
    final int b;
    final long c;

    public dkw(boolean z, int i, long j) {
        this.a = z;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dkw) {
                dkw dkw = (dkw) obj;
                if ((this.a == dkw.a ? 1 : null) != null) {
                    if ((this.b == dkw.b ? 1 : null) != null) {
                        if ((this.c == dkw.c ? 1 : null) != null) {
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
        int i = this.a;
        if (i != 0) {
            i = 1;
        }
        i = ((i * 31) + this.b) * 31;
        long j = this.c;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BlizzardUploadContext(inBackground=");
        stringBuilder.append(this.a);
        stringBuilder.append(", numEventsInRequest=");
        stringBuilder.append(this.b);
        stringBuilder.append(", numEventsOnDisk=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
