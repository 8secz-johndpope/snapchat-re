package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.chromium.base.annotations.CalledByNative;

public class UnguessableToken implements Parcelable {
    public static final Creator<UnguessableToken> CREATOR = new Creator<UnguessableToken>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            return (readLong == 0 || readLong2 == 0) ? null : new UnguessableToken(readLong, readLong2, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new UnguessableToken[i];
        }
    };
    private final long a;
    private final long b;

    private UnguessableToken(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    /* synthetic */ UnguessableToken(long j, long j2, byte b) {
        this(j, j2);
    }

    @CalledByNative
    private static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    @CalledByNative
    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken unguessableToken = (UnguessableToken) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return unguessableToken;
    }

    public int describeContents() {
        return 0;
    }

    @CalledByNative
    public long getHighForSerialization() {
        return this.a;
    }

    @CalledByNative
    public long getLowForSerialization() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
