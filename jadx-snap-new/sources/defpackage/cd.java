package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import defpackage.ch.a.a;

/* renamed from: cd */
public abstract class cd implements ServiceConnection {
    public abstract void onCustomTabsServiceConnected(ComponentName componentName, cb cbVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ch chVar;
        if (iBinder == null) {
            chVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            chVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ch)) ? new a(iBinder) : (ch) queryLocalInterface;
        }
        onCustomTabsServiceConnected(componentName, new cb(chVar, componentName) {
        });
    }
}
