package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.protobuf.nano.MessageNano;
import defpackage.abqx.a;

/* renamed from: abqw */
public class abqw<T extends MessageNano> implements Parcelable {
    public static final Creator<abqw> CREATOR = new 1();
    protected T a;
    private final Class<? extends T> b;
    private Exception c;

    /* renamed from: abqw$1 */
    static class 1 implements Creator<abqw> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new abqw(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new abqw[i];
        }
    }

    protected abqw(Parcel parcel) {
        Class cls;
        Exception e;
        MessageNano messageNano = null;
        try {
            cls = Class.forName(parcel.readString());
            try {
                messageNano = abqx.a(cls, parcel.createByteArray());
            } catch (a | ClassNotFoundException e2) {
                e = e2;
            }
        } catch (a | ClassNotFoundException e3) {
            e = e3;
            cls = null;
            this.c = e;
            this.b = cls;
            this.a = messageNano;
        }
        this.b = cls;
        this.a = messageNano;
    }

    public abqw(T t) {
        this.a = t;
        this.b = t.getClass();
    }

    public final T a() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.getName());
        MessageNano messageNano = this.a;
        parcel.writeByteArray(messageNano == null ? null : MessageNano.toByteArray(messageNano));
    }
}
