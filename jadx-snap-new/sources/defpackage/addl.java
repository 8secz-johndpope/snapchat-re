package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: addl */
public final class addl {
    @SerializedName("id")
    public final String a;
    @SerializedName("color")
    public final int b;
    @SerializedName("value")
    public final int c;

    public addl(String str, int i, int i2) {
        akcr.b(str, "id");
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (!(obj instanceof addl)) {
            obj = null;
        }
        addl addl = (addl) obj;
        return addl != null ? akcr.a(this.a, addl.a) : false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("EggHuntEgg(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", color=");
        stringBuilder.append(this.b);
        stringBuilder.append(", value=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
