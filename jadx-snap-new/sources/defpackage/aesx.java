package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aesy.class)
/* renamed from: aesx */
public class aesx extends aeie implements aezk {
    @SerializedName("chat_message_id")
    public String a;
    @SerializedName("state")
    public String b;
    @SerializedName("version")
    public Integer c;
    @SerializedName("chat_message_sender_id")
    public String d;
    @SerializedName("chat_message_seq_num")
    public Long e;

    /* renamed from: aesx$a */
    public enum a {
        SAVED(r2),
        UNSAVED(r3),
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aesx)) {
            aesx aesx = (aesx) obj;
            return super.equals(aesx) && Objects.equal(this.a, aesx.a) && Objects.equal(this.b, aesx.b) && Objects.equal(this.c, aesx.c) && Objects.equal(this.d, aesx.d) && Objects.equal(this.e, aesx.e);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
