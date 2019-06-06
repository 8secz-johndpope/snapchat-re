package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wr */
public final class wr extends wl {
    public static final Creator<wr> CREATOR = new 1();
    public String a;
    private String b;

    /* renamed from: wr$1 */
    static class 1 implements Creator<wr> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new wr(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new wr[i];
        }
    }

    protected wr(Parcel parcel) {
        super(parcel);
        this.b = parcel.readString();
        this.a = parcel.readString();
    }

    wr(String str) {
        super(str);
        try {
            if (str.matches("([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)")) {
                str = new String(Base64.decode(str, 0));
            }
            JSONObject jSONObject = new JSONObject(str);
            this.b = jSONObject.getString("configUrl");
            this.a = jSONObject.getString("authorizationFingerprint");
        } catch (NullPointerException | JSONException unused) {
            throw new vf("Client token was invalid");
        }
    }

    public final String a() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.a);
    }
}
