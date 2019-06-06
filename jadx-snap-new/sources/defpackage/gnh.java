package defpackage;

/* renamed from: gnh */
public final class gnh {
    public final int a;
    public final int b;
    public final String c;

    public gnh(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public /* synthetic */ gnh(int i, int i2, String str, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 60;
        }
        if ((i3 & 4) != 0) {
            str = "";
        }
        this(i, i2, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gnh) {
                gnh gnh = (gnh) obj;
                if ((this.a == gnh.a ? 1 : null) != null) {
                    if ((this.b == gnh.b ? 1 : null) == null || !akcr.a(this.c, gnh.c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FixedTimeConstraints(hourIn24=");
        stringBuilder.append(this.a);
        stringBuilder.append(", jitterInMinutes=");
        stringBuilder.append(this.b);
        stringBuilder.append(", timeZoneID=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
