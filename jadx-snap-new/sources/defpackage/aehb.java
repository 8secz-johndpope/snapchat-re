package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aehc.class)
/* renamed from: aehb */
public class aehb extends aeie implements aezk {
    @SerializedName("chat_message_id")
    public String a;
    @SerializedName("state")
    public String b;
    @SerializedName("screenshot_count")
    public Long c;
    @SerializedName("sender_chat_media_id")
    public String d;
    @SerializedName("open_timestamp")
    public Long e = Long.valueOf(0);
    @SerializedName("screen_capture_shot_count")
    public Long f;
    @SerializedName("screen_capture_recording_count")
    public Long g;
    @SerializedName("chat_message_seq_num")
    public Long h;

    /* renamed from: aehb$a */
    public enum a {
        VIEW(r2),
        REPLAY(r3),
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
        if (obj != null && (obj instanceof aehb)) {
            aehb aehb = (aehb) obj;
            return super.equals(aehb) && Objects.equal(this.a, aehb.a) && Objects.equal(this.b, aehb.b) && Objects.equal(this.c, aehb.c) && Objects.equal(this.d, aehb.d) && Objects.equal(this.e, aehb.e) && Objects.equal(this.f, aehb.f) && Objects.equal(this.g, aehb.g) && Objects.equal(this.h, aehb.h);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l = this.e;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.f;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.g;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.h;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
