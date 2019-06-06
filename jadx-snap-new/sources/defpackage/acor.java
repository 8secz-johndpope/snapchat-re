package defpackage;

/* renamed from: acor */
public final class acor extends acop {
    final boolean b;
    private final nkh c;

    public acor(nkh nkh, boolean z) {
        akcr.b(nkh, "fd");
        super(nkh, (byte) 0);
        this.c = nkh;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof acor) {
                acor acor = (acor) obj;
                if (akcr.a(this.c, acor.c)) {
                    if ((this.b == acor.b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        nkh nkh = this.c;
        int hashCode = (nkh != null ? nkh.hashCode() : 0) * 31;
        int i = this.b;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SecondRowBehaviorExplore(fd=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isStatusRead=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
