package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahyh.class)
/* renamed from: ahyg */
public class ahyg extends aezl implements aezk {
    @SerializedName("auto_stack_type")
    public String a;

    /* renamed from: ahyg$a */
    public enum a {
        UNFILTERED(r2),
        INSTASNAP(r3),
        MISS_ETIKATE(r4),
        GREYSCALE(r5),
        SMOOTHING(r6),
        SKY_DAYLIGHT(r7),
        SKY_SUNSET(r8),
        SKY_NIGHT(r8),
        UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
        
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
        if (obj == null || !(obj instanceof ahyg)) {
            return false;
        }
        return Objects.equal(this.a, ((ahyg) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 527;
    }
}
