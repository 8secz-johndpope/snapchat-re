package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aezs.class)
/* renamed from: aezr */
public class aezr extends aezl implements aezk {
    @SerializedName("font")
    public String a;
    @SerializedName("text_size")
    public String b;
    @SerializedName("color")
    public String c;
    @SerializedName("dropshadow_color")
    public String d;
    @SerializedName("dropshadow_offset")
    public afcn e;

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("font is required to be initialized.");
        } else if (this.b == null) {
            throw new IllegalStateException("text_size is required to be initialized.");
        } else if (this.c == null) {
            throw new IllegalStateException("color is required to be initialized.");
        } else if (this.d == null) {
            throw new IllegalStateException("dropshadow_color is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aezr)) {
            aezr aezr = (aezr) obj;
            return Objects.equal(this.a, aezr.a) && Objects.equal(this.b, aezr.b) && Objects.equal(this.c, aezr.c) && Objects.equal(this.d, aezr.d) && Objects.equal(this.e, aezr.e);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        afcn afcn = this.e;
        if (afcn != null) {
            i = afcn.hashCode();
        }
        return hashCode + i;
    }
}
