package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bbo */
public abstract class bbo extends Binder implements IInterface {
    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    public IBinder asBinder() {
        return this;
    }
}
