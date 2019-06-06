package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahqg.class)
/* renamed from: ahqf */
public class ahqf extends aezl implements aezk {
    @SerializedName("sender_out_delta")
    public String a;
    @SerializedName("sender_out_delta_check")
    public String b;
    @SerializedName("counter")
    public Integer c;
    @SerializedName("na")
    public String d;
    @SerializedName("phi")
    public String e;
    @SerializedName("tag")
    public String f;
    @SerializedName("recipient_out_delta")
    public String g;
    @SerializedName("recipient_out_delta_check")
    public String h;
    @SerializedName("sender_user_id")
    public String i;
    @SerializedName("recipient_user_id")
    public String j;
    @SerializedName("recipient_version")
    public Integer k;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahqf)) {
            ahqf ahqf = (ahqf) obj;
            return Objects.equal(this.a, ahqf.a) && Objects.equal(this.b, ahqf.b) && Objects.equal(this.c, ahqf.c) && Objects.equal(this.d, ahqf.d) && Objects.equal(this.e, ahqf.e) && Objects.equal(this.f, ahqf.f) && Objects.equal(this.g, ahqf.g) && Objects.equal(this.h, ahqf.h) && Objects.equal(this.i, ahqf.i) && Objects.equal(this.j, ahqf.j) && Objects.equal(this.k, ahqf.k);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.j;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        num = this.k;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }
}
