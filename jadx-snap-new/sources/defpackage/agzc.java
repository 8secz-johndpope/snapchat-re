package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agzd.class)
/* renamed from: agzc */
public class agzc extends aeji implements aezk {
    @SerializedName("numbers")
    public String c;
    @SerializedName("countryCode")
    public String d;
    @SerializedName("contacts_with_meta_data")
    public List<agxy> e;
    @SerializedName("should_recommend")
    public Boolean f = Boolean.FALSE;
    @SerializedName("is_full_sync")
    public Boolean g = Boolean.FALSE;
    @SerializedName("source")
    public String h = "UNSET";
    @SerializedName("sign_up_tap_time_stamp")
    public Long i;

    /* renamed from: agzc$a */
    public enum a {
        UNSET(r2),
        REGISTRATION(r3),
        UNRECOGNIZED_VALUE(r4);
        
        private final String value;

        private a(String str) {
            this.value = str;
        }

        public static a a(String str) {
            if (str == null) {
                return UNRECOGNIZED_VALUE;
            }
            try {
                return a.valueOf(str.toUpperCase(Locale.US));
            } catch (Exception unused) {
                return UNRECOGNIZED_VALUE;
            }
        }

        public final String a() {
            return this.value;
        }

        public final String toString() {
            return this.value;
        }
    }

    public final a a() {
        return a.a(this.h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agzc)) {
            agzc agzc = (agzc) obj;
            return super.equals(agzc) && Objects.equal(this.c, agzc.c) && Objects.equal(this.d, agzc.d) && Objects.equal(this.e, agzc.e) && Objects.equal(this.f, agzc.f) && Objects.equal(this.g, agzc.g) && Objects.equal(this.h, agzc.h) && Objects.equal(this.i, agzc.i);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.c;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.e;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.g;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.h;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.i;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
