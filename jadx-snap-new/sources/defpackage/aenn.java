package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeno.class)
/* renamed from: aenn */
public class aenn extends aezl implements aezk {
    @SerializedName("refresh_rate")
    public Long a;
    @SerializedName("type")
    public String b;
    @SerializedName("source")
    public String c;
    @SerializedName("layout_parameters")
    public aenl d;
    @SerializedName("display_parameters")
    public aenh e;
    @SerializedName("display_schedule")
    @Deprecated
    public aerf f;
    @SerializedName("companion_creative_properties")
    public ahyt g;

    /* renamed from: aenn$a */
    public enum a {
        TEXT("text"),
        IMAGE("image"),
        SMART_FILTER("smart_filter"),
        COMPANION_CREATIVE("companion_creative"),
        UNRECOGNIZED_VALUE(r6);
        
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
        return a.a(this.b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aenn)) {
            aenn aenn = (aenn) obj;
            return Objects.equal(this.a, aenn.a) && Objects.equal(this.b, aenn.b) && Objects.equal(this.c, aenn.c) && Objects.equal(this.d, aenn.d) && Objects.equal(this.e, aenn.e) && Objects.equal(this.f, aenn.f) && Objects.equal(this.g, aenn.g);
        }
    }

    public int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) + 527) * 31;
        String str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        aenl aenl = this.d;
        hashCode = (hashCode + (aenl == null ? 0 : aenl.hashCode())) * 31;
        aenh aenh = this.e;
        hashCode = (hashCode + (aenh == null ? 0 : aenh.hashCode())) * 31;
        aerf aerf = this.f;
        hashCode = (hashCode + (aerf == null ? 0 : aerf.hashCode())) * 31;
        ahyt ahyt = this.g;
        if (ahyt != null) {
            i = ahyt.hashCode();
        }
        return hashCode + i;
    }
}
