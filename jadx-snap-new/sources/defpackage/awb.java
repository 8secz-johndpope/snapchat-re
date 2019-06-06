package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: awb */
public final class awb {
    private final String a;
    private final List<Object> b;
    private final boolean c;
    private final String d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof awb)) {
            return false;
        }
        awb awb = (awb) obj;
        return aug.a(this.a, awb.a) && this.c == awb.c && aug.a(this.b, awb.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), this.b, this.d});
    }

    public final String toString() {
        return String.format(null, "%s-%b-%s-%s", new Object[]{this.a, Boolean.valueOf(this.c), this.b, this.d});
    }
}
