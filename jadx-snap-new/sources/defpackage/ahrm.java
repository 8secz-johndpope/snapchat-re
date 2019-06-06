package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahrn.class)
/* renamed from: ahrm */
public class ahrm extends aeji implements aezk {
    @SerializedName("otp_type")
    public String c;
    @SerializedName("odlv_pre_auth_token")
    public String d;

    /* renamed from: ahrm$a */
    public enum a {
        EMAIL_TOTP(r2),
        PHONE_TOTP(r3),
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahrm)) {
            ahrm ahrm = (ahrm) obj;
            return super.equals(ahrm) && Objects.equal(this.c, ahrm.c) && Objects.equal(this.d, ahrm.d);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.c;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return maskSensitiveValue(super.toString(), String.valueOf(this.d), 0);
    }
}
