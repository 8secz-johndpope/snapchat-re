package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afgg.class)
/* renamed from: afgf */
public class afgf extends aezl implements aezk {
    @SerializedName("recording_bitrate_1080p")
    public Integer a = Integer.valueOf(10000000);
    @SerializedName("recording_bitrate_720p")
    public Integer b;
    @SerializedName("recording_bitrate_640p")
    public Integer c;
    @SerializedName("recording_bitrate_480p")
    public Integer d;
    @SerializedName("recording_bitrate_360p")
    public Integer e;
    @SerializedName("transcoding_output_width")
    public Integer f;
    @SerializedName("transcoding_output_bitrate_1080p")
    public Integer g;
    @SerializedName("transcoding_output_bitrate_720p")
    public Integer h;
    @SerializedName("transcoding_output_bitrate_640p")
    public Integer i;
    @SerializedName("transcoding_output_bitrate_480p")
    public Integer j;
    @SerializedName("transcoding_output_bitrate_360p")
    public Integer k;

    public afgf() {
        Integer valueOf = Integer.valueOf(5000000);
        this.b = valueOf;
        this.c = valueOf;
        this.d = Integer.valueOf(3500000);
        this.e = Integer.valueOf(3000000);
        this.f = Integer.valueOf(360);
        this.g = Integer.valueOf(4000000);
        this.h = Integer.valueOf(2500000);
        this.i = Integer.valueOf(2000000);
        this.j = Integer.valueOf(1500000);
        this.k = Integer.valueOf(1250000);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afgf)) {
            afgf afgf = (afgf) obj;
            return Objects.equal(this.a, afgf.a) && Objects.equal(this.b, afgf.b) && Objects.equal(this.c, afgf.c) && Objects.equal(this.d, afgf.d) && Objects.equal(this.e, afgf.e) && Objects.equal(this.f, afgf.f) && Objects.equal(this.g, afgf.g) && Objects.equal(this.h, afgf.h) && Objects.equal(this.i, afgf.i) && Objects.equal(this.j, afgf.j) && Objects.equal(this.k, afgf.k);
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
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.f;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.g;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.h;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.i;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.j;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.k;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }
}
