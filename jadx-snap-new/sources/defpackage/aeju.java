package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aejv.class)
/* renamed from: aeju */
public class aeju extends aezl implements aezk {
    @SerializedName("auto_refresh_delay_in_milli")
    public Long a;
    @SerializedName("auto_refresh_message_x_portrait")
    public Float b;
    @SerializedName("auto_refresh_message_x_landscape")
    public Float c;
    @SerializedName("auto_refresh_message_y_portrait")
    public Float d;
    @SerializedName("auto_refresh_message_y_landscape")
    public Float e;
    @SerializedName("dynamic_filter_refresh_hint")
    public String f;
    @SerializedName("dynamic_filter_updating_message")
    public String g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeju)) {
            aeju aeju = (aeju) obj;
            return Objects.equal(this.a, aeju.a) && Objects.equal(this.b, aeju.b) && Objects.equal(this.c, aeju.c) && Objects.equal(this.d, aeju.d) && Objects.equal(this.e, aeju.e) && Objects.equal(this.f, aeju.f) && Objects.equal(this.g, aeju.g);
        }
    }

    public int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) + 527) * 31;
        Float f = this.b;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        f = this.c;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        f = this.d;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        f = this.e;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.f;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.g;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
