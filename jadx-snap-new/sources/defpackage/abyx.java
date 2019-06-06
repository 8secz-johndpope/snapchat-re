package defpackage;

/* renamed from: abyx */
public final class abyx {
    public final boolean a;
    public final String b;
    public final Long c;

    public /* synthetic */ abyx() {
        this(false, null, null);
    }

    public abyx(boolean z, String str, Long l) {
        this.a = z;
        this.b = str;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof abyx) {
                abyx abyx = (abyx) obj;
                if (!((this.a == abyx.a ? 1 : null) != null && akcr.a(this.b, abyx.b) && akcr.a(this.c, abyx.c))) {
                    return false;
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
        i *= 31;
        String str = this.b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.c;
        if (l != null) {
            i2 = l.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DrawingMetrics(drawing=");
        stringBuilder.append(this.a);
        stringBuilder.append(", brushStroke=");
        stringBuilder.append(this.b);
        stringBuilder.append(", brushResizeCount=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
