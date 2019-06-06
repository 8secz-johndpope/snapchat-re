package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: mus */
final class mus {
    @SerializedName("id")
    final String a;
    @SerializedName("code")
    final String b;
    @SerializedName("enabled")
    final boolean c;
    @SerializedName("icon_link")
    final String d;
    @SerializedName("lensContext")
    final mut e;
    @SerializedName("hint_id")
    private final String f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mus) {
                mus mus = (mus) obj;
                if (akcr.a(this.a, mus.a) && akcr.a(this.b, mus.b)) {
                    if (!((this.c == mus.c ? 1 : null) != null && akcr.a(this.d, mus.d) && akcr.a(this.f, mus.f) && akcr.a(this.e, mus.e))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.c;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str2 = this.d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        mut mut = this.e;
        if (mut != null) {
            i = mut.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("JsonLens(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", code=");
        stringBuilder.append(this.b);
        stringBuilder.append(", enabled=");
        stringBuilder.append(this.c);
        stringBuilder.append(", iconLink=");
        stringBuilder.append(this.d);
        stringBuilder.append(", hintId=");
        stringBuilder.append(this.f);
        stringBuilder.append(", lensContext=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
