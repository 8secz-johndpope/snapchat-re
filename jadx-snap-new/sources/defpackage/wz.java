package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: wz */
public class wz implements Parcelable {
    public static final Creator<wz> CREATOR = new 1();
    private boolean a;
    private xa b;
    private boolean c;
    private int d;
    private xa e;
    private xa f;

    /* renamed from: wz$1 */
    static class 1 implements Creator<wz> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new wz(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new wz[i];
        }
    }

    private wz() {
    }

    private wz(Parcel parcel) {
        boolean z = true;
        this.a = parcel.readByte() != (byte) 0;
        this.b = (xa) parcel.readParcelable(xa.class.getClassLoader());
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.c = z;
        this.d = parcel.readInt();
        this.e = (xa) parcel.readParcelable(xa.class.getClassLoader());
        this.f = (xa) parcel.readParcelable(xa.class.getClassLoader());
    }

    /* synthetic */ wz(Parcel parcel, byte b) {
        this(parcel);
    }

    public static wz a(JSONObject jSONObject) {
        wz wzVar = new wz();
        if (jSONObject == null) {
            return wzVar;
        }
        wzVar.a = jSONObject.optBoolean("cardAmountImmutable", false);
        wzVar.b = xa.a(jSONObject.getJSONObject("monthlyPayment"));
        wzVar.c = jSONObject.optBoolean("payerAcceptance", false);
        wzVar.d = jSONObject.optInt("term", 0);
        wzVar.e = xa.a(jSONObject.getJSONObject("totalCost"));
        wzVar.f = xa.a(jSONObject.getJSONObject("totalInterest"));
        return wzVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeByte(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }
}
