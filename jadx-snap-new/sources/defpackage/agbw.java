package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agbx.class)
/* renamed from: agbw */
public class agbw extends aezl implements aezk {
    @SerializedName("id")
    public String a;
    @SerializedName("type")
    public String b;
    @SerializedName("display_name")
    public String c;
    @SerializedName("color")
    public String d;
    @SerializedName("logo")
    public String e;
    @SerializedName("logo_type")
    public String f;
    @SerializedName("is_sponsored")
    public Boolean g;
    @SerializedName("tiles")
    public List<agae> h;

    /* renamed from: agbw$a */
    public enum a {
        URL(r2),
        TEXT(r3),
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

    public final agaw a() {
        return agaw.a(this.b);
    }

    public final a b() {
        return a.a(this.f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agbw)) {
            agbw agbw = (agbw) obj;
            return Objects.equal(this.a, agbw.a) && Objects.equal(this.b, agbw.b) && Objects.equal(this.c, agbw.c) && Objects.equal(this.d, agbw.d) && Objects.equal(this.e, agbw.e) && Objects.equal(this.f, agbw.f) && Objects.equal(this.g, agbw.g) && Objects.equal(this.h, agbw.h);
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
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.g;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.h;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
