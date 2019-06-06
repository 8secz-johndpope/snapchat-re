package defpackage;

import android.os.Parcel;
import com.brightcove.player.captioning.preferences.CaptionConstants;
import com.brightcove.player.media.MediaService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xc */
public abstract class xc<T> {
    private String a = CaptionConstants.PREF_CUSTOM;
    public String m = "form";
    public boolean n;
    public boolean o;
    public String p;

    protected xc(Parcel parcel) {
        this.a = parcel.readString();
        this.m = parcel.readString();
        boolean z = true;
        this.n = parcel.readByte() > (byte) 0;
        if (parcel.readByte() <= (byte) 0) {
            z = false;
        }
        this.o = z;
        this.p = parcel.readString();
    }

    public abstract String a();

    public abstract void a(JSONObject jSONObject, JSONObject jSONObject2);

    public abstract String b();

    public final String c() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("_meta", new wv().c(this.p).a(this.m).b(this.a).a);
            if (this.o) {
                jSONObject2.put("validate", this.n);
                jSONObject3.put(MediaService.OPTIONS, jSONObject2);
            }
            a(jSONObject, jSONObject3);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.m);
        parcel.writeByte(this.n);
        parcel.writeByte(this.o);
        parcel.writeString(this.p);
    }
}
