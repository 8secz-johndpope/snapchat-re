package defpackage;

/* renamed from: ajbj */
final class ajbj extends ajbp {
    private final String a;

    ajbj(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajbp)) {
            return false;
        }
        return this.a.equals(((ajbp) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TagKey{name=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
