package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: aimk */
public final class aimk {
    public static final aimk a = new a(true).a(f).a(aimr.TLS_1_2, aimr.TLS_1_1, aimr.TLS_1_0).a().b();
    private static final aimj[] f = new aimj[]{aimj.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, aimj.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, aimj.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, aimj.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, aimj.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, aimj.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, aimj.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, aimj.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, aimj.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, aimj.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, aimj.TLS_RSA_WITH_AES_128_GCM_SHA256, aimj.TLS_RSA_WITH_AES_128_CBC_SHA, aimj.TLS_RSA_WITH_AES_256_CBC_SHA, aimj.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
    final boolean b;
    final String[] c;
    final String[] d;
    final boolean e;

    /* renamed from: aimk$a */
    public static final class a {
        boolean a;
        String[] b;
        String[] c;
        boolean d;

        public a(aimk aimk) {
            this.a = aimk.b;
            this.b = aimk.c;
            this.c = aimk.d;
            this.d = aimk.e;
        }

        a(boolean z) {
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
        public final defpackage.aimk.a a(defpackage.aimj... r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aimk$a.a(aimj[]):aimk$a");
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
        public final defpackage.aimk.a a(defpackage.aimr... r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aimk$a.a(aimr[]):aimk$a");
        }

        public final aimk b() {
            return new aimk(this, (byte) 0);
        }
    }

    static {
        new a(a).a(aimr.TLS_1_0).a().b();
        new a(false).b();
    }

    private aimk(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
    }

    /* synthetic */ aimk(a aVar, byte b) {
        this(aVar);
    }

    private List<aimr> a() {
        aimr[] aimrArr = new aimr[this.d.length];
        int i = 0;
        while (true) {
            String[] strArr = this.d;
            if (i >= strArr.length) {
                return aims.a(aimrArr);
            }
            aimr aimr;
            String str = strArr[i];
            int i2 = -1;
            switch (str.hashCode()) {
                case -503070503:
                    if (str.equals("TLSv1.1")) {
                        i2 = 1;
                        break;
                    }
                    break;
                case -503070502:
                    if (str.equals("TLSv1.2")) {
                        i2 = 0;
                        break;
                    }
                    break;
                case 79201641:
                    if (str.equals("SSLv3")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case 79923350:
                    if (str.equals("TLSv1")) {
                        i2 = 2;
                        break;
                    }
                    break;
            }
            if (i2 == 0) {
                aimr = aimr.TLS_1_2;
            } else if (i2 == 1) {
                aimr = aimr.TLS_1_1;
            } else if (i2 == 2) {
                aimr = aimr.TLS_1_0;
            } else if (i2 == 3) {
                aimr = aimr.SSL_3_0;
            } else {
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str)));
            }
            aimrArr[i] = aimr;
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aimk)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        aimk aimk = (aimk) obj;
        boolean z = this.b;
        return z != aimk.b ? false : !z || (Arrays.equals(this.c, aimk.c) && Arrays.equals(this.d, aimk.d) && this.e == aimk.e);
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
            aimj[] aimjArr = new aimj[strArr.length];
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
                aimjArr[i] = aimj.valueOf(str);
                i++;
            }
            obj = aims.a(aimjArr);
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
