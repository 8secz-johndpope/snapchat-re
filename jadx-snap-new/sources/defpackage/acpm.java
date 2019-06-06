package defpackage;

import java.util.Arrays;

/* renamed from: acpm */
public final class acpm extends acpu {
    final double a = (this.d * 1000.0d);
    final String b;
    final acpq[] c;
    private final double d;

    public acpm(String str, double d, acpq[] acpqArr) {
        akcr.b(str, "name");
        akcr.b(acpqArr, "params");
        super();
        this.b = str;
        this.d = d;
        this.c = acpqArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            acpm acpm = (acpm) obj;
            return (akcr.a(this.b, acpm.b) ^ 1) == 0 && Arrays.equals(this.c, acpm.c);
        } else {
            throw new ajxt("null cannot be cast to non-null type com.snapchat.map.feature.effect.WorldEffect");
        }
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + Arrays.hashCode(this.c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WorldEffect(name=");
        stringBuilder.append(this.b);
        stringBuilder.append(", durationInSeconds=");
        stringBuilder.append(this.d);
        stringBuilder.append(", params=");
        stringBuilder.append(Arrays.toString(this.c));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
