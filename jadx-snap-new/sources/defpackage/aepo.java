package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aepp.class)
/* renamed from: aepo */
public class aepo extends aezl implements aezk {
    @SerializedName("type")
    public String a;
    @SerializedName("id")
    public String b;
    @SerializedName("request_timing")
    public String c;
    @SerializedName("scale")
    public Integer d;
    @SerializedName("asset_url")
    public String e;
    @SerializedName("asset_signature")
    public String f;
    @SerializedName("preload_limit")
    public Integer g;
    @SerializedName("animation_group")
    public String h;
    @SerializedName("original_filename")
    public String i;
    @SerializedName("content_signature")
    public String j;

    /* renamed from: aepo$a */
    public enum a {
        PRELOAD("preload"),
        ON_DEMAND("on_demand"),
        REQUIRED("required"),
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

    /* renamed from: aepo$b */
    public enum b {
        BITMOJI("bitmoji"),
        BITMOJI_LIST("bitmoji_list"),
        ASSET("asset"),
        BITMOJI_3_D("bitmoji_3_d"),
        AVATAR_ASSET("avatar_asset"),
        FRIENDMOJI_3_D("friendmoji_3_d"),
        FRIENDMOJI_AVATAR_ASSET("friendmoji_avatar_asset"),
        DEVICE_DEPENDENT_ASSET("device_dependent_asset"),
        UNRECOGNIZED_VALUE(r10);
        
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
        return b.a(this.a);
    }

    public final a b() {
        return a.a(this.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aepo)) {
            aepo aepo = (aepo) obj;
            return Objects.equal(this.a, aepo.a) && Objects.equal(this.b, aepo.b) && Objects.equal(this.c, aepo.c) && Objects.equal(this.d, aepo.d) && Objects.equal(this.e, aepo.e) && Objects.equal(this.f, aepo.f) && Objects.equal(this.g, aepo.g) && Objects.equal(this.h, aepo.h) && Objects.equal(this.i, aepo.i) && Objects.equal(this.j, aepo.j);
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
        Integer num = this.d;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        num = this.g;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.j;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
