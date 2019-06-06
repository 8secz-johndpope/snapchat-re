package org.chromium.net;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.NetworkRequest;
import android.net.NetworkRequest.Builder;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import defpackage.akon;
import java.util.Arrays;
import org.chromium.base.ApplicationStatus;

@SuppressLint({"NewApi"})
public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    final d a;
    a b;
    boolean c;
    boolean d;
    boolean e;
    private final Looper f = Looper.myLooper();
    private final Handler g = new Handler(this.f);
    private final NetworkConnectivityIntentFilter h;
    private final e i;
    private f j;
    private b k;
    private NetworkRequest l;
    private c m;
    private boolean n;

    @TargetApi(21)
    class b extends NetworkCallback {
        private static /* synthetic */ boolean c = (NetworkChangeNotifierAutoDetect.class.desiredAssertionStatus() ^ 1);
        private Network b;

        private b() {
        }

        /* synthetic */ b(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, byte b) {
            this();
        }

        private boolean a(Network network) {
            Network network2 = this.b;
            return (network2 == null || network2.equals(network)) ? false : true;
        }

        private boolean a(Network network, NetworkCapabilities networkCapabilities) {
            if (!a(network)) {
                if (networkCapabilities == null) {
                    networkCapabilities = NetworkChangeNotifierAutoDetect.this.b.c(network);
                }
                Object obj = (networkCapabilities == null || (networkCapabilities.hasTransport(4) && !a.b(network))) ? 1 : null;
                return obj != null;
            }
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            Network[] b = NetworkChangeNotifierAutoDetect.a(NetworkChangeNotifierAutoDetect.this.b, null);
            this.b = null;
            if (b.length == 1) {
                NetworkCapabilities c = NetworkChangeNotifierAutoDetect.this.b.c(b[0]);
                if (c != null && c.hasTransport(4)) {
                    this.b = b[0];
                }
            }
        }

        public final void onAvailable(Network network) {
            NetworkCapabilities c = NetworkChangeNotifierAutoDetect.this.b.c(network);
            if (!a(network, c)) {
                final boolean hasTransport = c.hasTransport(4);
                if (hasTransport) {
                    this.b = network;
                }
                final long a = NetworkChangeNotifierAutoDetect.a(network);
                final int a2 = NetworkChangeNotifierAutoDetect.this.b.a(network);
                NetworkChangeNotifierAutoDetect.this.a(new Runnable() {
                    public final void run() {
                        NetworkChangeNotifierAutoDetect.this.a.a(a, a2);
                        if (hasTransport) {
                            NetworkChangeNotifierAutoDetect.this.a.a(a2);
                            NetworkChangeNotifierAutoDetect.this.a.a(new long[]{a});
                        }
                    }
                });
            }
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (!a(network, networkCapabilities)) {
                final long a = NetworkChangeNotifierAutoDetect.a(network);
                final int a2 = NetworkChangeNotifierAutoDetect.this.b.a(network);
                NetworkChangeNotifierAutoDetect.this.a(new Runnable() {
                    public final void run() {
                        NetworkChangeNotifierAutoDetect.this.a.a(a, a2);
                    }
                });
            }
        }

        public final void onLosing(Network network, int i) {
            if (!a(network, null)) {
                final long a = NetworkChangeNotifierAutoDetect.a(network);
                NetworkChangeNotifierAutoDetect.this.a(new Runnable() {
                    public final void run() {
                        NetworkChangeNotifierAutoDetect.this.a.a(a);
                    }
                });
            }
        }

        public final void onLost(final Network network) {
            if (!a(network)) {
                NetworkChangeNotifierAutoDetect.this.a(new Runnable() {
                    public final void run() {
                        NetworkChangeNotifierAutoDetect.this.a.b(NetworkChangeNotifierAutoDetect.a(network));
                    }
                });
                Network network2 = this.b;
                if (network2 != null) {
                    if (c || network.equals(network2)) {
                        this.b = null;
                        for (Network onAvailable : NetworkChangeNotifierAutoDetect.a(NetworkChangeNotifierAutoDetect.this.b, network)) {
                            onAvailable(onAvailable);
                        }
                        final int a = NetworkChangeNotifierAutoDetect.this.d().a();
                        NetworkChangeNotifierAutoDetect.this.a(new Runnable() {
                            public final void run() {
                                NetworkChangeNotifierAutoDetect.this.a.a(a);
                            }
                        });
                    } else {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    static class a {
        private static /* synthetic */ boolean b = (NetworkChangeNotifierAutoDetect.class.desiredAssertionStatus() ^ 1);
        final ConnectivityManager a;

        a() {
            this.a = null;
        }

        a(Context context) {
            this.a = (ConnectivityManager) context.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY);
        }

        @TargetApi(21)
        private static NetworkInfo a(NetworkInfo networkInfo) {
            return networkInfo == null ? null : networkInfo.isConnected() ? networkInfo : (VERSION.SDK_INT >= 21 && networkInfo.getDetailedState() == DetailedState.BLOCKED && ApplicationStatus.getStateForApplication() == 1) ? networkInfo : null;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0012 */
        @android.annotation.TargetApi(21)
        protected static boolean b(android.net.Network r1) {
            /*
            r0 = new java.net.Socket;
            r0.<init>();
            r1.bindSocket(r0);	 Catch:{ IOException -> 0x0012, all -> 0x000d }
            r0.close();	 Catch:{ IOException -> 0x000b }
        L_0x000b:
            r1 = 1;
            return r1;
        L_0x000d:
            r1 = move-exception;
            r0.close();	 Catch:{ IOException -> 0x0011 }
        L_0x0011:
            throw r1;
        L_0x0012:
            r0.close();	 Catch:{ IOException -> 0x0015 }
        L_0x0015:
            r1 = 0;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.NetworkChangeNotifierAutoDetect$a.b(android.net.Network):boolean");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
        /* JADX WARNING: Missing block: B:5:0x000d, code skipped:
            return r1.a.getNetworkInfo(r2);
     */
        /* JADX WARNING: Missing block: B:8:0x000f, code skipped:
            return null;
     */
        private android.net.NetworkInfo d(android.net.Network r2) {
            /*
            r1 = this;
            r0 = r1.a;	 Catch:{ NullPointerException -> 0x0007 }
            r2 = r0.getNetworkInfo(r2);	 Catch:{ NullPointerException -> 0x0007 }
            return r2;
        L_0x0007:
            r0 = r1.a;	 Catch:{ NullPointerException -> 0x000e }
            r2 = r0.getNetworkInfo(r2);	 Catch:{ NullPointerException -> 0x000e }
            return r2;
        L_0x000e:
            r2 = 0;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.NetworkChangeNotifierAutoDetect$a.d(android.net.Network):android.net.NetworkInfo");
        }

        /* Access modifiers changed, original: final */
        @TargetApi(21)
        public final int a(Network network) {
            NetworkInfo d = d(network);
            if (d != null && d.getType() == 17) {
                d = this.a.getActiveNetworkInfo();
            }
            return (d == null || !d.isConnected()) ? 6 : NetworkChangeNotifierAutoDetect.a(d.getType(), d.getSubtype());
        }

        /* Access modifiers changed, original: final */
        public final c a(f fVar) {
            Network b;
            NetworkInfo networkInfo;
            if (VERSION.SDK_INT >= 23) {
                b = b();
                networkInfo = this.a.getNetworkInfo(b);
            } else {
                networkInfo = this.a.getActiveNetworkInfo();
                b = null;
            }
            networkInfo = a(networkInfo);
            if (networkInfo == null) {
                return new c(false, -1, -1, null);
            }
            if (b != null) {
                return new c(true, networkInfo.getType(), networkInfo.getSubtype(), String.valueOf(NetworkChangeNotifierAutoDetect.a(b)));
            }
            if (!b && VERSION.SDK_INT >= 23) {
                throw new AssertionError();
            } else if (networkInfo.getType() != 1) {
                return new c(true, networkInfo.getType(), networkInfo.getSubtype(), null);
            } else {
                if (networkInfo.getExtraInfo() != null) {
                    if (!"".equals(networkInfo.getExtraInfo())) {
                        return new c(true, networkInfo.getType(), networkInfo.getSubtype(), networkInfo.getExtraInfo());
                    }
                }
                return new c(true, networkInfo.getType(), networkInfo.getSubtype(), fVar.a());
            }
        }

        /* Access modifiers changed, original: final */
        @TargetApi(21)
        public final void a(NetworkCallback networkCallback) {
            this.a.unregisterNetworkCallback(networkCallback);
        }

        /* Access modifiers changed, original: protected|final */
        @TargetApi(21)
        public final Network[] a() {
            Network[] allNetworks = this.a.getAllNetworks();
            return allNetworks == null ? new Network[0] : allNetworks;
        }

        /* Access modifiers changed, original: final */
        @TargetApi(21)
        public final Network b() {
            Network activeNetwork;
            if (VERSION.SDK_INT >= 23) {
                activeNetwork = this.a.getActiveNetwork();
                if (activeNetwork != null) {
                    return activeNetwork;
                }
            }
            activeNetwork = null;
            NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            for (Network network : NetworkChangeNotifierAutoDetect.a(this, null)) {
                NetworkInfo d = d(network);
                if (d != null && (d.getType() == activeNetworkInfo.getType() || d.getType() == 17)) {
                    if (b || activeNetwork == null) {
                        activeNetwork = network;
                    } else {
                        throw new AssertionError();
                    }
                }
            }
            return activeNetwork;
        }

        /* Access modifiers changed, original: protected|final */
        @TargetApi(21)
        public final NetworkCapabilities c(Network network) {
            return this.a.getNetworkCapabilities(network);
        }
    }

    @SuppressLint({"NewApi", "ParcelCreator"})
    static class NetworkConnectivityIntentFilter extends IntentFilter {
        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static class c {
        final String a;
        private final boolean b;
        private final int c;
        private final int d;

        public c(boolean z, int i, int i2, String str) {
            this.b = z;
            this.c = i;
            this.d = i2;
            if (str == null) {
                str = "";
            }
            this.a = str;
        }

        public final int a() {
            return !this.b ? 6 : NetworkChangeNotifierAutoDetect.a(this.c, this.d);
        }

        public final int b() {
            if (!this.b) {
                return 1;
            }
            if (this.c != 0) {
                return 0;
            }
            switch (this.d) {
                case 1:
                    return 7;
                case 2:
                    return 8;
                case 3:
                    return 9;
                case 4:
                    return 5;
                case 5:
                    return 10;
                case 6:
                    return 11;
                case 7:
                    return 6;
                case 8:
                    return 14;
                case 9:
                    return 15;
                case 10:
                    return 12;
                case 11:
                    return 4;
                case 12:
                    return 13;
                case 13:
                    return 18;
                case 14:
                    return 16;
                case 15:
                    return 17;
                default:
                    return 0;
            }
        }
    }

    public static abstract class e {
        protected static final /* synthetic */ boolean b = (NetworkChangeNotifierAutoDetect.class.desiredAssertionStatus() ^ 1);
        protected NetworkChangeNotifierAutoDetect a;

        /* Access modifiers changed, original: protected|final */
        public final void a() {
            if (b || this.a != null) {
                this.a.b();
                return;
            }
            throw new AssertionError();
        }

        /* Access modifiers changed, original: protected */
        public void a(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.a = networkChangeNotifierAutoDetect;
        }

        public abstract void b();
    }

    public interface d {
        void a(int i);

        void a(long j);

        void a(long j, int i);

        void a(long[] jArr);

        void b(int i);

        void b(long j);
    }

    static class f {
        private static /* synthetic */ boolean f = (NetworkChangeNotifierAutoDetect.class.desiredAssertionStatus() ^ 1);
        private final Context a;
        private final Object b;
        private boolean c;
        private boolean d;
        private WifiManager e;

        f() {
            this.b = new Object();
            this.a = null;
        }

        f(Context context) {
            this.b = new Object();
            if (f || VERSION.SDK_INT < 23) {
                this.a = context;
                return;
            }
            throw new AssertionError();
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
        /* JADX WARNING: Missing block: B:5:0x000d, code skipped:
            return r1.e.getConnectionInfo();
     */
        /* JADX WARNING: Missing block: B:8:0x000f, code skipped:
            return null;
     */
        private android.net.wifi.WifiInfo b() {
            /*
            r1 = this;
            r0 = r1.e;	 Catch:{ NullPointerException -> 0x0007 }
            r0 = r0.getConnectionInfo();	 Catch:{ NullPointerException -> 0x0007 }
            return r0;
        L_0x0007:
            r0 = r1.e;	 Catch:{ NullPointerException -> 0x000e }
            r0 = r0.getConnectionInfo();	 Catch:{ NullPointerException -> 0x000e }
            return r0;
        L_0x000e:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.NetworkChangeNotifierAutoDetect$f.b():android.net.wifi.WifiInfo");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x0054 in {8, 9, 12, 13, 14, 20, 23, 26, 30} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final java.lang.String a() {
            /*
            r4 = this;
            r0 = r4.b;
            monitor-enter(r0);
            r1 = r4.c;	 Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x000a;	 Catch:{ all -> 0x0051 }
            r1 = r4.d;	 Catch:{ all -> 0x0051 }
            goto L_0x0039;	 Catch:{ all -> 0x0051 }
            r1 = r4.a;	 Catch:{ all -> 0x0051 }
            r1 = r1.getPackageManager();	 Catch:{ all -> 0x0051 }
            r2 = "android.permission.ACCESS_WIFI_STATE";	 Catch:{ all -> 0x0051 }
            r3 = r4.a;	 Catch:{ all -> 0x0051 }
            r3 = r3.getPackageName();	 Catch:{ all -> 0x0051 }
            r1 = r1.checkPermission(r2, r3);	 Catch:{ all -> 0x0051 }
            r2 = 1;	 Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x0021;	 Catch:{ all -> 0x0051 }
            r1 = 1;	 Catch:{ all -> 0x0051 }
            goto L_0x0022;	 Catch:{ all -> 0x0051 }
            r1 = 0;	 Catch:{ all -> 0x0051 }
            r4.d = r1;	 Catch:{ all -> 0x0051 }
            r1 = r4.d;	 Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0033;	 Catch:{ all -> 0x0051 }
            r1 = r4.a;	 Catch:{ all -> 0x0051 }
            r3 = "wifi";	 Catch:{ all -> 0x0051 }
            r1 = r1.getSystemService(r3);	 Catch:{ all -> 0x0051 }
            r1 = (android.net.wifi.WifiManager) r1;	 Catch:{ all -> 0x0051 }
            goto L_0x0034;	 Catch:{ all -> 0x0051 }
            r1 = 0;	 Catch:{ all -> 0x0051 }
            r4.e = r1;	 Catch:{ all -> 0x0051 }
            r4.c = r2;	 Catch:{ all -> 0x0051 }
            goto L_0x0007;	 Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x004b;	 Catch:{ all -> 0x0051 }
            r1 = r4.b();	 Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0047;	 Catch:{ all -> 0x0051 }
            r1 = r1.getSSID();	 Catch:{ all -> 0x0051 }
            monitor-exit(r0);	 Catch:{ all -> 0x0051 }
            return r1;	 Catch:{ all -> 0x0051 }
            r1 = "";	 Catch:{ all -> 0x0051 }
            monitor-exit(r0);	 Catch:{ all -> 0x0051 }
            return r1;	 Catch:{ all -> 0x0051 }
            monitor-exit(r0);	 Catch:{ all -> 0x0051 }
            r0 = org.chromium.net.AndroidNetworkLibrary.getWifiSSID();
            return r0;
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0051 }
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.NetworkChangeNotifierAutoDetect$f.a():java.lang.String");
        }
    }

    static {
        NetworkChangeNotifierAutoDetect.class.getSimpleName();
    }

    @TargetApi(21)
    public NetworkChangeNotifierAutoDetect(d dVar, e eVar) {
        NetworkRequest build;
        this.a = dVar;
        this.b = new a(akon.a);
        if (VERSION.SDK_INT < 23) {
            this.j = new f(akon.a);
        }
        if (VERSION.SDK_INT >= 21) {
            this.k = new b(this, (byte) 0);
            build = new Builder().addCapability(12).removeCapability(15).build();
        } else {
            build = null;
            this.k = null;
        }
        this.l = build;
        this.m = d();
        this.h = new NetworkConnectivityIntentFilter();
        this.d = false;
        this.n = false;
        this.i = eVar;
        this.i.a(this);
        this.n = true;
    }

    @TargetApi(21)
    static long a(Network network) {
        return VERSION.SDK_INT >= 23 ? network.getNetworkHandle() : (long) Integer.parseInt(network.toString());
    }

    @TargetApi(21)
    static Network[] a(a aVar, Network network) {
        Network[] a = aVar.a();
        int i = 0;
        for (Network network2 : a) {
            if (!network2.equals(network)) {
                NetworkCapabilities c = aVar.c(network2);
                if (c != null && c.hasCapability(12)) {
                    if (!c.hasTransport(4)) {
                        int i2 = i + 1;
                        a[i] = network2;
                        i = i2;
                    } else if (a.b(network2)) {
                        return new Network[]{network2};
                    }
                }
            }
        }
        return (Network[]) Arrays.copyOf(a, i);
    }

    public final void a() {
        this.i.b();
        c();
    }

    /* Access modifiers changed, original: final */
    public final void a(Runnable runnable) {
        if ((this.f == Looper.myLooper() ? 1 : null) != null) {
            runnable.run();
        } else {
            this.g.post(runnable);
        }
    }

    public final void b() {
        if (!this.c) {
            if (this.n) {
                e();
            }
            this.d = akon.a.registerReceiver(this, this.h) != null;
            this.c = true;
            b bVar = this.k;
            if (bVar != null) {
                bVar.a();
                try {
                    this.b.a.registerNetworkCallback(this.l, this.k);
                } catch (IllegalArgumentException unused) {
                    this.e = true;
                    this.k = null;
                }
                if (!this.e && this.n) {
                    Network[] a = a(this.b, null);
                    long[] jArr = new long[a.length];
                    for (int i = 0; i < a.length; i++) {
                        jArr[i] = a(a[i]);
                    }
                    this.a.a(jArr);
                }
            }
        }
    }

    public final void c() {
        if (this.c) {
            akon.a.unregisterReceiver(this);
            this.c = false;
            NetworkCallback networkCallback = this.k;
            if (networkCallback != null) {
                this.b.a(networkCallback);
            }
        }
    }

    public final c d() {
        return this.b.a(this.j);
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        c d = d();
        if (!(d.a() == this.m.a() && d.a.equals(this.m.a))) {
            this.a.a(d.a());
        }
        if (!(d.a() == this.m.a() && d.b() == this.m.b())) {
            this.a.b(d.b());
        }
        this.m = d;
    }

    public void onReceive(Context context, Intent intent) {
        a(new Runnable() {
            public final void run() {
                if (!NetworkChangeNotifierAutoDetect.this.c) {
                    return;
                }
                if (NetworkChangeNotifierAutoDetect.this.d) {
                    NetworkChangeNotifierAutoDetect.this.d = false;
                } else {
                    NetworkChangeNotifierAutoDetect.this.e();
                }
            }
        });
    }
}
