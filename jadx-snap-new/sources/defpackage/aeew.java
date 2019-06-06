package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeex.class)
/* renamed from: aeew */
public class aeew extends aezl implements aezk {
    @SerializedName("media_type")
    public Integer a;
    @SerializedName("playback_rotation_hint")
    public Integer b;
    @SerializedName("is_horizontally_flipped")
    public Boolean c;
    @SerializedName("width_cropping_ratio")
    public Float d;
    @SerializedName("height_cropping_ratio")
    public Float e;
    @SerializedName("camera_api")
    public String f;
    @SerializedName("camera_flipped_times")
    public Integer g;
    @SerializedName("capture_session_id")
    public String h;
    @SerializedName("capture_timestamp")
    public Long i;
    @SerializedName("is_flash_enabled")
    public Boolean j;
    @SerializedName("is_front_facing")
    public Boolean k;
    @SerializedName("is_hands_free_recording_used")
    public Boolean l;
    @SerializedName("iso")
    public Integer m;
    @SerializedName("low_light_status")
    public String n;
    @SerializedName("media_file_size_bytes")
    public Long o;
    @SerializedName("height")
    public Integer p;
    @SerializedName("width")
    public Integer q;
    @SerializedName("shakiness")
    public Float r;
    @SerializedName("captured_orientation")
    public String s;
    @SerializedName("take_picture_method")
    public String t;
    @SerializedName("video_duration_ms")
    public Long u;
    @SerializedName("zoom_level_samples")
    public List<Integer> v;
    @SerializedName("lens_metadata")
    public aepx w;
    @SerializedName("image_has_alpha")
    public Boolean x;
    @SerializedName("media_quality_level")
    public Integer y;

    public final aesf a() {
        return aesf.a(this.a);
    }

    public final aesb b() {
        return aesb.a(this.y);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeew)) {
            aeew aeew = (aeew) obj;
            return Objects.equal(this.a, aeew.a) && Objects.equal(this.b, aeew.b) && Objects.equal(this.c, aeew.c) && Objects.equal(this.d, aeew.d) && Objects.equal(this.e, aeew.e) && Objects.equal(this.f, aeew.f) && Objects.equal(this.g, aeew.g) && Objects.equal(this.h, aeew.h) && Objects.equal(this.i, aeew.i) && Objects.equal(this.j, aeew.j) && Objects.equal(this.k, aeew.k) && Objects.equal(this.l, aeew.l) && Objects.equal(this.m, aeew.m) && Objects.equal(this.n, aeew.n) && Objects.equal(this.o, aeew.o) && Objects.equal(this.p, aeew.p) && Objects.equal(this.q, aeew.q) && Objects.equal(this.r, aeew.r) && Objects.equal(this.s, aeew.s) && Objects.equal(this.t, aeew.t) && Objects.equal(this.u, aeew.u) && Objects.equal(this.v, aeew.v) && Objects.equal(this.w, aeew.w) && Objects.equal(this.x, aeew.x) && Objects.equal(this.y, aeew.y);
        }
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) + 527) * 31;
        Integer num2 = this.b;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.d;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        f = this.e;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.f;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        num2 = this.g;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        str = this.h;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.i;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        bool = this.j;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.k;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        num2 = this.m;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        str = this.n;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l = this.o;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        num2 = this.p;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.q;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        f = this.r;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        str = this.s;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.t;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l = this.u;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.v;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        aepx aepx = this.w;
        hashCode = (hashCode + (aepx == null ? 0 : aepx.hashCode())) * 31;
        bool = this.x;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        num2 = this.y;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }
}
