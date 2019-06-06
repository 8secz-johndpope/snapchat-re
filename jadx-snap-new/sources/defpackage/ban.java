package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ban */
public interface ban extends IInterface {

    /* renamed from: ban$a */
    public static abstract class a extends Binder implements ban {

        /* renamed from: ban$a$a */
        static class a implements ban {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public final void a(Bundle bundle, bam bam) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.firebase.jobdispatcher.IRemoteJobService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(bam != null ? bam.asBinder() : null);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void a(Bundle bundle, boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.firebase.jobdispatcher.IRemoteJobService");
                    int i = 0;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "com.firebase.jobdispatcher.IRemoteJobService");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            bam bam = null;
            String str = "com.firebase.jobdispatcher.IRemoteJobService";
            if (i == 1) {
                parcel.enforceInterface(str);
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.firebase.jobdispatcher.IJobCallback");
                    bam = (queryLocalInterface == null || !(queryLocalInterface instanceof bam)) ? new defpackage.bam.a.a(readStrongBinder) : (bam) queryLocalInterface;
                }
                a(bundle, bam);
                return true;
            } else if (i == 2) {
                Bundle bundle2;
                parcel.enforceInterface(str);
                if (parcel.readInt() != 0) {
                    bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(bundle2, parcel.readInt() != 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    void a(Bundle bundle, bam bam);

    void a(Bundle bundle, boolean z);
}
