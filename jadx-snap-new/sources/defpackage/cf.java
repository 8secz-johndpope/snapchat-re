package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: cf */
public final class cf {
    final cg a;
    private final ca b = new 1();

    /* renamed from: cf$1 */
    class 1 extends ca {
        1() {
        }

        public final void a(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                cf.this.a.a(i, uri, z, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        public final void a(int i, Bundle bundle) {
            try {
                cf.this.a.a(i, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        public final void a(Bundle bundle) {
            try {
                cf.this.a.a(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        public final void a(String str, Bundle bundle) {
            try {
                cf.this.a.a(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        public final void b(String str, Bundle bundle) {
            try {
                cf.this.a.b(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    public cf(cg cgVar) {
        this.a = cgVar;
    }

    public final IBinder a() {
        return this.a.asBinder();
    }

    public final boolean equals(Object obj) {
        return !(obj instanceof cf) ? false : ((cf) obj).a().equals(this.a.asBinder());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
