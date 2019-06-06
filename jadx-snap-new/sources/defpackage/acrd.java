package defpackage;

/* renamed from: acrd */
public final class acrd {
    public final boolean a;
    public final boolean b;
    public final Exception c;
    private boolean d;

    public acrd(boolean z, boolean z2, boolean z3, Exception exception) {
        this.d = z;
        this.a = z2;
        this.b = z3;
        this.c = exception;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof acrd) {
                acrd acrd = (acrd) obj;
                if ((this.d == acrd.d ? 1 : null) != null) {
                    if ((this.a == acrd.a ? 1 : null) != null) {
                        if ((this.b == acrd.b ? 1 : null) == null || !akcr.a(this.c, acrd.c)) {
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
        int i = this.d;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.a;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.b;
        if (!z) {
            i2 = z;
        }
        i = (i + i2) * 31;
        Exception exception = this.c;
        return i + (exception != null ? exception.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendClusterNetworkResult(wasSuccessful=");
        stringBuilder.append(this.d);
        stringBuilder.append(", hadNetworkError=");
        stringBuilder.append(this.a);
        stringBuilder.append(", hadHttpError=");
        stringBuilder.append(this.b);
        stringBuilder.append(", error=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
