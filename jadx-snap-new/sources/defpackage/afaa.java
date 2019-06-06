package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afab.class)
/* renamed from: afaa */
public class afaa extends aezl implements aezk {
    @SerializedName("pack_id")
    public String c;
    @SerializedName("sticker_id")
    public String d;
    @SerializedName("sticker_type")
    public String e;
    @SerializedName("capabilities")
    public List<String> f;
    @SerializedName("creation_time")
    public Long g;
    @SerializedName("enc_key")
    public String h;
    @SerializedName("enc_iv")
    public String i;
    @SerializedName("last_used_time")
    public Long j;
    @SerializedName("facecut_origin_snap_id")
    public String k;
    @SerializedName("custom_sticker_type")
    public String l;
    @SerializedName("is_animated")
    public Boolean m;
    @SerializedName("external_src_url")
    public String n;
    @SerializedName("sticker_image_data")
    public byte[] o;
    @SerializedName("unique_id")
    public Long p;
    @SerializedName("unlockable_id")
    public Long q;
    @SerializedName("order")
    public Integer r;

    public final afax a() {
        return afax.a(this.e);
    }

    public final aeiy b() {
        return aeiy.a(this.l);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afaa)) {
            afaa afaa = (afaa) obj;
            return Objects.equal(this.c, afaa.c) && Objects.equal(this.d, afaa.d) && Objects.equal(this.e, afaa.e) && Objects.equal(this.f, afaa.f) && Objects.equal(this.g, afaa.g) && Objects.equal(this.h, afaa.h) && Objects.equal(this.i, afaa.i) && Objects.equal(this.j, afaa.j) && Objects.equal(this.k, afaa.k) && Objects.equal(this.l, afaa.l) && Objects.equal(this.m, afaa.m) && Objects.equal(this.n, afaa.n) && Objects.equal(this.o, afaa.o) && Objects.equal(this.p, afaa.p) && Objects.equal(this.q, afaa.q) && Objects.equal(this.r, afaa.r);
        }
    }

    public int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.g;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        l = this.j;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str2 = this.k;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.l;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.m;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.n;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        byte[] bArr = this.o;
        hashCode = (hashCode + (bArr == null ? 0 : bArr.hashCode())) * 31;
        l = this.p;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.q;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.r;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }
}
