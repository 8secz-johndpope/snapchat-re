package defpackage;

/* renamed from: wf */
public final class wf {
    private static boolean a = true;

    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b A:{SYNTHETIC, Splitter:B:45:0x007b} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0075 A:{SYNTHETIC, Splitter:B:39:0x0075} */
    public static boolean a(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
        r0 = a;
        r1 = 1;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r8 = r8.getPackageManager();
        r0 = 64;
        r2 = 0;
        r8 = r8.getPackageInfo(r9, r0);	 Catch:{ NameNotFoundException -> 0x0080 }
        r8 = r8.signatures;	 Catch:{ NameNotFoundException -> 0x0080 }
        r9 = 0;
        r0 = r8.length;
        if (r0 == 0) goto L_0x0019;
    L_0x0017:
        r0 = 1;
        goto L_0x001a;
    L_0x0019:
        r0 = 0;
    L_0x001a:
        r3 = r8.length;
        r4 = r9;
        r9 = 0;
    L_0x001d:
        if (r9 >= r3) goto L_0x007f;
    L_0x001f:
        r5 = r8[r9];
        r6 = new java.io.ByteArrayInputStream;	 Catch:{ CertificateException -> 0x0079, all -> 0x0071 }
        r5 = r5.toByteArray();	 Catch:{ CertificateException -> 0x0079, all -> 0x0071 }
        r6.<init>(r5);	 Catch:{ CertificateException -> 0x0079, all -> 0x0071 }
        r4 = "X509";
        r4 = java.security.cert.CertificateFactory.getInstance(r4);	 Catch:{ CertificateException -> 0x006f, all -> 0x006d }
        r4 = r4.generateCertificate(r6);	 Catch:{ CertificateException -> 0x006f, all -> 0x006d }
        r4 = (java.security.cert.X509Certificate) r4;	 Catch:{ CertificateException -> 0x006f, all -> 0x006d }
        r5 = r4.getSubjectX500Principal();	 Catch:{ CertificateException -> 0x006f, all -> 0x006d }
        r5 = r5.getName();	 Catch:{ CertificateException -> 0x006f, all -> 0x006d }
        r7 = r4.getIssuerX500Principal();	 Catch:{ CertificateException -> 0x006f, all -> 0x006d }
        r7 = r7.getName();	 Catch:{ CertificateException -> 0x006f, all -> 0x006d }
        r4 = r4.getPublicKey();	 Catch:{ CertificateException -> 0x006f, all -> 0x006d }
        r4 = r4.hashCode();	 Catch:{ CertificateException -> 0x006f, all -> 0x006d }
        r5 = r10.equals(r5);	 Catch:{ CertificateException -> 0x006f, all -> 0x006d }
        if (r5 == 0) goto L_0x005e;
    L_0x0054:
        r5 = r11.equals(r7);	 Catch:{ CertificateException -> 0x006f, all -> 0x006d }
        if (r5 == 0) goto L_0x005e;
    L_0x005a:
        if (r12 != r4) goto L_0x005e;
    L_0x005c:
        r4 = 1;
        goto L_0x005f;
    L_0x005e:
        r4 = 0;
    L_0x005f:
        r0 = r0 & r4;
        if (r0 != 0) goto L_0x0066;
    L_0x0062:
        r6.close();	 Catch:{ IOException -> 0x0065 }
    L_0x0065:
        return r2;
    L_0x0066:
        r6.close();	 Catch:{ IOException -> 0x0069 }
    L_0x0069:
        r9 = r9 + 1;
        r4 = r6;
        goto L_0x001d;
    L_0x006d:
        r8 = move-exception;
        goto L_0x0073;
    L_0x006f:
        r4 = r6;
        goto L_0x0079;
    L_0x0071:
        r8 = move-exception;
        r6 = r4;
    L_0x0073:
        if (r6 == 0) goto L_0x0078;
    L_0x0075:
        r6.close();	 Catch:{ IOException -> 0x0078 }
    L_0x0078:
        throw r8;
    L_0x0079:
        if (r4 == 0) goto L_0x007e;
    L_0x007b:
        r4.close();	 Catch:{ IOException -> 0x007e }
    L_0x007e:
        return r2;
    L_0x007f:
        return r0;
    L_0x0080:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }
}
