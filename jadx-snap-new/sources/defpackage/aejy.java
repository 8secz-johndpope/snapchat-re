package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aejz.class)
/* renamed from: aejy */
public class aejy extends aezl implements aezk {
    @SerializedName("type")
    public Integer a;
    @SerializedName("source")
    public String b;
    @SerializedName("title")
    public String c;
    @SerializedName("emoji_desc")
    public String d;
    @SerializedName("emoji_picker_desc")
    public String e;
    @SerializedName("default_type")
    public Integer f;
    @SerializedName("default_val")
    public String g;
    @SerializedName("emoji_legend_rank")
    public Integer h;

    public final aeka a() {
        return aeka.a(this.a);
    }

    public final aeka b() {
        return aeka.a(this.f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aejy)) {
            aejy aejy = (aejy) obj;
            return Objects.equal(this.a, aejy.a) && Objects.equal(this.b, aejy.b) && Objects.equal(this.c, aejy.c) && Objects.equal(this.d, aejy.d) && Objects.equal(this.e, aejy.e) && Objects.equal(this.f, aejy.f) && Objects.equal(this.g, aejy.g) && Objects.equal(this.h, aejy.h);
        }
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) + 527) * 31;
        String str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        str = this.g;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        num2 = this.h;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }
}
