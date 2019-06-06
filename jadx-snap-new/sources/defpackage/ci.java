package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ci */
public interface ci extends IInterface {

    /* renamed from: ci$a */
    public static abstract class a extends Binder implements ci {
        public a() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle = null;
            String str = "android.support.customtabs.IPostMessageService";
            cg a;
            if (i == 2) {
                parcel.enforceInterface(str);
                a = defpackage.cg.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(a, bundle);
            } else if (i == 3) {
                parcel.enforceInterface(str);
                a = defpackage.cg.a.a(parcel.readStrongBinder());
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(a, readString, bundle);
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(cg cgVar, Bundle bundle);

    void a(cg cgVar, String str, Bundle bundle);
}
