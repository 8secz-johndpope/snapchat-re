package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aete.class)
/* renamed from: aetd */
public class aetd extends aegj implements aezk {
    @SerializedName("mischief_update_message_type")
    public String f;
    @SerializedName("origin_participant_id")
    public String g;
    @SerializedName("participants_ids")
    public List<String> h;
    @SerializedName("new_mischief_name")
    public String r;
    @SerializedName("mischief_metadata_result")
    public ahbg s;

    public final aetf a() {
        return aetf.a(this.f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aetd)) {
            aetd aetd = (aetd) obj;
            return super.equals(aetd) && Objects.equal(this.f, aetd.f) && Objects.equal(this.g, aetd.g) && Objects.equal(this.h, aetd.h) && Objects.equal(this.r, aetd.r) && Objects.equal(this.s, aetd.s);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.f;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.g;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.h;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str = this.r;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ahbg ahbg = this.s;
        if (ahbg != null) {
            i = ahbg.hashCode();
        }
        return hashCode + i;
    }
}
