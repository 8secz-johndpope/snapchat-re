package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

/* renamed from: acai */
public final class acai {
    @SerializedName(alternate = {"d"}, value = "mFinalEditCount")
    public final Integer a;
    @SerializedName(alternate = {"e"}, value = "mTotalEditCount")
    public final Integer b;
    @SerializedName(alternate = {"f"}, value = "mResetCount")
    public final Integer c;
    @SerializedName(alternate = {"g"}, value = "mSessionCount")
    public final Integer d;
    @SerializedName(alternate = {"h"}, value = "mHasMagicImage")
    public final Boolean e;
    @SerializedName(alternate = {"i"}, value = "mPurikuraMetadataResponse")
    public final aevm f = null;
    @SerializedName(alternate = {"a"}, value = "mMagicEraserMetadata")
    public final acah g;
    @SerializedName(alternate = {"b"}, value = "mMagicBrushMetadata")
    public final acah h;
    @SerializedName(alternate = {"c"}, value = "mMagicPurikuraMetadata")
    public final acah i;

    public acai(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, acah acah) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = bool;
        this.g = acah;
        this.h = null;
        this.i = null;
    }

    public final boolean a() {
        return abpp.a(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        acai acai = (acai) obj;
        return new akmc().a(this.a, acai.a).a(this.b, acai.b).a(this.c, acai.c).a(this.d, acai.d).a(this.e, acai.e).a(this.f, acai.f).a(this.g, acai.g).a(this.h, acai.h).a(this.i, acai.i).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a(this.b).a(this.c).a(this.d).a(this.e).a(this.f).a(this.g).a(this.h).a(this.i).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("final_edit_count", this.a).add("total_edit_count", this.b).add("reset_count", this.c).add("session_count", this.d).add("has_magic_image", this.e).add("purikura_response", this.f).add("eraser_metadata", this.g).add("brush_metadata", this.h).add("purikura_metadata", this.i).toString();
    }
}
