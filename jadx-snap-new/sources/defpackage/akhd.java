package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: akhd */
public final class akhd {
    public static final akhd a;
    public static final akhd b;
    private static final akha[] g;
    final boolean c;
    public final boolean d;
    final String[] e;
    final String[] f;

    /* renamed from: akhd$a */
    public static final class a {
        boolean a;
        String[] b;
        String[] c;
        boolean d;

        public a(akhd akhd) {
            this.a = akhd.c;
            this.b = akhd.e;
            this.c = akhd.f;
            this.d = akhd.d;
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
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0021 in {5, 7, 9} preds:[]
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
        public final defpackage.akhd.a a(defpackage.akhy... r4) {
            /*
            r3 = this;
            r0 = r3.a;
            if (r0 == 0) goto L_0x0019;
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
            r4 = r3.b(r0);
            return r4;
            r4 = new java.lang.IllegalStateException;
            r0 = "no TLS versions for cleartext connections";
            r4.<init>(r0);
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akhd$a.a(akhy[]):akhd$a");
        }

        public final a a(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public final a b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public final akhd b() {
            return new akhd(this);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x00c1 in {4, 6, 8} preds:[]
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
    static {
        /*
        r0 = 15;
        r1 = new defpackage.akha[r0];
        r2 = defpackage.akha.k;
        r3 = 0;
        r1[r3] = r2;
        r2 = defpackage.akha.m;
        r4 = 1;
        r1[r4] = r2;
        r2 = defpackage.akha.l;
        r5 = 2;
        r1[r5] = r2;
        r2 = defpackage.akha.n;
        r6 = 3;
        r1[r6] = r2;
        r2 = defpackage.akha.p;
        r7 = 4;
        r1[r7] = r2;
        r2 = defpackage.akha.o;
        r8 = 5;
        r1[r8] = r2;
        r2 = defpackage.akha.g;
        r8 = 6;
        r1[r8] = r2;
        r2 = defpackage.akha.i;
        r8 = 7;
        r1[r8] = r2;
        r2 = defpackage.akha.h;
        r8 = 8;
        r1[r8] = r2;
        r2 = defpackage.akha.j;
        r8 = 9;
        r1[r8] = r2;
        r2 = defpackage.akha.e;
        r8 = 10;
        r1[r8] = r2;
        r2 = defpackage.akha.f;
        r8 = 11;
        r1[r8] = r2;
        r2 = defpackage.akha.c;
        r8 = 12;
        r1[r8] = r2;
        r2 = defpackage.akha.d;
        r8 = 13;
        r1[r8] = r2;
        r2 = defpackage.akha.b;
        r8 = 14;
        r1[r8] = r2;
        g = r1;
        r1 = new akhd$a;
        r1.<init>(r4);
        r2 = g;
        r8 = r1.a;
        if (r8 == 0) goto L_0x00b9;
        r8 = new java.lang.String[r0];
        r9 = 0;
        if (r9 >= r0) goto L_0x0071;
        r10 = r2[r9];
        r10 = r10.q;
        r8[r9] = r10;
        r9 = r9 + 1;
        goto L_0x0066;
        r0 = r1.a(r8);
        r1 = new defpackage.akhy[r7];
        r2 = defpackage.akhy.TLS_1_3;
        r1[r3] = r2;
        r2 = defpackage.akhy.TLS_1_2;
        r1[r4] = r2;
        r2 = defpackage.akhy.TLS_1_1;
        r1[r5] = r2;
        r2 = defpackage.akhy.TLS_1_0;
        r1[r6] = r2;
        r0 = r0.a(r1);
        r0 = r0.a();
        r0 = r0.b();
        a = r0;
        r0 = new akhd$a;
        r1 = a;
        r0.<init>(r1);
        r1 = new defpackage.akhy[r4];
        r2 = defpackage.akhy.TLS_1_0;
        r1[r3] = r2;
        r0 = r0.a(r1);
        r0 = r0.a();
        r0.b();
        r0 = new akhd$a;
        r0.<init>(r3);
        r0 = r0.b();
        b = r0;
        return;
        r0 = new java.lang.IllegalStateException;
        r1 = "no cipher suites for cleartext connections";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhd.<clinit>():void");
    }

    akhd(a aVar) {
        this.c = aVar.a;
        this.e = aVar.b;
        this.f = aVar.c;
        this.d = aVar.d;
    }

    private List<akhy> a() {
        String[] strArr = this.f;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(akhy.a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean a(SSLSocket sSLSocket) {
        return !this.c ? false : (this.f == null || akib.b(akib.f, this.f, sSLSocket.getEnabledProtocols())) ? this.e == null || akib.b(akha.a, this.e, sSLSocket.getEnabledCipherSuites()) : false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akhd)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        akhd akhd = (akhd) obj;
        boolean z = this.c;
        return z != akhd.c ? false : !z || (Arrays.equals(this.e, akhd.e) && Arrays.equals(this.f, akhd.f) && this.d == akhd.d);
    }

    public final int hashCode() {
        return this.c ? ((((Arrays.hashCode(this.e) + 527) * 31) + Arrays.hashCode(this.f)) * 31) + (this.d ^ 1) : 17;
    }

    public final String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        String obj;
        String[] strArr = this.e;
        String str = "[all enabled]";
        if (strArr != null) {
            Object unmodifiableList;
            if (strArr != null) {
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String a : strArr) {
                    arrayList.add(akha.a(a));
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                unmodifiableList = null;
            }
            obj = unmodifiableList.toString();
        } else {
            obj = str;
        }
        if (this.f != null) {
            str = a().toString();
        }
        StringBuilder stringBuilder = new StringBuilder("ConnectionSpec(cipherSuites=");
        stringBuilder.append(obj);
        stringBuilder.append(", tlsVersions=");
        stringBuilder.append(str);
        stringBuilder.append(", supportsTlsExtensions=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
