package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeck.class)
/* renamed from: aecj */
public class aecj extends aezl implements aezk {
    @SerializedName("app_version")
    public String a;
    @SerializedName("os_type")
    public String b;
    @SerializedName("inventory_type")
    public String c;

    /* renamed from: aecj$a */
    public enum a {
        ANDROID(r2),
        IOS(r3),
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
        return a.a(this.b);
    }

    public final aecg b() {
        return aecg.a(this.c);
    }

    public void c() {
        if (this.a == null) {
            throw new IllegalStateException("app_version is required to be initialized.");
        } else if (this.b == null) {
            throw new IllegalStateException("os_type is required to be initialized.");
        } else if (this.c == null) {
            throw new IllegalStateException("inventory_type is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aecj)) {
            aecj aecj = (aecj) obj;
            return Objects.equal(this.a, aecj.a) && Objects.equal(this.b, aecj.b) && Objects.equal(this.c, aecj.c);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
