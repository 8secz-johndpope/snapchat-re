package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: abzl */
public class abzl {
    @SerializedName(alternate = {"a"}, value = "strokes")
    public final List<abzm> a;
    public final int b;
    @SerializedName("brushResizeCount")
    private final int c;
    @SerializedName("brushStroke")
    private final String d;

    public abzl(List<abzm> list, int i, int i2, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final List<abzm> a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abzl abzl = (abzl) obj;
        return new akmc().a(this.a, abzl.a).a(this.b, abzl.b).a(this.c, abzl.c).a(this.d, abzl.d).a;
    }

    public int hashCode() {
        return new akmd().a(this.a).a(this.b).a(this.c).a(this.d).a;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("strokes", this.a).add("smoothingVersion", this.b).add("brushResizeCount", this.c).add("brushStroke", this.d).toString();
    }
}
