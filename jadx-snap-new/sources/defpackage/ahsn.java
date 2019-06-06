package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahso.class)
/* renamed from: ahsn */
public class ahsn extends aedh implements aezk {
    @SerializedName("url")
    public String a;

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("url is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahsn)) {
            ahsn ahsn = (ahsn) obj;
            return super.equals(ahsn) && Objects.equal(this.a, ahsn.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
