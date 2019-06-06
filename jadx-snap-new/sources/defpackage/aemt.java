package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aemu.class)
/* renamed from: aemt */
public class aemt extends aedh implements aezk {
    @SerializedName("action")
    public String a;
    @SerializedName("emoji_category")
    public String b;
    @SerializedName("emoji_value")
    public aejy c;

    /* renamed from: aemt$a */
    public enum a {
        FRIENDMOJI_UPDATE("friendmoji_update"),
        EMOJI_FOR_RESET("emoji_for_reset"),
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
        return a.a(this.a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aemt)) {
            aemt aemt = (aemt) obj;
            return super.equals(aemt) && Objects.equal(this.a, aemt.a) && Objects.equal(this.b, aemt.b) && Objects.equal(this.c, aemt.c);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        aejy aejy = this.c;
        if (aejy != null) {
            i = aejy.hashCode();
        }
        return hashCode + i;
    }
}
