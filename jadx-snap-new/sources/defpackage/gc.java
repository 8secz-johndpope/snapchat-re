package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: gc */
final class gc implements Parcelable {
    public static final Creator<gc> CREATOR = new 1();
    ge[] a;
    int[] b;
    ft[] c;
    int d = -1;
    int e;

    /* renamed from: gc$1 */
    static class 1 implements Creator<gc> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new gc(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new gc[i];
        }
    }

    public gc(Parcel parcel) {
        this.a = (ge[]) parcel.createTypedArray(ge.CREATOR);
        this.b = parcel.createIntArray();
        this.c = (ft[]) parcel.createTypedArray(ft.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
        parcel.writeIntArray(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
