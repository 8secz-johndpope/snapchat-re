package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: bsr */
public final class bsr implements Parcelable {
    public static final Creator<bsr> CREATOR = new 1();
    public final int a;
    public final blg[] b;
    private int c;

    /* renamed from: bsr$1 */
    static class 1 implements Creator<bsr> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new bsr(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new bsr[i];
        }
    }

    bsr(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = new blg[this.a];
        for (int i = 0; i < this.a; i++) {
            this.b[i] = (blg) parcel.readParcelable(blg.class.getClassLoader());
        }
    }

    public bsr(blg... blgArr) {
        byo.b(blgArr.length > 0);
        this.b = blgArr;
        this.a = blgArr.length;
    }

    public final int a(blg blg) {
        int i = 0;
        while (true) {
            blg[] blgArr = this.b;
            if (i >= blgArr.length) {
                return -1;
            }
            if (blg == blgArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bsr bsr = (bsr) obj;
            return this.a == bsr.a && Arrays.equals(this.b, bsr.b);
        }
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + 527;
        }
        return this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        for (int i2 = 0; i2 < this.a; i2++) {
            parcel.writeParcelable(this.b[i2], 0);
        }
    }
}
