package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: abzi */
public final class abzi {
    @SerializedName(alternate = {"a"}, value = "type")
    public final a a;
    @SerializedName(alternate = {"b"}, value = "startInc")
    public int b;
    @SerializedName(alternate = {"c"}, value = "endExc")
    public int c;

    /* renamed from: abzi$a */
    public enum a {
        BOLD,
        ITALIC,
        UNDERLINE
    }

    public abzi(a aVar, int i, int i2) {
        this.a = aVar;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abzi)) {
            return false;
        }
        abzi abzi = (abzi) obj;
        return new akmc().a(this.a, abzi.a).a(this.b, abzi.b).a(this.c, abzi.c).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a(this.b).a(this.c).a;
    }
}
