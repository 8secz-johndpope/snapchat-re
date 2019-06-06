package defpackage;

/* renamed from: acmn */
public final class acmn extends acmr {
    private final int a;

    public acmn(int i) {
        super();
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof acmn) {
                if ((this.a == ((acmn) obj).a ? 1 : null) != null) {
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
        StringBuilder stringBuilder = new StringBuilder("MapStyleDownloadFailedEvent(styleId=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
