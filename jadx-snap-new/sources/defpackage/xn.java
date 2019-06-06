package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: xn */
public class xn implements Parcelable {
    public static final Creator<xn> CREATOR = new 1();
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    /* renamed from: xn$1 */
    static class 1 implements Creator<xn> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new xn(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new xn[i];
        }
    }

    public xn(Parcel parcel) {
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

    public static xn a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        xn xnVar = new xn();
        String str = "";
        xnVar.a = up.a(jSONObject, "firstName", str);
        xnVar.b = up.a(jSONObject, "lastName", str);
        xnVar.c = up.a(jSONObject, "streetAddress", str);
        xnVar.d = up.a(jSONObject, "extendedAddress", str);
        xnVar.e = up.a(jSONObject, "locality", str);
        xnVar.f = up.a(jSONObject, "region", str);
        xnVar.g = up.a(jSONObject, "postalCode", str);
        xnVar.h = up.a(jSONObject, "countryCode", str);
        xnVar.i = up.a(jSONObject, "phoneNumber", str);
        return xnVar;
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
