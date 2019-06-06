package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: bss */
public final class bss implements Parcelable {
    public static final Creator<bss> CREATOR = new 1();
    public static final bss a = new bss(new bsr[0]);
    public final int b;
    public final bsr[] c;
    private int d;

    /* renamed from: bss$1 */
    static class 1 implements Creator<bss> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new bss(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new bss[i];
        }
    }

    bss(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = new bsr[this.b];
        for (int i = 0; i < this.b; i++) {
            this.c[i] = (bsr) parcel.readParcelable(bsr.class.getClassLoader());
        }
    }

    public bss(bsr... bsrArr) {
        this.c = bsrArr;
        this.b = bsrArr.length;
    }

    public final int a(bsr bsr) {
        for (int i = 0; i < this.b; i++) {
            if (this.c[i] == bsr) {
                return i;
            }
        }
        return -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bss bss = (bss) obj;
            return this.b == bss.b && Arrays.equals(this.c, bss.c);
        }
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = Arrays.hashCode(this.c);
        }
        return this.d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        for (int i2 = 0; i2 < this.b; i2++) {
            parcel.writeParcelable(this.c[i2], 0);
        }
    }
}
