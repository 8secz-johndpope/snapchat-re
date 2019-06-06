package defpackage;

import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: aisz */
final class aisz implements X509TrustManager {
    private static final X509Certificate[] a = new X509Certificate[0];
    private final TrustManager[] b;
    private final aita c;
    private final long d;
    private final List<byte[]> e = new LinkedList();
    private final Set<X509Certificate> f = Collections.synchronizedSet(new HashSet());

    public aisz(aita aita, aisy aisy) {
        this.b = aisz.a(aita);
        this.c = aita;
        this.d = -1;
        for (String a : aisy.c()) {
            this.e.add(aisz.a(a));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0035 in {7, 9, 12} preds:[]
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
    private boolean a(java.security.cert.X509Certificate r3) {
        /*
        r2 = this;
        r0 = "SHA1";	 Catch:{ NoSuchAlgorithmException -> 0x002e }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x002e }
        r3 = r3.getPublicKey();	 Catch:{ NoSuchAlgorithmException -> 0x002e }
        r3 = r3.getEncoded();	 Catch:{ NoSuchAlgorithmException -> 0x002e }
        r3 = r0.digest(r3);	 Catch:{ NoSuchAlgorithmException -> 0x002e }
        r0 = r2.e;	 Catch:{ NoSuchAlgorithmException -> 0x002e }
        r0 = r0.iterator();	 Catch:{ NoSuchAlgorithmException -> 0x002e }
        r1 = r0.hasNext();	 Catch:{ NoSuchAlgorithmException -> 0x002e }
        if (r1 == 0) goto L_0x002c;	 Catch:{ NoSuchAlgorithmException -> 0x002e }
        r1 = r0.next();	 Catch:{ NoSuchAlgorithmException -> 0x002e }
        r1 = (byte[]) r1;	 Catch:{ NoSuchAlgorithmException -> 0x002e }
        r1 = java.util.Arrays.equals(r1, r3);	 Catch:{ NoSuchAlgorithmException -> 0x002e }
        if (r1 == 0) goto L_0x0018;
        r3 = 1;
        return r3;
        r3 = 0;
        return r3;
        r3 = move-exception;
        r0 = new java.security.cert.CertificateException;
        r0.<init>(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisz.a(java.security.cert.X509Certificate):boolean");
    }

    private static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    private static TrustManager[] a(aita aita) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(aita.a);
            return instance.getTrustManagers();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0041 in {2, 5, 10, 12, 14} preds:[]
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
    public final void checkServerTrusted(java.security.cert.X509Certificate[] r6, java.lang.String r7) {
        /*
        r5 = this;
        r0 = r5.f;
        r1 = 0;
        r2 = r6[r1];
        r0 = r0.contains(r2);
        if (r0 == 0) goto L_0x000c;
        return;
        r0 = r5.b;
        r2 = r0.length;
        r3 = 0;
        if (r3 >= r2) goto L_0x001c;
        r4 = r0[r3];
        r4 = (javax.net.ssl.X509TrustManager) r4;
        r4.checkServerTrusted(r6, r7);
        r3 = r3 + 1;
        goto L_0x0010;
        r7 = r5.c;
        r7 = defpackage.aist.a(r6, r7);
        r0 = r7.length;
        r2 = 0;
        if (r2 >= r0) goto L_0x0039;
        r3 = r7[r2];
        r3 = r5.a(r3);
        if (r3 != 0) goto L_0x0031;
        r2 = r2 + 1;
        goto L_0x0024;
        r7 = r5.f;
        r6 = r6[r1];
        r7.add(r6);
        return;
        r6 = new java.security.cert.CertificateException;
        r7 = "No valid pins found in chain!";
        r6.<init>(r7);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisz.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String):void");
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return a;
    }
}
