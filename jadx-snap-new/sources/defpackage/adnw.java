package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: adnw */
public final class adnw {
    public final int a;
    public final int b;

    public adnw(int i, int i2) {
        boolean z = true;
        Preconditions.checkArgument(i >= 0, "Width must be >= 0");
        if (i2 < 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "Height must be >= 0");
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adnw)) {
            return false;
        }
        adnw adnw = (adnw) obj;
        return this.a == adnw.a && this.b == adnw.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(this.a));
        stringBuilder.append("x");
        stringBuilder.append(Integer.toString(this.b));
        return stringBuilder.toString();
    }
}
