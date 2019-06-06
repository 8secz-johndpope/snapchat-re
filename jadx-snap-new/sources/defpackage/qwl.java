package defpackage;

/* renamed from: qwl */
public final class qwl {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public qwl() {
        this(false, 31);
    }

    public /* synthetic */ qwl(boolean z, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        this(false, false, z, false);
    }

    public qwl(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = false;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qwl) {
                qwl qwl = (qwl) obj;
                if ((this.a == qwl.a ? 1 : null) != null) {
                    if ((this.b == qwl.b ? 1 : null) != null) {
                        if ((this.c == qwl.c ? 1 : null) != null) {
                            if ((this.d == qwl.d ? 1 : null) != null) {
                                if ((this.e == qwl.e ? 1 : null) != null) {
                                    return true;
                                }
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
        int i = this.a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.b;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.c;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.d;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.e;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapStatus(isCountingDown=");
        stringBuilder.append(this.a);
        stringBuilder.append(", hasTimer=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isReplayable=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isReloaded=");
        stringBuilder.append(this.d);
        stringBuilder.append(", hasSound=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
