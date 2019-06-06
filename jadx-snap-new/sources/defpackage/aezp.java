package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aezq.class)
/* renamed from: aezp */
public class aezp extends aezl implements aezk {
    @SerializedName("view_rect")
    public afcp a;
    @SerializedName("alignment")
    public String b;
    @SerializedName("position")
    public String c;
    @SerializedName("hmargin")
    public String d;
    @SerializedName("vmargin")
    public String e;
    @SerializedName("text")
    public String f;
    @SerializedName("sponsored_text")
    public String g;
    @SerializedName("sponsored_channel_text")
    public String h;
    @SerializedName("time_before_fadeout")
    public Integer i;
    @SerializedName("longform_text")
    public String j;
    @SerializedName("longform_time_before_fadeout")
    public Integer k;

    /* renamed from: aezp$a */
    public enum a {
        LEFT("left"),
        RIGHT("right"),
        CENTER("center"),
        UNRECOGNIZED_VALUE(r5);
        
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

    /* renamed from: aezp$b */
    public enum b {
        TOP_LEFT(r2),
        TOP_CENTER(r3),
        TOP_RIGHT(r4),
        BOTTOM_LEFT(r5),
        BOTTOM_CENTER(r6),
        BOTTOM_RIGHT(r7),
        MIDDLE_LEFT(r8),
        MIDDLE_CENTER(r8),
        MIDDLE_RIGHT("MIDDLE_RIGHT"),
        UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
        
        private final String value;

        private b(String str) {
            this.value = str;
        }

        public static b a(String str) {
            if (str == null) {
                return UNRECOGNIZED_VALUE;
            }
            try {
                return b.valueOf(str.toUpperCase(Locale.US));
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

    public final b b() {
        return b.a(this.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aezp)) {
            aezp aezp = (aezp) obj;
            return Objects.equal(this.a, aezp.a) && Objects.equal(this.b, aezp.b) && Objects.equal(this.c, aezp.c) && Objects.equal(this.d, aezp.d) && Objects.equal(this.e, aezp.e) && Objects.equal(this.f, aezp.f) && Objects.equal(this.g, aezp.g) && Objects.equal(this.h, aezp.h) && Objects.equal(this.i, aezp.i) && Objects.equal(this.j, aezp.j) && Objects.equal(this.k, aezp.k);
        }
    }

    public int hashCode() {
        afcp afcp = this.a;
        int i = 0;
        int hashCode = ((afcp == null ? 0 : afcp.hashCode()) + 527) * 31;
        String str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.f;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.g;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.h;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.i;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.j;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        num = this.k;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }
}
