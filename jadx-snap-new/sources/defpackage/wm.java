package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: wm */
public abstract class wm<T> extends xc<T> implements Parcelable {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;

    protected wm(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.g = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
    }

    public final String a() {
        return "credit_cards";
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject2.put("number", this.a);
        jSONObject2.put("cvv", this.b);
        jSONObject2.put("expirationMonth", this.c);
        jSONObject2.put("expirationYear", this.d);
        jSONObject2.put("expirationDate", this.q);
        jSONObject2.put("cardholderName", this.r);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("firstName", this.e);
        jSONObject3.put("lastName", this.f);
        jSONObject3.put("company", this.t);
        jSONObject3.put("countryName", this.u);
        jSONObject3.put("countryCodeAlpha2", this.g);
        jSONObject3.put("countryCodeAlpha3", this.v);
        jSONObject3.put("countryCodeNumeric", this.w);
        jSONObject3.put("locality", this.h);
        jSONObject3.put("postalCode", this.i);
        jSONObject3.put("region", this.j);
        jSONObject3.put("streetAddress", this.k);
        jSONObject3.put("extendedAddress", this.l);
        if (jSONObject3.length() > 0) {
            jSONObject2.put("billingAddress", jSONObject3);
        }
        jSONObject.put("creditCard", jSONObject2);
    }

    public final String b() {
        return "CreditCard";
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.g);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
    }
}
