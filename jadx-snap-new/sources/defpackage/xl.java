package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: xl */
public final class xl extends xd implements Parcelable {
    public static final Creator<xl> CREATOR = new 1();
    private String a;

    /* renamed from: xl$1 */
    static class 1 implements Creator<xl> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new xl(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new xl[i];
        }
    }

    protected xl(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    public xl(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.a = str3;
    }

    public static xl a(String str) {
        xl xlVar = new xl();
        xlVar.a(xd.a("venmoAccounts", str));
        return xlVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        this.a = jSONObject.getJSONObject("details").getString("username");
        this.c = this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }
}
