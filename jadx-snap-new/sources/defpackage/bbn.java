package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bbn */
public abstract class bbn implements IInterface {
    private final IBinder a;
    private final String b;

    protected bbn(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, Parcel parcel) {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
