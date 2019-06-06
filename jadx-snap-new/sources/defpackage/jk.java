package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: jk */
public abstract class jk implements Parcelable {
    public static final Creator<jk> CREATOR = new 2();
    public static final jk EMPTY_STATE = new 1();
    private final Parcelable mSuperState;

    /* renamed from: jk$2 */
    static class 2 implements ClassLoaderCreator<jk> {
        2() {
        }

        private static jk a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return jk.EMPTY_STATE;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return 2.a(parcel, null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return 2.a(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new jk[i];
        }
    }

    /* renamed from: jk$1 */
    static class 1 extends jk {
        1() {
            super();
        }
    }

    private jk() {
        this.mSuperState = null;
    }

    protected jk(Parcel parcel) {
        this(parcel, null);
    }

    protected jk(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = EMPTY_STATE;
        }
        this.mSuperState = readParcelable;
    }

    protected jk(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == EMPTY_STATE) {
                parcelable = null;
            }
            this.mSuperState = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public int describeContents() {
        return 0;
    }

    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }
}
