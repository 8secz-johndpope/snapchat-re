package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aefh.class)
/* renamed from: aefg */
public class aefg extends aezl implements aezk {
    @SerializedName("conversation_id")
    public String a;
    @SerializedName("transaction_id")
    public String b;
    @SerializedName("sender_id")
    public String c;
    @SerializedName("sender_username")
    public String d;
    @SerializedName("recipient_id")
    public String e;
    @SerializedName("recipient_username")
    public String f;
    @SerializedName("amount")
    public Integer g;
    @SerializedName("currency_code")
    public String h;
    @SerializedName("message")
    public String i;
    @SerializedName("text_attribute_array")
    public List<afdk> j;
    @SerializedName("media_card_attribute_array")
    public List<aerx> k;
    @SerializedName("cash_tag_array")
    public List<aefe> l;
    @SerializedName("cash_tags")
    public String m;
    @SerializedName("created_at")
    public Long n;
    @SerializedName("last_updated_at")
    public Long o;
    @SerializedName("status")
    public Integer p;
    @SerializedName("invisible")
    public Boolean q;
    @SerializedName("sender_viewed")
    public Boolean r;
    @SerializedName("recipient_viewed")
    public Boolean s;
    @SerializedName("sender_saved")
    public Boolean t;
    @SerializedName("sender_save_version")
    public Integer u;
    @SerializedName("recipient_saved")
    public Boolean v;
    @SerializedName("recipient_save_version")
    public Integer w;
    @SerializedName("rain")
    public Boolean x;
    @SerializedName("provider")
    public String y = "SQUARE";

    /* renamed from: aefg$a */
    public enum a {
        SQUARE(r2),
        UNRECOGNIZED_VALUE(r3);
        
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
        return a.a(this.y);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aefg)) {
            aefg aefg = (aefg) obj;
            return Objects.equal(this.a, aefg.a) && Objects.equal(this.b, aefg.b) && Objects.equal(this.c, aefg.c) && Objects.equal(this.d, aefg.d) && Objects.equal(this.e, aefg.e) && Objects.equal(this.f, aefg.f) && Objects.equal(this.g, aefg.g) && Objects.equal(this.h, aefg.h) && Objects.equal(this.i, aefg.i) && Objects.equal(this.j, aefg.j) && Objects.equal(this.k, aefg.k) && Objects.equal(this.l, aefg.l) && Objects.equal(this.m, aefg.m) && Objects.equal(this.n, aefg.n) && Objects.equal(this.o, aefg.o) && Objects.equal(this.p, aefg.p) && Objects.equal(this.q, aefg.q) && Objects.equal(this.r, aefg.r) && Objects.equal(this.s, aefg.s) && Objects.equal(this.t, aefg.t) && Objects.equal(this.u, aefg.u) && Objects.equal(this.v, aefg.v) && Objects.equal(this.w, aefg.w) && Objects.equal(this.x, aefg.x) && Objects.equal(this.y, aefg.y);
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
        str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.g;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.j;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.k;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.l;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str2 = this.m;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.n;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.o;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        num = this.p;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.q;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.r;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.s;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.t;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        num = this.u;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bool = this.v;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        num = this.w;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bool = this.x;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.y;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
