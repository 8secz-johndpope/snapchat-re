package defpackage;

/* renamed from: mco */
final class mco {
    final boolean a;
    final boolean b;
    final boolean c;

    public mco(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mco) {
                mco mco = (mco) obj;
                if ((this.a == mco.a ? 1 : null) != null) {
                    if ((this.b == mco.b ? 1 : null) != null) {
                        if ((this.c == mco.c ? 1 : null) != null) {
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
        boolean z = this.c;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TipsCompletionStatus(isOnboardingTooltipEnabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isSwipeTipCompleted=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isSnapCaptureTipCompleted=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
