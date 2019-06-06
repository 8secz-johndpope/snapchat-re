package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.brightcove.player.media.ErrorFields;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: uy */
public final class uy implements Parcelable {
    public static final Creator<uy> CREATOR = new 1();
    private String a;
    private String b;
    private List<uy> c;

    /* renamed from: uy$1 */
    static class 1 implements Creator<uy> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new uy(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new uy[i];
        }
    }

    protected uy(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.createTypedArrayList(CREATOR);
    }

    public static List<uy> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                uy uyVar = new uy();
                uyVar.a = up.a(jSONObject, "field", null);
                uyVar.b = up.a(jSONObject, ErrorFields.MESSAGE, null);
                uyVar.c = uy.a(jSONObject.optJSONArray("fieldErrors"));
                arrayList.add(uyVar);
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BraintreeError for ");
        stringBuilder.append(this.a);
        stringBuilder.append(": ");
        stringBuilder.append(this.b);
        stringBuilder.append(" -> ");
        List list = this.c;
        stringBuilder.append(list != null ? list.toString() : "");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeTypedList(this.c);
    }
}
