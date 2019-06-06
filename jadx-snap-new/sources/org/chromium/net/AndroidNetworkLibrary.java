package org.chromium.net;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import defpackage.akon;
import defpackage.akpj;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.URLConnection;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.List;
import org.chromium.base.BuildInfo;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.CalledByNativeUnchecked;

class AndroidNetworkLibrary {

    static class c extends Socket {

        static class a extends SocketImpl {
            a(FileDescriptor fileDescriptor) {
                this.fd = fileDescriptor;
            }

            /* Access modifiers changed, original: protected|final */
            public final void accept(SocketImpl socketImpl) {
                throw new RuntimeException("accept not implemented");
            }

            /* Access modifiers changed, original: protected|final */
            public final int available() {
                throw new RuntimeException("accept not implemented");
            }

            /* Access modifiers changed, original: protected|final */
            public final void bind(InetAddress inetAddress, int i) {
                throw new RuntimeException("accept not implemented");
            }

            /* Access modifiers changed, original: protected|final */
            public final void close() {
            }

            /* Access modifiers changed, original: protected|final */
            public final void connect(String str, int i) {
                throw new RuntimeException("connect not implemented");
            }

            /* Access modifiers changed, original: protected|final */
            public final void connect(InetAddress inetAddress, int i) {
                throw new RuntimeException("connect not implemented");
            }

            /* Access modifiers changed, original: protected|final */
            public final void connect(SocketAddress socketAddress, int i) {
                throw new RuntimeException("connect not implemented");
            }

            /* Access modifiers changed, original: protected|final */
            public final void create(boolean z) {
            }

            /* Access modifiers changed, original: protected|final */
            public final InputStream getInputStream() {
                throw new RuntimeException("getInputStream not implemented");
            }

            public final Object getOption(int i) {
                throw new RuntimeException("getOption not implemented");
            }

            /* Access modifiers changed, original: protected|final */
            public final OutputStream getOutputStream() {
                throw new RuntimeException("getOutputStream not implemented");
            }

            /* Access modifiers changed, original: protected|final */
            public final void listen(int i) {
                throw new RuntimeException("listen not implemented");
            }

            /* Access modifiers changed, original: protected|final */
            public final void sendUrgentData(int i) {
                throw new RuntimeException("sendUrgentData not implemented");
            }

            public final void setOption(int i, Object obj) {
                throw new RuntimeException("setOption not implemented");
            }
        }

        c(FileDescriptor fileDescriptor) {
            super(new a(fileDescriptor));
        }
    }

    public static class a {
        static {
            a aVar = new a();
        }

        @TargetApi(23)
        public static boolean a() {
            return VERSION.SDK_INT < 23 ? true : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
    }

    static class b {
        private static final Method a;

