package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

/* renamed from: acah */
public final class acah {
    @SerializedName(alternate = {"a"}, value = "mResourceId")
    public final String a = null;
    @SerializedName(alternate = {"b"}, value = "mResourceUrl")
    public final String b = null;
    @SerializedName(alternate = {"c"}, value = "mMagicToolsEditType")
    private final String c;
    @SerializedName(alternate = {"d"}, value = "mFinalEditCount")
    private final Integer d;
    @SerializedName(alternate = {"e"}, value = "mTotalEditCount")
    private final Integer e;
    @SerializedName(alternate = {"f"}, value = "mResetCount")
    private final Integer f;
    @SerializedName(alternate = {"g"}, value = "mSessionCount")
    private final Integer g;
    @SerializedName(alternate = {"h"}, value = "mHasMagicImage")
    private final Boolean h;

    public acah(String str, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool) {
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = num3;
        this.g = num4;
        this.h = bool;
    }

    public final Integer a() {
        return Integer.valueOf(abpp.a(this.d, 0));
    }

    public final Integer b() {
        return Integer.valueOf(abpp.a(this.e, 0));
    }

    public final Integer c() {
        return Integer.valueOf(abpp.a(this.f, 0));
    }

    public final Integer d() {
        return Integer.valueOf(abpp.a(this.g, 0));
    }

    public final Boolean e() {
        return Boolean.valueOf(abpp.a(this.h));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        acah acah = (acah) obj;
        return new akmc().a(this.c, acah.c).a(this.d, acah.d).a(this.e, acah.e).a(this.f, acah.f).a(this.g, acah.g).a(this.h, acah.h).a(this.a, acah.a).a(this.b, acah.b).a;
    }

    public final int hashCode() {
        return new akmd().a(this.c).a(this.d).a(this.e).a(this.f).a(this.g).a(this.h).a(this.a).a(this.b).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("magic_tools_edit_type", this.c).add("final_edit_count", this.d).add("total_edit_count", this.e).add("reset_count", this.f).add("session_count", this.g).add("has_magic_image", this.h).add("resource_id", this.a).add("resource_url", this.b).toString();
    }
}
