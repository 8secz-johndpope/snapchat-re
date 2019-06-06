package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afbp.class)
/* renamed from: afbo */
public class afbo extends aezl implements aezk {
    @SerializedName("view_count")
    public Integer a;
    @SerializedName("screenshot_count")
    public Integer b;
    @SerializedName("screen_capture_shot_count")
    public Integer c;
    @SerializedName("screen_capture_recording_count")
    public Integer d;
    @SerializedName("snap_save_count")
    public Integer e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afbo)) {
            afbo afbo = (afbo) obj;
            return Objects.equal(this.a, afbo.a) && Objects.equal(this.b, afbo.b) && Objects.equal(this.c, afbo.c) && Objects.equal(this.d, afbo.d) && Objects.equal(this.e, afbo.e);
        }
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) + 527) * 31;
        Integer num2 = this.b;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.c;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.d;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.e;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }
}