        static {
            try {
                a = FileDescriptor.class.getMethod("setInt$", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException | SecurityException e) {
                throw new RuntimeException("Unable to get FileDescriptor.setInt$", e);
            }
        }

        public static FileDescriptor a(int i) {
            String str = "FileDescriptor.setInt$() failed";
            try {
                FileDescriptor fileDescriptor = new FileDescriptor();
                a.invoke(fileDescriptor, new Object[]{Integer.valueOf(i)});
                return fileDescriptor;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(str, e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(str, e2);
            }
        }
    }

    AndroidNetworkLibrary() {
    }

    @CalledByNativeUnchecked
    public static void addTestRootCertificate(byte[] bArr) {
        X509Util.a();
        X509Certificate a = X509Util.a(bArr);
        synchronized (X509Util.b) {
            KeyStore keyStore = X509Util.a;
            StringBuilder stringBuilder = new StringBuilder("root_cert_");
            stringBuilder.append(Integer.toString(X509Util.a.size()));
            keyStore.setCertificateEntry(stringBuilder.toString(), a);
            X509Util.b();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0012 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @org.chromium.base.annotations.CalledByNativeUnchecked
    public static void clearTestRootCertificates() {
        /*
        org.chromium.net.X509Util.a();
        r0 = org.chromium.net.X509Util.b;
        monitor-enter(r0);
        r1 = org.chromium.net.X509Util.a;	 Catch:{ IOException -> 0x0012 }
        r2 = 0;
        r1.load(r2);	 Catch:{ IOException -> 0x0012 }
        org.chromium.net.X509Util.b();	 Catch:{ IOException -> 0x0012 }
        goto L_0x0012;
    L_0x0010:
        r1 = move-exception;
        goto L_0x0014;
    L_0x0012:
        monitor-exit(r0);	 Catch:{ all -> 0x0010 }
        return;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0010 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.AndroidNetworkLibrary.clearTestRootCertificates():void");
    }

    @TargetApi(23)
    @CalledByNative
    private static byte[][] getDnsServers() {
        ConnectivityManager connectivityManager = (ConnectivityManager) akon.a.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY);
        int i = 0;
        if (connectivityManager != null) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null) {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                if (linkProperties != null) {
                    if (BuildInfo.a()) {
                        try {
                            if (((Boolean) linkProperties.getClass().getMethod("isPrivateDnsActive", new Class[0]).invoke(linkProperties, new Object[0])).booleanValue()) {
                                return (byte[][]) Array.newInstance(byte.class, new int[]{1, 1});
                            }
                        } catch (Exception e) {
                            Log.e("AndroidNetworkLibrary", "Can not call LinkProperties.isPrivateDnsActive():", e);
                        }
                    }
                    List dnsServers = linkProperties.getDnsServers();
                    byte[][] bArr = new byte[dnsServers.size()][];
                    while (i < dnsServers.size()) {
                        bArr[i] = ((InetAddress) dnsServers.get(i)).getAddress();
                        i++;
                    }
                    return bArr;
                }
            }
        }
        return (byte[][]) Array.newInstance(byte.class, new int[]{0, 0});
    }

    @TargetApi(23)
    @CalledByNative
    private static boolean getIsCaptivePortal() {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) akon.a.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY);
        if (connectivityManager == null) {
            return false;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities != null && networkCapabilities.hasCapability(17);
    }

    @CalledByNative
    private static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) akon.a.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY)).getActiveNetworkInfo();
        return activeNetworkInfo == null ? false : activeNetworkInfo.isRoaming();
    }

    @CalledByNative
    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo.".concat(String.valueOf(str)));
    }

    @CalledByNative
    private static String getNetworkCountryIso() {
        TelephonyManager telephonyManager = (TelephonyManager) akon.a.getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getNetworkCountryIso();
    }

    @CalledByNative
    private static String getNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) akon.a.getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getNetworkOperator();
    }

    @CalledByNative
    private static String getSimOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) akon.a.getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getSimOperator();
    }

    @CalledByNative
    public static String getWifiSSID() {
        Intent registerReceiver = akon.a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
        if (registerReceiver != null) {
            WifiInfo wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
            if (wifiInfo != null) {
                String ssid = wifiInfo.getSSID();
                if (!(ssid == null || ssid.equals("<unknown ssid>"))) {
                    return ssid;
                }
            }
        }
        return "";
    }

    @CalledByNative
    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = (NetworkInterface) networkInterfaces.nextElement();
                try {
                    if (networkInterface.isUp() && !networkInterface.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception e) {
            Log.w("AndroidNetworkLibrary", "could not get network interfaces: ".concat(String.valueOf(e)));
            return false;
        }
    }

    @CalledByNative
    private static boolean isCleartextPermitted(String str) {
        try {
            return VERSION.SDK_INT < 24 ? a.a() : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException unused) {
            return a.a();
        }
    }

    @CalledByNative
    private static void tagSocket(int i, int i2, int i3) {
        ParcelFileDescriptor parcelFileDescriptor;
        FileDescriptor a;
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            akpj.a(i2);
        }
        if (VERSION.SDK_INT < 23) {
            parcelFileDescriptor = null;
            a = b.a(i);
        } else {
            parcelFileDescriptor = ParcelFileDescriptor.adoptFd(i);
            a = parcelFileDescriptor.getFileDescriptor();
        }
        c cVar = new c(a);
        TrafficStats.tagSocket(cVar);
        cVar.close();
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.detachFd();
        }
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            akpj.a();
        }
    }

    @CalledByNative
    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.a(bArr, str, str2);
        } catch (KeyStoreException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (IllegalArgumentException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
