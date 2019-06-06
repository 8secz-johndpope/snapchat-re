package defpackage;

/* renamed from: akht */
public final class akht {
    public final akhm a;
    public final String b;
    public final akhl c;
    public final akhu d;
    final Object e;
    private volatile akgw f;

    /* renamed from: akht$a */
    public static class a {
        akhm a;
        String b;
        defpackage.akhl.a c;
        akhu d;
        public Object e;

        public a() {
            this.b = "GET";
            this.c = new defpackage.akhl.a();
        }

        a(akht akht) {
            this.a = akht.a;
            this.b = akht.b;
            this.d = akht.d;
            this.e = akht.e;
            this.c = akht.c.a();
        }

        public final a a(akhl akhl) {
            this.c = akhl.a();
            return this;
        }

        public final a a(akhm akhm) {
            if (akhm != null) {
                this.a = akhm;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x005c in {3, 4, 7, 11, 13, 15} preds:[]
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
        public final defpackage.akht.a a(java.lang.String r7) {
            /*
            r6 = this;
            if (r7 == 0) goto L_0x0054;
            r1 = 1;
            r2 = 0;
            r4 = 0;
            r5 = 3;
            r3 = "ws:";
            r0 = r7;
            r0 = r0.regionMatches(r1, r2, r3, r4, r5);
            if (r0 == 0) goto L_0x0023;
            r0 = new java.lang.StringBuilder;
            r1 = "http:";
            r0.<init>(r1);
            r1 = 3;
            r7 = r7.substring(r1);
            r0.append(r7);
            r7 = r0.toString();
            goto L_0x0039;
            r1 = 1;
            r2 = 0;
            r4 = 0;
            r5 = 4;
            r3 = "wss:";
            r0 = r7;
            r0 = r0.regionMatches(r1, r2, r3, r4, r5);
            if (r0 == 0) goto L_0x0039;
            r0 = new java.lang.StringBuilder;
            r1 = "https:";
            r0.<init>(r1);
            r1 = 4;
            goto L_0x0017;
            r0 = defpackage.akhm.e(r7);
            if (r0 == 0) goto L_0x0044;
            r7 = r6.a(r0);
            return r7;
            r0 = new java.lang.IllegalArgumentException;
            r7 = java.lang.String.valueOf(r7);
            r1 = "unexpected url: ";
            r7 = r1.concat(r7);
            r0.<init>(r7);
            throw r0;
            r7 = new java.lang.NullPointerException;
            r0 = "url == null";
            r7.<init>(r0);
            throw r7;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akht$a.a(java.lang.String):akht$a");
        }

        public final a a(String str, akhu akhu) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() != 0) {
                String str2 = "method ";
                StringBuilder stringBuilder;
                if (akhu != null && !akit.b(str)) {
                    stringBuilder = new StringBuilder(str2);
                    stringBuilder.append(str);
                    stringBuilder.append(" must not have a request body.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (akhu == null && akit.a(str)) {
                    stringBuilder = new StringBuilder(str2);
                    stringBuilder.append(str);
                    stringBuilder.append(" must have a request body.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else {
                    this.b = str;
                    this.d = akhu;
                    return this;
                }
            } else {
                throw new IllegalArgumentException("method.length() == 0");
            }
        }

        public final a a(String str, String str2) {
            this.c.c(str, str2);
            return this;
        }

        public final akht a() {
            if (this.a != null) {
                return new akht(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final a b(String str) {
            this.c.a(str);
            return this;
        }

        public final a b(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }
    }

    akht(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.a();
        this.d = aVar.d;
        this.e = aVar.e != null ? aVar.e : this;
    }

    public final akhm a() {
        return this.a;
    }

    public final String a(String str) {
        return this.c.a(str);
    }

    public final String b() {
        return this.b;
    }

    public final akhu c() {
        return this.d;
    }

    public final a d() {
        return new a(this);
    }

    public final akgw e() {
        akgw akgw = this.f;
        if (akgw != null) {
            return akgw;
        }
        akgw = akgw.a(this.c);
        this.f = akgw;
        return akgw;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Request{method=");
        stringBuilder.append(this.b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tag=");
        Object obj = this.e;
        if (obj == this) {
            obj = null;
        }
        stringBuilder.append(obj);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
