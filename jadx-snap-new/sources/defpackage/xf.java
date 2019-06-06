package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xf */
public final class xf implements Parcelable {
    public static final Creator<xf> CREATOR = new 1();
    public wq a;
    public boolean b;
    public String c;
    public String d;

    /* renamed from: xf$1 */
    static class 1 implements Creator<xf> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new xf(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new xf[i];
        }
    }

    private xf(Parcel parcel) {
        this.b = parcel.readByte() != (byte) 0;
        this.a = (wq) parcel.readParcelable(wq.class.getClassLoader());
        this.c = parcel.readString();
        this.d = parcel.readString();
    }

    /* synthetic */ xf(Parcel parcel, byte b) {
        this(parcel);
    }

    public static xf a(String str) {
        xf xfVar = new xf();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("paymentMethod");
            if (optJSONObject != null) {
                wq wqVar = new wq();
                wqVar.a(optJSONObject);
                xfVar.a = wqVar;
            }
            xfVar.b = jSONObject.getBoolean("success");
            if (!xfVar.b) {
                xfVar.c = str;
            }
        } catch (JSONException unused) {
            xfVar.b = false;
        }
        return xfVar;
    }

    public static xf b(String str) {
        xf xfVar = new xf();
        xfVar.b = false;
        xfVar.d = str;
        return xfVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.b);
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
