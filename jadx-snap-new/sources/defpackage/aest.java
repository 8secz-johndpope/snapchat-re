package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aesu.class)
/* renamed from: aest */
public class aest extends aezl implements aezk {
    @SerializedName("id")
    public String a;
    @SerializedName("type")
    public String b;
    @SerializedName("contents")
    public String c;
    @SerializedName("payload")
    @Deprecated
    public byte[] d;
    @SerializedName("media")
    public List<ahht> e;
    @SerializedName("tag")
    public String f;
    @SerializedName("tag_version")
    public String g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aest)) {
            aest aest = (aest) obj;
            return Objects.equal(this.a, aest.a) && Objects.equal(this.b, aest.b) && Objects.equal(this.c, aest.c) && Objects.equal(this.d, aest.d) && Objects.equal(this.e, aest.e) && Objects.equal(this.f, aest.f) && Objects.equal(this.g, aest.g);
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
        byte[] bArr = this.d;
        hashCode = (hashCode + (bArr == null ? 0 : bArr.hashCode())) * 31;
        List list = this.e;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
