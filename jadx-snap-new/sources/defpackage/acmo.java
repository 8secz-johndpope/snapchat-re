package defpackage;

/* renamed from: acmo */
public final class acmo extends acmr {
    private final int a;

    public acmo(int i) {
        super();
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof acmo) {
                if ((this.a == ((acmo) obj).a ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MapStyleDownloadingEvent(styleId=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
