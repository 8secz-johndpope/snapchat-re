package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aenq.class)
/* renamed from: aenp */
public class aenp extends aezl implements aezk {
    @SerializedName("text")
    public String a;
    @SerializedName("position")
    public String b;
    @SerializedName("fade_in_time_ms")
    public Long c;
    @SerializedName("on_screen_time_ms")
    public Long d;
    @SerializedName("fade_out_time_ms")
    public Long e;

    /* renamed from: aenp$a */
    public enum a {
        TOP(r2),
        MIDDLE(r3),
        BOTTOM(r4),
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

    public final a a() {
        return a.a(this.b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aenp)) {
            aenp aenp = (aenp) obj;
            return Objects.equal(this.a, aenp.a) && Objects.equal(this.b, aenp.b) && Objects.equal(this.c, aenp.c) && Objects.equal(this.d, aenp.d) && Objects.equal(this.e, aenp.e);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.d;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
