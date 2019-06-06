package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.brightcove.player.media.ErrorFields;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vd */
public final class vd extends Exception implements Parcelable {
    public static final Creator<vd> CREATOR = new 1();
    private int a;
    private String b;
    private String c;
    private List<uy> d;

    /* renamed from: vd$1 */
    static class 1 implements Creator<vd> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new vd(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vd[i];
        }
    }

    private vd() {
    }

    public vd(int i, String str) {
        this.a = i;
        this.c = str;
        try {
            b(str);
        } catch (JSONException unused) {
            this.b = "Parsing error response failed";
            this.d = new ArrayList();
        }
    }

    protected vd(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.createTypedArrayList(uy.CREATOR);
    }

    public static vd a(String str) {
        vd vdVar = new vd();
        vdVar.c = str;
        vdVar.b(str);
        return vdVar;
    }

    private void b(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject.getJSONObject("error").getString(ErrorFields.MESSAGE);
        this.d = uy.a(jSONObject.optJSONArray("fieldErrors"));
    }

    public final int describeContents() {
        return 0;
    }

    public final String getMessage() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ErrorWithResponse (");
        stringBuilder.append(this.a);
        stringBuilder.append("): ");
        stringBuilder.append(this.b);
        stringBuilder.append("\n");
        stringBuilder.append(this.d.toString());
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeTypedList(this.d);
    }
}
