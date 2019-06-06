package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeys.class)
/* renamed from: aeyr */
public class aeyr extends aeie implements aezk {
    @SerializedName("snap_id")
    public String a;
    @SerializedName("viewed")
    public Boolean b;
    @SerializedName("replayed")
    public Boolean c;
    @SerializedName("screenshot_count")
    public Long d;
    @SerializedName("fi_needs_retry")
    public Boolean e;
    @SerializedName("fi_version")
    public Integer f;
    @SerializedName("fi_sender_out_alpha")
    public String g;
    @SerializedName("fi_recipient_out_alpha")
    public String h;
    @SerializedName("fi_send_timestamp")
    public Long r;
    @SerializedName("fi_recipient_out_delta")
    public String s;
    @SerializedName("fi_recipient_out_delta_check")
    public String t;
    @SerializedName("fi_sender_out_beta")
    public String u;
    @SerializedName("screen_capture_shot_count")
    public Long v;
    @SerializedName("screen_capture_recording_count")
    public Long w;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeyr)) {
            aeyr aeyr = (aeyr) obj;
            return super.equals(aeyr) && Objects.equal(this.a, aeyr.a) && Objects.equal(this.b, aeyr.b) && Objects.equal(this.c, aeyr.c) && Objects.equal(this.d, aeyr.d) && Objects.equal(this.e, aeyr.e) && Objects.equal(this.f, aeyr.f) && Objects.equal(this.g, aeyr.g) && Objects.equal(this.h, aeyr.h) && Objects.equal(this.r, aeyr.r) && Objects.equal(this.s, aeyr.s) && Objects.equal(this.t, aeyr.t) && Objects.equal(this.u, aeyr.u) && Objects.equal(this.v, aeyr.v) && Objects.equal(this.w, aeyr.w);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.c;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.g;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.h;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l = this.r;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str = this.s;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.t;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.u;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l = this.v;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.w;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
