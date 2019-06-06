package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeog.class)
/* renamed from: aeof */
public class aeof extends aezl implements aezk {
    @SerializedName("from")
    public String a;
    @SerializedName("to")
    public List<String> b;
    @SerializedName("conv_id")
    public String c;
    @SerializedName("isv3")
    public Boolean d;
    @SerializedName("auth")
    public aexp e;
    @SerializedName("conn_seq_num")
    public Long f;

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("from is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeof)) {
            aeof aeof = (aeof) obj;
            return Objects.equal(this.a, aeof.a) && Objects.equal(this.b, aeof.b) && Objects.equal(this.c, aeof.c) && Objects.equal(this.d, aeof.d) && Objects.equal(this.e, aeof.e) && Objects.equal(this.f, aeof.f);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        List list = this.b;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.c;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aexp aexp = this.e;
        hashCode = (hashCode + (aexp == null ? 0 : aexp.hashCode())) * 31;
        Long l = this.f;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
