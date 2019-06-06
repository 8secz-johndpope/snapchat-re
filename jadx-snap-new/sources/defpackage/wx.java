package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wx */
public final class wx extends xd implements Parcelable {
    public static final Creator<wx> CREATOR = new 1();
    public wz a;
    private String d;
    private xe e;
    private xe f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;

    /* renamed from: wx$1 */
    static class 1 implements Creator<wx> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new wx(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new wx[i];
        }
    }

    private wx(Parcel parcel) {
        super(parcel);
        this.d = parcel.readString();
        this.e = (xe) parcel.readParcelable(xe.class.getClassLoader());
        this.f = (xe) parcel.readParcelable(xe.class.getClassLoader());
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.j = parcel.readString();
        this.i = parcel.readString();
        this.k = parcel.readString();
        this.a = (wz) parcel.readParcelable(wz.class.getClassLoader());
    }

    /* synthetic */ wx(Parcel parcel, byte b) {
        this(parcel);
    }

    public static wx a(String str) {
        wx wxVar = new wx();
        wxVar.a(xd.a("paypalAccounts", str));
        return wxVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        String str = "accountAddress";
        String str2 = "creditFinancingOffered";
        String str3 = "";
        super.a(jSONObject);
        jSONObject = jSONObject.getJSONObject("details");
        String str4 = "email";
        this.j = up.a(jSONObject, str4, null);
        this.d = up.a(jSONObject, "correlationId", null);
        try {
            if (jSONObject.has(str2)) {
                this.a = wz.a(jSONObject.getJSONObject(str2));
            }
            jSONObject = jSONObject.getJSONObject("payerInfo");
            if (!jSONObject.has(str)) {
                str = "billingAddress";
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("shippingAddress");
            this.e = xe.a(optJSONObject);
            this.f = xe.a(optJSONObject2);
            this.g = up.a(jSONObject, "firstName", str3);
            this.h = up.a(jSONObject, "lastName", str3);
            this.i = up.a(jSONObject, "phone", str3);
            this.k = up.a(jSONObject, "payerId", str3);
            if (this.j == null) {
                this.j = up.a(jSONObject, str4, null);
            }
        } catch (JSONException unused) {
            this.e = new xe();
            this.f = new xe();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.j);
        parcel.writeString(this.i);
        parcel.writeString(this.k);
        parcel.writeParcelable(this.a, i);
    }
}
