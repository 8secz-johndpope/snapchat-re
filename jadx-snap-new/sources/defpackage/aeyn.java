package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeyo.class)
/* renamed from: aeyn */
public class aeyn extends aezl implements aezk {
    @SerializedName("is_reply")
    public Boolean a;
    @SerializedName("camera_front_facing")
    public Boolean b;
    @SerializedName("orientation")
    public String c;
    @SerializedName("country_code")
    public String d;
    @SerializedName("filter_id")
    public String e;
    @SerializedName("lens_id")
    public String f;
    @SerializedName("enc_geo_data")
    public String g;
    @SerializedName("caption_text")
    @Deprecated
    public String h;
    @SerializedName("snap_attachment")
    @Deprecated
    public aeye i;
    @SerializedName("venue_id")
    public String j;
    @SerializedName("snap_attachments")
    public List<aeye> k;
    @SerializedName("is_infinite_duration")
    public Boolean l;
    @SerializedName("multi_snap_metadata")
    public aetg m;
    @SerializedName("checksum")
    public String n;
    @SerializedName("context_hint")
    public String o;
    @SerializedName("animated_snap_type")
    public String p;
    @SerializedName("lens_metadata")
    public String q;
    @SerializedName("send_source")
    public String r;
    @SerializedName("capture_date")
    public Long s;
    @SerializedName("unlockables_snap_info")
    public String t;

    /* renamed from: aeyn$a */
    public enum a {
        SNAPORIENTATIONPORTRAIT(r2),
        SNAPORIENTATIONPORTRAITUPSIDEDOWN(r3),
        SNAPORIENTATIONLANDSCAPELEFT(r4),
        SNAPORIENTATIONLANDSCAPERIGHT(r5),
        UNRECOGNIZED_VALUE(r6);
        
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

    /* renamed from: aeyn$b */
    public enum b {
        CAMERA(r2),
        MEMORIES(r3),
        UNRECOGNIZED_VALUE(r4);
        
        private final String value;

        private b(String str) {
            this.value = str;
        }

        public static b a(String str) {
            if (str == null) {
                return UNRECOGNIZED_VALUE;
            }
            try {
                return b.valueOf(str.toUpperCase(Locale.US));
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

    public final aeda b() {
        return aeda.a(this.p);
    }

    public final b c() {
        return b.a(this.r);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeyn)) {
            aeyn aeyn = (aeyn) obj;
            return Objects.equal(this.a, aeyn.a) && Objects.equal(this.b, aeyn.b) && Objects.equal(this.c, aeyn.c) && Objects.equal(this.d, aeyn.d) && Objects.equal(this.e, aeyn.e) && Objects.equal(this.f, aeyn.f) && Objects.equal(this.g, aeyn.g) && Objects.equal(this.h, aeyn.h) && Objects.equal(this.i, aeyn.i) && Objects.equal(this.j, aeyn.j) && Objects.equal(this.k, aeyn.k) && Objects.equal(this.l, aeyn.l) && Objects.equal(this.m, aeyn.m) && Objects.equal(this.n, aeyn.n) && Objects.equal(this.o, aeyn.o) && Objects.equal(this.p, aeyn.p) && Objects.equal(this.q, aeyn.q) && Objects.equal(this.r, aeyn.r) && Objects.equal(this.s, aeyn.s) && Objects.equal(this.t, aeyn.t);
        }
    }

    public int hashCode() {
        Boolean bool = this.a;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) + 527) * 31;
        Boolean bool2 = this.b;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.f;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.g;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.h;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        aeye aeye = this.i;
        hashCode = (hashCode + (aeye == null ? 0 : aeye.hashCode())) * 31;
        str = this.j;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.k;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool2 = this.l;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        aetg aetg = this.m;
        hashCode = (hashCode + (aetg == null ? 0 : aetg.hashCode())) * 31;
        str = this.n;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.o;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.p;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.q;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.r;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.s;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str = this.t;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
