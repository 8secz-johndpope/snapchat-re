package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import defpackage.agph.a;

/* renamed from: acag */
public class acag {
    @SerializedName(alternate = {"a"}, value = "finalEraseCount")
    private final Integer a;
    @SerializedName(alternate = {"b"}, value = "totalEraseCount")
    private final Integer b;
    @SerializedName(alternate = {"c"}, value = "resetCount")
    private final Integer c;
    @SerializedName(alternate = {"d"}, value = "eraserSessionCount")
    private final Integer d;
    @SerializedName(alternate = {"e"}, value = "hasInpaintedImage")
    private final Boolean e;

    public final acai a() {
        return new acai(this.a, this.b, this.c, this.d, this.e, new acah(a.ERASER.toString(), this.a, this.b, this.c, this.d, this.e));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        acag acag = (acag) obj;
        return new akmc().a(this.a, acag.a).a(this.b, acag.b).a(this.c, acag.c).a(this.d, acag.d).a(this.e, acag.e).a;
    }

    public int hashCode() {
        return new akmd().a(this.a).a(this.b).a(this.c).a(this.d).a(this.e).a;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("final_erase_count", this.a).add("total_erase_count", this.b).add("reset_count", this.c).add("eraser_session_count", this.d).add("has_inpainted_image", this.e).toString();
    }
}
