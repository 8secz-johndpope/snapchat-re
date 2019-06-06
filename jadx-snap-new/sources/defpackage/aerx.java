package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aery.class)
/* renamed from: aerx */
public class aerx extends aezl implements aezk {
    @SerializedName("start")
    public Integer a;
    @SerializedName("end")
    public Integer b;
    @SerializedName("type")
    public String c;
    @SerializedName("url")
    public String d;

    /* renamed from: aerx$a */
    public enum a {
        LINK("link"),
        ADDRESS("address"),
        PHONE("phone"),
        WEBLINK("weblink"),
        EMAIL("email"),
        MENTION("mention"),
        UNRECOGNIZED_VALUE(r8);
        
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
        return a.a(this.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aerx)) {
            aerx aerx = (aerx) obj;
            return Objects.equal(this.a, aerx.a) && Objects.equal(this.b, aerx.b) && Objects.equal(this.c, aerx.c) && Objects.equal(this.d, aerx.d);
        }
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) + 527) * 31;
        Integer num2 = this.b;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
