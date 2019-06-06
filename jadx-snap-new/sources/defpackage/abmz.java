package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: abmz */
public class abmz {
    @SerializedName("mId")
    public final String a;
    @SerializedName("mValue")
    public final String b;

    public abmz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    private static boolean a(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abmz)) {
            return false;
        }
        abmz abmz = (abmz) obj;
        return abmz.a(this.a, abmz.a) && abmz.a(this.b, abmz.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.b;
        return str2 != null ? (hashCode * 31) + str2.hashCode() : hashCode;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DeviceToken{id=");
        stringBuilder.append(this.a);
        stringBuilder.append(" value=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
