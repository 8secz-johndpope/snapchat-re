package defpackage;

/* renamed from: ajbk */
final class ajbk extends ajbq {
    private final String a;

    ajbk(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null asString");
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajbq)) {
            return false;
        }
        return this.a.equals(((ajbq) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TagValue{asString=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
