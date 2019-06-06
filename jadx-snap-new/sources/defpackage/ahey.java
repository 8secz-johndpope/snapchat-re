package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahez.class)
/* renamed from: ahey */
public class ahey extends aezl implements aezk {
    @SerializedName("label")
    public String a;
    @SerializedName("unicode")
    public String b;
    @SerializedName("status")
    public String c;
    @SerializedName("achieved_timestamp")
    public Long d = Long.valueOf(0);

    /* renamed from: ahey$a */
    public enum a {
        UNACHIEVED(r2),
        CURRENT(r3),
        ACHIEVED(r4),
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

    public final a a() {
        return a.a(this.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahey)) {
            ahey ahey = (ahey) obj;
            return Objects.equal(this.a, ahey.a) && Objects.equal(this.b, ahey.b) && Objects.equal(this.c, ahey.c) && Objects.equal(this.d, ahey.d);
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
        Long l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
