package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: xa */
public class xa implements Parcelable {
    public static final Creator<xa> CREATOR = new 1();
    private String a;
    private String b;

    /* renamed from: xa$1 */
    static class 1 implements Creator<xa> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new xa(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new xa[i];
        }
    }

    private xa() {
    }

    private xa(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    /* synthetic */ xa(Parcel parcel, byte b) {
        this(parcel);
    }

    public static xa a(JSONObject jSONObject) {
        xa xaVar = new xa();
        if (jSONObject == null) {
            return xaVar;
        }
        xaVar.a = up.a(jSONObject, "currency", null);
        xaVar.b = up.a(jSONObject, "value", null);
        return xaVar;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("%s %s", new Object[]{this.b, this.a});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
