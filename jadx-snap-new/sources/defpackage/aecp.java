package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aecq.class)
/* renamed from: aecp */
public class aecp extends aezl implements aezk {
    @SerializedName("sceid")
    public String a;
    @SerializedName("user_data")
    public String b;
    @SerializedName("track_host_and_path")
    public String c;
    @SerializedName("pixel_token")
    public String d;
    @SerializedName("user_data_v2")
    @Deprecated
    public byte[] e;
    @SerializedName("user_data_v2_encrypted")
    public String f;

    public void a() {
        if (this.b == null) {
            throw new IllegalStateException("user_data is required to be initialized.");
        } else if (this.c == null) {
            throw new IllegalStateException("track_host_and_path is required to be initialized.");
        } else if (this.f == null) {
            throw new IllegalStateException("user_data_v2_encrypted is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aecp)) {
            aecp aecp = (aecp) obj;
            return Objects.equal(this.a, aecp.a) && Objects.equal(this.b, aecp.b) && Objects.equal(this.c, aecp.c) && Objects.equal(this.d, aecp.d) && Objects.equal(this.e, aecp.e) && Objects.equal(this.f, aecp.f);
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
        byte[] bArr = this.e;
        hashCode = (hashCode + (bArr == null ? 0 : bArr.hashCode())) * 31;
        str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
