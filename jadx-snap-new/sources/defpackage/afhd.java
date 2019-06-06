package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afhe.class)
/* renamed from: afhd */
public class afhd extends aezl implements aezk {
    @SerializedName("type")
    public String a;
    @SerializedName("params")
    public Map<String, String> b;
    @SerializedName("targeting_params")
    public Map<String, String> c;

    /* renamed from: afhd$a */
    public enum a {
        AUTO_ADVANCE("auto_advance"),
        DISCOVER("discover"),
        LIVE("live"),
        OFFICIAL_STORIES("official_stories"),
        PROMOTED_STORIES("promoted_stories"),
        GENERATED_STORIES("generated_stories"),
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
        return a.a(this.a);
    }

    public void b() {
        if (this.a == null) {
            throw new IllegalStateException("type is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afhd)) {
            afhd afhd = (afhd) obj;
            return Objects.equal(this.a, afhd.a) && Objects.equal(this.b, afhd.b) && Objects.equal(this.c, afhd.c);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Map map = this.b;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        map = this.c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }
}
