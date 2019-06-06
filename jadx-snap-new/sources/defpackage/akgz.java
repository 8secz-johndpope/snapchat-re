package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: akgz */
public final class akgz {
    public static final akgz a = new a().a();
    final Set<b> b;
    final akjx c;

    /* renamed from: akgz$a */
    public static final class a {
        private final List<b> a = new ArrayList();

        public final a a(String str, String... strArr) {
            for (int i = 0; i <= 0; i++) {
                this.a.add(new b(str, strArr[0]));
            }
            return this;
        }

        public final akgz a() {
            return new akgz(new LinkedHashSet(this.a), null);
        }
    }

    /* renamed from: akgz$b */
    static final class b {
        final String a;
        final String b;
        final String c;
        final akkg d;

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0078 in {2, 3, 6, 10, 13, 15, 17} preds:[]
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
        b(java.lang.String r3, java.lang.String r4) {
            /*
            r2 = this;
            r2.<init>();
            r2.a = r3;
            r0 = "*.";
            r0 = r3.startsWith(r0);
            r1 = "http://";
            if (r0 == 0) goto L_0x0021;
            r0 = new java.lang.StringBuilder;
            r0.<init>(r1);
            r1 = 2;
            r3 = r3.substring(r1);
            r0.append(r3);
            r3 = r0.toString();
            goto L_0x0029;
            r3 = java.lang.String.valueOf(r3);
            r3 = r1.concat(r3);
            r3 = defpackage.akhm.e(r3);
            r3 = r3.b;
            r2.b = r3;
            r3 = "sha1/";
            r0 = r4.startsWith(r3);
            if (r0 == 0) goto L_0x0047;
            r2.c = r3;
            r3 = 5;
            r3 = r4.substring(r3);
            r3 = defpackage.akkg.b(r3);
            r2.d = r3;
            goto L_0x0053;
            r3 = "sha256/";
            r0 = r4.startsWith(r3);
            if (r0 == 0) goto L_0x0068;
            r2.c = r3;
            r3 = 7;
            goto L_0x003c;
            r3 = r2.d;
            if (r3 == 0) goto L_0x0058;
            return;
            r3 = new java.lang.IllegalArgumentException;
            r4 = java.lang.String.valueOf(r4);
            r0 = "pins must be base64: ";
            r4 = r0.concat(r4);
            r3.<init>(r4);
            throw r3;
            r3 = new java.lang.IllegalArgumentException;
            r4 = java.lang.String.valueOf(r4);
            r0 = "pins must start with 'sha256/' or 'sha1/': ";
            r4 = r0.concat(r4);
            r3.<init>(r4);
            throw r3;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akgz$b.<init>(java.lang.String, java.lang.String):void");
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.a.equals(bVar.a) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 527) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append(this.d.b());
            return stringBuilder.toString();
        }
    }

    akgz(Set<b> set, akjx akjx) {
        this.b = set;
        this.c = akjx;
    }

    private static akkg a(X509Certificate x509Certificate) {
        return akkg.a(x509Certificate.getPublicKey().getEncoded()).d();
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder stringBuilder = new StringBuilder("sha256/");
            stringBuilder.append(akgz.a((X509Certificate) certificate).b());
            return stringBuilder.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:54:0x0153 in {9, 10, 14, 15, 18, 21, 22, 30, 33, 37, 40, 41, 43, 44, 48, 51, 53} preds:[]
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
    public final void a(java.lang.String r16, java.util.List<java.security.cert.Certificate> r17) {
        /*
        r15 = this;
        r0 = r15;
        r7 = r16;
        r1 = java.util.Collections.emptyList();
        r2 = r0.b;
        r8 = r2.iterator();
        r9 = r1;
        r1 = r8.hasNext();
        r10 = 0;
        if (r1 == 0) goto L_0x0068;
        r1 = r8.next();
        r11 = r1;
        r11 = (defpackage.akgz.b) r11;
        r1 = r11.a;
        r2 = "*.";
        r1 = r1.startsWith(r2);
        r12 = 1;
        if (r1 == 0) goto L_0x0051;
        r1 = 46;
        r1 = r7.indexOf(r1);
        r2 = r16.length();
        r2 = r2 - r1;
        r2 = r2 - r12;
        r3 = r11.b;
        r3 = r3.length();
        if (r2 != r3) goto L_0x0057;
        r2 = 0;
        r3 = r1 + 1;
        r4 = r11.b;
        r5 = 0;
        r1 = r11.b;
        r6 = r1.length();
        r1 = r16;
        r1 = r1.regionMatches(r2, r3, r4, r5, r6);
        if (r1 == 0) goto L_0x0057;
        r10 = 1;
        goto L_0x0057;
        r1 = r11.b;
        r10 = r7.equals(r1);
        if (r10 == 0) goto L_0x000e;
        r1 = r9.isEmpty();
        if (r1 == 0) goto L_0x0064;
        r9 = new java.util.ArrayList;
        r9.<init>();
        r9.add(r11);
        goto L_0x000e;
        r1 = r9.isEmpty();
        if (r1 == 0) goto L_0x006f;
        return;
        r1 = r0.c;
        if (r1 == 0) goto L_0x007a;
        r2 = r17;
        r1 = r1.a(r2, r7);
        goto L_0x007d;
        r2 = r17;
        r1 = r2;
        r2 = r1.size();
        r3 = 0;
        if (r3 >= r2) goto L_0x00f4;
        r4 = r1.get(r3);
        r4 = (java.security.cert.X509Certificate) r4;
        r5 = r9.size();
        r6 = 0;
        r8 = r6;
        r11 = r8;
        r6 = 0;
        if (r6 >= r5) goto L_0x00f1;
        r12 = r9.get(r6);
        r12 = (defpackage.akgz.b) r12;
        r13 = r12.c;
        r14 = "sha256/";
        r13 = r13.equals(r14);
        if (r13 == 0) goto L_0x00b3;
        if (r8 != 0) goto L_0x00aa;
        r8 = defpackage.akgz.a(r4);
        r12 = r12.d;
        r12 = r12.equals(r8);
        if (r12 == 0) goto L_0x00d8;
        return;
        r13 = r12.c;
        r14 = "sha1/";
        r13 = r13.equals(r14);
        if (r13 == 0) goto L_0x00db;
        if (r11 != 0) goto L_0x00cf;
        r11 = r4.getPublicKey();
        r11 = r11.getEncoded();
        r11 = defpackage.akkg.a(r11);
        r11 = r11.c();
        r12 = r12.d;
        r12 = r12.equals(r11);
        if (r12 == 0) goto L_0x00d8;
        return;
        r6 = r6 + 1;
        goto L_0x0092;
        r1 = new java.lang.AssertionError;
        r2 = new java.lang.StringBuilder;
        r3 = "unsupported hashAlgorithm: ";
        r2.<init>(r3);
        r3 = r12.c;
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
        r3 = r3 + 1;
        goto L_0x0082;
        r2 = new java.lang.StringBuilder;
        r3 = "Certificate pinning failure!\n  Peer certificate chain:";
        r2.<init>(r3);
        r3 = r1.size();
        r4 = 0;
        r5 = "\n    ";
        if (r4 >= r3) goto L_0x0127;
        r6 = r1.get(r4);
        r6 = (java.security.cert.X509Certificate) r6;
        r2.append(r5);
        r5 = defpackage.akgz.a(r6);
        r2.append(r5);
        r5 = ": ";
        r2.append(r5);
        r5 = r6.getSubjectDN();
        r5 = r5.getName();
        r2.append(r5);
        r4 = r4 + 1;
        goto L_0x0100;
        r1 = "\n  Pinned certificates for ";
        r2.append(r1);
        r2.append(r7);
        r1 = ":";
        r2.append(r1);
        r1 = r9.size();
        if (r10 >= r1) goto L_0x0149;
        r3 = r9.get(r10);
        r3 = (defpackage.akgz.b) r3;
        r2.append(r5);
        r2.append(r3);
        r10 = r10 + 1;
        goto L_0x0138;
        r1 = new javax.net.ssl.SSLPeerUnverifiedException;
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgz.a(java.lang.String, java.util.List):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akgz) {
            akgz akgz = (akgz) obj;
            if (akib.a(this.c, akgz.c) && this.b.equals(akgz.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        akjx akjx = this.c;
        return ((akjx != null ? akjx.hashCode() : 0) * 31) + this.b.hashCode();
    }
}
