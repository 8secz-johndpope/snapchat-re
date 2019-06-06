package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agfd.class)
/* renamed from: agfc */
public class agfc extends aezl implements aezk {
    @SerializedName("section_id")
    public String a;
    @SerializedName("lookahead_precache")
    public agfa b;

    /* renamed from: agfc$a */
    public enum a {
        RECENT_UPDATES(r2),
        OFFICIAL_STORIES(r3),
        FEED(r4),
        FEED_CAROUSEL(r5),
        CHAT_HEADER(r6),
        UNRECOGNIZED_VALUE(r7);
        
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
        if (obj != null && (obj instanceof agfc)) {
            agfc agfc = (agfc) obj;
            return Objects.equal(this.a, agfc.a) && Objects.equal(this.b, agfc.b);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        agfa agfa = this.b;
        if (agfa != null) {
            i = agfa.hashCode();
        }
        return hashCode + i;
    }
}
