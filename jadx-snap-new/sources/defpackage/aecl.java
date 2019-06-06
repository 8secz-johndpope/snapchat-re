package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aecm.class)
/* renamed from: aecl */
public class aecl extends aezl implements aezk {
    @SerializedName("name")
    public String a;
    @SerializedName("type")
    public String b;
    @SerializedName("behavior")
    public String c;
    @SerializedName("params")
    public Map<String, String> d;

    /* renamed from: aecl$a */
    public enum a {
        PRIMARY(r2),
        SHADOW(r3),
        FALLBACK(r4),
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

    /* renamed from: aecl$b */
    public enum b {
        SNAPADS("snapads"),
        DFP("dfp"),
        UNRECOGNIZED_VALUE(r4);
        
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

    public final b a() {
        return b.a(this.b);
    }

    public final a b() {
        return a.a(this.c);
    }

    public void c() {
        if (this.a == null) {
            throw new IllegalStateException("name is required to be initialized.");
        } else if (this.b == null) {
            throw new IllegalStateException("type is required to be initialized.");
        } else if (this.c == null) {
            throw new IllegalStateException("behavior is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aecl)) {
            aecl aecl = (aecl) obj;
            return Objects.equal(this.a, aecl.a) && Objects.equal(this.b, aecl.b) && Objects.equal(this.c, aecl.c) && Objects.equal(this.d, aecl.d);
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
        Map map = this.d;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }
}
