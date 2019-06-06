package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: aizx */
public final class aizx {
    public static final aizx a = new a(true).a(f).a(ajad.TLS_1_2, ajad.TLS_1_1, ajad.TLS_1_0).a().b();
    private static final aizw[] f = new aizw[]{aizw.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, aizw.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, aizw.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, aizw.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, aizw.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, aizw.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, aizw.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, aizw.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, aizw.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, aizw.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, aizw.TLS_RSA_WITH_AES_128_GCM_SHA256, aizw.TLS_RSA_WITH_AES_128_CBC_SHA, aizw.TLS_RSA_WITH_AES_256_CBC_SHA, aizw.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
    final boolean b;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    /* renamed from: aizx$a */
    public static final class a {
        boolean a;
        String[] b;
        String[] c;
        boolean d;

        public a(aizx aizx) {
            this.a = aizx.b;
            this.b = aizx.c;
            this.c = aizx.d;
            this.d = aizx.e;
        }

        public a(boolean z) {
            this.a = z;
        }

        public final a a() {
            if (this.a) {
                this.d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x001f in {5, 7, 9} preds:[]
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
        public final defpackage.aizx.a a(defpackage.aizw... r4) {
            /*
            r3 = this;
            r0 = r3.a;
            if (r0 == 0) goto L_0x0017;
            r0 = r4.length;
            r0 = new java.lang.String[r0];
            r1 = 0;
            r2 = r4.length;
            if (r1 >= r2) goto L_0x0014;
            r2 = r4[r1];
            r2 = r2.javaName;
            r0[r1] = r2;
            r1 = r1 + 1;
            goto L_0x0008;
            r3.b = r0;
            return r3;
            r4 = new java.lang.IllegalStateException;
            r0 = "no cipher suites for cleartext connections";
            r4.<init>(r0);
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aizx$a.a(aizw[]):aizx$a");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x002a in {7, 9, 11, 13} preds:[]
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
        public final defpackage.aizx.a a(defpackage.ajad... r4) {
            /*
            r3 = this;
            r0 = r3.a;
            if (r0 == 0) goto L_0x0022;
            r0 = r4.length;
            if (r0 == 0) goto L_0x001a;
            r0 = r4.length;
            r0 = new java.lang.String[r0];
            r1 = 0;
            r2 = r4.length;
            if (r1 >= r2) goto L_0x0017;
            r2 = r4[r1];
            r2 = r2.javaName;
            r0[r1] = r2;
            r1 = r1 + 1;
            goto L_0x000b;
            r3.c = r0;
            return r3;
            r4 = new java.lang.IllegalArgumentException;
            r0 = "At least one TlsVersion is required";
            r4.<init>(r0);
            throw r4;
            r4 = new java.lang.IllegalStateException;
            r0 = "no TLS versions for cleartext connections";
            r4.<init>(r0);
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aizx$a.a(ajad[]):aizx$a");
        }

        public final a a(String... strArr) {
            if (this.a) {
                this.b = strArr == null ? null : (String[]) strArr.clone();
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final a b(String... strArr) {
            if (this.a) {
                this.c = strArr == null ? null : (String[]) strArr.clone();
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public final aizx b() {
            return new aizx(this, (byte) 0);
        }
    }

    static {
        new a(a).a(ajad.TLS_1_0).a().b();
        new a(false).b();
    }

    private aizx(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
    }

    /* synthetic */ aizx(a aVar, byte b) {
        this(aVar);
    }

    private List<ajad> a() {
        ajad[] ajadArr = new ajad[this.d.length];
        int i = 0;
        while (true) {
            String[] strArr = this.d;
            if (i >= strArr.length) {
                return ajae.a(ajadArr);
            }
            ajad ajad;
            Object obj = strArr[i];
            if ("TLSv1.2".equals(obj)) {
                ajad = ajad.TLS_1_2;
            } else if ("TLSv1.1".equals(obj)) {
                ajad = ajad.TLS_1_1;
            } else if ("TLSv1".equals(obj)) {
                ajad = ajad.TLS_1_0;
            } else if ("SSLv3".equals(obj)) {
                ajad = ajad.SSL_3_0;
            } else {
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(obj)));
            }
            ajadArr[i] = ajad;
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aizx)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        aizx aizx = (aizx) obj;
        boolean z = this.b;
        return z != aizx.b ? false : !z || (Arrays.equals(this.c, aizx.c) && Arrays.equals(this.d, aizx.d) && this.e == aizx.e);
    }

    public final int hashCode() {
        return this.b ? ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (this.e ^ 1) : 17;
    }

    public final String toString() {
        if (!this.b) {
            return "ConnectionSpec()";
        }
        Object obj;
        String[] strArr = this.c;
        if (strArr == null) {
            obj = null;
        } else {
            aizw[] aizwArr = new aizw[strArr.length];
            int i = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str.startsWith("SSL_")) {
                    StringBuilder stringBuilder = new StringBuilder("TLS_");
                    stringBuilder.append(str.substring(4));
                    str = stringBuilder.toString();
                }
                aizwArr[i] = aizw.valueOf(str);
                i++;
            }
            obj = ajae.a(aizwArr);
        }
        String obj2 = obj == null ? "[use default]" : obj.toString();
        StringBuilder stringBuilder2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        stringBuilder2.append(obj2);
        stringBuilder2.append(", tlsVersions=");
        stringBuilder2.append(a());
        stringBuilder2.append(", supportsTlsExtensions=");
        stringBuilder2.append(this.e);
        stringBuilder2.append(")");
        return stringBuilder2.toString();
    }
}
