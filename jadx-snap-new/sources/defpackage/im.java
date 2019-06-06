package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import defpackage.ik.a.a;

/* renamed from: im */
public class im implements Parcelable {
    public static final Creator<im> CREATOR = new 1();
    private boolean a = false;
    private Handler b;
    private ik c;

    /* renamed from: im$1 */
    static class 1 implements Creator<im> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new im(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new im[i];
        }
    }

    /* renamed from: im$a */
    class a extends defpackage.ik.a {
        a() {
        }

        public final void a(int i, Bundle bundle) {
            im.this.a(i, bundle);
        }
    }

    im(Parcel parcel) {
        ik ikVar = null;
        this.b = null;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            ikVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ik)) ? new a(readStrongBinder) : (ik) queryLocalInterface;
        }
        this.c = ikVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, Bundle bundle) {
    }

    public final void b(int i, Bundle bundle) {
        ik ikVar = this.c;
        if (ikVar != null) {
            try {
                ikVar.a(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.c == null) {
                this.c = new a();
            }
            parcel.writeStrongBinder(this.c.asBinder());
        }
    }
}
