package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;

/* renamed from: aist */
final class aist {
    private static boolean a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getIssuerX500Principal())) {
            return false;
        }
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0059 in {5, 8, 11, 12, 15, 17} preds:[]
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
    public static java.security.cert.X509Certificate[] a(java.security.cert.X509Certificate[] r6, defpackage.aita r7) {
        /*
        r0 = new java.util.LinkedList;
        r0.<init>();
        r1 = 0;
        r2 = r6[r1];
        r2 = r7.a(r2);
        r1 = r6[r1];
        r0.add(r1);
        r1 = 1;
        r3 = r2;
        r2 = 1;
        r4 = r6.length;
        if (r2 >= r4) goto L_0x0034;
        r4 = r6[r2];
        r4 = r7.a(r4);
        if (r4 == 0) goto L_0x0020;
        r3 = 1;
        r4 = r6[r2];
        r5 = r2 + -1;
        r5 = r6[r5];
        r4 = defpackage.aist.a(r4, r5);
        if (r4 == 0) goto L_0x0034;
        r4 = r6[r2];
        r0.add(r4);
        r2 = r2 + 1;
        goto L_0x0014;
        r2 = r2 - r1;
        r6 = r6[r2];
        r6 = r7.b(r6);
        if (r6 == 0) goto L_0x0041;
        r0.add(r6);
        goto L_0x0042;
        r1 = r3;
        if (r1 == 0) goto L_0x0051;
        r6 = r0.size();
        r6 = new java.security.cert.X509Certificate[r6];
        r6 = r0.toArray(r6);
        r6 = (java.security.cert.X509Certificate[]) r6;
        return r6;
        r6 = new java.security.cert.CertificateException;
        r7 = "Didn't find a trust anchor in chain cleanup!";
        r6.<init>(r7);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aist.a(java.security.cert.X509Certificate[], aita):java.security.cert.X509Certificate[]");
    }
}
