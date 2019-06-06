package org.chromium.net;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

public class X509Util {
    static KeyStore a;
    static final Object b = new Object();
    private static CertificateFactory c;
    private static c d;
    private static a e;
    private static c f;
    private static KeyStore g;
    private static File h;
    private static Set<Pair<X500Principal, PublicKey>> i;
    private static boolean j;
    private static final char[] k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static /* synthetic */ boolean l = (X509Util.class.desiredAssertionStatus() ^ 1);

    interface c {
        List<X509Certificate> a(X509Certificate[] x509CertificateArr, String str, String str2);
    }

    static final class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            String str = "Unable to reload the default TrustManager";
            String str2 = "X509Util";
            boolean z = true;
            if (VERSION.SDK_INT >= 26) {
                if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction())) {
                    if (!"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction())) {
                        if (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) {
                            z = false;
                        }
                    }
                }
            } else {
                z = "android.security.STORAGE_CHANGED".equals(intent.getAction());
            }
            if (z) {
                try {
                    X509Util.c();
                } catch (CertificateException e) {
                    Log.e(str2, str, e);
                } catch (KeyStoreException e2) {
                    Log.e(str2, str, e2);
                } catch (NoSuchAlgorithmException e3) {
                    Log.e(str2, str, e3);
                }
            }
        }
    }

    static final class d implements c {
        private final X509TrustManagerExtensions a;

        @SuppressLint({"NewApi"})
        public d(X509TrustManager x509TrustManager) {
            this.a = new X509TrustManagerExtensions(x509TrustManager);
        }

        @SuppressLint({"NewApi"})
        public final List<X509Certificate> a(X509Certificate[] x509CertificateArr, String str, String str2) {
            return this.a.checkServerTrusted(x509CertificateArr, str, str2);
        }
    }

    static final class b implements c {
        private final X509TrustManager a;

        public b(X509TrustManager x509TrustManager) {
            this.a = x509TrustManager;
        }

        public final List<X509Certificate> a(X509Certificate[] x509CertificateArr, String str, String str2) {
            this.a.checkServerTrusted(x509CertificateArr, str);
            return Collections.emptyList();
        }
    }

    private static String a(X500Principal x500Principal) {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i = 0; i < 4; i++) {
            int i2 = i * 2;
            char[] cArr2 = k;
            int i3 = 3 - i;
            cArr[i2] = cArr2[(digest[i3] >> 4) & 15];
            cArr[i2 + 1] = cArr2[digest[i3] & 15];
        }
        return new String(cArr);
    }

    public static X509Certificate a(byte[] bArr) {
        a();
        return (X509Certificate) c.generateCertificate(new ByteArrayInputStream(bArr));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:71:0x00f9 in {16, 17, 19, 25, 33, 36, 39, 43, 46, 50, 53, 56, 59, 62, 65, 68, 70} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static org.chromium.net.AndroidCertVerifyResult a(byte[][] r7, java.lang.String r8, java.lang.String r9) {
        /*
        if (r7 == 0) goto L_0x00e1;
        r0 = r7.length;
        if (r0 == 0) goto L_0x00e1;
        r0 = 0;
        r1 = r7[r0];
        if (r1 == 0) goto L_0x00e1;
        r1 = -1;
        a();	 Catch:{ CertificateException -> 0x00db }
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7[r0];	 Catch:{ CertificateException -> 0x00d4 }
        r3 = a(r3);	 Catch:{ CertificateException -> 0x00d4 }
        r2.add(r3);	 Catch:{ CertificateException -> 0x00d4 }
        r3 = 1;
        r4 = 1;
        r5 = r7.length;
        if (r4 >= r5) goto L_0x0046;
        r5 = r7[r4];	 Catch:{ CertificateException -> 0x002b }
        r5 = a(r5);	 Catch:{ CertificateException -> 0x002b }
        r2.add(r5);	 Catch:{ CertificateException -> 0x002b }
        goto L_0x0043;
        r5 = new java.lang.StringBuilder;
        r6 = "intermediate ";
        r5.<init>(r6);
        r5.append(r4);
        r6 = " failed parsing";
        r5.append(r6);
        r5 = r5.toString();
        r6 = "X509Util";
        android.util.Log.w(r6, r5);
        r4 = r4 + 1;
        goto L_0x001e;
        r7 = r2.size();
        r7 = new java.security.cert.X509Certificate[r7];
        r7 = r2.toArray(r7);
        r7 = (java.security.cert.X509Certificate[]) r7;
        r2 = r7[r0];	 Catch:{ CertificateExpiredException -> 0x00cd, CertificateNotYetValidException -> 0x00c6, CertificateException -> 0x00c0 }
        r2.checkValidity();	 Catch:{ CertificateExpiredException -> 0x00cd, CertificateNotYetValidException -> 0x00c6, CertificateException -> 0x00c0 }
        r2 = r7[r0];	 Catch:{ CertificateExpiredException -> 0x00cd, CertificateNotYetValidException -> 0x00c6, CertificateException -> 0x00c0 }
        r2 = b(r2);	 Catch:{ CertificateExpiredException -> 0x00cd, CertificateNotYetValidException -> 0x00c6, CertificateException -> 0x00c0 }
        if (r2 != 0) goto L_0x0066;	 Catch:{ CertificateExpiredException -> 0x00cd, CertificateNotYetValidException -> 0x00c6, CertificateException -> 0x00c0 }
        r7 = new org.chromium.net.AndroidCertVerifyResult;	 Catch:{ CertificateExpiredException -> 0x00cd, CertificateNotYetValidException -> 0x00c6, CertificateException -> 0x00c0 }
        r8 = -6;	 Catch:{ CertificateExpiredException -> 0x00cd, CertificateNotYetValidException -> 0x00c6, CertificateException -> 0x00c0 }
        r7.<init>(r8);	 Catch:{ CertificateExpiredException -> 0x00cd, CertificateNotYetValidException -> 0x00c6, CertificateException -> 0x00c0 }
        return r7;
        r2 = b;
        monitor-enter(r2);
        r4 = d;	 Catch:{ all -> 0x00bd }
        if (r4 != 0) goto L_0x0074;	 Catch:{ all -> 0x00bd }
        r7 = new org.chromium.net.AndroidCertVerifyResult;	 Catch:{ all -> 0x00bd }
        r7.<init>(r1);	 Catch:{ all -> 0x00bd }
        monitor-exit(r2);	 Catch:{ all -> 0x00bd }
        return r7;
        r1 = d;	 Catch:{ CertificateException -> 0x007b }
        r7 = r1.a(r7, r8, r9);	 Catch:{ CertificateException -> 0x007b }
        goto L_0x0082;
        r1 = move-exception;
        r4 = f;	 Catch:{ CertificateException -> 0x009e }
        r7 = r4.a(r7, r8, r9);	 Catch:{ CertificateException -> 0x009e }
        r8 = r7.size();	 Catch:{ all -> 0x00bd }
        if (r8 <= 0) goto L_0x0097;	 Catch:{ all -> 0x00bd }
        r8 = r7.size();	 Catch:{ all -> 0x00bd }
        r8 = r8 - r3;	 Catch:{ all -> 0x00bd }
        r8 = r7.get(r8);	 Catch:{ all -> 0x00bd }
        r8 = (java.security.cert.X509Certificate) r8;	 Catch:{ all -> 0x00bd }
        r0 = a(r8);	 Catch:{ all -> 0x00bd }
        r8 = new org.chromium.net.AndroidCertVerifyResult;	 Catch:{ all -> 0x00bd }
        r8.<init>(r0, r7);	 Catch:{ all -> 0x00bd }
        monitor-exit(r2);	 Catch:{ all -> 0x00bd }
        return r8;	 Catch:{ all -> 0x00bd }
        r7 = "X509Util";	 Catch:{ all -> 0x00bd }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bd }
        r9 = "Failed to validate the certificate chain, error: ";	 Catch:{ all -> 0x00bd }
        r8.<init>(r9);	 Catch:{ all -> 0x00bd }
        r9 = r1.getMessage();	 Catch:{ all -> 0x00bd }
        r8.append(r9);	 Catch:{ all -> 0x00bd }
        r8 = r8.toString();	 Catch:{ all -> 0x00bd }
        android.util.Log.i(r7, r8);	 Catch:{ all -> 0x00bd }
        r7 = new org.chromium.net.AndroidCertVerifyResult;	 Catch:{ all -> 0x00bd }
        r8 = -2;	 Catch:{ all -> 0x00bd }
        r7.<init>(r8);	 Catch:{ all -> 0x00bd }
        monitor-exit(r2);	 Catch:{ all -> 0x00bd }
        return r7;	 Catch:{ all -> 0x00bd }
        r7 = move-exception;	 Catch:{ all -> 0x00bd }
        monitor-exit(r2);	 Catch:{ all -> 0x00bd }
        throw r7;
        r7 = new org.chromium.net.AndroidCertVerifyResult;
        r7.<init>(r1);
        return r7;
        r7 = new org.chromium.net.AndroidCertVerifyResult;
        r8 = -4;
        r7.<init>(r8);
        return r7;
        r7 = new org.chromium.net.AndroidCertVerifyResult;
        r8 = -3;
        r7.<init>(r8);
        return r7;
        r7 = new org.chromium.net.AndroidCertVerifyResult;
        r8 = -5;
        r7.<init>(r8);
        return r7;
        r7 = new org.chromium.net.AndroidCertVerifyResult;
        r7.<init>(r1);
        return r7;
        r8 = new java.lang.IllegalArgumentException;
        r9 = new java.lang.StringBuilder;
        r0 = "Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=";
        r9.<init>(r0);
        r7 = java.util.Arrays.deepToString(r7);
        r9.append(r7);
        r7 = r9.toString();
        r8.<init>(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.X509Util.a(byte[][], java.lang.String, java.lang.String):org.chromium.net.AndroidCertVerifyResult");
    }

    private static c a(KeyStore keyStore) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        int length = trustManagers.length;
        int i = 0;
        while (true) {
            String str = "X509Util";
            if (i < length) {
                Object obj = trustManagers[i];
                if (obj instanceof X509TrustManager) {
                    try {
                        return VERSION.SDK_INT >= 17 ? new d((X509TrustManager) obj) : new b((X509TrustManager) obj);
                    } catch (IllegalArgumentException e) {
                        String name = obj.getClass().getName();
                        StringBuilder stringBuilder = new StringBuilder("Error creating trust manager (");
                        stringBuilder.append(name);
                        stringBuilder.append("): ");
                        stringBuilder.append(e);
                        Log.e(str, stringBuilder.toString());
                    }
                } else {
                    i++;
                }
            } else {
                Log.e(str, "Could not find suitable trust manager");
                return null;
            }
        }
    }

    static void a() {
        synchronized (b) {
            d();
        }
    }

    private static boolean a(X509Certificate x509Certificate) {
        if (!l && !Thread.holdsLock(b)) {
            throw new AssertionError();
        } else if (g == null) {
            return false;
        } else {
            Pair pair = new Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
            if (i.contains(pair)) {
                return true;
            }
            String a = a(x509Certificate.getSubjectX500Principal());
            int i = 0;
            while (true) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a);
                stringBuilder.append('.');
                stringBuilder.append(i);
                String stringBuilder2 = stringBuilder.toString();
                if (!new File(h, stringBuilder2).exists()) {
                    return false;
                }
                Certificate certificate = g.getCertificate("system:".concat(String.valueOf(stringBuilder2)));
                if (certificate != null) {
                    if (certificate instanceof X509Certificate) {
                        X509Certificate x509Certificate2 = (X509Certificate) certificate;
                        if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                            i.add(pair);
                            return true;
                        }
                    }
                    String name = certificate.getClass().getName();
                    StringBuilder stringBuilder3 = new StringBuilder("Anchor ");
                    stringBuilder3.append(stringBuilder2);
                    stringBuilder3.append(" not an X509Certificate: ");
                    stringBuilder3.append(name);
                    Log.e("X509Util", stringBuilder3.toString());
                }
                i++;
            }
        }
    }

    static void b() {
        if (l || Thread.holdsLock(b)) {
            f = a(a);
            return;
        }
        throw new AssertionError();
    }

    private static boolean b(X509Certificate x509Certificate) {
        try {
            List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
            if (extendedKeyUsage == null) {
                return true;
            }
            for (String str : extendedKeyUsage) {
                if (str.equals("1.3.6.1.5.5.7.3.1") || str.equals("2.5.29.37.0") || str.equals("2.16.840.1.113730.4.1")) {
                    return true;
                }
                if (str.equals("1.3.6.1.4.1.311.10.3.3")) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException unused) {
        }
    }

    static /* synthetic */ void c() {
        synchronized (b) {
            d = null;
            i = null;
            d();
        }
        nativeNotifyKeyChainChanged();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x003c */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:14|15|16|17|18|19|20|(3:23|(1:25)(1:26)|27)|28) */
    private static void d() {
        /*
        r0 = l;
        if (r0 != 0) goto L_0x0013;
    L_0x0004:
        r0 = b;
        r0 = java.lang.Thread.holdsLock(r0);
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0013;
    L_0x000d:
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
    L_0x0013:
        r0 = c;
        if (r0 != 0) goto L_0x001f;
    L_0x0017:
        r0 = "X.509";
        r0 = java.security.cert.CertificateFactory.getInstance(r0);
        c = r0;
    L_0x001f:
        r0 = d;
        r1 = 0;
        if (r0 != 0) goto L_0x002a;
    L_0x0024:
        r0 = a(r1);
        d = r0;
    L_0x002a:
        r0 = j;
        r2 = 0;
        if (r0 != 0) goto L_0x006f;
    L_0x002f:
        r0 = "AndroidCAStore";
        r0 = java.security.KeyStore.getInstance(r0);	 Catch:{ KeyStoreException -> 0x005a }
        g = r0;	 Catch:{ KeyStoreException -> 0x005a }
        r0 = g;	 Catch:{ IOException -> 0x003c }
        r0.load(r1);	 Catch:{ IOException -> 0x003c }
    L_0x003c:
        r0 = new java.io.File;	 Catch:{ KeyStoreException -> 0x005a }
        r3 = new java.lang.StringBuilder;	 Catch:{ KeyStoreException -> 0x005a }
        r3.<init>();	 Catch:{ KeyStoreException -> 0x005a }
        r4 = "ANDROID_ROOT";
        r4 = java.lang.System.getenv(r4);	 Catch:{ KeyStoreException -> 0x005a }
        r3.append(r4);	 Catch:{ KeyStoreException -> 0x005a }
        r4 = "/etc/security/cacerts";
        r3.append(r4);	 Catch:{ KeyStoreException -> 0x005a }
        r3 = r3.toString();	 Catch:{ KeyStoreException -> 0x005a }
        r0.<init>(r3);	 Catch:{ KeyStoreException -> 0x005a }
        h = r0;	 Catch:{ KeyStoreException -> 0x005a }
    L_0x005a:
        r0 = android.os.Build.VERSION.SDK_INT;
        r3 = 17;
        r4 = 1;
        if (r0 < r3) goto L_0x006d;
    L_0x0061:
        r0 = g;
        if (r0 == 0) goto L_0x0067;
    L_0x0065:
        r0 = 1;
        goto L_0x0068;
    L_0x0067:
        r0 = 0;
    L_0x0068:
        r3 = "Net.FoundSystemTrustRootsAndroid";
        org.chromium.base.metrics.RecordHistogram.a(r3, r0);
    L_0x006d:
        j = r4;
    L_0x006f:
        r0 = i;
        if (r0 != 0) goto L_0x007a;
    L_0x0073:
        r0 = new java.util.HashSet;
        r0.<init>();
        i = r0;
    L_0x007a:
        r0 = a;
        if (r0 != 0) goto L_0x008d;
    L_0x007e:
        r0 = java.security.KeyStore.getDefaultType();
        r0 = java.security.KeyStore.getInstance(r0);
        a = r0;
        r0 = a;	 Catch:{ IOException -> 0x008d }
        r0.load(r1);	 Catch:{ IOException -> 0x008d }
    L_0x008d:
        r0 = f;
        if (r0 != 0) goto L_0x0099;
    L_0x0091:
        r0 = a;
        r0 = a(r0);
        f = r0;
    L_0x0099:
        r0 = e;
        if (r0 != 0) goto L_0x00c8;
    L_0x009d:
        r0 = new org.chromium.net.X509Util$a;
        r0.<init>(r2);
        e = r0;
        r0 = new android.content.IntentFilter;
        r0.<init>();
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 26;
        if (r1 < r2) goto L_0x00bc;
    L_0x00af:
        r1 = "android.security.action.KEYCHAIN_CHANGED";
        r0.addAction(r1);
        r1 = "android.security.action.KEY_ACCESS_CHANGED";
        r0.addAction(r1);
        r1 = "android.security.action.TRUST_STORE_CHANGED";
        goto L_0x00be;
    L_0x00bc:
        r1 = "android.security.STORAGE_CHANGED";
    L_0x00be:
        r0.addAction(r1);
        r1 = defpackage.akon.a;
        r2 = e;
        r1.registerReceiver(r2, r0);
    L_0x00c8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.X509Util.d():void");
    }

    private static native void nativeNotifyKeyChainChanged();
}
