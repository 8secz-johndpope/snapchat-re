package defpackage;

import android.net.NetworkInfo;

/* renamed from: dbe */
final class dbe {
    static int a(NetworkInfo networkInfo) {
        return (networkInfo.isConnectedOrConnecting() && networkInfo.getType() == 1) ? 1 : 0;
    }
}
