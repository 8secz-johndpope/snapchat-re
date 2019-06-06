package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahyd.class)
/* renamed from: ahyc */
public class ahyc extends aezl implements aezk {
    @SerializedName("attachment_type")
    public String a;
    @SerializedName("long_form_video")
    public aiaj b;
    @SerializedName("web_view")
    public aicl c;
    @SerializedName("cta_text")
    public String d;
    @SerializedName("app_install")
    public ahxx e;
    @SerializedName("deep_link")
    public ahkn f;
    @SerializedName("localized_cta_text")
    public String g;

    /* renamed from: ahyc$a */
    public enum a {
        UNKNOWN_ATTACHMENT(r2),
        LONG_FORM_VIDEO(r3),
        WEB_VIEW(r4),
        APP_INSTALL(r5),
        DEEP_LINK(r6),
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

    public final ahyb b() {
        return ahyb.a(this.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahyc)) {
            ahyc ahyc = (ahyc) obj;
            return Objects.equal(this.a, ahyc.a) && Objects.equal(this.b, ahyc.b) && Objects.equal(this.c, ahyc.c) && Objects.equal(this.d, ahyc.d) && Objects.equal(this.e, ahyc.e) && Objects.equal(this.f, ahyc.f) && Objects.equal(this.g, ahyc.g);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        aiaj aiaj = this.b;
        hashCode = (hashCode + (aiaj == null ? 0 : aiaj.hashCode())) * 31;
        aicl aicl = this.c;
        hashCode = (hashCode + (aicl == null ? 0 : aicl.hashCode())) * 31;
        String str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ahxx ahxx = this.e;
        hashCode = (hashCode + (ahxx == null ? 0 : ahxx.hashCode())) * 31;
        ahkn ahkn = this.f;
        hashCode = (hashCode + (ahkn == null ? 0 : ahkn.hashCode())) * 31;
        str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
