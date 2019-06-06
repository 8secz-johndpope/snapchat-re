package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aepj.class)
/* renamed from: aepi */
public class aepi extends aezl implements aezk {
    @SerializedName("last_reader")
    public String a;
    @SerializedName("last_read_timestamp")
    public Long b;
    @SerializedName("last_writer")
    public String c;
    @SerializedName("last_write_timestamp")
    public Long d;
    @SerializedName("last_write_type")
    public String e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aepi)) {
            aepi aepi = (aepi) obj;
            return Objects.equal(this.a, aepi.a) && Objects.equal(this.b, aepi.b) && Objects.equal(this.c, aepi.c) && Objects.equal(this.d, aepi.d) && Objects.equal(this.e, aepi.e);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        l = this.d;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
