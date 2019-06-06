package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: wn */
public class wn implements Parcelable {
    public static final Creator<wn> CREATOR = new 1();
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    /* renamed from: wn$1 */
    static class 1 implements Creator<wn> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new wn(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new wn[i];
        }
    }

    private wn(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
    }

    /* synthetic */ wn(Parcel parcel, byte b) {
        this(parcel);
    }

    protected static wn a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        wn wnVar = new wn();
        String str = "Unknown";
        wnVar.a = up.a(jSONObject, "prepaid", str);
        wnVar.b = up.a(jSONObject, "healthcare", str);
        wnVar.c = up.a(jSONObject, "debit", str);
        wnVar.d = up.a(jSONObject, "durbinRegulated", str);
        wnVar.e = up.a(jSONObject, "commercial", str);
        wnVar.f = up.a(jSONObject, "payroll", str);
        str = "";
        wnVar.g = up.a(jSONObject, "issuingBank", str);
        wnVar.h = up.a(jSONObject, "countryOfIssuance", str);
        wnVar.i = up.a(jSONObject, "productId", str);
        return wnVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
