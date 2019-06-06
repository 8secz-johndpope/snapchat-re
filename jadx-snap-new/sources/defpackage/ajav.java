package defpackage;

/* renamed from: ajav */
public final class ajav extends ajaw {
    private final long a = 0;
    private final int b = 0;

    public final long a() {
        return 0;
    }

    public final int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajaw) {
            ajaw ajaw = (ajaw) obj;
            return 0 == ajaw.a() && ajaw.b() == 0;
        }
    }

    public final int hashCode() {
        return -721379959;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Timestamp{seconds=0");
        stringBuilder.append(", nanos=0");
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
