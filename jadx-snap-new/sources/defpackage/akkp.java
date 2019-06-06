package defpackage;

/* renamed from: akkp */
final class akkp implements akke {
    private akkd a = new akkd();
    private akku b;
    private boolean c;

    akkp(akku akku) {
        if (akku != null) {
            this.b = akku;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:8:0x0020 in {4, 5, 7} preds:[]
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
    public final long a(defpackage.akkv r8) {
        /*
        r7 = this;
        if (r8 == 0) goto L_0x0018;
        r0 = 0;
        r2 = r7.a;
        r3 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r2 = r8.a(r2, r3);
        r4 = -1;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x0017;
        r0 = r0 + r2;
        r7.v();
        goto L_0x0004;
        return r0;
        r8 = new java.lang.IllegalArgumentException;
        r0 = "source == null";
        r8.<init>(r0);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkp.a(akkv):long");
    }

    public final akkw a() {
        return this.b.a();
    }

    public final void a_(akkd akkd, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a_(akkd, j);
        v();
    }

    public final akke b(String str) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(str);
        return v();
    }

    public final akkd c() {
        return this.a;
    }

    public final akke c(akkg akkg) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.c(akkg);
        return v();
    }

    public final akke c(byte[] bArr) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.c(bArr);
        return v();
    }

    public final akke c(byte[] bArr, int i, int i2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.c(bArr, i, i2);
        return v();
    }

    public final void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                if (this.a.b > 0) {
                    this.b.a_(this.a, this.a.b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.a.b > 0) {
            akku akku = this.b;
            akkd akkd = this.a;
            akku.a_(akkd, akkd.b);
        }
        this.b.flush();
    }

    public final akke g(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.g(i);
        return v();
    }

    public final akke h(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.h(i);
        return v();
    }

    public final akke i(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.i(i);
        return v();
    }

    public final akke i(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.i(j);
        return v();
    }

    public final akke j(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.j(i);
        return v();
    }

    public final akke j(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.j(j);
        return v();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffer(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final akke v() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long f = this.a.f();
        if (f > 0) {
            this.b.a_(this.a, f);
        }
        return this;
    }
}
