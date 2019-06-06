package org.chromium.net;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build.VERSION;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import defpackage.akon;
import defpackage.akop;
import defpackage.akph;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.NetworkChangeNotifierAutoDetect.c;
import org.chromium.net.NetworkChangeNotifierAutoDetect.d;
import org.chromium.net.NetworkChangeNotifierAutoDetect.e;

public class NetworkChangeNotifier {
    @SuppressLint({"StaticFieldLeak"})
    private static NetworkChangeNotifier f;
    private static /* synthetic */ boolean g = (NetworkChangeNotifier.class.desiredAssertionStatus() ^ 1);
    private final ArrayList<Long> a = new ArrayList();
    private final akop<Object> b = new akop();
    private final ConnectivityManager c = ((ConnectivityManager) akon.a.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY));
    private NetworkChangeNotifierAutoDetect d;
    private int e = 0;

    protected NetworkChangeNotifier() {
    }

    public static NetworkChangeNotifier a() {
        if (g || f != null) {
            return f;
        }
        throw new AssertionError();
    }

    private void a(int i, long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            nativeNotifyConnectionTypeChanged(((Long) it.next()).longValue(), i, j);
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    private static void b() {
        a().a(false, new akph());
    }

    private void c() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.d;
        if (networkChangeNotifierAutoDetect != null) {
            networkChangeNotifierAutoDetect.a();
            this.d = null;
        }
    }

    private void c(int i) {
        a(i, getCurrentDefaultNetId());
    }

    @CalledByNative
    public static void fakeConnectionSubtypeChanged(int i) {
        b();
        a().b(i);
    }

    @CalledByNative
    public static void fakeDefaultNetwork(long j, int i) {
        b();
        a().a(i, j);
    }

    @CalledByNative
    public static void fakeNetworkConnected(long j, int i) {
        b();
        a().a(j, i);
    }

    @CalledByNative
    public static void fakeNetworkDisconnected(long j) {
        b();
        a().b(j);
    }

    @CalledByNative
    public static void fakeNetworkSoonToBeDisconnected(long j) {
        b();
        a().a(j);
    }

    @CalledByNative
    public static void fakePurgeActiveNetworkList(long[] jArr) {
        b();
        a().a(jArr);
    }

    @CalledByNative
    public static void forceConnectivityState(boolean z) {
        b();
        NetworkChangeNotifier a = a();
        int i = 0;
        if ((a.e != 6) != z) {
            if (!z) {
                i = 6;
            }
            a.a(i);
            a.b(z ^ 1);
        }
    }

    @CalledByNative
    public static NetworkChangeNotifier init() {
        if (f == null) {
            f = new NetworkChangeNotifier();
        }
        return f;
    }

    @CalledByNative
    public static boolean isProcessBoundToNetwork() {
        NetworkChangeNotifier a = a();
        if (VERSION.SDK_INT >= 21) {
            if (VERSION.SDK_INT < 23) {
                return ConnectivityManager.getProcessDefaultNetwork() != null;
            } else {
                if (a.c.getBoundNetworkForProcess() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private native void nativeNotifyConnectionTypeChanged(long j, int i, long j2);

    private native void nativeNotifyMaxBandwidthChanged(long j, int i);

    private native void nativeNotifyOfNetworkConnect(long j, long j2, int i);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    private native void nativeNotifyOfNetworkSoonToDisconnect(long j, long j2);

    private native void nativeNotifyPurgeActiveNetworkList(long j, long[] jArr);

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        this.e = i;
        c(i);
    }

    /* Access modifiers changed, original: final */
    public final void a(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkSoonToDisconnect(((Long) it.next()).longValue(), j);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(long j, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkConnect(((Long) it.next()).longValue(), j, i);
        }
    }

    public final void a(boolean z, e eVar) {
        if (!z) {
            c();
        } else if (this.d == null) {
            this.d = new NetworkChangeNotifierAutoDetect(new d() {
                public final void a(int i) {
                    NetworkChangeNotifier.this.a(i);
                }

                public final void a(long j) {
                    NetworkChangeNotifier.this.a(j);
                }

                public final void a(long j, int i) {
                    NetworkChangeNotifier.this.a(j, i);
                }

                public final void a(long[] jArr) {
                    NetworkChangeNotifier.this.a(jArr);
                }

                public final void b(int i) {
                    NetworkChangeNotifier.this.b(i);
                }

                public final void b(long j) {
                    NetworkChangeNotifier.this.b(j);
                }
            }, eVar);
            c d = this.d.d();
            a(d.a());
            b(d.b());
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(long[] jArr) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            nativeNotifyPurgeActiveNetworkList(((Long) it.next()).longValue(), jArr);
        }
    }

    @CalledByNative
    public void addNativeObserver(long j) {
        this.a.add(Long.valueOf(j));
    }

    /* Access modifiers changed, original: final */
    public final void b(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            nativeNotifyMaxBandwidthChanged(((Long) it.next()).longValue(), i);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkDisconnect(((Long) it.next()).longValue(), j);
        }
    }

    @CalledByNative
    public int getCurrentConnectionSubtype() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.d;
        return networkChangeNotifierAutoDetect == null ? 0 : networkChangeNotifierAutoDetect.d().b();
    }

    @CalledByNative
    public int getCurrentConnectionType() {
        return this.e;
    }

    @CalledByNative
    public long getCurrentDefaultNetId() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.d;
        if (networkChangeNotifierAutoDetect == null || VERSION.SDK_INT < 21) {
            return -1;
        }
        Network b = networkChangeNotifierAutoDetect.b.b();
        return b == null ? -1 : NetworkChangeNotifierAutoDetect.a(b);
    }

    @CalledByNative
    public long[] getCurrentNetworksAndTypes() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.d;
        int i = 0;
        if (networkChangeNotifierAutoDetect == null) {
            return new long[0];
        }
        if (VERSION.SDK_INT < 21) {
            return new long[0];
        }
        Network[] a = NetworkChangeNotifierAutoDetect.a(networkChangeNotifierAutoDetect.b, null);
        long[] jArr = new long[(a.length << 1)];
        int length = a.length;
        int i2 = 0;
        while (i < length) {
            Network network = a[i];
            int i3 = i2 + 1;
            jArr[i2] = NetworkChangeNotifierAutoDetect.a(network);
            i2 = i3 + 1;
            jArr[i3] = (long) networkChangeNotifierAutoDetect.b.a(network);
            i++;
        }
        return jArr;
    }

    @CalledByNative
    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.d;
        return networkChangeNotifierAutoDetect == null ? false : networkChangeNotifierAutoDetect.e;
    }

    @CalledByNative
    public void removeNativeObserver(long j) {
        this.a.remove(Long.valueOf(j));
    }
}
