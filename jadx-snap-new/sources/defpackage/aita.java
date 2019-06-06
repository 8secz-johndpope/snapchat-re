package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;

/* renamed from: aita */
final class aita {
    final KeyStore a;
    private final HashMap<Principal, X509Certificate> b;

    public aita(InputStream inputStream, String str) {
        KeyStore a = aita.a(inputStream, str);
        this.b = aita.a(a);
        this.a = a;
    }

    private static KeyStore a(InputStream inputStream, String str) {
        BufferedInputStream bufferedInputStream;
        try {
            KeyStore instance = KeyStore.getInstance("BKS");
            bufferedInputStream = new BufferedInputStream(inputStream);
            instance.load(bufferedInputStream, str.toCharArray());
            bufferedInputStream.close();
            return instance;
        } catch (KeyStoreException e) {
            throw new AssertionError(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        } catch (CertificateException e3) {
            throw new AssertionError(e3);
        } catch (IOException e4) {
            throw new AssertionError(e4);
        } catch (Throwable th) {
            bufferedInputStream.close();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x002d in {7, 8, 11} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static java.util.HashMap<java.security.Principal, java.security.cert.X509Certificate> a(java.security.KeyStore r4) {
        /*
        r0 = new java.util.HashMap;	 Catch:{ KeyStoreException -> 0x0026 }
        r0.<init>();	 Catch:{ KeyStoreException -> 0x0026 }
        r1 = r4.aliases();	 Catch:{ KeyStoreException -> 0x0026 }
        r2 = r1.hasMoreElements();	 Catch:{ KeyStoreException -> 0x0026 }
        if (r2 == 0) goto L_0x0025;	 Catch:{ KeyStoreException -> 0x0026 }
        r2 = r1.nextElement();	 Catch:{ KeyStoreException -> 0x0026 }
        r2 = (java.lang.String) r2;	 Catch:{ KeyStoreException -> 0x0026 }
        r2 = r4.getCertificate(r2);	 Catch:{ KeyStoreException -> 0x0026 }
        r2 = (java.security.cert.X509Certificate) r2;	 Catch:{ KeyStoreException -> 0x0026 }
        if (r2 == 0) goto L_0x0009;	 Catch:{ KeyStoreException -> 0x0026 }
        r3 = r2.getSubjectX500Principal();	 Catch:{ KeyStoreException -> 0x0026 }
        r0.put(r3, r2);	 Catch:{ KeyStoreException -> 0x0026 }
        goto L_0x0009;
        return r0;
        r4 = move-exception;
        r0 = new java.lang.AssertionError;
        r0.<init>(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aita.a(java.security.KeyStore):java.util.HashMap");
    }

    public final boolean a(X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = (X509Certificate) this.b.get(x509Certificate.getSubjectX500Principal());
        return x509Certificate2 != null && x509Certificate2.getPublicKey().equals(x509Certificate.getPublicKey());
    }

    public final X509Certificate b(X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = (X509Certificate) this.b.get(x509Certificate.getIssuerX500Principal());
        if (x509Certificate2 == null || x509Certificate2.getSubjectX500Principal().equals(x509Certificate.getSubjectX500Principal())) {
            return null;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return x509Certificate2;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }
}
