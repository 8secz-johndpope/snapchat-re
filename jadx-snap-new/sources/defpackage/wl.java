package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: wl */
public abstract class wl implements Parcelable {
    private final String a;

    public wl(Parcel parcel) {
        this.a = parcel.readString();
    }

    public wl(String str) {
        this.a = str;
    }

    public static wl a(String str) {
        return wl.b(str) ? new xi(str) : new wr(str);
    }

    private static boolean b(String str) {
        return !TextUtils.isEmpty(str) && str.matches("^[a-zA-Z0-9]+_[a-zA-Z0-9]+_[a-zA-Z0-9_]+$");
    }

    public abstract String a();

    public String toString() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
