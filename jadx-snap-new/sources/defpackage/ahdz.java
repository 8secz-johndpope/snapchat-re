package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahea.class)
/* renamed from: ahdz */
public class ahdz extends aedh implements aezk {
    @SerializedName("requested_username")
    public String a;
    @SerializedName("first_name")
    public String b;
    @SerializedName("last_name")
    public String c;
    @SerializedName("birthdate")
    public String d;

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("requested_username is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahdz)) {
            ahdz ahdz = (ahdz) obj;
            return super.equals(ahdz) && Objects.equal(this.a, ahdz.a) && Objects.equal(this.b, ahdz.b) && Objects.equal(this.c, ahdz.c) && Objects.equal(this.d, ahdz.d);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
