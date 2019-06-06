package defpackage;

import com.google.common.collect.ImmutableSet;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: adqj */
public final class adqj implements X509TrustManager {
    private static final Set<String> a = ImmutableSet.of("feelinsonice.com", "www.feelinsonice.com");
    private final X509TrustManager b;

    public adqj() {
        this(null);
    }

    adqj(KeyStore keyStore) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(keyStore);
            this.b = adqj.a(instance);
            if (this.b == null) {
                throw new IllegalStateException("Couldn't find X509TrustManager");
            }
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    private static X509TrustManager a(TrustManagerFactory trustManagerFactory) {
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificate checking is unsupported.");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0046 in {9, 11, 13} preds:[]
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
    public final void checkServerTrusted(java.security.cert.X509Certificate[] r5, java.lang.String r6) {
        /*
        r4 = this;
        r0 = r4.b;
        r0.checkServerTrusted(r5, r6);
        r6 = 0;
        r5 = r5[r6];
        r5 = r5.getSubjectAlternativeNames();
        r0 = 1;
        if (r5 == 0) goto L_0x003b;
        r5 = r5.iterator();
        r1 = r5.hasNext();
        if (r1 == 0) goto L_0x003b;
        r1 = r5.next();
        r1 = (java.util.List) r1;
        r2 = r1.get(r6);
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r3 = 2;
        if (r2 != r3) goto L_0x0013;
        r1 = r1.get(r0);
        r1 = (java.lang.String) r1;
        r2 = a;
        r1 = r2.contains(r1);
        if (r1 == 0) goto L_0x0013;
        r6 = 1;
        if (r6 == 0) goto L_0x003e;
        return;
        r5 = new java.security.cert.CertificateException;
        r6 = "Certificate did not match an expected DNS name.";
        r5.<init>(r6);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adqj.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String):void");
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.b.getAcceptedIssuers();
    }
}
