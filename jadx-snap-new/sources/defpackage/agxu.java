package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agxv.class)
/* renamed from: agxu */
public class agxu extends aeji implements aezk {
    @SerializedName("action")
    public String c;

    /* renamed from: agxu$a */
    public enum a {
        LIST(r2),
        DELETEALL(r3),
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
        return a.a(this.c);
    }

    public void b() {
        if (this.c == null) {
            throw new IllegalStateException("action is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agxu)) {
            agxu agxu = (agxu) obj;
            return super.equals(agxu) && Objects.equal(this.c, agxu.c);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
