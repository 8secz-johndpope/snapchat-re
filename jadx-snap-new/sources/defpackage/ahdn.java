package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahdo.class)
/* renamed from: ahdn */
public class ahdn extends aedh implements aezk {
    @SerializedName("user_ids")
    public List<String> a;
    @SerializedName("source")
    public String b;

    /* renamed from: ahdn$a */
    public enum a {
        CHAT(r2),
        UNRECOGNIZED_VALUE(r3);
        
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
        if (obj != null && (obj instanceof ahdn)) {
            ahdn ahdn = (ahdn) obj;
            return super.equals(ahdn) && Objects.equal(this.a, ahdn.a) && Objects.equal(this.b, ahdn.b);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        List list = this.a;
        int i = 0;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
