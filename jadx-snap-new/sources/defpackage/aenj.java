package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aenk.class)
/* renamed from: aenj */
public class aenj extends aezl implements aezk {
    @SerializedName("image_size_px")
    public aexx a;
    @SerializedName("cropped_image_size_px")
    public aexx b;
    @SerializedName("cropped_image_offset")
    public aeol c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aenj)) {
            aenj aenj = (aenj) obj;
            return Objects.equal(this.a, aenj.a) && Objects.equal(this.b, aenj.b) && Objects.equal(this.c, aenj.c);
        }
    }

    public int hashCode() {
        aexx aexx = this.a;
        int i = 0;
        int hashCode = ((aexx == null ? 0 : aexx.hashCode()) + 527) * 31;
        aexx aexx2 = this.b;
        hashCode = (hashCode + (aexx2 == null ? 0 : aexx2.hashCode())) * 31;
        aeol aeol = this.c;
        if (aeol != null) {
            i = aeol.hashCode();
        }
        return hashCode + i;
    }
}
