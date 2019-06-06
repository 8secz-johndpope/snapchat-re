package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeyd.class)
/* renamed from: aeyc */
public class aeyc extends aezl implements aezk {
    @SerializedName("id")
    public String O;
    @SerializedName("st")
    public Integer P;
    @SerializedName("m")
    public Integer Q;
    @SerializedName("ts")
    public Long R;
    @SerializedName("sts")
    public Long S;
    @SerializedName("zipped")
    public Boolean T;
    @SerializedName("pts")
    public Long U;
    @SerializedName("orientation")
    public Integer V;
    @SerializedName("snap_metadata")
    public aeyn W;
    @SerializedName("send_start_timestamp")
    public Long X;
    @SerializedName("reply_medias")
    public List<aerv> Y;
    @SerializedName("seq_num")
    public Long Z;
    @SerializedName("view_timestamp")
    public Long aa;

    public aeyc() {
        Long valueOf = Long.valueOf(0);
        this.R = valueOf;
        this.S = valueOf;
        this.U = valueOf;
    }

    public void b() {
        if (this.O == null) {
            throw new IllegalStateException("id is required to be initialized.");
        }
    }

    public final agqc c() {
        return agqc.a(this.V);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeyc)) {
            aeyc aeyc = (aeyc) obj;
            return Objects.equal(this.O, aeyc.O) && Objects.equal(this.P, aeyc.P) && Objects.equal(this.Q, aeyc.Q) && Objects.equal(this.R, aeyc.R) && Objects.equal(this.S, aeyc.S) && Objects.equal(this.T, aeyc.T) && Objects.equal(this.U, aeyc.U) && Objects.equal(this.V, aeyc.V) && Objects.equal(this.W, aeyc.W) && Objects.equal(this.X, aeyc.X) && Objects.equal(this.Y, aeyc.Y) && Objects.equal(this.Z, aeyc.Z) && Objects.equal(this.aa, aeyc.aa);
        }
    }

    public int hashCode() {
        String str = this.O;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Integer num = this.P;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.Q;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.R;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.S;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.T;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        l = this.U;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        num = this.V;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        aeyn aeyn = this.W;
        hashCode = (hashCode + (aeyn == null ? 0 : aeyn.hashCode())) * 31;
        l = this.X;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.Y;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        l = this.Z;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.aa;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
