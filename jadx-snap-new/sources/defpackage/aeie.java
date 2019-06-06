package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeif.class)
/* renamed from: aeie */
public class aeie extends aesm implements aezk {
    @SerializedName("header")
    public aeof i;
    @SerializedName("retried")
    public Boolean j;
    @SerializedName("known_chat_sequence_numbers")
    public Map<String, Long> k;
    @SerializedName("mischief_version")
    public Long l;
    @SerializedName("seq_num")
    public Long m;
    @SerializedName("timestamp")
    public Long n;

    public aeie() {
        Long valueOf = Long.valueOf(0);
        this.l = valueOf;
        this.m = valueOf;
        this.n = valueOf;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeie)) {
            aeie aeie = (aeie) obj;
            return super.equals(aeie) && Objects.equal(this.i, aeie.i) && Objects.equal(this.j, aeie.j) && Objects.equal(this.k, aeie.k) && Objects.equal(this.l, aeie.l) && Objects.equal(this.m, aeie.m) && Objects.equal(this.n, aeie.n);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        aeof aeof = this.i;
        int i = 0;
        hashCode = (hashCode + (aeof == null ? 0 : aeof.hashCode())) * 31;
        Boolean bool = this.j;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map map = this.k;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Long l = this.l;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.m;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.n;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
