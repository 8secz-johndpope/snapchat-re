package defpackage;

/* renamed from: ged */
public final class ged implements ygk {
    private final String a;
    private final boolean b;

    public ged(String str, boolean z) {
        akcr.b(str, "extension");
        this.a = str;
        this.b = z;
        if (!akgb.b(this.a, ".", false)) {
            throw new IllegalArgumentException("File type extension must start with .");
        }
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ged) {
                ged ged = (ged) obj;
                if (akcr.a(this.a, ged.a)) {
                    if ((this.b == ged.b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i = this.b;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContentFileType(extension=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isMultiFile=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
