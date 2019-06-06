package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.io.InputStream;

/* renamed from: abng */
public final class abng implements abnb {
    public static final Creator<abnb> CREATOR = new 1();

    /* renamed from: abng$1 */
    static class 1 implements Creator<abnb> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new abng();
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new abnb[i];
        }
    }

    public final InputStream a(InputStream inputStream) {
        return inputStream;
    }

    public final byte[] a(byte[] bArr) {
        return bArr;
    }

    public final InputStream b(InputStream inputStream) {
        return inputStream;
    }

    public final byte[] b(byte[] bArr) {
        return bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "UnencryptedEncryptionAlgorithm{}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
